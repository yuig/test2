package im2;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final /* synthetic */ class y extends kotlin.jvm.internal.o implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final y f72792a = new y(1);

    @Override // kotlin.jvm.internal.e, rl2.c
    public final String getName() {
        return "getDefaultReportLevelForAnnotation";
    }

    @Override // kotlin.jvm.internal.e
    public final rl2.f getOwner() {
        return kotlin.jvm.internal.k0.f80436a.c(w.class, "compiler.common.jvm");
    }

    @Override // kotlin.jvm.internal.e
    public final String getSignature() {
        return "getDefaultReportLevelForAnnotation(Lorg/jetbrains/kotlin/name/FqName;)Lorg/jetbrains/kotlin/load/java/ReportLevel;";
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        j0 j0Var;
        ym2.c fqName = (ym2.c) obj;
        Intrinsics.checkNotNullParameter(fqName, "p0");
        ym2.c cVar = w.f72784a;
        Intrinsics.checkNotNullParameter(fqName, "annotationFqName");
        g0.f72740a.getClass();
        h0 configuredReportLevels = f0.f72738b;
        xk2.j other = new xk2.j(1, 7, 20);
        Intrinsics.checkNotNullParameter(fqName, "annotation");
        Intrinsics.checkNotNullParameter(configuredReportLevels, "configuredReportLevels");
        Intrinsics.checkNotNullParameter(other, "configuredKotlinVersion");
        configuredReportLevels.getClass();
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        j0 j0Var2 = (j0) configuredReportLevels.f72743c.invoke(fqName);
        if (j0Var2 != null) {
            return j0Var2;
        }
        h0 h0Var = w.f72786c;
        h0Var.getClass();
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        x xVar = (x) h0Var.f72743c.invoke(fqName);
        if (xVar == null) {
            return j0.IGNORE;
        }
        xk2.j jVar = xVar.f72790b;
        if (jVar != null) {
            Intrinsics.checkNotNullParameter(other, "other");
            if (jVar.f135219d - other.f135219d <= 0) {
                j0Var = xVar.a();
                return j0Var;
            }
        }
        j0Var = xVar.f72789a;
        return j0Var;
    }
}
