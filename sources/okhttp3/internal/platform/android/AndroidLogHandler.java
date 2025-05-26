package okhttp3.internal.platform.android;

import android.util.Log;
import java.util.logging.Handler;
import java.util.logging.LogRecord;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.e0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/internal/platform/android/AndroidLogHandler;", "Ljava/util/logging/Handler;", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class AndroidLogHandler extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public static final AndroidLogHandler f96224a = new AndroidLogHandler();

    private AndroidLogHandler() {
    }

    @Override // java.util.logging.Handler
    public final void close() {
    }

    @Override // java.util.logging.Handler
    public final void flush() {
    }

    @Override // java.util.logging.Handler
    public final void publish(LogRecord record) {
        int min;
        Intrinsics.checkNotNullParameter(record, "record");
        AndroidLog androidLog = AndroidLog.f96221a;
        String loggerName = record.getLoggerName();
        Intrinsics.checkNotNullExpressionValue(loggerName, "record.loggerName");
        int a13 = AndroidLogKt.a(record);
        String message = record.getMessage();
        Intrinsics.checkNotNullExpressionValue(message, "record.message");
        Throwable thrown = record.getThrown();
        androidLog.getClass();
        Intrinsics.checkNotNullParameter(loggerName, "loggerName");
        Intrinsics.checkNotNullParameter(message, "message");
        String str = (String) AndroidLog.f96223c.get(loggerName);
        if (str == null) {
            str = e0.C(23, loggerName);
        }
        if (Log.isLoggable(str, a13)) {
            if (thrown != null) {
                message = message + '\n' + Log.getStackTraceString(thrown);
            }
            int length = message.length();
            int i13 = 0;
            while (i13 < length) {
                int K = StringsKt.K(message, '\n', i13, false, 4);
                if (K == -1) {
                    K = length;
                }
                while (true) {
                    min = Math.min(K, i13 + 4000);
                    String substring = message.substring(i13, min);
                    Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    Log.println(a13, str, substring);
                    if (min >= K) {
                        break;
                    } else {
                        i13 = min;
                    }
                }
                i13 = min + 1;
            }
        }
    }
}
