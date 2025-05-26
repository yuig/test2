package com.google.android.material.search;

import a.cb;
import ads_mobile_sdk.ci1$$ExternalSyntheticThrowCCEIfNotNull0;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.internal.ClippableRoundedCornerLayout;
import com.google.android.material.internal.TouchObserverFrameLayout;
import com.google.android.material.internal.e0;
import com.google.android.material.internal.v;
import fj.l;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import lb.l0;
import n.o;
import q5.m0;
import q5.v0;

/* loaded from: classes3.dex */
public class SearchView extends FrameLayout implements androidx.coordinatorlayout.widget.a, vj.b {
    public static final int B = l.Widget_Material3_SearchView;
    public HashMap A;

    /* renamed from: a, reason: collision with root package name */
    public final View f32959a;

    /* renamed from: b, reason: collision with root package name */
    public final ClippableRoundedCornerLayout f32960b;

    /* renamed from: c, reason: collision with root package name */
    public final View f32961c;

    /* renamed from: d, reason: collision with root package name */
    public final View f32962d;

    /* renamed from: e, reason: collision with root package name */
    public final FrameLayout f32963e;

    /* renamed from: f, reason: collision with root package name */
    public final FrameLayout f32964f;

    /* renamed from: g, reason: collision with root package name */
    public final MaterialToolbar f32965g;

    /* renamed from: h, reason: collision with root package name */
    public final Toolbar f32966h;

    /* renamed from: i, reason: collision with root package name */
    public final TextView f32967i;

    /* renamed from: j, reason: collision with root package name */
    public final EditText f32968j;

    /* renamed from: k, reason: collision with root package name */
    public final ImageButton f32969k;

    /* renamed from: l, reason: collision with root package name */
    public final View f32970l;

    /* renamed from: m, reason: collision with root package name */
    public final TouchObserverFrameLayout f32971m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f32972n;

    /* renamed from: o, reason: collision with root package name */
    public final k f32973o;

    /* renamed from: p, reason: collision with root package name */
    public final vj.f f32974p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f32975q;

    /* renamed from: r, reason: collision with root package name */
    public final rj.a f32976r;

    /* renamed from: s, reason: collision with root package name */
    public final LinkedHashSet f32977s;

    /* renamed from: t, reason: collision with root package name */
    public SearchBar f32978t;

    /* renamed from: u, reason: collision with root package name */
    public int f32979u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f32980v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f32981w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f32982x;

    /* renamed from: y, reason: collision with root package name */
    public final int f32983y;

    /* renamed from: z, reason: collision with root package name */
    public g f32984z;

    public static class Behavior extends CoordinatorLayout.Behavior<SearchView> {
        public Behavior(@NonNull Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
            SearchView searchView = (SearchView) view;
            int i13 = 0;
            if (searchView.f32978t == null && (view2 instanceof SearchBar)) {
                SearchBar searchBar = (SearchBar) view2;
                searchView.f32978t = searchBar;
                searchView.f32973o.f33016o = searchBar;
                if (searchBar != null) {
                    searchBar.setOnClickListener(new c(searchView, i13));
                    if (Build.VERSION.SDK_INT >= 34) {
                        try {
                            searchBar.setHandwritingDelegatorCallback(new d(searchView, 0));
                            searchView.f32968j.setIsHandwritingDelegate(true);
                        } catch (LinkageError unused) {
                        }
                    }
                }
                MaterialToolbar materialToolbar = searchView.f32965g;
                if (materialToolbar != null && !(l0.C1(materialToolbar.o()) instanceof j.d)) {
                    int i14 = fj.f.ic_arrow_back_black_24;
                    if (searchView.f32978t == null) {
                        materialToolbar.A(com.bumptech.glide.c.I(materialToolbar.getContext(), i14));
                    } else {
                        Drawable mutate = com.bumptech.glide.c.I(searchView.getContext(), i14).mutate();
                        Integer num = materialToolbar.U;
                        if (num != null) {
                            mutate.setTint(num.intValue());
                        }
                        materialToolbar.A(new com.google.android.material.internal.e(searchView.f32978t.o(), mutate));
                        searchView.o();
                    }
                }
                searchView.k();
                searchView.n(searchView.f32984z);
            }
            return false;
        }

        public Behavior() {
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new f();

        /* renamed from: c, reason: collision with root package name */
        public String f32985c;

        /* renamed from: d, reason: collision with root package name */
        public int f32986d;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f32985c = parcel.readString();
            this.f32986d = parcel.readInt();
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i13) {
            super.writeToParcel(parcel, i13);
            parcel.writeString(this.f32985c);
            parcel.writeInt(this.f32986d);
        }
    }

