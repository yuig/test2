package io.embrace.android.embracesdk.internal.api.delegate;

import android.annotation.SuppressLint;
import com.google.android.gms.ads.RequestConfiguration;
import ei2.p;
import io.embrace.android.embracesdk.LogType;
import io.embrace.android.embracesdk.Severity;
import io.embrace.android.embracesdk.internal.config.remote.NetworkSpanForwardingRemoteConfig;
import io.embrace.android.embracesdk.network.EmbraceNetworkRequest;
import io.embrace.android.embracesdk.network.http.HttpMethod;
import io.embrace.android.embracesdk.spans.ErrorCode;
import java.util.List;
import java.util.Map;
import kh2.b1;
import kh2.d1;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import lf2.i;
import lh2.e;
import nf2.g;
import nf2.l;
import org.jetbrains.annotations.NotNull;
import qh2.k;
import rh2.d;
import sf2.c;
import sg2.a;
import sg2.b;
import tg2.n;

@Metadata(d1 = {"\u0000º\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B/\u0012\u0006\u0010f\u001a\u00020e\u0012\u0006\u0010i\u001a\u00020h\u0012\u0006\u0010l\u001a\u00020k\u0012\u0006\u0010o\u001a\u00020n\u0012\u0006\u0010r\u001a\u00020q¢\u0006\u0004\bs\u0010tJ(\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003H\u0096\u0001¢\u0006\u0004\b\b\u0010\tJD\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\rH\u0096\u0001¢\u0006\u0004\b\u000f\u0010\u0010Jv\u0010\u0019\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000b2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r2\u001c\b\u0002\u0010\u0018\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00170\r\u0018\u00010\u0016H\u0096\u0001¢\u0006\u0004\b\u0019\u0010\u001aJn\u0010\u001e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u001b2\u0006\u0010\n\u001a\u00020\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r2\u001c\b\u0002\u0010\u0018\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00170\r\u0018\u00010\u00162\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001cH\u0096\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ2\u0010 \u001a\u0004\u0018\u00010\u00032\u0006\u0010\n\u001a\u00020\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000bH\u0096\u0001¢\u0006\u0004\b \u0010!J0\u0010\"\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000bH\u0096\u0001¢\u0006\u0004\b\"\u0010#J-\u0010'\u001a\u00020&2\u0006\u0010$\u001a\u00020\u00032\u0014\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0017\u0018\u00010\rH\u0016¢\u0006\u0004\b'\u0010(J7\u0010*\u001a\u00020&2\u0006\u0010$\u001a\u00020\u00032\u0014\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0017\u0018\u00010\r2\b\u0010)\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b*\u0010+J?\u0010-\u001a\u00020&2\u0006\u0010$\u001a\u00020\u00032\u0014\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0017\u0018\u00010\r2\b\u0010)\u001a\u0004\u0018\u00010\u00032\u0006\u0010,\u001a\u00020\u0007H\u0016¢\u0006\u0004\b-\u0010.JE\u00106\u001a\u00020&2\u0006\u00100\u001a\u00020/2\u0006\u00102\u001a\u0002012\u0014\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0017\u0018\u00010\r2\u000e\u00105\u001a\n\u0012\u0004\u0012\u000204\u0018\u000103H\u0016¢\u0006\u0004\b6\u00107J+\u0010<\u001a\u00020&2\u0012\u0010:\u001a\u000e\u0012\u0004\u0012\u000209\u0012\u0004\u0012\u000209082\u0006\u0010;\u001a\u00020\u0003H\u0016¢\u0006\u0004\b<\u0010=J[\u0010I\u001a\u00020&2\u0006\u0010>\u001a\u00020\u00032\u0006\u0010?\u001a\u00020\u00032\u0006\u0010@\u001a\u00020\u000b2\u0006\u0010A\u001a\u00020\u000b2\u0006\u0010B\u001a\u00020\u000b2\u0006\u0010C\u001a\u00020\u000b2\u0006\u0010E\u001a\u00020D2\b\u0010F\u001a\u0004\u0018\u00010\u00032\b\u0010H\u001a\u0004\u0018\u00010GH\u0016¢\u0006\u0004\bI\u0010JJM\u0010L\u001a\u00020&2\u0006\u0010>\u001a\u00020\u00032\u0006\u0010?\u001a\u00020\u00032\u0006\u0010@\u001a\u00020\u000b2\u0006\u0010A\u001a\u00020\u000b2\b\u0010K\u001a\u0004\u0018\u00010/2\b\u0010F\u001a\u0004\u0018\u00010\u00032\b\u0010H\u001a\u0004\u0018\u00010GH\u0016¢\u0006\u0004\bL\u0010MJW\u0010L\u001a\u00020&2\u0006\u0010>\u001a\u00020\u00032\u0006\u0010?\u001a\u00020\u00032\u0006\u0010@\u001a\u00020\u000b2\u0006\u0010A\u001a\u00020\u000b2\b\u0010N\u001a\u0004\u0018\u00010\u00032\b\u0010O\u001a\u0004\u0018\u00010\u00032\b\u0010F\u001a\u0004\u0018\u00010\u00032\b\u0010H\u001a\u0004\u0018\u00010GH\u0016¢\u0006\u0004\bL\u0010PJ\u0017\u0010S\u001a\u00020&2\u0006\u0010R\u001a\u00020QH\u0016¢\u0006\u0004\bS\u0010TJ\u001f\u0010V\u001a\u00020\u00072\u0006\u0010>\u001a\u00020\u00032\u0006\u0010U\u001a\u00020\u0003H\u0016¢\u0006\u0004\bV\u0010WJ\u000f\u0010X\u001a\u00020\u0007H\u0016¢\u0006\u0004\bX\u0010YJ\u000f\u0010Z\u001a\u00020\u0007H\u0016¢\u0006\u0004\bZ\u0010YJ\u000f\u0010[\u001a\u00020\u0007H\u0016¢\u0006\u0004\b[\u0010YJ#\u0010]\u001a\u00020&2\b\u0010$\u001a\u0004\u0018\u00010\u00032\b\u0010\\\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b]\u0010^J\u0017\u0010]\u001a\u00020&2\u0006\u0010K\u001a\u00020/H\u0016¢\u0006\u0004\b]\u0010_J7\u0010a\u001a\u00020&2\u0016\u0010:\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u000109\u0012\u0006\u0012\u0004\u0018\u000109082\u0006\u0010;\u001a\u00020\u00032\u0006\u00102\u001a\u00020`H\u0016¢\u0006\u0004\ba\u0010bJ\u000f\u0010c\u001a\u00020&H\u0016¢\u0006\u0004\bc\u0010dR\u0014\u0010f\u001a\u00020e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010gR\u0014\u0010i\u001a\u00020h8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010jR\u0014\u0010l\u001a\u00020k8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bl\u0010mR\u0014\u0010o\u001a\u00020n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bo\u0010p¨\u0006u"}, d2 = {"Lio/embrace/android/embracesdk/internal/api/delegate/EmbraceInternalInterfaceImpl;", "Lnf2/g;", "Lnf2/l;", "", "spanId", "key", "value", "", "addSpanAttribute", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z", "name", "", "timestampMs", "", "attributes", "addSpanEvent", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/util/Map;)Z", "startTimeMs", "endTimeMs", "Lio/embrace/android/embracesdk/spans/ErrorCode;", "errorCode", "parentSpanId", "", "", "events", "recordCompletedSpan", "(Ljava/lang/String;JJLio/embrace/android/embracesdk/spans/ErrorCode;Ljava/lang/String;Ljava/util/Map;Ljava/util/List;)Z", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlin/Function0;", "code", "recordSpan", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/List;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "startSpan", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)Ljava/lang/String;", "stopSpan", "(Ljava/lang/String;Lio/embrace/android/embracesdk/spans/ErrorCode;Ljava/lang/Long;)Z", "message", "properties", "", "logInfo", "(Ljava/lang/String;Ljava/util/Map;)V", "stacktrace", "logWarning", "(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)V", "isException", "logError", "(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Z)V", "", "throwable", "Lio/embrace/android/embracesdk/LogType;", "type", "", "Ljava/lang/StackTraceElement;", "customStackTrace", "logHandledException", "(Ljava/lang/Throwable;Lio/embrace/android/embracesdk/LogType;Ljava/util/Map;[Ljava/lang/StackTraceElement;)V", "Lkotlin/Pair;", "", "point", "elementName", "logComposeTap", "(Lkotlin/Pair;Ljava/lang/String;)V", "url", "httpMethod", "startTime", "endTime", "bytesSent", "bytesReceived", "", "statusCode", "traceId", "Lqh2/k;", "networkCaptureData", "recordCompletedNetworkRequest", "(Ljava/lang/String;Ljava/lang/String;JJJJILjava/lang/String;Lqh2/k;)V", "error", "recordIncompleteNetworkRequest", "(Ljava/lang/String;Ljava/lang/String;JJLjava/lang/Throwable;Ljava/lang/String;Lqh2/k;)V", "errorType", "errorMessage", "(Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lqh2/k;)V", "Lio/embrace/android/embracesdk/network/EmbraceNetworkRequest;", "embraceNetworkRequest", "recordNetworkRequest", "(Lio/embrace/android/embracesdk/network/EmbraceNetworkRequest;)V", "method", "shouldCaptureNetworkBody", "(Ljava/lang/String;Ljava/lang/String;)Z", "isNetworkSpanForwardingEnabled", "()Z", "isAnrCaptureEnabled", "isNdkEnabled", "details", "logInternalError", "(Ljava/lang/String;Ljava/lang/String;)V", "(Ljava/lang/Throwable;)V", "Lth2/n;", "logTap", "(Lkotlin/Pair;Ljava/lang/String;Lth2/n;)V", "stopSdk", "()V", "Llf2/i;", "embraceImpl", "Llf2/i;", "Lkh2/b1;", "initModule", "Lkh2/b1;", "Lrh2/i;", "networkCaptureService", "Lrh2/i;", "Lsg2/a;", "configService", "Lsg2/a;", "Lei2/p;", "internalTracer", "<init>", "(Llf2/i;Lkh2/b1;Lrh2/i;Lsg2/a;Lei2/p;)V", "embrace-android-sdk_release"}, k = 1, mv = {1, 8, 0})
@SuppressLint({"EmbracePublicApiPackageRule"})
/* loaded from: classes4.dex */
public final class EmbraceInternalInterfaceImpl implements g, l {
    private final /* synthetic */ p $$delegate_0;

