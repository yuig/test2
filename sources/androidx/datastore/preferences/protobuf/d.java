package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final Class f18053a;

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f18054b;

    static {
        Class<?> cls;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable unused) {
            cls = null;
        }
        f18053a = cls;
        try {
            cls2 = Class.forName("org.robolectric.Robolectric");
        } catch (Throwable unused2) {
        }
        f18054b = cls2 != null;
    }

    public static boolean a() {
        return (f18053a == null || f18054b) ? false : true;
    }
}
