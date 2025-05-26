package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import i2.f2;
import i2.w3;
import i2.y3;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class v0 implements r2.k, r2.d {

    /* renamed from: a, reason: collision with root package name */
    public final r2.k f17310a;

    /* renamed from: b, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f17311b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashSet f17312c;

    public v0(r2.k kVar, Map map) {
        s0 s0Var = new s0(kVar, 0);
        w3 w3Var = r2.o.f106060a;
        this.f17310a = new r2.m(map, s0Var);
        this.f17311b = bs1.c.u1(null, y3.f71400a);
        this.f17312c = new LinkedHashSet();
    }

    @Override // r2.d
    public final void a(Object obj) {
        r2.d dVar = (r2.d) this.f17311b.getValue();
        if (dVar == null) {
            throw new IllegalArgumentException("null wrappedHolder".toString());
        }
        dVar.a(obj);
    }

    @Override // r2.k
    public final boolean b(Object obj) {
        return this.f17310a.b(obj);
    }

    @Override // r2.k
    public final Map c() {
        r2.d dVar = (r2.d) this.f17311b.getValue();
        if (dVar != null) {
            Iterator it = this.f17312c.iterator();
            while (it.hasNext()) {
                dVar.a(it.next());
            }
        }
        return this.f17310a.c();
    }

    @Override // r2.k
    public final Object d(String str) {
        return this.f17310a.d(str);
    }

    @Override // r2.d
    public final void e(Object obj, Function2 function2, i2.o oVar, int i13) {
        int i14;
        i2.s sVar = (i2.s) oVar;
        sVar.Y(-697180401);
        if ((i13 & 6) == 0) {
            i14 = (sVar.j(obj) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= sVar.j(function2) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= sVar.j(this) ? RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER : RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        }
        if ((i14 & RecyclerViewTypes.VIEW_TYPE_SEARCH_PRODUCT_COLLAGE_STORY) == 146 && sVar.z()) {
            sVar.Q();
        } else {
            r2.d dVar = (r2.d) this.f17311b.getValue();
            if (dVar == null) {
                throw new IllegalArgumentException("null wrappedHolder".toString());
            }
            dVar.e(obj, function2, sVar, (i14 & RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER) | (i14 & 14));
            boolean j13 = sVar.j(this) | sVar.j(obj);
            Object J2 = sVar.J();
            if (j13 || J2 == i2.n.f71185a) {
                J2 = new j1.x0(7, this, obj);
                sVar.g0(J2);
            }
            i2.u.b(obj, (Function1) J2, sVar);
        }
        f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new u0(this, obj, function2, i13, 0);
        }
    }

    @Override // r2.k
    public final r2.l f(Function0 function0, String str) {
        return this.f17310a.f(function0, str);
    }
}
