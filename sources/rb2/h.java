package rb2;

import android.content.Context;
import android.content.res.Resources;
import android.text.Html;
import android.view.View;
import com.pinterest.api.model.wy0;
import com.pinterest.component.avatarpairs.AvatarPair;
import com.pinterest.component.avatarpairs.AvatarPairUpdate;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.text.GestaltText;
import h32.f1;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import kh2.b0;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.q0;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;
import m60.w0;
import m60.x0;
import nx.d0;
import nx.j0;
import rl1.k0;
import x40.rc;
import x40.tc;
import x40.uc;

/* loaded from: classes4.dex */
public final class h extends kotlin.jvm.internal.s implements kl2.n {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ i f107161i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f107162j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, int i13) {
        super(5);
        this.f107161i = iVar;
        this.f107162j = i13;
    }

    @Override // kl2.n
    public final Object p(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        List userList = (List) obj;
        z40.c conversation = (z40.c) obj2;
        final z40.f contactRequestApollo = (z40.f) obj3;
        String senderFullname = (String) obj4;
        String senderUsername = (String) obj5;
        Intrinsics.checkNotNullParameter(userList, "usersApollo");
        Intrinsics.checkNotNullParameter(conversation, "contactConversationApollo");
        Intrinsics.checkNotNullParameter(contactRequestApollo, "contactRequestApollo");
        Intrinsics.checkNotNullParameter(senderFullname, "senderFullname");
        Intrinsics.checkNotNullParameter(senderUsername, "senderUsername");
        final i iVar = this.f107161i;
        b60.b bVar = iVar.f107183t;
        if (bVar == null) {
            Intrinsics.r("activeUserManager");
            throw null;
        }
        wy0 f13 = ((b60.d) bVar).f();
        ArrayList H = kh2.d.H(f13 != null ? f13.getUid() : null, userList);
        int size = H.size();
        final int i13 = 0;
        AvatarPair avatarPair = iVar.f107167d;
        if (size > 2) {
            avatarPair.setVisibility(8);
            AvatarPairUpdate avatarPairUpdate = iVar.f107168e;
            avatarPairUpdate.setVisibility(0);
            b0.b2(avatarPairUpdate, H);
            Context context = iVar.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            rl1.g h10 = rl1.n.h(context);
            Context context2 = iVar.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            avatarPairUpdate.X(h10, rl1.n.d(context2));
        } else {
            pp2.a.T0(avatarPair, H, q0.f80391a);
            Context context3 = iVar.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            List list = rl1.n.f108641a;
            Intrinsics.checkNotNullParameter(context3, "context");
            rl1.g b13 = rl1.n.b(context3, k0.LegoAvatar_SizeMediumNew);
            Context context4 = iVar.getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
            avatarPair.Z(b13, rl1.n.h(context4));
        }
        Resources resources = iVar.getContext().getResources();
        int i14 = w0.contact_request_conversation_group_message_plural_update;
        oo1.j jVar = oo1.j.f96854a;
        Intrinsics.checkNotNullParameter(conversation, "conversation");
        Intrinsics.checkNotNullParameter(userList, "userList");
        List list2 = ((rc) conversation).f133184d;
        int size2 = userList.size() + (list2 != null ? list2.size() : 0);
        final int i15 = 1;
        String quantityString = resources.getQuantityString(i14, size2 - 1);
        Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
        GestaltText gestaltText = iVar.f107171h;
        pk.a0.p(gestaltText, quantityString);
        if (iVar.f107186w) {
            gestaltText.i(c.f107120t);
        }
        gestaltText.i(c.f107121u);
        c cVar = c.f107122v;
        GestaltText gestaltText2 = iVar.f107172i;
        gestaltText2.i(cVar);
        if (senderFullname == null) {
            senderFullname = senderUsername == null ? "" : senderUsername;
        }
        GestaltText gestaltText3 = iVar.f107169f;
        pk.a0.p(gestaltText3, senderFullname);
        kp.n m03 = kp.n.m0();
        Context context5 = iVar.getContext();
        Date date = ((uc) contactRequestApollo).f133469f;
        Locale locale = Locale.getDefault();
        Boolean bool = Boolean.FALSE;
        m03.getClass();
        String i03 = kp.n.i0(context5, date, locale, bool);
        Intrinsics.checkNotNullExpressionValue(i03, "formatTimestamp(...)");
        pk.a0.p(gestaltText2, i03);
        CharSequence text = gestaltText3.getText();
        CharSequence text2 = gestaltText.getText();
        StringBuilder sb3 = new StringBuilder();
        sb3.append((Object) text);
        sb3.append((Object) text2);
        iVar.setContentDescription(sb3.toString());
        iVar.setClickable(!iVar.f107185v);
        final int i16 = this.f107162j;
        iVar.setOnClickListener(new xo.u(iVar, contactRequestApollo, i16, 6));
        iVar.f107173j.d(c.f107116p).e(new gm1.a() { // from class: rb2.f
            @Override // gm1.a
            public final void h3(gm1.c it) {
                int i17 = i13;
                z40.f contactRequest = contactRequestApollo;
                i this$0 = iVar;
                switch (i17) {
                    case 0:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(contactRequest, "$contactRequest");
                        Intrinsics.checkNotNullParameter(it, "it");
                        String str = ((uc) contactRequest).f133465b;
                        j0 j0Var = this$0.f107166c;
                        d0.v(j0Var, f1.DECLINE_CONTACT_REQUEST_CLICK, str, false, 12);
                        this$0.f107185v = true;
                        kp.m b14 = this$0.b();
                        this$0.b();
                        Context context6 = this$0.getContext();
                        Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
                        b14.a(kp.m.b(context6, null), str, i16, null, this$0, j0Var);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(contactRequest, "$contactRequest");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.getClass();
                        String str2 = ((uc) contactRequest).f133465b;
                        HashMap f14 = z0.f(new Pair("contact_request_id", str2));
                        this$0.f107166c.g(f1.ACCEPT_CONTACT_REQUEST_CLICK, str2, f14, false);
                        this$0.g(i16, contactRequest);
                        break;
                }
            }
        });
        iVar.f107174k.d(c.f107117q).e(new gm1.a() { // from class: rb2.f
            @Override // gm1.a
            public final void h3(gm1.c it) {
                int i17 = i15;
                z40.f contactRequest = contactRequestApollo;
                i this$0 = iVar;
                switch (i17) {
                    case 0:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(contactRequest, "$contactRequest");
                        Intrinsics.checkNotNullParameter(it, "it");
                        String str = ((uc) contactRequest).f133465b;
                        j0 j0Var = this$0.f107166c;
                        d0.v(j0Var, f1.DECLINE_CONTACT_REQUEST_CLICK, str, false, 12);
                        this$0.f107185v = true;
                        kp.m b14 = this$0.b();
                        this$0.b();
                        Context context6 = this$0.getContext();
                        Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
                        b14.a(kp.m.b(context6, null), str, i16, null, this$0, j0Var);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(contactRequest, "$contactRequest");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.getClass();
                        String str2 = ((uc) contactRequest).f133465b;
                        HashMap f14 = z0.f(new Pair("contact_request_id", str2));
                        this$0.f107166c.g(f1.ACCEPT_CONTACT_REQUEST_CLICK, str2, f14, false);
                        this$0.g(i16, contactRequest);
                        break;
                }
            }
        });
        iVar.f107175l.d(c.f107118r).e(new gm1.a() { // from class: rb2.g
            @Override // gm1.a
            public final void h3(gm1.c it) {
                String str;
                String str2;
                rc rcVar;
                String str3;
                tc tcVar;
                int i17 = i13;
                final z40.f contactRequest = contactRequestApollo;
                i this$0 = iVar;
                switch (i17) {
                    case 0:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(contactRequest, "$contactRequest");
                        Intrinsics.checkNotNullParameter(it, "it");
                        m60.w wVar = this$0.f107179p;
                        if (wVar == null) {
                            Intrinsics.r("eventManager");
                            throw null;
                        }
                        wVar.d(new m92.b());
                        final kp.m b14 = this$0.b();
                        Context context6 = this$0.getContext();
                        Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
                        final GestaltButton gestaltButton = (GestaltButton) this$0.f107178o.findViewById(nb2.b.block_button);
                        final i92.k toastUtils = this$0.f107182s;
                        if (toastUtils == null) {
                            Intrinsics.r("toastUtils");
                            throw null;
                        }
                        Intrinsics.checkNotNullParameter(context6, "context");
                        final j0 pinalytics = this$0.f107166c;
                        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
                        Intrinsics.checkNotNullParameter(toastUtils, "toastUtils");
                        if (contactRequest == null || gestaltButton == null) {
                            return;
                        }
                        final Resources resources2 = context6.getResources();
                        uc ucVar = (uc) contactRequest;
                        final String str4 = ucVar.f133465b;
                        final HashMap f14 = z0.f(new Pair("contact_request_id", str4));
                        final tc tcVar2 = ucVar.f133472i;
                        if (tcVar2 == null) {
                            return;
                        }
                        Boolean bool2 = tcVar2.f133364e;
                        final boolean booleanValue = bool2 != null ? bool2.booleanValue() : false;
                        pinalytics.g(booleanValue ? f1.UNBLOCK_CONTACT_REQUEST_CLICK : f1.BLOCK_CONTACT_REQUEST_CLICK, str4, f14, false);
                        String str5 = tcVar2.f133373n;
                        if (str5 == null) {
                            str5 = "";
                        }
                        String str6 = tcVar2.f133374o;
                        String str7 = str6 != null ? str6 : "";
                        int i18 = booleanValue ? p60.d.unblock_user_title : p60.d.block_user_title;
                        int i19 = booleanValue ? x0.unblock : x0.block;
                        CharSequence string = booleanValue ? resources2.getString(p60.d.unblock_user_message) : Html.fromHtml(resources2.getString(p60.d.block_user_from_contact_request, str5, str7));
                        yb0.n nVar = new yb0.n(context6);
                        String string2 = resources2.getString(i18, str5);
                        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                        nVar.w(string2);
                        nVar.u(string);
                        String string3 = resources2.getString(i19);
                        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                        nVar.q(string3);
                        String string4 = resources2.getString(x0.cancel);
                        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                        nVar.m(string4);
                        nVar.f138513j = new View.OnClickListener() { // from class: kp.a
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                final m this$02 = m.this;
                                Intrinsics.checkNotNullParameter(this$02, "this$0");
                                final d0 pinalytics2 = pinalytics;
                                Intrinsics.checkNotNullParameter(pinalytics2, "$pinalytics");
                                final String contactRequestId = str4;
                                Intrinsics.checkNotNullParameter(contactRequestId, "$contactRequestId");
                                final HashMap auxData = f14;
                                Intrinsics.checkNotNullParameter(auxData, "$auxData");
                                final i92.k toastUtils2 = toastUtils;
                                Intrinsics.checkNotNullParameter(toastUtils2, "$toastUtils");
                                boolean z13 = booleanValue;
                                final z40.d0 d0Var = tcVar2;
                                final GestaltButton gestaltButton2 = gestaltButton;
                                final Resources resources3 = resources2;
                                this$02.f80558m = z13 ? this$02.f80553h.x(d0Var.a()).l(tk2.e.f118017c).h(wj2.c.a()).i(new xo.c(this$02, gestaltButton2, resources3, 3), new jp.d(5, new k(this$02, 2))) : this$02.f80553h.e(d0Var.a(), "message_request", ((uc) contactRequest).f133465b).l(tk2.e.f118017c).h(wj2.c.a()).i(new ak2.a() { // from class: kp.c
                                    @Override // ak2.a
                                    public final void run() {
                                        d0 pinalytics3 = d0.this;
                                        Intrinsics.checkNotNullParameter(pinalytics3, "$pinalytics");
                                        String contactRequestId2 = contactRequestId;
                                        Intrinsics.checkNotNullParameter(contactRequestId2, "$contactRequestId");
                                        HashMap auxData2 = auxData;
                                        Intrinsics.checkNotNullParameter(auxData2, "$auxData");
                                        i92.k toastUtils3 = toastUtils2;
                                        Intrinsics.checkNotNullParameter(toastUtils3, "$toastUtils");
                                        m this$03 = this$02;
                                        Intrinsics.checkNotNullParameter(this$03, "this$0");
                                        pinalytics3.g(f1.BLOCK_CONTACT_REQUEST_CONFIRM_CLICK, contactRequestId2, auxData2, false);
                                        toastUtils3.m(resources3.getString(yc0.e.block_contact_request_toast, d0Var.l()));
                                        this$03.getClass();
                                        gestaltButton2.d(l.f80543j);
                                        ek2.f fVar = this$03.f80558m;
                                        if (fVar != null) {
                                            bk2.c.dispose(fVar);
                                        }
                                    }
                                }, new jp.d(6, new k(this$02, 3)));
                            }
                        };
                        b14.f80547b.d(new yb0.e(nVar));
                        return;
                    default:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(contactRequest, "$contactRequest");
                        Intrinsics.checkNotNullParameter(it, "it");
                        m60.w wVar2 = this$0.f107179p;
                        if (wVar2 == null) {
                            Intrinsics.r("eventManager");
                            throw null;
                        }
                        wVar2.d(new m92.b());
                        kp.m b15 = this$0.b();
                        j0 pinalytics2 = this$0.f107166c;
                        Intrinsics.checkNotNullParameter(pinalytics2, "pinalytics");
                        if (contactRequest == null || (str = ((uc) contactRequest).f133465b) == null) {
                            str = "";
                        }
                        if (contactRequest == null || (tcVar = ((uc) contactRequest).f133472i) == null || (str2 = tcVar.f133362c) == null) {
                            str2 = "";
                        }
                        String str8 = (contactRequest == null || (rcVar = ((uc) contactRequest).f133471h) == null || (str3 = rcVar.f133183c) == null) ? "" : str3;
                        pinalytics2.g(f1.REPORT_CONTACT_REQUEST_CLICK, str, z0.f(new Pair("contact_request_id", str)), false);
                        wy0 wy0Var = (wy0) ((dl1.l) b15.f80549d).O(str2);
                        if (wy0Var != null) {
                            b15.f80547b.d(new jc0.v(new vq.h(wy0Var, str, str8, pinalytics2, b15.f80552g, b15.f80555j), false, 0L, 30));
                            return;
                        }
                        return;
                }
            }
        });
        iVar.f107176m.d(c.f107119s).e(new gm1.a() { // from class: rb2.g
            @Override // gm1.a
            public final void h3(gm1.c it) {
                String str;
                String str2;
                rc rcVar;
                String str3;
                tc tcVar;
                int i17 = i15;
                final z40.f contactRequest = contactRequestApollo;
                i this$0 = iVar;
                switch (i17) {
                    case 0:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(contactRequest, "$contactRequest");
                        Intrinsics.checkNotNullParameter(it, "it");
                        m60.w wVar = this$0.f107179p;
                        if (wVar == null) {
                            Intrinsics.r("eventManager");
                            throw null;
                        }
                        wVar.d(new m92.b());
                        final kp.m b14 = this$0.b();
                        Context context6 = this$0.getContext();
                        Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
                        final GestaltButton gestaltButton = (GestaltButton) this$0.f107178o.findViewById(nb2.b.block_button);
                        final i92.k toastUtils = this$0.f107182s;
                        if (toastUtils == null) {
                            Intrinsics.r("toastUtils");
                            throw null;
                        }
                        Intrinsics.checkNotNullParameter(context6, "context");
                        final j0 pinalytics = this$0.f107166c;
                        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
                        Intrinsics.checkNotNullParameter(toastUtils, "toastUtils");
                        if (contactRequest == null || gestaltButton == null) {
                            return;
                        }
                        final Resources resources2 = context6.getResources();
                        uc ucVar = (uc) contactRequest;
                        final String str4 = ucVar.f133465b;
                        final HashMap f14 = z0.f(new Pair("contact_request_id", str4));
                        final tc tcVar2 = ucVar.f133472i;
                        if (tcVar2 == null) {
                            return;
                        }
                        Boolean bool2 = tcVar2.f133364e;
                        final boolean booleanValue = bool2 != null ? bool2.booleanValue() : false;
                        pinalytics.g(booleanValue ? f1.UNBLOCK_CONTACT_REQUEST_CLICK : f1.BLOCK_CONTACT_REQUEST_CLICK, str4, f14, false);
                        String str5 = tcVar2.f133373n;
                        if (str5 == null) {
                            str5 = "";
                        }
                        String str6 = tcVar2.f133374o;
                        String str7 = str6 != null ? str6 : "";
                        int i18 = booleanValue ? p60.d.unblock_user_title : p60.d.block_user_title;
                        int i19 = booleanValue ? x0.unblock : x0.block;
                        CharSequence string = booleanValue ? resources2.getString(p60.d.unblock_user_message) : Html.fromHtml(resources2.getString(p60.d.block_user_from_contact_request, str5, str7));
                        yb0.n nVar = new yb0.n(context6);
                        String string2 = resources2.getString(i18, str5);
                        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                        nVar.w(string2);
                        nVar.u(string);
                        String string3 = resources2.getString(i19);
                        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                        nVar.q(string3);
                        String string4 = resources2.getString(x0.cancel);
                        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                        nVar.m(string4);
                        nVar.f138513j = new View.OnClickListener() { // from class: kp.a
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                final m this$02 = m.this;
                                Intrinsics.checkNotNullParameter(this$02, "this$0");
                                final d0 pinalytics2 = pinalytics;
                                Intrinsics.checkNotNullParameter(pinalytics2, "$pinalytics");
                                final String contactRequestId = str4;
                                Intrinsics.checkNotNullParameter(contactRequestId, "$contactRequestId");
                                final HashMap auxData = f14;
                                Intrinsics.checkNotNullParameter(auxData, "$auxData");
                                final i92.k toastUtils2 = toastUtils;
                                Intrinsics.checkNotNullParameter(toastUtils2, "$toastUtils");
                                boolean z13 = booleanValue;
                                final z40.d0 d0Var = tcVar2;
                                final GestaltButton gestaltButton2 = gestaltButton;
                                final Resources resources3 = resources2;
                                this$02.f80558m = z13 ? this$02.f80553h.x(d0Var.a()).l(tk2.e.f118017c).h(wj2.c.a()).i(new xo.c(this$02, gestaltButton2, resources3, 3), new jp.d(5, new k(this$02, 2))) : this$02.f80553h.e(d0Var.a(), "message_request", ((uc) contactRequest).f133465b).l(tk2.e.f118017c).h(wj2.c.a()).i(new ak2.a() { // from class: kp.c
                                    @Override // ak2.a
                                    public final void run() {
                                        d0 pinalytics3 = d0.this;
                                        Intrinsics.checkNotNullParameter(pinalytics3, "$pinalytics");
                                        String contactRequestId2 = contactRequestId;
                                        Intrinsics.checkNotNullParameter(contactRequestId2, "$contactRequestId");
                                        HashMap auxData2 = auxData;
                                        Intrinsics.checkNotNullParameter(auxData2, "$auxData");
                                        i92.k toastUtils3 = toastUtils2;
                                        Intrinsics.checkNotNullParameter(toastUtils3, "$toastUtils");
                                        m this$03 = this$02;
                                        Intrinsics.checkNotNullParameter(this$03, "this$0");
                                        pinalytics3.g(f1.BLOCK_CONTACT_REQUEST_CONFIRM_CLICK, contactRequestId2, auxData2, false);
                                        toastUtils3.m(resources3.getString(yc0.e.block_contact_request_toast, d0Var.l()));
                                        this$03.getClass();
                                        gestaltButton2.d(l.f80543j);
                                        ek2.f fVar = this$03.f80558m;
                                        if (fVar != null) {
                                            bk2.c.dispose(fVar);
                                        }
                                    }
                                }, new jp.d(6, new k(this$02, 3)));
                            }
                        };
                        b14.f80547b.d(new yb0.e(nVar));
                        return;
                    default:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(contactRequest, "$contactRequest");
                        Intrinsics.checkNotNullParameter(it, "it");
                        m60.w wVar2 = this$0.f107179p;
                        if (wVar2 == null) {
                            Intrinsics.r("eventManager");
                            throw null;
                        }
                        wVar2.d(new m92.b());
                        kp.m b15 = this$0.b();
                        j0 pinalytics2 = this$0.f107166c;
                        Intrinsics.checkNotNullParameter(pinalytics2, "pinalytics");
                        if (contactRequest == null || (str = ((uc) contactRequest).f133465b) == null) {
                            str = "";
                        }
                        if (contactRequest == null || (tcVar = ((uc) contactRequest).f133472i) == null || (str2 = tcVar.f133362c) == null) {
                            str2 = "";
                        }
                        String str8 = (contactRequest == null || (rcVar = ((uc) contactRequest).f133471h) == null || (str3 = rcVar.f133183c) == null) ? "" : str3;
                        pinalytics2.g(f1.REPORT_CONTACT_REQUEST_CLICK, str, z0.f(new Pair("contact_request_id", str)), false);
                        wy0 wy0Var = (wy0) ((dl1.l) b15.f80549d).O(str2);
                        if (wy0Var != null) {
                            b15.f80547b.d(new jc0.v(new vq.h(wy0Var, str, str8, pinalytics2, b15.f80552g, b15.f80555j), false, 0L, 30));
                            return;
                        }
                        return;
                }
            }
        });
        return Unit.f80348a;
    }
}
