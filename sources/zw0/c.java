package zw0;

import h32.i0;
import h32.v2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c implements f {

    /* renamed from: a, reason: collision with root package name */
    public final i0 f142903a;

    /* renamed from: b, reason: collision with root package name */
    public final v2 f142904b;

    public c(i0 pinalyticsContext, v2 storyImpression) {
        Intrinsics.checkNotNullParameter(pinalyticsContext, "pinalyticsContext");
        Intrinsics.checkNotNullParameter(storyImpression, "storyImpression");
        this.f142903a = pinalyticsContext;
        this.f142904b = storyImpression;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.d(this.f142903a, cVar.f142903a) && Intrinsics.d(this.f142904b, cVar.f142904b);
    }

    public final int hashCode() {
        return this.f142904b.hashCode() + (this.f142903a.hashCode() * 31);
    }

    public final String toString() {
        return "ExitTapped(pinalyticsContext=" + this.f142903a + ", storyImpression=" + this.f142904b + ")";
    }
}
