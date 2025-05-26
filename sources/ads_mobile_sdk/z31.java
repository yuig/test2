package ads_mobile_sdk;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class z31 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f14599a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f14600b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z31(Function1 function1, bl2.c cVar) {
        super(2, cVar);
        this.f14600b = function1;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new z31(this.f14600b, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new z31(this.f14600b, (bl2.c) obj2).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f14599a;
        if (i13 == 0) {
            ue.c.H(obj);
            Function1 function1 = this.f14600b;
            this.f14599a = 1;
            if (function1.invoke(this) == aVar) {
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
