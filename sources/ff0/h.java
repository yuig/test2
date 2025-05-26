package ff0;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import kotlin.text.z;

/* loaded from: classes5.dex */
public final class h extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public static final h f62101i = new h(0);

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "getStackTrace(...)");
        int length = stackTrace.length;
        boolean z13 = false;
        int i13 = 0;
        while (true) {
            if (i13 >= length) {
                break;
            }
            String className = stackTrace[i13].getClassName();
            Intrinsics.checkNotNullExpressionValue(className, "getClassName(...)");
            if (z.p(className, "org.junit.", false)) {
                z13 = true;
                break;
            }
            i13++;
        }
        return Boolean.valueOf(z13);
    }
}
