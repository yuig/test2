package io.embrace.android.embracesdk.internal.config.remote;

import java.lang.reflect.Constructor;
import java.util.Set;
import kg.a;
import kotlin.Metadata;
import kotlin.collections.s0;
import kotlin.jvm.internal.Intrinsics;
import mc2.k;
import oe2.h0;
import oe2.r;
import oe2.v;
import oe2.y;
import org.jetbrains.annotations.NotNull;
import pe2.b;
import pk2.f;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lio/embrace/android/embracesdk/internal/config/remote/RemoteConfigJsonAdapter;", "Loe2/r;", "Lio/embrace/android/embracesdk/internal/config/remote/RemoteConfig;", "Loe2/h0;", "moshi", "<init>", "(Loe2/h0;)V", "embrace-android-payload_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class RemoteConfigJsonAdapter extends r {

    /* renamed from: a, reason: collision with root package name */
    public final k f73064a;

    /* renamed from: b, reason: collision with root package name */
    public final r f73065b;

    /* renamed from: c, reason: collision with root package name */
    public final r f73066c;

    /* renamed from: d, reason: collision with root package name */
    public final r f73067d;

    /* renamed from: e, reason: collision with root package name */
    public final r f73068e;

    /* renamed from: f, reason: collision with root package name */
    public final r f73069f;

    /* renamed from: g, reason: collision with root package name */
    public final r f73070g;

    /* renamed from: h, reason: collision with root package name */
    public final r f73071h;

    /* renamed from: i, reason: collision with root package name */
    public final r f73072i;

    /* renamed from: j, reason: collision with root package name */
    public final r f73073j;

    /* renamed from: k, reason: collision with root package name */
    public final r f73074k;

    /* renamed from: l, reason: collision with root package name */
    public final r f73075l;

    /* renamed from: m, reason: collision with root package name */
    public final r f73076m;

    /* renamed from: n, reason: collision with root package name */
    public final r f73077n;

    /* renamed from: o, reason: collision with root package name */
    public final r f73078o;

    /* renamed from: p, reason: collision with root package name */
    public final r f73079p;

    /* renamed from: q, reason: collision with root package name */
    public volatile Constructor f73080q;

    public RemoteConfigJsonAdapter(@NotNull h0 moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        k b13 = k.b("threshold", "disabled_event_and_log_patterns", "disabled_url_patterns", "network_capture", "ui", "network", "session_control", "logs", "anr", "data", "killswitch", "internal_exception_capture_enabled", "app_exit_info", "background", "max_session_properties", "network_span_forwarding", "webview_vitals_beta", "ui_load_instrumentation_enabled");
        Intrinsics.checkNotNullExpressionValue(b13, "of(\"threshold\",\n      \"d…instrumentation_enabled\")");
        this.f73064a = b13;
        s0 s0Var = s0.f80394a;
        r c13 = moshi.c(Integer.class, s0Var, "threshold");
        Intrinsics.checkNotNullExpressionValue(c13, "moshi.adapter(Int::class… emptySet(), \"threshold\")");
        this.f73065b = c13;
        r c14 = moshi.c(a.Z(Set.class, String.class), s0Var, "disabledEventAndLogPatterns");
        Intrinsics.checkNotNullExpressionValue(c14, "moshi.adapter(Types.newP…bledEventAndLogPatterns\")");
        this.f73066c = c14;
        r c15 = moshi.c(a.Z(Set.class, NetworkCaptureRuleRemoteConfig.class), s0Var, "networkCaptureRules");
        Intrinsics.checkNotNullExpressionValue(c15, "moshi.adapter(Types.newP…), \"networkCaptureRules\")");
        this.f73067d = c15;
        r c16 = moshi.c(UiRemoteConfig.class, s0Var, "uiConfig");
        Intrinsics.checkNotNullExpressionValue(c16, "moshi.adapter(UiRemoteCo…, emptySet(), \"uiConfig\")");
        this.f73068e = c16;
        r c17 = moshi.c(NetworkRemoteConfig.class, s0Var, "networkConfig");
        Intrinsics.checkNotNullExpressionValue(c17, "moshi.adapter(NetworkRem…tySet(), \"networkConfig\")");
        this.f73069f = c17;
        r c18 = moshi.c(SessionRemoteConfig.class, s0Var, "sessionConfig");
        Intrinsics.checkNotNullExpressionValue(c18, "moshi.adapter(SessionRem…tySet(), \"sessionConfig\")");
        this.f73070g = c18;
        r c19 = moshi.c(LogRemoteConfig.class, s0Var, "logConfig");
        Intrinsics.checkNotNullExpressionValue(c19, "moshi.adapter(LogRemoteC… emptySet(), \"logConfig\")");
        this.f73071h = c19;
        r c23 = moshi.c(AnrRemoteConfig.class, s0Var, "anrConfig");
        Intrinsics.checkNotNullExpressionValue(c23, "moshi.adapter(AnrRemoteC… emptySet(), \"anrConfig\")");
        this.f73072i = c23;
        r c24 = moshi.c(DataRemoteConfig.class, s0Var, "dataConfig");
        Intrinsics.checkNotNullExpressionValue(c24, "moshi.adapter(DataRemote…emptySet(), \"dataConfig\")");
        this.f73073j = c24;
        r c25 = moshi.c(KillSwitchRemoteConfig.class, s0Var, "killSwitchConfig");
        Intrinsics.checkNotNullExpressionValue(c25, "moshi.adapter(KillSwitch…et(), \"killSwitchConfig\")");
        this.f73074k = c25;
        r c26 = moshi.c(Boolean.class, s0Var, "internalExceptionCaptureEnabled");
        Intrinsics.checkNotNullExpressionValue(c26, "moshi.adapter(Boolean::c…ExceptionCaptureEnabled\")");
        this.f73075l = c26;
        r c27 = moshi.c(AppExitInfoConfig.class, s0Var, "appExitInfoConfig");
        Intrinsics.checkNotNullExpressionValue(c27, "moshi.adapter(AppExitInf…t(), \"appExitInfoConfig\")");
        this.f73076m = c27;
        r c28 = moshi.c(BackgroundActivityRemoteConfig.class, s0Var, "backgroundActivityConfig");
        Intrinsics.checkNotNullExpressionValue(c28, "moshi.adapter(Background…ackgroundActivityConfig\")");
        this.f73077n = c28;
        r c29 = moshi.c(NetworkSpanForwardingRemoteConfig.class, s0Var, "networkSpanForwardingRemoteConfig");
        Intrinsics.checkNotNullExpressionValue(c29, "moshi.adapter(NetworkSpa…nForwardingRemoteConfig\")");
        this.f73078o = c29;
        r c33 = moshi.c(WebViewVitals.class, s0Var, "webViewVitals");
        Intrinsics.checkNotNullExpressionValue(c33, "moshi.adapter(WebViewVit…tySet(), \"webViewVitals\")");
        this.f73079p = c33;
    }

    @Override // oe2.r
    public final Object a(v reader) {
        int i13;
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.c();
        Integer num = null;
        int i14 = -1;
        Set set = null;
        Set set2 = null;
        Set set3 = null;
        UiRemoteConfig uiRemoteConfig = null;
        NetworkRemoteConfig networkRemoteConfig = null;
        SessionRemoteConfig sessionRemoteConfig = null;
        LogRemoteConfig logRemoteConfig = null;
        AnrRemoteConfig anrRemoteConfig = null;
        DataRemoteConfig dataRemoteConfig = null;
        KillSwitchRemoteConfig killSwitchRemoteConfig = null;
        Boolean bool = null;
        AppExitInfoConfig appExitInfoConfig = null;
        BackgroundActivityRemoteConfig backgroundActivityRemoteConfig = null;
        Integer num2 = null;
        NetworkSpanForwardingRemoteConfig networkSpanForwardingRemoteConfig = null;
        WebViewVitals webViewVitals = null;
        Boolean bool2 = null;
        while (reader.hasNext()) {
            switch (reader.k(this.f73064a)) {
                case -1:
                    reader.m();
                    reader.E();
                    continue;
                case 0:
                    num = (Integer) this.f73065b.a(reader);
                    i14 &= -2;
                    continue;
                case 1:
                    set = (Set) this.f73066c.a(reader);
                    i14 &= -3;
                    continue;
                case 2:
                    set2 = (Set) this.f73066c.a(reader);
                    i14 &= -5;
                    continue;
                case 3:
                    set3 = (Set) this.f73067d.a(reader);
                    i14 &= -9;
                    continue;
                case 4:
                    uiRemoteConfig = (UiRemoteConfig) this.f73068e.a(reader);
                    i14 &= -17;
                    continue;
                case 5:
                    networkRemoteConfig = (NetworkRemoteConfig) this.f73069f.a(reader);
                    i14 &= -33;
                    continue;
                case 6:
                    sessionRemoteConfig = (SessionRemoteConfig) this.f73070g.a(reader);
                    i14 &= -65;
                    continue;
                case 7:
                    logRemoteConfig = (LogRemoteConfig) this.f73071h.a(reader);
                    i14 &= -129;
                    continue;
                case 8:
                    anrRemoteConfig = (AnrRemoteConfig) this.f73072i.a(reader);
                    i14 &= -257;
                    continue;
                case 9:
                    dataRemoteConfig = (DataRemoteConfig) this.f73073j.a(reader);
                    i14 &= -513;
                    continue;
                case 10:
                    killSwitchRemoteConfig = (KillSwitchRemoteConfig) this.f73074k.a(reader);
                    i14 &= -1025;
                    continue;
                case 11:
                    bool = (Boolean) this.f73075l.a(reader);
                    i14 &= -2049;
                    continue;
                case 12:
                    appExitInfoConfig = (AppExitInfoConfig) this.f73076m.a(reader);
                    i14 &= -4097;
                    continue;
                case 13:
                    backgroundActivityRemoteConfig = (BackgroundActivityRemoteConfig) this.f73077n.a(reader);
                    i14 &= -8193;
                    continue;
                case 14:
                    num2 = (Integer) this.f73065b.a(reader);
                    i14 &= -16385;
                    continue;
                case 15:
                    networkSpanForwardingRemoteConfig = (NetworkSpanForwardingRemoteConfig) this.f73078o.a(reader);
                    i13 = -32769;
                    break;
                case 16:
                    webViewVitals = (WebViewVitals) this.f73079p.a(reader);
                    i13 = -65537;
                    break;
                case 17:
                    bool2 = (Boolean) this.f73075l.a(reader);
                    i13 = -131073;
                    break;
            }
            i14 &= i13;
        }
        reader.e();
        if (i14 == -262144) {
            return new RemoteConfig(num, set, set2, set3, uiRemoteConfig, networkRemoteConfig, sessionRemoteConfig, logRemoteConfig, anrRemoteConfig, dataRemoteConfig, killSwitchRemoteConfig, bool, appExitInfoConfig, backgroundActivityRemoteConfig, num2, networkSpanForwardingRemoteConfig, webViewVitals, bool2);
        }
        Constructor constructor = this.f73080q;
        if (constructor == null) {
            constructor = RemoteConfig.class.getDeclaredConstructor(Integer.class, Set.class, Set.class, Set.class, UiRemoteConfig.class, NetworkRemoteConfig.class, SessionRemoteConfig.class, LogRemoteConfig.class, AnrRemoteConfig.class, DataRemoteConfig.class, KillSwitchRemoteConfig.class, Boolean.class, AppExitInfoConfig.class, BackgroundActivityRemoteConfig.class, Integer.class, NetworkSpanForwardingRemoteConfig.class, WebViewVitals.class, Boolean.class, Integer.TYPE, b.f100000c);
            this.f73080q = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "RemoteConfig::class.java…his.constructorRef = it }");
        }
        Object newInstance = constructor.newInstance(num, set, set2, set3, uiRemoteConfig, networkRemoteConfig, sessionRemoteConfig, logRemoteConfig, anrRemoteConfig, dataRemoteConfig, killSwitchRemoteConfig, bool, appExitInfoConfig, backgroundActivityRemoteConfig, num2, networkSpanForwardingRemoteConfig, webViewVitals, bool2, Integer.valueOf(i14), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return (RemoteConfig) newInstance;
    }

    @Override // oe2.r
    public final void d(y writer, Object obj) {
        RemoteConfig remoteConfig = (RemoteConfig) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (remoteConfig == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.c();
        writer.f("threshold");
        r rVar = this.f73065b;
        rVar.d(writer, remoteConfig.f73046a);
        writer.f("disabled_event_and_log_patterns");
        r rVar2 = this.f73066c;
        rVar2.d(writer, remoteConfig.f73047b);
        writer.f("disabled_url_patterns");
        rVar2.d(writer, remoteConfig.f73048c);
        writer.f("network_capture");
        this.f73067d.d(writer, remoteConfig.f73049d);
        writer.f("ui");
        this.f73068e.d(writer, remoteConfig.f73050e);
        writer.f("network");
        this.f73069f.d(writer, remoteConfig.f73051f);
        writer.f("session_control");
        this.f73070g.d(writer, remoteConfig.f73052g);
        writer.f("logs");
        this.f73071h.d(writer, remoteConfig.f73053h);
        writer.f("anr");
        this.f73072i.d(writer, remoteConfig.f73054i);
        writer.f("data");
        this.f73073j.d(writer, remoteConfig.f73055j);
        writer.f("killswitch");
        this.f73074k.d(writer, remoteConfig.f73056k);
        writer.f("internal_exception_capture_enabled");
        r rVar3 = this.f73075l;
        rVar3.d(writer, remoteConfig.f73057l);
        writer.f("app_exit_info");
        this.f73076m.d(writer, remoteConfig.f73058m);
        writer.f("background");
        this.f73077n.d(writer, remoteConfig.f73059n);
        writer.f("max_session_properties");
        rVar.d(writer, remoteConfig.f73060o);
        writer.f("network_span_forwarding");
        this.f73078o.d(writer, remoteConfig.f73061p);
        writer.f("webview_vitals_beta");
        this.f73079p.d(writer, remoteConfig.f73062q);
        writer.f("ui_load_instrumentation_enabled");
        rVar3.d(writer, remoteConfig.f73063r);
        writer.d();
    }

    public final String toString() {
        return f.f(34, "GeneratedJsonAdapter(RemoteConfig)", "toString(...)");
    }
}
