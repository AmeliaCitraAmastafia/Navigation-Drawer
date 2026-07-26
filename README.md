# NavDrawerApp - Simulasi Navigation Drawer
## Android Jetpack Compose Project


<img  height="340" alt="Screenshot_20260726_125438_Navigation Drawer App" src="https://github.com/user-attachments/assets/7c4a746b-d599-4551-9a0f-81fbcbd0f028" />
<img  height="340" alt="Screenshot_20260726_125432_Navigation Drawer App" src="https://github.com/user-attachments/assets/c811d131-201e-43e5-bc14-819588036250" />
<img  height="340" alt="Screenshot_20260726_125447_Navigation Drawer App" src="https://github.com/user-attachments/assets/5c3425a6-9601-46bc-b6bd-874462ff568c" />
<img  height="340" alt="Screenshot_20260726_125507_Navigation Drawer App" src="https://github.com/user-attachments/assets/f7ffcf00-b952-4845-bcf7-56f94f897cf6" />
<img  height="340" alt="Screenshot_20260726_125511_Navigation Drawer App" src="https://github.com/user-attachments/assets/b673fd49-dedb-4676-a2f1-aaed2ca8db6c" />


---

### Deskripsi
Aplikasi Android yang mendemonstrasikan implementasi **Navigation Drawer** 
menggunakan Jetpack Compose dan Material3.

Terdapat 3 menu di drawer: **Screen 1**, **Screen 2**, dan **Screen 3**.
Setiap screen menampilkan TopAppBar dengan back arrow dan area konten.

---

### Struktur Project

```
NavDrawerApp/
├── app/src/main/
│   ├── java/com/example/navdrawerapp/
│   │   ├── MainActivity.kt                    ← Activity utama (entry point)
│   │   └── ui/
│   │       ├── components/
│   │       │   └── DrawerContent.kt            ← Isi Navigation Drawer (menu)
│   │       ├── navigation/
│   │       │   ├── NavigationRoutes.kt         ← Definisi route setiap halaman
│   │       │   └── NavGraph.kt                 ← Peta navigasi antar halaman
│   │       ├── screens/
│   │       │   ├── HomeScreen.kt               ← Halaman utama + Drawer
│   │       │   ├── ScreenContent.kt            ← Komponen generik screen
│   │       │   ├── Screen1.kt                  ← Halaman Screen 1
│   │       │   ├── Screen2.kt                  ← Halaman Screen 2
│   │       │   └── Screen3.kt                  ← Halaman Screen 3
│   │       └── theme/
│   │           ├── Color.kt                    ← Warna Compose (sinkron color.xml)
│   │           └── Theme.kt                    ← Tema Material3
│   └── res/values/
│       ├── color.xml                           ← Semua warna hexadecimal
│       ├── strings.xml                         ← String resources
│       └── themes.xml                          ← Tema XML
```

---

### Alur Navigasi

```
┌─────────────────────┐
│   HomeScreen        │
│   (Navigation       │──── Geser kiri / tap ikon ≡
│    Drawer)          │
└────────┬────────────┘
         │
    ┌────┼────┐
    ▼    ▼    ▼
Screen1  Screen2  Screen3
    │    │    │
    └────┼────┘
         │ (Back Arrow)
         ▼
    HomeScreen
```

---

### Cara Menjalankan

1. Buka Android Studio
2. Pilih **File → Open** → arahkan ke folder `NavDrawerApp`
3. Tunggu Gradle sync selesai
4. Klik **Run** (▶) atau tekan Shift + F10
5. Pilih emulator atau device fisik

---

### Dependencies Utama

| Library                | Kegunaan                          |
|------------------------|-----------------------------------|
| Jetpack Compose BOM    | UI toolkit modern                 |
| Material3              | Desain komponen Material You      |
| Navigation Compose     | Navigasi antar halaman            |
| Material Icons Extended| Ikon tambahan (Menu, ArrowBack)   |

---

### Warna (color.xml)

Semua warna tersimpan di `res/values/color.xml` dan diduplikasi 
di `Color.kt` untuk penggunaan di Compose.


