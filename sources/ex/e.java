package ex;

import a.sc;
import android.app.Application;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.PinterestGridLayoutManager;
import androidx.recyclerview.widget.PinterestLinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ao2.j0;
import ba.q;
import com.pinterest.adsStlUiLibrary.ui.categories.item.AdsStlCategoryFlashlightView;
import com.pinterest.adsStlUiLibrary.ui.categories.item.AdsStlCategoryView;
import com.pinterest.api.model.h2;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.f0;
import kotlin.collections.g0;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import o82.b3;
import o82.c3;
import o82.u0;
import o82.y0;
import u50.o;

/* loaded from: classes3.dex */
public final class e extends FrameLayout {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f60367h = 0;

    /* renamed from: a, reason: collision with root package name */
    public final f f60368a;

    /* renamed from: b, reason: collision with root package name */
    public final RecyclerView f60369b;

    /* renamed from: c, reason: collision with root package name */
    public final b3 f60370c;

    /* renamed from: d, reason: collision with root package name */
    public final c3 f60371d;

    /* renamed from: e, reason: collision with root package name */
    public List f60372e;

    /* renamed from: f, reason: collision with root package name */
    public List f60373f;

    /* renamed from: g, reason: collision with root package name */
    public int f60374g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Context context, j0 scope, boolean z13, f fVar, int i13) {
        super(context, null, 0);
        final int i14 = 0;
        boolean z14 = (i13 & 16) != 0 ? false : z13;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f60368a = fVar;
        c3 c3Var = new c3();
        this.f60371d = c3Var;
        q0 q0Var = q0.f80391a;
        this.f60372e = q0Var;
        this.f60373f = q0Var;
        this.f60374g = -1;
        View findViewById = View.inflate(context, bx.d.view_category_stl, this).findViewById(bx.c.list_stl_recycler_view_categories);
        RecyclerView recyclerView = (RecyclerView) findViewById;
        recyclerView.R2(z14 ? new PinterestGridLayoutManager(new cr.d(4), 2) : new PinterestLinearLayoutManager(new cr.d(5), 0, false));
        if (!z14) {
            recyclerView.setPaddingRelative(bs1.c.W(recyclerView, eo1.c.space_100), 0, 0, 0);
        }
        Context applicationContext = context.getApplicationContext();
        Intrinsics.g(applicationContext, "null cannot be cast to non-null type android.app.Application");
        b3 b3Var = new b3(scope, c3Var, null, (Application) applicationContext, 20);
        b3.G(b3Var, 1, new q(context, 13), new fx.c((h2) null, 3), new o82.c(this) { // from class: ex.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f60359b;

            {
                this.f60359b = this;
            }

            @Override // o82.c
            public final void e(View view, o oVar) {
                final int i15 = 1;
                int i16 = i14;
                final int i17 = 0;
                final e this$0 = this.f60359b;
                switch (i16) {
                    case 0:
                        AdsStlCategoryView view2 = (AdsStlCategoryView) view;
                        final fx.f displayState = (fx.f) oVar;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(view2, "view");
                        Intrinsics.checkNotNullParameter(displayState, "displayState");
                        gm1.a eventHandler = new gm1.a() { // from class: ex.b
                            @Override // gm1.a
                            public final void h3(gm1.c it) {
                                f fVar2;
                                int i18 = i17;
                                fx.f displayState2 = displayState;
                                e this$02 = this$0;
                                switch (i18) {
                                    case 0:
                                        Intrinsics.checkNotNullParameter(this$02, "this$0");
                                        Intrinsics.checkNotNullParameter(displayState2, "$displayState");
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        h2 h2Var = (h2) CollectionsKt.U(displayState2.f63084h, this$02.f60373f);
                                        if (h2Var != null && (fVar2 = this$02.f60368a) != null) {
                                            fVar2.p(h2Var);
                                            break;
                                        }
                                        break;
                                    default:
                                        Intrinsics.checkNotNullParameter(this$02, "this$0");
                                        Intrinsics.checkNotNullParameter(displayState2, "$displayState");
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        this$02.b(displayState2.f63084h, true);
                                        break;
                                }
                            }
                        };
                        view2.getClass();
                        Intrinsics.checkNotNullParameter(eventHandler, "eventHandler");
                        fx.d dVar = new fx.d(view2, 1);
                        com.google.firebase.messaging.q qVar = view2.f35480a;
                        c nextState = new c(displayState, 0);
                        Intrinsics.checkNotNullParameter(nextState, "nextState");
                        break;
                    default:
                        AdsStlCategoryFlashlightView view3 = (AdsStlCategoryFlashlightView) view;
                        final fx.f displayState2 = (fx.f) oVar;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(view3, "view");
                        Intrinsics.checkNotNullParameter(displayState2, "displayState");
                        gm1.a eventHandler2 = new gm1.a() { // from class: ex.b
                            @Override // gm1.a
                            public final void h3(gm1.c it) {
                                f fVar2;
                                int i18 = i15;
                                fx.f displayState22 = displayState2;
                                e this$02 = this$0;
                                switch (i18) {
                                    case 0:
                                        Intrinsics.checkNotNullParameter(this$02, "this$0");
                                        Intrinsics.checkNotNullParameter(displayState22, "$displayState");
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        h2 h2Var = (h2) CollectionsKt.U(displayState22.f63084h, this$02.f60373f);
                                        if (h2Var != null && (fVar2 = this$02.f60368a) != null) {
                                            fVar2.p(h2Var);
                                            break;
                                        }
                                        break;
                                    default:
                                        Intrinsics.checkNotNullParameter(this$02, "this$0");
                                        Intrinsics.checkNotNullParameter(displayState22, "$displayState");
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        this$02.b(displayState22.f63084h, true);
                                        break;
                                }
                            }
                        };
                        view3.getClass();
                        Intrinsics.checkNotNullParameter(eventHandler2, "eventHandler");
                        fx.a aVar = new fx.a(view3, 1);
                        com.google.firebase.messaging.q qVar2 = view3.f35478a;
                        c nextState2 = new c(displayState2, 1);
                        Intrinsics.checkNotNullParameter(nextState2, "nextState");
                        break;
                }
            }
        }, new sc(22), null, 96);
        final int i15 = 1;
        b3.G(b3Var, 2, new q(context, 14), new fx.c((h2) null, 3), new o82.c(this) { // from class: ex.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f60359b;

            {
                this.f60359b = this;
            }

            @Override // o82.c
            public final void e(View view, o oVar) {
                final int i152 = 1;
                int i16 = i15;
                final int i17 = 0;
                final e this$0 = this.f60359b;
                switch (i16) {
                    case 0:
                        AdsStlCategoryView view2 = (AdsStlCategoryView) view;
                        final fx.f displayState = (fx.f) oVar;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(view2, "view");
                        Intrinsics.checkNotNullParameter(displayState, "displayState");
                        gm1.a eventHandler = new gm1.a() { // from class: ex.b
                            @Override // gm1.a
                            public final void h3(gm1.c it) {
                                f fVar2;
                                int i18 = i17;
                                fx.f displayState22 = displayState;
                                e this$02 = this$0;
                                switch (i18) {
                                    case 0:
                                        Intrinsics.checkNotNullParameter(this$02, "this$0");
                                        Intrinsics.checkNotNullParameter(displayState22, "$displayState");
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        h2 h2Var = (h2) CollectionsKt.U(displayState22.f63084h, this$02.f60373f);
                                        if (h2Var != null && (fVar2 = this$02.f60368a) != null) {
                                            fVar2.p(h2Var);
                                            break;
                                        }
                                        break;
                                    default:
                                        Intrinsics.checkNotNullParameter(this$02, "this$0");
                                        Intrinsics.checkNotNullParameter(displayState22, "$displayState");
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        this$02.b(displayState22.f63084h, true);
                                        break;
                                }
                            }
                        };
                        view2.getClass();
                        Intrinsics.checkNotNullParameter(eventHandler, "eventHandler");
                        fx.d dVar = new fx.d(view2, 1);
                        com.google.firebase.messaging.q qVar = view2.f35480a;
                        c nextState = new c(displayState, 0);
                        Intrinsics.checkNotNullParameter(nextState, "nextState");
                        break;
                    default:
                        AdsStlCategoryFlashlightView view3 = (AdsStlCategoryFlashlightView) view;
                        final fx.f displayState2 = (fx.f) oVar;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(view3, "view");
                        Intrinsics.checkNotNullParameter(displayState2, "displayState");
                        gm1.a eventHandler2 = new gm1.a() { // from class: ex.b
                            @Override // gm1.a
                            public final void h3(gm1.c it) {
                                f fVar2;
                                int i18 = i152;
                                fx.f displayState22 = displayState2;
                                e this$02 = this$0;
                                switch (i18) {
                                    case 0:
                                        Intrinsics.checkNotNullParameter(this$02, "this$0");
                                        Intrinsics.checkNotNullParameter(displayState22, "$displayState");
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        h2 h2Var = (h2) CollectionsKt.U(displayState22.f63084h, this$02.f60373f);
                                        if (h2Var != null && (fVar2 = this$02.f60368a) != null) {
                                            fVar2.p(h2Var);
                                            break;
                                        }
                                        break;
                                    default:
                                        Intrinsics.checkNotNullParameter(this$02, "this$0");
                                        Intrinsics.checkNotNullParameter(displayState22, "$displayState");
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        this$02.b(displayState22.f63084h, true);
                                        break;
                                }
                            }
                        };
                        view3.getClass();
                        Intrinsics.checkNotNullParameter(eventHandler2, "eventHandler");
                        fx.a aVar = new fx.a(view3, 1);
                        com.google.firebase.messaging.q qVar2 = view3.f35478a;
                        c nextState2 = new c(displayState2, 1);
                        Intrinsics.checkNotNullParameter(nextState2, "nextState");
                        break;
                }
            }
        }, new sc(23), null, 96);
        this.f60370c = b3Var;
        recyclerView.H2(b3Var);
        int dimensionPixelSize = recyclerView.getResources().getDimensionPixelSize(eo1.c.margin_quarter);
        recyclerView.m(new eb2.d(new d(dimensionPixelSize, 0), new d(dimensionPixelSize, 1), new d(dimensionPixelSize, 2), new d(dimensionPixelSize, 3)));
        Intrinsics.checkNotNullExpressionValue(findViewById, "apply(...)");
        this.f60369b = recyclerView;
    }

    public final void a(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f60373f = items;
        List<h2> list = items;
        ArrayList arrayList = new ArrayList(g0.q(list, 10));
        for (h2 h2Var : list) {
            arrayList.add(new u0(new fx.c(h2Var, 2), 2, String.valueOf(h2Var.m())));
        }
        this.f60372e = arrayList;
        this.f60371d.A(new y0(arrayList, null, false, 6)).b(this.f60370c);
    }

    public final void b(int i13, boolean z13) {
        h2 h2Var;
        f fVar;
        if (i13 == -1) {
            return;
        }
        if (this.f60374g != i13) {
            List list = this.f60372e;
            ArrayList arrayList = new ArrayList(g0.q(list, 10));
            int i14 = 0;
            for (Object obj : list) {
                int i15 = i14 + 1;
                if (i14 < 0) {
                    f0.p();
                    throw null;
                }
                u0 u0Var = (u0) obj;
                arrayList.add(u0.a(u0Var, new fx.c(((fx.c) u0Var.f93721a).f63071a, i14 == i13)));
                i14 = i15;
            }
            this.f60372e = arrayList;
            this.f60371d.A(new y0(arrayList, null, false, 6)).b(this.f60370c);
            this.f60374g = i13;
        }
        if (z13 && (h2Var = (h2) CollectionsKt.U(i13, this.f60373f)) != null && (fVar = this.f60368a) != null) {
            fVar.p(h2Var);
        }
        this.f60369b.d3(i13);
    }

    public final void c(int i13) {
        if (i13 == -1) {
            return;
        }
        b(i13, false);
    }
}
