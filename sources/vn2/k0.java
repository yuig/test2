package vn2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class k0 extends q {

    /* renamed from: c, reason: collision with root package name */
    public static final k0 f126335c = new k0("must have a single value parameter", 1, 0);

    @Override // vn2.e
    public final boolean a(am2.x functionDescriptor) {
        Intrinsics.checkNotNullParameter(functionDescriptor, "functionDescriptor");
        return functionDescriptor.x().size() == 1;
    }
}
