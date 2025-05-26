package rm2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class s implements ln2.i {

    /* renamed from: a, reason: collision with root package name */
    public final b0 f108786a;

    /* renamed from: b, reason: collision with root package name */
    public final r f108787b;

    public s(fm2.d kotlinClassFinder, r deserializedDescriptorResolver) {
        Intrinsics.checkNotNullParameter(kotlinClassFinder, "kotlinClassFinder");
        Intrinsics.checkNotNullParameter(deserializedDescriptorResolver, "deserializedDescriptorResolver");
        this.f108786a = kotlinClassFinder;
        this.f108787b = deserializedDescriptorResolver;
    }

    @Override // ln2.i
    public final ln2.h a(ym2.b classId) {
        Intrinsics.checkNotNullParameter(classId, "classId");
        r rVar = this.f108787b;
        f0 n03 = dl2.b.n0(this.f108786a, classId, wn2.k.i(rVar.c().f84110c));
        if (n03 == null) {
            return null;
        }
        Intrinsics.d(gm2.d.a(((fm2.c) n03).f62576a), classId);
        return rVar.f(n03);
    }
}
