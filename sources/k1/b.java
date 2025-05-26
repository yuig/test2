package k1;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class b extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f77810r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ o1.l f77811s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ o1.i f77812t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(o1.l lVar, o1.i iVar, bl2.c cVar) {
        super(2, cVar);
        this.f77811s = lVar;
        this.f77812t = iVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new b(this.f77811s, this.f77812t, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f77810r;
        if (i13 == 0) {
            ue.c.H(obj);
            this.f77810r = 1;
            if (this.f77811s.a(this.f77812t, this) == aVar) {
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
