package ads_mobile_sdk;

import a.z1;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class m62 implements a.cd {

    /* renamed from: a, reason: collision with root package name */
    public final z1 f8111a;

    public m62(z1 refreshListener) {
        Intrinsics.checkNotNullParameter(refreshListener, "refreshListener");
        this.f8111a = refreshListener;
    }

    @Override // a.cd
    public final Object a(ym0 ym0Var, Map map, bl2.c cVar) {
        Object b13;
        String str = (String) map.get("action");
        if (!Intrinsics.d("pause", str)) {
            return (Intrinsics.d("resume", str) && (b13 = this.f8111a.b(true, cVar)) == cl2.a.COROUTINE_SUSPENDED) ? b13 : Unit.f80348a;
        }
        Object a13 = this.f8111a.a(true, cVar);
        return a13 == cl2.a.COROUTINE_SUSPENDED ? a13 : Unit.f80348a;
    }

    @Override // a.cd
    public final kl0 b() {
        return kl0.GMSG_NAME_REFRESH;
    }
}
