package zf;

import android.graphics.Canvas;
import android.graphics.Paint;

/* loaded from: classes3.dex */
public final class d extends c {

    /* renamed from: g, reason: collision with root package name */
    public final wf.c f141826g;

    public d(wf.c cVar, org.chromium.net.y yVar, ag.j jVar) {
        super(yVar, jVar);
        this.f141826g = cVar;
        this.f141833c.setStyle(Paint.Style.FILL);
        this.f141834d.setStyle(Paint.Style.STROKE);
        this.f141834d.setStrokeWidth(ag.i.c(1.5f));
    }

    @Override // zf.h
    public final void q(Canvas canvas) {
        this.f141826g.a();
        throw null;
    }

    @Override // zf.h
    public final void r(Canvas canvas) {
    }

    @Override // zf.h
    public final void s(Canvas canvas, vf.c[] cVarArr) {
        this.f141826g.a();
        this.f141832b.getClass();
        if (cVarArr.length <= 0) {
            return;
        }
        int i13 = cVarArr[0].f125770f;
        throw null;
    }

    @Override // zf.h
    public final void t(Canvas canvas) {
        this.f141826g.a();
    }

    @Override // zf.h
    public final void u() {
    }
}
