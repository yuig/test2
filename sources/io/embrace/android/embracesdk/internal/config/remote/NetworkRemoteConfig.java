package io.embrace.android.embracesdk.internal.config.remote;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import oe2.p;
import oe2.s;
import org.jetbrains.annotations.NotNull;

@s(generateAdapter = true)
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0016\b\u0003\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\nJ4\u0010\u0007\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0016\b\u0003\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lio/embrace/android/embracesdk/internal/config/remote/NetworkRemoteConfig;", "", "", "defaultCaptureLimit", "", "", "domainLimits", "copy", "(Ljava/lang/Integer;Ljava/util/Map;)Lio/embrace/android/embracesdk/internal/config/remote/NetworkRemoteConfig;", "<init>", "(Ljava/lang/Integer;Ljava/util/Map;)V", "embrace-android-payload_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final /* data */ class NetworkRemoteConfig {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f73036a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f73037b;

    public NetworkRemoteConfig(Integer num, @p(name = "domains") Map<String, Integer> map) {
        this.f73036a = num;
        this.f73037b = map;
    }

    @NotNull
    public final NetworkRemoteConfig copy(Integer defaultCaptureLimit, @p(name = "domains") Map<String, Integer> domainLimits) {
        return new NetworkRemoteConfig(defaultCaptureLimit, domainLimits);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NetworkRemoteConfig)) {
            return false;
        }
        NetworkRemoteConfig networkRemoteConfig = (NetworkRemoteConfig) obj;
        return Intrinsics.d(this.f73036a, networkRemoteConfig.f73036a) && Intrinsics.d(this.f73037b, networkRemoteConfig.f73037b);
    }

    public final int hashCode() {
        Integer num = this.f73036a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Map map = this.f73037b;
        return hashCode + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        return "NetworkRemoteConfig(defaultCaptureLimit=" + this.f73036a + ", domainLimits=" + this.f73037b + ')';
    }

    public /* synthetic */ NetworkRemoteConfig(Integer num, Map map, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : num, (i13 & 2) != 0 ? null : map);
    }
}
