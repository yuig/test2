package jm2;

import am2.d0;
import am2.p;
import dm2.c1;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import lb.l0;
import pn2.b0;
import xl2.q;

/* loaded from: classes4.dex */
public final class d extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public static final d f77054i = new d(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        d0 module = (d0) obj;
        Intrinsics.checkNotNullParameter(module, "module");
        p n03 = l0.n0(c.f77051b, module.f().i(q.f135314t));
        b0 type = n03 != null ? ((c1) n03).getType() : null;
        return type == null ? rn2.m.d(rn2.l.UNMAPPED_ANNOTATION_TARGET_TYPE, new String[0]) : type;
    }
}
