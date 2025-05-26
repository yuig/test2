package zd1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e extends h {

    /* renamed from: a, reason: collision with root package name */
    public final t32.f f141704a;

    /* renamed from: b, reason: collision with root package name */
    public final q f141705b;

    public e(t32.f fVar, q filterType) {
        Intrinsics.checkNotNullParameter(filterType, "filterType");
        this.f141704a = fVar;
        this.f141705b = filterType;
    }

    @Override // zd1.h
    public final h a() {
        q filterType = this.f141705b;
        Intrinsics.checkNotNullParameter(filterType, "filterType");
        return new e(this.f141704a, filterType);
    }

    @Override // zd1.h
    public final q b() {
        return this.f141705b;
    }

    @Override // zd1.h
    public final t32.f c() {
        return this.f141704a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f141704a == eVar.f141704a && this.f141705b == eVar.f141705b;
    }

    public final int hashCode() {
        t32.f fVar = this.f141704a;
        return this.f141705b.hashCode() + ((fVar == null ? 0 : fVar.hashCode()) * 31);
    }

    public final String toString() {
        return "FilterDivider(thriftProductFilterType=" + this.f141704a + ", filterType=" + this.f141705b + ")";
    }
}
