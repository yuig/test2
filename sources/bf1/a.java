package bf1;

import android.content.Context;
import android.widget.LinearLayout;
import java.util.List;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import m60.r0;
import nx.v;
import q21.h;
import yk1.d;

/* loaded from: classes5.dex */
public final class a extends LinearLayout implements d, v {

    /* renamed from: a, reason: collision with root package name */
    public final int f22743a;

    /* renamed from: b, reason: collision with root package name */
    public final int f22744b;

    /* renamed from: c, reason: collision with root package name */
    public h f22745c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(r0.margin);
        this.f22743a = dimensionPixelOffset;
        this.f22744b = getResources().getDimensionPixelOffset(r0.margin_half);
        setOrientation(1);
        setGravity(17);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        setPaddingRelative(dimensionPixelOffset, 0, dimensionPixelOffset, 0);
        setLayoutParams(layoutParams);
    }

    @Override // nx.v
    public final List getChildImpressionViews() {
        h hVar = this.f22745c;
        if (hVar == null) {
            return null;
        }
        Intrinsics.g(hVar, "null cannot be cast to non-null type android.view.View");
        return e0.b(hVar);
    }

    @Override // nx.v
    public final /* bridge */ /* synthetic */ Object markImpressionEnd() {
        return null;
    }

    @Override // nx.v
    public final /* bridge */ /* synthetic */ Object markImpressionStart() {
        return null;
    }
}
