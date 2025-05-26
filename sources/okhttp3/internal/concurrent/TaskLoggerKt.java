package okhttp3.internal.concurrent;

import a.a;
import java.util.Arrays;
import java.util.logging.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import t3.s1;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"okhttp"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class TaskLoggerKt {
    public static final void a(Task task, TaskQueue taskQueue, String str) {
        TaskRunner.f95852h.getClass();
        Logger logger = TaskRunner.f95854j;
        StringBuilder sb3 = new StringBuilder();
        sb3.append(taskQueue.f95845b);
        sb3.append(' ');
        String format = String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
        sb3.append(format);
        sb3.append(": ");
        sb3.append(task.f95840a);
        logger.fine(sb3.toString());
    }

    public static final String b(long j13) {
        return s1.d(new Object[]{j13 <= -999500000 ? a.o(new StringBuilder(), (j13 - 500000000) / 1000000000, " s ") : j13 <= -999500 ? a.o(new StringBuilder(), (j13 - 500000) / 1000000, " ms") : j13 <= 0 ? a.o(new StringBuilder(), (j13 - 500) / 1000, " µs") : j13 < 999500 ? a.o(new StringBuilder(), (j13 + 500) / 1000, " µs") : j13 < 999500000 ? a.o(new StringBuilder(), (j13 + 500000) / 1000000, " ms") : a.o(new StringBuilder(), (j13 + 500000000) / 1000000000, " s ")}, 1, "%6s", "format(format, *args)");
    }
}
