package qv0;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.pinterest.feature.ideaPinCreation.closeup.view.r0;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.imageview.WebImageViewContainer;
import kotlin.jvm.internal.Intrinsics;
import rq.c2;
import so.jb;

/* loaded from: classes5.dex */
public final class w extends FrameLayout implements af2.c {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f105214d = 0;

    /* renamed from: a, reason: collision with root package name */
    public ye2.o f105215a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f105216b;

    /* renamed from: c, reason: collision with root package name */
    public final WebImageViewContainer f105217c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(Context context, nv0.l imageStickerListener) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(imageStickerListener, "imageStickerListener");
        if (!this.f105216b) {
            this.f105216b = true;
            bf2.d dVar = ((jb) ((x) generatedComponent())).f113483a.f114036z8;
        }
        nx.d0 pinalytics = sh.f.a();
        View.inflate(context, aq1.f.idea_pin_creation_image_sticker_button, this);
        View findViewById = findViewById(aq1.d.image_sticker_content_view);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        WebImageViewContainer webImageViewContainer = (WebImageViewContainer) findViewById;
        this.f105217c = webImageViewContainer;
        View findViewById2 = findViewById(aq1.d.image_sticker_button_text);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        GestaltText gestaltText = (GestaltText) findViewById2;
        webImageViewContainer.o0(dl2.b.y0(webImageViewContainer, eo1.a.base_color_grayscale_0));
        webImageViewContainer.M1(4);
        webImageViewContainer.U1(eo1.c.legacy_image_corner_radius);
        webImageViewContainer.setBackgroundDrawable(null);
        gestaltText.i(new c2(gestaltText, 11));
        xk2.v vVar = sw0.y.f115589f;
        sw0.y u13 = vt1.a.u();
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        Intrinsics.checkNotNullExpressionValue(pinalytics, "pinalytics");
        new pk2.m(16).a(u13.d(context2, "", true, false, false, pinalytics, -1).H(tk2.e.f118016b).A(wj2.c.a()).s().o(new pv0.e(4, new r0(20, this, imageStickerListener)), new pv0.e(5, d.f105170q)));
    }

    @Override // af2.c
    public final af2.b componentManager() {
        if (this.f105215a == null) {
            this.f105215a = new ye2.o(this);
        }
        return this.f105215a;
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f105215a == null) {
            this.f105215a = new ye2.o(this);
        }
        return this.f105215a.generatedComponent();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i13, int i14) {
        int size = View.MeasureSpec.getSize(i13);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size, 1073741824));
    }
}
