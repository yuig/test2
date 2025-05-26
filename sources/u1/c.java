package u1;

import android.text.Editable;
import android.text.TextUtils;
import com.pinterest.activity.pin.view.unifiedcomments.CommentComposerView;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.lq0;
import com.pinterest.api.model.ro0;
import com.pinterest.api.model.uo0;
import com.pinterest.api.model.vg;
import com.pinterest.api.model.wo0;
import ey.s4;
import ey.v0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jk2.i1;
import jk2.m;
import kotlin.collections.CollectionsKt;
import kotlin.collections.e0;
import kotlin.collections.q0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import kotlin.text.StringsKt;
import rm1.q;

/* loaded from: classes2.dex */
public final class c extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f119983i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f119984j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f119985k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f119986l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f119987m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Object obj, Object obj2, boolean z13, boolean z14, int i13) {
        super(1);
        this.f119983i = i13;
        this.f119986l = obj;
        this.f119987m = obj2;
        this.f119984j = z13;
        this.f119985k = z14;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object obj2;
        uo0 uo0Var;
        List o13;
        int i13 = this.f119983i;
        boolean z13 = this.f119984j;
        boolean z14 = false;
        om1.c cVar = null;
        boolean z15 = this.f119985k;
        Object obj3 = this.f119987m;
        Object obj4 = this.f119986l;
        switch (i13) {
            case 1:
                wn1.d it = (wn1.d) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                om1.c cVar2 = it.f130533t;
                if (cVar2 != null) {
                    q qVar = ((CommentComposerView) obj4).H == null ? q.SORT_ASCENDING : q.CHECK;
                    Editable editable = (Editable) obj3;
                    if (TextUtils.getTrimmedLength(editable) <= 500 && ((StringsKt.i0(editable).length() > 0 || z13) && !z15)) {
                        z14 = true;
                    }
                    cVar = om1.c.e(cVar2, qVar, null, null, null, null, z14, 0, 990);
                }
                return wn1.d.e(it, null, null, null, null, false, null, cVar, null, null, 7864319);
            case 2:
                rn1.a it2 = (rn1.a) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                return rn1.a.y(it2, bs1.c.h2((String) obj4), null, null, e0.b(z13 ? vn1.e.BOLD : vn1.e.REGULAR), null, 0, d7.b.Z(z15), null, null, null, false, 0, bs1.c.h2((String) obj3), null, null, null, null, false, null, null, 2092982);
            default:
                List pages = (List) obj;
                Intrinsics.checkNotNullParameter(pages, "pages");
                if (pages.isEmpty()) {
                    String uid = ((f30) obj3).getUid();
                    Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
                    return ((h22.c) obj4).b(uid, q0.f80391a, z13);
                }
                if (!z15) {
                    h22.c cVar3 = (h22.c) obj4;
                    cVar3.getClass();
                    if (!pages.isEmpty()) {
                        List list = pages;
                        Iterator it3 = list.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                obj2 = it3.next();
                                if (((dl1.s) obj2) instanceof lq0) {
                                }
                            } else {
                                obj2 = null;
                            }
                        }
                        if (obj2 == null) {
                            Iterator it4 = list.iterator();
                            while (true) {
                                if (it4.hasNext()) {
                                    Object next = it4.next();
                                    dl1.s sVar = (dl1.s) next;
                                    wo0 wo0Var = sVar instanceof wo0 ? (wo0) sVar : null;
                                    if (wo0Var != null && (uo0Var = wo0Var.f43310a) != null && (o13 = uo0Var.o()) != null) {
                                        ArrayList Q = CollectionsKt.Q(o13);
                                        if (Q.isEmpty()) {
                                            continue;
                                        } else {
                                            vg vgVar = (vg) cVar3.f66580f.getValue();
                                            if (Q.isEmpty()) {
                                                continue;
                                            } else {
                                                Iterator it5 = Q.iterator();
                                                while (it5.hasNext()) {
                                                    if (Intrinsics.d(((ro0) it5.next()).a(vgVar), Boolean.TRUE)) {
                                                        cVar = next;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            if (cVar == null) {
                                f30 f30Var = (f30) obj3;
                                String uid2 = f30Var.getUid();
                                Intrinsics.checkNotNullExpressionValue(uid2, "getUid(...)");
                                new v0(uid2, s4.PAGES_ALREADY_EXISTED_IN_PIN).i();
                                return h22.c.a(f30Var, pages);
                            }
                        }
                    }
                }
                f30 f30Var2 = (f30) obj3;
                String uid3 = f30Var2.getUid();
                Intrinsics.checkNotNullExpressionValue(uid3, "getUid(...)");
                new v0(uid3, s4.PAGES_ALREADY_EXISTED_IN_PIN).i();
                h22.c cVar4 = (h22.c) obj4;
                cVar4.getClass();
                i1 a13 = h22.c.a(f30Var2, pages);
                String uid4 = f30Var2.getUid();
                Intrinsics.checkNotNullExpressionValue(uid4, "getUid(...)");
                m j13 = uj2.q.j(a13, cVar4.b(uid4, pages, false));
                Intrinsics.checkNotNullExpressionValue(j13, "concat(...)");
                return j13;
        }
    }
}
