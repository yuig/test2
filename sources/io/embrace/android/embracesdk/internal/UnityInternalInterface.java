package io.embrace.android.embracesdk.internal;

import io.embrace.android.embracesdk.LogType;
import io.embrace.android.embracesdk.network.EmbraceNetworkRequest;
import io.embrace.android.embracesdk.spans.ErrorCode;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import nf2.g;
import org.jetbrains.annotations.NotNull;
import qh2.k;
import th2.n;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J-\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\f\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\f\u0010\bJ)\u0010\r\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\r\u0010\bJM\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0016\u0010\u0017JQ\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0006H&¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lio/embrace/android/embracesdk/internal/UnityInternalInterface;", "Lnf2/g;", "", "unityVersion", "buildGuid", "unitySdkVersion", "", "setUnityMetaData", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "name", "message", "stacktrace", "logUnhandledUnityException", "logHandledUnityException", "url", "httpMethod", "", "startTime", "endTime", "errorType", "errorMessage", "traceId", "recordIncompleteNetworkRequest", "(Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "bytesSent", "bytesReceived", "", "statusCode", "recordCompletedNetworkRequest", "(Ljava/lang/String;Ljava/lang/String;JJJJILjava/lang/String;)V", "installUnityThreadSampler", "()V", "embrace-internal-api_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public interface UnityInternalInterface extends g {
    @Override // nf2.l
    /* synthetic */ boolean addSpanAttribute(@NotNull String str, @NotNull String str2, @NotNull String str3);

    @Override // nf2.l
    /* synthetic */ boolean addSpanEvent(@NotNull String str, @NotNull String str2, Long l13, Map map);

    void installUnityThreadSampler();

    @Override // nf2.g
    /* synthetic */ boolean isAnrCaptureEnabled();

    @Override // nf2.g
    /* synthetic */ boolean isNdkEnabled();

    @Override // nf2.g
    /* synthetic */ boolean isNetworkSpanForwardingEnabled();

    @Override // nf2.g
    /* synthetic */ void logComposeTap(@NotNull Pair pair, @NotNull String str);

    @Override // nf2.g
    /* synthetic */ void logError(@NotNull String str, Map map, String str2, boolean z13);

    @Override // nf2.g
    /* synthetic */ void logHandledException(@NotNull Throwable th3, @NotNull LogType logType, Map map, StackTraceElement[] stackTraceElementArr);

    void logHandledUnityException(@NotNull String name, @NotNull String message, String stacktrace);

    @Override // nf2.g
    /* synthetic */ void logInfo(@NotNull String str, Map map);

    @Override // nf2.g
    /* synthetic */ void logInternalError(String str, String str2);

    @Override // nf2.g
    /* synthetic */ void logInternalError(@NotNull Throwable th3);

    @Override // nf2.g
    /* synthetic */ void logTap(@NotNull Pair pair, @NotNull String str, @NotNull n nVar);

    void logUnhandledUnityException(@NotNull String name, @NotNull String message, String stacktrace);

    @Override // nf2.g
    /* synthetic */ void logWarning(@NotNull String str, Map map, String str2);

    void recordCompletedNetworkRequest(@NotNull String url, @NotNull String httpMethod, long startTime, long endTime, long bytesSent, long bytesReceived, int statusCode, String traceId);

    @Override // nf2.g
    /* synthetic */ void recordCompletedNetworkRequest(@NotNull String str, @NotNull String str2, long j13, long j14, long j15, long j16, int i13, String str3, k kVar);

    @Override // nf2.l
    /* synthetic */ boolean recordCompletedSpan(@NotNull String str, long j13, long j14, ErrorCode errorCode, String str2, Map map, List list);

    void recordIncompleteNetworkRequest(@NotNull String url, @NotNull String httpMethod, long startTime, long endTime, String errorType, String errorMessage, String traceId);

    @Override // nf2.g
    /* synthetic */ void recordIncompleteNetworkRequest(@NotNull String str, @NotNull String str2, long j13, long j14, String str3, String str4, String str5, k kVar);

    @Override // nf2.g
    /* synthetic */ void recordIncompleteNetworkRequest(@NotNull String str, @NotNull String str2, long j13, long j14, Throwable th3, String str3, k kVar);

    @Override // nf2.g
    /* synthetic */ void recordNetworkRequest(@NotNull EmbraceNetworkRequest embraceNetworkRequest);

    @Override // nf2.l
    /* synthetic */ Object recordSpan(@NotNull String str, String str2, Map map, List list, @NotNull Function0 function0);

    void setUnityMetaData(String unityVersion, String buildGuid, String unitySdkVersion);

    @Override // nf2.g
    /* synthetic */ boolean shouldCaptureNetworkBody(@NotNull String str, @NotNull String str2);

    @Override // nf2.l
    /* synthetic */ String startSpan(@NotNull String str, String str2, Long l13);

    @Override // nf2.g
    /* synthetic */ void stopSdk();

    @Override // nf2.l
    /* synthetic */ boolean stopSpan(@NotNull String str, ErrorCode errorCode, Long l13);
}
