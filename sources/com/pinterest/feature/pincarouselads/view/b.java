package com.pinterest.feature.pincarouselads.view;

import android.os.Handler;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.f30;
import com.pinterest.ui.grid.PinterestRecyclerView;
import i32.y0;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final l21.b f47368a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f47369b;

    /* renamed from: c, reason: collision with root package name */
    public final PinterestRecyclerView f47370c;

    /* renamed from: d, reason: collision with root package name */
    public final long f47371d;

    public b(l21.b listener, Handler handler, PinterestRecyclerView recyclerView, long j13) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(handler, "handler");
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        this.f47368a = listener;
        this.f47369b = handler;
        this.f47370c = recyclerView;
        this.f47371d = j13;
    }

    @Override // java.lang.Runnable
    public final void run() {
        n21.i iVar = (n21.i) this.f47368a;
        int z13 = b40.z(iVar.f89010c) + 1 < iVar.f126435b.size() ? b40.z(iVar.f89010c) + 1 : -1;
        f30 f30Var = iVar.f89010c;
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        LinkedHashSet linkedHashSet = b40.f35971e;
        String uid = f30Var.getUid();
        if (uid == null) {
            uid = "";
        }
        if (!linkedHashSet.contains(uid) && z13 != -1) {
            f30 f30Var2 = iVar.f89010c;
            Intrinsics.checkNotNullParameter(f30Var2, "<this>");
            String uid2 = f30Var2.getUid();
            Intrinsics.f(uid2);
            linkedHashSet.add(uid2);
            y0 placement = y0.SHOPPING_ADS_AUTOSCROLL_COUNTER;
            dh0.d dVar = (dh0.d) iVar.f89014g;
            dVar.getClass();
            Intrinsics.checkNotNullParameter(placement, "placement");
            rg0.n b13 = dVar.b(placement);
            if (b13 != null) {
                if (b13.f108060b == i32.l.ANDROID_SHOPPING_ADS_AUTOSCROLL_EDUCATION.getValue()) {
                    b13.a(null, null);
                }
            }
        }
        if (z13 != -1) {
            this.f47370c.h(z13, true);
            this.f47369b.postDelayed(this, this.f47371d);
        }
    }
}
