package uc0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes5.dex */
public final class w2 extends m {

    /* renamed from: g, reason: collision with root package name */
    public final q2 f121878g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w2(oc0.h eventManager, q2 state, l82.a scope) {
        super(eventManager, state, scope);
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f121878g = state;
    }

    @Override // uc0.m
    public final Object h(k kVar, bl2.c cVar) {
        u2 u2Var = (u2) kVar;
        if (!(u2Var instanceof t2)) {
            return Unit.f80348a;
        }
        String search = ((t2) u2Var).f121866a;
        boolean z13 = !kotlin.text.z.j(search);
        q2 q2Var = this.f121878g;
        Object obj = q2Var;
        if (z13) {
            List list = q2Var.f121854a;
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                List list2 = ((v2) it.next()).f121874b;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : list2) {
                    p2 p2Var = (p2) obj2;
                    p2Var.getClass();
                    Intrinsics.checkNotNullParameter(search, "search");
                    Locale locale = Locale.ROOT;
                    String lowerCase = p2Var.f121848a.toLowerCase(locale);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                    if (!StringsKt.E(lowerCase, search, false)) {
                        String str = p2Var.f121849b;
                        if (str != null) {
                            String lowerCase2 = str.toLowerCase(locale);
                            Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
                            if (lowerCase2 != null && StringsKt.E(lowerCase2, search, false)) {
                            }
                        }
                    }
                    arrayList2.add(obj2);
                }
                kotlin.collections.k0.u(arrayList2, arrayList);
            }
            obj = new r2(CollectionsKt.x0(arrayList, new b4.f(12)));
        }
        this.f121825e.i(obj);
        Unit unit = Unit.f80348a;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        return unit;
    }
}
