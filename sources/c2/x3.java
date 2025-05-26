package c2;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class x3 extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f25371i = 4;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f25372j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f25373k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f25374l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f25375m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f25376n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f25377o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f25378p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Object f25379q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f25380r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x3(br1.f0 f0Var, boolean z13, br1.f fVar, u2.q qVar, vn1.g gVar, Function0 function0, Function1 function1, int i13, int i14) {
        super(2);
        this.f25376n = f0Var;
        this.f25372j = z13;
        this.f25377o = fVar;
        this.f25378p = qVar;
        this.f25379q = gVar;
        this.f25373k = function0;
        this.f25380r = function1;
        this.f25374l = i13;
        this.f25375m = i14;
    }

    public final void b(i2.o oVar, int i13) {
        int i14 = this.f25371i;
        int i15 = this.f25374l;
        Object obj = this.f25380r;
        Object obj2 = this.f25373k;
        Object obj3 = this.f25379q;
        Object obj4 = this.f25378p;
        Object obj5 = this.f25377o;
        Object obj6 = this.f25376n;
        switch (i14) {
            case 0:
                int p13 = i2.u.p(this.f25375m | 1);
                y3.c(this.f25372j, this.f25374l, (Function2) obj6, (kl2.l) obj2, (Function2) obj5, (Function2) obj4, (p1.m1) obj, (Function2) obj3, oVar, p13);
                break;
            case 1:
                int p14 = i2.u.p(i15 | 1);
                int i16 = this.f25375m;
                f2.c0.b((f2.e0) obj6, (u2.q) obj5, this.f25372j, (f2.k) obj4, (o1.l) obj3, (kl2.l) obj2, (kl2.l) obj, oVar, p14, i16);
                break;
            case 2:
                int p15 = i2.u.p(i15 | 1);
                int i17 = this.f25375m;
                kh2.a1.d((h4.f0) obj6, (u2.q) obj5, (u50.i0) obj4, this.f25372j, (Function1) obj3, (w1.k1) obj2, (w1.j1) obj, oVar, p15, i17);
                break;
            case 3:
                int p16 = i2.u.p(i15 | 1);
                int i18 = this.f25375m;
                kh2.k3.f((u2.q) obj5, (u50.i0) obj4, (u50.i0) obj3, this.f25372j, (vn1.g) obj2, (vn1.c) obj, (Function2) obj6, oVar, p16, i18);
                break;
            default:
                int p17 = i2.u.p(i15 | 1);
                br1.e0.e((br1.f0) obj6, this.f25372j, (br1.f) obj5, (u2.q) obj4, (vn1.g) obj3, (Function0) obj2, (Function1) obj, oVar, p17, this.f25375m);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f25371i) {
            case 0:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
            case 1:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
            case 2:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
            case 3:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
            default:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
        }
        return Unit.f80348a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x3(f2.e0 e0Var, u2.q qVar, boolean z13, f2.k kVar, o1.l lVar, kl2.l lVar2, kl2.l lVar3, int i13, int i14) {
        super(2);
        this.f25376n = e0Var;
        this.f25377o = qVar;
        this.f25372j = z13;
        this.f25378p = kVar;
        this.f25379q = lVar;
        this.f25373k = lVar2;
        this.f25380r = lVar3;
        this.f25374l = i13;
        this.f25375m = i14;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x3(h4.f0 f0Var, u2.q qVar, u50.i0 i0Var, boolean z13, Function1 function1, w1.k1 k1Var, w1.j1 j1Var, int i13, int i14) {
        super(2);
        this.f25376n = f0Var;
        this.f25377o = qVar;
        this.f25378p = i0Var;
        this.f25372j = z13;
        this.f25379q = function1;
        this.f25373k = k1Var;
        this.f25380r = j1Var;
        this.f25374l = i13;
        this.f25375m = i14;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x3(u2.q qVar, u50.i0 i0Var, u50.i0 i0Var2, boolean z13, vn1.g gVar, vn1.c cVar, Function2 function2, int i13, int i14) {
        super(2);
        this.f25377o = qVar;
        this.f25378p = i0Var;
        this.f25379q = i0Var2;
        this.f25372j = z13;
        this.f25373k = gVar;
        this.f25380r = cVar;
        this.f25376n = function2;
        this.f25374l = i13;
        this.f25375m = i14;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x3(boolean z13, int i13, Function2 function2, kl2.l lVar, Function2 function22, Function2 function23, p1.m1 m1Var, Function2 function24, int i14) {
        super(2);
        this.f25372j = z13;
        this.f25374l = i13;
        this.f25376n = function2;
        this.f25373k = lVar;
        this.f25377o = function22;
        this.f25378p = function23;
        this.f25380r = m1Var;
        this.f25379q = function24;
        this.f25375m = i14;
    }
}
