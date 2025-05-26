package nu0;

import ac2.e1;
import ac2.q1;
import android.content.res.Resources;
import com.pinterest.feature.ideaPinCreation.drafts.view.IdeaPinDraftPreview;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import u50.f0;

/* loaded from: classes5.dex */
public final class d extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f92319i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ IdeaPinDraftPreview f92320j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f92321k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(long j13, IdeaPinDraftPreview ideaPinDraftPreview, int i13) {
        super(1);
        this.f92319i = j13;
        this.f92320j = ideaPinDraftPreview;
        this.f92321k = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        rn1.a it = (rn1.a) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        f0 h23 = bs1.c.h2(ac2.d.a(this.f92319i, q1.VIDEO_DRAFT, e1.ROUND));
        fm1.c cVar = fm1.c.VISIBLE;
        Resources resources = this.f92320j.getResources();
        int i13 = aq1.g.accessibility_pin_drafts_duration;
        int i14 = this.f92321k;
        String quantityString = resources.getQuantityString(i13, i14, Integer.valueOf(i14));
        Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
        return rn1.a.y(it, h23, null, null, null, null, 0, cVar, null, null, null, false, 0, bs1.c.h2(quantityString), null, null, null, null, false, null, null, 2092478);
    }
}
