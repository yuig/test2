package c2;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class m3 extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f24960i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f24961j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ u2.q f24962k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f24963l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f24964m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f24965n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f24966o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ xk2.g f24967p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Object f24968q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m3(ra0.z zVar, boolean z13, u2.q qVar, Function0 function0, ra0.a0 a0Var, boolean z14, int i13, int i14) {
        super(2);
        this.f24960i = 3;
        this.f24964m = zVar;
        this.f24961j = z13;
        this.f24962k = qVar;
        this.f24967p = function0;
        this.f24968q = a0Var;
        this.f24963l = z14;
        this.f24965n = i13;
        this.f24966o = i14;
    }

    public final void b(i2.o oVar, int i13) {
        int i14 = this.f24960i;
        int i15 = this.f24965n;
        Object obj = this.f24968q;
        xk2.g gVar = this.f24967p;
        Object obj2 = this.f24964m;
        switch (i14) {
            case 0:
                k1 k1Var = (k1) obj;
                int p13 = i2.u.p(i15 | 1);
                boolean z13 = this.f24961j;
                int i16 = this.f24966o;
                n3.a(z13, (Function0) gVar, this.f24962k, this.f24963l, (o1.l) obj2, k1Var, oVar, p13, i16);
                break;
            case 1:
                int p14 = i2.u.p(i15 | 1);
                boolean z14 = this.f24961j;
                int i17 = this.f24966o;
                z4.a(z14, (Function1) gVar, this.f24962k, this.f24963l, (o1.l) obj2, (l1) obj, oVar, p14, i17);
                break;
            case 2:
                int p15 = i2.u.p(i15 | 1);
                w80.z.b((w80.e) obj2, this.f24961j, this.f24962k, (w80.a) obj, this.f24963l, (Function0) gVar, oVar, p15, this.f24966o);
                break;
            default:
                int p16 = i2.u.p(i15 | 1);
                boolean z15 = this.f24961j;
                int i18 = this.f24966o;
                kh2.r.d((ra0.z) obj2, z15, this.f24962k, (Function0) gVar, (ra0.a0) obj, this.f24963l, oVar, p16, i18);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f24960i) {
            case 0:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
            case 1:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
            case 2:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
            default:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
        }
        return Unit.f80348a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m3(w80.e eVar, boolean z13, u2.q qVar, w80.a aVar, boolean z14, Function0 function0, int i13, int i14) {
        super(2);
        this.f24960i = 2;
        this.f24964m = eVar;
        this.f24961j = z13;
        this.f24962k = qVar;
        this.f24968q = aVar;
        this.f24963l = z14;
        this.f24967p = function0;
        this.f24965n = i13;
        this.f24966o = i14;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m3(boolean z13, xk2.g gVar, u2.q qVar, boolean z14, o1.l lVar, Object obj, int i13, int i14, int i15) {
        super(2);
        this.f24960i = i15;
        this.f24961j = z13;
        this.f24967p = gVar;
        this.f24962k = qVar;
        this.f24963l = z14;
        this.f24964m = lVar;
        this.f24968q = obj;
        this.f24965n = i13;
        this.f24966o = i14;
    }
}
