package com.airbnb.lottie;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.c2;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Callable;
import t3.n1;

/* loaded from: classes.dex */
public class LottieAnimationView extends AppCompatImageView {

    /* renamed from: m, reason: collision with root package name */
    public static final c f28360m = new c();

    /* renamed from: a, reason: collision with root package name */
    public final g f28361a;

    /* renamed from: b, reason: collision with root package name */
    public final g f28362b;

    /* renamed from: c, reason: collision with root package name */
    public int f28363c;

    /* renamed from: d, reason: collision with root package name */
    public final v f28364d;

    /* renamed from: e, reason: collision with root package name */
    public String f28365e;

    /* renamed from: f, reason: collision with root package name */
    public int f28366f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f28367g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f28368h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f28369i;

    /* renamed from: j, reason: collision with root package name */
    public final HashSet f28370j;

    /* renamed from: k, reason: collision with root package name */
    public final HashSet f28371k;

    /* renamed from: l, reason: collision with root package name */
    public b0 f28372l;

    /* loaded from: classes3.dex */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new e();

        /* renamed from: a, reason: collision with root package name */
        public String f28373a;

        /* renamed from: b, reason: collision with root package name */
        public int f28374b;

        /* renamed from: c, reason: collision with root package name */
        public float f28375c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f28376d;

        /* renamed from: e, reason: collision with root package name */
        public String f28377e;

        /* renamed from: f, reason: collision with root package name */
        public int f28378f;

