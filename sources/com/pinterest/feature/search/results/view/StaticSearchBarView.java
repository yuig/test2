package com.pinterest.feature.search.results.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.pinterest.gestalt.text.GestaltText;
import kh2.j1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import q5.v0;

@xk2.d
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000bB\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\f"}, d2 = {"Lcom/pinterest/feature/search/results/view/StaticSearchBarView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "com/pinterest/feature/search/results/view/n0", "searchBarLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class StaticSearchBarView extends LinearLayout {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f47752g = 0;

    /* renamed from: a, reason: collision with root package name */
    public LinearLayout f47753a;

    /* renamed from: b, reason: collision with root package name */
    public ImageView f47754b;

    /* renamed from: c, reason: collision with root package name */
    public GestaltText f47755c;

    /* renamed from: d, reason: collision with root package name */
    public ImageView f47756d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f47757e;

    /* renamed from: f, reason: collision with root package name */
    public n0 f47758f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StaticSearchBarView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        a();
    }

    public final void a() {
        View.inflate(getContext(), i42.b.view_static_search_bar, this);
        View findViewById = findViewById(i42.a.static_search_bar);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f47753a = (LinearLayout) findViewById;
        View findViewById2 = findViewById(i42.a.search_icon);
        ImageView imageView = (ImageView) findViewById2;
        final int i13 = 0;
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: com.pinterest.feature.search.results.view.m0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StaticSearchBarView f47818b;

            {
                this.f47818b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i14 = i13;
                StaticSearchBarView this$0 = this.f47818b;
                switch (i14) {
                    case 0:
                        int i15 = StaticSearchBarView.f47752g;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.getClass();
                        break;
                    default:
                        int i16 = StaticSearchBarView.f47752g;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        n0 n0Var = this$0.f47758f;
                        if (n0Var != null) {
                            n0Var.l();
                            break;
                        }
                        break;
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(findViewById2, "apply(...)");
        this.f47754b = imageView;
        this.f47755c = ((GestaltText) findViewById(i42.a.search_tv)).j(new l11.p(this, 14));
        View findViewById3 = findViewById(cn1.f0.static_search_bar_trailing_icon);
        ImageView imageView2 = (ImageView) findViewById3;
        final int i14 = 1;
        imageView2.setOnClickListener(new View.OnClickListener(this) { // from class: com.pinterest.feature.search.results.view.m0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StaticSearchBarView f47818b;

            {
                this.f47818b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i142 = i14;
                StaticSearchBarView this$0 = this.f47818b;
                switch (i142) {
                    case 0:
                        int i15 = StaticSearchBarView.f47752g;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.getClass();
                        break;
                    default:
                        int i16 = StaticSearchBarView.f47752g;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        n0 n0Var = this$0.f47758f;
                        if (n0Var != null) {
                            n0Var.l();
                            break;
                        }
                        break;
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(findViewById3, "apply(...)");
        this.f47756d = imageView2;
        GestaltText gestaltText = this.f47755c;
        if (gestaltText != null) {
            v0.o(gestaltText, new kj.d(this, 5));
        } else {
            Intrinsics.r("searchTextView");
            throw null;
        }
    }

    public final void b(int i13) {
        ImageView imageView = this.f47754b;
        if (imageView == null) {
            Intrinsics.r("searchIcon");
            throw null;
        }
        Context context = getContext();
        Object obj = d5.a.f53679a;
        imageView.setImageTintList(ColorStateList.valueOf(context.getColor(i13)));
        ImageView imageView2 = this.f47756d;
        if (imageView2 == null) {
            Intrinsics.r("lensIcon");
            throw null;
        }
        imageView2.setImageTintList(ColorStateList.valueOf(getContext().getColor(i13)));
        GestaltText gestaltText = this.f47755c;
        if (gestaltText != null) {
            j1.p1(gestaltText, i13);
        } else {
            Intrinsics.r("searchTextView");
            throw null;
        }
    }

    public final void c(boolean z13) {
        this.f47757e = z13;
    }

    public final void d(n0 n0Var) {
        this.f47758f = n0Var;
    }

    public final void e(String queryText) {
        Intrinsics.checkNotNullParameter(queryText, "queryText");
        GestaltText gestaltText = this.f47755c;
        if (gestaltText != null) {
            gestaltText.i(new b31.f(queryText, 17));
        } else {
            Intrinsics.r("searchTextView");
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StaticSearchBarView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        a();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StaticSearchBarView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        a();
    }
}
