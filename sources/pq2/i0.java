package pq2;

import java.lang.reflect.Array;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class i0 extends k1 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f101038c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k1 f101039d;

    public i0(k1 k1Var, int i13) {
        this.f101038c = i13;
        this.f101039d = k1Var;
    }

    @Override // pq2.k1
    public final void a(x0 x0Var, Object obj) {
        int i13 = this.f101038c;
        k1 k1Var = this.f101039d;
        switch (i13) {
            case 0:
                Iterable iterable = (Iterable) obj;
                if (iterable != null) {
                    Iterator it = iterable.iterator();
                    while (it.hasNext()) {
                        k1Var.a(x0Var, it.next());
                    }
                    break;
                }
                break;
            default:
                if (obj != null) {
                    int length = Array.getLength(obj);
                    for (int i14 = 0; i14 < length; i14++) {
                        k1Var.a(x0Var, Array.get(obj, i14));
                    }
                    break;
                }
                break;
        }
    }
}
