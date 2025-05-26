package mm2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.collections.CollectionsKt;
import kotlin.collections.y0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class n extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f87709i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ o f87710j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(o oVar, int i13) {
        super(0);
        this.f87709i = i13;
        this.f87710j = oVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f87709i;
        o oVar = this.f87710j;
        switch (i13) {
            case 0:
                Collection b13 = ((gm2.q) oVar.f87712o).b();
                ArrayList arrayList = new ArrayList();
                for (Object obj : b13) {
                    if (((gm2.w) obj).f65792a.isEnumConstant()) {
                        arrayList.add(obj);
                    }
                }
                int a13 = y0.a(kotlin.collections.g0.q(arrayList, 10));
                if (a13 < 16) {
                    a13 = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(a13);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    linkedHashMap.put(((gm2.w) next).c(), next);
                }
                return linkedHashMap;
            default:
                Class<?>[] declaredClasses = ((gm2.q) oVar.f87712o).f65786a.getDeclaredClasses();
                Intrinsics.checkNotNullExpressionValue(declaredClasses, "getDeclaredClasses(...)");
                return CollectionsKt.J0(yn2.c0.t(yn2.c0.q(yn2.c0.k(kotlin.collections.c0.v(declaredClasses), gm2.n.f65783i), gm2.o.f65784i)));
        }
    }
}
