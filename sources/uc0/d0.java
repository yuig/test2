package uc0;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes5.dex */
public final class d0 extends m {

    /* renamed from: g, reason: collision with root package name */
    public final oc0.h f121769g;

    /* renamed from: h, reason: collision with root package name */
    public final y f121770h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(oc0.h eventManager, y initState, l82.a scope) {
        super(eventManager, initState, scope);
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(initState, "initState");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f121769g = eventManager;
        this.f121770h = initState;
    }

    @Override // uc0.m
    public final Object h(k kVar, bl2.c cVar) {
        c0 c0Var = (c0) kVar;
        if (c0Var instanceof a0) {
            Object emit = ((oc0.j) this.f121769g).f94042a.emit(((a0) c0Var).f121754a, cVar);
            return emit == cl2.a.COROUTINE_SUSPENDED ? emit : Unit.f80348a;
        }
        if (!(c0Var instanceof b0)) {
            return Unit.f80348a;
        }
        Locale locale = Locale.ROOT;
        String str = ((b0) c0Var).f121761a;
        String lowerCase = str.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        boolean z13 = !kotlin.text.z.j(lowerCase);
        y yVar = this.f121770h;
        if (z13) {
            List list = yVar.f121883a;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                x xVar = (x) obj;
                String str2 = xVar.f121879a;
                Locale locale2 = Locale.ROOT;
                String lowerCase2 = str2.toLowerCase(locale2);
                Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
                boolean E = StringsKt.E(lowerCase2, str, false);
                String lowerCase3 = xVar.f121880b.toLowerCase(locale2);
                Intrinsics.checkNotNullExpressionValue(lowerCase3, "toLowerCase(...)");
                if (StringsKt.E(lowerCase3, lowerCase, false) | E) {
                    arrayList.add(obj);
                }
            }
            yVar = new y(arrayList);
        }
        this.f121825e.i(yVar);
        Unit unit = Unit.f80348a;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        return unit;
    }
}
