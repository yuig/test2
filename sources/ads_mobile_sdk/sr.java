package ads_mobile_sdk;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class sr extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f11200a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zr f11201b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sr(zr zrVar, bl2.c cVar) {
        super(2, cVar);
        this.f11201b = zrVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new sr(this.f11201b, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new sr(this.f11201b, (bl2.c) obj2).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f11200a;
        if (i13 == 0) {
            ue.c.H(obj);
            zr zrVar = this.f11201b;
            this.f11200a = 1;
            obj = zrVar.m(this);
            if (obj == aVar) {
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
