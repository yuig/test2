package pk;

import java.io.Serializable;
import java.util.Map;

/* loaded from: classes3.dex */
public class g1 implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f100403a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f100404b;

    public g1(h1 h1Var) {
        Object[] objArr = new Object[h1Var.size()];
        Object[] objArr2 = new Object[h1Var.size()];
        n3 it = h1Var.entrySet().iterator();
        int i13 = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            objArr[i13] = entry.getKey();
            objArr2[i13] = entry.getValue();
            i13++;
        }
        this.f100403a = objArr;
        this.f100404b = objArr2;
    }

    public d7.b0 a(int i13) {
        return new d7.b0(i13);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object readResolve() {
        Object[] objArr = this.f100403a;
        boolean z13 = objArr instanceof o1;
        Object[] objArr2 = this.f100404b;
        if (!z13) {
            d7.b0 a13 = a(objArr.length);
            for (int i13 = 0; i13 < objArr.length; i13++) {
                a13.e(objArr[i13], objArr2[i13]);
            }
            return a13.a();
        }
        o1 o1Var = (o1) objArr;
        d7.b0 a14 = a(o1Var.size());
        n3 it = o1Var.iterator();
        n3 it2 = ((v0) objArr2).iterator();
        while (it.hasNext()) {
            a14.e(it.next(), it2.next());
        }
        return a14.a();
    }
}
