package f92;

import g92.e;
import g92.f;
import g92.g;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class a implements g {

    /* renamed from: a, reason: collision with root package name */
    public final e f61470a;

    public a(f themeManager) {
        Intrinsics.checkNotNullParameter(themeManager, "themeManager");
        this.f61470a = themeManager;
    }

    @Override // g92.g
    public final e c() {
        return this.f61470a;
    }

    @Override // g92.g
    public final g92.a d(Object... args) {
        Intrinsics.checkNotNullParameter(args, "args");
        return g92.a.MAIN;
    }
}
