package bq0;

import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import uj2.b0;

/* loaded from: classes5.dex */
public final class c extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public static final c f23682i = new c(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Pair pair;
        vd0.c response = (vd0.c) obj;
        Intrinsics.checkNotNullParameter(response, "response");
        int j13 = response.j(0, "data");
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        if (j13 == -1) {
            pair = new Pair(Integer.valueOf(xc0.i.conversation_notifications_off), null);
        } else if (j13 > currentTimeMillis) {
            Integer valueOf = Integer.valueOf(xc0.i.conversation_notifications_muted_until);
            oo1.j jVar = oo1.j.f96854a;
            pair = new Pair(valueOf, oo1.j.f(j13));
        } else {
            pair = new Pair(Integer.valueOf(xc0.i.conversation_notifications_on), null);
        }
        return b0.j(pair);
    }
}
