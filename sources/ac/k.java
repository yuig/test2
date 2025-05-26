package ac;

import com.airbnb.lottie.g0;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class k extends kotlin.jvm.internal.s implements Function2 {
    public final /* synthetic */ int A;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f1835i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ com.airbnb.lottie.h f1836j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Function0 f1837k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ u2.q f1838l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f1839m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f1840n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f1841o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ g0 f1842p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ boolean f1843q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ u2.e f1844r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ q3.n f1845s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ boolean f1846t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ boolean f1847u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Map f1848v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.airbnb.lottie.a f1849w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ boolean f1850x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ int f1851y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ int f1852z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(com.airbnb.lottie.h hVar, Function0 function0, u2.q qVar, boolean z13, boolean z14, boolean z15, g0 g0Var, boolean z16, u2.e eVar, q3.n nVar, boolean z17, boolean z18, Map map, com.airbnb.lottie.a aVar, boolean z19, int i13, int i14, int i15, int i16) {
        super(2);
        this.f1835i = i16;
        this.f1836j = hVar;
        this.f1837k = function0;
        this.f1838l = qVar;
        this.f1839m = z13;
        this.f1840n = z14;
        this.f1841o = z15;
        this.f1842p = g0Var;
        this.f1843q = z16;
        this.f1844r = eVar;
        this.f1845s = nVar;
        this.f1846t = z17;
        this.f1847u = z18;
        this.f1848v = map;
        this.f1849w = aVar;
        this.f1850x = z19;
        this.f1851y = i13;
        this.f1852z = i14;
        this.A = i15;
    }

    public final void b(i2.o oVar, int i13) {
        int i14 = this.f1835i;
        int i15 = this.f1852z;
        int i16 = this.f1851y;
        switch (i14) {
            case 0:
                int p13 = i2.u.p(i16 | 1);
                int p14 = i2.u.p(i15);
                ph.a.a(this.f1836j, this.f1837k, this.f1838l, this.f1839m, this.f1840n, this.f1841o, this.f1842p, this.f1843q, this.f1844r, this.f1845s, this.f1846t, this.f1847u, this.f1848v, this.f1849w, this.f1850x, oVar, p13, p14, this.A);
                break;
            default:
                int p15 = i2.u.p(i16 | 1);
                int p16 = i2.u.p(i15);
                ph.a.a(this.f1836j, this.f1837k, this.f1838l, this.f1839m, this.f1840n, this.f1841o, this.f1842p, this.f1843q, this.f1844r, this.f1845s, this.f1846t, this.f1847u, this.f1848v, this.f1849w, this.f1850x, oVar, p15, p16, this.A);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f1835i) {
            case 0:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
            default:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
        }
        return Unit.f80348a;
    }
}
