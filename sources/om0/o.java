package om0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class o implements u50.o {

    /* renamed from: d, reason: collision with root package name */
    public static final o f96550d = new o(null, null, 7);

    /* renamed from: a, reason: collision with root package name */
    public final u50.i0 f96551a;

    /* renamed from: b, reason: collision with root package name */
    public final u50.i0 f96552b;

    /* renamed from: c, reason: collision with root package name */
    public final u50.i0 f96553c;

    public o(u50.i0 pinContentDisplay, u50.i0 sectionContentDisplay, int i13) {
        int i14 = i13 & 1;
        u50.h0 h0Var = u50.h0.f120562a;
        pinContentDisplay = i14 != 0 ? h0Var : pinContentDisplay;
        sectionContentDisplay = (i13 & 2) != 0 ? h0Var : sectionContentDisplay;
        u50.f0 contentSeparator = q.f96568c;
        Intrinsics.checkNotNullParameter(pinContentDisplay, "pinContentDisplay");
        Intrinsics.checkNotNullParameter(sectionContentDisplay, "sectionContentDisplay");
        Intrinsics.checkNotNullParameter(contentSeparator, "contentSeparator");
        this.f96551a = pinContentDisplay;
        this.f96552b = sectionContentDisplay;
        this.f96553c = contentSeparator;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return Intrinsics.d(this.f96551a, oVar.f96551a) && Intrinsics.d(this.f96552b, oVar.f96552b) && Intrinsics.d(this.f96553c, oVar.f96553c);
    }

    public final int hashCode() {
        return this.f96553c.hashCode() + ep.b.d(this.f96552b, this.f96551a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("BoardContentMetadataState(pinContentDisplay=");
        sb3.append(this.f96551a);
        sb3.append(", sectionContentDisplay=");
        sb3.append(this.f96552b);
        sb3.append(", contentSeparator=");
        return jq.b.k(sb3, this.f96553c, ")");
    }
}
