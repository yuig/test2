package qb2;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import pb2.f;

/* loaded from: classes4.dex */
public final class c extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public static final c f103421i = new c(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        f item = (f) obj;
        Intrinsics.checkNotNullParameter(item, "item");
        String uid = item.getUid();
        Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
        return uid;
    }
}
