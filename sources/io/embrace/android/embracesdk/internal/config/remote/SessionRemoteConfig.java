package io.embrace.android.embracesdk.internal.config.remote;

import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import oe2.p;
import oe2.s;
import org.jetbrains.annotations.NotNull;

@s(generateAdapter = true)
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0003\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0010\b\u0003\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\n\u0010\u000bJ@\u0010\b\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0010\b\u0003\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0010\b\u0003\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lio/embrace/android/embracesdk/internal/config/remote/SessionRemoteConfig;", "", "", "isEnabled", "", "", "sessionComponents", "fullSessionEvents", "copy", "(Ljava/lang/Boolean;Ljava/util/Set;Ljava/util/Set;)Lio/embrace/android/embracesdk/internal/config/remote/SessionRemoteConfig;", "<init>", "(Ljava/lang/Boolean;Ljava/util/Set;Ljava/util/Set;)V", "embrace-android-payload_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final /* data */ class SessionRemoteConfig {

    /* renamed from: a, reason: collision with root package name */
    public final Boolean f73081a;

    /* renamed from: b, reason: collision with root package name */
    public final Set f73082b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f73083c;

    public SessionRemoteConfig(@p(name = "enable") Boolean bool, @p(name = "components") Set<String> set, @p(name = "send_full_for") Set<String> set2) {
        this.f73081a = bool;
        this.f73082b = set;
        this.f73083c = set2;
    }

    @NotNull
    public final SessionRemoteConfig copy(@p(name = "enable") Boolean isEnabled, @p(name = "components") Set<String> sessionComponents, @p(name = "send_full_for") Set<String> fullSessionEvents) {
        return new SessionRemoteConfig(isEnabled, sessionComponents, fullSessionEvents);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SessionRemoteConfig)) {
            return false;
        }
        SessionRemoteConfig sessionRemoteConfig = (SessionRemoteConfig) obj;
        return Intrinsics.d(this.f73081a, sessionRemoteConfig.f73081a) && Intrinsics.d(this.f73082b, sessionRemoteConfig.f73082b) && Intrinsics.d(this.f73083c, sessionRemoteConfig.f73083c);
    }

    public final int hashCode() {
        Boolean bool = this.f73081a;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Set set = this.f73082b;
        int hashCode2 = (hashCode + (set == null ? 0 : set.hashCode())) * 31;
        Set set2 = this.f73083c;
        return hashCode2 + (set2 != null ? set2.hashCode() : 0);
    }

    public final String toString() {
        return "SessionRemoteConfig(isEnabled=" + this.f73081a + ", sessionComponents=" + this.f73082b + ", fullSessionEvents=" + this.f73083c + ')';
    }

    public /* synthetic */ SessionRemoteConfig(Boolean bool, Set set, Set set2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : bool, (i13 & 2) != 0 ? null : set, (i13 & 4) != 0 ? null : set2);
    }
}
