package ads_mobile_sdk;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes2.dex */
public final class l32 extends dl2.j implements kl2.l {

    /* renamed from: a, reason: collision with root package name */
    public int f7656a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CoroutineContext f7657b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a.j8 f7658c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l32(CoroutineContext coroutineContext, a.j8 j8Var, bl2.c cVar) {
        super(3, cVar);
        this.f7657b = coroutineContext;
        this.f7658c = j8Var;
    }

    @Override // kl2.l
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        return new l32(this.f7657b, this.f7658c, (bl2.c) obj3).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f7656a;
        if (i13 == 0) {
            ue.c.H(obj);
            CoroutineContext coroutineContext = this.f7657b;
            k32 k32Var = new k32(this.f7658c, null);
            this.f7656a = 1;
            if (kotlin.jvm.internal.j.M(this, coroutineContext, k32Var) == aVar) {
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
