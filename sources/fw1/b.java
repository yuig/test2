package fw1;

import android.content.Context;
import android.os.Bundle;
import com.pinterest.component.modal.BaseModalViewWrapper;
import ha2.r;
import ha2.t;
import ha2.v;
import ha2.x;
import java.util.ArrayList;
import jc0.n;
import kotlin.jvm.internal.Intrinsics;
import me.o;
import so.oa;
import so.s8;
import uj2.q;
import yk1.l;
import yk1.m;

/* loaded from: classes4.dex */
public final class b extends l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f63045a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final Object f63046b;

    /* renamed from: c, reason: collision with root package name */
    public Object f63047c;

    /* renamed from: d, reason: collision with root package name */
    public Object f63048d;

    /* renamed from: e, reason: collision with root package name */
    public Object f63049e;

    public b(ha2.a configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.f63046b = configuration;
    }

    @Override // jc0.b
    public final BaseModalViewWrapper createModalView(Context context, Bundle bundle) {
        switch (this.f63045a) {
            case 0:
                Intrinsics.checkNotNullParameter(context, "context");
                this.f63048d = (a) o.a(bs1.c.k0(context), a.class);
                i iVar = new i(context, (String) this.f63046b, (String) this.f63047c);
                this.f63049e = iVar;
                return iVar;
            default:
                Intrinsics.checkNotNullParameter(context, "context");
                r rVar = new r(context);
                this.f63047c = rVar;
                uk1.e eVar = rVar.f68470d;
                if (eVar == null) {
                    Intrinsics.r("pinalyticsFactory");
                    throw null;
                }
                this.f63048d = eVar;
                q qVar = rVar.f68471e;
                if (qVar == null) {
                    Intrinsics.r("networkStateStream");
                    throw null;
                }
                this.f63049e = qVar;
                n nVar = new n(context);
                nVar.x(rVar);
                return nVar;
        }
    }

    @Override // yk1.l
    public final m createPresenter() {
        switch (this.f63045a) {
            case 0:
                a aVar = (a) this.f63048d;
                if (aVar == null) {
                    Intrinsics.r("dependencies");
                    throw null;
                }
                px.c k03 = oa.k0(((s8) aVar).f114255d);
                a aVar2 = (a) this.f63048d;
                if (aVar2 == null) {
                    Intrinsics.r("dependencies");
                    throw null;
                }
                uk1.d g13 = ((uk1.a) ((uk1.e) ((s8) aVar2).f114255d.f113702ga.get())).g();
                a aVar3 = (a) this.f63048d;
                if (aVar3 != null) {
                    return new d(k03, g13, ((s8) aVar3).z5());
                }
                Intrinsics.r("dependencies");
                throw null;
            default:
                ha2.b bVar = (ha2.b) this.f63046b;
                ArrayList arrayList = new ArrayList();
                for (ha2.c cVar : bVar.d()) {
                    x e13 = cVar.e();
                    arrayList.add(new ha2.o(e13 != null ? Integer.valueOf(e13.f68477a) : null));
                    for (ha2.g gVar : cVar.d()) {
                        arrayList.add(new t(gVar.a(), new br0.e(cVar, gVar, 1)));
                    }
                }
                uk1.e eVar = (uk1.e) this.f63048d;
                if (eVar == null) {
                    Intrinsics.r("pinalyticsFactory");
                    throw null;
                }
                uk1.d g14 = ((uk1.a) eVar).g();
                q qVar = (q) this.f63049e;
                if (qVar == null) {
                    Intrinsics.r("networkStateStream");
                    throw null;
                }
                ql0.a aVar4 = new ql0.a(arrayList, g14, qVar);
                aVar4.create();
                return aVar4;
        }
    }

    @Override // jc0.a0
    public final int getLayoutHeight() {
        switch (this.f63045a) {
            case 0:
                return -1;
            default:
                return -2;
        }
    }

    @Override // yk1.l
    public final yk1.n getView() {
        switch (this.f63045a) {
            case 0:
                i iVar = (i) this.f63049e;
                if (iVar != null) {
                    return iVar;
                }
                Intrinsics.r("feedbackViewWrapper");
                throw null;
            default:
                v vVar = (v) this.f63047c;
                if (vVar != null) {
                    return vVar;
                }
                Intrinsics.r("view");
                throw null;
        }
    }

    @Override // yk1.l, jc0.a0
    public final void onAboutToDismiss() {
        switch (this.f63045a) {
            case 0:
                super.onAboutToDismiss();
                bs1.c.k0(getModalViewWrapper().getContext()).getWindow().setSoftInputMode(32);
                break;
            default:
                super.onAboutToDismiss();
                break;
        }
    }

    @Override // yk1.l, jc0.a0
    public final void onModalContentContainerCreated() {
        switch (this.f63045a) {
            case 0:
                super.onModalContentContainerCreated();
                BaseModalViewWrapper modalViewWrapper = getModalViewWrapper();
                modalViewWrapper.l(com.pinterest.partnerAnalytics.g.analytics_feedback_toolbar_title);
                hf0.b.t(modalViewWrapper.getContext());
                break;
            default:
                super.onModalContentContainerCreated();
                break;
        }
    }

    public b(String featureName, String helpLink) {
        Intrinsics.checkNotNullParameter(featureName, "featureName");
        Intrinsics.checkNotNullParameter(helpLink, "helpLink");
        this.f63046b = featureName;
        this.f63047c = helpLink;
    }
}
