package zd1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class i extends h {

    /* renamed from: a, reason: collision with root package name */
    public final t32.f f141728a;

    /* renamed from: b, reason: collision with root package name */
    public final q f141729b;

    /* renamed from: c, reason: collision with root package name */
    public final j f141730c;

    /* renamed from: d, reason: collision with root package name */
    public final String f141731d;

    public i(t32.f fVar, q filterType, j jVar, String str) {
        Intrinsics.checkNotNullParameter(filterType, "filterType");
        this.f141728a = fVar;
        this.f141729b = filterType;
        this.f141730c = jVar;
        this.f141731d = str;
    }

    @Override // zd1.h
    public final h a() {
        q filterType = this.f141729b;
        Intrinsics.checkNotNullParameter(filterType, "filterType");
        return new i(this.f141728a, filterType, this.f141730c, this.f141731d);
    }

    @Override // zd1.h
    public final q b() {
        return this.f141729b;
    }

    @Override // zd1.h
    public final t32.f c() {
        return this.f141728a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f141728a == iVar.f141728a && this.f141729b == iVar.f141729b && this.f141730c == iVar.f141730c && Intrinsics.d(this.f141731d, iVar.f141731d);
    }

    public final int hashCode() {
        t32.f fVar = this.f141728a;
        int hashCode = (this.f141729b.hashCode() + ((fVar == null ? 0 : fVar.hashCode()) * 31)) * 31;
        j jVar = this.f141730c;
        int hashCode2 = (hashCode + (jVar == null ? 0 : jVar.hashCode())) * 31;
        String str = this.f141731d;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "ProductFilterHeader(thriftProductFilterType=" + this.f141728a + ", filterType=" + this.f141729b + ", filterHeader=" + this.f141730c + ", filterHeaderText=" + this.f141731d + ")";
    }

    public /* synthetic */ i(q qVar, j jVar, String str, int i13) {
        this((t32.f) null, qVar, (i13 & 4) != 0 ? null : jVar, (i13 & 8) != 0 ? null : str);
    }
}
