package sm2;

import rm2.c0;
import rm2.d0;

/* loaded from: classes2.dex */
public final class f implements c0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f113284a;

    public f(i iVar) {
        this.f113284a = iVar;
    }

    @Override // rm2.c0
    public final void a() {
    }

    @Override // rm2.c0
    public final void b(ym2.g gVar, ym2.b bVar, ym2.g gVar2) {
    }

    @Override // rm2.c0
    public final void c(Object obj, ym2.g gVar) {
        String b13 = gVar.b();
        boolean equals = "k".equals(b13);
        i iVar = this.f113284a;
        if (equals) {
            if (obj instanceof Integer) {
                iVar.f113297g = b.getById(((Integer) obj).intValue());
                return;
            }
            return;
        }
        if ("mv".equals(b13)) {
            if (obj instanceof int[]) {
                iVar.f113291a = (int[]) obj;
                return;
            }
            return;
        }
        if ("xs".equals(b13)) {
            if (obj instanceof String) {
                String str = (String) obj;
                if (str.isEmpty()) {
                    return;
                }
                iVar.f113292b = str;
                return;
            }
            return;
        }
        if ("xi".equals(b13)) {
            if (obj instanceof Integer) {
                iVar.f113293c = ((Integer) obj).intValue();
            }
        } else if ("pn".equals(b13) && (obj instanceof String) && !((String) obj).isEmpty()) {
            iVar.getClass();
        }
    }

    @Override // rm2.c0
    public final void d(ym2.g gVar, dn2.f fVar) {
    }

    @Override // rm2.c0
    public final d0 e(ym2.g gVar) {
        String b13 = gVar.b();
        if ("d1".equals(b13)) {
            return new e(this, 0);
        }
        if ("d2".equals(b13)) {
            return new e(this, 1);
        }
        return null;
    }

    @Override // rm2.c0
    public final c0 f(ym2.b bVar, ym2.g gVar) {
        return null;
    }
}
