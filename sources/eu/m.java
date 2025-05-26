package eu;

import android.R;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.pinterest.ads.feature.owc.view.collection.AdsProductView;
import com.pinterest.api.model.f30;
import com.pinterest.feature.browser.view.InAppBrowserView;
import com.pinterest.feature.closeup.view.LegoFloatingBottomActionBar;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.shuffles.composer.ui.widget.ActionMenu;
import df.j1;
import kotlin.jvm.internal.Intrinsics;
import rq.l2;
import rq.t4;

/* loaded from: classes3.dex */
public final class m extends nl2.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f60145b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f60146c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(int i13, Object obj, Object obj2) {
        super(obj);
        this.f60145b = i13;
        this.f60146c = obj2;
    }

    @Override // nl2.a
    public final void a(Object obj, rl2.u property, Object obj2) {
        int i13 = this.f60145b;
        Object obj3 = this.f60146c;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(property, "property");
                f30 f30Var = (f30) obj2;
                AdsProductView adsProductView = (AdsProductView) obj3;
                boolean z13 = adsProductView.f35353p;
                String z63 = f30Var.z6();
                if (z63 != null && z63.length() != 0) {
                    GestaltText gestaltText = adsProductView.f35345h;
                    if (gestaltText == null) {
                        Intrinsics.r("productTitle");
                        throw null;
                    }
                    gestaltText.i(new l2(z63, 16));
                }
                String J5 = f30Var.J5();
                if (J5 != null) {
                    Double K5 = f30Var.K5();
                    Intrinsics.checkNotNullExpressionValue(K5, "getPriceValue(...)");
                    double doubleValue = K5.doubleValue();
                    if (doubleValue > 0.0d) {
                        String concat = J5.concat(j1.Y("%.0f", new Object[]{Double.valueOf(doubleValue)}, null, 6));
                        FrameLayout frameLayout = (FrameLayout) adsProductView.findViewById(ps.p.product_price_background);
                        if (z13) {
                            bs1.c.X0(frameLayout);
                        } else {
                            bs1.c.U1(frameLayout);
                        }
                        GestaltText gestaltText2 = adsProductView.f35346i;
                        if (gestaltText2 != null) {
                            gestaltText2.i(new t4(z13, concat, 4));
                            return;
                        } else {
                            Intrinsics.r("productPrice");
                            throw null;
                        }
                    }
                    return;
                }
                return;
            case 1:
                Intrinsics.checkNotNullParameter(property, "property");
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                ((Boolean) obj).getClass();
                if (booleanValue) {
                    return;
                }
                LegoFloatingBottomActionBar legoFloatingBottomActionBar = ((InAppBrowserView) obj3).f45404q;
                if (legoFloatingBottomActionBar != null) {
                    bs1.c.X0(legoFloatingBottomActionBar);
                    return;
                } else {
                    Intrinsics.r("floatingBottomActionBar");
                    throw null;
                }
            case 2:
                Intrinsics.checkNotNullParameter(property, "property");
                View view = (View) obj2;
                ActionMenu actionMenu = (ActionMenu) obj3;
                if (actionMenu.f51883b) {
                    if (view == null) {
                        PopupWindow popupWindow = actionMenu.f51888g;
                        if (popupWindow != null) {
                            popupWindow.dismiss();
                        }
                        actionMenu.f51888g = null;
                        return;
                    }
                    CharSequence contentDescription = view.getContentDescription();
                    Intrinsics.checkNotNullExpressionValue(contentDescription, "getContentDescription(...)");
                    PopupWindow popupWindow2 = actionMenu.f51888g;
                    if (popupWindow2 == null) {
                        PopupWindow popupWindow3 = new PopupWindow(LayoutInflater.from(actionMenu.getContext()).inflate(h62.o.composer_view_action_menu_popup, (ViewGroup) null), -2, -2);
                        popupWindow3.setAnimationStyle(R.style.Animation.Dialog);
                        View contentView = popupWindow3.getContentView();
                        Intrinsics.g(contentView, "null cannot be cast to non-null type android.widget.TextView");
                        ((TextView) contentView).setTextColor(actionMenu.f51887f);
                        popupWindow3.setBackgroundDrawable(new bk.i(bk.o.c(actionMenu.getContext(), fj.l.ShapeAppearance_Material3_Corner_Small, 0).a()));
                        actionMenu.f51888g = popupWindow3;
                        popupWindow2 = popupWindow3;
                    }
                    View contentView2 = popupWindow2.getContentView();
                    Intrinsics.g(contentView2, "null cannot be cast to non-null type android.widget.TextView");
                    TextView textView = (TextView) contentView2;
                    textView.setText(contentDescription);
                    textView.measure(View.MeasureSpec.makeMeasureSpec(popupWindow2.getWidth(), 0), View.MeasureSpec.makeMeasureSpec(popupWindow2.getHeight(), 0));
                    int[] iArr = new int[2];
                    view.getLocationOnScreen(iArr);
                    int i14 = iArr[0];
                    int i15 = iArr[1];
                    popupWindow2.dismiss();
                    int measuredWidth = (i14 - textView.getMeasuredWidth()) - ((int) view.getX());
                    Context context = actionMenu.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    popupWindow2.showAtLocation(actionMenu, 0, measuredWidth - kg.a.g0(8, context), (view.getHeight() / 2) + (i15 - (textView.getMeasuredHeight() / 2)));
                    return;
                }
                return;
            case 3:
            default:
                Intrinsics.checkNotNullParameter(property, "property");
                ud2.c cVar = (ud2.c) obj;
                if (cVar != null) {
                    l3.c.N0(cVar);
                }
                ((ee2.d) obj3).f58816a = false;
                return;
            case 4:
                Intrinsics.checkNotNullParameter(property, "property");
                ((ce2.b) obj3).f27625e = false;
                return;
        }
    }
}
