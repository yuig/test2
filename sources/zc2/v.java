package zc2;

import ao2.j0;
import do2.z1;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import lb.l0;

/* loaded from: classes4.dex */
public final class v extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f141649r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ w f141650s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(w wVar, bl2.c cVar) {
        super(2, cVar);
        this.f141650s = wVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new v(this.f141650s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((v) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f141649r;
        if (i13 == 0) {
            ue.c.H(obj);
            w wVar = this.f141650s;
            z1 z1Var = wVar.f141654f.f52838b;
            u uVar = new u(wVar, null);
            this.f141649r = 1;
            if (l0.I(z1Var, uVar, this) == aVar) {
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
