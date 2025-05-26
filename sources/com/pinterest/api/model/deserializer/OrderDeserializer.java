package com.pinterest.api.model.deserializer;

import com.pinterest.api.model.w00;
import dl1.s;
import java.util.ArrayList;
import java.util.List;
import ke0.a;
import ke0.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import vd0.c;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/pinterest/api/model/deserializer/OrderDeserializer;", "Lke0/a;", "Lcom/pinterest/api/model/w00;", "Lke0/b;", "<init>", "()V", "repository_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class OrderDeserializer extends a implements b {
    public OrderDeserializer() {
        super("order");
    }

    public static w00 e(c json) {
        Intrinsics.checkNotNullParameter(json, "json");
        c m13 = json.m("data");
        if (m13 != null) {
            json = m13;
        }
        Object e13 = c.f125622b.e(json.f125623a, w00.class);
        Intrinsics.g(e13, "null cannot be cast to non-null type com.pinterest.api.model.Order");
        return (w00) e13;
    }

    @Override // ke0.b
    public final List a(vd0.a arr, boolean z13) {
        Intrinsics.checkNotNullParameter(arr, "arr");
        return c(arr);
    }

    @Override // ke0.b
    public final List c(vd0.a pinterestJsonArray) {
        Intrinsics.checkNotNullParameter(pinterestJsonArray, "pinterestJsonArray");
        int d2 = pinterestJsonArray.d();
        ArrayList arrayList = new ArrayList(d2);
        for (int i13 = 0; i13 < d2; i13++) {
            c b13 = pinterestJsonArray.b(i13);
            if (b13 != null && Intrinsics.d(b13.o("type", ""), "order")) {
                arrayList.add(e(b13));
            }
        }
        arrayList.trimToSize();
        return arrayList;
    }

    @Override // ke0.a
    public final /* bridge */ /* synthetic */ s d(c cVar) {
        return e(cVar);
    }
}
