package j00;

import com.pinterest.api.model.cm0;
import kotlin.jvm.internal.Intrinsics;
import rz.d;
import vd0.c;

/* loaded from: classes3.dex */
public final class a implements d {

    /* renamed from: a, reason: collision with root package name */
    public static final a f73962a = new a();

    @Override // rz.d
    public final Object b(c pinterestJsonObject) {
        Intrinsics.checkNotNullParameter(pinterestJsonObject, "pinterestJsonObject");
        c m13 = pinterestJsonObject.m("data");
        if (m13 != null) {
            pinterestJsonObject = m13;
        }
        Object e13 = c.f125622b.e(pinterestJsonObject.f125623a, cm0.class);
        Intrinsics.g(e13, "null cannot be cast to non-null type com.pinterest.api.model.StoryPinFonts");
        return (cm0) e13;
    }
}
