package dv0;

import com.pinterest.feature.ideaPinCreation.metadata.model.PinEditAdvanceMeta;
import cv0.w;
import dl1.s;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import m60.t;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class l implements t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o f56366a;

    public l(o oVar) {
        this.f56366a = oVar;
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull pg0.e event) {
        Intrinsics.checkNotNullParameter(event, "event");
        xk1.c cVar = this.f56366a.f56376f;
        int i13 = -1;
        int i14 = 0;
        if (cVar instanceof bv0.g) {
            bv0.g gVar = (bv0.g) cVar;
            boolean z13 = event.f100059a;
            boolean z14 = !z13;
            Iterator it = CollectionsKt.F0(gVar.f135191h).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((s) it.next()) instanceof w) {
                    i13 = i14;
                    break;
                }
                i14++;
            }
            if (i13 > 0) {
                gVar.u1(i13, gVar.x(z14, z13));
                return;
            }
            return;
        }
        if (cVar instanceof bv0.d) {
            bv0.d dVar = (bv0.d) cVar;
            boolean z15 = event.f100059a;
            boolean z16 = !z15;
            Iterator it2 = CollectionsKt.F0(dVar.f135191h).iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                if (((s) it2.next()) instanceof w) {
                    i13 = i14;
                    break;
                }
                i14++;
            }
            if (i13 > 0) {
                dVar.u1(i13, dVar.w(z16, z15));
            }
        }
    }

    @sp2.k(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull tv0.l event) {
        Intrinsics.checkNotNullParameter(event, "event");
        o oVar = this.f56366a;
        oVar.f56374d.i(event);
        PinEditAdvanceMeta pinEditAdvanceMeta = oVar.f56371a;
        if (pinEditAdvanceMeta != null) {
            pinEditAdvanceMeta.f46542h = event.f119537a;
            oVar.f56376f.i2();
        }
    }
}
