package com.pinterest.ads.analytics;

import a.a;
import com.pinterest.adFormatsLibrary.analytics.logger.BaseAdsPayload;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wr.b;

@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\b\u0010\u0007J.\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0004J\u0010\u0010\u0010\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0007J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0016\u001a\u0004\b\u0017\u0010\u0004R\u0017\u0010\n\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\n\u0010\u0018\u001a\u0004\b\u0019\u0010\u0007R\u0017\u0010\u000b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0018\u001a\u0004\b\u001a\u0010\u0007¨\u0006\u001d"}, d2 = {"com/pinterest/ads/analytics/PremiereSpotlightHFSlotIndexDebugLogger$SpotlightHFSlotIndexPayload", "Lcom/pinterest/adFormatsLibrary/analytics/logger/BaseAdsPayload;", "", "component1", "()Ljava/lang/String;", "", "component2", "()I", "component3", "pinId", "apiSlotIndex", "renderedSlotIndex", "Lcom/pinterest/ads/analytics/PremiereSpotlightHFSlotIndexDebugLogger$SpotlightHFSlotIndexPayload;", "copy", "(Ljava/lang/String;II)Lcom/pinterest/ads/analytics/PremiereSpotlightHFSlotIndexDebugLogger$SpotlightHFSlotIndexPayload;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPinId", "I", "getApiSlotIndex", "getRenderedSlotIndex", "<init>", "(Ljava/lang/String;II)V", "adsLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final /* data */ class PremiereSpotlightHFSlotIndexDebugLogger$SpotlightHFSlotIndexPayload extends BaseAdsPayload {
    private final int apiSlotIndex;

    @NotNull
    private final String pinId;
    private final int renderedSlotIndex;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PremiereSpotlightHFSlotIndexDebugLogger$SpotlightHFSlotIndexPayload(@NotNull String pinId, int i13, int i14) {
        super(b.PREMIERE_SPOTLIGHT_SLOT_INDEX);
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        this.pinId = pinId;
        this.apiSlotIndex = i13;
        this.renderedSlotIndex = i14;
    }

    public static /* synthetic */ PremiereSpotlightHFSlotIndexDebugLogger$SpotlightHFSlotIndexPayload copy$default(PremiereSpotlightHFSlotIndexDebugLogger$SpotlightHFSlotIndexPayload premiereSpotlightHFSlotIndexDebugLogger$SpotlightHFSlotIndexPayload, String str, int i13, int i14, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            str = premiereSpotlightHFSlotIndexDebugLogger$SpotlightHFSlotIndexPayload.pinId;
        }
        if ((i15 & 2) != 0) {
            i13 = premiereSpotlightHFSlotIndexDebugLogger$SpotlightHFSlotIndexPayload.apiSlotIndex;
        }
        if ((i15 & 4) != 0) {
            i14 = premiereSpotlightHFSlotIndexDebugLogger$SpotlightHFSlotIndexPayload.renderedSlotIndex;
        }
        return premiereSpotlightHFSlotIndexDebugLogger$SpotlightHFSlotIndexPayload.copy(str, i13, i14);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getPinId() {
        return this.pinId;
    }

    /* renamed from: component2, reason: from getter */
    public final int getApiSlotIndex() {
        return this.apiSlotIndex;
    }

    /* renamed from: component3, reason: from getter */
    public final int getRenderedSlotIndex() {
        return this.renderedSlotIndex;
    }

    @NotNull
    public final PremiereSpotlightHFSlotIndexDebugLogger$SpotlightHFSlotIndexPayload copy(@NotNull String pinId, int apiSlotIndex, int renderedSlotIndex) {
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        return new PremiereSpotlightHFSlotIndexDebugLogger$SpotlightHFSlotIndexPayload(pinId, apiSlotIndex, renderedSlotIndex);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PremiereSpotlightHFSlotIndexDebugLogger$SpotlightHFSlotIndexPayload)) {
            return false;
        }
        PremiereSpotlightHFSlotIndexDebugLogger$SpotlightHFSlotIndexPayload premiereSpotlightHFSlotIndexDebugLogger$SpotlightHFSlotIndexPayload = (PremiereSpotlightHFSlotIndexDebugLogger$SpotlightHFSlotIndexPayload) other;
        return Intrinsics.d(this.pinId, premiereSpotlightHFSlotIndexDebugLogger$SpotlightHFSlotIndexPayload.pinId) && this.apiSlotIndex == premiereSpotlightHFSlotIndexDebugLogger$SpotlightHFSlotIndexPayload.apiSlotIndex && this.renderedSlotIndex == premiereSpotlightHFSlotIndexDebugLogger$SpotlightHFSlotIndexPayload.renderedSlotIndex;
    }

    public final int getApiSlotIndex() {
        return this.apiSlotIndex;
    }

    @NotNull
    public final String getPinId() {
        return this.pinId;
    }

    public final int getRenderedSlotIndex() {
        return this.renderedSlotIndex;
    }

    public int hashCode() {
        return Integer.hashCode(this.renderedSlotIndex) + ep.b.b(this.apiSlotIndex, this.pinId.hashCode() * 31, 31);
    }

    @NotNull
    public String toString() {
        String str = this.pinId;
        int i13 = this.apiSlotIndex;
        return a.n(a.v("SpotlightHFSlotIndexPayload(pinId=", str, ", apiSlotIndex=", i13, ", renderedSlotIndex="), this.renderedSlotIndex, ")");
    }
}
