package j10;

import com.pinterest.api.model.f30;
import com.pinterest.api.model.ow;
import java.util.List;

/* loaded from: classes3.dex */
public final class f extends hb0.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ List f74353d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g f74354e;

    public f(List<? extends f30> list, g gVar) {
        this.f74353d = list;
        this.f74354e = gVar;
    }

    @Override // hb0.c
    public final void c() {
        o10.c cVar = o10.c.f92770a;
        ow owVar = new ow();
        for (f30 f30Var : this.f74353d) {
            o10.e a13 = cVar.a(f30Var);
            if (a13 != null) {
                a13.a(f30Var, owVar);
            }
        }
        d12.i.a(this.f74354e.f74357c, owVar);
    }
}
