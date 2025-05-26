package ec2;

import ac2.f1;
import ac2.o1;
import android.content.Context;
import android.util.AttributeSet;
import com.pinterest.video.core.view.PinterestVideoView;
import com.pinterest.video.view.BaseVideoView;
import hc2.p;
import lb0.q;
import lh0.k4;
import m60.w;
import nx.d1;
import so.jb;
import so.oa;

/* loaded from: classes2.dex */
public abstract class a extends BaseVideoView implements af2.c {

    /* renamed from: f0, reason: collision with root package name */
    public ye2.o f58434f0;

    /* renamed from: g0, reason: collision with root package name */
    public boolean f58435g0;

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        i0();
    }

    @Override // af2.c
    public final af2.b componentManager() {
        if (this.f58434f0 == null) {
            this.f58434f0 = new ye2.o(this);
        }
        return this.f58434f0;
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f58434f0 == null) {
            this.f58434f0 = new ye2.o(this);
        }
        return this.f58434f0.generatedComponent();
    }

    public final void i0() {
        if (this.f58435g0) {
            return;
        }
        this.f58435g0 = true;
        PinterestVideoView pinterestVideoView = (PinterestVideoView) this;
        oa oaVar = ((jb) ((n) generatedComponent())).f113483a;
        pinterestVideoView.f52753h0 = (b60.a) oaVar.f113850p0.get();
        pinterestVideoView.f52754i0 = (dc2.e) oaVar.f113675f1.get();
        pinterestVideoView.f52755j0 = com.pinterest.widget.configuration.k.t();
        pinterestVideoView.f52756k0 = (k4) oaVar.Q0.get();
        pinterestVideoView.f52757l0 = (o1) oaVar.C7.get();
        pinterestVideoView.f52758m0 = (d1) oaVar.f113730i2.get();
        pinterestVideoView.f52759n0 = oa.X0(oaVar);
        pinterestVideoView.f52760o0 = (tb0.h) oaVar.f113797m0.get();
        pinterestVideoView.f52761p0 = (bc2.e) oaVar.F7.get();
        pinterestVideoView.f52762q0 = (p) oaVar.f114035z7.get();
        pinterestVideoView.f52763r0 = (q) oaVar.O0.get();
        pinterestVideoView.f52764s0 = oaVar.h3();
        pinterestVideoView.f52765t0 = (f1) oaVar.f113640d1.get();
        pinterestVideoView.f52766u0 = (l5.i) oaVar.E7.get();
        pinterestVideoView.f52767v0 = (hc2.g) oaVar.Y0.get();
        pinterestVideoView.f52768w0 = (w) oaVar.f113885r0.get();
    }

    public a(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        i0();
    }
}
