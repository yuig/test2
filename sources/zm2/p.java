package zm2;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes4.dex */
public abstract class p extends o {

    /* renamed from: b, reason: collision with root package name */
    public m f142243b = m.f142237d;

    /* renamed from: c, reason: collision with root package name */
    public boolean f142244c;

    public static m g(p pVar) {
        pVar.f142243b.f();
        pVar.f142244c = false;
        return pVar.f142243b;
    }

    public final void h(q qVar) {
        e0 e0Var;
        if (!this.f142244c) {
            this.f142243b = this.f142243b.clone();
            this.f142244c = true;
        }
        m mVar = this.f142243b;
        m mVar2 = qVar.f142245a;
        mVar.getClass();
        int i13 = 0;
        while (true) {
            int size = mVar2.f142238a.f142197b.size();
            e0Var = mVar2.f142238a;
            if (i13 >= size) {
                break;
            }
            mVar.g((Map.Entry) e0Var.f142197b.get(i13));
            i13++;
        }
        Iterator it = e0Var.g().iterator();
        while (it.hasNext()) {
            mVar.g((Map.Entry) it.next());
        }
    }
}
