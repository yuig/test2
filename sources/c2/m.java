package c2;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes2.dex */
public final class m extends dl2.j implements Function1 {

    /* renamed from: r, reason: collision with root package name */
    public int f24931r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ w f24932s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ kl2.l f24933t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(w wVar, bl2.c cVar, kl2.l lVar) {
        super(1, cVar);
        this.f24932s = wVar;
        this.f24933t = lVar;
    }

    @Override // dl2.a
    public final bl2.c create(bl2.c cVar) {
        return new m(this.f24932s, cVar, this.f24933t);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((m) create((bl2.c) obj)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f24931r;
        int i14 = 1;
        if (i13 == 0) {
            ue.c.H(obj);
            w wVar = this.f24932s;
            u uVar = new u(wVar, i14);
            l lVar = new l(wVar, null, this.f24933t);
            this.f24931r = 1;
            if (j1.k(uVar, lVar, this) == aVar) {
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
