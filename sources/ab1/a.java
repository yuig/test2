package ab1;

import h32.f1;
import kotlin.jvm.internal.Intrinsics;
import nx.d0;

/* loaded from: classes5.dex */
public final /* synthetic */ class a implements ak2.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1697a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f1698b;

    public /* synthetic */ a(c cVar, int i13) {
        this.f1697a = i13;
        this.f1698b = cVar;
    }

    @Override // ak2.a
    public final void run() {
        int i13 = this.f1697a;
        c this$0 = this.f1698b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (this$0.isBound()) {
                    ((bb1.i) ((ya1.a) this$0.getView())).b8(false);
                    return;
                }
                return;
            case 1:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (this$0.isBound()) {
                    ((bb1.i) ((ya1.a) this$0.getView())).b8(false);
                    return;
                }
                return;
            default:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.f1703c.f(za1.a.f141476a);
                bb1.i iVar = (bb1.i) ((ya1.a) this$0.getView());
                d0.v(iVar.s7(), f1.MFA_DISABLE_SUCCESS, null, false, 12);
                i92.k kVar = iVar.f22511l0;
                if (kVar == null) {
                    Intrinsics.r("toastUtils");
                    throw null;
                }
                kVar.k(l52.c.settings_disable_mfa_confirmation_message);
                iVar.z(bb1.h.f22497j);
                return;
        }
    }
}
