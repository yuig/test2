package com.pinterest.api.model;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class ml0 extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ dl0 f40160i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ml0(dl0 dl0Var) {
        super(2);
        this.f40160i = dl0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        cp0 cp0Var;
        int intValue = ((Number) obj).intValue();
        uo0 page = (uo0) obj2;
        Intrinsics.checkNotNullParameter(page, "page");
        jo0 metadata = this.f40160i.q();
        wo0 wo0Var = new wo0(page, intValue, null, null, null, null, null, null, null, false, null, 2040, null);
        if (metadata == null) {
            return wo0Var;
        }
        bp0 bp0Var = cp0.Companion;
        Integer r13 = page.r();
        Intrinsics.checkNotNullExpressionValue(r13, "getLayout(...)");
        int intValue2 = r13.intValue();
        bp0Var.getClass();
        cp0[] values = cp0.values();
        int length = values.length;
        int i13 = 0;
        while (true) {
            if (i13 >= length) {
                cp0Var = null;
                break;
            }
            cp0Var = values[i13];
            if (cp0Var.getType() == intValue2) {
                break;
            }
            i13++;
        }
        int i14 = cp0Var == null ? -1 : kl0.f39488a[cp0Var.ordinal()];
        if (i14 == 1) {
            Intrinsics.checkNotNullParameter(wo0Var, "<this>");
            Intrinsics.checkNotNullParameter(metadata, "metadata");
            return wo0.a(wo0Var, metadata.s(), metadata.r(), metadata.n(), metadata.p(), metadata.q(), metadata.k(), 1543);
        }
        if (i14 == 2) {
            Intrinsics.checkNotNullParameter(wo0Var, "<this>");
            Intrinsics.checkNotNullParameter(metadata, "metadata");
            return wo0.a(wo0Var, null, metadata.r(), null, null, null, null, 2031);
        }
        if (i14 != 3) {
            return wo0Var;
        }
        Intrinsics.checkNotNullParameter(wo0Var, "<this>");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        return wo0.a(wo0Var, null, null, metadata.n(), null, null, null, 2015);
    }
}
