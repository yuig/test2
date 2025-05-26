package y90;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.y2;
import com.pinterest.collage.effects.components.EffectToolView;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import r72.g3;
import r72.m2;
import r72.n2;
import r72.o2;
import r72.p2;
import r72.q2;
import r72.r2;
import r72.v2;
import r72.w2;
import r72.x2;

/* loaded from: classes5.dex */
public final class c2 extends androidx.recyclerview.widget.f1 {

    /* renamed from: e, reason: collision with root package name */
    public a2 f138141e;

    public c2() {
        super(f1.f138176e);
        this.f138141e = new vt1.a();
    }

    public final void E(x xVar) {
        Intrinsics.checkNotNullParameter(xVar, "<set-?>");
        this.f138141e = xVar;
    }

    @Override // androidx.recyclerview.widget.b2
    public final void r(y2 y2Var, int i13) {
        rm1.q qVar;
        b2 holder = (b2) y2Var;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Object C = C(i13);
        Intrinsics.checkNotNullExpressionValue(C, "getItem(...)");
        m62.k1 item = (m62.k1) C;
        Intrinsics.checkNotNullParameter(item, "item");
        holder.f138135v = item;
        k62.g gVar = item.f86026a;
        g3 g3Var = gVar.f78436a;
        if (g3Var instanceof r2) {
            r2 r2Var = (r2) g3Var;
            if (r2Var instanceof q2) {
                qVar = rm1.q.SAVED;
            } else if (r2Var instanceof n2) {
                qVar = rm1.q.DUPLICATE;
            } else if (r2Var instanceof o2) {
                qVar = rm1.q.LOCK;
            } else if (r2Var instanceof p2) {
                qVar = rm1.q.SWAP;
            } else {
                if (!(r2Var instanceof m2)) {
                    throw new NoWhenBranchMatchedException();
                }
                qVar = rm1.q.TRASH_CAN;
            }
        } else {
            if (!(g3Var instanceof r72.y2)) {
                throw new IllegalStateException(("Unsupported tool type: " + g3Var).toString());
            }
            r72.y2 y2Var2 = (r72.y2) g3Var;
            if (y2Var2 instanceof w2) {
                qVar = rm1.q.TEXT_ALIGN_LEFT;
            } else if (y2Var2 instanceof v2) {
                qVar = rm1.q.TEXT_ALIGN_CENTER;
            } else {
                if (!(y2Var2 instanceof x2)) {
                    throw new NoWhenBranchMatchedException();
                }
                qVar = rm1.q.TEXT_ALIGN_RIGHT;
            }
        }
        holder.f138134u.o(new z90.g(qVar, null, bs1.c.j2(new String[0], gVar.f78437b), item.f86027b, item.f86028c, 2));
    }

    @Override // androidx.recyclerview.widget.b2
    public final y2 t(RecyclerView parent, int i13) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        EffectToolView effectToolView = new EffectToolView(6, context, (AttributeSet) null);
        effectToolView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        return new b2(this, effectToolView);
    }
}
