package ads_mobile_sdk;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes2.dex */
public final class pq extends dl2.j implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public a.ad f9772a;

    /* renamed from: b, reason: collision with root package name */
    public mo2.a f9773b;

    /* renamed from: c, reason: collision with root package name */
    public zr f9774c;

    /* renamed from: d, reason: collision with root package name */
    public int f9775d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zr f9776e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pq(zr zrVar, bl2.c cVar) {
        super(1, cVar);
        this.f9776e = zrVar;
    }

    @Override // dl2.a
    public final bl2.c create(bl2.c cVar) {
        return new pq(this.f9776e, cVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new pq(this.f9776e, (bl2.c) obj).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        zr zrVar;
        mo2.a aVar;
        a.ad adVar;
        cl2.a aVar2 = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f9775d;
        if (i13 == 0) {
            ue.c.H(obj);
            se seVar = this.f9776e.f14881l;
            this.f9775d = 1;
            seVar.getClass();
            obj = se.a(seVar, this);
            if (obj == aVar2) {
                return aVar2;
            }
        } else {
            if (i13 != 1) {
                if (i13 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zrVar = this.f9774c;
                aVar = this.f9773b;
                adVar = this.f9772a;
                ue.c.H(obj);
                try {
                    zrVar.K = (ll) ((pk0) adVar).f9719b;
                    Unit unit = Unit.f80348a;
                    ((mo2.c) aVar).i(null);
                    return adVar;
                } catch (Throwable th3) {
                    ((mo2.c) aVar).i(null);
                    throw th3;
                }
            }
            ue.c.H(obj);
        }
        a.ad adVar2 = (a.ad) obj;
        if (!(adVar2 instanceof pk0)) {
            return adVar2;
        }
        zr zrVar2 = this.f9776e;
        mo2.a aVar3 = zrVar2.f14872J;
        this.f9772a = adVar2;
        this.f9773b = aVar3;
        this.f9774c = zrVar2;
        this.f9775d = 2;
        mo2.c cVar = (mo2.c) aVar3;
        if (cVar.f(null, this) == aVar2) {
            return aVar2;
        }
        zrVar = zrVar2;
        aVar = cVar;
        adVar = adVar2;
        zrVar.K = (ll) ((pk0) adVar).f9719b;
        Unit unit2 = Unit.f80348a;
        ((mo2.c) aVar).i(null);
        return adVar;
    }
}
