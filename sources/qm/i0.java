package qm;

/* loaded from: classes.dex */
public final class i0 extends nm.i0 {
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() != um.b.NULL) {
            return Float.valueOf((float) aVar.s1());
        }
        aVar.B1();
        return null;
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        Number number = (Number) obj;
        if (number == null) {
            cVar.m();
            return;
        }
        if (!(number instanceof Float)) {
            number = Float.valueOf(number.floatValue());
        }
        cVar.L(number);
    }
}
