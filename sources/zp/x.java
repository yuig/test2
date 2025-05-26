package zp;

import android.content.Context;
import android.widget.LinearLayout;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class x extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    public final y f142575a;

    /* renamed from: b, reason: collision with root package name */
    public final b f142576b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f142577c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(Context context, y toggleItemViewListener, b allPinsVisibility, boolean z13) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(toggleItemViewListener, "toggleItemViewListener");
        Intrinsics.checkNotNullParameter(allPinsVisibility, "allPinsVisibility");
        this.f142575a = toggleItemViewListener;
        this.f142576b = allPinsVisibility;
        this.f142577c = z13;
        setOrientation(1);
        int W = bs1.c.W(this, eo1.c.space_400);
        setPaddingRelative(W, W, W, W);
    }
}
