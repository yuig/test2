package bi1;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f22836a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f22837b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f22838c;

    /* renamed from: d, reason: collision with root package name */
    public final bc2.q f22839d;

    /* renamed from: e, reason: collision with root package name */
    public final List f22840e;

    public c(boolean z13, boolean z14, boolean z15, bc2.q qVar, List list) {
        this.f22836a = z13;
        this.f22837b = z14;
        this.f22838c = z15;
        this.f22839d = qVar;
        this.f22840e = list;
    }

    public static c e(c cVar, boolean z13, boolean z14, boolean z15, bc2.q qVar, List list, int i13) {
        if ((i13 & 1) != 0) {
            z13 = cVar.f22836a;
        }
        boolean z16 = z13;
        if ((i13 & 2) != 0) {
            z14 = cVar.f22837b;
        }
        boolean z17 = z14;
        if ((i13 & 4) != 0) {
            z15 = cVar.f22838c;
        }
        boolean z18 = z15;
        if ((i13 & 8) != 0) {
            qVar = cVar.f22839d;
        }
        bc2.q qVar2 = qVar;
        if ((i13 & 16) != 0) {
            list = cVar.f22840e;
        }
        cVar.getClass();
        return new c(z16, z17, z18, qVar2, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f22836a == cVar.f22836a && this.f22837b == cVar.f22837b && this.f22838c == cVar.f22838c && Intrinsics.d(this.f22839d, cVar.f22839d) && Intrinsics.d(this.f22840e, cVar.f22840e);
    }

    public final int hashCode() {
        int e13 = ep.b.e(this.f22838c, ep.b.e(this.f22837b, Boolean.hashCode(this.f22836a) * 31, 31), 31);
        bc2.q qVar = this.f22839d;
        int hashCode = (e13 + (qVar == null ? 0 : qVar.hashCode())) * 31;
        List list = this.f22840e;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("SbaVideoFullScreenDisplayState(isClosedCaptionsToggledOn=");
        sb3.append(this.f22836a);
        sb3.append(", showBoardPicker=");
        sb3.append(this.f22837b);
        sb3.append(", forceMute=");
        sb3.append(this.f22838c);
        sb3.append(", videoTracks=");
        sb3.append(this.f22839d);
        sb3.append(", musicAttributions=");
        return a.c.j(sb3, this.f22840e, ")");
    }
}
