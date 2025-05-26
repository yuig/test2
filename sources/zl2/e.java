package zl2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class e implements wn2.a {

    /* renamed from: a, reason: collision with root package name */
    public static final e f142120a = new e();

    public static am2.g b(am2.g mutable) {
        Intrinsics.checkNotNullParameter(mutable, "mutable");
        ym2.c cVar = (ym2.c) d.f142115j.get(bn2.e.h(mutable));
        if (cVar != null) {
            am2.g i13 = fn2.d.e(mutable).i(cVar);
            Intrinsics.checkNotNullExpressionValue(i13, "getBuiltInClassByFqName(...)");
            return i13;
        }
        throw new IllegalArgumentException("Given class " + mutable + " is not a mutable collection");
    }

    public static am2.g c(am2.g readOnly) {
        Intrinsics.checkNotNullParameter(readOnly, "readOnly");
        ym2.e h10 = bn2.e.h(readOnly);
        String str = d.f142106a;
        ym2.c cVar = (ym2.c) d.f142116k.get(h10);
        if (cVar != null) {
            am2.g i13 = fn2.d.e(readOnly).i(cVar);
            Intrinsics.checkNotNullExpressionValue(i13, "getBuiltInClassByFqName(...)");
            return i13;
        }
        throw new IllegalArgumentException("Given class " + readOnly + " is not a read-only collection");
    }

    public static am2.g d(ym2.c fqName, xl2.l builtIns) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Intrinsics.checkNotNullParameter(builtIns, "builtIns");
        String str = d.f142106a;
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        ym2.b bVar = (ym2.b) d.f142113h.get(fqName.i());
        if (bVar != null) {
            return builtIns.i(bVar.b());
        }
        return null;
    }

    @Override // wn2.a
    public Iterable a(Object obj) {
        rl2.u[] uVarArr = r.f142144h;
        return ((am2.d) obj).o0().h();
    }
}
