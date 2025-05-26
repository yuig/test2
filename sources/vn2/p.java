package vn2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class p extends q {

    /* renamed from: c, reason: collision with root package name */
    public static final p f126339c = new p("must be a member or an extension function", 0, 0);

    @Override // vn2.e
    public final boolean a(am2.x functionDescriptor) {
        Intrinsics.checkNotNullParameter(functionDescriptor, "functionDescriptor");
        return (functionDescriptor.A() == null && functionDescriptor.D() == null) ? false : true;
    }
}
