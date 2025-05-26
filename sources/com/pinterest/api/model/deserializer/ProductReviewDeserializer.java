package com.pinterest.api.model.deserializer;

import com.pinterest.api.model.d80;
import dl1.s;
import j10.j;
import java.util.List;
import ke0.a;
import ke0.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import vd0.c;
import yn2.c0;
import yn2.q;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/pinterest/api/model/deserializer/ProductReviewDeserializer;", "Lke0/a;", "Lcom/pinterest/api/model/d80;", "Lke0/b;", "<init>", "()V", "repository_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class ProductReviewDeserializer extends a implements b {
    public ProductReviewDeserializer() {
        super("product_review");
    }

    public static d80 e(c json) {
        Intrinsics.checkNotNullParameter(json, "json");
        c m13 = json.m("product_review");
        if (m13 != null) {
            json = m13;
        }
        Object e13 = c.f125622b.e(json.f125623a, d80.class);
        Intrinsics.g(e13, "null cannot be cast to non-null type com.pinterest.api.model.ProductReview");
        return (d80) e13;
    }

    @Override // ke0.b
    public final List a(vd0.a arr, boolean z13) {
        Intrinsics.checkNotNullParameter(arr, "arr");
        return c(arr);
    }

    @Override // ke0.b
    public final List c(vd0.a arr) {
        Intrinsics.checkNotNullParameter(arr, "arr");
        return c0.u(q.b(new j(arr, this, null)));
    }

    @Override // ke0.a
    public final /* bridge */ /* synthetic */ s d(c cVar) {
        return e(cVar);
    }
}
