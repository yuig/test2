package qm;

/* loaded from: classes.dex */
public final class g1 extends nm.i0 {
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() != um.b.NULL) {
            return Boolean.valueOf(aVar.Y0());
        }
        aVar.B1();
        return null;
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        Boolean bool = (Boolean) obj;
        cVar.M(bool == null ? "null" : bool.toString());
    }
}
