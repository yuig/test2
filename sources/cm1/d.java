package cm1;

import com.pinterest.gestalt.buttongroup.GestaltButtonGroup;
import kotlin.jvm.internal.Intrinsics;
import u50.o;

/* loaded from: classes5.dex */
public final class d implements o {

    /* renamed from: a, reason: collision with root package name */
    public final yl1.b f28012a;

    /* renamed from: b, reason: collision with root package name */
    public final yl1.b f28013b;

    /* renamed from: c, reason: collision with root package name */
    public final yl1.b f28014c;

    /* renamed from: d, reason: collision with root package name */
    public final yl1.c f28015d;

    /* renamed from: e, reason: collision with root package name */
    public final e f28016e;

    /* renamed from: f, reason: collision with root package name */
    public final fm1.c f28017f;

    /* renamed from: g, reason: collision with root package name */
    public final int f28018g;

    public d(yl1.b primaryButton, yl1.b secondaryButton, yl1.b bVar, yl1.c size, e orientation, fm1.c visibility, int i13) {
        Intrinsics.checkNotNullParameter(primaryButton, "primaryButton");
        Intrinsics.checkNotNullParameter(secondaryButton, "secondaryButton");
        Intrinsics.checkNotNullParameter(size, "size");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        this.f28012a = primaryButton;
        this.f28013b = secondaryButton;
        this.f28014c = bVar;
        this.f28015d = size;
        this.f28016e = orientation;
        this.f28017f = visibility;
        this.f28018g = i13;
    }

    public static d e(d dVar, yl1.b bVar, yl1.b bVar2, yl1.c cVar, e eVar, fm1.c cVar2, int i13) {
        if ((i13 & 1) != 0) {
            bVar = dVar.f28012a;
        }
        yl1.b primaryButton = bVar;
        if ((i13 & 2) != 0) {
            bVar2 = dVar.f28013b;
        }
        yl1.b secondaryButton = bVar2;
        yl1.b bVar3 = dVar.f28014c;
        if ((i13 & 8) != 0) {
            cVar = dVar.f28015d;
        }
        yl1.c size = cVar;
        if ((i13 & 16) != 0) {
            eVar = dVar.f28016e;
        }
        e orientation = eVar;
        if ((i13 & 32) != 0) {
            cVar2 = dVar.f28017f;
        }
        fm1.c visibility = cVar2;
        int i14 = dVar.f28018g;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(primaryButton, "primaryButton");
        Intrinsics.checkNotNullParameter(secondaryButton, "secondaryButton");
        Intrinsics.checkNotNullParameter(size, "size");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        return new d(primaryButton, secondaryButton, bVar3, size, orientation, visibility, i14);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.d(this.f28012a, dVar.f28012a) && Intrinsics.d(this.f28013b, dVar.f28013b) && Intrinsics.d(this.f28014c, dVar.f28014c) && this.f28015d == dVar.f28015d && this.f28016e == dVar.f28016e && this.f28017f == dVar.f28017f && this.f28018g == dVar.f28018g;
    }

    public final int hashCode() {
        int hashCode = (this.f28013b.hashCode() + (this.f28012a.hashCode() * 31)) * 31;
        yl1.b bVar = this.f28014c;
        return Integer.hashCode(this.f28018g) + d7.g.a(this.f28017f, (this.f28016e.hashCode() + ((this.f28015d.hashCode() + ((hashCode + (bVar == null ? 0 : bVar.hashCode())) * 31)) * 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("DisplayState(primaryButton=");
        sb3.append(this.f28012a);
        sb3.append(", secondaryButton=");
        sb3.append(this.f28013b);
        sb3.append(", tertiaryButton=");
        sb3.append(this.f28014c);
        sb3.append(", size=");
        sb3.append(this.f28015d);
        sb3.append(", orientation=");
        sb3.append(this.f28016e);
        sb3.append(", visibility=");
        sb3.append(this.f28017f);
        sb3.append(", id=");
        return a.a.n(sb3, this.f28018g, ")");
    }

    public d(yl1.b bVar, yl1.b bVar2, yl1.b bVar3, yl1.c cVar, e eVar, fm1.c cVar2, int i13, int i14) {
        this(bVar, bVar2, (i14 & 4) != 0 ? null : bVar3, (i14 & 8) != 0 ? GestaltButtonGroup.f49333k : cVar, (i14 & 16) != 0 ? GestaltButtonGroup.f49332j : eVar, cVar2, (i14 & 64) != 0 ? Integer.MIN_VALUE : i13);
    }
}
