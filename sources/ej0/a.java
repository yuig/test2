package ej0;

import kotlin.jvm.internal.Intrinsics;
import u50.f0;
import u50.i0;
import u50.o;

/* loaded from: classes5.dex */
public final class a implements o {

    /* renamed from: a, reason: collision with root package name */
    public final String f59075a;

    /* renamed from: b, reason: collision with root package name */
    public final i0 f59076b;

    /* renamed from: c, reason: collision with root package name */
    public final i0 f59077c;

    /* renamed from: d, reason: collision with root package name */
    public final i0 f59078d;

    /* renamed from: e, reason: collision with root package name */
    public final c f59079e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f59080f;

    public a(String str, f0 f0Var, f0 f0Var2, f0 f0Var3, c metadata, int i13) {
        str = (i13 & 1) != 0 ? null : str;
        f0Var = (i13 & 2) != 0 ? null : f0Var;
        f0Var2 = (i13 & 4) != 0 ? null : f0Var2;
        f0Var3 = (i13 & 8) != 0 ? null : f0Var3;
        metadata = (i13 & 16) != 0 ? c.f59081f : metadata;
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        this.f59075a = str;
        this.f59076b = f0Var;
        this.f59077c = f0Var2;
        this.f59078d = f0Var3;
        this.f59079e = metadata;
        this.f59080f = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f59075a, aVar.f59075a) && Intrinsics.d(this.f59076b, aVar.f59076b) && Intrinsics.d(this.f59077c, aVar.f59077c) && Intrinsics.d(this.f59078d, aVar.f59078d) && Intrinsics.d(this.f59079e, aVar.f59079e) && this.f59080f == aVar.f59080f;
    }

    public final int hashCode() {
        String str = this.f59075a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        i0 i0Var = this.f59076b;
        int hashCode2 = (hashCode + (i0Var == null ? 0 : i0Var.hashCode())) * 31;
        i0 i0Var2 = this.f59077c;
        int hashCode3 = (hashCode2 + (i0Var2 == null ? 0 : i0Var2.hashCode())) * 31;
        i0 i0Var3 = this.f59078d;
        return Boolean.hashCode(this.f59080f) + ((this.f59079e.hashCode() + ((hashCode3 + (i0Var3 != null ? i0Var3.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        return "BoardHeaderDisplayState(coverImageUrl=" + this.f59075a + ", title=" + this.f59076b + ", subtitle=" + this.f59077c + ", description=" + this.f59078d + ", metadata=" + this.f59079e + ", isEnabled=" + this.f59080f + ")";
    }
}
