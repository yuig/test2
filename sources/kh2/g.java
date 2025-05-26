package kh2;

import android.os.Looper;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class g extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: j, reason: collision with root package name */
    public static final g f79496j = new g(0);

    /* renamed from: k, reason: collision with root package name */
    public static final g f79497k = new g(1);

    /* renamed from: l, reason: collision with root package name */
    public static final g f79498l = new g(2);

    /* renamed from: m, reason: collision with root package name */
    public static final g f79499m = new g(3);

    /* renamed from: n, reason: collision with root package name */
    public static final g f79500n = new g(4);

    /* renamed from: o, reason: collision with root package name */
    public static final g f79501o = new g(5);

    /* renamed from: p, reason: collision with root package name */
    public static final g f79502p = new g(6);

    /* renamed from: q, reason: collision with root package name */
    public static final g f79503q = new g(7);

    /* renamed from: r, reason: collision with root package name */
    public static final g f79504r = new g(8);

    /* renamed from: s, reason: collision with root package name */
    public static final g f79505s = new g(9);

    /* renamed from: t, reason: collision with root package name */
    public static final g f79506t = new g(10);

    /* renamed from: u, reason: collision with root package name */
    public static final g f79507u = new g(11);

    /* renamed from: v, reason: collision with root package name */
    public static final g f79508v = new g(12);

    /* renamed from: w, reason: collision with root package name */
    public static final g f79509w = new g(13);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f79510i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(int i13) {
        super(0);
        this.f79510i = i13;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f79510i) {
            case 0:
                return Looper.getMainLooper();
            case 1:
                return new vh2.d();
            case 2:
                return new pg2.a();
            case 3:
                return new xh2.b(new xh2.c());
            case 4:
                return new nh2.e();
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
            case 10:
                return new mh2.n();
            case 11:
                return new ei2.u();
            case 12:
                return new ei2.x();
            default:
                return new nf2.b();
        }
    }
}
