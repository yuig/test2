package xu1;

import ao2.f0;
import ao2.j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class s extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f135972r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ t f135973s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(t tVar, bl2.c cVar) {
        super(2, cVar);
        this.f135973s = tVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new s(this.f135973s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((s) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f135972r;
        if (i13 == 0) {
            ue.c.H(obj);
            f0 f0Var = this.f135973s.f135975b.f92750a;
            r rVar = new r(2, null);
            this.f135972r = 1;
            if (kotlin.jvm.internal.j.M(this, f0Var, rVar) == aVar) {
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
