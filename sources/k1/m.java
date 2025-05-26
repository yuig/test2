package k1;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class m extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f77926r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f77927s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ n f77928t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(n nVar, bl2.c cVar) {
        super(2, cVar);
        this.f77928t = nVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        m mVar = new m(this.f77928t, cVar);
        mVar.f77927s = obj;
        return mVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((m) create((n3.w) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f77926r;
        if (i13 == 0) {
            ue.c.H(obj);
            n3.w wVar = (n3.w) this.f77927s;
            l lVar = new l(this.f77928t, null);
            this.f77926r = 1;
            if (kh2.u2.w(wVar, lVar, this) == aVar) {
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
