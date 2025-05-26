package fc;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.airbnb.lottie.v;
import ec.s;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes.dex */
public final class k extends c {
    public final yb.d C;
    public final e D;

    public k(com.airbnb.lottie.h hVar, v vVar, e eVar, i iVar) {
        super(vVar, iVar);
        this.D = eVar;
        yb.d dVar = new yb.d(vVar, this, new s("__container", iVar.f61648a, false), hVar);
        this.C = dVar;
        dVar.b(Collections.emptyList(), Collections.emptyList());
    }

    @Override // fc.c, yb.e
    public final void c(RectF rectF, Matrix matrix, boolean z13) {
        super.c(rectF, matrix, z13);
        this.C.c(rectF, this.f61634n, z13);
    }

    @Override // fc.c
    public final void k(Canvas canvas, Matrix matrix, int i13) {
        this.C.f(canvas, matrix, i13);
    }

    @Override // fc.c
    public final h1.b l() {
        h1.b bVar = this.f61636p.f61670w;
        return bVar != null ? bVar : this.D.f61636p.f61670w;
    }

    @Override // fc.c
    public final androidx.camera.core.impl.j n() {
        androidx.camera.core.impl.j jVar = this.f61636p.f61671x;
        return jVar != null ? jVar : this.D.f61636p.f61671x;
    }

    @Override // fc.c
    public final void q(cc.f fVar, int i13, ArrayList arrayList, cc.f fVar2) {
        this.C.g(fVar, i13, arrayList, fVar2);
    }
}
