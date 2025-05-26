package ab1;

import bb1.s;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final /* synthetic */ class i implements ak2.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1718a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f1719b;

    public /* synthetic */ i(l lVar, int i13) {
        this.f1718a = i13;
        this.f1719b = lVar;
    }

    @Override // ak2.a
    public final void run() {
        int i13 = this.f1718a;
        l this$0 = this.f1719b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (this$0.isBound()) {
                    ((s) ((ya1.d) this$0.getView())).c8(false);
                    return;
                }
                return;
            case 1:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (this$0.isBound()) {
                    ((s) ((ya1.d) this$0.getView())).c8(false);
                    return;
                }
                return;
            case 2:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (this$0.isBound()) {
                    ((s) ((ya1.d) this$0.getView())).c8(false);
                    return;
                }
                return;
            default:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                i92.k kVar = ((s) ((ya1.d) this$0.getView())).f22553k0;
                if (kVar != null) {
                    kVar.k(l52.c.settings_enable_mfa_confirm_password_forgot_email_sent);
                    return;
                } else {
                    Intrinsics.r("toastUtils");
                    throw null;
                }
        }
    }
}
