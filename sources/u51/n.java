package u51;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import com.pinterest.api.model.az0;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.wy0;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.navigation.Navigation;
import com.pinterest.screens.o3;
import h32.g0;
import h32.u0;
import java.util.ArrayList;
import java.util.List;
import kh2.m2;
import kotlin.jvm.internal.Intrinsics;
import m60.x0;

/* loaded from: classes5.dex */
public abstract class n extends BaseAdapter implements AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public List f120634a = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public q51.a f120636c = null;

    /* renamed from: b, reason: collision with root package name */
    public List f120635b = d();

    /* renamed from: d, reason: collision with root package name */
    public q51.a f120637d = null;

    public abstract ArrayList a();

    public abstract int b();

    @Override // android.widget.Adapter
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final View getView(int i13, View view, ViewGroup viewGroup) {
        int i14 = k.f120630d;
        k itemView = !(view instanceof k) ? new k(viewGroup.getContext(), null) : (k) view;
        itemView.f52226a.setText(((y) this.f120634a.get(i13)).f120645b);
        q51.a aVar = this.f120636c;
        if (aVar != null) {
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            itemView.f120631c = (s51.e) aVar;
        }
        return itemView;
    }

    public ArrayList d() {
        return new ArrayList();
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final void onItemClick(AdapterView adapterView, View view, int i13, long j13) {
        s51.e eVar;
        String userName;
        y item = (y) this.f120634a.get(i13);
        if (item == null || (eVar = ((k) view).f120631c) == null) {
            return;
        }
        Intrinsics.checkNotNullParameter(item, "item");
        int i14 = s51.a.f111149a[item.f120644a.ordinal()];
        int i15 = 0;
        gs0.a aVar = null;
        int i16 = 1;
        az0 az0Var = eVar.f111157a;
        switch (i14) {
            case 1:
                aVar = new gs0.a(az0Var, new u());
                break;
            case 2:
                aVar = new gs0.a(az0Var, new m(3));
                break;
            case 3:
                aVar = new gs0.a(az0Var, new m(0));
                break;
            case 4:
                aVar = new gs0.a(az0Var, new m(2));
                break;
            case 5:
                aVar = new gs0.a(az0Var, new m(1));
                break;
            case 6:
                f30 O = az0Var.O();
                if ((O != null ? O.D3() : null) != null) {
                    q51.b bVar = (q51.b) eVar.getView();
                    s51.d actionSuccessHandler = new s51.d(eVar, i15);
                    z zVar = (z) bVar;
                    zVar.getClass();
                    Intrinsics.checkNotNullParameter(actionSuccessHandler, "actionHandler");
                    yk1.v viewResources = (yk1.v) zVar.f120651q.getValue();
                    m60.w eventManager = zVar.f120652r;
                    if (eventManager == null) {
                        Intrinsics.r("eventManager");
                        throw null;
                    }
                    Intrinsics.checkNotNullParameter(viewResources, "viewResources");
                    Intrinsics.checkNotNullParameter(actionSuccessHandler, "actionSuccessHandler");
                    Intrinsics.checkNotNullParameter(eventManager, "eventManager");
                    int i17 = w02.b.unfollow_board_title;
                    int i18 = w02.b.unfollow_board_message;
                    Intrinsics.checkNotNullParameter(viewResources, "viewResources");
                    Intrinsics.checkNotNullParameter(actionSuccessHandler, "actionSuccessHandler");
                    yk1.a aVar2 = (yk1.a) viewResources;
                    String string = aVar2.f139224a.getString(i17);
                    Resources resources = aVar2.f139224a;
                    ep.b.C(c0.d.A(string, resources.getString(i18), resources.getString(w02.b.unfollow), resources.getString(x0.cancel), actionSuccessHandler), eventManager);
                    break;
                }
                break;
            case 7:
                wy0 U = az0Var.U();
                if (U != null) {
                    q51.b bVar2 = (q51.b) eVar.getView();
                    String Z2 = U.Z2();
                    userName = Z2 != null ? Z2 : "";
                    s51.d actionSuccessHandler2 = new s51.d(eVar, i16);
                    z zVar2 = (z) bVar2;
                    zVar2.getClass();
                    Intrinsics.checkNotNullParameter(userName, "userName");
                    Intrinsics.checkNotNullParameter(actionSuccessHandler2, "actionHandler");
                    yk1.v viewResources2 = (yk1.v) zVar2.f120651q.getValue();
                    m60.w eventManager2 = zVar2.f120652r;
                    if (eventManager2 == null) {
                        Intrinsics.r("eventManager");
                        throw null;
                    }
                    Intrinsics.checkNotNullParameter(userName, "userName");
                    Intrinsics.checkNotNullParameter(viewResources2, "viewResources");
                    Intrinsics.checkNotNullParameter(actionSuccessHandler2, "actionSuccessHandler");
                    Intrinsics.checkNotNullParameter(eventManager2, "eventManager");
                    int i19 = w02.b.unfollow_user_title;
                    int i23 = w02.b.unfollow_user_message;
                    Intrinsics.checkNotNullParameter(userName, "userName");
                    Intrinsics.checkNotNullParameter(viewResources2, "viewResources");
                    Intrinsics.checkNotNullParameter(actionSuccessHandler2, "actionSuccessHandler");
                    yk1.a aVar3 = (yk1.a) viewResources2;
                    String string2 = aVar3.f139224a.getString(i19, userName);
                    Resources resources2 = aVar3.f139224a;
                    ep.b.C(c0.d.A(string2, resources2.getString(i23), resources2.getString(w02.b.unfollow), resources2.getString(x0.cancel), actionSuccessHandler2), eventManager2);
                    break;
                }
                break;
            case 8:
                wy0 user = az0Var.U();
                if (user != null) {
                    q51.b bVar3 = (q51.b) eVar.getView();
                    b01.c actionHandler = new b01.c(20, user, eVar);
                    z zVar3 = (z) bVar3;
                    zVar3.getClass();
                    Intrinsics.checkNotNullParameter(user, "user");
                    Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
                    Boolean s22 = user.s2();
                    Intrinsics.checkNotNullExpressionValue(s22, "getBlockedByMe(...)");
                    boolean booleanValue = s22.booleanValue();
                    String Z22 = user.Z2();
                    String str = Z22 == null ? "" : Z22;
                    String z43 = user.z4();
                    String str2 = z43 == null ? "" : z43;
                    m60.w wVar = m60.u.f85943a;
                    Intrinsics.checkNotNullExpressionValue(wVar, "getInstance(...)");
                    m2.B1(zVar3.f120650p, booleanValue, str, str2, wVar, actionHandler);
                    break;
                }
                break;
            case 9:
            case 10:
                z zVar4 = (z) ((q51.b) eVar.getView());
                zVar4.dismiss();
                String string3 = zVar4.getResources().getString(w02.b.url_copyright_trademark);
                Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                m60.w wVar2 = zVar4.f120652r;
                if (wVar2 == null) {
                    Intrinsics.r("eventManager");
                    throw null;
                }
                wVar2.d(Navigation.z0((ScreenLocation) o3.f51171a.getValue(), string3));
                break;
            case 11:
                aVar = new gs0.a(az0Var, new m(5));
                break;
            case 12:
                aVar = new gs0.a(az0Var, new m(4));
                break;
            default:
                jc0.v vVar = new jc0.v(new gs0.a(az0Var, new u()), false, 0L, 30);
                String id3 = az0Var.getId();
                Intrinsics.checkNotNullExpressionValue(id3, "getUid(...)");
                eVar.getPinalytics().b0(u0.PIN_REPORT_BUTTON, g0.MODAL_DIALOG, id3, false);
                String str3 = item.f120646c;
                userName = str3 != null ? str3 : "";
                fk2.x a03 = eVar.f111159c.a0(id3, az0Var, userName, item.f120647d);
                ek0.e eVar2 = new ek0.e(eVar, id3, vVar);
                a03.j(eVar2);
                Intrinsics.checkNotNullExpressionValue(eVar2, "subscribeWith(...)");
                eVar.clearDisposables();
                eVar.addDisposable(eVar2);
                break;
        }
        gs0.a aVar4 = aVar;
        if (aVar4 != null) {
            eVar.getPinalytics().F(g0.NAVIGATION, u0.PIN_REPORT_BUTTON);
            eVar.f111163g.d(new jc0.v(aVar4, false, 0L, 30));
        }
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f120634a.size();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i13) {
        return (y) this.f120634a.get(i13);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i13) {
        return i13;
    }
}
