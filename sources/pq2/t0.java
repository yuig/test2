package pq2;

/* loaded from: classes2.dex */
public abstract class t0 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.google.android.gms.common.api.internal.v f101084a;

    /* renamed from: b, reason: collision with root package name */
    public static final m60.f0 f101085b;

    /* renamed from: c, reason: collision with root package name */
    public static final ln2.k f101086c;

    static {
        String property = System.getProperty("java.vm.name");
        property.getClass();
        if (property.equals("RoboVM")) {
            f101084a = null;
            f101085b = new m60.f0();
            f101086c = new ln2.k(12);
        } else if (property.equals("Dalvik")) {
            f101084a = new com.google.android.gms.common.api.internal.v();
            f101085b = new u0();
            f101086c = new h();
        } else {
            f101084a = null;
            f101085b = new v0();
            f101086c = new h();
        }
    }
}
