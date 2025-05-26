package oe;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final t f94195a;

    /* renamed from: b, reason: collision with root package name */
    public final u f94196b;

    public j(t section, u uVar) {
        Intrinsics.checkNotNullParameter(section, "section");
        this.f94195a = section;
        this.f94196b = uVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f94195a == jVar.f94195a && this.f94196b == jVar.f94196b;
    }

    public final int hashCode() {
        int hashCode = this.f94195a.hashCode() * 31;
        u uVar = this.f94196b;
        return hashCode + (uVar == null ? 0 : uVar.hashCode());
    }

    public final String toString() {
        return "SectionFieldMapping(section=" + this.f94195a + ", field=" + this.f94196b + ')';
    }
}
