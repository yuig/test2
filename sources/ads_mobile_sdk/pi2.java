package ads_mobile_sdk;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class pi2 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f9706a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ vi2 f9707b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ dj.d f9708c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pi2(vi2 vi2Var, dj.d dVar, bl2.c cVar) {
        super(2, cVar);
        this.f9707b = vi2Var;
        this.f9708c = dVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new pi2(this.f9707b, this.f9708c, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new pi2(this.f9707b, this.f9708c, (bl2.c) obj2).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f9706a;
        if (i13 == 0) {
            ue.c.H(obj);
            vi2 vi2Var = this.f9707b;
            this.f9706a = 1;
            vi2Var.getClass();
            obj = vi2.a(vi2Var, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                if (i13 != 2 && i13 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ue.c.H(obj);
                return Unit.f80348a;
            }
            ue.c.H(obj);
        }
        a.ad adVar = (a.ad) obj;
        if (adVar instanceof pk0) {
            CoroutineContext coroutineContext = this.f9707b.f12523b;
            mi2 mi2Var = new mi2(adVar, this.f9708c, null);
            this.f9706a = 2;
            if (kotlin.jvm.internal.j.M(this, coroutineContext, mi2Var) == aVar) {
                return aVar;
            }
        } else if (adVar instanceof jk0) {
            CoroutineContext coroutineContext2 = this.f9707b.f12523b;
            oi2 oi2Var = new oi2(adVar, this.f9708c, null);
            this.f9706a = 3;
            if (kotlin.jvm.internal.j.M(this, coroutineContext2, oi2Var) == aVar) {
                return aVar;
            }
        }
        return Unit.f80348a;
    }
}
