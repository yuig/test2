package wm1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f extends n {

    /* renamed from: c, reason: collision with root package name */
    public final b f130285c;

    /* renamed from: d, reason: collision with root package name */
    public final u50.i0 f130286d;

    /* renamed from: e, reason: collision with root package name */
    public final bm1.n f130287e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f130288f;

    public /* synthetic */ f(b bVar, u50.f0 f0Var, bm1.n nVar, int i13) {
        this(bVar, (u50.i0) ((i13 & 2) != 0 ? new u50.f0("") : f0Var), (i13 & 4) != 0 ? bm1.n.UNSELECTED : nVar, true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f130285c == fVar.f130285c && Intrinsics.d(this.f130286d, fVar.f130286d) && this.f130287e == fVar.f130287e && this.f130288f == fVar.f130288f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f130288f) + ((this.f130287e.hashCode() + ep.b.d(this.f130286d, this.f130285c.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "ButtonToggleDisplayState(buttonType=" + this.f130285c + ", buttonText=" + this.f130286d + ", selectedState=" + this.f130287e + ", enabled=" + this.f130288f + ")";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(b buttonType, u50.i0 buttonText, bm1.n selectedState, boolean z13) {
        super(o.BUTTONTOGGLE, z13);
        Intrinsics.checkNotNullParameter(buttonType, "buttonType");
        Intrinsics.checkNotNullParameter(buttonText, "buttonText");
        Intrinsics.checkNotNullParameter(selectedState, "selectedState");
        this.f130285c = buttonType;
        this.f130286d = buttonText;
        this.f130287e = selectedState;
        this.f130288f = z13;
    }
}
