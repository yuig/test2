package dj0;

import com.pinterest.api.model.f3;
import com.pinterest.api.model.f30;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class d extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public static final d f55131i = new d(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        f30 it = (f30) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        f3 z33 = it.z3();
        if (z33 != null) {
            return z33.getId();
        }
        return null;
    }
}
