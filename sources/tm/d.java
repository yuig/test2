package tm;

import com.google.gson.JsonSyntaxException;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import nm.i0;

/* loaded from: classes.dex */
public final class d extends i0 {

    /* renamed from: b, reason: collision with root package name */
    public static final c f118115b = new c();

    /* renamed from: a, reason: collision with root package name */
    public final SimpleDateFormat f118116a;

    private d() {
        this.f118116a = new SimpleDateFormat("hh:mm:ss a");
    }

    @Override // nm.i0
    public final Object c(um.a aVar) {
        Time time;
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        String Y0 = aVar.Y0();
        synchronized (this) {
            TimeZone timeZone = this.f118116a.getTimeZone();
            try {
                try {
                    time = new Time(this.f118116a.parse(Y0).getTime());
                } catch (ParseException e13) {
                    throw new JsonSyntaxException("Failed parsing '" + Y0 + "' as SQL Time; at path " + aVar.o(), e13);
                }
            } finally {
                this.f118116a.setTimeZone(timeZone);
            }
        }
        return time;
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        String format;
        Time time = (Time) obj;
        if (time == null) {
            cVar.m();
            return;
        }
        synchronized (this) {
            format = this.f118116a.format((Date) time);
        }
        cVar.M(format);
    }

    public /* synthetic */ d(int i13) {
        this();
    }
}
