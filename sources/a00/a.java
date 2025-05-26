package a00;

import com.pinterest.api.model.DynamicFeed;
import com.pinterest.api.model.qh;
import kotlin.jvm.internal.Intrinsics;
import os0.b;
import rz.d;
import vd0.c;

/* loaded from: classes.dex */
public final class a implements d {

    /* renamed from: a, reason: collision with root package name */
    public final qh f208a;

    public a(qh dynamicFeedFactory) {
        Intrinsics.checkNotNullParameter(dynamicFeedFactory, "dynamicFeedFactory");
        this.f208a = dynamicFeedFactory;
    }

    @Override // rz.d
    public final Object b(c pinterestJsonObject) {
        Intrinsics.checkNotNullParameter(pinterestJsonObject, "pinterestJsonObject");
        b bVar = b.f97497a;
        bVar.c(null);
        DynamicFeed a13 = qh.a(this.f208a, pinterestJsonObject, null, 6);
        bVar.r(null);
        return a13;
    }
}
