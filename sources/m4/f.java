package m4;

/* loaded from: classes3.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final float f85790a;

    /* renamed from: b, reason: collision with root package name */
    public static final float f85791b;

    /* renamed from: c, reason: collision with root package name */
    public static final float f85792c;

    static {
        a(0.0f);
        a(0.5f);
        f85790a = 0.5f;
        a(-1.0f);
        f85791b = -1.0f;
        a(1.0f);
        f85792c = 1.0f;
    }

    public static void a(float f13) {
        if ((0.0f > f13 || f13 > 1.0f) && f13 != -1.0f) {
            throw new IllegalStateException("topRatio should be in [0..1] range or -1".toString());
        }
    }
}
