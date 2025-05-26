package com.pinterest.education.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import bs1.c;
import com.pinterest.education.ActionPromptView;
import com.pinterest.gestalt.buttongroup.GestaltButtonGroup;
import eg0.a;
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
import yb0.b;
import zf0.f;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/pinterest/education/view/CommentPushNotificationNudgeActionPromptView;", "Lcom/pinterest/education/ActionPromptView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "educationLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class CommentPushNotificationNudgeActionPromptView extends ActionPromptView {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f44974p = 0;

    /* renamed from: n, reason: collision with root package name */
    public boolean f44975n;

    /* renamed from: o, reason: collision with root package name */
    public final GestaltButtonGroup f44976o;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CommentPushNotificationNudgeActionPromptView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.pinterest.education.ActionPromptView
    public final void X(a educationActionPrompt, String str, n nVar) {
        Intrinsics.checkNotNullParameter(educationActionPrompt, "educationActionPrompt");
        Intrinsics.checkNotNullParameter(educationActionPrompt, "<set-?>");
        this.f44951d = educationActionPrompt;
        T(true);
        D(true);
        pp2.a.k(o(), gg0.a.f64894k);
        L();
        C();
        f0 h23 = c.h2(k().f58870m);
        GestaltButtonGroup gestaltButtonGroup = this.f44976o;
        r.q(gestaltButtonGroup, h23);
        r.s(gestaltButtonGroup, c.h2(k().f58868k));
        gestaltButtonGroup.b(new b(this, 11));
        Y();
        c.M1(o());
    }

    @Override // lu.a0
    public final void e() {
        if (this.f44975n) {
            return;
        }
        this.f44975n = true;
        oa oaVar = ((jb) ((gg0.c) generatedComponent())).f113483a;
        this.f44952e = (w) oaVar.f113885r0.get();
        this.f44953f = (f) oaVar.f113723hd.get();
    }

    @Override // com.pinterest.education.ActionPromptView
    public final boolean g() {
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommentPushNotificationNudgeActionPromptView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        e();
        View.inflate(context, d.comment_push_notification_nudge_action_view, this);
        x();
        View findViewById = findViewById(jg0.c.actionPromptButtonGroup);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f44976o = (GestaltButtonGroup) findViewById;
    }
}
