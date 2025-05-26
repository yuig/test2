package com.pinterest.ui.view.descriptors;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.firebase.messaging.q;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.blurView.BlurView;
import eo1.a;
import fm1.c;
import fn1.k;
import gm1.b;
import jb2.d;
import jb2.f;
import jb2.g;
import kh2.s0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pk.a0;
import u50.e;
import u50.i;
import u50.i0;
import u50.o;
import xk2.m;
import xk2.v;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00000\u0002:\u0004\f\u0003\r\u000eB'\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/pinterest/ui/view/descriptors/VisualSearchPill;", "Landroid/widget/LinearLayout;", "Lgm1/b;", "Ljb2/b;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "gi2/b", "kh2/s0", "jb2/f", "visualSearchLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class VisualSearchPill extends LinearLayout implements b {

    /* renamed from: f, reason: collision with root package name */
    public static final c f52728f = c.VISIBLE;

    /* renamed from: g, reason: collision with root package name */
    public static final d f52729g = new d(new e(a.comp_searchguide_base_background_color), new e(a.comp_text_color_dark));

    /* renamed from: a, reason: collision with root package name */
    public final q f52730a;

    /* renamed from: b, reason: collision with root package name */
    public final f f52731b;

    /* renamed from: c, reason: collision with root package name */
    public final v f52732c;

    /* renamed from: d, reason: collision with root package name */
    public final v f52733d;

    /* renamed from: e, reason: collision with root package name */
    public ViewGroup f52734e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VisualSearchPill(@NotNull Context context, AttributeSet attributeSet) {
        this(4, context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static ViewGroup b(View view, int i13) {
        if (view == null) {
            return null;
        }
        if (view.getId() != i13) {
            Object parent = view.getParent();
            return b(parent instanceof View ? (View) parent : null, i13);
        }
        if (view instanceof ViewGroup) {
            return (ViewGroup) view;
        }
        return null;
    }

    public final void a(Function1 nextState) {
        Intrinsics.checkNotNullParameter(nextState, "nextState");
    }

    public final void c(jb2.b bVar) {
        int B;
        Integer num;
        setEnabled(bVar.f75357d);
        setAlpha(bVar.f75358e);
        boolean z13 = bVar.f75360g;
        s0 s0Var = bVar.f75361h;
        if (z13) {
            B = bs1.c.B(this, eo1.b.color_themed_text_default);
        } else if (s0Var instanceof d) {
            i iVar = ((d) s0Var).f75365b;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            B = ((Number) iVar.a(context)).intValue();
        } else if (s0Var instanceof jb2.c) {
            Integer num2 = ((jb2.c) s0Var).f75363b;
            B = num2 != null ? num2.intValue() : bs1.c.B(this, eo1.b.color_themed_background_default);
        } else {
            B = bs1.c.B(this, eo1.b.color_themed_background_default);
        }
        if ((s0Var instanceof jb2.c) && (num = ((jb2.c) s0Var).f75364c) != null) {
            if (this.f52734e == null) {
                this.f52734e = b(this, num.intValue());
            }
            ViewGroup viewGroup = this.f52734e;
            if (viewGroup != null) {
                v vVar = this.f52733d;
                ba2.d dVar = ((BlurView) vVar.getValue()).f52210a;
                if (dVar != null) {
                    dVar.f22425m = true;
                    dVar.b(true);
                    dVar.f22413a.invalidate();
                }
                ((BlurView) vVar.getValue()).a(B);
                BlurView blurView = (BlurView) vVar.getValue();
                Intrinsics.checkNotNullExpressionValue(blurView, "<get-blurView>(...)");
                BlurView.b(blurView, viewGroup, bs1.c.b0(this, eo1.c.rounding_400), false, null, 50).c(20.0f);
            }
        }
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        i0 i0Var = bVar.f75354a;
        int length = i0Var.a(context2).length();
        v vVar2 = this.f52732c;
        if (length > 0) {
            ((GestaltText) vVar2.getValue()).i(new k(this, i0Var, z13 ? vn1.c.INVERSE : vn1.c.DEFAULT));
        } else {
            GestaltText gestaltText = (GestaltText) vVar2.getValue();
            Intrinsics.checkNotNullExpressionValue(gestaltText, "<get-text>(...)");
            a0.k0(gestaltText);
        }
        setVisibility(bVar.f75356c.getVisibility());
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        setContentDescription(bVar.f75355b.a(context3));
        i0 i0Var2 = ((jb2.b) ((o) this.f52730a.f33803a)).f75359f;
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        setTag(i0Var2.a(context4));
        int i13 = bVar.f75362i;
        if (i13 != Integer.MIN_VALUE) {
            setId(i13);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent ev2) {
        Intrinsics.checkNotNullParameter(ev2, "ev");
        return true;
    }

    public /* synthetic */ VisualSearchPill(int i13, Context context, AttributeSet attributeSet) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VisualSearchPill(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f52732c = m.b(new g(this, 1));
        this.f52733d = m.b(new g(this, 0));
        int[] VisualSearchPill = vc2.g.VisualSearchPill;
        Intrinsics.checkNotNullExpressionValue(VisualSearchPill, "VisualSearchPill");
        q qVar = new q(this, attributeSet, i13, VisualSearchPill, new jb2.a(this, 0));
        this.f52730a = qVar;
        jb2.b bVar = (jb2.b) ((o) qVar.f33803a);
        setOrientation(0);
        View.inflate(getContext(), vc2.d.visual_search_pill, this);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        setPaddingRelative(0, 0, 0, 0);
        setLayoutParams(layoutParams);
        setMinimumWidth(dl2.b.G0(this, a.comp_searchguide_height));
        el2.a entries = f.getEntries();
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.f52731b = (f) entries.get(dl2.b.O0(context2, a.comp_searchguide_text_variant));
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        dl2.b.w0(context3, a.comp_searchguide_is_vr);
        c(bVar);
    }
}
