package qm;

/* loaded from: classes.dex */
public final class p0 extends nm.i0 {
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() != um.b.NULL) {
            return new StringBuilder(aVar.Y0());
        }
        aVar.B1();
        return null;
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        StringBuilder sb3 = (StringBuilder) obj;
        cVar.M(sb3 == null ? null : sb3.toString());
    }
}
