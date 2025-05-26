package zd1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c extends h {

    /* renamed from: a, reason: collision with root package name */
    public final t32.f f141690a;

    /* renamed from: b, reason: collision with root package name */
    public final q f141691b;

    /* renamed from: c, reason: collision with root package name */
    public final String f141692c;

    /* renamed from: d, reason: collision with root package name */
    public final String f141693d;

    /* renamed from: e, reason: collision with root package name */
    public final String f141694e;

    /* renamed from: f, reason: collision with root package name */
    public final String f141695f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f141696g;

    /* renamed from: h, reason: collision with root package name */
    public final int f141697h;

    /* renamed from: i, reason: collision with root package name */
    public final String f141698i;

    public c(t32.f fVar, q filterType, String str, String str2, String str3, String str4, boolean z13, int i13, String label) {
        Intrinsics.checkNotNullParameter(filterType, "filterType");
        Intrinsics.checkNotNullParameter(label, "label");
        this.f141690a = fVar;
        this.f141691b = filterType;
        this.f141692c = str;
        this.f141693d = str2;
        this.f141694e = str3;
        this.f141695f = str4;
        this.f141696g = z13;
        this.f141697h = i13;
        this.f141698i = label;
    }

    @Override // zd1.h
    public final h a() {
        boolean z13 = this.f141696g;
        q filterType = this.f141691b;
        Intrinsics.checkNotNullParameter(filterType, "filterType");
        String label = this.f141698i;
        Intrinsics.checkNotNullParameter(label, "label");
        return new c(this.f141690a, filterType, this.f141692c, this.f141693d, this.f141694e, this.f141695f, z13, this.f141697h, label);
    }

    @Override // zd1.h
    public final q b() {
        return this.f141691b;
    }

    @Override // zd1.h
    public final t32.f c() {
        return this.f141690a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f141690a == cVar.f141690a && this.f141691b == cVar.f141691b && Intrinsics.d(this.f141692c, cVar.f141692c) && Intrinsics.d(this.f141693d, cVar.f141693d) && Intrinsics.d(this.f141694e, cVar.f141694e) && Intrinsics.d(this.f141695f, cVar.f141695f) && this.f141696g == cVar.f141696g && this.f141697h == cVar.f141697h && Intrinsics.d(this.f141698i, cVar.f141698i);
    }

    public final int hashCode() {
        t32.f fVar = this.f141690a;
        int hashCode = (this.f141691b.hashCode() + ((fVar == null ? 0 : fVar.hashCode()) * 31)) * 31;
        String str = this.f141692c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f141693d;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f141694e;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f141695f;
        return this.f141698i.hashCode() + ep.b.b(this.f141697h, ep.b.e(this.f141696g, (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31, 31), 31);
    }

    public final String toString() {
        boolean z13 = this.f141696g;
        StringBuilder sb3 = new StringBuilder("ColorListFilterItem(thriftProductFilterType=");
        sb3.append(this.f141690a);
        sb3.append(", filterType=");
        sb3.append(this.f141691b);
        sb3.append(", topLeftColorHexString=");
        sb3.append(this.f141692c);
        sb3.append(", topRightColorHexString=");
        sb3.append(this.f141693d);
        sb3.append(", bottomLeftColorHexString=");
        sb3.append(this.f141694e);
        sb3.append(", bottomRightColorHexString=");
        sb3.append(this.f141695f);
        sb3.append(", isSelected=");
        sb3.append(z13);
        sb3.append(", index=");
        sb3.append(this.f141697h);
        sb3.append(", label=");
        return a.a.p(sb3, this.f141698i, ")");
    }
}
