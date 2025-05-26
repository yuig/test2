package com.pinterest.handshake.analytics;

import a.a;
import androidx.annotation.Keep;
import com.pinterest.adFormatsLibrary.analytics.logger.BaseAdsPayload;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import om.b;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0004J$\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\u0004J\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0015\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0016\u0010\u0004¨\u0006\u0019"}, d2 = {"com/pinterest/handshake/analytics/AdsHandshakeJsonLogger$AdsHandshakeStepPayload", "Lcom/pinterest/adFormatsLibrary/analytics/logger/BaseAdsPayload;", "", "component1", "()Ljava/lang/String;", "component2", "eventName", "handshakeStep", "Lcom/pinterest/handshake/analytics/AdsHandshakeJsonLogger$AdsHandshakeStepPayload;", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/pinterest/handshake/analytics/AdsHandshakeJsonLogger$AdsHandshakeStepPayload;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getEventName", "getHandshakeStep", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "handshakeLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final /* data */ class AdsHandshakeJsonLogger$AdsHandshakeStepPayload extends BaseAdsPayload {

    @b("event_name")
    @NotNull
    private final String eventName;

    @b("handshake_step")
    @NotNull
    private final String handshakeStep;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdsHandshakeJsonLogger$AdsHandshakeStepPayload(@NotNull String eventName, @NotNull String handshakeStep) {
        super(wr.b.HANDSHAKE);
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(handshakeStep, "handshakeStep");
        this.eventName = eventName;
        this.handshakeStep = handshakeStep;
    }

    public static /* synthetic */ AdsHandshakeJsonLogger$AdsHandshakeStepPayload copy$default(AdsHandshakeJsonLogger$AdsHandshakeStepPayload adsHandshakeJsonLogger$AdsHandshakeStepPayload, String str, String str2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = adsHandshakeJsonLogger$AdsHandshakeStepPayload.eventName;
        }
        if ((i13 & 2) != 0) {
            str2 = adsHandshakeJsonLogger$AdsHandshakeStepPayload.handshakeStep;
        }
        return adsHandshakeJsonLogger$AdsHandshakeStepPayload.copy(str, str2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getEventName() {
        return this.eventName;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getHandshakeStep() {
        return this.handshakeStep;
    }

    @NotNull
    public final AdsHandshakeJsonLogger$AdsHandshakeStepPayload copy(@NotNull String eventName, @NotNull String handshakeStep) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(handshakeStep, "handshakeStep");
        return new AdsHandshakeJsonLogger$AdsHandshakeStepPayload(eventName, handshakeStep);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdsHandshakeJsonLogger$AdsHandshakeStepPayload)) {
            return false;
        }
        AdsHandshakeJsonLogger$AdsHandshakeStepPayload adsHandshakeJsonLogger$AdsHandshakeStepPayload = (AdsHandshakeJsonLogger$AdsHandshakeStepPayload) other;
        return Intrinsics.d(this.eventName, adsHandshakeJsonLogger$AdsHandshakeStepPayload.eventName) && Intrinsics.d(this.handshakeStep, adsHandshakeJsonLogger$AdsHandshakeStepPayload.handshakeStep);
    }

    @NotNull
    public final String getEventName() {
        return this.eventName;
    }

    @NotNull
    public final String getHandshakeStep() {
        return this.handshakeStep;
    }

    public int hashCode() {
        return this.handshakeStep.hashCode() + (this.eventName.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return a.m("AdsHandshakeStepPayload(eventName=", this.eventName, ", handshakeStep=", this.handshakeStep, ")");
    }
}
