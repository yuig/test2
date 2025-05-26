package z3;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f140658a;

    /* renamed from: b, reason: collision with root package name */
    public final xk2.g f140659b;

    public a(String str, xk2.g gVar) {
        this.f140658a = str;
        this.f140659b = gVar;
    }

    public final xk2.g a() {
        return this.f140659b;
    }

    public final String b() {
        return this.f140658a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f140658a, aVar.f140658a) && Intrinsics.d(this.f140659b, aVar.f140659b);
    }

    public final int hashCode() {
        String str = this.f140658a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        xk2.g gVar = this.f140659b;
        return hashCode + (gVar != null ? gVar.hashCode() : 0);
    }

    public final String toString() {
        return "AccessibilityAction(label=" + this.f140658a + ", action=" + this.f140659b + ')';
    }
}
