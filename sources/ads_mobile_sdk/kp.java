package ads_mobile_sdk;

import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes2.dex */
public final class kp {

    /* renamed from: f, reason: collision with root package name */
    public static final long f7423f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f7424g = 0;

    /* renamed from: a, reason: collision with root package name */
    public final ThreadPoolExecutor f7425a;

    /* renamed from: b, reason: collision with root package name */
    public final jp f7426b;

    /* renamed from: c, reason: collision with root package name */
    public final jp f7427c;

    /* renamed from: d, reason: collision with root package name */
    public final ThreadPoolExecutor f7428d;

    /* renamed from: e, reason: collision with root package name */
    public final jp f7429e;

    static {
        zn2.a aVar = zn2.b.f142311b;
        f7423f = dl2.b.P2(10, zn2.d.SECONDS);
    }

    public kp() {
        hp hpVar = hp.f6036a;
        int max = Math.max(2, Math.min(10, Runtime.getRuntime().availableProcessors()));
        long j13 = f7423f;
        ThreadPoolExecutor a13 = hpVar.a(max, j13, "BG");
        this.f7425a = a13;
        jp a14 = a(a13);
        this.f7426b = a14;
        this.f7427c = a14;
        ThreadPoolExecutor a15 = hpVar.a(Math.max(2, Math.min(5, Runtime.getRuntime().availableProcessors())), j13, "Load");
        this.f7428d = a15;
        this.f7429e = a(a15);
    }

    public static jp a(ThreadPoolExecutor threadPoolExecutor) {
        return new jp(threadPoolExecutor);
    }
}
