package ads_mobile_sdk;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes2.dex */
public final class q32 implements do2.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CoroutineContext f9930a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a.j8 f9931b;

    public q32(CoroutineContext coroutineContext, a.j8 j8Var) {
        this.f9930a = coroutineContext;
        this.f9931b = j8Var;
    }

    @Override // do2.j
    public final Object emit(Object obj, bl2.c cVar) {
        Object M;
        a.ld ldVar = (a.ld) obj;
        if (!(ldVar instanceof t32)) {
            return ((ldVar instanceof s32) && (M = kotlin.jvm.internal.j.M(cVar, this.f9930a, new p32(this.f9931b, ldVar, null))) == cl2.a.COROUTINE_SUSPENDED) ? M : Unit.f80348a;
        }
        Object M2 = kotlin.jvm.internal.j.M(cVar, this.f9930a, new n32(this.f9931b, ldVar, null));
        return M2 == cl2.a.COROUTINE_SUSPENDED ? M2 : Unit.f80348a;
    }
}
