package kx0;

import android.content.Context;
import android.view.View;
import com.pinterest.activity.newshub.view.header.NewsHubMultiUserAvatar;
import com.pinterest.feature.newshub.view.content.NewsHubImpressionContainer;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class s extends NewsHubImpressionContainer implements yk1.n {

    /* renamed from: b, reason: collision with root package name */
    public final NewsHubMultiUserAvatar f81083b;

    /* renamed from: c, reason: collision with root package name */
    public final GestaltText f81084c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(context, zu1.d.news_hub_detail_item_header_lego, this);
        View findViewById = findViewById(av1.c.news_hub_header_multi_user);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f81083b = (NewsHubMultiUserAvatar) findViewById;
        View findViewById2 = findViewById(av1.c.news_hub_header_text);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f81084c = (GestaltText) findViewById2;
    }
}
