package br1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.b2;
import androidx.recyclerview.widget.y2;
import java.util.List;
import kotlin.collections.q0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class e extends b2 {

    /* renamed from: d, reason: collision with root package name */
    public List f23777d = q0.f80391a;

    /* renamed from: e, reason: collision with root package name */
    public Function1 f23778e;

    @Override // androidx.recyclerview.widget.b2
    public final int e() {
        return this.f23777d.size();
    }

    @Override // androidx.recyclerview.widget.b2
    public final void r(y2 y2Var, int i13) {
        i holder = (i) y2Var;
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.o0((String) this.f23777d.get(i13));
        if (i13 == 0) {
            holder.k0();
        }
    }

    @Override // androidx.recyclerview.widget.b2
    public final y2 t(RecyclerView parent, int i13) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        View inflate = LayoutInflater.from(bs1.c.k0(context)).inflate(vq1.c.view_simple_search_token, (ViewGroup) parent, false);
        Intrinsics.f(inflate);
        return new i(inflate, this.f23778e);
    }
}
