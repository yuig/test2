package oe0;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import com.pinterest.design.brio.widget.voice.PinterestVoiceLayout;
import df.j1;
import kh2.k3;
import ve0.q;

/* loaded from: classes5.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final int f94231a;

    /* renamed from: b, reason: collision with root package name */
    public final int f94232b;

    /* renamed from: c, reason: collision with root package name */
    public final int f94233c;

    /* renamed from: d, reason: collision with root package name */
    public final int f94234d;

    /* renamed from: e, reason: collision with root package name */
    public final int f94235e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f94236f = new int[2];

    /* renamed from: g, reason: collision with root package name */
    public final Rect f94237g = new Rect();

    public g(Resources resources) {
        this.f94231a = resources.getDimensionPixelSize(eo1.c.voice_layout_default_width);
        this.f94232b = resources.getDimensionPixelSize(eo1.c.voice_layout_top_margin);
        this.f94233c = resources.getDimensionPixelSize(eo1.c.voice_layout_bottom_margin);
        this.f94234d = resources.getDimensionPixelSize(eo1.c.voice_layout_anchor_center_threshold);
        this.f94235e = (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics());
    }

    public static void c(PinterestVoiceLayout pinterestVoiceLayout, float f13, float f14, int i13, j jVar) {
        ve0.b bVar = pinterestVoiceLayout.d().f125690d;
        if (bVar == ve0.b.BOTTOM_LEFT || bVar == ve0.b.BOTTOM_RIGHT || bVar == ve0.b.BOTTOM_CENTER) {
            f14 = -f14;
        }
        float translationY = pinterestVoiceLayout.getTranslationY();
        pinterestVoiceLayout.setTranslationY(f14 + translationY);
        pinterestVoiceLayout.setAlpha(f13);
        ViewPropertyAnimator duration = pinterestVoiceLayout.animate().translationY(translationY).alpha(1.0f).setDuration(i13);
        if (jVar != null) {
            duration.setListener(jVar);
        }
    }

    public final boolean a(PinterestVoiceLayout pinterestVoiceLayout, e eVar, Rect rect, int i13, int[] iArr, int i14, int i15, boolean z13, boolean z14, f fVar) {
        int i16 = iArr[0];
        int i17 = iArr[1];
        int i18 = i17 + i15;
        Rect rect2 = this.f94237g;
        rect2.set(i16, i17, i16 + i14, i18);
        int centerX = eVar.ordinal() != 1 ? rect2.centerX() : j1.Y0(pinterestVoiceLayout.getContext()) ? rect2.right : rect2.left;
        if (rect != null) {
            if (rect.equals(rect2)) {
                return false;
            }
            rect.set(rect2);
        }
        DisplayMetrics displayMetrics = pinterestVoiceLayout.getContext().getResources().getDisplayMetrics();
        int i19 = displayMetrics.widthPixels;
        int i23 = i19 / 2;
        boolean z15 = i18 <= displayMetrics.heightPixels / 2;
        int i24 = this.f94235e;
        int min = Math.min((((i19 - i24) - i24) - this.f94231a) / 2, this.f94234d);
        ve0.b bVar = centerX < i23 - min ? z15 ? ve0.b.TOP_LEFT : ve0.b.BOTTOM_LEFT : centerX > min + i23 ? z15 ? ve0.b.TOP_RIGHT : ve0.b.BOTTOM_RIGHT : z15 ? ve0.b.TOP_CENTER : ve0.b.BOTTOM_CENTER;
        pinterestVoiceLayout.g(bVar);
        ViewGroup.LayoutParams layoutParams = pinterestVoiceLayout.getLayoutParams();
        layoutParams.width = i13;
        if (z13 || pinterestVoiceLayout.getHeight() == 0) {
            pinterestVoiceLayout.getViewTreeObserver().addOnGlobalLayoutListener(new d(this, pinterestVoiceLayout, bVar, layoutParams, i23, i19, centerX, z15, iArr, i14, i15, z14, fVar));
            return true;
        }
        d(pinterestVoiceLayout, bVar, layoutParams, i23, i19, centerX, z15, iArr, i14, i15, z14, fVar);
        return true;
    }

    public final boolean b(PinterestVoiceLayout pinterestVoiceLayout, View view, e eVar, Rect rect, int i13, boolean z13, boolean z14, f fVar) {
        ViewParent parent = pinterestVoiceLayout.getParent();
        if ((parent instanceof ViewGroup ? (ViewGroup) parent : null) == null) {
            return false;
        }
        int[] iArr = this.f94236f;
        view.getLocationOnScreen(iArr);
        return a(pinterestVoiceLayout, eVar, rect, i13, iArr, view.getWidth(), view.getHeight(), z13, z14, fVar);
    }

    public final void d(PinterestVoiceLayout pinterestVoiceLayout, ve0.b bVar, ViewGroup.LayoutParams layoutParams, int i13, int i14, int i15, boolean z13, int[] iArr, int i16, int i17, boolean z14, f fVar) {
        int i18;
        int i19;
        int i23;
        boolean z15 = true;
        pinterestVoiceLayout.setTranslationY((z13 ? (iArr[1] + i17) + this.f94232b : (iArr[1] - pinterestVoiceLayout.getHeight()) - this.f94233c) - k3.G(pinterestVoiceLayout.getContext()));
        boolean z16 = pinterestVoiceLayout.getContext().getResources().getConfiguration().getLayoutDirection() == 1;
        int i24 = iArr[0];
        int i25 = (i14 - i24) - i16;
        if (z16) {
            i24 = i25;
        }
        int i26 = i24 + i16;
        ve0.b bVar2 = ve0.b.BOTTOM_CENTER;
        if (bVar == bVar2 || bVar == ve0.b.TOP_CENTER) {
            i18 = (i24 - (layoutParams.width / 2)) + (i16 / 2);
        } else {
            if (!z16 ? i15 <= i13 : i15 >= i13) {
                z15 = false;
            }
            i18 = z15 ? i26 - layoutParams.width : i24;
            if (pinterestVoiceLayout.d() instanceof q) {
                Context context = pinterestVoiceLayout.getContext();
                int i27 = q.f125739m;
                int Q = j1.Q(context, 24);
                if (z15) {
                    int i28 = Q - (i16 / 2);
                    if (i26 + i28 < i14) {
                        i18 += i28;
                    }
                } else {
                    int i29 = ((i16 / 2) - Q) + i24;
                    if (i29 < i18) {
                        i18 = i29;
                    }
                }
            }
        }
        int i33 = layoutParams.width;
        int i34 = i18 + i33;
        int i35 = this.f94235e;
        if (z14) {
            if (i18 < 0) {
                int i36 = i33 + i18;
                layoutParams.width = i36;
                if (bVar == bVar2 || bVar == ve0.b.TOP_CENTER) {
                    i19 = i24 - (i36 / 2);
                    i23 = i16 / 2;
                    i18 = i23 + i19 + i35;
                }
                i18 = i35;
            } else if (i34 > i14) {
                layoutParams.width = i33 - (i34 - i14);
            }
        } else if (i18 < i35) {
            if (i18 < 0) {
                layoutParams.width = (i18 - i35) + i33;
            }
            if (bVar == bVar2 || bVar == ve0.b.TOP_CENTER) {
                i19 = i24 - (layoutParams.width / 2);
                i23 = i16 / 2;
                i18 = i23 + i19 + i35;
            }
            i18 = i35;
        } else if (i34 > i14 - i35 && i34 > i14) {
            layoutParams.width = i33 - ((i34 - i14) + i35);
        }
        pinterestVoiceLayout.setLayoutParams(layoutParams);
        if (z16) {
            pinterestVoiceLayout.setTranslationX(i18 * (-1));
        } else {
            pinterestVoiceLayout.setTranslationX(i18);
        }
        pinterestVoiceLayout.postInvalidate();
        if (fVar != null) {
            fVar.b();
        }
    }
}
