package pn1;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.p;
import com.pinterest.gestalt.indicator.GestaltIndicator;
import com.pinterest.gestalt.tabs.GestaltTab;
import df.j1;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import rm1.q;
import u50.i0;

/* loaded from: classes2.dex */
public final class d extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f100743i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ GestaltTab f100744j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ b f100745k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(GestaltTab gestaltTab, b bVar, int i13) {
        super(1);
        this.f100743i = i13;
        this.f100744j = gestaltTab;
        this.f100745k = bVar;
    }

    public final void b(int i13) {
        int i14 = this.f100743i;
        GestaltTab gestaltTab = this.f100744j;
        b bVar = this.f100745k;
        switch (i14) {
            case 3:
                gestaltTab.setId(bVar.f100740f);
                return;
            default:
                if (bVar.f100738d > 0 && gestaltTab.f49628d == null) {
                    Context context = gestaltTab.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    GestaltIndicator gestaltIndicator = new GestaltIndicator(6, context, (AttributeSet) null);
                    gestaltTab.f49628d = gestaltIndicator;
                    j1.r(gestaltIndicator, a.f100733k);
                    gestaltIndicator.setGravity(17);
                    int b03 = bs1.c.b0(gestaltTab, eo1.c.sema_space_100);
                    int id3 = gestaltIndicator.getId();
                    TextView textView = gestaltTab.f49627c;
                    if (textView == null) {
                        Intrinsics.r("text");
                        throw null;
                    }
                    gestaltTab.f49630f.m(id3, 6, textView.getId(), 7, b03);
                    int id4 = gestaltIndicator.getId();
                    TextView textView2 = gestaltTab.f49627c;
                    if (textView2 == null) {
                        Intrinsics.r("text");
                        throw null;
                    }
                    int id5 = textView2.getId();
                    p pVar = gestaltTab.f49630f;
                    pVar.l(id4, 4, id5, 4);
                    int id6 = gestaltIndicator.getId();
                    TextView textView3 = gestaltTab.f49627c;
                    if (textView3 == null) {
                        Intrinsics.r("text");
                        throw null;
                    }
                    pVar.l(id6, 3, textView3.getId(), 3);
                    pVar.n(gestaltIndicator.getId(), -2);
                    pVar.o(gestaltIndicator.getId(), -2);
                    gestaltTab.addView(gestaltIndicator);
                    pVar.b(gestaltTab);
                }
                int i15 = bVar.f100738d;
                if (i15 != 0) {
                    GestaltIndicator gestaltIndicator2 = gestaltTab.f49628d;
                    if (gestaltIndicator2 != null) {
                        j1.r(gestaltIndicator2, new g(i15, 0));
                        return;
                    }
                    return;
                }
                GestaltIndicator gestaltIndicator3 = gestaltTab.f49628d;
                if (gestaltIndicator3 != null) {
                    Intrinsics.checkNotNullParameter(gestaltIndicator3, "<this>");
                    gestaltIndicator3.i(um1.c.f122794n);
                    return;
                }
                return;
        }
    }

    public final void e(i0 it) {
        int i13 = this.f100743i;
        b bVar = this.f100745k;
        GestaltTab gestaltTab = this.f100744j;
        switch (i13) {
            case 2:
                Intrinsics.checkNotNullParameter(it, "it");
                i0 i0Var = bVar.f100736b;
                Context context = gestaltTab.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                gestaltTab.setContentDescription(i0Var.a(context));
                return;
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                TextView textView = gestaltTab.f49627c;
                if (textView == null) {
                    Intrinsics.r("text");
                    throw null;
                }
                i0 i0Var2 = bVar.f100735a;
                Context context2 = gestaltTab.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                textView.setText(i0Var2.a(context2));
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        AppCompatImageView appCompatImageView;
        int i13 = this.f100743i;
        b bVar = this.f100745k;
        GestaltTab gestaltTab = this.f100744j;
        switch (i13) {
            case 0:
                b newState = (b) obj;
                Intrinsics.checkNotNullParameter(newState, "newState");
                int i14 = GestaltTab.f49624g;
                gestaltTab.Z(bVar, newState);
                return Unit.f80348a;
            case 1:
                if (j1.c1((g92.d) gestaltTab.f49626b.getValue()) && bVar.f100742h != c.LARGE) {
                    Unit unit = null;
                    q qVar = bVar.f100739e;
                    if (qVar != null && gestaltTab.f49629e == null) {
                        AppCompatImageView appCompatImageView2 = new AppCompatImageView(gestaltTab.getContext(), null);
                        gestaltTab.f49629e = appCompatImageView2;
                        appCompatImageView2.setId(i.tab_icon);
                        int b03 = bs1.c.b0(gestaltTab, eo1.c.sema_space_50);
                        appCompatImageView2.setPaddingRelative(b03, b03, bs1.c.b0(gestaltTab, eo1.c.sema_space_100), b03);
                        appCompatImageView2.setImageTintList(dl2.b.z0(gestaltTab, eo1.a.comp_tabs_icon_color));
                        int id3 = appCompatImageView2.getId();
                        p pVar = gestaltTab.f49630f;
                        pVar.l(id3, 6, 0, 6);
                        int id4 = appCompatImageView2.getId();
                        TextView textView = gestaltTab.f49627c;
                        if (textView == null) {
                            Intrinsics.r("text");
                            throw null;
                        }
                        pVar.l(id4, 4, textView.getId(), 4);
                        int id5 = appCompatImageView2.getId();
                        TextView textView2 = gestaltTab.f49627c;
                        if (textView2 == null) {
                            Intrinsics.r("text");
                            throw null;
                        }
                        pVar.l(id5, 3, textView2.getId(), 3);
                        int G0 = dl2.b.G0(gestaltTab, eo1.a.comp_tabs_icon_size);
                        pVar.n(appCompatImageView2.getId(), G0);
                        pVar.o(appCompatImageView2.getId(), G0);
                        gestaltTab.addView(appCompatImageView2);
                        pVar.b(gestaltTab);
                    }
                    if (qVar != null) {
                        AppCompatImageView appCompatImageView3 = gestaltTab.f49629e;
                        if (appCompatImageView3 != null) {
                            Context context = gestaltTab.getContext();
                            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                            Drawable f03 = bs1.c.f0(gestaltTab, qVar.drawableRes(context), null, null, 6);
                            f03.setTint(dl2.b.x0(context, eo1.a.comp_tabs_icon_color));
                            Resources resources = context.getResources();
                            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                            appCompatImageView3.setImageDrawable(d7.b.p0(f03, resources, dl2.b.F0(context, eo1.a.comp_tabs_icon_size), dl2.b.F0(context, eo1.a.comp_tabs_icon_size)));
                        }
                        AppCompatImageView appCompatImageView4 = gestaltTab.f49629e;
                        if (appCompatImageView4 != null) {
                            appCompatImageView4.setVisibility(0);
                        }
                        unit = Unit.f80348a;
                    }
                    if (unit == null && (appCompatImageView = gestaltTab.f49629e) != null) {
                        appCompatImageView.setVisibility(8);
                    }
                }
                return Unit.f80348a;
            case 2:
                e((i0) obj);
                return Unit.f80348a;
            case 3:
                b(((Number) obj).intValue());
                return Unit.f80348a;
            case 4:
                e((i0) obj);
                return Unit.f80348a;
            default:
                b(((Number) obj).intValue());
                return Unit.f80348a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(b bVar, GestaltTab gestaltTab) {
        super(1);
        this.f100743i = 5;
        this.f100745k = bVar;
        this.f100744j = gestaltTab;
    }
}
