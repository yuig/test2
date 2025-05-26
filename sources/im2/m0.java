package im2;

import kotlin.collections.z0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class m0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public static final m0 f72753i = new m0(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z13;
        am2.d b13;
        String builtinSignature;
        am2.d it = (am2.d) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        if (xl2.l.B(it)) {
            int i13 = h.f72741m;
            Intrinsics.checkNotNullParameter(it, "<this>");
            o0 o0Var = null;
            if (r0.f72770f.contains(it.getName()) && (b13 = fn2.d.b(it, g.f72739i)) != null && (builtinSignature = com.bumptech.glide.c.t(b13)) != null) {
                Intrinsics.checkNotNullParameter(builtinSignature, "builtinSignature");
                o0Var = r0.f72767c.contains(builtinSignature) ? o0.ONE_COLLECTION_PARAMETER : ((q0) z0.e(builtinSignature, r0.f72769e)) == q0.NULL ? o0.OBJECT_PARAMETER_GENERIC : o0.OBJECT_PARAMETER_NON_GENERIC;
            }
            if (o0Var != null) {
                z13 = true;
                return Boolean.valueOf(z13);
            }
        }
        z13 = false;
        return Boolean.valueOf(z13);
    }
}
