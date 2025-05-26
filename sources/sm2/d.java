package sm2;

import java.util.ArrayList;
import rm2.c0;
import rm2.d0;

/* loaded from: classes2.dex */
public abstract class d implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f113281a = new ArrayList();

    @Override // rm2.d0
    public final void a() {
        f((String[]) this.f113281a.toArray(new String[0]));
    }

    @Override // rm2.d0
    public final c0 b(ym2.b bVar) {
        return null;
    }

    @Override // rm2.d0
    public final void c(ym2.b bVar, ym2.g gVar) {
    }

    @Override // rm2.d0
    public final void d(dn2.f fVar) {
    }

    @Override // rm2.d0
    public final void e(Object obj) {
        if (obj instanceof String) {
            this.f113281a.add((String) obj);
        }
    }

    public abstract void f(String[] strArr);
}
