package zy;

import kotlin.jvm.internal.Intrinsics;
import nx.v0;

/* loaded from: classes3.dex */
public final class j implements l {

    /* renamed from: a, reason: collision with root package name */
    public final v0 f143081a;

    public j(v0 impression) {
        Intrinsics.checkNotNullParameter(impression, "impression");
        this.f143081a = impression;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && Intrinsics.d(this.f143081a, ((j) obj).f143081a);
    }

    public final int hashCode() {
        return this.f143081a.hashCode();
    }

    public final String toString() {
        return "EndImpression(impression=" + this.f143081a + ")";
    }
}
