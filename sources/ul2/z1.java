package ul2;

import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class z1 {

    /* renamed from: a, reason: collision with root package name */
    public static final an2.y f122650a = an2.y.f15818c;

    public static void a(StringBuilder sb3, am2.b bVar) {
        dm2.d g13 = c2.g(bVar);
        dm2.d D = bVar.D();
        if (g13 != null) {
            pn2.b0 type = g13.getType();
            Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
            sb3.append(e(type));
            sb3.append(".");
        }
        boolean z13 = (g13 == null || D == null) ? false : true;
        if (z13) {
            sb3.append("(");
        }
        if (D != null) {
            pn2.b0 type2 = D.getType();
            Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
            sb3.append(e(type2));
            sb3.append(".");
        }
        if (z13) {
            sb3.append(")");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static String b(am2.x descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        StringBuilder sb3 = new StringBuilder();
        sb3.append("fun ");
        a(sb3, descriptor);
        ym2.g name = ((dm2.o) descriptor).getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        sb3.append(f122650a.T(name, true));
        List x13 = descriptor.x();
        Intrinsics.checkNotNullExpressionValue(x13, "getValueParameters(...)");
        CollectionsKt___CollectionsKt.H(x13, sb3, ", ", (r16 & 4) != 0 ? "" : "(", (r16 & 8) != 0 ? "" : ")", -1, "...", (r16 & 64) != 0 ? null : h.f122526n);
        sb3.append(": ");
        pn2.b0 returnType = descriptor.getReturnType();
        Intrinsics.f(returnType);
        sb3.append(e(returnType));
        String sb4 = sb3.toString();
        Intrinsics.checkNotNullExpressionValue(sb4, "toString(...)");
        return sb4;
    }

    public static String c(am2.x invoke) {
        Intrinsics.checkNotNullParameter(invoke, "invoke");
        StringBuilder sb3 = new StringBuilder();
        a(sb3, invoke);
        List x13 = invoke.x();
        Intrinsics.checkNotNullExpressionValue(x13, "getValueParameters(...)");
        CollectionsKt___CollectionsKt.H(x13, sb3, ", ", (r16 & 4) != 0 ? "" : "(", (r16 & 8) != 0 ? "" : ")", -1, "...", (r16 & 64) != 0 ? null : h.f122527o);
        sb3.append(" -> ");
        pn2.b0 returnType = invoke.getReturnType();
        Intrinsics.f(returnType);
        sb3.append(e(returnType));
        String sb4 = sb3.toString();
        Intrinsics.checkNotNullExpressionValue(sb4, "toString(...)");
        return sb4;
    }

    public static String d(am2.r0 descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        StringBuilder sb3 = new StringBuilder();
        sb3.append(descriptor.C() ? "var " : "val ");
        a(sb3, descriptor);
        ym2.g name = descriptor.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        sb3.append(f122650a.T(name, true));
        sb3.append(": ");
        pn2.b0 type = descriptor.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        sb3.append(e(type));
        String sb4 = sb3.toString();
        Intrinsics.checkNotNullExpressionValue(sb4, "toString(...)");
        return sb4;
    }

    public static String e(pn2.b0 type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return f122650a.d0(type);
    }
}
