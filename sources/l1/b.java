package l1;

import i2.u;
import k1.k1;
import kh2.a1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import s80.z6;
import w80.h1;
import w80.z;

/* loaded from: classes2.dex */
public final class b extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f81305i = 1;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f81306j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ u2.q f81307k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f81308l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f81309m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f81310n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f81311o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f81312p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ xk2.g f81313q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(String str, boolean z13, c cVar, u2.q qVar, kl2.l lVar, Function0 function0, int i13, int i14) {
        super(2);
        this.f81311o = str;
        this.f81306j = z13;
        this.f81312p = cVar;
        this.f81307k = qVar;
        this.f81313q = lVar;
        this.f81308l = function0;
        this.f81309m = i13;
        this.f81310n = i14;
    }

    public final void b(i2.o oVar, int i13) {
        int i14 = this.f81305i;
        int i15 = this.f81309m;
        xk2.g gVar = this.f81313q;
        Object obj = this.f81312p;
        Object obj2 = this.f81311o;
        Object obj3 = this.f81308l;
        switch (i14) {
            case 0:
                int p13 = u.p(i15 | 1);
                boolean z13 = this.f81306j;
                int i16 = this.f81310n;
                a1.b((o) obj2, (Function0) obj3, (Function1) obj, this.f81307k, z13, (Function2) gVar, oVar, p13, i16);
                break;
            case 1:
                int p14 = u.p(i15 | 1);
                u2.q qVar = this.f81307k;
                int i17 = this.f81310n;
                t.b((String) obj2, this.f81306j, (c) obj, qVar, (kl2.l) gVar, (Function0) obj3, oVar, p14, i17);
                break;
            case 2:
                int p15 = u.p(i15 | 1);
                int i18 = this.f81310n;
                z.a((w80.f) obj2, this.f81306j, this.f81307k, (w80.c) obj3, (Function1) obj, (Function2) gVar, oVar, p15, i18);
                break;
            case 3:
                int p16 = u.p(i15 | 1);
                gh0.b.e((z6) obj2, (h1) obj, (Function0) obj3, (Function0) gVar, this.f81307k, this.f81306j, oVar, p16, this.f81310n);
                break;
            default:
                int p17 = u.p(i15 | 1);
                boolean z14 = this.f81306j;
                int i19 = this.f81310n;
                el.a.a((Function0) obj3, this.f81307k, z14, (o1.l) obj2, (k1) obj, (Function2) gVar, oVar, p17, i19);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f81305i) {
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
    public b(Function0 function0, u2.q qVar, boolean z13, o1.l lVar, k1 k1Var, Function2 function2, int i13, int i14) {
        super(2);
        this.f81308l = function0;
        this.f81307k = qVar;
        this.f81306j = z13;
        this.f81311o = lVar;
        this.f81312p = k1Var;
        this.f81313q = function2;
        this.f81309m = i13;
        this.f81310n = i14;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(o oVar, Function0 function0, Function1 function1, u2.q qVar, boolean z13, Function2 function2, int i13, int i14) {
        super(2);
        this.f81311o = oVar;
        this.f81308l = function0;
        this.f81312p = function1;
        this.f81307k = qVar;
        this.f81306j = z13;
        this.f81313q = function2;
        this.f81309m = i13;
        this.f81310n = i14;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(z6 z6Var, h1 h1Var, Function0 function0, Function0 function02, u2.q qVar, boolean z13, int i13, int i14) {
        super(2);
        this.f81311o = z6Var;
        this.f81312p = h1Var;
        this.f81308l = function0;
        this.f81313q = function02;
        this.f81307k = qVar;
        this.f81306j = z13;
        this.f81309m = i13;
        this.f81310n = i14;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(w80.f fVar, boolean z13, u2.q qVar, w80.c cVar, Function1 function1, Function2 function2, int i13, int i14) {
        super(2);
        this.f81311o = fVar;
        this.f81306j = z13;
        this.f81307k = qVar;
        this.f81308l = cVar;
        this.f81312p = function1;
        this.f81313q = function2;
        this.f81309m = i13;
        this.f81310n = i14;
    }
}
