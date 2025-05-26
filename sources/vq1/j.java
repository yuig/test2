package vq1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class j implements g92.g {

    /* renamed from: a, reason: collision with root package name */
    public final g92.e f126447a;

    public j(g92.f themeManager) {
        Intrinsics.checkNotNullParameter(themeManager, "themeManager");
        this.f126447a = themeManager;
    }

    @Override // g92.g
    public final g92.e c() {
        return this.f126447a;
    }

    @Override // g92.g
    public final g92.a d(Object... args) {
        Intrinsics.checkNotNullParameter(args, "args");
        return g92.a.PINTEREST;
    }
}
