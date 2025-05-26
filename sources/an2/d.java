package an2;

import am2.c1;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class d implements e {

    /* renamed from: a, reason: collision with root package name */
    public static final d f15766a = new d();

    public static String b(am2.j jVar) {
        String str;
        ym2.g name = jVar.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        String C = kotlin.jvm.internal.j.C(name);
        if (jVar instanceof c1) {
            return C;
        }
        am2.m g13 = jVar.g();
        Intrinsics.checkNotNullExpressionValue(g13, "getContainingDeclaration(...)");
        if (g13 instanceof am2.g) {
            str = b((am2.j) g13);
        } else if (g13 instanceof am2.i0) {
            ym2.e i13 = ((dm2.k0) ((am2.i0) g13)).f55454e.i();
            Intrinsics.checkNotNullExpressionValue(i13, "toUnsafe(...)");
            Intrinsics.checkNotNullParameter(i13, "<this>");
            List e13 = i13.e();
            Intrinsics.checkNotNullExpressionValue(e13, "pathSegments(...)");
            str = kotlin.jvm.internal.j.D(e13);
        } else {
            str = null;
        }
        if (str == null || Intrinsics.d(str, "")) {
            return C;
        }
        return str + '.' + C;
    }

    @Override // an2.e
    public final String a(am2.j classifier, y renderer) {
        Intrinsics.checkNotNullParameter(classifier, "classifier");
        Intrinsics.checkNotNullParameter(renderer, "renderer");
        return b(classifier);
    }
}
