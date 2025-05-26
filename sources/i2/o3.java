package i2;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class o3 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f71229r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ do2.i f71230s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ b2 f71231t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o3(do2.i iVar, b2 b2Var, bl2.c cVar) {
        super(2, cVar);
        this.f71230s = iVar;
        this.f71231t = b2Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new o3(this.f71230s, this.f71231t, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((o3) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f71229r;
        int i14 = 1;
        if (i13 == 0) {
            ue.c.H(obj);
            n3 n3Var = new n3(this.f71231t, i14);
            this.f71229r = 1;
            if (this.f71230s.collect(n3Var, this) == aVar) {
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
