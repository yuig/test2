package sm2;

import rm2.c0;
import rm2.d0;

/* loaded from: classes4.dex */
public final class g implements c0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f113285a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f113286b;

    public /* synthetic */ g(i iVar, int i13) {
        this.f113285a = i13;
        this.f113286b = iVar;
    }

    @Override // rm2.c0
    public final void a() {
    }

    @Override // rm2.c0
    public final void b(ym2.g gVar, ym2.b bVar, ym2.g gVar2) {
        int i13 = this.f113285a;
    }

    @Override // rm2.c0
    public final void c(Object obj, ym2.g gVar) {
        switch (this.f113285a) {
            case 0:
                break;
            default:
                String b13 = gVar.b();
                boolean equals = "version".equals(b13);
                i iVar = this.f113286b;
                if (!equals) {
                    if ("multifileClassName".equals(b13)) {
                        iVar.f113292b = obj instanceof String ? (String) obj : null;
                        break;
                    }
                } else if (obj instanceof int[]) {
                    iVar.f113291a = (int[]) obj;
                    break;
                }
                break;
        }
    }

    @Override // rm2.c0
    public final void d(ym2.g gVar, dn2.f fVar) {
        int i13 = this.f113285a;
    }

    @Override // rm2.c0
    public final d0 e(ym2.g gVar) {
        switch (this.f113285a) {
            case 0:
                if ("b".equals(gVar.b())) {
                    return new h(this, 2);
                }
                return null;
            default:
                String b13 = gVar.b();
                if ("data".equals(b13) || "filePartClassNames".equals(b13)) {
                    return new h(this, 0);
                }
                if ("strings".equals(b13)) {
                    return new h(this, 1);
                }
                return null;
        }
    }

    @Override // rm2.c0
    public final c0 f(ym2.b bVar, ym2.g gVar) {
        int i13 = this.f113285a;
        return null;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(i iVar, int i13, int i14) {
        this(iVar, 0);
        this.f113285a = i13;
        int i15 = 1;
        if (i13 != 1) {
        } else {
            this(iVar, i15);
        }
    }
}
