package p1;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class c1 {

    /* renamed from: a, reason: collision with root package name */
    public static final e1 f98491a = new e1(l.f98543a, u2.b.f120022j);

    public static final e1 a(h hVar, u2.h hVar2, i2.o oVar, int i13) {
        if (Intrinsics.d(hVar, l.f98543a) && Intrinsics.d(hVar2, u2.b.f120022j)) {
            i2.s sVar = (i2.s) oVar;
            sVar.W(-849081669);
            sVar.r(false);
            return f98491a;
        }
        i2.s sVar2 = (i2.s) oVar;
        sVar2.W(-849030798);
        boolean z13 = true;
        boolean z14 = (((i13 & 14) ^ 6) > 4 && sVar2.h(hVar)) || (i13 & 6) == 4;
        if ((((i13 & RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER) ^ 48) <= 32 || !sVar2.h(hVar2)) && (i13 & 48) != 32) {
            z13 = false;
        }
        boolean z15 = z14 | z13;
        Object J2 = sVar2.J();
        if (z15 || J2 == i2.n.f71185a) {
            J2 = new e1(hVar, hVar2);
            sVar2.g0(J2);
        }
        e1 e1Var = (e1) J2;
        sVar2.r(false);
        return e1Var;
    }
}
