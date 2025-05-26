package com.pinterest.api.model;

import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u001dB;\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0019\u001a\u00020\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0003\u0010\nR\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0004\u001a\u0004\b\r\u0010\u0006R\u001a\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0004\u001a\u0004\b\f\u0010\u0006R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0019\u001a\u00020\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, d2 = {"Lcom/pinterest/api/model/s30;", "Ldl1/s;", "", "a", "I", "e", "()I", "impressionCount", "b", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "clickthroughCount", "c", "g", "saveCount", "d", "closeupCount", "Ljava/util/Date;", "Ljava/util/Date;", "getTimestamp", "()Ljava/util/Date;", "timestamp", "", "f", "Z", "isRealtime", "()Z", "<init>", "(ILjava/lang/Integer;IILjava/util/Date;Z)V", "com/pinterest/api/model/r30", "models_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final /* data */ class s30 implements dl1.s {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @om.b("impression")
    private final int impressionCount;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @om.b("clickthrough")
    private final Integer clickthroughCount;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @om.b("save")
    private final int saveCount;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @om.b("closeup")
    private final int closeupCount;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @om.b("timestamp")
    private final Date timestamp;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @om.b("is_realtime")
    private final boolean isRealtime;

    static {
        new r30(null);
    }

    public s30(int i13, Integer num, int i14, int i15, Date date, boolean z13) {
        this.impressionCount = i13;
        this.clickthroughCount = num;
        this.saveCount = i14;
        this.closeupCount = i15;
        this.timestamp = date;
        this.isRealtime = z13;
    }

    /* renamed from: a, reason: from getter */
    public final Integer getClickthroughCount() {
        return this.clickthroughCount;
    }

    @Override // dl1.s
    /* renamed from: b */
    public final String getId() {
        return "CREATOR_ANALYTICS_PIN_ITEM_MODEL_UID";
    }

    /* renamed from: c, reason: from getter */
    public final int getCloseupCount() {
        return this.closeupCount;
    }

    /* renamed from: e, reason: from getter */
    public final int getImpressionCount() {
        return this.impressionCount;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s30)) {
            return false;
        }
        s30 s30Var = (s30) obj;
        return this.impressionCount == s30Var.impressionCount && Intrinsics.d(this.clickthroughCount, s30Var.clickthroughCount) && this.saveCount == s30Var.saveCount && this.closeupCount == s30Var.closeupCount && Intrinsics.d(this.timestamp, s30Var.timestamp) && this.isRealtime == s30Var.isRealtime;
    }

    /* renamed from: g, reason: from getter */
    public final int getSaveCount() {
        return this.saveCount;
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.impressionCount) * 31;
        Integer num = this.clickthroughCount;
        int b13 = ep.b.b(this.closeupCount, ep.b.b(this.saveCount, (hashCode + (num == null ? 0 : num.hashCode())) * 31, 31), 31);
        Date date = this.timestamp;
        return Boolean.hashCode(this.isRealtime) + ((b13 + (date != null ? date.hashCode() : 0)) * 31);
    }

    public final String toString() {
        int i13 = this.impressionCount;
        Integer num = this.clickthroughCount;
        int i14 = this.saveCount;
        int i15 = this.closeupCount;
        Date date = this.timestamp;
        boolean z13 = this.isRealtime;
        StringBuilder sb3 = new StringBuilder("PinCreatorAnalyticsItem(impressionCount=");
        sb3.append(i13);
        sb3.append(", clickthroughCount=");
        sb3.append(num);
        sb3.append(", saveCount=");
        a.a.z(sb3, i14, ", closeupCount=", i15, ", timestamp=");
        sb3.append(date);
        sb3.append(", isRealtime=");
        sb3.append(z13);
        sb3.append(")");
        return sb3.toString();
    }
}
