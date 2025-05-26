package ba0;

import ao2.j0;
import dl2.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import lb.l0;
import m62.p0;

/* loaded from: classes5.dex */
public final class a extends j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f22327r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ e f22328s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(e eVar, bl2.c cVar) {
        super(2, cVar);
        this.f22328s = eVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new a(this.f22328s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f22327r;
        if (i13 == 0) {
            ue.c.H(obj);
            this.f22327r = 1;
            if (l0.S(300L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
        }
        this.f22328s.f22337a.j(p0.f86040a);
        return Unit.f80348a;
    }
}
