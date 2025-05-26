package qm;

import a.cb;
import com.google.gson.JsonSyntaxException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.Objects;
import java.util.TimeZone;
import kh2.c3;

/* loaded from: classes.dex */
public final class h extends nm.i0 {

    /* renamed from: c */
    public static final e f104164c = new e();

    /* renamed from: a */
    public final g f104165a;

    /* renamed from: b */
    public final ArrayList f104166b;

    public h(g gVar, int i13, int i14) {
        ArrayList arrayList = new ArrayList();
        this.f104166b = arrayList;
        Objects.requireNonNull(gVar);
        this.f104165a = gVar;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(i13, i14, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(i13, i14));
        }
        if (pm.i.a()) {
            arrayList.add(c3.L(i13, i14));
        }
    }

    @Override // nm.i0
    public final Object c(um.a aVar) {
        Date b13;
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        String Y0 = aVar.Y0();
        synchronized (this.f104166b) {
            try {
                Iterator it = this.f104166b.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        try {
                            b13 = rm.a.b(Y0, new ParsePosition(0));
                            break;
                        } catch (ParseException e13) {
                            StringBuilder o13 = cb.o("Failed parsing '", Y0, "' as Date; at path ");
                            o13.append(aVar.o());
                            throw new JsonSyntaxException(o13.toString(), e13);
                        }
                    }
                    DateFormat dateFormat = (DateFormat) it.next();
                    TimeZone timeZone = dateFormat.getTimeZone();
                    try {
                        try {
                            b13 = dateFormat.parse(Y0);
                            break;
                        } catch (ParseException unused) {
                            dateFormat.setTimeZone(timeZone);
                        }
                    } finally {
                        dateFormat.setTimeZone(timeZone);
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return this.f104165a.c(b13);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        String format;
        Date date = (Date) obj;
        if (date == null) {
            cVar.m();
            return;
        }
        DateFormat dateFormat = (DateFormat) this.f104166b.get(0);
        synchronized (this.f104166b) {
            format = dateFormat.format(date);
        }
        cVar.M(format);
    }

    public final String toString() {
        DateFormat dateFormat = (DateFormat) this.f104166b.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            return "DefaultDateTypeAdapter(" + ((SimpleDateFormat) dateFormat).toPattern() + ')';
        }
        return "DefaultDateTypeAdapter(" + dateFormat.getClass().getSimpleName() + ')';
    }

    public h(g gVar, String str) {
        ArrayList arrayList = new ArrayList();
        this.f104166b = arrayList;
        Objects.requireNonNull(gVar);
        this.f104165a = gVar;
        Locale locale = Locale.US;
        arrayList.add(new SimpleDateFormat(str, locale));
        if (Locale.getDefault().equals(locale)) {
            return;
        }
        arrayList.add(new SimpleDateFormat(str));
    }
}
