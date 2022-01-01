package com.company.exceptionTree;

public class Main {

    public final String name = "hello";

    @Override
    public String toString() {
        return "Main{" +
                "name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        System.out.println(add());
    }

    public static String add(){
        String sms = "auction sms: %s \n";
        String mail = "auction mail: %s \n";

        String a = "sms";
        String b = "email";

        Builder builder = new Builder();
        return builder.addContent(sms,a)
                .addContent(mail,b)
                .get();
    }


}

class Builder{
    StringBuilder builder = new StringBuilder();
    public Builder addContent(String key, String value) {
         if (value != null){
             builder.append(String.format(key,value));
             return this;
         }
         return this;
    }

    public String get(){
        return builder.toString();
    }
}
