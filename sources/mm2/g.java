package mm2;

import am2.c1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import lb.l0;

/* loaded from: classes2.dex */
public final class g extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f87672i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i f87673j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(i iVar, int i13) {
        super(0);
        this.f87672i = i13;
        this.f87673j = iVar;
    }

    public final List b() {
        int i13 = this.f87672i;
        i iVar = this.f87673j;
        switch (i13) {
            case 0:
                return l0.M(iVar);
            case 1:
                ArrayList typeParameters = iVar.f87682i.getTypeParameters();
                ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(typeParameters, 10));
                Iterator it = typeParameters.iterator();
                while (it.hasNext()) {
                    gm2.e0 e0Var = (gm2.e0) it.next();
                    c1 a13 = ((lm2.h) iVar.f87684k.f107930b).a(e0Var);
                    if (a13 == null) {
                        throw new AssertionError("Parameter " + e0Var + " surely belongs to class " + iVar.f87682i + ", so it must be resolved");
                    }
                    arrayList.add(a13);
                }
                return arrayList;
            default:
                ym2.b classId = fn2.d.f(iVar);
                if (classId == null) {
                    return null;
                }
                ((lm2.a) iVar.f87681h.f107929a).f83953w.getClass();
                Intrinsics.checkNotNullParameter(classId, "classId");
                return null;
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f87672i) {
        }
        return b();
    }
}
