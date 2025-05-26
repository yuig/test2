package io.embrace.android.embracesdk.internal.config.remote;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.quikkly.android.utils.BitmapUtils;
import oe2.p;
import oe2.s;
import org.jetbrains.annotations.NotNull;

@s(generateAdapter = true)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B©\u0001\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u000f\u0012\u0010\b\u0003\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012\u0012\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0018\u0010\u0019J²\u0001\u0010\u0016\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\u0010\b\u0003\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00122\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lio/embrace/android/embracesdk/internal/config/remote/AnrRemoteConfig;", "", "", "pctEnabled", "", "sampleIntervalMs", "maxStacktracesPerInterval", "stacktraceFrameLimit", "anrPerSession", "minDuration", "nativeThreadAnrSamplingFactor", "", "nativeThreadAnrSamplingUnwinder", "", "pctNativeThreadAnrSamplingEnabled", "", "nativeThreadAnrSamplingOffsetEnabled", "ignoreNativeThreadAnrSamplingAllowlist", "", "Lio/embrace/android/embracesdk/internal/config/remote/AllowedNdkSampleMethod;", "nativeThreadAnrSamplingAllowlist", "monitorThreadPriority", "copy", "(Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/Integer;)Lio/embrace/android/embracesdk/internal/config/remote/AnrRemoteConfig;", "<init>", "(Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/Integer;)V", "embrace-android-payload_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final /* data */ class AnrRemoteConfig {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f72970a;

    /* renamed from: b, reason: collision with root package name */
    public final Long f72971b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f72972c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f72973d;

    /* renamed from: e, reason: collision with root package name */
    public final Integer f72974e;

    /* renamed from: f, reason: collision with root package name */
    public final Integer f72975f;

    /* renamed from: g, reason: collision with root package name */
    public final Integer f72976g;

    /* renamed from: h, reason: collision with root package name */
    public final String f72977h;

    /* renamed from: i, reason: collision with root package name */
    public final Float f72978i;

    /* renamed from: j, reason: collision with root package name */
    public final Boolean f72979j;

    /* renamed from: k, reason: collision with root package name */
    public final Boolean f72980k;

    /* renamed from: l, reason: collision with root package name */
    public final List f72981l;

    /* renamed from: m, reason: collision with root package name */
    public final Integer f72982m;

    public AnrRemoteConfig(@p(name = "pct_enabled") Integer num, @p(name = "interval") Long l13, @p(name = "per_interval") Integer num2, @p(name = "max_depth") Integer num3, @p(name = "per_session") Integer num4, @p(name = "min_duration") Integer num5, @p(name = "unity_ndk_sampling_factor") Integer num6, @p(name = "unity_ndk_sampling_unwinder") String str, @p(name = "pct_unity_thread_capture_enabled") Float f13, @p(name = "ndk_sampling_offset_enabled") Boolean bool, @p(name = "ignore_unity_ndk_sampling_allowlist") Boolean bool2, @p(name = "unity_ndk_sampling_allowlist") List<AllowedNdkSampleMethod> list, @p(name = "monitor_thread_priority") Integer num7) {
        this.f72970a = num;
        this.f72971b = l13;
        this.f72972c = num2;
        this.f72973d = num3;
        this.f72974e = num4;
        this.f72975f = num5;
        this.f72976g = num6;
        this.f72977h = str;
        this.f72978i = f13;
        this.f72979j = bool;
        this.f72980k = bool2;
        this.f72981l = list;
        this.f72982m = num7;
    }

    @NotNull
    public final AnrRemoteConfig copy(@p(name = "pct_enabled") Integer pctEnabled, @p(name = "interval") Long sampleIntervalMs, @p(name = "per_interval") Integer maxStacktracesPerInterval, @p(name = "max_depth") Integer stacktraceFrameLimit, @p(name = "per_session") Integer anrPerSession, @p(name = "min_duration") Integer minDuration, @p(name = "unity_ndk_sampling_factor") Integer nativeThreadAnrSamplingFactor, @p(name = "unity_ndk_sampling_unwinder") String nativeThreadAnrSamplingUnwinder, @p(name = "pct_unity_thread_capture_enabled") Float pctNativeThreadAnrSamplingEnabled, @p(name = "ndk_sampling_offset_enabled") Boolean nativeThreadAnrSamplingOffsetEnabled, @p(name = "ignore_unity_ndk_sampling_allowlist") Boolean ignoreNativeThreadAnrSamplingAllowlist, @p(name = "unity_ndk_sampling_allowlist") List<AllowedNdkSampleMethod> nativeThreadAnrSamplingAllowlist, @p(name = "monitor_thread_priority") Integer monitorThreadPriority) {
        return new AnrRemoteConfig(pctEnabled, sampleIntervalMs, maxStacktracesPerInterval, stacktraceFrameLimit, anrPerSession, minDuration, nativeThreadAnrSamplingFactor, nativeThreadAnrSamplingUnwinder, pctNativeThreadAnrSamplingEnabled, nativeThreadAnrSamplingOffsetEnabled, ignoreNativeThreadAnrSamplingAllowlist, nativeThreadAnrSamplingAllowlist, monitorThreadPriority);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnrRemoteConfig)) {
            return false;
        }
        AnrRemoteConfig anrRemoteConfig = (AnrRemoteConfig) obj;
        return Intrinsics.d(this.f72970a, anrRemoteConfig.f72970a) && Intrinsics.d(this.f72971b, anrRemoteConfig.f72971b) && Intrinsics.d(this.f72972c, anrRemoteConfig.f72972c) && Intrinsics.d(this.f72973d, anrRemoteConfig.f72973d) && Intrinsics.d(this.f72974e, anrRemoteConfig.f72974e) && Intrinsics.d(this.f72975f, anrRemoteConfig.f72975f) && Intrinsics.d(this.f72976g, anrRemoteConfig.f72976g) && Intrinsics.d(this.f72977h, anrRemoteConfig.f72977h) && Intrinsics.d(this.f72978i, anrRemoteConfig.f72978i) && Intrinsics.d(this.f72979j, anrRemoteConfig.f72979j) && Intrinsics.d(this.f72980k, anrRemoteConfig.f72980k) && Intrinsics.d(this.f72981l, anrRemoteConfig.f72981l) && Intrinsics.d(this.f72982m, anrRemoteConfig.f72982m);
    }

    public final int hashCode() {
        Integer num = this.f72970a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Long l13 = this.f72971b;
        int hashCode2 = (hashCode + (l13 == null ? 0 : l13.hashCode())) * 31;
        Integer num2 = this.f72972c;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f72973d;
        int hashCode4 = (hashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f72974e;
        int hashCode5 = (hashCode4 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.f72975f;
        int hashCode6 = (hashCode5 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.f72976g;
        int hashCode7 = (hashCode6 + (num6 == null ? 0 : num6.hashCode())) * 31;
        String str = this.f72977h;
        int hashCode8 = (hashCode7 + (str == null ? 0 : str.hashCode())) * 31;
        Float f13 = this.f72978i;
        int hashCode9 = (hashCode8 + (f13 == null ? 0 : f13.hashCode())) * 31;
        Boolean bool = this.f72979j;
        int hashCode10 = (hashCode9 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f72980k;
        int hashCode11 = (hashCode10 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        List list = this.f72981l;
        int hashCode12 = (hashCode11 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num7 = this.f72982m;
        return hashCode12 + (num7 != null ? num7.hashCode() : 0);
    }

    public final String toString() {
        return "AnrRemoteConfig(pctEnabled=" + this.f72970a + ", sampleIntervalMs=" + this.f72971b + ", maxStacktracesPerInterval=" + this.f72972c + ", stacktraceFrameLimit=" + this.f72973d + ", anrPerSession=" + this.f72974e + ", minDuration=" + this.f72975f + ", nativeThreadAnrSamplingFactor=" + this.f72976g + ", nativeThreadAnrSamplingUnwinder=" + this.f72977h + ", pctNativeThreadAnrSamplingEnabled=" + this.f72978i + ", nativeThreadAnrSamplingOffsetEnabled=" + this.f72979j + ", ignoreNativeThreadAnrSamplingAllowlist=" + this.f72980k + ", nativeThreadAnrSamplingAllowlist=" + this.f72981l + ", monitorThreadPriority=" + this.f72982m + ')';
    }

    public /* synthetic */ AnrRemoteConfig(Integer num, Long l13, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, String str, Float f13, Boolean bool, Boolean bool2, List list, Integer num7, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : num, (i13 & 2) != 0 ? null : l13, (i13 & 4) != 0 ? null : num2, (i13 & 8) != 0 ? null : num3, (i13 & 16) != 0 ? null : num4, (i13 & 32) != 0 ? null : num5, (i13 & 64) != 0 ? null : num6, (i13 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? null : str, (i13 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? null : f13, (i13 & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 0 ? null : bool, (i13 & 1024) != 0 ? null : bool2, (i13 & 2048) != 0 ? null : list, (i13 & 4096) == 0 ? num7 : null);
    }
}
