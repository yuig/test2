package vn2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class j0 extends q {

    /* renamed from: c, reason: collision with root package name */
    public static final j0 f126329c = new j0("must have no value parameters", 1, 0);

    @Override // vn2.e
    public final boolean a(am2.x functionDescriptor) {
        Intrinsics.checkNotNullParameter(functionDescriptor, "functionDescriptor");
        return functionDescriptor.x().isEmpty();
    }
}
