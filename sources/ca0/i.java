package ca0;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import r72.q1;

/* loaded from: classes5.dex */
public final class i implements u {

    /* renamed from: a, reason: collision with root package name */
    public final String f27124a;

    /* renamed from: b, reason: collision with root package name */
    public final List f27125b;

    /* renamed from: c, reason: collision with root package name */
    public final q1 f27126c;

    public i(String collageId, List collageItems, q1 shuffleEffectData) {
        Intrinsics.checkNotNullParameter(collageId, "collageId");
        Intrinsics.checkNotNullParameter(collageItems, "collageItems");
        Intrinsics.checkNotNullParameter(shuffleEffectData, "shuffleEffectData");
        this.f27124a = collageId;
        this.f27125b = collageItems;
        this.f27126c = shuffleEffectData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Intrinsics.d(this.f27124a, iVar.f27124a) && Intrinsics.d(this.f27125b, iVar.f27125b) && Intrinsics.d(this.f27126c, iVar.f27126c);
    }

    public final int hashCode() {
        return this.f27126c.hashCode() + ep.b.c(this.f27125b, this.f27124a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "CollageLoaded(collageId=" + this.f27124a + ", collageItems=" + this.f27125b + ", shuffleEffectData=" + this.f27126c + ")";
    }
}
