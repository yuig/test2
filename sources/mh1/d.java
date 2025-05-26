package mh1;

import android.content.Context;
import ck2.i;
import com.pinterest.api.model.az0;
import com.pinterest.api.model.deserializer.UserDidItDataDeserializer;
import com.pinterest.api.model.ge;
import com.pinterest.api.model.hx0;
import com.pinterest.api.model.z2;
import com.pinterest.framework.multisection.datasource.pagedlist.h0;
import dl1.s;
import ed1.m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import qz.f0;
import rh1.z;
import so.oa;
import we1.n1;
import x02.u;
import yk1.v;

/* loaded from: classes5.dex */
public final class d extends h0 {
    public final String E;
    public final String F;
    public final String G;
    public final String H;
    public final String I;

    /* renamed from: J, reason: collision with root package name */
    public final String f87165J;
    public final Function2 K;
    public final Function1 L;
    public final Function1 M;
    public final v N;
    public final u O;
    public final boolean P;
    public final String Q;
    public final Function1 R;
    public final Function0 S;
    public List T;
    public List U;
    public final HashMap V;
    public final LinkedHashSet W;
    public final boolean X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(String remoteUrl, String featuredCommentType, String featuredCommentUid, String featuredReplyUid, String badgedCommentId, String pinCreatorUid, String pinCreatorUsername, Function2 function2, Function1 shouldShowComment, Function1 hasExpandedReplies, v viewResources, u aggregatedCommentRepository, boolean z13, String selectedEngagementId, Function1 updateCommentPosition, Function0 possiblyShowReplies) {
        super(remoteUrl, new ke0.a[]{(ke0.a) ((oa) ((so1.b) ep.b.g(so1.b.class))).Fc.get(), (UserDidItDataDeserializer) ((oa) ((so1.b) ep.b.g(so1.b.class))).B4.get()}, null, null, null, null, null, null, 0L, 2044);
        Intrinsics.checkNotNullParameter(remoteUrl, "remoteUrl");
        Intrinsics.checkNotNullParameter(featuredCommentType, "featuredCommentType");
        Intrinsics.checkNotNullParameter(featuredCommentUid, "featuredCommentUid");
        Intrinsics.checkNotNullParameter(featuredReplyUid, "featuredReplyUid");
        Intrinsics.checkNotNullParameter(badgedCommentId, "badgedCommentId");
        Intrinsics.checkNotNullParameter(pinCreatorUid, "pinCreatorUid");
        Intrinsics.checkNotNullParameter(pinCreatorUsername, "pinCreatorUsername");
        Intrinsics.checkNotNullParameter(shouldShowComment, "shouldShowComment");
        Intrinsics.checkNotNullParameter(hasExpandedReplies, "hasExpandedReplies");
        Intrinsics.checkNotNullParameter(viewResources, "viewResources");
        Intrinsics.checkNotNullParameter(aggregatedCommentRepository, "aggregatedCommentRepository");
        Intrinsics.checkNotNullParameter(selectedEngagementId, "selectedEngagementId");
        Intrinsics.checkNotNullParameter(updateCommentPosition, "updateCommentPosition");
        Intrinsics.checkNotNullParameter(possiblyShowReplies, "possiblyShowReplies");
        Context context = kb0.a.f79058b;
        this.E = featuredCommentType;
        this.F = featuredCommentUid;
        this.G = featuredReplyUid;
        this.H = badgedCommentId;
        this.I = pinCreatorUid;
        this.f87165J = pinCreatorUsername;
        this.K = function2;
        this.L = shouldShowComment;
        this.M = hasExpandedReplies;
        this.N = viewResources;
        this.O = aggregatedCommentRepository;
        this.P = z13;
        this.Q = selectedEngagementId;
        this.R = updateCommentPosition;
        this.S = possiblyShowReplies;
        this.V = new HashMap();
        this.W = new LinkedHashSet();
        this.X = true;
        f0 f0Var = new f0();
        f0Var.e("fields", n00.b.a(n00.c.UNIFIED_COMMENTS_FIELDS));
        if (featuredCommentUid.length() > 0) {
            f0Var.e("did_it_featured_ids", featuredCommentUid);
            f0Var.e("comment_featured_ids", featuredCommentUid);
        }
        this.f49121k = f0Var;
        o(1, new c(this, 0));
        o(2, new c(this, 1));
        o(3, new c(this, 2));
        o(4, new c(this, 3));
        this.f49129s.F(new dh1.b(8, new n1(this, 24)), new dh1.b(9, a.f87158k), i.f27923c, i.f27924d);
    }

