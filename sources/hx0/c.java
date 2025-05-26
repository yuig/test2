package hx0;

import android.net.Uri;
import androidx.recyclerview.widget.b2;
import b40.o0;
import b40.u;
import b40.v;
import b40.w;
import b40.x;
import com.pinterest.api.model.dh;
import com.pinterest.api.model.qx;
import com.pinterest.api.model.tx;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.navigation.Navigation;
import com.pinterest.screens.s2;
import com.pinterest.ui.grid.PinterestRecyclerView;
import dl1.s;
import fk2.g;
import fk2.l;
import gi.m;
import gk2.f0;
import h32.u0;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kx0.o;
import ls1.j;
import m60.t;
import nx.d0;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import rg0.i0;
import sp2.k;
import uj2.a0;

/* loaded from: classes5.dex */
public final class c implements t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f70503a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f70504b;

    public c(e eVar, String str) {
        this.f70503a = eVar;
        this.f70504b = str;
    }

    @k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(j jVar) {
        if (jVar != null) {
            o oVar = (o) ((fx0.b) this.f70503a.getView());
            oVar.getClass();
            PinterestRecyclerView pinterestRecyclerView = oVar.f139736j0;
            if (pinterestRecyclerView != null) {
                pinterestRecyclerView.i(jVar.f84696i, 0);
            }
        }
    }

    @k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull i0 event) {
        Object adapter;
        Intrinsics.checkNotNullParameter(event, "event");
        e eVar = this.f70503a;
        eVar.f70518l.add(event.f108030a);
        int u33 = e.u3(eVar, eVar.f70520n.d(), event.f108030a);
        if (u33 <= -1 || (adapter = eVar.getAdapter()) == null) {
            return;
        }
        ((b2) adapter).i(u33);
    }

    @k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull zr0.a event) {
        Intrinsics.checkNotNullParameter(event, "event");
        e eVar = this.f70503a;
        int u33 = e.u3(eVar, eVar.f70520n.d(), event.f142748a);
        if (u33 > -1) {
            eVar.f70520n.removeItem(u33);
        }
        uo.a aVar = eVar.f70509c;
        aVar.getClass();
        String newsId = this.f70504b;
        Intrinsics.checkNotNullParameter(newsId, "newsId");
        String pinUid = event.f142748a;
        Intrinsics.checkNotNullParameter(pinUid, "pinUid");
        f0 u03 = com.bumptech.glide.d.u0(aVar.f122922a.a(new o0(newsId, pinUid)));
        a0 a0Var = tk2.e.f118017c;
        g i13 = u03.r(a0Var).l(wj2.c.a()).i();
        Intrinsics.checkNotNullExpressionValue(i13, "ignoreElement(...)");
        l h10 = i13.l(a0Var).h(wj2.c.a());
        Intrinsics.checkNotNullExpressionValue(h10, "observeOn(...)");
        nl.b.r(h10, null, b.f70500j, 1);
    }

    @k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(dq.a aVar) {
        u0 u0Var;
        ScreenLocation screenLocation;
        String str;
        dh dhVar;
        m mVar = this.f70503a.f70511e;
        mVar.getClass();
        dv1.e eVar = aVar.f56061a;
        if (eVar == null || (u0Var = aVar.f56062b) == null) {
            return;
        }
        tx txVar = eVar.f56390b;
        if (txVar != null && (dhVar = eVar.f56393e) != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("news_type", Integer.valueOf(txVar.getValue()).toString());
            hashMap.put("display_mode", Integer.valueOf(dhVar.getValue()).toString());
            ((d0) mVar.f65094c).f0(u0Var, null, eVar.f56394f, hashMap, false);
        }
        if (u0Var == u0.NEWS_HUB_HEADER_ICON) {
            List list = eVar.f56391c;
            if (list == null || list.size() != 1) {
                return;
            }
            Object obj = list.get(0);
            if (obj instanceof s) {
                mVar.D((s) obj);
                return;
            }
            if (obj instanceof d40.a) {
                screenLocation = (ScreenLocation) s2.f51342a.getValue();
                str = ((u) ((d40.a) obj)).f21751c;
            } else if (obj instanceof d40.j) {
                screenLocation = (ScreenLocation) s2.f51348g.getValue();
                str = ((w) ((d40.j) obj)).f21761c;
            } else if (obj instanceof d40.k) {
                screenLocation = (ScreenLocation) s2.f51351j.getValue();
                str = ((x) ((d40.k) obj)).f21764c;
            } else if (obj instanceof d40.b) {
                screenLocation = (ScreenLocation) s2.f51345d.getValue();
                str = ((v) ((d40.b) obj)).f21755c;
            } else {
                screenLocation = null;
                str = null;
            }
            if (screenLocation != null) {
                ((m60.w) mVar.f65095d).d(Navigation.z0(screenLocation, str));
                return;
            }
            return;
        }
        String str2 = aVar.f56063c;
        if (str2 != null) {
            nu1.a aVar2 = (nu1.a) mVar.f65093b;
            aVar2.getClass();
            if (str2.length() == 0) {
                return;
            }
            aVar2.a(Uri.parse(str2), null, null, true, false);
        }
    }

    @k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(dq.b bVar) {
        u0 u0Var;
        List list;
        m mVar = this.f70503a.f70511e;
        mVar.getClass();
        qx qxVar = bVar.f56064a;
        if (qxVar == null || (u0Var = bVar.f56065b) == null) {
            return;
        }
        if (qxVar.u() != null && qxVar.g() != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("news_type", Integer.valueOf(qxVar.u().getValue()).toString());
            hashMap.put("display_mode", Integer.valueOf(qxVar.g().getValue()).toString());
            ((d0) mVar.f65094c).f0(u0Var, null, qxVar.getUid(), hashMap, false);
        }
        if (u0Var == u0.NEWS_HUB_HEADER_ICON && (list = qxVar.f41415v) != null && list.size() == 1) {
            mVar.D((s) list.get(0));
        }
        String str = bVar.f56066c;
        if (str != null) {
            nu1.a aVar = (nu1.a) mVar.f65093b;
            aVar.getClass();
            if (str.length() == 0) {
                return;
            }
            aVar.a(Uri.parse(str), null, null, true, false);
        }
    }
}
