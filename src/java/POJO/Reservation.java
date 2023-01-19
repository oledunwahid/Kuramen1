package POJO;
// Generated Oct 11, 2022 12:56:09 PM by Hibernate Tools 4.3.1

import DAO.DAOReservation;
import java.util.List;
import javax.faces.bean.ManagedBean;




/**
 * Reservation generated by hbm2java
 */
@ManagedBean
public class Reservation  implements java.io.Serializable {


     private Integer id;
     private String nama;
     private String alamat;
     private String jk;
     private String email;
     private String tel;
     private String hour;
     private String orang;

     
        public List<Reservation> getAllRecords() {
        DAOReservation list = new DAOReservation();
        List<Reservation> listReservation = list.retrieveTblReservation();
        return listReservation;
    }
     
         
        public String getById() {
        String idReservation = id.toString();
        DAOReservation reservation = new DAOReservation();
        List<Reservation> listReservation = reservation.getbyID(idReservation);
        try {
            if (listReservation != null) {
                nama = listReservation.get(0).nama;
                alamat = listReservation.get(0).alamat;
                jk = listReservation.get(0).jk;
                email = listReservation.get(0).email;
                tel = listReservation.get(0).tel;
                hour = listReservation.get(0).hour;
                orang = listReservation.get(0).orang;
                return "List";
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return "List";
    }
         
        public String saveReservation() {
        DAOReservation product = new DAOReservation();
        product.addReservation(this);
        nama = "";
        alamat = "";
        jk = "";
        email = "";
        tel = "";
        hour = "";
        orang = "";
        return "reservation";
    }
         
             
        public String saveReservation2() {
        DAOReservation product = new DAOReservation();
        product.addReservation(this);
        nama = "";
        alamat = "";
        jk = "";
        email = "";
        tel = "";
        hour = "";
        orang = "";
        return "List";
    }
        
        
    public String editReservation() {
        DAOReservation reservation = new DAOReservation();
        reservation.editUser(this);
        nama = "";
        alamat = "";
        jk = "";
        email = "";
        tel = "";
        hour = "";
        orang = "";
        return "List";
    }
        
    public String deleteReservation() {
        DAOReservation reservation = new DAOReservation();
        reservation.deleteUser(id);
        nama = "";
        alamat = "";
        jk = "";
        email = "";
        tel = "";
        hour = "";
        orang = "";
        return "List";
    }

    
    public Reservation() {
    }

    public Reservation(String nama, String alamat, String jk, String email, String tel, String hour, String orang) {
       this.nama = nama;
       this.alamat = alamat;
       this.jk = jk;
       this.email = email;
       this.tel = tel;
       this.hour = hour;
       this.orang = orang;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNama() {
        return this.nama;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getAlamat() {
        return this.alamat;
    }
    
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    public String getJk() {
        return this.jk;
    }
    
    public void setJk(String jk) {
        this.jk = jk;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getTel() {
        return this.tel;
    }
    
    public void setTel(String tel) {
        this.tel = tel;
    }
    public String getHour() {
        return this.hour;
    }
    
    public void setHour(String hour) {
        this.hour = hour;
    }
    public String getOrang() {
        return this.orang;
    }
    
    public void setOrang(String orang) {
        this.orang = orang;
    }




}


