package j2;

import i2.y2;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class g extends j0 {

    /* renamed from: c, reason: collision with root package name */
    public static final g f74446c = new g(0, 2, 1);

    @Override // j2.j0
    public final void a(k0 k0Var, i2.f fVar, y2 y2Var, i2.y yVar) {
        int i13 = ((q2.j) k0Var.b(0)).f102114a;
        List list = (List) k0Var.b(1);
        int size = list.size();
        for (int i14 = 0; i14 < size; i14++) {
            Object obj = list.get(i14);
            Intrinsics.g(fVar, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
            int i15 = i13 + i14;
            fVar.f(i15, obj);
            fVar.c(i15, obj);
        }
    }

    @Override // j2.j0
    public final String c(int i13) {
        return com.bumptech.glide.d.B(i13, 0) ? "effectiveNodeIndex" : com.bumptech.glide.d.B(i13, 1) ? "nodes" : super.c(i13);
    }
}
