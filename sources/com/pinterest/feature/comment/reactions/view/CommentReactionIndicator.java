package com.pinterest.feature.comment.reactions.view;

import af2.c;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.pinterest.feature.comment.reactions.view.CommentReactionIndicator;
import com.pinterest.gestalt.text.GestaltText;
import java.util.WeakHashMap;
import kh2.b0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import q5.m0;
import q5.v0;
import qp0.b;
import w80.e0;
import ye2.o;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/pinterest/feature/comment/reactions/view/CommentReactionIndicator;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "commentReactionsLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class CommentReactionIndicator extends ConstraintLayout implements c {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f45475g = 0;

    /* renamed from: a, reason: collision with root package name */
    public o f45476a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f45477b;

    /* renamed from: c, reason: collision with root package name */
    public final ImageView f45478c;

    /* renamed from: d, reason: collision with root package name */
    public final ImageView f45479d;

    /* renamed from: e, reason: collision with root package name */
    public final ImageView f45480e;

    /* renamed from: f, reason: collision with root package name */
    public final GestaltText f45481f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommentReactionIndicator(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        if (!this.f45477b) {
            this.f45477b = true;
            ((b) generatedComponent()).getClass();
        }
        View.inflate(getContext(), cb0.c.comment_reaction_indicator, this);
        View findViewById = findViewById(cb0.b.reaction_indicator_empty_state);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f45478c = (ImageView) findViewById;
        View findViewById2 = findViewById(cb0.b.love_reaction_indicator);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        ImageView imageView = (ImageView) findViewById2;
        this.f45479d = imageView;
        View findViewById3 = findViewById(cb0.b.helpful_reaction_indicator);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        ImageView imageView2 = (ImageView) findViewById3;
        this.f45480e = imageView2;
        View findViewById4 = findViewById(cb0.b.comment_reactions_count);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f45481f = (GestaltText) findViewById4;
        View findViewById5 = findViewById(cb0.b.reaction_indicator_icons);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        WeakHashMap weakHashMap = v0.f102521a;
        m0.q(imageView, m0.h(imageView2) + 1);
    }

    public final Rect L() {
        ImageView imageView = this.f45479d;
        if (imageView.getVisibility() != 0) {
            imageView = this.f45480e;
            if (imageView.getVisibility() != 0) {
                imageView = this.f45478c;
            }
        }
        Rect R0 = bs1.c.R0(imageView);
        R0.left = getPaddingStart() + R0.left;
        R0.top = getPaddingTop() + R0.top;
        R0.right -= getPaddingEnd();
        R0.bottom -= getPaddingBottom();
        return R0;
    }

    public final void T(Function1 handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        e0 e0Var = new e0(2, handler);
        ImageView imageView = this.f45478c;
        imageView.setOnClickListener(e0Var);
        e0 e0Var2 = new e0(3, handler);
        ImageView imageView2 = this.f45479d;
        imageView2.setOnClickListener(e0Var2);
        e0 e0Var3 = new e0(4, handler);
        ImageView imageView3 = this.f45480e;
        imageView3.setOnClickListener(e0Var3);
        e0 e0Var4 = new e0(5, handler);
        GestaltText gestaltText = this.f45481f;
        gestaltText.k(e0Var4);
        b0.c0(imageView);
        b0.c0(imageView2);
        b0.c0(imageView3);
        b0.c0(gestaltText);
    }

    public final void X(final Function1 handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        final int i13 = 0;
        this.f45478c.setOnLongClickListener(new View.OnLongClickListener() { // from class: qp0.a
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                int i14 = i13;
                Function1 tmp0 = handler;
                switch (i14) {
                    case 0:
                        int i15 = CommentReactionIndicator.f45475g;
                        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                        break;
                    case 1:
                        int i16 = CommentReactionIndicator.f45475g;
                        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                        break;
                    case 2:
                        int i17 = CommentReactionIndicator.f45475g;
                        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                        break;
                    default:
                        int i18 = CommentReactionIndicator.f45475g;
                        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                        break;
                }
                return ((Boolean) tmp0.invoke(view)).booleanValue();
            }
        });
        final int i14 = 1;
        this.f45479d.setOnLongClickListener(new View.OnLongClickListener() { // from class: qp0.a
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                int i142 = i14;
                Function1 tmp0 = handler;
                switch (i142) {
                    case 0:
                        int i15 = CommentReactionIndicator.f45475g;
                        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                        break;
                    case 1:
                        int i16 = CommentReactionIndicator.f45475g;
                        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                        break;
                    case 2:
                        int i17 = CommentReactionIndicator.f45475g;
                        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                        break;
                    default:
                        int i18 = CommentReactionIndicator.f45475g;
                        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                        break;
                }
                return ((Boolean) tmp0.invoke(view)).booleanValue();
            }
        });
        final int i15 = 2;
        this.f45480e.setOnLongClickListener(new View.OnLongClickListener() { // from class: qp0.a
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                int i142 = i15;
                Function1 tmp0 = handler;
                switch (i142) {
                    case 0:
                        int i152 = CommentReactionIndicator.f45475g;
                        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                        break;
                    case 1:
                        int i16 = CommentReactionIndicator.f45475g;
                        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                        break;
                    case 2:
                        int i17 = CommentReactionIndicator.f45475g;
                        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                        break;
                    default:
                        int i18 = CommentReactionIndicator.f45475g;
                        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                        break;
                }
                return ((Boolean) tmp0.invoke(view)).booleanValue();
            }
        });
        final int i16 = 3;
        View.OnLongClickListener onLongClickListener = new View.OnLongClickListener() { // from class: qp0.a
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                int i142 = i16;
                Function1 tmp0 = handler;
                switch (i142) {
                    case 0:
                        int i152 = CommentReactionIndicator.f45475g;
                        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                        break;
                    case 1:
                        int i162 = CommentReactionIndicator.f45475g;
                        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                        break;
                    case 2:
                        int i17 = CommentReactionIndicator.f45475g;
                        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                        break;
                    default:
                        int i18 = CommentReactionIndicator.f45475g;
                        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                        break;
                }
                return ((Boolean) tmp0.invoke(view)).booleanValue();
            }
        };
        GestaltText gestaltText = this.f45481f;
        gestaltText.f49642f = onLongClickListener;
        gestaltText.n(false);
    }

    @Override // af2.c
    public final af2.b componentManager() {
        if (this.f45476a == null) {
            this.f45476a = new o(this);
        }
        return this.f45476a;
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f45476a == null) {
            this.f45476a = new o(this);
        }
        return this.f45476a.generatedComponent();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommentReactionIndicator(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        if (!this.f45477b) {
            this.f45477b = true;
            ((b) generatedComponent()).getClass();
        }
        View.inflate(getContext(), cb0.c.comment_reaction_indicator, this);
        View findViewById = findViewById(cb0.b.reaction_indicator_empty_state);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f45478c = (ImageView) findViewById;
        View findViewById2 = findViewById(cb0.b.love_reaction_indicator);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        ImageView imageView = (ImageView) findViewById2;
        this.f45479d = imageView;
        View findViewById3 = findViewById(cb0.b.helpful_reaction_indicator);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        ImageView imageView2 = (ImageView) findViewById3;
        this.f45480e = imageView2;
        View findViewById4 = findViewById(cb0.b.comment_reactions_count);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f45481f = (GestaltText) findViewById4;
        View findViewById5 = findViewById(cb0.b.reaction_indicator_icons);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        WeakHashMap weakHashMap = v0.f102521a;
        m0.q(imageView, m0.h(imageView2) + 1);
    }
}
