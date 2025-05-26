package j4;

import android.content.Context;
import android.graphics.Typeface;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;
import b4.n;
import com.pinterest.api.model.px;
import com.pinterest.gestalt.text.previewText.GestaltPreviewTextView;
import h32.u0;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import m60.u;

/* loaded from: classes3.dex */
public final class f extends ClickableSpan {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f74579a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f74580b;

    public f(n nVar) {
        this.f74579a = 0;
        this.f74580b = nVar;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View textView) {
        int i13 = this.f74579a;
        Object obj = this.f74580b;
        switch (i13) {
            case 0:
                kg.n.a(textView);
                ((n) obj).getClass();
                break;
            case 1:
                kg.n.a(textView);
                px pxVar = (px) obj;
                u.f85943a.d(new dq.b(pxVar.f41129b, pxVar.f41131d, u0.NEWS_HUB_HEADER_TEXT));
                break;
            case 2:
                kg.n.a(textView);
                dv1.f fVar = (dv1.f) obj;
                dv1.e eVar = fVar.f56396a;
                if (eVar != null) {
                    u.f85943a.d(new dq.a(fVar.f56398c, eVar, u0.NEWS_HUB_HEADER_TEXT));
                    break;
                }
                break;
            case 3:
                kg.n.a(textView);
                Intrinsics.checkNotNullParameter(textView, "textView");
                ((Function0) obj).invoke();
                break;
            case 4:
                kg.n.a(textView);
                Intrinsics.checkNotNullParameter(textView, "view");
                CharSequence text = ((TextView) textView).getText();
                Intrinsics.g(text, "null cannot be cast to non-null type android.text.Spannable");
                Selection.setSelection((Spannable) text, 0);
                textView.invalidate();
                ((View.OnClickListener) ((Pair) obj).f80347b).onClick(textView);
                break;
            default:
                kg.n.a(textView);
                Intrinsics.checkNotNullParameter(textView, "widget");
                GestaltPreviewTextView gestaltPreviewTextView = (GestaltPreviewTextView) obj;
                gestaltPreviewTextView.f49646e.s(new un1.b(gestaltPreviewTextView.getId()));
                break;
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint drawState) {
        Typeface a13;
        switch (this.f74579a) {
            case 1:
            case 2:
                break;
            case 3:
                Intrinsics.checkNotNullParameter(drawState, "drawState");
                super.updateDrawState(drawState);
                drawState.setUnderlineText(false);
                drawState.setFakeBoldText(true);
                break;
            case 4:
                Intrinsics.checkNotNullParameter(drawState, "textPaint");
                drawState.setUnderlineText(true);
                drawState.setFakeBoldText(true);
                break;
            case 5:
                Intrinsics.checkNotNullParameter(drawState, "drawState");
                GestaltPreviewTextView gestaltPreviewTextView = (GestaltPreviewTextView) this.f74580b;
                un1.k kVar = gestaltPreviewTextView.k().f122880x;
                vn1.e eVar = kVar != null ? kVar.f122890b : null;
                if (eVar == null) {
                    Context context = gestaltPreviewTextView.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    a13 = te0.g.a(context, lm1.c.f83927c, null, 12);
                } else if (un1.l.f122892a[eVar.ordinal()] == 1) {
                    Context context2 = gestaltPreviewTextView.getContext();
                    Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                    a13 = te0.g.a(context2, lm1.c.f83927c, null, 12);
                } else {
                    Context context3 = gestaltPreviewTextView.getContext();
                    Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                    a13 = te0.g.a(context3, lm1.c.f83926b, null, 12);
                }
                drawState.setTypeface(a13);
                un1.k kVar2 = gestaltPreviewTextView.k().f122880x;
                vn1.c cVar = kVar2 != null ? kVar2.f122891c : null;
                drawState.setColor(cVar == null ? dl2.b.y0(gestaltPreviewTextView, gestaltPreviewTextView.k().f122864h.getColorRes()) : dl2.b.y0(gestaltPreviewTextView, cVar.getColorRes()));
                un1.k kVar3 = gestaltPreviewTextView.k().f122880x;
                drawState.setTextSize((kVar3 != null ? kVar3.f122889a : null) == null ? dl2.b.G0(gestaltPreviewTextView, gestaltPreviewTextView.k().f122867k.getFontSize()) : dl2.b.G0(gestaltPreviewTextView, r3.getFontSize()));
                break;
            default:
                super.updateDrawState(drawState);
                break;
        }
    }

    public /* synthetic */ f(Object obj, int i13) {
        this.f74579a = i13;
        this.f74580b = obj;
    }
}
