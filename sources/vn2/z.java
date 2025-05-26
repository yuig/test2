package vn2;

import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* loaded from: classes2.dex */
public abstract class z extends b7.c {

    /* renamed from: g, reason: collision with root package name */
    public static final List f126351g;

    static {
        ym2.g gVar = a0.f126295i;
        p pVar = p.f126339c;
        k kVar = new k(gVar, new e[]{pVar, new i0(1, 0)});
        k kVar2 = new k(a0.f126296j, new e[]{pVar, new i0(2, 0)}, w.f126348i);
        ym2.g gVar2 = a0.f126287a;
        t tVar = t.f126343a;
        i0 i0Var = new i0(2, 0);
        n nVar = n.f126337a;
        k kVar3 = new k(gVar2, new e[]{pVar, tVar, i0Var, nVar});
        k kVar4 = new k(a0.f126288b, new e[]{pVar, tVar, new i0(3, 0), nVar});
        k kVar5 = new k(a0.f126289c, new e[]{pVar, tVar, new i0(2, 1), nVar});
        k kVar6 = new k(a0.f126293g, new e[]{pVar});
        ym2.g gVar3 = a0.f126292f;
        k0 k0Var = k0.f126335c;
        c0 c0Var = c0.f126313c;
        k kVar7 = new k(gVar3, new e[]{pVar, k0Var, tVar, c0Var});
        ym2.g gVar4 = a0.f126294h;
        j0 j0Var = j0.f126329c;
        k kVar8 = new k(gVar4, new e[]{pVar, j0Var});
        k kVar9 = new k(a0.f126297k, new e[]{pVar, j0Var});
        k kVar10 = new k(a0.f126298l, new e[]{pVar, j0Var, c0Var});
        k kVar11 = new k(a0.f126302p, new e[]{pVar, k0Var, tVar});
        k kVar12 = new k(a0.f126303q, new e[]{pVar, k0Var, tVar});
        k kVar13 = new k(a0.f126290d, new e[]{o.f126338c}, x.f126349i);
        k kVar14 = new k(a0.f126291e, new e[]{pVar, e0.f126316c, k0Var, tVar});
        k kVar15 = new k(a0.f126305s, new e[]{pVar, k0Var, tVar});
        k kVar16 = new k(a0.f126304r, new e[]{pVar, j0Var});
        k kVar17 = new k(kotlin.collections.f0.j(a0.f126300n, a0.f126301o), new e[]{pVar}, y.f126350i);
        k kVar18 = new k(a0.f126306t, new e[]{pVar, g0.f126321c, k0Var, tVar});
        Regex regex = a0.f126299m;
        e[] checks = {pVar, j0Var};
        i additionalChecks = i.f126325i;
        Intrinsics.checkNotNullParameter(regex, "regex");
        Intrinsics.checkNotNullParameter(checks, "checks");
        Intrinsics.checkNotNullParameter(additionalChecks, "additionalChecks");
        f126351g = kotlin.collections.f0.j(kVar, kVar2, kVar3, kVar4, kVar5, kVar6, kVar7, kVar8, kVar9, kVar10, kVar11, kVar12, kVar13, kVar14, kVar15, kVar16, kVar17, kVar18, new k(null, regex, null, additionalChecks, (e[]) Arrays.copyOf(checks, 2)));
    }
}
