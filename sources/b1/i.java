package b1;

import android.graphics.Rect;
import android.util.Rational;
import androidx.camera.core.impl.h0;
import androidx.camera.core.impl.j0;
import androidx.camera.view.PreviewView;
import c0.p1;
import c0.v0;
import java.util.concurrent.atomic.AtomicReference;
import kh2.m0;

/* loaded from: classes2.dex */
public final class i implements v0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PreviewView f20809a;

    public i(PreviewView previewView) {
        this.f20809a = previewView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // c0.v0
    public final void c(p1 p1Var) {
        t tVar;
        if (!f0.h.b0()) {
            d5.a.c(this.f20809a.getContext()).execute(new l0.e(27, this, p1Var));
            return;
        }
        m0.p("PreviewView", "Surface requested by Preview.");
        j0 j0Var = p1Var.f24303e;
        this.f20809a.f17047i = j0Var.g();
        o oVar = this.f20809a.f17046h;
        Rect c13 = j0Var.d().c();
        oVar.getClass();
        oVar.f24333a = new Rational(c13.width(), c13.height());
        synchronized (oVar) {
            oVar.f20816c = c13;
        }
        p1Var.c(d5.a.c(this.f20809a.getContext()), new l0.d(this, j0Var, p1Var, 3));
        PreviewView previewView = this.f20809a;
        n nVar = previewView.f17040b;
        k kVar = previewView.f17039a;
        if (!(nVar instanceof t) || PreviewView.c(p1Var, kVar)) {
            PreviewView previewView2 = this.f20809a;
            if (PreviewView.c(p1Var, previewView2.f17039a)) {
                PreviewView previewView3 = this.f20809a;
                v vVar = new v(previewView3, previewView3.f17042d);
                vVar.f20836i = false;
                vVar.f20838k = new AtomicReference();
                tVar = vVar;
            } else {
                PreviewView previewView4 = this.f20809a;
                tVar = new t(previewView4, previewView4.f17042d);
            }
            previewView2.f17040b = tVar;
        }
        h0 g13 = j0Var.g();
        PreviewView previewView5 = this.f20809a;
        d dVar = new d(g13, previewView5.f17044f, previewView5.f17040b);
        this.f20809a.f17045g.set(dVar);
        j0Var.j().a(dVar, d5.a.c(this.f20809a.getContext()));
        this.f20809a.f17040b.d(p1Var, new l0.d(this, dVar, j0Var, 4));
        PreviewView previewView6 = this.f20809a;
        if (previewView6.indexOfChild(previewView6.f17041c) == -1) {
            PreviewView previewView7 = this.f20809a;
            previewView7.addView(previewView7.f17041c);
        }
        this.f20809a.getClass();
    }
}
