package ff0;

import uj2.q;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f62103a;

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f62104b;

    /* renamed from: c, reason: collision with root package name */
    public static final boolean f62105c;

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f62106d;

    static {
        try {
            Class.forName("com.pinterest.UnitTestEnvironment");
            f62103a = true;
        } catch (ClassNotFoundException unused) {
            f62103a = false;
        }
        try {
            Class.forName("com.pinterest.UITestEnvironment");
            f62104b = true;
        } catch (ClassNotFoundException unused2) {
            f62104b = false;
        }
        try {
            Class.forName("com.pinterest.roborazzi.RoborazziTest");
            f62105c = true;
        } catch (ClassNotFoundException unused3) {
            f62105c = false;
        }
        try {
            f62106d = "benchmark".equals((String) so.a.class.getField("BUILD_TYPE").get(null));
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException unused4) {
            f62106d = false;
        }
        q.y(Boolean.TRUE);
    }

    public static boolean a() {
        return f62103a || f62104b || f62105c;
    }

    public static boolean b() {
        return f62106d || f62104b;
    }
}
