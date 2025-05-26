package d7;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class q implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53881a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f53882b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f53883c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f53884d;

    public /* synthetic */ q(CopyOnWriteArraySet copyOnWriteArraySet, int i13, r rVar) {
        this.f53883c = copyOnWriteArraySet;
        this.f53882b = i13;
        this.f53884d = rVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i13 = this.f53881a;
        int i14 = this.f53882b;
        Object obj = this.f53884d;
        Object obj2 = this.f53883c;
        switch (i13) {
            case 0:
                r rVar = (r) obj;
                Iterator it = ((CopyOnWriteArraySet) obj2).iterator();
                while (it.hasNext()) {
                    t tVar = (t) it.next();
                    if (!tVar.f53888d) {
                        if (i14 != -1) {
                            tVar.f53886b.a(i14);
                        }
                        tVar.f53887c = true;
                        rVar.mo0invoke(tVar.f53885a);
                    }
                }
                break;
            default:
                kotlin.jvm.internal.h0 fromPosition = (kotlin.jvm.internal.h0) obj;
                Intrinsics.checkNotNullParameter(fromPosition, "$fromPosition");
                int i15 = fromPosition.f80426a;
                sq0.f0 f0Var = ((yq0.z) ((os.m) obj2)).f139759e;
                sq0.o r13 = f0Var.r(i15);
                sq0.o r14 = f0Var.r(i14);
                if (r13 != null && r14 != null && Intrinsics.d((yq0.a0) r13.f115027a, (yq0.a0) r14.f115027a)) {
                    Intrinsics.f(r13);
                    Intrinsics.f(r14);
                    sq0.e0 e0Var = r13.f115027a;
                    nr0.j jVar = e0Var instanceof nr0.j ? (nr0.j) e0Var : null;
                    if (jVar != null) {
                        jVar.n3(r13.f115028b, r14.f115028b);
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ q(os.m mVar, kotlin.jvm.internal.h0 h0Var, int i13) {
        this.f53883c = mVar;
        this.f53884d = h0Var;
        this.f53882b = i13;
    }
}
