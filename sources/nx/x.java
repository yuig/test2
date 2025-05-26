package nx;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class x extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f92476r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ z f92477s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(z zVar, bl2.c cVar) {
        super(2, cVar);
        this.f92477s = zVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        x xVar = new x(this.f92477s, cVar);
        xVar.f92476r = obj;
        return xVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((x) create((xu1.i) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        xu1.i iVar = (xu1.i) this.f92476r;
        xu1.i iVar2 = xu1.i.WIFI;
        z zVar = this.f92477s;
        if (iVar == iVar2) {
            zVar.f92488d = iVar2;
            zVar.f92487c.g(h32.f1.NETWORK_ONLINE, null, bs1.c.o(new Pair("network_type", iVar2.name())), false);
        } else {
            xu1.i iVar3 = xu1.i.MOBILE;
            if (iVar == iVar3) {
                zVar.f92488d = iVar3;
                zVar.f92487c.g(h32.f1.NETWORK_ONLINE, null, bs1.c.o(new Pair("network_type", iVar3.name())), false);
            } else if (!iVar.isOnAnyNetwork()) {
                zVar.f92487c.g(h32.f1.NETWORK_OFFLINE, null, bs1.c.o(new Pair("network_type", zVar.f92488d.name())), false);
            }
        }
        return Unit.f80348a;
    }
}
