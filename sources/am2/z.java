package am2;

import ads_mobile_sdk.ci1$$ExternalSyntheticThrowCCEIfNotNull0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.InvalidModuleException;

/* loaded from: classes4.dex */
public abstract class z {

    /* renamed from: a, reason: collision with root package name */
    public static final fi.b f15605a = new fi.b("InvalidModuleNotifier", 3);

    public static final void a(d0 d0Var) {
        Intrinsics.checkNotNullParameter(d0Var, "<this>");
        ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(d0Var.g0(f15605a));
        String message = "Accessing invalid module descriptor " + d0Var;
        Intrinsics.checkNotNullParameter(message, "message");
        throw new InvalidModuleException(message);
    }
}
