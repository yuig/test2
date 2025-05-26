package m62;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class m0 extends b1 {

    /* renamed from: a, reason: collision with root package name */
    public final k f86034a;

    public m0(k model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f86034a = model;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m0) && Intrinsics.d(this.f86034a, ((m0) obj).f86034a);
    }

    public final int hashCode() {
        return this.f86034a.hashCode();
    }

    public final String toString() {
        return "EffectSettingClicked(model=" + this.f86034a + ")";
    }
}
