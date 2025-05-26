package xk2;

import java.io.PrintWriter;
import java.io.StringWriter;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public class f {
    public static void a(Throwable th3, Throwable exception) {
        Intrinsics.checkNotNullParameter(th3, "<this>");
        Intrinsics.checkNotNullParameter(exception, "exception");
        if (th3 != exception) {
            fl2.c.f62549a.a(th3, exception);
        }
    }

    public static String b(Throwable th3) {
        Intrinsics.checkNotNullParameter(th3, "<this>");
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th3.printStackTrace(printWriter);
        printWriter.flush();
        String stringWriter2 = stringWriter.toString();
        Intrinsics.checkNotNullExpressionValue(stringWriter2, "toString(...)");
        return stringWriter2;
    }
}
