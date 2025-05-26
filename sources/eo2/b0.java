package eo2;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class b0 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f59739r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f59740s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ do2.i f59741t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(do2.i iVar, bl2.c cVar) {
        super(2, cVar);
        this.f59741t = iVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        b0 b0Var = new b0(this.f59741t, cVar);
        b0Var.f59740s = obj;
        return b0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b0) create((co2.z) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f59739r;
        if (i13 == 0) {
            ue.c.H(obj);
            do2.t tVar = new do2.t((co2.z) this.f59740s, 2);
            this.f59739r = 1;
            if (this.f59741t.collect(tVar, this) == aVar) {
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
