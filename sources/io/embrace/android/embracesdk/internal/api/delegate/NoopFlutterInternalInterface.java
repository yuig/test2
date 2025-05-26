package io.embrace.android.embracesdk.internal.api.delegate;

import com.google.android.gms.ads.RequestConfiguration;
import io.embrace.android.embracesdk.LogType;
import io.embrace.android.embracesdk.internal.FlutterInternalInterface;
import io.embrace.android.embracesdk.network.EmbraceNetworkRequest;
import io.embrace.android.embracesdk.spans.ErrorCode;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import nf2.g;
import org.jetbrains.annotations.NotNull;
import qh2.k;
import th2.n;

@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010$\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010o\u001a\u00020\u0002¢\u0006\u0004\bq\u0010rJ(\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003H\u0096\u0001¢\u0006\u0004\b\b\u0010\tJ@\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\rH\u0096\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0007H\u0096\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0007H\u0096\u0001¢\u0006\u0004\b\u0013\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0007H\u0096\u0001¢\u0006\u0004\b\u0014\u0010\u0012J,\u0010\u001a\u001a\u00020\u00192\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0018\u001a\u00020\u0003H\u0096\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ@\u0010!\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u00032\u0014\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001d\u0018\u00010\r2\b\u0010\u001f\u001a\u0004\u0018\u00010\u00032\u0006\u0010 \u001a\u00020\u0007H\u0096\u0001¢\u0006\u0004\b!\u0010\"JF\u0010*\u001a\u00020\u00192\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%2\u0014\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001d\u0018\u00010\r2\u000e\u0010)\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010'H\u0096\u0001¢\u0006\u0004\b*\u0010+J.\u0010,\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u00032\u0014\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001d\u0018\u00010\rH\u0096\u0001¢\u0006\u0004\b,\u0010-J$\u0010/\u001a\u00020\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u00032\b\u0010.\u001a\u0004\u0018\u00010\u0003H\u0096\u0001¢\u0006\u0004\b/\u00100J\u0018\u0010/\u001a\u00020\u00192\u0006\u00101\u001a\u00020#H\u0096\u0001¢\u0006\u0004\b/\u00102J8\u00104\u001a\u00020\u00192\u0016\u0010\u0017\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00152\u0006\u0010\u0018\u001a\u00020\u00032\u0006\u0010&\u001a\u000203H\u0096\u0001¢\u0006\u0004\b4\u00105J8\u00106\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u00032\u0014\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001d\u0018\u00010\r2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0003H\u0096\u0001¢\u0006\u0004\b6\u00107J\\\u0010C\u001a\u00020\u00192\u0006\u00108\u001a\u00020\u00032\u0006\u00109\u001a\u00020\u00032\u0006\u0010:\u001a\u00020\u000b2\u0006\u0010;\u001a\u00020\u000b2\u0006\u0010<\u001a\u00020\u000b2\u0006\u0010=\u001a\u00020\u000b2\u0006\u0010?\u001a\u00020>2\b\u0010@\u001a\u0004\u0018\u00010\u00032\b\u0010B\u001a\u0004\u0018\u00010AH\u0096\u0001¢\u0006\u0004\bC\u0010DJn\u0010L\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010E\u001a\u00020\u000b2\u0006\u0010F\u001a\u00020\u000b2\b\u0010H\u001a\u0004\u0018\u00010G2\b\u0010I\u001a\u0004\u0018\u00010\u00032\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r2\u001a\u0010K\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001d0\r\u0018\u00010JH\u0096\u0001¢\u0006\u0004\bL\u0010MJX\u0010P\u001a\u00020\u00192\u0006\u00108\u001a\u00020\u00032\u0006\u00109\u001a\u00020\u00032\u0006\u0010:\u001a\u00020\u000b2\u0006\u0010;\u001a\u00020\u000b2\b\u0010N\u001a\u0004\u0018\u00010\u00032\b\u0010O\u001a\u0004\u0018\u00010\u00032\b\u0010@\u001a\u0004\u0018\u00010\u00032\b\u0010B\u001a\u0004\u0018\u00010AH\u0096\u0001¢\u0006\u0004\bP\u0010QJN\u0010P\u001a\u00020\u00192\u0006\u00108\u001a\u00020\u00032\u0006\u00109\u001a\u00020\u00032\u0006\u0010:\u001a\u00020\u000b2\u0006\u0010;\u001a\u00020\u000b2\b\u00101\u001a\u0004\u0018\u00010#2\b\u0010@\u001a\u0004\u0018\u00010\u00032\b\u0010B\u001a\u0004\u0018\u00010AH\u0096\u0001¢\u0006\u0004\bP\u0010RJ\u0018\u0010U\u001a\u00020\u00192\u0006\u0010T\u001a\u00020SH\u0096\u0001¢\u0006\u0004\bU\u0010VJh\u0010Z\u001a\u00028\u0000\"\u0004\b\u0000\u0010W2\u0006\u0010\n\u001a\u00020\u00032\b\u0010I\u001a\u0004\u0018\u00010\u00032\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r2\u001a\u0010K\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001d0\r\u0018\u00010J2\f\u0010Y\u001a\b\u0012\u0004\u0012\u00028\u00000XH\u0096\u0001¢\u0006\u0004\bZ\u0010[J \u0010]\u001a\u00020\u00072\u0006\u00108\u001a\u00020\u00032\u0006\u0010\\\u001a\u00020\u0003H\u0096\u0001¢\u0006\u0004\b]\u0010^J.\u0010_\u001a\u0004\u0018\u00010\u00032\u0006\u0010\n\u001a\u00020\u00032\b\u0010I\u001a\u0004\u0018\u00010\u00032\b\u0010E\u001a\u0004\u0018\u00010\u000bH\u0096\u0001¢\u0006\u0004\b_\u0010`J\u0010\u0010a\u001a\u00020\u0019H\u0096\u0001¢\u0006\u0004\ba\u0010bJ,\u0010c\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010H\u001a\u0004\u0018\u00010G2\b\u0010F\u001a\u0004\u0018\u00010\u000bH\u0096\u0001¢\u0006\u0004\bc\u0010dJ\u0019\u0010f\u001a\u00020\u00192\b\u0010e\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\bf\u0010gJ\u0019\u0010h\u001a\u00020\u00192\b\u0010e\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\bh\u0010gJA\u0010l\u001a\u00020\u00192\b\u0010i\u001a\u0004\u0018\u00010\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u00032\b\u0010\u001c\u001a\u0004\u0018\u00010\u00032\b\u0010j\u001a\u0004\u0018\u00010\u00032\b\u0010k\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\bl\u0010mJA\u0010n\u001a\u00020\u00192\b\u0010i\u001a\u0004\u0018\u00010\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u00032\b\u0010\u001c\u001a\u0004\u0018\u00010\u00032\b\u0010j\u001a\u0004\u0018\u00010\u00032\b\u0010k\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\bn\u0010mR\u0014\u0010o\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bo\u0010p¨\u0006s"}, d2 = {"Lio/embrace/android/embracesdk/internal/api/delegate/NoopFlutterInternalInterface;", "Lio/embrace/android/embracesdk/internal/FlutterInternalInterface;", "Lnf2/g;", "", "spanId", "key", "value", "", "addSpanAttribute", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z", "name", "", "timestampMs", "", "attributes", "addSpanEvent", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/util/Map;)Z", "isAnrCaptureEnabled", "()Z", "isNdkEnabled", "isNetworkSpanForwardingEnabled", "Lkotlin/Pair;", "", "point", "elementName", "", "logComposeTap", "(Lkotlin/Pair;Ljava/lang/String;)V", "message", "", "properties", "stacktrace", "isException", "logError", "(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Z)V", "", "throwable", "Lio/embrace/android/embracesdk/LogType;", "type", "", "Ljava/lang/StackTraceElement;", "customStackTrace", "logHandledException", "(Ljava/lang/Throwable;Lio/embrace/android/embracesdk/LogType;Ljava/util/Map;[Ljava/lang/StackTraceElement;)V", "logInfo", "(Ljava/lang/String;Ljava/util/Map;)V", "details", "logInternalError", "(Ljava/lang/String;Ljava/lang/String;)V", "error", "(Ljava/lang/Throwable;)V", "Lth2/n;", "logTap", "(Lkotlin/Pair;Ljava/lang/String;Lth2/n;)V", "logWarning", "(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)V", "url", "httpMethod", "startTime", "endTime", "bytesSent", "bytesReceived", "", "statusCode", "traceId", "Lqh2/k;", "networkCaptureData", "recordCompletedNetworkRequest", "(Ljava/lang/String;Ljava/lang/String;JJJJILjava/lang/String;Lqh2/k;)V", "startTimeMs", "endTimeMs", "Lio/embrace/android/embracesdk/spans/ErrorCode;", "errorCode", "parentSpanId", "", "events", "recordCompletedSpan", "(Ljava/lang/String;JJLio/embrace/android/embracesdk/spans/ErrorCode;Ljava/lang/String;Ljava/util/Map;Ljava/util/List;)Z", "errorType", "errorMessage", "recordIncompleteNetworkRequest", "(Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lqh2/k;)V", "(Ljava/lang/String;Ljava/lang/String;JJLjava/lang/Throwable;Ljava/lang/String;Lqh2/k;)V", "Lio/embrace/android/embracesdk/network/EmbraceNetworkRequest;", "embraceNetworkRequest", "recordNetworkRequest", "(Lio/embrace/android/embracesdk/network/EmbraceNetworkRequest;)V", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlin/Function0;", "code", "recordSpan", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/List;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "method", "shouldCaptureNetworkBody", "(Ljava/lang/String;Ljava/lang/String;)Z", "startSpan", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)Ljava/lang/String;", "stopSdk", "()V", "stopSpan", "(Ljava/lang/String;Lio/embrace/android/embracesdk/spans/ErrorCode;Ljava/lang/Long;)Z", "version", "setEmbraceFlutterSdkVersion", "(Ljava/lang/String;)V", "setDartVersion", "stack", "context", "library", "logHandledDartException", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "logUnhandledDartException", "delegate", "Lnf2/g;", "<init>", "(Lnf2/g;)V", "embrace-internal-api_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class NoopFlutterInternalInterface implements FlutterInternalInterface, g {

    @NotNull
    private final g delegate;

    public NoopFlutterInternalInterface(@NotNull g delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.delegate = delegate;
    }

    @Override // io.embrace.android.embracesdk.internal.FlutterInternalInterface, nf2.l
    public boolean addSpanAttribute(@NotNull String spanId, @NotNull String key, @NotNull String value) {
        Intrinsics.checkNotNullParameter(spanId, "spanId");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        return this.delegate.addSpanAttribute(spanId, key, value);
    }

    @Override // io.embrace.android.embracesdk.internal.FlutterInternalInterface, nf2.l
    public boolean addSpanEvent(@NotNull String spanId, @NotNull String name, Long timestampMs, Map<String, String> attributes) {
        Intrinsics.checkNotNullParameter(spanId, "spanId");
        Intrinsics.checkNotNullParameter(name, "name");
        return this.delegate.addSpanEvent(spanId, name, timestampMs, attributes);
    }

    @Override // io.embrace.android.embracesdk.internal.FlutterInternalInterface, nf2.g
    public boolean isAnrCaptureEnabled() {
        return this.delegate.isAnrCaptureEnabled();
    }

    @Override // io.embrace.android.embracesdk.internal.FlutterInternalInterface, nf2.g
    public boolean isNdkEnabled() {
        return this.delegate.isNdkEnabled();
    }

    @Override // io.embrace.android.embracesdk.internal.FlutterInternalInterface, nf2.g
    public boolean isNetworkSpanForwardingEnabled() {
        return this.delegate.isNetworkSpanForwardingEnabled();
    }

    @Override // io.embrace.android.embracesdk.internal.FlutterInternalInterface, nf2.g
    public void logComposeTap(@NotNull Pair<Float, Float> point, @NotNull String elementName) {
        Intrinsics.checkNotNullParameter(point, "point");
        Intrinsics.checkNotNullParameter(elementName, "elementName");
        this.delegate.logComposeTap(point, elementName);
    }

    @Override // io.embrace.android.embracesdk.internal.FlutterInternalInterface, nf2.g
    public void logError(@NotNull String message, Map<String, ? extends Object> properties, String stacktrace, boolean isException) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.delegate.logError(message, properties, stacktrace, isException);
    }

    @Override // io.embrace.android.embracesdk.internal.FlutterInternalInterface
    public void logHandledDartException(String stack, String name, String message, String context, String library) {
    }

    @Override // io.embrace.android.embracesdk.internal.FlutterInternalInterface, nf2.g
    public void logHandledException(@NotNull Throwable throwable, @NotNull LogType type, Map<String, ? extends Object> properties, StackTraceElement[] customStackTrace) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        Intrinsics.checkNotNullParameter(type, "type");
        this.delegate.logHandledException(throwable, type, properties, customStackTrace);
    }

    @Override // io.embrace.android.embracesdk.internal.FlutterInternalInterface, nf2.g
    public void logInfo(@NotNull String message, Map<String, ? extends Object> properties) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.delegate.logInfo(message, properties);
    }

    @Override // io.embrace.android.embracesdk.internal.FlutterInternalInterface, nf2.g
    public void logInternalError(String message, String details) {
        this.delegate.logInternalError(message, details);
    }

    @Override // io.embrace.android.embracesdk.internal.FlutterInternalInterface, nf2.g
    public void logTap(@NotNull Pair<Float, Float> point, @NotNull String elementName, @NotNull n type) {
        Intrinsics.checkNotNullParameter(point, "point");
        Intrinsics.checkNotNullParameter(elementName, "elementName");
        Intrinsics.checkNotNullParameter(type, "type");
        this.delegate.logTap(point, elementName, type);
    }

    @Override // io.embrace.android.embracesdk.internal.FlutterInternalInterface
    public void logUnhandledDartException(String stack, String name, String message, String context, String library) {
    }

    @Override // io.embrace.android.embracesdk.internal.FlutterInternalInterface, nf2.g
    public void logWarning(@NotNull String message, Map<String, ? extends Object> properties, String stacktrace) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.delegate.logWarning(message, properties, stacktrace);
    }

    @Override // io.embrace.android.embracesdk.internal.FlutterInternalInterface, nf2.g
    public void recordCompletedNetworkRequest(@NotNull String url, @NotNull String httpMethod, long startTime, long endTime, long bytesSent, long bytesReceived, int statusCode, String traceId, k networkCaptureData) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(httpMethod, "httpMethod");
        this.delegate.recordCompletedNetworkRequest(url, httpMethod, startTime, endTime, bytesSent, bytesReceived, statusCode, traceId, networkCaptureData);
    }

    @Override // io.embrace.android.embracesdk.internal.FlutterInternalInterface, nf2.l
    public boolean recordCompletedSpan(@NotNull String name, long startTimeMs, long endTimeMs, ErrorCode errorCode, String parentSpanId, Map<String, String> attributes, List<? extends Map<String, ? extends Object>> events) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.delegate.recordCompletedSpan(name, startTimeMs, endTimeMs, errorCode, parentSpanId, attributes, events);
    }

    @Override // io.embrace.android.embracesdk.internal.FlutterInternalInterface, nf2.g
    public void recordIncompleteNetworkRequest(@NotNull String url, @NotNull String httpMethod, long startTime, long endTime, String errorType, String errorMessage, String traceId, k networkCaptureData) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(httpMethod, "httpMethod");
        this.delegate.recordIncompleteNetworkRequest(url, httpMethod, startTime, endTime, errorType, errorMessage, traceId, networkCaptureData);
    }

    @Override // io.embrace.android.embracesdk.internal.FlutterInternalInterface, nf2.g
    public void recordNetworkRequest(@NotNull EmbraceNetworkRequest embraceNetworkRequest) {
        Intrinsics.checkNotNullParameter(embraceNetworkRequest, "embraceNetworkRequest");
        this.delegate.recordNetworkRequest(embraceNetworkRequest);
    }

    @Override // io.embrace.android.embracesdk.internal.FlutterInternalInterface, nf2.l
    public <T> T recordSpan(@NotNull String name, String parentSpanId, Map<String, String> attributes, List<? extends Map<String, ? extends Object>> events, @NotNull Function0<? extends T> code) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(code, "code");
        return (T) this.delegate.recordSpan(name, parentSpanId, attributes, events, code);
    }

    @Override // io.embrace.android.embracesdk.internal.FlutterInternalInterface
    public void setDartVersion(String version) {
    }

    @Override // io.embrace.android.embracesdk.internal.FlutterInternalInterface
    public void setEmbraceFlutterSdkVersion(String version) {
    }

    @Override // io.embrace.android.embracesdk.internal.FlutterInternalInterface, nf2.g
    public boolean shouldCaptureNetworkBody(@NotNull String url, @NotNull String method) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(method, "method");
        return this.delegate.shouldCaptureNetworkBody(url, method);
    }

    @Override // io.embrace.android.embracesdk.internal.FlutterInternalInterface, nf2.l
    public String startSpan(@NotNull String name, String parentSpanId, Long startTimeMs) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.delegate.startSpan(name, parentSpanId, startTimeMs);
    }

    @Override // io.embrace.android.embracesdk.internal.FlutterInternalInterface, nf2.g
    public void stopSdk() {
        this.delegate.stopSdk();
    }

    @Override // io.embrace.android.embracesdk.internal.FlutterInternalInterface, nf2.l
    public boolean stopSpan(@NotNull String spanId, ErrorCode errorCode, Long endTimeMs) {
        Intrinsics.checkNotNullParameter(spanId, "spanId");
        return this.delegate.stopSpan(spanId, errorCode, endTimeMs);
    }

    @Override // io.embrace.android.embracesdk.internal.FlutterInternalInterface, nf2.g
    public void logInternalError(@NotNull Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.delegate.logInternalError(error);
    }

    @Override // io.embrace.android.embracesdk.internal.FlutterInternalInterface, nf2.g
    public void recordIncompleteNetworkRequest(@NotNull String url, @NotNull String httpMethod, long startTime, long endTime, Throwable error, String traceId, k networkCaptureData) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(httpMethod, "httpMethod");
        this.delegate.recordIncompleteNetworkRequest(url, httpMethod, startTime, endTime, error, traceId, networkCaptureData);
    }
}
