package ads_mobile_sdk;

/* loaded from: classes2.dex */
abstract class vc {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f12432a;

    /* renamed from: b, reason: collision with root package name */
    private static final Class<?> f12433b;

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f12434c;

    static {
        f12433b = f12432a ? qa1.class : a("libcore.io.Memory");
        f12434c = (f12432a || a("org.robolectric.Robolectric") == null) ? false : true;
    }

    private static <T> Class<T> a(String str) {
        try {
            return (Class<T>) Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean b() {
        return f12432a || !(f12433b == null || f12434c);
    }

    public static Class<?> a() {
        return f12433b;
    }
}
