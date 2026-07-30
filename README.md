# 🩺 Health Monitor v2.4

<p align="center">
  <img src="docs/home.png" alt="Health Monitor Home Screen" width="850">
</p>

<p align="center">
  <strong>A Retro-Themed Desktop Blood Pressure Analysis Application</strong>
</p>

<p align="center">
Built using <strong>Java</strong>, <strong>Kotlin</strong>, <strong>Compose Multiplatform</strong>, and <strong>Gradle</strong>.
</p>

<p align="center">
Health Monitor analyzes blood pressure and age to classify BP status and generate intelligent health feedback through a modern retro terminal-inspired desktop interface.
</p>

---

## 📌 Project Overview

Health Monitor is a desktop application designed to demonstrate backend architecture, object-oriented programming, and desktop UI development.

The application accepts a user's blood pressure values and age, processes the information using a rule-based backend engine, and instantly displays an easy-to-understand diagnosis.

This project was built to strengthen practical skills in Java backend development while exploring modern desktop application development with Kotlin Compose Multiplatform.

---

# 📸 Application Preview

## 🏠 Home Screen

<p align="center">
<img src="docs/home.png" width="900">
</p>

---

## 📊 Diagnosis Result

<p align="center">
<img src="docs/result.png" width="900">
</p>

---

# ✨ Features

- 🩺 Blood Pressure Classification
- 👤 Age-Based BP Analysis
- 🧠 Intelligent Diagnostic Messages
- 💻 Modern Desktop Interface
- 💚 Retro Terminal Theme
- ⚡ Responsive Compose UI
- 🏗 Modular Backend Architecture
- ✔️ Input Validation
- 📋 Rule-Based Health Engine
- 🚀 Fast Result Generation

---

# 🛠 Tech Stack

| Category | Technology |
|------------|------------|
| Programming Language | Java 21 |
| UI Language | Kotlin |
| UI Framework | Compose Multiplatform (Desktop) |
| Build Tool | Gradle Kotlin DSL |
| Architecture | Modular UI + Backend |
| IDE | Visual Studio Code |
| Version Control | Git |
| Repository Hosting | GitHub |

---

# 🏗 Project Structure

```
Health Monitor
│
├── docs
│   ├── home.png
│   └── result.png
│
├── src
│   └── main
│
│       ├── java
│       │   └── com.example.healthmirrorbackend
│       │       ├── BpRecord.java
│       │       ├── BpRule.java
│       │       ├── BpStagewarningRule.java
│       │       ├── BpwarningClassifier.java
│       │       ├── UserbpClassifier.java
│       │       └── UserBpService.java
│       │
│       └── kotlin
│           └── com.example.healthmirror
│               ├── Main.kt
│               └── HealthMonitorUi.kt
│
├── gradle
├── build.gradle.kts
├── settings.gradle.kts
├── gradlew
├── gradlew.bat
└── README.md
```

---

# ⚙ How It Works

### Step 1

Enter the patient's:

- Systolic Blood Pressure
- Diastolic Blood Pressure
- Age

↓

### Step 2

The backend validates the inputs.

↓

### Step 3

The BP classification engine evaluates the readings.

↓

### Step 4

Age-specific rules are applied.

↓

### Step 5

The application generates a health diagnosis and displays it instantly.

---

# 🧠 Backend Architecture

The project follows a modular backend design where each class performs a specific responsibility.

| Class | Responsibility |
|------------|----------------|
| `BpRecord` | Stores patient information |
| `BpRule` | Blood pressure classification rules |
| `BpStagewarningRule` | Stage warning logic |
| `BpwarningClassifier` | Warning generation |
| `UserbpClassifier` | Patient BP classification |
| `UserBpService` | Business logic layer |

### Design Principles

- Object-Oriented Programming
- Separation of Concerns
- Rule-Based Processing
- Modular Architecture
- Clean Code

---

# 🎨 User Interface

The interface is inspired by classic CRT medical terminals while using modern desktop technologies.

### Design Highlights

- 💚 Neon Green Color Palette
- 🖥 Terminal Inspired Interface
- 🔤 Monospaced Typography
- 🎯 Minimalist Layout
- ⚡ High Contrast Design
- 🧩 Compose Multiplatform Components

---

# 🚀 Skills Demonstrated

This project demonstrates practical knowledge of:

## Java

- Object-Oriented Programming
- Business Logic Implementation
- Service Layer Design
- Rule-Based Systems

## Kotlin

- Compose Multiplatform Desktop
- Kotlin UI Development
- Java Interoperability

## Software Engineering

- Modular Architecture
- Clean Code
- Separation of Concerns
- Input Validation

## Development Tools

- Gradle Kotlin DSL
- Git
- GitHub
- Visual Studio Code

---

# 💻 Installation

## Clone Repository

```bash
git clone https://github.com/Zenic23/Your-BP-mirror.git
```

---

## Open Project

```bash
cd Your-BP-mirror
```

---

## Run

### Windows

```bash
gradlew.bat run
```

### Linux / macOS

```bash
./gradlew run
```

---

# 📈 Future Roadmap

Planned features include:

- 📊 Blood Pressure History
- 🗄 Local Database Support
- 📄 PDF Report Generation
- 📉 Health Trend Graphs
- 👤 User Profiles
- 📁 CSV Import & Export
- 🤖 AI-Assisted Health Insights
- ☁ Cloud Synchronization
- 🌍 Multi-language Support

---

# 📚 Learning Objectives

Health Monitor was developed to improve practical knowledge in:

- Java Backend Development
- Kotlin Programming
- Desktop Application Development
- Software Architecture
- Object-Oriented Programming
- Git & GitHub
- Gradle
- UI Design

---

# 👨‍💻 Developer

## Ayush

**Class 10 Student | Java Backend Developer | AI Engineering Learner**

Passionate about building practical software that combines clean backend architecture with modern desktop user interfaces.

### GitHub

https://github.com/Zenic23

---

# 🤝 Contributing

Contributions, ideas, and suggestions are welcome.

If you would like to improve this project:

1. Fork the repository
2. Create a feature branch
3. Commit your changes
4. Open a Pull Request

---

# ⭐ Support

If you found this project useful, please consider giving it a ⭐ on GitHub.

It helps support future development and motivates me to continue building open-source projects.

---

<p align="center">

### Built with ❤️ using Java • Kotlin • Compose Multiplatform • Gradle

**Thank you for visiting the Health Monitor repository!**

</p>
