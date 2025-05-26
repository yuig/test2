package b90;

import android.content.Context;
import android.graphics.Color;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.y2;
import bs1.c;
import c72.b0;
import c72.s;
import com.pinterest.api.model.pi0;
import com.pinterest.shuffles.scene.composer.y;
import java.util.ArrayList;
import java.util.List;
import k90.e;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import qa2.s1;
import r72.j;
import r72.l;

/* loaded from: classes5.dex */
public final class b extends s1 {

    /* renamed from: d, reason: collision with root package name */
    public final int f22233d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f22234e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f22235f;

    public /* synthetic */ b(int i13) {
        this(i13, false);
    }

    @Override // androidx.recyclerview.widget.b2
    public final int e() {
        return this.f22235f.size();
    }

    @Override // androidx.recyclerview.widget.b2
    public final void r(y2 y2Var, int i13) {
        s sVar;
        a holder = (a) y2Var;
        Intrinsics.checkNotNullParameter(holder, "holder");
        pi0 shuffleItem = (pi0) this.f22235f.get(i13);
        Intrinsics.checkNotNullParameter(shuffleItem, "shuffleItem");
        e eVar = holder.f22232u;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(shuffleItem, "shuffleItem");
        b0 b0Var = eVar.f78743e;
        if (b0Var == null) {
            Intrinsics.r("shufflesEntityMapper");
            throw null;
        }
        List b13 = e0.b(shuffleItem);
        if (eVar.f78741c) {
            float f13 = 1 - 0.05f;
            sVar = new s(true, true, 1.25d, new j(1.25f, Color.argb(Color.alpha(c.B(eVar, eo1.b.color_themed_background_default)), (int) (Color.red(r3) * f13), (int) (Color.green(r3) * f13), (int) (Color.blue(r3) * f13)), false));
        } else {
            sVar = new s(new l(0.3f, 2.5f, 0.5f, 0.5f, false));
        }
        y.r(eVar.f78747i, b0.h(b0Var, b13, sVar, false, 4));
    }

    @Override // androidx.recyclerview.widget.b2
    public final y2 t(RecyclerView parent, int i13) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        e eVar = new e(context, this.f22233d, this.f22234e);
        eVar.setLayoutParams(new RecyclerView.LayoutParams(-2, -2));
        return new a(eVar);
    }

    public b(int i13, boolean z13) {
        this.f22233d = i13;
        this.f22234e = z13;
        this.f22235f = new ArrayList();
    }
}
