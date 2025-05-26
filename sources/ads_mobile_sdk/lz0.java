package ads_mobile_sdk;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class lz0 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f8031a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ mz0 f8032b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function1 f8033c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lz0(mz0 mz0Var, Function1 function1, bl2.c cVar) {
        super(2, cVar);
        this.f8032b = mz0Var;
        this.f8033c = function1;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new lz0(this.f8032b, this.f8033c, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new lz0(this.f8032b, this.f8033c, (bl2.c) obj2).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f8031a;
        if (i13 == 0) {
            ue.c.H(obj);
            ao2.x xVar = this.f8032b.f8453u;
            this.f8031a = 1;
            if (xVar.join(this) == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                if (i13 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ue.c.H(obj);
                return Unit.f80348a;
            }
            ue.c.H(obj);
        }
        Function1 function1 = this.f8033c;
        this.f8031a = 2;
        if (function1.invoke(this) == aVar) {
            return aVar;
        }
        return Unit.f80348a;
    }
}
