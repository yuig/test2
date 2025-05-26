package qm;

import java.net.InetAddress;

/* loaded from: classes.dex */
public final class u0 extends nm.i0 {
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() != um.b.NULL) {
            return InetAddress.getByName(aVar.Y0());
        }
        aVar.B1();
        return null;
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        InetAddress inetAddress = (InetAddress) obj;
        cVar.M(inetAddress == null ? null : inetAddress.getHostAddress());
    }
}
