package w80;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class c0 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f128267r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ do2.i f128268s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Function0 f128269t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ i2.q1 f128270u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ i2.q1 f128271v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(do2.i iVar, Function0 function0, i2.q1 q1Var, i2.q1 q1Var2, bl2.c cVar) {
        super(2, cVar);
        this.f128268s = iVar;
        this.f128269t = function0;
        this.f128270u = q1Var;
        this.f128271v = q1Var2;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new c0(this.f128268s, this.f128269t, this.f128270u, this.f128271v, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c0) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f128267r;
        if (i13 == 0) {
            ue.c.H(obj);
            fd.q qVar = new fd.q(this.f128269t, this.f128270u, this.f128271v, 2);
            this.f128267r = 1;
            if (this.f128268s.collect(qVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
        }
        return Unit.f80348a;
    }
}
