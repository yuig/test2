package up0;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.pinterest.api.model.ts0;
import kg.n;
import kotlin.jvm.internal.Intrinsics;
import nx.d0;

/* loaded from: classes5.dex */
public final class h extends ClickableSpan {

    /* renamed from: a, reason: collision with root package name */
    public final Typeface f122954a;

    /* renamed from: b, reason: collision with root package name */
    public final int f122955b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f122956c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d0 f122957d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ts0 f122958e;

    public h(Context context, boolean z13, d0 d0Var, ts0 ts0Var, String id3, int i13) {
        this.f122956c = z13;
        this.f122957d = d0Var;
        this.f122958e = ts0Var;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(context, "context");
        lm1.b FONT_NORMAL = te0.i.f117496c;
        Intrinsics.checkNotNullExpressionValue(FONT_NORMAL, "FONT_NORMAL");
        this.f122954a = te0.g.a(context, FONT_NORMAL, null, 12);
        Object obj = d5.a.f53679a;
        this.f122955b = context.getColor(i13);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void updateDrawState(TextPaint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        paint.setTypeface(this.f122954a);
        paint.setColor(this.f122955b);
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        n.a(view);
        Intrinsics.checkNotNullParameter(view, "view");
        l.a(this.f122956c, this.f122957d, this.f122958e);
    }
}
