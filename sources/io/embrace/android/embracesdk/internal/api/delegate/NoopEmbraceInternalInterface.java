package io.embrace.android.embracesdk.internal.api.delegate;

import android.annotation.SuppressLint;
import com.google.android.gms.ads.RequestConfiguration;
import io.embrace.android.embracesdk.LogType;
import io.embrace.android.embracesdk.network.EmbraceNetworkRequest;
import io.embrace.android.embracesdk.spans.ErrorCode;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import nf2.g;
import nf2.l;
import org.jetbrains.annotations.NotNull;
import qh2.k;
import th2.n;

@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010e\u001a\u00020\u0002¢\u0006\u0004\bf\u0010gJ(\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003H\u0096\u0001¢\u0006\u0004\b\b\u0010\tJD\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\rH\u0096\u0001¢\u0006\u0004\b\u000f\u0010\u0010Jv\u0010\u0019\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000b2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r2\u001c\b\u0002\u0010\u0018\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00170\r\u0018\u00010\u0016H\u0096\u0001¢\u0006\u0004\b\u0019\u0010\u001aJn\u0010\u001e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u001b2\u0006\u0010\n\u001a\u00020\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r2\u001c\b\u0002\u0010\u0018\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00170\r\u0018\u00010\u00162\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001cH\u0096\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ2\u0010 \u001a\u0004\u0018\u00010\u00032\u0006\u0010\n\u001a\u00020\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000bH\u0096\u0001¢\u0006\u0004\b \u0010!J0\u0010\"\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000bH\u0096\u0001¢\u0006\u0004\b\"\u0010#J-\u0010'\u001a\u00020&2\u0006\u0010$\u001a\u00020\u00032\u0014\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0017\u0018\u00010\rH\u0016¢\u0006\u0004\b'\u0010(J7\u0010*\u001a\u00020&2\u0006\u0010$\u001a\u00020\u00032\u0014\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0017\u0018\u00010\r2\b\u0010)\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b*\u0010+J?\u0010-\u001a\u00020&2\u0006\u0010$\u001a\u00020\u00032\u0014\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0017\u0018\u00010\r2\b\u0010)\u001a\u0004\u0018\u00010\u00032\u0006\u0010,\u001a\u00020\u0007H\u0016¢\u0006\u0004\b-\u0010.JE\u00106\u001a\u00020&2\u0006\u00100\u001a\u00020/2\u0006\u00102\u001a\u0002012\u0014\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0017\u0018\u00010\r2\u000e\u00105\u001a\n\u0012\u0004\u0012\u000204\u0018\u000103H\u0016¢\u0006\u0004\b6\u00107J[\u0010C\u001a\u00020&2\u0006\u00108\u001a\u00020\u00032\u0006\u00109\u001a\u00020\u00032\u0006\u0010:\u001a\u00020\u000b2\u0006\u0010;\u001a\u00020\u000b2\u0006\u0010<\u001a\u00020\u000b2\u0006\u0010=\u001a\u00020\u000b2\u0006\u0010?\u001a\u00020>2\b\u0010@\u001a\u0004\u0018\u00010\u00032\b\u0010B\u001a\u0004\u0018\u00010AH\u0016¢\u0006\u0004\bC\u0010DJM\u0010F\u001a\u00020&2\u0006\u00108\u001a\u00020\u00032\u0006\u00109\u001a\u00020\u00032\u0006\u0010:\u001a\u00020\u000b2\u0006\u0010;\u001a\u00020\u000b2\b\u0010E\u001a\u0004\u0018\u00010/2\b\u0010@\u001a\u0004\u0018\u00010\u00032\b\u0010B\u001a\u0004\u0018\u00010AH\u0016¢\u0006\u0004\bF\u0010GJW\u0010F\u001a\u00020&2\u0006\u00108\u001a\u00020\u00032\u0006\u00109\u001a\u00020\u00032\u0006\u0010:\u001a\u00020\u000b2\u0006\u0010;\u001a\u00020\u000b2\b\u0010H\u001a\u0004\u0018\u00010\u00032\b\u0010I\u001a\u0004\u0018\u00010\u00032\b\u0010@\u001a\u0004\u0018\u00010\u00032\b\u0010B\u001a\u0004\u0018\u00010AH\u0016¢\u0006\u0004\bF\u0010JJ\u0017\u0010M\u001a\u00020&2\u0006\u0010L\u001a\u00020KH\u0016¢\u0006\u0004\bM\u0010NJ+\u0010S\u001a\u00020&2\u0012\u0010Q\u001a\u000e\u0012\u0004\u0012\u00020P\u0012\u0004\u0012\u00020P0O2\u0006\u0010R\u001a\u00020\u0003H\u0016¢\u0006\u0004\bS\u0010TJ\u001f\u0010V\u001a\u00020\u00072\u0006\u00108\u001a\u00020\u00032\u0006\u0010U\u001a\u00020\u0003H\u0016¢\u0006\u0004\bV\u0010WJ\u000f\u0010X\u001a\u00020\u0007H\u0016¢\u0006\u0004\bX\u0010YJ\u000f\u0010Z\u001a\u00020\u0007H\u0016¢\u0006\u0004\bZ\u0010YJ\u000f\u0010[\u001a\u00020\u0007H\u0016¢\u0006\u0004\b[\u0010YJ#\u0010]\u001a\u00020&2\b\u0010$\u001a\u0004\u0018\u00010\u00032\b\u0010\\\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b]\u0010^J\u0017\u0010]\u001a\u00020&2\u0006\u0010E\u001a\u00020/H\u0016¢\u0006\u0004\b]\u0010_J\u000f\u0010`\u001a\u00020&H\u0016¢\u0006\u0004\b`\u0010aJ7\u0010c\u001a\u00020&2\u0016\u0010Q\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010P\u0012\u0006\u0012\u0004\u0018\u00010P0O2\u0006\u0010R\u001a\u00020\u00032\u0006\u00102\u001a\u00020bH\u0016¢\u0006\u0004\bc\u0010d¨\u0006h"}, d2 = {"Lio/embrace/android/embracesdk/internal/api/delegate/NoopEmbraceInternalInterface;", "Lnf2/g;", "Lnf2/l;", "", "spanId", "key", "value", "", "addSpanAttribute", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z", "name", "", "timestampMs", "", "attributes", "addSpanEvent", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/util/Map;)Z", "startTimeMs", "endTimeMs", "Lio/embrace/android/embracesdk/spans/ErrorCode;", "errorCode", "parentSpanId", "", "", "events", "recordCompletedSpan", "(Ljava/lang/String;JJLio/embrace/android/embracesdk/spans/ErrorCode;Ljava/lang/String;Ljava/util/Map;Ljava/util/List;)Z", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlin/Function0;", "code", "recordSpan", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/List;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "startSpan", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)Ljava/lang/String;", "stopSpan", "(Ljava/lang/String;Lio/embrace/android/embracesdk/spans/ErrorCode;Ljava/lang/Long;)Z", "message", "properties", "", "logInfo", "(Ljava/lang/String;Ljava/util/Map;)V", "stacktrace", "logWarning", "(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)V", "isException", "logError", "(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Z)V", "", "throwable", "Lio/embrace/android/embracesdk/LogType;", "type", "", "Ljava/lang/StackTraceElement;", "customStackTrace", "logHandledException", "(Ljava/lang/Throwable;Lio/embrace/android/embracesdk/LogType;Ljava/util/Map;[Ljava/lang/StackTraceElement;)V", "url", "httpMethod", "startTime", "endTime", "bytesSent", "bytesReceived", "", "statusCode", "traceId", "Lqh2/k;", "networkCaptureData", "recordCompletedNetworkRequest", "(Ljava/lang/String;Ljava/lang/String;JJJJILjava/lang/String;Lqh2/k;)V", "error", "recordIncompleteNetworkRequest", "(Ljava/lang/String;Ljava/lang/String;JJLjava/lang/Throwable;Ljava/lang/String;Lqh2/k;)V", "errorType", "errorMessage", "(Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lqh2/k;)V", "Lio/embrace/android/embracesdk/network/EmbraceNetworkRequest;", "embraceNetworkRequest", "recordNetworkRequest", "(Lio/embrace/android/embracesdk/network/EmbraceNetworkRequest;)V", "Lkotlin/Pair;", "", "point", "elementName", "logComposeTap", "(Lkotlin/Pair;Ljava/lang/String;)V", "method", "shouldCaptureNetworkBody", "(Ljava/lang/String;Ljava/lang/String;)Z", "isNetworkSpanForwardingEnabled", "()Z", "isAnrCaptureEnabled", "isNdkEnabled", "details", "logInternalError", "(Ljava/lang/String;Ljava/lang/String;)V", "(Ljava/lang/Throwable;)V", "stopSdk", "()V", "Lth2/n;", "logTap", "(Lkotlin/Pair;Ljava/lang/String;Lth2/n;)V", "internalTracer", "<init>", "(Lnf2/l;)V", "embrace-internal-api_release"}, k = 1, mv = {1, 8, 0})
@SuppressLint({"EmbracePublicApiPackageRule"})
/* loaded from: classes4.dex */
public final class NoopEmbraceInternalInterface implements g, l {
    private final /* synthetic */ l $$delegate_0;

