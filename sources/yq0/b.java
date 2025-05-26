package yq0;

import android.content.Context;
import android.view.View;
import kotlin.jvm.functions.Function0;
import nx.d1;
import x02.x2;

/* loaded from: classes.dex */
public final class b extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ a f139673i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Context f139674j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ nx.d0 f139675k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ qa2.n f139676l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ qa2.j0 f139677m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ uj2.q f139678n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ x2 f139679o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ nr0.c f139680p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ d1 f139681q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ ao2.j0 f139682r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar, Context context, nx.d0 d0Var, qa2.n nVar, qa2.j0 j0Var, uj2.q qVar, x2 x2Var, nr0.c cVar, d1 d1Var, androidx.lifecycle.u uVar) {
        super(0);
        this.f139673i = aVar;
        this.f139674j = context;
        this.f139675k = d0Var;
        this.f139676l = nVar;
        this.f139677m = j0Var;
        this.f139678n = qVar;
        this.f139679o = x2Var;
        this.f139680p = cVar;
        this.f139681q = d1Var;
        this.f139682r = uVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        a aVar = this.f139673i;
        a aVar2 = aVar instanceof a ? aVar : null;
        if (aVar2 != null) {
            aVar2.setContext(this.f139674j);
            aVar2.setPinalytics(this.f139675k);
            aVar2.setGridFeatureConfig(this.f139676l);
            aVar2.setPinGridCellFactory(this.f139677m);
            aVar2.setNetworkStateStream(this.f139678n);
            aVar2.setUserRepository(this.f139679o);
            aVar2.setGoToHomefeedListener(this.f139680p);
            aVar2.setTrackingParamAttacher(this.f139681q);
            aVar2.setScope(this.f139682r);
        }
        return (View) aVar.getCreator().invoke();
    }
}
