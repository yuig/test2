package b00;

import com.pinterest.api.model.gv;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class c implements rz.d {

    /* renamed from: a, reason: collision with root package name */
    public static final c f20721a = new c();

    @Override // rz.d
    public final Object b(vd0.c pinterestJsonObject) {
        Intrinsics.checkNotNullParameter(pinterestJsonObject, "pinterestJsonObject");
        vd0.c m13 = pinterestJsonObject.m("data");
        if (m13 != null) {
            pinterestJsonObject = m13;
        }
        Object e13 = vd0.c.f125622b.e(pinterestJsonObject.f125623a, gv.class);
        Intrinsics.g(e13, "null cannot be cast to non-null type com.pinterest.api.model.MediaUploadCredentialsResponse");
        return (gv) e13;
    }
}
