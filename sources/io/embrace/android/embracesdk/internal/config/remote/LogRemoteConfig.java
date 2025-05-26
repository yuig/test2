package io.embrace.android.embracesdk.internal.config.remote;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import oe2.p;
import oe2.s;
import org.jetbrains.annotations.NotNull;

@s(generateAdapter = true)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ@\u0010\u0007\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lio/embrace/android/embracesdk/internal/config/remote/LogRemoteConfig;", "", "", "logMessageMaximumAllowedLength", "logInfoLimit", "logWarnLimit", "logErrorLimit", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lio/embrace/android/embracesdk/internal/config/remote/LogRemoteConfig;", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "embrace-android-payload_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final /* data */ class LogRemoteConfig {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f73014a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f73015b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f73016c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f73017d;

    public LogRemoteConfig(@p(name = "max_length") Integer num, @p(name = "info_limit") Integer num2, @p(name = "warn_limit") Integer num3, @p(name = "error_limit") Integer num4) {
        this.f73014a = num;
        this.f73015b = num2;
        this.f73016c = num3;
        this.f73017d = num4;
    }

    @NotNull
    public final LogRemoteConfig copy(@p(name = "max_length") Integer logMessageMaximumAllowedLength, @p(name = "info_limit") Integer logInfoLimit, @p(name = "warn_limit") Integer logWarnLimit, @p(name = "error_limit") Integer logErrorLimit) {
        return new LogRemoteConfig(logMessageMaximumAllowedLength, logInfoLimit, logWarnLimit, logErrorLimit);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LogRemoteConfig)) {
            return false;
        }
        LogRemoteConfig logRemoteConfig = (LogRemoteConfig) obj;
        return Intrinsics.d(this.f73014a, logRemoteConfig.f73014a) && Intrinsics.d(this.f73015b, logRemoteConfig.f73015b) && Intrinsics.d(this.f73016c, logRemoteConfig.f73016c) && Intrinsics.d(this.f73017d, logRemoteConfig.f73017d);
    }

    public final int hashCode() {
        Integer num = this.f73014a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f73015b;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f73016c;
        int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f73017d;
        return hashCode3 + (num4 != null ? num4.hashCode() : 0);
    }

    public final String toString() {
        return "LogRemoteConfig(logMessageMaximumAllowedLength=" + this.f73014a + ", logInfoLimit=" + this.f73015b + ", logWarnLimit=" + this.f73016c + ", logErrorLimit=" + this.f73017d + ')';
    }

    public /* synthetic */ LogRemoteConfig(Integer num, Integer num2, Integer num3, Integer num4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : num, (i13 & 2) != 0 ? null : num2, (i13 & 4) != 0 ? null : num3, (i13 & 8) != 0 ? null : num4);
    }
}
