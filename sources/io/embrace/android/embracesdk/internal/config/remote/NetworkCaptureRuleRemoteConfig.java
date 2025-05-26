package io.embrace.android.embracesdk.internal.config.remote;

import a.a;
import a.cb;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import ep.b;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.s0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import oe2.p;
import oe2.s;
import org.jetbrains.annotations.NotNull;

@s(generateAdapter = true)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\"\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0003\u0010\b\u001a\u00020\u0004\u0012\b\b\u0003\u0010\t\u001a\u00020\u0004\u0012\b\b\u0003\u0010\u000b\u001a\u00020\n\u0012\u000e\b\u0003\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\f¢\u0006\u0004\b\u0010\u0010\u0011Jh\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0003\u0010\u0006\u001a\u00020\u00022\b\b\u0003\u0010\u0007\u001a\u00020\u00022\b\b\u0003\u0010\b\u001a\u00020\u00042\b\b\u0003\u0010\t\u001a\u00020\u00042\b\b\u0003\u0010\u000b\u001a\u00020\n2\u000e\b\u0003\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\fHÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lio/embrace/android/embracesdk/internal/config/remote/NetworkCaptureRuleRemoteConfig;", "", "", "id", "", "duration", "method", "urlRegex", "expiresIn", "maxSize", "", "maxCount", "", "statusCodes", "copy", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;JJILjava/util/Set;)Lio/embrace/android/embracesdk/internal/config/remote/NetworkCaptureRuleRemoteConfig;", "<init>", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;JJILjava/util/Set;)V", "embrace-android-payload_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final /* data */ class NetworkCaptureRuleRemoteConfig {

    /* renamed from: a, reason: collision with root package name */
    public final String f73021a;

    /* renamed from: b, reason: collision with root package name */
    public final Long f73022b;

    /* renamed from: c, reason: collision with root package name */
    public final String f73023c;

    /* renamed from: d, reason: collision with root package name */
    public final String f73024d;

    /* renamed from: e, reason: collision with root package name */
    public final long f73025e;

    /* renamed from: f, reason: collision with root package name */
    public final long f73026f;

    /* renamed from: g, reason: collision with root package name */
    public final int f73027g;

    /* renamed from: h, reason: collision with root package name */
    public final Set f73028h;

    public NetworkCaptureRuleRemoteConfig(@p(name = "id") @NotNull String id3, @p(name = "duration") Long l13, @p(name = "method") @NotNull String method, @p(name = "url") @NotNull String urlRegex, @p(name = "expires_in") long j13, @p(name = "max_size") long j14, @p(name = "max_count") int i13, @p(name = "status_codes") @NotNull Set<Integer> statusCodes) {
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(urlRegex, "urlRegex");
        Intrinsics.checkNotNullParameter(statusCodes, "statusCodes");
        this.f73021a = id3;
        this.f73022b = l13;
        this.f73023c = method;
        this.f73024d = urlRegex;
        this.f73025e = j13;
        this.f73026f = j14;
        this.f73027g = i13;
        this.f73028h = statusCodes;
    }

    @NotNull
    public final NetworkCaptureRuleRemoteConfig copy(@p(name = "id") @NotNull String id3, @p(name = "duration") Long duration, @p(name = "method") @NotNull String method, @p(name = "url") @NotNull String urlRegex, @p(name = "expires_in") long expiresIn, @p(name = "max_size") long maxSize, @p(name = "max_count") int maxCount, @p(name = "status_codes") @NotNull Set<Integer> statusCodes) {
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(urlRegex, "urlRegex");
        Intrinsics.checkNotNullParameter(statusCodes, "statusCodes");
        return new NetworkCaptureRuleRemoteConfig(id3, duration, method, urlRegex, expiresIn, maxSize, maxCount, statusCodes);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NetworkCaptureRuleRemoteConfig)) {
            return false;
        }
        NetworkCaptureRuleRemoteConfig networkCaptureRuleRemoteConfig = (NetworkCaptureRuleRemoteConfig) obj;
        return Intrinsics.d(this.f73021a, networkCaptureRuleRemoteConfig.f73021a) && Intrinsics.d(this.f73022b, networkCaptureRuleRemoteConfig.f73022b) && Intrinsics.d(this.f73023c, networkCaptureRuleRemoteConfig.f73023c) && Intrinsics.d(this.f73024d, networkCaptureRuleRemoteConfig.f73024d) && this.f73025e == networkCaptureRuleRemoteConfig.f73025e && this.f73026f == networkCaptureRuleRemoteConfig.f73026f && this.f73027g == networkCaptureRuleRemoteConfig.f73027g && Intrinsics.d(this.f73028h, networkCaptureRuleRemoteConfig.f73028h);
    }

    public final int hashCode() {
        int hashCode = this.f73021a.hashCode() * 31;
        Long l13 = this.f73022b;
        return this.f73028h.hashCode() + b.b(this.f73027g, a.c(this.f73026f, a.c(this.f73025e, cb.d(this.f73024d, cb.d(this.f73023c, (hashCode + (l13 == null ? 0 : l13.hashCode())) * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        return "NetworkCaptureRuleRemoteConfig(id=" + this.f73021a + ", duration=" + this.f73022b + ", method=" + this.f73023c + ", urlRegex=" + this.f73024d + ", expiresIn=" + this.f73025e + ", maxSize=" + this.f73026f + ", maxCount=" + this.f73027g + ", statusCodes=" + this.f73028h + ')';
    }

    public NetworkCaptureRuleRemoteConfig(String str, Long l13, String str2, String str3, long j13, long j14, int i13, Set set, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, l13, str2, str3, (i14 & 16) != 0 ? 0L : j13, (i14 & 32) != 0 ? 102400L : j14, (i14 & 64) != 0 ? 5 : i13, (i14 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? s0.f80394a : set);
    }
}
