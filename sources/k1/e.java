package k1;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class e extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f77852r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ j f77853s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ o1.n f77854t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(j jVar, o1.n nVar, bl2.c cVar) {
        super(2, cVar);
        this.f77853s = jVar;
        this.f77854t = nVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new e(this.f77853s, this.f77854t, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f77852r;
        if (i13 == 0) {
            ue.c.H(obj);
            o1.l lVar = this.f77853s.f77890p;
            if (lVar != null) {
                this.f77852r = 1;
                if (lVar.a(this.f77854t, this) == aVar) {
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
