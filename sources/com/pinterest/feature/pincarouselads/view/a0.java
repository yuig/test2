package com.pinterest.feature.pincarouselads.view;

import a.m2;
import android.content.Context;
import android.media.AudioManager;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.pinterest.video.core.view.PinterestVideoView;
import h32.f1;
import h32.g0;
import kotlin.jvm.internal.Intrinsics;
import lh0.p2;
import nx.d0;
import so.jb;

/* loaded from: classes5.dex */
public final class a0 extends LinearLayout implements l21.j, af2.c {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f47355m = 0;

    /* renamed from: a, reason: collision with root package name */
    public ye2.o f47356a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f47357b;

    /* renamed from: c, reason: collision with root package name */
    public final int f47358c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f47359d;

    /* renamed from: e, reason: collision with root package name */
    public final bc2.m f47360e;

    /* renamed from: f, reason: collision with root package name */
    public final View.OnClickListener f47361f;

    /* renamed from: g, reason: collision with root package name */
    public final a8.v f47362g;

    /* renamed from: h, reason: collision with root package name */
    public final p2 f47363h;

    /* renamed from: i, reason: collision with root package name */
    public l21.f f47364i;

    /* renamed from: j, reason: collision with root package name */
    public bc2.q f47365j;

    /* renamed from: k, reason: collision with root package name */
    public String f47366k;

    /* renamed from: l, reason: collision with root package name */
    public PinterestVideoView f47367l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(Context context, int i13, boolean z13, bc2.m videoSurfaceType, View.OnClickListener onClickListener, a8.v vVar, m2 m2Var, int i14) {
        super(context, null, 0);
        z13 = (i14 & 4) != 0 ? true : z13;
        onClickListener = (i14 & 16) != 0 ? null : onClickListener;
        vVar = (i14 & 32) != 0 ? null : vVar;
        m2Var = (i14 & 64) != 0 ? null : m2Var;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(videoSurfaceType, "videoSurfaceType");
        if (!this.f47357b) {
            this.f47357b = true;
            this.f47363h = ((jb) ((b0) generatedComponent())).f();
        }
        this.f47358c = i13;
        this.f47359d = z13;
        this.f47360e = videoSurfaceType;
        this.f47361f = onClickListener;
        this.f47362g = vVar;
        setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        setOnTouchListener(m2Var);
    }

    public final p2 a() {
        p2 p2Var = this.f47363h;
        if (p2Var != null) {
            return p2Var;
        }
        Intrinsics.r("adsExperiments");
        throw null;
    }

    public final void b(d0 d0Var, f1 f1Var) {
        d0.B(d0Var, f1Var, g0.PIN_CLOSEUP_PRODUCT_VIDEO, this.f47366k, null, 24);
    }

    @Override // af2.c
    public final af2.b componentManager() {
        if (this.f47356a == null) {
            this.f47356a = new ye2.o(this);
        }
        return this.f47356a;
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f47356a == null) {
            this.f47356a = new ye2.o(this);
        }
        return this.f47356a.generatedComponent();
    }

    @Override // nx.v
    public final Object markImpressionEnd() {
        l21.f fVar = this.f47364i;
        if (fVar != null) {
            return fVar.m0();
        }
        return null;
    }

    @Override // nx.v
    public final Object markImpressionStart() {
        l21.f fVar = this.f47364i;
        if (fVar != null) {
            return fVar.T();
        }
        return null;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i13, KeyEvent keyEvent) {
        PinterestVideoView pinterestVideoView = this.f47367l;
        if ((i13 == 24 || i13 == 25) && pinterestVideoView != null) {
            Object systemService = getContext().getSystemService("audio");
            Intrinsics.g(systemService, "null cannot be cast to non-null type android.media.AudioManager");
            pinterestVideoView.P(i13 == 25 && ((AudioManager) systemService).getStreamVolume(3) == 0);
        }
        return super.onKeyDown(i13, keyEvent);
    }
}
