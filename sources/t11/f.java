package t11;

import android.os.Bundle;
import aq.j;
import com.pinterest.api.model.ba;
import com.pinterest.api.model.rj0;
import com.pinterest.api.model.v7;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.navigation.NavigationImpl;
import df.j1;
import dv0.n;
import ep.g;
import h32.g0;
import h32.u0;
import i92.k;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import jk2.x;
import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.g1;
import lh0.q2;
import lh0.z3;
import m60.w;
import mf0.l;
import pk.a0;
import sq0.c0;
import tb0.p;
import v.q1;
import wk1.i;
import wk1.q;
import x02.a2;
import x02.i2;
import x02.x0;
import x02.z0;
import y0.t;
import yk1.v;

/* loaded from: classes5.dex */
public final class f extends q implements ca2.b, q11.c {

    /* renamed from: a, reason: collision with root package name */
    public final j f115801a;

    /* renamed from: b, reason: collision with root package name */
    public final w f115802b;

    /* renamed from: c, reason: collision with root package name */
    public final b60.b f115803c;

    /* renamed from: d, reason: collision with root package name */
    public final v f115804d;

    /* renamed from: e, reason: collision with root package name */
    public final h22.f f115805e;

    /* renamed from: f, reason: collision with root package name */
    public final i2 f115806f;

    /* renamed from: g, reason: collision with root package name */
    public final k f115807g;

    /* renamed from: h, reason: collision with root package name */
    public final q2 f115808h;

    /* renamed from: i, reason: collision with root package name */
    public final x0 f115809i;

    /* renamed from: j, reason: collision with root package name */
    public final z0 f115810j;

    /* renamed from: k, reason: collision with root package name */
    public s11.c f115811k;

    /* renamed from: l, reason: collision with root package name */
    public final LinkedHashMap f115812l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f115813m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f115814n;

    /* renamed from: o, reason: collision with root package name */
    public final b f115815o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(uk1.d presenterPinalytics, j editablePinWrapper, w eventManager, b60.b activeUserManager, v viewResources, h22.f storyPinService, i2 pinRepository, k toastUtils, q2 experiments, x0 boardRepository, z0 boardSectionRepository, uj2.q networkStateStream) {
        super(presenterPinalytics, networkStateStream);
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(editablePinWrapper, "editablePinWrapper");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        Intrinsics.checkNotNullParameter(viewResources, "viewResources");
        Intrinsics.checkNotNullParameter(storyPinService, "storyPinService");
        Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
        Intrinsics.checkNotNullParameter(toastUtils, "toastUtils");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(boardRepository, "boardRepository");
        Intrinsics.checkNotNullParameter(boardSectionRepository, "boardSectionRepository");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        this.f115801a = editablePinWrapper;
        this.f115802b = eventManager;
        this.f115803c = activeUserManager;
        this.f115804d = viewResources;
        this.f115805e = storyPinService;
        this.f115806f = pinRepository;
        this.f115807g = toastUtils;
        this.f115808h = experiments;
        this.f115809i = boardRepository;
        this.f115810j = boardSectionRepository;
        this.f115812l = new LinkedHashMap();
        this.f115814n = true;
        this.f115815o = new b(this);
    }

