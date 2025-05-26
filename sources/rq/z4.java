package rq;

import android.content.Context;
import android.widget.LinearLayout;
import com.pinterest.gestalt.text.GestaltText;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class z4 extends LinearLayout implements i01.d0, nx.v {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f109686a;

    /* renamed from: b, reason: collision with root package name */
    public GestaltText f109687b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f109688c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z4(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f109686a = true;
        this.f109688c = new HashMap();
        setOrientation(1);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        a();
    }

    public final void a() {
        int W = bs1.c.W(this, eo1.c.space_200);
        int W2 = bs1.c.W(this, eo1.c.space_600);
        setBackground(bs1.c.f0(this, this.f109686a ? r80.b.pin_closeup_redesign_module_background : r80.b.pin_closeup_module_background, null, null, 6));
        setGravity(8388611);
        setPaddingRelative(W, 0, W, W2);
    }

    @Override // nx.v
    public final List getChildImpressionViews() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f109688c.values());
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
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
