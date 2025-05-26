package yq0;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import so.jb;
import we1.c2;
import we1.d1;
import we1.d2;
import we1.f1;
import we1.g1;
import we1.q1;
import we1.w1;
import we1.y0;

/* loaded from: classes5.dex */
public final class h0 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f139703i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i0 f139704j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h0(i0 i0Var, int i13) {
        super(0);
        this.f139703i = i13;
        this.f139704j = i0Var;
    }

    public final View b() {
        int i13 = this.f139703i;
        i0 i0Var = this.f139704j;
        switch (i13) {
            case 0:
                Context context = i0Var.getContext();
                ao2.j0 scope = i0Var.getScope();
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(scope, "scope");
                ve1.a aVar = new ve1.a(context);
                if (!aVar.f125745b) {
                    aVar.f125745b = true;
                    aVar.f125746c = (ku1.l) ((jb) ((ve1.b) aVar.generatedComponent())).f113485c.f114476s.get();
                }
                w1 w1Var = new w1(context);
                w1Var.setVisibility(8);
                aVar.f125749f = w1Var;
                y0 y0Var = new y0(context);
                y0Var.setVisibility(8);
                aVar.f125750g = y0Var;
                g1 g1Var = new g1(context, scope);
                g1Var.setVisibility(8);
                aVar.f125751h = g1Var;
                f1 f1Var = new f1(context);
                f1Var.setVisibility(8);
                aVar.f125752i = f1Var;
                d1 d1Var = new d1(context);
                d1Var.setVisibility(8);
                aVar.f125753j = d1Var;
                c2 c2Var = new c2(context);
                c2Var.setVisibility(8);
                aVar.f125754k = c2Var;
                q1 q1Var = new q1(context);
                q1Var.setVisibility(8);
                aVar.f125755l = q1Var;
                aVar.setOrientation(1);
                aVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                aVar.setVisibility(8);
                aVar.addView(w1Var);
                aVar.addView(q1Var);
                aVar.addView(y0Var);
                aVar.addView(g1Var);
                aVar.addView(f1Var);
                aVar.addView(d1Var);
                aVar.addView(c2Var);
                return aVar;
            default:
                return new d2(i0Var.getContext(), i0Var.getScope());
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f139703i) {
        }
        return b();
    }
}
