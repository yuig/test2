package s80;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class f4 extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f111527i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ u2.q f111528j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ float f111529k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f111530l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f111531m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f111532n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f111533o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f111534p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f4(om0.b bVar, u2.q qVar, om1.f fVar, float f13, Function1 function1, int i13, int i14) {
        super(2);
        this.f111527i = 5;
        this.f111532n = bVar;
        this.f111528j = qVar;
        this.f111534p = fVar;
        this.f111529k = f13;
        this.f111533o = function1;
        this.f111530l = i13;
        this.f111531m = i14;
    }

    public final void b(i2.o oVar, int i13) {
        int i14 = this.f111527i;
        int i15 = this.f111530l;
        Object obj = this.f111534p;
        Object obj2 = this.f111533o;
        Object obj3 = this.f111532n;
        switch (i14) {
            case 0:
                int p13 = i2.u.p(i15 | 1);
                float f13 = this.f111529k;
                int i16 = this.f111531m;
                kh2.u2.m((w80.x1) obj3, this.f111528j, f13, (Function1) obj2, (Function1) obj, oVar, p13, i16);
                break;
            case 1:
                int p14 = i2.u.p(i15 | 1);
                float f14 = this.f111529k;
                int i17 = this.f111531m;
                w80.d0.a((w80.d1) obj3, (do2.i) obj2, this.f111528j, f14, (Function0) obj, oVar, p14, i17);
                break;
            case 2:
                int p15 = i2.u.p(i15 | 1);
                float f15 = this.f111529k;
                int i18 = this.f111531m;
                el.a.g((t90.o) obj3, this.f111528j, (Function1) obj2, f15, (wb0.c) obj, oVar, p15, i18);
                break;
            case 3:
                int p16 = i2.u.p(i15 | 1);
                float f16 = this.f111529k;
                int i19 = this.f111531m;
                ca0.n0.f((u50.i0) obj3, (nc0.e) obj2, this.f111528j, (Function0) obj, f16, oVar, p16, i19);
                break;
            case 4:
                int p17 = i2.u.p(i15 | 1);
                float f17 = this.f111529k;
                int i23 = this.f111531m;
                kh2.g3.h((ga0.i) obj3, this.f111528j, f17, (Function0) obj2, (Function0) obj, oVar, p17, i23);
                break;
            case 5:
                Function1 function1 = (Function1) obj2;
                int p18 = i2.u.p(i15 | 1);
                float f18 = this.f111529k;
                int i24 = this.f111531m;
                om0.f.b((om0.b) obj3, this.f111528j, (om1.f) obj, f18, function1, oVar, p18, i24);
                break;
            case 6:
                int p19 = i2.u.p(i15 | 1);
                float f19 = this.f111529k;
                int i25 = this.f111531m;
                om0.o0.b((om0.i0) obj3, this.f111528j, (om0.j0) obj2, f19, (kl2.l) obj, oVar, p19, i25);
                break;
            default:
                int p23 = i2.u.p(i15 | 1);
                int i26 = this.f111531m;
                kh2.b0.s((om0.t0) obj3, this.f111528j, (om0.f0) obj2, this.f111529k, (om0.a1) obj, oVar, p23, i26);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f111527i) {
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
            default:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
        }
        return Unit.f80348a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f4(u50.o oVar, u2.q qVar, float f13, xk2.g gVar, xk2.g gVar2, int i13, int i14, int i15) {
        super(2);
        this.f111527i = i15;
        this.f111532n = oVar;
        this.f111528j = qVar;
        this.f111529k = f13;
        this.f111533o = gVar;
        this.f111534p = gVar2;
        this.f111530l = i13;
        this.f111531m = i14;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f4(u50.o oVar, u2.q qVar, Object obj, float f13, Object obj2, int i13, int i14, int i15) {
        super(2);
        this.f111527i = i15;
        this.f111532n = oVar;
        this.f111528j = qVar;
        this.f111533o = obj;
        this.f111529k = f13;
        this.f111534p = obj2;
        this.f111530l = i13;
        this.f111531m = i14;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f4(u50.i0 i0Var, nc0.e eVar, u2.q qVar, Function0 function0, float f13, int i13, int i14) {
        super(2);
        this.f111527i = 3;
        this.f111532n = i0Var;
        this.f111533o = eVar;
        this.f111528j = qVar;
        this.f111534p = function0;
        this.f111529k = f13;
        this.f111530l = i13;
        this.f111531m = i14;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f4(w80.d1 d1Var, do2.i iVar, u2.q qVar, float f13, Function0 function0, int i13, int i14) {
        super(2);
        this.f111527i = 1;
        this.f111532n = d1Var;
        this.f111533o = iVar;
        this.f111528j = qVar;
        this.f111529k = f13;
        this.f111534p = function0;
        this.f111530l = i13;
        this.f111531m = i14;
    }
}
