package io.embrace.android.embracesdk.internal.comms.delivery;

import a.cb;
import io.embrace.android.embracesdk.internal.comms.api.ApiRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import oe2.p;
import oe2.s;
import org.jetbrains.annotations.NotNull;

@s(generateAdapter = true)
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000bJ0\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lio/embrace/android/embracesdk/internal/comms/delivery/PendingApiCall;", "", "Lio/embrace/android/embracesdk/internal/comms/api/ApiRequest;", "apiRequest", "", "cachedPayloadFilename", "", "queueTime", "copy", "(Lio/embrace/android/embracesdk/internal/comms/api/ApiRequest;Ljava/lang/String;Ljava/lang/Long;)Lio/embrace/android/embracesdk/internal/comms/delivery/PendingApiCall;", "<init>", "(Lio/embrace/android/embracesdk/internal/comms/api/ApiRequest;Ljava/lang/String;Ljava/lang/Long;)V", "embrace-android-payload_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final /* data */ class PendingApiCall {

    /* renamed from: a, reason: collision with root package name */
    public final ApiRequest f72953a;

    /* renamed from: b, reason: collision with root package name */
    public final String f72954b;

    /* renamed from: c, reason: collision with root package name */
    public final Long f72955c;

    public PendingApiCall(@p(name = "apiRequest") @NotNull ApiRequest apiRequest, @p(name = "cachedPayload") @NotNull String cachedPayloadFilename, @p(name = "queueTime") Long l13) {
        Intrinsics.checkNotNullParameter(apiRequest, "apiRequest");
        Intrinsics.checkNotNullParameter(cachedPayloadFilename, "cachedPayloadFilename");
        this.f72953a = apiRequest;
        this.f72954b = cachedPayloadFilename;
        this.f72955c = l13;
    }

    @NotNull
    public final PendingApiCall copy(@p(name = "apiRequest") @NotNull ApiRequest apiRequest, @p(name = "cachedPayload") @NotNull String cachedPayloadFilename, @p(name = "queueTime") Long queueTime) {
        Intrinsics.checkNotNullParameter(apiRequest, "apiRequest");
        Intrinsics.checkNotNullParameter(cachedPayloadFilename, "cachedPayloadFilename");
        return new PendingApiCall(apiRequest, cachedPayloadFilename, queueTime);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PendingApiCall)) {
            return false;
        }
        PendingApiCall pendingApiCall = (PendingApiCall) obj;
        return Intrinsics.d(this.f72953a, pendingApiCall.f72953a) && Intrinsics.d(this.f72954b, pendingApiCall.f72954b) && Intrinsics.d(this.f72955c, pendingApiCall.f72955c);
    }

    public final int hashCode() {
        int d2 = cb.d(this.f72954b, this.f72953a.hashCode() * 31, 31);
        Long l13 = this.f72955c;
        return d2 + (l13 == null ? 0 : l13.hashCode());
    }

    public final String toString() {
        return "PendingApiCall(apiRequest=" + this.f72953a + ", cachedPayloadFilename=" + this.f72954b + ", queueTime=" + this.f72955c + ')';
    }

    public /* synthetic */ PendingApiCall(ApiRequest apiRequest, String str, Long l13, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(apiRequest, str, (i13 & 4) != 0 ? null : l13);
    }
}
