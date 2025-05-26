package nx;

import h32.v2;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class u extends kg.a {

    /* renamed from: f, reason: collision with root package name */
    public final v2 f92468f;

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f92469g;

    public u(v2 impression) {
        Intrinsics.checkNotNullParameter(impression, "impression");
        this.f92468f = impression;
        this.f92469g = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return Intrinsics.d(this.f92468f, uVar.f92468f) && Intrinsics.d(this.f92469g, uVar.f92469g);
    }

    public final int hashCode() {
        int hashCode = this.f92468f.hashCode() * 31;
        HashMap hashMap = this.f92469g;
        return hashCode + (hashMap == null ? 0 : hashMap.hashCode());
    }

    public final String toString() {
        return "Story(impression=" + this.f92468f + ", storyAuxData=" + this.f92469g + ")";
    }
}
