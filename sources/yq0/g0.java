package yq0;

import androidx.recyclerview.widget.RecyclerView;
import com.pinterest.api.model.f30;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import lq0.f1;

/* loaded from: classes5.dex */
public class g0 extends ar0.o {

    /* renamed from: c, reason: collision with root package name */
    public final nx.d0 f139695c;

    /* renamed from: d, reason: collision with root package name */
    public final h32.g0 f139696d;

    /* renamed from: e, reason: collision with root package name */
    public final f0 f139697e;

    /* renamed from: f, reason: collision with root package name */
    public HashMap f139698f;

    /* renamed from: g, reason: collision with root package name */
    public int f139699g;

    /* renamed from: h, reason: collision with root package name */
    public int f139700h;

    /* renamed from: i, reason: collision with root package name */
    public int f139701i;

    public g0(nx.d0 pinalytics, h32.g0 g0Var, f0 f0Var, HashMap hashMap) {
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        this.f139695c = pinalytics;
        this.f139696d = g0Var;
        this.f139697e = f0Var;
        this.f139698f = hashMap;
        this.f139700h = -1;
        this.f139701i = -1;
    }

    @Override // androidx.recyclerview.widget.o2
    public final void j(RecyclerView recyclerView, int i13, int i14) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        this.f139699g = i13;
    }

    @Override // ar0.o
    public void k(RecyclerView recyclerView, int i13, int i14) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        int i15 = this.f139699g;
        int i16 = 1;
        boolean z13 = i15 == 0 ? this.f139700h > i13 || this.f139701i > i14 : i15 < 0;
        h32.i0 p13 = this.f139695c.p();
        this.f139695c.U(p13 != null ? com.bumptech.glide.d.z0(p13, new f1(this, i16)) : null, z13 ? h32.f1.SWIPE_LEFT : h32.f1.SWIPE_RIGHT, null, null, this.f139698f, false);
        f0 f0Var = this.f139697e;
        if (f0Var != null) {
            androidx.appcompat.widget.q qVar = (androidx.appcompat.widget.q) f0Var;
            if (!z13) {
                int i17 = qVar.f16668a;
                Object obj = qVar.f16669b;
                switch (i17) {
                    case 0:
                        xt.f fVar = ((yu.f) obj).f140147c;
                        fVar.getClass();
                        h32.f1 f1Var = h32.f1.SHOWCASE_SUBPAGE_THUMBNAIL_SWIPE_RIGHT;
                        f30 f30Var = fVar.f135861d;
                        fVar.f135858a.g(f1Var, f30Var != null ? f30Var.getId() : null, null, false);
                        break;
                    default:
                        xt.f fVar2 = (xt.f) obj;
                        fVar2.getClass();
                        h32.f1 f1Var2 = h32.f1.SHOWCASE_SUBPIN_SWIPE_RIGHT;
                        f30 f30Var2 = fVar2.f135860c;
                        fVar2.f135858a.u(f1Var2, f30Var2 != null ? f30Var2.getId() : null, xt.f.a(fVar2.f135861d, fVar2.f135860c, null), null, false);
                        break;
                }
            } else {
                int i18 = qVar.f16668a;
                Object obj2 = qVar.f16669b;
                switch (i18) {
                    case 0:
                        xt.f fVar3 = ((yu.f) obj2).f140147c;
                        fVar3.getClass();
                        h32.f1 f1Var3 = h32.f1.SHOWCASE_SUBPAGE_THUMBNAIL_SWIPE_LEFT;
                        f30 f30Var3 = fVar3.f135861d;
                        fVar3.f135858a.g(f1Var3, f30Var3 != null ? f30Var3.getId() : null, null, false);
                        break;
                    default:
                        xt.f fVar4 = (xt.f) obj2;
                        fVar4.getClass();
                        h32.f1 f1Var4 = h32.f1.SHOWCASE_SUBPIN_SWIPE_LEFT;
                        f30 f30Var4 = fVar4.f135860c;
                        fVar4.f135858a.u(f1Var4, f30Var4 != null ? f30Var4.getId() : null, xt.f.a(fVar4.f135861d, fVar4.f135860c, null), null, false);
                        break;
                }
            }
        }
        this.f139699g = 0;
        this.f139700h = -1;
        this.f139701i = -1;
    }

    @Override // ar0.o
    public final void l(RecyclerView recyclerView, int i13, int i14) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        this.f139700h = i13;
        this.f139701i = i14;
    }
}
