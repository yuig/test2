package l00;

import com.pinterest.api.model.y40;
import kotlin.jvm.internal.Intrinsics;
import rz.d;
import vd0.c;

/* loaded from: classes3.dex */
public final class a implements d {

    /* renamed from: a, reason: collision with root package name */
    public static final a f81295a = new a();

    @Override // rz.d
    public final Object b(c pinterestJsonObject) {
        Intrinsics.checkNotNullParameter(pinterestJsonObject, "pinterestJsonObject");
        c b13 = pinterestJsonObject.k("data").b(0);
        if (b13 != null) {
            pinterestJsonObject = b13;
        }
        Object e13 = c.f125622b.e(pinterestJsonObject.f125623a, y40.class);
        Intrinsics.g(e13, "null cannot be cast to non-null type com.pinterest.api.model.PinOrSpin");
        return (y40) e13;
    }
}
