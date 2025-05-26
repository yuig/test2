package com.pinterest.activity.pin.view.unifiedcomments;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.pinterest.activity.pin.view.unifiedcomments.CommentPreviewView;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.wy0;
import com.pinterest.feature.comment.reactions.view.CommentReactionIndicator;
import com.pinterest.gestalt.avatar.GestaltAvatar;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.gestalt.text.previewText.GestaltPreviewTextView;
import com.pinterest.ui.imageview.WebImageView;
import fb0.f;
import gm1.a;
import h32.c0;
import java.util.concurrent.TimeUnit;
import jq.b;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nx.d0;
import nx.v;
import ob2.c;
import org.jetbrains.annotations.NotNull;
import pk.a0;
import qh1.e;
import rp0.d;
import rq.o3;
import uq.r;
import uq.w;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\rB\u001b\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB#\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\b\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/pinterest/activity/pin/view/unifiedcomments/CommentPreviewView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lnx/v;", "Lh32/c0;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "uq/p", "unifiedcommentsLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class CommentPreviewView extends w implements v {

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ int f35094u = 0;

    /* renamed from: d, reason: collision with root package name */
    public m60.w f35095d;

    /* renamed from: e, reason: collision with root package name */
    public e f35096e;

    /* renamed from: f, reason: collision with root package name */
    public final GestaltAvatar f35097f;

    /* renamed from: g, reason: collision with root package name */
    public final GestaltPreviewTextView f35098g;

    /* renamed from: h, reason: collision with root package name */
    public final WebImageView f35099h;

    /* renamed from: i, reason: collision with root package name */
    public final GestaltText f35100i;

    /* renamed from: j, reason: collision with root package name */
    public final GestaltText f35101j;

    /* renamed from: k, reason: collision with root package name */
    public final CommentReactionIndicator f35102k;

    /* renamed from: l, reason: collision with root package name */
    public final o3 f35103l;

    /* renamed from: m, reason: collision with root package name */
    public Function1 f35104m;

    /* renamed from: n, reason: collision with root package name */
    public Function2 f35105n;

    /* renamed from: o, reason: collision with root package name */
    public Function2 f35106o;

    /* renamed from: p, reason: collision with root package name */
    public d0 f35107p;

    /* renamed from: q, reason: collision with root package name */
    public d f35108q;

    /* renamed from: r, reason: collision with root package name */
    public wy0 f35109r;

    /* renamed from: s, reason: collision with root package name */
    public f30 f35110s;

    /* renamed from: t, reason: collision with root package name */
    public c0 f35111t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommentPreviewView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 1);
        Intrinsics.checkNotNullParameter(context, "context");
        final int i13 = 1;
        this.f35103l = new o3(this, 1);
        this.f35104m = uq.d.f122995s;
        this.f35105n = r.f123021j;
        this.f35106o = r.f123022k;
        View.inflate(getContext(), ob2.d.pin_closeup_unified_comments_comment, this);
        setLayoutParams(new ConstraintLayout.LayoutParams(-1, -2));
        final int i14 = 0;
        setOnClickListener(new View.OnClickListener(this) { // from class: uq.m

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CommentPreviewView f123014b;

            {
                this.f123014b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i15 = i14;
                CommentPreviewView this$0 = this.f123014b;
                switch (i15) {
                    case 0:
                        int i16 = CommentPreviewView.f35094u;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.f35104m.invoke(p.Body);
                        break;
                    case 1:
                        int i17 = CommentPreviewView.f35094u;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.f35104m.invoke(p.Image);
                        break;
                    case 2:
                        int i18 = CommentPreviewView.f35094u;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.f35104m.invoke(p.Body);
                        break;
                    default:
                        int i19 = CommentPreviewView.f35094u;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.f35104m.invoke(p.Image);
                        break;
                }
            }
        });
        setTag("ROOT_TAG");
        View findViewById = findViewById(c.comment_avatar);
        GestaltAvatar gestaltAvatar = (GestaltAvatar) findViewById;
        gestaltAvatar.M2(new a(this) { // from class: uq.n

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CommentPreviewView f123016b;

            {
                this.f123016b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                int i15 = i14;
                CommentPreviewView this$0 = this.f123016b;
                switch (i15) {
                    case 0:
                        int i16 = CommentPreviewView.f35094u;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof rl1.t) {
                            this$0.f35104m.invoke(p.Avatar);
                            break;
                        }
                        break;
                    case 1:
                        int i17 = CommentPreviewView.f35094u;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "event");
                        if (it instanceof un1.b) {
                            this$0.f35104m.invoke(p.Body);
                            break;
                        }
                        break;
                    case 2:
                        int i18 = CommentPreviewView.f35094u;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "event");
                        if (it instanceof rn1.f) {
                            this$0.f35104m.invoke(p.Reply);
                            break;
                        }
                        break;
                    case 3:
                        int i19 = CommentPreviewView.f35094u;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof rl1.t) {
                            this$0.f35104m.invoke(p.Avatar);
                            break;
                        }
                        break;
                    case 4:
                        int i23 = CommentPreviewView.f35094u;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "event");
                        if (it instanceof un1.b) {
                            this$0.f35104m.invoke(p.Body);
                            break;
                        }
                        break;
                    default:
                        int i24 = CommentPreviewView.f35094u;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "event");
                        if (it instanceof rn1.f) {
                            this$0.f35104m.invoke(p.Reply);
                            break;
                        }
                        break;
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(findViewById, "apply(...)");
        this.f35097f = gestaltAvatar;
        View findViewById2 = findViewById(c.comment_text);
        GestaltPreviewTextView gestaltPreviewTextView = (GestaltPreviewTextView) findViewById2;
        gestaltPreviewTextView.i(uq.d.f122994r);
        gestaltPreviewTextView.j(new a(this) { // from class: uq.n

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CommentPreviewView f123016b;

            {
                this.f123016b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                int i15 = i13;
                CommentPreviewView this$0 = this.f123016b;
                switch (i15) {
                    case 0:
                        int i16 = CommentPreviewView.f35094u;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof rl1.t) {
                            this$0.f35104m.invoke(p.Avatar);
                            break;
                        }
                        break;
                    case 1:
                        int i17 = CommentPreviewView.f35094u;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "event");
                        if (it instanceof un1.b) {
                            this$0.f35104m.invoke(p.Body);
                            break;
                        }
                        break;
                    case 2:
                        int i18 = CommentPreviewView.f35094u;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "event");
                        if (it instanceof rn1.f) {
                            this$0.f35104m.invoke(p.Reply);
                            break;
                        }
                        break;
                    case 3:
                        int i19 = CommentPreviewView.f35094u;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof rl1.t) {
                            this$0.f35104m.invoke(p.Avatar);
                            break;
                        }
                        break;
                    case 4:
                        int i23 = CommentPreviewView.f35094u;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "event");
                        if (it instanceof un1.b) {
                            this$0.f35104m.invoke(p.Body);
                            break;
                        }
                        break;
                    default:
                        int i24 = CommentPreviewView.f35094u;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "event");
                        if (it instanceof rn1.f) {
                            this$0.f35104m.invoke(p.Reply);
                            break;
                        }
                        break;
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(findViewById2, "apply(...)");
        this.f35098g = gestaltPreviewTextView;
        View findViewById3 = findViewById(c.comment_image);
        WebImageView webImageView = (WebImageView) findViewById3;
        float dimensionPixelSize = webImageView.getResources().getDimensionPixelSize(eo1.c.lego_image_corner_radius);
        webImageView.g2(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        webImageView.setOnClickListener(new View.OnClickListener(this) { // from class: uq.m

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CommentPreviewView f123014b;

            {
                this.f123014b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i15 = i13;
                CommentPreviewView this$0 = this.f123014b;
                switch (i15) {
                    case 0:
                        int i16 = CommentPreviewView.f35094u;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.f35104m.invoke(p.Body);
                        break;
                    case 1:
                        int i17 = CommentPreviewView.f35094u;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.f35104m.invoke(p.Image);
                        break;
                    case 2:
                        int i18 = CommentPreviewView.f35094u;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.f35104m.invoke(p.Body);
                        break;
                    default:
                        int i19 = CommentPreviewView.f35094u;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.f35104m.invoke(p.Image);
                        break;
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(findViewById3, "apply(...)");
        this.f35099h = webImageView;
        View findViewById4 = findViewById(c.comment_reply);
        GestaltText gestaltText = (GestaltText) findViewById4;
        Intrinsics.f(gestaltText);
        a0.o(gestaltText, f.reply, new Object[0]);
        final int i15 = 2;
        gestaltText.j(new a(this) { // from class: uq.n

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CommentPreviewView f123016b;

            {
                this.f123016b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                int i152 = i15;
                CommentPreviewView this$0 = this.f123016b;
                switch (i152) {
                    case 0:
                        int i16 = CommentPreviewView.f35094u;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof rl1.t) {
                            this$0.f35104m.invoke(p.Avatar);
                            break;
                        }
                        break;
                    case 1:
                        int i17 = CommentPreviewView.f35094u;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "event");
                        if (it instanceof un1.b) {
                            this$0.f35104m.invoke(p.Body);
                            break;
                        }
                        break;
                    case 2:
                        int i18 = CommentPreviewView.f35094u;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "event");
                        if (it instanceof rn1.f) {
                            this$0.f35104m.invoke(p.Reply);
                            break;
                        }
                        break;
                    case 3:
                        int i19 = CommentPreviewView.f35094u;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof rl1.t) {
                            this$0.f35104m.invoke(p.Avatar);
                            break;
                        }
                        break;
                    case 4:
                        int i23 = CommentPreviewView.f35094u;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "event");
                        if (it instanceof un1.b) {
                            this$0.f35104m.invoke(p.Body);
                            break;
                        }
                        break;
                    default:
                        int i24 = CommentPreviewView.f35094u;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "event");
                        if (it instanceof rn1.f) {
                            this$0.f35104m.invoke(p.Reply);
                            break;
                        }
                        break;
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(findViewById4, "apply(...)");
        this.f35100i = gestaltText;
        View findViewById5 = findViewById(c.comment_reaction_indicator);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f35102k = (CommentReactionIndicator) findViewById5;
        View findViewById6 = findViewById(c.comment_translate);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        this.f35101j = (GestaltText) findViewById6;
        View findViewById7 = findViewById(c.comment_dot_separator);
        Intrinsics.checkNotNullExpressionValue(findViewById7, "findViewById(...)");
        View findViewById8 = findViewById(c.comment_view_all);
        Intrinsics.checkNotNullExpressionValue(findViewById8, "findViewById(...)");
    }

    @Override // nx.v
    public final Object markImpressionEnd() {
        c0 c0Var;
        c0 source = this.f35111t;
        if (source != null) {
            Intrinsics.checkNotNullParameter(source, "source");
            c0Var = new c0(source.f66887a, source.f66888b, b.c(TimeUnit.MILLISECONDS), source.f66890d, source.f66891e, source.f66892f, source.f66893g, source.f66894h, source.f66895i, source.f66896j);
        } else {
            c0Var = null;
        }
        this.f35111t = null;
        return c0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a7  */
    @Override // nx.v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object markImpressionStart() {
        /*
            r20 = this;
            r0 = r20
            h32.c0 r1 = r0.f35111t
            if (r1 == 0) goto L8
            goto Lbf
        L8:
            rp0.d r1 = r0.f35108q
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L15
            boolean r1 = r1.x()
            if (r1 != r3) goto L15
            r2 = r3
        L15:
            rp0.d r1 = r0.f35108q
            r4 = 0
            if (r1 == 0) goto L1f
            java.lang.String r1 = r1.k()
            goto L20
        L1f:
            r1 = r4
        L20:
            java.lang.String r5 = "aggregatedcomment"
            boolean r6 = kotlin.jvm.internal.Intrinsics.d(r1, r5)
            java.lang.String r7 = "didIt"
            java.lang.String r8 = "aggregatedComment"
            if (r6 == 0) goto L2f
            r19 = r8
            goto L3e
        L2f:
            java.lang.String r6 = "userdiditdata"
            boolean r1 = kotlin.jvm.internal.Intrinsics.d(r1, r6)
            if (r1 == 0) goto L3a
            r19 = r7
            goto L3e
        L3a:
            java.lang.String r1 = ""
            r19 = r1
        L3e:
            rp0.d r1 = r0.f35108q
            java.lang.String r6 = "pin"
            if (r1 == 0) goto L66
            boolean r1 = r1.x()
            if (r1 != r3) goto L66
            rp0.d r1 = r0.f35108q
            if (r1 == 0) goto L62
            kotlin.Pair r1 = r1.t()
            if (r1 == 0) goto L62
            java.lang.Object r9 = r1.f80347b
            boolean r5 = kotlin.jvm.internal.Intrinsics.d(r9, r5)
            if (r5 == 0) goto L5d
            r7 = r8
        L5d:
            java.lang.Object r1 = r1.f80346a
            r18 = r7
            goto L72
        L62:
            r1 = r4
            r18 = r1
            goto L72
        L66:
            com.pinterest.api.model.f30 r1 = r0.f35110s
            if (r1 == 0) goto L6f
            java.lang.String r1 = r1.getId()
            goto L70
        L6f:
            r1 = r4
        L70:
            r18 = r6
        L72:
            com.pinterest.api.model.f30 r5 = r0.f35110s
            if (r5 == 0) goto L7b
            java.lang.String r5 = r5.w6()
            goto L7c
        L7b:
            r5 = r4
        L7c:
            if (r5 == 0) goto L83
            java.lang.String r3 = "story"
        L80:
            r16 = r3
            goto L92
        L83:
            com.pinterest.api.model.f30 r5 = r0.f35110s
            if (r5 == 0) goto L90
            boolean r5 = com.pinterest.api.model.b40.X0(r5)
            if (r5 != r3) goto L90
            java.lang.String r3 = "video"
            goto L80
        L90:
            r16 = r6
        L92:
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.lang.Long r11 = jq.b.c(r3)
            short r2 = (short) r2
            java.lang.Short r13 = java.lang.Short.valueOf(r2)
            rp0.d r2 = r0.f35108q
            if (r2 == 0) goto La7
            java.lang.String r2 = r2.v()
            r10 = r2
            goto La8
        La7:
            r10 = r4
        La8:
            r17 = r1
            java.lang.String r17 = (java.lang.String) r17
            com.pinterest.api.model.f30 r1 = r0.f35110s
            if (r1 == 0) goto Lb4
            java.lang.String r4 = r1.getId()
        Lb4:
            r14 = r4
            h32.c0 r1 = new h32.c0
            r15 = 0
            r9 = r1
            r12 = r15
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r0.f35111t = r1
        Lbf:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pinterest.activity.pin.view.unifiedcomments.CommentPreviewView.markImpressionStart():java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommentPreviewView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13, 1, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f35103l = new o3(this, 1);
        this.f35104m = uq.d.f122995s;
        this.f35105n = r.f123021j;
        this.f35106o = r.f123022k;
        View.inflate(getContext(), ob2.d.pin_closeup_unified_comments_comment, this);
        setLayoutParams(new ConstraintLayout.LayoutParams(-1, -2));
        final int i14 = 2;
        setOnClickListener(new View.OnClickListener(this) { // from class: uq.m

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CommentPreviewView f123014b;

            {
                this.f123014b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i15 = i14;
                CommentPreviewView this$0 = this.f123014b;
                switch (i15) {
                    case 0:
                        int i16 = CommentPreviewView.f35094u;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.f35104m.invoke(p.Body);
                        break;
                    case 1:
                        int i17 = CommentPreviewView.f35094u;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.f35104m.invoke(p.Image);
                        break;
                    case 2:
                        int i18 = CommentPreviewView.f35094u;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.f35104m.invoke(p.Body);
                        break;
                    default:
                        int i19 = CommentPreviewView.f35094u;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.f35104m.invoke(p.Image);
                        break;
                }
            }
        });
        setTag("ROOT_TAG");
        View findViewById = findViewById(c.comment_avatar);
        GestaltAvatar gestaltAvatar = (GestaltAvatar) findViewById;
        final int i15 = 3;
        gestaltAvatar.M2(new a(this) { // from class: uq.n

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CommentPreviewView f123016b;

            {
                this.f123016b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                int i152 = i15;
                CommentPreviewView this$0 = this.f123016b;
                switch (i152) {
                    case 0:
                        int i16 = CommentPreviewView.f35094u;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof rl1.t) {
                            this$0.f35104m.invoke(p.Avatar);
                            break;
                        }
                        break;
                    case 1:
                        int i17 = CommentPreviewView.f35094u;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "event");
                        if (it instanceof un1.b) {
                            this$0.f35104m.invoke(p.Body);
                            break;
                        }
                        break;
                    case 2:
                        int i18 = CommentPreviewView.f35094u;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "event");
                        if (it instanceof rn1.f) {
                            this$0.f35104m.invoke(p.Reply);
                            break;
                        }
                        break;
                    case 3:
                        int i19 = CommentPreviewView.f35094u;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof rl1.t) {
                            this$0.f35104m.invoke(p.Avatar);
                            break;
                        }
                        break;
                    case 4:
                        int i23 = CommentPreviewView.f35094u;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "event");
                        if (it instanceof un1.b) {
                            this$0.f35104m.invoke(p.Body);
                            break;
                        }
                        break;
                    default:
                        int i24 = CommentPreviewView.f35094u;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "event");
                        if (it instanceof rn1.f) {
                            this$0.f35104m.invoke(p.Reply);
                            break;
                        }
                        break;
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(findViewById, "apply(...)");
        this.f35097f = gestaltAvatar;
        View findViewById2 = findViewById(c.comment_text);
        GestaltPreviewTextView gestaltPreviewTextView = (GestaltPreviewTextView) findViewById2;
        gestaltPreviewTextView.i(uq.d.f122994r);
        final int i16 = 4;
        gestaltPreviewTextView.j(new a(this) { // from class: uq.n

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CommentPreviewView f123016b;

            {
                this.f123016b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                int i152 = i16;
                CommentPreviewView this$0 = this.f123016b;
                switch (i152) {
                    case 0:
                        int i162 = CommentPreviewView.f35094u;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof rl1.t) {
                            this$0.f35104m.invoke(p.Avatar);
                            break;
                        }
                        break;
                    case 1:
                        int i17 = CommentPreviewView.f35094u;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "event");
                        if (it instanceof un1.b) {
                            this$0.f35104m.invoke(p.Body);
                            break;
                        }
                        break;
                    case 2:
                        int i18 = CommentPreviewView.f35094u;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "event");
                        if (it instanceof rn1.f) {
                            this$0.f35104m.invoke(p.Reply);
                            break;
                        }
                        break;
                    case 3:
                        int i19 = CommentPreviewView.f35094u;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof rl1.t) {
                            this$0.f35104m.invoke(p.Avatar);
                            break;
                        }
                        break;
                    case 4:
                        int i23 = CommentPreviewView.f35094u;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "event");
                        if (it instanceof un1.b) {
                            this$0.f35104m.invoke(p.Body);
                            break;
                        }
                        break;
                    default:
                        int i24 = CommentPreviewView.f35094u;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "event");
                        if (it instanceof rn1.f) {
                            this$0.f35104m.invoke(p.Reply);
                            break;
                        }
                        break;
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(findViewById2, "apply(...)");
        this.f35098g = gestaltPreviewTextView;
        View findViewById3 = findViewById(c.comment_image);
        WebImageView webImageView = (WebImageView) findViewById3;
        float dimensionPixelSize = webImageView.getResources().getDimensionPixelSize(eo1.c.lego_image_corner_radius);
        webImageView.g2(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        webImageView.setOnClickListener(new View.OnClickListener(this) { // from class: uq.m

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CommentPreviewView f123014b;

            {
                this.f123014b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i152 = i15;
                CommentPreviewView this$0 = this.f123014b;
                switch (i152) {
                    case 0:
                        int i162 = CommentPreviewView.f35094u;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.f35104m.invoke(p.Body);
                        break;
                    case 1:
                        int i17 = CommentPreviewView.f35094u;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.f35104m.invoke(p.Image);
                        break;
                    case 2:
                        int i18 = CommentPreviewView.f35094u;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.f35104m.invoke(p.Body);
                        break;
                    default:
                        int i19 = CommentPreviewView.f35094u;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.f35104m.invoke(p.Image);
                        break;
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(findViewById3, "apply(...)");
        this.f35099h = webImageView;
        View findViewById4 = findViewById(c.comment_reply);
        GestaltText gestaltText = (GestaltText) findViewById4;
        Intrinsics.f(gestaltText);
        a0.o(gestaltText, f.reply, new Object[0]);
        final int i17 = 5;
        gestaltText.j(new a(this) { // from class: uq.n

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CommentPreviewView f123016b;

            {
                this.f123016b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                int i152 = i17;
                CommentPreviewView this$0 = this.f123016b;
                switch (i152) {
                    case 0:
                        int i162 = CommentPreviewView.f35094u;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof rl1.t) {
                            this$0.f35104m.invoke(p.Avatar);
                            break;
                        }
                        break;
                    case 1:
                        int i172 = CommentPreviewView.f35094u;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "event");
                        if (it instanceof un1.b) {
                            this$0.f35104m.invoke(p.Body);
                            break;
                        }
                        break;
                    case 2:
                        int i18 = CommentPreviewView.f35094u;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "event");
                        if (it instanceof rn1.f) {
                            this$0.f35104m.invoke(p.Reply);
                            break;
                        }
                        break;
                    case 3:
                        int i19 = CommentPreviewView.f35094u;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof rl1.t) {
                            this$0.f35104m.invoke(p.Avatar);
                            break;
                        }
                        break;
                    case 4:
                        int i23 = CommentPreviewView.f35094u;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "event");
                        if (it instanceof un1.b) {
                            this$0.f35104m.invoke(p.Body);
                            break;
                        }
                        break;
                    default:
                        int i24 = CommentPreviewView.f35094u;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "event");
                        if (it instanceof rn1.f) {
                            this$0.f35104m.invoke(p.Reply);
                            break;
                        }
                        break;
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(findViewById4, "apply(...)");
        this.f35100i = gestaltText;
        View findViewById5 = findViewById(c.comment_reaction_indicator);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f35102k = (CommentReactionIndicator) findViewById5;
        View findViewById6 = findViewById(c.comment_translate);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        this.f35101j = (GestaltText) findViewById6;
        View findViewById7 = findViewById(c.comment_dot_separator);
        Intrinsics.checkNotNullExpressionValue(findViewById7, "findViewById(...)");
        View findViewById8 = findViewById(c.comment_view_all);
        Intrinsics.checkNotNullExpressionValue(findViewById8, "findViewById(...)");
    }
}
