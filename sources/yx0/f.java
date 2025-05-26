package yx0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.p;
import x02.w1;

/* loaded from: classes5.dex */
public final /* synthetic */ class f extends p implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        c cVar;
        int intValue = ((Number) obj).intValue();
        h hVar = (h) this.receiver;
        hVar.getClass();
        c.Companion.getClass();
        c[] values = c.values();
        int length = values.length;
        int i13 = 0;
        while (true) {
            if (i13 >= length) {
                cVar = null;
                break;
            }
            cVar = values[i13];
            if (cVar.ordinal() == intValue) {
                break;
            }
            i13++;
        }
        if (cVar == null) {
            cVar = c.All;
        }
        if (cVar != hVar.f140344j) {
            hVar.f140343i.f122379a.X(cVar.getElementType());
            hVar.f140344j = cVar;
            w12.a newsType = cVar.getNewsType();
            w1 w1Var = hVar.f140336b;
            w1Var.getClass();
            Intrinsics.checkNotNullParameter(newsType, "newsType");
            w1Var.f131517a = newsType;
            w1Var.f131518b.c(newsType);
            hVar.t3(cVar);
        }
        ((zx0.f) ((xx0.a) hVar.getView())).x2();
        return Unit.f80348a;
    }
}
