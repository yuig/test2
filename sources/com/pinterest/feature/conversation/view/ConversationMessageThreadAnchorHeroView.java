package com.pinterest.feature.conversation.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import b60.d;
import bs1.c;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.mv;
import com.pinterest.api.model.v7;
import com.pinterest.api.model.wy0;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.imageview.WebImageView;
import dl2.b;
import fo1.a;
import kh2.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lq0.v1;
import oo1.l;
import org.jetbrains.annotations.NotNull;
import xc0.e;
import xc0.f;
import xc0.i;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/pinterest/feature/conversation/view/ConversationMessageThreadAnchorHeroView;", "Landroid/widget/RelativeLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "conversation_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class ConversationMessageThreadAnchorHeroView extends RelativeLayout {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f45607f = 0;

    /* renamed from: a, reason: collision with root package name */
    public final WebImageView f45608a;

    /* renamed from: b, reason: collision with root package name */
    public final GestaltText f45609b;

    /* renamed from: c, reason: collision with root package name */
    public mv f45610c;

    /* renamed from: d, reason: collision with root package name */
    public final LinearLayout f45611d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f45612e;

    public /* synthetic */ ConversationMessageThreadAnchorHeroView(Context context) {
        this(context, null);
    }

    public final void a(v1 threadCloseupViewState, a toolbar, boolean z13, String str) {
        String str2;
        String b13;
        Intrinsics.checkNotNullParameter(threadCloseupViewState, "threadCloseupViewState");
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        mv mvVar = threadCloseupViewState.f84448c;
        this.f45610c = mvVar;
        if (mvVar == null) {
            Intrinsics.r("anchorMessage");
            throw null;
        }
        this.f45612e = j.z(mvVar) == l.USER;
        mv mvVar2 = this.f45610c;
        if (mvVar2 == null) {
            Intrinsics.r("anchorMessage");
            throw null;
        }
        wy0 L = mvVar2.L();
        String str3 = "";
        if (L != null) {
            wy0 f13 = ((d) com.bumptech.glide.d.E()).f();
            str2 = a.a.j("", b.S1(L, f13 != null ? f13.getUid() : null) ? getContext().getResources().getString(i.conversation_thread_anchor_self) : a.a.j("@", L.z4()));
        } else {
            str2 = "";
        }
        mv mvVar3 = this.f45610c;
        if (mvVar3 == null) {
            Intrinsics.r("anchorMessage");
            throw null;
        }
        String M = mvVar3.M();
        if (M == null || M.length() == 0) {
            mv mvVar4 = this.f45610c;
            if (mvVar4 == null) {
                Intrinsics.r("anchorMessage");
                throw null;
            }
            if (mvVar4.O() != null) {
                str3 = a.a.j("", getContext().getResources().getString(i.conversation_thread_anchor_pinner, str2));
            } else {
                mv mvVar5 = this.f45610c;
                if (mvVar5 == null) {
                    Intrinsics.r("anchorMessage");
                    throw null;
                }
                if (mvVar5.I() != null) {
                    str3 = a.a.j("", getContext().getResources().getString(i.conversation_thread_anchor_pin, str2));
                    mv mvVar6 = this.f45610c;
                    if (mvVar6 == null) {
                        Intrinsics.r("anchorMessage");
                        throw null;
                    }
                    f30 I = mvVar6.I();
                    b13 = I != null ? c.p0(I) : null;
                    boolean z14 = this.f45612e;
                    WebImageView webImageView = this.f45608a;
                    if (!z14) {
                        webImageView.loadUrl(b13);
                    }
                    c.R1(webImageView, true);
                } else {
                    mv mvVar7 = this.f45610c;
                    if (mvVar7 == null) {
                        Intrinsics.r("anchorMessage");
                        throw null;
                    }
                    if (mvVar7.D() != null) {
                        str3 = a.a.j("", getContext().getResources().getString(i.conversation_thread_anchor_board, str2));
                        mv mvVar8 = this.f45610c;
                        if (mvVar8 == null) {
                            Intrinsics.r("anchorMessage");
                            throw null;
                        }
                        v7 D = mvVar8.D();
                        b13 = D != null ? D.b1() : null;
                        boolean z15 = this.f45612e;
                        WebImageView webImageView2 = this.f45608a;
                        if (!z15) {
                            webImageView2.loadUrl(b13);
                        }
                        c.R1(webImageView2, true);
                    }
                }
            }
        } else {
            mv mvVar9 = this.f45610c;
            if (mvVar9 == null) {
                Intrinsics.r("anchorMessage");
                throw null;
            }
            str3 = "" + ((Object) str2) + ": " + mvVar9.M();
        }
        this.f45609b.setText(str3);
        if (z13) {
            LinearLayout linearLayout = this.f45611d;
            linearLayout.setVisibility(0);
            linearLayout.setOnClickListener(new lj0.a(str, 18));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConversationMessageThreadAnchorHeroView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutInflater.from(context).inflate(f.conversation_message_thread_anchor_hero_view, (ViewGroup) this, true);
        View findViewById = findViewById(e.conversation_message_anchor_hero_image);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f45608a = (WebImageView) findViewById;
        View findViewById2 = findViewById(e.conversation_message_anchor_hero_text);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f45609b = (GestaltText) findViewById2;
        View findViewById3 = findViewById(e.conversation_message_anchor_hero_see_all_view);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f45611d = (LinearLayout) findViewById3;
    }
}
