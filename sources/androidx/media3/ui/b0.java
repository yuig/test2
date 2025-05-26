package androidx.media3.ui;

import a7.i1;
import a7.o1;
import a7.z0;
import android.R;
import android.view.SurfaceView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/* loaded from: classes3.dex */
public final class b0 implements a7.t0, View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PlayerView f19027a;

    public b0(PlayerView playerView) {
        this.f19027a = playerView;
        new z0();
    }

    @Override // a7.t0
    public final void A2(int i13, int i14) {
        if (d7.n0.f53866a == 34) {
            boolean z13 = this.f19027a.f18987d instanceof SurfaceView;
        }
    }

    @Override // a7.t0
    public final void N4(int i13, a7.u0 u0Var, a7.u0 u0Var2) {
        int i14 = PlayerView.f18983p;
        this.f19027a.getClass();
    }

    @Override // a7.t0
    public final void O1() {
        PlayerView playerView = this.f19027a;
        View view = playerView.f18986c;
        if (view != null) {
            view.setVisibility(4);
            ImageView imageView = playerView.f18988e;
            if (imageView != null) {
                imageView.setVisibility(4);
            }
            if (imageView != null) {
                imageView.setImageResource(R.color.transparent);
            }
        }
    }

    @Override // a7.t0
    public final void T3(int i13, boolean z13) {
        PlayerView playerView = this.f19027a;
        View view = playerView.f18990g;
        if (view != null) {
            view.setVisibility(8);
        }
        playerView.a();
    }

    @Override // a7.t0
    public final void k(i1 i1Var) {
        int i13 = PlayerView.f18983p;
        this.f19027a.getClass();
        throw null;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        kg.n.a(view);
        int i13 = PlayerView.f18983p;
        this.f19027a.d();
    }

    @Override // a7.t0
    public final void r0(int i13) {
        PlayerView playerView = this.f19027a;
        View view = playerView.f18990g;
        if (view != null) {
            view.setVisibility(8);
        }
        TextView textView = playerView.f18991h;
        if (textView != null) {
            textView.setVisibility(8);
        }
        playerView.a();
    }

    @Override // a7.t0
    public final void t0(o1 o1Var) {
        if (o1Var.equals(o1.f1158d)) {
            return;
        }
        int i13 = PlayerView.f18983p;
        this.f19027a.getClass();
    }

    @Override // a7.t0
    public final void w1(c7.c cVar) {
        SubtitleView subtitleView = this.f19027a.f18989f;
        if (subtitleView != null) {
            subtitleView.a(cVar.f26702a);
        }
    }
}
