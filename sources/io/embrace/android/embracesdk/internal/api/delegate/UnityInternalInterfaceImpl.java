package io.embrace.android.embracesdk.internal.api.delegate;

import android.os.Build;
import android.text.TextUtils;
import com.google.android.gms.ads.RequestConfiguration;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import fh2.c;
import io.embrace.android.embracesdk.LogExceptionType;
import io.embrace.android.embracesdk.LogType;
import io.embrace.android.embracesdk.Severity;
import io.embrace.android.embracesdk.internal.UnityInternalInterface;
import io.embrace.android.embracesdk.network.EmbraceNetworkRequest;
import io.embrace.android.embracesdk.network.http.HttpMethod;
import io.embrace.android.embracesdk.spans.ErrorCode;
import java.util.List;
import java.util.Map;
import kh2.n0;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kv0.p;
import lf2.i;
import lh2.b;
import lh2.e;
import nf2.g;
import org.jetbrains.annotations.NotNull;
import qf2.d;
import qh2.k;
import rl2.u;
import sg2.a;
import th2.n;
import xk2.v;

@Metadata(d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010$\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B'\u0012\u0006\u0010t\u001a\u00020s\u0012\u0006\u0010v\u001a\u00020\u0001\u0012\u0006\u0010y\u001a\u00020x\u0012\u0006\u0010|\u001a\u00020{¢\u0006\u0004\b~\u0010\u007fJ(\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003H\u0096\u0001¢\u0006\u0004\b\b\u0010\tJ@\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\rH\u0096\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0007H\u0096\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0007H\u0096\u0001¢\u0006\u0004\b\u0013\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0007H\u0096\u0001¢\u0006\u0004\b\u0014\u0010\u0012J,\u0010\u001a\u001a\u00020\u00192\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0018\u001a\u00020\u0003H\u0096\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ@\u0010!\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u00032\u0014\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001d\u0018\u00010\r2\b\u0010\u001f\u001a\u0004\u0018\u00010\u00032\u0006\u0010 \u001a\u00020\u0007H\u0096\u0001¢\u0006\u0004\b!\u0010\"JF\u0010*\u001a\u00020\u00192\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%2\u0014\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001d\u0018\u00010\r2\u000e\u0010)\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010'H\u0096\u0001¢\u0006\u0004\b*\u0010+J.\u0010,\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u00032\u0014\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001d\u0018\u00010\rH\u0096\u0001¢\u0006\u0004\b,\u0010-J$\u0010/\u001a\u00020\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u00032\b\u0010.\u001a\u0004\u0018\u00010\u0003H\u0096\u0001¢\u0006\u0004\b/\u00100J\u0018\u0010/\u001a\u00020\u00192\u0006\u00101\u001a\u00020#H\u0096\u0001¢\u0006\u0004\b/\u00102J8\u00104\u001a\u00020\u00192\u0016\u0010\u0017\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00152\u0006\u0010\u0018\u001a\u00020\u00032\u0006\u0010&\u001a\u000203H\u0096\u0001¢\u0006\u0004\b4\u00105J8\u00106\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u00032\u0014\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001d\u0018\u00010\r2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0003H\u0096\u0001¢\u0006\u0004\b6\u00107J\\\u0010C\u001a\u00020\u00192\u0006\u00108\u001a\u00020\u00032\u0006\u00109\u001a\u00020\u00032\u0006\u0010:\u001a\u00020\u000b2\u0006\u0010;\u001a\u00020\u000b2\u0006\u0010<\u001a\u00020\u000b2\u0006\u0010=\u001a\u00020\u000b2\u0006\u0010?\u001a\u00020>2\b\u0010@\u001a\u0004\u0018\u00010\u00032\b\u0010B\u001a\u0004\u0018\u00010AH\u0096\u0001¢\u0006\u0004\bC\u0010DJn\u0010L\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010E\u001a\u00020\u000b2\u0006\u0010F\u001a\u00020\u000b2\b\u0010H\u001a\u0004\u0018\u00010G2\b\u0010I\u001a\u0004\u0018\u00010\u00032\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r2\u001a\u0010K\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001d0\r\u0018\u00010JH\u0096\u0001¢\u0006\u0004\bL\u0010MJX\u0010P\u001a\u00020\u00192\u0006\u00108\u001a\u00020\u00032\u0006\u00109\u001a\u00020\u00032\u0006\u0010:\u001a\u00020\u000b2\u0006\u0010;\u001a\u00020\u000b2\b\u0010N\u001a\u0004\u0018\u00010\u00032\b\u0010O\u001a\u0004\u0018\u00010\u00032\b\u0010@\u001a\u0004\u0018\u00010\u00032\b\u0010B\u001a\u0004\u0018\u00010AH\u0096\u0001¢\u0006\u0004\bP\u0010QJN\u0010P\u001a\u00020\u00192\u0006\u00108\u001a\u00020\u00032\u0006\u00109\u001a\u00020\u00032\u0006\u0010:\u001a\u00020\u000b2\u0006\u0010;\u001a\u00020\u000b2\b\u00101\u001a\u0004\u0018\u00010#2\b\u0010@\u001a\u0004\u0018\u00010\u00032\b\u0010B\u001a\u0004\u0018\u00010AH\u0096\u0001¢\u0006\u0004\bP\u0010RJ\u0018\u0010U\u001a\u00020\u00192\u0006\u0010T\u001a\u00020SH\u0096\u0001¢\u0006\u0004\bU\u0010VJh\u0010Z\u001a\u00028\u0000\"\u0004\b\u0000\u0010W2\u0006\u0010\n\u001a\u00020\u00032\b\u0010I\u001a\u0004\u0018\u00010\u00032\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r2\u001a\u0010K\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001d0\r\u0018\u00010J2\f\u0010Y\u001a\b\u0012\u0004\u0012\u00028\u00000XH\u0096\u0001¢\u0006\u0004\bZ\u0010[J \u0010]\u001a\u00020\u00072\u0006\u00108\u001a\u00020\u00032\u0006\u0010\\\u001a\u00020\u0003H\u0096\u0001¢\u0006\u0004\b]\u0010^J.\u0010_\u001a\u0004\u0018\u00010\u00032\u0006\u0010\n\u001a\u00020\u00032\b\u0010I\u001a\u0004\u0018\u00010\u00032\b\u0010E\u001a\u0004\u0018\u00010\u000bH\u0096\u0001¢\u0006\u0004\b_\u0010`J\u0010\u0010a\u001a\u00020\u0019H\u0096\u0001¢\u0006\u0004\ba\u0010bJ,\u0010c\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010H\u001a\u0004\u0018\u00010G2\b\u0010F\u001a\u0004\u0018\u00010\u000bH\u0096\u0001¢\u0006\u0004\bc\u0010dJ-\u0010h\u001a\u00020\u00192\b\u0010e\u001a\u0004\u0018\u00010\u00032\b\u0010f\u001a\u0004\u0018\u00010\u00032\b\u0010g\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\bh\u0010iJ)\u0010j\u001a\u00020\u00192\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u00032\b\u0010\u001f\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\bj\u0010iJ)\u0010k\u001a\u00020\u00192\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u00032\b\u0010\u001f\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\bk\u0010iJM\u0010P\u001a\u00020\u00192\u0006\u00108\u001a\u00020\u00032\u0006\u00109\u001a\u00020\u00032\u0006\u0010:\u001a\u00020\u000b2\u0006\u0010;\u001a\u00020\u000b2\b\u0010N\u001a\u0004\u0018\u00010\u00032\b\u0010O\u001a\u0004\u0018\u00010\u00032\b\u0010@\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\bP\u0010lJQ\u0010C\u001a\u00020\u00192\u0006\u00108\u001a\u00020\u00032\u0006\u00109\u001a\u00020\u00032\u0006\u0010:\u001a\u00020\u000b2\u0006\u0010;\u001a\u00020\u000b2\u0006\u0010<\u001a\u00020\u000b2\u0006\u0010=\u001a\u00020\u000b2\u0006\u0010?\u001a\u00020>2\b\u0010@\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\bC\u0010mJ\u000f\u0010n\u001a\u00020\u0019H\u0016¢\u0006\u0004\bn\u0010bJ3\u0010q\u001a\u00020\u00192\b\u0010\n\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u001c\u001a\u00020\u00032\b\u0010\u001f\u001a\u0004\u0018\u00010\u00032\u0006\u0010p\u001a\u00020oH\u0002¢\u0006\u0004\bq\u0010rR\u0014\u0010t\u001a\u00020s8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bt\u0010uR\u0014\u0010v\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bv\u0010wR\u0014\u0010y\u001a\u00020x8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\by\u0010zR\u0014\u0010|\u001a\u00020{8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b|\u0010}¨\u0006\u0080\u0001"}, d2 = {"Lio/embrace/android/embracesdk/internal/api/delegate/UnityInternalInterfaceImpl;", "Lnf2/g;", "Lio/embrace/android/embracesdk/internal/UnityInternalInterface;", "", "spanId", "key", "value", "", "addSpanAttribute", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z", "name", "", "timestampMs", "", "attributes", "addSpanEvent", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/util/Map;)Z", "isAnrCaptureEnabled", "()Z", "isNdkEnabled", "isNetworkSpanForwardingEnabled", "Lkotlin/Pair;", "", "point", "elementName", "", "logComposeTap", "(Lkotlin/Pair;Ljava/lang/String;)V", "message", "", "properties", "stacktrace", "isException", "logError", "(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Z)V", "", "throwable", "Lio/embrace/android/embracesdk/LogType;", "type", "", "Ljava/lang/StackTraceElement;", "customStackTrace", "logHandledException", "(Ljava/lang/Throwable;Lio/embrace/android/embracesdk/LogType;Ljava/util/Map;[Ljava/lang/StackTraceElement;)V", "logInfo", "(Ljava/lang/String;Ljava/util/Map;)V", "details", "logInternalError", "(Ljava/lang/String;Ljava/lang/String;)V", "error", "(Ljava/lang/Throwable;)V", "Lth2/n;", "logTap", "(Lkotlin/Pair;Ljava/lang/String;Lth2/n;)V", "logWarning", "(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)V", "url", "httpMethod", "startTime", "endTime", "bytesSent", "bytesReceived", "", "statusCode", "traceId", "Lqh2/k;", "networkCaptureData", "recordCompletedNetworkRequest", "(Ljava/lang/String;Ljava/lang/String;JJJJILjava/lang/String;Lqh2/k;)V", "startTimeMs", "endTimeMs", "Lio/embrace/android/embracesdk/spans/ErrorCode;", "errorCode", "parentSpanId", "", "events", "recordCompletedSpan", "(Ljava/lang/String;JJLio/embrace/android/embracesdk/spans/ErrorCode;Ljava/lang/String;Ljava/util/Map;Ljava/util/List;)Z", "errorType", "errorMessage", "recordIncompleteNetworkRequest", "(Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lqh2/k;)V", "(Ljava/lang/String;Ljava/lang/String;JJLjava/lang/Throwable;Ljava/lang/String;Lqh2/k;)V", "Lio/embrace/android/embracesdk/network/EmbraceNetworkRequest;", "embraceNetworkRequest", "recordNetworkRequest", "(Lio/embrace/android/embracesdk/network/EmbraceNetworkRequest;)V", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlin/Function0;", "code", "recordSpan", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/List;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "method", "shouldCaptureNetworkBody", "(Ljava/lang/String;Ljava/lang/String;)Z", "startSpan", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)Ljava/lang/String;", "stopSdk", "()V", "stopSpan", "(Ljava/lang/String;Lio/embrace/android/embracesdk/spans/ErrorCode;Ljava/lang/Long;)Z", "unityVersion", "buildGuid", "unitySdkVersion", "setUnityMetaData", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "logUnhandledUnityException", "logHandledUnityException", "(Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "(Ljava/lang/String;Ljava/lang/String;JJJJILjava/lang/String;)V", "installUnityThreadSampler", "Lio/embrace/android/embracesdk/LogExceptionType;", "exceptionType", "logUnityException", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/embrace/android/embracesdk/LogExceptionType;)V", "Llf2/i;", "embrace", "Llf2/i;", "impl", "Lnf2/g;", "Lfh2/c;", "hostedSdkVersionInfo", "Lfh2/c;", "Llh2/b;", "logger", "Llh2/b;", "<init>", "(Llf2/i;Lnf2/g;Lfh2/c;Llh2/b;)V", "embrace-android-sdk_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class UnityInternalInterfaceImpl implements g, UnityInternalInterface {

    @NotNull
    private final i embrace;

    @NotNull
    private final c hostedSdkVersionInfo;

    @NotNull
    private final g impl;

    @NotNull
    private final b logger;

    public UnityInternalInterfaceImpl(@NotNull i embrace, @NotNull g impl, @NotNull c hostedSdkVersionInfo, @NotNull b logger) {
        Intrinsics.checkNotNullParameter(embrace, "embrace");
        Intrinsics.checkNotNullParameter(impl, "impl");
        Intrinsics.checkNotNullParameter(hostedSdkVersionInfo, "hostedSdkVersionInfo");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.embrace = embrace;
        this.impl = impl;
        this.hostedSdkVersionInfo = hostedSdkVersionInfo;
        this.logger = logger;
    }

    private final void logUnityException(String name, String message, String stacktrace, LogExceptionType exceptionType) {
        if (this.embrace.f83157h.a()) {
            i.c(this.embrace, Severity.ERROR, "Unity exception", null, null, stacktrace, exceptionType, name, message, null, RecyclerViewTypes.VIEW_TYPE_SHOPPING_UNIT_THUMBNAIL);
        } else {
            ((e) this.logger).c("log Unity exception");
        }
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

    @Override // io.embrace.android.embracesdk.internal.UnityInternalInterface
    public void installUnityThreadSampler() {
        d dVar;
        qf2.e eVar;
        i iVar = this.embrace;
        p pVar = iVar.f83151b;
        v vVar = iVar.f83164o;
        if (pVar.e("install_unity_thread_sampler")) {
            try {
                n0 n0Var = iVar.f83168s;
                u[] uVarArr = i.f83149w;
                of2.b bVar = (of2.b) n0Var.a(iVar, uVarArr[3]);
                if (bVar != null && (dVar = (d) iVar.f83171v.a(iVar, uVarArr[6])) != null && (eVar = (qf2.e) iVar.f83170u.a(iVar, uVarArr[5])) != null) {
                    a aVar = (a) iVar.f83169t.a(iVar, uVarArr[4]);
                    if (aVar == null) {
                        return;
                    }
                    qf2.b bVar2 = (qf2.b) eVar;
                    if (bVar2.f103790g.a()) {
                        bVar2.f103789f.getClass();
                        Intrinsics.checkNotNullExpressionValue(TextUtils.join(", ", Build.SUPPORTED_ABIS), "join(\n            \", \",\n….SUPPORTED_ABIS\n        )");
                        bVar2.f103787d.setupNativeThreadSampler(!StringsKt.E(r6, "64", false));
                    }
                    if (Intrinsics.d("UnityMain", Thread.currentThread().getName())) {
                        try {
                            dVar.a(eVar, aVar, bVar);
                        } catch (Throwable th3) {
                            ((e) ((b) vVar.getValue())).b(lh2.g.NATIVE_THREAD_SAMPLE_FAIL, th3);
                        }
                    }
                }
            } catch (Exception e13) {
                ((e) ((b) vVar.getValue())).b(lh2.g.NATIVE_THREAD_SAMPLE_FAIL, e13);
            }
        }
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

    @Override // nf2.g
    public void logHandledException(@NotNull Throwable throwable, @NotNull LogType type, Map<String, ? extends Object> properties, StackTraceElement[] customStackTrace) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        Intrinsics.checkNotNullParameter(type, "type");
        this.impl.logHandledException(throwable, type, properties, customStackTrace);
    }

    @Override // io.embrace.android.embracesdk.internal.UnityInternalInterface
    public void logHandledUnityException(@NotNull String name, @NotNull String message, String stacktrace) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(message, "message");
        logUnityException(name, message, stacktrace, LogExceptionType.HANDLED);
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

    @Override // io.embrace.android.embracesdk.internal.UnityInternalInterface
    public void logUnhandledUnityException(@NotNull String name, @NotNull String message, String stacktrace) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(message, "message");
        logUnityException(name, message, stacktrace, LogExceptionType.UNHANDLED);
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

    @Override // io.embrace.android.embracesdk.internal.UnityInternalInterface
    public void setUnityMetaData(String unityVersion, String buildGuid, String unitySdkVersion) {
        if (!this.embrace.f83157h.a()) {
            ((e) this.logger).c("set Unity metadata");
            return;
        }
        if (unityVersion == null || buildGuid == null) {
            if (unitySdkVersion == null) {
                unitySdkVersion = "null or previous than 1.7.5";
            }
            b bVar = this.logger;
            StringBuilder w13 = a.a.w("Unity metadata is corrupted or malformed. Unity version is ", unityVersion, ", Unity build id is ", buildGuid, " and Unity SDK version is ");
            w13.append(unitySdkVersion);
            ((e) bVar).a(w13.toString(), null);
            return;
        }
        if (unitySdkVersion != null) {
            this.hostedSdkVersionInfo.a(unityVersion);
            this.hostedSdkVersionInfo.b(unitySdkVersion);
            c cVar = this.hostedSdkVersionInfo;
            kp.n nVar = cVar.f62172b;
            uh2.b bVar2 = cVar.f62171a;
            String o03 = nVar.o0(bVar2);
            if (o03 == null) {
                cVar.f62175e = buildGuid;
                nVar.x0(buildGuid, bVar2);
            } else {
                if (Intrinsics.d(buildGuid, o03)) {
                    return;
                }
                cVar.f62175e = buildGuid;
                nVar.x0(buildGuid, bVar2);
            }
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

    @Override // io.embrace.android.embracesdk.internal.UnityInternalInterface
    public void recordCompletedNetworkRequest(@NotNull String url, @NotNull String httpMethod, long startTime, long endTime, long bytesSent, long bytesReceived, int statusCode, String traceId) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(httpMethod, "httpMethod");
        i iVar = this.embrace;
        mi2.a aVar = EmbraceNetworkRequest.Companion;
        HttpMethod.Companion.getClass();
        HttpMethod a13 = ni2.a.a(httpMethod);
        aVar.getClass();
        iVar.e(mi2.a.a(url, a13, startTime, endTime, bytesSent, bytesReceived, statusCode, traceId, null, null));
    }

    @Override // nf2.g
    public void recordIncompleteNetworkRequest(@NotNull String url, @NotNull String httpMethod, long startTime, long endTime, Throwable error, String traceId, k networkCaptureData) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(httpMethod, "httpMethod");
        this.impl.recordIncompleteNetworkRequest(url, httpMethod, startTime, endTime, error, traceId, networkCaptureData);
    }

    @Override // io.embrace.android.embracesdk.internal.UnityInternalInterface
    public void recordIncompleteNetworkRequest(@NotNull String url, @NotNull String httpMethod, long startTime, long endTime, String errorType, String errorMessage, String traceId) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(httpMethod, "httpMethod");
        i iVar = this.embrace;
        mi2.a aVar = EmbraceNetworkRequest.Companion;
        HttpMethod.Companion.getClass();
        HttpMethod a13 = ni2.a.a(httpMethod);
        String str = errorType == null ? "" : errorType;
        String str2 = errorMessage == null ? "" : errorMessage;
        aVar.getClass();
        iVar.e(mi2.a.c(url, a13, startTime, endTime, str, str2, traceId, null, null));
    }
}
