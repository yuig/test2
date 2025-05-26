package com.pinterest.feature.pin.reactions.view;

import af2.b;
import af2.c;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.pinterest.gestalt.text.GestaltText;
import e21.p;
import h32.b4;
import h32.d4;
import kh2.j1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m60.w;
import nx.f0;
import nx.m;
import org.jetbrains.annotations.NotNull;
import so.jb;
import so.oa;
import wa2.u;
import wk2.a;
import ye2.o;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/pinterest/feature/pin/reactions/view/PinReactionsDisplayView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "pinReactionsLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class PinReactionsDisplayView extends LinearLayout implements c {

    /* renamed from: a, reason: collision with root package name */
    public o f47273a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f47274b;

    /* renamed from: c, reason: collision with root package name */
    public w f47275c;

    /* renamed from: d, reason: collision with root package name */
    public f0 f47276d;

    /* renamed from: e, reason: collision with root package name */
    public a f47277e;

    /* renamed from: f, reason: collision with root package name */
    public final u f47278f;

    /* renamed from: g, reason: collision with root package name */
    public final GestaltText f47279g;

    /* renamed from: h, reason: collision with root package name */
    public final e21.o f47280h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PinReactionsDisplayView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        a();
        f0 f0Var = this.f47276d;
        if (f0Var == null) {
            Intrinsics.r("pinalyticsFactory");
            throw null;
        }
        a aVar = this.f47277e;
        if (aVar == null) {
            Intrinsics.r("topContextProvider");
            throw null;
        }
        Object obj = aVar.get();
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        ((m) f0Var).a((nx.a) obj);
        b4 b4Var = d4.Companion;
        this.f47280h = new e21.o(this);
        setOrientation(0);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        u uVar = new u(context2);
        uVar.f128946d = getContext().getResources().getDimensionPixelSize(cz1.a.pin_reaction_display_icon_padding);
        this.f47278f = uVar;
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        GestaltText gestaltText = new GestaltText(6, context3, (AttributeSet) null);
        j1.q1(gestaltText, eo1.c.font_size_300);
        gestaltText.setCompoundDrawablePadding(gestaltText.getResources().getDimensionPixelSize(eo1.c.lego_spacing_horizontal_xsmall));
        this.f47279g = gestaltText;
        addView(gestaltText);
    }

    public final void a() {
        if (this.f47274b) {
            return;
        }
        this.f47274b = true;
        oa oaVar = ((jb) ((p) generatedComponent())).f113483a;
        this.f47275c = (w) oaVar.f113885r0.get();
        this.f47276d = (f0) oaVar.f113747j2.get();
        this.f47277e = oaVar.f113799m2;
    }

    @Override // af2.c
    public final b componentManager() {
        if (this.f47273a == null) {
            this.f47273a = new o(this);
        }
        return this.f47273a;
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f47273a == null) {
            this.f47273a = new o(this);
        }
        return this.f47273a.generatedComponent();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        w wVar = this.f47275c;
        if (wVar != null) {
            wVar.h(this.f47280h);
        } else {
            Intrinsics.r("eventManager");
            throw null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        w wVar = this.f47275c;
        if (wVar == null) {
            Intrinsics.r("eventManager");
            throw null;
        }
        wVar.j(this.f47280h);
        super.onDetachedFromWindow();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PinReactionsDisplayView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        a();
        f0 f0Var = this.f47276d;
        if (f0Var != null) {
            a aVar = this.f47277e;
            if (aVar != null) {
                Object obj = aVar.get();
                Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                ((m) f0Var).a((nx.a) obj);
                b4 b4Var = d4.Companion;
                this.f47280h = new e21.o(this);
                setOrientation(0);
                Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                u uVar = new u(context2);
                uVar.f128946d = getContext().getResources().getDimensionPixelSize(cz1.a.pin_reaction_display_icon_padding);
                this.f47278f = uVar;
                Context context3 = getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                GestaltText gestaltText = new GestaltText(6, context3, (AttributeSet) null);
                j1.q1(gestaltText, eo1.c.font_size_300);
                gestaltText.setCompoundDrawablePadding(gestaltText.getResources().getDimensionPixelSize(eo1.c.lego_spacing_horizontal_xsmall));
                this.f47279g = gestaltText;
                addView(gestaltText);
                return;
            }
            Intrinsics.r("topContextProvider");
            throw null;
        }
        Intrinsics.r("pinalyticsFactory");
        throw null;
    }
}
