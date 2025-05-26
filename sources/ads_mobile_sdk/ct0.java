package ads_mobile_sdk;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class ct0 implements a.s8 {

    /* renamed from: a, reason: collision with root package name */
    public final ku0 f4027a;

    public ct0(ku0 inspectorManager) {
        Intrinsics.checkNotNullParameter(inspectorManager, "inspectorManager");
        this.f4027a = inspectorManager;
    }

    @Override // a.s8
    public final Object a(nm.u uVar, bl2.c cVar) {
        Intrinsics.checkNotNullParameter("gesture", "key");
        String str = "";
        Intrinsics.checkNotNullParameter("", "default");
        try {
            Intrinsics.checkNotNullParameter(uVar, "<this>");
            Intrinsics.checkNotNullParameter("gesture", "key");
            String p13 = uVar.v("gesture").p();
            Intrinsics.checkNotNullExpressionValue(p13, "getAsString(...)");
            str = p13;
        } catch (Exception unused) {
        }
        if (Intrinsics.d(str, "shake")) {
            ku0 ku0Var = this.f4027a;
            bt0 bt0Var = bt0.SHAKE;
            ku0Var.getClass();
            Object a13 = ku0.a(ku0Var, bt0Var, cVar);
            return a13 == cl2.a.COROUTINE_SUSPENDED ? a13 : Unit.f80348a;
        }
        if (Intrinsics.d(str, "flick")) {
            ku0 ku0Var2 = this.f4027a;
            bt0 bt0Var2 = bt0.FLICK;
            ku0Var2.getClass();
            Object a14 = ku0.a(ku0Var2, bt0Var2, cVar);
            return a14 == cl2.a.COROUTINE_SUSPENDED ? a14 : Unit.f80348a;
        }
        ku0 ku0Var3 = this.f4027a;
        bt0 bt0Var3 = bt0.NONE;
        ku0Var3.getClass();
        Object a15 = ku0.a(ku0Var3, bt0Var3, cVar);
        return a15 == cl2.a.COROUTINE_SUSPENDED ? a15 : Unit.f80348a;
    }
}
