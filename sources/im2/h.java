package im2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class h extends r0 {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f72741m = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public static final am2.x a(am2.x functionDescriptor) {
        Intrinsics.checkNotNullParameter(functionDescriptor, "functionDescriptor");
        ym2.g name = ((dm2.o) functionDescriptor).getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        if (b(name)) {
            return (am2.x) fn2.d.b(functionDescriptor, f.f72736i);
        }
        return null;
    }

    public static boolean b(ym2.g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        return r0.f72770f.contains(gVar);
    }
}
