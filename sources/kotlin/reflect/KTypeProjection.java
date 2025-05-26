package kotlin.reflect;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rl2.v;
import rl2.x;
import rl2.y;
import rl2.z;
import ul2.q1;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/reflect/KTypeProjection;", "", "c", "rl2/x", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final /* data */ class KTypeProjection {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public static final x f80456c = new x(null);

    /* renamed from: d, reason: collision with root package name */
    public static final KTypeProjection f80457d = new KTypeProjection(null, null);

    /* renamed from: a, reason: collision with root package name */
    public final z f80458a;

    /* renamed from: b, reason: collision with root package name */
    public final v f80459b;

    public KTypeProjection(z zVar, q1 q1Var) {
        String str;
        this.f80458a = zVar;
        this.f80459b = q1Var;
        if ((zVar == null) == (q1Var == null)) {
            return;
        }
        if (zVar == null) {
            str = "Star projection must have no type specified.";
        } else {
            str = "The projection variance " + zVar + " requires type to be specified.";
        }
        throw new IllegalArgumentException(str.toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KTypeProjection)) {
            return false;
        }
        KTypeProjection kTypeProjection = (KTypeProjection) obj;
        return this.f80458a == kTypeProjection.f80458a && Intrinsics.d(this.f80459b, kTypeProjection.f80459b);
    }

    public final int hashCode() {
        z zVar = this.f80458a;
        int hashCode = (zVar == null ? 0 : zVar.hashCode()) * 31;
        v vVar = this.f80459b;
        return hashCode + (vVar != null ? vVar.hashCode() : 0);
    }

    public final String toString() {
        z zVar = this.f80458a;
        int i13 = zVar == null ? -1 : y.f108679a[zVar.ordinal()];
        if (i13 == -1) {
            return "*";
        }
        v vVar = this.f80459b;
        if (i13 == 1) {
            return String.valueOf(vVar);
        }
        if (i13 == 2) {
            return "in " + vVar;
        }
        if (i13 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return "out " + vVar;
    }
}
