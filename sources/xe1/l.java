package xe1;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class l extends f {

    /* renamed from: h, reason: collision with root package name */
    public final e f134742h;

    /* renamed from: i, reason: collision with root package name */
    public final g f134743i;

    /* renamed from: j, reason: collision with root package name */
    public final a f134744j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(e spec, g gVar, a aVar) {
        super(spec, d.f134694d, aVar, null, gVar, null, null, RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_PEAR_STYLES_MODULE);
        Intrinsics.checkNotNullParameter(spec, "spec");
        this.f134742h = spec;
        this.f134743i = gVar;
        this.f134744j = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return Intrinsics.d(this.f134742h, lVar.f134742h) && Intrinsics.d(this.f134743i, lVar.f134743i) && Intrinsics.d(this.f134744j, lVar.f134744j);
    }

    public final int hashCode() {
        int hashCode = this.f134742h.hashCode() * 31;
        g gVar = this.f134743i;
        int hashCode2 = (hashCode + (gVar == null ? 0 : gVar.hashCode())) * 31;
        a aVar = this.f134744j;
        return hashCode2 + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        return "ButtonActionStyleModel(spec=" + this.f134742h + ", actionTextModel=" + this.f134743i + ", backgroundViewModel=" + this.f134744j + ")";
    }
}
