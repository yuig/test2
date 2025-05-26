package com.google.android.material.search;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.d0;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.internal.ClippableRoundedCornerLayout;
import com.google.android.material.internal.TouchObserverFrameLayout;
import com.google.android.material.internal.e0;
import com.google.android.material.internal.v;
import java.util.WeakHashMap;
import lb.l0;
import mj.m;
import q5.v0;
import ua.f0;

/* loaded from: classes3.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final SearchView f33002a;

    /* renamed from: b, reason: collision with root package name */
    public final View f33003b;

    /* renamed from: c, reason: collision with root package name */
    public final ClippableRoundedCornerLayout f33004c;

    /* renamed from: d, reason: collision with root package name */
    public final FrameLayout f33005d;

    /* renamed from: e, reason: collision with root package name */
    public final FrameLayout f33006e;

    /* renamed from: f, reason: collision with root package name */
    public final MaterialToolbar f33007f;

    /* renamed from: g, reason: collision with root package name */
    public final Toolbar f33008g;

    /* renamed from: h, reason: collision with root package name */
    public final TextView f33009h;

    /* renamed from: i, reason: collision with root package name */
    public final EditText f33010i;

    /* renamed from: j, reason: collision with root package name */
    public final ImageButton f33011j;

    /* renamed from: k, reason: collision with root package name */
    public final View f33012k;

    /* renamed from: l, reason: collision with root package name */
    public final TouchObserverFrameLayout f33013l;

    /* renamed from: m, reason: collision with root package name */
    public final vj.h f33014m;

    /* renamed from: n, reason: collision with root package name */
    public AnimatorSet f33015n;

    /* renamed from: o, reason: collision with root package name */
    public SearchBar f33016o;

    public k(SearchView searchView) {
        this.f33002a = searchView;
        this.f33003b = searchView.f32959a;
        ClippableRoundedCornerLayout clippableRoundedCornerLayout = searchView.f32960b;
        this.f33004c = clippableRoundedCornerLayout;
        this.f33005d = searchView.f32963e;
        this.f33006e = searchView.f32964f;
        this.f33007f = searchView.f32965g;
        this.f33008g = searchView.f32966h;
        this.f33009h = searchView.f32967i;
        this.f33010i = searchView.f32968j;
        this.f33011j = searchView.f32969k;
        this.f33012k = searchView.f32970l;
        this.f33013l = searchView.f32971m;
        this.f33014m = new vj.h(clippableRoundedCornerLayout);
    }

    public static void a(k kVar, float f13) {
        ActionMenuView a13;
        kVar.f33011j.setAlpha(f13);
        kVar.f33012k.setAlpha(f13);
        kVar.f33013l.setAlpha(f13);
        if (!kVar.f33002a.f32981w || (a13 = e0.a(kVar.f33007f)) == null) {
            return;
        }
        a13.setAlpha(f13);
    }

    public final void b(AnimatorSet animatorSet) {
        ImageButton b13 = e0.b(this.f33007f);
        if (b13 == null) {
            return;
        }
        Drawable C1 = l0.C1(b13.getDrawable());
        if (!this.f33002a.f32980v) {
            if (C1 instanceof j.d) {
                ((j.d) C1).setProgress(1.0f);
            }
            if (C1 instanceof com.google.android.material.internal.e) {
                ((com.google.android.material.internal.e) C1).a(1.0f);
                return;
            }
            return;
        }
        if (C1 instanceof j.d) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new androidx.media3.ui.c((j.d) C1, 4));
            animatorSet.playTogether(ofFloat);
        }
        if (C1 instanceof com.google.android.material.internal.e) {
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat2.addUpdateListener(new androidx.media3.ui.c((com.google.android.material.internal.e) C1, 5));
            animatorSet.playTogether(ofFloat2);
        }
    }

    public final AnimatorSet c(boolean z13) {
        int i13 = 1;
        AnimatorSet animatorSet = new AnimatorSet();
        MaterialToolbar materialToolbar = this.f33007f;
        ImageButton b13 = e0.b(materialToolbar);
        if (b13 != null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f(b13), 0.0f);
            ofFloat.addUpdateListener(new sa.b(new m(i13), new View[]{b13}));
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(g(), 0.0f);
            ofFloat2.addUpdateListener(sa.b.a(b13));
            animatorSet.playTogether(ofFloat, ofFloat2);
        }
        ActionMenuView a13 = e0.a(materialToolbar);
        if (a13 != null) {
            ValueAnimator ofFloat3 = ValueAnimator.ofFloat(e(a13), 0.0f);
            ofFloat3.addUpdateListener(new sa.b(new m(i13), new View[]{a13}));
            ValueAnimator ofFloat4 = ValueAnimator.ofFloat(g(), 0.0f);
            ofFloat4.addUpdateListener(sa.b.a(a13));
            animatorSet.playTogether(ofFloat3, ofFloat4);
        }
        animatorSet.setDuration(z13 ? 300L : 250L);
        animatorSet.setInterpolator(v.a(z13, gj.a.f65168b));
        return animatorSet;
    }

    public final AnimatorSet d(boolean z13) {
        AnimatorSet animatorSet = new AnimatorSet();
        if (this.f33015n == null) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            b(animatorSet2);
            animatorSet2.setDuration(z13 ? 300L : 250L);
            animatorSet2.setInterpolator(v.a(z13, gj.a.f65168b));
            animatorSet.playTogether(animatorSet2, c(z13));
        }
        Animator[] animatorArr = new Animator[9];
        Interpolator interpolator = z13 ? gj.a.f65167a : gj.a.f65168b;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(z13 ? 300L : 250L);
        ofFloat.setInterpolator(v.a(z13, interpolator));
        int i13 = 4;
        ofFloat.addUpdateListener(new sa.b(new m(i13), new View[]{this.f33003b}));
        animatorArr[0] = ofFloat;
        vj.h hVar = this.f33014m;
        Rect rect = hVar.f125906j;
        Rect rect2 = hVar.f125907k;
        SearchView searchView = this.f33002a;
        if (rect == null) {
            rect = new Rect(searchView.getLeft(), searchView.getTop(), searchView.getRight(), searchView.getBottom());
        }
        ClippableRoundedCornerLayout clippableRoundedCornerLayout = this.f33004c;
        if (rect2 == null) {
            rect2 = l0.B(clippableRoundedCornerLayout, this.f33016o);
        }
        final Rect rect3 = new Rect(rect2);
        final float l13 = this.f33016o.f32954j0.l();
        final float max = Math.max(clippableRoundedCornerLayout.f32668b, hVar.c());
        ValueAnimator ofObject = ValueAnimator.ofObject(new f0(1, rect3), rect2, rect);
        ofObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.search.h
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                k kVar = k.this;
                kVar.getClass();
                float a13 = gj.a.a(l13, max, valueAnimator.getAnimatedFraction());
                ClippableRoundedCornerLayout clippableRoundedCornerLayout2 = kVar.f33004c;
                clippableRoundedCornerLayout2.getClass();
                Rect rect4 = rect3;
                clippableRoundedCornerLayout2.a(rect4.left, rect4.top, rect4.right, rect4.bottom, a13);
            }
        });
        ofObject.setDuration(z13 ? 300L : 250L);
        q6.b bVar = gj.a.f65168b;
        ofObject.setInterpolator(v.a(z13, bVar));
        animatorArr[1] = ofObject;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat2.setDuration(z13 ? 50L : 42L);
        ofFloat2.setStartDelay(z13 ? 250L : 0L);
        LinearInterpolator linearInterpolator = gj.a.f65167a;
        ofFloat2.setInterpolator(v.a(z13, linearInterpolator));
        ofFloat2.addUpdateListener(new sa.b(new m(i13), new View[]{this.f33011j}));
        animatorArr[2] = ofFloat2;
        AnimatorSet animatorSet3 = new AnimatorSet();
        Animator[] animatorArr2 = new Animator[3];
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat3.setDuration(z13 ? 150L : 83L);
        ofFloat3.setStartDelay(z13 ? 75L : 0L);
        ofFloat3.setInterpolator(v.a(z13, linearInterpolator));
        View view = this.f33012k;
        TouchObserverFrameLayout touchObserverFrameLayout = this.f33013l;
        ofFloat3.addUpdateListener(new sa.b(new m(i13), new View[]{view, touchObserverFrameLayout}));
        animatorArr2[0] = ofFloat3;
        ValueAnimator ofFloat4 = ValueAnimator.ofFloat((touchObserverFrameLayout.getHeight() * 0.050000012f) / 2.0f, 0.0f);
        ofFloat4.setDuration(z13 ? 300L : 250L);
        ofFloat4.setInterpolator(v.a(z13, bVar));
        ofFloat4.addUpdateListener(sa.b.a(view));
        animatorArr2[1] = ofFloat4;
        ValueAnimator ofFloat5 = ValueAnimator.ofFloat(0.95f, 1.0f);
        ofFloat5.setDuration(z13 ? 300L : 250L);
        ofFloat5.setInterpolator(v.a(z13, bVar));
        ofFloat5.addUpdateListener(new sa.b(new m(3), new View[]{touchObserverFrameLayout}));
        animatorArr2[2] = ofFloat5;
        animatorSet3.playTogether(animatorArr2);
        animatorArr[3] = animatorSet3;
        animatorArr[4] = i(this.f33005d, z13, false);
        Toolbar toolbar = this.f33008g;
        animatorArr[5] = i(toolbar, z13, false);
        ValueAnimator ofFloat6 = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat6.setDuration(z13 ? 300L : 250L);
        ofFloat6.setInterpolator(v.a(z13, bVar));
        if (searchView.f32981w) {
            ofFloat6.addUpdateListener(new com.google.android.material.internal.f(e0.a(toolbar), e0.a(this.f33007f)));
        }
        animatorArr[6] = ofFloat6;
        animatorArr[7] = i(this.f33010i, z13, true);
        animatorArr[8] = i(this.f33009h, z13, true);
        animatorSet.playTogether(animatorArr);
        animatorSet.addListener(new d0(this, z13, 1));
        return animatorSet;
    }

    public final int e(View view) {
        int marginEnd = ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).getMarginEnd();
        return l0.H0(this.f33016o) ? this.f33016o.getLeft() - marginEnd : (this.f33016o.getRight() - this.f33002a.getWidth()) + marginEnd;
    }

    public final int f(View view) {
        int marginStart = ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).getMarginStart();
        SearchBar searchBar = this.f33016o;
        WeakHashMap weakHashMap = v0.f102521a;
        int paddingStart = searchBar.getPaddingStart();
        return l0.H0(this.f33016o) ? ((this.f33016o.getWidth() - this.f33016o.getRight()) + marginStart) - paddingStart : (this.f33016o.getLeft() - marginStart) + paddingStart;
    }

    public final int g() {
        FrameLayout frameLayout = this.f33006e;
        return ((this.f33016o.getBottom() + this.f33016o.getTop()) / 2) - ((frameLayout.getBottom() + frameLayout.getTop()) / 2);
    }

    public final AnimatorSet h(boolean z13) {
        AnimatorSet animatorSet = new AnimatorSet();
        ClippableRoundedCornerLayout clippableRoundedCornerLayout = this.f33004c;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(clippableRoundedCornerLayout.getHeight(), 0.0f);
        ofFloat.addUpdateListener(sa.b.a(clippableRoundedCornerLayout));
        animatorSet.playTogether(ofFloat);
        b(animatorSet);
        animatorSet.setInterpolator(v.a(z13, gj.a.f65168b));
        animatorSet.setDuration(z13 ? 350L : 300L);
        return animatorSet;
    }

    public final AnimatorSet i(View view, boolean z13, boolean z14) {
        int i13 = 1;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(z14 ? f(view) : e(view), 0.0f);
        ofFloat.addUpdateListener(new sa.b(new m(i13), new View[]{view}));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(g(), 0.0f);
        ofFloat2.addUpdateListener(sa.b.a(view));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofFloat, ofFloat2);
        animatorSet.setDuration(z13 ? 300L : 250L);
        animatorSet.setInterpolator(v.a(z13, gj.a.f65168b));
        return animatorSet;
    }

    public final AnimatorSet j() {
        SearchBar searchBar = this.f33016o;
        SearchView searchView = this.f33002a;
        if (searchBar != null) {
            if (searchView.g()) {
                searchView.f();
            }
            AnimatorSet d2 = d(false);
            d2.addListener(new j(this, 1));
            d2.start();
            return d2;
        }
        if (searchView.g()) {
            searchView.f();
        }
        AnimatorSet h10 = h(false);
        h10.addListener(new j(this, 3));
        h10.start();
        return h10;
    }
}
