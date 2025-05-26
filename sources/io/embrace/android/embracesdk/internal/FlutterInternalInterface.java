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

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0007\u0010\u0006JA\u0010\r\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\r\u0010\u000eJA\u0010\u000f\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u000f\u0010\u000e¨\u0006\u0010"}, d2 = {"Lio/embrace/android/embracesdk/internal/FlutterInternalInterface;", "Lnf2/g;", "", "version", "", "setEmbraceFlutterSdkVersion", "(Ljava/lang/String;)V", "setDartVersion", "stack", "name", "message", "context", "library", "logHandledDartException", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "logUnhandledDartException", "embrace-internal-api_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public interface FlutterInternalInterface extends g {
    @Override // nf2.l
    /* synthetic */ boolean addSpanAttribute(@NotNull String str, @NotNull String str2, @NotNull String str3);

    @Override // nf2.l
    /* synthetic */ boolean addSpanEvent(@NotNull String str, @NotNull String str2, Long l13, Map map);

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

    void logHandledDartException(String stack, String name, String message, String context, String library);

    @Override // nf2.g
    /* synthetic */ void logHandledException(@NotNull Throwable th3, @NotNull LogType logType, Map map, StackTraceElement[] stackTraceElementArr);

    @Override // nf2.g
    /* synthetic */ void logInfo(@NotNull String str, Map map);

    @Override // nf2.g
    /* synthetic */ void logInternalError(String str, String str2);

    @Override // nf2.g
    /* synthetic */ void logInternalError(@NotNull Throwable th3);

    @Override // nf2.g
    /* synthetic */ void logTap(@NotNull Pair pair, @NotNull String str, @NotNull n nVar);

    void logUnhandledDartException(String stack, String name, String message, String context, String library);

    @Override // nf2.g
    /* synthetic */ void logWarning(@NotNull String str, Map map, String str2);

    @Override // nf2.g
    /* synthetic */ void recordCompletedNetworkRequest(@NotNull String str, @NotNull String str2, long j13, long j14, long j15, long j16, int i13, String str3, k kVar);

    @Override // nf2.l
    /* synthetic */ boolean recordCompletedSpan(@NotNull String str, long j13, long j14, ErrorCode errorCode, String str2, Map map, List list);

    @Override // nf2.g
    /* synthetic */ void recordIncompleteNetworkRequest(@NotNull String str, @NotNull String str2, long j13, long j14, String str3, String str4, String str5, k kVar);

    @Override // nf2.g
    /* synthetic */ void recordIncompleteNetworkRequest(@NotNull String str, @NotNull String str2, long j13, long j14, Throwable th3, String str3, k kVar);

    @Override // nf2.g
    /* synthetic */ void recordNetworkRequest(@NotNull EmbraceNetworkRequest embraceNetworkRequest);

    @Override // nf2.l
    /* synthetic */ Object recordSpan(@NotNull String str, String str2, Map map, List list, @NotNull Function0 function0);

    void setDartVersion(String version);

    void setEmbraceFlutterSdkVersion(String version);

    @Override // nf2.g
    /* synthetic */ boolean shouldCaptureNetworkBody(@NotNull String str, @NotNull String str2);

    @Override // nf2.l
    /* synthetic */ String startSpan(@NotNull String str, String str2, Long l13);

    @Override // nf2.g
    /* synthetic */ void stopSdk();

    @Override // nf2.l
    /* synthetic */ boolean stopSpan(@NotNull String str, ErrorCode errorCode, Long l13);
}
