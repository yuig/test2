package tg1;

import h32.v2;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final v2 f117589a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f117590b;

    public i(v2 impression, HashMap extraAuxData) {
        Intrinsics.checkNotNullParameter(impression, "impression");
        Intrinsics.checkNotNullParameter(extraAuxData, "extraAuxData");
        this.f117589a = impression;
        this.f117590b = extraAuxData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Intrinsics.d(this.f117589a, iVar.f117589a) && Intrinsics.d(this.f117590b, iVar.f117590b);
    }

    public final int hashCode() {
        return this.f117590b.hashCode() + (this.f117589a.hashCode() * 31);
    }

    public final String toString() {
        return "StoryImpressionWithAuxData(impression=" + this.f117589a + ", extraAuxData=" + this.f117590b + ")";
    }
}
