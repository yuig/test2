package xe1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d0 extends f {

    /* renamed from: h, reason: collision with root package name */
    public final e f134695h;

    /* renamed from: i, reason: collision with root package name */
    public final g f134696i;

    /* renamed from: j, reason: collision with root package name */
    public final a f134697j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(e spec, g actionTextModel, a backgroundViewModel) {
        super(spec, d.f134692b, backgroundViewModel, null, null, actionTextModel, null, 88);
        Intrinsics.checkNotNullParameter(spec, "spec");
        Intrinsics.checkNotNullParameter(actionTextModel, "actionTextModel");
        Intrinsics.checkNotNullParameter(backgroundViewModel, "backgroundViewModel");
        this.f134695h = spec;
        this.f134696i = actionTextModel;
        this.f134697j = backgroundViewModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return Intrinsics.d(this.f134695h, d0Var.f134695h) && Intrinsics.d(this.f134696i, d0Var.f134696i) && Intrinsics.d(this.f134697j, d0Var.f134697j);
    }

    public final int hashCode() {
        return this.f134697j.hashCode() + ((this.f134696i.hashCode() + (this.f134695h.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "TextOverlayActionStyleModel(spec=" + this.f134695h + ", actionTextModel=" + this.f134696i + ", backgroundViewModel=" + this.f134697j + ")";
    }
}
