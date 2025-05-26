package okhttp3.internal.http2;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/http2/StreamResetException;", "Ljava/io/IOException;", "okhttp"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class StreamResetException extends IOException {

    /* renamed from: a, reason: collision with root package name */
    public final ErrorCode f96181a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StreamResetException(ErrorCode errorCode) {
        super("stream was reset: " + errorCode);
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        this.f96181a = errorCode;
    }
}
