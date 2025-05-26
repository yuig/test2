package i1;

import do2.b2;
import j1.g2;
import java.util.List;
import kh2.k3;
import kh2.u2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class n extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f70844i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ u2.q f70845j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f70846k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f70847l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f70848m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f70849n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f70850o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f70851p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Object f70852q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(Object obj, u2.q qVar, Function1 function1, Object obj2, Function1 function12, xk2.g gVar, int i13, int i14, int i15) {
        super(2);
        this.f70844i = i15;
        this.f70850o = obj;
        this.f70845j = qVar;
        this.f70846k = function1;
        this.f70851p = obj2;
        this.f70847l = function12;
        this.f70852q = gVar;
        this.f70848m = i13;
        this.f70849n = i14;
    }

    public final void b(i2.o oVar, int i13) {
        int i14 = this.f70844i;
        int i15 = this.f70848m;
        Object obj = this.f70852q;
        Object obj2 = this.f70847l;
        Object obj3 = this.f70846k;
        Object obj4 = this.f70851p;
        Object obj5 = this.f70850o;
        switch (i14) {
            case 0:
                int p13 = i2.u.p(i15 | 1);
                int i16 = this.f70849n;
                kh2.r.a((g2) obj5, this.f70845j, (Function1) obj3, (u2.e) obj4, (Function1) obj2, (kl2.m) obj, oVar, p13, i16);
                break;
            case 1:
                int p14 = i2.u.p(i15 | 1);
                u2.f((s80.j) obj5, (b2) obj4, this.f70845j, (Function1) obj3, (Function1) obj2, (Function1) obj, oVar, p14, this.f70849n);
                break;
            case 2:
                ca0.n0.e((u2.c) obj5, (List) obj3, (r72.q1) obj2, (com.pinterest.shuffles.scene.composer.z0) obj4, (n72.m) obj, this.f70845j, oVar, i2.u.p(i15 | 1), this.f70849n);
                break;
            case 3:
                int p15 = i2.u.p(i15 | 1);
                int i17 = this.f70849n;
                kh2.r.c((ra0.u) obj5, this.f70845j, (Function0) obj2, (Function0) obj4, (Function1) obj3, (ra0.v) obj, oVar, p15, i17);
                break;
            case 4:
                int p16 = i2.u.p(i15 | 1);
                int i18 = this.f70849n;
                k3.j((va0.j) obj5, this.f70845j, (Function1) obj3, (Function0) obj4, (Function1) obj2, (Function1) obj, oVar, p16, i18);
                break;
            default:
                int p17 = i2.u.p(i15 | 1);
                int i19 = this.f70849n;
                gh0.b.g((List) obj5, this.f70845j, (u2.q) obj4, (Function1) obj3, (Function1) obj2, (Function1) obj, oVar, p17, i19);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f70844i) {
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
            default:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
        }
        return Unit.f80348a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(List list, u2.q qVar, u2.q qVar2, Function1 function1, Function1 function12, Function1 function13, int i13, int i14) {
        super(2);
        this.f70844i = 5;
        this.f70850o = list;
        this.f70845j = qVar;
        this.f70851p = qVar2;
        this.f70846k = function1;
        this.f70847l = function12;
        this.f70852q = function13;
        this.f70848m = i13;
        this.f70849n = i14;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(ra0.u uVar, u2.q qVar, Function0 function0, Function0 function02, Function1 function1, ra0.v vVar, int i13, int i14) {
        super(2);
        this.f70844i = 3;
        this.f70850o = uVar;
        this.f70845j = qVar;
        this.f70847l = function0;
        this.f70851p = function02;
        this.f70846k = function1;
        this.f70852q = vVar;
        this.f70848m = i13;
        this.f70849n = i14;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(s80.j jVar, b2 b2Var, u2.q qVar, Function1 function1, Function1 function12, Function1 function13, int i13, int i14) {
        super(2);
        this.f70844i = 1;
        this.f70850o = jVar;
        this.f70851p = b2Var;
        this.f70845j = qVar;
        this.f70846k = function1;
        this.f70847l = function12;
        this.f70852q = function13;
        this.f70848m = i13;
        this.f70849n = i14;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(u2.c cVar, List list, r72.q1 q1Var, com.pinterest.shuffles.scene.composer.z0 z0Var, n72.m mVar, u2.q qVar, int i13, int i14) {
        super(2);
        this.f70844i = 2;
        this.f70850o = cVar;
        this.f70846k = list;
        this.f70847l = q1Var;
        this.f70851p = z0Var;
        this.f70852q = mVar;
        this.f70845j = qVar;
        this.f70848m = i13;
        this.f70849n = i14;
    }
}
