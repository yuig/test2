package y12;

import com.pinterest.api.model.DynamicFeed;
import com.pinterest.api.model.qh;
import kotlin.jvm.internal.Intrinsics;
import qr0.e;
import rz.d;
import vd0.c;

/* loaded from: classes4.dex */
public final class a implements d {

    /* renamed from: a, reason: collision with root package name */
    public final qh f136659a;

    public a(qh dynamicFeedFactory) {
        Intrinsics.checkNotNullParameter(dynamicFeedFactory, "dynamicFeedFactory");
        this.f136659a = dynamicFeedFactory;
    }

    @Override // rz.d
    public final Object b(c pinterestJsonObject) {
        Intrinsics.checkNotNullParameter(pinterestJsonObject, "pinterestJsonObject");
        String o13 = pinterestJsonObject.o("url", "");
        Intrinsics.checkNotNullExpressionValue(o13, "optString(...)");
        DynamicFeed a13 = qh.a(this.f136659a, pinterestJsonObject, o13, 4);
        String str = a13.f35556d;
        return new e(a13.a(), o13, str != null ? str : "");
    }
}
