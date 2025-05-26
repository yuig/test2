package vo;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class u implements g92.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f126382a;

    /* renamed from: b, reason: collision with root package name */
    public final g92.e f126383b;

    public u(g92.f themeManager, int i13) {
        this.f126382a = i13;
        switch (i13) {
            case 1:
                Intrinsics.checkNotNullParameter(themeManager, "themeManager");
                this.f126383b = themeManager;
                break;
            case 2:
                Intrinsics.checkNotNullParameter(themeManager, "themeManager");
                this.f126383b = themeManager;
                break;
            case 3:
                Intrinsics.checkNotNullParameter(themeManager, "themeManager");
                this.f126383b = themeManager;
                break;
            case 4:
                Intrinsics.checkNotNullParameter(themeManager, "themeManager");
                this.f126383b = themeManager;
                break;
            case 5:
                Intrinsics.checkNotNullParameter(themeManager, "themeManager");
                this.f126383b = themeManager;
                break;
            case 6:
                Intrinsics.checkNotNullParameter(themeManager, "themeManager");
                this.f126383b = themeManager;
                break;
            case 7:
                Intrinsics.checkNotNullParameter(themeManager, "themeManager");
                this.f126383b = themeManager;
                break;
            case 8:
                Intrinsics.checkNotNullParameter(themeManager, "themeManager");
                this.f126383b = themeManager;
                break;
            default:
                Intrinsics.checkNotNullParameter(themeManager, "themeManager");
                this.f126383b = themeManager;
                break;
        }
    }

    @Override // g92.g
    public final g92.e c() {
        return this.f126383b;
    }

    @Override // g92.g
    public final g92.a d(Object... args) {
        switch (this.f126382a) {
            case 0:
                Intrinsics.checkNotNullParameter(args, "args");
                return g92.a.DIALOG;
            case 1:
                Intrinsics.checkNotNullParameter(args, "args");
                return g92.a.FULL_SCREEN;
            case 2:
                Intrinsics.checkNotNullParameter(args, "args");
                return g92.a.DIALOG;
            case 3:
                Intrinsics.checkNotNullParameter(args, "args");
                return g92.a.DIALOG;
            case 4:
                Intrinsics.checkNotNullParameter(args, "args");
                return g92.a.DIALOG;
            case 5:
                Intrinsics.checkNotNullParameter(args, "args");
                return g92.a.PINTEREST;
            case 6:
                Intrinsics.checkNotNullParameter(args, "args");
                return g92.a.DIALOG;
            case 7:
                Intrinsics.checkNotNullParameter(args, "args");
                return g92.a.PIN_CREATE;
            default:
                Intrinsics.checkNotNullParameter(args, "args");
                return g92.a.PINTEREST;
        }
    }
}
