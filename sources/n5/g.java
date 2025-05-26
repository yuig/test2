package n5;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.firebase.messaging.a0;
import com.pinterest.feature.ideaPinCreation.camera.view.IdeaPinCreationCameraBottomBarControlsView;
import com.pinterest.feature.ideaPinCreation.camera.view.sidebar.CameraSidebarControlsView;
import com.pinterest.kit.view.RoundedMaskView;
import kotlin.jvm.internal.Intrinsics;
import tt0.l0;

/* loaded from: classes3.dex */
public final class g implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f89220a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f89221b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f89222c;

    public g(n nVar, View view) {
        this.f89222c = nVar;
        this.f89221b = view;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        Rect rect;
        int i13 = this.f89220a;
        Object obj = this.f89222c;
        View view = this.f89221b;
        switch (i13) {
            case 0:
                n nVar = (n) obj;
                if (nVar.f89240f.f()) {
                    return false;
                }
                view.getViewTreeObserver().removeOnPreDrawListener(this);
                h1.b splashScreenViewProvider = nVar.f89242h;
                if (splashScreenViewProvider == null) {
                    return true;
                }
                Intrinsics.checkNotNullParameter(splashScreenViewProvider, "splashScreenViewProvider");
                a0 a0Var = nVar.f89241g;
                if (a0Var == null) {
                    return true;
                }
                nVar.f89241g = null;
                ((q) splashScreenViewProvider.f66449b).c().postOnAnimation(new w2.c(2, splashScreenViewProvider, a0Var));
                return true;
            default:
                view.getViewTreeObserver().removeOnPreDrawListener(this);
                l0 l0Var = (l0) obj;
                int i14 = l0.Z0;
                View view2 = l0Var.getView();
                if (view2 != null) {
                    fp0.d dVar = l0Var.f119189y0;
                    if (dVar == null) {
                        Intrinsics.r("cameraView");
                        throw null;
                    }
                    if (dVar.h()) {
                        fp0.d dVar2 = l0Var.f119189y0;
                        if (dVar2 == null) {
                            Intrinsics.r("cameraView");
                            throw null;
                        }
                        rect = dVar2.c();
                    } else {
                        LinearLayout linearLayout = l0Var.M0;
                        if (linearLayout == null) {
                            Intrinsics.r("missingPermissionContainer");
                            throw null;
                        }
                        if (bs1.c.o1(linearLayout)) {
                            LinearLayout linearLayout2 = l0Var.M0;
                            if (linearLayout2 == null) {
                                Intrinsics.r("missingPermissionContainer");
                                throw null;
                            }
                            int left = linearLayout2.getLeft();
                            LinearLayout linearLayout3 = l0Var.M0;
                            if (linearLayout3 == null) {
                                Intrinsics.r("missingPermissionContainer");
                                throw null;
                            }
                            int top = linearLayout3.getTop();
                            LinearLayout linearLayout4 = l0Var.M0;
                            if (linearLayout4 == null) {
                                Intrinsics.r("missingPermissionContainer");
                                throw null;
                            }
                            int right = linearLayout4.getRight();
                            LinearLayout linearLayout5 = l0Var.M0;
                            if (linearLayout5 == null) {
                                Intrinsics.r("missingPermissionContainer");
                                throw null;
                            }
                            rect = new Rect(left, top, right, linearLayout5.getBottom());
                        }
                    }
                    IdeaPinCreationCameraBottomBarControlsView ideaPinCreationCameraBottomBarControlsView = l0Var.H0;
                    if (ideaPinCreationCameraBottomBarControlsView == null) {
                        Intrinsics.r("cameraBottomBarControls");
                        throw null;
                    }
                    if (Rect.intersects(rect, new Rect(ideaPinCreationCameraBottomBarControlsView.getLeft(), ideaPinCreationCameraBottomBarControlsView.getTop(), ideaPinCreationCameraBottomBarControlsView.getRight(), ideaPinCreationCameraBottomBarControlsView.getBottom()))) {
                        float height = (rect.bottom - r8.top) / r8.height();
                        if (0.0f > height || height > 0.5f) {
                            IdeaPinCreationCameraBottomBarControlsView ideaPinCreationCameraBottomBarControlsView2 = l0Var.H0;
                            if (ideaPinCreationCameraBottomBarControlsView2 == null) {
                                Intrinsics.r("cameraBottomBarControls");
                                throw null;
                            }
                            ViewGroup.LayoutParams layoutParams = ideaPinCreationCameraBottomBarControlsView2.getLayoutParams();
                            if (layoutParams == null) {
                                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                            }
                            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
                            layoutParams2.f17673j = -1;
                            layoutParams2.f17675k = aq1.d.camera_segments;
                            ideaPinCreationCameraBottomBarControlsView2.setLayoutParams(layoutParams2);
                            CameraSidebarControlsView cameraSidebarControlsView = l0Var.I0;
                            if (cameraSidebarControlsView == null) {
                                Intrinsics.r("cameraSidebarControls");
                                throw null;
                            }
                            ViewGroup.LayoutParams layoutParams3 = cameraSidebarControlsView.getLayoutParams();
                            if (layoutParams3 == null) {
                                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                            }
                            ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams3;
                            layoutParams4.f17673j = -1;
                            IdeaPinCreationCameraBottomBarControlsView ideaPinCreationCameraBottomBarControlsView3 = l0Var.H0;
                            if (ideaPinCreationCameraBottomBarControlsView3 == null) {
                                Intrinsics.r("cameraBottomBarControls");
                                throw null;
                            }
                            layoutParams4.f17675k = ideaPinCreationCameraBottomBarControlsView3.getId();
                            cameraSidebarControlsView.setLayoutParams(layoutParams4);
                        } else {
                            RoundedMaskView roundedMaskView = l0Var.f119188x0;
                            if (roundedMaskView == null) {
                                Intrinsics.r("maskView");
                                throw null;
                            }
                            ViewGroup.LayoutParams layoutParams5 = roundedMaskView.getLayoutParams();
                            if (layoutParams5 == null) {
                                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                            }
                            ConstraintLayout.LayoutParams layoutParams6 = (ConstraintLayout.LayoutParams) layoutParams5;
                            layoutParams6.G = null;
                            IdeaPinCreationCameraBottomBarControlsView ideaPinCreationCameraBottomBarControlsView4 = l0Var.H0;
                            if (ideaPinCreationCameraBottomBarControlsView4 == null) {
                                Intrinsics.r("cameraBottomBarControls");
                                throw null;
                            }
                            layoutParams6.f17675k = ideaPinCreationCameraBottomBarControlsView4.getId();
                            roundedMaskView.setLayoutParams(layoutParams6);
                        }
                        RoundedMaskView roundedMaskView2 = l0Var.f119188x0;
                        if (roundedMaskView2 == null) {
                            Intrinsics.r("maskView");
                            throw null;
                        }
                        if (roundedMaskView2.getMeasuredHeight() > view2.getMeasuredHeight()) {
                            RoundedMaskView roundedMaskView3 = l0Var.f119188x0;
                            if (roundedMaskView3 == null) {
                                Intrinsics.r("maskView");
                                throw null;
                            }
                            ViewGroup.LayoutParams layoutParams7 = roundedMaskView3.getLayoutParams();
                            if (layoutParams7 == null) {
                                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                            }
                            ConstraintLayout.LayoutParams layoutParams8 = (ConstraintLayout.LayoutParams) layoutParams7;
                            layoutParams8.G = null;
                            layoutParams8.f17677l = 0;
                            roundedMaskView3.setLayoutParams(layoutParams8);
                        }
                    } else {
                        RoundedMaskView roundedMaskView4 = l0Var.f119188x0;
                        if (roundedMaskView4 == null) {
                            Intrinsics.r("maskView");
                            throw null;
                        }
                        ViewGroup.LayoutParams layoutParams9 = roundedMaskView4.getLayoutParams();
                        if (layoutParams9 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                        }
                        ConstraintLayout.LayoutParams layoutParams10 = (ConstraintLayout.LayoutParams) layoutParams9;
                        layoutParams10.G = null;
                        IdeaPinCreationCameraBottomBarControlsView ideaPinCreationCameraBottomBarControlsView5 = l0Var.H0;
                        if (ideaPinCreationCameraBottomBarControlsView5 == null) {
                            Intrinsics.r("cameraBottomBarControls");
                            throw null;
                        }
                        layoutParams10.f17675k = ideaPinCreationCameraBottomBarControlsView5.getId();
                        roundedMaskView4.setLayoutParams(layoutParams10);
                    }
                }
                return true;
        }
    }

    public g(View view, l0 l0Var) {
        this.f89221b = view;
        this.f89222c = l0Var;
    }
}
