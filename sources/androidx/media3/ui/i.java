package androidx.media3.ui;

import androidx.recyclerview.widget.y2;

/* loaded from: classes3.dex */
public final class i extends r {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f19041f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ PlayerControlView f19042g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(PlayerControlView playerControlView, int i13) {
        super(playerControlView);
        this.f19041f = i13;
        this.f19042g = playerControlView;
    }

    public final void C(o oVar, int i13) {
        int i14 = this.f19041f;
        PlayerControlView playerControlView = this.f19103e;
        switch (i14) {
            case 1:
                float[] fArr = PlayerControlView.U;
                playerControlView.getClass();
                if (i13 <= 0) {
                    return;
                }
                ((p) this.f19102d.get(i13 - 1)).getClass();
                throw null;
            default:
                float[] fArr2 = PlayerControlView.U;
                playerControlView.getClass();
                return;
        }
    }

    @Override // androidx.recyclerview.widget.b2
    public final /* bridge */ /* synthetic */ void r(y2 y2Var, int i13) {
        switch (this.f19041f) {
            case 1:
                C((o) y2Var, i13);
                break;
            default:
                C((o) y2Var, i13);
                break;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(PlayerControlView playerControlView, int i13, int i14) {
        this(playerControlView, 0);
        this.f19041f = i13;
        int i15 = 1;
        if (i13 != 1) {
        } else {
            this(playerControlView, i15);
        }
    }
}
