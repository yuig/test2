package com.pinterest.api.model.deserializer;

import com.pinterest.api.model.k60;
import dl1.s;
import j10.i;
import java.util.List;
import ke0.a;
import ke0.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import vd0.c;
import yn2.c0;
import yn2.q;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/pinterest/api/model/deserializer/PlaceDeserializer;", "Lke0/a;", "Lcom/pinterest/api/model/k60;", "Lke0/b;", "<init>", "()V", "repository_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class PlaceDeserializer extends a implements b {
    public PlaceDeserializer() {
        super("place");
    }

    @Override // ke0.b
    public final List a(vd0.a arr, boolean z13) {
        Intrinsics.checkNotNullParameter(arr, "arr");
        return c(arr);
    }

    @Override // ke0.b
    public final List c(vd0.a arr) {
        Intrinsics.checkNotNullParameter(arr, "arr");
        return c0.t(q.b(new i(arr, this, null)));
    }

    @Override // ke0.a
    public final s d(c json) {
        Intrinsics.checkNotNullParameter(json, "json");
        Object e13 = c.f125622b.e(json.f125623a, k60.class);
        Intrinsics.g(e13, "null cannot be cast to non-null type com.pinterest.api.model.Place");
        return (k60) e13;
    }
}
