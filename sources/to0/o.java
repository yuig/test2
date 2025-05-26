package to0;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import so.m0;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lto0/o;", "Lcom/pinterest/feature/browser/view/InAppBrowserFragment;", "Lpo0/e;", "<init>", "()V", "inAppBrowser_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class o extends i {
    public m0 X0;

    @Override // com.pinterest.feature.browser.view.InAppBrowserFragment, yk1.k
    public final yk1.m V7() {
        po0.a Z7 = Z7();
        qo0.b i83 = i8(Z7);
        m0 m0Var = this.X0;
        if (m0Var == null) {
            Intrinsics.r("modalPresenterFactory");
            throw null;
        }
        ro0.g a13 = m0Var.a(Z7, i83);
        j8();
        return a13;
    }

    @Override // to0.g, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.E = cs1.c.fragment_in_app_browser_modal;
    }

    @Override // com.pinterest.feature.browser.view.InAppBrowserFragment, to0.g, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        View findViewById = v13.findViewById(cs1.b.in_app_browser_modal_container);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.height = com.bumptech.glide.d.O(this, "com.pinterest.EXTRA_IAB_MODAL_HEIGHT", hf0.b.d(requireActivity()));
        findViewById.setLayoutParams(marginLayoutParams);
        if (com.bumptech.glide.d.G(this, "com.pinterest.EXTRA_IAB_MODAL_ALLOW_TOOLBAR_COLLAPSE", true)) {
            return;
        }
        CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) v13.findViewById(cs1.b.collapsing_toolbar);
        ViewGroup.LayoutParams layoutParams2 = collapsingToolbarLayout.getLayoutParams();
        AppBarLayout.LayoutParams layoutParams3 = null;
        AppBarLayout.LayoutParams layoutParams4 = layoutParams2 instanceof AppBarLayout.LayoutParams ? (AppBarLayout.LayoutParams) layoutParams2 : null;
        if (layoutParams4 != null) {
            layoutParams4.a();
            layoutParams3 = layoutParams4;
        }
        collapsingToolbarLayout.setLayoutParams(layoutParams3);
    }
}
