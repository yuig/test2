package ir1;

import android.app.Activity;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import u5.n;

/* loaded from: classes2.dex */
public final class b extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public static final b f73506i = new b(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Activity context = (Activity) obj;
        Intrinsics.checkNotNullParameter(context, "activity");
        Intrinsics.checkNotNullParameter(context, "context");
        return new n(context);
    }
}
