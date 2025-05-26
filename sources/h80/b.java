package h80;

import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final String f68080a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f68081b;

    /* renamed from: c, reason: collision with root package name */
    public final List f68082c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f68083d;

    public b(String generatedImageUrl, boolean z13, List styles, HashMap auxData) {
        Intrinsics.checkNotNullParameter(generatedImageUrl, "generatedImageUrl");
        Intrinsics.checkNotNullParameter(styles, "styles");
        Intrinsics.checkNotNullParameter(auxData, "auxData");
        this.f68080a = generatedImageUrl;
        this.f68081b = z13;
        this.f68082c = styles;
        this.f68083d = auxData;
    }

    public static b e(b bVar, String generatedImageUrl, boolean z13, List styles, HashMap auxData, int i13) {
        if ((i13 & 1) != 0) {
            generatedImageUrl = bVar.f68080a;
        }
        if ((i13 & 2) != 0) {
            z13 = bVar.f68081b;
        }
        if ((i13 & 4) != 0) {
            styles = bVar.f68082c;
        }
        if ((i13 & 8) != 0) {
            auxData = bVar.f68083d;
        }
        bVar.getClass();
        Intrinsics.checkNotNullParameter(generatedImageUrl, "generatedImageUrl");
        Intrinsics.checkNotNullParameter(styles, "styles");
        Intrinsics.checkNotNullParameter(auxData, "auxData");
        return new b(generatedImageUrl, z13, styles, auxData);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.f68080a, bVar.f68080a) && this.f68081b == bVar.f68081b && Intrinsics.d(this.f68082c, bVar.f68082c) && Intrinsics.d(this.f68083d, bVar.f68083d);
    }

    public final int hashCode() {
        return this.f68083d.hashCode() + ep.b.c(this.f68082c, ep.b.e(this.f68081b, this.f68080a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ImageVisualizationDisplayState(generatedImageUrl=");
        sb3.append(this.f68080a);
        sb3.append(", isLoading=");
        sb3.append(this.f68081b);
        sb3.append(", styles=");
        sb3.append(this.f68082c);
        sb3.append(", auxData=");
        return jq.b.f(sb3, this.f68083d, ")");
    }
}
