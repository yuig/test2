package ol1;

import kotlin.jvm.internal.Intrinsics;
import m60.t;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import pg0.p0;
import sp2.k;
import uj2.v;
import wa2.p;

/* loaded from: classes2.dex */
public final class b implements t {

    /* renamed from: a, reason: collision with root package name */
    public final v f96443a;

    public b(v observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        this.f96443a = observer;
    }

    @k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull e e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
        String str = e13.f96451a;
        this.f96443a.c(new a(str, p.STATE_REPORTED, str));
    }

    @k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull p0 e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
        String id3 = e13.f100084a.getId();
        Intrinsics.checkNotNullExpressionValue(id3, "getUid(...)");
        this.f96443a.c(new a(id3, e13.a(), e13.f100085b));
    }
}
