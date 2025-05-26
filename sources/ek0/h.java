package ek0;

import com.pinterest.api.model.PinnableImage;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.wy0;
import com.pinterest.feature.board.BoardCreateOrPickerNavigation;
import com.pinterest.feature.board.create.namingview.view.BoardCreateBoardNamingView;
import com.pinterest.feature.board.create.view.BoardCreateBoardRepTile;
import com.pinterest.feature.pin.r;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.switchComponent.GestaltSwitchWithLabel;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.gestalt.textfield.view.GestaltTextField;
import com.pinterest.navigation.Navigation;
import df.j1;
import fk0.k;
import gi.m;
import h32.u0;
import i32.l;
import i32.y0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;
import lh0.p;
import m60.w;
import nx.d1;
import pk.a0;
import r1.j0;
import rg0.n;
import rg0.s;
import sv.y;
import uj2.q;
import x02.i2;
import x02.x0;
import x02.x2;
import yk1.v;

/* loaded from: classes5.dex */
public final class h extends yk1.f {
    public final m A;
    public final g70.h B;
    public p C;
    public final boolean D;
    public final com.pinterest.feature.pin.j E;
    public final z42.f F;
    public final r G;
    public List H;
    public int I;

    /* renamed from: J, reason: collision with root package name */
    public final String f59176J;
    public final z70.m K;
    public final f L;
    public final g M;

    /* renamed from: b, reason: collision with root package name */
    public boolean f59177b;

    /* renamed from: c, reason: collision with root package name */
    public final gp1.b f59178c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f59179d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f59180e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f59181f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f59182g;

    /* renamed from: h, reason: collision with root package name */
    public f30 f59183h;

    /* renamed from: i, reason: collision with root package name */
    public final String f59184i;

    /* renamed from: j, reason: collision with root package name */
    public final List f59185j;

    /* renamed from: k, reason: collision with root package name */
    public final PinnableImage f59186k;

    /* renamed from: l, reason: collision with root package name */
    public final String f59187l;

    /* renamed from: m, reason: collision with root package name */
    public final Navigation f59188m;

    /* renamed from: n, reason: collision with root package name */
    public String f59189n;

    /* renamed from: o, reason: collision with root package name */
    public final List f59190o;

    /* renamed from: p, reason: collision with root package name */
    public final oc.c f59191p;

    /* renamed from: q, reason: collision with root package name */
    public final w f59192q;

    /* renamed from: r, reason: collision with root package name */
    public final v f59193r;

    /* renamed from: s, reason: collision with root package name */
    public final i2 f59194s;

    /* renamed from: t, reason: collision with root package name */
    public final x0 f59195t;

    /* renamed from: u, reason: collision with root package name */
    public final x2 f59196u;

    /* renamed from: v, reason: collision with root package name */
    public final b60.b f59197v;

    /* renamed from: w, reason: collision with root package name */
    public final s f59198w;

    /* renamed from: x, reason: collision with root package name */
    public final zf0.f f59199x;

    /* renamed from: y, reason: collision with root package name */
    public final d1 f59200y;

    /* renamed from: z, reason: collision with root package name */
    public final h91.a f59201z;

