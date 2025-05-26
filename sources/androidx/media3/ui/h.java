package androidx.media3.ui;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import com.pinterest.feature.closeup.view.PinCloseupFloatingActionBarBehavior;
import com.pinterest.feature.pin.closeup.view.PinCloseupFragment;
import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;
import kotlin.jvm.internal.Intrinsics;
import rh1.v1;

/* loaded from: classes3.dex */
public final /* synthetic */ class h implements View.OnLayoutChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19038a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f19039b;

    public /* synthetic */ h(Object obj, int i13) {
        this.f19038a = i13;
        this.f19039b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i23) {
        int height;
        int height2;
        int i24 = this.f19038a;
        Object obj = this.f19039b;
        switch (i24) {
            case 0:
                PlayerControlView playerControlView = (PlayerControlView) obj;
                float[] fArr = PlayerControlView.U;
                playerControlView.getClass();
                int i25 = i16 - i14;
                int i26 = i23 - i18;
                if (i15 - i13 != i19 - i17 || i25 != i26) {
                    PopupWindow popupWindow = playerControlView.f18965i;
                    if (popupWindow.isShowing()) {
                        playerControlView.i();
                        int width = playerControlView.getWidth() - popupWindow.getWidth();
                        int i27 = playerControlView.f18966j;
                        popupWindow.update(view, width - i27, (-popupWindow.getHeight()) - i27, -1, -1);
                        break;
                    }
                }
                break;
            case 1:
                x xVar = (x) obj;
                PlayerControlView playerControlView2 = xVar.f19116a;
                int width2 = (playerControlView2.getWidth() - playerControlView2.getPaddingLeft()) - playerControlView2.getPaddingRight();
                int height3 = (playerControlView2.getHeight() - playerControlView2.getPaddingBottom()) - playerControlView2.getPaddingTop();
                ViewGroup viewGroup = xVar.f19118c;
                int c13 = x.c(viewGroup) - (viewGroup != null ? viewGroup.getPaddingRight() + viewGroup.getPaddingLeft() : 0);
                if (viewGroup == null) {
                    height = 0;
                } else {
                    height = viewGroup.getHeight();
                    ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
                    if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        height += marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
                    }
                }
                int paddingBottom = height - (viewGroup != null ? viewGroup.getPaddingBottom() + viewGroup.getPaddingTop() : 0);
                int max = Math.max(c13, x.c(xVar.f19126k) + x.c(xVar.f19124i));
                ViewGroup viewGroup2 = xVar.f19119d;
                if (viewGroup2 == null) {
                    height2 = 0;
                } else {
                    height2 = viewGroup2.getHeight();
                    ViewGroup.LayoutParams layoutParams2 = viewGroup2.getLayoutParams();
                    if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                        height2 += marginLayoutParams2.topMargin + marginLayoutParams2.bottomMargin;
                    }
                }
                boolean z13 = width2 <= max || height3 <= (height2 * 2) + paddingBottom;
                if (xVar.A != z13) {
                    xVar.A = z13;
                    view.post(new s(xVar, 5));
                }
                boolean z14 = i15 - i13 != i19 - i17;
                if (!xVar.A && z14) {
                    view.post(new s(xVar, 6));
                    break;
                }
                break;
            case 2:
                PinCloseupFloatingActionBarBehavior this$0 = (PinCloseupFloatingActionBarBehavior) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                View view2 = this$0.f45472m;
                if (view2 != null) {
                    if (i13 != i17 || i14 != i18) {
                        this$0.C(view2);
                        break;
                    }
                }
                break;
            case 3:
                PinCloseupFragment this$02 = (PinCloseupFragment) obj;
                int i28 = PinCloseupFragment.f46972m3;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                if (view != null) {
                    view.getLocationInWindow(this$02.f47006l2);
                }
                int i29 = this$02.f47006l2[1];
                break;
            case 4:
                v1 this$03 = (v1) obj;
                int i33 = v1.S0;
                Intrinsics.checkNotNullParameter(this$03, "this$0");
                if (i18 - i23 != i14 - i16) {
                    this$03.i8();
                    break;
                }
                break;
            default:
                SbaPinRep.addMediaViewabilityLayoutChangeListener$lambda$74((SbaPinRep) obj, view, i13, i14, i15, i16, i17, i18, i19, i23);
                break;
        }
    }
}
