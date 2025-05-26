package androidx.media3.ui;

import a7.b1;
import a7.i1;
import a7.o1;
import a7.z0;
import android.view.TextureView;
import android.view.View;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class f implements a7.t0, View.OnLayoutChangeListener, View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final z0 f19033a = new z0();

    /* renamed from: b, reason: collision with root package name */
    public Object f19034b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ LegacyPlayerView f19035c;

    public f(LegacyPlayerView legacyPlayerView) {
        this.f19035c = legacyPlayerView;
    }

    @Override // a7.t0
    public final void N4(int i13, a7.u0 u0Var, a7.u0 u0Var2) {
        int i14 = LegacyPlayerView.f18935u;
        LegacyPlayerView legacyPlayerView = this.f19035c;
        if (legacyPlayerView.s() && legacyPlayerView.f18954s) {
            legacyPlayerView.r();
        }
    }

    @Override // a7.t0
    public final void O1() {
        View view = this.f19035c.f18938c;
        if (view != null) {
            view.setVisibility(4);
        }
    }

    @Override // a7.t0
    public final void T3(int i13, boolean z13) {
        int i14 = LegacyPlayerView.f18935u;
        LegacyPlayerView legacyPlayerView = this.f19035c;
        legacyPlayerView.F();
        if (legacyPlayerView.s() && legacyPlayerView.f18954s) {
            legacyPlayerView.r();
        } else {
            legacyPlayerView.u(false);
        }
    }

    @Override // a7.t0
    public final void k(i1 i1Var) {
        LegacyPlayerView legacyPlayerView = this.f19035c;
        a7.v0 v0Var = legacyPlayerView.f18946k;
        v0Var.getClass();
        b1 v13 = v0Var.v();
        if (v13.q()) {
            this.f19034b = null;
        } else {
            boolean isEmpty = v0Var.o().f1079a.isEmpty();
            z0 z0Var = this.f19033a;
            if (isEmpty) {
                Object obj = this.f19034b;
                if (obj != null) {
                    int b13 = v13.b(obj);
                    if (b13 != -1) {
                        if (v0Var.N() == v13.g(b13, z0Var, false).f1253c) {
                            return;
                        }
                    }
                    this.f19034b = null;
                }
            } else {
                this.f19034b = v13.g(v0Var.B(), z0Var, true).f1252b;
            }
        }
        legacyPlayerView.H(false);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        kg.n.a(view);
        int i13 = LegacyPlayerView.f18935u;
        this.f19035c.D();
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i23) {
        int i24 = LegacyPlayerView.f18935u;
        this.f19035c.getClass();
        LegacyPlayerView.k((TextureView) view, 0);
    }

    @Override // a7.t0
    public final void r0(int i13) {
        int i14 = LegacyPlayerView.f18935u;
        LegacyPlayerView legacyPlayerView = this.f19035c;
        legacyPlayerView.F();
        TextView textView = legacyPlayerView.f18944i;
        if (textView != null) {
            a7.v0 v0Var = legacyPlayerView.f18946k;
            if (v0Var != null) {
                v0Var.n();
            }
            textView.setVisibility(8);
        }
        if (legacyPlayerView.s() && legacyPlayerView.f18954s) {
            legacyPlayerView.r();
        } else {
            legacyPlayerView.u(false);
        }
    }

    @Override // a7.t0
    public final void t0(o1 o1Var) {
        int i13 = LegacyPlayerView.f18935u;
        this.f19035c.E();
    }

    @Override // a7.t0
    public final void w1(c7.c cVar) {
        SubtitleView subtitleView = this.f19035c.f18942g;
        if (subtitleView != null) {
            subtitleView.a(cVar.f26702a);
        }
    }
}
