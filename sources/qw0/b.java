package qw0;

import com.pinterest.navigation.Navigation;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import pw0.t;
import pw0.w;
import sw0.m;
import sw0.n;
import sw0.y;
import wk1.q;
import xk2.v;

/* loaded from: classes5.dex */
public final class b extends q implements pw0.k {

    /* renamed from: a, reason: collision with root package name */
    public final m f105268a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(uk1.d presenterPinalytics, uj2.q networkStateStream, boolean z13, ye2.m mVar, yk1.a viewResources) {
        super(presenterPinalytics, networkStateStream);
        v vVar = y.f115589f;
        y mediaUtil = vt1.a.u();
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(viewResources, "viewResources");
        Intrinsics.checkNotNullParameter(mediaUtil, "mediaUtil");
        this.f105268a = new m(new WeakReference(mVar), getPinalytics(), viewResources, mediaUtil, z13, this);
    }

    @Override // wk1.q
    public final void addDataSources(vq0.a dataSources) {
        Intrinsics.checkNotNullParameter(dataSources, "dataSources");
        ((wk1.i) dataSources).b(this.f105268a);
    }

    @Override // pw0.k
    public final void o0(String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        n nVar = (n) ((t) getView());
        nVar.getClass();
        Intrinsics.checkNotNullParameter(path, "path");
        Navigation navigation = nVar.I;
        if (navigation == null || !navigation.S("com.pinterest.EXTRA_IS_STORY_PIN", false)) {
            w wVar = nVar.B0;
            if (wVar != null) {
                ((j) wVar).x3(path);
            }
            nVar.P7();
            return;
        }
        wk2.a aVar = nVar.A0;
        if (aVar == null) {
            Intrinsics.r("ideaPinComposeDataManagerProvider");
            throw null;
        }
        ag1.b bVar = (ag1.b) aVar.get();
        bVar.getClass();
        Intrinsics.checkNotNullParameter(path, "path");
        w wVar2 = bVar.f15137j;
        if (wVar2 != null) {
            ((j) wVar2).x3(path);
        }
        nVar.D5();
    }
}
