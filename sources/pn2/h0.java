package pn2;

import java.util.Iterator;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class h0 extends v1 implements sn2.g, sn2.h {
    @Override // pn2.v1
    /* renamed from: D0 */
    public abstract h0 A0(boolean z13);

    @Override // pn2.v1
    /* renamed from: E0 */
    public abstract h0 C0(u0 u0Var);

    public String toString() {
        StringBuilder sb3 = new StringBuilder();
        Iterator it = getAnnotations().iterator();
        while (it.hasNext()) {
            String[] value = {"[", an2.y.f15820e.A((bm2.c) it.next(), null), "] "};
            Intrinsics.checkNotNullParameter(sb3, "<this>");
            Intrinsics.checkNotNullParameter(value, "value");
            for (int i13 = 0; i13 < 3; i13++) {
                sb3.append(value[i13]);
            }
        }
        sb3.append(w0());
        if (!u0().isEmpty()) {
            CollectionsKt___CollectionsKt.H(u0(), sb3, ", ", (r16 & 4) != 0 ? "" : "<", (r16 & 8) != 0 ? "" : ">", -1, "...", (r16 & 64) != 0 ? null : null);
        }
        if (x0()) {
            sb3.append("?");
        }
        String sb4 = sb3.toString();
        Intrinsics.checkNotNullExpressionValue(sb4, "toString(...)");
        return sb4;
    }
}
