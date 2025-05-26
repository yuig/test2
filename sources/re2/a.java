package re2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static final vb0.i f107689d = new vb0.i(13);

    /* renamed from: a, reason: collision with root package name */
    public final Long f107690a;

    /* renamed from: b, reason: collision with root package name */
    public final String f107691b;

    /* renamed from: c, reason: collision with root package name */
    public final i f107692c;

    public a(Long l13, String str, i iVar) {
        this.f107690a = l13;
        this.f107691b = str;
        this.f107692c = iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f107690a, aVar.f107690a) && Intrinsics.d(this.f107691b, aVar.f107691b) && Intrinsics.d(this.f107692c, aVar.f107692c);
    }

    public final int hashCode() {
        Long l13 = this.f107690a;
        int hashCode = (l13 == null ? 0 : l13.hashCode()) * 31;
        String str = this.f107691b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        i iVar = this.f107692c;
        return hashCode2 + (iVar != null ? iVar.hashCode() : 0);
    }

    public final String toString() {
        return "Annotation(timestamp=" + this.f107690a + ", value_=" + this.f107691b + ", host=" + this.f107692c + ")";
    }
}
