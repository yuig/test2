package n72;

import ao2.j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class d extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f89711r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ g f89712s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(g gVar, bl2.c cVar) {
        super(2, cVar);
        this.f89712s = gVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new d(this.f89712s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f89711r;
        if (i13 == 0) {
            ue.c.H(obj);
            this.f89711r = 1;
            if (g.a(this.f89712s, this) == aVar) {
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
