package com.pinterest.feature.newshub.detail.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import av1.c;
import com.pinterest.activity.newshub.view.header.NewsHubMultiUserAvatar;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yk1.n;
import zu1.d;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB#\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/pinterest/feature/newshub/detail/view/NewsHubDetailContentView;", "Landroid/widget/LinearLayout;", "Lyk1/n;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "newsHub_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class NewsHubDetailContentView extends LinearLayout implements n {

    /* renamed from: a, reason: collision with root package name */
    public final NewsHubMultiUserAvatar f46788a;

    /* renamed from: b, reason: collision with root package name */
    public final GestaltText f46789b;

    /* renamed from: c, reason: collision with root package name */
    public final GestaltText f46790c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewsHubDetailContentView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(getContext(), d.news_hub_detail_item_text, this);
        View findViewById = findViewById(c.news_hub_header_multi_user);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f46788a = (NewsHubMultiUserAvatar) findViewById;
        View findViewById2 = findViewById(c.news_hub_header_text);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f46789b = (GestaltText) findViewById2;
        View findViewById3 = findViewById(zu1.c.news_hub_content_text);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f46790c = (GestaltText) findViewById3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewsHubDetailContentView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(getContext(), d.news_hub_detail_item_text, this);
        View findViewById = findViewById(c.news_hub_header_multi_user);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f46788a = (NewsHubMultiUserAvatar) findViewById;
        View findViewById2 = findViewById(c.news_hub_header_text);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f46789b = (GestaltText) findViewById2;
        View findViewById3 = findViewById(zu1.c.news_hub_content_text);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f46790c = (GestaltText) findViewById3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewsHubDetailContentView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(getContext(), d.news_hub_detail_item_text, this);
        View findViewById = findViewById(c.news_hub_header_multi_user);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f46788a = (NewsHubMultiUserAvatar) findViewById;
        View findViewById2 = findViewById(c.news_hub_header_text);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f46789b = (GestaltText) findViewById2;
        View findViewById3 = findViewById(zu1.c.news_hub_content_text);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f46790c = (GestaltText) findViewById3;
    }
}
