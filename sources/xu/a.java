package xu;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.pinterest.ads.feature.owc.presenter.showcase.bottomsheet.AdsShowcaseBottomSheetBehavior;
import com.pinterest.ads.feature.owc.view.base.BaseAdsBottomSheetBehavior;
import com.pinterest.ads.feature.owc.view.core.AdsBrowserBottomSheet;
import com.pinterest.feature.browser.view.InAppBrowserView;
import eo1.c;
import kotlin.jvm.internal.Intrinsics;
import lr.v;
import ps.q;
import xk2.m;
import xt.f;
import yk1.j;
import yk1.n;
import yt.b;

/* loaded from: classes3.dex */
public final class a extends AdsBrowserBottomSheet implements n {

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f135920w = 0;

    /* renamed from: u, reason: collision with root package name */
    public final f f135921u;

    /* renamed from: v, reason: collision with root package name */
    public final AdsShowcaseBottomSheetBehavior f135922v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, f showcaseManager, boolean z13) {
        super(context, null, 0, z13);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(showcaseManager, "showcaseManager");
        this.f135921u = showcaseManager;
        Intrinsics.checkNotNullParameter(context, "context");
        this.f135922v = new AdsShowcaseBottomSheetBehavior(context, null, z13);
        m.b(new v(this, 14));
        yu.f fVar = new yu.f(context, showcaseManager);
        fVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        LinearLayout linearLayout = this.f53208j;
        linearLayout.setPadding(0, linearLayout.getPaddingTop(), 0, getResources().getDimensionPixelSize(c.margin_half));
        this.f53201c.setVisibility(8);
        this.f53202d.addView(fVar);
        j.a().d(this, new b(showcaseManager));
    }

    @Override // com.pinterest.ads.feature.owc.view.core.AdsBrowserBottomSheet, cu.i
    public final void Z(float f13) {
        super.Z(f13);
        InAppBrowserView inAppBrowserView = this.f35366r;
        if (inAppBrowserView == null) {
            return;
        }
        inAppBrowserView.setVisibility(f13 <= 0.0f ? 4 : 0);
    }

    @Override // com.pinterest.ads.feature.owc.view.core.AdsBrowserBottomSheet, cu.i
    /* renamed from: g */
    public final BaseAdsBottomSheetBehavior getF35368t() {
        return this.f135922v;
    }

    @Override // com.pinterest.ads.feature.owc.view.core.AdsBrowserBottomSheet, cu.i
    public final int k() {
        return q.ads_showcase_bottom_sheet;
    }

    @Override // com.pinterest.ads.feature.owc.view.core.AdsBrowserBottomSheet, cu.i
    public final void o() {
    }

    @Override // cu.i
    public final void s(String str, String str2, String str3, boolean z13, boolean z14) {
        n();
    }

    @Override // cu.i
    public final void z() {
        n();
    }
}
