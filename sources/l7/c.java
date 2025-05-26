package l7;

import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.common.util.GlUtil$GlException;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: classes3.dex */
public final class c extends u0 {

    /* renamed from: d, reason: collision with root package name */
    public final LinkedBlockingQueue f81736d;

    /* renamed from: e, reason: collision with root package name */
    public q0 f81737e;

    /* renamed from: f, reason: collision with root package name */
    public a7.t f81738f;

    /* renamed from: g, reason: collision with root package name */
    public int f81739g;

    public c(sp2.i iVar, z0 z0Var, boolean z13) {
        super(z0Var);
        this.f81736d = new LinkedBlockingQueue();
    }

    @Override // l7.g0
    public final void D() {
        this.f81881a.e(new b(this, 1), true);
    }

    @Override // l7.u0
    public final void b() {
        this.f81736d.clear();
        this.f81739g = 0;
        a7.t tVar = this.f81738f;
        if (tVar != null) {
            try {
                tVar.a();
                this.f81738f = null;
            } catch (GlUtil$GlException e13) {
                throw VideoFrameProcessingException.a(e13);
            }
        }
        super.b();
    }

    @Override // l7.u0
    public final int d() {
        return 0;
    }

    @Override // l7.u0
    public final void f() {
        this.f81881a.e(new b(this, 2), true);
    }

    @Override // l7.u0
    public final void i(m mVar) {
        this.f81739g = 0;
        this.f81737e = mVar;
    }

    @Override // l7.u0
    public final void j() {
        this.f81881a.e(new b(this, 0), true);
    }
}
