# SINGLE LINKED LIST

### Konsep dan Implementasi

Linked list adalah struktur data linier yang mencakup serangkaian node yang terhubung. Di sini, setiap node menyimpan data dan alamat node berikutnya. Misalnya Anda harus memulai di suatu tempat, kemudian Anda harus memberikan alamat node pertama dengan nama khusus yang disebut **HEAD**. Selain itu, simpul terakhir dalam daftar tertaut dapat diidentifikasi karena bagian berikutnya menunjuk ke **NULL**.

![02. Single Linked List/images/1.png](https://github.com/fatkhurrahman23/Struktur-Data/blob/03b9b0b506cd77642403f84fce598bcbc3b06dab/02.%20Single%20Linked%20List/images/1.png)

Linked lists terdiri dari beberapa jenis : Single, Double, and Circular linked list.

**Single Linked List** :

Mari kita lihat bagaimana setiap node dari Linked List direpresentasikan. Setiap simpul
terdiri dari:

- Item data
- Alamat node lain

Di Java, LinkedList dapat direpresentasikan sebagai kelas dan Node sebagai Class terpisah. Kelas LinkedList berisi referensi tipe Class Node

```
static class Node{
		int data;
		Node next;

		Node(int d){
			data = d;
			next = null;
		}
	}
```

**Teori Creation and Insertion:**
Insertion dalam daftar dilakukan di akhir, yaitu node baru ditambahkan setelah node terakhir dari Linked List yang diberikan. Misalnya, jika Single Link List yang diberikan adalah `5->10->15->20->25` dan 30 akan dimasukkan, maka Single Link List menjadi `5->10->15->20->25->`.

Karena Single Linked List biasanya diwakili oleh penunjuk kepalanya, ia harus melintasi daftar hingga simpul terakhir dan kemudian mengubah simpul berikutnya ke simpul terakhir ke simpul baru.

![ilustrasi2](https://github.com/fatkhurrahman23/Struktur-Data/blob/b779831702e1935797821ca74319af352ad4658d/02.%20Single%20Linked%20List/images/2.png)

Implementasi : Buat Project dengan nama singleLinkedList.java

Buat Class Node didalamnya.

Buat Constructor Node untuk memberikan nilai awal dari objek yang nanti dibuat.

```
static class Node{
		int data;
		Node next;

		Node(int d){
			data = d;
			next = null;
		}
	}
```
Buat object head dengan dengan nilai awal null

```
Node head; // head of list
```
Buat method Insert untuk menginputkan data di akhir list

```
public static singleLinkedList insert(singleLinkedList list, int data){
		Node new_node = new Node(data);

		//If the Linked List is empty, then make the new node as head
		if (list.head == null){
			list.head = new_node;
		} else {
			//Else traverse till the last node and insert the new_node there
			Node last = list.head;

			while (last.next != null){
				last = last.next;
			}
			//Insert the new_node at last node
			last.next = new_node;
		}
		//return the list by head
		return list;
	}
```
Buat Method Untuk Menampilkan list

```
//Method to print the LinkedList
	public static void printList(singleLinkedList list){
		Node currentNode = list.head;

		System.out.print("[HEAD] => ");

		//Traverse through the LinkedList
		while (currentNode != null) {
			//Print the data at current node
			System.out.print(currentNode.data + " => ");
			//Go to next node
			currentNode = currentNode.next;
		}
		System.out.println(" [NULL]"); 
	}
```

**Bagian main** :

Buat Objek dari LinkedList

```
LinkedList list = new LinkedList();
```
Insert Nilai Linked List

```
// Insert the values
list = insert(list, 1);
list = insert(list, 2);
list = insert(list, 3);
list = insert(list, 4);
list = insert(list, 5);
list = insert(list, 6);
list = insert(list, 7);
list = insert(list, 8);
```
Tampilkan List

```
// Print the LinkedList
printList(list);
```
Output

```
[HEAD] => 1 => 2 => 3 => 4 => 5 => 6 => 7 => 8 => [NULL]
```
Teori Delete List By Key

Untuk menghapus node dari daftar tertaut, lakukan langkah-langkah berikut.

1. Cari key untuk kemunculan pertamanya dalam daftar
2. Sekarang, salah satu dari 3 kondisi dapat ada di sana:
    Kasus 1: Kuncinya ada di kepala
       ● Dalam hal ini, Ubah head node ke node berikutnya dari head saat ini.
       ● Bebaskan memori node kepala yang diganti.
    Kasus 2: Kunci ditemukan di tengah atau terakhir, kecuali di kepala
       ● Dalam hal ini, Temukan simpul sebelumnya dari simpul yang akan dihapus.
       ● Ubah berikutnya node sebelumnya ke node berikutnya dari node saat ini.
       ● Bebaskan memori node yang diganti.
    Kasus 3: Kunci tidak ditemukan dalam daftar
       ● Dalam hal ini, tidak ada operasi yang perlu dilakukan.


**Gambaran Proses** : <br>
![ilustrasi gambaran proses](https://github.com/fatkhurrahman23/Struktur-Data/blob/b779831702e1935797821ca74319af352ad4658d/02.%20Single%20Linked%20List/images/3.png)

**Implementasi** :


Buat Method deleteByKey

```
//Method untuk menghapus node dengan key yang diberikan
	public static singleLinkedList deleteByKey(singleLinkedList list, int key){
		//Simpan head node
		Node currentNode = list.head, prev = null;
```

**CASE 1**: If head node itself holds the key to be deleted

```
if (currentNode != null && currentNode.data == key) {
			list.head = currentNode.next; //Changed head
			System.out.println(key + " found and deleted ");
			return list; //return the updated List
		}
```

CASE 2: If the key is somewhere other than at head

```
        //search for the key to be deleted, keep track of the previous node as we need to change currentNode.next
		while (currentNode != null && currentNode.data != key){
			// If currentNode does not hold key continue to next node
			prev = currentNode;
			currentNode = currentNode.next;
		}
```
```
// If the key was present, it should be at currNode
```

```
// Therefore the currNode shall not be null
if (currNode != null) {
// Since the key is at currNode
// Unlink currNode from linked list
prev.next = currNode.next;
```
```
// Display the message
System.out.println(key + " found and deleted");
}
```
```
//
// CASE 3: The key is not present
//
```
```
// If key was not present in linked list
// currNode should be null
if (currNode == null) {
// Display the message
System.out.println(key + " not found");
}
```
```
// return the List
return list;
}
```
Pemanggilan di main

Hapus node dengan nilai 4

```
// Delete node with value 4
// In this case the key is present ***in the
// middle***
deleteByKey(list, 4);
```
Tampilkan list

```
// Print the LinkedList
printList(list);
```
Output :

```
4 found and deleted
[HEAD] => 1 => 2 => 3 => 5 => 6 => 7 => 8 => [NULL]
```

```
Tugas :
```
1. Lakukan lakukan implementasi program diatas
2. Buat laporan pdf dan analisis program dengan isi :
    a. Identitas Diri
    b. Screen Capture Program/Coding
    c. Screen Capture Hasil Program
    d. Analisis kegunaan Tiap bagian program, jelaskan kegunaan method dan script per
       baris nya digunakan untuk apa.
    e. Boleh ditambahkan method-method yang lain, seperti insert first, delete at
       position, insert after, dll (Opsional)

## JAWABAN:

```
a. Identitas diri
```
```
b. Kode program
```



c. Hasil program

d. Analisis kode program

- Deklaraasi kelas singleLinkedList sebagai kelas
- Membuat HEAD sebagai instance variable dengan tipe NODE
- Pendeklerasian variable data sebagai integer data = d dan next = null sebagai
    node

```
Isi dari HEAD list:
```
- Membuat sebuah node baru
- Jika kepala daftar null (kosong) maka node akan ditetapkan sebagai kepala
    dafttar.
- Jika daftar tidak kosong, maka menggunakan node terakhir perulangan while
    hingga mencapai simpul terakhir


- Memasukkan node yang baru
- Menambahkan node baru di belakang node yang terkahir dan menetapkan node
    baru sebagai kepala daftar jika daftar kosong.

Mengembalikan list ke HEAD

Metode ini mengambil objek SingleLinkedList sebagai argument dan menginisialisasi
objek Node yang disebut currNode sebagai kepala daftar.

- Membuat method untuk menampilkan singleLinkedList
- Node currentNode = list.head mulai dari kepala singleLinkedList
- Mencetak [HEAD] => (untuk menunjukkan daftar)
- Jika node sekarang tidak sama dengan null maka menggunakan perulangan
    while kemudian yang digunakan menelusuri daftar, mencetak nilai data setiap
    simpul diikuti =>
- Kode akan mencetak [NULL] untuk mengindikasikan akhir daftar.

Membuat method untuk menghapus node pada singleLinkedList

- Jika node sekarang tidak sama dengan null dan node sekarang ada pada data
    kepala list maka akan mencetak ditemukan dan terhapus lalu
    mengembalikannya ke list. Kode menggunakan perulangan sementara untuk
    menelusuri daftar sampai menemukan node dengan nilai kunci sampai
    mencapai daftar terakhir.


- Jika node sekarang tidak sama dengan null dan node sekarang tidak sama
    dengan data akan melanjutkan ke node selanjutnya.
- Jika node dengan nilai kunci ditemukan, penunjuk berikutnya dari node
    sebelumnya diperbarui untuk menunjuk ke node setelah node sekarang, yang
    secara otomatis akan memunculkan data dan menghapusnya.
- Jika node sekarang sama dengan null maka akan mencetak output yang
    mengindikasikan bahwa data tidak ditemukan dan tidak ada data yang berada
    di list terhapus.
- Method insertFirst() mengambil data integer sebagai argument dan
    membuat objek Node baru Bernama newNode dengan data yang diberikan.
    Bidang berikutnya dari newNode diatur ke kepala daftar saat ini, dan kepala
    diperbarui untuk menunjuk ke newNode. Hal ini secara efektif menambahkan
    node baru ke awal daftar.


```
Membuat main program yang berisi perintah untuk menampilkan output
```
- Memasukkan data nilai 1 sampai 8 ke dalam daftar menggunakan metode
    insert()
- Kemudian pada program kedua menghapus data menggunakan metode
    deleteByKey()
- Lalu kan menampilkan hasil listnya


