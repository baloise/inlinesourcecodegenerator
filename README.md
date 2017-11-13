# inlinesourcecodegenerator
generate java source file in a maven project with the generator written in java and included in the same project

As anwser to https://stackoverflow.com/questions/2147115/generating-sources-by-running-a-projects-java-class-in-maven

- generated source is in src/main/java in a seperate package
  - PRO : we can use the generator from inside the IDE and have the generated classes change
  - CON : we check the generator code into the repo / habe to ignore it while committing
- generator is in seperate source folder with test scope
  - PRO: generator source and deps don't go into prod jar

## Maven plugins used

| phase | plugin     | what for |
| -------- | ------------ | ------------ |
| initialize  | build-helper-maven-plugin  |  add src/main/generator with scope test |
| generate-sources  | maven-compiler-plugin  |  testCompile classes under generator package |
| process-sources  | exec-maven-plugin  | execute generator |
