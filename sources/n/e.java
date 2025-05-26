package n;

import android.app.Activity;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.view.WindowMetrics;
import androidx.appcompat.widget.x1;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.internal.NavigationMenuView;
import com.google.android.material.navigation.NavigationView;
import com.pinterest.activity.create.CameraActivity;
import com.pinterest.ads.feature.owc.view.base.BaseAdsScrollingModule;
import com.pinterest.ads.feature.owc.view.collection.AdsProductView;
import com.pinterest.feature.pin.closeup.view.PinCloseupFragment;
import com.pinterest.feature.pin.create.view.HeaderCell;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.view.AnimatedContainer;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import tt0.l0;

/* loaded from: classes2.dex */
public final class e implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f88573a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f88574b;

    public /* synthetic */ e(Object obj, int i13) {
        this.f88573a = i13;
        this.f88574b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        Rect rect;
        WindowMetrics currentWindowMetrics;
        ViewTreeObserver viewTreeObserver;
        Activity activity = null;
        int i13 = this.f88573a;
        Object obj = this.f88574b;
        switch (i13) {
            case 0:
                i iVar = (i) obj;
                if (iVar.a()) {
                    ArrayList arrayList = iVar.f88614i;
                    if (arrayList.size() <= 0 || ((h) arrayList.get(0)).f88604a.f16396y) {
                        return;
                    }
                    View view = iVar.f88621p;
                    if (view == null || !view.isShown()) {
                        iVar.dismiss();
                        return;
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((h) it.next()).f88604a.k();
                    }
                    return;
                }
                return;
            case 1:
                f0 f0Var = (f0) obj;
                if (f0Var.a()) {
                    x1 x1Var = f0Var.f88585i;
                    if (x1Var.f16396y) {
                        return;
                    }
                    View view2 = f0Var.f88590n;
                    if (view2 == null || !view2.isShown()) {
                        f0Var.dismiss();
                        return;
                    } else {
                        x1Var.k();
                        return;
                    }
                }
                return;
            case 2:
                NavigationView navigationView = (NavigationView) obj;
                navigationView.getLocationOnScreen(navigationView.f32833k);
                int[] iArr = navigationView.f32833k;
                boolean z13 = iArr[1] == 0;
                com.google.android.material.internal.t tVar = navigationView.f32831i;
                if (tVar.f32800x != z13) {
                    tVar.f32800x = z13;
                    int i14 = (tVar.f32778b.getChildCount() <= 0 && tVar.f32800x) ? tVar.f32802z : 0;
                    NavigationMenuView navigationMenuView = tVar.f32777a;
                    navigationMenuView.setPadding(0, i14, 0, navigationMenuView.getPaddingBottom());
                }
                navigationView.f32687d = z13 && navigationView.f32836n;
                int i15 = iArr[0];
                navigationView.f32689f = i15 == 0 || navigationView.getWidth() + i15 == 0;
                Object context = navigationView.getContext();
                while (true) {
                    if (context instanceof ContextWrapper) {
                        if (context instanceof Activity) {
                            activity = (Activity) context;
                        } else {
                            context = ((ContextWrapper) context).getBaseContext();
                        }
                    }
                }
                if (activity != null) {
                    int i16 = Build.VERSION.SDK_INT;
                    WindowManager windowManager = (WindowManager) activity.getSystemService("window");
                    if (i16 >= 30) {
                        currentWindowMetrics = windowManager.getCurrentWindowMetrics();
                        rect = currentWindowMetrics.getBounds();
                    } else {
                        Display defaultDisplay = windowManager.getDefaultDisplay();
                        Point point = new Point();
                        defaultDisplay.getRealSize(point);
                        rect = new Rect();
                        rect.right = point.x;
                        rect.bottom = point.y;
                    }
                    navigationView.f32688e = (rect.height() - navigationView.getHeight() == iArr[1]) && (Color.alpha(activity.getWindow().getNavigationBarColor()) != 0) && navigationView.f32837o;
                    navigationView.f32690g = rect.width() == iArr[0] || rect.width() - navigationView.getWidth() == iArr[0];
                    return;
                }
                return;
            case 3:
                CameraActivity cameraActivity = (CameraActivity) obj;
                cameraActivity.f34897h.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                cameraActivity.setHeightOfCameraControls(cameraActivity.f34897h);
                return;
            case 4:
                androidx.appcompat.widget.q qVar = (androidx.appcompat.widget.q) obj;
                ((CameraActivity) qVar.f16669b).f34900k.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                CameraActivity cameraActivity2 = (CameraActivity) qVar.f16669b;
                cameraActivity2.setHeightOfCameraControls(cameraActivity2.f34896g);
                return;
            case 5:
                yq.i iVar2 = (yq.i) obj;
                iVar2.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                int width = iVar2.getWidth() - (iVar2.getResources().getDimensionPixelSize(fz1.b.pincodes_button_margin_horizontal) * 2);
                ViewGroup.LayoutParams layoutParams = iVar2.findViewById(fz1.d.loading_container).getLayoutParams();
                layoutParams.width = width;
                layoutParams.height = width;
                return;
            case 6:
                xs.g gVar = (xs.g) obj;
                gVar.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                cu.a aVar = gVar.f53211m;
                if (aVar != null) {
                    BaseAdsScrollingModule baseAdsScrollingModule = (BaseAdsScrollingModule) aVar;
                    baseAdsScrollingModule.V1();
                    baseAdsScrollingModule.U1();
                    baseAdsScrollingModule.b2();
                    baseAdsScrollingModule.c2();
                    return;
                }
                return;
            case 7:
                AdsProductView adsProductView = (AdsProductView) obj;
                adsProductView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                adsProductView.getViewTreeObserver().addOnScrollChangedListener((ViewTreeObserver.OnScrollChangedListener) adsProductView.f35351n.getValue());
                return;
            case 8:
                l0 l0Var = (l0) obj;
                GestaltText gestaltText = l0Var.f119183s0;
                if (gestaltText == null) {
                    Intrinsics.r("titleText");
                    throw null;
                }
                gestaltText.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                int i17 = l0Var.requireActivity().getResources().getDisplayMetrics().widthPixels;
                int[] iArr2 = new int[2];
                GestaltIconButton gestaltIconButton = l0Var.f119185u0;
                if (gestaltIconButton == null) {
                    Intrinsics.r("helpButton");
                    throw null;
                }
                gestaltIconButton.getLocationOnScreen(iArr2);
                int i18 = iArr2[0];
                GestaltIconButton gestaltIconButton2 = l0Var.f119185u0;
                if (gestaltIconButton2 == null) {
                    Intrinsics.r("helpButton");
                    throw null;
                }
                int width2 = gestaltIconButton2.getWidth() + i18;
                GestaltText gestaltText2 = l0Var.f119183s0;
                if (gestaltText2 == null) {
                    Intrinsics.r("titleText");
                    throw null;
                }
                ViewGroup.LayoutParams layoutParams2 = gestaltText2.getLayoutParams();
                layoutParams2.width = i17 - (width2 * 2);
                GestaltText gestaltText3 = l0Var.f119183s0;
                if (gestaltText3 != null) {
                    gestaltText3.setLayoutParams(layoutParams2);
                    return;
                } else {
                    Intrinsics.r("titleText");
                    throw null;
                }
            case 9:
                PinCloseupFragment pinCloseupFragment = (PinCloseupFragment) obj;
                int i19 = PinCloseupFragment.f46972m3;
                RecyclerView g83 = pinCloseupFragment.g8();
                if (g83 != null && (viewTreeObserver = g83.getViewTreeObserver()) != null) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                }
                PinCloseupFragment.m9(pinCloseupFragment);
                return;
            case 10:
                ((HeaderCell) obj).getViewTreeObserver().removeOnGlobalLayoutListener(this);
                return;
            default:
                AnimatedContainer animatedContainer = (AnimatedContainer) obj;
                animatedContainer.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                if (animatedContainer.f52668e == 0) {
                    animatedContainer.f52668e = animatedContainer.getHeight();
                    return;
                }
                return;
        }
    }
}
