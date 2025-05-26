package zc2;

import ao2.j0;
import do2.z1;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import lb.l0;

/* loaded from: classes4.dex */
public final class t extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f141645r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ w f141646s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(w wVar, bl2.c cVar) {
        super(2, cVar);
        this.f141646s = wVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new t(this.f141646s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((t) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f141645r;
        if (i13 == 0) {
            ue.c.H(obj);
            w wVar = this.f141646s;
            z1 z1Var = wVar.f141654f.f52840d;
            s sVar = new s(wVar, null);
            this.f141645r = 1;
            if (l0.I(z1Var, sVar, this) == aVar) {
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
