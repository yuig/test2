package su;

import fu.l;
import kotlin.jvm.internal.Intrinsics;
import ls1.g;
import ls1.h;
import m60.t;
import m60.w;
import nu.b;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import pu.c;
import pu.d;
import pu.n;
import sp2.k;
import u50.r;

/* loaded from: classes3.dex */
public final class a implements t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f115175a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f115176b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r f115177c;

    public a(String str, b bVar, r rVar) {
        this.f115175a = str;
        this.f115176b = bVar;
        this.f115177c = rVar;
    }

    @k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull l event) {
        Intrinsics.checkNotNullParameter(event, "event");
    }

    @k(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull g event) {
        Intrinsics.checkNotNullParameter(event, "event");
        boolean d2 = Intrinsics.d(event.f84691i, this.f115175a);
        r rVar = this.f115177c;
        if (d2) {
            ((w) this.f115176b.f92308c).i(event);
            rVar.a(new c(event.f84692j));
        }
        rVar.a(d.f101336a);
    }

    @k(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull h event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (Intrinsics.d(event.f84693i, this.f115175a)) {
            ((w) this.f115176b.f92308c).i(event);
            this.f115177c.a(new n(event.f84694j));
        }
    }
}
