package qm;

import java.util.Calendar;
import java.util.GregorianCalendar;

/* loaded from: classes.dex */
public final class x0 extends nm.i0 {
    @Override // nm.i0
    public final Object c(um.a aVar) {
        int o03;
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        aVar.c();
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        while (aVar.K() != um.b.END_OBJECT) {
            String k03 = aVar.k0();
            o03 = aVar.o0();
            k03.getClass();
            switch (k03) {
                case "dayOfMonth":
                    i15 = o03;
                    break;
                case "minute":
                    i17 = o03;
                    break;
                case "second":
                    i18 = o03;
                    break;
                case "year":
                    i13 = o03;
                    break;
                case "month":
                    i14 = o03;
                    break;
                case "hourOfDay":
                    i16 = o03;
                    break;
            }
        }
        aVar.g();
        return new GregorianCalendar(i13, i14, i15, i16, i17, i18);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        if (((Calendar) obj) == null) {
            cVar.m();
            return;
        }
        cVar.d();
        cVar.h("year");
        cVar.J(r4.get(1));
        cVar.h("month");
        cVar.J(r4.get(2));
        cVar.h("dayOfMonth");
        cVar.J(r4.get(5));
        cVar.h("hourOfDay");
        cVar.J(r4.get(11));
        cVar.h("minute");
        cVar.J(r4.get(12));
        cVar.h("second");
        cVar.J(r4.get(13));
        cVar.g();
    }
}
