package androidx.media3.ui;

import android.view.View;
import android.widget.PopupWindow;
import android.widget.TextView;
import java.util.Collections;

/* loaded from: classes3.dex */
public final class j implements a7.t0, s0, View.OnClickListener, PopupWindow.OnDismissListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PlayerControlView f19043a;

    public j(PlayerControlView playerControlView) {
        this.f19043a = playerControlView;
    }

    @Override // androidx.media3.ui.s0
    public final void a(t0 t0Var, long j13) {
        PlayerControlView playerControlView = this.f19043a;
        playerControlView.P = true;
        TextView textView = playerControlView.f18978v;
        if (textView != null) {
            textView.setText(d7.n0.I(playerControlView.f18980x, playerControlView.f18981y, j13));
        }
        playerControlView.f18957a.f();
    }

    @Override // androidx.media3.ui.s0
    public final void b(t0 t0Var, long j13) {
        PlayerControlView playerControlView = this.f19043a;
        TextView textView = playerControlView.f18978v;
        if (textView != null) {
            textView.setText(d7.n0.I(playerControlView.f18980x, playerControlView.f18981y, j13));
        }
    }

    @Override // androidx.media3.ui.s0
    public final void c(t0 t0Var, long j13, boolean z13) {
        PlayerControlView playerControlView = this.f19043a;
        playerControlView.P = false;
        playerControlView.f18957a.g();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        kg.n.a(view);
        float[] fArr = PlayerControlView.U;
        this.f19043a.getClass();
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        PlayerControlView playerControlView = this.f19043a;
        if (playerControlView.T) {
            playerControlView.f18957a.g();
        }
    }

    @Override // a7.t0
    public final void r5(a7.s0 s0Var) {
        boolean a13 = s0Var.a(4, 5, 13);
        PlayerControlView playerControlView = this.f19043a;
        if (a13) {
            float[] fArr = PlayerControlView.U;
            playerControlView.f();
        }
        if (s0Var.a(4, 5, 7, 13)) {
            float[] fArr2 = PlayerControlView.U;
            playerControlView.g();
        }
        if (s0Var.a(8, 13)) {
            float[] fArr3 = PlayerControlView.U;
            playerControlView.h();
        }
        if (s0Var.a(9, 13)) {
            float[] fArr4 = PlayerControlView.U;
            playerControlView.j();
        }
        if (s0Var.a(8, 9, 11, 0, 16, 17, 13)) {
            float[] fArr5 = PlayerControlView.U;
            playerControlView.e();
        }
        if (s0Var.a(11, 0, 13)) {
            float[] fArr6 = PlayerControlView.U;
            playerControlView.getClass();
        }
        if (s0Var.a(12, 13)) {
            float[] fArr7 = PlayerControlView.U;
            playerControlView.getClass();
        }
        if (s0Var.a(2, 13)) {
            float[] fArr8 = PlayerControlView.U;
            i iVar = playerControlView.f18963g;
            iVar.getClass();
            iVar.f19102d = Collections.emptyList();
            i iVar2 = playerControlView.f18964h;
            iVar2.getClass();
            iVar2.f19102d = Collections.emptyList();
            playerControlView.d(playerControlView.f18974r, iVar.e() > 0);
            n nVar = playerControlView.f18961e;
            nVar.getClass();
            nVar.f19058g.getClass();
            playerControlView.d(playerControlView.f18977u, false);
        }
    }
}
