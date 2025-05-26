package qf1;

import android.content.Context;
import android.content.res.Resources;
import com.pinterest.api.model.f30;
import h32.u0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e0 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f103658i = 0;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ f30 f103659j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f103660k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f103661l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f103662m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(Resources resources, f30 f30Var, i0 i0Var, boolean z13) {
        super(0);
        this.f103661l = i0Var;
        this.f103659j = f30Var;
        this.f103660k = z13;
        this.f103662m = resources;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f103658i) {
            case 0:
                m241invoke();
                break;
            default:
                m241invoke();
                break;
        }
        return Unit.f80348a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(android.support.v4.media.a aVar, f30 f30Var, xj2.b bVar, boolean z13) {
        super(0);
        this.f103661l = aVar;
        this.f103659j = f30Var;
        this.f103662m = bVar;
        this.f103660k = z13;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m241invoke() {
        int i13 = this.f103658i;
        boolean z13 = this.f103660k;
        int i14 = 29;
        Object obj = this.f103662m;
        f30 f30Var = this.f103659j;
        Object obj2 = this.f103661l;
        switch (i13) {
            case 0:
                i0 i0Var = (i0) obj2;
                uj2.l c13 = i0Var.c(f30Var, !z13);
                vd1.a aVar = new vd1.a(28, c0.f103647j);
                vd1.a aVar2 = new vd1.a(29, new d0(i0Var, (Resources) obj, 0));
                ck2.c cVar = ck2.i.f27923c;
                c13.getClass();
                c13.f(new hk2.b(aVar, aVar2, cVar));
                break;
            default:
                android.support.v4.media.a aVar3 = (android.support.v4.media.a) obj2;
                ((nx.d0) aVar3.f15839c).F(h32.g0.REMOVE_SPONSORSHIP_MODAL, u0.SPONSORSHIP_CONFIRM_REMOVE_BUTTON);
                if (f30Var != null) {
                    Resources resources = ((Context) aVar3.f15838b).getResources();
                    Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                    h22.f fVar = (h22.f) aVar3.f15840d;
                    String uid = f30Var.getUid();
                    Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
                    ((xj2.b) obj).a(fVar.i(uid).r(tk2.e.f118017c).l(wj2.c.a()).o(new lb2.r(8, new s1.w(aVar3, f30Var, z13, i14)), new lb2.r(9, new ha2.i(16, aVar3, resources))));
                    break;
                }
                break;
        }
    }
}
