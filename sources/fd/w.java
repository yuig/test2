package fd;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j0;

/* loaded from: classes3.dex */
public final class w extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f61821r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ j0 f61822s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(j0 j0Var, bl2.c cVar) {
        super(2, cVar);
        this.f61822s = j0Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new w(this.f61822s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((w) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f61821r;
        if (i13 == 0) {
            ue.c.H(obj);
            Object obj2 = this.f61822s.f80434a;
            Intrinsics.f(obj2);
            this.f61821r = 1;
            if (d0.c((d0) obj2, this) == aVar) {
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
