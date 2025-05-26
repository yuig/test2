package xh0;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.b2;
import androidx.recyclerview.widget.y2;
import com.pinterest.gestalt.checkbox.GestaltCheckBox;
import java.util.List;
import k1.q;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import rq.t0;

/* loaded from: classes5.dex */
public final class d extends b2 {

    /* renamed from: d, reason: collision with root package name */
    public final b f134965d;

    /* renamed from: e, reason: collision with root package name */
    public List f134966e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f134967f;

    /* renamed from: g, reason: collision with root package name */
    public final Function1 f134968g;

    public d(b answerViewHolder, List answers, boolean z13, Function1 onChange) {
        Intrinsics.checkNotNullParameter(answerViewHolder, "answerViewHolder");
        Intrinsics.checkNotNullParameter(answers, "answers");
        Intrinsics.checkNotNullParameter(onChange, "onChange");
        this.f134965d = answerViewHolder;
        this.f134966e = answers;
        this.f134967f = z13;
        this.f134968g = onChange;
    }

    @Override // androidx.recyclerview.widget.b2
    public final int e() {
        return this.f134966e.size();
    }

    @Override // androidx.recyclerview.widget.b2
    public final void r(y2 y2Var, int i13) {
        b holder = (b) y2Var;
        Intrinsics.checkNotNullParameter(holder, "holder");
        sh0.b bVar = (sh0.b) this.f134966e.get(i13);
        if (bVar.f112921d != holder.f134961u) {
            holder.a();
        }
        holder.k0(bVar);
        holder.f134961u = bVar.f112921d;
        q qVar = new q(this, holder, bVar, 19);
        View view = holder.f19717a;
        if (!(view instanceof GestaltCheckBox)) {
            view.setOnClickListener(new t0(10, qVar));
        } else {
            Intrinsics.g(view, "null cannot be cast to non-null type com.pinterest.gestalt.checkbox.GestaltCheckBox");
            ((GestaltCheckBox) view).T(new defpackage.a(6, qVar));
        }
    }

    @Override // androidx.recyclerview.widget.b2
    public final y2 t(RecyclerView parent, int i13) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return this.f134965d.o0();
    }
}
