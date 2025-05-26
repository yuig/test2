package qm;

import com.google.gson.JsonIOException;
import java.net.URI;
import java.net.URISyntaxException;

/* loaded from: classes.dex */
public final class t0 extends nm.i0 {
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        try {
            String Y0 = aVar.Y0();
            if (Y0.equals("null")) {
                return null;
            }
            return new URI(Y0);
        } catch (URISyntaxException e13) {
            throw new JsonIOException(e13);
        }
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        URI uri = (URI) obj;
        cVar.M(uri == null ? null : uri.toASCIIString());
    }
}
