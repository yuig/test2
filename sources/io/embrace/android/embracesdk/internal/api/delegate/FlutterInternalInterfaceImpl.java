package io.embrace.android.embracesdk.internal.api.delegate;

import com.google.android.gms.ads.RequestConfiguration;
import fh2.c;
import io.embrace.android.embracesdk.LogExceptionType;
import io.embrace.android.embracesdk.LogType;
import io.embrace.android.embracesdk.Severity;
import io.embrace.android.embracesdk.internal.FlutterInternalInterface;
import io.embrace.android.embracesdk.network.EmbraceNetworkRequest;
import io.embrace.android.embracesdk.spans.ErrorCode;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import lf2.i;
import lh2.b;
import lh2.e;
import nf2.g;
import org.jetbrains.annotations.NotNull;
import qh2.k;
import th2.n;
import xf2.m;

@Metadata(d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010$\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B'\u0012\u0006\u0010t\u001a\u00020s\u0012\u0006\u0010v\u001a\u00020\u0001\u0012\u0006\u0010y\u001a\u00020x\u0012\u0006\u0010|\u001a\u00020{¢\u0006\u0004\b~\u0010\u007fJI\u0010\f\u001a\u00020\u000b2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\u0010\b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ(\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0003H\u0096\u0001¢\u0006\u0004\b\u0012\u0010\u0013J@\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0016H\u0096\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0011H\u0096\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0011H\u0096\u0001¢\u0006\u0004\b\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0011H\u0096\u0001¢\u0006\u0004\b\u001d\u0010\u001bJ,\u0010\"\u001a\u00020\u000b2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u001f0\u001e2\u0006\u0010!\u001a\u00020\u0003H\u0096\u0001¢\u0006\u0004\b\"\u0010#J@\u0010(\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00032\u0014\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020$\u0018\u00010\u00162\b\u0010&\u001a\u0004\u0018\u00010\u00032\u0006\u0010'\u001a\u00020\u0011H\u0096\u0001¢\u0006\u0004\b(\u0010)JF\u00101\u001a\u00020\u000b2\u0006\u0010+\u001a\u00020*2\u0006\u0010-\u001a\u00020,2\u0014\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020$\u0018\u00010\u00162\u000e\u00100\u001a\n\u0012\u0004\u0012\u00020/\u0018\u00010.H\u0096\u0001¢\u0006\u0004\b1\u00102J.\u00103\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00032\u0014\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020$\u0018\u00010\u0016H\u0096\u0001¢\u0006\u0004\b3\u00104J$\u00106\u001a\u00020\u000b2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\u00105\u001a\u0004\u0018\u00010\u0003H\u0096\u0001¢\u0006\u0004\b6\u00107J\u0018\u00106\u001a\u00020\u000b2\u0006\u00108\u001a\u00020*H\u0096\u0001¢\u0006\u0004\b6\u00109J8\u0010;\u001a\u00020\u000b2\u0016\u0010 \u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u001f\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u001e2\u0006\u0010!\u001a\u00020\u00032\u0006\u0010-\u001a\u00020:H\u0096\u0001¢\u0006\u0004\b;\u0010<J8\u0010=\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00032\u0014\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020$\u0018\u00010\u00162\b\u0010&\u001a\u0004\u0018\u00010\u0003H\u0096\u0001¢\u0006\u0004\b=\u0010>J\\\u0010J\u001a\u00020\u000b2\u0006\u0010?\u001a\u00020\u00032\u0006\u0010@\u001a\u00020\u00032\u0006\u0010A\u001a\u00020\u00142\u0006\u0010B\u001a\u00020\u00142\u0006\u0010C\u001a\u00020\u00142\u0006\u0010D\u001a\u00020\u00142\u0006\u0010F\u001a\u00020E2\b\u0010G\u001a\u0004\u0018\u00010\u00032\b\u0010I\u001a\u0004\u0018\u00010HH\u0096\u0001¢\u0006\u0004\bJ\u0010KJn\u0010S\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010L\u001a\u00020\u00142\u0006\u0010M\u001a\u00020\u00142\b\u0010O\u001a\u0004\u0018\u00010N2\b\u0010P\u001a\u0004\u0018\u00010\u00032\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00162\u001a\u0010R\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020$0\u0016\u0018\u00010QH\u0096\u0001¢\u0006\u0004\bS\u0010TJX\u0010W\u001a\u00020\u000b2\u0006\u0010?\u001a\u00020\u00032\u0006\u0010@\u001a\u00020\u00032\u0006\u0010A\u001a\u00020\u00142\u0006\u0010B\u001a\u00020\u00142\b\u0010U\u001a\u0004\u0018\u00010\u00032\b\u0010V\u001a\u0004\u0018\u00010\u00032\b\u0010G\u001a\u0004\u0018\u00010\u00032\b\u0010I\u001a\u0004\u0018\u00010HH\u0096\u0001¢\u0006\u0004\bW\u0010XJN\u0010W\u001a\u00020\u000b2\u0006\u0010?\u001a\u00020\u00032\u0006\u0010@\u001a\u00020\u00032\u0006\u0010A\u001a\u00020\u00142\u0006\u0010B\u001a\u00020\u00142\b\u00108\u001a\u0004\u0018\u00010*2\b\u0010G\u001a\u0004\u0018\u00010\u00032\b\u0010I\u001a\u0004\u0018\u00010HH\u0096\u0001¢\u0006\u0004\bW\u0010YJ\u0018\u0010\\\u001a\u00020\u000b2\u0006\u0010[\u001a\u00020ZH\u0096\u0001¢\u0006\u0004\b\\\u0010]Jh\u0010a\u001a\u00028\u0000\"\u0004\b\u0000\u0010^2\u0006\u0010\u0005\u001a\u00020\u00032\b\u0010P\u001a\u0004\u0018\u00010\u00032\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00162\u001a\u0010R\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020$0\u0016\u0018\u00010Q2\f\u0010`\u001a\b\u0012\u0004\u0012\u00028\u00000_H\u0096\u0001¢\u0006\u0004\ba\u0010bJ \u0010d\u001a\u00020\u00112\u0006\u0010?\u001a\u00020\u00032\u0006\u0010c\u001a\u00020\u0003H\u0096\u0001¢\u0006\u0004\bd\u0010eJ.\u0010f\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0005\u001a\u00020\u00032\b\u0010P\u001a\u0004\u0018\u00010\u00032\b\u0010L\u001a\u0004\u0018\u00010\u0014H\u0096\u0001¢\u0006\u0004\bf\u0010gJ\u0010\u0010h\u001a\u00020\u000bH\u0096\u0001¢\u0006\u0004\bh\u0010iJ,\u0010j\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u00032\b\u0010O\u001a\u0004\u0018\u00010N2\b\u0010M\u001a\u0004\u0018\u00010\u0014H\u0096\u0001¢\u0006\u0004\bj\u0010kJ\u0019\u0010m\u001a\u00020\u000b2\b\u0010l\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\bm\u0010nJ\u0019\u0010o\u001a\u00020\u000b2\b\u0010l\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\bo\u0010nJA\u0010p\u001a\u00020\u000b2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\u0010\b\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\bp\u0010qJA\u0010r\u001a\u00020\u000b2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\u0010\b\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\br\u0010qR\u0014\u0010t\u001a\u00020s8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bt\u0010uR\u0014\u0010v\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bv\u0010wR\u0014\u0010y\u001a\u00020x8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\by\u0010zR\u0014\u0010|\u001a\u00020{8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b|\u0010}¨\u0006\u0080\u0001"}, d2 = {"Lio/embrace/android/embracesdk/internal/api/delegate/FlutterInternalInterfaceImpl;", "Lnf2/g;", "Lio/embrace/android/embracesdk/internal/FlutterInternalInterface;", "", "stack", "name", "message", "context", "library", "Lio/embrace/android/embracesdk/LogExceptionType;", "exceptionType", "", "logDartException", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/embrace/android/embracesdk/LogExceptionType;)V", "spanId", "key", "value", "", "addSpanAttribute", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z", "", "timestampMs", "", "attributes", "addSpanEvent", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/util/Map;)Z", "isAnrCaptureEnabled", "()Z", "isNdkEnabled", "isNetworkSpanForwardingEnabled", "Lkotlin/Pair;", "", "point", "elementName", "logComposeTap", "(Lkotlin/Pair;Ljava/lang/String;)V", "", "properties", "stacktrace", "isException", "logError", "(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Z)V", "", "throwable", "Lio/embrace/android/embracesdk/LogType;", "type", "", "Ljava/lang/StackTraceElement;", "customStackTrace", "logHandledException", "(Ljava/lang/Throwable;Lio/embrace/android/embracesdk/LogType;Ljava/util/Map;[Ljava/lang/StackTraceElement;)V", "logInfo", "(Ljava/lang/String;Ljava/util/Map;)V", "details", "logInternalError", "(Ljava/lang/String;Ljava/lang/String;)V", "error", "(Ljava/lang/Throwable;)V", "Lth2/n;", "logTap", "(Lkotlin/Pair;Ljava/lang/String;Lth2/n;)V", "logWarning", "(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)V", "url", "httpMethod", "startTime", "endTime", "bytesSent", "bytesReceived", "", "statusCode", "traceId", "Lqh2/k;", "networkCaptureData", "recordCompletedNetworkRequest", "(Ljava/lang/String;Ljava/lang/String;JJJJILjava/lang/String;Lqh2/k;)V", "startTimeMs", "endTimeMs", "Lio/embrace/android/embracesdk/spans/ErrorCode;", "errorCode", "parentSpanId", "", "events", "recordCompletedSpan", "(Ljava/lang/String;JJLio/embrace/android/embracesdk/spans/ErrorCode;Ljava/lang/String;Ljava/util/Map;Ljava/util/List;)Z", "errorType", "errorMessage", "recordIncompleteNetworkRequest", "(Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lqh2/k;)V", "(Ljava/lang/String;Ljava/lang/String;JJLjava/lang/Throwable;Ljava/lang/String;Lqh2/k;)V", "Lio/embrace/android/embracesdk/network/EmbraceNetworkRequest;", "embraceNetworkRequest", "recordNetworkRequest", "(Lio/embrace/android/embracesdk/network/EmbraceNetworkRequest;)V", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlin/Function0;", "code", "recordSpan", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/List;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "method", "shouldCaptureNetworkBody", "(Ljava/lang/String;Ljava/lang/String;)Z", "startSpan", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)Ljava/lang/String;", "stopSdk", "()V", "stopSpan", "(Ljava/lang/String;Lio/embrace/android/embracesdk/spans/ErrorCode;Ljava/lang/Long;)Z", "version", "setEmbraceFlutterSdkVersion", "(Ljava/lang/String;)V", "setDartVersion", "logHandledDartException", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "logUnhandledDartException", "Llf2/i;", "embrace", "Llf2/i;", "impl", "Lnf2/g;", "Lfh2/c;", "hostedSdkVersionInfo", "Lfh2/c;", "Llh2/b;", "logger", "Llh2/b;", "<init>", "(Llf2/i;Lnf2/g;Lfh2/c;Llh2/b;)V", "embrace-android-sdk_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class FlutterInternalInterfaceImpl implements g, FlutterInternalInterface {

    @NotNull
    private final i embrace;

    @NotNull
    private final c hostedSdkVersionInfo;

    @NotNull
    private final g impl;

    @NotNull
    private final b logger;

    public FlutterInternalInterfaceImpl(@NotNull i embrace, @NotNull g impl, @NotNull c hostedSdkVersionInfo, @NotNull b logger) {
        Intrinsics.checkNotNullParameter(embrace, "embrace");
        Intrinsics.checkNotNullParameter(impl, "impl");
        Intrinsics.checkNotNullParameter(hostedSdkVersionInfo, "hostedSdkVersionInfo");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.embrace = embrace;
        this.impl = impl;
        this.hostedSdkVersionInfo = hostedSdkVersionInfo;
        this.logger = logger;
    }

    private final void logDartException(String stack, String name, String message, String context, String library, LogExceptionType exceptionType) {
        if (!this.embrace.f83157h.a()) {
            ((e) this.logger).c("logDartError");
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (context != null) {
            m.f134875e.getClass();
            linkedHashMap.put(m.f134876f.f134856b, context);
        }
        if (library != null) {
            m.f134875e.getClass();
            linkedHashMap.put(m.f134877g.f134856b, library);
        }
        i.c(this.embrace, Severity.ERROR, "Dart error", null, null, stack, exceptionType, name, message, linkedHashMap, 12);
    }

    @Override // nf2.l
    public boolean addSpanAttribute(@NotNull String spanId, @NotNull String key, @NotNull String value) {
        Intrinsics.checkNotNullParameter(spanId, "spanId");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        return this.impl.addSpanAttribute(spanId, key, value);
    }

    @Override // nf2.l
    public boolean addSpanEvent(@NotNull String spanId, @NotNull String name, Long timestampMs, Map<String, String> attributes) {
        Intrinsics.checkNotNullParameter(spanId, "spanId");
        Intrinsics.checkNotNullParameter(name, "name");
        return this.impl.addSpanEvent(spanId, name, timestampMs, attributes);
    }

    @Override // nf2.g
    public boolean isAnrCaptureEnabled() {
        return this.impl.isAnrCaptureEnabled();
    }

    @Override // nf2.g
    public boolean isNdkEnabled() {
        return this.impl.isNdkEnabled();
    }

    @Override // nf2.g
    public boolean isNetworkSpanForwardingEnabled() {
        return this.impl.isNetworkSpanForwardingEnabled();
    }

    @Override // nf2.g
    public void logComposeTap(@NotNull Pair<Float, Float> point, @NotNull String elementName) {
        Intrinsics.checkNotNullParameter(point, "point");
        Intrinsics.checkNotNullParameter(elementName, "elementName");
        this.impl.logComposeTap(point, elementName);
    }

    @Override // nf2.g
    public void logError(@NotNull String message, Map<String, ? extends Object> properties, String stacktrace, boolean isException) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.impl.logError(message, properties, stacktrace, isException);
    }

    @Override // io.embrace.android.embracesdk.internal.FlutterInternalInterface
    public void logHandledDartException(String stack, String name, String message, String context, String library) {
        logDartException(stack, name, message, context, library, LogExceptionType.HANDLED);
    }

    @Override // nf2.g
    public void logHandledException(@NotNull Throwable throwable, @NotNull LogType type, Map<String, ? extends Object> properties, StackTraceElement[] customStackTrace) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        Intrinsics.checkNotNullParameter(type, "type");
        this.impl.logHandledException(throwable, type, properties, customStackTrace);
    }

    @Override // nf2.g
    public void logInfo(@NotNull String message, Map<String, ? extends Object> properties) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.impl.logInfo(message, properties);
    }

    @Override // nf2.g
    public void logInternalError(String message, String details) {
        this.impl.logInternalError(message, details);
    }

    @Override // nf2.g
    public void logTap(@NotNull Pair<Float, Float> point, @NotNull String elementName, @NotNull n type) {
        Intrinsics.checkNotNullParameter(point, "point");
        Intrinsics.checkNotNullParameter(elementName, "elementName");
        Intrinsics.checkNotNullParameter(type, "type");
        this.impl.logTap(point, elementName, type);
    }

    @Override // io.embrace.android.embracesdk.internal.FlutterInternalInterface
    public void logUnhandledDartException(String stack, String name, String message, String context, String library) {
        logDartException(stack, name, message, context, library, LogExceptionType.UNHANDLED);
    }

    @Override // nf2.g
    public void logWarning(@NotNull String message, Map<String, ? extends Object> properties, String stacktrace) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.impl.logWarning(message, properties, stacktrace);
    }

    @Override // nf2.g
    public void recordCompletedNetworkRequest(@NotNull String url, @NotNull String httpMethod, long startTime, long endTime, long bytesSent, long bytesReceived, int statusCode, String traceId, k networkCaptureData) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(httpMethod, "httpMethod");
        this.impl.recordCompletedNetworkRequest(url, httpMethod, startTime, endTime, bytesSent, bytesReceived, statusCode, traceId, networkCaptureData);
    }

    @Override // nf2.l
    public boolean recordCompletedSpan(@NotNull String name, long startTimeMs, long endTimeMs, ErrorCode errorCode, String parentSpanId, Map<String, String> attributes, List<? extends Map<String, ? extends Object>> events) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.impl.recordCompletedSpan(name, startTimeMs, endTimeMs, errorCode, parentSpanId, attributes, events);
    }

    @Override // nf2.g
    public void recordIncompleteNetworkRequest(@NotNull String url, @NotNull String httpMethod, long startTime, long endTime, String errorType, String errorMessage, String traceId, k networkCaptureData) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(httpMethod, "httpMethod");
        this.impl.recordIncompleteNetworkRequest(url, httpMethod, startTime, endTime, errorType, errorMessage, traceId, networkCaptureData);
    }

    @Override // nf2.g
    public void recordNetworkRequest(@NotNull EmbraceNetworkRequest embraceNetworkRequest) {
        Intrinsics.checkNotNullParameter(embraceNetworkRequest, "embraceNetworkRequest");
        this.impl.recordNetworkRequest(embraceNetworkRequest);
    }

    @Override // nf2.l
    public <T> T recordSpan(@NotNull String name, String parentSpanId, Map<String, String> attributes, List<? extends Map<String, ? extends Object>> events, @NotNull Function0<? extends T> code) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(code, "code");
        return (T) this.impl.recordSpan(name, parentSpanId, attributes, events, code);
    }

    @Override // io.embrace.android.embracesdk.internal.FlutterInternalInterface
    public void setDartVersion(String version) {
        if (!this.embrace.f83157h.a()) {
            ((e) this.logger).c("setDartVersion");
        } else if (version != null) {
            this.hostedSdkVersionInfo.a(version);
        }
    }

    @Override // io.embrace.android.embracesdk.internal.FlutterInternalInterface
    public void setEmbraceFlutterSdkVersion(String version) {
        if (!this.embrace.f83157h.a()) {
            ((e) this.logger).c("setEmbraceFlutterSdkVersion");
        } else if (version != null) {
            this.hostedSdkVersionInfo.b(version);
        }
    }

    @Override // nf2.g
    public boolean shouldCaptureNetworkBody(@NotNull String url, @NotNull String method) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(method, "method");
        return this.impl.shouldCaptureNetworkBody(url, method);
    }

    @Override // nf2.l
    public String startSpan(@NotNull String name, String parentSpanId, Long startTimeMs) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.impl.startSpan(name, parentSpanId, startTimeMs);
    }

    @Override // nf2.g
    public void stopSdk() {
        this.impl.stopSdk();
    }

    @Override // nf2.l
    public boolean stopSpan(@NotNull String spanId, ErrorCode errorCode, Long endTimeMs) {
        Intrinsics.checkNotNullParameter(spanId, "spanId");
        return this.impl.stopSpan(spanId, errorCode, endTimeMs);
    }

    @Override // nf2.g
    public void logInternalError(@NotNull Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.impl.logInternalError(error);
    }

    @Override // nf2.g
    public void recordIncompleteNetworkRequest(@NotNull String url, @NotNull String httpMethod, long startTime, long endTime, Throwable error, String traceId, k networkCaptureData) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(httpMethod, "httpMethod");
        this.impl.recordIncompleteNetworkRequest(url, httpMethod, startTime, endTime, error, traceId, networkCaptureData);
    }
}
