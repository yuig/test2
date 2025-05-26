package nt;

import a.cb;
import com.pinterest.api.model.n90;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class r0 implements u0 {

    /* renamed from: a, reason: collision with root package name */
    public final n90 f92158a;

    /* renamed from: b, reason: collision with root package name */
    public final String f92159b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f92160c;

    public r0(n90 n90Var, String uid, LinkedHashSet questionsId) {
        Intrinsics.checkNotNullParameter(uid, "uid");
        Intrinsics.checkNotNullParameter(questionsId, "questionsId");
        this.f92158a = n90Var;
        this.f92159b = uid;
        this.f92160c = questionsId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        return Intrinsics.d(this.f92158a, r0Var.f92158a) && Intrinsics.d(this.f92159b, r0Var.f92159b) && Intrinsics.d(this.f92160c, r0Var.f92160c);
    }

    public final int hashCode() {
        n90 n90Var = this.f92158a;
        return this.f92160c.hashCode() + cb.d(this.f92159b, (n90Var == null ? 0 : n90Var.hashCode()) * 31, 31);
    }

    public final String toString() {
        return "LoadFormEffectRequest(promotedLeadForm=" + this.f92158a + ", uid=" + this.f92159b + ", questionsId=" + this.f92160c + ")";
    }
}
