package tm;

import com.google.gson.JsonSyntaxException;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.TimeZone;
import nm.i0;

/* loaded from: classes.dex */
public final class b extends i0 {

    /* renamed from: b, reason: collision with root package name */
    public static final a f118113b = new a();

    /* renamed from: a, reason: collision with root package name */
    public final SimpleDateFormat f118114a;

    private b() {
        this.f118114a = new SimpleDateFormat("MMM d, yyyy");
    }

    @Override // nm.i0
    public final Object c(um.a aVar) {
        Date date;
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        String Y0 = aVar.Y0();
        synchronized (this) {
            TimeZone timeZone = this.f118114a.getTimeZone();
            try {
                try {
                    date = new Date(this.f118114a.parse(Y0).getTime());
                } catch (ParseException e13) {
                    throw new JsonSyntaxException("Failed parsing '" + Y0 + "' as SQL Date; at path " + aVar.o(), e13);
                }
            } finally {
                this.f118114a.setTimeZone(timeZone);
            }
        }
        return date;
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        String format;
        Date date = (Date) obj;
        if (date == null) {
            cVar.m();
            return;
        }
        synchronized (this) {
            format = this.f118114a.format((java.util.Date) date);
        }
        cVar.M(format);
    }

    public /* synthetic */ b(int i13) {
        this();
    }
}
