package nm;

/* loaded from: classes3.dex */
public final class l extends i0 {
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() != um.b.NULL) {
            return Long.valueOf(aVar.W1());
        }
        aVar.B1();
        return null;
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        Number number = (Number) obj;
        if (number == null) {
            cVar.m();
        } else {
            cVar.M(number.toString());
        }
    }
}
