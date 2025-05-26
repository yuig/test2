package com.pinterest.partnerAnalytics.feature.analytics.closeup.analyticsGraph.model;

import com.github.mikephil.charting.data.Entry;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/pinterest/partnerAnalytics/feature/analytics/closeup/analyticsGraph/model/CustomEntry;", "Lcom/github/mikephil/charting/data/Entry;", "partnerAnalytics_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class CustomEntry extends Entry {

    /* renamed from: d, reason: collision with root package name */
    public final long f50116d;

    /* renamed from: e, reason: collision with root package name */
    public final String f50117e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f50118f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomEntry(float f13, float f14, long j13, String dataStatus, boolean z13) {
        super(f14);
        Intrinsics.checkNotNullParameter(dataStatus, "dataStatus");
        this.f30176c = f13;
        this.f50116d = j13;
        this.f50117e = dataStatus;
        this.f50118f = z13;
    }

    /* renamed from: d, reason: from getter */
    public final String getF50117e() {
        return this.f50117e;
    }

    /* renamed from: e, reason: from getter */
    public final boolean getF50118f() {
        return this.f50118f;
    }

    /* renamed from: f, reason: from getter */
    public final long getF50116d() {
        return this.f50116d;
    }
}
