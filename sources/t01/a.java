package t01;

import h32.m2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final m2 f115710a;

    /* renamed from: b, reason: collision with root package name */
    public final String f115711b;

    public a(m2 impression, String str) {
        Intrinsics.checkNotNullParameter(impression, "impression");
        this.f115710a = impression;
        this.f115711b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f115710a, aVar.f115710a) && Intrinsics.d(this.f115711b, aVar.f115711b);
    }

    public final int hashCode() {
        int hashCode = this.f115710a.hashCode() * 31;
        String str = this.f115711b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "RelatedPinsFilterImpressionWrapper(impression=" + this.f115710a + ", storyId=" + this.f115711b + ")";
    }
}
