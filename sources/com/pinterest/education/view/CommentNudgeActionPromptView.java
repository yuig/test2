package com.pinterest.education.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.pinterest.education.ActionPromptView;
import com.pinterest.gestalt.buttongroup.GestaltButtonGroup;
import com.pinterest.ui.imageview.WebImageView;
import eg0.a;
import ep.b;
import jg0.c;
import jg0.d;
import kh2.r;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m60.w;
import org.jetbrains.annotations.NotNull;
import rg0.n;
import so.jb;
import so.oa;
import u50.f0;
import yl1.e;
import zf0.f;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/pinterest/education/view/CommentNudgeActionPromptView;", "Lcom/pinterest/education/ActionPromptView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "educationLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class CommentNudgeActionPromptView extends ActionPromptView {

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f44968s = 0;

    /* renamed from: n, reason: collision with root package name */
    public boolean f44969n;

    /* renamed from: o, reason: collision with root package name */
    public final GestaltButtonGroup f44970o;

    /* renamed from: p, reason: collision with root package name */
    public final WebImageView f44971p;

    /* renamed from: q, reason: collision with root package name */
    public String f44972q;

    /* renamed from: r, reason: collision with root package name */
    public String f44973r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommentNudgeActionPromptView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        e();
        View.inflate(context, d.comment_nudge_action_view, this);
        x();
        View findViewById = findViewById(c.actionPromptButtonGroup);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f44970o = (GestaltButtonGroup) findViewById;
        View findViewById2 = findViewById(c.title_image);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f44971p = (WebImageView) findViewById2;
    }

    @Override // com.pinterest.education.ActionPromptView
    public final void X(a educationActionPrompt, String str, n nVar) {
        vd0.c m13;
        Intrinsics.checkNotNullParameter(educationActionPrompt, "educationActionPrompt");
        Intrinsics.checkNotNullParameter(educationActionPrompt, "<set-?>");
        this.f44951d = educationActionPrompt;
        T(true);
        D(true);
        pp2.a.k(o(), gg0.a.f64893j);
        L();
        C();
        if (nVar != null && (m13 = nVar.f108070l.m("display_data")) != null) {
            String d2 = m13.d("pin_thumbnail_url");
            if (d2 != null) {
                this.f44971p.loadUrl(d2);
            }
            String d13 = m13.d("aggregated_pin_data_id");
            if (d13 != null) {
                this.f44973r = d13;
            }
            String d14 = m13.d("pin_id");
            if (d14 != null) {
                this.f44972q = d14;
            }
        }
        String str2 = k().f58870m;
        f0 x13 = b.x(str2, "string", str2);
        GestaltButtonGroup gestaltButtonGroup = this.f44970o;
        r.q(gestaltButtonGroup, x13);
        e width = e.FULL_WIDTH;
        Intrinsics.checkNotNullParameter(gestaltButtonGroup, "<this>");
        Intrinsics.checkNotNullParameter(width, "width");
        gestaltButtonGroup.a(new cm1.a(width, 0));
        String string = k().f58868k;
        Intrinsics.checkNotNullParameter(string, "string");
        r.s(gestaltButtonGroup, new f0(string));
        Intrinsics.checkNotNullParameter(gestaltButtonGroup, "<this>");
        Intrinsics.checkNotNullParameter(width, "width");
        gestaltButtonGroup.a(new cm1.a(width, 1));
        gestaltButtonGroup.b(new yb0.b(this, 10));
        Y();
        bs1.c.M1(o());
    }

    @Override // lu.a0
    public final void e() {
        if (this.f44969n) {
            return;
        }
        this.f44969n = true;
        oa oaVar = ((jb) ((gg0.b) generatedComponent())).f113483a;
        this.f44952e = (w) oaVar.f113885r0.get();
        this.f44953f = (f) oaVar.f113723hd.get();
    }

    @Override // com.pinterest.education.ActionPromptView
    public final boolean g() {
        return true;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CommentNudgeActionPromptView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
