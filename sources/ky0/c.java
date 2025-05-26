package ky0;

import android.os.Bundle;
import com.pinterest.activity.nux.NUXActivity;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.gestalt.text.GestaltText;
import cp.b0;
import dh0.d;
import ek2.j;
import i32.y0;
import j40.e0;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import jk2.d0;
import jk2.q0;
import kotlin.collections.c0;
import kotlin.jvm.internal.Intrinsics;
import n60.o;
import rg0.s;
import ug0.f;
import ug0.i;
import uj2.a0;
import uj2.q;
import uk1.e;
import x02.v1;
import yk1.r;
import yk1.t;

/* loaded from: classes5.dex */
public final class c extends t implements jy0.a {

    /* renamed from: a, reason: collision with root package name */
    public final String[] f81125a;

    /* renamed from: b, reason: collision with root package name */
    public final oc.c f81126b;

    /* renamed from: c, reason: collision with root package name */
    public final s f81127c;

    /* renamed from: d, reason: collision with root package name */
    public final i f81128d;

    /* renamed from: e, reason: collision with root package name */
    public final v1 f81129e;

    /* renamed from: f, reason: collision with root package name */
    public final b60.b f81130f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f81131g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f81132h;

    /* renamed from: i, reason: collision with root package name */
    public final my0.b f81133i;

    /* renamed from: j, reason: collision with root package name */
    public j f81134j;

    /* renamed from: k, reason: collision with root package name */
    public final a0 f81135k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(String[] followedInterestIds, oc.c apolloClient, s experiences, i experiencesApi, v1 interestRepository, e pinalyticsFactory, q networkStateStream, b60.b activeUserManager) {
        super(((uk1.a) pinalyticsFactory).g(), networkStateStream);
        Intrinsics.checkNotNullParameter(followedInterestIds, "followedInterestIds");
        Intrinsics.checkNotNullParameter(apolloClient, "apolloClient");
        Intrinsics.checkNotNullParameter(experiences, "experiences");
        Intrinsics.checkNotNullParameter(experiencesApi, "experiencesApi");
        Intrinsics.checkNotNullParameter(interestRepository, "interestRepository");
        Intrinsics.checkNotNullParameter(pinalyticsFactory, "pinalyticsFactory");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        this.f81125a = followedInterestIds;
        this.f81126b = apolloClient;
        this.f81127c = experiences;
        this.f81128d = experiencesApi;
        this.f81129e = interestRepository;
        this.f81130f = activeUserManager;
        my0.b bVar = new my0.b();
        bVar.f88494a = "";
        bVar.f88495b = "";
        bVar.f88496c = "";
        bVar.f88497d = "";
        bVar.f88498e = y0.ANDROID_MAIN_USER_ED;
        this.f81133i = bVar;
        a0 a0Var = tk2.e.f118016b;
        Intrinsics.checkNotNullExpressionValue(a0Var, "computation(...)");
        this.f81135k = a0Var;
    }

    public final void p3() {
        clearDisposables();
        ((d) this.f81127c).i(y0.ANDROID_GLOBAL_NAG, null);
        if (isBound()) {
            ly0.d dVar = (ly0.d) ((jy0.b) getView());
            Bundle arguments = dVar.getArguments();
            String[] stringArray = arguments != null ? arguments.getStringArray(NUXActivity.FOLLOWED_CREATORS) : null;
            iy0.a aVar = dVar.f85120m0;
            if (aVar != null) {
                iy0.a.c(aVar, stringArray, null, null, 6);
            }
            if (isBound()) {
                i iVar = this.f81128d;
                HashMap q13 = ((vd0.c) iVar.f122140e.getValue()).q();
                Intrinsics.checkNotNullExpressionValue(q13, "optStringMap(...)");
                if (q13.containsKey(String.valueOf(((y0) ((ly0.d) ((jy0.b) getView())).f85124q0.getValue()).getValue()))) {
                    y0 placement = (y0) ((ly0.d) ((jy0.b) getView())).f85124q0.getValue();
                    Intrinsics.checkNotNullParameter(placement, "placement");
                    ((vd0.c) iVar.f122140e.getValue()).f125623a.y(String.valueOf(placement.value()));
                    ((d) iVar.i()).a();
                    q0 q0Var = new q0(iVar.g(new tg0.c(false, false)), new lb0.c(24, f.f122131i));
                    Intrinsics.checkNotNullExpressionValue(q0Var, "flatMapCompletable(...)");
                    fk2.c l13 = q0Var.l(tk2.e.f118017c);
                    Intrinsics.checkNotNullExpressionValue(l13, "subscribeOn(...)");
                    nl.b.r(l13, null, null, 3);
                }
            }
        }
    }

    @Override // yk1.p
    /* renamed from: q3, reason: merged with bridge method [inline-methods] */
    public final void r3(jy0.b view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((r) view);
        ly0.d dVar = (ly0.d) view;
        y0 y0Var = (y0) dVar.f85124q0.getValue();
        my0.b bVar = this.f81133i;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(y0Var, "<set-?>");
        bVar.f88498e = y0Var;
        bVar.x1(this.f81130f);
        String text = bVar.f88494a;
        Intrinsics.checkNotNullParameter(text, "text");
        GestaltText gestaltText = dVar.f85119l0;
        if (gestaltText != null) {
            pk.a0.p(gestaltText, text);
        }
        Intrinsics.checkNotNullParameter(bVar.f88495b, "text");
        Intrinsics.checkNotNullParameter(this, "listener");
        dVar.f85121n0 = this;
        String[] strArr = this.f81125a;
        int i13 = 1;
        int i14 = 0;
        if (!(strArr.length == 0)) {
            q P = this.f81129e.P((String) c0.B(strArr));
            hk2.b bVar2 = new hk2.b(new hx0.a(18, new dx0.d(dVar, 9)), new hx0.a(19, new a(this, i14)), ck2.i.f27923c);
            try {
                P.d(new d0(bVar2, 0L));
                Intrinsics.checkNotNullExpressionValue(bVar2, "subscribe(...)");
                addDisposable(bVar2);
            } catch (NullPointerException e13) {
                throw e13;
            } catch (Throwable th3) {
                throw o.g(th3, "subscribeActual failed", th3);
            }
        } else {
            ((ly0.d) ((jy0.b) getView())).b8("", RecyclerViewTypes.VIEW_TYPE_BOARD_MORE_IDEAS_UPSELL_CARD, 354);
        }
        e0 e0Var = new e0();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        xj2.c F = q.x(0L, 2500L, timeUnit, this.f81135k).J(q.M(5000L, timeUnit, this.f81135k)).t(new wv0.a(10, new b(i14, this, e0Var))).A(wj2.c.a()).H(tk2.e.f118017c).F(new hx0.a(20, new a(this, i13)), new hx0.a(21, new a(this, 2)), new b0(this, 24), ck2.i.f27924d);
        this.f81134j = (j) F;
        Intrinsics.checkNotNullExpressionValue(F, "also(...)");
        addDisposable(F);
    }
}
