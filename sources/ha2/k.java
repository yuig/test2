package ha2;

import android.graphics.Point;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class k extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f68447i = 0;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f68448j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f68449k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(int i13, vn1.c cVar) {
        super(1);
        this.f68448j = i13;
        this.f68449k = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f68447i;
        int i14 = this.f68448j;
        Object obj2 = this.f68449k;
        switch (i13) {
            case 0:
                rn1.a it = (rn1.a) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                vn1.c cVar = (vn1.c) obj2;
                return rn1.a.y(it, bs1.c.j2(new String[0], i14), cVar == null ? vn1.c.DEFAULT : cVar, null, null, null, 0, fm1.c.VISIBLE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097084);
            default:
                de2.a it2 = (de2.a) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                he2.f fVar = (he2.f) it2;
                Point position = (Point) obj2;
                fVar.getClass();
                Intrinsics.checkNotNullParameter(position, "position");
                mu0.i block = new mu0.i(fVar, position, i14, 6);
                Intrinsics.checkNotNullParameter("", "tag");
                Intrinsics.checkNotNullParameter(block, "block");
                Intrinsics.checkNotNullParameter("", "tag");
                Intrinsics.checkNotNullParameter(block, "block");
                return (ke2.d) block.invoke();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(Point point, int i13) {
        super(1);
        this.f68449k = point;
        this.f68448j = i13;
    }
}
