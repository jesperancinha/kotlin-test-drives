# Kotlin test drives

---

[![Twitter URL](https://img.shields.io/twitter/url?logoColor=blue&style=social&url=https%3A%2F%2Fimg.shields.io%2Ftwitter%2Furl%3Fstyle%3Dsocial)](https://twitter.com/intent/tweet?text=%20Checkout%20this%20%40github%20repo%20by%20%40joaofse%20%F0%9F%91%A8%F0%9F%8F%BD%E2%80%8D%F0%9F%92%BB%3A%20https%3A//github.com/jesperancinha/kotlin-test-drives)
[![Generic badge](https://img.shields.io/static/v1.svg?label=GitHub&message=Kotlin%20Test%20Drives&color=informational)](https://github.com/jesperancinha/kotlin-test-drives)

[![CircleCI](https://circleci.com/gh/jesperancinha/jeorg-kotlin-test-drives.svg?style=svg)](https://circleci.com/gh/jesperancinha/jeorg-kotlin-test-drives)
[![Build status](https://ci.appveyor.com/api/projects/status/ecxew4rog1y4x474?svg=true)](https://ci.appveyor.com/project/jesperancinha/jeorg-kotlin-test-drives)
[![jeorg-kotlin-test-drives](https://github.com/jesperancinha/jeorg-kotlin-test-drives/actions/workflows/jeorg-kotlin-test-drives.yml/badge.svg)](https://github.com/jesperancinha/jeorg-kotlin-test-drives/actions/workflows/jeorg-kotlin-test-drives.yml)

[![Codacy Badge](https://app.codacy.com/project/badge/Grade/03eb6acb5bf34d1d8c82c5cf65268e60)](https://www.codacy.com/gh/jesperancinha/jeorg-kotlin-test-drives/dashboard?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=jesperancinha/jeorg-kotlin-test-drives&amp;utm_campaign=Badge_Grade)
[![Known Vulnerabilities](https://snyk.io/test/github/jesperancinha/jeorg-kotlin-test-drives/badge.svg)](https://snyk.io/test/github/jesperancinha/jeorg-kotlin-test-drives)

[![Codacy Badge](https://app.codacy.com/project/badge/Coverage/03eb6acb5bf34d1d8c82c5cf65268e60)](https://www.codacy.com/gh/jesperancinha/jeorg-kotlin-test-drives/dashboard?utm_source=github.com&utm_medium=referral&utm_content=jesperancinha/jeorg-kotlin-test-drives&utm_campaign=Badge_Coverage)
[![Coverage Status](https://coveralls.io/repos/github/jesperancinha/jeorg-kotlin-test-drives/badge.svg?branch=main)](https://coveralls.io/github/jesperancinha/jeorg-kotlin-test-drives?branch=main)
[![codecov](https://codecov.io/gh/jesperancinha/jeorg-kotlin-test-drives/branch/main/graph/badge.svg?token=BQlLANwSUb)](https://codecov.io/gh/jesperancinha/jeorg-kotlin-test-drives)

[![GitHub language count](https://img.shields.io/github/languages/count/jesperancinha/kotlin-test-drives.svg)](#)
[![GitHub top language](https://img.shields.io/github/languages/top/jesperancinha/kotlin-test-drives.svg)](#)
[![GitHub top language](https://img.shields.io/github/languages/code-size/jesperancinha/kotlin-test-drives.svg)](#)

---

## Technologies used

---

[![alt text](https://raw.githubusercontent.com/jesperancinha/project-signer/master/project-signer-templates/icons-50/kotlin-50.png "Kotlin")](https://kotlinlang.org/)
[![alt text](https://raw.githubusercontent.com/jesperancinha/project-signer/master/project-signer-templates/icons-50/kotest-50.png "Kotest")](https://kotest.io/)
[![alt text](https://raw.githubusercontent.com/jesperancinha/project-signer/master/project-signer-templates/icons-50/gradle-50.png "Gradle")](https://gradle.org/)
[![alt text](https://raw.githubusercontent.com/jesperancinha/project-signer/master/project-signer-templates/icons-50/apache-maven-50.png "Maven")](https://maven.apache.org/)

---

## Description

Kotlin Language study project.

---

## Contents

-   [Kotlin Crums](./jeorg-kotlin-crums) - Fast Track Crum modules
-   [Kotlin Utilities](./jeorg-kotlin-utilities) - Small modules with applications with the Kotlin language
-   [Kotlin Masters](./jeorg-kotlin-masters) - Developing applications using multiple topics in Kotlin
-   [Kotlin Arrow Crums](./jeorg-kotlin-arrow-crums) - Crums Fast track module dedicated exclusively to [Arrow](https://arrow-kt.io/)
-   [Kotlin Apps](./jeorg-kotlin-apps) - Apps module where web applications are created as a collective gathering of several topics

---

## [Arrow](https://arrow-kt.io/)

A lot of concepts of software engineering are explored in [Arrow](https://arrow-kt.io/).
Because of its importance to the Kotlin community please find below a list of submodules where we can find lots of [Arrow](https://arrow-kt.io/) research modules.

In module [jeorg-kotlin-arrow-crums](./jeorg-kotlin-arrow-crums) we can find exclusively arrow modules fully dedicated to researching [Arrow](https://arrow-kt.io/).

##### [Arrow Core](https://arrow-kt.io/docs/core/)

-   [Kotlin Crums 3](./jeorg-kotlin-crums/jeorg-kotlin-crums-3) - Fast Track Crum modules 3 - `Effect`

##### [Arrow Optics](https://arrow-kt.io/docs/optics/)


-   [Kotlin Crums 3](./jeorg-kotlin-crums/jeorg-kotlin-crums-3) - Fast Track Crum modules 3
-   [Kotlin Crums 4](./jeorg-kotlin-crums/jeorg-kotlin-crums-4) - Fast Track [Arrow Optics](https://arrow-kt.io/docs/optics/) Crum modules 4 (Gradle project with Source code generation)
-   [Kotlin Arrow Optics Crum 1](./jeorg-kotlin-crums/jeorg-kotlin-optics-crums-1) - Fast Track [Arrow Optics](https://arrow-kt.io/docs/optics/) Crum modules 1 (Maven project with Source code generation)

---

## Build

Note that if you want to build this project from the root, you need to use one of the JDK 11 or upper versions.

<i>See [Hints&Tricks](https://github.com/jesperancinha/project-signer/blob/master/project-signer-templates/Hints%26Tricks.md) document for more details</i>

## Install JDK 17 using [SDK-MAN](https://sdkman.io/)

```bash
sdk install java 17-open
sdk use java 17-open
```

Or just run:

```bash
. ./sdk17.sh
```

---

## Sequence Diagram

```mermaid

sequenceDiagram
    participant USER
    participant KOTLIN
    participant Kotlin Professional
    
    rect rgb(1,130,25)
    
        rect rgb(1,240,100)
        USER->>KOTLIN: User studies kotlin
        end
    
        rect rgb(1,240,100)
            KOTLIN->>Kotlin Professional: User becomes
            
            loop Keep updated
                 rect rgb(240,240,100)
                 Kotlin Professional->>KOTLIN: User studies again
                 end
            end
        end
    
        rect rgb(1,240,100)
        USER->>KOTLIN: User studies again
    end
end
```

<i>Note: You need a Mermaid plugin extension</i> i.e. [mermaid-plugin](https://chrome.google.com/webstore/detail/mermaid-diagrams/phfcghedmopjadpojhmmaffjmfiakfil/related)

---

## References

### Books

-   Vasic, M. (21st May 2018). <i>Building Applications with Spring 5 and Kotlin</i>. (First Edition). Packt Publishing
-   Griffiths, D. Griffiths, D. (February 2019). <i>Head First A Brain-Friendly Guide</i>. (First Edition). O'Reilly
-   Skeen, J. Greenhalgh, D. (July 2018). <i>Kotlin Programming - The Big Nerd Ranch Guide</i>. (First Edition). Big Nerd Ranch
-   Jemerov, D. Isakova, S. (2017). <i>Kotlin in Action</i>. (First Edition). Manning Publications

## About me

[![alt text](https://raw.githubusercontent.com/jesperancinha/project-signer/master/project-signer-templates/icons-20/JEOrgLogo-20.png "João Esperancinha Homepage")](http://joaofilipesabinoesperancinha.nl)
[![GitHub followers](https://img.shields.io/github/followers/jesperancinha.svg?label=Jesperancinha&style=social "GitHub")](https://github.com/jesperancinha)
[![alt text](https://raw.githubusercontent.com/jesperancinha/project-signer/master/project-signer-templates/icons-20/mastodon-20.png "Mastodon")](https://masto.ai/@jesperancinha)
[![Twitter Follow](https://img.shields.io/twitter/follow/joaofse?label=João%20Esperancinha&style=social "Twitter")](https://twitter.com/joaofse)
| [Sessionize](https://sessionize.com/joao-esperancinha/)
| [Spotify](https://open.spotify.com/user/jlnozkcomrxgsaip7yvffpqqm?si=b54b89eae8894960)
| [Medium](https://medium.com/@jofisaes)
| [YouTube](https://www.youtube.com/@joaoesperancinha/featured)
| [Instagram](https://www.instagram.com/joaofisaes/)
| [Buy me a coffee](https://www.buymeacoffee.com/jesperancinha)
| [Credly Badges](https://www.credly.com/users/joao-esperancinha)
| [Google Apps](https://play.google.com/store/apps/developer?id=Joao+Filipe+Sabino+Esperancinha)
| [Sonatype Search Repos](https://search.maven.org/search?q=org.jesperancinha)
| [Docker Images](https://hub.docker.com/u/jesperancinha)
| [Stack Overflow Profile](https://stackoverflow.com/users/3702839/joao-esperancinha)
| [Reddit](https://www.reddit.com/user/jesperancinha/)
| [Dev.TO](https://dev.to/jofisaes)
| [Hackernoon](https://hackernoon.com/@jesperancinha)
| [Code Project](https://www.codeproject.com/Members/jesperancinha)
| [BitBucket](https://bitbucket.org/jesperancinha)
| [GitLab](https://gitlab.com/jesperancinha)
| [Coursera](https://www.coursera.org/user/da3ff90299fa9297e283ee8e65364ffb)
| [FreeCodeCamp](https://www.freecodecamp.org/jofisaes)
| [HackerRank](https://www.hackerrank.com/jofisaes)
| [LeetCode](https://leetcode.com/jofisaes)
| [Codebyte](https://coderbyte.com/profile/jesperancinha)
| [CodeWars](https://www.codewars.com/users/jesperancinha)
| [Code Pen](https://codepen.io/jesperancinha)
| [Hacker Earth](https://www.hackerearth.com/@jofisaes)
| [Khan Academy](https://www.khanacademy.org/profile/jofisaes)
| [Hacker News](https://news.ycombinator.com/user?id=jesperancinha)
| [InfoQ](https://www.infoq.com/profile/Joao-Esperancinha.2/)
| [LinkedIn](https://www.linkedin.com/in/joaoesperancinha/)
| [Xing](https://www.xing.com/profile/Joao_Esperancinha/cv)
| [Tumblr](https://jofisaes.tumblr.com/)
| [Pinterest](https://nl.pinterest.com/jesperancinha/)
| [Quora](https://nl.quora.com/profile/Jo%C3%A3o-Esperancinha)
| [VMware Spring Professional 2021](https://www.credly.com/badges/762fa7a4-9cf4-417d-bd29-7e072d74cdb7)
| [Oracle Certified Professional, Java SE 11 Programmer](https://www.credly.com/badges/87609d8e-27c5-45c9-9e42-60a5e9283280)
| [Oracle Certified Professional, JEE7 Developer](https://www.credly.com/badges/27a14e06-f591-4105-91ca-8c3215ef39a2)
| [IBM Cybersecurity Analyst Professional](https://www.credly.com/badges/ad1f4abe-3dfa-4a8c-b3c7-bae4669ad8ce)
| [Certified Advanced JavaScript Developer](https://cancanit.com/certified/1462/)
| [Certified Neo4j Professional](https://graphacademy.neo4j.com/certificates/c279afd7c3988bd727f8b3acb44b87f7504f940aac952495ff827dbfcac024fb.pdf)
| [Deep Learning](https://www.credly.com/badges/8d27e38c-869d-4815-8df3-13762c642d64)
| [![Generic badge](https://img.shields.io/static/v1.svg?label=GitHub&message=JEsperancinhaOrg&color=yellow "jesperancinha.org dependencies")](https://github.com/JEsperancinhaOrg)
[![Generic badge](https://img.shields.io/static/v1.svg?label=All%20Badges&message=Badges&color=red "All badges")](https://joaofilipesabinoesperancinha.nl/badges)
[![Generic badge](https://img.shields.io/static/v1.svg?label=Status&message=Project%20Status&color=red "Project statuses")](https://github.com/jesperancinha/project-signer/blob/master/project-signer-quality/Build.md)
