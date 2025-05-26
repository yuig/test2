package com.pinterest.ads.feature.owc.view.base;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.o0;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.pinterest.gestalt.text.GestaltText;
import cu.i;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import q5.j;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/pinterest/ads/feature/owc/view/base/BaseAdsBottomSheetBehavior;", "Landroid/view/View;", "V", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "zq/a", "androidx/recyclerview/widget/o0", "ads_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public class BaseAdsBottomSheetBehavior<V extends View> extends BottomSheetBehavior<V> {

    /* renamed from: h0, reason: collision with root package name */
    public final boolean f35307h0;

    /* renamed from: i0, reason: collision with root package name */
    public j f35308i0;

    /* renamed from: j0, reason: collision with root package name */
    public i f35309j0;

    /* renamed from: k0, reason: collision with root package name */
    public boolean f35310k0;

    /* renamed from: l0, reason: collision with root package name */
    public boolean f35311l0;

    /* renamed from: m0, reason: collision with root package name */
    public float f35312m0;

    /* renamed from: n0, reason: collision with root package name */
    public float f35313n0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseAdsBottomSheetBehavior(Context context, AttributeSet attributeSet, boolean z13) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f35307h0 = z13;
        this.f35310k0 = true;
        this.f35311l0 = true;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean B(CoordinatorLayout parent, View child, MotionEvent event) {
        GestaltText gestaltText;
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(event, "event");
        this.f35309j0 = child instanceof i ? (i) child : null;
        if (event.getAction() == 1) {
            i iVar = this.f35309j0;
            GestaltText gestaltText2 = iVar != null ? iVar.f53205g : null;
            if (gestaltText2 != null) {
                int[] iArr = new int[2];
                gestaltText2.getLocationOnScreen(iArr);
                int i13 = iArr[0];
                int i14 = iArr[1];
                if (event.getRawX() >= i13 && event.getRawX() <= gestaltText2.getWidth() + i13 && event.getRawY() >= i14 && event.getRawY() <= gestaltText2.getHeight() + i14) {
                    i iVar2 = this.f35309j0;
                    if (iVar2 != null && (gestaltText = iVar2.f53205g) != null) {
                        gestaltText.performClick();
                    }
                    return true;
                }
            }
        }
        if (this.f35307h0) {
            int action = event.getAction();
            if (action == 0) {
                this.f35312m0 = event.getX();
                this.f35313n0 = event.getY();
            } else if (action == 1) {
                float x13 = this.f35312m0 - event.getX();
                float y13 = this.f35313n0 - event.getY();
                if (!getF35311l0() && (Math.abs(x13) < 200.0f || Math.abs(x13) < Math.abs(y13))) {
                    i iVar3 = this.f35309j0;
                    if (iVar3 != null) {
                        iVar3.o();
                    }
                    return true;
                }
            }
        } else {
            try {
                j jVar = this.f35308i0;
                if (jVar != null) {
                    jVar.a(event);
                }
            } catch (NullPointerException unused) {
            }
        }
        if (getF35311l0()) {
            return super.B(parent, child, event);
        }
        return true;
    }

    /* renamed from: g0, reason: from getter */
    public boolean getF35294o0() {
        return this.f35310k0;
    }

    /* renamed from: h0, reason: from getter */
    public boolean getF35311l0() {
        return this.f35311l0;
    }

    public void i0(boolean z13) {
        this.f35310k0 = z13;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean k(CoordinatorLayout parent, View child, MotionEvent event) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(event, "event");
        boolean z13 = false;
        if (this.f35307h0) {
            if (this.L == 4 && event.getY() >= child.getY()) {
                z13 = true;
            }
            i0(z13);
            return getF35294o0();
        }
        int actionMasked = event.getActionMasked();
        if (actionMasked == 0) {
            if (this.L == 4 && event.getY() >= child.getY()) {
                z13 = true;
            }
            i0(z13);
            this.f35308i0 = new j(parent.getContext(), new o0(this));
        } else if (actionMasked == 1 || actionMasked == 3) {
            i0(false);
        }
        return getF35294o0();
    }
}
