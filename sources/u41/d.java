package u41;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import i2.f2;
import i2.o;
import i2.s;
import j41.i;
import java.util.List;
import k31.h;
import kotlin.collections.f0;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import p1.l;
import p1.x0;
import rl2.g0;
import rm1.q;
import u2.n;

/* loaded from: classes5.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final a f120480a = new a(q0.f80391a);

    /* renamed from: b, reason: collision with root package name */
    public static final b f120481b = new b(androidx.compose.foundation.layout.b.b(0.0f, 3), eo1.c.space_200);

    /* renamed from: c, reason: collision with root package name */
    public static final List f120482c = f0.j(f.b("Favorites", q.STAR, false, 4), f.b("Created by you", null, false, 6), f.b("Interests", null, true, 2));

    public static final void a(a state, u2.q qVar, b bVar, o oVar, int i13, int i14) {
        Intrinsics.checkNotNullParameter(state, "state");
        s sVar = (s) oVar;
        sVar.Y(2060436677);
        u2.q qVar2 = (i14 & 2) != 0 ? n.f120041b : qVar;
        b bVar2 = (i14 & 4) != 0 ? f120481b : bVar;
        x0 x0Var = bVar2.f120475a;
        p1.g gVar = l.f98543a;
        g0.g(qVar2, null, x0Var, false, l.g(com.bumptech.glide.d.A(bVar2.f120476b, sVar)), u2.b.f120023k, null, false, new i(state, 1), sVar, ((i13 >> 3) & 14) | 196608, RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_USE_CASE_MODULE_STORY_PIN);
        f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new h(i13, i14, 2, qVar2, state, bVar2);
        }
    }

    public static final b b() {
        return f120481b;
    }
}
