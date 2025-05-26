package ads_mobile_sdk;

import a.z1;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class vd0 implements a.q4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z1 f12453a;

    public vd0(z1 z1Var) {
        this.f12453a = z1Var;
    }

    @Override // a.q4
    public final Object a(Object obj, w31 w31Var) {
        Object a13 = ((a.b) obj).a(new ud0(this.f12453a, null), w31Var);
        return a13 == cl2.a.COROUTINE_SUSPENDED ? a13 : Unit.f80348a;
    }
}
