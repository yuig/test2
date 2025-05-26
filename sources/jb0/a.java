package jb0;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import nm.i0;
import vb0.g;

/* loaded from: classes.dex */
public final class a extends i0 {
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() != um.b.NULL) {
            return g.c(aVar.Y0(), false);
        }
        aVar.B1();
        return null;
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        Date date = (Date) obj;
        synchronized (this) {
            if (date == null) {
                cVar.m();
                return;
            }
            if (g.f125463b == null) {
                g.f125463b = DateFormat.getDateTimeInstance(2, 2, Locale.US);
            }
            cVar.M(g.f125463b.format(date));
        }
    }
}
