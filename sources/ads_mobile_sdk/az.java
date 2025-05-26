package ads_mobile_sdk;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class az extends s implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final az f2600a = new az();

    public az() {
        super(1);
    }

    public static String a(uy it) {
        Intrinsics.checkNotNullParameter(it, "it");
        long j13 = zn2.b.j(it.a(), it.f12249b.a());
        return it.f12248a + "." + zn2.b.e(j13);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return a((uy) obj);
    }
}
