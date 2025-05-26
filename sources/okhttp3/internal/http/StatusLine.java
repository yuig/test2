package okhttp3.internal.http;

import java.net.ProtocolException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;
import okhttp3.Protocol;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lokhttp3/internal/http/StatusLine;", "", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class StatusLine {

    /* renamed from: d, reason: collision with root package name */
    public static final Companion f95984d = new Companion(0);

    /* renamed from: a, reason: collision with root package name */
    public final Protocol f95985a;

    /* renamed from: b, reason: collision with root package name */
    public final int f95986b;

    /* renamed from: c, reason: collision with root package name */
    public final String f95987c;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004¨\u0006\n"}, d2 = {"Lokhttp3/internal/http/StatusLine$Companion;", "", "", "HTTP_CONTINUE", "I", "HTTP_MISDIRECTED_REQUEST", "HTTP_PERM_REDIRECT", "HTTP_TEMP_REDIRECT", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(int i13) {
            this();
        }

        public static StatusLine a(String statusLine) {
            Protocol protocol;
            int i13;
            String str;
            Intrinsics.checkNotNullParameter(statusLine, "statusLine");
            if (z.p(statusLine, "HTTP/1.", false)) {
                i13 = 9;
                if (statusLine.length() < 9 || statusLine.charAt(8) != ' ') {
                    throw new ProtocolException("Unexpected status line: ".concat(statusLine));
                }
                int charAt = statusLine.charAt(7) - '0';
                if (charAt == 0) {
                    protocol = Protocol.HTTP_1_0;
                } else {
                    if (charAt != 1) {
                        throw new ProtocolException("Unexpected status line: ".concat(statusLine));
                    }
                    protocol = Protocol.HTTP_1_1;
                }
            } else {
                if (!z.p(statusLine, "ICY ", false)) {
                    throw new ProtocolException("Unexpected status line: ".concat(statusLine));
                }
                protocol = Protocol.HTTP_1_0;
                i13 = 4;
            }
            int i14 = i13 + 3;
            if (statusLine.length() < i14) {
                throw new ProtocolException("Unexpected status line: ".concat(statusLine));
            }
            try {
                String substring = statusLine.substring(i13, i14);
                Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                int parseInt = Integer.parseInt(substring);
                if (statusLine.length() <= i14) {
                    str = "";
                } else {
                    if (statusLine.charAt(i14) != ' ') {
                        throw new ProtocolException("Unexpected status line: ".concat(statusLine));
                    }
                    str = statusLine.substring(i13 + 4);
                    Intrinsics.checkNotNullExpressionValue(str, "this as java.lang.String).substring(startIndex)");
                }
                return new StatusLine(protocol, parseInt, str);
            } catch (NumberFormatException unused) {
                throw new ProtocolException("Unexpected status line: ".concat(statusLine));
            }
        }
    }

    public StatusLine(Protocol protocol, int i13, String message) {
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        Intrinsics.checkNotNullParameter(message, "message");
        this.f95985a = protocol;
        this.f95986b = i13;
        this.f95987c = message;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder();
        if (this.f95985a == Protocol.HTTP_1_0) {
            sb3.append("HTTP/1.0");
        } else {
            sb3.append("HTTP/1.1");
        }
        sb3.append(' ');
        sb3.append(this.f95986b);
        sb3.append(' ');
        sb3.append(this.f95987c);
        String sb4 = sb3.toString();
        Intrinsics.checkNotNullExpressionValue(sb4, "StringBuilder().apply(builderAction).toString()");
        return sb4;
    }
}