    public NoopEmbraceInternalInterface(@NotNull l internalTracer) {
        Intrinsics.checkNotNullParameter(internalTracer, "internalTracer");
        this.$$delegate_0 = internalTracer;
    }

    @Override // nf2.l
    public boolean addSpanAttribute(@NotNull String spanId, @NotNull String key, @NotNull String value) {
        Intrinsics.checkNotNullParameter(spanId, "spanId");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        return this.$$delegate_0.addSpanAttribute(spanId, key, value);
    }

    @Override // nf2.l
    public boolean addSpanEvent(@NotNull String spanId, @NotNull String name, Long timestampMs, Map<String, String> attributes) {
        Intrinsics.checkNotNullParameter(spanId, "spanId");
        Intrinsics.checkNotNullParameter(name, "name");
        return this.$$delegate_0.addSpanEvent(spanId, name, timestampMs, attributes);
    }

    @Override // nf2.g
    public boolean isAnrCaptureEnabled() {
        return false;
    }

    @Override // nf2.g
    public boolean isNdkEnabled() {
        return false;
    }

    @Override // nf2.g
    public boolean isNetworkSpanForwardingEnabled() {
        return false;
    }

    @Override // nf2.g
    public void logComposeTap(@NotNull Pair<Float, Float> point, @NotNull String elementName) {
        Intrinsics.checkNotNullParameter(point, "point");
        Intrinsics.checkNotNullParameter(elementName, "elementName");
    }

