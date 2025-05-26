package w82;

import ao2.j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import lb.l0;

/* loaded from: classes4.dex */
public final class f extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f128469r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ i f128470s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(i iVar, bl2.c cVar) {
        super(2, cVar);
        this.f128470s = iVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new f(this.f128470s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f128469r;
        if (i13 == 0) {
            ue.c.H(obj);
            int i14 = i.f128474l0;
            i iVar = this.f128470s;
            do2.i d2 = iVar.a8().f54181d.d();
            e eVar = new e(iVar, null);
            this.f128469r = 1;
            if (l0.I(d2, eVar, this) == aVar) {
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
