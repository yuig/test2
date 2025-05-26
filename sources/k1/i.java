package k1;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class i extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f77876r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f77877s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ j f77878t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, bl2.c cVar) {
        super(2, cVar);
        this.f77878t = jVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        i iVar = new i(this.f77878t, cVar);
        iVar.f77877s = obj;
        return iVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((n3.w) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f77876r;
        if (i13 == 0) {
            ue.c.H(obj);
            n3.w wVar = (n3.w) this.f77877s;
            this.f77876r = 1;
            if (this.f77878t.Q0(wVar, this) == aVar) {
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
