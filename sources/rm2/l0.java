package rm2;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import t3.s1;

/* loaded from: classes2.dex */
public final class l0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public static final l0 f108751i = new l0(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String it = (String) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        return it.length() > 1 ? s1.b("L", it, ';') : it;
    }
}
