package gb2;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class e extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public static final e f64746i = new e(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        List it = (List) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        return Boolean.valueOf(!it.isEmpty());
    }
}
