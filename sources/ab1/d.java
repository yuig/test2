package ab1;

import h32.f1;
import kotlin.jvm.internal.Intrinsics;
import nx.d0;

/* loaded from: classes5.dex */
public final /* synthetic */ class d implements ak2.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1705a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f1706b;

    public /* synthetic */ d(f fVar, int i13) {
        this.f1705a = i13;
        this.f1706b = fVar;
    }

    @Override // ak2.a
    public final void run() {
        int i13 = this.f1705a;
        f this$0 = this.f1706b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (this$0.isBound()) {
                    ((bb1.l) ((ya1.b) this$0.getView())).b8(false);
                    return;
                }
                return;
            case 1:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                i92.k kVar = ((bb1.l) ((ya1.b) this$0.getView())).f22523l0;
                if (kVar != null) {
                    kVar.k(l52.c.settings_enable_mfa_verification_code_resent);
                    return;
                } else {
                    Intrinsics.r("toastUtils");
                    throw null;
                }
            case 2:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (this$0.isBound()) {
                    ((bb1.l) ((ya1.b) this$0.getView())).b8(false);
                    return;
                }
                return;
            default:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.f1711c.f(za1.b.f141477a);
                bb1.l lVar = (bb1.l) ((ya1.b) this$0.getView());
                d0.v(lVar.s7(), f1.MFA_ENABLE_SUCCESS, null, false, 12);
                lVar.z(bb1.h.f22499l);
                return;
        }
    }
}
