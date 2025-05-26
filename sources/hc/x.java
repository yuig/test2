package hc;

/* loaded from: classes3.dex */
public abstract class x {

    /* renamed from: a, reason: collision with root package name */
    public static final tb.c f68685a = tb.c.k("nm", "mm", "hd");

    public static ec.l a(ic.e eVar) {
        String str = null;
        boolean z13 = false;
        ec.k kVar = null;
        while (eVar.hasNext()) {
            int k13 = eVar.k(f68685a);
            if (k13 == 0) {
                str = eVar.Y0();
            } else if (k13 == 1) {
                kVar = ec.k.forId(eVar.o0());
            } else if (k13 != 2) {
                eVar.m();
                eVar.E();
            } else {
                z13 = eVar.R0();
            }
        }
        return new ec.l(str, kVar, z13);
    }
}
