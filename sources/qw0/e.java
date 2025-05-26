package qw0;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import m60.t;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import pw0.e0;
import sw0.j0;

/* loaded from: classes5.dex */
public final class e implements t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f105273a;

    public e(j jVar) {
        this.f105273a = jVar;
    }

    @sp2.k(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull ag1.j e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
        j jVar = this.f105273a;
        jVar.f105294p.clear();
        jVar.f105302x.clear();
        ArrayList arrayList = jVar.f105295q;
        arrayList.clear();
        lg1.h hVar = jVar.f105299u;
        if (hVar != null) {
            hVar.a();
        }
        if (jVar.F3() && jVar.isBound()) {
            ((j0) ((e0) jVar.getView())).r9(false);
            ((j0) ((e0) jVar.getView())).x9(arrayList);
        }
    }
}
