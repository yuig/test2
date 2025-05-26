package fh0;

import com.pinterest.experience.models.framework.ExperienceDataDeserializationException;
import i32.h0;
import i32.j0;
import i32.k0;
import i32.m0;
import kotlin.Pair;
import kotlin.collections.y0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.r;
import kotlin.jvm.internal.s;
import xk2.q;

/* loaded from: classes5.dex */
public final class d extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final d f62154j = new d(0);

    /* renamed from: k, reason: collision with root package name */
    public static final d f62155k = new d(1);

    /* renamed from: l, reason: collision with root package name */
    public static final d f62156l = new d(2);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f62157i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i13) {
        super(1);
        this.f62157i = i13;
    }

    public final Object b(hh0.f fVar) {
        switch (this.f62157i) {
            case 0:
                Intrinsics.checkNotNullParameter(fVar, "$this$null");
                try {
                    q qVar = xk2.s.f135225b;
                    vd0.c cVar = fVar.f69147d;
                    String d2 = cVar.d("title");
                    String i03 = r.i0(cVar, "message");
                    b objectMapper = b.f62152a;
                    Intrinsics.checkNotNullParameter(cVar, "<this>");
                    Intrinsics.checkNotNullParameter("complete_button", "propertyName");
                    Intrinsics.checkNotNullParameter(objectMapper, "objectMapper");
                    vd0.c m13 = cVar.m("complete_button");
                    if (m13 != null) {
                        Object obj = ((xk2.s) objectMapper.invoke(m13)).f135226a;
                        ue.c.H(obj);
                        if (obj != null) {
                            return new a(d2, i03, (gh0.a) obj, (gh0.a) r.d0(cVar, "dismiss_button", c.f62153a));
                        }
                    }
                    int i13 = ExperienceDataDeserializationException.f45050c;
                    Intrinsics.checkNotNullParameter("complete_button", "propertyName");
                    throw new ExperienceDataDeserializationException((hh0.f) null, "ERR_MISSING_REQUIRED_PROPERTY", y0.b(new Pair("unknown_property_name", "complete_button")), 8);
                } catch (Throwable th3) {
                    q qVar2 = xk2.s.f135225b;
                    return ue.c.m(th3);
                }
            default:
                Intrinsics.checkNotNullParameter(fVar, "$this$null");
                try {
                    q qVar3 = xk2.s.f135225b;
                    vd0.c cVar2 = fVar.f69147d;
                    h0 h0Var = j0.Companion;
                    int j13 = cVar2.j(-1, "icon");
                    h0Var.getClass();
                    j0 a13 = h0.a(j13);
                    k0 k0Var = m0.Companion;
                    int j14 = cVar2.j(-1, "icon_color");
                    k0Var.getClass();
                    return new f(a13, k0.a(j14), cVar2.d("title"), r.i0(cVar2, "message"), (gh0.a) r.d0(cVar2, "complete_button", g.f62164a), (gh0.a) r.d0(cVar2, "dismiss_button", h.f62165a));
                } catch (Throwable th4) {
                    q qVar4 = xk2.s.f135225b;
                    return ue.c.m(th4);
                }
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f62157i) {
            case 0:
                return new xk2.s(b((hh0.f) obj));
            case 1:
                hh0.f fVar = (hh0.f) obj;
                Intrinsics.checkNotNullParameter(fVar, "$this$null");
                return Boolean.valueOf(fVar.f69147d.f() && fVar.f69148e != null);
            default:
                return new xk2.s(b((hh0.f) obj));
        }
    }
}
