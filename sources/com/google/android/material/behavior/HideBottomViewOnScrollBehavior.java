package com.google.android.material.behavior;

import ads_mobile_sdk.ci1$$ExternalSyntheticThrowCCEIfNotNull0;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.appcompat.widget.d;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import fj.c;
import gj.a;
import java.util.Iterator;
import java.util.LinkedHashSet;
import tb.f;

/* loaded from: classes3.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {

    /* renamed from: j, reason: collision with root package name */
    public static final int f32228j = c.motionDurationLong2;

    /* renamed from: k, reason: collision with root package name */
    public static final int f32229k = c.motionDurationMedium4;

    /* renamed from: l, reason: collision with root package name */
    public static final int f32230l = c.motionEasingEmphasizedInterpolator;

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f32231a;

    /* renamed from: b, reason: collision with root package name */
    public int f32232b;

    /* renamed from: c, reason: collision with root package name */
    public int f32233c;

    /* renamed from: d, reason: collision with root package name */
    public TimeInterpolator f32234d;

    /* renamed from: e, reason: collision with root package name */
    public TimeInterpolator f32235e;

    /* renamed from: f, reason: collision with root package name */
    public int f32236f;

    /* renamed from: g, reason: collision with root package name */
    public int f32237g;

    /* renamed from: h, reason: collision with root package name */
    public int f32238h;

    /* renamed from: i, reason: collision with root package name */
    public ViewPropertyAnimator f32239i;

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f32231a = new LinkedHashSet();
        this.f32236f = 0;
        this.f32237g = 2;
        this.f32238h = 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i13) {
        this.f32236f = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        this.f32232b = f.c0(view.getContext(), f32228j, RecyclerViewTypes.VIEW_TYPE_STORY_SELECT_OR_REORDER_PINS);
        this.f32233c = f.c0(view.getContext(), f32229k, RecyclerViewTypes.VIEW_TYPE_GMA_NATIVE_AD_VIDEO_FULL_SPAN);
        Context context = view.getContext();
        q6.c cVar = a.f65170d;
        int i14 = f32230l;
        this.f32234d = f.d0(context, i14, cVar);
        this.f32235e = f.d0(view.getContext(), i14, a.f65169c);
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void t(CoordinatorLayout coordinatorLayout, View view, View view2, int i13, int i14, int i15, int i16, int i17, int[] iArr) {
        int i18 = 3;
        LinkedHashSet linkedHashSet = this.f32231a;
        if (i14 > 0) {
            if (this.f32237g == 1) {
                return;
            }
            ViewPropertyAnimator viewPropertyAnimator = this.f32239i;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            this.f32237g = 1;
            Iterator it = linkedHashSet.iterator();
            if (it.hasNext()) {
                ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(it.next());
                throw null;
            }
            this.f32239i = view.animate().translationY(this.f32236f + this.f32238h).setInterpolator(this.f32235e).setDuration(this.f32233c).setListener(new d(this, i18));
            return;
        }
        if (i14 >= 0 || this.f32237g == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator2 = this.f32239i;
        if (viewPropertyAnimator2 != null) {
            viewPropertyAnimator2.cancel();
            view.clearAnimation();
        }
        this.f32237g = 2;
        Iterator it2 = linkedHashSet.iterator();
        if (it2.hasNext()) {
            ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(it2.next());
            throw null;
        }
        this.f32239i = view.animate().translationY(0).setInterpolator(this.f32234d).setDuration(this.f32232b).setListener(new d(this, i18));
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean y(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i13, int i14) {
        return i13 == 2;
    }

    public HideBottomViewOnScrollBehavior() {
        this.f32231a = new LinkedHashSet();
        this.f32236f = 0;
        this.f32237g = 2;
        this.f32238h = 0;
    }
}
