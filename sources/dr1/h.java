package dr1;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.g0;
import kotlin.jvm.internal.Intrinsics;
import qr1.a0;

/* loaded from: classes2.dex */
public final class h implements rz.d {

    /* renamed from: a, reason: collision with root package name */
    public static final h f56214a = new h();

    @Override // rz.d
    public final Object b(vd0.c pinterestJsonObject) {
        Intrinsics.checkNotNullParameter(pinterestJsonObject, "pinterestJsonObject");
        vd0.c m13 = pinterestJsonObject.m("data");
        if (m13 != null) {
            pinterestJsonObject = m13;
        }
        vd0.a k13 = pinterestJsonObject.k("data");
        Intrinsics.checkNotNullExpressionValue(k13, "optJsonArray(...)");
        ArrayList arrayList = new ArrayList(g0.q(k13, 10));
        Iterator it = k13.iterator();
        while (it.hasNext()) {
            Object e13 = vd0.c.f125622b.e(((vd0.c) it.next()).f125623a, a0.class);
            Intrinsics.g(e13, "null cannot be cast to non-null type com.pinterest.identity.core.model.PrivacyAndDataSection");
            arrayList.add((a0) e13);
        }
        return arrayList;
    }
}
