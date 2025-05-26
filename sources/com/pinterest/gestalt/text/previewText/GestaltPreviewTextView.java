package com.pinterest.gestalt.text.previewText;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.firebase.messaging.q;
import df.j1;
import gm1.a;
import gm1.b;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import qf1.f0;
import rq.h3;
import tb.e;
import u50.i0;
import un1.c;
import un1.d;
import un1.f;
import un1.g;
import un1.h;
import un1.j;
import un1.o;
import xm1.k;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00000\u0002:\u0005\f\u0003\r\u000e\u000fB'\b\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/pinterest/gestalt/text/previewText/GestaltPreviewTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "Lgm1/b;", "Lun1/c;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "org/chromium/net/y", "un1/f", "un1/j", "un1/k", "text_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class GestaltPreviewTextView extends o implements b {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f49643g = 0;

    /* renamed from: c, reason: collision with root package name */
    public CharSequence f49644c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f49645d;

    /* renamed from: e, reason: collision with root package name */
    public final q f49646e;

    /* renamed from: f, reason: collision with root package name */
    public final e f49647f;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GestaltPreviewTextView(@NotNull Context context, AttributeSet attributeSet) {
        this(4, context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final GestaltPreviewTextView i(Function1 nextState) {
        Intrinsics.checkNotNullParameter(nextState, "nextState");
        return (GestaltPreviewTextView) this.f49646e.d(nextState, new k(13, this, k()));
    }

    public final GestaltPreviewTextView j(a eventHandler) {
        Intrinsics.checkNotNullParameter(eventHandler, "eventHandler");
        return (GestaltPreviewTextView) this.f49646e.c(eventHandler, new f0(this, !Intrinsics.d((a) r0.f33804b, eventHandler), 8));
    }

    public final c k() {
        return (c) ((u50.o) this.f49646e.f33803a);
    }

    public final String l() {
        return a.a.j("...", m());
    }

    public final String m() {
        j jVar = k().f122877u;
        CharSequence charSequence = null;
        if (k().f122881y || !(jVar instanceof h) || ((h) jVar).f122886c == null) {
            i0 i0Var = k().f122879w;
            if (i0Var != null) {
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                charSequence = i0Var.a(context);
            }
            return " " + ((Object) charSequence);
        }
        j jVar2 = k().f122877u;
        Intrinsics.g(jVar2, "null cannot be cast to non-null type com.pinterest.gestalt.text.previewText.GestaltPreviewTextView.SuffixMode.AlwaysWhenExpandable");
        i0 i0Var2 = ((h) jVar2).f122886c;
        if (i0Var2 != null) {
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            charSequence = i0Var2.a(context2);
        }
        return " " + ((Object) charSequence);
    }

    public final void n(c cVar, c cVar2) {
        if (!this.f49645d) {
            i0 i0Var = cVar2.f122863g;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            this.f49644c = i0Var.a(context);
        }
        this.f49647f.j(cVar, cVar2, (a) this.f49646e.f33804b);
        j1.v(cVar, cVar2, un1.a.f122860k, new h3(this, 2));
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        try {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        } catch (IndexOutOfBoundsException unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onMeasure(int i13, int i14) {
        String m13;
        CharSequence charSequence;
        this.f49645d = true;
        setMaxLines(Integer.MAX_VALUE);
        int i15 = 5;
        if ((k().f122877u instanceof g) || (k().f122877u instanceof h)) {
            f fVar = k().f122877u.f122888a;
            if (Intrinsics.d(fVar, d.f122882a)) {
                m13 = l();
            } else {
                if (!Intrinsics.d(fVar, un1.e.f122883a)) {
                    throw new NoWhenBranchMatchedException();
                }
                m13 = getLineCount() <= k().f122878v ? m() : l();
            }
            SpannableString spannableString = new SpannableString(new SpannableStringBuilder(this.f49644c).append((CharSequence) m13));
            j4.f fVar2 = new j4.f(this, i15);
            CharSequence charSequence2 = this.f49644c;
            spannableString.setSpan(fVar2, charSequence2 != null ? charSequence2.length() : 0, spannableString.length(), 33);
            charSequence = spannableString;
        } else {
            charSequence = this.f49644c;
        }
        setText(charSequence);
        super.onMeasure(i13, i14);
        String str = null;
        String str2 = null;
        CharSequence charSequence3 = null;
        str = null;
        if (getLineCount() <= k().f122878v) {
            if (k().f122877u instanceof h) {
                CharSequence text = getText();
                if (text != null) {
                    CharSequence text2 = getText();
                    Intrinsics.checkNotNullExpressionValue(text2, "getText(...)");
                    int L = StringsKt.L(text2, String.valueOf(this.f49644c), 0, false, 6);
                    CharSequence charSequence4 = this.f49644c;
                    str2 = text.subSequence(0, L + (charSequence4 != null ? charSequence4.length() : 0)).toString();
                }
                setText(str2);
            }
            this.f49645d = false;
            return;
        }
        if (k().f122881y) {
            setMaxLines(k().f122878v);
            if (getLayout() != null) {
                CharSequence charSequence5 = this.f49644c;
                if (charSequence5 != null && getLayout() != null) {
                    i0 i0Var = k().f122879w;
                    if (i0Var != null) {
                        Context context = getContext();
                        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                        charSequence3 = i0Var.a(context);
                    }
                    String valueOf = String.valueOf(charSequence3);
                    int lineVisibleEnd = getLayout().getLineVisibleEnd(k().f122878v - 1) - l().length();
                    if (lineVisibleEnd < 0) {
                        lineVisibleEnd = 0;
                    }
                    SpannableStringBuilder append = new SpannableStringBuilder(charSequence5.subSequence(0, lineVisibleEnd)).append((CharSequence) l());
                    Intrinsics.f(append);
                    int N = StringsKt.N(append, valueOf, 0, 6);
                    int length = valueOf.length() + N;
                    SpannableString spannableString2 = new SpannableString(append);
                    spannableString2.setSpan(new j4.f(this, i15), N, length, 33);
                    str = spannableString2;
                }
                if (str == null) {
                    str = "";
                }
                setText(str);
            }
        }
        super.onMeasure(i13, i14);
        this.f49645d = false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GestaltPreviewTextView(Context context, c initialDisplayState) {
        super(context, null, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(initialDisplayState, "initialDisplayState");
        this.f49644c = "";
        this.f49646e = new q(this, initialDisplayState);
        this.f49647f = new e((AppCompatTextView) this);
        n(null, initialDisplayState);
    }

    public /* synthetic */ GestaltPreviewTextView(int i13, Context context, AttributeSet attributeSet) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GestaltPreviewTextView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f49644c = "";
        int[] GestaltText = rn1.o.GestaltText;
        Intrinsics.checkNotNullExpressionValue(GestaltText, "GestaltText");
        this.f49646e = new q(this, attributeSet, i13, GestaltText, new h3(this, 1));
        this.f49647f = new e((AppCompatTextView) this);
        n(null, k());
    }
}
