package pp2;

import ads_mobile_sdk.ci1$$ExternalSyntheticThrowCCEIfNotNull0;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

/* loaded from: classes4.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final String f100951a = a.class.getName();

    public static void a(String str) {
        String str2 = f100951a;
        ResourceBundle.getBundle("org.eclipse.paho.client.mqttv3.internal.nls.logcat");
        try {
            ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(Class.forName(str2).newInstance());
            throw null;
        } catch (ClassNotFoundException | ExceptionInInitializerError | IllegalAccessException | InstantiationException | NoClassDefFoundError | SecurityException unused) {
            throw new MissingResourceException("Error locating the logging class", "pp2.b", str);
        }
    }
}
