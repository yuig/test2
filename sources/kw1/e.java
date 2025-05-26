package kw1;

import java.text.DateFormat;
import java.util.Date;
import java.util.TimeZone;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final TimeZone f81041a;

    /* renamed from: b, reason: collision with root package name */
    public static final DateFormat f81042b;

    /* renamed from: c, reason: collision with root package name */
    public static final DateFormat f81043c;

    static {
        TimeZone timeZone = TimeZone.getTimeZone("UTC");
        f81041a = timeZone;
        DateFormat dateInstance = DateFormat.getDateInstance(3);
        dateInstance.setTimeZone(timeZone);
        f81042b = dateInstance;
        DateFormat timeInstance = DateFormat.getTimeInstance(3);
        timeInstance.setTimeZone(timeZone);
        f81043c = timeInstance;
    }

    public static final String a(long j13, b dateFormatType) {
        Intrinsics.checkNotNullParameter(dateFormatType, "dateFormatType");
        String format = (dateFormatType == b.DATE ? f81042b : f81043c).format(Long.valueOf(j13));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }

    public static final String b(Date date, b dateFormatType) {
        Intrinsics.checkNotNullParameter(date, "<this>");
        Intrinsics.checkNotNullParameter(dateFormatType, "dateFormatType");
        String format = (dateFormatType == b.DATE ? f81042b : f81043c).format(date);
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }
}
