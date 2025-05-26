package sj1;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import androidx.appcompat.widget.d;
import androidx.media3.ui.c;
import java.util.ArrayList;
import java.util.List;
import kh2.c3;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;
import pj1.e;
import pj1.i;
import pj1.k;
import ua2.f1;

/* loaded from: classes5.dex */
public final class a extends e implements k {

    /* renamed from: n, reason: collision with root package name */
    public final qc2.a f113015n;

    /* renamed from: o, reason: collision with root package name */
    public final View f113016o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f113017p;

    /* renamed from: q, reason: collision with root package name */
    public float f113018q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f113019r;

    /* renamed from: s, reason: collision with root package name */
    public int f113020s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f113021t;

    /* renamed from: u, reason: collision with root package name */
    public f1 f113022u;

    /* renamed from: v, reason: collision with root package name */
    public final AnimatorSet f113023v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(View pinRepView, qc2.a viewabilityCalculator, View parentCell) {
        super(pinRepView);
        Intrinsics.checkNotNullParameter(pinRepView, "pinRepView");
        Intrinsics.checkNotNullParameter(viewabilityCalculator, "viewabilityCalculator");
        Intrinsics.checkNotNullParameter(parentCell, "parentCell");
        this.f113015n = viewabilityCalculator;
        this.f113016o = parentCell;
        this.f113018q = 1.0f;
        this.f113023v = new AnimatorSet();
    }

    public final void G(b displayState) {
        Intrinsics.checkNotNullParameter(displayState, "displayState");
        A(displayState.f113025b);
        this.f113019r = displayState.f113026c;
        this.f113017p = false;
        this.f113021t = false;
    }

    public final void H() {
        if (this.f113021t) {
            AnimatorSet animatorSet = this.f113023v;
            if (animatorSet.isRunning() || this.f113017p) {
                return;
            }
            c3.m0(animatorSet);
            this.f113021t = false;
            this.f113017p = false;
        }
    }

    public final ValueAnimator I(float f13, float f14) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f14, f13);
        ofFloat.setInterpolator(new AccelerateInterpolator());
        ofFloat.addUpdateListener(new c(this, 17));
        ofFloat.addListener(new d(this, 22));
        ofFloat.setDuration(240L);
        Intrinsics.checkNotNullExpressionValue(ofFloat, "apply(...)");
        return ofFloat;
    }

    public final void J(f1 parentPinRepPiece) {
        Intrinsics.checkNotNullParameter(parentPinRepPiece, "parentPinRepPiece");
        this.f113022u = parentPinRepPiece;
    }

    @Override // pj1.k
    public final boolean a() {
        return this.f113021t;
    }

    @Override // pj1.k
    public final boolean e() {
        return this.f113019r;
    }

    @Override // pj1.k
    public final boolean f() {
        return this.f113017p;
    }

    @Override // pj1.k
    public final View g() {
        return this.f113016o;
    }

    @Override // pj1.k
    public final AnimatorSet h() {
        return this.f113023v;
    }

    @Override // pj1.k
    public final void j(List animations) {
        Intrinsics.checkNotNullParameter(animations, "animations");
        if (this.f113019r) {
            ValueAnimator I = I(0.0f, 1.0f);
            I.setStartDelay(4000L);
            c3.i(I, new ee1.d(this, 29));
            animations.add(I);
        }
    }

    @Override // pj1.k
    public final void l() {
        if (!this.f113021t || i() > 0.0f) {
            return;
        }
        c3.m0(this.f113023v);
        this.f113021t = false;
        this.f100282f.L = false;
        this.f113017p = false;
        c();
    }

    @Override // pj1.k
    public final void m() {
        this.f113021t = true;
    }

    @Override // pj1.k
    public final ArrayList o() {
        return f0.l(I(1.0f, 0.0f));
    }

    @Override // pj1.k
    public final qc2.a p() {
        return this.f113015n;
    }

    @Override // pj1.e, ua2.f1
    public final void r(Canvas canvas, int i13, int i14, int i15, int i16) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        f1 f1Var = this.f113022u;
        i iVar = this.f100282f;
        if (iVar.f128846i || f1Var == null) {
            return;
        }
        int w13 = f1Var.w() - w();
        int i17 = this.f100283g;
        int i18 = w13 - i17;
        boolean z13 = this.f121494c;
        int t13 = (!(z13 && this.f100284h == pj1.c.START) && (z13 || this.f100284h != pj1.c.END)) ? i13 + i17 : i15 - (t() + i17);
        iVar.f100299J = this.f100286j;
        int t14 = t() + t13;
        int w14 = w() + i18;
        iVar.setBounds(t13, i18, t14, w14);
        Rect rect = iVar.f100313y;
        rect.left = t13;
        rect.top = i18;
        rect.right = t14;
        rect.bottom = w14;
        int x13 = x() + t13;
        int w15 = w() + i18;
        iVar.setBounds(t13, i18, x13, w15);
        Rect rect2 = iVar.f100314z;
        rect2.left = t13;
        rect2.top = i18;
        rect2.right = x13;
        rect2.bottom = w15;
        iVar.draw(canvas);
    }

    @Override // ua2.f1
    public final int t() {
        boolean isRunning = this.f113023v.isRunning();
        i iVar = this.f100282f;
        if (isRunning && this.f113019r) {
            return (int) ((this.f113020s * this.f113018q) + iVar.B);
        }
        if (iVar.D != null) {
            return this.f113019r ? iVar.B : x();
        }
        if (this.f113019r) {
            return 0;
        }
        return x();
    }
}
