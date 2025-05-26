package qm;

/* loaded from: classes.dex */
public final class r0 extends nm.i0 {
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() != um.b.NULL) {
            return new StringBuffer(aVar.Y0());
        }
        aVar.B1();
        return null;
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        StringBuffer stringBuffer = (StringBuffer) obj;
        cVar.M(stringBuffer == null ? null : stringBuffer.toString());
    }
}
