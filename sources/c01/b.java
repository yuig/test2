package c01;

import android.content.Context;
import android.view.View;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.pinterest.gestalt.text.GestaltText;
import h01.h;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import yk1.n;

/* loaded from: classes5.dex */
public final class b extends ConstraintLayout implements n {

    /* renamed from: a, reason: collision with root package name */
    public final List f24412a;

    /* renamed from: b, reason: collision with root package name */
    public final GestaltText f24413b;

    /* renamed from: c, reason: collision with root package name */
    public final GestaltText f24414c;

    /* renamed from: d, reason: collision with root package name */
    public final GestaltText f24415d;

    /* renamed from: e, reason: collision with root package name */
    public final Flow f24416e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f24417f;

    /* renamed from: g, reason: collision with root package name */
    public Function1 f24418g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f24417f = new ArrayList();
        this.f24418g = a.f24411i;
        View.inflate(context, iy1.e.view_pear_style_content, this);
        setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
        this.f24412a = f0.j(findViewById(iy1.d.cover_image_one), findViewById(iy1.d.cover_image_two), findViewById(iy1.d.cover_image_three));
        View findViewById = findViewById(iy1.d.title);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f24413b = (GestaltText) findViewById;
        View findViewById2 = findViewById(iy1.d.subtitle);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f24414c = (GestaltText) findViewById2;
        View findViewById3 = findViewById(iy1.d.description);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f24415d = (GestaltText) findViewById3;
        View findViewById4 = findViewById(iy1.d.style_tags);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f24416e = (Flow) findViewById4;
    }

    public final void L(String str, boolean z13) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        h hVar = new h(context, str, z13, 0, 0, 0, new b01.c(1, this, str), 56);
        addView(hVar);
        this.f24416e.e(hVar);
        this.f24417f.add(hVar);
    }
}
