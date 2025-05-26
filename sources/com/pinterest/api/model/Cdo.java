package com.pinterest.api.model;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\u0012\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R&\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0012\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/pinterest/api/model/do;", "Lcom/pinterest/api/model/eo;", "Lcom/pinterest/api/model/y6;", "a", "Lcom/pinterest/api/model/y6;", "b", "()Lcom/pinterest/api/model/y6;", "audioItem", "Lkotlin/Pair;", "", "Lkotlin/Pair;", "e", "()Lkotlin/Pair;", "trimmedTimeRangeMs", "Lcom/pinterest/api/model/eq;", "c", "Lcom/pinterest/api/model/eq;", "()Lcom/pinterest/api/model/eq;", "metadata", "<init>", "(Lcom/pinterest/api/model/y6;Lkotlin/Pair;Lcom/pinterest/api/model/eq;)V", "models_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.pinterest.api.model.do, reason: invalid class name */
/* loaded from: classes3.dex */
public final /* data */ class Cdo extends eo {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @om.b("audioItem")
    @NotNull
    private final y6 audioItem;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @om.b("trimmedTimeRangeMs")
    @NotNull
    private final Pair<Long, Long> trimmedTimeRangeMs;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @om.b("metadata")
    @NotNull
    private final eq metadata;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Cdo(@NotNull y6 audioItem, @NotNull Pair<Long, Long> trimmedTimeRangeMs, @NotNull eq metadata) {
        super(audioItem, trimmedTimeRangeMs, null);
        Intrinsics.checkNotNullParameter(audioItem, "audioItem");
        Intrinsics.checkNotNullParameter(trimmedTimeRangeMs, "trimmedTimeRangeMs");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        this.audioItem = audioItem;
        this.trimmedTimeRangeMs = trimmedTimeRangeMs;
        this.metadata = metadata;
    }

    public static Cdo a(Cdo cdo, y6 audioItem, Pair trimmedTimeRangeMs, int i13) {
        if ((i13 & 1) != 0) {
            audioItem = cdo.audioItem;
        }
        if ((i13 & 2) != 0) {
            trimmedTimeRangeMs = cdo.trimmedTimeRangeMs;
        }
        eq metadata = cdo.metadata;
        cdo.getClass();
        Intrinsics.checkNotNullParameter(audioItem, "audioItem");
        Intrinsics.checkNotNullParameter(trimmedTimeRangeMs, "trimmedTimeRangeMs");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        return new Cdo(audioItem, trimmedTimeRangeMs, metadata);
    }

    /* renamed from: b, reason: from getter */
    public final y6 getAudioItem() {
        return this.audioItem;
    }

    /* renamed from: c, reason: from getter */
    public final eq getMetadata() {
        return this.metadata;
    }

    public final long d() {
        double millis = TimeUnit.SECONDS.toMillis(1L);
        Double u13 = this.metadata.u();
        Intrinsics.checkNotNullExpressionValue(u13, "getDuration(...)");
        return (long) (u13.doubleValue() * millis);
    }

    /* renamed from: e, reason: from getter */
    public final Pair getTrimmedTimeRangeMs() {
        return this.trimmedTimeRangeMs;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Intrinsics.d(Cdo.class, obj.getClass())) {
            return false;
        }
        Cdo cdo = (Cdo) obj;
        return Intrinsics.d(this.audioItem, cdo.audioItem) && Intrinsics.d(this.trimmedTimeRangeMs, cdo.trimmedTimeRangeMs) && Intrinsics.d(this.metadata, cdo.metadata);
    }

    public final Cdo f(long j13) {
        Pair<Long, Long> pair = this.trimmedTimeRangeMs;
        long longValue = ((Number) pair.f80346a).longValue();
        long longValue2 = ((Number) pair.f80347b).longValue();
        long j14 = longValue + j13;
        if (j14 < d()) {
            return a(this, null, new Pair(Long.valueOf(longValue), Long.valueOf(j14)), 5);
        }
        long j15 = longValue2 - j13;
        return j15 >= 0 ? a(this, null, new Pair(Long.valueOf(j15), Long.valueOf(longValue2)), 5) : a(this, null, new Pair(0L, Long.valueOf(Math.min(j13, d()))), 5);
    }

    public final int hashCode() {
        return this.metadata.hashCode() + ((this.trimmedTimeRangeMs.hashCode() + (this.audioItem.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "IdeaPinMusicItem(audioItem=" + this.audioItem + ", trimmedTimeRangeMs=" + this.trimmedTimeRangeMs + ", metadata=" + this.metadata + ")";
    }
}
