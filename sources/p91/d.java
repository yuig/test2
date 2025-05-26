package p91;

import android.os.Bundle;
import android.view.ViewStub;
import androidx.fragment.app.FragmentActivity;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.screens.z3;
import h32.f1;
import h32.u0;
import java.util.HashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import nx.d0;
import x02.x2;
import x81.h0;

/* loaded from: classes5.dex */
public final class d extends yk1.t {

    /* renamed from: a, reason: collision with root package name */
    public final x2 f99276a;

    /* renamed from: b, reason: collision with root package name */
    public a f99277b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(uk1.d pinalytics, x2 userRepository, uj2.q networkStateStream) {
        super(pinalytics, networkStateStream);
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        this.f99276a = userRepository;
        this.f99277b = a.UPSELL_BUSINESS;
    }

    public static final void p3(d dVar, boolean z13) {
        a aVar;
        if (z13) {
            k91.c cVar = (k91.c) ((l91.a) dVar.getView());
            ViewStub viewStub = cVar.f78813n0;
            if (viewStub == null) {
                Intrinsics.r("upsellPlaceholder");
                throw null;
            }
            viewStub.setLayoutResource(b52.b.layout_create_personal_account);
            viewStub.inflate();
            ViewStub viewStub2 = cVar.f78814o0;
            if (viewStub2 == null) {
                Intrinsics.r("secondaryPlaceholder");
                throw null;
            }
            viewStub2.setLayoutResource(b52.b.layout_create_business_account);
            viewStub2.inflate();
            aVar = a.UPSELL_PERSONAL;
        } else {
            if (z13) {
                dVar.getClass();
                throw new NoWhenBranchMatchedException();
            }
            k91.c cVar2 = (k91.c) ((l91.a) dVar.getView());
            ViewStub viewStub3 = cVar2.f78813n0;
            if (viewStub3 == null) {
                Intrinsics.r("upsellPlaceholder");
                throw null;
            }
            viewStub3.setLayoutResource(b52.b.layout_create_business_account);
            viewStub3.inflate();
            ViewStub viewStub4 = cVar2.f78814o0;
            if (viewStub4 == null) {
                Intrinsics.r("secondaryPlaceholder");
                throw null;
            }
            viewStub4.setLayoutResource(b52.b.layout_create_personal_account);
            viewStub4.inflate();
            aVar = a.UPSELL_BUSINESS;
        }
        dVar.f99277b = aVar;
    }

    @Override // yk1.p
    /* renamed from: q3, reason: merged with bridge method [inline-methods] */
    public final void r3(l91.a view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((yk1.r) view);
        Intrinsics.checkNotNullParameter(this, "listener");
        ((k91.c) view).f78812m0 = this;
        xj2.c o13 = this.f99276a.d0().L("me").s().o(new h0(18, new c(this, 0)), new h0(19, new c(this, 1)));
        Intrinsics.checkNotNullExpressionValue(o13, "subscribe(...)");
        addDisposable(o13);
    }

    public final void r3() {
        getPinalytics().h0((r18 & 1) != 0 ? f1.TAP : f1.TAP, (r18 & 2) != 0 ? null : u0.ADD_EXISTING_ACCOUNT_BTN, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
        k91.c cVar = (k91.c) ((l91.a) getView());
        mr1.a aVar = cVar.f78810k0;
        if (aVar == null) {
            Intrinsics.r("accountSwitcher");
            throw null;
        }
        ((lb2.n) aVar).h(or1.c.ADD_ACCOUNT, or1.e.ATTEMPT, or1.b.PERSONAL, null);
        d0 s73 = cVar.s7();
        f1 f1Var = f1.USER_SWITCH_INTENT;
        HashMap hashMap = new HashMap();
        hashMap.put("group_id", a60.a.b());
        hashMap.put("group_count", String.valueOf(a60.a.a(null).getAll().size()));
        s73.g(f1Var, "", hashMap, false);
        lu1.b bVar = cVar.f78811l0;
        if (bVar == null) {
            Intrinsics.r("activityHelper");
            throw null;
        }
        FragmentActivity requireActivity = cVar.requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        Bundle bundle = new Bundle();
        bundle.putBoolean("com.pinterest.EXTRA_BLOCK_AUTOLOGIN", true);
        Unit unit = Unit.f80348a;
        ((lu1.c) bVar).q(requireActivity, bundle);
    }

    public final void s3() {
        getPinalytics().h0((r18 & 1) != 0 ? f1.TAP : f1.TAP, (r18 & 2) != 0 ? null : u0.ADD_BUSINESS_ACCOUNT_BTN, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
        ((k91.c) ((l91.a) getView())).f7().d(Navigation.w1(z3.e()));
    }

    public final void t3() {
        getPinalytics().h0((r18 & 1) != 0 ? f1.TAP : f1.TAP, (r18 & 2) != 0 ? null : u0.ADD_PERSONAL_ACCOUNT_BTN, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
        k91.c cVar = (k91.c) ((l91.a) getView());
        mr1.a aVar = cVar.f78810k0;
        if (aVar == null) {
            Intrinsics.r("accountSwitcher");
            throw null;
        }
        ((lb2.n) aVar).h(or1.c.ADD_ACCOUNT, or1.e.ATTEMPT, or1.b.PERSONAL, null);
        d0 s73 = cVar.s7();
        f1 f1Var = f1.USER_SWITCH_INTENT;
        HashMap hashMap = new HashMap();
        hashMap.put("group_id", a60.a.b());
        hashMap.put("group_count", String.valueOf(a60.a.a(null).getAll().size()));
        s73.g(f1Var, "", hashMap, false);
        lu1.b bVar = cVar.f78811l0;
        if (bVar == null) {
            Intrinsics.r("activityHelper");
            throw null;
        }
        FragmentActivity requireActivity = cVar.requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        Bundle bundle = new Bundle();
        bundle.putBoolean("com.pinterest.EXTRA_BLOCK_AUTOLOGIN", true);
        Unit unit = Unit.f80348a;
        ((lu1.c) bVar).q(requireActivity, bundle);
    }

    public final void u3() {
        m60.w f73 = ((k91.c) ((l91.a) getView())).f7();
        NavigationImpl w13 = Navigation.w1(z3.c());
        w13.Y1("com.pinterest.ACCOUNT_SETTINGS_AUTO_SCROLL", true);
        f73.d(w13);
    }

    public final void v3() {
        int i13 = b.f99253a[this.f99277b.ordinal()];
        if (i13 == 1) {
            s3();
        } else {
            if (i13 != 2) {
                return;
            }
            t3();
        }
    }

    public final void w3() {
        int i13 = b.f99253a[this.f99277b.ordinal()];
        if (i13 == 1) {
            t3();
        } else {
            if (i13 != 2) {
                return;
            }
            s3();
        }
    }
}
