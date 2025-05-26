package ads_mobile_sdk;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;

/* loaded from: classes2.dex */
public final class vv0 implements a.cd {

    /* renamed from: a, reason: collision with root package name */
    public final ku0 f12662a;

    public vv0(ku0 inspectorManager) {
        Intrinsics.checkNotNullParameter(inspectorManager, "inspectorManager");
        this.f12662a = inspectorManager;
    }

    @Override // a.cd
    public final Object a(ym0 ym0Var, Map map, bl2.c cVar) {
        String str = (String) map.get("persistentData");
        if (str != null && (!z.j(str))) {
            ku0 ku0Var = this.f12662a;
            ku0Var.getClass();
            Object b13 = ku0.b(ku0Var, str, cVar);
            return b13 == cl2.a.COROUTINE_SUSPENDED ? b13 : Unit.f80348a;
        }
        return Unit.f80348a;
    }

    @Override // a.cd
    public final kl0 b() {
        return kl0.GMSG_INSPECTOR_UI_STORAGE;
    }
}
