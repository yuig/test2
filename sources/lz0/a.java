package lz0;

import kotlin.collections.e0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class a extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public static final a f85174i = new a(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        tt1.a response = (tt1.a) obj;
        Intrinsics.checkNotNullParameter(response, "response");
        return e0.b(response.c());
    }
}
