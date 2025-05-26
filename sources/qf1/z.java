package qf1;

import com.pinterest.api.model.f30;
import com.pinterest.api.model.hh;
import com.pinterest.api.model.wy0;
import com.pinterest.api.model.z2;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import dl1.v0;
import gk1.x0;
import java.util.HashSet;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class z extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f103780i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f103781j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(String str, int i13) {
        super(1);
        this.f103780i = i13;
        this.f103781j = str;
    }

    public final Boolean b(dl1.s comment) {
        int i13 = this.f103780i;
        String str = this.f103781j;
        switch (i13) {
            case 21:
                Intrinsics.checkNotNullParameter(comment, "comment");
                z2 z2Var = comment instanceof z2 ? (z2) comment : null;
                return Boolean.valueOf(Intrinsics.d(z2Var != null ? n10.a.e(z2Var) : null, str));
            default:
                Intrinsics.checkNotNullParameter(comment, "it");
                return Boolean.valueOf(Intrinsics.d(comment.getUid(), str));
        }
    }

    public final rn1.a e(rn1.a it) {
        int i13 = this.f103780i;
        String title = this.f103781j;
        switch (i13) {
            case 4:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, bs1.c.h2(title), null, null, null, null, 0, fm1.c.VISIBLE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097086);
            case 5:
            case 16:
            case 20:
            case 21:
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, bs1.c.h2(title), null, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097150);
            case 6:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, ep.b.x(title, "string", title), vn1.c.LIGHT, null, kotlin.collections.e0.b(vn1.e.REGULAR), vn1.g.UI_100, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097124);
            case 7:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, ep.b.x(title, "string", title), vn1.c.LIGHT, null, kotlin.collections.e0.b(vn1.e.BOLD), vn1.g.HEADING_600, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097124);
            case 8:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, bs1.c.h2(title != null ? title : ""), null, null, null, null, 0, d7.b.Z(!(title == null || kotlin.text.z.j(title))), null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097086);
            case 9:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, bs1.c.h2(title), null, null, null, null, 0, fm1.c.VISIBLE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097086);
            case 10:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, bs1.c.h2(title != null ? title : ""), null, null, null, null, 0, d7.b.Z(!(title == null || kotlin.text.z.j(title))), null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097086);
            case 11:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, bs1.c.h2(title != null ? title : ""), null, null, null, null, 0, d7.b.Z(!(title == null || kotlin.text.z.j(title))), null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097086);
            case 12:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, bs1.c.h2(title), null, null, null, null, 0, fm1.c.VISIBLE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097086);
            case 13:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, bs1.c.h2(title), null, null, null, null, 0, fm1.c.VISIBLE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097086);
            case 14:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, bs1.c.h2(title), null, null, null, null, 0, fm1.c.VISIBLE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097086);
            case 15:
                Intrinsics.checkNotNullParameter(it, "it");
                Intrinsics.checkNotNullExpressionValue(title, "$title");
                return rn1.a.y(it, bs1.c.h2(title), null, null, null, null, 0, fm1.c.VISIBLE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097086);
            case 17:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, bs1.c.h2(title), null, null, null, null, 0, fm1.c.VISIBLE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097086);
            case 18:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, bs1.c.h2(title), null, null, null, null, 0, fm1.c.VISIBLE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097086);
            case 19:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, bs1.c.h2(title), null, null, null, null, 0, fm1.c.VISIBLE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097086);
            case 22:
                return rn1.a.y(it, jq.b.p(it, "it", title, "string", title), null, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097150);
            case 23:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, bs1.c.h2(title), null, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097150);
            case 24:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, bs1.c.h2(title), vn1.c.DEFAULT, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097148);
            case 25:
                return rn1.a.y(it, jq.b.p(it, "it", title, "string", title), null, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097150);
        }
    }

    public final yl1.b f(yl1.b it) {
        int i13 = this.f103780i;
        String str = this.f103781j;
        switch (i13) {
            case 16:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
        }
        return yl1.b.f(it, bs1.c.h2(str), false, null, null, null, null, null, null, 0, null, 1022);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        wy0 d2;
        int i13 = this.f103780i;
        String it = this.f103781j;
        switch (i13) {
            case 0:
                return kg.p.T(((Number) obj).intValue(), it, null);
            case 1:
                v0 updatedModel = (v0) obj;
                Intrinsics.checkNotNullParameter(updatedModel, "updatedModel");
                return Boolean.valueOf(Intrinsics.d(((f30) updatedModel.f55290b).getUid(), it));
            case 2:
                Object[] it2 = (Object[]) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                boolean z13 = false;
                for (Object obj2 : it2) {
                    if (obj2 instanceof f30) {
                        hh t53 = ((f30) obj2).t5();
                        if (Intrinsics.d((t53 == null || (d2 = t53.d()) == null) ? null : d2.getUid(), it)) {
                            z13 = true;
                        }
                    }
                }
                return Boolean.valueOf(z13);
            case 3:
                f30 pin = (f30) obj;
                Intrinsics.checkNotNullParameter(pin, "pin");
                return Boolean.valueOf(Intrinsics.d(pin.getUid(), it));
            case 4:
                return e((rn1.a) obj);
            case 5:
                un1.m bind = (un1.m) obj;
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                Intrinsics.checkNotNullExpressionValue(it, "$it");
                bind.a(it);
                return Unit.f80348a;
            case 6:
                return e((rn1.a) obj);
            case 7:
                return e((rn1.a) obj);
            case 8:
                return e((rn1.a) obj);
            case 9:
                return e((rn1.a) obj);
            case 10:
                return e((rn1.a) obj);
            case 11:
                return e((rn1.a) obj);
            case 12:
                return e((rn1.a) obj);
            case 13:
                return e((rn1.a) obj);
            case 14:
                return e((rn1.a) obj);
            case 15:
                return e((rn1.a) obj);
            case 16:
                return f((yl1.b) obj);
            case 17:
                return e((rn1.a) obj);
            case 18:
                return e((rn1.a) obj);
            case 19:
                return e((rn1.a) obj);
            case 20:
                return f((yl1.b) obj);
            case 21:
                return b((dl1.s) obj);
            case 22:
                return e((rn1.a) obj);
            case 23:
                return e((rn1.a) obj);
            case 24:
                return e((rn1.a) obj);
            case 25:
                return e((rn1.a) obj);
            case 26:
                return e((rn1.a) obj);
            case 27:
                x0 it3 = (x0) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                return x0.b(it3, false, false, false, null, 0, false, null, null, false, null, false, null, false, false, false, null, null, false, false, this.f103781j, -1, RecyclerViewTypes.VIEW_TYPE_LENS_PHOTO);
            case 28:
                HashSet hashSet = tb0.h.f117076w;
                tb0.g.f117075a.o("Error when getting model to update (modelId=" + it + ")", (Throwable) obj);
                return Unit.f80348a;
            default:
                return b((dl1.s) obj);
        }
    }
}
