package rq;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import com.pinterest.activity.pin.view.unifiedcomments.CommentPreviewView;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.wy0;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.gestalt.text.previewText.GestaltPreviewTextView;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class i4 extends kotlin.jvm.internal.p implements kl2.l {
    @Override // kl2.l
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Object styleSpan;
        wy0 n13;
        String str = (String) obj;
        String commentId = (String) obj2;
        rh1.y translationStatus = (rh1.y) obj3;
        Intrinsics.checkNotNullParameter(commentId, "p1");
        Intrinsics.checkNotNullParameter(translationStatus, "p2");
        CommentPreviewView commentPreviewView = (CommentPreviewView) this.receiver;
        commentPreviewView.getClass();
        Intrinsics.checkNotNullParameter(commentId, "commentId");
        Intrinsics.checkNotNullParameter(translationStatus, "translationStatus");
        rp0.d dVar = commentPreviewView.f35108q;
        String str2 = null;
        if (Intrinsics.d(dVar != null ? dVar.v() : null, commentId)) {
            int i13 = uq.q.f123020a[translationStatus.ordinal()];
            GestaltText gestaltText = commentPreviewView.f35101j;
            if (i13 == 1) {
                gestaltText.i(uq.d.f122996t);
            } else if (i13 == 2) {
                gestaltText.i(uq.d.f122997u);
            } else if (i13 == 3) {
                gestaltText.i(uq.d.f122998v);
            }
            wy0 wy0Var = commentPreviewView.f35109r;
            String U2 = wy0Var != null ? wy0Var.U2() : null;
            if (U2 == null) {
                U2 = "";
            }
            if (str != null) {
                SpannableStringBuilder string = new SpannableStringBuilder(str).insert(0, (CharSequence) U2.concat(" "));
                Intrinsics.checkNotNullExpressionValue(string, "insert(...)");
                wy0 wy0Var2 = commentPreviewView.f35109r;
                f30 f30Var = commentPreviewView.f35110s;
                String U22 = wy0Var2 != null ? wy0Var2.U2() : null;
                String str3 = U22 != null ? U22 : "";
                Context context = commentPreviewView.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                f0.h.p(context, string, 0, str3.length(), eo1.b.color_themed_text_default, commentPreviewView.f35103l, false);
                String uid = wy0Var2 != null ? wy0Var2.getUid() : null;
                if (f30Var != null && (n13 = b40.n(f30Var)) != null) {
                    str2 = n13.getUid();
                }
                if (Intrinsics.d(uid, str2)) {
                    Context context2 = commentPreviewView.getContext();
                    int i14 = eo1.b.color_blue_500;
                    Object obj4 = d5.a.f53679a;
                    styleSpan = new ForegroundColorSpan(context2.getColor(i14));
                } else {
                    styleSpan = new StyleSpan(1);
                }
                string.setSpan(styleSpan, 0, str3.length(), 33);
                Intrinsics.checkNotNullParameter(string, "string");
                u50.f0 text = new u50.f0(string);
                GestaltPreviewTextView gestaltPreviewTextView = commentPreviewView.f35098g;
                Intrinsics.checkNotNullParameter(gestaltPreviewTextView, "<this>");
                Intrinsics.checkNotNullParameter(text, "text");
                gestaltPreviewTextView.i(new fx.e(15, text));
            }
        }
        return Unit.f80348a;
    }
}
