package r72;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class q1 {

    /* renamed from: d, reason: collision with root package name */
    public static final q1 f106625d = new q1(null, null, b2.f106444a);

    /* renamed from: a, reason: collision with root package name */
    public final String f106626a;

    /* renamed from: b, reason: collision with root package name */
    public final e1 f106627b;

    /* renamed from: c, reason: collision with root package name */
    public final e2 f106628c;

    public q1(String str, e1 e1Var, e2 shuffleOverlay) {
        Intrinsics.checkNotNullParameter(shuffleOverlay, "shuffleOverlay");
        this.f106626a = str;
        this.f106627b = e1Var;
        this.f106628c = shuffleOverlay;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q1)) {
            return false;
        }
        q1 q1Var = (q1) obj;
        return Intrinsics.d(this.f106626a, q1Var.f106626a) && Intrinsics.d(this.f106627b, q1Var.f106627b) && Intrinsics.d(this.f106628c, q1Var.f106628c);
    }

    public final int hashCode() {
        String str = this.f106626a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        e1 e1Var = this.f106627b;
        return this.f106628c.hashCode() + ((hashCode + (e1Var != null ? e1Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "ShuffleEffectData(backgroundColor=" + this.f106626a + ", keyframeAnimation=" + this.f106627b + ", shuffleOverlay=" + this.f106628c + ")";
    }
}
