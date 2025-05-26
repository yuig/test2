package if1;

import a.cb;
import a7.e;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.pinterest.design.brio.widget.empty.PinterestEmptyStateLayout;
import com.pinterest.feature.profile.lego.empty.LegoEmptyStateView;
import com.pinterest.gestalt.toolbar.GestaltToolbarImpl;
import h32.a4;
import id1.h;
import java.util.HashMap;
import jk2.a1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import lh0.x3;
import m60.r0;
import nr0.m;
import so.y3;
import tb0.p;
import uk2.f;
import vb0.j;
import wa2.g0;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lif1/b;", "Ljd1/d;", "Lff1/a;", "<init>", "()V", "shopping_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class b extends a implements ff1.a {

    /* renamed from: h1, reason: collision with root package name */
    public m f72227h1;

    /* renamed from: i1, reason: collision with root package name */
    public y3 f72228i1;

    /* renamed from: j1, reason: collision with root package name */
    public x3 f72229j1;

    /* renamed from: k1, reason: collision with root package name */
    public final f f72230k1;

    /* renamed from: l1, reason: collision with root package name */
    public final a1 f72231l1;

    public b() {
        f r13 = cb.r("create(...)");
        this.f72230k1 = r13;
        a1 a1Var = new a1(r13);
        Intrinsics.checkNotNullExpressionValue(a1Var, "hide(...)");
        this.f72231l1 = a1Var;
        x3 x3Var = this.f72229j1;
        if (x3Var == null) {
            Intrinsics.r("experiments");
            throw null;
        }
        if (x3Var.a()) {
            j.f125466a.K(true, "WishlistFeedFragment usage reported", p.PLATFORM, new Object[0]);
        }
    }

    @Override // jd1.d, gd1.a
    public final void B5(g0 configModel) {
        Intrinsics.checkNotNullParameter(configModel, "configModel");
        configModel.q();
        configModel.r();
        if (Intrinsics.d(com.bumptech.glide.d.Z(this, "com.pinterest.EXTRA_WISHLIST_FEED_TYPE", "wishlist_feed"), "wishlist_feed")) {
            configModel.p();
        }
        super.B5(configModel);
    }

    public final String C9() {
        String Z = com.bumptech.glide.d.Z(this, "com.pinterest.EXTRA_WISHLIST_FEED_TYPE", "wishlist_feed");
        if (Intrinsics.d(Z, "wishlist_recently_viewed_feed")) {
            return getResources().getString(d62.c.wishlist_recently_viewed);
        }
        if (Intrinsics.d(Z, "wishlist_bubble_category_feed")) {
            String Z2 = com.bumptech.glide.d.Z(this, "com.pinterest.EXTRA_SHOP_CATEGORY", "");
            if (Z2.length() != 0) {
                return Z2;
            }
        }
        return null;
    }

    @Override // jd1.d, sq0.e, nl1.d
    public final void S7(fo1.a toolbar) {
        fo1.a i73;
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.S7(toolbar);
        if (C9() != null || (i73 = i7()) == null) {
            return;
        }
        ((GestaltToolbarImpl) i73).B();
        Unit unit = Unit.f80348a;
    }

    @Override // jd1.d, yk1.k
    public final yk1.m V7() {
        y3 y3Var = this.f72228i1;
        if (y3Var == null) {
            Intrinsics.r("wishlistFeedPresenterFactory");
            throw null;
        }
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        h o93 = o9(requireContext);
        m mVar = this.f72227h1;
        if (mVar == null) {
            Intrinsics.r("dynamicGridViewBinderDelegateFactory");
            throw null;
        }
        String Z = com.bumptech.glide.d.Z(this, "com.pinterest.EXTRA_USER_ID", "me");
        String Z2 = com.bumptech.glide.d.Z(this, "com.pinterest.EXTRA_BOARD_ID", "");
        if (Z2.length() == 0) {
            Z2 = null;
        }
        return y3Var.a(o93, mVar, Z, Z2, this.f72230k1);
    }

    @Override // jd1.d
    public final String g9() {
        return com.bumptech.glide.d.Z(this, "api_endpoint", pp2.a.z(com.bumptech.glide.d.Z(this, "com.pinterest.EXTRA_USER_ID", "me")));
    }

    @Override // jd1.d
    public final HashMap h9() {
        HashMap h93 = super.h9();
        String Z = com.bumptech.glide.d.Z(this, "com.pinterest.EXTRA_BOARD_ID", "");
        if (Z.length() == 0) {
            Z = null;
        }
        if (Z != null && Z.length() > 0) {
            h93.put("board", Z);
        }
        String Z2 = com.bumptech.glide.d.Z(this, "com.pinterest.EXTRA_SHOP_CATEGORY", "");
        String str = Z2.length() != 0 ? Z2 : null;
        if (str != null && str.length() > 0) {
            h93.put("category", str);
        }
        h93.put("source", "shopping_list");
        String Z3 = com.bumptech.glide.d.Z(this, "request_params", "");
        if (Z3.length() > 0) {
            h93.put("request_params", Z3);
        }
        String Z4 = com.bumptech.glide.d.Z(this, "shop_source", "");
        if (Z4.length() > 0) {
            h93.put("shop_source", Z4);
        }
        return h93;
    }

    @Override // jd1.d
    public final h32.g0 k9() {
        return h32.g0.WISHLIST_SHOP_YOUR_PRODUCTS_STORY;
    }

    @Override // jd1.d, yq0.t
    public final e m8() {
        e eVar = new e(d62.b.fragment_wishlist_feed, d62.a.p_recycler_view);
        eVar.c(d62.a.shopping_multisection_swipe_container);
        eVar.f979c = d62.a.empty_state_container;
        return eVar;
    }

    @Override // jd1.d, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        g0 g0Var = W8().f103320a.f128764c0;
        if (g0Var != null) {
            g0Var.q();
            g0Var.r();
            if (Intrinsics.d(com.bumptech.glide.d.Z(this, "com.pinterest.EXTRA_WISHLIST_FEED_TYPE", "wishlist_feed"), "wishlist_feed")) {
                g0Var.p();
            }
        }
    }

    @Override // jd1.d, sq0.e, yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        PinterestEmptyStateLayout pinterestEmptyStateLayout = this.f139733g0;
        if (pinterestEmptyStateLayout != null) {
            pinterestEmptyStateLayout.f(false);
        }
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        LegoEmptyStateView legoEmptyStateView = new LegoEmptyStateView(requireContext);
        legoEmptyStateView.e(bs1.c.f2(legoEmptyStateView, d62.c.shopping_list_empty_state_message));
        legoEmptyStateView.setPaddingRelative(legoEmptyStateView.getPaddingStart(), legoEmptyStateView.getResources().getDimensionPixelOffset(r0.lego_empty_state_view_top_spacing), legoEmptyStateView.getPaddingEnd(), legoEmptyStateView.getPaddingBottom());
        O8(legoEmptyStateView, 49);
    }

    @Override // jd1.d
    public final String u9() {
        String C9 = C9();
        return C9 == null ? "" : C9;
    }

    @Override // jd1.d
    public final String v9() {
        return "shop_feed";
    }

    @Override // jd1.d
    public final a4 x9() {
        a4 a4Var;
        String Z = com.bumptech.glide.d.Z(this, "com.pinterest.EXTRA_WISHLIST_FEED_TYPE", "wishlist_feed");
        int hashCode = Z.hashCode();
        if (hashCode == -564479016) {
            if (Z.equals("wishlist_feed")) {
                a4Var = a4.FEED_WISHLIST;
            }
            a4Var = null;
        } else if (hashCode != -561900538) {
            if (hashCode == 1637039260 && Z.equals("wishlist_recently_viewed_feed")) {
                a4Var = a4.FEED_WISHLIST_RECENTLY_VIEWED;
            }
            a4Var = null;
        } else {
            if (Z.equals("wishlist_bubble_category_feed")) {
                a4Var = a4.FEED_WISHLIST_CATEGORY;
            }
            a4Var = null;
        }
        return a4Var == null ? a4.FEED_WISHLIST : a4Var;
    }
}
