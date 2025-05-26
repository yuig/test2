package ads_mobile_sdk;

import do2.i;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class je1 implements i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f6767a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ me1 f6768b;

    public je1(i iVar, me1 me1Var) {
        this.f6767a = iVar;
        this.f6768b = me1Var;
    }

    @Override // do2.i
    public final Object collect(do2.j jVar, bl2.c cVar) {
        Object collect = this.f6767a.collect(new ie1(jVar, this.f6768b), cVar);
        return collect == cl2.a.COROUTINE_SUSPENDED ? collect : Unit.f80348a;
    }
}
