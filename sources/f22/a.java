package f22;

import com.pinterest.api.model.wy0;
import jk2.d0;
import kotlin.jvm.internal.Intrinsics;
import n60.o;
import uj2.q;
import x02.x2;

/* loaded from: classes2.dex */
public final class a implements rz.d {

    /* renamed from: a, reason: collision with root package name */
    public final x2 f60975a;

    public a(x2 userRepository) {
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        this.f60975a = userRepository;
    }

    @Override // rz.d
    public final Object b(vd0.c pinterestJsonObject) {
        Boolean bool;
        Intrinsics.checkNotNullParameter(pinterestJsonObject, "pinterestJsonObject");
        vd0.c m13 = pinterestJsonObject.m("data");
        q Q = this.f60975a.d0().Q("me");
        ek2.e eVar = new ek2.e(1);
        try {
            Q.d(new d0(eVar, 0L));
            wy0 wy0Var = (wy0) eVar.c();
            Intrinsics.f(wy0Var);
            if (m13 == null || (bool = m13.h("convert_to_personal_permission", Boolean.FALSE)) == null) {
                bool = Boolean.FALSE;
            }
            return new rq0.a(wy0Var, bool.booleanValue());
        } catch (NullPointerException e13) {
            throw e13;
        } catch (Throwable th3) {
            throw o.g(th3, "subscribeActual failed", th3);
        }
    }
}
