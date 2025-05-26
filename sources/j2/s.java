package j2;

import i2.w2;
import i2.y2;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class s extends j0 {

    /* renamed from: c, reason: collision with root package name */
    public static final s f74475c = new s(0, 3, 1);

    @Override // j2.j0
    public final void a(k0 k0Var, i2.f fVar, y2 y2Var, i2.y yVar) {
        w2 w2Var = (w2) k0Var.b(1);
        i2.d dVar = (i2.d) k0Var.b(0);
        c cVar = (c) k0Var.b(2);
        y2 i13 = w2Var.i();
        try {
            if (!cVar.f74438b.C1()) {
                i2.u.i("FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?");
                throw null;
            }
            cVar.f74437a.B1(fVar, i13, yVar);
            Unit unit = Unit.f80348a;
            i13.e(true);
            y2Var.d();
            dVar.getClass();
            y2Var.v(w2Var, w2Var.b(dVar));
            y2Var.j();
        } catch (Throwable th3) {
            i13.e(false);
            throw th3;
        }
    }

    @Override // j2.j0
    public final String c(int i13) {
        return com.bumptech.glide.d.B(i13, 0) ? "anchor" : com.bumptech.glide.d.B(i13, 1) ? "from" : com.bumptech.glide.d.B(i13, 2) ? "fixups" : super.c(i13);
    }
}
