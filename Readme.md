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

>NOTE: Due to unexpected incompatibilities, all repos can be expected to have different Kotlin versions.

#### Stable releases

-   [0.0.0](https://github.com/jesperancinha/jeorg-kotlin-test-drives/tree/0.0.0) - [b75ade686c8826d0d76a8da52d5f22983e2deef3](https://github.com/jesperancinha/jeorg-kotlin-test-drives/tree/0.0.0) - JDK17 - Kotlin
-   [1.0.0](https://github.com/jesperancinha/jeorg-kotlin-test-drives/tree/1.0.0) - [862540419a4222c2e496f85f0fcb852d29092393](https://github.com/jesperancinha/jeorg-kotlin-test-drives/tree/1.0.0) - JDK19 - Kotlin

---

## Contents

-   [Kotlin Crums](./jeorg-kotlin-crums) - Fast Track Crum modules
-   [Kotlin Utilities](./jeorg-kotlin-utilities) - Small modules with applications with the Kotlin language
-   [Kotlin Masters](./jeorg-kotlin-masters) - Developing applications using multiple topics in Kotlin
-   [Kotlin Arrow Optics](jeorg-kotlin-arrow-optics) - Crums Fast track modules dedicated exclusively to [Arrow](https://arrow-kt.io/)
-   [Kotlin Apps](./jeorg-kotlin-apps) - Apps module where web applications are created as a collective gathering of several topics

---

## Build

Note that if you want to build this project from the root, you need to use one of the JDK 11 or upper versions.

<i>See [Hints&Tricks](https://github.com/jesperancinha/project-signer/blob/master/project-signer-templates/Hints%26Tricks.md) document for more details</i>

## Install JDK 19 using [SDK-MAN](https://sdkman.io/)

```bash
. ./sdk19.sh
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

[![alt text](https://raw.githubusercontent.com/jesperancinha/project-signer/master/project-signer-templates/icons-100/JEOrgLogo-27.png "João Esperancinha Homepage")](http://joaofilipesabinoesperancinha.nl)
[![](https://img.shields.io/badge/youtube-%230077B5.svg?style=for-the-badge&logo=youtube&color=FF0000)](https://www.youtube.com/@joaoesperancinha)
[![](https://img.shields.io/badge/Medium-12100E?style=for-the-badge&logo=medium&logoColor=white)](https://medium.com/@jofisaes)
[![](https://img.shields.io/badge/Buy%20Me%20A%20Coffee-%230077B5.svg?style=for-the-badge&logo=buymeacoffee&color=yellow)](https://www.buymeacoffee.com/jesperancinha)
[![](https://img.shields.io/badge/Twitter-%230077B5.svg?style=for-the-badge&logo=twitter&color=white)](https://twitter.com/joaofse)
[![](https://img.shields.io/badge/Mastodon-%230077B5.svg?style=for-the-badge&logo=mastodon&color=afd7f7)](https://masto.ai/@jesperancinha)
[![](https://img.shields.io/badge/Sessionize-%230077B5.svg?style=for-the-badge&logo=sessionize&color=cffff6)](https://sessionize.com/joao-esperancinha)
[![](https://img.shields.io/badge/Instagram-%230077B5.svg?style=for-the-badge&logo=instagram&color=purple)](https://www.instagram.com/joaofisaes)
[![](https://img.shields.io/badge/Tumblr-%230077B5.svg?style=for-the-badge&logo=tumblr&color=192841)](https://jofisaes.tumblr.com)
[![](https://img.shields.io/badge/Spotify-1ED760?style=for-the-badge&logo=spotify&logoColor=white)](https://open.spotify.com/user/jlnozkcomrxgsaip7yvffpqqm)
[![](https://img.shields.io/badge/linkedin-%230077B5.svg?style=for-the-badge&logo=linkedin)](https://www.linkedin.com/in/joaoesperancinha/)
[![](https://img.shields.io/badge/Xing-%230077B5.svg?style=for-the-badge&logo=xing&color=064e40)](https://www.xing.com/profile/Joao_Esperancinha/cv)
[![](https://img.shields.io/badge/YCombinator-%230077B5.svg?style=for-the-badge&logo=ycombinator&color=d0d9cd)](https://news.ycombinator.com/user?id=jesperancinha)
[![GitHub followers](https://img.shields.io/github/followers/jesperancinha.svg?label=Jesperancinha&style=social "GitHub")](https://github.com/jesperancinha)
[![](https://img.shields.io/badge/bitbucket-%230077B5.svg?style=for-the-badge&logo=bitbucket&color=blue)](https://bitbucket.org/jesperancinha)
[![](https://img.shields.io/badge/gitlab-%230077B5.svg?style=for-the-badge&logo=gitlab&color=orange)](https://gitlab.com/jesperancinha)
[![](https://img.shields.io/badge/Stack%20Overflow-%230077B5.svg?style=for-the-badge&logo=stackoverflow&color=5A5A5A)](https://stackoverflow.com/users/3702839/joao-esperancinha)
[![](https://img.shields.io/badge/Credly-%230077B5.svg?style=for-the-badge&logo=credly&color=4d2a00)](https://www.credly.com/users/joao-esperancinha)
[![](https://img.shields.io/badge/Coursera-%230077B5.svg?style=for-the-badge&logo=coursera&color=000080)](https://www.coursera.org/user/da3ff90299fa9297e283ee8e65364ffb)
[![](https://img.shields.io/badge/Docker-%230077B5.svg?style=for-the-badge&logo=docker&color=cyan)](https://hub.docker.com/u/jesperancinha)
[![](https://img.shields.io/badge/Reddit-%230077B5.svg?style=for-the-badge&logo=reddit&color=black)](https://www.reddit.com/user/jesperancinha/)
[![](https://img.shields.io/badge/Hackernoon-%230077B5.svg?style=for-the-badge&logo=hackernoon&color=0a5d00)](https://hackernoon.com/@jesperancinha)
[![](https://img.shields.io/badge/Code%20Project-%230077B5.svg?style=for-the-badge&logo=codeproject&color=063b00)](https://www.codeproject.com/Members/jesperancinha)
[![](https://img.shields.io/badge/Free%20Code%20Camp-%230077B5.svg?style=for-the-badge&logo=freecodecamp&color=0a5d00)](https://www.freecodecamp.org/jofisaes)
[![](https://img.shields.io/badge/Hackerrank-%230077B5.svg?style=for-the-badge&logo=hackerrank&color=1e2f97)](https://www.hackerrank.com/jofisaes)
[![](https://img.shields.io/badge/LeetCode-%230077B5.svg?style=for-the-badge&logo=leetcode&color=002647)](https://leetcode.com/jofisaes)
[![](https://img.shields.io/badge/Codewars-%230077B5.svg?style=for-the-badge&logo=codewars&color=722F37)](https://www.codewars.com/users/jesperancinha)
[![](https://img.shields.io/badge/CodePen-%230077B5.svg?style=for-the-badge&logo=codepen&color=black)](https://codepen.io/jesperancinha)
[![](https://img.shields.io/badge/HackerEarth-%230077B5.svg?style=for-the-badge&logo=hackerearth&color=00035b)](https://www.hackerearth.com/@jofisaes)
[![](https://img.shields.io/badge/Khan%20Academy-%230077B5.svg?style=for-the-badge&logo=khanacademy&color=00035b)](https://www.khanacademy.org/profile/jofisaes)
[![](https://img.shields.io/badge/Pinterest-%230077B5.svg?style=for-the-badge&logo=pinterest&color=FF0000)](https://nl.pinterest.com/jesperancinha)
[![](https://img.shields.io/badge/Quora-%230077B5.svg?style=for-the-badge&logo=quora&color=FF0000)](https://nl.quora.com/profile/Jo%C3%A3o-Esperancinha)
[![](https://img.shields.io/badge/Google%20Play-%230077B5.svg?style=for-the-badge&logo=googleplay&color=purple)](https://play.google.com/store/apps/developer?id=Joao+Filipe+Sabino+Esperancinha)
| [Sonatype Search Repos](https://search.maven.org/search?q=org.jesperancinha)
| [Dev.TO](https://dev.to/jofisaes)
| [Codebyte](https://coderbyte.com/profile/jesperancinha)
| [InfoQ](https://www.infoq.com/profile/Joao-Esperancinha.2/)
| [VMware Spring Professional 2021](https://www.credly.com/badges/762fa7a4-9cf4-417d-bd29-7e072d74cdb7)
| [Oracle Certified Professional, Java SE 11 Programmer](https://www.credly.com/badges/87609d8e-27c5-45c9-9e42-60a5e9283280)
| [Oracle Certified Professional, JEE7 Developer](https://www.credly.com/badges/27a14e06-f591-4105-91ca-8c3215ef39a2)
| [IBM Cybersecurity Analyst Professional](https://www.credly.com/badges/ad1f4abe-3dfa-4a8c-b3c7-bae4669ad8ce)
| [Certified Advanced JavaScript Developer](https://cancanit.com/certified/1462/)
| [Certified Neo4j Professional](https://graphacademy.neo4j.com/certificates/c279afd7c3988bd727f8b3acb44b87f7504f940aac952495ff827dbfcac024fb.pdf)
| [Deep Learning](https://www.credly.com/badges/8d27e38c-869d-4815-8df3-13762c642d64)
| [![Generic badge](https://img.shields.io/static/v1.svg?label=GitHub&message=JEsperancinhaOrg&color=yellow&style=for-the-badge "jesperancinha.org dependencies")](https://github.com/JEsperancinhaOrg)
[![Generic badge](https://img.shields.io/static/v1.svg?label=All%20Badges&message=Badges&color=red&style=for-the-badge "All badges")](https://joaofilipesabinoesperancinha.nl/badges)
[![Generic badge](https://img.shields.io/static/v1.svg?label=Status&message=Project%20Status&color=red&style=for-the-badge "Project statuses")](https://github.com/jesperancinha/project-signer/blob/master/project-signer-quality/Build.md)
