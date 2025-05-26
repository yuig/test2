package fe0;

import com.airbnb.lottie.j;
import ex0.g;
import ja.d0;
import kk2.k;
import kk2.t;
import kotlin.jvm.internal.Intrinsics;
import tk2.e;
import uj2.a0;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final ce0.a f62039a;

    public b(ce0.a networkSpeedDao) {
        Intrinsics.checkNotNullParameter(networkSpeedDao, "networkSpeedDao");
        this.f62039a = networkSpeedDao;
    }

    public final void a(ex0.a networkSpeed) {
        Intrinsics.checkNotNullParameter(networkSpeed, "networkSpeed");
        ce0.b networkSpeedEntity = new ce0.b(networkSpeed.f60375a, networkSpeed.f60376b, networkSpeed.f60377c, networkSpeed.f60378d, networkSpeed.f60379e, networkSpeed.f60380f, networkSpeed.f60381g, networkSpeed.f60382h);
        ce0.a aVar = this.f62039a;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(networkSpeedEntity, "networkSpeedEntity");
        d0 d0Var = aVar.f27584a;
        d0Var.b();
        d0Var.c();
        try {
            aVar.f27585b.o(networkSpeedEntity);
            d0Var.r();
        } finally {
            d0Var.m();
        }
    }

    public final void b(String ideaPinPageId, g status) {
        Intrinsics.checkNotNullParameter(ideaPinPageId, "ideaPinPageId");
        Intrinsics.checkNotNullParameter(status, "status");
        k kVar = new k(new j((Object) this, (Object) status, ideaPinPageId, 2), 1);
        a0 a0Var = e.f118017c;
        t r13 = kVar.r(a0Var);
        Intrinsics.checkNotNullExpressionValue(r13, "subscribeOn(...)");
        Object d2 = r13.r(a0Var).d();
        Intrinsics.checkNotNullExpressionValue(d2, "blockingGet(...)");
        ((Number) d2).intValue();
    }
}
