package m62;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class t extends v {

    /* renamed from: a, reason: collision with root package name */
    public final kg.q f86057a;

    public t(kg.q title) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f86057a = title;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t) && Intrinsics.d(this.f86057a, ((t) obj).f86057a);
    }

    public final int hashCode() {
        return this.f86057a.hashCode();
    }

    public final String toString() {
        return "EffectSettings(title=" + this.f86057a + ")";
    }
}
