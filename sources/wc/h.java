package wc;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import lb.l0;

/* loaded from: classes.dex */
public final class h extends s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public static final h f129087i = new h(2);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        String key = (String) obj;
        f fVar = (f) obj2;
        Intrinsics.checkNotNullParameter(key, "key");
        return Integer.valueOf(l0.J(key).length + (fVar != null ? fVar.f129083d : 0));
    }
}
