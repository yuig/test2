package dr;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.x;
import ap.o;
import com.pinterest.activity.conversation.view.GroupUserImageViewV2;
import com.pinterest.activity.sendapin.model.TypeAheadItem;
import com.pinterest.activity.sendapin.ui.PeoplePickerPersonCell;
import com.pinterest.activity.sendapin.ui.PersonListCell;
import com.pinterest.activity.sendapin.ui.ProgressSpinnerListCell;
import com.pinterest.api.model.wy0;
import com.pinterest.feature.sharesheet.view.ContactSearchListCell;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.gestalt.avatar.GestaltAvatar;
import com.pinterest.gestalt.buttonToggle.GestaltButtonToggle;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.screens.w3;
import com.pinterest.ui.brio.reps.pinner.PinnerGridCell;
import com.pinterest.ui.components.users.LegoUserRep;
import df.j1;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import jc0.s;
import kh2.k3;
import kh2.m0;
import kotlin.jvm.internal.Intrinsics;
import lh0.n1;
import m60.s0;
import m60.u;
import m60.w;
import m60.x0;
import nx.d0;
import oa2.t;
import pk.a0;
import qz.f0;
import rl1.r;
import so.oa;
import tb0.p;
import v.z1;

/* loaded from: classes3.dex */
public class k extends BaseAdapter implements fd1.j {
    public static final /* synthetic */ int H = 0;
    public final o A;
    public List B;
    public final w C;
    public final d0 D;
    public r E;
    public final Boolean F;
    public final h91.a G;

    /* renamed from: a, reason: collision with root package name */
    public final LayoutInflater f56186a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f56187b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f56188c;

    /* renamed from: d, reason: collision with root package name */
    public final hj0.a f56189d;

    /* renamed from: e, reason: collision with root package name */
    public final g91.c f56190e;

    /* renamed from: f, reason: collision with root package name */
    public final int f56191f;

    /* renamed from: g, reason: collision with root package name */
    public final int f56192g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f56193h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f56194i;

    /* renamed from: j, reason: collision with root package name */
    public final String f56195j;

    /* renamed from: k, reason: collision with root package name */
    public final l f56196k;

    /* renamed from: l, reason: collision with root package name */
    public final HashMap f56197l;

    /* renamed from: m, reason: collision with root package name */
    public final xj2.b f56198m;

    /* renamed from: n, reason: collision with root package name */
    public final Context f56199n;

    /* renamed from: o, reason: collision with root package name */
    public List f56200o;

    /* renamed from: p, reason: collision with root package name */
    public String f56201p;

    /* renamed from: q, reason: collision with root package name */
    public int f56202q;

    /* renamed from: r, reason: collision with root package name */
    public final z70.f f56203r;

    /* renamed from: s, reason: collision with root package name */
    public final lu1.b f56204s;

    /* renamed from: t, reason: collision with root package name */
    public final x f56205t;

    /* renamed from: u, reason: collision with root package name */
    public final b60.b f56206u;

    /* renamed from: v, reason: collision with root package name */
    public String f56207v;

    /* renamed from: w, reason: collision with root package name */
    public int f56208w;

    /* renamed from: x, reason: collision with root package name */
    public int f56209x;

    /* renamed from: y, reason: collision with root package name */
    public ProgressSpinnerListCell f56210y;

    /* renamed from: z, reason: collision with root package name */
    public f0 f56211z;

    public k(Context context, o oVar) {
        this(context, oVar, g91.c.RECIPIENT, false, x0.send, x0.sent, false, false, null, false);
    }

    public final void a(String str, List list, Boolean bool) {
        if (!a0.x0(str)) {
            ((b60.d) this.f56206u).f();
            TypeAheadItem typeAheadItem = new TypeAheadItem();
            typeAheadItem.f35142c = this.f56199n.getString(w42.c.email_to, str);
            typeAheadItem.f35145f = er.c.EMAIL_PLACEHOLDER;
            typeAheadItem.f35143d = str;
            list.add(typeAheadItem);
        }
        if (this.B.isEmpty()) {
            this.f56187b.post(new w.b(this, str, list, bool, 12));
            return;
        }
        if (str.equals(this.f56201p)) {
            this.f56200o = list;
        }
        notifyDataSetChanged();
        if (bool != null) {
            this.C.d(new h(a0.x0(str), bool.booleanValue()));
        }
    }

