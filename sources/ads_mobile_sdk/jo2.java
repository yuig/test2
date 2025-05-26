package ads_mobile_sdk;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;

/* loaded from: classes2.dex */
public final class jo2 implements a.s8 {

    /* renamed from: a, reason: collision with root package name */
    public final ku0 f6903a;

    public jo2(ku0 inspectorManager) {
        Intrinsics.checkNotNullParameter(inspectorManager, "inspectorManager");
        this.f6903a = inspectorManager;
    }

    @Override // a.s8
    public final Object a(nm.u uVar, bl2.c cVar) {
        Intrinsics.checkNotNullParameter("test_mode_enabled", "key");
        String str = "";
        Intrinsics.checkNotNullParameter("", "default");
        try {
            Intrinsics.checkNotNullParameter(uVar, "<this>");
            Intrinsics.checkNotNullParameter("test_mode_enabled", "key");
            String p13 = uVar.v("test_mode_enabled").p();
            Intrinsics.checkNotNullExpressionValue(p13, "getAsString(...)");
            str = p13;
        } catch (Exception unused) {
        }
        if (!(!z.j(str))) {
            return Unit.f80348a;
        }
        ku0 ku0Var = this.f6903a;
        boolean parseBoolean = Boolean.parseBoolean(str);
        ku0Var.getClass();
        Object a13 = ku0.a(ku0Var, parseBoolean, cVar);
        return a13 == cl2.a.COROUTINE_SUSPENDED ? a13 : Unit.f80348a;
    }
}
