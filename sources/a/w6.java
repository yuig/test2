package a;

import ads_mobile_sdk.cf2;
import ads_mobile_sdk.mo2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public interface w6 {
    n3 a(cf2 cf2Var, ads_mobile_sdk.r0 r0Var, Object obj);

    default void a(m4 adComponent) {
        Intrinsics.checkNotNullParameter(adComponent, "adComponent");
    }

    void a(cf2 cf2Var, ads_mobile_sdk.r0 r0Var, w0 w0Var, mo2 mo2Var);
}
