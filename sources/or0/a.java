package or0;

import ak2.e;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f97246a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f97247b;

    public /* synthetic */ a(b bVar, int i13) {
        this.f97246a = i13;
        this.f97247b = bVar;
    }

    @Override // ak2.e
    public final void accept(Object obj) {
        String str = "";
        int i13 = this.f97246a;
        b bVar = this.f97247b;
        qr0.d dVar = (qr0.d) obj;
        switch (i13) {
            case 0:
                bVar.getClass();
                bVar.f97250c = dVar.d().size();
                String g13 = dVar.g();
                String r13 = dVar.r();
                if (bVar.f97249b && dVar.d() != null) {
                    List d2 = dVar.d();
                    qo1.b bVar2 = bVar.f97251d;
                    bVar2.b(d2);
                    str = bVar2.a();
                }
                bVar.f97252e = ((rr0.b) bVar.f97248a).a(g13, bVar.f97250c, r13, str);
                break;
            default:
                bVar.f97250c = dVar.d().size() + bVar.f97250c;
                String g14 = dVar.g();
                String r14 = dVar.r();
                if (bVar.f97249b && dVar.d() != null) {
                    List d13 = dVar.d();
                    qo1.b bVar3 = bVar.f97251d;
                    bVar3.b(d13);
                    str = bVar3.a();
                }
                bVar.f97252e = ((rr0.b) bVar.f97248a).a(g14, bVar.f97250c, r14, str);
                break;
        }
    }
}
