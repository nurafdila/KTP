/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unu.jogja.project.ktp;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Nur afdila
 */
@Controller 
public class datacontroller {
    
    DataJpaController datactrl = new DataJpaController();
    List<Data> newdata = new ArrayList<>();
    
    @RequestMapping("/data")
    public String getDataKTP (Model model){
        int record = datactrl.getDataCount();
        
        try{
            newdata = datactrl.findDataEntities().subList(0, record);
        }
        catch(Exception e){}
        model.addAttribute("goData", newdata);
        model.addAttribute("record", record);
        
        return "database";
        
    }   
    
    
    
}
