package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class ds2 {

    /* renamed from: a, reason: collision with root package name */
    public static a.j3 f4430a;

    public static void a(String message) {
        a.j3 j3Var;
        Intrinsics.checkNotNullParameter(message, "message");
        gk0.c(message, null);
        IllegalStateException illegalStateException = new IllegalStateException(message);
        illegalStateException.printStackTrace();
        xk xkVar = wk.f13103a;
        if (xkVar == xk.f13701b) {
            throw illegalStateException;
        }
        if (xkVar == xk.f13702c) {
            throw illegalStateException;
        }
        if (xkVar != xk.f13700a || (j3Var = f4430a) == null) {
            return;
        }
        ((ks2) j3Var).a(message, illegalStateException);
    }
}
