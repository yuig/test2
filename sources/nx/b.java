package nx;

import java.util.Calendar;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final Date f92375a;

    /* renamed from: b, reason: collision with root package name */
    public static final Date f92376b;

    static {
        Calendar calendar = Calendar.getInstance();
        calendar.set(5, 8);
        calendar.set(2, 2);
        calendar.set(1, 2021);
        Date time = calendar.getTime();
        Intrinsics.checkNotNullExpressionValue(time, "getTime(...)");
        f92375a = time;
        Calendar calendar2 = Calendar.getInstance();
        calendar2.set(5, 20);
        calendar2.set(2, 0);
        calendar2.set(1, 2021);
        Date time2 = calendar2.getTime();
        Intrinsics.checkNotNullExpressionValue(time2, "getTime(...)");
        f92376b = time2;
    }
}
