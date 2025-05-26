package y90;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.y2;
import com.pinterest.collage.effects.components.EffectToolView;
import com.pinterest.gestalt.iconcomponent.GestaltIcon;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class p1 extends androidx.recyclerview.widget.f1 {

    /* renamed from: e, reason: collision with root package name */
    public final Function1 f138216e;

    /* renamed from: f, reason: collision with root package name */
    public final n72.m f138217f;

    /* renamed from: g, reason: collision with root package name */
    public o1 f138218g;

    /* renamed from: h, reason: collision with root package name */
    public r72.z1 f138219h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(y adapterFactory, n72.m shuffleCoreLogger) {
        super(f1.f138174c);
        Intrinsics.checkNotNullParameter(adapterFactory, "adapterFactory");
        Intrinsics.checkNotNullParameter(shuffleCoreLogger, "shuffleCoreLogger");
        this.f138216e = adapterFactory;
        this.f138217f = shuffleCoreLogger;
        this.f138218g = new vt1.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.b2
    public final int g(int i13) {
        r72.j0 j0Var = ((m62.i) C(i13)).f86011a;
        return (((j0Var instanceof r72.i) || (j0Var instanceof r72.e) || (j0Var instanceof r72.r)) ? 1 : j0Var instanceof r72.z) ^ 1;
    }

    @Override // androidx.recyclerview.widget.b2
    public final void r(y2 holder, int i13) {
        Unit unit;
        Intrinsics.checkNotNullParameter(holder, "holder");
        int g13 = g(i13);
        if (g13 == 0) {
            l1 l1Var = (l1) holder;
            Object C = C(i13);
            Intrinsics.checkNotNullExpressionValue(C, "getItem(...)");
            m62.i item = (m62.i) C;
            Intrinsics.checkNotNullParameter(item, "item");
            l1Var.f138201v = item;
            l1Var.f138200u.o(new z90.g(rm1.q.REPORT, rm1.c.SUBTLE, bs1.c.h2(item.f86012b.f78420a), item.f86013c, false, 16));
            return;
        }
        if (g13 != 1) {
            return;
        }
        n1 n1Var = (n1) holder;
        Object C2 = C(i13);
        Intrinsics.checkNotNullExpressionValue(C2, "getItem(...)");
        m62.i item2 = (m62.i) C2;
        Intrinsics.checkNotNullParameter(item2, "item");
        n1Var.B = item2;
        r72.z1 z1Var = n1Var.C.f138219h;
        com.pinterest.shuffles.scene.composer.x0 x0Var = n1Var.A;
        if (z1Var != null) {
            r72.i0 i0Var = r72.z.f106727b;
            r72.g gVar = r72.e.f106461b;
            r72.n nVar = r72.i.f106496b;
            r72.s sVar = r72.r.f106630b;
            r72.j0 j0Var = item2.f86011a;
            if (j0Var instanceof r72.g) {
                gVar = (r72.g) j0Var;
            } else if (j0Var instanceof r72.i0) {
                i0Var = (r72.i0) j0Var;
            } else if (j0Var instanceof r72.n) {
                nVar = (r72.n) j0Var;
            } else if (j0Var instanceof r72.s) {
                sVar = (r72.s) j0Var;
            }
            x0Var.i(kh2.w.v(z1Var, null, null, 0.0d, 0.0d, r72.k0.a(z1Var.a(), false, false, false, false, 0.0f, gVar, i0Var, nVar, sVar, 0.0d, 0.0d, null, 15903), 15));
            unit = Unit.f80348a;
        } else {
            unit = null;
        }
        if (unit == null) {
            x0Var.i(null);
        }
        n1Var.f138210x.setText(item2.f86012b.f78420a);
        boolean z13 = item2.f86013c;
        int i14 = z13 ? n1Var.f138207u : n1Var.f138208v;
        Context context = n1Var.f19717a.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        n1Var.f138209w.k(bs1.c.A(context, i14));
        GestaltIcon settingsOverlayIcon = n1Var.f138212z;
        View view = n1Var.f138211y;
        if (z13 && (!item2.f86012b.f78422c.isEmpty())) {
            bs1.c.U1(view);
            Intrinsics.checkNotNullExpressionValue(settingsOverlayIcon, "settingsOverlayIcon");
            kg.t.e1(settingsOverlayIcon);
        } else {
            bs1.c.X0(view);
            Intrinsics.checkNotNullExpressionValue(settingsOverlayIcon, "settingsOverlayIcon");
            kg.t.O(settingsOverlayIcon);
        }
    }

    @Override // androidx.recyclerview.widget.b2
    public final y2 t(RecyclerView parent, int i13) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (i13 != 0) {
            return new n1(this, LayoutInflater.from(parent.getContext()).inflate(y1.collage_effects_item_effect, (ViewGroup) parent, false));
        }
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        EffectToolView effectToolView = new EffectToolView(6, context, (AttributeSet) null);
        effectToolView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        return new l1(this, effectToolView);
    }

    @Override // androidx.recyclerview.widget.b2
    public final void y(y2 holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (holder.f19722f == 1) {
            ((n1) holder).A.i(null);
        }
    }
}
