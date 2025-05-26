package h62;

import kotlin.jvm.internal.Intrinsics;
import r72.f2;
import r72.q1;

/* loaded from: classes4.dex */
public final class g extends h {

    /* renamed from: a, reason: collision with root package name */
    public final q1 f67834a;

    /* renamed from: b, reason: collision with root package name */
    public final q1 f67835b;

    public g(q1 oldEffectData, q1 newEffectData) {
        Intrinsics.checkNotNullParameter(oldEffectData, "oldEffectData");
        Intrinsics.checkNotNullParameter(newEffectData, "newEffectData");
        this.f67834a = oldEffectData;
        this.f67835b = newEffectData;
    }

    @Override // h62.h
    public final f2 a(f2 data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return f2.a(data, null, null, null, null, this.f67835b, 383);
    }

    @Override // h62.h
    public final Object b() {
        return new g(this.f67835b, this.f67834a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Intrinsics.d(this.f67834a, gVar.f67834a) && Intrinsics.d(this.f67835b, gVar.f67835b);
    }

    public final int hashCode() {
        return this.f67835b.hashCode() + (this.f67834a.hashCode() * 31);
    }

    public final String toString() {
        return "UpdateEffectData(oldEffectData=" + this.f67834a + ", newEffectData=" + this.f67835b + ")";
    }
}
