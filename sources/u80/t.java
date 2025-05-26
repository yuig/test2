package u80;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class t extends kotlin.jvm.internal.s implements kl2.m {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ List f120979i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Function1 f120980j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ k f120981k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ float f120982l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(List list, Function1 function1, k kVar, float f13) {
        super(4);
        this.f120979i = list;
        this.f120980j = function1;
        this.f120981k = kVar;
        this.f120982l = f13;
    }

    @Override // kl2.m
    public final Object c(Object obj, Object obj2, Object obj3, Object obj4) {
        int i13;
        q1.c cVar = (q1.c) obj;
        int intValue = ((Number) obj2).intValue();
        i2.o oVar = (i2.o) obj3;
        int intValue2 = ((Number) obj4).intValue();
        if ((intValue2 & 6) == 0) {
            i13 = (((i2.s) oVar).h(cVar) ? 4 : 2) | intValue2;
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
        j jVar = (j) this.f120979i.get(intValue);
        i2.s sVar2 = (i2.s) oVar;
        sVar2.W(-285843310);
        k kVar = this.f120981k;
        float f13 = kVar.f120959b;
        i previewStyle = kVar.f120960c;
        Intrinsics.checkNotNullParameter(previewStyle, "previewStyle");
        u.b(jVar, null, this.f120980j, new k(this.f120982l, f13, previewStyle), sVar2, 8, 2);
        sVar2.r(false);
        return Unit.f80348a;
    }
}
