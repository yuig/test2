package qm;

import java.util.Locale;
import java.util.StringTokenizer;

/* loaded from: classes.dex */
public final class y0 extends nm.i0 {
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        StringTokenizer stringTokenizer = new StringTokenizer(aVar.Y0(), "_");
        String nextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
        String nextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
        String nextToken3 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
        return (nextToken2 == null && nextToken3 == null) ? new Locale(nextToken) : nextToken3 == null ? new Locale(nextToken, nextToken2) : new Locale(nextToken, nextToken2, nextToken3);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        Locale locale = (Locale) obj;
        cVar.M(locale == null ? null : locale.toString());
    }
}
