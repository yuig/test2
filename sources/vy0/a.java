package vy0;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.imageview.WebImageView;
import h32.d3;
import jv1.d;
import jv1.f;
import kotlin.jvm.internal.Intrinsics;
import ty0.c;
import u50.h0;

/* loaded from: classes5.dex */
public final class a extends ConstraintLayout implements ty0.a {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f126884i = 0;

    /* renamed from: a, reason: collision with root package name */
    public final WebImageView f126885a;

    /* renamed from: b, reason: collision with root package name */
    public final GestaltText f126886b;

    /* renamed from: c, reason: collision with root package name */
    public final ImageView f126887c;

    /* renamed from: d, reason: collision with root package name */
    public final ImageView f126888d;

    /* renamed from: e, reason: collision with root package name */
    public String f126889e;

    /* renamed from: f, reason: collision with root package name */
    public Integer f126890f;

    /* renamed from: g, reason: collision with root package name */
    public uy0.a f126891g;

    /* renamed from: h, reason: collision with root package name */
    public final c f126892h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f126892h = new c();
        View.inflate(context, f.item_modern_picker, this);
        View findViewById = findViewById(d.item_modern_picker_img);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        WebImageView webImageView = (WebImageView) findViewById;
        this.f126885a = webImageView;
        if (webImageView == null) {
            Intrinsics.r("imageView");
            throw null;
        }
        webImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        float dimension = webImageView.getResources().getDimension(jv1.b.nux_topic_picker_radius);
        webImageView.g2(dimension, dimension, dimension, dimension);
        View findViewById2 = findViewById(d.item_modern_picker_name);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f126886b = (GestaltText) findViewById2;
        View findViewById3 = findViewById(d.item_modern_picker_marker);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        ImageView imageView = (ImageView) findViewById3;
        this.f126887c = imageView;
        if (imageView == null) {
            Intrinsics.r("checkmarkView");
            throw null;
        }
        em1.d dVar = new em1.d(em1.b.CHECKED, null, null, h0.f120562a, null, 0, false, 1014);
        Context context2 = imageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        imageView.setBackground(oe.f.r(context2, dVar));
        imageView.setVisibility(8);
        View findViewById4 = findViewById(d.item_modern_picker_border);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        ImageView imageView2 = (ImageView) findViewById4;
        this.f126888d = imageView2;
        if (imageView2 == null) {
            Intrinsics.r("selectedBorderView");
            throw null;
        }
        imageView2.setVisibility(8);
        Context context3 = imageView2.getContext();
        int i13 = jv1.c.selected_modern_picker_item_overlay;
        Object obj = d5.a.f53679a;
        imageView2.setBackground(context3.getDrawable(i13));
    }

    @Override // nx.v
    public final Object markImpressionEnd() {
        d3 source;
        uy0.a aVar = this.f126891g;
        String str = this.f126889e;
        Integer num = this.f126890f;
        Short valueOf = num != null ? Short.valueOf((short) num.intValue()) : null;
        c cVar = this.f126892h;
        cVar.getClass();
        if (aVar == null || ty0.b.f119707a[aVar.ordinal()] != 1 || (source = cVar.f119708a) == null) {
            return null;
        }
        cVar.f119708a = null;
        Intrinsics.checkNotNullParameter(source, "source");
        return new d3(str, str != null ? Long.valueOf(Long.parseLong(str)) : null, source.f66948c, source.f66949d, Long.valueOf(System.currentTimeMillis() * 1000000), source.f66951f, valueOf, source.f66953h, source.f66954i, source.f66955j, source.f66956k);
    }

    @Override // nx.v
    public final Object markImpressionStart() {
        uy0.a aVar = this.f126891g;
        c cVar = this.f126892h;
        cVar.getClass();
        if (aVar == null || ty0.b.f119707a[aVar.ordinal()] != 1) {
            return null;
        }
        d3 d3Var = cVar.f119708a;
        if (d3Var != null) {
            return d3Var;
        }
        d3 d3Var2 = new d3(null, null, null, ep.b.f(1000000L), null, null, null, null, null, null, null);
        cVar.f119708a = d3Var2;
        return d3Var2;
    }
}
