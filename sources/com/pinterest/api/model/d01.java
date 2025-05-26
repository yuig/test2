package com.pinterest.api.model;

import java.util.Date;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001,B_\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010$\u001a\u0004\u0018\u00010\u001f\u0012\u0006\u0010(\u001a\u00020%¢\u0006\u0004\b*\u0010+R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\u000b\u0010\u0006R\u001a\u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0004\u001a\u0004\b\u000e\u0010\u0006R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0003\u0010\u0012R\u001a\u0010\u0015\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0004\u001a\u0004\b\u0010\u0010\u0006R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0012R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010$\u001a\u0004\u0018\u00010\u001f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010(\u001a\u00020%8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006-"}, d2 = {"Lcom/pinterest/api/model/d01;", "Ldl1/s;", "", "a", "I", "getImpressionCount", "()I", "impressionCount", "b", "getClickthroughCount", "clickthroughCount", "c", "saveCount", "d", "getCloseupCount", "closeupCount", "e", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "averageTime", "f", "videoViews", "g", "getP95Views", "p95Views", "", "h", "Ljava/lang/Long;", "getTotalWatchTimeMs", "()Ljava/lang/Long;", "totalWatchTimeMs", "Ljava/util/Date;", "i", "Ljava/util/Date;", "getTimestamp", "()Ljava/util/Date;", "timestamp", "", "j", "Z", "isRealtime", "()Z", "<init>", "(IIIILjava/lang/Integer;ILjava/lang/Integer;Ljava/lang/Long;Ljava/util/Date;Z)V", "com/pinterest/api/model/c01", "models_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class d01 implements dl1.s {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @om.b("impression")
    private final int impressionCount;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @om.b("clickthrough")
    private final int clickthroughCount;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @om.b("save")
    private final int saveCount;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @om.b("closeup")
    private final int closeupCount;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @om.b("video_average_time")
    private final Integer averageTime;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @om.b("video_views")
    private final int videoViews;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @om.b("video_p95_views")
    private final Integer p95Views;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @om.b("video_total_time")
    private final Long totalWatchTimeMs;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @om.b("timestamp")
    private final Date timestamp;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @om.b("is_realtime")
    private final boolean isRealtime;

    static {
        new c01(null);
    }

    public d01(int i13, int i14, int i15, int i16, Integer num, int i17, Integer num2, Long l13, Date date, boolean z13) {
        this.impressionCount = i13;
        this.clickthroughCount = i14;
        this.saveCount = i15;
        this.closeupCount = i16;
        this.averageTime = num;
        this.videoViews = i17;
        this.p95Views = num2;
        this.totalWatchTimeMs = l13;
        this.timestamp = date;
        this.isRealtime = z13;
    }

    /* renamed from: a, reason: from getter */
    public final Integer getAverageTime() {
        return this.averageTime;
    }

    @Override // dl1.s
    public final String b() {
        return "CREATOR_ANALYTICS_VIDEO_ITEM_UID";
    }

    /* renamed from: c, reason: from getter */
    public final int getSaveCount() {
        return this.saveCount;
    }

    /* renamed from: e, reason: from getter */
    public final int getVideoViews() {
        return this.videoViews;
    }
}
