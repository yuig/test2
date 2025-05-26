package u2;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class k implements q {

    /* renamed from: b, reason: collision with root package name */
    public final q f120037b;

    /* renamed from: c, reason: collision with root package name */
    public final q f120038c;

    public k(q qVar, q qVar2) {
        this.f120037b = qVar;
        this.f120038c = qVar2;
    }

    @Override // u2.q
    public final Object b(Object obj, Function2 function2) {
        return this.f120038c.b(this.f120037b.b(obj, function2), function2);
    }

    @Override // u2.q
    public final boolean c(Function1 function1) {
        return this.f120037b.c(function1) && this.f120038c.c(function1);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            k kVar = (k) obj;
            if (Intrinsics.d(this.f120037b, kVar.f120037b) && Intrinsics.d(this.f120038c, kVar.f120038c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f120038c.hashCode() * 31) + this.f120037b.hashCode();
    }

    public final String toString() {
        return ep.b.k(new StringBuilder("["), (String) b("", j.f120036i), ']');
    }
}
