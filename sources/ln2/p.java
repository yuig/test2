package ln2;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import tm2.s0;

/* loaded from: classes2.dex */
public final class p implements q, t, v, n, u {

    /* renamed from: b, reason: collision with root package name */
    public static final p f84127b = new p();

    /* renamed from: c, reason: collision with root package name */
    public static final p f84128c = new p();

    /* renamed from: d, reason: collision with root package name */
    public static final p f84129d = new p();

    /* renamed from: e, reason: collision with root package name */
    public static final p f84130e = new p();

    /* renamed from: f, reason: collision with root package name */
    public static final p f84131f = new p();

    public static /* synthetic */ void e(int i13) {
        Object[] objArr = new Object[3];
        if (i13 != 1) {
            objArr[0] = "descriptor";
        } else {
            objArr[0] = "unresolvedSuperClasses";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/serialization/deserialization/ErrorReporter$1";
        if (i13 != 2) {
            objArr[2] = "reportIncompleteHierarchy";
        } else {
            objArr[2] = "reportCannotInferVisibility";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static am2.c0 f(tm2.c0 c0Var) {
        int i13 = c0Var == null ? -1 : f0.f84078a[c0Var.ordinal()];
        return i13 != 1 ? i13 != 2 ? i13 != 3 ? i13 != 4 ? am2.c0.FINAL : am2.c0.SEALED : am2.c0.ABSTRACT : am2.c0.OPEN : am2.c0.FINAL;
    }

    @Override // ln2.u
    public void a(dm2.b bVar, ArrayList arrayList) {
        if (bVar != null) {
            return;
        }
        e(0);
        throw null;
    }

    @Override // ln2.v
    public pn2.b0 b(s0 proto, String flexibleId, pn2.h0 lowerBound, pn2.h0 upperBound) {
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(flexibleId, "flexibleId");
        Intrinsics.checkNotNullParameter(lowerBound, "lowerBound");
        Intrinsics.checkNotNullParameter(upperBound, "upperBound");
        throw new IllegalArgumentException("This method should not be used.");
    }

    @Override // ln2.u
    public void c(am2.d dVar) {
        if (dVar != null) {
            return;
        }
        e(2);
        throw null;
    }

    @Override // ln2.t
    public Boolean d() {
        return null;
    }
}
