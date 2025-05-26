package com.pinterest.feature.conversation.view;

import a.a;
import af2.c;
import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.pinterest.api.model.e40;
import com.pinterest.api.model.v7;
import com.pinterest.component.board.view.LegoBoardRep;
import d70.f;
import dc0.g;
import dc0.q;
import eo1.b;
import g70.h;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import lq0.j1;
import lq0.w1;
import m60.w0;
import org.jetbrains.annotations.NotNull;
import so.jb;
import so.oa;
import xa0.j;
import ye2.o;
import yk1.d;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/pinterest/feature/conversation/view/UpdatedConversationBoardItemView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lyk1/d;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "conversation_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class UpdatedConversationBoardItemView extends ConstraintLayout implements d, c {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f45626f = 0;

    /* renamed from: a, reason: collision with root package name */
    public o f45627a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f45628b;

    /* renamed from: c, reason: collision with root package name */
    public final pb0.d f45629c;

    /* renamed from: d, reason: collision with root package name */
    public final h f45630d;

    /* renamed from: e, reason: collision with root package name */
    public final LegoBoardRep f45631e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdatedConversationBoardItemView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        if (!this.f45628b) {
            this.f45628b = true;
            jb jbVar = (jb) ((w1) generatedComponent());
            oa oaVar = jbVar.f113483a;
            this.f45629c = oaVar.j2();
            this.f45630d = jbVar.f113485c.e5();
        }
        LegoBoardRep legoBoardRep = new LegoBoardRep(context);
        this.f45631e = legoBoardRep;
        addView(legoBoardRep);
        legoBoardRep.a0(new qc2.d(), j1.f84343l);
    }

    public final void L(v7 board, boolean z13) {
        Intrinsics.checkNotNullParameter(board, "board");
        List U0 = kh2.d.U0(board);
        q qVar = q.Default;
        e40 e40Var = (e40) CollectionsKt.U(0, U0);
        CharSequence charSequence = null;
        String c13 = e40Var != null ? e40Var.c() : null;
        if (c13 == null) {
            c13 = "";
        }
        e40 e40Var2 = (e40) CollectionsKt.U(1, U0);
        String c14 = e40Var2 != null ? e40Var2.c() : null;
        if (c14 == null) {
            c14 = "";
        }
        e40 e40Var3 = (e40) CollectionsKt.U(2, U0);
        String c15 = e40Var3 != null ? e40Var3.c() : null;
        if (c15 == null) {
            c15 = "";
        }
        g gVar = new g(c13, c14, c15);
        int i13 = b.color_themed_transparent;
        String j13 = board.j1();
        String str = j13 == null ? "" : j13;
        Resources resources = getResources();
        int i14 = w0.plural_pins_string;
        Integer l13 = board.l1();
        Intrinsics.checkNotNullExpressionValue(l13, "getPinCount(...)");
        String quantityString = resources.getQuantityString(i14, l13.intValue(), board.l1());
        Resources resources2 = getResources();
        int i15 = f.plural_sections_string;
        Integer q13 = board.q1();
        Intrinsics.checkNotNullExpressionValue(q13, "getSectionCount(...)");
        String D = a.D(quantityString, " · ", resources2.getQuantityString(i15, q13.intValue(), board.q1()));
        Date D0 = board.D0();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("");
        if (D0 != null) {
            pb0.h p13 = j.p(D0);
            pb0.d dVar = this.f45629c;
            if (dVar == null) {
                Intrinsics.r("fuzzyDateFormatter");
                throw null;
            }
            charSequence = dVar.c(p13, pb0.b.STYLE_COMPACT, false);
        }
        if (charSequence != null && charSequence.length() != 0) {
            spannableStringBuilder.append(charSequence);
        }
        String spannableStringBuilder2 = spannableStringBuilder.toString();
        Intrinsics.checkNotNullExpressionValue(spannableStringBuilder2, "toString(...)");
        this.f45631e.d0(new dc0.o(qVar, gVar, 0, null, Integer.valueOf(i13), null, str, D, spannableStringBuilder2, null, "", false, null, z13, 0, null, null, true, z13, false, null, null, false, false, 16374304));
    }

    @Override // af2.c
    public final af2.b componentManager() {
        if (this.f45627a == null) {
            this.f45627a = new o(this);
        }
        return this.f45627a;
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f45627a == null) {
            this.f45627a = new o(this);
        }
        return this.f45627a.generatedComponent();
    }
}
