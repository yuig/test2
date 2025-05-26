package b2;

import kh2.u2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import w1.y1;

/* loaded from: classes2.dex */
public final class x extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f21256r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f21257s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ k f21258t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ y1 f21259u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(k kVar, y1 y1Var, bl2.c cVar) {
        super(2, cVar);
        this.f21258t = kVar;
        this.f21259u = y1Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        x xVar = new x(this.f21258t, this.f21259u, cVar);
        xVar.f21257s = obj;
        return xVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((x) create((n3.w) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f21256r;
        if (i13 == 0) {
            ue.c.H(obj);
            n3.w wVar = (n3.w) this.f21257s;
            n3.o0 o0Var = (n3.o0) wVar;
            o0Var.getClass();
            w wVar2 = new w(this.f21258t, new bn0.a(com.bumptech.glide.c.U0(o0Var).f110832t), this.f21259u, null);
            this.f21256r = 1;
            if (u2.w(wVar, wVar2, this) == aVar) {
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
