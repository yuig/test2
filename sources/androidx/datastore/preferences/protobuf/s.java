package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    public static final Class f18134a;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        f18134a = cls;
    }

    public static final t a() {
        return (t) f18134a.getDeclaredMethod("getEmptyRegistry", new Class[0]).invoke(null, new Object[0]);
    }
}
