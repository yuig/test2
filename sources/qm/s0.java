package qm;

import java.net.URL;

/* loaded from: classes.dex */
public final class s0 extends nm.i0 {
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        String Y0 = aVar.Y0();
        if (Y0.equals("null")) {
            return null;
        }
        return new URL(Y0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        URL url = (URL) obj;
        cVar.M(url == null ? null : url.toExternalForm());
    }
}
