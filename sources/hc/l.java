package hc;

/* loaded from: classes3.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static final tb.c f68663a = tb.c.k("fFamily", "fName", "fStyle", "ascent");

    public static cc.d a(ic.e eVar) {
        eVar.c();
        String str = null;
        String str2 = null;
        String str3 = null;
        while (eVar.hasNext()) {
            int k13 = eVar.k(f68663a);
            if (k13 == 0) {
                str = eVar.Y0();
            } else if (k13 == 1) {
                str2 = eVar.Y0();
            } else if (k13 == 2) {
                str3 = eVar.Y0();
            } else if (k13 != 3) {
                eVar.m();
                eVar.E();
            } else {
                eVar.s1();
            }
        }
        eVar.e();
        return new cc.d(str, str2, str3);
    }
}