        /* renamed from: g, reason: collision with root package name */
        public int f28379g;

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i13) {
            super.writeToParcel(parcel, i13);
            parcel.writeString(this.f28373a);
            parcel.writeFloat(this.f28375c);
            parcel.writeInt(this.f28376d ? 1 : 0);
            parcel.writeString(this.f28377e);
            parcel.writeInt(this.f28378f);
            parcel.writeInt(this.f28379g);
        }
    }

    public LottieAnimationView(Context context) {
        super(context, null);
        this.f28361a = new g(this, 1);
        this.f28362b = new g(this, 0);
        this.f28363c = 0;
        this.f28364d = new v();
        this.f28367g = false;
        this.f28368h = false;
        this.f28369i = true;
        this.f28370j = new HashSet();
        this.f28371k = new HashSet();
        i2(null, d0.lottieAnimationViewStyle);
    }

    public final void A2(h hVar) {
        a aVar = b.f28381a;
        v vVar = this.f28364d;
        vVar.setCallback(this);
        this.f28367g = true;
        boolean t13 = vVar.t(hVar);
        if (this.f28368h) {
            vVar.q();
        }
        this.f28367g = false;
        if (getDrawable() != vVar || t13) {
            if (!t13) {
                G2();
            }
            onVisibilityChanged(this, getVisibility());
            requestLayout();
            Iterator it = this.f28371k.iterator();
            if (it.hasNext()) {
                ep.b.A(it.next());
                throw null;
            }
        }
    }

    public final void D2(b0 b0Var) {
        z zVar = b0Var.f28388d;
        v vVar = this.f28364d;
        if (zVar != null && vVar == getDrawable() && vVar.f28446a == zVar.f28505a) {
            return;
        }
        this.f28370j.add(f.SET_ANIMATION);
        this.f28364d.e();
        g2();
        b0Var.b(this.f28361a);
        b0Var.a(this.f28362b);
        this.f28372l = b0Var;
    }

    public final void E2(String str) {
        v vVar = this.f28364d;
        vVar.f28457l = str;
        c2 i13 = vVar.i();
        if (i13 != null) {
            i13.w(str);
        }
    }

    public final void G2() {
        v vVar = this.f28364d;
        boolean o13 = vVar.o();
        setImageDrawable(null);
        setImageDrawable(vVar);
        if (o13) {
            vVar.s();
        }
    }

    public final void H2(g0 g0Var) {
        v vVar = this.f28364d;
        vVar.f28466u = g0Var;
        vVar.f();
    }

    public final void M2(int i13) {
        this.f28370j.add(f.SET_REPEAT_COUNT);
        this.f28364d.f28447b.setRepeatCount(i13);
    }

    public final void O2(int i13) {
        this.f28370j.add(f.SET_REPEAT_MODE);
        this.f28364d.f28447b.setRepeatMode(i13);
    }

    public final void R2(float f13) {
        this.f28364d.f28447b.f75381d = f13;
    }

    public final void W2(boolean z13) {
        this.f28364d.f28447b.f75391n = z13;
    }

    public final void f2() {
        this.f28368h = false;
        this.f28370j.add(f.PLAY_OPTION);
        this.f28364d.d();
    }

    public final void g2() {
        b0 b0Var = this.f28372l;
        if (b0Var != null) {
            g gVar = this.f28361a;
            synchronized (b0Var) {
                b0Var.f28385a.remove(gVar);
            }
            b0 b0Var2 = this.f28372l;
            g gVar2 = this.f28362b;
            synchronized (b0Var2) {
                b0Var2.f28386b.remove(gVar2);
            }
        }
    }

    public final void i2(AttributeSet attributeSet, int i13) {
        String string;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, e0.LottieAnimationView, i13, 0);
        this.f28369i = obtainStyledAttributes.getBoolean(e0.LottieAnimationView_lottie_cacheComposition, true);
        boolean hasValue = obtainStyledAttributes.hasValue(e0.LottieAnimationView_lottie_rawRes);
        boolean hasValue2 = obtainStyledAttributes.hasValue(e0.LottieAnimationView_lottie_fileName);
        boolean hasValue3 = obtainStyledAttributes.hasValue(e0.LottieAnimationView_lottie_url);
        if (hasValue && hasValue2) {
            throw new IllegalArgumentException("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use only one at once.");
        }
        if (hasValue) {
            int resourceId = obtainStyledAttributes.getResourceId(e0.LottieAnimationView_lottie_rawRes, 0);
            if (resourceId != 0) {
                l2(resourceId);
            }
        } else if (hasValue2) {
            String string2 = obtainStyledAttributes.getString(e0.LottieAnimationView_lottie_fileName);
            if (string2 != null) {
                r2(string2);
            }
        } else if (hasValue3 && (string = obtainStyledAttributes.getString(e0.LottieAnimationView_lottie_url)) != null) {
            s2(string);
        }
        this.f28363c = obtainStyledAttributes.getResourceId(e0.LottieAnimationView_lottie_fallbackRes, 0);
        if (obtainStyledAttributes.getBoolean(e0.LottieAnimationView_lottie_autoPlay, false)) {
            this.f28368h = true;
        }
        boolean z13 = obtainStyledAttributes.getBoolean(e0.LottieAnimationView_lottie_loop, false);
        v vVar = this.f28364d;
        if (z13) {
            vVar.f28447b.setRepeatCount(-1);
        }
        if (obtainStyledAttributes.hasValue(e0.LottieAnimationView_lottie_repeatMode)) {
            O2(obtainStyledAttributes.getInt(e0.LottieAnimationView_lottie_repeatMode, 1));
        }
        if (obtainStyledAttributes.hasValue(e0.LottieAnimationView_lottie_repeatCount)) {
            M2(obtainStyledAttributes.getInt(e0.LottieAnimationView_lottie_repeatCount, -1));
        }
        if (obtainStyledAttributes.hasValue(e0.LottieAnimationView_lottie_speed)) {
            R2(obtainStyledAttributes.getFloat(e0.LottieAnimationView_lottie_speed, 1.0f));
        }
        if (obtainStyledAttributes.hasValue(e0.LottieAnimationView_lottie_clipToCompositionBounds)) {
            x2(obtainStyledAttributes.getBoolean(e0.LottieAnimationView_lottie_clipToCompositionBounds, true));
        }
        if (obtainStyledAttributes.hasValue(e0.LottieAnimationView_lottie_clipTextToBoundingBox)) {
            w2(obtainStyledAttributes.getBoolean(e0.LottieAnimationView_lottie_clipTextToBoundingBox, false));
        }
        if (obtainStyledAttributes.hasValue(e0.LottieAnimationView_lottie_defaultFontFileExtension)) {
            E2(obtainStyledAttributes.getString(e0.LottieAnimationView_lottie_defaultFontFileExtension));
        }
        vVar.f28454i = obtainStyledAttributes.getString(e0.LottieAnimationView_lottie_imageAssetsFolder);
        boolean hasValue4 = obtainStyledAttributes.hasValue(e0.LottieAnimationView_lottie_progress);
        float f13 = obtainStyledAttributes.getFloat(e0.LottieAnimationView_lottie_progress, 0.0f);
        if (hasValue4) {
            this.f28370j.add(f.SET_PROGRESS);
        }
        vVar.v(f13);
        boolean z14 = obtainStyledAttributes.getBoolean(e0.LottieAnimationView_lottie_enableMergePathsForKitKatAndAbove, false);
        if (vVar.f28458m != z14) {
            vVar.f28458m = z14;
            if (vVar.f28446a != null) {
                vVar.c();
            }
        }
        if (obtainStyledAttributes.hasValue(e0.LottieAnimationView_lottie_colorFilter)) {
            vVar.a(new cc.f("**"), y.F, new androidx.appcompat.app.d(new h0(d5.a.b(getContext(), obtainStyledAttributes.getResourceId(e0.LottieAnimationView_lottie_colorFilter, -1)).getDefaultColor())));
        }
        if (obtainStyledAttributes.hasValue(e0.LottieAnimationView_lottie_renderMode)) {
            int i14 = e0.LottieAnimationView_lottie_renderMode;
            g0 g0Var = g0.AUTOMATIC;
            int i15 = obtainStyledAttributes.getInt(i14, g0Var.ordinal());
            if (i15 >= g0.values().length) {
                i15 = g0Var.ordinal();
            }
            H2(g0.values()[i15]);
        }
        if (obtainStyledAttributes.hasValue(e0.LottieAnimationView_lottie_asyncUpdates)) {
            int i16 = e0.LottieAnimationView_lottie_asyncUpdates;
            a aVar = a.AUTOMATIC;
            int i17 = obtainStyledAttributes.getInt(i16, aVar.ordinal());
            if (i17 >= g0.values().length) {
                i17 = aVar.ordinal();
            }
            t2(a.values()[i17]);
        }
        vVar.f28449d = obtainStyledAttributes.getBoolean(e0.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, false);
        if (obtainStyledAttributes.hasValue(e0.LottieAnimationView_lottie_useCompositionFrameRate)) {
            W2(obtainStyledAttributes.getBoolean(e0.LottieAnimationView_lottie_useCompositionFrameRate, false));
        }
        obtainStyledAttributes.recycle();
        Context context = getContext();
        n1 n1Var = jc.g.f75394a;
        vVar.f28448c = Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f) != 0.0f;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        Drawable drawable = getDrawable();
        if (drawable instanceof v) {
            if ((((v) drawable).f28467v ? g0.SOFTWARE : g0.HARDWARE) == g0.SOFTWARE) {
                this.f28364d.invalidateSelf();
            }
        }
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable drawable2 = getDrawable();
        v vVar = this.f28364d;
        if (drawable2 == vVar) {
            super.invalidateDrawable(vVar);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    public final void k2() {
        this.f28370j.add(f.PLAY_OPTION);
        this.f28364d.q();
    }

    public final void l2(final int i13) {
        b0 f13;
        this.f28366f = i13;
        this.f28365e = null;
        if (isInEditMode()) {
            f13 = new b0(new Callable() { // from class: com.airbnb.lottie.d
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    LottieAnimationView lottieAnimationView = LottieAnimationView.this;
                    boolean z13 = lottieAnimationView.f28369i;
                    int i14 = i13;
                    if (!z13) {
                        return n.g(i14, lottieAnimationView.getContext(), null);
                    }
                    Context context = lottieAnimationView.getContext();
                    return n.g(i14, context, n.l(context, i14));
                }
            }, true);
        } else {
            f13 = this.f28369i ? n.f(getContext(), i13) : n.e(i13, getContext(), null);
        }
        D2(f13);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isInEditMode() || !this.f28368h) {
            return;
        }
        this.f28364d.q();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        int i13;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f28365e = savedState.f28373a;
        f fVar = f.SET_ANIMATION;
        HashSet hashSet = this.f28370j;
        if (!hashSet.contains(fVar) && !TextUtils.isEmpty(this.f28365e)) {
            r2(this.f28365e);
        }
        this.f28366f = savedState.f28374b;
        if (!hashSet.contains(fVar) && (i13 = this.f28366f) != 0) {
            l2(i13);
        }
        boolean contains = hashSet.contains(f.SET_PROGRESS);
        v vVar = this.f28364d;
        if (!contains) {
            vVar.v(savedState.f28375c);
        }
        if (!hashSet.contains(f.PLAY_OPTION) && savedState.f28376d) {
            k2();
        }
        if (!hashSet.contains(f.SET_IMAGE_ASSETS)) {
            vVar.f28454i = savedState.f28377e;
        }
        if (!hashSet.contains(f.SET_REPEAT_MODE)) {
            O2(savedState.f28378f);
        }
        if (hashSet.contains(f.SET_REPEAT_COUNT)) {
            return;
        }
        M2(savedState.f28379g);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        boolean z13;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f28373a = this.f28365e;
        savedState.f28374b = this.f28366f;
        v vVar = this.f28364d;
        savedState.f28375c = vVar.f28447b.h();
        if (vVar.isVisible()) {
            z13 = vVar.f28447b.f75390m;
        } else {
            u uVar = vVar.f28451f;
            z13 = uVar == u.PLAY || uVar == u.RESUME;
        }
        savedState.f28376d = z13;
        savedState.f28377e = vVar.f28454i;
        savedState.f28378f = vVar.f28447b.getRepeatMode();
        savedState.f28379g = vVar.f28447b.getRepeatCount();
        return savedState;
    }

    public final void r2(String str) {
        b0 a13;
        b0 b0Var;
        this.f28365e = str;
        this.f28366f = 0;
        int i13 = 1;
        if (isInEditMode()) {
            b0Var = new b0(new a.g0(3, this, str), true);
        } else {
            String str2 = null;
            if (this.f28369i) {
                Context context = getContext();
                HashMap hashMap = n.f28429a;
                String j13 = a.a.j("asset_", str);
                a13 = n.a(j13, new i(i13, context.getApplicationContext(), str, j13), null);
            } else {
                Context context2 = getContext();
                HashMap hashMap2 = n.f28429a;
                a13 = n.a(null, new i(i13, context2.getApplicationContext(), str, str2), null);
            }
            b0Var = a13;
        }
        D2(b0Var);
    }

    public final void s2(String str) {
        b0 a13;
        int i13 = 0;
        String str2 = null;
        if (this.f28369i) {
            Context context = getContext();
            HashMap hashMap = n.f28429a;
            String j13 = a.a.j("url_", str);
            a13 = n.a(j13, new i(i13, context, str, j13), null);
        } else {
            a13 = n.a(null, new i(i13, getContext(), str, str2), null);
        }
        D2(a13);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public final void setImageBitmap(Bitmap bitmap) {
        this.f28366f = 0;
        this.f28365e = null;
        g2();
        super.setImageBitmap(bitmap);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public final void setImageDrawable(Drawable drawable) {
        this.f28366f = 0;
        this.f28365e = null;
        g2();
        super.setImageDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public final void setImageResource(int i13) {
        this.f28366f = 0;
        this.f28365e = null;
        g2();
        super.setImageResource(i13);
    }

    public final void t2(a aVar) {
        this.f28364d.f28445J = aVar;
    }

    @Override // android.view.View
    public final void unscheduleDrawable(Drawable drawable) {
        v vVar;
        if (!this.f28367g && drawable == (vVar = this.f28364d) && vVar.o()) {
            this.f28368h = false;
            vVar.p();
        } else if (!this.f28367g && (drawable instanceof v)) {
            v vVar2 = (v) drawable;
            if (vVar2.o()) {
                vVar2.p();
            }
        }
        super.unscheduleDrawable(drawable);
    }

    public final void w2(boolean z13) {
        v vVar = this.f28364d;
        if (z13 != vVar.f28465t) {
            vVar.f28465t = z13;
            vVar.invalidateSelf();
        }
    }

    public final void x2(boolean z13) {
        v vVar = this.f28364d;
        if (z13 != vVar.f28460o) {
            vVar.f28460o = z13;
            fc.e eVar = vVar.f28461p;
            if (eVar != null) {
                eVar.I = z13;
            }
            vVar.invalidateSelf();
        }
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f28361a = new g(this, 1);
        this.f28362b = new g(this, 0);
        this.f28363c = 0;
        this.f28364d = new v();
        this.f28367g = false;
        this.f28368h = false;
        this.f28369i = true;
        this.f28370j = new HashSet();
        this.f28371k = new HashSet();
        i2(attributeSet, d0.lottieAnimationViewStyle);
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        this.f28361a = new g(this, 1);
        this.f28362b = new g(this, 0);
        this.f28363c = 0;
        this.f28364d = new v();
        this.f28367g = false;
        this.f28368h = false;
        this.f28369i = true;
        this.f28370j = new HashSet();
        this.f28371k = new HashSet();
        i2(attributeSet, i13);
    }
}
