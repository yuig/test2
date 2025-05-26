package nz0;

import android.content.Context;
import android.view.View;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.imageview.WebImageView;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import lu.a0;
import nx.d0;
import yk1.n;

/* loaded from: classes5.dex */
public final class f extends a0 implements n {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f92722n = 0;

    /* renamed from: d, reason: collision with root package name */
    public a11.d f92723d;

    /* renamed from: e, reason: collision with root package name */
    public final a11.n f92724e;

    /* renamed from: f, reason: collision with root package name */
    public final ConstraintLayout f92725f;

    /* renamed from: g, reason: collision with root package name */
    public final WebImageView f92726g;

    /* renamed from: h, reason: collision with root package name */
    public final GestaltText f92727h;

    /* renamed from: i, reason: collision with root package name */
    public final GestaltText f92728i;

    /* renamed from: j, reason: collision with root package name */
    public final Flow f92729j;

    /* renamed from: k, reason: collision with root package name */
    public final GestaltText f92730k;

    /* renamed from: l, reason: collision with root package name */
    public final GestaltText f92731l;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f92732m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Context context, d0 pinalytics) {
        super(context, 6);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        a11.d dVar = this.f92723d;
        if (dVar == null) {
            Intrinsics.r("clickthroughHelperFactory");
            throw null;
        }
        this.f92724e = dVar.a(pinalytics);
        this.f92732m = new ArrayList();
        View.inflate(context, iy1.e.view_pear_related_pins_header, this);
        setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
        View findViewById = findViewById(iy1.d.root_container);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f92725f = (ConstraintLayout) findViewById;
        View findViewById2 = findViewById(iy1.d.header_cover_image);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f92726g = (WebImageView) findViewById2;
        View findViewById3 = findViewById(iy1.d.header_subtitle);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f92727h = (GestaltText) findViewById3;
        View findViewById4 = findViewById(iy1.d.header_title);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f92728i = (GestaltText) findViewById4;
        View findViewById5 = findViewById(iy1.d.header_style_tags);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f92729j = (Flow) findViewById5;
        View findViewById6 = findViewById(iy1.d.header_description);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        this.f92730k = (GestaltText) findViewById6;
        View findViewById7 = findViewById(iy1.d.header_domain);
        Intrinsics.checkNotNullExpressionValue(findViewById7, "findViewById(...)");
        this.f92731l = (GestaltText) findViewById7;
    }
}
