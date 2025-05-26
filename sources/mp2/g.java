package mp2;

import java.util.Enumeration;
import java.util.Properties;

/* loaded from: classes4.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public boolean f87938a = true;

    /* renamed from: b, reason: collision with root package name */
    public int f87939b = 0;

    /* renamed from: c, reason: collision with root package name */
    public boolean f87940c = false;

    public final String toString() {
        String stringBuffer;
        Properties properties = new Properties();
        properties.put("MqttVersion", Integer.valueOf(this.f87939b));
        properties.put("CleanSession", Boolean.valueOf(this.f87938a));
        properties.put("ConTimeout", 30);
        properties.put("KeepAliveInterval", 60);
        properties.put("UserName", "null");
        properties.put("WillDestination", "null");
        properties.put("SocketFactory", "null");
        properties.put("SSLProperties", "null");
        String str = rp2.a.f109071a;
        StringBuffer stringBuffer2 = new StringBuffer();
        Enumeration<?> propertyNames = properties.propertyNames();
        String str2 = rp2.a.f109071a;
        stringBuffer2.append(String.valueOf(str2) + "============== Connection options ==============" + str2);
        while (propertyNames.hasMoreElements()) {
            String str3 = (String) propertyNames.nextElement();
            if (str3.length() >= 28) {
                stringBuffer = str3;
            } else {
                StringBuffer stringBuffer3 = new StringBuffer(28);
                stringBuffer3.append(str3);
                int length = 28 - str3.length();
                while (true) {
                    length--;
                    if (length < 0) {
                        break;
                    }
                    stringBuffer3.append(' ');
                }
                stringBuffer = stringBuffer3.toString();
            }
            stringBuffer2.append(String.valueOf(stringBuffer) + ":  " + properties.get(str3) + str2);
        }
        stringBuffer2.append("==========================================" + str2);
        return stringBuffer2.toString();
    }
}
