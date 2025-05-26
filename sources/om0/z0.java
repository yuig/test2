package om0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class z0 extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ v0 f96622i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ u2.q f96623j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ f0 f96624k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f96625l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f96626m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ float f96627n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Function1 f96628o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f96629p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f96630q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(v0 v0Var, u2.q qVar, f0 f0Var, int i13, float f13, float f14, Function1 function1, int i14, int i15) {
        super(2);
        this.f96622i = v0Var;
        this.f96623j = qVar;
        this.f96624k = f0Var;
        this.f96625l = i13;
        this.f96626m = f13;
        this.f96627n = f14;
        this.f96628o = function1;
        this.f96629p = i14;
        this.f96630q = i15;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int p13 = i2.u.p(this.f96629p | 1);
        Function1 function1 = this.f96628o;
        kh2.b0.t(this.f96622i, this.f96623j, this.f96624k, this.f96625l, this.f96626m, this.f96627n, function1, (i2.o) obj, p13, this.f96630q);
        return Unit.f80348a;
    }
}
