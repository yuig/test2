package com.pinterest.video;

import androidx.annotation.Keep;
import bc2.k;
import bc2.q;
import ep.b;
import ey.y2;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ty.f;

@Keep
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001:\u0001;BC\u0012\b\b\u0002\u0010\u0016\u001a\u00020\f\u0012\b\b\u0002\u0010\u0017\u001a\u00020\f\u0012\b\b\u0002\u0010\u0018\u001a\u00020\f\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0011¢\u0006\u0004\b9\u0010:J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u0015\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\u0006J\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000eJ\u0010\u0010\u0012\u001a\u00020\u0011HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0011HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0011HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0013JL\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0016\u001a\u00020\f2\b\b\u0002\u0010\u0017\u001a\u00020\f2\b\b\u0002\u0010\u0018\u001a\u00020\f2\b\b\u0002\u0010\u0019\u001a\u00020\u00112\b\b\u0002\u0010\u001a\u001a\u00020\u00112\b\b\u0002\u0010\u001b\u001a\u00020\u0011HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b!\u0010\u000eJ\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%J\u001f\u0010'\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010&\u001a\u00020#H\u0002¢\u0006\u0004\b'\u0010(R\"\u0010\u0016\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010)\u001a\u0004\b*\u0010\u000e\"\u0004\b+\u0010,R\"\u0010\u0017\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010)\u001a\u0004\b-\u0010\u000e\"\u0004\b.\u0010,R\"\u0010\u0018\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010)\u001a\u0004\b/\u0010\u000e\"\u0004\b0\u0010,R\"\u0010\u0019\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u00101\u001a\u0004\b2\u0010\u0013\"\u0004\b3\u00104R\"\u0010\u001a\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u00101\u001a\u0004\b5\u0010\u0013\"\u0004\b6\u00104R\"\u0010\u001b\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u00101\u001a\u0004\b7\u0010\u0013\"\u0004\b8\u00104¨\u0006<"}, d2 = {"Lcom/pinterest/video/PoolStats;", "", "Lbc2/k;", "metadata", "", "onCacheHit", "(Lbc2/k;)V", "onWarmUpHit", "onCacheMiss", "", "getCacheHitRate", "()F", "", "component1", "()I", "component2", "component3", "Lcom/pinterest/video/PoolStats$Counter;", "component4", "()Lcom/pinterest/video/PoolStats$Counter;", "component5", "component6", "cacheHitCount", "warmUpHitCount", "cacheMissCount", "playerCounter", "audioDecoderCounter", "videoDecoderCounter", "copy", "(IIILcom/pinterest/video/PoolStats$Counter;Lcom/pinterest/video/PoolStats$Counter;Lcom/pinterest/video/PoolStats$Counter;)Lcom/pinterest/video/PoolStats;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "isPlayerCached", "reportVideoPWTEvents", "(Lbc2/k;Z)V", "I", "getCacheHitCount", "setCacheHitCount", "(I)V", "getWarmUpHitCount", "setWarmUpHitCount", "getCacheMissCount", "setCacheMissCount", "Lcom/pinterest/video/PoolStats$Counter;", "getPlayerCounter", "setPlayerCounter", "(Lcom/pinterest/video/PoolStats$Counter;)V", "getAudioDecoderCounter", "setAudioDecoderCounter", "getVideoDecoderCounter", "setVideoDecoderCounter", "<init>", "(IIILcom/pinterest/video/PoolStats$Counter;Lcom/pinterest/video/PoolStats$Counter;Lcom/pinterest/video/PoolStats$Counter;)V", "Counter", "video_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final /* data */ class PoolStats {

    @NotNull
    private Counter audioDecoderCounter;
    private int cacheHitCount;
    private int cacheMissCount;

    @NotNull
    private Counter playerCounter;

    @NotNull
    private Counter videoDecoderCounter;
    private int warmUpHitCount;

    @Keep
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u0013\u001a\u00020\u0003J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\u0006\u0010\u0018\u001a\u00020\u0019J\u0006\u0010\u001a\u001a\u00020\u0019J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\n¨\u0006\u001d"}, d2 = {"Lcom/pinterest/video/PoolStats$Counter;", "", "createCount", "", "releaseCount", "maxConcurrentCount", "(III)V", "getCreateCount", "()I", "setCreateCount", "(I)V", "getMaxConcurrentCount", "setMaxConcurrentCount", "getReleaseCount", "setReleaseCount", "component1", "component2", "component3", "copy", "currentCount", "equals", "", "other", "hashCode", "onCreated", "", "onReleased", "toString", "", "video_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Counter {
        private int createCount;
        private int maxConcurrentCount;
        private int releaseCount;

        public Counter() {
            this(0, 0, 0, 7, null);
        }

        public static /* synthetic */ Counter copy$default(Counter counter, int i13, int i14, int i15, int i16, Object obj) {
            if ((i16 & 1) != 0) {
                i13 = counter.createCount;
            }
            if ((i16 & 2) != 0) {
                i14 = counter.releaseCount;
            }
            if ((i16 & 4) != 0) {
                i15 = counter.maxConcurrentCount;
            }
            return counter.copy(i13, i14, i15);
        }

        /* renamed from: component1, reason: from getter */
        public final int getCreateCount() {
            return this.createCount;
        }

        /* renamed from: component2, reason: from getter */
        public final int getReleaseCount() {
            return this.releaseCount;
        }

        /* renamed from: component3, reason: from getter */
        public final int getMaxConcurrentCount() {
            return this.maxConcurrentCount;
        }

        @NotNull
        public final Counter copy(int createCount, int releaseCount, int maxConcurrentCount) {
            return new Counter(createCount, releaseCount, maxConcurrentCount);
        }

        public final int currentCount() {
            return this.createCount - this.releaseCount;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Counter)) {
                return false;
            }
            Counter counter = (Counter) other;
            return this.createCount == counter.createCount && this.releaseCount == counter.releaseCount && this.maxConcurrentCount == counter.maxConcurrentCount;
        }

        public final int getCreateCount() {
            return this.createCount;
        }

        public final int getMaxConcurrentCount() {
            return this.maxConcurrentCount;
        }

        public final int getReleaseCount() {
            return this.releaseCount;
        }

        public int hashCode() {
            return Integer.hashCode(this.maxConcurrentCount) + b.b(this.releaseCount, Integer.hashCode(this.createCount) * 31, 31);
        }

        public final void onCreated() {
            int i13 = this.createCount + 1;
            this.createCount = i13;
            this.maxConcurrentCount = Math.max(this.maxConcurrentCount, i13 - this.releaseCount);
        }

        public final void onReleased() {
            this.releaseCount++;
        }

        public final void setCreateCount(int i13) {
            this.createCount = i13;
        }

        public final void setMaxConcurrentCount(int i13) {
            this.maxConcurrentCount = i13;
        }

        public final void setReleaseCount(int i13) {
            this.releaseCount = i13;
        }

        @NotNull
        public String toString() {
            int i13 = this.createCount;
            int i14 = this.releaseCount;
            return a.a.n(a.a.t("Counter(createCount=", i13, ", releaseCount=", i14, ", maxConcurrentCount="), this.maxConcurrentCount, ")");
        }

        public Counter(int i13, int i14, int i15) {
            this.createCount = i13;
            this.releaseCount = i14;
            this.maxConcurrentCount = i15;
        }

        public /* synthetic */ Counter(int i13, int i14, int i15, int i16, DefaultConstructorMarker defaultConstructorMarker) {
            this((i16 & 1) != 0 ? 0 : i13, (i16 & 2) != 0 ? 0 : i14, (i16 & 4) != 0 ? 0 : i15);
        }
    }

    public PoolStats() {
        this(0, 0, 0, null, null, null, 63, null);
    }

    public static /* synthetic */ PoolStats copy$default(PoolStats poolStats, int i13, int i14, int i15, Counter counter, Counter counter2, Counter counter3, int i16, Object obj) {
        if ((i16 & 1) != 0) {
            i13 = poolStats.cacheHitCount;
        }
        if ((i16 & 2) != 0) {
            i14 = poolStats.warmUpHitCount;
        }
        int i17 = i14;
        if ((i16 & 4) != 0) {
            i15 = poolStats.cacheMissCount;
        }
        int i18 = i15;
        if ((i16 & 8) != 0) {
            counter = poolStats.playerCounter;
        }
        Counter counter4 = counter;
        if ((i16 & 16) != 0) {
            counter2 = poolStats.audioDecoderCounter;
        }
        Counter counter5 = counter2;
        if ((i16 & 32) != 0) {
            counter3 = poolStats.videoDecoderCounter;
        }
        return poolStats.copy(i13, i17, i18, counter4, counter5, counter3);
    }

    private final void reportVideoPWTEvents(k metadata, boolean isPlayerCached) {
        String str = metadata.f22657a;
        q qVar = metadata.f22661e;
        new f(qVar.f22678g, str, isPlayerCached).i();
        new y2(metadata.f22657a, metadata.f22663g, qVar.f22678g, metadata.f22659c, metadata.f22660d, isPlayerCached).i();
    }

    /* renamed from: component1, reason: from getter */
    public final int getCacheHitCount() {
        return this.cacheHitCount;
    }

    /* renamed from: component2, reason: from getter */
    public final int getWarmUpHitCount() {
        return this.warmUpHitCount;
    }

    /* renamed from: component3, reason: from getter */
    public final int getCacheMissCount() {
        return this.cacheMissCount;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final Counter getPlayerCounter() {
        return this.playerCounter;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final Counter getAudioDecoderCounter() {
        return this.audioDecoderCounter;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final Counter getVideoDecoderCounter() {
        return this.videoDecoderCounter;
    }

    @NotNull
    public final PoolStats copy(int cacheHitCount, int warmUpHitCount, int cacheMissCount, @NotNull Counter playerCounter, @NotNull Counter audioDecoderCounter, @NotNull Counter videoDecoderCounter) {
        Intrinsics.checkNotNullParameter(playerCounter, "playerCounter");
        Intrinsics.checkNotNullParameter(audioDecoderCounter, "audioDecoderCounter");
        Intrinsics.checkNotNullParameter(videoDecoderCounter, "videoDecoderCounter");
        return new PoolStats(cacheHitCount, warmUpHitCount, cacheMissCount, playerCounter, audioDecoderCounter, videoDecoderCounter);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PoolStats)) {
            return false;
        }
        PoolStats poolStats = (PoolStats) other;
        return this.cacheHitCount == poolStats.cacheHitCount && this.warmUpHitCount == poolStats.warmUpHitCount && this.cacheMissCount == poolStats.cacheMissCount && Intrinsics.d(this.playerCounter, poolStats.playerCounter) && Intrinsics.d(this.audioDecoderCounter, poolStats.audioDecoderCounter) && Intrinsics.d(this.videoDecoderCounter, poolStats.videoDecoderCounter);
    }

    @NotNull
    public final Counter getAudioDecoderCounter() {
        return this.audioDecoderCounter;
    }

    public final int getCacheHitCount() {
        return this.cacheHitCount;
    }

    public final float getCacheHitRate() {
        int i13 = this.cacheHitCount;
        int i14 = this.warmUpHitCount;
        return (i13 + i14) / ((i13 + i14) + this.cacheMissCount);
    }

    public final int getCacheMissCount() {
        return this.cacheMissCount;
    }

    @NotNull
    public final Counter getPlayerCounter() {
        return this.playerCounter;
    }

    @NotNull
    public final Counter getVideoDecoderCounter() {
        return this.videoDecoderCounter;
    }

    public final int getWarmUpHitCount() {
        return this.warmUpHitCount;
    }

    public int hashCode() {
        return this.videoDecoderCounter.hashCode() + ((this.audioDecoderCounter.hashCode() + ((this.playerCounter.hashCode() + b.b(this.cacheMissCount, b.b(this.warmUpHitCount, Integer.hashCode(this.cacheHitCount) * 31, 31), 31)) * 31)) * 31);
    }

    public final void onCacheHit(@NotNull k metadata) {
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        this.cacheHitCount++;
        reportVideoPWTEvents(metadata, true);
    }

    public final void onCacheMiss(@NotNull k metadata) {
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        this.cacheMissCount++;
        reportVideoPWTEvents(metadata, false);
    }

    public final void onWarmUpHit(@NotNull k metadata) {
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        this.warmUpHitCount++;
        reportVideoPWTEvents(metadata, true);
    }

    public final void setAudioDecoderCounter(@NotNull Counter counter) {
        Intrinsics.checkNotNullParameter(counter, "<set-?>");
        this.audioDecoderCounter = counter;
    }

    public final void setCacheHitCount(int i13) {
        this.cacheHitCount = i13;
    }

    public final void setCacheMissCount(int i13) {
        this.cacheMissCount = i13;
    }

    public final void setPlayerCounter(@NotNull Counter counter) {
        Intrinsics.checkNotNullParameter(counter, "<set-?>");
        this.playerCounter = counter;
    }

    public final void setVideoDecoderCounter(@NotNull Counter counter) {
        Intrinsics.checkNotNullParameter(counter, "<set-?>");
        this.videoDecoderCounter = counter;
    }

    public final void setWarmUpHitCount(int i13) {
        this.warmUpHitCount = i13;
    }

    @NotNull
    public String toString() {
        int i13 = this.cacheHitCount;
        int i14 = this.warmUpHitCount;
        int i15 = this.cacheMissCount;
        Counter counter = this.playerCounter;
        Counter counter2 = this.audioDecoderCounter;
        Counter counter3 = this.videoDecoderCounter;
        StringBuilder t13 = a.a.t("PoolStats(cacheHitCount=", i13, ", warmUpHitCount=", i14, ", cacheMissCount=");
        t13.append(i15);
        t13.append(", playerCounter=");
        t13.append(counter);
        t13.append(", audioDecoderCounter=");
        t13.append(counter2);
        t13.append(", videoDecoderCounter=");
        t13.append(counter3);
        t13.append(")");
        return t13.toString();
    }

    public PoolStats(int i13, int i14, int i15, @NotNull Counter playerCounter, @NotNull Counter audioDecoderCounter, @NotNull Counter videoDecoderCounter) {
        Intrinsics.checkNotNullParameter(playerCounter, "playerCounter");
        Intrinsics.checkNotNullParameter(audioDecoderCounter, "audioDecoderCounter");
        Intrinsics.checkNotNullParameter(videoDecoderCounter, "videoDecoderCounter");
        this.cacheHitCount = i13;
        this.warmUpHitCount = i14;
        this.cacheMissCount = i15;
        this.playerCounter = playerCounter;
        this.audioDecoderCounter = audioDecoderCounter;
        this.videoDecoderCounter = videoDecoderCounter;
    }

    public /* synthetic */ PoolStats(int i13, int i14, int i15, Counter counter, Counter counter2, Counter counter3, int i16, DefaultConstructorMarker defaultConstructorMarker) {
        this((i16 & 1) != 0 ? 0 : i13, (i16 & 2) != 0 ? 0 : i14, (i16 & 4) == 0 ? i15 : 0, (i16 & 8) != 0 ? new Counter(0, 0, 0, 7, null) : counter, (i16 & 16) != 0 ? new Counter(0, 0, 0, 7, null) : counter2, (i16 & 32) != 0 ? new Counter(0, 0, 0, 7, null) : counter3);
    }
}
