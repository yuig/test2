package hi2;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes4.dex */
public final class b extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public static final b f69241i = new b(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Function0 callback = (Function0) obj;
        Intrinsics.checkNotNullParameter(callback, "callback");
        return Boolean.valueOf(!((Boolean) callback.invoke()).booleanValue());
    }
}