    public h(Navigation navigation, xj0.a aVar, oc.c cVar, String str, String str2, i2 i2Var, x0 x0Var, x2 x2Var, b60.b bVar, w wVar, v vVar, q qVar, s sVar, zf0.f fVar, d1 d1Var, h91.a aVar2, m mVar, p pVar, com.pinterest.feature.pin.j jVar, r rVar, z70.m mVar2, g70.h hVar) {
        super(aVar, qVar);
        this.f59190o = Collections.emptyList();
        boolean z13 = false;
        this.D = false;
        this.F = z42.f.DEFAULT;
        this.H = Collections.emptyList();
        this.I = -1;
        this.L = new f(this);
        this.M = new g(this);
        this.f59194s = i2Var;
        this.f59195t = x0Var;
        this.f59196u = x2Var;
        this.f59197v = bVar;
        this.f59188m = navigation;
        this.C = pVar;
        this.f59185j = Collections.emptyList();
        this.f59184i = "";
        this.f59192q = wVar;
        this.f59193r = vVar;
        this.f59181f = true;
        this.f59182g = false;
        this.f59198w = sVar;
        this.f59199x = fVar;
        this.f59200y = d1Var;
        this.f59201z = aVar2;
        this.A = mVar;
        this.E = jVar;
        this.G = rVar;
        this.f59191p = cVar;
        this.f59176J = str;
        this.K = mVar2;
        this.B = hVar;
        BoardCreateOrPickerNavigation boardCreateOrPickerNavigation = (BoardCreateOrPickerNavigation) navigation.i0("com.pinterest.EXTRA_BOARD_CREATE_OR_PICKER_NAVIGATION_OBJECT");
        if (boardCreateOrPickerNavigation != null) {
            this.f59178c = boardCreateOrPickerNavigation.f45097k;
            List list = boardCreateOrPickerNavigation.f45088b;
            list = list == null ? this.f59185j : list;
            this.f59185j = list;
            this.f59184i = list.size() > 0 ? (String) this.f59185j.get(0) : this.f59184i;
            xj0.a aVar3 = (xj0.a) this.f139226a;
            HashMap auxData = boardCreateOrPickerNavigation.f45090d;
            auxData = auxData == null ? new HashMap() : auxData;
            aVar3.getClass();
            Intrinsics.checkNotNullParameter(auxData, "auxData");
            aVar3.f135154i = auxData;
            this.f59179d = boardCreateOrPickerNavigation.f45091e;
            this.f59187l = boardCreateOrPickerNavigation.f45092f;
            if (boardCreateOrPickerNavigation.f45094h) {
                this.f59180e = boardCreateOrPickerNavigation.f45093g;
            }
            List list2 = boardCreateOrPickerNavigation.f45087a;
            this.f59186k = (list2 == null || list2.isEmpty()) ? null : (PinnableImage) list2.get(0);
            List list3 = boardCreateOrPickerNavigation.f45095i;
            this.f59190o = list3 == null ? new ArrayList() : list3;
        }
        wy0 f13 = ((b60.d) bVar).f();
        if ((f13 == null || !f13.G3().booleanValue()) && navigation.S("com.pinterest.EXTRA_IS_JUMPSTART_ENABLED", false)) {
            z13 = true;
        }
        this.D = z13;
        aVar.f135155j = str2;
    }

    @Override // yk1.p, yk1.b
    public final void onUnbind() {
        w wVar = this.f59192q;
        wVar.j(this.L);
        wVar.j(this.M);
        this.f59201z.f68312a.values().clear();
        super.onUnbind();
    }

    public final void p3() {
        if (this.f59177b) {
            n b13 = ((dh0.d) this.f59198w).b(y0.ANDROID_REPIN_DIALOG_TAKEOVER);
            if (b13 != null) {
                b13.a(null, null);
            }
        }
        if (isBound() && !r3()) {
            if (!this.f59177b) {
                com.pinterest.feature.board.create.c cVar = (com.pinterest.feature.board.create.c) getView();
                k kVar = (k) cVar;
                kVar.h8(((yk1.a) this.f59193r).f139224a.getString(m60.x0.create_new_board_success), false);
            }
            if (this.f59178c != gp1.b.CREATE && this.f59181f) {
                ((k) ((com.pinterest.feature.board.create.c) getView())).b8(this.f59189n);
            }
        }
        this.f59182g = true;
    }

    public final List q3() {
        return (List) Arrays.stream(((yk1.a) this.f59193r).f139224a.getStringArray(x60.b.first_board_create_default_titles)).map(new b(0)).collect(Collectors.toList());
    }

    public final boolean r3() {
        return !this.f59190o.isEmpty();
    }

