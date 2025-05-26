package hm1;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import fc0.k;
import i2.f2;
import i2.o;
import i2.s;
import java.util.List;
import k31.h;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;
import rq.a0;
import sl1.i;
import u2.n;
import u2.q;

/* loaded from: classes5.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final List f69572a;

    /* renamed from: b, reason: collision with root package name */
    public static final i f69573b;

    static {
        List j13 = f0.j(b("Evan Sharp"), b("Sha Sha Chu"), b("Bill Ready"));
        f69572a = j13;
        f69573b = new i(j13, 3, null, false, 0, RecyclerViewTypes.VIEW_TYPE_ANKET_INLINE_SURVEY_VIEW_FULL_SPAN);
    }

    public static final void a(i state, q qVar, gm1.a aVar, o oVar, int i13, int i14) {
        Intrinsics.checkNotNullParameter(state, "state");
        s sVar = (s) oVar;
        sVar.Y(-1802689935);
        if ((i14 & 2) != 0) {
            qVar = n.f120041b;
        }
        if ((i14 & 4) != 0) {
            aVar = null;
        }
        androidx.compose.ui.viewinterop.a.a(new a0(((Number) sVar.m(k.f61712a)).intValue(), state, aVar, 15), qVar, new com.pinterest.framework.screens.q(14, state, aVar), sVar, i13 & RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER, 0);
        f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new h(i13, i14, 5, qVar, state, aVar);
        }
    }

    public static sl1.e b(String str) {
        return new sl1.e("default_", "test_user_id", str, (Integer) 0);
    }
}
