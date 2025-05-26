package lr;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import com.pinterest.design.brio.widget.voice.toast.PinterestToastContainer;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.gestalt.toast.GestaltToast;
import com.pinterest.navigation.Navigation;
import com.pinterest.screens.o1;
import df.j1;
import h32.b3;
import h32.f1;
import h32.u0;
import kh2.u2;
import kotlin.jvm.internal.Intrinsics;
import m60.x0;

/* loaded from: classes3.dex */
public final class c extends we0.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f84478d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final String f84479e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f84480f;

    /* renamed from: g, reason: collision with root package name */
    public final String f84481g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f84482h;

    public c(String str, String str2, String str3, boolean z13) {
        this.f84479e = str;
        this.f84481g = str2;
        this.f84482h = str3;
        this.f84480f = z13;
    }

    @Override // we0.a
    public final GestaltToast a(PinterestToastContainer container) {
        do1.b bVar;
        int i13 = this.f84478d;
        int i14 = 3;
        boolean z13 = this.f84480f;
        switch (i13) {
            case 0:
                String string = z13 ? container.getContext().getString(x0.you_followed) : container.getContext().getString(x0.you_unfollowed);
                String str = this.f84481g;
                String X = j1.X("%s %s", string, str);
                SpannableString spannableString = new SpannableString(X);
                spannableString.setSpan(new StyleSpan(1), X.indexOf(str), X.length(), 33);
                GestaltToast gestaltToast = new GestaltToast(container.getContext());
                gestaltToast.v(new yq.k(i14, this, spannableString));
                return gestaltToast;
            default:
                Intrinsics.checkNotNullParameter(container, "container");
                Context context = container.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                CharSequence a03 = j1.a0(this.f84479e);
                Intrinsics.checkNotNullExpressionValue(a03, "fromHtml(...)");
                u50.f0 p23 = bs1.c.p2(a03);
                do1.l lVar = new do1.l(new rm1.f(rm1.q.CAMERA, rm1.i.MD));
                if (z13) {
                    String string2 = container.getResources().getString(x0.try_it);
                    Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                    bVar = new do1.b(bs1.c.p2(string2), new v(this, i14));
                } else {
                    bVar = null;
                }
                GestaltToast gestaltToast2 = new GestaltToast(context, new do1.d(p23, lVar, bVar, null, 0, 0, 0, null, false, 504));
                Object obj = this.f84482h;
                if (z13) {
                    ((nx.d0) obj).h0((r18 & 1) != 0 ? f1.TAP : f1.RENDER, (r18 & 2) != 0 ? null : u0.VIRTUAL_TRY_ON_READY_TOAST, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                } else {
                    ((nx.d0) obj).h0((r18 & 1) != 0 ? f1.TAP : f1.RENDER, (r18 & 2) != 0 ? null : u0.VIRTUAL_TRY_ON_DOWNLOAD_TOAST, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                }
                return gestaltToast2;
        }
    }

    @Override // we0.a
    public final void b(Context context) {
        switch (this.f84478d) {
            case 0:
                m60.w wVar = m60.u.f85943a;
                ScreenLocation screenLocation = (ScreenLocation) o1.f51168a.getValue();
                String str = this.f84479e;
                wVar.d(Navigation.z0(screenLocation, str));
                u0 u0Var = u0.HOMEFEED_BUILDER_FOLLOW_TOAST;
                b3 toastType = b3.BOARD_FOLLOW;
                Intrinsics.checkNotNullParameter(toastType, "toastType");
                u2.a1(u0Var, str, toastType);
                break;
            default:
                super.b(context);
                break;
        }
    }

    public c(String text, boolean z13, nx.d0 pinalytics, String str) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        this.f84479e = text;
        this.f84480f = z13;
        this.f84482h = pinalytics;
        this.f84481g = str;
    }
}
