package y90;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.y2;
import com.pinterest.collagesCoreLibrary.components.ColorPickerCellView;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d1 extends androidx.recyclerview.widget.f1 {

    /* renamed from: e, reason: collision with root package name */
    public x f138167e;

    public d1() {
        super(f1.f138172a);
    }

    public static final ColorPickerCellView E(RecyclerView recyclerView) {
        Context context = recyclerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ColorPickerCellView colorPickerCellView = new ColorPickerCellView(6, context, (AttributeSet) null);
        colorPickerCellView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        return colorPickerCellView;
    }

    public final void F(x xVar) {
        this.f138167e = xVar;
    }

    @Override // androidx.recyclerview.widget.b2
    public final int g(int i13) {
        m62.e eVar = (m62.e) C(i13);
        if (eVar instanceof m62.b) {
            return 2;
        }
        if (eVar instanceof m62.a) {
            return 1;
        }
        if (eVar instanceof m62.c) {
            return 4;
        }
        if (eVar instanceof m62.d) {
            return 3;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // androidx.recyclerview.widget.b2
    public final void r(y2 holder, int i13) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (holder instanceof c1) {
            Object C = C(i13);
            Intrinsics.g(C, "null cannot be cast to non-null type com.pinterest.shuffles.composer.ui.effects.ColorItemModel.EyeDropperItem");
            a.c.t(C);
            throw null;
        }
        if (holder instanceof b1) {
            b1 b1Var = (b1) holder;
            Object C2 = C(i13);
            Intrinsics.g(C2, "null cannot be cast to non-null type com.pinterest.shuffles.composer.ui.effects.ColorItemModel.ColorItem");
            m62.a item = (m62.a) C2;
            Intrinsics.checkNotNullParameter(item, "item");
            b1Var.f138133v = item;
            ra0.z zVar = new ra0.z(new ra0.e0(androidx.compose.ui.graphics.a.c(Color.parseColor(item.f85951a))));
            ColorPickerCellView colorPickerCellView = b1Var.f138132u;
            colorPickerCellView.o(zVar);
            colorPickerCellView.f44672i.setValue(Boolean.valueOf(item.f85952b));
        }
    }

    @Override // androidx.recyclerview.widget.b2
    public final y2 t(RecyclerView parent, int i13) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        LayoutInflater from = LayoutInflater.from(parent.getContext());
        if (i13 == 0) {
            return new c1(this, from.inflate(y1.collage_effects_item_eye_dropper, (ViewGroup) parent, false));
        }
        if (i13 == 1) {
            return new b1(this, E(parent));
        }
        if (i13 == 2) {
            return new xo0.s(this, E(parent), 0);
        }
        if (i13 == 3) {
            return new xo0.s(this, E(parent), 2);
        }
        if (i13 == 4) {
            return new xo0.s(this, E(parent), 1);
        }
        throw new IllegalStateException(("Unsupported view type " + i13).toString());
    }
}
