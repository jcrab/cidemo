# cidemo
## prereqs: Maven, Java, DevOps, Docker, YAML
## Part I: Action example

1. read (GitHub Actions documentation; Learn GitHub Actions; Understanding GitHub Actions)

    https://docs.github.com/en/actions/learn-github-actions/understanding-github-actions


concepts:

    workflow triggered by event(s)
    workflow contains job(s) (seq or parallel) run inside VM (runner)
    jobs have steps

2. create repo cidemo

3. git clone https://github.com/jcrab/cidemo

4. create .github/workflows/learn-github-actions.yml

paste this:

    name: learn-github-actions
    run-name: ${{ github.actor }} is learning GitHub Actions
    on: [push]
    jobs:
      check-bats-version:
        runs-on: ubuntu-latest
        steps:
          - uses: actions/checkout@v3
          - uses: actions/setup-node@v3
            with:
              node-version: '14'
          - run: npm install -g bats
          - run: bats -v

## Part II: Building and testing Java with Maven

1. create .github/workflows/build-test-java-mvn.yml

paste this:

    name: Java CI
    
    on: [push]
    
    jobs:
      build:
        runs-on: ubuntu-latest
    
        steps:
          - uses: actions/checkout@v3
          - name: Set up JDK 17
            uses: actions/setup-java@v3
            with:
              java-version: '17'
              distribution: 'temurin'
          - name: Build with Maven
            run: mvn --batch-mode --update-snapshots package

2. create an eclipse Maven project with a jdk/junit archetype

3. create simple junit test (TDD) and Hello.java

4. make sure build works within eclipse

5. copy src, pom.xml, and .gitignore to cidemo

## Part III: create an issue and resolve w/ pull request

* Do this with GH Classroom.

* Demo with something like my private cidemo.
