package com.pinterest.gestalt.badge;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.firebase.messaging.q;
import df.j1;
import eo1.a;
import fm1.c;
import gm1.b;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rm1.e;
import rm1.g;
import rm1.n;
import rm1.r;
import ul1.f;
import ul1.l;
import ul1.m;
import ul1.o;
import ul1.s;
import xk2.v;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00000\u0002:\u0004\f\r\u0003\u000eB'\b\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/pinterest/gestalt/badge/GestaltBadge;", "Landroidx/appcompat/widget/AppCompatTextView;", "Lgm1/b;", "Lul1/c;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ul1/b", "al1/n", "ul1/l", "badge_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class GestaltBadge extends AppCompatTextView implements b {

    /* renamed from: d, reason: collision with root package name */
    public static final c f49282d;

    /* renamed from: a, reason: collision with root package name */
    public final q f49283a;

    /* renamed from: b, reason: collision with root package name */
    public final v f49284b;

    /* renamed from: c, reason: collision with root package name */
    public final v f49285c;

    static {
        f fVar = f.f122457e;
        f49282d = c.VISIBLE;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GestaltBadge(@NotNull Context context, AttributeSet attributeSet) {
        this(4, context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final g i(GestaltBadge gestaltBadge, l lVar) {
        String name;
        rm1.q a13;
        g eVar;
        gestaltBadge.getClass();
        g gVar = null;
        ul1.b bVar = lVar instanceof ul1.b ? (ul1.b) lVar : null;
        if (bVar != null && (a13 = bVar.a()) != null) {
            String name2 = a13.name();
            LinkedHashMap linkedHashMap = r.f108717a;
            Intrinsics.checkNotNullParameter(name2, "name");
            rm1.q d2 = r.d(name2);
            if (d2 != null) {
                eVar = new rm1.f(d2);
            } else {
                n c13 = r.c(name2);
                eVar = c13 != null ? new e(c13) : null;
            }
            if (eVar != null) {
                return eVar;
            }
        }
        int i13 = lVar.f122465c;
        Context context = gestaltBadge.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Intrinsics.checkNotNullParameter(context, "<this>");
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i13, typedValue, true);
        CharSequence charSequence = typedValue.string;
        if (charSequence == null || (name = charSequence.toString()) == null) {
            name = "";
        }
        if (name.length() != 0 && !Intrinsics.d(name, "NA")) {
            LinkedHashMap linkedHashMap2 = r.f108717a;
            Intrinsics.checkNotNullParameter(name, "name");
            rm1.q d13 = r.d(name);
            if (d13 != null) {
                gVar = new rm1.f(d13);
            } else {
                n c14 = r.c(name);
                if (c14 != null) {
                    gVar = new e(c14);
                }
            }
        }
        return gVar;
    }

    public static final void j(GestaltBadge gestaltBadge, g gVar, int i13) {
        BitmapDrawable bitmapDrawable;
        n nVar;
        rm1.q qVar;
        gestaltBadge.getClass();
        rm1.f fVar = gVar instanceof rm1.f ? (rm1.f) gVar : null;
        if (fVar == null || (qVar = fVar.f108702a) == null) {
            e eVar = gVar instanceof e ? (e) gVar : null;
            if (eVar == null || (nVar = eVar.f108700a) == null) {
                bitmapDrawable = null;
            } else {
                Context context = gestaltBadge.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                bitmapDrawable = gestaltBadge.l(nVar.drawableRes(context), i13);
            }
        } else {
            Context context2 = gestaltBadge.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            bitmapDrawable = gestaltBadge.l(qVar.drawableRes(context2), i13);
        }
        gestaltBadge.setCompoundDrawablesRelativeWithIntrinsicBounds(bitmapDrawable, (Drawable) null, (Drawable) null, (Drawable) null);
        gestaltBadge.setCompoundDrawablePadding(ml2.c.c(dl2.b.E0(gestaltBadge, a.comp_badge_horizontal_gap)));
    }

    public final void k(Function1 nextState) {
        Intrinsics.checkNotNullParameter(nextState, "nextState");
        q qVar = this.f49283a;
    }

    public final BitmapDrawable l(int i13, int i14) {
        Drawable f03 = bs1.c.f0(this, i13, null, null, 6);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        f03.setTint(dl2.b.x0(context, i14));
        Resources resources = getContext().getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        int F0 = dl2.b.F0(context2, a.comp_badge_leading_icon_size);
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        return d7.b.p0(f03, resources, F0, dl2.b.F0(context3, a.comp_badge_leading_icon_size));
    }

    public final void m(ul1.c cVar, ul1.c cVar2) {
        int i13 = 2;
        j1.v(cVar, cVar2, ul1.n.f122471k, new ul1.a(this, i13));
        j1.v(cVar, cVar2, ul1.n.f122472l, new ul1.a(this, 3));
        j1.v(cVar, cVar2, ul1.n.f122473m, new ul1.a(this, 4));
        int i14 = 1;
        setMaxLines(1);
        j1.v(cVar, cVar2, ul1.n.f122474n, new m(this, cVar2, i13));
        j1.v(cVar, cVar2, ul1.n.f122475o, new m(this, cVar2, i14));
        setTextAppearance(ul1.r.GestaltBadge);
        v vVar = this.f49285c;
        int intValue = ((Number) vVar.getValue()).intValue();
        v vVar2 = this.f49284b;
        setPaddingRelative(intValue, ((Number) vVar2.getValue()).intValue(), ((Number) vVar.getValue()).intValue(), ((Number) vVar2.getValue()).intValue());
        if (cVar2.f122453e != Integer.MIN_VALUE) {
            j1.v(cVar, cVar2, ul1.n.f122470j, new ul1.a(this, i14));
        }
    }

    public /* synthetic */ GestaltBadge(int i13, Context context, AttributeSet attributeSet) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GestaltBadge(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f49284b = xk2.m.b(new o(this, 1));
        int i14 = 0;
        this.f49285c = xk2.m.b(new o(this, i14));
        int[] GestaltBadge = s.GestaltBadge;
        Intrinsics.checkNotNullExpressionValue(GestaltBadge, "GestaltBadge");
        q qVar = new q(this, attributeSet, i13, GestaltBadge, new ul1.a(this, i14));
        this.f49283a = qVar;
        m(null, (ul1.c) ((u50.o) qVar.f33803a));
    }
}
