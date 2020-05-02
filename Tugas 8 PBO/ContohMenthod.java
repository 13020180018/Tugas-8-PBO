import javax.swing.JOptionPane;

/**
 *
 * @author irfan
 */
class dataMhs{
    int nim;
    String nama, jurusan, fakultas;    
    
    // method output
    void input(){
        nim = JOptionPane.showInputDialog("NIM : ");
        nama = JOptionPane.showInputDialog("Nama : ");
        jurusan = JOptionPane.showInputDialog("Jurusan : ");
        fakultas = JOptionPane.showInputDialog("Fakultas : ");
    }
    
    // Method output
    void output(){
        System.out.println("NIM       : "+nim);
        System.out.println("Nama      : "+nama);
        System.out.println("Jurusan   : "+jurusan);
        System.out.println("Fakultas  : "+fakultas);
    }
}
public class contohMethod {
    public static void main(String[] args) {
        //membuat objek baru
        dataMhs objek1 = new dataMhs();
        
        // mengakses dan menjalankan method input
        objek1.input();
        
        // mengakses dan menjalankan method output
        objek1.output();
    }
    
}