package by1;

import java.util.Calendar;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

/* loaded from: classes4.dex */
public final class h extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public static final h f24152i = new h(0);

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Calendar calendar = Calendar.getInstance();
        calendar.add(5, -30);
        return calendar.getTime();
    }
}
