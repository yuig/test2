package com.pinterest.api.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0017B+\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0010¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u001a\u0010\u000f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0014\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0018"}, d2 = {"Lcom/pinterest/api/model/tq;", "", "", "a", "J", "f", "()J", "startTimeMs", "b", "c", "endTimeMs", "Lcom/pinterest/api/model/fk;", "Lcom/pinterest/api/model/fk;", "d", "()Lcom/pinterest/api/model/fk;", "enterTransitionType", "Lcom/pinterest/api/model/wk;", "Lcom/pinterest/api/model/wk;", "e", "()Lcom/pinterest/api/model/wk;", "exitTransitionType", "<init>", "(JJLcom/pinterest/api/model/fk;Lcom/pinterest/api/model/wk;)V", "com/pinterest/api/model/sq", "hairball_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final /* data */ class tq {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @om.b("startTimeMs")
    private final long startTimeMs;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @om.b("endTimeMs")
    private final long endTimeMs;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @om.b("enterTransitionType")
    @NotNull
    private final fk enterTransitionType;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @om.b("exitTransitionType")
    @NotNull
    private final wk exitTransitionType;

    /* renamed from: e, reason: collision with root package name */
    public final long f42275e;

    static {
        new sq(null);
    }

    public tq(long j13, long j14, @NotNull fk enterTransitionType, @NotNull wk exitTransitionType) {
        Intrinsics.checkNotNullParameter(enterTransitionType, "enterTransitionType");
        Intrinsics.checkNotNullParameter(exitTransitionType, "exitTransitionType");
        this.startTimeMs = j13;
        this.endTimeMs = j14;
        this.enterTransitionType = enterTransitionType;
        this.exitTransitionType = exitTransitionType;
        this.f42275e = j14 - j13;
    }

    public static tq b(tq tqVar, long j13, long j14, fk fkVar, wk wkVar, int i13) {
        if ((i13 & 1) != 0) {
            j13 = tqVar.startTimeMs;
        }
        long j15 = j13;
        if ((i13 & 2) != 0) {
            j14 = tqVar.endTimeMs;
        }
        long j16 = j14;
        if ((i13 & 4) != 0) {
            fkVar = tqVar.enterTransitionType;
        }
        fk enterTransitionType = fkVar;
        if ((i13 & 8) != 0) {
            wkVar = tqVar.exitTransitionType;
        }
        wk exitTransitionType = wkVar;
        tqVar.getClass();
        Intrinsics.checkNotNullParameter(enterTransitionType, "enterTransitionType");
        Intrinsics.checkNotNullParameter(exitTransitionType, "exitTransitionType");
        return new tq(j15, j16, enterTransitionType, exitTransitionType);
    }

    public final boolean a(long j13) {
        if (j13 != -1) {
            if (!i()) {
                long j14 = this.startTimeMs;
                if (j13 > this.endTimeMs || j14 > j13) {
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: c, reason: from getter */
    public final long getEndTimeMs() {
        return this.endTimeMs;
    }

    /* renamed from: d, reason: from getter */
    public final fk getEnterTransitionType() {
        return this.enterTransitionType;
    }

    /* renamed from: e, reason: from getter */
    public final wk getExitTransitionType() {
        return this.exitTransitionType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Intrinsics.d(tq.class, obj.getClass())) {
            return false;
        }
        tq tqVar = (tq) obj;
        return this.startTimeMs == tqVar.startTimeMs && this.endTimeMs == tqVar.endTimeMs;
    }

    /* renamed from: f, reason: from getter */
    public final long getStartTimeMs() {
        return this.startTimeMs;
    }

    public final long g(long j13) {
        return i() ? j13 : Math.min(this.endTimeMs, j13);
    }

    public final boolean h() {
        return (this.enterTransitionType == fk.Instant && this.exitTransitionType == wk.Instant) ? false : true;
    }

    public final int hashCode() {
        return this.exitTransitionType.hashCode() + ((this.enterTransitionType.hashCode() + a.a.c(this.endTimeMs, Long.hashCode(this.startTimeMs) * 31, 31)) * 31);
    }

    public final boolean i() {
        return this.startTimeMs == 0 && this.endTimeMs == 0;
    }

    public final String toString() {
        long j13 = this.startTimeMs;
        long j14 = this.endTimeMs;
        fk fkVar = this.enterTransitionType;
        wk wkVar = this.exitTransitionType;
        StringBuilder u13 = a.a.u("IdeaPinOverlayBlockDurationConfig(startTimeMs=", j13, ", endTimeMs=");
        u13.append(j14);
        u13.append(", enterTransitionType=");
        u13.append(fkVar);
        u13.append(", exitTransitionType=");
        u13.append(wkVar);
        u13.append(")");
        return u13.toString();
    }

    public /* synthetic */ tq(long j13, long j14, fk fkVar, wk wkVar, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(j13, j14, (i13 & 4) != 0 ? fk.Instant : fkVar, (i13 & 8) != 0 ? wk.Instant : wkVar);
    }
}
