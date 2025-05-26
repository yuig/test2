package vb0;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final SimpleDateFormat f125462a;

    /* renamed from: b, reason: collision with root package name */
    public static DateFormat f125463b;

    /* renamed from: c, reason: collision with root package name */
    public static final SimpleDateFormat f125464c;

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss Z", Locale.ENGLISH);
        f125462a = simpleDateFormat;
        f125464c = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
    }

    public static Date a(Date date, int i13) {
        if (date == null) {
            throw new IllegalArgumentException("The date must not be null");
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(5, i13);
        return calendar.getTime();
    }

    public static Date b(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTime();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.Date] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.Date] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.Date] */
    public static Date c(String str, boolean z13) {
        Date date = new Date();
        if (str == null || str.length() == 0) {
            return date;
        }
        try {
            try {
                str = z13 ? f125464c.parse(str) : f125462a.parse(str);
                return str;
            } catch (Exception e13) {
                e13.toString();
                return date;
            }
        } catch (Exception unused) {
            if (f125463b == null) {
                f125463b = DateFormat.getDateTimeInstance(2, 2, Locale.US);
            }
            return f125463b.parse(str);
        }
    }
}
