package tu1;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.apache.http.conn.ConnectTimeoutException;

/* loaded from: classes2.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public static final Regex f119420a = new Regex("ErrorCode=(\\d+)");

    public static Throwable a(Throwable t13) {
        kotlin.text.j b13;
        String str;
        Intrinsics.checkNotNullParameter(t13, "t");
        String message = t13.getMessage();
        if (message == null) {
            return t13;
        }
        Integer num = null;
        if (message.length() != 0 && (b13 = f119420a.b(0, message)) != null && (str = (String) CollectionsKt.U(1, b13.b())) != null) {
            num = StringsKt.toIntOrNull(str);
        }
        if (num == null) {
            return t13;
        }
        switch (num.intValue()) {
            case 1:
                Throwable initCause = new UnknownHostException().initCause(t13);
                Intrinsics.checkNotNullExpressionValue(initCause, "initCause(...)");
                return initCause;
            case 2:
                Throwable initCause2 = new InterruptedIOException().initCause(t13);
                Intrinsics.checkNotNullExpressionValue(initCause2, "initCause(...)");
                return initCause2;
            case 3:
                Throwable initCause3 = new InterruptedIOException().initCause(t13);
                Intrinsics.checkNotNullExpressionValue(initCause3, "initCause(...)");
                return initCause3;
            case 4:
            case 6:
                Throwable initCause4 = new SocketTimeoutException().initCause(t13);
                Intrinsics.checkNotNullExpressionValue(initCause4, "initCause(...)");
                return initCause4;
            case 5:
                Throwable initCause5 = new ConnectTimeoutException().initCause(t13);
                Intrinsics.checkNotNullExpressionValue(initCause5, "initCause(...)");
                return initCause5;
            case 7:
                Throwable initCause6 = new ConnectException().initCause(t13);
                Intrinsics.checkNotNullExpressionValue(initCause6, "initCause(...)");
                return initCause6;
            case 8:
                Throwable initCause7 = new ConnectTimeoutException().initCause(t13);
                Intrinsics.checkNotNullExpressionValue(initCause7, "initCause(...)");
                return initCause7;
            case 9:
            case 10:
                Throwable initCause8 = new IOException().initCause(t13);
                Intrinsics.checkNotNullExpressionValue(initCause8, "initCause(...)");
                return initCause8;
            case 11:
                Throwable initCause9 = new IOException().initCause(t13);
                Intrinsics.checkNotNullExpressionValue(initCause9, "initCause(...)");
                return initCause9;
            default:
                Throwable initCause10 = new IOException().initCause(t13);
                Intrinsics.checkNotNullExpressionValue(initCause10, "initCause(...)");
                return initCause10;
        }
    }
}
