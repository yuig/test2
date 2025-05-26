package com.pinterest.feature.ideaPinCreation.closeup.view;

import android.view.KeyEvent;
import android.view.View;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.uq;
import com.pinterest.api.model.v7;
import com.pinterest.gestalt.avatar.GestaltAvatar;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class b0 implements m60.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f0 f46087a;

    public b0(f0 f0Var) {
        this.f46087a = f0Var;
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull hv0.e e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
        String str = e13.f70455a;
        f0 f0Var = this.f46087a;
        f0Var.getClass();
        f0Var.postDelayed(new dp.a(26, f0Var, str), 500L);
    }

    @sp2.k(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull hv0.f e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
        f0 f0Var = this.f46087a;
        m60.w wVar = f0Var.f46163h;
        if (wVar != null) {
            wVar.i(e13);
            String str = e13.f70456a;
            f0Var.getClass();
            f0Var.postDelayed(new dp.a(26, f0Var, str), 500L);
            return;
        }
        Intrinsics.r("eventManager");
        throw null;
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull hv0.h e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
        IdeaPinOverlayViewColorPickerModal L = this.f46087a.L();
        String uid = e13.f70459a;
        L.getClass();
        Intrinsics.checkNotNullParameter(uid, "uid");
        L.f46017h = uid;
        L.f46019j = e13.f70460b;
        L.k();
        KeyEvent.Callback callback = L.f46022m;
        g1 g1Var = callback instanceof g1 ? (g1) callback : null;
        if (g1Var == null) {
            return;
        }
        int i13 = k1.f46213a[g1Var.a0().ordinal()];
        String str = e13.f70461c;
        if (i13 == 1 || i13 == 2 || i13 == 3) {
            L.h(str);
            return;
        }
        if (i13 != 4) {
            return;
        }
        GestaltAvatar gestaltAvatar = L.f46016g;
        if (str != null) {
            gestaltAvatar.H2(new kl0.c(str, 28));
        }
        bs1.c.U1(gestaltAvatar);
        bs1.c.X0(L.f46015f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull hv0.i e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
        IdeaPinOverlayViewColorPickerModal L = this.f46087a.L();
        dl1.s model = e13.f70462a;
        L.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        L.f46020k = model;
        L.f46017h = model.getUid();
        View view = L.f46022m;
        g1 g1Var = view instanceof g1 ? (g1) view : null;
        if (g1Var == null) {
            return;
        }
        if (g1Var.a0() == uq.PRODUCT_TAG) {
            f30 f30Var = model instanceof f30 ? (f30) model : null;
            L.f46019j = f30Var != null ? f30Var.r4() : null;
        }
        L.k();
        int i13 = k1.f46213a[g1Var.a0().ordinal()];
        if (i13 != 1) {
            if (i13 != 3) {
                return;
            }
            v7 v7Var = model instanceof v7 ? (v7) model : null;
            if (v7Var == null) {
                return;
            }
            L.h(kh2.d.v(v7Var));
            return;
        }
        f30 f30Var2 = model instanceof f30 ? (f30) model : null;
        if (f30Var2 == null) {
            return;
        }
        String p03 = bs1.c.p0(f30Var2);
        if (p03 == null) {
            p03 = f30Var2.y4();
        }
        L.h(p03);
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull jc0.s e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
        this.f46087a.d0().A = true;
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull jc0.v e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
        this.f46087a.d0().A = false;
    }
}