    @NotNull
    private final a configService;

    @NotNull
    private final i embraceImpl;

    @NotNull
    private final b1 initModule;

    @NotNull
    private final rh2.i networkCaptureService;

    public EmbraceInternalInterfaceImpl(@NotNull i embraceImpl, @NotNull b1 initModule, @NotNull rh2.i networkCaptureService, @NotNull a configService, @NotNull p internalTracer) {
        Intrinsics.checkNotNullParameter(embraceImpl, "embraceImpl");
        Intrinsics.checkNotNullParameter(initModule, "initModule");
        Intrinsics.checkNotNullParameter(networkCaptureService, "networkCaptureService");
        Intrinsics.checkNotNullParameter(configService, "configService");
        Intrinsics.checkNotNullParameter(internalTracer, "internalTracer");
        this.embraceImpl = embraceImpl;
        this.initModule = initModule;
        this.networkCaptureService = networkCaptureService;
        this.configService = configService;
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
        return ((b) this.configService).f112881f.c();
    }

    @Override // nf2.g
    public boolean isNdkEnabled() {
        return ((b) this.configService).f112877b.f117602c.isNativeCrashCaptureEnabled();
    }

    @Override // nf2.g
    public boolean isNetworkSpanForwardingEnabled() {
        Float f13;
        n nVar = ((b) this.configService).f112888m;
        NetworkSpanForwardingRemoteConfig networkSpanForwardingRemoteConfig = nVar.f117620c;
        return (networkSpanForwardingRemoteConfig == null || (f13 = networkSpanForwardingRemoteConfig.f73042a) == null) ? nVar.f117619b.isNetworkSpanForwardingEnabled() : nVar.f117618a.b(f13.floatValue());
    }

