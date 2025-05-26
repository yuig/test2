package n31;

import java.util.List;
import kotlin.collections.e0;
import kotlin.collections.q0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class b extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public static final b f89159i = new b(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        tt1.a response = (tt1.a) obj;
        Intrinsics.checkNotNullParameter(response, "response");
        List list = (List) response.c();
        if (list == null) {
            list = q0.f80391a;
        }
        return list.isEmpty() ^ true ? e0.b(new d(list, 0, 2, null)) : q0.f80391a;
    }
}
