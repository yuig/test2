package nr;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class p implements g92.g {

    /* renamed from: a, reason: collision with root package name */
    public final g92.e f91864a;

    public p(g92.f themeManager) {
        Intrinsics.checkNotNullParameter(themeManager, "themeManager");
        this.f91864a = themeManager;
    }

    @Override // g92.g
    public final g92.e c() {
        return this.f91864a;
    }

    @Override // g92.g
    public final g92.a d(Object... args) {
        Intrinsics.checkNotNullParameter(args, "args");
        return g92.a.DIALOG;
    }
}
