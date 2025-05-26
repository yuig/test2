package ads_mobile_sdk;

/* loaded from: classes2.dex */
public abstract class ic0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Class f6313a;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        f6313a = cls;
    }

    public static final jc0 a(String str) {
        Class cls = f6313a;
        if (cls == null) {
            return null;
        }
        try {
            return (jc0) cls.getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
