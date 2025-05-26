package zi;

import android.os.Build;
import kh2.j1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nm.q;
import nm.u;
import om.b;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0087\b\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\bR\u0014\u0010\u000f\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR\u0014\u0010\u0015\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\bR\u0014\u0010\u0019\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0004R\u0014\u0010\u001b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0004R\u0014\u0010\u001d\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0004R\u0014\u0010\u001f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0004R\u0014\u0010!\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b \u0010\bR\u0014\u0010#\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0004R\u0016\u0010%\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b$\u0010\bR\u0014\u0010'\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b&\u0010\bR\u0014\u0010)\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b(\u0010\bR\u0014\u0010+\u001a\u00020\u00068\u0006X\u0087D¢\u0006\u0006\n\u0004\b*\u0010\bR\u0014\u0010-\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b,\u0010\b¨\u0006."}, d2 = {"Lzi/a;", "", "Lnm/u;", "a", "Lnm/u;", "appInfo", "", "b", "Ljava/lang/String;", "sdkVersion", "c", "gesture", "", "d", "Z", "isGamRegisteredTestDevice", "e", "isSimulator", "Lnm/q;", "f", "Lnm/q;", "adapterData", "g", "networkExtras", "h", "serverData", "i", "cldData", "j", "uiStorage", "k", "userStorage", "l", "openAction", "m", "adSlotData", "n", "redirectUrl", "o", "internalSdkVersion", "p", "decagonVersion", "q", "platform", "r", "osVersion", "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @b("appInfo")
    @NotNull
    public final u appInfo;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @b("sdkVersion")
    @NotNull
    public final String sdkVersion;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @b("gesture")
    @NotNull
    public final String gesture;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @b("isGamRegisteredTestDevice")
    public final boolean isGamRegisteredTestDevice;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @b("isSimulator")
    public final boolean isSimulator;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @b("adapters")
    @NotNull
    public final q adapterData;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @b("networkExtras")
    @NotNull
    public final String networkExtras;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @b("serverData")
    @NotNull
    public final u serverData;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @b("cld")
    @NotNull
    public final u cldData;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @b("uiStorage")
    @NotNull
    public final u uiStorage;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    @b("userDisk")
    @NotNull
    public final u userStorage;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    @b("openAction")
    @NotNull
    public final String openAction;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    @b("adSlots")
    @NotNull
    public final u adSlotData;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    @b("redirectUrl")
    public final String redirectUrl;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    @b("internalSdkVersion")
    @NotNull
    public final String internalSdkVersion;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    @b("decagonVersion")
    @NotNull
    public final String decagonVersion;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    @b("platform")
    @NotNull
    public final String platform;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    @b("osVersion")
    @NotNull
    public final String osVersion;

    public a(u appInfo, String sdkVersion, String gesture, boolean z13, boolean z14, q adapterData, String networkExtras, u serverData, u cldData, u uiStorage, u userStorage, String openAction, u adSlotData, String str) {
        Intrinsics.checkNotNullParameter(appInfo, "appInfo");
        Intrinsics.checkNotNullParameter(sdkVersion, "sdkVersion");
        Intrinsics.checkNotNullParameter(gesture, "gesture");
        Intrinsics.checkNotNullParameter(adapterData, "adapterData");
        Intrinsics.checkNotNullParameter(networkExtras, "networkExtras");
        Intrinsics.checkNotNullParameter(serverData, "serverData");
        Intrinsics.checkNotNullParameter(cldData, "cldData");
        Intrinsics.checkNotNullParameter(uiStorage, "uiStorage");
        Intrinsics.checkNotNullParameter(userStorage, "userStorage");
        Intrinsics.checkNotNullParameter(openAction, "openAction");
        Intrinsics.checkNotNullParameter(adSlotData, "adSlotData");
        this.appInfo = appInfo;
        this.sdkVersion = sdkVersion;
        this.gesture = gesture;
        this.isGamRegisteredTestDevice = z13;
        this.isSimulator = z14;
        this.adapterData = adapterData;
        this.networkExtras = networkExtras;
        this.serverData = serverData;
        this.cldData = cldData;
        this.uiStorage = uiStorage;
        this.userStorage = userStorage;
        this.openAction = openAction;
        this.adSlotData = adSlotData;
        this.redirectUrl = str;
        this.internalSdkVersion = sdkVersion;
        this.decagonVersion = sdkVersion;
        this.platform = "ANDROID";
        String RELEASE = Build.VERSION.RELEASE;
        Intrinsics.checkNotNullExpressionValue(RELEASE, "RELEASE");
        this.osVersion = RELEASE;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.appInfo, aVar.appInfo) && Intrinsics.d(this.sdkVersion, aVar.sdkVersion) && Intrinsics.d(this.gesture, aVar.gesture) && this.isGamRegisteredTestDevice == aVar.isGamRegisteredTestDevice && this.isSimulator == aVar.isSimulator && Intrinsics.d(this.adapterData, aVar.adapterData) && Intrinsics.d(this.networkExtras, aVar.networkExtras) && Intrinsics.d(this.serverData, aVar.serverData) && Intrinsics.d(this.cldData, aVar.cldData) && Intrinsics.d(this.uiStorage, aVar.uiStorage) && Intrinsics.d(this.userStorage, aVar.userStorage) && Intrinsics.d(this.openAction, aVar.openAction) && Intrinsics.d(this.adSlotData, aVar.adSlotData) && Intrinsics.d(this.redirectUrl, aVar.redirectUrl);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int t13 = j1.t(j1.t(this.appInfo.f91366a.hashCode() * 31, this.sdkVersion), this.gesture);
        boolean z13 = this.isGamRegisteredTestDevice;
        int i13 = z13;
        if (z13 != 0) {
            i13 = 1;
        }
        int i14 = (t13 + i13) * 31;
        boolean z14 = this.isSimulator;
        int hashCode = (this.adSlotData.f91366a.hashCode() + j1.t((this.userStorage.f91366a.hashCode() + ((this.uiStorage.f91366a.hashCode() + ((this.cldData.f91366a.hashCode() + ((this.serverData.f91366a.hashCode() + j1.t((this.adapterData.f91364a.hashCode() + ((i14 + (z14 ? 1 : z14 ? 1 : 0)) * 31)) * 31, this.networkExtras)) * 31)) * 31)) * 31)) * 31, this.openAction)) * 31;
        String str = this.redirectUrl;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "InspectorData(appInfo=" + this.appInfo + ", sdkVersion=" + this.sdkVersion + ", gesture=" + this.gesture + ", isGamRegisteredTestDevice=" + this.isGamRegisteredTestDevice + ", isSimulator=" + this.isSimulator + ", adapterData=" + this.adapterData + ", networkExtras=" + this.networkExtras + ", serverData=" + this.serverData + ", cldData=" + this.cldData + ", uiStorage=" + this.uiStorage + ", userStorage=" + this.userStorage + ", openAction=" + this.openAction + ", adSlotData=" + this.adSlotData + ", redirectUrl=" + this.redirectUrl + ")";
    }
}