    @Override // yk1.p
    /* renamed from: s3, reason: merged with bridge method [inline-methods] */
    public final void r3(com.pinterest.feature.board.create.c cVar) {
        int i13;
        PinnableImage pinnableImage;
        super.r3((yk1.r) cVar);
        this.f59199x.getClass();
        this.f59177b = j1.D0(y0.ANDROID_REPIN_DIALOG_TAKEOVER, l.ANDROID_FIRST_BOARD_CREATE);
        k kVar = (k) cVar;
        Intrinsics.checkNotNullParameter(this, "listener");
        kVar.f62305u0 = this;
        Iterator it = this.f59190o.iterator();
        while (true) {
            i13 = 1;
            if (!it.hasNext()) {
                break;
            }
            q L = this.f59196u.L((String) it.next());
            qp.g gVar = new qp.g(this, i13);
            L.d(gVar);
            addDisposable(gVar);
        }
        int i14 = 0;
        if (this.f59177b || this.f59180e) {
            bs1.c.R1(kVar.c8(), true);
            kVar.d8(true);
        } else {
            kVar.d8(false);
        }
        BoardCreateBoardNamingView c83 = kVar.c8();
        boolean z13 = this.f59177b;
        GestaltTextField gestaltTextField = c83.f45159a;
        if (z13) {
            gestaltTextField.X(new ck0.a(x60.e.first_board_create_board_name_hint, x60.e.first_board_create_board_purpose_edu, i14));
        } else {
            int i15 = x60.e.board_name_label;
            GestaltText gestaltText = gestaltTextField.f49674e;
            String R = gestaltText != null ? a0.R(gestaltText) : null;
            if (R == null) {
                R = "";
            }
            if (R.length() == 0) {
                gestaltTextField.X(new j0(i15, 17));
            }
        }
        if (this.f59177b || this.f59180e) {
            String pinId = this.f59184i;
            BoardCreateBoardNamingView c84 = ((k) ((com.pinterest.feature.board.create.c) getView())).c8();
            if (kh2.j1.f1(this.f59184i)) {
                BoardCreateBoardNamingView boardNamingView = ((k) ((com.pinterest.feature.board.create.c) getView())).c8();
                List defaultSuggestedBoardNames = q3();
                oc.c apolloClient = this.f59191p;
                Intrinsics.checkNotNullParameter(apolloClient, "apolloClient");
                Intrinsics.checkNotNullParameter(pinId, "pinId");
                Intrinsics.checkNotNullParameter(boardNamingView, "boardNamingView");
                Intrinsics.checkNotNullParameter(this, "basePresenter");
                Intrinsics.checkNotNullParameter(defaultSuggestedBoardNames, "defaultSuggestedBoardNames");
                Intrinsics.checkNotNullParameter(this, "createBoardListener");
                kk2.m k13 = com.bumptech.glide.d.u0(apolloClient.c(new m30.i(pinId))).r(tk2.e.f118017c).l(wj2.c.a()).k(new lb0.c(29, i.f59202i));
                Intrinsics.checkNotNullExpressionValue(k13, "map(...)");
                addDisposable(nl.b.q(k13, new j(this, this, boardNamingView, defaultSuggestedBoardNames), new y(boardNamingView, defaultSuggestedBoardNames, pinId, 22)));
            } else {
                c84.b(q3());
            }
        }
        boolean z14 = this.f59185j.size() > 0 || this.f59186k != null;
        BoardCreateBoardRepTile boardCreateBoardRepTile = kVar.f62294j0;
        if (boardCreateBoardRepTile == null) {
            Intrinsics.r("boardRep");
            throw null;
        }
        bs1.c.R1(boardCreateBoardRepTile, z14);
        if (z14) {
            if (this.f59185j.size() == 0 && (pinnableImage = this.f59186k) != null) {
                String imageUrl = pinnableImage.f35569f;
                Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
                BoardCreateBoardRepTile boardCreateBoardRepTile2 = kVar.f62294j0;
                if (boardCreateBoardRepTile2 == null) {
                    Intrinsics.r("boardRep");
                    throw null;
                }
                boardCreateBoardRepTile2.L(imageUrl);
            }
            if (kh2.j1.f1(this.f59184i)) {
                String str = this.f59184i;
                c cVar2 = new c(this, (com.pinterest.feature.board.create.c) getView());
                this.f59194s.L(str).d(cVar2);
                addDisposable(cVar2);
            }
        }
        Navigation navigation = this.f59188m;
        if (navigation.i0("com.pinterest.EXTRA_SECRET") != null) {
            boolean booleanValue = ((Boolean) navigation.i0("com.pinterest.EXTRA_SECRET")).booleanValue();
            GestaltSwitchWithLabel gestaltSwitchWithLabel = kVar.f62295k0;
            if (gestaltSwitchWithLabel == null) {
                Intrinsics.r("secretBoardToggle");
                throw null;
            }
            c0.d.k(gestaltSwitchWithLabel, new jc0.m(booleanValue, 11));
            GestaltSwitchWithLabel gestaltSwitchWithLabel2 = kVar.f62295k0;
            if (gestaltSwitchWithLabel2 == null) {
                Intrinsics.r("secretBoardToggle");
                throw null;
            }
            pe.i.j(gestaltSwitchWithLabel2, new fk0.j(kVar, 2));
        }
        if (r3()) {
            kVar.e8(true);
        } else {
            String str2 = a0.x0(this.f59187l) ? null : this.f59187l;
            boolean z15 = str2 == null || z.j(str2);
            GestaltButton.SmallPrimaryButton smallPrimaryButton = kVar.f62301q0;
            if (smallPrimaryButton == null) {
                Intrinsics.r("createBtn");
                throw null;
            }
            bs1.c.s(smallPrimaryButton, new jc0.m(z15, 10));
            String str3 = kVar.f62304t0;
            if (!j1.U0(str3)) {
                str3 = null;
            }
            if (str3 != null) {
                str2 = str3;
            }
            if (str2 != null) {
                GestaltTextField gestaltTextField2 = kVar.f62302r0;
                if (gestaltTextField2 == null) {
                    Intrinsics.r("boardNameEt");
                    throw null;
                }
                ph.a.p(gestaltTextField2, new jc0.l(str2, 28));
            }
            GestaltTextField gestaltTextField3 = kVar.f62302r0;
            if (gestaltTextField3 == null) {
                Intrinsics.r("boardNameEt");
                throw null;
            }
            ph.a.p(gestaltTextField3, new fk0.j(kVar, i13));
            if (!this.f59177b && !this.f59180e) {
                GestaltTextField gestaltTextField4 = kVar.f62302r0;
                if (gestaltTextField4 == null) {
                    Intrinsics.r("boardNameEt");
                    throw null;
                }
                gestaltTextField4.requestFocus();
            }
            if (this.f59177b) {
                kVar.g8(false);
                kVar.e8(false);
                n b13 = ((dh0.d) this.f59198w).b(y0.ANDROID_REPIN_DIALOG_TAKEOVER);
                if (b13 != null) {
                    b13.g();
                }
            } else {
                kVar.e8(true);
                kVar.g8(true);
            }
        }
        w wVar = this.f59192q;
        wVar.h(this.L);
        wVar.h(this.M);
    }

    public final void t3(s7.z zVar, String source) {
        if (isBound()) {
            k kVar = (k) ((com.pinterest.feature.board.create.c) getView());
            ig1.b.O0(kVar.f62306v0, kVar.getView(), kVar.getContext());
        }
        xj0.a aVar = (xj0.a) this.f139226a;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(source, "source");
        HashMap hashMap = new HashMap();
        String str = aVar.f135155j;
        if (str != null) {
            hashMap.put("save_session_id", str);
        }
        if (j1.U0(source)) {
            hashMap.put("source", source);
        }
        aVar.f122379a.Z(u0.BOARD_CREATE, hashMap);
        boolean z13 = this.f59185j.size() > 0;
        com.pinterest.feature.board.create.c cVar = (com.pinterest.feature.board.create.c) getView();
        yk1.i iVar = yk1.i.LOADED;
        cVar.getClass();
        d dVar = new d(this, z13, cVar);
        this.f59195t.f0(zVar).d(dVar);
        addDisposable(dVar);
        this.G.c();
    }
}
