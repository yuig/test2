package jb0;

import nm.i0;
import pk.a0;

/* loaded from: classes.dex */
public final class c extends i0 {
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        String str = "";
        if (aVar.K() == um.b.STRING) {
            String Y0 = aVar.Y0();
            return !a0.s0(Y0) ? Y0 : "";
        }
        if (aVar.K() == um.b.NUMBER) {
            return Double.toString(aVar.s1());
        }
        if (aVar.K() == um.b.BEGIN_OBJECT) {
            aVar.c();
            while (aVar.hasNext()) {
                aVar.k0();
                aVar.Y0();
            }
            aVar.g();
            return null;
        }
        if (aVar.K() != um.b.BEGIN_ARRAY) {
            return null;
        }
        StringBuilder sb3 = new StringBuilder();
        aVar.a();
        while (aVar.hasNext()) {
            sb3.append(str);
            sb3.append(aVar.Y0());
            str = ",";
        }
        aVar.f();
        return sb3.toString();
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        String str = (String) obj;
        synchronized (this) {
            if (str == null) {
                cVar.m();
            } else {
                cVar.M(str);
            }
        }
    }
}
