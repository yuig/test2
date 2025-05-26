package io.embrace.android.embracesdk.internal.config.remote;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import oe2.p;
import oe2.s;
import org.jetbrains.annotations.NotNull;

@s(generateAdapter = true)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ@\u0010\u0007\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lio/embrace/android/embracesdk/internal/config/remote/UiRemoteConfig;", "", "", "breadcrumbs", "taps", "webViews", "fragments", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lio/embrace/android/embracesdk/internal/config/remote/UiRemoteConfig;", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "embrace-android-payload_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final /* data */ class UiRemoteConfig {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f73088a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f73089b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f73090c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f73091d;

    public UiRemoteConfig(Integer num, Integer num2, @p(name = "web_views") Integer num3, Integer num4) {
        this.f73088a = num;
        this.f73089b = num2;
        this.f73090c = num3;
        this.f73091d = num4;
    }

    @NotNull
    public final UiRemoteConfig copy(Integer breadcrumbs, Integer taps, @p(name = "web_views") Integer webViews, Integer fragments) {
        return new UiRemoteConfig(breadcrumbs, taps, webViews, fragments);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UiRemoteConfig)) {
            return false;
        }
        UiRemoteConfig uiRemoteConfig = (UiRemoteConfig) obj;
        return Intrinsics.d(this.f73088a, uiRemoteConfig.f73088a) && Intrinsics.d(this.f73089b, uiRemoteConfig.f73089b) && Intrinsics.d(this.f73090c, uiRemoteConfig.f73090c) && Intrinsics.d(this.f73091d, uiRemoteConfig.f73091d);
    }

    public final int hashCode() {
        Integer num = this.f73088a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f73089b;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f73090c;
        int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f73091d;
        return hashCode3 + (num4 != null ? num4.hashCode() : 0);
    }

    public final String toString() {
        return "UiRemoteConfig(breadcrumbs=" + this.f73088a + ", taps=" + this.f73089b + ", webViews=" + this.f73090c + ", fragments=" + this.f73091d + ')';
    }

    public /* synthetic */ UiRemoteConfig(Integer num, Integer num2, Integer num3, Integer num4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : num, (i13 & 2) != 0 ? null : num2, (i13 & 4) != 0 ? null : num3, (i13 & 8) != 0 ? null : num4);
    }
}
