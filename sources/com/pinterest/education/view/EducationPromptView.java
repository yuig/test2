package com.pinterest.education.view;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.pinterest.gestalt.text.GestaltText;
import df.j1;
import dl2.b;
import eo1.a;
import gd0.c;
import gg0.o0;
import gg0.v;
import i32.i;
import jg0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m60.u;
import m60.w;
import org.jetbrains.annotations.NotNull;
import rm1.q;
import v.h;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\nB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/pinterest/education/view/EducationPromptView;", "Landroid/widget/RelativeLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "g4/u", "educationLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class EducationPromptView extends RelativeLayout {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f45011f = 0;

    /* renamed from: a, reason: collision with root package name */
    public final GestaltText f45012a;

    /* renamed from: b, reason: collision with root package name */
    public final FrameLayout f45013b;

    /* renamed from: c, reason: collision with root package name */
    public final LinearLayout f45014c;

    /* renamed from: d, reason: collision with root package name */
    public final Handler f45015d;

    /* renamed from: e, reason: collision with root package name */
    public final h f45016e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EducationPromptView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void a(long j13, String str, String str2, int i13) {
        GestaltText gestaltText;
        if (str != null && (gestaltText = this.f45012a) != null) {
            gestaltText.i(new c(8, this, str));
        }
        if (i13 > 0) {
            q qVar = i13 == i.FORWARD_ARROW.getValue() ? q.ARROW_FORWARD : q.ARROW_DOWN;
            GestaltText gestaltText2 = this.f45012a;
            if (gestaltText2 != null) {
                gestaltText2.i(new v(qVar, 2));
            }
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            int P = j1.P(b.D0(context2, a.space_400), context);
            Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            Context context4 = getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
            int P2 = j1.P(b.D0(context4, a.space_800), context3);
            GestaltText gestaltText3 = this.f45012a;
            if (gestaltText3 != null) {
                gestaltText3.setPaddingRelative(P2, P, P, P);
            }
        } else {
            GestaltText gestaltText4 = this.f45012a;
            if (gestaltText4 != null) {
                gestaltText4.i(gg0.a.A);
            }
        }
        LinearLayout linearLayout = this.f45014c;
        if (linearLayout != null) {
            linearLayout.measure(0, 0);
        }
        Handler handler = this.f45015d;
        handler.removeCallbacksAndMessages(null);
        if (j13 > 0) {
            handler.postDelayed(this.f45016e, j13);
        }
        if (str2 != null) {
            FrameLayout frameLayout = this.f45013b;
            Drawable drawable = frameLayout != null ? frameLayout.getBackground() : null;
            if (j1.d1(str2)) {
                Context context5 = getContext();
                Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
                int parseColor = Color.parseColor(str2);
                Intrinsics.checkNotNullParameter(context5, "context");
                if (drawable != null) {
                    if (parseColor == 0) {
                        int i14 = df0.a.f54892a;
                        Object obj = d5.a.f53679a;
                        parseColor = context5.getColor(i14);
                    }
                    drawable.mutate().setTint(parseColor);
                }
            } else if (drawable != null) {
                Context context6 = getContext();
                Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
                int i15 = a.color_green_matchacado_800;
                Intrinsics.checkNotNullParameter(context6, "context");
                Intrinsics.checkNotNullParameter(drawable, "drawable");
                int t13 = b7.c.t(context6, i15, 0);
                if (t13 != 0) {
                    Drawable mutate = drawable.mutate();
                    Intrinsics.checkNotNullExpressionValue(mutate, "mutate(...)");
                    mutate.setTint(t13);
                }
            }
            FrameLayout frameLayout2 = this.f45013b;
            if (frameLayout2 != null) {
                frameLayout2.setBackground(drawable);
            }
        }
        setVisibility(0);
        w wVar = u.f85943a;
        LinearLayout linearLayout2 = this.f45014c;
        wVar.d(linearLayout2 != null ? new o0(this, linearLayout2.getMeasuredHeight()) : null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EducationPromptView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f45015d = new Handler();
        this.f45016e = new h(16);
        LayoutInflater.from(context).inflate(d.view_education_prompt, (ViewGroup) this, true);
        this.f45012a = (GestaltText) findViewById(jg0.c.education_prompt_title);
        this.f45013b = (FrameLayout) findViewById(jg0.c.education_prompt_title_background);
        this.f45014c = (LinearLayout) findViewById(jg0.c.education_prompt_wrapper);
        setVisibility(8);
    }
}
