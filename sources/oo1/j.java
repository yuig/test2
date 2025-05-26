package oo1;

import android.content.Context;
import android.content.res.Resources;
import com.pinterest.activity.sendapin.model.TypeAheadItem;
import com.pinterest.api.model.cf;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.fw;
import com.pinterest.api.model.gw;
import com.pinterest.api.model.mv;
import com.pinterest.api.model.ue;
import com.pinterest.api.model.wy0;
import com.pinterest.api.model.ze;
import com.pinterest.error.NetworkResponseError;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.screens.w1;
import h32.f1;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kh2.k3;
import kk2.t;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.f0;
import kotlin.collections.g0;
import kotlin.collections.h1;
import kotlin.jvm.internal.Intrinsics;
import m60.u;
import m60.w;
import m60.w0;
import m60.x0;
import nx.c1;
import pc.p0;
import pc.q0;
import pc.r0;
import so.oa;
import tb0.p;
import uj2.b0;
import x02.x2;
import x40.c0;
import x40.i5;
import x40.i6;
import x40.l0;
import x40.r5;
import xk2.v;
import z40.d0;

/* loaded from: classes5.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final j f96854a = new j();

    /* renamed from: b, reason: collision with root package name */
    public static final qb0.a f96855b = new qb0.a();

    /* renamed from: c, reason: collision with root package name */
    public static final List f96856c = f0.j("diy_crafts", "food_drink", "home_decor", "weddings", "womens_fashion");

    /* renamed from: d, reason: collision with root package name */
    public static final v f96857d = xk2.m.b(i.f96853i);

    public static final t a(Collection userIds, List externalUsers, List list, String str, int i13, no1.e conversationRemoteDataSource) {
        List list2 = list;
        Intrinsics.checkNotNullParameter(userIds, "userIds");
        Intrinsics.checkNotNullParameter(externalUsers, "externalUserIds");
        Intrinsics.checkNotNullParameter(conversationRemoteDataSource, "conversationRemoteDataSource");
        conversationRemoteDataSource.getClass();
        Intrinsics.checkNotNullParameter(userIds, "userIds");
        Intrinsics.checkNotNullParameter(externalUsers, "externalUsers");
        Collection collection = userIds;
        ArrayList arrayList = new ArrayList(g0.q(collection, 10));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        String str2 = (list2 == null || list.size() != 1) ? null : (String) list2.get(0);
        if (list2 == null || list.size() <= 1) {
            list2 = null;
        }
        t l13 = com.bumptech.glide.d.u0(conversationRemoteDataSource.f91667a.a(new i5(bk.f.b0(str), bk.f.b0(null), bk.f.b0(str2), bk.f.b0(list2), String.valueOf(i13), bk.f.b0(null), bk.f.b0(null), bk.f.b0(null), bk.f.b0(null), arrayList, bk.f.b0(externalUsers)))).k(new com.pinterest.framework.multisection.datasource.pagedlist.h(25, no1.b.f91660m)).l(wj2.c.a());
        Intrinsics.checkNotNullExpressionValue(l13, "observeOn(...)");
        return pk2.f.k(l13, "observeOn(...)");
    }

    public static final t b(String str, Collection userIds, List externalUsers, List list, String str2, String str3, String str4, String str5, String str6, int i13, no1.e conversationRemoteDataSource, String str7) {
        Intrinsics.checkNotNullParameter(userIds, "userIds");
        Intrinsics.checkNotNullParameter(externalUsers, "externalUserIds");
        Intrinsics.checkNotNullParameter(conversationRemoteDataSource, "conversationRemoteDataSource");
        conversationRemoteDataSource.getClass();
        Intrinsics.checkNotNullParameter(userIds, "userIds");
        Intrinsics.checkNotNullParameter(externalUsers, "externalUsers");
        Collection collection = userIds;
        ArrayList arrayList = new ArrayList(g0.q(collection, 10));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        List list2 = null;
        String str8 = (list == null || list.size() != 1) ? null : (String) list.get(0);
        if (list != null && list.size() > 1) {
            list2 = list;
        }
        t l13 = com.bumptech.glide.d.u0(conversationRemoteDataSource.f91667a.a(new r5(bk.f.b0(str2), bk.f.b0(str6), bk.f.b0(str8), bk.f.b0(list2), String.valueOf(i13), bk.f.b0(str), bk.f.b0(str5), bk.f.b0(str3), bk.f.b0(str4), arrayList, bk.f.b0(externalUsers), bk.f.b0(str7)))).k(new com.pinterest.framework.multisection.datasource.pagedlist.h(23, no1.b.f91661n)).l(wj2.c.a());
        Intrinsics.checkNotNullExpressionValue(l13, "observeOn(...)");
        return pk2.f.k(l13, "observeOn(...)");
    }

    public static final String c(b conversation, String separator, b60.b activeUserManager) {
        boolean F0;
        Intrinsics.checkNotNullParameter(conversation, "conversation");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        ArrayList arrayList = new ArrayList();
        for (bp1.g gVar : conversation.f96829b) {
            if (activeUserManager.e(gVar.f23667f)) {
                bp1.c cVar = conversation.f96828a;
                if (cVar instanceof m) {
                    F0 = kh2.d.G0(((m) cVar).f96860b);
                } else {
                    if (!(cVar instanceof n)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    F0 = kh2.d.F0(((n) cVar).f96861b);
                }
                arrayList.add(F0 ? gVar.f23665d : gVar.f23664c);
            }
        }
        arrayList.addAll(conversation.f96830c);
        return CollectionsKt.Z(arrayList, separator + " ", null, null, 0, null, null, 62);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final String d(z40.n conversation, String separator, b60.b activeUserManager) {
        b bVar;
        Intrinsics.checkNotNullParameter(conversation, "conversation");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        if (conversation instanceof z40.n) {
            bVar = new b(new m(conversation));
        } else {
            if (!(conversation instanceof ue)) {
                throw new IllegalArgumentException("Conversation type not allowed " + conversation);
            }
            bVar = new b(new n((ue) conversation));
        }
        return c(bVar, separator, activeUserManager);
    }

    public static String f(int i13) {
        String format = LocalDateTime.ofInstant(Instant.ofEpochSecond(i13), ZoneId.systemDefault()).format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }

    public static String g(Context context, Integer num) {
        Intrinsics.checkNotNullParameter(context, "context");
        Resources resources = context.getResources();
        int i13 = w0.followers_count_lowercase;
        int intValue = num != null ? num.intValue() : 0;
        Object[] objArr = new Object[1];
        int intValue2 = num != null ? num.intValue() : 0;
        f96855b.getClass();
        objArr[0] = qb0.j.b(intValue2);
        String quantityString = resources.getQuantityString(i13, intValue, objArr);
        Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
        return quantityString;
    }

    public static String h(d0 d0Var) {
        String l13 = d0Var != null ? d0Var.l() : null;
        if (l13 != null && l13.length() != 0) {
            if (d0Var != null) {
                return d0Var.l();
            }
            return null;
        }
        String f13 = d0Var != null ? d0Var.f() : null;
        if (f13 == null || f13.length() == 0) {
            if (d0Var != null) {
                return d0Var.g();
            }
            return null;
        }
        if (d0Var != null) {
            return d0Var.f();
        }
        return null;
    }

    public static final kk2.b i(TypeAheadItem recipient) {
        Intrinsics.checkNotNullParameter(recipient, "recipient");
        AbstractList abstractList = recipient.f35155p;
        Intrinsics.checkNotNullExpressionValue(abstractList, "getConversationUsers(...)");
        if (abstractList.isEmpty()) {
            return j(h1.c(recipient));
        }
        ArrayList arrayList = new ArrayList(g0.q(abstractList, 10));
        Iterator it = abstractList.iterator();
        while (it.hasNext()) {
            arrayList.add(((wy0) it.next()).getUid());
        }
        kk2.b j13 = b0.j(new Pair(CollectionsKt.H0(arrayList), new ArrayList()));
        Intrinsics.checkNotNullExpressionValue(j13, "just(...)");
        return j13;
    }

    public static final kk2.b j(Collection selectedUsers) {
        String A;
        Intrinsics.checkNotNullParameter(selectedUsers, "selectedUsers");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = selectedUsers.iterator();
        while (it.hasNext()) {
            TypeAheadItem typeAheadItem = (TypeAheadItem) it.next();
            er.c cVar = typeAheadItem.f35145f;
            int i13 = cVar == null ? -1 : f.f96840a[cVar.ordinal()];
            if (i13 == 1 || i13 == 2 || i13 == 3) {
                String k13 = typeAheadItem.k();
                if (k13 != null) {
                    arrayList2.add(k13);
                }
            } else if (i13 == 4 && (A = typeAheadItem.A()) != null) {
                arrayList.add(A);
            }
        }
        kk2.b j13 = b0.j(new Pair(arrayList, arrayList2));
        Intrinsics.checkNotNullExpressionValue(j13, "just(...)");
        return j13;
    }

    public static boolean k() {
        return ((Boolean) f96857d.getValue()).booleanValue();
    }

    public static final TypeAheadItem l(wy0 user) {
        Intrinsics.checkNotNullParameter(user, "user");
        boolean[] zArr = user.V1;
        String l33 = (zArr.length <= 65 || !zArr[65]) ? (zArr.length <= 62 || !zArr[62]) ? user.l3() : user.k3() : user.n3();
        TypeAheadItem typeAheadItem = new TypeAheadItem();
        typeAheadItem.f35140a = user.getUid();
        typeAheadItem.f35152m = true;
        typeAheadItem.f35143d = user.z4();
        typeAheadItem.f35142c = user.Z2();
        typeAheadItem.s(l33);
        typeAheadItem.f35145f = er.c.PINNER;
        return typeAheadItem;
    }

    public static boolean m(String str) {
        List listOfTopCategories = f96856c;
        Intrinsics.checkNotNullParameter(listOfTopCategories, "listOfTopCategories");
        fw.f37821a.getClass();
        f30 d2 = gw.d(str);
        if (d2 == null) {
            return false;
        }
        return CollectionsKt.L(listOfTopCategories, d2.K3());
    }

    public static void n(String convoId, mv anchorMessage) {
        Intrinsics.checkNotNullParameter(convoId, "convoId");
        Intrinsics.checkNotNullParameter(anchorMessage, "anchorMessage");
        Intrinsics.checkNotNullParameter("inline_reply_button", "entrypointSource");
        q(convoId, anchorMessage, false, "com.pinterest.EXTRA_BOARD_TREAD_CONVERSATION_SOURCE");
    }

    public static void o(String convoId, mv anchorMessage) {
        Intrinsics.checkNotNullParameter(convoId, "convoId");
        Intrinsics.checkNotNullParameter(anchorMessage, "anchorMessage");
        Intrinsics.checkNotNullParameter("inline_reply_button", "entrypointSource");
        q(convoId, anchorMessage, false, "com.pinterest.EXTRA_CONVO_NEW_PIN_IT_REPLY_THREAD");
    }

    public static void p(String convoId, mv message, String entrypointSource, boolean z13) {
        String str;
        Intrinsics.checkNotNullParameter(convoId, "convoId");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(entrypointSource, "entrypointSource");
        if (convoId.length() == 0) {
            vb0.j.f125466a.R(convoId.length() > 0, "Conversation ID must be non-empty to navigate to thread!", p.MESSAGING, new Object[0]);
            Context context = kb0.a.f79058b;
            ((oa) ((j92.a) ep.b.g(j92.a.class))).E2().h(x0.generic_error);
            return;
        }
        NavigationImpl z03 = Navigation.z0((ScreenLocation) w1.f51513y.getValue(), convoId);
        z03.y0(Boolean.FALSE, "com.pinterest.EXTRA_IS_CONTACT_REQUEST");
        z03.y0(Boolean.valueOf(z13), "com.pinterest.EXTRA_POP_KEYBOARD_FOR_REPLY");
        cf N = message.N();
        z03.m0("com.pinterest.EXTRA_CONVO_THREAD_ID", N != null ? N.getUid() : null);
        z03.m0("com.pinterest.EXTRA_CONVO_THREAD_ANCHOR_ID", message.getUid());
        if (message.N() == null) {
            z03.e(message);
        } else {
            cf N2 = message.N();
            if (N2 != null) {
                z03.e(N2);
            }
        }
        nx.d0 a13 = c1.a();
        f1 f1Var = f1.CONVERSATION_THREAD_CLOSEUP_VIEWED;
        cf N3 = message.N();
        if (N3 == null || (str = N3.getUid()) == null) {
            str = "";
        }
        HashMap o13 = ep.b.o("conversation_id", convoId);
        o13.put("conversation_message_id", message.getUid());
        o13.put("source", entrypointSource);
        Unit unit = Unit.f80348a;
        a13.g(f1Var, str, o13, false);
        u.f85943a.d(z03);
    }

    public static void q(String convoId, mv anchorMessage, boolean z13, String intentExtra) {
        String str;
        Intrinsics.checkNotNullParameter(convoId, "convoId");
        Intrinsics.checkNotNullParameter(anchorMessage, "anchorMessage");
        Intrinsics.checkNotNullParameter("inline_reply_button", "entrypointSource");
        Intrinsics.checkNotNullParameter(intentExtra, "intentExtra");
        int i13 = 0;
        if (convoId.length() == 0) {
            vb0.j.f125466a.R(convoId.length() > 0, "Conversation ID must be non-empty to navigate to thread!", p.MESSAGING, new Object[0]);
            Context context = kb0.a.f79058b;
            ((oa) ((j92.a) ep.b.g(j92.a.class))).E2().h(x0.generic_error);
            return;
        }
        NavigationImpl L = Navigation.L((ScreenLocation) w1.f51513y.getValue(), convoId, ml1.b.MODAL_TRANSITION.getValue());
        L.y0(Boolean.FALSE, "com.pinterest.EXTRA_IS_CONTACT_REQUEST");
        L.y0(Boolean.valueOf(z13), "com.pinterest.EXTRA_POP_KEYBOARD_FOR_REPLY");
        L.y0(Boolean.TRUE, intentExtra);
        cf N = anchorMessage.N();
        L.m0("com.pinterest.EXTRA_CONVO_THREAD_ID", N != null ? N.getUid() : null);
        L.m0("com.pinterest.EXTRA_CONVO_THREAD_ANCHOR_ID", anchorMessage.getUid());
        if (anchorMessage.N() == null) {
            L.e(anchorMessage);
        } else {
            cf N2 = anchorMessage.N();
            if (N2 != null) {
                ze zeVar = new ze(N2, i13);
                zeVar.f44314c = anchorMessage;
                boolean[] zArr = zeVar.f44317f;
                if (zArr.length > 2) {
                    zArr[2] = true;
                }
                L.e(new cf(zeVar.f44312a, zeVar.f44313b, anchorMessage, zeVar.f44315d, zeVar.f44316e, zArr, 0));
            }
        }
        nx.d0 a13 = c1.a();
        f1 f1Var = f1.CONVERSATION_THREAD_CLOSEUP_VIEWED;
        cf N3 = anchorMessage.N();
        if (N3 == null || (str = N3.getUid()) == null) {
            str = "";
        }
        HashMap o13 = ep.b.o("conversation_id", convoId);
        o13.put("conversation_message_id", anchorMessage.getUid());
        o13.put("source", "inline_reply_button");
        Unit unit = Unit.f80348a;
        a13.g(f1Var, str, o13, false);
        u.f85943a.d(L);
    }

    public static final void r(String errorString, Throwable th3) {
        v.f1 f1Var;
        Intrinsics.checkNotNullParameter(errorString, "errorString");
        NetworkResponseError networkResponseError = th3 instanceof NetworkResponseError ? (NetworkResponseError) th3 : null;
        qz.d M = (networkResponseError == null || (f1Var = networkResponseError.f45043a) == null) ? null : k3.M(f1Var);
        String str = M != null ? M.f105384d : null;
        if (str != null && str.length() != 0) {
            errorString = str;
        }
        Context context = kb0.a.f79058b;
        ((oa) ((j92.a) ep.b.g(j92.a.class))).E2().b(errorString);
    }

    public static final void s(w eventManager, Navigation navigation, z40.n nVar) {
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        String a13 = nVar != null ? nVar.a() : null;
        if (a13 != null) {
            if (navigation != null) {
                eventManager.d(new za.c(navigation));
            }
            NavigationImpl z03 = Navigation.z0((ScreenLocation) w1.f51510v.getValue(), a13);
            z03.e(nVar);
            eventManager.d(z03);
        }
    }

    public static kk2.m t(ArrayList userList, no1.e conversationRemoteDataSource) {
        Intrinsics.checkNotNullParameter(userList, "userList");
        Intrinsics.checkNotNullParameter(conversationRemoteDataSource, "conversationRemoteDataSource");
        e0.t.f56747e = y32.c.GROUP_BOARD.getValue();
        ArrayList arrayList = new ArrayList(g0.q(userList, 10));
        Iterator it = userList.iterator();
        while (it.hasNext()) {
            d0 user = (d0) it.next();
            Intrinsics.checkNotNullParameter(user, "user");
            String m13 = user.m() != null ? user.m() : user.e() != null ? user.e() : user.b();
            TypeAheadItem typeAheadItem = new TypeAheadItem();
            typeAheadItem.f35140a = user.a();
            typeAheadItem.f35152m = true;
            typeAheadItem.f35143d = user.g();
            typeAheadItem.f35142c = user.f();
            typeAheadItem.s(m13);
            typeAheadItem.f35145f = er.c.PINNER;
            arrayList.add(typeAheadItem);
        }
        kk2.m mVar = new kk2.m(j(arrayList), new com.pinterest.framework.multisection.datasource.pagedlist.h(28, new h(conversationRemoteDataSource, 2)), 0);
        Intrinsics.checkNotNullExpressionValue(mVar, "flatMap(...)");
        return mVar;
    }

    public static kk2.m u(String convoId, String str, String anchorMessageId, String str2, String str3, int i13, oc.c apolloClient, String str4) {
        Intrinsics.checkNotNullParameter(convoId, "convoId");
        Intrinsics.checkNotNullParameter(anchorMessageId, "anchorMessageId");
        Intrinsics.checkNotNullParameter(apolloClient, "apolloClient");
        r0 r0Var = p0.f99597a;
        if (str == null) {
            kk2.m k13 = com.bumptech.glide.d.u0(apolloClient.a(new i6(convoId, anchorMessageId, str2 == null ? r0Var : new q0(str2), str3 == null ? r0Var : new q0(str3), String.valueOf(i13), str4 == null ? r0Var : new q0(str4)))).k(new com.pinterest.framework.multisection.datasource.pagedlist.h(26, g.f96841j));
            Intrinsics.checkNotNullExpressionValue(k13, "map(...)");
            return k13;
        }
        kk2.m k14 = com.bumptech.glide.d.u0(apolloClient.a(new l0(convoId, str, str2 == null ? r0Var : new q0(str2), str3 == null ? r0Var : new q0(str3), String.valueOf(i13), str4 == null ? r0Var : new q0(str4)))).k(new com.pinterest.framework.multisection.datasource.pagedlist.h(27, g.f96846o));
        Intrinsics.checkNotNullExpressionValue(k14, "map(...)");
        return k14;
    }

    public static fk2.g v(String conversationId, String conversationSenderId, String conversationPinId, oc.c apolloClient) {
        Intrinsics.checkNotNullParameter(conversationId, "conversationId");
        Intrinsics.checkNotNullParameter(conversationSenderId, "conversationSenderId");
        Intrinsics.checkNotNullParameter(conversationPinId, "conversationPinId");
        Intrinsics.checkNotNullParameter(apolloClient, "apolloClient");
        fk2.g i13 = com.bumptech.glide.d.u0(apolloClient.a(new c0(conversationId, conversationSenderId, conversationPinId))).i();
        Intrinsics.checkNotNullExpressionValue(i13, "ignoreElement(...)");
        return i13;
    }

    public static void w(xj2.b compositeDisposable, String str, String str2, f30 f30Var, no1.e conversationRemoteDataSource, x2 userRepository, wy0 activeUser, w01.j shouldShowThreadEntryPoint) {
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(conversationRemoteDataSource, "conversationRemoteDataSource");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(activeUser, "activeUser");
        Intrinsics.checkNotNullParameter(shouldShowThreadEntryPoint, "shouldShowThreadEntryPoint");
        Boolean s43 = activeUser.s4();
        Intrinsics.checkNotNullExpressionValue(s43, "getShouldShowMessaging(...)");
        if (!s43.booleanValue() || str == null || str2 == null) {
            return;
        }
        userRepository.P(str).F(new dl1.c(15, new e.c(str2, f30Var, compositeDisposable, conversationRemoteDataSource, shouldShowThreadEntryPoint)), new dl1.c(16, g.f96848q), ck2.i.f27923c, ck2.i.f27924d);
    }
}
