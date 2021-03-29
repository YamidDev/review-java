package copyfile;

import java.io.*;

public class CopyFile {
    public FileInputStream fi;
    public FileOutputStream fo;
    public byte[] b;
    public File fileI, fileO;


    public CopyFile(String[] args) {

        if(args.length==2) {
            try {
                fileI = new File(args[0]);
                fileO = new File(args[1]);
            } catch (Exception e) {
                System.err.println(e.getMessage());
                System.exit(0);
            }

        } else {
            System.out.println("We have the original");
        }
    }


    public void duplicate() {

        System.out.println("Start in..."+System.currentTimeMillis());

        try {
            fi = new FileInputStream(fileI);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("End of read the document..."+System.currentTimeMillis());
        try {
            fo = new FileOutputStream(fileO);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        b = new byte[(int) fileI.length()];
        try {
            fi.read(b);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            fo.write(b);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("End to write the document..."+System.currentTimeMillis());
        try {
            fi.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            fo.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("End in..."+System.currentTimeMillis());
    }

    public static void main(String[] args) {
        CopyFile cp = new CopyFile(args);
        cp.duplicate();
    }
}
