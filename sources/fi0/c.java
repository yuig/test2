package fi0;

import com.pinterest.api.model.deserializer.UserDeserializer;
import com.pinterest.api.model.wy0;
import com.pinterest.feature.account.view.AvailableAccountsView;
import ek2.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import lb2.n;
import mo1.d;
import mr1.h;
import uj2.q;
import yk1.r;
import yk1.t;

/* loaded from: classes5.dex */
public final class c extends t {

    /* renamed from: a, reason: collision with root package name */
    public final UserDeserializer f62208a;

    /* renamed from: b, reason: collision with root package name */
    public final mr1.a f62209b;

    /* renamed from: c, reason: collision with root package name */
    public final mr1.c f62210c;

    /* renamed from: d, reason: collision with root package name */
    public final d f62211d;

    /* renamed from: e, reason: collision with root package name */
    public final b60.b f62212e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(uk1.d pinalytics, q networkStateStream, UserDeserializer userDeserializer, mr1.a accountSwitcher, mr1.b activityProvider, d intentHelper, b60.b activeUserManager) {
        super(pinalytics, networkStateStream);
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(userDeserializer, "userDeserializer");
        Intrinsics.checkNotNullParameter(accountSwitcher, "accountSwitcher");
        Intrinsics.checkNotNullParameter(activityProvider, "activityProvider");
        Intrinsics.checkNotNullParameter(intentHelper, "intentHelper");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        this.f62208a = userDeserializer;
        this.f62209b = accountSwitcher;
        this.f62210c = activityProvider;
        this.f62211d = intentHelper;
        this.f62212e = activeUserManager;
    }

    public final void p3(List list) {
        Object obj;
        wy0 f13 = ((b60.d) this.f62212e).f();
        List list2 = list;
        Iterator it = list2.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (Intrinsics.d(((h) obj).f88088a, f13 != null ? f13.getUid() : null)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        h userAccount = (h) obj;
        if (userAccount != null) {
            ki0.c cVar = (ki0.c) ((ei0.a) getView());
            cVar.getClass();
            Intrinsics.checkNotNullParameter(userAccount, "userAccount");
            AvailableAccountsView availableAccountsView = cVar.f79790p0;
            if (availableAccountsView == null) {
                Intrinsics.r("availableAccountsView");
                throw null;
            }
            availableAccountsView.f45079b.L(userAccount, true);
        }
        ArrayList switchableAccounts = new ArrayList();
        for (Object obj2 : list2) {
            if (!Intrinsics.d(((h) obj2).f88088a, f13 != null ? f13.getUid() : null)) {
                switchableAccounts.add(obj2);
            }
        }
        ki0.c cVar2 = (ki0.c) ((ei0.a) getView());
        cVar2.getClass();
        Intrinsics.checkNotNullParameter(switchableAccounts, "switchableAccounts");
        AvailableAccountsView availableAccountsView2 = cVar2.f79790p0;
        if (availableAccountsView2 == null) {
            Intrinsics.r("availableAccountsView");
            throw null;
        }
        availableAccountsView2.T(switchableAccounts);
    }

    @Override // yk1.p
    /* renamed from: q3, reason: merged with bridge method [inline-methods] */
    public final void r3(ei0.a view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((r) view);
        Intrinsics.checkNotNullParameter(this, "listener");
        ((ki0.c) view).f79789o0 = this;
        p3(com.bumptech.glide.c.a0(this.f62208a));
        f i13 = ((n) this.f62209b).g().h(wj2.c.a()).i(new a(this, 0), new dh0.a(10, new hh0.a(view, 7)));
        Intrinsics.checkNotNullExpressionValue(i13, "subscribe(...)");
        addDisposable(i13);
    }
}
