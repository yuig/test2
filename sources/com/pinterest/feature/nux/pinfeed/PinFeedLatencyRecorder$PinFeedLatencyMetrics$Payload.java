package com.pinterest.feature.nux.pinfeed;

import com.pinterest.analytics.kibana.e;
import kotlin.Metadata;
import om.b;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\b\u0010\u0007J.\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0018\u001a\u0004\b\u0019\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001a\u001a\u0004\b\u001b\u0010\u0007R\u001a\u0010\u000b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001a\u001a\u0004\b\u001c\u0010\u0007¨\u0006\u001f"}, d2 = {"com/pinterest/feature/nux/pinfeed/PinFeedLatencyRecorder$PinFeedLatencyMetrics$Payload", "Lcom/pinterest/analytics/kibana/e;", "", "component1", "()D", "", "component2", "()I", "component3", "durationSeconds", "pinsCount", "useCaseCount", "Lcom/pinterest/feature/nux/pinfeed/PinFeedLatencyRecorder$PinFeedLatencyMetrics$Payload;", "copy", "(DII)Lcom/pinterest/feature/nux/pinfeed/PinFeedLatencyRecorder$PinFeedLatencyMetrics$Payload;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "D", "getDurationSeconds", "I", "getPinsCount", "getUseCaseCount", "<init>", "(DII)V", "nux_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final /* data */ class PinFeedLatencyRecorder$PinFeedLatencyMetrics$Payload implements e {
    public static final int $stable = 0;

    @b("total_time_s")
    private final double durationSeconds;

    @b("num_total_pins")
    private final int pinsCount;

    @b("num_use_cases")
    private final int useCaseCount;

    public PinFeedLatencyRecorder$PinFeedLatencyMetrics$Payload(double d2, int i13, int i14) {
        this.durationSeconds = d2;
        this.pinsCount = i13;
        this.useCaseCount = i14;
    }

    public static /* synthetic */ PinFeedLatencyRecorder$PinFeedLatencyMetrics$Payload copy$default(PinFeedLatencyRecorder$PinFeedLatencyMetrics$Payload pinFeedLatencyRecorder$PinFeedLatencyMetrics$Payload, double d2, int i13, int i14, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            d2 = pinFeedLatencyRecorder$PinFeedLatencyMetrics$Payload.durationSeconds;
        }
        if ((i15 & 2) != 0) {
            i13 = pinFeedLatencyRecorder$PinFeedLatencyMetrics$Payload.pinsCount;
        }
        if ((i15 & 4) != 0) {
            i14 = pinFeedLatencyRecorder$PinFeedLatencyMetrics$Payload.useCaseCount;
        }
        return pinFeedLatencyRecorder$PinFeedLatencyMetrics$Payload.copy(d2, i13, i14);
    }

    /* renamed from: component1, reason: from getter */
    public final double getDurationSeconds() {
        return this.durationSeconds;
    }

    /* renamed from: component2, reason: from getter */
    public final int getPinsCount() {
        return this.pinsCount;
    }

    /* renamed from: component3, reason: from getter */
    public final int getUseCaseCount() {
        return this.useCaseCount;
    }

    @NotNull
    public final PinFeedLatencyRecorder$PinFeedLatencyMetrics$Payload copy(double durationSeconds, int pinsCount, int useCaseCount) {
        return new PinFeedLatencyRecorder$PinFeedLatencyMetrics$Payload(durationSeconds, pinsCount, useCaseCount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PinFeedLatencyRecorder$PinFeedLatencyMetrics$Payload)) {
            return false;
        }
        PinFeedLatencyRecorder$PinFeedLatencyMetrics$Payload pinFeedLatencyRecorder$PinFeedLatencyMetrics$Payload = (PinFeedLatencyRecorder$PinFeedLatencyMetrics$Payload) other;
        return Double.compare(this.durationSeconds, pinFeedLatencyRecorder$PinFeedLatencyMetrics$Payload.durationSeconds) == 0 && this.pinsCount == pinFeedLatencyRecorder$PinFeedLatencyMetrics$Payload.pinsCount && this.useCaseCount == pinFeedLatencyRecorder$PinFeedLatencyMetrics$Payload.useCaseCount;
    }

    public final double getDurationSeconds() {
        return this.durationSeconds;
    }

    public final int getPinsCount() {
        return this.pinsCount;
    }

    public final int getUseCaseCount() {
        return this.useCaseCount;
    }

    public int hashCode() {
        return Integer.hashCode(this.useCaseCount) + ep.b.b(this.pinsCount, Double.hashCode(this.durationSeconds) * 31, 31);
    }

    @NotNull
    public String toString() {
        return "Payload(durationSeconds=" + this.durationSeconds + ", pinsCount=" + this.pinsCount + ", useCaseCount=" + this.useCaseCount + ")";
    }
}
