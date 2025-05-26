package m40;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f implements d {

    /* renamed from: d, reason: collision with root package name */
    public final String f85823d;

    /* renamed from: e, reason: collision with root package name */
    public final List f85824e;

    public f(String __typename, ArrayList data) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(data, "data");
        this.f85823d = __typename;
        this.f85824e = data;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Intrinsics.d(this.f85823d, fVar.f85823d) && Intrinsics.d(this.f85824e, fVar.f85824e);
    }

    public final int hashCode() {
        return this.f85824e.hashCode() + (this.f85823d.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("V3GetCountriesListV3GetCountriesListQuery(__typename=");
        sb3.append(this.f85823d);
        sb3.append(", data=");
        return a.c.j(sb3, this.f85824e, ")");
    }
}
