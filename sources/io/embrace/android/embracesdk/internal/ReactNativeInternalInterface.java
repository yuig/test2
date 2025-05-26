package io.embrace.android.embracesdk.internal;

import android.content.Context;
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

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J3\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\b\u0010\tJ=\u0010\r\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\n2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0010\u001a\u00020\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0013\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0013\u0010\u0011J\u0019\u0010\u0014\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0014\u0010\u0011J\u001f\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0002H&¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001aH&¢\u0006\u0004\b\u001c\u0010\u001dJO\u0010$\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001e2\u0016\u0010\f\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u0002H&¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020\u00072\u0006\u0010&\u001a\u00020\u0002H&¢\u0006\u0004\b'\u0010\u0011¨\u0006("}, d2 = {"Lio/embrace/android/embracesdk/internal/ReactNativeInternalInterface;", "Lnf2/g;", "", "name", "message", "type", "stacktrace", "", "logUnhandledJsException", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "", "properties", "logHandledJsException", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)V", "number", "setJavaScriptPatchNumber", "(Ljava/lang/String;)V", "version", "setReactNativeSdkVersion", "setReactNativeVersionNumber", "Landroid/content/Context;", "context", "url", "setJavaScriptBundleUrl", "(Landroid/content/Context;Ljava/lang/String;)V", "", "didUpdate", "setCacheableJavaScriptBundleUrl", "(Landroid/content/Context;Ljava/lang/String;Z)V", "", "startTime", "endTime", "", "bytesSent", "output", "logRnAction", "(Ljava/lang/String;JJLjava/util/Map;ILjava/lang/String;)V", "screen", "logRnView", "embrace-internal-api_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public interface ReactNativeInternalInterface extends g {
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

    @Override // nf2.g
    /* synthetic */ void logHandledException(@NotNull Throwable th3, @NotNull LogType logType, Map map, StackTraceElement[] stackTraceElementArr);

    void logHandledJsException(@NotNull String name, @NotNull String message, @NotNull Map<String, ? extends Object> properties, String stacktrace);

    @Override // nf2.g
    /* synthetic */ void logInfo(@NotNull String str, Map map);

    @Override // nf2.g
    /* synthetic */ void logInternalError(String str, String str2);

    @Override // nf2.g
    /* synthetic */ void logInternalError(@NotNull Throwable th3);

    void logRnAction(@NotNull String name, long startTime, long endTime, @NotNull Map<String, ? extends Object> properties, int bytesSent, @NotNull String output);

    void logRnView(@NotNull String screen);

    @Override // nf2.g
    /* synthetic */ void logTap(@NotNull Pair pair, @NotNull String str, @NotNull n nVar);

    void logUnhandledJsException(@NotNull String name, @NotNull String message, String type, String stacktrace);

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

    void setCacheableJavaScriptBundleUrl(@NotNull Context context, @NotNull String url, boolean didUpdate);

    void setJavaScriptBundleUrl(@NotNull Context context, @NotNull String url);

    void setJavaScriptPatchNumber(String number);

    void setReactNativeSdkVersion(String version);

    void setReactNativeVersionNumber(String version);

    @Override // nf2.g
    /* synthetic */ boolean shouldCaptureNetworkBody(@NotNull String str, @NotNull String str2);

    @Override // nf2.l
    /* synthetic */ String startSpan(@NotNull String str, String str2, Long l13);

    @Override // nf2.g
    /* synthetic */ void stopSdk();

    @Override // nf2.l
    /* synthetic */ boolean stopSpan(@NotNull String str, ErrorCode errorCode, Long l13);
}
