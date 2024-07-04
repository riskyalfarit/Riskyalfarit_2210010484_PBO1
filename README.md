# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data mahasiswa menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa nama dan NPM mahasiswa, dan memberikan output berupa informasi detail dari NPM tersebut seperti tahun masuk, fakultas, program studi, dan nomor registrasi.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Mahasiswa`, `MahasiswaDetail`, dan `MahasiswaBeraksi` adalah contoh dari class.

```public class Driver {
    String nama;   //atribut dan encapsulation
    String idlogin;

    public Driver(String nama, String idlogin) {  //Construktor
        this.nama = nama;
        this.idlogin = idlogin; 
    }
    public void setNama(String nama) { //Mutator
        this.nama = nama;
    }
    
    public void setIidlogin(String idlogin) {
        this.idlogin = idlogin;
```

2. **Object** adalah instance dari class. Pada kode ini, `Driverojol[i] = new inputdriver(nama, idlogin);` adalah contoh pembuatan object.

```bash
Driverojol[i] = new inputdriver(nama, idlogin);
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `nama` dan `idlogin` adalah contoh atribut.

```bash
String nama;   
    String idlogin;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Driver` dan `inputdriver`.

```bash
public Driver(String nama, String idlogin) {  
        this.nama = nama;
        this.idlogin = idlogin;

```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setnama` dan `setidlogin` adalah contoh method mutator.

```bash
public void setNama(String nama) { //Mutator
        this.nama = nama;
 public void setIidlogin(String idlogin) {
        this.idlogin = idlogin;
}
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getnama`, `getidlogin`, `getTahunMasuk`, `getStatus`, `getMitra`, dan `getNohp` adalah contoh method accessor.

```bash
 public String getnama(){ 
        return nama;
    }
     public String getidlogin(){
        return idlogin;
    }
     public String displayinfo(){
         return "nama : "+getnama()+
                 "idlogin : "+getidlogin();
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `nama` dan `idlogin` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
 String nama;   
    String idlogin;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `inputdriver` mewarisi `driver` dengan sintaks `extends`.

```bash
public class inputdriver extends Driver {
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `displayInfo(String)` di `Driver` merupakan overloading method `displayInfo` dan `displayInfo` di `inputdriver` merupakan override dari method `displayInfo` di `Driver`.

```bash
public String displayinfo(String Mitra){
         return displayinfo() + "\nMitra: "+Mitra;
     }
}

 @Override
    public String displayinfo(){
        return super.displayinfo()+
                "\nTahun Daftar : "+getTahunMasuk()+
                "\nStatus : "+getStatus()+
                "\nMitra : "+getMitra()+
                "\nnohp : "+getnohp();
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `if else` dalam method `getStatus` dan seleksi `switch` dalam method `getMitra`.

```bash
 public String getStatus(){
        String kodelogin = getidlogin().substring(2, 4);
        //seleksi if
        if(kodelogin.equals("")){
            return "Status Driver Masih Akttif";
        }else {
            return "Status Driver Tidak Akttif";
            
        }
    }
    public String getMitra(){
       String kodeMitra = getidlogin().substring(4, 6);
       //seleksi switch
       switch(kodeMitra){
           case "11":
                   return "Aplikasi Maxim";
           case "22":
                   return "Aplikasi Gojek";
           default:
                   return "Aplikasi Grab";          
       }
    }
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan data.

```bash
 for (inputdriver data: Driverojol){
    ...
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
catch (NumberFormatException e){
            System.out.println("Kesalahan Format Nomor: "+e.getMessage());
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("Kesalahan Format idlogin: "+e.getMessage());
        }catch (Exception e){
            System.out.println("Kesalahan umum: "+e.getMessage());
        }
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `inputdriver[] Driverojol = new inputdriver[2];` adalah contoh penggunaan array.

```bash
inputdriver[] Driverojol = new inputdriver[2];
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
 try{
            //io sederhana
            Scanner scanner = new Scanner(System.in);
            
            //array
            inputdriver[] Driverojol = new inputdriver[2];
            
            //perulangan 
            for(int i=0; i<Driverojol.length; i++){
                System.out.println("Masukan nama Driver "+(i+1)+": ");
                String nama = scanner.nextLine();
                System.out.println("Masukan NOMOR LOGIN Driver "+(i+1)+": ");
                String idlogin = scanner.nextLine();
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Risky Alfarit

NPM: 2210010484
