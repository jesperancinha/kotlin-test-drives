SHELL := /bin/bash
GRADLE_VERSION ?= 8.7

b?: buildw

buildw:
	./gradlew build

build:
	gradle build

wrapper:
	gradle wrapper