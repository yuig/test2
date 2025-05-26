package vz;

import com.pinterest.api.model.ta;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class d implements rz.d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f126896a = new d();

    @Override // rz.d
    public final Object b(vd0.c pinterestJsonObject) {
        Intrinsics.checkNotNullParameter(pinterestJsonObject, "pinterestJsonObject");
        vd0.c m13 = pinterestJsonObject.m("data");
        Object e13 = m13 != null ? vd0.c.f125622b.e(m13.f125623a, ta.class) : null;
        Intrinsics.g(e13, "null cannot be cast to non-null type com.pinterest.api.model.BoardVideoTemplate");
        return (ta) e13;
    }
}
