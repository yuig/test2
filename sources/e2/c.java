package e2;

import ao2.j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class c extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f56835r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ q f56836s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ d f56837t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ o1.n f56838u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(q qVar, d dVar, o1.n nVar, bl2.c cVar) {
        super(2, cVar);
        this.f56836s = qVar;
        this.f56837t = dVar;
        this.f56838u = nVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new c(this.f56836s, this.f56837t, this.f56838u, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f56835r;
        o1.n nVar = this.f56838u;
        d dVar = this.f56837t;
        try {
            if (i13 == 0) {
                ue.c.H(obj);
                q qVar = this.f56836s;
                this.f56835r = 1;
                if (qVar.a(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ue.c.H(obj);
            }
            dVar.f56842x.j(nVar);
            com.bumptech.glide.c.k0(dVar);
            return Unit.f80348a;
        } catch (Throwable th3) {
            dVar.f56842x.j(nVar);
            com.bumptech.glide.c.k0(dVar);
            throw th3;
        }
    }
}
