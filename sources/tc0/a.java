package tc0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class a extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f117209r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ do2.j f117210s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ m0 f117211t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(do2.j jVar, m0 m0Var, bl2.c cVar) {
        super(2, cVar);
        this.f117210s = jVar;
        this.f117211t = m0Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new a(this.f117210s, this.f117211t, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f117209r;
        if (i13 == 0) {
            ue.c.H(obj);
            qc0.g gVar = this.f117211t.f117287a;
            this.f117209r = 1;
            if (this.f117210s.emit(gVar, this) == aVar) {
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
