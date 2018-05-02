/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms.veterinaire;

import com.codename1.components.SpanLabel;
import com.codename1.ui.Form;
import service.ServiceVeterinaire;

/**
 *
 * @author gmehd
 */
public class AfficheVeterinaire {
    Form f;
    SpanLabel lb;
  
    public AfficheVeterinaire() {
        
        f = new Form();
        lb = new SpanLabel("");
        f.add(lb);
        ServiceVeterinaire serviceTask=new ServiceVeterinaire();
        lb.setText(serviceTask.getList2().toString());
        /*/
        ConnectionRequest con = new ConnectionRequest();
        con.setUrl("http://41.226.11.243:10004/tasks/");
        NetworkManager.getInstance().addToQueue(con);
        con.addResponseListener(new ActionListener<NetworkEvent>() {

            @Override
            public void actionPerformed(NetworkEvent evt) {
                ServiceTask ser = new ServiceTask();
                List<Task> list = ser.getListTask(new String(con.getResponseData()));
                System.out.println("sana");
                System.out.println(list);
                lb.setText(list.toString());
               
                System.out.println(lb.getText());
                f.refreshTheme();
            }
        });
        //*/
          f.getToolbar().addCommandToRightBar("back", null, (ev)->{VeterinaireForm h=new VeterinaireForm();
          h.getF().show();
          });
    }

    public Form getF() {
        return f;
    }

    public void setF(Form f) {
        this.f = f;
    }
}