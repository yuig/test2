package sx0;

import com.pinterest.api.model.dh;
import com.pinterest.api.model.qx;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.navigation.Navigation;
import com.pinterest.screens.s2;
import dl1.s;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;
import m60.t;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import px0.i;
import r70.m;
import sp2.k;

/* loaded from: classes5.dex */
public final class d implements t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f115621a;

    public d(g gVar) {
        this.f115621a = gVar;
    }

    @k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull mx0.d hideEvent) {
        Intrinsics.checkNotNullParameter(hideEvent, "hideEvent");
        i iVar = this.f115621a.L0;
        if (iVar != null) {
            String id3 = hideEvent.f88469a;
            Intrinsics.checkNotNullParameter(id3, "id");
            boolean d2 = iVar.f101609d.d();
            nx0.c cVar = iVar.f101612g;
            if (d2) {
                nx0.d dVar = iVar.f101611f;
                if (dVar != null && dVar.a() > 0) {
                    s sVar = (s) dVar.getItem(0);
                    if (Intrinsics.d(sVar != null ? sVar.getUid() : null, id3)) {
                        dVar.clear();
                        return;
                    }
                }
                cVar.X(id3);
                if (cVar.d().size() == 1) {
                    Object obj = cVar.d().get(0);
                    Intrinsics.g(obj, "null cannot be cast to non-null type com.pinterest.api.model.NewsHubItem");
                    if (((qx) obj).g() == dh.DISPLAY_MODE_SECTION_TITLE) {
                        qx A = qx.A();
                        Intrinsics.checkNotNullExpressionValue(A, "makeEmptyItem(...)");
                        cVar.j2(A);
                        return;
                    }
                    return;
                }
                return;
            }
            cVar.X(id3);
            if (cVar.d().isEmpty()) {
                return;
            }
            if (cVar.d().size() == 1) {
                Object obj2 = cVar.d().get(0);
                Intrinsics.g(obj2, "null cannot be cast to non-null type com.pinterest.api.model.NewsHubItem");
                if (((qx) obj2).g() == dh.DISPLAY_MODE_SECTION_TITLE) {
                    cVar.Z();
                    return;
                }
            }
            if (cVar.d().size() > 1) {
                Object obj3 = cVar.d().get(0);
                Intrinsics.g(obj3, "null cannot be cast to non-null type com.pinterest.api.model.NewsHubItem");
                dh g13 = ((qx) obj3).g();
                dh dhVar = dh.DISPLAY_MODE_SECTION_TITLE;
                if (g13 == dhVar) {
                    Object obj4 = cVar.d().get(1);
                    Intrinsics.g(obj4, "null cannot be cast to non-null type com.pinterest.api.model.NewsHubItem");
                    if (((qx) obj4).g() == dhVar) {
                        cVar.removeItem(0);
                        return;
                    }
                }
            }
            Object d03 = CollectionsKt.d0(cVar.d());
            qx qxVar = d03 instanceof qx ? (qx) d03 : null;
            if ((qxVar != null ? qxVar.g() : null) == dh.DISPLAY_MODE_SECTION_TITLE) {
                cVar.removeItem(f0.i(cVar.d()));
            }
        }
    }

    @k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull mx0.e event) {
        Intrinsics.checkNotNullParameter(event, "event");
        i iVar = this.f115621a.L0;
        if (iVar != null) {
            String id3 = event.f88470a;
            Intrinsics.checkNotNullParameter(id3, "id");
            if (iVar.f101609d.d()) {
                nx0.c cVar = iVar.f101612g;
                Iterator it = cVar.d().iterator();
                int i13 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i13 = -1;
                        break;
                    } else if (Intrinsics.d(((s) it.next()).getUid(), id3)) {
                        break;
                    } else {
                        i13++;
                    }
                }
                s item = cVar.getItem(i13);
                qx qxVar = item instanceof qx ? (qx) item : null;
                if (qxVar != null) {
                    qxVar.E();
                    cVar.u1(i13, qxVar);
                }
            }
        }
    }

    @k(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull m tabDeepLinkEvent) {
        Intrinsics.checkNotNullParameter(tabDeepLinkEvent, "tabDeepLinkEvent");
        String string = tabDeepLinkEvent.f106398b.getString("com.pinterest.EXTRA_NOTIF_NEWS_ID");
        if (string != null) {
            this.f115621a.f7().d(Navigation.z0((ScreenLocation) s2.f51346e.getValue(), string));
        }
    }
}
