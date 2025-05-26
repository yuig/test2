package com.pinterest.api.model.deserializer;

import com.pinterest.api.model.m10;
import dl1.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ke0.a;
import ke0.b;
import kotlin.Metadata;
import kotlin.collections.g0;
import kotlin.jvm.internal.Intrinsics;
import vd0.c;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/pinterest/api/model/deserializer/OutpaintingResponseDeserializer;", "Lke0/a;", "Lcom/pinterest/api/model/m10;", "Lke0/b;", "<init>", "()V", "repository_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class OutpaintingResponseDeserializer extends a implements b {
    public OutpaintingResponseDeserializer() {
        super("outpainting_response");
    }

    @Override // ke0.b
    public final List a(vd0.a arr, boolean z13) {
        Intrinsics.checkNotNullParameter(arr, "arr");
        return c(arr);
    }

    @Override // ke0.b
    public final List c(vd0.a arr) {
        Intrinsics.checkNotNullParameter(arr, "arr");
        ArrayList arrayList = new ArrayList(g0.q(arr, 10));
        Iterator it = arr.iterator();
        while (it.hasNext()) {
            c json = (c) it.next();
            Intrinsics.checkNotNullParameter(json, "json");
            Object e13 = c.f125622b.e(json.f125623a, m10.class);
            Intrinsics.g(e13, "null cannot be cast to non-null type com.pinterest.api.model.OutpaintingResponse");
            arrayList.add((m10) e13);
        }
        return arrayList;
    }

    @Override // ke0.a
    public final s d(c json) {
        Intrinsics.checkNotNullParameter(json, "json");
        Object e13 = c.f125622b.e(json.f125623a, m10.class);
        Intrinsics.g(e13, "null cannot be cast to non-null type com.pinterest.api.model.OutpaintingResponse");
        return (m10) e13;
    }
}
