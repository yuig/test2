package oq;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class d1 {

    /* renamed from: a, reason: collision with root package name */
    public final wk2.a f97006a;

    /* renamed from: b, reason: collision with root package name */
    public final uk1.d f97007b;

    /* renamed from: c, reason: collision with root package name */
    public final String f97008c;

    /* renamed from: d, reason: collision with root package name */
    public final a11.b f97009d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f97010e;

    /* renamed from: f, reason: collision with root package name */
    public final String f97011f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f97012g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f97013h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f97014i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f97015j;

    public d1(wk2.a storyPinDisplayPresenterFactory, uk1.d presenterPinalytics, String str, a11.b bVar, boolean z13, String str2, boolean z14, boolean z15, boolean z16, boolean z17) {
        Intrinsics.checkNotNullParameter(storyPinDisplayPresenterFactory, "storyPinDisplayPresenterFactory");
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        this.f97006a = storyPinDisplayPresenterFactory;
        this.f97007b = presenterPinalytics;
        this.f97008c = str;
        this.f97009d = bVar;
        this.f97010e = z13;
        this.f97011f = str2;
        this.f97012g = z14;
        this.f97013h = z15;
        this.f97014i = z16;
        this.f97015j = z17;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d1)) {
            return false;
        }
        d1 d1Var = (d1) obj;
        return Intrinsics.d(this.f97006a, d1Var.f97006a) && Intrinsics.d(this.f97007b, d1Var.f97007b) && Intrinsics.d(this.f97008c, d1Var.f97008c) && this.f97009d == d1Var.f97009d && this.f97010e == d1Var.f97010e && Intrinsics.d(this.f97011f, d1Var.f97011f) && this.f97012g == d1Var.f97012g && this.f97013h == d1Var.f97013h && this.f97014i == d1Var.f97014i && this.f97015j == d1Var.f97015j;
    }

    public final int hashCode() {
        int hashCode = (this.f97007b.hashCode() + (this.f97006a.hashCode() * 31)) * 31;
        String str = this.f97008c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        a11.b bVar = this.f97009d;
        int e13 = ep.b.e(this.f97010e, (hashCode2 + (bVar == null ? 0 : bVar.hashCode())) * 31, 31);
        String str2 = this.f97011f;
        return Boolean.hashCode(this.f97015j) + ep.b.e(this.f97014i, ep.b.e(this.f97013h, ep.b.e(this.f97012g, (e13 + (str2 != null ? str2.hashCode() : 0)) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("StoryPinExpressiveCloseupParams(storyPinDisplayPresenterFactory=");
        sb3.append(this.f97006a);
        sb3.append(", presenterPinalytics=");
        sb3.append(this.f97007b);
        sb3.append(", feedTrackingParams=");
        sb3.append(this.f97008c);
        sb3.append(", arrivalMethod=");
        sb3.append(this.f97009d);
        sb3.append(", isAdPreview=");
        sb3.append(this.f97010e);
        sb3.append(", navigationSource=");
        sb3.append(this.f97011f);
        sb3.append(", isInIdeaPinsInCloseupExperiment=");
        sb3.append(this.f97012g);
        sb3.append(", shouldShowUnifiedActionBar=");
        sb3.append(this.f97013h);
        sb3.append(", isComingFromIdeaStream=");
        sb3.append(this.f97014i);
        sb3.append(", isCloseupRedesignEnabled=");
        return a.a.r(sb3, this.f97015j, ")");
    }
}
