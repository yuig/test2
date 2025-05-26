package p91;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.y2;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.text.GestaltText;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import q91.d1;
import qa2.s1;

/* loaded from: classes5.dex */
public final class o extends s1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f99313d;

    /* renamed from: e, reason: collision with root package name */
    public final List f99314e;

    /* renamed from: f, reason: collision with root package name */
    public final d1 f99315f;

    public o(ArrayList languageList, d1 mainFragment, int i13) {
        this.f99313d = i13;
        if (i13 != 1) {
            Intrinsics.checkNotNullParameter(languageList, "languageList");
            Intrinsics.checkNotNullParameter(mainFragment, "mainFragment");
            this.f99314e = languageList;
            this.f99315f = mainFragment;
            return;
        }
        Intrinsics.checkNotNullParameter(languageList, "languageList");
        Intrinsics.checkNotNullParameter(mainFragment, "mainFragment");
        this.f99314e = languageList;
        this.f99315f = mainFragment;
    }

    @Override // androidx.recyclerview.widget.b2
    public final int e() {
        int i13 = this.f99313d;
        List list = this.f99314e;
        switch (i13) {
        }
        return list.size();
    }

    @Override // androidx.recyclerview.widget.b2
    public final void r(y2 y2Var, int i13) {
        int i14 = this.f99313d;
        List list = this.f99314e;
        switch (i14) {
            case 0:
                m holder = (m) y2Var;
                Intrinsics.checkNotNullParameter(holder, "holder");
                String str = ((m91.n) list.get(i13)).f86742b;
                GestaltText gestaltText = holder.f99298v;
                pk.a0.p(gestaltText, str);
                boolean z13 = ((m91.n) list.get(i13)).f86743c;
                GestaltIconButton gestaltIconButton = holder.f99299w;
                if (z13) {
                    gestaltText.i(n.f99300j);
                    gestaltIconButton.t(n.f99301k);
                } else {
                    gestaltText.i(n.f99302l);
                    gestaltIconButton.t(n.f99303m);
                }
                holder.f99297u.setOnClickListener(new xo.u(this, holder, i13, 4));
                break;
            default:
                x holder2 = (x) y2Var;
                Intrinsics.checkNotNullParameter(holder2, "holder");
                String str2 = ((m91.n) list.get(i13)).f86742b;
                GestaltText gestaltText2 = holder2.f99342v;
                pk.a0.p(gestaltText2, str2);
                boolean z14 = ((m91.n) list.get(i13)).f86743c;
                GestaltIconButton gestaltIconButton2 = holder2.f99343w;
                if (z14) {
                    gestaltText2.i(n.f99308r);
                    gestaltIconButton2.t(n.f99309s);
                } else {
                    gestaltText2.i(n.f99310t);
                    gestaltIconButton2.t(n.f99311u);
                }
                holder2.f99341u.setOnClickListener(new androidx.media3.ui.k(this, i13, 5));
                break;
        }
    }

    @Override // androidx.recyclerview.widget.b2
    public final y2 t(RecyclerView parent, int i13) {
        switch (this.f99313d) {
            case 0:
                Intrinsics.checkNotNullParameter(parent, "parent");
                Context context = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                View inflate = LayoutInflater.from(bs1.c.k0(context)).inflate(h52.b.language_menu_item, (ViewGroup) parent, false);
                Intrinsics.f(inflate);
                return new m(inflate);
            default:
                Intrinsics.checkNotNullParameter(parent, "parent");
                Context context2 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                View inflate2 = LayoutInflater.from(bs1.c.k0(context2)).inflate(h52.b.language_menu_item, (ViewGroup) parent, false);
                Intrinsics.f(inflate2);
                return new x(inflate2);
        }
    }
}
