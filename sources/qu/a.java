package qu;

import android.content.Context;
import android.util.AttributeSet;
import com.pinterest.ads.feature.owc.view.core.AdsBrowserBottomSheet;
import kotlin.jvm.internal.Intrinsics;
import pu.b;
import u50.r;

/* loaded from: classes3.dex */
public class a extends AdsBrowserBottomSheet {

    /* renamed from: u, reason: collision with root package name */
    public final r f105144u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, AttributeSet attributeSet, int i13, r eventIntake) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
        this.f105144u = eventIntake;
    }

    @Override // com.pinterest.ads.feature.owc.view.core.AdsBrowserBottomSheet, cu.i
    public void o() {
        this.f105144u.a(b.f101331a);
    }
}
