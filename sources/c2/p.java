package c2;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes2.dex */
public final class p extends dl2.j implements Function1 {

    /* renamed from: r, reason: collision with root package name */
    public int f25052r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ w f25053s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f25054t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ kl2.m f25055u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(w wVar, Object obj, kl2.m mVar, bl2.c cVar) {
        super(1, cVar);
        this.f25053s = wVar;
        this.f25054t = obj;
        this.f25055u = mVar;
    }

    @Override // dl2.a
    public final bl2.c create(bl2.c cVar) {
        return new p(this.f25053s, this.f25054t, this.f25055u, cVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((p) create((bl2.c) obj)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f25052r;
        if (i13 == 0) {
            ue.c.H(obj);
            Object obj2 = this.f25054t;
            w wVar = this.f25053s;
            wVar.h(obj2);
            u uVar = new u(wVar, 2);
            o oVar = new o(this.f25055u, wVar, null);
            this.f25052r = 1;
            if (j1.k(uVar, oVar, this) == aVar) {
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
