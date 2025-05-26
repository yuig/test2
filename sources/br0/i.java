package br0;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.helper.widget.Flow;
import com.pinterest.feature.creationmenu.view.ActionButton;
import com.pinterest.feature.creationmenu.view.ActionButtonGrid;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.iconcomponent.GestaltIcon;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.shuffles.scene.composer.AnimatedTarget;
import ha2.a0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.f0;
import kotlin.collections.g0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import m60.t0;
import m60.w;
import m60.x0;
import nx.d0;
import rm1.q;
import rq.c2;
import ye2.o;

/* loaded from: classes5.dex */
public final class i extends LinearLayout implements af2.c {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f23752f = 0;

    /* renamed from: a, reason: collision with root package name */
    public o f23753a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f23754b;

    /* renamed from: c, reason: collision with root package name */
    public final d0 f23755c;

    /* renamed from: d, reason: collision with root package name */
    public final w f23756d;

    /* renamed from: e, reason: collision with root package name */
    public final String f23757e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Context context, d0 pinalytics, w eventManager, ha2.b bVar, String str) {
        super(context);
        c state;
        Iterator it;
        String str2;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        if (!this.f23754b) {
            this.f23754b = true;
            ((j) generatedComponent()).getClass();
        }
        this.f23755c = pinalytics;
        this.f23756d = eventManager;
        this.f23757e = str;
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        setOrientation(1);
        setPaddingRelative(getPaddingStart(), getPaddingTop(), getPaddingEnd(), bs1.c.W(this, eo1.c.space_1000));
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        com.bumptech.glide.c.a1(layoutParams, 0, 0, 0, bs1.c.W(linearLayout, eo1.c.lego_spacing_vertical_small));
        linearLayout.setLayoutParams(layoutParams);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        GestaltIconButton gestaltIconButton = new GestaltIconButton(6, context2, (AttributeSet) null);
        gestaltIconButton.t(b.f23733k);
        gestaltIconButton.v(new lj0.a(this, 21));
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        int W = bs1.c.W(gestaltIconButton, eo1.c.space_300);
        Intrinsics.checkNotNullParameter(layoutParams2, "<this>");
        com.bumptech.glide.c.a1(layoutParams2, W, W, W, W);
        gestaltIconButton.setLayoutParams(layoutParams2);
        linearLayout.addView(gestaltIconButton);
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        GestaltText gestaltText = new GestaltText(6, context3, (AttributeSet) null);
        gestaltText.i(new c2(gestaltText, 5));
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.gravity = 16;
        gestaltText.setLayoutParams(layoutParams3);
        gestaltText.setPaddingRelative(0, 0, (bs1.c.W(gestaltText, eo1.c.lego_spacing_horizontal_small) * 2) + bs1.c.W(gestaltText, eo1.c.lego_actionable_icon_size), 0);
        linearLayout.addView(gestaltText);
        addView(linearLayout);
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        f fVar = new f(context4, new h(this, 0), new h(this, 1), new h(this, 2), eventManager);
        Context context5 = fVar.getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
        ActionButtonGrid actionButtonGrid = new ActionButtonGrid(context5);
        if (bVar != null) {
            ArrayList arrayList = new ArrayList();
            for (ha2.c cVar : bVar.d()) {
                for (ha2.g gVar : cVar.d()) {
                    if (gVar instanceof a0) {
                        arrayList.add(new d(null, bs1.c.f2(fVar, gVar.a()), ((a0) gVar).f68408j, new e(cVar, gVar, 0), 9));
                    }
                }
            }
            Context context6 = fVar.getContext();
            Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
            Intrinsics.checkNotNullParameter(context6, "context");
            int V = bs1.c.V(context6, eo1.c.lego_spacing_horizontal_medium);
            Context context7 = fVar.getContext();
            Intrinsics.checkNotNullExpressionValue(context7, "getContext(...)");
            Intrinsics.checkNotNullParameter(context7, "context");
            state = new c(V, bs1.c.V(context7, eo1.c.lego_spacing_vertical_medium), arrayList);
        } else {
            List j13 = f0.j(new d(Integer.valueOf(t0.action_button_pin_creation), bs1.c.f2(fVar, x0.pin), q.PIN, fVar.f23746d, 8), new d(null, bs1.c.f2(fVar, x0.collage), q.COLLAGE, fVar.f23748f, 9), new d(null, bs1.c.f2(fVar, x0.board), q.BOARD, fVar.f23747e, 9));
            Context context8 = fVar.getContext();
            Intrinsics.checkNotNullExpressionValue(context8, "getContext(...)");
            Intrinsics.checkNotNullParameter(context8, "context");
            int V2 = bs1.c.V(context8, eo1.c.lego_spacing_horizontal_medium);
            Context context9 = fVar.getContext();
            Intrinsics.checkNotNullExpressionValue(context9, "getContext(...)");
            Intrinsics.checkNotNullParameter(context9, "context");
            state = new c(V2, bs1.c.V(context9, eo1.c.lego_spacing_vertical_medium), j13);
        }
        String str3 = AnimatedTarget.PROPERTY_STATE;
        Intrinsics.checkNotNullParameter(state, "state");
        int i13 = state.f23736b;
        Flow flow = actionButtonGrid.f45650a;
        flow.z(i13);
        flow.D(state.f23737c);
        flow.B(3);
        List list = state.f23735a;
        ArrayList arrayList2 = new ArrayList(g0.q(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            d dVar = (d) it2.next();
            Context context10 = actionButtonGrid.getContext();
            Intrinsics.checkNotNullExpressionValue(context10, "getContext(...)");
            ActionButton actionButton = new ActionButton(context10);
            actionButton.setId(View.generateViewId());
            Intrinsics.checkNotNullParameter(dVar, str3);
            Integer num = dVar.f23738a;
            if (num != null) {
                actionButton.setId(num.intValue());
            }
            String str4 = dVar.f23739b;
            kl0.c cVar2 = new kl0.c(str4, 19);
            GestaltText gestaltText2 = actionButton.f45649c;
            gestaltText2.i(cVar2);
            pp2.a.k(gestaltText2, b.f23732j);
            q qVar = dVar.f23740c;
            GestaltIcon gestaltIcon = actionButton.f45648b;
            if (qVar != null) {
                it = it2;
                str2 = str3;
                dl2.b.z(gestaltIcon, new a(0, dVar.f23741d, qVar));
            } else {
                it = it2;
                str2 = str3;
                Intrinsics.checkNotNullParameter(gestaltIcon, "<this>");
                gestaltIcon.g2(rm1.a.f108689k);
            }
            Function0 function0 = dVar.f23742e;
            rq.t0 t0Var = new rq.t0(13, function0);
            ViewGroup viewGroup = actionButton.f45647a;
            viewGroup.setOnClickListener(t0Var);
            gestaltText2.k(new rq.t0(14, function0));
            viewGroup.setContentDescription(str4);
            actionButtonGrid.addView(actionButton);
            arrayList2.add(actionButton);
            it2 = it;
            str3 = str2;
        }
        ArrayList arrayList3 = new ArrayList(g0.q(arrayList2, 10));
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            arrayList3.add(Integer.valueOf(((ActionButton) it3.next()).getId()));
        }
        flow.s(CollectionsKt.E0(arrayList3));
        fVar.addView(actionButtonGrid);
        addView(fVar);
    }

    @Override // af2.c
    public final af2.b componentManager() {
        if (this.f23753a == null) {
            this.f23753a = new o(this);
        }
        return this.f23753a;
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f23753a == null) {
            this.f23753a = new o(this);
        }
        return this.f23753a.generatedComponent();
    }
}
