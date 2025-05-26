package xx;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final SimpleDateFormat f136125a;

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm'Z'", Locale.ENGLISH);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        f136125a = simpleDateFormat;
    }

    public static final String a(int i13) {
        SimpleDateFormat simpleDateFormat = f136125a;
        Calendar calendar = Calendar.getInstance();
        calendar.add(5, i13);
        String format = simpleDateFormat.format(calendar.getTime());
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        String substring = format.substring(0, 10);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return substring;
    }

    public static final String b(Long l13) {
        SimpleDateFormat simpleDateFormat = f136125a;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(l13.longValue());
        String format = simpleDateFormat.format(calendar.getTime());
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        String substring = format.substring(0, 10);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return substring;
    }

    public static final String c(int i13, boolean z13) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(TimeZone.getTimeZone("UTC"));
        calendar.add(5, i13);
        if (z13) {
            calendar.set(11, 0);
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
        }
        return String.valueOf(calendar.getTimeInMillis() / 1000);
    }
}
