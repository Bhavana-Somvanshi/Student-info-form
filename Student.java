import java.awt.*;


class Student extends Frame
{
Label lsname, lsrollno, lsclass, lgender, lsbg, lsmob, lsadrs;
CheckboxGroup gender;
Checkbox male, female;
Choice csclass;
TextField tfname, tfrollno, tfmob;
TextArea tadrs;
Button submit;

TextArea display;

Student()
{
lsname   = new Label("Name : ");
lsrollno = new Label("Roll No : ");
lsclass  = new Label("Class : ");
lgender  = new Label("Gander : ");
lsbg     = new Label("Blood Group : ");
lsmob    = new Label("Mobile : ");
lsadrs   = new Label("Address : ");

gender = new CheckboxGroup();  
        male   = new Checkbox("Male", gender, false);  
        female = new Checkbox("Female", gender, false);
csclass = new Choice();  
        csclass.add("Btech IT");  
        csclass.add("Btech CS");  
        csclass.add("BCA");  
        csclass.add("MCA");  
        csclass.add("MSc CS");
        csclass.add("BSc CS");

tfname   = new TextField();
tfrollno = new TextField();
tfmob    = new TextField();

tadrs = new TextArea("", 2 , 100 , TextArea.SCROLLBARS_NONE);

submit  = new Button("Submit");

display = new TextArea("", 2 , 100 , TextArea.SCROLLBARS_NONE);
display.setEditable(false);

lsname.setBounds(10, 30, 50, 20);
tfname.setBounds(70, 30, 150, 20);

lsrollno.setBounds(240, 30, 50, 20);
tfrollno.setBounds(300, 30, 150, 20);

lsclass.setBounds(10, 60, 50, 20);
csclass.setBounds(70, 60, 150, 20);

lgender.setBounds(240, 60, 50, 20);
male.setBounds(300, 60, 50, 20);
female.setBounds(360, 60, 50, 20);

lsmob.setBounds(10, 90, 50, 20);
tfmob.setBounds(70, 90, 150, 20);

lsadrs.setBounds(10, 120, 50, 20);
tadrs.setBounds(70, 120, 380, 70);

submit.setBounds(10, 200, 440, 30);

display.setBounds(10, 240, 440, 130);

add(lsname);
add(lsrollno);
add(lsclass);
add(lgender);
add(lsbg);
add(lsadrs);
add(lsmob);
add(male);
add(female);
        add(csclass);
add(tfname);
add(tfrollno);
add(tadrs);
add(tfmob);
        add(submit);
add(display);
        setTitle("Students Details");
setSize(460,390);
setLayout(null);
setVisible(true);
}
     public static void main(String[] args)
{
new Student();
}
}
