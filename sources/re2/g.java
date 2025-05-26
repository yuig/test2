package re2;

import kotlin.jvm.internal.Intrinsics;
import wo2.m;

/* loaded from: classes2.dex */
public final class g {

    /* renamed from: d, reason: collision with root package name */
    public static final vb0.i f107698d = new vb0.i(14);

    /* renamed from: a, reason: collision with root package name */
    public final String f107699a;

    /* renamed from: b, reason: collision with root package name */
    public final m f107700b;

    /* renamed from: c, reason: collision with root package name */
    public final d f107701c;

    public g(String str, m mVar, d dVar) {
        this.f107699a = str;
        this.f107700b = mVar;
        this.f107701c = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Intrinsics.d(this.f107699a, gVar.f107699a) && Intrinsics.d(this.f107700b, gVar.f107700b) && this.f107701c == gVar.f107701c && Intrinsics.d(null, null);
    }

    public final int hashCode() {
        String str = this.f107699a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        m mVar = this.f107700b;
        int hashCode2 = (hashCode + (mVar == null ? 0 : mVar.hashCode())) * 31;
        d dVar = this.f107701c;
        return (hashCode2 + (dVar != null ? dVar.hashCode() : 0)) * 31;
    }

    public final String toString() {
        return "BinaryAnnotation(key=" + this.f107699a + ", value_=" + this.f107700b + ", annotation_type=" + this.f107701c + ", host=null)";
    }
}
