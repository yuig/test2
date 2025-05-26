package io.embrace.android.embracesdk.internal.config.remote;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.quikkly.android.utils.BitmapUtils;
import oe2.p;
import oe2.s;
import org.jetbrains.annotations.NotNull;

@s(generateAdapter = true)
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001Bñ\u0001\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0003\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0010\b\u0003\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0010\b\u0003\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0004\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0003\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0003\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0003\u0010\u001e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0003\u0010\"\u001a\u0004\u0018\u00010!\u0012\n\b\u0003\u0010#\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b&\u0010'Jú\u0001\u0010$\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0010\b\u0003\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0010\b\u0003\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0010\b\u0003\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00042\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010\u00182\n\b\u0003\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\b\u0003\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\n\b\u0003\u0010\u001e\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010 \u001a\u0004\u0018\u00010\u001f2\n\b\u0003\u0010\"\u001a\u0004\u0018\u00010!2\n\b\u0003\u0010#\u001a\u0004\u0018\u00010\u0018HÆ\u0001¢\u0006\u0004\b$\u0010%¨\u0006("}, d2 = {"Lio/embrace/android/embracesdk/internal/config/remote/RemoteConfig;", "", "", "threshold", "", "", "disabledEventAndLogPatterns", "disabledUrlPatterns", "Lio/embrace/android/embracesdk/internal/config/remote/NetworkCaptureRuleRemoteConfig;", "networkCaptureRules", "Lio/embrace/android/embracesdk/internal/config/remote/UiRemoteConfig;", "uiConfig", "Lio/embrace/android/embracesdk/internal/config/remote/NetworkRemoteConfig;", "networkConfig", "Lio/embrace/android/embracesdk/internal/config/remote/SessionRemoteConfig;", "sessionConfig", "Lio/embrace/android/embracesdk/internal/config/remote/LogRemoteConfig;", "logConfig", "Lio/embrace/android/embracesdk/internal/config/remote/AnrRemoteConfig;", "anrConfig", "Lio/embrace/android/embracesdk/internal/config/remote/DataRemoteConfig;", "dataConfig", "Lio/embrace/android/embracesdk/internal/config/remote/KillSwitchRemoteConfig;", "killSwitchConfig", "", "internalExceptionCaptureEnabled", "Lio/embrace/android/embracesdk/internal/config/remote/AppExitInfoConfig;", "appExitInfoConfig", "Lio/embrace/android/embracesdk/internal/config/remote/BackgroundActivityRemoteConfig;", "backgroundActivityConfig", "maxSessionProperties", "Lio/embrace/android/embracesdk/internal/config/remote/NetworkSpanForwardingRemoteConfig;", "networkSpanForwardingRemoteConfig", "Lio/embrace/android/embracesdk/internal/config/remote/WebViewVitals;", "webViewVitals", "uiLoadInstrumentationEnabled", "copy", "(Ljava/lang/Integer;Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;Lio/embrace/android/embracesdk/internal/config/remote/UiRemoteConfig;Lio/embrace/android/embracesdk/internal/config/remote/NetworkRemoteConfig;Lio/embrace/android/embracesdk/internal/config/remote/SessionRemoteConfig;Lio/embrace/android/embracesdk/internal/config/remote/LogRemoteConfig;Lio/embrace/android/embracesdk/internal/config/remote/AnrRemoteConfig;Lio/embrace/android/embracesdk/internal/config/remote/DataRemoteConfig;Lio/embrace/android/embracesdk/internal/config/remote/KillSwitchRemoteConfig;Ljava/lang/Boolean;Lio/embrace/android/embracesdk/internal/config/remote/AppExitInfoConfig;Lio/embrace/android/embracesdk/internal/config/remote/BackgroundActivityRemoteConfig;Ljava/lang/Integer;Lio/embrace/android/embracesdk/internal/config/remote/NetworkSpanForwardingRemoteConfig;Lio/embrace/android/embracesdk/internal/config/remote/WebViewVitals;Ljava/lang/Boolean;)Lio/embrace/android/embracesdk/internal/config/remote/RemoteConfig;", "<init>", "(Ljava/lang/Integer;Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;Lio/embrace/android/embracesdk/internal/config/remote/UiRemoteConfig;Lio/embrace/android/embracesdk/internal/config/remote/NetworkRemoteConfig;Lio/embrace/android/embracesdk/internal/config/remote/SessionRemoteConfig;Lio/embrace/android/embracesdk/internal/config/remote/LogRemoteConfig;Lio/embrace/android/embracesdk/internal/config/remote/AnrRemoteConfig;Lio/embrace/android/embracesdk/internal/config/remote/DataRemoteConfig;Lio/embrace/android/embracesdk/internal/config/remote/KillSwitchRemoteConfig;Ljava/lang/Boolean;Lio/embrace/android/embracesdk/internal/config/remote/AppExitInfoConfig;Lio/embrace/android/embracesdk/internal/config/remote/BackgroundActivityRemoteConfig;Ljava/lang/Integer;Lio/embrace/android/embracesdk/internal/config/remote/NetworkSpanForwardingRemoteConfig;Lio/embrace/android/embracesdk/internal/config/remote/WebViewVitals;Ljava/lang/Boolean;)V", "embrace-android-payload_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final /* data */ class RemoteConfig {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f73046a;

    /* renamed from: b, reason: collision with root package name */
    public final Set f73047b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f73048c;

    /* renamed from: d, reason: collision with root package name */
    public final Set f73049d;

    /* renamed from: e, reason: collision with root package name */
    public final UiRemoteConfig f73050e;

    /* renamed from: f, reason: collision with root package name */
    public final NetworkRemoteConfig f73051f;

    /* renamed from: g, reason: collision with root package name */
    public final SessionRemoteConfig f73052g;

    /* renamed from: h, reason: collision with root package name */
    public final LogRemoteConfig f73053h;

    /* renamed from: i, reason: collision with root package name */
    public final AnrRemoteConfig f73054i;

    /* renamed from: j, reason: collision with root package name */
    public final DataRemoteConfig f73055j;

    /* renamed from: k, reason: collision with root package name */
    public final KillSwitchRemoteConfig f73056k;

    /* renamed from: l, reason: collision with root package name */
    public final Boolean f73057l;

    /* renamed from: m, reason: collision with root package name */
    public final AppExitInfoConfig f73058m;

    /* renamed from: n, reason: collision with root package name */
    public final BackgroundActivityRemoteConfig f73059n;

    /* renamed from: o, reason: collision with root package name */
    public final Integer f73060o;

    /* renamed from: p, reason: collision with root package name */
    public final NetworkSpanForwardingRemoteConfig f73061p;

    /* renamed from: q, reason: collision with root package name */
    public final WebViewVitals f73062q;

    /* renamed from: r, reason: collision with root package name */
    public final Boolean f73063r;

    public RemoteConfig(@p(name = "threshold") Integer num, @p(name = "disabled_event_and_log_patterns") Set<String> set, @p(name = "disabled_url_patterns") Set<String> set2, @p(name = "network_capture") Set<NetworkCaptureRuleRemoteConfig> set3, @p(name = "ui") UiRemoteConfig uiRemoteConfig, @p(name = "network") NetworkRemoteConfig networkRemoteConfig, @p(name = "session_control") SessionRemoteConfig sessionRemoteConfig, @p(name = "logs") LogRemoteConfig logRemoteConfig, @p(name = "anr") AnrRemoteConfig anrRemoteConfig, @p(name = "data") DataRemoteConfig dataRemoteConfig, @p(name = "killswitch") KillSwitchRemoteConfig killSwitchRemoteConfig, @p(name = "internal_exception_capture_enabled") Boolean bool, @p(name = "app_exit_info") AppExitInfoConfig appExitInfoConfig, @p(name = "background") BackgroundActivityRemoteConfig backgroundActivityRemoteConfig, @p(name = "max_session_properties") Integer num2, @p(name = "network_span_forwarding") NetworkSpanForwardingRemoteConfig networkSpanForwardingRemoteConfig, @p(name = "webview_vitals_beta") WebViewVitals webViewVitals, @p(name = "ui_load_instrumentation_enabled") Boolean bool2) {
        this.f73046a = num;
        this.f73047b = set;
        this.f73048c = set2;
        this.f73049d = set3;
        this.f73050e = uiRemoteConfig;
        this.f73051f = networkRemoteConfig;
        this.f73052g = sessionRemoteConfig;
        this.f73053h = logRemoteConfig;
        this.f73054i = anrRemoteConfig;
        this.f73055j = dataRemoteConfig;
        this.f73056k = killSwitchRemoteConfig;
        this.f73057l = bool;
        this.f73058m = appExitInfoConfig;
        this.f73059n = backgroundActivityRemoteConfig;
        this.f73060o = num2;
        this.f73061p = networkSpanForwardingRemoteConfig;
        this.f73062q = webViewVitals;
        this.f73063r = bool2;
    }

    @NotNull
    public final RemoteConfig copy(@p(name = "threshold") Integer threshold, @p(name = "disabled_event_and_log_patterns") Set<String> disabledEventAndLogPatterns, @p(name = "disabled_url_patterns") Set<String> disabledUrlPatterns, @p(name = "network_capture") Set<NetworkCaptureRuleRemoteConfig> networkCaptureRules, @p(name = "ui") UiRemoteConfig uiConfig, @p(name = "network") NetworkRemoteConfig networkConfig, @p(name = "session_control") SessionRemoteConfig sessionConfig, @p(name = "logs") LogRemoteConfig logConfig, @p(name = "anr") AnrRemoteConfig anrConfig, @p(name = "data") DataRemoteConfig dataConfig, @p(name = "killswitch") KillSwitchRemoteConfig killSwitchConfig, @p(name = "internal_exception_capture_enabled") Boolean internalExceptionCaptureEnabled, @p(name = "app_exit_info") AppExitInfoConfig appExitInfoConfig, @p(name = "background") BackgroundActivityRemoteConfig backgroundActivityConfig, @p(name = "max_session_properties") Integer maxSessionProperties, @p(name = "network_span_forwarding") NetworkSpanForwardingRemoteConfig networkSpanForwardingRemoteConfig, @p(name = "webview_vitals_beta") WebViewVitals webViewVitals, @p(name = "ui_load_instrumentation_enabled") Boolean uiLoadInstrumentationEnabled) {
        return new RemoteConfig(threshold, disabledEventAndLogPatterns, disabledUrlPatterns, networkCaptureRules, uiConfig, networkConfig, sessionConfig, logConfig, anrConfig, dataConfig, killSwitchConfig, internalExceptionCaptureEnabled, appExitInfoConfig, backgroundActivityConfig, maxSessionProperties, networkSpanForwardingRemoteConfig, webViewVitals, uiLoadInstrumentationEnabled);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RemoteConfig)) {
            return false;
        }
        RemoteConfig remoteConfig = (RemoteConfig) obj;
        return Intrinsics.d(this.f73046a, remoteConfig.f73046a) && Intrinsics.d(this.f73047b, remoteConfig.f73047b) && Intrinsics.d(this.f73048c, remoteConfig.f73048c) && Intrinsics.d(this.f73049d, remoteConfig.f73049d) && Intrinsics.d(this.f73050e, remoteConfig.f73050e) && Intrinsics.d(this.f73051f, remoteConfig.f73051f) && Intrinsics.d(this.f73052g, remoteConfig.f73052g) && Intrinsics.d(this.f73053h, remoteConfig.f73053h) && Intrinsics.d(this.f73054i, remoteConfig.f73054i) && Intrinsics.d(this.f73055j, remoteConfig.f73055j) && Intrinsics.d(this.f73056k, remoteConfig.f73056k) && Intrinsics.d(this.f73057l, remoteConfig.f73057l) && Intrinsics.d(this.f73058m, remoteConfig.f73058m) && Intrinsics.d(this.f73059n, remoteConfig.f73059n) && Intrinsics.d(this.f73060o, remoteConfig.f73060o) && Intrinsics.d(this.f73061p, remoteConfig.f73061p) && Intrinsics.d(this.f73062q, remoteConfig.f73062q) && Intrinsics.d(this.f73063r, remoteConfig.f73063r);
    }

    public final int hashCode() {
        Integer num = this.f73046a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Set set = this.f73047b;
        int hashCode2 = (hashCode + (set == null ? 0 : set.hashCode())) * 31;
        Set set2 = this.f73048c;
        int hashCode3 = (hashCode2 + (set2 == null ? 0 : set2.hashCode())) * 31;
        Set set3 = this.f73049d;
        int hashCode4 = (hashCode3 + (set3 == null ? 0 : set3.hashCode())) * 31;
        UiRemoteConfig uiRemoteConfig = this.f73050e;
        int hashCode5 = (hashCode4 + (uiRemoteConfig == null ? 0 : uiRemoteConfig.hashCode())) * 31;
        NetworkRemoteConfig networkRemoteConfig = this.f73051f;
        int hashCode6 = (hashCode5 + (networkRemoteConfig == null ? 0 : networkRemoteConfig.hashCode())) * 31;
        SessionRemoteConfig sessionRemoteConfig = this.f73052g;
        int hashCode7 = (hashCode6 + (sessionRemoteConfig == null ? 0 : sessionRemoteConfig.hashCode())) * 31;
        LogRemoteConfig logRemoteConfig = this.f73053h;
        int hashCode8 = (hashCode7 + (logRemoteConfig == null ? 0 : logRemoteConfig.hashCode())) * 31;
        AnrRemoteConfig anrRemoteConfig = this.f73054i;
        int hashCode9 = (hashCode8 + (anrRemoteConfig == null ? 0 : anrRemoteConfig.hashCode())) * 31;
        DataRemoteConfig dataRemoteConfig = this.f73055j;
        int hashCode10 = (hashCode9 + (dataRemoteConfig == null ? 0 : dataRemoteConfig.hashCode())) * 31;
        KillSwitchRemoteConfig killSwitchRemoteConfig = this.f73056k;
        int hashCode11 = (hashCode10 + (killSwitchRemoteConfig == null ? 0 : killSwitchRemoteConfig.hashCode())) * 31;
        Boolean bool = this.f73057l;
        int hashCode12 = (hashCode11 + (bool == null ? 0 : bool.hashCode())) * 31;
        AppExitInfoConfig appExitInfoConfig = this.f73058m;
        int hashCode13 = (hashCode12 + (appExitInfoConfig == null ? 0 : appExitInfoConfig.hashCode())) * 31;
        BackgroundActivityRemoteConfig backgroundActivityRemoteConfig = this.f73059n;
        int hashCode14 = (hashCode13 + (backgroundActivityRemoteConfig == null ? 0 : backgroundActivityRemoteConfig.hashCode())) * 31;
        Integer num2 = this.f73060o;
        int hashCode15 = (hashCode14 + (num2 == null ? 0 : num2.hashCode())) * 31;
        NetworkSpanForwardingRemoteConfig networkSpanForwardingRemoteConfig = this.f73061p;
        int hashCode16 = (hashCode15 + (networkSpanForwardingRemoteConfig == null ? 0 : networkSpanForwardingRemoteConfig.hashCode())) * 31;
        WebViewVitals webViewVitals = this.f73062q;
        int hashCode17 = (hashCode16 + (webViewVitals == null ? 0 : webViewVitals.hashCode())) * 31;
        Boolean bool2 = this.f73063r;
        return hashCode17 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        return "RemoteConfig(threshold=" + this.f73046a + ", disabledEventAndLogPatterns=" + this.f73047b + ", disabledUrlPatterns=" + this.f73048c + ", networkCaptureRules=" + this.f73049d + ", uiConfig=" + this.f73050e + ", networkConfig=" + this.f73051f + ", sessionConfig=" + this.f73052g + ", logConfig=" + this.f73053h + ", anrConfig=" + this.f73054i + ", dataConfig=" + this.f73055j + ", killSwitchConfig=" + this.f73056k + ", internalExceptionCaptureEnabled=" + this.f73057l + ", appExitInfoConfig=" + this.f73058m + ", backgroundActivityConfig=" + this.f73059n + ", maxSessionProperties=" + this.f73060o + ", networkSpanForwardingRemoteConfig=" + this.f73061p + ", webViewVitals=" + this.f73062q + ", uiLoadInstrumentationEnabled=" + this.f73063r + ')';
    }

    public /* synthetic */ RemoteConfig(Integer num, Set set, Set set2, Set set3, UiRemoteConfig uiRemoteConfig, NetworkRemoteConfig networkRemoteConfig, SessionRemoteConfig sessionRemoteConfig, LogRemoteConfig logRemoteConfig, AnrRemoteConfig anrRemoteConfig, DataRemoteConfig dataRemoteConfig, KillSwitchRemoteConfig killSwitchRemoteConfig, Boolean bool, AppExitInfoConfig appExitInfoConfig, BackgroundActivityRemoteConfig backgroundActivityRemoteConfig, Integer num2, NetworkSpanForwardingRemoteConfig networkSpanForwardingRemoteConfig, WebViewVitals webViewVitals, Boolean bool2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : num, (i13 & 2) != 0 ? null : set, (i13 & 4) != 0 ? null : set2, (i13 & 8) != 0 ? null : set3, (i13 & 16) != 0 ? null : uiRemoteConfig, (i13 & 32) != 0 ? null : networkRemoteConfig, (i13 & 64) != 0 ? null : sessionRemoteConfig, (i13 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? null : logRemoteConfig, (i13 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? null : anrRemoteConfig, (i13 & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 0 ? null : dataRemoteConfig, (i13 & 1024) != 0 ? null : killSwitchRemoteConfig, (i13 & 2048) != 0 ? null : bool, (i13 & 4096) != 0 ? null : appExitInfoConfig, (i13 & 8192) != 0 ? null : backgroundActivityRemoteConfig, (i13 & 16384) != 0 ? null : num2, (i13 & 32768) != 0 ? null : networkSpanForwardingRemoteConfig, (i13 & 65536) != 0 ? null : webViewVitals, (i13 & 131072) != 0 ? null : bool2);
    }
}
