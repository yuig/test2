package re1;

import com.pinterest.api.model.bj;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final String f107608a;

    /* renamed from: b, reason: collision with root package name */
    public final bj f107609b;

    /* renamed from: c, reason: collision with root package name */
    public final e f107610c;

    /* renamed from: d, reason: collision with root package name */
    public final i f107611d;

    /* renamed from: e, reason: collision with root package name */
    public final d f107612e;

    public j(String storyId, bj bjVar, e eVar, i footerDimensionsSpec, d dVar) {
        Intrinsics.checkNotNullParameter(storyId, "storyId");
        Intrinsics.checkNotNullParameter(footerDimensionsSpec, "footerDimensionsSpec");
        this.f107608a = storyId;
        this.f107609b = bjVar;
        this.f107610c = eVar;
        this.f107611d = footerDimensionsSpec;
        this.f107612e = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Intrinsics.d(this.f107608a, jVar.f107608a) && Intrinsics.d(this.f107609b, jVar.f107609b) && Intrinsics.d(this.f107610c, jVar.f107610c) && Intrinsics.d(this.f107611d, jVar.f107611d) && Intrinsics.d(this.f107612e, jVar.f107612e);
    }

    public final int hashCode() {
        int hashCode = this.f107608a.hashCode() * 31;
        bj bjVar = this.f107609b;
        int hashCode2 = (hashCode + (bjVar == null ? 0 : bjVar.hashCode())) * 31;
        e eVar = this.f107610c;
        int hashCode3 = (this.f107611d.hashCode() + ((hashCode2 + (eVar == null ? 0 : eVar.hashCode())) * 31)) * 31;
        d dVar = this.f107612e;
        return hashCode3 + (dVar != null ? dVar.hashCode() : 0);
    }

    public final String toString() {
        return "FooterModel(storyId=" + this.f107608a + ", footerDisplay=" + this.f107609b + ", action=" + this.f107610c + ", footerDimensionsSpec=" + this.f107611d + ", headerUserViewModel=" + this.f107612e + ")";
    }
}
