package z02;

import com.pinterest.api.model.r2;
import kotlin.jvm.internal.Intrinsics;
import rz.d;
import vd0.c;

/* loaded from: classes4.dex */
public final class b implements d {

    /* renamed from: a, reason: collision with root package name */
    public static final b f140583a = new b();

    @Override // rz.d
    public final Object b(c pinterestJsonObject) {
        Intrinsics.checkNotNullParameter(pinterestJsonObject, "pinterestJsonObject");
        Object e13 = c.f125622b.e(pinterestJsonObject.f125623a, r2.class);
        Intrinsics.g(e13, "null cannot be cast to non-null type com.pinterest.api.model.Advertisers");
        return (r2) e13;
    }
}
