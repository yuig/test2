package is1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final /* synthetic */ class u implements ak2.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f73647a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f73648b;

    public /* synthetic */ u(String str, int i13) {
        this.f73647a = i13;
        this.f73648b = str;
    }

    @Override // ak2.e
    public final void accept(Object obj) {
        m60.f0 f0Var = vb0.j.f125466a;
        int i13 = this.f73647a;
        String errorDetailMessage = this.f73648b;
        Throwable th3 = (Throwable) obj;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(errorDetailMessage, "$errorDetailMessage");
                Intrinsics.f(th3);
                if (!rl2.g0.X(th3)) {
                    f0Var.E(errorDetailMessage, th3);
                    break;
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(errorDetailMessage, "$errorDetailMessage");
                Intrinsics.f(th3);
                if (!rl2.g0.X(th3)) {
                    f0Var.E(errorDetailMessage, th3);
                    break;
                }
                break;
        }
    }
}
