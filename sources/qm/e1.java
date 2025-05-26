package qm;

/* loaded from: classes.dex */
public final class e1 extends nm.i0 {
    @Override // nm.i0
    public final Object c(um.a aVar) {
        um.b K = aVar.K();
        if (K != um.b.NULL) {
            return K == um.b.STRING ? Boolean.valueOf(Boolean.parseBoolean(aVar.Y0())) : Boolean.valueOf(aVar.R0());
        }
        aVar.B1();
        return null;
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        cVar.K((Boolean) obj);
    }
}
