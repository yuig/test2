package j72;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import lb.l0;
import r72.u1;

/* loaded from: classes4.dex */
public final class o extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f74897r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ s f74898s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(s sVar, bl2.c cVar) {
        super(2, cVar);
        this.f74898s = sVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        o oVar = new o(this.f74898s, cVar);
        oVar.f74897r = obj;
        return oVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((o) create((u1) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        u1 u1Var = (u1) this.f74897r;
        s sVar = this.f74898s;
        return l0.e1(new pb.k(new m(sVar, u1Var, null)), new n(sVar, u1Var, null));
    }
}