    @Override // nf2.g
    public void logError(@NotNull String message, Map<String, ? extends Object> properties, String stacktrace, boolean isException) {
        Intrinsics.checkNotNullParameter(message, "message");
    }

    @Override // nf2.g
    public void logHandledException(@NotNull Throwable throwable, @NotNull LogType type, Map<String, ? extends Object> properties, StackTraceElement[] customStackTrace) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        Intrinsics.checkNotNullParameter(type, "type");
    }

    @Override // nf2.g
    public void logInfo(@NotNull String message, Map<String, ? extends Object> properties) {
        Intrinsics.checkNotNullParameter(message, "message");
    }

    @Override // nf2.g
    public void logInternalError(String message, String details) {
    }

    @Override // nf2.g
    public void logTap(@NotNull Pair<Float, Float> point, @NotNull String elementName, @NotNull n type) {
        Intrinsics.checkNotNullParameter(point, "point");
        Intrinsics.checkNotNullParameter(elementName, "elementName");
        Intrinsics.checkNotNullParameter(type, "type");
    }

    @Override // nf2.g
    public void logWarning(@NotNull String message, Map<String, ? extends Object> properties, String stacktrace) {
        Intrinsics.checkNotNullParameter(message, "message");
    }

    @Override // nf2.g
    public void recordCompletedNetworkRequest(@NotNull String url, @NotNull String httpMethod, long startTime, long endTime, long bytesSent, long bytesReceived, int statusCode, String traceId, k networkCaptureData) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(httpMethod, "httpMethod");
    }

    @Override // nf2.l
    public boolean recordCompletedSpan(@NotNull String name, long startTimeMs, long endTimeMs, ErrorCode errorCode, String parentSpanId, Map<String, String> attributes, List<? extends Map<String, ? extends Object>> events) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.$$delegate_0.recordCompletedSpan(name, startTimeMs, endTimeMs, errorCode, parentSpanId, attributes, events);
    }

    @Override // nf2.g
    public void recordIncompleteNetworkRequest(@NotNull String url, @NotNull String httpMethod, long startTime, long endTime, String errorType, String errorMessage, String traceId, k networkCaptureData) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(httpMethod, "httpMethod");
    }

    @Override // nf2.g
    public void recordNetworkRequest(@NotNull EmbraceNetworkRequest embraceNetworkRequest) {
        Intrinsics.checkNotNullParameter(embraceNetworkRequest, "embraceNetworkRequest");
    }

    @Override // nf2.l
    public <T> T recordSpan(@NotNull String name, String parentSpanId, Map<String, String> attributes, List<? extends Map<String, ? extends Object>> events, @NotNull Function0<? extends T> code) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(code, "code");
        return (T) this.$$delegate_0.recordSpan(name, parentSpanId, attributes, events, code);
    }

    @Override // nf2.g
    public boolean shouldCaptureNetworkBody(@NotNull String url, @NotNull String method) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(method, "method");
        return false;
    }

    @Override // nf2.l
    public String startSpan(@NotNull String name, String parentSpanId, Long startTimeMs) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.$$delegate_0.startSpan(name, parentSpanId, startTimeMs);
    }

    @Override // nf2.g
    public void stopSdk() {
    }

    @Override // nf2.l
    public boolean stopSpan(@NotNull String spanId, ErrorCode errorCode, Long endTimeMs) {
        Intrinsics.checkNotNullParameter(spanId, "spanId");
        return this.$$delegate_0.stopSpan(spanId, errorCode, endTimeMs);
    }

    @Override // nf2.g
    public void logInternalError(@NotNull Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
    }

    @Override // nf2.g
    public void recordIncompleteNetworkRequest(@NotNull String url, @NotNull String httpMethod, long startTime, long endTime, Throwable error, String traceId, k networkCaptureData) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(httpMethod, "httpMethod");
    }
}
