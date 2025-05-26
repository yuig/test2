package p1;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class x {

    /* renamed from: a, reason: collision with root package name */
    public static final y f98616a = new y(l.f98545c, u2.b.f120025m);

    public static final y a(j jVar, u2.c cVar, i2.o oVar, int i13) {
        if (Intrinsics.d(jVar, l.f98545c) && Intrinsics.d(cVar, u2.b.f120025m)) {
            i2.s sVar = (i2.s) oVar;
            sVar.W(345962472);
            sVar.r(false);
            return f98616a;
        }
        i2.s sVar2 = (i2.s) oVar;
        sVar2.W(346016319);
        boolean z13 = true;
        boolean z14 = (((i13 & 14) ^ 6) > 4 && sVar2.h(jVar)) || (i13 & 6) == 4;
        if ((((i13 & RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER) ^ 48) <= 32 || !sVar2.h(cVar)) && (i13 & 48) != 32) {
            z13 = false;
        }
        boolean z15 = z14 | z13;
        Object J2 = sVar2.J();
        if (z15 || J2 == i2.n.f71185a) {
            J2 = new y(jVar, cVar);
            sVar2.g0(J2);
        }
        y yVar = (y) J2;
        sVar2.r(false);
        return yVar;
    }
}
