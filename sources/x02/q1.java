package x02;

import com.pinterest.api.model.qh;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class q1 implements rz.d {

    /* renamed from: a, reason: collision with root package name */
    public final qh f131469a;

    public q1(qh dynamicFeedFactory) {
        Intrinsics.checkNotNullParameter(dynamicFeedFactory, "dynamicFeedFactory");
        this.f131469a = dynamicFeedFactory;
    }

    @Override // rz.d
    public final Object b(vd0.c pinterestJsonObject) {
        Intrinsics.checkNotNullParameter(pinterestJsonObject, "pinterestJsonObject");
        return qh.a(this.f131469a, pinterestJsonObject, null, 6);
    }
}
