package df;

import android.R;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public enum v {
    Unknown(-1),
    Core(0),
    AppEvents(65536),
    CodelessEvents(65792),
    CloudBridge(67584),
    RestrictiveDataFiltering(66048),
    AAM(66304),
    PrivacyProtection(66560),
    SuggestedEvents(66561),
    IntelligentIntegrity(66562),
    ModelRequest(66563),
    EventDeactivation(66816),
    OnDeviceEventProcessing(67072),
    OnDevicePostInstallEventProcessing(67073),
    IapLogging(67328),
    IapLoggingLib2(67329),
    Instrument(131072),
    CrashReport(131328),
    CrashShield(131329),
    ThreadCheck(131330),
    ErrorReport(131584),
    AnrReport(131840),
    Monitoring(196608),
    ServiceUpdateCompliance(196864),
    Login(16777216),
    ChromeCustomTabsPrefetching(R.attr.theme),
    IgnoreAppSwitchToLoggedOut(R.id.background),
    BypassAppSwitch(R.style.Animation),
    Share(33554432);


    @NotNull
    public static final t Companion = new t();
    private final int code;

    v(int i13) {
        this.code = i13;
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static v[] valuesCustom() {
        v[] valuesCustom = values();
        return (v[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }

    @NotNull
    public final v getParent() {
        int i13 = this.code;
        if ((i13 & 255) > 0) {
            Companion.getClass();
            return t.a(i13 & (-256));
        }
        if ((65280 & i13) > 0) {
            Companion.getClass();
            return t.a(i13 & (-65536));
        }
        if ((16711680 & i13) > 0) {
            Companion.getClass();
            return t.a(i13 & (-16777216));
        }
        Companion.getClass();
        return t.a(0);
    }

    @NotNull
    public final String toKey() {
        return Intrinsics.n(this, "FBSDKFeature");
    }

    @Override // java.lang.Enum
    @NotNull
    public String toString() {
        switch (u.f54859a[ordinal()]) {
            case 1:
                return "CoreKit";
            case 2:
                return "AppEvents";
            case 3:
                return "CodelessEvents";
            case 4:
                return "RestrictiveDataFiltering";
            case 5:
                return "Instrument";
            case 6:
                return "CrashReport";
            case 7:
                return "CrashShield";
            case 8:
                return "ThreadCheck";
            case 9:
                return "ErrorReport";
            case 10:
                return "AnrReport";
            case 11:
                return "AAM";
            case 12:
                return "AppEventsCloudbridge";
            case 13:
                return "PrivacyProtection";
            case 14:
                return "SuggestedEvents";
            case 15:
                return "IntelligentIntegrity";
            case 16:
                return "ModelRequest";
            case 17:
                return "EventDeactivation";
            case 18:
                return "OnDeviceEventProcessing";
            case 19:
                return "OnDevicePostInstallEventProcessing";
            case 20:
                return "IAPLogging";
            case 21:
                return "IAPLoggingLib2";
            case 22:
                return "Monitoring";
            case 23:
                return "ServiceUpdateCompliance";
            case 24:
                return "LoginKit";
            case 25:
                return "ChromeCustomTabsPrefetching";
            case 26:
                return "IgnoreAppSwitchToLoggedOut";
            case 27:
                return "BypassAppSwitch";
            case 28:
                return "ShareKit";
            default:
                return "unknown";
        }
    }
}
