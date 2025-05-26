package ads_mobile_sdk;

import android.net.Network;
import ao2.j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class jn1 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f6890a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ un1 f6891b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f6892c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Network f6893d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jn1(un1 un1Var, long j13, Network network, bl2.c cVar) {
        super(2, cVar);
        this.f6891b = un1Var;
        this.f6892c = j13;
        this.f6893d = network;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new jn1(this.f6891b, this.f6892c, this.f6893d, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((jn1) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f6890a;
        if (i13 == 0) {
            ue.c.H(obj);
            un1 un1Var = this.f6891b;
            long j13 = this.f6892c;
            Network network = this.f6893d;
            this.f6890a = 1;
            if (un1Var.a(j13, network, null, false, this) == aVar) {
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
