package e72;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@no2.g
/* loaded from: classes4.dex */
public final class o {

    @NotNull
    public static final n Companion = new n();

    /* renamed from: c, reason: collision with root package name */
    public static final no2.b[] f57680c = {null, new qo2.d(j.f57662a, 0)};

    /* renamed from: a, reason: collision with root package name */
    public final String f57681a;

    /* renamed from: b, reason: collision with root package name */
    public final List f57682b;

    public o(int i13, String str, List list) {
        if (3 != (i13 & 3)) {
            kg.t.b1(i13, 3, m.f57679b);
            throw null;
        }
        this.f57681a = str;
        this.f57682b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return Intrinsics.d(this.f57681a, oVar.f57681a) && Intrinsics.d(this.f57682b, oVar.f57682b);
    }

    public final int hashCode() {
        return this.f57682b.hashCode() + (this.f57681a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ProductPinDataEntity(id=");
        sb3.append(this.f57681a);
        sb3.append(", items=");
        return a.c.j(sb3, this.f57682b, ")");
    }
}
