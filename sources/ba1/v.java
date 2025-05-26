package ba1;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class v extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f22403r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ y f22404s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(y yVar, bl2.c cVar) {
        super(2, cVar);
        this.f22404s = yVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new v(this.f22404s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((v) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f22403r;
        if (i13 == 0) {
            ue.c.H(obj);
            int i14 = y.M0;
            y yVar = this.f22404s;
            do2.i d2 = yVar.b9().f22393f.d();
            u uVar = new u(yVar, null);
            this.f22403r = 1;
            if (lb.l0.I(d2, uVar, this) == aVar) {
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
