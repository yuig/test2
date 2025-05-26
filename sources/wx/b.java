package wx;

import java.text.DateFormat;
import java.util.TimeZone;

/* loaded from: classes3.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final DateFormat f131196a;

    static {
        TimeZone timeZone = TimeZone.getTimeZone("UTC");
        DateFormat dateInstance = DateFormat.getDateInstance(3);
        dateInstance.setTimeZone(timeZone);
        f131196a = dateInstance;
        DateFormat.getTimeInstance(3).setTimeZone(timeZone);
    }
}
