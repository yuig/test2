package h60;

import android.app.Application;
import android.content.Context;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.u;
import androidx.recyclerview.widget.PinterestLinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ao2.j0;
import ba.q;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.jvm.internal.Intrinsics;
import m60.w;
import o82.b3;
import o82.c3;
import so.l2;
import so.oa;
import so.r8;
import so.s8;
import yk1.n;

/* loaded from: classes5.dex */
public final class k extends ConstraintLayout implements n {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f67810e = 0;

    /* renamed from: a, reason: collision with root package name */
    public final GestaltText f67811a;

    /* renamed from: b, reason: collision with root package name */
    public final GestaltText f67812b;

    /* renamed from: c, reason: collision with root package name */
    public final b3 f67813c;

    /* renamed from: d, reason: collision with root package name */
    public final c3 f67814d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(Context context, final u scope, final String str, final l2 pinClusterViewModelFactory) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(pinClusterViewModelFactory, "pinClusterViewModelFactory");
        c3 c3Var = new c3();
        this.f67814d = c3Var;
        View.inflate(context, f60.e.pin_cluster_carousel_layout, this);
        View findViewById = findViewById(f60.d.pin_cluster_carousel_title);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f67811a = (GestaltText) findViewById;
        View findViewById2 = findViewById(f60.d.pin_cluster_carousel_subtitle);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f67812b = (GestaltText) findViewById2;
        View findViewById3 = findViewById(f60.d.pin_cluster_carousel_recycler_view);
        RecyclerView recyclerView = (RecyclerView) findViewById3;
        recyclerView.R2(new PinterestLinearLayoutManager(new cr.d(6), 0, false));
        recyclerView.m(new eb2.n(dl2.b.G0(recyclerView, eo1.a.item_horizontal_spacing)));
        Context applicationContext = context.getApplicationContext();
        Intrinsics.g(applicationContext, "null cannot be cast to non-null type android.app.Application");
        b3 b3Var = new b3(scope, c3Var, null, (Application) applicationContext, 20);
        b3Var.I(2770201, new q(context, 15), i.f67807a, new o82.q() { // from class: h60.h
            @Override // o82.q
            public final wt1.d b(j0 it) {
                l2 pinClusterViewModelFactory2 = l2.this;
                Intrinsics.checkNotNullParameter(pinClusterViewModelFactory2, "$pinClusterViewModelFactory");
                j0 scope2 = scope;
                Intrinsics.checkNotNullParameter(scope2, "$scope");
                Intrinsics.checkNotNullParameter(it, "it");
                r8 r8Var = pinClusterViewModelFactory2.f113530a;
                Application h10 = com.pinterest.widget.configuration.k.h(r8Var.f114090a.f113603b);
                s8 s8Var = r8Var.f114091b;
                return new g60.j(scope2, str, h10, new nu.a((w) s8Var.f114255d.f113885r0.get(), 1), new i60.a(oa.L1(s8Var.f114255d), 0));
            }
        });
        this.f67813c = b3Var;
        recyclerView.H2(b3Var);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "apply(...)");
    }
}
