package l71;

import kotlin.jvm.internal.Intrinsics;
import m60.f0;
import rl2.g0;

/* loaded from: classes5.dex */
public final /* synthetic */ class d implements ak2.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f81932a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f81933b;

    public /* synthetic */ d(String str, int i13) {
        this.f81932a = i13;
        this.f81933b = str;
    }

    @Override // ak2.e
    public final void accept(Object obj) {
        f0 f0Var = vb0.j.f125466a;
        int i13 = this.f81932a;
        String errorDetailMessage = this.f81933b;
        Throwable th3 = (Throwable) obj;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(errorDetailMessage, "$errorDetailMessage");
                Intrinsics.f(th3);
                if (!g0.X(th3)) {
                    f0Var.E(errorDetailMessage, th3);
                    break;
                }
                break;
            case 1:
                Intrinsics.checkNotNullParameter(errorDetailMessage, "$errorDetailMessage");
                Intrinsics.f(th3);
                if (!g0.X(th3)) {
                    f0Var.E(errorDetailMessage, th3);
                    break;
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(errorDetailMessage, "$errorDetailMessage");
                Intrinsics.f(th3);
                if (!g0.X(th3)) {
                    f0Var.E(errorDetailMessage, th3);
                    break;
                }
                break;
        }
    }
}
