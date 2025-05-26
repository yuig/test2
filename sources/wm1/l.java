package wm1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class l extends n {

    /* renamed from: c, reason: collision with root package name */
    public final u50.i0 f130317c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f130318d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(u50.i0 text, boolean z13) {
        super(o.TEXT, true);
        Intrinsics.checkNotNullParameter(text, "text");
        this.f130317c = text;
        this.f130318d = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return Intrinsics.d(this.f130317c, lVar.f130317c) && this.f130318d == lVar.f130318d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f130318d) + (this.f130317c.hashCode() * 31);
    }

    public final String toString() {
        return "TextDisplayState(text=" + this.f130317c + ", supportLinks=" + this.f130318d + ")";
    }
}
