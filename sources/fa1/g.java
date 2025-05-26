package fa1;

import com.pinterest.api.model.f30;
import com.pinterest.api.model.wy0;
import com.pinterest.reportFlow.feature.rvc.model.LinkedBA;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.g0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import p02.v;
import u50.r;

/* loaded from: classes5.dex */
public final class g extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f61560i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ r f61561j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(r rVar, int i13) {
        super(1);
        this.f61560i = i13;
        this.f61561j = rVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a4, code lost:
    
        if (r1 != null) goto L49;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(java.lang.Throwable r5) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: fa1.g.b(java.lang.Throwable):void");
    }

    public final void e(vd0.c cVar) {
        int i13 = this.f61560i;
        r rVar = this.f61561j;
        switch (i13) {
            case 0:
                rVar.a(ea1.f.f58048a);
                break;
            case 4:
                rVar.a(ea1.m.f58082a);
                break;
            default:
                vd0.c m13 = cVar.m("data");
                if (m13 != null && m13.k("catalogs").d() == 0) {
                    rVar.a(ub1.f.f121718a);
                    break;
                }
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f61560i;
        r rVar = this.f61561j;
        switch (i13) {
            case 0:
                e((vd0.c) obj);
                break;
            case 1:
                b((Throwable) obj);
                break;
            case 2:
                b((Throwable) obj);
                break;
            case 3:
                b((Throwable) obj);
                break;
            case 4:
                e((vd0.c) obj);
                break;
            case 5:
                b((Throwable) obj);
                break;
            case 6:
                wy0 wy0Var = (wy0) obj;
                switch (i13) {
                    case 6:
                        Intrinsics.f(wy0Var);
                        rVar.a(new ga1.g(wy0Var));
                        break;
                    default:
                        Intrinsics.f(wy0Var);
                        rVar.a(new sb1.e(wy0Var));
                        break;
                }
                break;
            case 7:
                b((Throwable) obj);
                break;
            case 8:
                b((Throwable) obj);
                break;
            case 9:
                b((Throwable) obj);
                break;
            case 10:
                b((Throwable) obj);
                break;
            case 11:
                wy0 wy0Var2 = (wy0) obj;
                switch (i13) {
                    case 6:
                        Intrinsics.f(wy0Var2);
                        rVar.a(new ga1.g(wy0Var2));
                        break;
                    default:
                        Intrinsics.f(wy0Var2);
                        rVar.a(new sb1.e(wy0Var2));
                        break;
                }
                break;
            case 12:
                b((Throwable) obj);
                break;
            case 13:
                e((vd0.c) obj);
                break;
            case 14:
                b((Throwable) obj);
                break;
            case 15:
                b((Throwable) obj);
                break;
            case 16:
                b((Throwable) obj);
                break;
            case 17:
                f30 f30Var = (f30) obj;
                Intrinsics.f(f30Var);
                rVar.a(new od1.g(f30Var));
                break;
            case 18:
                b((Throwable) obj);
                break;
            case 19:
                List it = (List) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                List<wy0> list = it;
                ArrayList arrayList = new ArrayList(g0.q(list, 10));
                for (wy0 wy0Var3 : list) {
                    arrayList.add(new LinkedBA(wy0Var3.Z2(), wy0Var3.getUid()));
                }
                rVar.a(new s02.b(arrayList));
                break;
            default:
                v it2 = (v) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                rVar.a(new p02.k(it2.getFileContent(), it2.getFileType()));
                break;
        }
        return Unit.f80348a;
    }
}
