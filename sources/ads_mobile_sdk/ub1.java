package ads_mobile_sdk;

import android.content.Context;
import ao2.j0;
import com.pinterest.shuffles.scene.composer.AnimatedTarget;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class ub1 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f12010a;

    /* renamed from: b, reason: collision with root package name */
    public final j0 f12011b;

    /* renamed from: c, reason: collision with root package name */
    public final x f12012c;

    public ub1(Context context, j0 uiScope, x activityTracker) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uiScope, "uiScope");
        Intrinsics.checkNotNullParameter(activityTracker, "activityTracker");
        this.f12010a = context;
        this.f12011b = uiScope;
        this.f12012c = activityTracker;
    }

    public static Object a(ym0 ym0Var, String str, String str2, bl2.c cVar) {
        nm.u uVar = new nm.u();
        uVar.u("action", str2);
        uVar.u("message", str);
        Object a13 = ym0Var.a(uVar, "onError", cVar);
        return a13 == cl2.a.COROUTINE_SUSPENDED ? a13 : Unit.f80348a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final kotlin.Unit a(ads_mobile_sdk.ym0 r10) {
        /*
            Method dump skipped, instructions count: 281
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.ub1.a(ads_mobile_sdk.ym0):kotlin.Unit");
    }

    public static Object a(ym0 ym0Var, int i13, int i14, int i15, int i16, gd1 gd1Var) {
        nm.u uVar = new nm.u();
        uVar.s(new Integer(i13), "x");
        uVar.s(new Integer(i14), "y");
        uVar.s(new Integer(i15), "width");
        uVar.s(new Integer(i16), "height");
        Object a13 = ym0Var.a(uVar, "onSizeChanged", gd1Var);
        return a13 == cl2.a.COROUTINE_SUSPENDED ? a13 : Unit.f80348a;
    }

    public static Object a(ym0 ym0Var, String str, dl2.d dVar) {
        nm.u uVar = new nm.u();
        uVar.u(AnimatedTarget.PROPERTY_STATE, str);
        Object a13 = ym0Var.a(uVar, "onStateChanged", dVar);
        return a13 == cl2.a.COROUTINE_SUSPENDED ? a13 : Unit.f80348a;
    }
}
