package m7;

import android.util.Pair;
import androidx.work.impl.WorkDatabase;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class g1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f86165a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f86166b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f86167c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f86168d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f86169e;

    public /* synthetic */ g1(Object obj, Object obj2, Object obj3, Object obj4, int i13) {
        this.f86165a = i13;
        this.f86166b = obj;
        this.f86167c = obj2;
        this.f86168d = obj3;
        this.f86169e = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i13 = this.f86165a;
        Object obj = this.f86169e;
        Object obj2 = this.f86168d;
        Object obj3 = this.f86167c;
        Object obj4 = this.f86166b;
        switch (i13) {
            case 0:
                Pair pair = (Pair) obj3;
                n7.a aVar = ((j1) obj4).f86222b.f86322h;
                n7.c0 c0Var = (n7.c0) aVar;
                c0Var.d(((Integer) pair.first).intValue(), (g8.e0) pair.second, (g8.v) obj2, (g8.a0) obj);
                break;
            case 1:
                List list = (List) obj4;
                tb.j jVar = (tb.j) obj3;
                kb.d dVar = (kb.d) obj2;
                WorkDatabase workDatabase = (WorkDatabase) obj;
                String str = lb.s.f82667a;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((lb.q) it.next()).a(jVar.f116981a);
                }
                lb.s.b(dVar, workDatabase, list);
                break;
            default:
                dl1.q0 this$0 = (dl1.q0) obj4;
                dl1.m params = (dl1.m) obj3;
                dl1.m modelKey = (dl1.m) obj2;
                dl1.s model = (dl1.s) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(params, "$params");
                Intrinsics.checkNotNullParameter(modelKey, "$modelKey");
                Intrinsics.checkNotNullParameter(model, "$model");
                if (this$0.f55270c.a(params, dl1.a.WRITE)) {
                    this$0.f55268a.c(modelKey, model);
                    break;
                }
                break;
        }
    }
}
