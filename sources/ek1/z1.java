package ek1;

import com.pinterest.api.model.f30;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import net.quikkly.android.utils.BitmapUtils;
import ni1.x2;

/* loaded from: classes2.dex */
public final class z1 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ r1 f59402i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ f30 f59403j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ x2 f59404k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ l82.e f59405l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ es.a f59406m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ es.h f59407n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ vr.a f59408o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ az.a f59409p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(r1 r1Var, f30 f30Var, x2 x2Var, l82.e eVar, es.a aVar, es.h hVar, vr.a aVar2, az.a aVar3) {
        super(1);
        this.f59402i = r1Var;
        this.f59403j = f30Var;
        this.f59404k = x2Var;
        this.f59405l = eVar;
        this.f59406m = aVar;
        this.f59407n = hVar;
        this.f59408o = aVar2;
        this.f59409p = aVar3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        h32.c1 c13;
        r it = (r) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        az.b bVar = it.f59329b;
        r1 r1Var = this.f59402i;
        h32.g0 g0Var = r1Var.f59341c.f143086a.f67084d;
        nx.q qVar = bVar.f20693a.f92380b;
        String uid = this.f59403j.getUid();
        x2 x2Var = this.f59404k;
        boolean z13 = x2Var.f90856h;
        l82.e eVar = this.f59405l;
        c13 = c2.c(uid, this.f59403j, r1Var.f59362x, r1Var.f59363y, z13, false, false, this.f59406m, (r29 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? null : null, (r29 & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 0 ? null : null, dl2.b.D1((r1) eVar.f82219b), x2Var.f90850e, this.f59407n, this.f59408o);
        return r.e(it, null, az.b.e(bVar, new nx.c(g0Var, qVar, c13, null, 8), null, this.f59409p, 2), new p(((r1) eVar.f82219b).f59351m.f139143a), false, null, 25);
    }
}
