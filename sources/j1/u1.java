package j1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class u1 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.j0 f74249i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f74250j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ j f74251k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ t f74252l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ o f74253m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ float f74254n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Function1 f74255o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(kotlin.jvm.internal.j0 j0Var, Object obj, j jVar, t tVar, o oVar, float f13, Function1 function1) {
        super(1);
        this.f74249i = j0Var;
        this.f74250j = obj;
        this.f74251k = jVar;
        this.f74252l = tVar;
        this.f74253m = oVar;
        this.f74254n = f13;
        this.f74255o = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        long longValue = ((Number) obj).longValue();
        j jVar = this.f74251k;
        p2 e13 = jVar.e();
        Object g13 = jVar.g();
        androidx.activity.a0 a0Var = new androidx.activity.a0(this.f74253m, 1);
        m mVar = new m(this.f74250j, e13, this.f74252l, longValue, g13, longValue, a0Var);
        e.m(mVar, longValue, this.f74254n, this.f74251k, this.f74253m, this.f74255o);
        this.f74249i.f80434a = mVar;
        return Unit.f80348a;
    }
}
