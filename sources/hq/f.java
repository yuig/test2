package hq;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class f implements g92.g {

    /* renamed from: a, reason: collision with root package name */
    public final g92.e f69897a;

    public f(g92.f themeManager) {
        Intrinsics.checkNotNullParameter(themeManager, "themeManager");
        this.f69897a = themeManager;
    }

    @Override // g92.g
    public final g92.e c() {
        return this.f69897a;
    }

    @Override // g92.g
    public final g92.a d(Object... args) {
        Intrinsics.checkNotNullParameter(args, "args");
        return g92.a.NUX;
    }
}
