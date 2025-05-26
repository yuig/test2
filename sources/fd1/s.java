package fd1;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.pinterest.api.model.wy0;
import com.pinterest.feature.sharesheet.view.InviteModalAppListView;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.jvm.internal.Intrinsics;
import so.jb;
import so.oa;

/* loaded from: classes5.dex */
public final class s extends LinearLayout implements cd1.a, af2.c {

    /* renamed from: a, reason: collision with root package name */
    public ye2.o f61992a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f61993b;

    /* renamed from: c, reason: collision with root package name */
    public final xk2.v f61994c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(Context context, int i13, jc0.n modalViewWrapper, dl1.s model) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(modalViewWrapper, "modalViewWrapper");
        Intrinsics.checkNotNullParameter(model, "model");
        if (!this.f61993b) {
            this.f61993b = true;
            oa oaVar = ((jb) ((t) generatedComponent())).f113483a;
            oaVar.b3();
        }
        xk2.v b13 = xk2.m.b(new h81.b(this, 23));
        this.f61994c = b13;
        View.inflate(context, b62.c.view_lego_invite_modal, this);
        setOrientation(1);
        e0.t.f56747e = i13;
        modalViewWrapper.q(true);
        ViewGroup.LayoutParams layoutParams = ((GestaltIconButton) modalViewWrapper.findViewById(b62.b.modal_header_dismiss_bt)).getLayoutParams();
        Intrinsics.g(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        com.bumptech.glide.c.a1((LinearLayout.LayoutParams) layoutParams, context.getResources().getDimensionPixelSize(m60.r0.pin_sides_padding), context.getResources().getDimensionPixelSize(m60.r0.pin_sides_padding), 0, 0);
        Object value = b13.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((InviteModalAppListView) value).setVisibility(0);
        if (((wy0) model).J3().booleanValue()) {
            ((LinearLayout) findViewById(b62.b.line_1)).setVisibility(0);
            ((ImageView) findViewById(b62.b.invite_modal_image)).setVisibility(0);
        } else {
            ((LinearLayout) findViewById(b62.b.line_1)).setVisibility(8);
            ((ImageView) findViewById(b62.b.invite_modal_image)).setVisibility(8);
            modalViewWrapper.p(getResources().getString(a62.e.share));
            GestaltText gestaltText = modalViewWrapper.f44750b;
            if (gestaltText != null) {
                gestaltText.i(i.f61929l);
            }
            GestaltText gestaltText2 = modalViewWrapper.f44750b;
            if (gestaltText2 != null) {
                gestaltText2.setPaddingRelative(0, context.getResources().getDimensionPixelSize(m60.r0.margin), context.getResources().getDimensionPixelSize(m60.r0.margin_triple), 0);
            }
        }
        if (Resources.getSystem().getDisplayMetrics().heightPixels > 1880) {
            ((GestaltText) findViewById(b62.b.invite_header_large)).i(i.f61931n);
        } else {
            ((ImageView) findViewById(b62.b.invite_modal_image)).setVisibility(8);
            ((GestaltText) findViewById(b62.b.invite_header_small)).i(i.f61930m);
        }
    }

    @Override // af2.c
    public final af2.b componentManager() {
        if (this.f61992a == null) {
            this.f61992a = new ye2.o(this);
        }
        return this.f61992a;
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f61992a == null) {
            this.f61992a = new ye2.o(this);
        }
        return this.f61992a.generatedComponent();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        hf0.b.k(this);
        super.onDetachedFromWindow();
    }
}
