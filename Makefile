SHELL := /bin/bash
GRADLE_VERSION ?= 8.1.1
b: clean build
clean:
	if [[ -f jeorg-kotlin-apps/jeorg-microchip-maker/jeorg-microchip-maker-gui/kotlin-js-store/yarn.lock ]]; then rm jeorg-kotlin-apps/jeorg-microchip-maker/jeorg-microchip-maker-gui/kotlin-js-store/yarn.lock; fi
	if [[ -d jeorg-kotlin-apps/jeorg-microchip-maker/jeorg-microchip-maker-gui/build ]]; then rm -r jeorg-kotlin-apps/jeorg-microchip-maker/jeorg-microchip-maker-gui/build; fi
build: build-gradle build-maven
build-maven:
	mvn clean install
build-gradle:
	cd jeorg-kotlin-apps/jeorg-microchip-maker/jeorg-microchip-maker-gui && make b
	cd jeorg-kotlin-arrow-optics/jeorg-kotlin-arrow-optics-gradle-1 && make b
build-chip-maker:
	cd jeorg-kotlin-apps/jeorg-microchip-maker && mvn clean install
	cd jeorg-kotlin-apps/jeorg-microchip-maker/jeorg-microchip-maker-gui && gradle build test
ksp-dyescape-health-test:
	cd jeorg-kotlin-arrow-optics/jeorg-ksp-plugin-test && mvn clean install
upgrade:
	cd jeorg-kotlin-apps/jeorg-microchip-maker/jeorg-microchip-maker-gui && gradle wrapper --gradle-version $(GRADLE_VERSION)
	cd jeorg-kotlin-arrow-optics/jeorg-kotlin-arrow-optics-gradle-1 && gradle wrapper --gradle-version $(GRADLE_VERSION)
upgrade-gradle:
	sudo apt upgrade
	sudo apt update
	export SDKMAN_DIR="$(HOME)/.sdkman"; \
	[[ -s "$(HOME)/.sdkman/bin/sdkman-init.sh" ]]; \
	source "$(HOME)/.sdkman/bin/sdkman-init.sh"; \
	sdk update; \
	gradleOnlineVersion=$(shell curl -s https://services.gradle.org/versions/current | jq .version | xargs -I {} echo {}); \
	if [[ -z "$$gradleOnlineVersion" ]]; then \
		sdk install gradle $(GRADLE_VERSION); \
		sdk use gradle $(GRADLE_VERSION); \
	else \
		sdk install gradle $$gradleOnlineVersion; \
		sdk use gradle $$gradleOnlineVersion; \
	fi; \
	export GRADLE_VERSION=$$gradleOnlineVersion; \
	make upgrade
install-linux:
	sudo apt-get install jq
	sudo apt-get install curl
	curl https://services.gradle.org/versions/current
