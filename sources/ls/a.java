package ls;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes3.dex */
public final class a extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public static final a f84609i = new a(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        vd0.c it = (vd0.c) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        vd0.c m13 = it.m("data");
        return m13 == null ? new vd0.c() : m13;
    }
}
