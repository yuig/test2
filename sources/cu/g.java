package cu;

import android.view.View;
import com.pinterest.ads.feature.owc.view.base.BaseAdsScrollingModule;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class g extends kj.b {

    /* renamed from: a, reason: collision with root package name */
    public float f53194a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f53195b = true;

    /* renamed from: c, reason: collision with root package name */
    public boolean f53196c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i f53197d;

    public g(i iVar) {
        this.f53197d = iVar;
    }

    @Override // kj.b
    public final void b(View bottomSheet, float f13) {
        Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
        this.f53194a = f13;
        a aVar = this.f53197d.f53211m;
        if (aVar != null) {
            ((BaseAdsScrollingModule) aVar).J1(f13);
        }
    }

    @Override // kj.b
    public final void c(View view, int i13) {
        Intrinsics.checkNotNullParameter(view, "view");
        i iVar = this.f53197d;
        iVar.C(((Number) iVar.f53213o.getValue()).intValue());
        boolean z13 = true;
        if (i13 == 2) {
            if (i.a0(this.f53194a, new ql2.g(0.7f, 1.0f))) {
                iVar.D(3);
                z13 = false;
            }
            this.f53195b = z13;
            return;
        }
        if (i13 == 3) {
            if (this.f53195b || !this.f53196c) {
                a aVar = iVar.f53211m;
                if (aVar != null) {
                    aVar.j();
                }
                this.f53196c = true;
                return;
            }
            return;
        }
        if (i13 != 4) {
            return;
        }
        if (!this.f53195b) {
            iVar.D(3);
            return;
        }
        a aVar2 = iVar.f53211m;
        if (aVar2 != null) {
            aVar2.a();
        }
        this.f53196c = false;
    }
}
