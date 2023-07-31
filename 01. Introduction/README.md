# Pertemuan 1
## Pengenalan Stuktur Data & Instalasi Tools

### Materi Awal :
Struktur data adalah cara atau cara tertentu untuk mengorganisasi dan menyimpan data dalam komputer atau sistem komputasi. Tujuan utama dari struktur data adalah untuk menyimpan dan mengelola data dengan efisien agar dapat diakses, dimanipulasi, dan diproses dengan cepat dan tepat.

Struktur data membantu mengatur data dalam bentuk yang terstruktur, yang memungkinkan komputer untuk bekerja dengan lebih efisien dalam mencari, memasukkan, menghapus, atau mengubah informasi yang disimpan. Pemilihan struktur data yang tepat dapat memiliki dampak besar pada kinerja program komputer dan efisiensi dalam memproses data.

Beberapa contoh struktur data umum meliputi:

- Array
- Linked List
- Stack
- Queue 
- Tree
- Graph
- Hash Table

### Tipe data Primitif 

Tipe data Primitif mulai dikenal pada bahasa pemrograman prosedural seperti: Pascal, C, atau Basic. Dimana tipe data ini memiliki ukuran memori yang tetap dan pasti, diantaranya:

- **Integer**: byte (8 byte), short (16 b), int (32 b), long (64 b)
- **Floating point**: float (32 byte), double(64 b), decimal(128 b), bigDecimal (256 b)
- **Booleans**: boolean (1 bit)
- **Character**: char (1 byte)

### Tipe Data Abstrak (Obyek)

Tipe data Obyek mulai digunakan pada pemrograman prosedural pascal ataupun C dengan penggunaan tipe data abstrak dan pointer, yaitu record, struct untuk tipe data kelompok serta pointer untuk penciptaan tipe data dinamis. Pada perkembangannya bahasa pemrograman berorientasi obyek menggunakannya untuk tipe data Obyek dimulai pada bahasa pemrograman
LISP dan kemudian disusul Java Tipe data ini dapat merepresentasikan kelompok tipe data dengan beragam tipe primitif yang bisa diciptakan secara dinamis.

### Tipe data Koleksi (Collection)
Koleksi adalah tipe data yang berupa rangkaian atau kumpulan data ataupun obyek yang berindeks. Terdapat tiga tipe dasar koleksi di Java yaitu:
1. **Array** , koleksi statis dengan ukuran tetap dan hanya bisa mengelompokkant ipe data yang sama.
2. **List** , koleksi dinamis dengan ukuran adaptif dan bisa mengelompokkan tipe data yang sama ataupun berbeda
3. **Map** , koleksi dinamis dengan ukuran adaptif dan bisa mengelompokkan tipe data yang sama ataupun berbeda dengan menggunakan pasangan `<key, value>`.

### Pemrograman Java
Java adalah salah satu bahasa pemrograman yang bersifat open source yang merupakan produk dari Sun Microsystem. Bahasa Java adalah bahasa modern yang telah diterima masyarakat komputasi dunia. Hampir semua perusahaan perangkat lunak dan komputer besar mendukung dan mengembangkan aplikasi sistem berbasis Java.

Java adalah salah satu bahasa pemrogaman Multiplatform (Bisa berjalan di berbagai macam system operasi) karena pada dasarnya java mempunyai Jre (java runtime environment) atau dapat kita artikan sebagai mesin tersendiri untuk mengeksekusi binary code hasil dari compilasi program yang telah kita buat, bereda dengan bahasa pemrograman vb, c++ yang memanfaatkan komponen system dalam Windows untuk mengeksekusi binary code hasil kompilasi program.

Pada Tahun 1996, Sun Microsystem secara resmi merilis versi awal Java yang kemudian terus berkembang hingga muncul JDK 1.1 (Java Development Kit versi 1.1). Perkembangan terus dilakukan hingga muncul versi baru yang disebut Java 2. Perubahan utama antara versi sebelumnya adalah adanya Swing yang merupakan teknologi Graphical User Interface (GUI) yang
mampu menghasilkan aplikasi desktop yang benar-benar baik.

**Preparation:**

**Install JDK (Java Development Kit)**

1. Download JDK di link berikut : 
    [JDK](https://www.oracle.com/id/java/technologies/downloads/#jdk19-windows)
<br>
<br>


**Penganalan Java :**

1. Variabel :
    Format :
    ```
    tipe_data nama_variabel = nilai;
    ```     
    Contoh :
    ```
    int myNum = 10;
    float myFloatNum = 5.99f;
    char myLetter = 'D';
    boolean myBool = true;
    String myText = "Hello";
    ```

2. **Komentar** <br>
    Komentar satu baris dimulai dengan dua garis miring (//). Teks apa pun antara // dan akhir baris diabaikan oleh Java (tidak akan dieksekusi).
    ```
    // This is a comment
    System.out.println("Hello World");
    ```


3. **Output** <br>
    Menggunakan “System.out.println()”
    Apit teks yang ingin ditampilkan menggunakan tanda petik “...”
    Kata kunci : “sout” (di vscode) lalu tekan TAB
    ```
    int x = 5;
    int y = 6;
    system.out.println(x + y); // Menampilkan hasil penjumlahan x dan y
    ```

4. **Input** <br>
    Menggunakan “scanner”
    Import library untuk scanner:
    ```
    import java.util.Scanner;  // Import kelas Scanner
    ```
    Memanggil scanner:
    ```
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in); //Membuat objek scanner 
        System.out.println("Enter username: ");

        String userName = myObj.nextLine(); //Membaca inputan user
        System.out.println("Username is: " + userName); //Output inputan user
    }
    ```

**Kata Kunci Scaner :**
    <!-- buat tabel 6 baris 2 kolom -->
    <table>
        <tr>
            <td><code>nextBoolean()</td>
            <td>Untuk membaca nilai boolean dari pengguna</td>
        </tr>
        <tr>
            <td><code>nextByte()</td>
            <td>Untuk membaca nilai byte dari pengguna</td>
        </tr>
        <tr>
            <td><code>nextDouble()</td>
            <td>Untuk membaca nilai double dari pengguna</td>
        </tr>
        <tr>
            <td><code>nextFloat()</td>
            <td>Untuk membaca nilai float dari pengguna</td>
        </tr>
        <tr>
            <td><code>nextInt()</td>
            <td>Untuk membaca nilai int dari pengguna</td>
        </tr>
        <tr>
            <td><code>nextLine()</td>
            <td>Untuk membaca nilai String dari pengguna</td>
        </tr>
    </table>

