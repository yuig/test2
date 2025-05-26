package tb;

import kb.s0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public String f116995a;

    /* renamed from: b, reason: collision with root package name */
    public s0 f116996b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return Intrinsics.d(this.f116995a, qVar.f116995a) && this.f116996b == qVar.f116996b;
    }

    public final int hashCode() {
        return this.f116996b.hashCode() + (this.f116995a.hashCode() * 31);
    }

    public final String toString() {
        return "IdAndState(id=" + this.f116995a + ", state=" + this.f116996b + ')';
    }
}
