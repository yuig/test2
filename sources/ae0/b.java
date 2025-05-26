package ae0;

import ja.d0;
import ja.i;
import java.util.Date;
import w71.g;
import xa0.j;

/* loaded from: classes5.dex */
public final class b extends i {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f15036d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f15037e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Object obj, d0 d0Var, int i13) {
        super(d0Var, 0);
        this.f15036d = i13;
        this.f15037e = obj;
    }

    @Override // androidx.recyclerview.widget.c3
    public final String e() {
        switch (this.f15036d) {
            case 0:
                return "UPDATE OR ABORT `idea_pin_recently_used_content` SET `content_id` = ?,`user_id` = ?,`last_used_timestamp` = ?,`content_type` = ? WHERE `content_id` = ? AND `user_id` = ?";
            case 1:
                return "UPDATE OR ABORT `collage_drafts` SET `id` = ?,`user_id` = ?,`last_updated_at` = ? WHERE `id` = ?";
            case 2:
                return "UPDATE OR ABORT `collage_item` SET `id` = ?,`overlay_item` = ?,`page_id` = ? WHERE `id` = ?";
            default:
                return "UPDATE OR ABORT `collage_page` SET `id` = ?,`draft_id` = ?,`background_image` = ? WHERE `id` = ?";
        }
    }

    @Override // ja.i
    public final void l(oa.i iVar, Object obj) {
        int i13 = this.f15036d;
        Object obj2 = this.f15037e;
        switch (i13) {
            case 0:
                f fVar = (f) obj;
                iVar.c1(1, fVar.f15049a);
                String str = fVar.f15050b;
                iVar.c1(2, str);
                iVar.u1(3, fVar.f15051c);
                ((e) obj2).f15046c.getClass();
                iVar.c1(4, j.e(fVar.f15052d));
                iVar.c1(5, fVar.f15049a);
                iVar.c1(6, str);
                break;
            case 1:
                x71.a aVar = (x71.a) obj;
                iVar.c1(1, aVar.f134111a);
                iVar.c1(2, aVar.f134112b);
                w71.d.a((w71.d) obj2).getClass();
                Date date = aVar.f134113c;
                Long valueOf = date != null ? Long.valueOf(date.getTime()) : null;
                if (valueOf == null) {
                    iVar.M1(3);
                } else {
                    iVar.u1(3, valueOf.longValue());
                }
                iVar.c1(4, aVar.f134111a);
                break;
            case 2:
                x71.b bVar = (x71.b) obj;
                iVar.c1(1, bVar.f134114a);
                String a13 = g.a((g) obj2).a(bVar.f134115b);
                if (a13 == null) {
                    iVar.M1(2);
                } else {
                    iVar.c1(2, a13);
                }
                iVar.c1(3, bVar.f134116c);
                iVar.c1(4, bVar.f134114a);
                break;
            default:
                x71.c cVar = (x71.c) obj;
                iVar.c1(1, cVar.f134117a);
                iVar.c1(2, cVar.f134118b);
                String a14 = w71.i.a((w71.i) obj2).a(cVar.f134119c);
                if (a14 == null) {
                    iVar.M1(3);
                } else {
                    iVar.c1(3, a14);
                }
                iVar.c1(4, cVar.f134117a);
                break;
        }
    }
}