    @Override // nf2.g
    public void logComposeTap(@NotNull Pair<Float, Float> point, @NotNull String elementName) {
        Intrinsics.checkNotNullParameter(point, "point");
        Intrinsics.checkNotNullParameter(elementName, "elementName");
        this.embraceImpl.d(point, elementName, th2.n.TAP);
    }

    @Override // nf2.g
    public void logError(@NotNull String message, Map<String, ? extends Object> properties, String stacktrace, boolean isException) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.embraceImpl.b(message, Severity.ERROR, properties);
    }

    @Override // nf2.g
    public void logHandledException(@NotNull Throwable throwable, @NotNull LogType type, Map<String, ? extends Object> properties, StackTraceElement[] customStackTrace) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        Intrinsics.checkNotNullParameter(type, "type");
        int i13 = c.f112812a[type.ordinal()];
        Severity severity = i13 != 1 ? i13 != 2 ? Severity.INFO : Severity.WARNING : Severity.ERROR;
        i iVar = this.embraceImpl;
        String message = throwable.getMessage();
        if (message == null) {
            message = "";
        }
        String str = message;
        if (customStackTrace == null) {
            customStackTrace = throwable.getStackTrace();
        }
        i.c(iVar, severity, str, properties, customStackTrace, null, null, null, null, null, 496);
    }

    @Override // nf2.g
    public void logInfo(@NotNull String message, Map<String, ? extends Object> properties) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.embraceImpl.b(message, Severity.INFO, properties);
    }

    @Override // nf2.g
    public void logInternalError(String message, String details) {
        if (message == null) {
            return;
        }
        if (details != null) {
            message = a.a.D(message, ": ", details);
        }
        ((e) ((d1) this.initModule).f79456b).b(lh2.g.INTERNAL_INTERFACE_FAIL, new RuntimeException(message));
    }

    @Override // nf2.g
    public void logTap(@NotNull Pair<Float, Float> point, @NotNull String elementName, @NotNull th2.n type) {
        Intrinsics.checkNotNullParameter(point, "point");
        Intrinsics.checkNotNullParameter(elementName, "elementName");
        Intrinsics.checkNotNullParameter(type, "type");
        this.embraceImpl.d(point, elementName, type);
    }

    @Override // nf2.g
    public void logWarning(@NotNull String message, Map<String, ? extends Object> properties, String stacktrace) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.embraceImpl.b(message, Severity.WARNING, properties);
    }

    @Override // nf2.g
    public void recordCompletedNetworkRequest(@NotNull String url, @NotNull String httpMethod, long startTime, long endTime, long bytesSent, long bytesReceived, int statusCode, String traceId, k networkCaptureData) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(httpMethod, "httpMethod");
        i iVar = this.embraceImpl;
        mi2.a aVar = EmbraceNetworkRequest.Companion;
        HttpMethod.Companion.getClass();
        HttpMethod a13 = ni2.a.a(httpMethod);
        aVar.getClass();
        iVar.e(mi2.a.a(url, a13, startTime, endTime, bytesSent, bytesReceived, statusCode, traceId, null, networkCaptureData));
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
        i iVar = this.embraceImpl;
        mi2.a aVar = EmbraceNetworkRequest.Companion;
        HttpMethod.Companion.getClass();
        HttpMethod a13 = ni2.a.a(httpMethod);
        String str = errorType == null ? "" : errorType;
        String str2 = errorMessage == null ? "" : errorMessage;
        aVar.getClass();
        iVar.e(mi2.a.c(url, a13, startTime, endTime, str, str2, traceId, null, networkCaptureData));
    }

    @Override // nf2.g
    public void recordNetworkRequest(@NotNull EmbraceNetworkRequest embraceNetworkRequest) {
        Intrinsics.checkNotNullParameter(embraceNetworkRequest, "embraceNetworkRequest");
        this.embraceImpl.e(embraceNetworkRequest);
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
        return !((d) this.networkCaptureService).a(url, method).isEmpty();
    }

    @Override // nf2.l
    public String startSpan(@NotNull String name, String parentSpanId, Long startTimeMs) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.$$delegate_0.startSpan(name, parentSpanId, startTimeMs);
    }

    @Override // nf2.g
    public void stopSdk() {
        this.embraceImpl.j();
    }

    @Override // nf2.l
    public boolean stopSpan(@NotNull String spanId, ErrorCode errorCode, Long endTimeMs) {
        Intrinsics.checkNotNullParameter(spanId, "spanId");
        return this.$$delegate_0.stopSpan(spanId, errorCode, endTimeMs);
    }

    @Override // nf2.g
    public void recordIncompleteNetworkRequest(@NotNull String url, @NotNull String httpMethod, long startTime, long endTime, Throwable error, String traceId, k networkCaptureData) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(httpMethod, "httpMethod");
        i iVar = this.embraceImpl;
        mi2.a aVar = EmbraceNetworkRequest.Companion;
        HttpMethod.Companion.getClass();
        HttpMethod a13 = ni2.a.a(httpMethod);
        String canonicalName = error != null ? error.getClass().getCanonicalName() : null;
        String str = canonicalName == null ? "" : canonicalName;
        String localizedMessage = error != null ? error.getLocalizedMessage() : null;
        String str2 = localizedMessage == null ? "" : localizedMessage;
        aVar.getClass();
        iVar.e(mi2.a.c(url, a13, startTime, endTime, str, str2, traceId, null, networkCaptureData));
    }

    @Override // nf2.g
    public void logInternalError(@NotNull Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        ((e) ((d1) this.initModule).f79456b).b(lh2.g.INTERNAL_INTERFACE_FAIL, error);
    }
}
