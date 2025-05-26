package gg0;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.y2;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.imageview.GlideWebImageView;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import nt.c2;
import qa2.s1;

/* loaded from: classes5.dex */
public final class f0 extends s1 {

    /* renamed from: d, reason: collision with root package name */
    public final List f64930d;

    /* renamed from: e, reason: collision with root package name */
    public final i0 f64931e;

    public f0(List items, i0 selectionListener) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(selectionListener, "selectionListener");
        this.f64930d = items;
        this.f64931e = selectionListener;
    }

    @Override // androidx.recyclerview.widget.b2
    public final int e() {
        return this.f64930d.size();
    }

    @Override // androidx.recyclerview.widget.b2
    public final void r(y2 y2Var, int i13) {
        Unit unit;
        Unit unit2;
        Unit unit3;
        rg0.l lVar;
        rg0.k kVar;
        rg0.k kVar2;
        rg0.i iVar;
        rg0.i iVar2;
        e0 holder = (e0) y2Var;
        Intrinsics.checkNotNullParameter(holder, "holder");
        rg0.j item = (rg0.j) this.f64930d.get(i13);
        Intrinsics.checkNotNullParameter(item, "item");
        c2 c2Var = new c2(holder, 12);
        GlideWebImageView glideWebImageView = holder.f64923v;
        glideWebImageView.post(c2Var);
        String str = item.f108034d;
        glideWebImageView.f52565q = str != null ? kotlin.text.z.h(str, ".gif", true) : false;
        glideWebImageView.loadUrl(item.f108034d);
        GestaltText titleTextView = holder.f64924w;
        Intrinsics.checkNotNullExpressionValue(titleTextView, "titleTextView");
        e0.r0(titleTextView, item.f108031a);
        GestaltText subtitleTextView = holder.f64925x;
        Intrinsics.checkNotNullExpressionValue(subtitleTextView, "subtitleTextView");
        e0.r0(subtitleTextView, item.f108032b);
        View infoItem1 = holder.f64926y;
        Unit unit4 = null;
        List list = item.f108036f;
        if (list == null || (iVar2 = (rg0.i) CollectionsKt.firstOrNull(list)) == null) {
            unit = null;
        } else {
            Intrinsics.checkNotNullExpressionValue(infoItem1, "infoItem1");
            e0.k0(iVar2, infoItem1);
            unit = Unit.f80348a;
        }
        if (unit == null) {
            bs1.c.X0(infoItem1);
        }
        View infoItem2 = holder.f64927z;
        if (list == null || (iVar = (rg0.i) CollectionsKt.U(1, list)) == null) {
            unit2 = null;
        } else {
            Intrinsics.checkNotNullExpressionValue(infoItem2, "infoItem2");
            e0.k0(iVar, infoItem2);
            unit2 = Unit.f80348a;
        }
        if (unit2 == null) {
            bs1.c.X0(infoItem2);
        }
        c0 c0Var = new c0(holder);
        View selection1 = holder.A;
        List list2 = item.f108037g;
        if (list2 == null || (kVar2 = (rg0.k) CollectionsKt.firstOrNull(list2)) == null) {
            unit3 = null;
        } else {
            Intrinsics.checkNotNullExpressionValue(selection1, "selection1");
            holder.o0(kVar2, selection1, c0Var);
            unit3 = Unit.f80348a;
        }
        if (unit3 == null) {
            bs1.c.X0(selection1);
        }
        View selection2 = holder.B;
        if (list2 != null && (kVar = (rg0.k) CollectionsKt.U(1, list2)) != null) {
            Intrinsics.checkNotNullExpressionValue(selection2, "selection2");
            holder.o0(kVar, selection2, c0Var);
            unit4 = Unit.f80348a;
        }
        if (unit4 == null) {
            bs1.c.X0(selection2);
        }
        GestaltText additionalText = holder.C;
        List list3 = item.f108033c;
        if (list3 != null && (lVar = (rg0.l) CollectionsKt.firstOrNull(list3)) != null) {
            Intrinsics.checkNotNullExpressionValue(additionalText, "additionalText");
            e0.r0(additionalText, lVar);
            return;
        }
        View view = holder.f19717a;
        Resources resources = view.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        view.setPaddingRelative(0, 0, 0, pk.a0.K(16, resources));
        Intrinsics.checkNotNullExpressionValue(additionalText, "additionalText");
        Intrinsics.checkNotNullParameter(additionalText, "<this>");
        additionalText.i(rn1.j.f108883j);
    }

    @Override // androidx.recyclerview.widget.b2
    public final y2 t(RecyclerView parent, int i13) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View inflate = LayoutInflater.from(parent.getContext()).inflate(jg0.d.item_eu_prompt, (ViewGroup) parent, false);
        Intrinsics.f(inflate);
        return new e0(inflate, this.f64931e);
    }
}
