package com.pinterest.handshake.analytics;

import a.a;
import a.cb;
import androidx.annotation.Keep;
import com.pinterest.adFormatsLibrary.analytics.logger.BaseAdsPayload;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import om.b;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0004J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0004J0\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u0004J\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u0017\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0016\u001a\u0004\b\u0018\u0010\u0004R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0016\u001a\u0004\b\u0019\u0010\u0004¨\u0006\u001c"}, d2 = {"com/pinterest/handshake/analytics/AdsHandshakeJsonLogger$AdsHandshakeErrorPayload", "Lcom/pinterest/adFormatsLibrary/analytics/logger/BaseAdsPayload;", "", "component1", "()Ljava/lang/String;", "component2", "component3", "eventName", "failReason", "errorCode", "Lcom/pinterest/handshake/analytics/AdsHandshakeJsonLogger$AdsHandshakeErrorPayload;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/pinterest/handshake/analytics/AdsHandshakeJsonLogger$AdsHandshakeErrorPayload;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getEventName", "getFailReason", "getErrorCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "handshakeLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final /* data */ class AdsHandshakeJsonLogger$AdsHandshakeErrorPayload extends BaseAdsPayload {

    @b("error_code")
    private final String errorCode;

    @b("error_event_name")
    @NotNull
    private final String eventName;

    @b("fail_reason")
    @NotNull
    private final String failReason;

    public /* synthetic */ AdsHandshakeJsonLogger$AdsHandshakeErrorPayload(String str, String str2, String str3, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i13 & 4) != 0 ? null : str3);
    }

    public static /* synthetic */ AdsHandshakeJsonLogger$AdsHandshakeErrorPayload copy$default(AdsHandshakeJsonLogger$AdsHandshakeErrorPayload adsHandshakeJsonLogger$AdsHandshakeErrorPayload, String str, String str2, String str3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = adsHandshakeJsonLogger$AdsHandshakeErrorPayload.eventName;
        }
        if ((i13 & 2) != 0) {
            str2 = adsHandshakeJsonLogger$AdsHandshakeErrorPayload.failReason;
        }
        if ((i13 & 4) != 0) {
            str3 = adsHandshakeJsonLogger$AdsHandshakeErrorPayload.errorCode;
        }
        return adsHandshakeJsonLogger$AdsHandshakeErrorPayload.copy(str, str2, str3);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getEventName() {
        return this.eventName;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getFailReason() {
        return this.failReason;
    }

    /* renamed from: component3, reason: from getter */
    public final String getErrorCode() {
        return this.errorCode;
    }

    @NotNull
    public final AdsHandshakeJsonLogger$AdsHandshakeErrorPayload copy(@NotNull String eventName, @NotNull String failReason, String errorCode) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(failReason, "failReason");
        return new AdsHandshakeJsonLogger$AdsHandshakeErrorPayload(eventName, failReason, errorCode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdsHandshakeJsonLogger$AdsHandshakeErrorPayload)) {
            return false;
        }
        AdsHandshakeJsonLogger$AdsHandshakeErrorPayload adsHandshakeJsonLogger$AdsHandshakeErrorPayload = (AdsHandshakeJsonLogger$AdsHandshakeErrorPayload) other;
        return Intrinsics.d(this.eventName, adsHandshakeJsonLogger$AdsHandshakeErrorPayload.eventName) && Intrinsics.d(this.failReason, adsHandshakeJsonLogger$AdsHandshakeErrorPayload.failReason) && Intrinsics.d(this.errorCode, adsHandshakeJsonLogger$AdsHandshakeErrorPayload.errorCode);
    }

    public final String getErrorCode() {
        return this.errorCode;
    }

    @NotNull
    public final String getEventName() {
        return this.eventName;
    }

    @NotNull
    public final String getFailReason() {
        return this.failReason;
    }

    public int hashCode() {
        int d2 = cb.d(this.failReason, this.eventName.hashCode() * 31, 31);
        String str = this.errorCode;
        return d2 + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        String str = this.eventName;
        String str2 = this.failReason;
        return a.p(a.w("AdsHandshakeErrorPayload(eventName=", str, ", failReason=", str2, ", errorCode="), this.errorCode, ")");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdsHandshakeJsonLogger$AdsHandshakeErrorPayload(@NotNull String eventName, @NotNull String failReason, String str) {
        super(wr.b.HANDSHAKE);
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(failReason, "failReason");
        this.eventName = eventName;
        this.failReason = failReason;
        this.errorCode = str;
    }
}
