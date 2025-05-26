package d20;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f53641a;

    /* renamed from: b, reason: collision with root package name */
    public final String f53642b;

    public b(String message, String featureId) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter("Freeform", "type");
        Intrinsics.checkNotNullParameter("ANDROID", "platform");
        Intrinsics.checkNotNullParameter(featureId, "featureId");
        Intrinsics.checkNotNullParameter("analytics", "productId");
        this.f53641a = message;
        this.f53642b = featureId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.f53641a, bVar.f53641a) && Intrinsics.d("Freeform", "Freeform") && Intrinsics.d("ANDROID", "ANDROID") && Intrinsics.d(this.f53642b, bVar.f53642b) && Intrinsics.d("analytics", "analytics");
    }

    public final int hashCode() {
        return ((this.f53642b.hashCode() + (((((this.f53641a.hashCode() * 31) - 1473154736) * 31) - 143408561) * 31)) * 31) - 1693017210;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("FeedbackRequestParameters(message=");
        sb3.append(this.f53641a);
        sb3.append(", type=Freeform, platform=ANDROID, featureId=");
        return a.a.p(sb3, this.f53642b, ", productId=analytics)");
    }
}
