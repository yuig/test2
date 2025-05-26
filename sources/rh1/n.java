package rh1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class n implements g92.g {

    /* renamed from: a, reason: collision with root package name */
    public final g92.e f108255a;

    public n(g92.f themeManager) {
        Intrinsics.checkNotNullParameter(themeManager, "themeManager");
        this.f108255a = themeManager;
    }

    @Override // g92.g
    public final g92.e c() {
        return this.f108255a;
    }

    @Override // g92.g
    public final g92.a d(Object... args) {
        Intrinsics.checkNotNullParameter(args, "args");
        return g92.a.DIALOG;
    }
}
