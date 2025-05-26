package k1;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class f extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f77857r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ j f77858s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ o1.n f77859t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(j jVar, o1.n nVar, bl2.c cVar) {
        super(2, cVar);
        this.f77858s = jVar;
        this.f77859t = nVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new f(this.f77858s, this.f77859t, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f77857r;
        if (i13 == 0) {
            ue.c.H(obj);
            o1.l lVar = this.f77858s.f77890p;
            if (lVar != null) {
                o1.o oVar = new o1.o(this.f77859t);
                this.f77857r = 1;
                if (lVar.a(oVar, this) == aVar) {
                    return aVar;
                }
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
