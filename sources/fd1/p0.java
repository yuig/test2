package fd1;

import android.content.Context;
import android.util.AttributeSet;
import com.pinterest.feature.sharesheet.view.SharesheetModalAppListView;
import com.pinterest.feature.sharesheet.view.SharesheetModalAppView;
import com.pinterest.feature.sharesheet.view.SharesheetModalAppWithBadgeView;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class p0 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f61988i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ SharesheetModalAppListView f61989j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p0(SharesheetModalAppListView sharesheetModalAppListView, int i13) {
        super(0);
        this.f61988i = i13;
        this.f61989j = sharesheetModalAppListView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f61988i;
        SharesheetModalAppListView sharesheetModalAppListView = this.f61989j;
        switch (i13) {
            case 0:
                Context context = sharesheetModalAppListView.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                return new SharesheetModalAppView(context);
            default:
                Context context2 = sharesheetModalAppListView.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                return new SharesheetModalAppWithBadgeView(6, context2, (AttributeSet) null);
        }
    }
}
