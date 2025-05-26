package zy;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class w implements y {

    /* renamed from: a, reason: collision with root package name */
    public final n f143119a;

    public w(n impressionParams) {
        Intrinsics.checkNotNullParameter(impressionParams, "impressionParams");
        this.f143119a = impressionParams;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w) && Intrinsics.d(this.f143119a, ((w) obj).f143119a);
    }

    public final int hashCode() {
        return this.f143119a.hashCode();
    }

    public final String toString() {
        return "RecordShuffleImpression(impressionParams=" + this.f143119a + ")";
    }
}
