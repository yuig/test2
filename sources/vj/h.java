package vj;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.RoundedCorner;
import android.view.View;
import android.view.WindowInsets;
import com.google.android.material.internal.ClippableRoundedCornerLayout;
import com.google.android.material.search.SearchBar;
import ua.m0;

/* loaded from: classes3.dex */
public final class h extends a {

    /* renamed from: g, reason: collision with root package name */
    public final float f125903g;

    /* renamed from: h, reason: collision with root package name */
    public final float f125904h;

    /* renamed from: i, reason: collision with root package name */
    public float f125905i;

    /* renamed from: j, reason: collision with root package name */
    public Rect f125906j;

    /* renamed from: k, reason: collision with root package name */
    public Rect f125907k;

    /* renamed from: l, reason: collision with root package name */
    public Integer f125908l;

    public h(ClippableRoundedCornerLayout clippableRoundedCornerLayout) {
        super(clippableRoundedCornerLayout);
        Resources resources = clippableRoundedCornerLayout.getResources();
        this.f125903g = resources.getDimension(fj.e.m3_back_progress_main_container_min_edge_gap);
        this.f125904h = resources.getDimension(fj.e.m3_back_progress_main_container_max_translation_y);
    }

    public final AnimatorSet b(SearchBar searchBar) {
        AnimatorSet animatorSet = new AnimatorSet();
        View view = this.f125890b;
        animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 1.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_X, 0.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, 0.0f));
        animatorSet.addListener(new m0(1, this, searchBar));
        return animatorSet;
    }

    public final int c() {
        WindowInsets rootWindowInsets;
        RoundedCorner roundedCorner;
        RoundedCorner roundedCorner2;
        RoundedCorner roundedCorner3;
        RoundedCorner roundedCorner4;
        if (this.f125908l == null) {
            int[] iArr = new int[2];
            View view = this.f125890b;
            view.getLocationOnScreen(iArr);
            if (iArr[1] == 0 && Build.VERSION.SDK_INT >= 31 && (rootWindowInsets = view.getRootWindowInsets()) != null) {
                roundedCorner = rootWindowInsets.getRoundedCorner(0);
                int radius = roundedCorner != null ? roundedCorner.getRadius() : 0;
                roundedCorner2 = rootWindowInsets.getRoundedCorner(1);
                int max = Math.max(radius, roundedCorner2 != null ? roundedCorner2.getRadius() : 0);
                roundedCorner3 = rootWindowInsets.getRoundedCorner(3);
                int radius2 = roundedCorner3 != null ? roundedCorner3.getRadius() : 0;
                roundedCorner4 = rootWindowInsets.getRoundedCorner(2);
                r4 = Math.max(max, Math.max(radius2, roundedCorner4 != null ? roundedCorner4.getRadius() : 0));
            }
            this.f125908l = Integer.valueOf(r4);
        }
        return this.f125908l.intValue();
    }
}
