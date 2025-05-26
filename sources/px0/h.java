package px0;

import com.pinterest.framework.multisection.datasource.pagedlist.h0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import sq0.b0;
import sq0.e0;
import sq0.m;
import sq0.o;
import sq0.y;
import sq0.z;
import wk1.n;

/* loaded from: classes5.dex */
public final class h implements z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f101603a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f101604b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f101605c;

    public /* synthetic */ h(int i13, Object obj, Object obj2) {
        this.f101603a = i13;
        this.f101605c = obj;
        this.f101604b = obj2;
    }

    @Override // sq0.z
    public final void j3(int i13) {
    }

    @Override // sq0.z
    public final void r1(int i13, y scrollDirection) {
        sq0.f fVar;
        wk1.c cVar;
        wk1.c cVar2;
        ky.e eVar;
        int i14 = this.f101603a;
        Object obj = this.f101604b;
        Object obj2 = this.f101605c;
        switch (i14) {
            case 0:
                Intrinsics.checkNotNullParameter(scrollDirection, "scrollDirection");
                i iVar = (i) obj2;
                o dataSourceAndLocalPositionFromGlobalPosition = iVar.getDataSourceAndLocalPositionFromGlobalPosition(i13);
                if (dataSourceAndLocalPositionFromGlobalPosition != null) {
                    e0 e0Var = dataSourceAndLocalPositionFromGlobalPosition.f115027a;
                    h0 h0Var = e0Var instanceof h0 ? (h0) e0Var : null;
                    if (h0Var != null && (fVar = iVar.f101610e) != null) {
                        fVar.k(dataSourceAndLocalPositionFromGlobalPosition.f115028b, ((b0) obj).getT0(), scrollDirection, h0Var.d());
                        break;
                    }
                }
                break;
            case 1:
                Intrinsics.checkNotNullParameter(scrollDirection, "scrollDirection");
                n nVar = (n) obj2;
                o dataSourceAndLocalPositionFromGlobalPosition2 = nVar.getDataSourceAndLocalPositionFromGlobalPosition(i13);
                if (dataSourceAndLocalPositionFromGlobalPosition2 != null) {
                    e0 e0Var2 = dataSourceAndLocalPositionFromGlobalPosition2.f115027a;
                    nr0.j jVar = e0Var2 instanceof nr0.j ? (nr0.j) e0Var2 : null;
                    if (jVar != null) {
                        cVar = nVar.params;
                        sq0.f fVar2 = cVar.f130138i;
                        List d2 = jVar.d();
                        int t03 = ((b0) obj).getT0();
                        int i15 = dataSourceAndLocalPositionFromGlobalPosition2.f115028b;
                        fVar2.k(i15, t03, scrollDirection, d2);
                        cVar2 = nVar.params;
                        m mVar = cVar2.f130139j;
                        if (mVar != null) {
                            mVar.l(jVar, i15, scrollDirection);
                            break;
                        }
                    }
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(scrollDirection, "scrollDirection");
                if (((nr0.e) obj2).A4(i13)) {
                    eVar = ((n) obj).loadMorePWTLogger;
                    eVar.d();
                    break;
                }
                break;
        }
    }
}
