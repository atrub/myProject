package com.alfabank;

import java.util.Properties;

public class Config {

    private static Config instance;

    private boolean propbool;
    private int propint;
    private String propstring;

    static {
        instance = new Config();
    }

    private Properties props;

    void setProps(Properties props) {
        if (props.getProperty("propint") != null){
            propint = Integer.parseInt(props.getProperty("propint"));
        }
        if (props.getProperty("propbool") != null){
            propbool = Boolean.parseBoolean(props.getProperty("propbool"));
        }
        if (props.getProperty("propstring") != null){
            propstring = props.getProperty("propstring");
        }
    }

    private Config() {

        try {
            props = new Properties();
            props.load(this.getClass().getResourceAsStream("/.properties"));
            setProps(props);
            props = System.getProperties();
            setProps(props);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static Config getInstance() {
        return instance;
    }

    public boolean isPropbool() {
        return propbool;
    }

    public int getPropint() {
        return propint;
    }

    public String getPropstring() {
        return propstring;
    }
}

