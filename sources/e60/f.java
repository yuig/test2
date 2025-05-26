package e60;

import com.pinterest.api.model.f30;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import wt1.c0;

/* loaded from: classes5.dex */
public final class f extends s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public static final f f57499i = new f(2);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        f30 pin = (f30) obj;
        c0 state = (c0) obj2;
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(state, "state");
        return new Pair(state, pin);
    }
}
