package mw1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public final String f88442a;

    /* renamed from: b, reason: collision with root package name */
    public final int f88443b;

    public m(String str, int i13) {
        this.f88442a = str;
        this.f88443b = i13;
    }

    public final int a() {
        return this.f88443b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.d(getClass(), obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.g(obj, "null cannot be cast to non-null type com.pinterest.partnerAnalytics.feature.analytics.closeup.analyticsGraph.model.MetricSplitTypes");
        return Intrinsics.d(this.f88442a, ((m) obj).f88442a);
    }

    public int hashCode() {
        return this.f88442a.hashCode();
    }
}
