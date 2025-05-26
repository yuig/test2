package i01;

import h32.d4;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final d4 f70662a;

    /* renamed from: b, reason: collision with root package name */
    public final String f70663b;

    public k(d4 d4Var, String str) {
        this.f70662a = d4Var;
        this.f70663b = str;
    }

    public final d4 a() {
        return this.f70662a;
    }

    public final String b() {
        return this.f70663b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f70662a == kVar.f70662a && Intrinsics.d(this.f70663b, kVar.f70663b);
    }

    public final int hashCode() {
        d4 d4Var = this.f70662a;
        int hashCode = (d4Var == null ? 0 : d4Var.hashCode()) * 31;
        String str = this.f70663b;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "ExperienceContextData(navigationSourceView=" + this.f70662a + ", sourceSearchQuery=" + this.f70663b + ")";
    }
}
