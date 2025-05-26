package n5;

import android.R;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.HorizontalScrollView;
import androidx.recyclerview.widget.o2;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.firebase.messaging.a0;
import com.pinterest.activity.newshub.view.header.NewsHubSectionHeader;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.f30;
import com.pinterest.collage.cutoutpicker.closeup.components.CutoutEditorView;
import com.pinterest.feature.pin.closeup.view.PinCloseupFragment;
import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.toolbar.GestaltToolbarImpl;
import com.pinterest.ui.actionbar.LegoActionBar;
import com.pinterest.ui.grid.PinterestRecyclerView;
import com.pinterest.video.core.view.PinterestVideoView;
import ey.m4;
import java.lang.ref.WeakReference;
import jy.x;
import kh2.b0;
import kotlin.jvm.internal.Intrinsics;
import oq.m0;
import oq.x0;
import rg0.k0;
import rq.k3;
import rq.w4;
import tq.y;

/* loaded from: classes3.dex */
public final class h implements View.OnLayoutChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f89223a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f89224b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f89225c;

    public /* synthetic */ h(int i13, Object obj, Object obj2) {
        this.f89223a = i13;
        this.f89224b = obj;
        this.f89225c = obj2;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i23) {
        String str;
        x0 x0Var;
        w4 w4Var;
        w4 w4Var2;
        int i24 = this.f89223a;
        int i25 = 3;
        Object obj = this.f89225c;
        Object obj2 = this.f89224b;
        switch (i24) {
            case 0:
                Intrinsics.checkNotNullParameter(view, "view");
                if (view.isAttachedToWindow()) {
                    view.removeOnLayoutChangeListener(this);
                    n nVar = (n) obj2;
                    if (nVar.f89240f.f()) {
                        nVar.f89242h = (h1.b) obj;
                        return;
                    }
                    h1.b splashScreenViewProvider = (h1.b) obj;
                    Intrinsics.checkNotNullParameter(splashScreenViewProvider, "splashScreenViewProvider");
                    a0 a0Var = nVar.f89241g;
                    if (a0Var == null) {
                        return;
                    }
                    nVar.f89241g = null;
                    ((q) splashScreenViewProvider.f66449b).c().postOnAnimation(new w2.c(2, splashScreenViewProvider, a0Var));
                    return;
                }
                return;
            case 1:
                view.removeOnLayoutChangeListener(this);
                ((k3) obj2).f109341d.w6(((m0) obj).getHeight());
                return;
            case 2:
                view.removeOnLayoutChangeListener(this);
                CutoutEditorView cutoutEditorView = (CutoutEditorView) obj2;
                u62.c cVar = ((sa0.a) obj).f112157a;
                int i26 = CutoutEditorView.f44626e;
                if (cVar != null) {
                    cutoutEditorView.f44628b.n(cVar);
                    return;
                } else {
                    cutoutEditorView.getClass();
                    return;
                }
            case 3:
                view.removeOnLayoutChangeListener(this);
                GestaltToolbarImpl gestaltToolbarImpl = (GestaltToolbarImpl) ((fo1.a) obj2);
                gestaltToolbarImpl.H();
                int width = gestaltToolbarImpl.v().getWidth();
                NewsHubSectionHeader newsHubSectionHeader = ((kx0.o) obj).Y0;
                if (newsHubSectionHeader != null) {
                    newsHubSectionHeader.f34975a.setPaddingRelative(0, 0, width, 0);
                    newsHubSectionHeader.f34976b.setPaddingRelative(0, 0, width, 0);
                    return;
                }
                return;
            case 4:
                view.removeOnLayoutChangeListener(this);
                b01.n nVar2 = (b01.n) obj2;
                b01.l lVar = (b01.l) obj;
                View findViewById = lVar.requireActivity().getWindow().findViewById(R.id.content);
                Bitmap Q1 = b0.Q1(nVar2, null, findViewById != null ? findViewById.getHeight() : -1, 1);
                if (Q1 != null) {
                    lVar.j9();
                    Context requireContext = lVar.requireContext();
                    Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                    str = e01.a.a(requireContext, Q1);
                } else {
                    str = null;
                }
                if (str == null || str.length() == 0) {
                    i92.k kVar = lVar.T0;
                    if (kVar == null) {
                        Intrinsics.r("toastUtils");
                        throw null;
                    }
                    Context context = nVar2.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    kVar.i(bs1.c.d2(context, m60.x0.generic_error));
                } else {
                    lVar.f20756l1 = str;
                    e01.a j93 = lVar.j9();
                    Context requireContext2 = lVar.requireContext();
                    Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
                    j93.d(requireContext2, str);
                }
                ep.b.C(null, lVar.f7());
                return;
            case 5:
                view.removeOnLayoutChangeListener(this);
                PinCloseupFragment pinCloseupFragment = (PinCloseupFragment) obj2;
                x0 x0Var2 = pinCloseupFragment.f46997i2;
                if (x0Var2 != null) {
                    x0Var2.J1(pinCloseupFragment.o9());
                }
                x0 x0Var3 = pinCloseupFragment.f46997i2;
                if (x0Var3 != null) {
                    x0Var3.O1(pinCloseupFragment.o9());
                }
                x0 x0Var4 = pinCloseupFragment.f46997i2;
                if (x0Var4 != null) {
                    x0Var4.H1(pinCloseupFragment.o9());
                }
                f30 f30Var = (f30) obj;
                if (f30Var == null || !b40.b1(f30Var) || (x0Var = pinCloseupFragment.f46997i2) == null) {
                    return;
                }
                pinCloseupFragment.o9();
                x0Var.z1();
                return;
            case 6:
                if (i19 != 0 || i15 <= 0 || i23 != 0 || i16 <= 0) {
                    return;
                }
                ((y) obj2).removeOnLayoutChangeListener(this);
                PinCloseupFragment pinCloseupFragment2 = (PinCloseupFragment) obj;
                int i27 = PinCloseupFragment.f46972m3;
                String f49940b = pinCloseupFragment2.u9().getF49940b();
                Intrinsics.checkNotNullExpressionValue(f49940b, "getId(...)");
                new x(pinCloseupFragment2.getF20758n1(), pinCloseupFragment2.f46998i3, f49940b).i();
                pinCloseupFragment2.P1.c(Boolean.TRUE);
                x0 x0Var5 = pinCloseupFragment2.f46997i2;
                if (x0Var5 != null && (w4Var = x0Var5.K) != null) {
                    w4Var.j();
                }
                if (view != null) {
                    view.post(new b11.n(pinCloseupFragment2, i25));
                    return;
                }
                return;
            case 7:
                if (i19 != 0 || i15 <= 0 || i23 != 0 || i16 <= 0) {
                    return;
                }
                ((x0) obj2).removeOnLayoutChangeListener(this);
                PinCloseupFragment pinCloseupFragment3 = (PinCloseupFragment) obj;
                int i28 = PinCloseupFragment.f46972m3;
                String pinUid = pinCloseupFragment3.u9().getF49940b();
                Intrinsics.checkNotNullExpressionValue(pinUid, "getId(...)");
                f30 pin = pinCloseupFragment3.getPin();
                if (pin == null || !b40.P0(pin)) {
                    Intrinsics.checkNotNullParameter(pinUid, "pinUid");
                    new jy.m(pinUid).i();
                } else {
                    Intrinsics.checkNotNullParameter(pinUid, "pinUid");
                    new m4(pinUid).i();
                }
                pinCloseupFragment3.P1.c(Boolean.TRUE);
                x0 x0Var6 = pinCloseupFragment3.f46997i2;
                if (x0Var6 != null && (w4Var2 = x0Var6.K) != null) {
                    w4Var2.j();
                }
                if (view != null) {
                    view.post(new b11.n(pinCloseupFragment3, 4));
                    return;
                }
                return;
            case 8:
                view.removeOnLayoutChangeListener(this);
                ((HorizontalScrollView) obj2).setScrollX(((x61.j) obj).f133946a);
                return;
            case 9:
                SbaPinRep sbaPinRep = (SbaPinRep) obj2;
                PinterestRecyclerView gridViewSafe$default = SbaPinRep.getGridViewSafe$default(sbaPinRep, false, 1, null);
                if (gridViewSafe$default != null) {
                    gridViewSafe$default.b((o2) obj);
                    sbaPinRep.removeOnLayoutChangeListener(this);
                    return;
                }
                return;
            case 10:
                Intrinsics.checkNotNullParameter(view, "view");
                if (i16 - i14 > i23 - i18) {
                    ((View) obj2).removeOnLayoutChangeListener(this);
                    int i29 = jq1.n.H1;
                    BottomSheetBehavior bottomSheetBehavior = ((jq1.n) obj).D9().f27255n;
                    if (bottomSheetBehavior == null) {
                        return;
                    }
                    bottomSheetBehavior.X(3);
                    return;
                }
                return;
            case 11:
                view.removeOnLayoutChangeListener(this);
                s42.a aVar = (s42.a) ((WeakReference) obj2).get();
                if (aVar != null) {
                    ((v42.c) aVar).S0 = ((v42.m) obj).getHeight();
                    return;
                }
                return;
            case 12:
                view.removeOnLayoutChangeListener(this);
                view.getLayoutParams().width = (int) (view.getHeight() * ((k0) obj2).f108043c);
                ((PinterestVideoView) obj).play();
                return;
            default:
                view.removeOnLayoutChangeListener(this);
                ((GestaltButton) obj2).setMaxWidth(LegoActionBar.a((LegoActionBar) obj));
                return;
        }
    }
}
