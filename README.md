# Automation Pressensi

Repository ini berisi automation testing untuk aplikasi Pressensi yang mencakup pengujian **Mobile** dan **Web** menggunakan Katalon Studio.

---

## Deskripsi

Project ini dibuat untuk mengotomatisasi proses pengujian pada aplikasi Pressensi, khususnya pada fitur-fitur utama seperti:

* Login & Logout
* Pengajuan Lembur
* Validasi form input
* Navigasi aplikasi

Automation ini bertujuan untuk meningkatkan efisiensi testing, mengurangi human error, serta memastikan kualitas aplikasi tetap terjaga.

---

## Struktur Project

```
Automation_Pressensi/
 ├── Automation_Mobile_Pressensi/
 │    ├── Test Cases
 │    ├── Object Repository
 │    └── Scripts
 │
 └── Automation_web_Pressensi/
      ├── Test Cases
      ├── Object Repository
      └── Scripts
```

---

## Tech Stack

* Katalon Studio
* Appium (Mobile Automation)
* Selenium (Web Automation)
* Groovy (Scripting Language)

---

## Cara Menjalankan Project

### 1. Clone Repository

```
git clone https://github.com/username/automation-pressensi.git
```

### 2. Buka di Katalon Studio

* Open Project
* Pilih folder project yang diinginkan:

  * `Automation_Mobile_Pressensi`
  * `Automation_web_Pressensi`

### 3. Jalankan Test Case

* Pilih test case
* Klik **Run**

---

## Mobile Automation

Cakupan pengujian:

* Login
* Pengajuan lembur
* Validasi input form
* Handling keyboard & UI element

---

## Web Automation

Cakupan pengujian:

* Login web
* Navigasi halaman
* Validasi elemen UI

---

## Catatan

* Pastikan device/emulator sudah terhubung untuk mobile testing
* Pastikan browser sudah terinstall untuk web testing
* Beberapa test menggunakan dynamic locator dan fallback untuk meningkatkan stabilitas

---

## Author

**ARZzXz**
