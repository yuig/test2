package b01;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.pinterest.api.model.p20;
import com.pinterest.gestalt.text.GestaltText;
import h32.f1;
import h32.g0;
import java.util.HashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;
import nx.d0;
import uq.w;

/* loaded from: classes5.dex */
public final class o extends w implements yk1.n {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f20764i = 0;

    /* renamed from: d, reason: collision with root package name */
    public final d0 f20765d;

    /* renamed from: e, reason: collision with root package name */
    public m60.w f20766e;

    /* renamed from: f, reason: collision with root package name */
    public final GestaltText f20767f;

    /* renamed from: g, reason: collision with root package name */
    public final GestaltText f20768g;

    /* renamed from: h, reason: collision with root package name */
    public final List f20769h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o(Context context, d0 pinalytics) {
        super(context, 15);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        this.f20765d = pinalytics;
        View.inflate(context, iy1.e.view_pear_style_summary_style_detail, this);
        setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
        int W = bs1.c.W(this, eo1.c.space_400);
        setPadding(W, W, W, W);
        View findViewById = findViewById(iy1.d.style_detail_title);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f20767f = (GestaltText) findViewById;
        View findViewById2 = findViewById(iy1.d.style_detail_subtitle);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f20768g = (GestaltText) findViewById2;
        this.f20769h = f0.j(findViewById(iy1.d.style_detail_image_one), findViewById(iy1.d.style_detail_image_two), findViewById(iy1.d.style_detail_image_three));
    }

    public final void L(f1 f1Var, zz0.c cVar) {
        g0 g0Var = g0.PEAR_STYLE_PIVOT;
        HashMap hashMap = new HashMap();
        hashMap.put("grid_index", String.valueOf(cVar.f143151d));
        p20 p20Var = cVar.f143152e;
        String q13 = p20Var.q();
        if (q13 == null) {
            q13 = "";
        }
        hashMap.put("style_name", q13);
        String n13 = p20Var.n();
        hashMap.put("query", n13 != null ? n13 : "");
        Unit unit = Unit.f80348a;
        c0.d.u2(this.f20765d, f1Var, g0Var, null, hashMap, 4);
    }
}
