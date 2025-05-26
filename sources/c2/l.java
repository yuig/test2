package c2;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class l extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f24905r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f24906s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ kl2.l f24907t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ w f24908u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(w wVar, bl2.c cVar, kl2.l lVar) {
        super(2, cVar);
        this.f24907t = lVar;
        this.f24908u = wVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        l lVar = new l(this.f24908u, cVar, this.f24907t);
        lVar.f24906s = obj;
        return lVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((l) create((a3) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f24905r;
        if (i13 == 0) {
            ue.c.H(obj);
            a3 a3Var = (a3) this.f24906s;
            q qVar = this.f24908u.f25338n;
            this.f24905r = 1;
            if (this.f24907t.invoke(qVar, a3Var, this) == aVar) {
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
