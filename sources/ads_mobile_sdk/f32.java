package ads_mobile_sdk;

import do2.i;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class f32 implements i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f5033a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r32 f5034b;

    public f32(i iVar, r32 r32Var) {
        this.f5033a = iVar;
        this.f5034b = r32Var;
    }

    @Override // do2.i
    public final Object collect(do2.j jVar, bl2.c cVar) {
        Object collect = this.f5033a.collect(new e32(jVar, this.f5034b), cVar);
        return collect == cl2.a.COROUTINE_SUSPENDED ? collect : Unit.f80348a;
    }
}