    public final void b() {
        xj2.b bVar = this.f56198m;
        if (bVar != null) {
            bVar.d();
        }
    }

    public void c() {
        if (this.f56207v.contains(this.f56201p)) {
            return;
        }
        Iterator it = this.f56200o.iterator();
        String trim = this.f56201p.trim();
        boolean z13 = false;
        while (it.hasNext()) {
            TypeAheadItem typeAheadItem = (TypeAheadItem) it.next();
            if (!typeAheadItem.q() && !a0.F(typeAheadItem.n(), trim)) {
                it.remove();
                z13 = true;
            }
        }
        if (z13) {
            notifyDataSetChanged();
        }
    }

    public final ProgressSpinnerListCell d() {
        if (this.f56210y == null) {
            this.f56210y = new ProgressSpinnerListCell(this.f56199n, null, 0);
        }
        return this.f56210y;
    }

    public int e() {
        return this.f56209x;
    }

    public final void f(String str) {
        NavigationImpl z03 = Navigation.z0((ScreenLocation) w3.f51516a.getValue(), str);
        s sVar = new s();
        w wVar = this.C;
        wVar.d(sVar);
        wVar.d(new s());
        z70.f fVar = this.f56203r;
        if (!fVar.f140992a || fVar.f140993b == null) {
            wVar.d(z03);
        } else {
            ((lu1.c) this.f56204s).r(this.f56199n, z03);
        }
    }

