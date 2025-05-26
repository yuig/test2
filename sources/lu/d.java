package lu;

import android.content.Context;
import android.view.View;
import com.pinterest.ads.feature.owc.view.base.BaseAdsScrollingModule;
import kh2.m2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class d extends kj.b {

    /* renamed from: a, reason: collision with root package name */
    public float f84867a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f84868b = true;

    /* renamed from: c, reason: collision with root package name */
    public boolean f84869c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f f84870d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Context f84871e;

    public d(f fVar, Context context) {
        this.f84870d = fVar;
        this.f84871e = context;
    }

    @Override // kj.b
    public final void b(View bottomSheet, float f13) {
        Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
        this.f84867a = f13;
        cu.a aVar = this.f84870d.f53211m;
        if (aVar != null) {
            ((BaseAdsScrollingModule) aVar).J1(f13);
        }
    }

    @Override // kj.b
    public final void c(View view, int i13) {
        Intrinsics.checkNotNullParameter(view, "view");
        boolean u13 = m2.u1(this.f84871e);
        f fVar = this.f84870d;
        fVar.C(u13 ? fVar.A + 40 : fVar.A);
        boolean z13 = true;
        if (i13 == 2) {
            if (cu.i.a0(this.f84867a, new ql2.g(0.7f, 1.0f))) {
                fVar.D(3);
                z13 = false;
            }
            this.f84868b = z13;
            return;
        }
        if (i13 == 3) {
            fVar.setY(0.0f);
            if (this.f84868b || !this.f84869c) {
                cu.a aVar = fVar.f53211m;
                if (aVar != null) {
                    aVar.j();
                }
                this.f84869c = true;
                return;
            }
            return;
        }
        if (i13 != 4) {
            return;
        }
        if (!this.f84868b) {
            fVar.D(3);
            return;
        }
        cu.a aVar2 = fVar.f53211m;
        if (aVar2 != null) {
            aVar2.a();
        }
        this.f84869c = false;
    }
}
