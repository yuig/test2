package te0;

import android.graphics.Typeface;
import android.widget.TextView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b implements d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TextView f117482a;

    public b(TextView textView) {
        this.f117482a = textView;
    }

    @Override // te0.d
    public final void a(Typeface typeface) {
        Intrinsics.checkNotNullParameter(typeface, "typeface");
        this.f117482a.setTypeface(typeface);
    }
}
