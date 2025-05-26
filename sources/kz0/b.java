package kz0;

import android.content.Context;
import android.widget.LinearLayout;
import kotlin.jvm.internal.Intrinsics;
import nx.d0;

/* loaded from: classes5.dex */
public final class b extends LinearLayout {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f81139b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final d0 f81140a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context, d0 pinalytics) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        this.f81140a = pinalytics;
        setOrientation(1);
        setGravity(1);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
    }
}
