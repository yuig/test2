package mv0;

import android.content.Context;
import android.widget.LinearLayout;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a extends LinearLayout implements jv0.a {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f88320d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Function2 f88321a;

    /* renamed from: b, reason: collision with root package name */
    public final Function0 f88322b;

    /* renamed from: c, reason: collision with root package name */
    public int f88323c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, gv0.b updateSelectedPosition, h updateViews) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(updateSelectedPosition, "updateSelectedPosition");
        Intrinsics.checkNotNullParameter(updateViews, "updateViews");
        this.f88321a = updateSelectedPosition;
        this.f88322b = updateViews;
    }
}
