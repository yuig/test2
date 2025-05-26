package yu;

import android.content.Context;
import android.util.AttributeSet;
import com.pinterest.ads.feature.owc.view.showcase.subpage.AdsShowcaseSubpageItemView;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import ps.p;

/* loaded from: classes3.dex */
public final class e extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f140144i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ f f140145j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(f fVar, int i13) {
        super(0);
        this.f140144i = i13;
        this.f140145j = fVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f140144i;
        f fVar = this.f140145j;
        switch (i13) {
            case 0:
                Context context = fVar.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                return new AdsShowcaseSubpageItemView(6, context, (AttributeSet) null);
            default:
                return (GestaltText) fVar.findViewById(p.showcase_subpage_carousel_title);
        }
    }
}
