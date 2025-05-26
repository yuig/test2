package t80;

import ao2.i1;
import ao2.j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class k extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f116699r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ s f116700s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ z f116701t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ u50.r f116702u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(s sVar, z zVar, u50.r rVar, bl2.c cVar) {
        super(2, cVar);
        this.f116700s = sVar;
        this.f116701t = zVar;
        this.f116702u = rVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new k(this.f116700s, this.f116701t, this.f116702u, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f116699r;
        if (i13 == 0) {
            ue.c.H(obj);
            s sVar = this.f116700s;
            i1 i1Var = sVar.f116735e;
            j jVar = new j(sVar, this.f116701t, this.f116702u, null);
            this.f116699r = 1;
            if (kotlin.jvm.internal.j.M(this, i1Var, jVar) == aVar) {
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