    public SearchView(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, fj.c.materialSearchViewStyle);
    }

    @Override // androidx.coordinatorlayout.widget.a
    public final CoordinatorLayout.Behavior a() {
        return new Behavior();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i13, ViewGroup.LayoutParams layoutParams) {
        if (this.f32972n) {
            this.f32971m.addView(view, i13, layoutParams);
        } else {
            super.addView(view, i13, layoutParams);
        }
    }

    @Override // vj.b
    public final void b() {
        int i13 = 2;
        if (h() || this.f32978t == null || Build.VERSION.SDK_INT < 34) {
            return;
        }
        k kVar = this.f32973o;
        SearchBar searchBar = kVar.f33016o;
        vj.h hVar = kVar.f33014m;
        if (hVar.a() != null) {
            AnimatorSet b13 = hVar.b(searchBar);
            View view = hVar.f125890b;
            if (view instanceof ClippableRoundedCornerLayout) {
                ClippableRoundedCornerLayout clippableRoundedCornerLayout = (ClippableRoundedCornerLayout) view;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(clippableRoundedCornerLayout.f32668b, hVar.c());
                ofFloat.addUpdateListener(new androidx.media3.ui.c(clippableRoundedCornerLayout, i13));
                b13.playTogether(ofFloat);
            }
            b13.setDuration(hVar.f125893e);
            b13.start();
            hVar.f125905i = 0.0f;
            hVar.f125906j = null;
            hVar.f125907k = null;
        }
        AnimatorSet animatorSet = kVar.f33015n;
        if (animatorSet != null) {
            animatorSet.reverse();
        }
        kVar.f33015n = null;
    }

    @Override // vj.b
    public final void c(androidx.activity.b bVar) {
        if (h() || this.f32978t == null) {
            return;
        }
        k kVar = this.f32973o;
        SearchBar searchBar = kVar.f33016o;
        vj.h hVar = kVar.f33014m;
        hVar.f125894f = bVar;
        View view = hVar.f125890b;
        hVar.f125906j = new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        if (searchBar != null) {
            hVar.f125907k = l0.B(view, searchBar);
        }
        hVar.f125905i = bVar.f15874b;
    }

    @Override // vj.b
    public final void d(androidx.activity.b bVar) {
        if (h() || this.f32978t == null || Build.VERSION.SDK_INT < 34) {
            return;
        }
        k kVar = this.f32973o;
        kVar.getClass();
        float f13 = bVar.f15875c;
        if (f13 <= 0.0f) {
            return;
        }
        SearchBar searchBar = kVar.f33016o;
        float l13 = searchBar.f32954j0.l();
        vj.h hVar = kVar.f33014m;
        if (hVar.f125894f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() before updateBackProgress()");
        }
        androidx.activity.b bVar2 = hVar.f125894f;
        hVar.f125894f = bVar;
        if (bVar2 != null) {
            if (searchBar.getVisibility() != 4) {
                searchBar.setVisibility(4);
            }
            boolean z13 = bVar.f15876d == 0;
            float interpolation = hVar.f125889a.getInterpolation(f13);
            View view = hVar.f125890b;
            float width = view.getWidth();
            float height = view.getHeight();
            if (width > 0.0f && height > 0.0f) {
                float a13 = gj.a.a(1.0f, 0.9f, interpolation);
                float a14 = cb.a(width, 0.9f, width, 2.0f);
                float f14 = hVar.f125903g;
                float a15 = gj.a.a(0.0f, Math.max(0.0f, a14 - f14), interpolation) * (z13 ? 1 : -1);
                float min = Math.min(Math.max(0.0f, ((height - (a13 * height)) / 2.0f) - f14), hVar.f125904h);
                float f15 = bVar.f15874b - hVar.f125905i;
                float a16 = gj.a.a(0.0f, min, Math.abs(f15) / height) * Math.signum(f15);
                view.setScaleX(a13);
                view.setScaleY(a13);
                view.setTranslationX(a15);
                view.setTranslationY(a16);
                if (view instanceof ClippableRoundedCornerLayout) {
                    ((ClippableRoundedCornerLayout) view).a(r12.getLeft(), r12.getTop(), r12.getRight(), r12.getBottom(), gj.a.a(hVar.c(), l13, interpolation));
                }
            }
        }
        AnimatorSet animatorSet = kVar.f33015n;
        if (animatorSet != null) {
            animatorSet.setCurrentPlayTime((long) (f13 * animatorSet.getDuration()));
            return;
        }
        SearchView searchView = kVar.f33002a;
        if (searchView.g()) {
            searchView.f();
        }
        if (searchView.f32980v) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            kVar.b(animatorSet2);
            animatorSet2.setDuration(250L);
            animatorSet2.setInterpolator(v.a(false, gj.a.f65168b));
            kVar.f33015n = animatorSet2;
            animatorSet2.start();
            kVar.f33015n.pause();
        }
    }

    @Override // vj.b
    public final void e() {
        if (h()) {
            return;
        }
        k kVar = this.f32973o;
        vj.h hVar = kVar.f33014m;
        androidx.activity.b bVar = hVar.f125894f;
        hVar.f125894f = null;
        if (Build.VERSION.SDK_INT < 34 || this.f32978t == null || bVar == null) {
            if (this.f32984z.equals(g.HIDDEN) || this.f32984z.equals(g.HIDING)) {
                return;
            }
            kVar.j();
            return;
        }
        long totalDuration = kVar.j().getTotalDuration();
        SearchBar searchBar = kVar.f33016o;
        vj.h hVar2 = kVar.f33014m;
        AnimatorSet b13 = hVar2.b(searchBar);
        b13.setDuration(totalDuration);
        b13.start();
        hVar2.f125905i = 0.0f;
        hVar2.f125906j = null;
        hVar2.f125907k = null;
        if (kVar.f33015n != null) {
            kVar.c(false).start();
            kVar.f33015n.resume();
        }
        kVar.f33015n = null;
    }

    public final void f() {
        this.f32968j.post(new d(this, 2));
    }

    public final boolean g() {
        return this.f32979u == 48;
    }

    public final boolean h() {
        return this.f32984z.equals(g.HIDDEN) || this.f32984z.equals(g.HIDING);
    }

    public final void i() {
        if (this.f32982x) {
            this.f32968j.postDelayed(new d(this, 1), 100L);
        }
    }

    public final void j(g gVar, boolean z13) {
        if (this.f32984z.equals(gVar)) {
            return;
        }
        if (z13) {
            if (gVar == g.SHOWN) {
                ViewGroup viewGroup = (ViewGroup) getRootView();
                this.A = new HashMap(viewGroup.getChildCount());
                m(viewGroup, true);
            } else if (gVar == g.HIDDEN) {
                m((ViewGroup) getRootView(), false);
                this.A = null;
            }
        }
        this.f32984z = gVar;
        Iterator it = new LinkedHashSet(this.f32977s).iterator();
        if (it.hasNext()) {
            ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(it.next());
            throw null;
        }
        n(gVar);
    }

    public final void k() {
        float dimension;
        View view;
        SearchBar searchBar = this.f32978t;
        if (searchBar != null) {
            bk.i iVar = searchBar.f32954j0;
            if (iVar != null) {
                dimension = iVar.f23052a.f23043n;
            } else {
                WeakHashMap weakHashMap = v0.f102521a;
                dimension = m0.e(searchBar);
            }
        } else {
            dimension = getResources().getDimension(fj.e.m3_searchview_elevation);
        }
        rj.a aVar = this.f32976r;
        if (aVar == null || (view = this.f32961c) == null) {
            return;
        }
        view.setBackgroundColor(aVar.b(this.f32983y, dimension));
    }

    public final void l() {
        if (this.f32984z.equals(g.SHOWN)) {
            return;
        }
        g gVar = this.f32984z;
        g gVar2 = g.SHOWING;
        if (gVar.equals(gVar2)) {
            return;
        }
        final k kVar = this.f32973o;
        SearchBar searchBar = kVar.f33016o;
        final int i13 = 1;
        ClippableRoundedCornerLayout clippableRoundedCornerLayout = kVar.f33004c;
        SearchView searchView = kVar.f33002a;
        if (searchBar == null) {
            if (searchView.g()) {
                searchView.postDelayed(new d(searchView, 3), 150L);
            }
            clippableRoundedCornerLayout.setVisibility(4);
            clippableRoundedCornerLayout.post(new Runnable() { // from class: com.google.android.material.search.i
                @Override // java.lang.Runnable
                public final void run() {
                    int i14 = i13;
                    k kVar2 = kVar;
                    switch (i14) {
                        case 0:
                            AnimatorSet d2 = kVar2.d(true);
                            d2.addListener(new j(kVar2, 0));
                            d2.start();
                            break;
                        default:
                            kVar2.f33004c.setTranslationY(r0.getHeight());
                            AnimatorSet h10 = kVar2.h(true);
                            h10.addListener(new j(kVar2, 2));
                            h10.start();
                            break;
                    }
                }
            });
            return;
        }
        if (searchView.g()) {
            searchView.i();
        }
        searchView.j(gVar2, true);
        Toolbar toolbar = kVar.f33008g;
        o n13 = toolbar.n();
        if (n13 != null) {
            n13.clear();
        }
        int i14 = kVar.f33016o.f32952h0;
        final int i15 = 0;
        if (i14 == -1 || !searchView.f32981w) {
            toolbar.setVisibility(8);
        } else {
            toolbar.q(i14);
            ActionMenuView a13 = e0.a(toolbar);
            if (a13 != null) {
                for (int i16 = 0; i16 < a13.getChildCount(); i16++) {
                    View childAt = a13.getChildAt(i16);
                    childAt.setClickable(false);
                    childAt.setFocusable(false);
                    childAt.setFocusableInTouchMode(false);
                }
            }
            toolbar.setVisibility(0);
        }
        CharSequence text = kVar.f33016o.U.getText();
        EditText editText = kVar.f33010i;
        editText.setText(text);
        editText.setSelection(editText.getText().length());
        clippableRoundedCornerLayout.setVisibility(4);
        clippableRoundedCornerLayout.post(new Runnable() { // from class: com.google.android.material.search.i
            @Override // java.lang.Runnable
            public final void run() {
                int i142 = i15;
                k kVar2 = kVar;
                switch (i142) {
                    case 0:
                        AnimatorSet d2 = kVar2.d(true);
                        d2.addListener(new j(kVar2, 0));
                        d2.start();
                        break;
                    default:
                        kVar2.f33004c.setTranslationY(r0.getHeight());
                        AnimatorSet h10 = kVar2.h(true);
                        h10.addListener(new j(kVar2, 2));
                        h10.start();
                        break;
                }
            }
        });
    }

    public final void m(ViewGroup viewGroup, boolean z13) {
        for (int i13 = 0; i13 < viewGroup.getChildCount(); i13++) {
            View childAt = viewGroup.getChildAt(i13);
            if (childAt != this) {
                if (childAt.findViewById(this.f32960b.getId()) != null) {
                    m((ViewGroup) childAt, z13);
                } else if (z13) {
                    this.A.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                    WeakHashMap weakHashMap = v0.f102521a;
                    childAt.setImportantForAccessibility(4);
                } else {
                    HashMap hashMap = this.A;
                    if (hashMap != null && hashMap.containsKey(childAt)) {
                        int intValue = ((Integer) this.A.get(childAt)).intValue();
                        WeakHashMap weakHashMap2 = v0.f102521a;
                        childAt.setImportantForAccessibility(intValue);
                    }
                }
            }
        }
    }

    public final void n(g gVar) {
        vj.c cVar;
        if (this.f32978t == null || !this.f32975q) {
            return;
        }
        boolean equals = gVar.equals(g.SHOWN);
        vj.f fVar = this.f32974p;
        if (equals) {
            fVar.a(false);
        } else {
            if (!gVar.equals(g.HIDDEN) || (cVar = fVar.f125898a) == null) {
                return;
            }
            cVar.c(fVar.f125900c);
        }
    }

    public final void o() {
        ImageButton b13 = e0.b(this.f32965g);
        if (b13 == null) {
            return;
        }
        int i13 = this.f32960b.getVisibility() == 0 ? 1 : 0;
        Drawable C1 = l0.C1(b13.getDrawable());
        if (C1 instanceof j.d) {
            ((j.d) C1).setProgress(i13);
        }
        if (C1 instanceof com.google.android.material.internal.e) {
            ((com.google.android.material.internal.e) C1).a(i13);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        d7.b.x0(this);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        Activity activity;
        super.onFinishInflate();
        Context context = getContext();
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                activity = null;
                break;
            } else {
                if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
        }
        Window window = activity != null ? activity.getWindow() : null;
        if (window != null) {
            this.f32979u = window.getAttributes().softInputMode;
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f18020a);
        this.f32968j.setText(savedState.f32985c);
        boolean z13 = savedState.f32986d == 0;
        ClippableRoundedCornerLayout clippableRoundedCornerLayout = this.f32960b;
        boolean z14 = clippableRoundedCornerLayout.getVisibility() == 0;
        clippableRoundedCornerLayout.setVisibility(z13 ? 0 : 8);
        o();
        j(z13 ? g.SHOWN : g.HIDDEN, z14 != z13);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        Editable text = this.f32968j.getText();
        savedState.f32985c = text == null ? null : text.toString();
        savedState.f32986d = this.f32960b.getVisibility();
        return savedState;
    }

    @Override // android.view.View
    public final void setElevation(float f13) {
        View view;
        super.setElevation(f13);
        rj.a aVar = this.f32976r;
        if (aVar == null || (view = this.f32961c) == null) {
            return;
        }
        view.setBackgroundColor(aVar.b(this.f32983y, f13));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public SearchView(@androidx.annotation.NonNull android.content.Context r20, android.util.AttributeSet r21, int r22) {
        /*
            Method dump skipped, instructions count: 521
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.search.SearchView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
