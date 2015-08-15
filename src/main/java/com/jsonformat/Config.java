package com.jsonformat;


/**
 * Created by zzz40500 on 15/5/31.
 * Ĭ��������
 */
public class Config {

    // �����Ƿ���private�ģ��������ô���Զ�����set+get����
    private boolean fieldPrivateMode = true;

    // �Ƿ����SerializedName��ע��
    private boolean useSerializedName = true;

    // ��������ʱ������ĺ�׺��
    private String suffixStr = "";

    // ����entity
    private boolean resuseEntity = false;

    private Config() {

    }

    private static Config config;

    public static Config getInstant() {
        if (config == null) {
            config = new Config();
            
            /*config.setFieldPrivateMode(true);
            config.setUseSerializedName(true);
            config.setSuffixStr("");
            config.setResuseEntity(false);

            config.setObjectFromDataStr();
             config.setObjectFromDataStr1("Strings.objectFromObject1");
            config.setArrayFromDataStr(, Strings.arrayFromData));
            config.setArrayFromData1Str(, Strings.arrayFromData1));*/
        }
        return config;
    }


    public boolean isFieldPrivateMode() {
        return fieldPrivateMode;
    }


    public boolean isUseSerializedName() {
        return useSerializedName;
    }

    public String getSuffixStr() {
        return suffixStr;
    }

    public static Config getConfig() {
        return config;
    }

    public static void setConfig(Config config) {
        Config.config = config;
    }



}
