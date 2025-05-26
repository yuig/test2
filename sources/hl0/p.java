package hl0;

import ao2.j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class p extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f69491r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ v f69492s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(v vVar, bl2.c cVar) {
        super(2, cVar);
        this.f69492s = vVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new p(this.f69492s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((p) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f69491r;
        if (i13 == 0) {
            ue.c.H(obj);
            v vVar = this.f69492s;
            do2.c a13 = kotlin.jvm.internal.j.a(vVar.f69524h0.f49129s);
            o oVar = new o(vVar, 0);
            this.f69491r = 1;
            if (a13.collect(oVar, this) == aVar) {
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
