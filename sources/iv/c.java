package iv;

import android.content.Context;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.c1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class c extends c1 {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ float f73725q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(float f13, Context context) {
        super(context);
        this.f73725q = f13;
    }

    @Override // androidx.recyclerview.widget.c1
    public final float n(DisplayMetrics displayMetrics) {
        Intrinsics.checkNotNullParameter(displayMetrics, "displayMetrics");
        return this.f73725q / displayMetrics.densityDpi;
    }
}
