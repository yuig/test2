package ads_mobile_sdk;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class hh0 extends s implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final hh0 f5973a = new hh0();

    public hh0() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        nm.s it = (nm.s) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        zn2.a aVar = zn2.b.f142311b;
        return new zn2.b(dl2.b.P2(it.e(), zn2.d.SECONDS));
    }
}
