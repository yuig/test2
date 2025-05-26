package ir;

import com.pinterest.api.model.f30;
import com.pinterest.api.model.wy0;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class x extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public static final x f73488i = new x(2);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        f30 pin = (f30) obj;
        wy0 user = (wy0) obj2;
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(user, "user");
        return new Pair(pin, user);
    }
}
