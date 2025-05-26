package dn2;

import am2.d0;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import lb.l0;
import pn2.b0;
import pn2.h0;

/* loaded from: classes2.dex */
public final class i extends g {

    /* renamed from: b, reason: collision with root package name */
    public final ym2.b f55625b;

    /* renamed from: c, reason: collision with root package name */
    public final ym2.g f55626c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(ym2.b enumClassId, ym2.g enumEntryName) {
        super(new Pair(enumClassId, enumEntryName));
        Intrinsics.checkNotNullParameter(enumClassId, "enumClassId");
        Intrinsics.checkNotNullParameter(enumEntryName, "enumEntryName");
        this.f55625b = enumClassId;
        this.f55626c = enumEntryName;
    }

    @Override // dn2.g
    public final b0 a(d0 module) {
        Intrinsics.checkNotNullParameter(module, "module");
        ym2.b bVar = this.f55625b;
        am2.g c03 = l0.c0(module, bVar);
        h0 h0Var = null;
        if (c03 != null) {
            int i13 = bn2.e.f23579a;
            if (!bn2.e.p(c03, am2.h.ENUM_CLASS)) {
                c03 = null;
            }
            if (c03 != null) {
                h0Var = c03.j();
            }
        }
        if (h0Var != null) {
            return h0Var;
        }
        rn2.l lVar = rn2.l.ERROR_ENUM_TYPE;
        String bVar2 = bVar.toString();
        Intrinsics.checkNotNullExpressionValue(bVar2, "toString(...)");
        String str = this.f55626c.f139478a;
        Intrinsics.checkNotNullExpressionValue(str, "toString(...)");
        return rn2.m.d(lVar, bVar2, str);
    }

    @Override // dn2.g
    public final String toString() {
        StringBuilder sb3 = new StringBuilder();
        sb3.append(this.f55625b.i());
        sb3.append('.');
        sb3.append(this.f55626c);
        return sb3.toString();
    }
}
