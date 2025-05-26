package zf;

import android.graphics.Canvas;

/* loaded from: classes3.dex */
public final class s extends p {

    /* renamed from: h, reason: collision with root package name */
    public final wf.h f141879h;

    public s(wf.h hVar, org.chromium.net.y yVar, ag.j jVar) {
        super(yVar, jVar);
        this.f141879h = hVar;
    }

    @Override // zf.h
    public final void q(Canvas canvas) {
        this.f141879h.b();
        throw null;
    }

    @Override // zf.h
    public final void r(Canvas canvas) {
    }

    @Override // zf.h
    public final void s(Canvas canvas, vf.c[] cVarArr) {
        this.f141879h.b();
        if (cVarArr.length <= 0) {
            return;
        }
        int i13 = cVarArr[0].f125770f;
        throw null;
    }

    @Override // zf.h
    public final void t(Canvas canvas) {
        wf.h hVar = this.f141879h;
        if (v(hVar)) {
            hVar.b();
            throw null;
        }
    }

    @Override // zf.h
    public final void u() {
    }
}
