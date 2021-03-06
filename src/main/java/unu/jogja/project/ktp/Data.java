/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unu.jogja.project.ktp;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Nur afdila
 */
@Entity
@Table(name = "data")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Data.findAll", query = "SELECT d FROM Data d"),
    @NamedQuery(name = "Data.findById", query = "SELECT d FROM Data d WHERE d.id = :id"),
    @NamedQuery(name = "Data.findByNik", query = "SELECT d FROM Data d WHERE d.nik = :nik"),
    @NamedQuery(name = "Data.findByNama", query = "SELECT d FROM Data d WHERE d.nama = :nama"),
    @NamedQuery(name = "Data.findByTglLahir", query = "SELECT d FROM Data d WHERE d.tglLahir = :tglLahir"),
    @NamedQuery(name = "Data.findByJeniskelamin", query = "SELECT d FROM Data d WHERE d.jeniskelamin = :jeniskelamin"),
    @NamedQuery(name = "Data.findByAlamat", query = "SELECT d FROM Data d WHERE d.alamat = :alamat"),
    @NamedQuery(name = "Data.findByAgama", query = "SELECT d FROM Data d WHERE d.agama = :agama"),
    @NamedQuery(name = "Data.findByStatus", query = "SELECT d FROM Data d WHERE d.status = :status"),
    @NamedQuery(name = "Data.findByPekerjaan", query = "SELECT d FROM Data d WHERE d.pekerjaan = :pekerjaan"),
    @NamedQuery(name = "Data.findByKewarganegaraan", query = "SELECT d FROM Data d WHERE d.kewarganegaraan = :kewarganegaraan"),
    @NamedQuery(name = "Data.findByBerlakuHingga", query = "SELECT d FROM Data d WHERE d.berlakuHingga = :berlakuHingga")})
public class Data implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Basic(optional = false)
    @Column(name = "NIK")
    private String nik;
    @Basic(optional = false)
    @Column(name = "nama")
    private String nama;
    @Basic(optional = false)
    @Column(name = "tgl_lahir")
    @Temporal(TemporalType.DATE)
    private Date tglLahir;
    @Basic(optional = false)
    @Column(name = "jeniskelamin")
    private String jeniskelamin;
    @Basic(optional = false)
    @Column(name = "Alamat")
    private String alamat;
    @Basic(optional = false)
    @Column(name = "Agama")
    private String agama;
    @Basic(optional = false)
    @Column(name = "Status")
    private String status;
    @Column(name = "Pekerjaan")
    private String pekerjaan;
    @Basic(optional = false)
    @Column(name = "Kewarganegaraan")
    private String kewarganegaraan;
    @Column(name = "BerlakuHingga")
    private String berlakuHingga;

    public Data() {
    }

    public Data(Long id) {
        this.id = id;
    }

    public Data(Long id, String nik, String nama, Date tglLahir, String jeniskelamin, String alamat, String agama, String status, String kewarganegaraan) {
        this.id = id;
        this.nik = nik;
        this.nama = nama;
        this.tglLahir = tglLahir;
        this.jeniskelamin = jeniskelamin;
        this.alamat = alamat;
        this.agama = agama;
        this.status = status;
        this.kewarganegaraan = kewarganegaraan;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Date getTglLahir() {
        return tglLahir;
    }

    public void setTglLahir(Date tglLahir) {
        this.tglLahir = tglLahir;
    }

    public String getJeniskelamin() {
        return jeniskelamin;
    }

    public void setJeniskelamin(String jeniskelamin) {
        this.jeniskelamin = jeniskelamin;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getAgama() {
        return agama;
    }

    public void setAgama(String agama) {
        this.agama = agama;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPekerjaan() {
        return pekerjaan;
    }

    public void setPekerjaan(String pekerjaan) {
        this.pekerjaan = pekerjaan;
    }

    public String getKewarganegaraan() {
        return kewarganegaraan;
    }

    public void setKewarganegaraan(String kewarganegaraan) {
        this.kewarganegaraan = kewarganegaraan;
    }

    public String getBerlakuHingga() {
        return berlakuHingga;
    }

    public void setBerlakuHingga(String berlakuHingga) {
        this.berlakuHingga = berlakuHingga;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Data)) {
            return false;
        }
        Data other = (Data) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "unu.jogja.project.ktp.Data[ id=" + id + " ]";
    }
    
}
