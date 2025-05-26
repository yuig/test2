package io.embrace.android.embracesdk.internal.config.remote;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import oe2.p;
import oe2.s;
import org.jetbrains.annotations.NotNull;

@s(generateAdapter = true)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\n\u0010\u000bJ@\u0010\b\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lio/embrace/android/embracesdk/internal/config/remote/KillSwitchRemoteConfig;", "", "", "sigHandlerDetection", "jetpackCompose", "", "v2StoragePct", "useOkHttpPct", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Float;Ljava/lang/Float;)Lio/embrace/android/embracesdk/internal/config/remote/KillSwitchRemoteConfig;", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Float;Ljava/lang/Float;)V", "embrace-android-payload_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final /* data */ class KillSwitchRemoteConfig {

    /* renamed from: a, reason: collision with root package name */
    public final Boolean f73006a;

    /* renamed from: b, reason: collision with root package name */
    public final Boolean f73007b;

    /* renamed from: c, reason: collision with root package name */
    public final Float f73008c;

    /* renamed from: d, reason: collision with root package name */
    public final Float f73009d;

    public KillSwitchRemoteConfig(@p(name = "sig_handler_detection") Boolean bool, @p(name = "jetpack_compose") Boolean bool2, @p(name = "v2_storage") Float f13, @p(name = "use_okhttp") Float f14) {
        this.f73006a = bool;
        this.f73007b = bool2;
        this.f73008c = f13;
        this.f73009d = f14;
    }

    @NotNull
    public final KillSwitchRemoteConfig copy(@p(name = "sig_handler_detection") Boolean sigHandlerDetection, @p(name = "jetpack_compose") Boolean jetpackCompose, @p(name = "v2_storage") Float v2StoragePct, @p(name = "use_okhttp") Float useOkHttpPct) {
        return new KillSwitchRemoteConfig(sigHandlerDetection, jetpackCompose, v2StoragePct, useOkHttpPct);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KillSwitchRemoteConfig)) {
            return false;
        }
        KillSwitchRemoteConfig killSwitchRemoteConfig = (KillSwitchRemoteConfig) obj;
        return Intrinsics.d(this.f73006a, killSwitchRemoteConfig.f73006a) && Intrinsics.d(this.f73007b, killSwitchRemoteConfig.f73007b) && Intrinsics.d(this.f73008c, killSwitchRemoteConfig.f73008c) && Intrinsics.d(this.f73009d, killSwitchRemoteConfig.f73009d);
    }

    public final int hashCode() {
        Boolean bool = this.f73006a;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.f73007b;
        int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Float f13 = this.f73008c;
        int hashCode3 = (hashCode2 + (f13 == null ? 0 : f13.hashCode())) * 31;
        Float f14 = this.f73009d;
        return hashCode3 + (f14 != null ? f14.hashCode() : 0);
    }

    public final String toString() {
        return "KillSwitchRemoteConfig(sigHandlerDetection=" + this.f73006a + ", jetpackCompose=" + this.f73007b + ", v2StoragePct=" + this.f73008c + ", useOkHttpPct=" + this.f73009d + ')';
    }

    public /* synthetic */ KillSwitchRemoteConfig(Boolean bool, Boolean bool2, Float f13, Float f14, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : bool, (i13 & 2) != 0 ? null : bool2, (i13 & 4) != 0 ? null : f13, (i13 & 8) != 0 ? null : f14);
    }
}
