package com.pinterest.video.view;

import a7.h;
import ac2.a1;
import ac2.d1;
import ac2.o1;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.ui.AspectRatioFrameLayout;
import bc2.k;
import com.pinterest.video.core.view.PinterestVideoView;
import d7.b;
import dc2.g;
import hc2.m;
import ic2.d;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;
import m7.l0;
import nc2.j;
import oc2.i;
import org.jetbrains.annotations.NotNull;
import pk.a0;
import qc2.c;
import qc2.f;
import tb0.p;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b&\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\fB\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB#\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/pinterest/video/view/BaseVideoView;", "Lcom/pinterest/video/view/SimplePlayerView;", "Loc2/i;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "bk/f", "video_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public abstract class BaseVideoView extends SimplePlayerView implements i {

    /* renamed from: e0, reason: collision with root package name */
    public static int f52773e0;

    /* renamed from: J, reason: collision with root package name */
    public boolean f52774J;
    public j K;
    public k L;
    public a0 M;
    public c N;
    public f O;
    public float P;
    public m Q;
    public boolean R;
    public int S;
    public bc2.m T;
    public int U;
    public View V;
    public boolean W;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f52775a0;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f52776b0;

    /* renamed from: c0, reason: collision with root package name */
    public oc2.f f52777c0;

    /* renamed from: d0, reason: collision with root package name */
    public final int f52778d0;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BaseVideoView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static void Y(String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
    }

    @Override // com.pinterest.video.view.SimplePlayerView
    public void T() {
        super.T();
        m mVar = this.Q;
        d dVar = mVar != null ? ((g) mVar).f54408b : null;
        if (dVar != null) {
            boolean X = X();
            m mVar2 = this.Q;
            dVar.o(X, mVar2 != null ? mVar2.a() : 0L);
        }
    }

    public final void U(boolean z13) {
        View view = this.f18939d;
        if (view == null) {
            return;
        }
        view.setAlpha(z13 ? 1.0f : 0.0f);
    }

    public final boolean V() {
        return this.R || this.f52798z;
    }

    public final void W(boolean z13) {
        if (V()) {
            if (X() && z13) {
                ((PinterestVideoView) this).q0().r();
            } else {
                ((PinterestVideoView) this).q0().q();
            }
        }
    }

    public final boolean X() {
        return !getB() && ((PinterestVideoView) this).q0().h();
    }

    public void Z() {
    }

    public final void a0(long j13) {
        Intrinsics.checkNotNullParameter("pause", "msg");
        W(false);
        m mVar = this.Q;
        if (mVar != null) {
            ((h) ((g) mVar).f54407a).pause();
        }
        i.b(this, j13, 2);
    }

    public void b0(k metadata, a0 a0Var, Function0 onFailure) {
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        Intrinsics.checkNotNullParameter(onFailure, "onFailure");
        boolean isCloseup = this.T.isCloseup();
        StringBuilder sb3 = new StringBuilder("render, ");
        String str = metadata.f22657a;
        sb3.append(str);
        sb3.append(", ");
        String str2 = metadata.f22663g;
        sb3.append(str2);
        sb3.append(", isCloseup: ");
        sb3.append(isCloseup);
        Y(sb3.toString());
        if (z.j(str2)) {
            onFailure.invoke();
            vb0.j.f125466a.F("Video " + str + " provided video source is empty", p.VIDEO_PLAYER, new Object[0]);
            return;
        }
        k kVar = this.L;
        if (kVar != null) {
            if (Intrinsics.d(kVar.f22663g, str2)) {
                return;
            } else {
                ((PinterestVideoView) this).q0().u(this);
            }
        }
        this.M = a0Var;
        this.L = metadata;
        AspectRatioFrameLayout aspectRatioFrameLayout = this.E;
        float f13 = aspectRatioFrameLayout.f18871b;
        float f14 = metadata.f22658b;
        if (f13 != f14) {
            aspectRatioFrameLayout.f18871b = f14;
            aspectRatioFrameLayout.requestLayout();
        }
        if (isAttachedToWindow()) {
            Intrinsics.checkNotNullParameter("register", "msg");
            ((PinterestVideoView) this).q0().o(this);
        }
    }

    public void c(m playerWrapper) {
        Intrinsics.checkNotNullParameter(playerWrapper, "playerWrapper");
        c0(playerWrapper);
    }

    public final void c0(m mVar) {
        oc2.f fVar;
        ExoPlayer exoPlayer;
        Integer num = null;
        Y("setPlayerWrapper, " + this.f18946k + " -> " + (mVar != null ? ((g) mVar).f54407a : null));
        this.Q = mVar;
        y(mVar != null ? ((g) mVar).f54407a : null);
        if (this.f18946k == null) {
            this.W = false;
        }
        if (mVar != null && (exoPlayer = ((g) mVar).f54407a) != null) {
            num = Integer.valueOf(((l0) exoPlayer).f86253b);
        }
        if (num == null || (fVar = this.f52777c0) == null) {
            return;
        }
        fVar.g(((l0) ((g) mVar).f54407a).f86253b);
    }

    public final void e0(bc2.m mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<set-?>");
        this.T = mVar;
    }

    public final void f0(oc2.f fVar) {
        this.f52777c0 = fVar;
    }

    public final void g0(j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<set-?>");
        this.K = jVar;
    }

    public void h(float f13, c viewability, boolean z13, long j13, boolean z14, boolean z15) {
        String str;
        Intrinsics.checkNotNullParameter(viewability, "viewability");
        m mVar = this.Q;
        d dVar = mVar != null ? ((g) mVar).f54408b : null;
        if (dVar != null) {
            dVar.e0(f13, viewability, z14, this.O.isVisible(this.N), j13);
        }
        if (z13) {
            Y("onViewabilityUpdate, percentViewable: " + f13 + ", isPlaying: " + z14 + ", willPlayWhenReady: " + z15);
            o1 q03 = ((PinterestVideoView) this).q0();
            Intrinsics.checkNotNullParameter(this, "videoView");
            c cVar = this.N;
            toString();
            Objects.toString(cVar);
            if (!this.f52774J || this.f18946k == null) {
                toString();
                return;
            }
            boolean isVisible = this.O.isVisible(this.N);
            if (z15 == isVisible) {
                toString();
                return;
            }
            q03.f2005h.getClass();
            Intrinsics.checkNotNullParameter(this, "videoView");
            if (this.K.getShouldAutoplay()) {
                if (isVisible) {
                    play();
                    return;
                } else {
                    a0(j13);
                    return;
                }
            }
            nc2.h hVar = nc2.h.f90405a;
            k kVar = this.L;
            if (kVar == null || (str = kVar.f22657a) == null || nc2.h.a(str).a()) {
                return;
            }
            if (isVisible) {
                play();
            } else {
                a0(j13);
            }
        }
    }

    public final void h0(c value) {
        Intrinsics.checkNotNullParameter(value, "value");
        boolean z13 = value != this.N;
        this.N = value;
        float f13 = this.P;
        m mVar = this.Q;
        long a13 = mVar != null ? mVar.a() : 0L;
        m mVar2 = this.Q;
        boolean f14 = mVar2 != null ? ((h) ((g) mVar2).f54407a).f() : false;
        m mVar3 = this.Q;
        h(f13, value, z13, a13, f14, mVar3 != null ? ((l0) ((g) mVar3).f54407a).z() : false);
    }

    public void j(long j13, boolean z13) {
        m mVar = this.Q;
        if (mVar != null) {
            ((h) ((g) mVar).f54407a).c0(5, Math.max(0L, j13));
        }
    }

    @Override // com.pinterest.video.view.SimplePlayerView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Intrinsics.checkNotNullParameter("register", "msg");
        ((PinterestVideoView) this).q0().o(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        ((PinterestVideoView) this).q0().u(this);
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z13) {
        super.onWindowFocusChanged(z13);
        if (!z13) {
            h0(this.O.getThreshold());
        } else if (this.f18946k != null) {
            ((PinterestVideoView) this).q0().w();
        }
    }

    public void play() {
        m mVar;
        W(true);
        m mVar2 = this.Q;
        if (mVar2 != null && ((l0) ((g) mVar2).f54407a).L() == 1 && (mVar = this.Q) != null) {
            mVar.b();
        }
        m mVar3 = this.Q;
        if (mVar3 != null) {
            ((h) ((g) mVar3).f54407a).play();
        }
    }

    @Override // android.view.View
    public final String toString() {
        String str;
        k kVar = this.L;
        if (kVar == null || (str = kVar.f22657a) == null) {
            str = "null";
        }
        return "VideoView(" + b.H(str) + ", " + this.T + ", " + this.N + "," + this.P + ", " + this.f52778d0 + ", " + this.f18946k + ")";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseVideoView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        this.K = j.AUTOPLAY_BY_STATE;
        this.N = c.InvalidVisibility;
        this.O = f.DEFAULT;
        this.R = this.f52798z;
        this.S = -1;
        this.T = bc2.m.OTHER;
        this.U = -1;
        this.V = this;
        this.f52775a0 = true;
        int i14 = f52773e0;
        f52773e0 = i14 + 1;
        this.f52778d0 = i14;
        Intrinsics.checkNotNullParameter("init", "msg");
        if (getId() == -1) {
            setId(View.generateViewId());
        }
        View view = this.f18939d;
        if (view != null) {
            view.setId(a1.simple_exoplayer_view);
        }
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, d1.BaseVideoView, 0, 0);
            Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
            try {
                g0(j.values()[obtainStyledAttributes.getInt(d1.BaseVideoView_video_flavor, 0)]);
                this.U = obtainStyledAttributes.getResourceId(d1.BaseVideoView_viewability_view_id, -1);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
    }
}
