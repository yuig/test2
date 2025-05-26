package ra0;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final class s extends kotlin.jvm.internal.s implements kl2.m {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ List f106997i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ u f106998j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ v f106999k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f107000l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Function0 f107001m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Function0 f107002n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Function1 f107003o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(List list, u uVar, v vVar, kotlin.jvm.internal.h0 h0Var, Function0 function0, Function0 function02, Function1 function1) {
        super(4);
        this.f106997i = list;
        this.f106998j = uVar;
        this.f106999k = vVar;
        this.f107000l = h0Var;
        this.f107001m = function0;
        this.f107002n = function02;
        this.f107003o = function1;
    }

    @Override // kl2.m
    public final Object c(Object obj, Object obj2, Object obj3, Object obj4) {
        int i13;
        r1.q qVar = (r1.q) obj;
        int intValue = ((Number) obj2).intValue();
        i2.o oVar = (i2.o) obj3;
        int intValue2 = ((Number) obj4).intValue();
        if ((intValue2 & 6) == 0) {
            i13 = (((i2.s) oVar).h(qVar) ? 4 : 2) | intValue2;
        } else {
            i13 = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            i13 |= ((i2.s) oVar).f(intValue) ? 32 : 16;
        }
        if ((i13 & RecyclerViewTypes.VIEW_TYPE_SEARCH_PRODUCT_COLLAGE_STORY) == 146) {
            i2.s sVar = (i2.s) oVar;
            if (sVar.z()) {
                sVar.Q();
                return Unit.f80348a;
            }
        }
        z zVar = (z) this.f106997i.get(intValue);
        i2.s sVar2 = (i2.s) oVar;
        sVar2.W(-391856806);
        boolean h03 = f0.h.h0(zVar, this.f106998j.f107007b, sVar2);
        a0 a0Var = this.f106999k.f107012a;
        u2.n nVar = u2.n.f120041b;
        kotlin.jvm.internal.h0 h0Var = this.f107000l;
        kh2.r.d(zVar, h03, androidx.compose.ui.platform.a.j(nVar, "COLOR-" + h0Var.f80426a), new j1.v0(zVar, this.f107001m, this.f107002n, this.f107003o, 5), a0Var, false, sVar2, 0, 32);
        h0Var.f80426a = h0Var.f80426a + 1;
        sVar2.r(false);
        return Unit.f80348a;
    }
}
