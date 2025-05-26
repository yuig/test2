package ads_mobile_sdk;

import android.net.Network;
import android.net.NetworkCapabilities;
import ao2.j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class ln1 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f7896a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ un1 f7897b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f7898c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Network f7899d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ NetworkCapabilities f7900e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ln1(un1 un1Var, long j13, Network network, NetworkCapabilities networkCapabilities, bl2.c cVar) {
        super(2, cVar);
        this.f7897b = un1Var;
        this.f7898c = j13;
        this.f7899d = network;
        this.f7900e = networkCapabilities;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new ln1(this.f7897b, this.f7898c, this.f7899d, this.f7900e, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ln1) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f7896a;
        if (i13 == 0) {
            ue.c.H(obj);
            un1 un1Var = this.f7897b;
            long j13 = this.f7898c;
            Network network = this.f7899d;
            NetworkCapabilities networkCapabilities = this.f7900e;
            this.f7896a = 1;
            if (un1Var.a(j13, network, networkCapabilities, false, this) == aVar) {
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
