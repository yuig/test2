package vo;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class r implements g92.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f126379a;

    /* renamed from: b, reason: collision with root package name */
    public final g92.e f126380b;

    public r(g92.f themeManager, int i13) {
        this.f126379a = i13;
        if (i13 != 1) {
            Intrinsics.checkNotNullParameter(themeManager, "themeManager");
            this.f126380b = themeManager;
        } else {
            Intrinsics.checkNotNullParameter(themeManager, "themeManager");
            this.f126380b = themeManager;
        }
    }

    @Override // g92.g
    public final g92.e c() {
        return this.f126380b;
    }

    @Override // g92.g
    public final g92.a d(Object... args) {
        switch (this.f126379a) {
            case 0:
                Intrinsics.checkNotNullParameter(args, "args");
                if (!(args.length == 0)) {
                    Object obj = args[0];
                    if (obj instanceof Boolean) {
                        Intrinsics.g(obj, "null cannot be cast to non-null type kotlin.Boolean");
                        if (((Boolean) obj).booleanValue()) {
                            return g92.a.SPLASHSCREEN;
                        }
                    }
                }
                return g92.a.LAUNCH;
            default:
                Intrinsics.checkNotNullParameter(args, "args");
                if (!(args.length == 0)) {
                    Object obj2 = args[0];
                    if (obj2 instanceof Boolean) {
                        Intrinsics.g(obj2, "null cannot be cast to non-null type kotlin.Boolean");
                        if (((Boolean) obj2).booleanValue()) {
                            return g92.a.SPLASHSCREEN;
                        }
                    }
                }
                return g92.a.MAIN;
        }
    }
}
