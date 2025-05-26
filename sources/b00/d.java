package b00;

import com.pinterest.api.model.cv;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class d implements rz.d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f20722a = new d();

    @Override // rz.d
    public final Object b(vd0.c pinterestJsonObject) {
        Intrinsics.checkNotNullParameter(pinterestJsonObject, "pinterestJsonObject");
        vd0.c m13 = pinterestJsonObject.m("data");
        if (m13 != null) {
            pinterestJsonObject = m13;
        }
        Object e13 = vd0.c.f125622b.e(pinterestJsonObject.f125623a, cv.class);
        Intrinsics.g(e13, "null cannot be cast to non-null type com.pinterest.api.model.MediaUploadCredentialsRefreshResponse");
        return (cv) e13;
    }
}
