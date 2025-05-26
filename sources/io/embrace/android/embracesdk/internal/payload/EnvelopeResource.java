package io.embrace.android.embracesdk.internal.payload;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.quikkly.android.utils.BitmapUtils;
import oe2.p;
import oe2.s;
import org.jetbrains.annotations.NotNull;
import th2.g;

@s(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001BË\u0002\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0003\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0003\u0010\u001c\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u001d\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u001e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u001f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010 \u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010!\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b$\u0010%JÔ\u0002\u0010\"\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010\u00182\n\b\u0003\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\b\u0003\u0010\u001c\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u001d\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u001e\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u001f\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010 \u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010!\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b\"\u0010#¨\u0006&"}, d2 = {"Lio/embrace/android/embracesdk/internal/payload/EnvelopeResource;", "", "", "appVersion", "Lth2/g;", "appFramework", "buildId", "appEcosystemId", "buildType", "buildFlavor", "environment", "bundleVersion", "sdkVersion", "", "sdkSimpleVersion", "reactNativeBundleId", "reactNativeVersion", "javascriptPatchNumber", "hostedPlatformVersion", "hostedSdkVersion", "unityBuildId", "deviceManufacturer", "deviceModel", "deviceArchitecture", "", "jailbroken", "", "diskTotalCapacity", "osType", "osName", "osVersion", "osCode", "screenResolution", "numCores", "copy", "(Ljava/lang/String;Lth2/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lio/embrace/android/embracesdk/internal/payload/EnvelopeResource;", "<init>", "(Ljava/lang/String;Lth2/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "embrace-android-payload_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final /* data */ class EnvelopeResource {
    public final Integer A;

    /* renamed from: a, reason: collision with root package name */
    public final String f73129a;

    /* renamed from: b, reason: collision with root package name */
    public final g f73130b;

    /* renamed from: c, reason: collision with root package name */
    public final String f73131c;

    /* renamed from: d, reason: collision with root package name */
    public final String f73132d;

    /* renamed from: e, reason: collision with root package name */
    public final String f73133e;

    /* renamed from: f, reason: collision with root package name */
    public final String f73134f;

    /* renamed from: g, reason: collision with root package name */
    public final String f73135g;

    /* renamed from: h, reason: collision with root package name */
    public final String f73136h;

    /* renamed from: i, reason: collision with root package name */
    public final String f73137i;

    /* renamed from: j, reason: collision with root package name */
    public final Integer f73138j;

    /* renamed from: k, reason: collision with root package name */
    public final String f73139k;

    /* renamed from: l, reason: collision with root package name */
    public final String f73140l;

    /* renamed from: m, reason: collision with root package name */
    public final String f73141m;

    /* renamed from: n, reason: collision with root package name */
    public final String f73142n;

    /* renamed from: o, reason: collision with root package name */
    public final String f73143o;

    /* renamed from: p, reason: collision with root package name */
    public final String f73144p;

    /* renamed from: q, reason: collision with root package name */
    public final String f73145q;

    /* renamed from: r, reason: collision with root package name */
    public final String f73146r;

    /* renamed from: s, reason: collision with root package name */
    public final String f73147s;

    /* renamed from: t, reason: collision with root package name */
    public final Boolean f73148t;

    /* renamed from: u, reason: collision with root package name */
    public final Long f73149u;

    /* renamed from: v, reason: collision with root package name */
    public final String f73150v;

    /* renamed from: w, reason: collision with root package name */
    public final String f73151w;

    /* renamed from: x, reason: collision with root package name */
    public final String f73152x;

    /* renamed from: y, reason: collision with root package name */
    public final String f73153y;

    /* renamed from: z, reason: collision with root package name */
    public final String f73154z;

    public EnvelopeResource(@p(name = "app_version") String str, @p(name = "app_framework") g gVar, @p(name = "build_id") String str2, @p(name = "app_ecosystem_id") String str3, @p(name = "build_type") String str4, @p(name = "build_flavor") String str5, @p(name = "environment") String str6, @p(name = "bundle_version") String str7, @p(name = "sdk_version") String str8, @p(name = "sdk_simple_version") Integer num, @p(name = "react_native_bundle_id") String str9, @p(name = "react_native_version") String str10, @p(name = "javascript_patch_number") String str11, @p(name = "hosted_platform_version") String str12, @p(name = "hosted_sdk_version") String str13, @p(name = "unity_build_id") String str14, @p(name = "device_manufacturer") String str15, @p(name = "device_model") String str16, @p(name = "device_architecture") String str17, @p(name = "jailbroken") Boolean bool, @p(name = "disk_total_capacity") Long l13, @p(name = "os_type") String str18, @p(name = "os_name") String str19, @p(name = "os_version") String str20, @p(name = "os_code") String str21, @p(name = "screen_resolution") String str22, @p(name = "num_cores") Integer num2) {
        this.f73129a = str;
        this.f73130b = gVar;
        this.f73131c = str2;
        this.f73132d = str3;
        this.f73133e = str4;
        this.f73134f = str5;
        this.f73135g = str6;
        this.f73136h = str7;
        this.f73137i = str8;
        this.f73138j = num;
        this.f73139k = str9;
        this.f73140l = str10;
        this.f73141m = str11;
        this.f73142n = str12;
        this.f73143o = str13;
        this.f73144p = str14;
        this.f73145q = str15;
        this.f73146r = str16;
        this.f73147s = str17;
        this.f73148t = bool;
        this.f73149u = l13;
        this.f73150v = str18;
        this.f73151w = str19;
        this.f73152x = str20;
        this.f73153y = str21;
        this.f73154z = str22;
        this.A = num2;
    }

    @NotNull
    public final EnvelopeResource copy(@p(name = "app_version") String appVersion, @p(name = "app_framework") g appFramework, @p(name = "build_id") String buildId, @p(name = "app_ecosystem_id") String appEcosystemId, @p(name = "build_type") String buildType, @p(name = "build_flavor") String buildFlavor, @p(name = "environment") String environment, @p(name = "bundle_version") String bundleVersion, @p(name = "sdk_version") String sdkVersion, @p(name = "sdk_simple_version") Integer sdkSimpleVersion, @p(name = "react_native_bundle_id") String reactNativeBundleId, @p(name = "react_native_version") String reactNativeVersion, @p(name = "javascript_patch_number") String javascriptPatchNumber, @p(name = "hosted_platform_version") String hostedPlatformVersion, @p(name = "hosted_sdk_version") String hostedSdkVersion, @p(name = "unity_build_id") String unityBuildId, @p(name = "device_manufacturer") String deviceManufacturer, @p(name = "device_model") String deviceModel, @p(name = "device_architecture") String deviceArchitecture, @p(name = "jailbroken") Boolean jailbroken, @p(name = "disk_total_capacity") Long diskTotalCapacity, @p(name = "os_type") String osType, @p(name = "os_name") String osName, @p(name = "os_version") String osVersion, @p(name = "os_code") String osCode, @p(name = "screen_resolution") String screenResolution, @p(name = "num_cores") Integer numCores) {
        return new EnvelopeResource(appVersion, appFramework, buildId, appEcosystemId, buildType, buildFlavor, environment, bundleVersion, sdkVersion, sdkSimpleVersion, reactNativeBundleId, reactNativeVersion, javascriptPatchNumber, hostedPlatformVersion, hostedSdkVersion, unityBuildId, deviceManufacturer, deviceModel, deviceArchitecture, jailbroken, diskTotalCapacity, osType, osName, osVersion, osCode, screenResolution, numCores);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EnvelopeResource)) {
            return false;
        }
        EnvelopeResource envelopeResource = (EnvelopeResource) obj;
        return Intrinsics.d(this.f73129a, envelopeResource.f73129a) && this.f73130b == envelopeResource.f73130b && Intrinsics.d(this.f73131c, envelopeResource.f73131c) && Intrinsics.d(this.f73132d, envelopeResource.f73132d) && Intrinsics.d(this.f73133e, envelopeResource.f73133e) && Intrinsics.d(this.f73134f, envelopeResource.f73134f) && Intrinsics.d(this.f73135g, envelopeResource.f73135g) && Intrinsics.d(this.f73136h, envelopeResource.f73136h) && Intrinsics.d(this.f73137i, envelopeResource.f73137i) && Intrinsics.d(this.f73138j, envelopeResource.f73138j) && Intrinsics.d(this.f73139k, envelopeResource.f73139k) && Intrinsics.d(this.f73140l, envelopeResource.f73140l) && Intrinsics.d(this.f73141m, envelopeResource.f73141m) && Intrinsics.d(this.f73142n, envelopeResource.f73142n) && Intrinsics.d(this.f73143o, envelopeResource.f73143o) && Intrinsics.d(this.f73144p, envelopeResource.f73144p) && Intrinsics.d(this.f73145q, envelopeResource.f73145q) && Intrinsics.d(this.f73146r, envelopeResource.f73146r) && Intrinsics.d(this.f73147s, envelopeResource.f73147s) && Intrinsics.d(this.f73148t, envelopeResource.f73148t) && Intrinsics.d(this.f73149u, envelopeResource.f73149u) && Intrinsics.d(this.f73150v, envelopeResource.f73150v) && Intrinsics.d(this.f73151w, envelopeResource.f73151w) && Intrinsics.d(this.f73152x, envelopeResource.f73152x) && Intrinsics.d(this.f73153y, envelopeResource.f73153y) && Intrinsics.d(this.f73154z, envelopeResource.f73154z) && Intrinsics.d(this.A, envelopeResource.A);
    }

    public final int hashCode() {
        String str = this.f73129a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        g gVar = this.f73130b;
        int hashCode2 = (hashCode + (gVar == null ? 0 : gVar.hashCode())) * 31;
        String str2 = this.f73131c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f73132d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f73133e;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f73134f;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f73135g;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f73136h;
        int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f73137i;
        int hashCode9 = (hashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Integer num = this.f73138j;
        int hashCode10 = (hashCode9 + (num == null ? 0 : num.hashCode())) * 31;
        String str9 = this.f73139k;
        int hashCode11 = (hashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.f73140l;
        int hashCode12 = (hashCode11 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.f73141m;
        int hashCode13 = (hashCode12 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.f73142n;
        int hashCode14 = (hashCode13 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.f73143o;
        int hashCode15 = (hashCode14 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.f73144p;
        int hashCode16 = (hashCode15 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.f73145q;
        int hashCode17 = (hashCode16 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.f73146r;
        int hashCode18 = (hashCode17 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.f73147s;
        int hashCode19 = (hashCode18 + (str17 == null ? 0 : str17.hashCode())) * 31;
        Boolean bool = this.f73148t;
        int hashCode20 = (hashCode19 + (bool == null ? 0 : bool.hashCode())) * 31;
        Long l13 = this.f73149u;
        int hashCode21 = (hashCode20 + (l13 == null ? 0 : l13.hashCode())) * 31;
        String str18 = this.f73150v;
        int hashCode22 = (hashCode21 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.f73151w;
        int hashCode23 = (hashCode22 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.f73152x;
        int hashCode24 = (hashCode23 + (str20 == null ? 0 : str20.hashCode())) * 31;
        String str21 = this.f73153y;
        int hashCode25 = (hashCode24 + (str21 == null ? 0 : str21.hashCode())) * 31;
        String str22 = this.f73154z;
        int hashCode26 = (hashCode25 + (str22 == null ? 0 : str22.hashCode())) * 31;
        Integer num2 = this.A;
        return hashCode26 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        return "EnvelopeResource(appVersion=" + this.f73129a + ", appFramework=" + this.f73130b + ", buildId=" + this.f73131c + ", appEcosystemId=" + this.f73132d + ", buildType=" + this.f73133e + ", buildFlavor=" + this.f73134f + ", environment=" + this.f73135g + ", bundleVersion=" + this.f73136h + ", sdkVersion=" + this.f73137i + ", sdkSimpleVersion=" + this.f73138j + ", reactNativeBundleId=" + this.f73139k + ", reactNativeVersion=" + this.f73140l + ", javascriptPatchNumber=" + this.f73141m + ", hostedPlatformVersion=" + this.f73142n + ", hostedSdkVersion=" + this.f73143o + ", unityBuildId=" + this.f73144p + ", deviceManufacturer=" + this.f73145q + ", deviceModel=" + this.f73146r + ", deviceArchitecture=" + this.f73147s + ", jailbroken=" + this.f73148t + ", diskTotalCapacity=" + this.f73149u + ", osType=" + this.f73150v + ", osName=" + this.f73151w + ", osVersion=" + this.f73152x + ", osCode=" + this.f73153y + ", screenResolution=" + this.f73154z + ", numCores=" + this.A + ')';
    }

    public /* synthetic */ EnvelopeResource(String str, g gVar, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Integer num, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, Boolean bool, Long l13, String str18, String str19, String str20, String str21, String str22, Integer num2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? null : gVar, (i13 & 4) != 0 ? null : str2, (i13 & 8) != 0 ? null : str3, (i13 & 16) != 0 ? null : str4, (i13 & 32) != 0 ? null : str5, (i13 & 64) != 0 ? null : str6, (i13 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? null : str7, (i13 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? null : str8, (i13 & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 0 ? null : num, (i13 & 1024) != 0 ? null : str9, (i13 & 2048) != 0 ? null : str10, (i13 & 4096) != 0 ? null : str11, (i13 & 8192) != 0 ? null : str12, (i13 & 16384) != 0 ? null : str13, (i13 & 32768) != 0 ? null : str14, (i13 & 65536) != 0 ? null : str15, (i13 & 131072) != 0 ? null : str16, (i13 & 262144) != 0 ? null : str17, (i13 & 524288) != 0 ? null : bool, (i13 & 1048576) != 0 ? null : l13, (i13 & 2097152) != 0 ? null : str18, (i13 & 4194304) != 0 ? null : str19, (i13 & 8388608) != 0 ? null : str20, (i13 & 16777216) != 0 ? null : str21, (i13 & 33554432) != 0 ? null : str22, (i13 & 67108864) != 0 ? null : num2);
    }
}
