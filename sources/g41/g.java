package g41;

import android.content.Context;
import android.widget.FrameLayout;
import c2.m4;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import u50.h0;

/* loaded from: classes5.dex */
public final class g extends FrameLayout implements yk1.n {

    /* renamed from: a, reason: collision with root package name */
    public final GestaltText f63506a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        GestaltText gestaltText = new GestaltText(context, new rn1.a(h0.f120562a, null, e0.b(vn1.b.CENTER), null, null, 0, null, null, null, null, false, 0, null, null, null, false, null, null, 2097146));
        this.f63506a = gestaltText;
        setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        addView(gestaltText, new FrameLayout.LayoutParams(-1, -1));
    }

    public final void a(int i13) {
        this.f63506a.i(new m4(i13, this, 11));
    }
}
