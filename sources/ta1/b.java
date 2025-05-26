package ta1;

import h32.f1;
import kotlin.jvm.internal.Intrinsics;
import nx.d0;
import va1.m1;
import wk1.q;

/* loaded from: classes5.dex */
public final /* synthetic */ class b implements ak2.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f116926a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m1 f116927b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f116928c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q f116929d;

    public /* synthetic */ b(f fVar, m1 m1Var, boolean z13) {
        this.f116929d = fVar;
        this.f116927b = m1Var;
        this.f116928c = z13;
    }

    @Override // ak2.a
    public final void run() {
        q qVar = this.f116929d;
        int i13 = this.f116926a;
        boolean z13 = this.f116928c;
        m1 item = this.f116927b;
        switch (i13) {
            case 0:
                f this$0 = (f) qVar;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(item, "$item");
                ua1.d dVar = (ua1.d) ((ra1.a) this$0.getView());
                dVar.getClass();
                Intrinsics.checkNotNullParameter(item, "item");
                boolean z14 = item instanceof sa1.a;
                if (z14) {
                    d0.v(dVar.s7(), f1.USER_DISABLE_GPLUS, "0", false, 12);
                }
                if (!z13) {
                    dVar.U8().k(g82.a.disconnected_to_social);
                } else if (z14) {
                    dVar.U8().k(l52.c.settings_login_options_disconnect_with_password_google);
                } else if (item instanceof sa1.b) {
                    dVar.U8().k(l52.c.settings_login_options_disconnect_with_password_line);
                }
                this$0.v3(item, false);
                break;
            default:
                vc1.d this$02 = (vc1.d) qVar;
                Intrinsics.checkNotNullParameter(item, "$item");
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                if (item instanceof sa1.a) {
                    d0.v(this$02.getPinalytics(), f1.USER_DISABLE_GPLUS, "0", false, 12);
                }
                int i14 = !z13 ? g82.a.disconnected_to_social : l52.c.settings_login_options_disconnect_with_password_google;
                this$02.z3(item, false);
                tc1.b bVar = (tc1.b) this$02.getViewIfBound();
                if (bVar != null) {
                    ((wc1.e) bVar).U8().k(i14);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ b(m1 m1Var, vc1.d dVar, boolean z13) {
        this.f116927b = m1Var;
        this.f116929d = dVar;
        this.f116928c = z13;
    }
}
