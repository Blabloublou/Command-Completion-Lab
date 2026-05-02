# command-completion-lab

Small **Maven** workspace (**Java 23** + **Kotlin**) used as a **manual test lab** for IntelliJ **Command Completion** and related editor behaviour. It supports the **features and bugs enumerated in the final QA report** (delivered separately): each anchor below maps to a scenario you can re-run in the IDE.

## Requirements

- **JDK 23**
- **IntelliJ IDEA** (recent stable; enable **Kotlin** support for `.kt` files; AI-backed Javadoc actions where applicable)

## Build

```bash
mvn compile
```

`InvalidCallQuickFixSample.java` is **excluded** from `javac` so the project stays buildable; open it in the IDE for the intentional error-state scenario.
