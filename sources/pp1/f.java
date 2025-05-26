package pp1;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.jvm.internal.Intrinsics;
import mq.z;

/* loaded from: classes5.dex */
public final class f extends FrameLayout {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f100918i = 0;

    /* renamed from: a, reason: collision with root package name */
    public final u50.r f100919a;

    /* renamed from: b, reason: collision with root package name */
    public final GestaltText f100920b;

    /* renamed from: c, reason: collision with root package name */
    public final GestaltText f100921c;

    /* renamed from: d, reason: collision with root package name */
    public final GestaltButton f100922d;

    /* renamed from: e, reason: collision with root package name */
    public final GestaltButton f100923e;

    /* renamed from: f, reason: collision with root package name */
    public final ConstraintLayout f100924f;

    /* renamed from: g, reason: collision with root package name */
    public final FrameLayout f100925g;

    /* renamed from: h, reason: collision with root package name */
    public final BottomSheetBehavior f100926h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Context context, z handshakeBottomSheetEventInTake) {
        super(context, null, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(handshakeBottomSheetEventInTake, "handshakeBottomSheetEventInTake");
        final int i13 = 0;
        this.f100919a = handshakeBottomSheetEventInTake;
        BottomSheetBehavior bottomSheetBehavior = new BottomSheetBehavior(context, null);
        bottomSheetBehavior.W(0);
        bottomSheetBehavior.K = false;
        final int i14 = 1;
        bottomSheetBehavior.f32290J = true;
        this.f100926h = bottomSheetBehavior;
        View inflate = View.inflate(context, sp1.d.handshake_bottom_sheet, this);
        View findViewById = inflate.findViewById(sp1.c.handshake_bottom_sheet_container);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f100924f = (ConstraintLayout) findViewById;
        View findViewById2 = inflate.findViewById(sp1.c.handshake_bottom_sheet_content);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f100925g = (FrameLayout) findViewById2;
        View findViewById3 = inflate.findViewById(sp1.c.handshake_header_title);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f100920b = (GestaltText) findViewById3;
        View findViewById4 = inflate.findViewById(sp1.c.bottom_sheet_title);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f100921c = (GestaltText) findViewById4;
        View findViewById5 = inflate.findViewById(sp1.c.handshake_close_button);
        ((GestaltIconButton) findViewById5).u(new gm1.a(this) { // from class: pp1.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f100914b;

            {
                this.f100914b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                int i15 = i13;
                f this$0 = this.f100914b;
                switch (i15) {
                    case 0:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof om1.l) {
                            this$0.f100919a.a(s.f100946a);
                            break;
                        }
                        break;
                    case 1:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.f100919a.a(q.f100944a);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.f100919a.a(t.f100947a);
                        break;
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(findViewById5, "apply(...)");
        View findViewById6 = inflate.findViewById(sp1.c.handshake_accept_button);
        GestaltButton gestaltButton = (GestaltButton) findViewById6;
        gestaltButton.e(new gm1.a(this) { // from class: pp1.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f100914b;

            {
                this.f100914b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                int i15 = i14;
                f this$0 = this.f100914b;
                switch (i15) {
                    case 0:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof om1.l) {
                            this$0.f100919a.a(s.f100946a);
                            break;
                        }
                        break;
                    case 1:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.f100919a.a(q.f100944a);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.f100919a.a(t.f100947a);
                        break;
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(findViewById6, "apply(...)");
        this.f100922d = gestaltButton;
        View findViewById7 = inflate.findViewById(sp1.c.handshake_cancel_button);
        GestaltButton gestaltButton2 = (GestaltButton) findViewById7;
        final int i15 = 2;
        gestaltButton2.e(new gm1.a(this) { // from class: pp1.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f100914b;

            {
                this.f100914b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                int i152 = i15;
                f this$0 = this.f100914b;
                switch (i152) {
                    case 0:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof om1.l) {
                            this$0.f100919a.a(s.f100946a);
                            break;
                        }
                        break;
                    case 1:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.f100919a.a(q.f100944a);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.f100919a.a(t.f100947a);
                        break;
                }
            }
        });
        gestaltButton2.d(d.f100915i);
        Intrinsics.checkNotNullExpressionValue(findViewById7, "apply(...)");
        this.f100923e = gestaltButton2;
        inflate.setBackgroundColor(bs1.c.A(context, sp1.a.color_overlay));
        setVisibility(4);
    }
}