    public static final void e0(d dVar, z zVar, rp0.d dVar2, int i13) {
        if (i13 == 0) {
            dVar.getClass();
            zVar.getClass();
        }
        boolean booleanValue = ((Boolean) dVar.L.invoke(dVar2)).booleanValue();
        zVar.a5(booleanValue);
        zVar.J2(dVar.P);
        if (booleanValue) {
            zVar.v6(dVar2, i13, dVar.H, dVar.I, dVar.f87165J, dVar.Q, ((Boolean) dVar.M.invoke(dVar2)).booleanValue(), dVar.W.contains(dVar2.v()) ? null : (rp0.d) dVar.V.get(dVar2.v()));
        }
    }

    public static final void f0(d dVar) {
        Iterator it = dVar.d().iterator();
        int i13 = 0;
        while (true) {
            if (!it.hasNext()) {
                i13 = -1;
                break;
            } else if (Intrinsics.d(((s) it.next()).getUid(), dVar.Q)) {
                break;
            } else {
                i13++;
            }
        }
        if (i13 >= 0) {
            dVar.R.invoke(Integer.valueOf(i13));
        }
    }

    @Override // com.pinterest.framework.multisection.datasource.pagedlist.h0
    public final void b0(List itemsToSet, boolean z13) {
        Object obj;
        Intrinsics.checkNotNullParameter(itemsToSet, "itemsToSet");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : itemsToSet) {
            if (hashSet.add(((s) obj2).getUid())) {
                arrayList.add(obj2);
            }
        }
        super.b0(arrayList, z13);
        Iterator it = d().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (Intrinsics.d(((s) obj).getUid(), this.F)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        s sVar = (s) obj;
        Function2 function2 = this.K;
        if (function2 != null && sVar != null) {
            String str = this.G;
            if (str.length() > 0) {
                this.O.L(str).F(new dh1.b(6, new m(function2, this, sVar, 14)), new dh1.b(7, a.f87160m), i.f27923c, i.f27924d);
            }
        }
        this.S.invoke();
        g0(itemsToSet);
    }

    public final void g0(List list) {
        List X;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            s sVar = (s) it.next();
            z2 z2Var = sVar instanceof z2 ? (z2) sVar : null;
            if (z2Var != null && (X = z2Var.X()) != null && (!X.isEmpty())) {
                HashMap hashMap = this.V;
                if (hashMap.size() < 3) {
                    z2 z2Var2 = (z2) sVar;
                    List X2 = z2Var2.X();
                    Intrinsics.f(X2);
                    String str = (String) X2.get(0);
                    String uid = z2Var2.getUid();
                    Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
                    hashMap.put(uid, null);
                    Intrinsics.f(str);
                    xj2.c E = this.O.L(str).E(new dh1.b(10, new ic1.c(27, this, sVar)), new dh1.b(11, a.f87159l));
                    Intrinsics.checkNotNullExpressionValue(E, "subscribe(...)");
                    u(E);
                }
            }
        }
    }

    @Override // sq0.e0
    public final int getItemViewType(int i13) {
        s sVar = (s) d().get(i13);
        if (sVar instanceof z2) {
            return 1;
        }
        if (sVar instanceof az0) {
            return 2;
        }
        if (sVar instanceof hx0) {
            return 3;
        }
        if (sVar instanceof ge) {
            return 4;
        }
        throw new IllegalStateException("Unknown view type");
    }

    public final void h0(List list) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        String str = this.F;
        if (str.length() > 0 && Intrinsics.d(this.E, "aggregatedcomment")) {
            linkedHashSet.add(str);
        }
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                linkedHashSet.add((String) it.next());
            }
        }
        f0 f0Var = this.f49121k;
        if (f0Var != null) {
            f0Var.e("comment_featured_ids", CollectionsKt.Z(linkedHashSet, ",", null, null, 0, null, null, 62));
        }
        this.T = list;
    }

    @Override // wt1.b
    public final boolean i() {
        return this.X;
    }

    public final void i0(List list) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        String str = this.F;
        if (str.length() > 0 && Intrinsics.d(this.E, "userdiditdata")) {
            linkedHashSet.add(str);
        }
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                linkedHashSet.add((String) it.next());
            }
        }
        f0 f0Var = this.f49121k;
        if (f0Var != null) {
            f0Var.e("did_it_featured_ids", CollectionsKt.Z(linkedHashSet, ",", null, null, 0, null, null, 62));
        }
        this.U = list;
    }

    @Override // com.pinterest.framework.multisection.datasource.pagedlist.h0
    public final void w(List itemsToAppend, boolean z13) {
        Intrinsics.checkNotNullParameter(itemsToAppend, "itemsToAppend");
        super.w(itemsToAppend, z13);
        g0(itemsToAppend);
    }
}
