package w71;

import com.pinterest.feature.search.visual.collage.database.CollageDatabase;

/* loaded from: classes5.dex */
public final class e extends ja.i {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f128174d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g f128175e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(g gVar, CollageDatabase collageDatabase, int i13) {
        super(collageDatabase, 1);
        this.f128174d = i13;
        this.f128175e = gVar;
    }

    @Override // androidx.recyclerview.widget.c3
    public final String e() {
        switch (this.f128174d) {
            case 0:
                return "INSERT OR REPLACE INTO `collage_item` (`id`,`overlay_item`,`page_id`) VALUES (?,?,?)";
            default:
                return "INSERT OR ABORT INTO `collage_item` (`id`,`overlay_item`,`page_id`) VALUES (?,?,?)";
        }
    }

    @Override // ja.i
    public final /* bridge */ /* synthetic */ void l(oa.i iVar, Object obj) {
        switch (this.f128174d) {
            case 0:
                p(iVar, (x71.b) obj);
                break;
            default:
                p(iVar, (x71.b) obj);
                break;
        }
    }

    public final void p(oa.i iVar, x71.b bVar) {
        int i13 = this.f128174d;
        g gVar = this.f128175e;
        switch (i13) {
            case 0:
                iVar.c1(1, bVar.f134114a);
                String a13 = g.a(gVar).a(bVar.f134115b);
                if (a13 == null) {
                    iVar.M1(2);
                } else {
                    iVar.c1(2, a13);
                }
                iVar.c1(3, bVar.f134116c);
                break;
            default:
                iVar.c1(1, bVar.f134114a);
                String a14 = g.a(gVar).a(bVar.f134115b);
                if (a14 == null) {
                    iVar.M1(2);
                } else {
                    iVar.c1(2, a14);
                }
                iVar.c1(3, bVar.f134116c);
                break;
        }
    }
}
