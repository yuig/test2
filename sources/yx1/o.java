package yx1;

import java.util.Calendar;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class o extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public static final o f140385i = new o(0);

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Calendar calendar = Calendar.getInstance();
        calendar.add(5, -30);
        return calendar.getTime();
    }
}
