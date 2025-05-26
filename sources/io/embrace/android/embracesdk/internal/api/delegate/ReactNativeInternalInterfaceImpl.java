package io.embrace.android.embracesdk.internal.api.delegate;

import android.content.Context;
import cg2.d;
import com.google.android.gms.ads.RequestConfiguration;
import dg2.h;
import dg2.k;
import di2.j;
import fh2.c;
import gg2.f;
import io.embrace.android.embracesdk.LogExceptionType;
import io.embrace.android.embracesdk.LogType;
import io.embrace.android.embracesdk.Severity;
import io.embrace.android.embracesdk.internal.ReactNativeInternalInterface;
import io.embrace.android.embracesdk.internal.payload.JsException;
import io.embrace.android.embracesdk.network.EmbraceNetworkRequest;
import io.embrace.android.embracesdk.spans.ErrorCode;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kh2.t0;
import kh2.z0;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import lf2.i;
import lh2.b;
import lh2.e;
import nf2.g;
import org.jetbrains.annotations.NotNull;
import rl2.u;
import s60.a;
import sf2.l;
import th2.n;

@Metadata(d1 = {"\u0000Æ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010$\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002BA\u0012\u0006\u0010}\u001a\u00020|\u0012\u0006\u0010\u007f\u001a\u00020\u0001\u0012\b\u0010\u0082\u0001\u001a\u00030\u0081\u0001\u0012\b\u0010\u0085\u0001\u001a\u00030\u0084\u0001\u0012\b\u0010\u0088\u0001\u001a\u00030\u0087\u0001\u0012\b\u0010\u008b\u0001\u001a\u00030\u008a\u0001¢\u0006\u0006\b\u008d\u0001\u0010\u008e\u0001J(\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003H\u0096\u0001¢\u0006\u0004\b\b\u0010\tJ@\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\rH\u0096\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0007H\u0096\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0007H\u0096\u0001¢\u0006\u0004\b\u0013\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0007H\u0096\u0001¢\u0006\u0004\b\u0014\u0010\u0012J,\u0010\u001a\u001a\u00020\u00192\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0018\u001a\u00020\u0003H\u0096\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ@\u0010!\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u00032\u0014\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001d\u0018\u00010\r2\b\u0010\u001f\u001a\u0004\u0018\u00010\u00032\u0006\u0010 \u001a\u00020\u0007H\u0096\u0001¢\u0006\u0004\b!\u0010\"JF\u0010*\u001a\u00020\u00192\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%2\u0014\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001d\u0018\u00010\r2\u000e\u0010)\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010'H\u0096\u0001¢\u0006\u0004\b*\u0010+J.\u0010,\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u00032\u0014\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001d\u0018\u00010\rH\u0096\u0001¢\u0006\u0004\b,\u0010-J$\u0010/\u001a\u00020\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u00032\b\u0010.\u001a\u0004\u0018\u00010\u0003H\u0096\u0001¢\u0006\u0004\b/\u00100J\u0018\u0010/\u001a\u00020\u00192\u0006\u00101\u001a\u00020#H\u0096\u0001¢\u0006\u0004\b/\u00102J8\u00104\u001a\u00020\u00192\u0016\u0010\u0017\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00152\u0006\u0010\u0018\u001a\u00020\u00032\u0006\u0010&\u001a\u000203H\u0096\u0001¢\u0006\u0004\b4\u00105J8\u00106\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u00032\u0014\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001d\u0018\u00010\r2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0003H\u0096\u0001¢\u0006\u0004\b6\u00107J\\\u0010C\u001a\u00020\u00192\u0006\u00108\u001a\u00020\u00032\u0006\u00109\u001a\u00020\u00032\u0006\u0010:\u001a\u00020\u000b2\u0006\u0010;\u001a\u00020\u000b2\u0006\u0010<\u001a\u00020\u000b2\u0006\u0010=\u001a\u00020\u000b2\u0006\u0010?\u001a\u00020>2\b\u0010@\u001a\u0004\u0018\u00010\u00032\b\u0010B\u001a\u0004\u0018\u00010AH\u0096\u0001¢\u0006\u0004\bC\u0010DJn\u0010L\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010E\u001a\u00020\u000b2\u0006\u0010F\u001a\u00020\u000b2\b\u0010H\u001a\u0004\u0018\u00010G2\b\u0010I\u001a\u0004\u0018\u00010\u00032\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r2\u001a\u0010K\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001d0\r\u0018\u00010JH\u0096\u0001¢\u0006\u0004\bL\u0010MJX\u0010P\u001a\u00020\u00192\u0006\u00108\u001a\u00020\u00032\u0006\u00109\u001a\u00020\u00032\u0006\u0010:\u001a\u00020\u000b2\u0006\u0010;\u001a\u00020\u000b2\b\u0010N\u001a\u0004\u0018\u00010\u00032\b\u0010O\u001a\u0004\u0018\u00010\u00032\b\u0010@\u001a\u0004\u0018\u00010\u00032\b\u0010B\u001a\u0004\u0018\u00010AH\u0096\u0001¢\u0006\u0004\bP\u0010QJN\u0010P\u001a\u00020\u00192\u0006\u00108\u001a\u00020\u00032\u0006\u00109\u001a\u00020\u00032\u0006\u0010:\u001a\u00020\u000b2\u0006\u0010;\u001a\u00020\u000b2\b\u00101\u001a\u0004\u0018\u00010#2\b\u0010@\u001a\u0004\u0018\u00010\u00032\b\u0010B\u001a\u0004\u0018\u00010AH\u0096\u0001¢\u0006\u0004\bP\u0010RJ\u0018\u0010U\u001a\u00020\u00192\u0006\u0010T\u001a\u00020SH\u0096\u0001¢\u0006\u0004\bU\u0010VJh\u0010Z\u001a\u00028\u0000\"\u0004\b\u0000\u0010W2\u0006\u0010\n\u001a\u00020\u00032\b\u0010I\u001a\u0004\u0018\u00010\u00032\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r2\u001a\u0010K\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001d0\r\u0018\u00010J2\f\u0010Y\u001a\b\u0012\u0004\u0012\u00028\u00000XH\u0096\u0001¢\u0006\u0004\bZ\u0010[J \u0010]\u001a\u00020\u00072\u0006\u00108\u001a\u00020\u00032\u0006\u0010\\\u001a\u00020\u0003H\u0096\u0001¢\u0006\u0004\b]\u0010^J.\u0010_\u001a\u0004\u0018\u00010\u00032\u0006\u0010\n\u001a\u00020\u00032\b\u0010I\u001a\u0004\u0018\u00010\u00032\b\u0010E\u001a\u0004\u0018\u00010\u000bH\u0096\u0001¢\u0006\u0004\b_\u0010`J\u0010\u0010a\u001a\u00020\u0019H\u0096\u0001¢\u0006\u0004\ba\u0010bJ,\u0010c\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010H\u001a\u0004\u0018\u00010G2\b\u0010F\u001a\u0004\u0018\u00010\u000bH\u0096\u0001¢\u0006\u0004\bc\u0010dJ3\u0010e\u001a\u00020\u00192\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u00032\b\u0010&\u001a\u0004\u0018\u00010\u00032\b\u0010\u001f\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\be\u0010fJ=\u0010g\u001a\u00020\u00192\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u00032\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001d0\r2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\bg\u0010hJ\u0019\u0010j\u001a\u00020\u00192\b\u0010i\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\bj\u0010kJ\u0019\u0010m\u001a\u00020\u00192\b\u0010l\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\bm\u0010kJ\u0019\u0010n\u001a\u00020\u00192\b\u0010l\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\bn\u0010kJ\u001f\u0010q\u001a\u00020\u00192\u0006\u0010p\u001a\u00020o2\u0006\u00108\u001a\u00020\u0003H\u0016¢\u0006\u0004\bq\u0010rJ'\u0010t\u001a\u00020\u00192\u0006\u0010p\u001a\u00020o2\u0006\u00108\u001a\u00020\u00032\u0006\u0010s\u001a\u00020\u0007H\u0016¢\u0006\u0004\bt\u0010uJO\u0010w\u001a\u00020\u00192\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010:\u001a\u00020\u000b2\u0006\u0010;\u001a\u00020\u000b2\u0016\u0010\u001e\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\r2\u0006\u0010<\u001a\u00020>2\u0006\u0010v\u001a\u00020\u0003H\u0016¢\u0006\u0004\bw\u0010xJ\u0017\u0010z\u001a\u00020\u00192\u0006\u0010y\u001a\u00020\u0003H\u0016¢\u0006\u0004\bz\u0010kJ#\u0010q\u001a\u00020\u00192\u0006\u00108\u001a\u00020\u00032\n\b\u0002\u0010s\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\bq\u0010{R\u0014\u0010}\u001a\u00020|8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b}\u0010~R\u0015\u0010\u007f\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u007f\u0010\u0080\u0001R\u0018\u0010\u0082\u0001\u001a\u00030\u0081\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0083\u0001R\u0018\u0010\u0085\u0001\u001a\u00030\u0084\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0086\u0001R\u0018\u0010\u0088\u0001\u001a\u00030\u0087\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0089\u0001R\u0018\u0010\u008b\u0001\u001a\u00030\u008a\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u008c\u0001¨\u0006\u008f\u0001"}, d2 = {"Lio/embrace/android/embracesdk/internal/api/delegate/ReactNativeInternalInterfaceImpl;", "Lnf2/g;", "Lio/embrace/android/embracesdk/internal/ReactNativeInternalInterface;", "", "spanId", "key", "value", "", "addSpanAttribute", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z", "name", "", "timestampMs", "", "attributes", "addSpanEvent", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/util/Map;)Z", "isAnrCaptureEnabled", "()Z", "isNdkEnabled", "isNetworkSpanForwardingEnabled", "Lkotlin/Pair;", "", "point", "elementName", "", "logComposeTap", "(Lkotlin/Pair;Ljava/lang/String;)V", "message", "", "properties", "stacktrace", "isException", "logError", "(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Z)V", "", "throwable", "Lio/embrace/android/embracesdk/LogType;", "type", "", "Ljava/lang/StackTraceElement;", "customStackTrace", "logHandledException", "(Ljava/lang/Throwable;Lio/embrace/android/embracesdk/LogType;Ljava/util/Map;[Ljava/lang/StackTraceElement;)V", "logInfo", "(Ljava/lang/String;Ljava/util/Map;)V", "details", "logInternalError", "(Ljava/lang/String;Ljava/lang/String;)V", "error", "(Ljava/lang/Throwable;)V", "Lth2/n;", "logTap", "(Lkotlin/Pair;Ljava/lang/String;Lth2/n;)V", "logWarning", "(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)V", "url", "httpMethod", "startTime", "endTime", "bytesSent", "bytesReceived", "", "statusCode", "traceId", "Lqh2/k;", "networkCaptureData", "recordCompletedNetworkRequest", "(Ljava/lang/String;Ljava/lang/String;JJJJILjava/lang/String;Lqh2/k;)V", "startTimeMs", "endTimeMs", "Lio/embrace/android/embracesdk/spans/ErrorCode;", "errorCode", "parentSpanId", "", "events", "recordCompletedSpan", "(Ljava/lang/String;JJLio/embrace/android/embracesdk/spans/ErrorCode;Ljava/lang/String;Ljava/util/Map;Ljava/util/List;)Z", "errorType", "errorMessage", "recordIncompleteNetworkRequest", "(Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lqh2/k;)V", "(Ljava/lang/String;Ljava/lang/String;JJLjava/lang/Throwable;Ljava/lang/String;Lqh2/k;)V", "Lio/embrace/android/embracesdk/network/EmbraceNetworkRequest;", "embraceNetworkRequest", "recordNetworkRequest", "(Lio/embrace/android/embracesdk/network/EmbraceNetworkRequest;)V", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlin/Function0;", "code", "recordSpan", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/List;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "method", "shouldCaptureNetworkBody", "(Ljava/lang/String;Ljava/lang/String;)Z", "startSpan", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)Ljava/lang/String;", "stopSdk", "()V", "stopSpan", "(Ljava/lang/String;Lio/embrace/android/embracesdk/spans/ErrorCode;Ljava/lang/Long;)Z", "logUnhandledJsException", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "logHandledJsException", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)V", "number", "setJavaScriptPatchNumber", "(Ljava/lang/String;)V", "version", "setReactNativeSdkVersion", "setReactNativeVersionNumber", "Landroid/content/Context;", "context", "setJavaScriptBundleUrl", "(Landroid/content/Context;Ljava/lang/String;)V", "didUpdate", "setCacheableJavaScriptBundleUrl", "(Landroid/content/Context;Ljava/lang/String;Z)V", "output", "logRnAction", "(Ljava/lang/String;JJLjava/util/Map;ILjava/lang/String;)V", "screen", "logRnView", "(Ljava/lang/String;Ljava/lang/Boolean;)V", "Llf2/i;", "embrace", "Llf2/i;", "impl", "Lnf2/g;", "Lcg2/d;", "crashService", "Lcg2/d;", "Lgg2/f;", "rnBundleIdTracker", "Lgg2/f;", "Lfh2/c;", "hostedSdkVersionInfo", "Lfh2/c;", "Llh2/b;", "logger", "Llh2/b;", "<init>", "(Llf2/i;Lnf2/g;Lcg2/d;Lgg2/f;Lfh2/c;Llh2/b;)V", "embrace-android-sdk_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class ReactNativeInternalInterfaceImpl implements g, ReactNativeInternalInterface {

    @NotNull
    private final d crashService;

    @NotNull
    private final i embrace;

    @NotNull
    private final c hostedSdkVersionInfo;

    @NotNull
    private final g impl;

    @NotNull
    private final b logger;

    @NotNull
    private final f rnBundleIdTracker;

    public ReactNativeInternalInterfaceImpl(@NotNull i embrace, @NotNull g impl, @NotNull d crashService, @NotNull f rnBundleIdTracker, @NotNull c hostedSdkVersionInfo, @NotNull b logger) {
        Intrinsics.checkNotNullParameter(embrace, "embrace");
        Intrinsics.checkNotNullParameter(impl, "impl");
        Intrinsics.checkNotNullParameter(crashService, "crashService");
        Intrinsics.checkNotNullParameter(rnBundleIdTracker, "rnBundleIdTracker");
        Intrinsics.checkNotNullParameter(hostedSdkVersionInfo, "hostedSdkVersionInfo");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.embrace = embrace;
        this.impl = impl;
        this.crashService = crashService;
        this.rnBundleIdTracker = rnBundleIdTracker;
        this.hostedSdkVersionInfo = hostedSdkVersionInfo;
        this.logger = logger;
    }

    public static /* synthetic */ void setJavaScriptBundleUrl$default(ReactNativeInternalInterfaceImpl reactNativeInternalInterfaceImpl, String str, Boolean bool, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            bool = null;
        }
        reactNativeInternalInterfaceImpl.setJavaScriptBundleUrl(str, bool);
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

    @Override // nf2.g
    public void logHandledException(@NotNull Throwable throwable, @NotNull LogType type, Map<String, ? extends Object> properties, StackTraceElement[] customStackTrace) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        Intrinsics.checkNotNullParameter(type, "type");
        this.impl.logHandledException(throwable, type, properties, customStackTrace);
    }

    @Override // io.embrace.android.embracesdk.internal.ReactNativeInternalInterface
    public void logHandledJsException(@NotNull String name, @NotNull String message, @NotNull Map<String, ? extends Object> properties, String stacktrace) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(properties, "properties");
        if (this.embrace.f83157h.a()) {
            i.c(this.embrace, Severity.ERROR, message, properties, null, stacktrace, LogExceptionType.HANDLED, null, null, null, 456);
        } else {
            ((e) this.logger).c("log JS exception");
        }
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

    @Override // io.embrace.android.embracesdk.internal.ReactNativeInternalInterface
    public void logRnAction(@NotNull String name, long startTime, long endTime, @NotNull Map<String, ? extends Object> properties, int bytesSent, @NotNull String output) {
        t0 a13;
        h hVar;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(properties, "properties");
        Intrinsics.checkNotNullParameter(output, "output");
        i iVar = this.embrace;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(properties, "properties");
        Intrinsics.checkNotNullParameter(output, "output");
        l lVar = iVar.f83156g;
        lVar.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(properties, "properties");
        Intrinsics.checkNotNullParameter(output, "output");
        if (!lVar.f112852a.e("log_react_native_action") || (a13 = lVar.a()) == null) {
            return;
        }
        uf2.d b13 = ((z0) a13).f79772h.b(z0.f79764n[6]);
        if (b13 == null || (hVar = (h) b13.f122121f) == null) {
            return;
        }
        Intrinsics.checkNotNullParameter(properties, "properties");
        hVar.g(new a(name, 5), new dg2.g(name, startTime, endTime, properties, bytesSent, output), true);
    }

    @Override // io.embrace.android.embracesdk.internal.ReactNativeInternalInterface
    public void logRnView(@NotNull String screen) {
        dg2.l lVar;
        Intrinsics.checkNotNullParameter(screen, "screen");
        i iVar = this.embrace;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(screen, "screen");
        l lVar2 = iVar.f83156g;
        lVar2.getClass();
        Intrinsics.checkNotNullParameter(screen, "screen");
        u[] uVarArr = l.f112851g;
        if (((th2.g) lVar2.f112856e.a(lVar2, uVarArr[2])) == th2.g.REACT_NATIVE && lVar2.f112852a.e("log RN view")) {
            t0 a13 = lVar2.a();
            if (a13 != null) {
                uf2.d b13 = ((z0) a13).f79768d.b(z0.f79764n[2]);
                if (b13 != null && (lVar = (dg2.l) b13.f122121f) != null) {
                    Set keySet = lVar.f54968e.keySet();
                    Intrinsics.checkNotNullExpressionValue(keySet, "viewSpans.keys");
                    String str = (String) CollectionsKt.c0(keySet);
                    lVar.g(new a(str, 6), new k(lVar, str, 0), false);
                    lVar.g(new a(screen, 7), new k(lVar, screen, 1), true);
                }
            }
            di2.c cVar = (di2.c) lVar2.f112855d.a(lVar2, uVarArr[1]);
            if (cVar != null) {
                ((j) cVar).a();
            }
        }
    }

    @Override // nf2.g
    public void logTap(@NotNull Pair<Float, Float> point, @NotNull String elementName, @NotNull n type) {
        Intrinsics.checkNotNullParameter(point, "point");
        Intrinsics.checkNotNullParameter(elementName, "elementName");
        Intrinsics.checkNotNullParameter(type, "type");
        this.impl.logTap(point, elementName, type);
    }

    @Override // io.embrace.android.embracesdk.internal.ReactNativeInternalInterface
    public void logUnhandledJsException(@NotNull String name, @NotNull String message, String type, String stacktrace) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(message, "message");
        if (!this.embrace.f83157h.a()) {
            ((e) this.logger).c("log JS exception");
            return;
        }
        JsException exception = new JsException(name, message, type, stacktrace);
        cg2.c cVar = (cg2.c) this.crashService;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(exception, "exception");
        cVar.f27713k = exception;
    }

    @Override // nf2.g
    public void logWarning(@NotNull String message, Map<String, ? extends Object> properties, String stacktrace) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.impl.logWarning(message, properties, stacktrace);
    }

    @Override // nf2.g
    public void recordCompletedNetworkRequest(@NotNull String url, @NotNull String httpMethod, long startTime, long endTime, long bytesSent, long bytesReceived, int statusCode, String traceId, qh2.k networkCaptureData) {
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
    public void recordIncompleteNetworkRequest(@NotNull String url, @NotNull String httpMethod, long startTime, long endTime, String errorType, String errorMessage, String traceId, qh2.k networkCaptureData) {
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

    @Override // io.embrace.android.embracesdk.internal.ReactNativeInternalInterface
    public void setCacheableJavaScriptBundleUrl(@NotNull Context context, @NotNull String url, boolean didUpdate) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(url, "url");
        setJavaScriptBundleUrl(url, Boolean.valueOf(didUpdate));
    }

    @Override // io.embrace.android.embracesdk.internal.ReactNativeInternalInterface
    public void setJavaScriptBundleUrl(@NotNull Context context, @NotNull String url) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(url, "url");
        setJavaScriptBundleUrl(url, (Boolean) null);
    }

    @Override // io.embrace.android.embracesdk.internal.ReactNativeInternalInterface
    public void setJavaScriptPatchNumber(String number) {
        if (!this.embrace.f83157h.a()) {
            ((e) this.logger).c("set JavaScript patch number");
            return;
        }
        if (number == null || number.length() == 0) {
            return;
        }
        c cVar = this.hostedSdkVersionInfo;
        kp.n nVar = cVar.f62172b;
        uh2.b bVar = cVar.f62171a;
        String n03 = nVar.n0(bVar);
        if (n03 == null) {
            cVar.f62176f = number;
            nVar.w0(number, bVar);
        } else {
            if (Intrinsics.d(number, n03)) {
                return;
            }
            cVar.f62176f = number;
            nVar.w0(number, bVar);
        }
    }

    @Override // io.embrace.android.embracesdk.internal.ReactNativeInternalInterface
    public void setReactNativeSdkVersion(String version) {
        if (this.embrace.f83157h.a()) {
            this.hostedSdkVersionInfo.b(version);
        } else {
            ((e) this.logger).c("set React Native SDK version");
        }
    }

    @Override // io.embrace.android.embracesdk.internal.ReactNativeInternalInterface
    public void setReactNativeVersionNumber(String version) {
        if (!this.embrace.f83157h.a()) {
            ((e) this.logger).c("set React Native version number");
        } else {
            if (version == null || version.length() == 0) {
                return;
            }
            this.hostedSdkVersionInfo.a(version);
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

    private final void setJavaScriptBundleUrl(String url, Boolean didUpdate) {
        if (!this.embrace.f83157h.a()) {
            ((e) this.logger).c("set JavaScript bundle URL");
            return;
        }
        gg2.h hVar = (gg2.h) this.rnBundleIdTracker;
        uh2.a aVar = (uh2.a) hVar.f64991d;
        if (!Intrinsics.d(aVar.f122252a.getString("io.embrace.jsbundle.url", null), url) || Intrinsics.d(didUpdate, Boolean.TRUE)) {
            uh2.a.d(aVar.f122252a, "io.embrace.jsbundle.url", url);
            hVar.f64993f = hVar.f64992e.c(new com.airbnb.lottie.j((Object) hVar, (Object) didUpdate, url, 6));
        }
    }

    @Override // nf2.g
    public void logInternalError(@NotNull Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.impl.logInternalError(error);
    }

    @Override // nf2.g
    public void recordIncompleteNetworkRequest(@NotNull String url, @NotNull String httpMethod, long startTime, long endTime, Throwable error, String traceId, qh2.k networkCaptureData) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(httpMethod, "httpMethod");
        this.impl.recordIncompleteNetworkRequest(url, httpMethod, startTime, endTime, error, traceId, networkCaptureData);
    }
}
