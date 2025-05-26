package tv1;

import com.pinterest.api.model.d00;
import com.pinterest.api.model.g00;
import com.pinterest.api.model.k00;
import com.pinterest.api.model.l00;
import com.pinterest.api.model.o00;
import java.util.Iterator;
import java.util.List;
import kg.p;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class i implements ov1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ov1.e f119594a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f119595b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g00 f119596c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ov1.a f119597d;

    public i(ov1.e eVar, j jVar, g00 g00Var, ov1.a aVar) {
        this.f119594a = eVar;
        this.f119595b = jVar;
        this.f119596c = g00Var;
        this.f119597d = aVar;
    }

    @Override // ov1.a
    public final void a(g00 updatedModule) {
        g00 g00Var;
        List p13;
        Object obj;
        Object obj2;
        Intrinsics.checkNotNullParameter(updatedModule, "updatedModule");
        ov1.e eVar = ov1.e.NOT_SELECTABLE;
        ov1.e eVar2 = this.f119594a;
        if (eVar2 == eVar) {
            return;
        }
        ov1.e eVar3 = ov1.e.SINGLE_SELECTABLE_ONLY;
        g00 g00Var2 = this.f119596c;
        j jVar = this.f119595b;
        if (eVar2 != eVar3 || pe.i.Q0(updatedModule)) {
            j.v(jVar, updatedModule);
            j.u(jVar, g00Var2, updatedModule);
        }
        o00 o00Var = null;
        if (p.O(eVar2) && pe.i.Q0(updatedModule) && !Intrinsics.d(jVar.f119598h, updatedModule.getUid())) {
            String str = jVar.f119598h;
            if (str != null) {
                Iterator it = jVar.d().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it.next();
                    g00 g00Var3 = (g00) obj2;
                    if (!(g00Var3 instanceof g00)) {
                        g00Var3 = null;
                    }
                    if (Intrinsics.d(g00Var3 != null ? g00Var3.getUid() : null, str)) {
                        break;
                    }
                }
                g00 g00Var4 = obj2 instanceof g00 ? (g00) obj2 : null;
                g00 u13 = g00Var4 != null ? pe.i.u1(g00Var4, false) : null;
                if (u13 != null) {
                    j.v(jVar, u13);
                    j.u(jVar, g00Var2, u13);
                }
            }
            jVar.f119598h = updatedModule.getUid();
        }
        jVar.getClass();
        k00 q13 = g00Var2.q();
        if (q13 == null || (p13 = q13.p()) == null) {
            g00Var = null;
        } else {
            Iterator it2 = p13.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it2.next();
                o00 v13 = ((g00) obj).v();
                if (com.bumptech.glide.d.o0(v13 != null ? v13.v() : null)) {
                    break;
                }
            }
            g00Var = (g00) obj;
        }
        d00 z13 = g00Var2.z();
        o00 v14 = g00Var2.v();
        if (v14 != null) {
            l00 B = v14.B();
            B.g(Boolean.valueOf(g00Var != null));
            o00Var = B.a();
        }
        z13.c(o00Var);
        g00 a13 = z13.a();
        Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
        this.f119597d.a(a13);
    }
}
