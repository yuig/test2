package com.pinterest.api.model;

import java.util.Date;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class tg0 implements dl1.s {

    /* renamed from: a, reason: collision with root package name */
    public final Date f42207a;

    /* renamed from: b, reason: collision with root package name */
    public final Date f42208b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f42209c;

    /* renamed from: d, reason: collision with root package name */
    public final String f42210d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f42211e;

    static {
        new sg0(null);
    }

    public tg0(@NotNull Date startTime, @NotNull Date endTime, boolean z13, @NotNull String uuid, boolean z14) {
        Intrinsics.checkNotNullParameter(startTime, "startTime");
        Intrinsics.checkNotNullParameter(endTime, "endTime");
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        this.f42207a = startTime;
        this.f42208b = endTime;
        this.f42209c = z13;
        this.f42210d = uuid;
        this.f42211e = z14;
    }

    public static tg0 a(tg0 tg0Var, Date date, Date date2, boolean z13, int i13) {
        if ((i13 & 1) != 0) {
            date = tg0Var.f42207a;
        }
        Date startTime = date;
        if ((i13 & 2) != 0) {
            date2 = tg0Var.f42208b;
        }
        Date endTime = date2;
        if ((i13 & 4) != 0) {
            z13 = tg0Var.f42209c;
        }
        Intrinsics.checkNotNullParameter(startTime, "startTime");
        Intrinsics.checkNotNullParameter(endTime, "endTime");
        String uuid = tg0Var.f42210d;
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        return new tg0(startTime, endTime, z13, uuid, tg0Var.f42211e);
    }

    @Override // dl1.s
    /* renamed from: b */
    public final String getId() {
        return this.f42210d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tg0)) {
            return false;
        }
        tg0 tg0Var = (tg0) obj;
        return Intrinsics.d(this.f42207a, tg0Var.f42207a) && Intrinsics.d(this.f42208b, tg0Var.f42208b) && this.f42209c == tg0Var.f42209c && Intrinsics.d(this.f42210d, tg0Var.f42210d) && this.f42211e == tg0Var.f42211e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f42211e) + a.cb.d(this.f42210d, ep.b.e(this.f42209c, (this.f42208b.hashCode() + (this.f42207a.hashCode() * 31)) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ScheduledPinSectionHeader(startTime=");
        sb3.append(this.f42207a);
        sb3.append(", endTime=");
        sb3.append(this.f42208b);
        sb3.append(", showEmptyState=");
        sb3.append(this.f42209c);
        sb3.append(", uuid=");
        sb3.append(this.f42210d);
        sb3.append(", pinCountAtMax=");
        return a.a.r(sb3, this.f42211e, ")");
    }

    public /* synthetic */ tg0(Date date, Date date2, boolean z13, String str, boolean z14, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(date, (i13 & 2) != 0 ? date : date2, (i13 & 4) != 0 ? false : z13, (i13 & 8) != 0 ? ol2.f.f96454a.toString() : str, (i13 & 16) != 0 ? false : z14);
    }
}
