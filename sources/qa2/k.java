package qa2;

import android.content.Context;
import com.pinterest.api.model.zs;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import so.oa;

/* loaded from: classes4.dex */
public final class k extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public static final k f103279i = new k(2);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        zs interest = (zs) obj;
        ((Boolean) obj2).getClass();
        Intrinsics.checkNotNullParameter(interest, "interest");
        Context context = kb0.a.f79058b;
        ((oa) ((j92.a) ep.b.g(j92.a.class))).E2().c(new lr.z(interest));
        return Unit.f80348a;
    }
}