    public void g(String str) {
        if (str.equals(this.f56201p)) {
            return;
        }
        if (a0.x0(this.f56201p)) {
            i(true);
        }
        this.f56207v = this.f56201p;
        this.f56201p = str;
        h();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f56200o.size();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i13) {
        return this.f56200o.get(i13);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i13) {
        return i13;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.widget.Adapter
    public View getView(int i13, View view, ViewGroup viewGroup) {
        PersonListCell personListCell;
        String str;
        int color;
        ContactSearchListCell contactSearchListCell;
        TypeAheadItem typeAheadItem = (TypeAheadItem) this.f56200o.get(i13);
        Context context = this.f56199n;
        String str2 = "";
        int i14 = 0;
        CharSequence charSequence = null;
        boolean z13 = this.f56194i;
        boolean z14 = this.f56193h;
        LayoutInflater layoutInflater = this.f56186a;
        if (z13) {
            int i15 = 14;
            if (view instanceof ContactSearchListCell) {
                contactSearchListCell = (ContactSearchListCell) view;
                LegoUserRep legoUserRep = contactSearchListCell.f48387d;
                if (legoUserRep == null) {
                    Intrinsics.r("legoUserRep");
                    throw null;
                }
                t.i4(legoUserRep, "", 0, null, 14);
                LegoUserRep legoUserRep2 = contactSearchListCell.f48387d;
                if (legoUserRep2 == null) {
                    Intrinsics.r("legoUserRep");
                    throw null;
                }
                legoUserRep2.t0(false);
                LegoUserRep legoUserRep3 = contactSearchListCell.f48387d;
                if (legoUserRep3 == null) {
                    Intrinsics.r("legoUserRep");
                    throw null;
                }
                legoUserRep3.r0(false);
            } else {
                contactSearchListCell = (ContactSearchListCell) layoutInflater.inflate(e(), viewGroup, false);
                Context context2 = contactSearchListCell.getContext();
                int i16 = z14 ? eo1.b.color_themed_background_elevation_floating : eo1.b.color_themed_background_default;
                Object obj = d5.a.f53679a;
                contactSearchListCell.setBackgroundColor(context2.getColor(i16));
            }
            contactSearchListCell.setOnClickListener(null);
            contactSearchListCell.setClickable(false);
            contactSearchListCell.b(typeAheadItem);
            Intrinsics.checkNotNullParameter(this, "listener");
            contactSearchListCell.f48392i = this;
            String string = context.getString(this.f56191f);
            String string2 = context.getString(this.f56192g);
            HashMap hashMap = this.f56197l;
            contactSearchListCell.e(i13, string, string2, hashMap, this.f56190e);
            if (this.f56190e == g91.c.COLLABORATOR && !hashMap.containsKey(typeAheadItem.A())) {
                String A = typeAheadItem.A();
                this.f56198m.a(this.f56189d.prepare(this.f56195j, A).execute((ak2.e) new d(this, contactSearchListCell, A, i14), (ak2.e) new xo.l(i15)));
            }
            contactSearchListCell.setLayoutDirection(context.getResources().getConfiguration().getLayoutDirection());
            return contactSearchListCell;
        }
        boolean z15 = true;
        boolean z16 = true;
        if (view instanceof PersonListCell) {
            personListCell = (PersonListCell) view;
            personListCell.b(null);
            PinnerGridCell pinnerGridCell = personListCell.f35164d;
            GestaltText gestaltText = pinnerGridCell.f52220i;
            if (gestaltText != null) {
                gestaltText.i(new ea2.a(z16 ? 1 : 0, charSequence));
                pinnerGridCell.j();
                pinnerGridCell.i();
            }
            k3.R1(personListCell.f35164d, false);
        } else {
            personListCell = (PersonListCell) layoutInflater.inflate(e(), viewGroup, false);
            Context context3 = personListCell.getContext();
            int i17 = z14 ? eo1.b.color_themed_background_elevation_floating : eo1.b.color_themed_background_default;
            Object obj2 = d5.a.f53679a;
            personListCell.setBackgroundColor(context3.getColor(i17));
        }
        if (personListCell instanceof PeoplePickerPersonCell) {
            PeoplePickerPersonCell peoplePickerPersonCell = (PeoplePickerPersonCell) personListCell;
            r rVar = this.E;
            peoplePickerPersonCell.f35164d.f52217f.removeAllViews();
            peoplePickerPersonCell.f35164d.f52217f.f34883a = null;
            if (typeAheadItem.f35155p.isEmpty()) {
                str = "";
                int i18 = 3;
                if (typeAheadItem.q()) {
                    peoplePickerPersonCell.f35164d.f52217f.setVisibility(8);
                    peoplePickerPersonCell.a(peoplePickerPersonCell.f35165e);
                    peoplePickerPersonCell.f35165e.i2(true);
                    peoplePickerPersonCell.f35165e.setVisibility(0);
                    int i19 = gr.b.f65986a[typeAheadItem.f35145f.ordinal()];
                    if (i19 == 1) {
                        peoplePickerPersonCell.f35165e.setImageResource(s0.ic_cell_email_nonpds);
                    } else if (i19 == 2) {
                        int i23 = eo1.c.lego_icon_padding;
                        Context context4 = peoplePickerPersonCell.f35161a;
                        int V = bs1.c.V(context4, i23);
                        InsetDrawable insetDrawable = new InsetDrawable(bs1.c.k2(context4, sm1.b.ic_people_gestalt, eo1.b.color_white_0), V, V, V, V);
                        peoplePickerPersonCell.f35165e.setBackgroundColor(bs1.c.A(context4, eo1.b.color_themed_base_red_300));
                        peoplePickerPersonCell.f35165e.setImageDrawable(insetDrawable);
                    } else if (i19 == 3) {
                        peoplePickerPersonCell.f35165e.setImageResource(s0.ic_cell_facebook_nonpds);
                    }
                } else {
                    peoplePickerPersonCell.f35164d.f52217f.setVisibility(0);
                    peoplePickerPersonCell.f35165e.setVisibility(8);
                    GestaltAvatar a13 = peoplePickerPersonCell.f35164d.f52217f.a();
                    peoplePickerPersonCell.a(peoplePickerPersonCell.f35164d.f52217f);
                    if (typeAheadItem.l() == null) {
                        String l13 = typeAheadItem.l();
                        String n13 = typeAheadItem.n();
                        int i24 = typeAheadItem.f35147h;
                        Intrinsics.checkNotNullParameter(a13, "<this>");
                        a13.H2(new fv0.g(n13, i24, i18, l13));
                    } else if (typeAheadItem.f35145f == er.c.PINNER) {
                        String l14 = typeAheadItem.l();
                        String n14 = typeAheadItem.n();
                        int i25 = typeAheadItem.f35147h;
                        Intrinsics.checkNotNullParameter(a13, "<this>");
                        a13.H2(new fv0.g(n14, i25, i18, l14));
                    } else {
                        a13.H2(new lp.o(1, typeAheadItem));
                    }
                    a13.H2(new xo.j(20));
                }
                peoplePickerPersonCell.f35164d.f52217f.a().H2(new cp.i(rVar, 2));
            } else {
                AbstractList abstractList = typeAheadItem.f35155p;
                PinnerGridCell pinnerGridCell2 = peoplePickerPersonCell.f35164d;
                r rVar2 = r.LG;
                pinnerGridCell2.getClass();
                if (qb0.b.o(abstractList)) {
                    str = "";
                } else {
                    pinnerGridCell2.f52217f.removeAllViews();
                    pinnerGridCell2.f52216e = dl2.b.F0(pinnerGridCell2.getContext(), rVar2.getValue()) <= dl2.b.F0(pinnerGridCell2.getContext(), rVar2.getValue()) ? rVar2 : r.XL;
                    GroupUserImageViewV2 groupUserImageViewV2 = pinnerGridCell2.f52217f;
                    groupUserImageViewV2.getClass();
                    byte b13 = rVar2.getValue() <= re0.a.MEDIUM_USE_LAYOUT_PARAMS.getValue();
                    int K = b13 != false ? a0.K(32, groupUserImageViewV2.getResources()) : a0.K(52, groupUserImageViewV2.getResources());
                    int dimensionPixelOffset = b13 != false ? groupUserImageViewV2.getResources().getDimensionPixelOffset(eo1.c.small_multi_user_avatar_margin) : groupUserImageViewV2.getResources().getDimensionPixelOffset(eo1.c.large_multi_user_avatar_margin);
                    int i26 = 0;
                    for (int i27 = 2; i26 < i27; i27 = 2) {
                        String str3 = str2;
                        GestaltAvatar m13 = m0.m(groupUserImageViewV2.getContext(), b13 != false ? r.SM : r.LG, z15);
                        m13.H2(new xo.j(9));
                        groupUserImageViewV2.addView(m13);
                        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(K, K);
                        if (i26 == 0) {
                            groupUserImageViewV2.f34883a = m13;
                            layoutParams.bottomMargin = dimensionPixelOffset;
                            layoutParams.setMarginEnd(dimensionPixelOffset);
                            layoutParams.addRule(12);
                            layoutParams.addRule(21);
                        } else {
                            layoutParams.topMargin = dimensionPixelOffset;
                            layoutParams.setMarginStart(dimensionPixelOffset);
                            layoutParams.addRule(10);
                            layoutParams.addRule(20);
                        }
                        m13.setLayoutParams(layoutParams);
                        m0.V0(m13, (wy0) abstractList.get(i26));
                        i26++;
                        str2 = str3;
                        z15 = true;
                    }
                    str = str2;
                    int F0 = dl2.b.F0(groupUserImageViewV2.getContext(), rVar2.getValue());
                    groupUserImageViewV2.setLayoutParams(new FrameLayout.LayoutParams(F0, F0));
                    pinnerGridCell2.i();
                    pinnerGridCell2.setGravity(0);
                    pinnerGridCell2.f52224m = true;
                    pinnerGridCell2.j();
                }
                peoplePickerPersonCell.a(peoplePickerPersonCell.f35164d.f52217f);
            }
            peoplePickerPersonCell.b(typeAheadItem.n());
            String str4 = typeAheadItem.f35149j;
            if (str4 == null) {
                str4 = str;
            }
            String str5 = typeAheadItem.f35148i;
            if (str5 != null) {
                str = str5;
            }
            if (j1.d1(str4)) {
                String str6 = j1.d1(str) ? str : null;
                PinnerGridCell pinnerGridCell3 = peoplePickerPersonCell.f35164d;
                GestaltText gestaltText2 = pinnerGridCell3.f52220i;
                if (gestaltText2 != null) {
                    gestaltText2.i(new ea2.a(1, str6));
                    pinnerGridCell3.j();
                    pinnerGridCell3.i();
                }
            }
            personListCell.setOnClickListener(null);
            personListCell.setClickable(false);
            if (typeAheadItem.f35145f == er.c.CONTACT_NOT_FOUND_MISSING_PERMISSION) {
                int i28 = vc0.a.ic_invite_contact_tab_logo_nonpds;
                personListCell.f35164d.f52217f.setVisibility(0);
                personListCell.f35165e.setVisibility(8);
                personListCell.f35164d.f52217f.a().setImageResource(i28);
                k3.R1(personListCell.f35164d, true);
                Drawable drawable = personListCell.f35164d.f52217f.a().getDrawable();
                int i29 = eo1.b.color_themed_base_red_300;
                Intrinsics.checkNotNullParameter(context, "context");
                if (drawable != null) {
                    if (i29 == 0) {
                        int i33 = df0.a.f54892a;
                        Object obj3 = d5.a.f53679a;
                        color = context.getColor(i33);
                    } else {
                        Object obj4 = d5.a.f53679a;
                        color = context.getColor(i29);
                    }
                    Intrinsics.checkNotNullParameter(context, "context");
                    if (color == 0) {
                        color = context.getColor(df0.a.f54892a);
                    }
                    drawable.mutate().setTint(color);
                }
            }
            personListCell.findViewById(wy1.d.pinner_avatars);
            personListCell.findViewById(wy1.d.pinner_iv_container);
            ((GestaltButtonToggle) personListCell.findViewById(wy1.d.inline_add_button)).s(new yq.k(1, this, typeAheadItem));
        }
        personListCell.setLayoutDirection(context.getResources().getConfiguration().getLayoutDirection());
        return personListCell;
    }

    public final void h() {
        this.B = new ArrayList();
        if (a0.x0(this.f56201p)) {
            a(this.f56201p, Collections.emptyList(), null);
        }
        if (!a0.x0(this.f56201p) || this.f56188c) {
            g91.c cVar = g91.c.RECIPIENT;
            xj2.b bVar = this.f56198m;
            l lVar = this.f56196k;
            final int i13 = 0;
            g91.c cVar2 = this.f56190e;
            if (cVar2 == cVar) {
                String str = this.f56201p;
                final z1 z1Var = new z1(this, str, a0.x0(str));
                if (a0.x0(this.f56201p)) {
                    u20.d dVar = (u20.d) ((oa) lVar).Y5.get();
                    int i14 = this.f56208w;
                    dVar.getClass();
                    bVar.a(u20.d.d(dVar, i14).H(tk2.e.f118017c).A(wj2.c.a()).F(new ak2.e() { // from class: dr.b
                        @Override // ak2.e
                        public final void accept(Object obj) {
                            int i15 = i13;
                            z1 z1Var2 = z1Var;
                            vd0.c cVar3 = (vd0.c) obj;
                            switch (i15) {
                                case 0:
                                    z1Var2.h(cVar3.c("data"));
                                    break;
                                case 1:
                                    z1Var2.h(cVar3.c("data"));
                                    break;
                                default:
                                    z1Var2.h(cVar3.c("data"));
                                    break;
                            }
                        }
                    }, new ak2.e(this) { // from class: dr.c

                        /* renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ k f56163b;

                        {
                            this.f56163b = this;
                        }

                        @Override // ak2.e
                        public final void accept(Object obj) {
                            int i15 = i13;
                            k kVar = this.f56163b;
                            Throwable th3 = (Throwable) obj;
                            switch (i15) {
                                case 0:
                                    kVar.i(false);
                                    tk2.e.f118017c.b(new com.airbnb.lottie.k(th3, 27));
                                    break;
                                default:
                                    kVar.i(false);
                                    HashSet hashSet = tb0.h.f117076w;
                                    tb0.g.f117075a.q(th3, "SendShareService Fail: inviteUserExternalSent failed", p.SHARING);
                                    break;
                            }
                        }
                    }, ck2.i.f27923c, ck2.i.f27924d));
                } else {
                    u20.d dVar2 = (u20.d) ((oa) lVar).Y5.get();
                    String query = this.f56201p;
                    int i15 = this.f56208w;
                    dVar2.getClass();
                    Intrinsics.checkNotNullParameter(query, "query");
                    HashMap<String, Object> hashMap = new HashMap<>();
                    hashMap.put("page_size", Integer.valueOf(i15));
                    hashMap.put("q", query);
                    hashMap.put("add_fields", n00.b.a(n00.c.SEND_SHARE_CONTACT));
                    kk2.t l13 = dVar2.f120066a.c("share", hashMap).r(tk2.e.f118017c).l(wj2.c.a());
                    final int i16 = 1;
                    bVar.a(l13.o(new ak2.e() { // from class: dr.b
                        @Override // ak2.e
                        public final void accept(Object obj) {
                            int i152 = i16;
                            z1 z1Var2 = z1Var;
                            vd0.c cVar3 = (vd0.c) obj;
                            switch (i152) {
                                case 0:
                                    z1Var2.h(cVar3.c("data"));
                                    break;
                                case 1:
                                    z1Var2.h(cVar3.c("data"));
                                    break;
                                default:
                                    z1Var2.h(cVar3.c("data"));
                                    break;
                            }
                        }
                    }, new ak2.e(this) { // from class: dr.c

                        /* renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ k f56163b;

                        {
                            this.f56163b = this;
                        }

                        @Override // ak2.e
                        public final void accept(Object obj) {
                            int i152 = i16;
                            k kVar = this.f56163b;
                            Throwable th3 = (Throwable) obj;
                            switch (i152) {
                                case 0:
                                    kVar.i(false);
                                    tk2.e.f118017c.b(new com.airbnb.lottie.k(th3, 27));
                                    break;
                                default:
                                    kVar.i(false);
                                    HashSet hashSet = tb0.h.f117076w;
                                    tb0.g.f117075a.q(th3, "SendShareService Fail: inviteUserExternalSent failed", p.SHARING);
                                    break;
                            }
                        }
                    }));
                }
            } else if (cVar2 == g91.c.COLLABORATOR) {
                if (this.f56211z == null) {
                    this.f56211z = new f0();
                }
                final z1 z1Var2 = new z1(this, this.f56201p, false);
                u20.d dVar3 = (u20.d) ((oa) lVar).Y5.get();
                String query2 = this.f56201p;
                dVar3.getClass();
                Intrinsics.checkNotNullParameter(query2, "query");
                HashMap<String, Object> hashMap2 = new HashMap<>();
                hashMap2.put("q", query2);
                hashMap2.put("add_fields", n00.b.a(n00.c.SEND_SHARE_CONTACT));
                kk2.t l14 = dVar3.f120066a.c("group_board", hashMap2).r(tk2.e.f118017c).l(wj2.c.a());
                final int i17 = 2;
                bVar.a(l14.o(new ak2.e() { // from class: dr.b
                    @Override // ak2.e
                    public final void accept(Object obj) {
                        int i152 = i17;
                        z1 z1Var22 = z1Var2;
                        vd0.c cVar3 = (vd0.c) obj;
                        switch (i152) {
                            case 0:
                                z1Var22.h(cVar3.c("data"));
                                break;
                            case 1:
                                z1Var22.h(cVar3.c("data"));
                                break;
                            default:
                                z1Var22.h(cVar3.c("data"));
                                break;
                        }
                    }
                }, new xo.l(13)));
            }
            c();
        }
    }

    public final void i(boolean z13) {
        d().post(new v.s(this, z13, 5));
    }

    public k(Context context, o oVar, g91.c cVar, boolean z13, int i13, int i14, boolean z14, boolean z15, String str, boolean z16) {
        this.f56197l = new HashMap();
        this.f56198m = new xj2.b();
        this.f56200o = Collections.emptyList();
        this.f56201p = "";
        this.f56202q = 25;
        this.f56207v = "";
        this.f56208w = 15;
        this.f56209x = vc0.c.sharesheet_list_cell_person_lego_inline_send;
        this.B = Collections.emptyList();
        this.C = u.f85943a;
        this.D = sh.f.a();
        this.E = r.LG;
        n1.f83436b.c();
        this.F = Boolean.FALSE;
        this.G = h91.a.f68311d;
        this.A = oVar;
        l lVar = (l) j1.b0(l.class, context.getApplicationContext());
        this.f56196k = lVar;
        oa oaVar = (oa) lVar;
        this.f56189d = new hj0.a((f12.a) oaVar.H6.get());
        this.f56203r = oaVar.r2();
        this.f56204s = (lu1.b) oaVar.f113961v5.get();
        this.f56205t = oaVar.C2();
        this.f56206u = oaVar.l2();
        this.f56199n = context;
        this.f56190e = cVar;
        this.f56186a = (LayoutInflater) context.getSystemService("layout_inflater");
        this.f56187b = new Handler();
        this.f56188c = z13;
        this.f56191f = i13;
        this.f56192g = i14;
        this.f56193h = z14;
        this.f56194i = z15;
        this.f56195j = str;
        this.F = Boolean.valueOf(z16);
    }
}
