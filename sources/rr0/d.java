package rr0;

import java.util.List;
import wa2.o;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements ak2.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f109882a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f109883b;

    public /* synthetic */ d(g gVar, int i13) {
        this.f109882a = i13;
        this.f109883b = gVar;
    }

    @Override // ak2.e
    public final void accept(Object obj) {
        int i13 = this.f109882a;
        g gVar = this.f109883b;
        switch (i13) {
            case 0:
                j6.b bVar = gVar.D3().f91879n;
                ((g1.h) bVar.f74795c).clear();
                bVar.f74794b = -bVar.f74793a;
                gVar.R3(((qr0.d) obj).d());
                break;
            case 1:
                gVar.K3((qr0.d) obj);
                break;
            case 2:
                gVar.H3((Throwable) obj);
                break;
            case 3:
                gVar.getClass();
                break;
            case 4:
                List<gb2.i> list = (List) obj;
                gVar.getClass();
                if (!list.isEmpty() && ((gb2.i) ep.b.i(list, 1)).f64755c != o.EVENT_ONLY) {
                    for (gb2.i iVar : list) {
                        if (iVar.f64755c != o.EVENT_ONLY) {
                            gVar.f109907s.put(iVar.f64753a, iVar);
                        }
                    }
                    break;
                }
                break;
            case 5:
                ol1.a aVar = (ol1.a) obj;
                gVar.getClass();
                String str = aVar.f96440a;
                if (gVar.f109901m == null) {
                    gVar.f109901m = new qr0.c(gVar, gVar);
                }
                gVar.f109901m.a(str, aVar.f96441b);
                break;
            case 6:
                qr0.d dVar = (qr0.d) obj;
                gVar.getClass();
                List d2 = dVar.d();
                gVar.M3(d2.size() + gVar.f109906r.size(), d2);
                gVar.v3(d2);
                gVar.L3(dVar);
                break;
            case 7:
                gVar.f109892d.c();
                gVar.J3((Throwable) obj);
                break;
            default:
                gVar.getClass();
                break;
        }
    }
}
