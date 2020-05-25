
import java.util.Calendar;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author boss dung
 */
public class BaiMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       AbstractFile root =new Folder("Data");
       AbstractFile toanFolder =new Folder("Toan");
       AbstractFile LyFolder =new Folder("Ly");
       AbstractFile HoaFolder =new Folder("Hoa");
       AbstractFile Daiso =new File("Toán A");
       AbstractFile Giaitich =new File("Toán B");
      AbstractFile TiengAnhFolder =new Folder("MyELT");
      AbstractFile ChuyenNganh= new File("Tieng anh cntt");
      root.add(TiengAnhFolder);
      TiengAnhFolder.add(ChuyenNganh);
        System.out.println(root.getTreeFolder());
        System.out.println(ChuyenNganh.path);
       
       
       
    
    
    }
        // TODO code application logic here
 
    
   
   
    
}
