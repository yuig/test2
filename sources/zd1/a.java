package zd1;

import a.cb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a extends h {

    /* renamed from: a, reason: collision with root package name */
    public final t32.f f141678a;

    /* renamed from: b, reason: collision with root package name */
    public final q f141679b;

    /* renamed from: c, reason: collision with root package name */
    public final String f141680c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f141681d;

    public a(t32.f fVar, q filterType, String label, boolean z13) {
        Intrinsics.checkNotNullParameter(filterType, "filterType");
        Intrinsics.checkNotNullParameter(label, "label");
        this.f141678a = fVar;
        this.f141679b = filterType;
        this.f141680c = label;
        this.f141681d = z13;
    }

    @Override // zd1.h
    public final h a() {
        q filterType = this.f141679b;
        Intrinsics.checkNotNullParameter(filterType, "filterType");
        String label = this.f141680c;
        Intrinsics.checkNotNullParameter(label, "label");
        return new a(this.f141678a, filterType, label, this.f141681d);
    }

    @Override // zd1.h
    public final q b() {
        return this.f141679b;
    }

    @Override // zd1.h
    public final t32.f c() {
        return this.f141678a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f141678a == aVar.f141678a && this.f141679b == aVar.f141679b && Intrinsics.d(this.f141680c, aVar.f141680c) && this.f141681d == aVar.f141681d;
    }

    public final int hashCode() {
        t32.f fVar = this.f141678a;
        return Boolean.hashCode(this.f141681d) + cb.d(this.f141680c, (this.f141679b.hashCode() + ((fVar == null ? 0 : fVar.hashCode()) * 31)) * 31, 31);
    }

    public final String toString() {
        return "CategoryFilter(thriftProductFilterType=" + this.f141678a + ", filterType=" + this.f141679b + ", label=" + this.f141680c + ", isSelected=" + this.f141681d + ")";
    }
}
