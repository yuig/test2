package jb1;

import ao2.j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import lb.l0;

/* loaded from: classes5.dex */
public final class g extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f75336r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ i f75337s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(i iVar, bl2.c cVar) {
        super(2, cVar);
        this.f75337s = iVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new g(this.f75337s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f75336r;
        if (i13 == 0) {
            ue.c.H(obj);
            int i14 = i.f75340j0;
            i iVar = this.f75337s;
            do2.i d2 = ((o) iVar.f75343e0.getValue()).f75351c.d();
            f fVar = new f(iVar, null);
            this.f75336r = 1;
            if (l0.I(d2, fVar, this) == aVar) {
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
