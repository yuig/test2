package ln2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class d0 extends e0 {

    /* renamed from: d, reason: collision with root package name */
    public final ym2.c f84071d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(ym2.c fqName, vm2.f nameResolver, vm2.i typeTable, nn2.l lVar) {
        super(nameResolver, typeTable, lVar);
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        this.f84071d = fqName;
    }

    @Override // ln2.e0
    public final ym2.c a() {
        return this.f84071d;
    }
}
