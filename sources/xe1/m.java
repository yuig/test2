package xe1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class m extends f {

    /* renamed from: h, reason: collision with root package name */
    public final e f134745h;

    /* renamed from: i, reason: collision with root package name */
    public final g f134746i;

    /* renamed from: j, reason: collision with root package name */
    public final b f134747j;

    /* renamed from: k, reason: collision with root package name */
    public final a f134748k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(e spec, g gVar, b actionIconViewModel) {
        super(spec, d.f134693c, null, null, null, gVar, actionIconViewModel, 24);
        Intrinsics.checkNotNullParameter(spec, "spec");
        Intrinsics.checkNotNullParameter(actionIconViewModel, "actionIconViewModel");
        this.f134745h = spec;
        this.f134746i = gVar;
        this.f134747j = actionIconViewModel;
        this.f134748k = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return Intrinsics.d(this.f134745h, mVar.f134745h) && Intrinsics.d(this.f134746i, mVar.f134746i) && Intrinsics.d(this.f134747j, mVar.f134747j) && Intrinsics.d(this.f134748k, mVar.f134748k);
    }

    public final int hashCode() {
        int hashCode = this.f134745h.hashCode() * 31;
        g gVar = this.f134746i;
        int hashCode2 = (this.f134747j.hashCode() + ((hashCode + (gVar == null ? 0 : gVar.hashCode())) * 31)) * 31;
        a aVar = this.f134748k;
        return hashCode2 + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        return "IconActionStyleModel(spec=" + this.f134745h + ", actionTextModel=" + this.f134746i + ", actionIconViewModel=" + this.f134747j + ", backgroundViewModel=" + this.f134748k + ")";
    }
}
