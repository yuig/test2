package zf;

import android.graphics.Canvas;

/* loaded from: classes3.dex */
public final class e extends p {

    /* renamed from: h, reason: collision with root package name */
    public final wf.d f141827h;

    public e(wf.d dVar, org.chromium.net.y yVar, ag.j jVar) {
        super(yVar, jVar);
        this.f141827h = dVar;
    }

    @Override // zf.h
    public final void q(Canvas canvas) {
        this.f141827h.g();
        throw null;
    }

    @Override // zf.h
    public final void r(Canvas canvas) {
    }

    @Override // zf.h
    public final void s(Canvas canvas, vf.c[] cVarArr) {
        this.f141827h.g();
        if (cVarArr.length <= 0) {
            return;
        }
        int i13 = cVarArr[0].f125770f;
        throw null;
    }

    @Override // zf.h
    public final void t(Canvas canvas) {
        wf.d dVar = this.f141827h;
        if (v(dVar)) {
            dVar.g();
            throw null;
        }
    }

    @Override // zf.h
    public final void u() {
    }
}
