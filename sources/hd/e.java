package hd;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

/* loaded from: classes3.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final a.g f68795a = new a.g(6);

    public static final Date a(String str) {
        try {
            Object obj = f68795a.get();
            if (obj == null) {
                throw new IllegalArgumentException("Unable to find valid dateformatter".toString());
            }
            Date parse = ((DateFormat) obj).parse(str);
            if (parse != null) {
                return parse;
            }
            throw new ParseException("DateFormat.parse returned null", 0);
        } catch (ParseException e13) {
            throw new IllegalArgumentException("Failed to parse timestamp", e13);
        }
    }

    public static final String b(Date date) {
        Object obj = f68795a.get();
        if (obj != null) {
            return ((DateFormat) obj).format(date);
        }
        throw new IllegalArgumentException("Unable to find valid dateformatter".toString());
    }
}
