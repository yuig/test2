package uc0;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes5.dex */
public final class l1 extends m {

    /* renamed from: g, reason: collision with root package name */
    public final h1 f121822g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(oc0.h eventManager, l82.a scope, h1 initState) {
        super(eventManager, initState, scope);
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(initState, "initState");
        this.f121822g = initState;
    }

    @Override // uc0.m
    public final Object h(k kVar, bl2.c cVar) {
        j1 j1Var = (j1) kVar;
        if (!(j1Var instanceof i1)) {
            return Unit.f80348a;
        }
        h1 h1Var = this.f121822g;
        k1 k1Var = h1Var.f121790a;
        String str = ((i1) j1Var).f121795a;
        boolean z13 = !kotlin.text.z.j(str);
        List list = h1Var.f121791b;
        if (z13) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (StringsKt.E(((g1) obj).f121782a, str, false)) {
                    arrayList.add(obj);
                }
            }
            list = arrayList;
        }
        this.f121825e.i(new h1(k1Var, list));
        Unit unit = Unit.f80348a;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        return unit;
    }
}
