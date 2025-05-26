package ads_mobile_sdk;

import do2.i;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class vw0 implements i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f12680a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yw0 f12681b;

    public vw0(i iVar, yw0 yw0Var) {
        this.f12680a = iVar;
        this.f12681b = yw0Var;
    }

    @Override // do2.i
    public final Object collect(do2.j jVar, bl2.c cVar) {
        Object collect = this.f12680a.collect(new uw0(jVar, this.f12681b), cVar);
        return collect == cl2.a.COROUTINE_SUSPENDED ? collect : Unit.f80348a;
    }
}
