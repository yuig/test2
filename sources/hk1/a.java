package hk1;

import ao2.j0;
import bi1.a0;
import com.pinterest.repository.pin.PinService;
import k1.b0;
import kotlin.jvm.internal.Intrinsics;
import rh1.q1;
import x02.i2;

/* loaded from: classes2.dex */
public final class a implements l82.g {

    /* renamed from: a, reason: collision with root package name */
    public final PinService f69338a;

    /* renamed from: b, reason: collision with root package name */
    public final i2 f69339b;

    /* renamed from: c, reason: collision with root package name */
    public final i92.k f69340c;

    /* renamed from: d, reason: collision with root package name */
    public hk2.b f69341d;

    public a(PinService pinService, i2 pinRepository, i92.k toastUtils) {
        Intrinsics.checkNotNullParameter(pinService, "pinService");
        Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
        Intrinsics.checkNotNullParameter(toastUtils, "toastUtils");
        this.f69338a = pinService;
        this.f69339b = pinRepository;
        this.f69340c = toastUtils;
    }

    public final void j(uj2.l lVar, String str, boolean z13, u50.r rVar) {
        hk2.b bVar = this.f69341d;
        if (bVar != null) {
            bVar.dispose();
        }
        hk2.h h10 = lVar.h(tk2.e.f118017c);
        hk2.b bVar2 = new hk2.b(new q1(8, new a0(this, 15)), new q1(9, new b0((Object) rVar, z13, (Object) this, str, 18)), ck2.i.f27923c);
        h10.f(bVar2);
        this.f69341d = bVar2;
    }

    @Override // l82.g
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public final void e(j0 scope, b request, u50.r eventIntake) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
        boolean z13 = request instanceof c;
        PinService pinService = this.f69338a;
        if (z13) {
            j(pinService.favorite(((c) request).j(), n00.b.a(n00.c.BOARD_PIN_FEED)), "favorite", false, eventIntake);
        } else if (request instanceof d) {
            j(pinService.unfavorite(((d) request).j(), n00.b.a(n00.c.BOARD_PIN_FEED)), "unfavorite", true, eventIntake);
        }
    }
}
