package ny0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class s extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f92620r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ v f92621s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(v vVar, bl2.c cVar) {
        super(2, cVar);
        this.f92621s = vVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new s(this.f92621s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((s) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f92620r;
        if (i13 == 0) {
            ue.c.H(obj);
            int i14 = v.T0;
            v vVar = this.f92621s;
            do2.i d2 = vVar.l9().f92652m.d();
            r rVar = new r(vVar, null);
            this.f92620r = 1;
            if (lb.l0.I(d2, rVar, this) == aVar) {
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
