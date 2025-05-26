package k91;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.pinterest.api.model.wy0;
import com.pinterest.feature.settings.account.view.AccountConversionView;
import com.pinterest.gestalt.toolbar.GestaltToolbarImpl;
import h32.d4;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m60.r0;
import rm1.q;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lk91/g;", "Lyk1/k;", "Ll91/c;", "<init>", "()V", "account_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class g extends n implements l91.c {

    /* renamed from: n0, reason: collision with root package name */
    public static final /* synthetic */ int f78829n0 = 0;

    /* renamed from: j0, reason: collision with root package name */
    public uk1.e f78830j0;

    /* renamed from: k0, reason: collision with root package name */
    public AccountConversionView f78831k0;

    /* renamed from: l0, reason: collision with root package name */
    public p91.g f78832l0;

    /* renamed from: m0, reason: collision with root package name */
    public final d4 f78833m0 = d4.CONVERT_TO_BUSINESS;

    @Override // nl1.d
    public final void S7(fo1.a toolbar) {
        Drawable drawable;
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        int dimensionPixelSize = getResources().getDimensionPixelSize(r0.header_view_back_icon_size);
        q qVar = q.CANCEL;
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        Context requireContext2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
        int drawableRes = qVar.drawableRes(requireContext, dl2.b.f1(requireContext2));
        Context context = requireContext();
        Intrinsics.checkNotNullExpressionValue(context, "requireContext(...)");
        int i13 = eo1.b.color_themed_text_default;
        Intrinsics.checkNotNullParameter(context, "context");
        Object obj = d5.a.f53679a;
        Drawable drawable2 = context.getDrawable(drawableRes);
        Intrinsics.checkNotNullParameter(context, "context");
        BitmapDrawable bitmapDrawable = null;
        if (drawable2 != null) {
            drawable = sh.f.d(i13 == 0 ? context.getColor(df0.a.f54892a) : context.getColor(i13), context, drawable2);
        } else {
            drawable = null;
        }
        if (drawable != null) {
            Resources resources = getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            bitmapDrawable = d7.b.p0(drawable, resources, dimensionPixelSize, dimensionPixelSize);
        }
        String string = getString(c52.e.close);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        ((GestaltToolbarImpl) toolbar).T(bitmapDrawable, string);
    }

    @Override // yk1.k
    public final yk1.m V7() {
        uk1.e eVar = this.f78830j0;
        if (eVar != null) {
            return new p91.g(((uk1.a) eVar).g(), p7(), f7());
        }
        Intrinsics.r("presenterPinalyticsFactory");
        throw null;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getF22576s0() {
        return this.f78833m0;
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.E = b52.b.fragment_account_conversion;
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        View findViewById = onCreateView.findViewById(b52.a.account_conversion);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f78831k0 = (AccountConversionView) findViewById;
        return onCreateView;
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        AccountConversionView accountConversionView = this.f78831k0;
        if (accountConversionView == null) {
            Intrinsics.r("accountConversionView");
            throw null;
        }
        accountConversionView.d0(c52.e.account_conversion_personal_to_business_setting_description);
        accountConversionView.Z(b52.c.account_conversion_personal_to_business_full_description);
        wy0 f13 = ((b60.d) getActiveUserManager()).f();
        if (f13 != null) {
            accountConversionView.g0(q91.c.TO_BUSINESS, f13, q.BUILDING_BUSINESS);
        }
        accountConversionView.X(b52.c.account_conversion_personal_to_business_confirm_button);
        accountConversionView.a0(q.DIRECTIONAL_ARROW_RIGHT);
        accountConversionView.L(new x61.e(this, 23));
    }
}
