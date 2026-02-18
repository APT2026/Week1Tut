# Setup Guide – Tutorial 1  

<img width="220" height="220" alt="image" src="https://github.com/user-attachments/assets/5706c453-faf9-4d0a-9eb2-1e933e4d37ca" align="left"/>
<br/>

This guide explains how to:

1. Install Java  
2. Install an IDE (IntelliJ, Eclipse, or NetBeans)  
    2.1. If NetBeans Installed, JDK comes preinstalled!
3. Clone the repository  
4. Open and run the project  

</br>

# Step 1: Install Java (Required)

Make sure Java JDK 17 or higher is installed.
Netbeans comes with JDK installed check the used JDK
Tools > Options > Java > Maven >Default JDK

### Check if Java is installed

Open Terminal or Command Prompt and run:
```
java -version
javac -version
```

If Java is not installed, download and install it from:

- https://www.oracle.com/java/technologies/downloads/#jdk25-windows

After installation, restart your terminal and check the version again.

---

# 💻 Step 2: Install an IDE

> ### Choose ONE of the following IDEs.

---
#### 🔹 Option A: NetBeans

1. Visit: https://netbeans.apache.org/download/
2. Download the Java version
3. Install and launch NetBeans
---

#### 🔹 Option B: IntelliJ IDEA

1. Visit: https://www.jetbrains.com/idea/download/
2. Download **IntelliJ IDEA Community Edition**
3. Install using default settings
4. Launch IntelliJ
---

#### 🔹 Option C: Eclipse IDE

1. Visit: https://www.eclipse.org/downloads/
2. Download **Eclipse IDE for Enterprise Java and Web Developers**
3. Install and launch Eclipse
---

# 📥 Step 3: Clone the Repository

1. Copy the Repository URL
2. Go to the project repository page.
3. Click the Code button.
4. Copy the HTTPS URL (e.g., https://github.com/username/APT-Tutorial-Week-1.git).

<img width="600" height="309" alt="image" src="https://github.com/user-attachments/assets/c5a42347-37c1-4f06-ae70-9b1df7be5e78" />

5. Open Terminal / Command Prompt
- Windows: Open Command Prompt or Git Bash
- Mac: Open Terminal
- Linux: Open Terminal
```
git clone https://github.com/username/APT-Tutorial-Week-1.git

```

Step 4: Open and Run the Project in Your IDE

After cloning the repository, open the project using your chosen IDE.

🔹 If Using NetBeans

1. Click **File → Open Project**
2. Select the `Assignment Name` folder
3. Click **Open Project**
4. Run `LearningLogsApp.java`
   
🔹 If Using IntelliJ IDEA

1. Click **Open**
2. Select the `Assignment Name` project folder
3. Click **OK**
4. Wait for the project to load
5. Open `LearningLogsApp.java`
6. Click **Run**

🔹 If Using Eclipse

1. Click **File → Open Projects from File System**
2. Click **Directory**
3. Select the `Assignment Name` folder
4. Click **Finish**
5. Open `LearningLogsApp.java`
6. Click **Run**