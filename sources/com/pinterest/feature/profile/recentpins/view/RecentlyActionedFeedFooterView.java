package com.pinterest.feature.profile.recentpins.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import l11.p;
import m60.x0;
import nz1.c;
import nz1.d;
import org.jetbrains.annotations.NotNull;
import pk.a0;
import x41.a;
import x41.b;
import yk1.n;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/pinterest/feature/profile/recentpins/view/RecentlyActionedFeedFooterView;", "Landroid/widget/FrameLayout;", "Lyk1/n;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "profile_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class RecentlyActionedFeedFooterView extends FrameLayout implements n {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f47565c = 0;

    /* renamed from: a, reason: collision with root package name */
    public b f47566a;

    /* renamed from: b, reason: collision with root package name */
    public a f47567b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RecentlyActionedFeedFooterView(@NotNull Context context, AttributeSet attributeSet) {
        this(4, context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ RecentlyActionedFeedFooterView(int i13, Context context, AttributeSet attributeSet) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecentlyActionedFeedFooterView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        String string;
        Intrinsics.checkNotNullParameter(context, "context");
        this.f47567b = a.RECENTLY_VIEWED;
        View.inflate(context, d.recently_actioned_feed_footer_view, this);
        View findViewById = findViewById(c.feed_end_message_tv);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        GestaltText gestaltText = (GestaltText) findViewById;
        View findViewById2 = findViewById(c.search_btn);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        ((GestaltButton) findViewById2).e(new p(this, 7));
        if (hf0.b.q()) {
            gestaltText.i(a51.a.f782i);
        }
        int i14 = a51.b.f783a[this.f47567b.ordinal()];
        if (i14 == 1) {
            string = getResources().getString(x0.end_of_recently_viewed_feed);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        } else {
            if (i14 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            string = getResources().getString(x0.end_of_recently_saved_feed);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        }
        a0.p(gestaltText, string);
    }
}
