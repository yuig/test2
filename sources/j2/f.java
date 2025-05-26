package j2;

import i2.s1;
import i2.y2;

/* loaded from: classes2.dex */
public final class f extends j0 {

    /* renamed from: c, reason: collision with root package name */
    public static final f f74444c = new f(0, 2, 1);

    @Override // j2.j0
    public final void a(k0 k0Var, i2.f fVar, y2 y2Var, i2.y yVar) {
        q2.j jVar = (q2.j) k0Var.b(1);
        int i13 = jVar != null ? jVar.f102114a : 0;
        a aVar = (a) k0Var.b(0);
        if (i13 > 0) {
            fVar = new s1(fVar, i13);
        }
        aVar.z1(fVar, y2Var, yVar);
    }

    @Override // j2.j0
    public final String c(int i13) {
        return com.bumptech.glide.d.B(i13, 0) ? "changes" : com.bumptech.glide.d.B(i13, 1) ? "effectiveNodeIndex" : super.c(i13);
    }
}
