package yu;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.b2;
import f0.h;
import i2.o;
import i2.u;
import jk.v;
import kg.t;
import kh2.a1;
import kh2.b0;
import kh2.c3;
import kh2.g3;
import kh2.j1;
import kh2.k3;
import kh2.m2;
import kh2.n;
import kh2.n3;
import kh2.p2;
import kh2.r;
import kh2.u2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import uc0.b1;
import uc0.d1;
import uc0.d2;
import uc0.f0;
import uc0.f1;
import uc0.f2;
import uc0.h2;
import uc0.j2;
import uc0.l2;
import uc0.n1;
import uc0.p1;
import uc0.q;
import uc0.r0;
import uc0.r1;
import uc0.t1;
import uc0.v1;
import uc0.w;
import uc0.x1;
import uc0.z1;

/* loaded from: classes3.dex */
public final class c extends s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f140139i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f140140j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f140141k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f140142l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Object obj, int i13, int i14, int i15) {
        super(2);
        this.f140139i = i15;
        this.f140142l = obj;
        this.f140140j = i13;
        this.f140141k = i14;
    }

    public final Integer b(View view, int i13) {
        b2 b2Var;
        b2 b2Var2;
        b2 b2Var3;
        int i14 = this.f140139i;
        int i15 = this.f140141k;
        int i16 = this.f140140j;
        int i17 = 0;
        Object obj = this.f140142l;
        switch (i14) {
            case 0:
                Intrinsics.checkNotNullParameter(view, "<anonymous parameter 0>");
                RecyclerView recyclerView = ((f) obj).getPinterestRecyclerView().f52531a;
                if (recyclerView != null && (b2Var = recyclerView.f19240m) != null) {
                    i17 = b2Var.e();
                }
                int i18 = i17 - 1;
                if (i18 >= 0 && i13 == i18) {
                    i15 = i16;
                }
                return Integer.valueOf(i15);
            case 1:
                Intrinsics.checkNotNullParameter(view, "<anonymous parameter 0>");
                int i19 = zu.c.f142787i;
                RecyclerView recyclerView2 = ((zu.c) obj).getPinterestRecyclerView().f52531a;
                if (recyclerView2 != null && (b2Var2 = recyclerView2.f19240m) != null) {
                    i17 = b2Var2.e();
                }
                int i23 = i17 - 1;
                if (i23 >= 0 && i13 == i23) {
                    i15 = i16;
                }
                return Integer.valueOf(i15);
            default:
                Intrinsics.checkNotNullParameter(view, "<anonymous parameter 0>");
                int i24 = pi0.f.T;
                RecyclerView recyclerView3 = ((pi0.f) obj).getPinterestRecyclerView().f52531a;
                if (recyclerView3 != null && (b2Var3 = recyclerView3.f19240m) != null) {
                    i17 = b2Var3.e();
                }
                int i25 = i17 - 1;
                if (i25 >= 0 && i13 == i25) {
                    i15 = i16;
                }
                return Integer.valueOf(i15);
        }
    }

    public final void e(o oVar, int i13) {
        int i14 = this.f140139i;
        int i15 = this.f140141k;
        int i16 = this.f140140j;
        Object obj = this.f140142l;
        switch (i14) {
            case 2:
                u2.a((uc0.b) obj, oVar, u.p(i16 | 1), i15);
                break;
            case 3:
                c3.a((uc0.d) obj, oVar, u.p(i16 | 1), i15);
                break;
            case 4:
                j1.a((uc0.f) obj, oVar, u.p(i16 | 1), i15);
                break;
            case 5:
                k3.h((uc0.o) obj, oVar, u.p(i16 | 1), i15);
                break;
            case 6:
                n3.a((q) obj, oVar, u.p(i16 | 1), i15);
                break;
            case 7:
                t.a((uc0.s) obj, oVar, u.p(i16 | 1), i15);
                break;
            case 8:
                el.a.c((uc0.u) obj, oVar, u.p(i16 | 1), i15);
                break;
            case 9:
                el.a.d((w) obj, oVar, u.p(i16 | 1), i15);
                break;
            case 10:
                dn.c.b((f0) obj, oVar, u.p(i16 | 1), i15);
                break;
            case 11:
                el.a.j((r0) obj, oVar, u.p(i16 | 1), i15);
                break;
            case 12:
                n.h((b1) obj, oVar, u.p(i16 | 1), i15);
                break;
            case 13:
                r.e((d1) obj, oVar, u.p(i16 | 1), i15);
                break;
            case 14:
                h.c((f1) obj, oVar, u.p(i16 | 1), i15);
                break;
            case 15:
                a1.g((n1) obj, oVar, u.p(i16 | 1), i15);
                break;
            case 16:
                v.b((p1) obj, oVar, u.p(i16 | 1), i15);
                break;
            case 17:
                j1.j((r1) obj, oVar, u.p(i16 | 1), i15);
                break;
            case 18:
                m2.I((t1) obj, oVar, u.p(i16 | 1), i15);
                break;
            case 19:
                k3.l((v1) obj, oVar, u.p(i16 | 1), i15);
                break;
            case 20:
                p2.G((x1) obj, oVar, u.p(i16 | 1), i15);
                break;
            case 21:
                k3.m((z1) obj, oVar, u.p(i16 | 1), i15);
                break;
            case 22:
                g3.g((uc0.b2) obj, oVar, u.p(i16 | 1), i15);
                break;
            case 23:
                k3.p((d2) obj, oVar, u.p(i16 | 1), i15);
                break;
            case 24:
                kotlin.jvm.internal.r.d((f2) obj, oVar, u.p(i16 | 1), i15);
                break;
            case 25:
                b0.x((h2) obj, oVar, u.p(i16 | 1), i15);
                break;
            case 26:
                u2.h((l2) obj, oVar, u.p(i16 | 1), i15);
                break;
            default:
                c3.b((j2) obj, oVar, u.p(i16 | 1), i15);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f140139i) {
            case 0:
                return b((View) obj, ((Number) obj2).intValue());
            case 1:
                return b((View) obj, ((Number) obj2).intValue());
            case 2:
                e((o) obj, ((Number) obj2).intValue());
                return Unit.f80348a;
            case 3:
                e((o) obj, ((Number) obj2).intValue());
                return Unit.f80348a;
            case 4:
                e((o) obj, ((Number) obj2).intValue());
                return Unit.f80348a;
            case 5:
                e((o) obj, ((Number) obj2).intValue());
                return Unit.f80348a;
            case 6:
                e((o) obj, ((Number) obj2).intValue());
                return Unit.f80348a;
            case 7:
                e((o) obj, ((Number) obj2).intValue());
                return Unit.f80348a;
            case 8:
                e((o) obj, ((Number) obj2).intValue());
                return Unit.f80348a;
            case 9:
                e((o) obj, ((Number) obj2).intValue());
                return Unit.f80348a;
            case 10:
                e((o) obj, ((Number) obj2).intValue());
                return Unit.f80348a;
            case 11:
                e((o) obj, ((Number) obj2).intValue());
                return Unit.f80348a;
            case 12:
                e((o) obj, ((Number) obj2).intValue());
                return Unit.f80348a;
            case 13:
                e((o) obj, ((Number) obj2).intValue());
                return Unit.f80348a;
            case 14:
                e((o) obj, ((Number) obj2).intValue());
                return Unit.f80348a;
            case 15:
                e((o) obj, ((Number) obj2).intValue());
                return Unit.f80348a;
            case 16:
                e((o) obj, ((Number) obj2).intValue());
                return Unit.f80348a;
            case 17:
                e((o) obj, ((Number) obj2).intValue());
                return Unit.f80348a;
            case 18:
                e((o) obj, ((Number) obj2).intValue());
                return Unit.f80348a;
            case 19:
                e((o) obj, ((Number) obj2).intValue());
                return Unit.f80348a;
            case 20:
                e((o) obj, ((Number) obj2).intValue());
                return Unit.f80348a;
            case 21:
                e((o) obj, ((Number) obj2).intValue());
                return Unit.f80348a;
            case 22:
                e((o) obj, ((Number) obj2).intValue());
                return Unit.f80348a;
            case 23:
                e((o) obj, ((Number) obj2).intValue());
                return Unit.f80348a;
            case 24:
                e((o) obj, ((Number) obj2).intValue());
                return Unit.f80348a;
            case 25:
                e((o) obj, ((Number) obj2).intValue());
                return Unit.f80348a;
            case 26:
                e((o) obj, ((Number) obj2).intValue());
                return Unit.f80348a;
            case 27:
                e((o) obj, ((Number) obj2).intValue());
                return Unit.f80348a;
            default:
                return b((View) obj, ((Number) obj2).intValue());
        }
    }
}
