package yp2;

import java.io.IOException;

/* loaded from: classes4.dex */
public final class h extends d {
    @Override // yp2.d
    public final h b() {
        return this;
    }

    @Override // yp2.d
    public final void e(b bVar) {
        if (bVar == null) {
            throw new IOException("null object detected");
        }
        bVar.b().f().d(this);
    }
}
