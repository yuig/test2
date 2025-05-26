package x91;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.q0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o82.a1;
import o82.b1;
import o82.c1;
import o82.i2;
import o82.m1;
import o82.q1;
import o82.y0;

/* loaded from: classes5.dex */
public final class j0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f134325i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ q1 f134326j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j0(int i13, q1 q1Var) {
        super(1);
        this.f134325i = i13;
        this.f134326j = q1Var;
    }

    public final y0 b(y0 it) {
        int i13 = this.f134325i;
        q1 q1Var = this.f134326j;
        switch (i13) {
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                q0 q0Var = q0.f80391a;
                o82.t tVar = o82.t.f93712e;
                boolean z13 = ((a1) q1Var).f93525a;
                it.getClass();
                return y0.e(q0Var, tVar, z13);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return y0.f(it, null, new o82.s(((c1) q1Var).f93548a), 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f134325i;
        q1 q1Var = this.f134326j;
        switch (i13) {
            case 0:
                a it = (a) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return a.e(it, null, null, (((m1) q1Var).f93667a.isEmpty() ^ true) || it.f134304b.length() > 0, null, 11);
            case 1:
                return b((y0) obj);
            case 2:
                return b((y0) obj);
            case 3:
                i2 it2 = (i2) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                return i2.b(it2, ((b1) q1Var).f93536a, null, 2);
            default:
                ad2.t it3 = (ad2.t) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                List list = ((m1) q1Var).f93667a;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (obj2 instanceof ad2.j) {
                        arrayList.add(obj2);
                    }
                }
                return ad2.t.b(it3, arrayList, null, 5);
        }
    }
}
