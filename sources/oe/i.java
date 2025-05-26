package oe;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final t f94193a;

    /* renamed from: b, reason: collision with root package name */
    public final r f94194b;

    public i(t tVar, r field) {
        Intrinsics.checkNotNullParameter(field, "field");
        this.f94193a = tVar;
        this.f94194b = field;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f94193a == iVar.f94193a && this.f94194b == iVar.f94194b;
    }

    public final int hashCode() {
        t tVar = this.f94193a;
        return this.f94194b.hashCode() + ((tVar == null ? 0 : tVar.hashCode()) * 31);
    }

    public final String toString() {
        return "SectionCustomEventFieldMapping(section=" + this.f94193a + ", field=" + this.f94194b + ')';
    }
}
