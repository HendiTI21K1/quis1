package com.hendi.quizmobileprogramming

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView

class ActivityJawaban2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_jawaban2)

        findViewById<ImageView>(R.id.kembaliMenuAwal2).setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }

        val textView1 = findViewById<TextView>(R.id.jawabanA2)
        val textView2 = findViewById<TextView>(R.id.jawabanA22)

        textView1.text = "2. Sebutkan Tools yang disediakan oleh SDK Android ?"
        textView2.text =
                "1. Android Studio:\n" +
                "   • IDE resmi untuk pengembangan aplikasi Android yang menyediakan editor kode, emulator, dan alat pengembangan lainnya.\n" +
                "\n" +
                "2. Android Emulator:\n" +
                "   • Alat yang memungkinkan pengujian aplikasi pada berbagai perangkat virtual Android dengan berbagai ukuran layar, versi OS, dan konfigurasi perangkat keras.\n" +
                "\n" +
                "3. ADB (Android Debug Bridge):\n" +
                "   • Alat command-line yang memungkinkan komunikasi dengan perangkat Android untuk debugging, instalasi aplikasi, dan pengelolaan perangkat.\n" +
                "\n" +
                "4. Android SDK Platform-Tools:\n" +
                "   • Kumpulan alat yang termasuk `adb` dan `fastboot`, digunakan untuk debugging dan mem-flash perangkat Android.\n" +
                "\n" +
                "5. Android SDK Build-Tools:\n" +
                "   • Alat yang digunakan untuk membangun dan mengkompilasi aplikasi Android, termasuk `aapt`, `zipalign`, dan `apkbuilder`.\n" +
                "\n" +
                "6. Android SDK Tools:\n" +
                "   • Alat tambahan untuk manajemen SDK dan konfigurasi proyek, seperti `sdkmanager` untuk mengelola paket SDK dan `avdmanager` untuk mengelola AVD (Android Virtual Devices).\n" +
                "\n" +
                "7. ProGuard:\n" +
                "   • Alat untuk obfuscation dan optimasi kode yang membantu mengurangi ukuran aplikasi dan melindungi kode sumber dari pembajakan.\n" +
                "\n" +
                "8. Android Lint:\n" +
                "   • Alat analisis statis yang memeriksa kode sumber aplikasi untuk menemukan potensi masalah, seperti bug, masalah performa, dan masalah penggunaan.\n" +
                "\n" +
                "9. Android Device Monitor:\n" +
                "   • Alat grafis untuk memantau status perangkat, melihat log, dan menganalisis performa aplikasi.\n" +
                "\n" +
                "10. Hierarchy Viewer:\n" +
                "    • Alat untuk menganalisis dan memperbaiki tata letak UI aplikasi dengan memvisualisasikan hierarki tampilan aplikasi.\n" +
                "\n" +
                "11. UI Automator Viewer:\n" +
                "    • Alat untuk menganalisis antarmuka pengguna aplikasi dan mengidentifikasi elemen-elemen UI untuk automatisasi pengujian.\n" +
                "\n" +
                "12. Android Profiler:\n" +
                "    • Alat di Android Studio untuk memantau performa aplikasi, termasuk penggunaan CPU, memori, dan jaringan.\n" +
                "\n" +
                "13. SDK Manager:\n" +
                "    • Alat untuk mengelola dan mengunduh berbagai komponen SDK, seperti platform, alat build, dan dokumentasi.\n" +
                "\n" +
                "14. AVD Manager:\n" +
                "    • Alat untuk membuat dan mengelola perangkat virtual Android (AVD) yang digunakan dalam emulator.\n" +
                "\n" +
                "15. Resource Manager:\n" +
                "    • Alat untuk mengelola dan mengedit sumber daya seperti gambar, string, dan layout dalam proyek Android.\n"
    }
}