package xb1;

import com.pinterest.api.model.qv;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import h32.f1;
import h32.g0;
import h32.u0;
import i92.k;
import java.util.LinkedHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import m60.w;
import nx.d0;
import org.json.JSONObject;
import qz.f0;
import sq0.c0;
import wb1.l;
import wb1.m;
import wb1.r;
import wb1.v;
import wk1.q;
import x02.x2;
import yk1.n;
import z42.o;

/* loaded from: classes5.dex */
public final class f extends q implements com.pinterest.feature.settings.permissions.a {

    /* renamed from: a, reason: collision with root package name */
    public final w f134512a;

    /* renamed from: b, reason: collision with root package name */
    public final x10.d f134513b;

    /* renamed from: c, reason: collision with root package name */
    public final k f134514c;

    /* renamed from: d, reason: collision with root package name */
    public final r f134515d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(qv messagingGroup, uk1.d pinalytics, uj2.q networkStateStream, w eventManager, x10.d settingsApi, k toastUtils, yk1.a resources, x2 userRepository) {
        super(pinalytics, networkStateStream);
        Intrinsics.checkNotNullParameter(messagingGroup, "messagingGroup");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(settingsApi, "settingsApi");
        Intrinsics.checkNotNullParameter(toastUtils, "toastUtils");
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        this.f134512a = eventManager;
        this.f134513b = settingsApi;
        this.f134514c = toastUtils;
        this.f134515d = new r(userRepository, resources, messagingGroup);
    }

    @Override // com.pinterest.feature.settings.permissions.a
    public final void T1(int i13) {
        u0 u0Var;
        g0 g0Var;
        g0 g0Var2;
        Object obj = CollectionsKt.F0(this.f134515d.f135191h).get(2);
        Intrinsics.g(obj, "null cannot be cast to non-null type com.pinterest.feature.settings.permissions.model.DetailsPermissionSettingsItem.MessagePermissionsSettingsRadioGroup");
        l lVar = (l) ((m) obj).f129037h.get(i13);
        d0 pinalytics = getPinalytics();
        f1 f1Var = f1.TAP;
        o level = lVar.f129033i;
        Intrinsics.checkNotNullParameter(level, "level");
        int i14 = v.f129062c[level.ordinal()];
        if (i14 == 1) {
            u0Var = u0.MESSAGING_PERMISSIONS_DIRECT_TO_INBOX;
        } else if (i14 == 2) {
            u0Var = u0.MESSAGING_PERMISSIONS_SEND_REQUEST;
        } else {
            if (i14 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            u0Var = u0.MESSAGING_PERMISSIONS_BLOCKED;
        }
        u0 u0Var2 = u0Var;
        qv qvVar = lVar.f129032h;
        qv.a group = qvVar.g();
        if (group != null) {
            Intrinsics.checkNotNullParameter(group, "group");
            int i15 = v.f129060a[group.ordinal()];
            if (i15 == 1) {
                g0Var2 = g0.MESSAGING_PERMISSIONS_FRIENDS;
            } else if (i15 == 2) {
                g0Var2 = g0.MESSAGING_PERMISSIONS_FOLLOWERS;
            } else if (i15 == 3) {
                g0Var2 = g0.MESSAGING_PERMISSIONS_FOLLOWEES;
            } else if (i15 == 4) {
                g0Var2 = g0.MESSAGING_PERMISSIONS_CONTACTS;
            } else {
                if (i15 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                g0Var2 = g0.MESSAGING_PERMISSIONS_OTHERS;
            }
            g0Var = g0Var2;
        } else {
            g0Var = null;
        }
        pinalytics.h0((r18 & 1) != 0 ? f1.TAP : f1Var, (r18 & 2) != 0 ? null : u0Var2, (r18 & 4) != 0 ? null : g0Var, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
        JSONObject jSONObject = new JSONObject();
        qv.a g13 = qvVar.g();
        jSONObject.put(String.valueOf(g13 != null ? Integer.valueOf(g13.getValue()) : null), lVar.f129033i.getValue());
        t3(lVar, bd1.b.MESSAGING_PERMISSIONS, jSONObject, null, false);
    }

    @Override // wk1.q
    public final void addDataSources(vq0.a dataSources) {
        Intrinsics.checkNotNullParameter(dataSources, "dataSources");
        d0.v(getPinalytics(), f1.MANUAL_FILTERS_VISIT, null, false, 12);
        ((wk1.i) dataSources).b(this.f134515d);
    }

    @Override // wk1.q
    /* renamed from: onBind */
    public final void r3(c0 c0Var) {
        com.pinterest.feature.settings.permissions.b view = (com.pinterest.feature.settings.permissions.b) c0Var;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((c0) view);
        view.x5(this);
    }

    public final void t3(l lVar, bd1.b bVar, Object obj, String str, boolean z13) {
        f0 f0Var = new f0();
        f0Var.d(obj, bVar.getValue());
        if (str != null) {
            f0Var.e("passcode", str);
        }
        f0Var.d(Boolean.valueOf(z13), "user_confirm_skip_passcode");
        LinkedHashMap parameters = f0Var.i();
        x10.d dVar = this.f134513b;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        dVar.f131564a.c(parameters).l(tk2.e.f118017c).h(wj2.c.a()).i(new qb1.a(1, this, lVar), new ab1.o(23, new e.c(this, lVar, bVar, obj, str)));
    }

    @Override // wk1.q, yk1.p, yk1.b
    /* renamed from: onBind */
    public final void r3(n nVar) {
        com.pinterest.feature.settings.permissions.b view = (com.pinterest.feature.settings.permissions.b) nVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((c0) view);
        view.x5(this);
    }

    @Override // wk1.q, yk1.p
    /* renamed from: onBind */
    public final void r3(yk1.r rVar) {
        com.pinterest.feature.settings.permissions.b view = (com.pinterest.feature.settings.permissions.b) rVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((c0) view);
        view.x5(this);
    }
}
