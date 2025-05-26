package c2;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class o extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f25028r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f25029s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ kl2.m f25030t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ w f25031u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(kl2.m mVar, w wVar, bl2.c cVar) {
        super(2, cVar);
        this.f25030t = mVar;
        this.f25031u = wVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        o oVar = new o(this.f25030t, this.f25031u, cVar);
        oVar.f25029s = obj;
        return oVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((o) create((Pair) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f25028r;
        if (i13 == 0) {
            ue.c.H(obj);
            Pair pair = (Pair) this.f25029s;
            a3 a3Var = (a3) pair.f80346a;
            q qVar = this.f25031u.f25338n;
            this.f25028r = 1;
            if (this.f25030t.c(qVar, a3Var, pair.f80347b, this) == aVar) {
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
