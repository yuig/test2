package uz;

import com.pinterest.api.model.o4;
import kotlin.jvm.internal.Intrinsics;
import rz.d;
import vd0.c;

/* loaded from: classes3.dex */
public final class a implements d {

    /* renamed from: a, reason: collision with root package name */
    public static final a f123271a = new a();

    @Override // rz.d
    public final Object b(c pinterestJsonObject) {
        Intrinsics.checkNotNullParameter(pinterestJsonObject, "pinterestJsonObject");
        c m13 = pinterestJsonObject.m("data");
        Object e13 = m13 != null ? c.f125622b.e(m13.f125623a, o4.class) : null;
        Intrinsics.g(e13, "null cannot be cast to non-null type com.pinterest.api.model.AnalyticsMetrics");
        return (o4) e13;
    }
}
