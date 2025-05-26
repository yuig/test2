package androidx.media3.ui;

import android.view.View;
import android.widget.TextView;

/* loaded from: classes3.dex */
public final class e implements a7.t0, s0, View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LegacyPlayerControlView f19032a;

    public e(LegacyPlayerControlView legacyPlayerControlView) {
        this.f19032a = legacyPlayerControlView;
    }

    @Override // androidx.media3.ui.s0
    public final void a(t0 t0Var, long j13) {
        LegacyPlayerControlView legacyPlayerControlView = this.f19032a;
        legacyPlayerControlView.I = true;
        TextView textView = legacyPlayerControlView.f18920l;
        if (textView != null) {
            textView.setText(d7.n0.I(legacyPlayerControlView.f18922n, legacyPlayerControlView.f18923o, j13));
        }
    }

    @Override // androidx.media3.ui.s0
    public final void b(t0 t0Var, long j13) {
        LegacyPlayerControlView legacyPlayerControlView = this.f19032a;
        TextView textView = legacyPlayerControlView.f18920l;
        if (textView != null) {
            textView.setText(d7.n0.I(legacyPlayerControlView.f18922n, legacyPlayerControlView.f18923o, j13));
        }
    }

    @Override // androidx.media3.ui.s0
    public final void c(t0 t0Var, long j13, boolean z13) {
        a7.v0 v0Var;
        LegacyPlayerControlView legacyPlayerControlView = this.f19032a;
        legacyPlayerControlView.I = false;
        if (z13 || (v0Var = legacyPlayerControlView.F) == null) {
            return;
        }
        v0Var.v();
        v0Var.y(v0Var.N(), j13);
        legacyPlayerControlView.k();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        kg.n.a(view);
        LegacyPlayerControlView legacyPlayerControlView = this.f19032a;
        a7.v0 v0Var = legacyPlayerControlView.F;
        if (v0Var == null) {
            return;
        }
        if (legacyPlayerControlView.f18912d == view) {
            v0Var.x();
            return;
        }
        if (legacyPlayerControlView.f18911c == view) {
            v0Var.m();
            return;
        }
        if (legacyPlayerControlView.f18915g == view) {
            if (v0Var.L() != 4) {
                v0Var.T();
                return;
            }
            return;
        }
        if (legacyPlayerControlView.f18916h == view) {
            v0Var.U();
            return;
        }
        if (legacyPlayerControlView.f18913e == view) {
            d7.n0.N(v0Var);
            return;
        }
        if (legacyPlayerControlView.f18914f == view) {
            int i13 = d7.n0.f53866a;
            if (v0Var.r(1)) {
                v0Var.pause();
                return;
            }
            return;
        }
        if (legacyPlayerControlView.f18917i != view) {
            if (legacyPlayerControlView.f18918j == view) {
                v0Var.A(!v0Var.R());
                return;
            }
            return;
        }
        int Q = v0Var.Q();
        int i14 = legacyPlayerControlView.L;
        for (int i15 = 1; i15 <= 2; i15++) {
            int i16 = (Q + i15) % 3;
            if (i16 != 0) {
                if (i16 != 1) {
                    if (i16 == 2 && (i14 & 2) != 0) {
                    }
                } else if ((i14 & 1) == 0) {
                }
            }
            Q = i16;
        }
        v0Var.O(Q);
    }

    @Override // a7.t0
    public final void r5(a7.s0 s0Var) {
        boolean a13 = s0Var.a(4, 5);
        LegacyPlayerControlView legacyPlayerControlView = this.f19032a;
        if (a13) {
            int i13 = LegacyPlayerControlView.f18906b0;
            legacyPlayerControlView.j();
        }
        if (s0Var.a(4, 5, 7)) {
            int i14 = LegacyPlayerControlView.f18906b0;
            legacyPlayerControlView.k();
        }
        a7.p pVar = s0Var.f1200a;
        if (pVar.f1162a.get(8)) {
            int i15 = LegacyPlayerControlView.f18906b0;
            legacyPlayerControlView.l();
        }
        if (pVar.f1162a.get(9)) {
            int i16 = LegacyPlayerControlView.f18906b0;
            legacyPlayerControlView.m();
        }
        if (s0Var.a(8, 9, 11, 0, 13)) {
            int i17 = LegacyPlayerControlView.f18906b0;
            legacyPlayerControlView.i();
        }
        if (s0Var.a(11, 0)) {
            int i18 = LegacyPlayerControlView.f18906b0;
            legacyPlayerControlView.n();
        }
    }
}
