package oc0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class k implements g92.g {

    /* renamed from: a, reason: collision with root package name */
    public final g92.e f94044a;

    public k(g92.f themeManager) {
        Intrinsics.checkNotNullParameter(themeManager, "themeManager");
        this.f94044a = themeManager;
    }

    @Override // g92.g
    public final g92.e c() {
        return this.f94044a;
    }

    @Override // g92.g
    public final g92.a d(Object... args) {
        Intrinsics.checkNotNullParameter(args, "args");
        return g92.a.DIALOG;
    }
}
