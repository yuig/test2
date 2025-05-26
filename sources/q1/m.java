package q1;

import androidx.compose.foundation.lazy.layout.x0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import i2.f2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class m implements androidx.compose.foundation.lazy.layout.y {

    /* renamed from: a, reason: collision with root package name */
    public final h0 f101944a;

    /* renamed from: b, reason: collision with root package name */
    public final i f101945b;

    /* renamed from: c, reason: collision with root package name */
    public final d f101946c;

    /* renamed from: d, reason: collision with root package name */
    public final androidx.compose.foundation.lazy.layout.b0 f101947d;

    public m(h0 h0Var, i iVar, d dVar, x0 x0Var) {
        this.f101944a = h0Var;
        this.f101945b = iVar;
        this.f101946c = dVar;
        this.f101947d = x0Var;
    }

    @Override // androidx.compose.foundation.lazy.layout.y
    public final int a() {
        return this.f101945b.m().f17319b;
    }

    @Override // androidx.compose.foundation.lazy.layout.y
    public final int b(Object obj) {
        return this.f101947d.b(obj);
    }

    @Override // androidx.compose.foundation.lazy.layout.y
    public final Object c(int i13) {
        Object c13 = this.f101947d.c(i13);
        return c13 == null ? this.f101945b.n(i13) : c13;
    }

    @Override // androidx.compose.foundation.lazy.layout.y
    public final Object d(int i13) {
        return this.f101945b.k(i13);
    }

    @Override // androidx.compose.foundation.lazy.layout.y
    public final void e(int i13, Object obj, i2.o oVar, int i14) {
        int i15;
        i2.s sVar = (i2.s) oVar;
        sVar.Y(-462424778);
        if ((i14 & 6) == 0) {
            i15 = (sVar.f(i13) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= sVar.j(obj) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= sVar.h(this) ? RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER : RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        }
        if ((i15 & RecyclerViewTypes.VIEW_TYPE_SEARCH_PRODUCT_COLLAGE_STORY) == 146 && sVar.z()) {
            sVar.Q();
        } else {
            androidx.compose.foundation.lazy.layout.o.d(obj, i13, this.f101944a.f101924q, q2.i.c(-824725566, new k(this, i13), sVar), sVar, ((i15 >> 3) & 14) | 3072 | ((i15 << 3) & RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER));
        }
        f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new l(this, i13, obj, i14, 0);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        return Intrinsics.d(this.f101945b, ((m) obj).f101945b);
    }

    public final int hashCode() {
        return this.f101945b.hashCode();
    }
}
