package io.embrace.android.embracesdk.internal.config.remote;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import oe2.p;
import oe2.s;
import org.jetbrains.annotations.NotNull;

@s(generateAdapter = true)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\u0004\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lio/embrace/android/embracesdk/internal/config/remote/DataRemoteConfig;", "", "", "pctThermalStatusEnabled", "copy", "(Ljava/lang/Float;)Lio/embrace/android/embracesdk/internal/config/remote/DataRemoteConfig;", "<init>", "(Ljava/lang/Float;)V", "embrace-android-payload_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final /* data */ class DataRemoteConfig {

    /* renamed from: a, reason: collision with root package name */
    public final Float f73002a;

    public DataRemoteConfig(@p(name = "pct_thermal_status_enabled") Float f13) {
        this.f73002a = f13;
    }

    @NotNull
    public final DataRemoteConfig copy(@p(name = "pct_thermal_status_enabled") Float pctThermalStatusEnabled) {
        return new DataRemoteConfig(pctThermalStatusEnabled);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DataRemoteConfig) && Intrinsics.d(this.f73002a, ((DataRemoteConfig) obj).f73002a);
    }

    public final int hashCode() {
        Float f13 = this.f73002a;
        if (f13 == null) {
            return 0;
        }
        return f13.hashCode();
    }

    public final String toString() {
        return "DataRemoteConfig(pctThermalStatusEnabled=" + this.f73002a + ')';
    }

    public /* synthetic */ DataRemoteConfig(Float f13, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : f13);
    }
}
