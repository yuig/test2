package j1;

import i2.v3;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* loaded from: classes2.dex */
public final class w0 implements i2.s0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f74287a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f74288b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f74289c;

    public /* synthetic */ w0(int i13, Object obj, Object obj2) {
        this.f74287a = i13;
        this.f74288b = obj;
        this.f74289c = obj2;
    }

    @Override // i2.s0
    public final void dispose() {
        int i13 = this.f74287a;
        Object obj = this.f74289c;
        Object obj2 = this.f74288b;
        switch (i13) {
            case 0:
                ((u0) obj2).f74245a.n((o0) obj);
                break;
            case 1:
                ((g2) obj2).f74083i.remove((b2) obj);
                break;
            case 2:
                ((androidx.compose.foundation.lazy.layout.v0) obj2).f17312c.add(obj);
                break;
            case 3:
                i2.q1 q1Var = (i2.q1) obj2;
                o1.n nVar = (o1.n) q1Var.getValue();
                if (nVar != null) {
                    o1.m mVar = new o1.m(nVar);
                    o1.l lVar = (o1.l) obj;
                    if (lVar != null) {
                        lVar.b(mVar);
                    }
                    q1Var.setValue(null);
                    break;
                }
                break;
            case 4:
                ((w1.v2) obj2).f127552d.remove((Function1) obj);
                break;
            case 5:
                ((z9.k) obj2).f141217h.b((androidx.lifecycle.x) obj);
                break;
            default:
                Iterator it = ((List) ((v3) obj2).getValue()).iterator();
                while (it.hasNext()) {
                    ((ba.i) obj).b().b((z9.k) it.next());
                }
                break;
        }
    }
}
