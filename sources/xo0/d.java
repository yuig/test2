package xo0;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import com.pinterest.api.model.wy0;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.imageview.ProportionalImageView;
import com.pinterest.ui.imageview.WebImageView;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import lu.a0;
import m60.x0;
import r1.j0;

/* loaded from: classes5.dex */
public abstract class d extends a0 implements uo0.d {

    /* renamed from: d, reason: collision with root package name */
    public final WebImageView f135585d;

    /* renamed from: e, reason: collision with root package name */
    public final GestaltText f135586e;

    /* renamed from: f, reason: collision with root package name */
    public String f135587f;

    /* renamed from: g, reason: collision with root package name */
    public int f135588g;

    /* renamed from: h, reason: collision with root package name */
    public final int f135589h;

    /* renamed from: i, reason: collision with root package name */
    public ku1.l f135590i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Context context) {
        super(context, 3);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f135587f = "";
        this.f135588g = eo1.c.font_size_100;
        this.f135589h = eo1.c.font_size_300;
        this.f135585d = i();
        this.f135586e = j();
        g();
    }

    @Override // uo0.d
    public void K2(wy0 user) {
        Intrinsics.checkNotNullParameter(user, "user");
    }

    public final void M5(String url, HashMap hashMap) {
        Intrinsics.checkNotNullParameter(url, "url");
        ku1.l lVar = this.f135590i;
        if (lVar == null) {
            Intrinsics.r("uriNavigator");
            throw null;
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ku1.l.b(lVar, context, url, false, false, null, hashMap, 92);
    }

    public void g() {
        addView(this.f135585d);
        addView(this.f135586e);
    }

    public abstract ProportionalImageView i();

    public abstract GestaltText j();

    public void k(String url, u50.i placeHolderColor) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(placeHolderColor, "placeHolderColor");
        Context context = this.f135585d.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.f135585d.V1(url, (r18 & 2) != 0, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? 0 : 0, (r18 & 16) != 0 ? 0 : 0, (r18 & 32) != 0 ? null : new ColorDrawable(((Number) placeHolderColor.a(context)).intValue()), (r18 & 64) != 0 ? null : null, null);
    }

    public final void l(String title, boolean z13) {
        List split$default;
        Intrinsics.checkNotNullParameter(title, "title");
        this.f135587f = title;
        GestaltText gestaltText = this.f135586e;
        pk.a0.p(gestaltText, title);
        if (z13) {
            split$default = StringsKt__StringsKt.split$default(title, new String[]{" "}, false, 0, 6, null);
            gestaltText.i(new j0(split$default.size() > 1 ? 2 : 1, 21));
            if (getResources().getDimensionPixelSize(this.f135588g) < getResources().getDimensionPixelSize(this.f135589h)) {
                gestaltText.i(c.f135575j);
            }
        }
        setContentDescription(getResources().getString(x0.content_description_bubble_cell, title));
    }
}
