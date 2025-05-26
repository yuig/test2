package kh2;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class n0 {

    /* renamed from: a, reason: collision with root package name */
    public final Function0 f79625a;

    /* renamed from: b, reason: collision with root package name */
    public final xk2.k f79626b;

    public n0(Function0 startedCheck, Function0 provider) {
        Intrinsics.checkNotNullParameter(startedCheck, "startedCheck");
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.f79625a = startedCheck;
        this.f79626b = xk2.m.a(xk2.n.PUBLICATION, provider);
    }

    public final Object a(Object obj, rl2.u property) {
        Intrinsics.checkNotNullParameter(property, "property");
        if (((Boolean) this.f79625a.invoke()).booleanValue()) {
            return this.f79626b.getValue();
        }
        return null;
    }
}
