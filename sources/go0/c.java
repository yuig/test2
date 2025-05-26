package go0;

import com.pinterest.api.model.v7;
import com.pinterest.api.model.wy0;
import java.util.ArrayList;
import jk2.j1;
import kl0.t;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import wb1.q0;
import wb1.u;
import x02.x2;
import x02.y;
import yk1.v;

/* loaded from: classes5.dex */
public final class c extends xk1.c {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f65827k = 0;

    /* renamed from: l, reason: collision with root package name */
    public boolean f65828l;

    /* renamed from: m, reason: collision with root package name */
    public final Object f65829m;

    /* renamed from: n, reason: collision with root package name */
    public final Object f65830n;

    /* renamed from: o, reason: collision with root package name */
    public final Object f65831o;

    /* renamed from: p, reason: collision with root package name */
    public Object f65832p;

    /* renamed from: q, reason: collision with root package name */
    public Object f65833q;

    /* renamed from: r, reason: collision with root package name */
    public Object f65834r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(a listener, String str, y boardFeedRepository, b60.b activeUserManager, v viewResources) {
        super(null);
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(boardFeedRepository, "boardFeedRepository");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        Intrinsics.checkNotNullParameter(viewResources, "viewResources");
        this.f65829m = listener;
        this.f65830n = str;
        this.f65832p = boardFeedRepository;
        this.f65833q = activeUserManager;
        this.f65828l = true;
        this.f65834r = viewResources;
        this.f65831o = "";
        o(465541, new yi0.a(listener, str));
        o(465546, new pk0.b(3));
    }

    @Override // sq0.e0
    public final int getItemViewType(int i13) {
        switch (this.f65827k) {
            case 0:
                dl1.s sVar = (dl1.s) getItem(i13);
                if (sVar instanceof v7) {
                    return 465541;
                }
                if (sVar instanceof b) {
                    return 465546;
                }
                throw new IllegalStateException("Invalid model type in BoardSectionPickerParentBoardFetchedList::getItemViewType");
            default:
                ArrayList arrayList = this.f135191h;
                if (!(((dl1.s) CollectionsKt.F0(arrayList).get(i13)) instanceof q0)) {
                    throw new IllegalStateException("Item should be SettingsPermissionsMenuItem");
                }
                Object obj = CollectionsKt.F0(arrayList).get(i13);
                Intrinsics.g(obj, "null cannot be cast to non-null type com.pinterest.feature.settings.permissions.model.SettingsPermissionsMenuItem");
                return ((q0) obj).getViewType();
        }
    }

    @Override // xk1.c
    public final uj2.q k() {
        int i13 = 0;
        switch (this.f65827k) {
            case 0:
                wy0 f13 = ((b60.d) ((b60.b) this.f65833q)).f();
                String uid = f13 != null ? f13.getUid() : null;
                if (uid == null) {
                    uid = "";
                }
                j1 j1Var = new j1(m22.a.d((y) this.f65832p, uid, this.f65828l).H(tk2.e.f118017c).A(wj2.c.a()), new qk0.b(7, new t(this, 24)), 0);
                Intrinsics.checkNotNullExpressionValue(j1Var, "map(...)");
                return j1Var;
            default:
                j1 j1Var2 = new j1(((x2) this.f65829m).d0().Q("me").I(1L).t(new t81.a(25, new u(this, i13))), new t81.a(26, new u(this, 1)), 0);
                Intrinsics.checkNotNullExpressionValue(j1Var2, "map(...)");
                return j1Var2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(x2 userRepository, h20.a commentsFeaturesService, kc2.a videoPreferences) {
        super(null);
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(commentsFeaturesService, "commentsFeaturesService");
        Intrinsics.checkNotNullParameter(videoPreferences, "videoPreferences");
        this.f65829m = userRepository;
        this.f65830n = commentsFeaturesService;
        this.f65831o = videoPreferences;
        o(1, new s91.b(24));
        o(2, new s91.b(25));
        o(3, new s91.b(26));
        o(0, new s91.b(27));
        o(7, new s91.b(28));
    }
}
