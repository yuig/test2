package com.pinterest.video.view;

import a7.f;
import a7.v0;
import ac2.d1;
import ac2.m0;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.ui.AspectRatioFrameLayout;
import androidx.media3.ui.LegacyPlayerView;
import androidx.media3.ui.h0;
import dl2.b;
import ho2.q;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j;
import m7.l0;
import oc2.c;
import org.jetbrains.annotations.NotNull;
import pc2.a;
import xk2.d;

@d
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B'\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/pinterest/video/view/SimplePlayerView;", "Landroidx/media3/ui/LegacyPlayerView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "video_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public class SimplePlayerView extends LegacyPlayerView {
    public boolean A;
    public boolean B;
    public final View C;
    public final FrameLayout D;
    public final AspectRatioFrameLayout E;
    public final SimplePlayerControlView F;
    public final a G;
    public final Path H;
    public boolean I;

    /* renamed from: v, reason: collision with root package name */
    public float[] f52794v;

    /* renamed from: w, reason: collision with root package name */
    public float f52795w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f52796x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f52797y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f52798z;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SimplePlayerView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* renamed from: K, reason: from getter */
    public boolean getB() {
        return this.B;
    }

    /* renamed from: L, reason: from getter */
    public a getF52751a1() {
        return this.G;
    }

    public final void M(float f13) {
        this.f52795w = f13;
        if (this.f52796x) {
            Q();
            return;
        }
        float[] value = new float[8];
        for (int i13 = 0; i13 < 8; i13++) {
            value[i13] = this.f52795w;
        }
        Intrinsics.checkNotNullParameter(value, "value");
        this.f52794v = value;
        N(getWidth(), getHeight(), value);
        invalidate();
    }

    public final void N(float f13, float f14, float[] fArr) {
        if (f13 == 0.0f || f14 == 0.0f) {
            return;
        }
        Path path = this.H;
        path.reset();
        path.addRoundRect(new RectF(0.0f, 0.0f, f13, f14), fArr, Path.Direction.CW);
        path.close();
    }

    public final void O(boolean z13) {
        this.A = z13;
        v0 v0Var = this.f18946k;
        if (v0Var == null) {
            return;
        }
        v0Var.O(z13 ? 1 : 0);
    }

    public void P(boolean z13) {
        this.B = z13;
        T();
    }

    public final void Q() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(ColorStateList.valueOf(0));
        gradientDrawable.setCornerRadius(this.f52795w);
        AspectRatioFrameLayout aspectRatioFrameLayout = this.E;
        aspectRatioFrameLayout.setBackground(gradientDrawable);
        aspectRatioFrameLayout.setClipToOutline(true);
    }

    public final void R(boolean z13) {
        this.f52798z = z13;
        SimplePlayerControlView simplePlayerControlView = this.F;
        if (simplePlayerControlView != null) {
            simplePlayerControlView.t(z13);
        }
    }

    public final void S() {
        SimplePlayerControlView simplePlayerControlView = this.F;
        if (simplePlayerControlView != null) {
            a listener = getF52751a1();
            Intrinsics.checkNotNullParameter(listener, "listener");
            simplePlayerControlView.f52790m0 = listener;
            PinterestDefaultTimeBar pinterestDefaultTimeBar = simplePlayerControlView.f52785h0;
            if (pinterestDefaultTimeBar != null) {
                pinterestDefaultTimeBar.c(listener);
            }
            if (pinterestDefaultTimeBar != null) {
                Context context = simplePlayerControlView.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                pinterestDefaultTimeBar.k(b.x0(context, eo1.a.color_white_mochimalist_0_opacity_80));
            }
        }
    }

    public void T() {
        SimplePlayerControlView simplePlayerControlView = this.F;
        if (simplePlayerControlView != null) {
            simplePlayerControlView.r(getB());
        }
        v0 v0Var = this.f18946k;
        if (v0Var != null) {
            boolean b13 = getB();
            boolean z13 = this.I;
            f fVar = m0.f1992a;
            Intrinsics.checkNotNullParameter(v0Var, "<this>");
            ExoPlayer exoPlayer = v0Var instanceof ExoPlayer ? (ExoPlayer) v0Var : null;
            if (exoPlayer != null) {
                l0 l0Var = (l0) exoPlayer;
                l0Var.y0(z13 ? b13 ? m0.f1992a : m0.f1993b : b13 ? m0.f1994c : m0.f1995d, false);
                l0Var.H(b13 ? 0.0f : 1.0f);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (!this.f52796x) {
            canvas.clipPath(this.H);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ko2.f fVar = ao2.v0.f20219a;
        j.z(b.b(q.f69782a), null, null, new c(this, null), 3);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i13, int i14, int i15, int i16) {
        super.onSizeChanged(i13, i14, i15, i16);
        if (this.f52796x) {
            return;
        }
        N(i13, i14, this.f52794v);
    }

    @Override // androidx.media3.ui.LegacyPlayerView
    public void y(ExoPlayer exoPlayer) {
        super.y(exoPlayer);
        if (exoPlayer != null) {
            S();
            v0 v0Var = this.f18946k;
            if (v0Var != null) {
                v0Var.O(this.A ? 1 : 0);
            }
            T();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimplePlayerView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        float[] fArr = new float[8];
        for (int i14 = 0; i14 < 8; i14++) {
            fArr[i14] = 0.0f;
        }
        this.f52794v = fArr;
        this.C = findViewById(h0.exo_shutter);
        this.D = (FrameLayout) findViewById(h0.exo_overlay);
        View findViewById = findViewById(h0.exo_content_frame);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.E = (AspectRatioFrameLayout) findViewById;
        this.F = (SimplePlayerControlView) findViewById(h0.exo_controller);
        findViewById(h0.exo_play_pause);
        this.G = new a(this);
        this.H = new Path();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, d1.SimplePlayerView, 0, 0);
            Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
            try {
                M(obtainStyledAttributes.getDimensionPixelSize(d1.SimplePlayerView_corner_radius, 0));
                boolean z13 = obtainStyledAttributes.getBoolean(d1.SimplePlayerView_show_expand_icon, this.f52797y);
                this.f52797y = z13;
                SimplePlayerControlView simplePlayerControlView = this.F;
                if (simplePlayerControlView != null) {
                    simplePlayerControlView.s(z13);
                }
                R(obtainStyledAttributes.getBoolean(d1.SimplePlayerView_show_mute_icon, this.f52798z));
                O(obtainStyledAttributes.getBoolean(d1.SimplePlayerView_loop, this.A));
                P(obtainStyledAttributes.getBoolean(d1.SimplePlayerView_mute, getB()));
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        setClickable(false);
    }
}