    public static void v3(j jVar, LinkedHashMap linkedHashMap) {
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (entry.getKey() == aq.d.TEMPLATE_TYPE) {
                jVar.b0((aq.d) entry.getKey(), (String) entry.getValue(), true);
            } else {
                jVar.b0((aq.d) entry.getKey(), (String) entry.getValue(), false);
            }
        }
    }

    public final void B3(q11.e userSelectType) {
        Intrinsics.checkNotNullParameter(userSelectType, "userSelectType");
        int i13 = a.f115791b[userSelectType.ordinal()];
        int i14 = 1;
        j jVar = this.f115801a;
        if (i13 == 1) {
            getPinalytics().b0(u0.PIN_DELETE_BUTTON, g0.MODAL_DIALOG, jVar.B(), false);
            jVar.q(new androidx.appcompat.widget.q(this, i14));
            return;
        }
        if (i13 == 3) {
            v3(jVar, this.f115812l);
            this.f115802b.d(new of0.a(new l()));
            jVar.p(new q1(this, i14));
            return;
        }
        if (i13 == 5) {
            getPinalytics().F(g0.REMOVE_SPONSORSHIP_MODAL, u0.SPONSORSHIP_CONFIRM_REMOVE_BUTTON);
            rj0 R = jVar.R();
            xj2.c o13 = this.f115805e.i(jVar.B()).r(tk2.e.f118017c).l(wj2.c.a()).o(new i11.c(16, new ky0.b(29, this, R)), new i11.c(17, new c(this, 2)));
            Intrinsics.checkNotNullExpressionValue(o13, "subscribe(...)");
            addDisposable(o13);
            return;
        }
        if (i13 == 6) {
            getPinalytics().F(g0.REMOVE_SPONSORSHIP_MODAL, u0.REMOVE_SPONSORSHIP_CANCEL_BUTTON);
            return;
        }
        if (i13 == 7) {
            getPinalytics().b0(u0.PIN_SAVED_BUTTON, g0.PIN_EDIT_LINK_ENGAGEMENT_METRICS_RESET_MODAL, jVar.B(), false);
            H3();
        } else {
            if (i13 != 8) {
                return;
            }
            getPinalytics().b0(u0.CANCEL_BUTTON, g0.MODAL_DIALOG, jVar.B(), false);
        }
    }

    public final void D3(aq.d field) {
        Intrinsics.checkNotNullParameter(field, "field");
        if (field == aq.d.LINK) {
            String t33 = t3(field);
            this.f115805e.j(t33).r(tk2.e.f118017c).l(wj2.c.a()).o(new i11.c(22, new ky0.b(26, t33, this)), new i11.c(23, new c(this, 1)));
        }
    }

    public final void F3() {
        String U;
        if (this.f115813m) {
            this.f115807g.h(ry1.f.pin_edit_publish_contains_error);
            return;
        }
        String t33 = t3(aq.d.PUBLISH_TIME);
        if (t33.length() == 0) {
            vb0.j.f125466a.J(new Throwable("Empty Publish Time while editing scheduled pins."), p.PIN_EDIT);
            int i13 = cd.b.f27547a;
            t33 = String.valueOf(System.currentTimeMillis());
        }
        q11.d dVar = (q11.d) getView();
        int i14 = ry1.f.publish_idea_pin_confirm_title;
        v viewResources = this.f115804d;
        yk1.a aVar = (yk1.a) viewResources;
        String string = aVar.f139224a.getString(i14);
        long parseLong = Long.parseLong(t33);
        Intrinsics.checkNotNullParameter(viewResources, "viewResources");
        Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
        Calendar calendar2 = Calendar.getInstance(TimeZone.getDefault());
        calendar2.setTimeInMillis(TimeUnit.SECONDS.toMillis(parseLong));
        if (calendar.get(6) == calendar2.get(6)) {
            U = aVar.f139224a.getString(p22.b.idea_pin_publish_alert_title_today, new SimpleDateFormat("hh:mm a").format(calendar2.getTime()));
        } else {
            U = j1.U(aVar.f139224a.getString(p22.b.idea_pin_publish_alert_title), new Object[]{calendar2.getTime(), new SimpleDateFormat("hh:mm a").format(calendar2.getTime())});
        }
        String str = U;
        u11.c cVar = (u11.c) dVar;
        cVar.S8(string, str, aVar.f139224a.getString(m60.x0.button_publish), aVar.f139224a.getString(m60.x0.cancel), q11.e.PUBLISH_CONFIRMED, q11.e.PUBLISH_CANCELLED);
    }

    public final void G3() {
        if (this.f115813m) {
            this.f115807g.h(ry1.f.pin_edit_save_contains_error);
            return;
        }
        aq.d dVar = aq.d.LINK;
        if (!(!Intrinsics.d(t3(dVar), this.f115801a.z(dVar)))) {
            H3();
            return;
        }
        q11.d dVar2 = (q11.d) getView();
        int i13 = ry1.f.pin_edit_link_change_alert_title;
        yk1.a aVar = (yk1.a) this.f115804d;
        ((u11.c) dVar2).S8(aVar.f139224a.getString(i13), aVar.f139224a.getString(ry1.f.pin_edit_link_change_alert_body), aVar.f139224a.getString(ry1.f.pin_edit_save), aVar.f139224a.getString(m60.x0.cancel), q11.e.SAVE_LINK_CONFIRMED, q11.e.SAVE_LINK_CANCELLED);
    }

    public final void H3() {
        LinkedHashMap linkedHashMap = this.f115812l;
        j jVar = this.f115801a;
        v3(jVar, linkedHashMap);
        this.f115802b.d(new of0.a(new l()));
        jVar.a0(new t(this, 2));
    }

    @Override // wk1.q
    public final void addDataSources(vq0.a dataSources) {
        Intrinsics.checkNotNullParameter(dataSources, "dataSources");
        s11.c cVar = new s11.c(this.f115801a, this, getPresenterPinalytics(), this.f115804d, this.f115808h);
        this.f115811k = cVar;
        ((i) dataSources).b(cVar);
    }

    @Override // wk1.q, yk1.b
    public final void onRestoreInstanceState(Bundle bundle) {
        if (bundle != null) {
            for (aq.d dVar : aq.d.values()) {
                if (bundle.containsKey(dVar.name())) {
                    LinkedHashMap linkedHashMap = this.f115812l;
                    String string = bundle.getString(dVar.name(), "");
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    linkedHashMap.put(dVar, string);
                }
            }
        }
        super.onRestoreInstanceState(bundle);
    }

    @Override // wk1.q, yk1.b
    public final void onSaveInstance(Bundle bundle) {
        if (bundle != null) {
            for (Map.Entry entry : this.f115812l.entrySet()) {
                aq.d dVar = (aq.d) entry.getKey();
                bundle.putString(dVar.name(), (String) entry.getValue());
            }
        }
        super.onSaveInstance(bundle);
    }

    @Override // wk1.q, yk1.p, yk1.b
    public final void onUnbind() {
        this.f115802b.j(this.f115815o);
        ((u11.c) ((q11.d) getView())).f120001y0 = null;
        super.onUnbind();
    }

    public final String t3(aq.d dVar) {
        String str = (String) this.f115812l.get(dVar);
        return str == null ? this.f115801a.z(dVar) : str;
    }

    public final boolean u3() {
        long seconds = TimeUnit.MILLISECONDS.toSeconds(Calendar.getInstance(TimeZone.getDefault()).getTimeInMillis());
        String str = (String) this.f115812l.get(aq.d.PUBLISH_TIME);
        Long valueOf = str != null ? Long.valueOf(Long.parseLong(str)) : null;
        return valueOf == null || valueOf.longValue() > seconds;
    }

    public final void w3(NavigationImpl navigationImpl) {
        hf0.b.k(((u11.c) ((q11.d) getView())).getView());
        ((nl1.d) ((q11.d) getView())).M1(navigationImpl);
    }

    @Override // wk1.q, yk1.p
    /* renamed from: x3, reason: merged with bridge method [inline-methods] */
    public final void r3(q11.d view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((c0) view);
        u11.c cVar = (u11.c) view;
        cVar.f120001y0 = this;
        int i13 = ry1.f.pin_edit_page_title;
        GestaltText gestaltText = cVar.B0;
        if (gestaltText == null) {
            Intrinsics.r("pageHeader");
            throw null;
        }
        a0.o(gestaltText, i13, new Object[0]);
        j jVar = this.f115801a;
        boolean z13 = !jVar.Y();
        GestaltButton gestaltButton = cVar.A0;
        if (gestaltButton == null) {
            Intrinsics.r("publishButton");
            throw null;
        }
        gestaltButton.d(new n(z13, 18));
        this.f115802b.h(this.f115815o);
        ba O = jVar.O();
        a2 a2Var = ck2.i.f27924d;
        ck2.c cVar2 = ck2.i.f27923c;
        x0 x0Var = this.f115809i;
        if (O == null) {
            v7 u13 = jVar.u();
            if (u13 != null) {
                String uid = u13.getUid();
                Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
                xj2.c F = new x(x0Var.L(uid), new d51.a(6, e.f115797k), 2).H(tk2.e.f118017c).A(wj2.c.a()).I(1L).F(new i11.c(20, new ky0.b(28, this, u13)), new i11.c(21, e.f115798l), cVar2, a2Var);
                Intrinsics.checkNotNullExpressionValue(F, "subscribe(...)");
                addDisposable(F);
            }
        } else {
            if (!this.f115814n) {
                return;
            }
            this.f115814n = false;
            String uid2 = O.getUid();
            Intrinsics.checkNotNullExpressionValue(uid2, "getUid(...)");
            uj2.q L = this.f115810j.L(uid2);
            v7 u14 = jVar.u();
            String uid3 = u14 != null ? u14.getUid() : null;
            if (uid3 == null) {
                uid3 = "";
            }
            xj2.c F2 = uj2.q.h(L, x0Var.L(uid3), new g(17, d.f115795i)).H(tk2.e.f118017c).A(wj2.c.a()).I(1L).F(new i11.c(18, new ky0.b(27, this, O)), new i11.c(19, e.f115796j), cVar2, a2Var);
            Intrinsics.checkNotNullExpressionValue(F2, "subscribe(...)");
            addDisposable(F2);
        }
        for (Map.Entry entry : this.f115812l.entrySet()) {
            s11.c cVar3 = this.f115811k;
            if (cVar3 == null) {
                Intrinsics.r("editablePinFieldSource");
                throw null;
            }
            cVar3.x((aq.d) entry.getKey(), (String) entry.getValue());
        }
        q2 q2Var = this.f115808h;
        q2Var.getClass();
        z3 z3Var = a4.f83297a;
        g1 g1Var = (g1) q2Var.f83463a;
        if (g1Var.o("android_product_tag_api_migration", "enabled", z3Var) || g1Var.l("android_product_tag_api_migration")) {
            s11.c cVar4 = this.f115811k;
            if (cVar4 == null) {
                Intrinsics.r("editablePinFieldSource");
                throw null;
            }
            List r13 = jVar.r();
            int size = r13 != null ? r13.size() : 0;
            HashMap hashMap = cVar4.f110593j;
            aq.d dVar = aq.d.PRODUCT_TAGS;
            if (((Integer) hashMap.get(dVar)) != null) {
                cVar4.x(dVar, size != 0 ? ((yk1.a) cVar4.f110592i).f139224a.getQuantityString(ry1.e.pin_edit_n_tags, size, Integer.valueOf(size)) : "");
            }
        }
    }

    public final void z3() {
        int i13 = r80.f.delete_pin_confirm_title;
        int i14 = r80.f.delete_pin_confirm;
        if (this.f115801a.Z()) {
            i13 = ry1.f.delete_idea_pin_confirm_title;
            i14 = ry1.f.delete_idea_pin_confirm_message;
        }
        q11.d dVar = (q11.d) getView();
        v vVar = this.f115804d;
        u11.c cVar = (u11.c) dVar;
        cVar.S8(((yk1.a) vVar).f139224a.getString(i13), ((yk1.a) vVar).f139224a.getString(i14), ((yk1.a) vVar).f139224a.getString(m60.x0.delete_confirm), ((yk1.a) vVar).f139224a.getString(m60.x0.cancel), q11.e.DELETE_CONFIRMED, q11.e.DELETE_CANCELLED);
    }
}
