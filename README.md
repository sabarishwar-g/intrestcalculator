# Interest Calculator (Java) 🔢
*A robust Java application for calculating simple and compound interest with precision*

**Note**: Consider renaming to "Interest-Calculator-Java" for better discoverability (current name contains a typo: "intrest" → "interest")

## 📌 Overview
This project provides financial calculation capabilities through both command-line interface (CLI) and graphical user interface (GUI) implementations. It implements standard interest calculation formulas:

- **Simple Interest**: \[SI = P \times r \times t\]
- **Compound Interest**: \[CI = P \times (1 + \frac{r}{n})^{nt} - P\]

## 🚀 Features
- **Dual Calculation Modes**  
  Supports both simple and compound interest calculations
- **Flexible Input Options**
  - Command-line arguments
  - Interactive console input
  - GUI form input (Swing implementation)
- **Validation System**  
  Ensures valid principal amounts, positive rates, and proper time periods
- **Multi-Currency Support**  
  Handles different currency formats and symbols
- **Interest Breakdown**  
  Generates detailed year-by-year growth reports

## 🛠️ Tech Stack
```properties
Language: Java 17+
Build Tool: Maven
Testing: JUnit 5
GUI: Java Swing
Reporting: PDFBox (for report generation)
```

## ⚙️ Installation
```bash
git clone https://github.com/yourusername/intrest-calculator-java.git
cd intrest-calculator-java
mvn clean install
```

## 🧮 Usage Examples
**CLI Version**:
```java
java -jar target/interest-calculator.jar --type compound --principal 5000 --rate 7.5 --years 5
```

**GUI Version**:
```java
java -cp target/interest-calculator.jar com.interestcalculator.GUIApp
```

## 📊 Sample Output
```
Compound Interest Calculation:
Principal: ₹5,000.00 | Rate: 7.5% | Years: 5
Total Amount: ₹7,201.27
Interest Earned: ₹2,201.27
```

## 🧪 Testing
```bash
mvn test
```
Covers edge cases like:
- Zero principal validation
- Negative rate prevention
- Fractional year calculations

## 🌟 Future Enhancements
- Web interface using JavaFX
- REST API implementation
- Mobile app port (Android)
- Historical currency conversion

[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)
[![Java CI](https://github.com/yourusername/intrest-calculator-java/actions/workflows/maven.yml/badge.svg)](https://github.com/yourusername/intrest-calculator-java/actions)

📥 **Contributions Welcome!**  
See [CONTRIBUTING.md](CONTRIBUTING.md) for guidelines
