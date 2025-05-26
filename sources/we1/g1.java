package we1;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.pinterest.api.model.xi;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import lh0.f4;
import so.jb;
import so.oa;
import so.s8;

/* loaded from: classes5.dex */
public final class g1 extends LinearLayout implements re1.o, ky.h, af2.c {

    /* renamed from: a, reason: collision with root package name */
    public ye2.o f129355a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f129356b;

    /* renamed from: c, reason: collision with root package name */
    public final ao2.j0 f129357c;

    /* renamed from: d, reason: collision with root package name */
    public u2 f129358d;

    /* renamed from: e, reason: collision with root package name */
    public final m60.w f129359e;

    /* renamed from: f, reason: collision with root package name */
    public final b60.b f129360f;

    /* renamed from: g, reason: collision with root package name */
    public final gi2.b f129361g;

    /* renamed from: h, reason: collision with root package name */
    public final pb0.d f129362h;

    /* renamed from: i, reason: collision with root package name */
    public final g70.h f129363i;

    /* renamed from: j, reason: collision with root package name */
    public final f4 f129364j;

    /* renamed from: k, reason: collision with root package name */
    public final int f129365k;

    /* renamed from: l, reason: collision with root package name */
    public String f129366l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(Context context, ao2.j0 scope) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(scope, "scope");
        if (!this.f129356b) {
            this.f129356b = true;
            jb jbVar = (jb) ((j1) generatedComponent());
            oa oaVar = jbVar.f113483a;
            this.f129359e = (m60.w) oaVar.f113885r0.get();
            this.f129360f = (b60.b) oaVar.f113850p0.get();
            this.f129361g = new gi2.b();
            this.f129362h = oaVar.j2();
            s8 s8Var = jbVar.f113485c;
            this.f129363i = s8Var.e5();
            this.f129364j = s8Var.J6();
        }
        this.f129357c = scope;
        this.f129365k = dl2.b.F0(context, eo1.a.item_horizontal_spacing_half);
        setOrientation(1);
        setVisibility(8);
        bs1.c.X0(this);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
    }

    @Override // re1.c
    public final List C() {
        u2 u2Var = this.f129358d;
        if (u2Var == null) {
            return null;
        }
        IntRange q13 = ql2.s.q(0, u2Var.getChildCount());
        ArrayList arrayList = new ArrayList();
        ql2.k it = q13.iterator();
        while (it.f104109c) {
            View childAt = u2Var.getChildAt(it.b());
            if (childAt != null) {
                arrayList.add(childAt);
            }
        }
        return CollectionsKt.F0(arrayList);
    }

    @Override // af2.c
    public final af2.b componentManager() {
        if (this.f129355a == null) {
            this.f129355a = new ye2.o(this);
        }
        return this.f129355a;
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f129355a == null) {
            this.f129355a = new ye2.o(this);
        }
        return this.f129355a.generatedComponent();
    }

    @Override // re1.o
    public final void m(re1.n gridSectionModel) {
        Intrinsics.checkNotNullParameter(gridSectionModel, "gridSectionModel");
        u2 u2Var = this.f129358d;
        String str = gridSectionModel.f107614a;
        if (u2Var == null || !Intrinsics.d(this.f129366l, str)) {
            this.f129366l = str;
            u2 u2Var2 = this.f129358d;
            if (u2Var2 != null) {
                u2Var2.removeAllViews();
                this.f129358d = null;
                removeAllViews();
            }
            ue1.l lVar = gridSectionModel.f107616c;
            ze0.a aVar = lVar.f122027b;
            xi xiVar = gridSectionModel.f107615b;
            Boolean centerContent = xiVar.getCenterContent();
            Float itemWidthHeightRatio = xiVar.getItemWidthHeightRatio();
            v2 v2Var = new v2(this.f129365k, aVar, lVar.f122029d, gridSectionModel.f107617d, lVar.f122031f, lVar.f122032g, gridSectionModel.f107620g, gridSectionModel.f107621h, centerContent, itemWidthHeightRatio, gridSectionModel.f107622i);
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            b60.b bVar = this.f129360f;
            if (bVar == null) {
                Intrinsics.r("activeUserManager");
                throw null;
            }
            m60.w wVar = this.f129359e;
            if (wVar == null) {
                Intrinsics.r("eventManager");
                throw null;
            }
            gi2.b bVar2 = this.f129361g;
            if (bVar2 == null) {
                Intrinsics.r("boardRepItemViewBinderProvider");
                throw null;
            }
            pb0.d dVar = this.f129362h;
            if (dVar == null) {
                Intrinsics.r("fuzzyDateFormatter");
                throw null;
            }
            g70.h hVar = this.f129363i;
            if (hVar == null) {
                Intrinsics.r("boardNavigator");
                throw null;
            }
            f4 f4Var = this.f129364j;
            if (f4Var == null) {
                Intrinsics.r("experiments");
                throw null;
            }
            u2 u2Var3 = new u2(context, this.f129357c, lVar.f122028c, bVar, wVar, v2Var, bVar2, dVar, hVar, f4Var);
            u2Var3.a(lVar.f122026a);
            addView(u2Var3);
            this.f129358d = u2Var3;
            setVisibility(0);
        }
    }

    @Override // ky.h
    public final ky.g z() {
        return ky.g.OTHER;
    }
}
