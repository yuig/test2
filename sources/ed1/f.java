package ed1;

import com.pinterest.activity.sendapin.model.SendableObject;
import h32.f1;
import kotlin.jvm.internal.Intrinsics;
import x02.i2;
import yq1.u1;

/* loaded from: classes5.dex */
public final class f extends yk1.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f58574a;

    /* renamed from: b, reason: collision with root package name */
    public final nx.d0 f58575b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f58576c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f58577d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f58578e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(String pinUid, Integer num, nx.j0 pinalytics, i2 pinRepository) {
        super(0);
        this.f58574a = 2;
        Intrinsics.checkNotNullParameter(pinUid, "pinUid");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
        this.f58576c = pinUid;
        this.f58577d = num;
        this.f58575b = pinalytics;
        this.f58578e = pinRepository;
    }

    @Override // yk1.b
    /* renamed from: onBind */
    public final void r3(yk1.n nVar) {
        switch (this.f58574a) {
            case 0:
                cd1.b view = (cd1.b) nVar;
                Intrinsics.checkNotNullParameter(view, "view");
                nx.d0.B(this.f58575b, f1.VIEW, h32.g0.PRIVATE_PROFILE_POST_FOLLOW_MODAL_SHARE_PROFILE, null, null, 28);
                super.r3(view);
                break;
            case 1:
                cd1.c view2 = (cd1.c) nVar;
                Intrinsics.checkNotNullParameter(view2, "view");
                super.r3(view2);
                nx.d0.B(this.f58575b, f1.VIEW, h32.g0.PRIVATE_PROFILE_POST_FOLLOW_MODAL_SEND_MESSAGE, null, null, 28);
                break;
            default:
                yt1.a view3 = (yt1.a) nVar;
                Intrinsics.checkNotNullParameter(view3, "view");
                super.r3(view3);
                f1 f1Var = f1.MUSIC_PLAYLIST_OPEN;
                String str = (String) this.f58576c;
                nx.d0.v(this.f58575b, f1Var, str, false, 12);
                nx.d0.B(this.f58575b, f1.VIEW, null, null, null, 30);
                addDisposable(((i2) this.f58578e).P(str).A(wj2.c.a()).F(new zq1.c0(27, new u1(this, 9)), new zq1.c0(28, new xm1.k(27, str, this)), ck2.i.f27923c, ck2.i.f27924d));
                break;
        }
    }

    @Override // yk1.b
    public final void onUnbind() {
        int i13 = this.f58574a;
        Object obj = this.f58578e;
        Object obj2 = this.f58577d;
        Object obj3 = this.f58576c;
        switch (i13) {
            case 0:
                if (((SendableObject) obj3).g()) {
                    ig1.b.s0((m60.w) obj2, (lz1.a) obj);
                    e0.t.f56747e = -1;
                }
                super.onUnbind();
                break;
            case 1:
                if (((SendableObject) obj3).g()) {
                    ig1.b.s0((m60.w) obj2, (lz1.a) obj);
                    e0.t.f56747e = -1;
                }
                super.onUnbind();
                break;
            default:
                super.onUnbind();
                nx.d0.v(this.f58575b, f1.MUSIC_PLAYLIST_DISMISS, (String) obj3, false, 12);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(nx.d0 pinalytics, SendableObject sendableObject, m60.w eventManager, lz1.c sendShareUpsellPreferences, int i13) {
        super(0);
        this.f58574a = i13;
        if (i13 != 1) {
            Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
            Intrinsics.checkNotNullParameter(sendableObject, "sendableObject");
            Intrinsics.checkNotNullParameter(eventManager, "eventManager");
            Intrinsics.checkNotNullParameter(sendShareUpsellPreferences, "sendShareUpsellPreferences");
            this.f58575b = pinalytics;
            this.f58576c = sendableObject;
            this.f58577d = eventManager;
            this.f58578e = sendShareUpsellPreferences;
            return;
        }
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(sendableObject, "sendableObject");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(sendShareUpsellPreferences, "sendShareUpsellPreferences");
        super(0);
        this.f58575b = pinalytics;
        this.f58576c = sendableObject;
        this.f58577d = eventManager;
        this.f58578e = sendShareUpsellPreferences;
    }
}
