package i1;

import j1.g2;
import kh2.k3;
import kh2.u2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class s0 extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f70890i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ u2.q f70891j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f70892k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f70893l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f70894m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f70895n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f70896o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f70897p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(ca0.d dVar, com.pinterest.shuffles.scene.composer.z0 z0Var, n72.m mVar, u50.r rVar, u2.q qVar, int i13, int i14) {
        super(2);
        this.f70890i = 9;
        this.f70896o = dVar;
        this.f70892k = z0Var;
        this.f70897p = mVar;
        this.f70893l = rVar;
        this.f70891j = qVar;
        this.f70894m = i13;
        this.f70895n = i14;
    }

    public final void b(i2.o oVar, int i13) {
        int i14 = this.f70890i;
        Object obj = this.f70896o;
        int i15 = this.f70894m;
        Object obj2 = this.f70893l;
        Object obj3 = this.f70892k;
        Object obj4 = this.f70897p;
        switch (i14) {
            case 0:
                int p13 = i2.u.p(i15 | 1);
                u2.q qVar = this.f70891j;
                int i16 = this.f70895n;
                kh2.w.b(this.f70896o, qVar, (j1.h0) obj3, (String) obj4, (kl2.l) obj2, oVar, p13, i16);
                break;
            case 1:
                int p14 = i2.u.p(i15 | 1);
                int i17 = this.f70895n;
                kh2.w.a((g2) obj, this.f70891j, (j1.h0) obj3, (Function1) obj4, (kl2.l) obj2, oVar, p14, i17);
                break;
            case 2:
                int p15 = i2.u.p(i15 | 1);
                int i18 = this.f70895n;
                l1.t.d((q4.y) obj, (Function0) obj3, this.f70891j, (l1.c) obj4, (Function1) obj2, oVar, p15, i18);
                break;
            case 3:
                int p16 = i2.u.p(i15 | 1);
                int i19 = this.f70895n;
                androidx.compose.ui.viewinterop.a.b((Function1) obj, this.f70891j, (Function1) obj3, (Function1) obj4, (Function1) obj2, oVar, p16, i19);
                break;
            case 4:
                int p17 = i2.u.p(i15 | 1);
                int i23 = this.f70895n;
                u2.j((s80.j) obj, this.f70891j, (w80.c) obj3, (Function1) obj4, (Function1) obj2, oVar, p17, i23);
                break;
            case 5:
                int p18 = i2.u.p(i15 | 1);
                w80.z.d((w80.f) obj, this.f70891j, (w80.c) obj3, (Function1) obj4, (Function2) obj2, oVar, p18, this.f70895n);
                break;
            case 6:
                int p19 = i2.u.p(i15 | 1);
                w80.a1.a((w80.h) obj, this.f70891j, (om1.f) obj3, (Function1) obj4, (Function2) obj2, oVar, p19, this.f70895n);
                break;
            case 7:
                int p23 = i2.u.p(i15 | 1);
                int i24 = this.f70895n;
                u2.d((p90.a) obj, this.f70891j, (Function0) obj3, (Function0) obj4, (Function0) obj2, oVar, p23, i24);
                break;
            case 8:
                int p24 = i2.u.p(i15 | 1);
                int i25 = this.f70895n;
                t90.f.a((t90.o) obj, this.f70891j, (Function0) obj3, (Function0) obj4, (Function0) obj2, oVar, p24, i25);
                break;
            case 9:
                ca0.n0.a((ca0.d) obj, (com.pinterest.shuffles.scene.composer.z0) obj3, (n72.m) obj4, (u50.r) obj2, this.f70891j, oVar, i2.u.p(i15 | 1), this.f70895n);
                break;
            case 10:
                int p25 = i2.u.p(i15 | 1);
                int i26 = this.f70895n;
                ca0.n0.b((ca0.z0) obj, this.f70891j, (String) obj4, (Function1) obj3, (Function1) obj2, oVar, p25, i26);
                break;
            default:
                int p26 = i2.u.p(i15 | 1);
                k3.b((String) obj4, this.f70891j, (u50.i0) obj, (u50.i0) obj3, (Function2) obj2, oVar, p26, this.f70895n);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f70890i) {
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
            case 4:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
            case 5:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
            case 6:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
            case 7:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
            case 8:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
            case 9:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
            case 10:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
            default:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
        }
        return Unit.f80348a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(ca0.z0 z0Var, u2.q qVar, String str, Function1 function1, Function1 function12, int i13, int i14) {
        super(2);
        this.f70890i = 10;
        this.f70896o = z0Var;
        this.f70891j = qVar;
        this.f70897p = str;
        this.f70892k = function1;
        this.f70893l = function12;
        this.f70894m = i13;
        this.f70895n = i14;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s0(Object obj, u2.q qVar, Object obj2, Object obj3, xk2.g gVar, int i13, int i14, int i15) {
        super(2);
        this.f70890i = i15;
        this.f70896o = obj;
        this.f70891j = qVar;
        this.f70892k = obj2;
        this.f70897p = obj3;
        this.f70893l = gVar;
        this.f70894m = i13;
        this.f70895n = i14;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(String str, u2.q qVar, u50.i0 i0Var, u50.i0 i0Var2, Function2 function2, int i13, int i14) {
        super(2);
        this.f70890i = 11;
        this.f70897p = str;
        this.f70891j = qVar;
        this.f70896o = i0Var;
        this.f70892k = i0Var2;
        this.f70893l = function2;
        this.f70894m = i13;
        this.f70895n = i14;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(q4.y yVar, Function0 function0, u2.q qVar, l1.c cVar, Function1 function1, int i13, int i14) {
        super(2);
        this.f70890i = 2;
        this.f70896o = yVar;
        this.f70892k = function0;
        this.f70891j = qVar;
        this.f70897p = cVar;
        this.f70893l = function1;
        this.f70894m = i13;
        this.f70895n = i14;
    }
}
