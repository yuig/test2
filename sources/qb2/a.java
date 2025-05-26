package qb2;

import dl1.s;
import java.util.ArrayList;
import jk2.i1;
import kotlin.jvm.internal.Intrinsics;
import nr0.j;
import pb2.f;
import pb2.h;
import uj2.q;
import we1.f2;

/* loaded from: classes4.dex */
public final class a extends xk1.c implements j {
    public a() {
        super(null);
        o(23, new f2(23));
    }

    @Override // sq0.e0
    public final int getItemViewType(int i13) {
        s sVar = (s) getItem(i13);
        if (sVar instanceof f) {
            return ((f) sVar).r();
        }
        throw new RuntimeException("No item view type for position: " + i13 + " with model class: " + (sVar != null ? sVar.getClass() : null));
    }

    @Override // xk1.c
    public final q k() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new h());
        i1 y13 = q.y(arrayList);
        Intrinsics.checkNotNullExpressionValue(y13, "just(...)");
        return y13;
    }
}
