package xa1;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.jvm.internal.Intrinsics;
import m60.r0;

/* loaded from: classes5.dex */
public final class h extends LinearLayout implements yk1.n {

    /* renamed from: a, reason: collision with root package name */
    public final vb0.l f134452a;

    /* renamed from: b, reason: collision with root package name */
    public final GestaltText f134453b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Context context, vb0.l manifestInfo) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(manifestInfo, "manifestInfo");
        this.f134452a = manifestInfo;
        GestaltText gestaltText = new GestaltText(6, context, (AttributeSet) null);
        this.f134453b = gestaltText;
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        int dimensionPixelSize = getResources().getDimensionPixelSize(r0.margin);
        setPaddingRelative(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, 0);
        addView(gestaltText);
    }
}
