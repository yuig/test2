package u52;

import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.m1;
import com.pinterest.api.model.wy0;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.navigation.Navigation;
import com.pinterest.share.board.video.templategallery.view.BoardPreviewCarousel;
import com.pinterest.share.board.video.templategallery.view.DotsIndicatorView;
import h32.a4;
import h32.d4;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lu52/l;", "Lmm1/l;", "<init>", "()V", "shareBoardVideo_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class l extends t {

    /* renamed from: l0, reason: collision with root package name */
    public static final /* synthetic */ int f120709l0 = 0;

    /* renamed from: g0, reason: collision with root package name */
    public final m1 f120710g0;

    /* renamed from: h0, reason: collision with root package name */
    public BoardPreviewCarousel f120711h0;

    /* renamed from: i0, reason: collision with root package name */
    public DotsIndicatorView f120712i0;

    /* renamed from: j0, reason: collision with root package name */
    public final h32.g0 f120713j0;

    /* renamed from: k0, reason: collision with root package name */
    public final d4 f120714k0;

    public l() {
        xk2.k a13 = xk2.m.a(xk2.n.NONE, new ax1.a(13, new r02.c0(this, 4)));
        int i13 = 2;
        this.f120710g0 = kh2.a1.s(this, kotlin.jvm.internal.k0.f80436a.b(p.class), new s52.m(a13, 1), new t02.h(a13, i13), new t02.i(this, a13, i13));
        this.f120713j0 = h32.g0.SHARE_SCREEN_EDIT_TEMPLATE;
        this.f120714k0 = d4.ACTION_SHEET;
    }

    @Override // jl1.a
    public final void N6(String code, Bundle result) {
        String[] stringArray;
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(result, "result");
        super.N6(code, result);
        if (!Intrinsics.d(code, "com.pinterest.EXTRA_BOARD_PREVIEW_PINS_RESULT_CODE") || (stringArray = result.getStringArray("ARG_TEMPLATE_PINS")) == null) {
            return;
        }
        kh2.j.x2(d8(), new b0(kotlin.collections.c0.b0(stringArray)));
    }

    @Override // mm1.l
    public final mm1.d b8() {
        return new mm1.d(o52.d.fragment_board_preview_template_gallery, false, 0, 90, false, false, new c(this, 0), 756);
    }

    public final p d8() {
        return (p) this.f120710g0.getValue();
    }

    @Override // nl1.d, com.pinterest.framework.screens.b
    /* renamed from: g */
    public final boolean getF103154e0() {
        kh2.j.x2(d8(), y.f120751a);
        return true;
    }

    @Override // nl1.d, nx.a
    public final h32.i0 generateLoggingContext() {
        return com.bumptech.glide.d.z0(super.generateLoggingContext(), new s12.a(this, 9));
    }

    @Override // uk1.c
    /* renamed from: getComponentType, reason: from getter */
    public final h32.g0 getF53240t0() {
        return this.f120713j0;
    }

    @Override // uk1.c
    /* renamed from: getViewParameterType */
    public final a4 getF117152v0() {
        wy0 f13 = ((b60.d) getActiveUserManager()).f();
        Navigation navigation = this.I;
        String v03 = navigation != null ? navigation.v0("com.pinterest.EXTRA_BOARD_ID") : null;
        if (v03 == null) {
            v03 = "";
        }
        return e0.t.x(f13, v03);
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getF117151u0() {
        return this.f120714k0;
    }

    @Override // mm1.l, nl1.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        p d83 = d8();
        Navigation navigation = this.I;
        Object obj = null;
        String v03 = navigation != null ? navigation.v0("com.pinterest.EXTRA_BOARD_ID") : null;
        if (v03 == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        Navigation navigation2 = this.I;
        String v04 = navigation2 != null ? navigation2.v0("com.pinterest.EXTRA_BOARD_NAME") : null;
        if (v04 == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        Navigation navigation3 = this.I;
        Integer valueOf = navigation3 != null ? Integer.valueOf(navigation3.J1("ARG_BOARD_PINS_COUNT")) : null;
        if (valueOf == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        int intValue = valueOf.intValue();
        Navigation navigation4 = this.I;
        if (navigation4 != null) {
            i91.b bVar = i91.b.f71797d;
            obj = navigation4.Z0("ARG_PREVIEW_STATE", kg.p.t());
        }
        Intrinsics.g(obj, "null cannot be cast to non-null type com.pinterest.feature.sendshare.util.BoardPreviewState");
        d83.h(v03, v04, intValue, generateLoggingContext(), (i91.b) obj);
    }

    @Override // mm1.l, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        kh2.b0.M1(this, o52.e.board_preview_template_gallery_header);
        final int i13 = 0;
        ((GestaltButton) v13.findViewById(o52.c.done_button)).e(new gm1.a(this) { // from class: u52.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l f120658b;

            {
                this.f120658b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                int i14 = i13;
                l this$0 = this.f120658b;
                switch (i14) {
                    case 0:
                        int i15 = l.f120709l0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        kh2.j.x2(this$0.d8(), z.f120752a);
                        break;
                    default:
                        int i16 = l.f120709l0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        kh2.j.x2(this$0.d8(), c0.f120674a);
                        break;
                }
            }
        });
        final int i14 = 1;
        ((GestaltButton) v13.findViewById(o52.c.replace_pins_button)).e(new gm1.a(this) { // from class: u52.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l f120658b;

            {
                this.f120658b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                int i142 = i14;
                l this$0 = this.f120658b;
                switch (i142) {
                    case 0:
                        int i15 = l.f120709l0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        kh2.j.x2(this$0.d8(), z.f120752a);
                        break;
                    default:
                        int i16 = l.f120709l0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        kh2.j.x2(this$0.d8(), c0.f120674a);
                        break;
                }
            }
        });
        BoardPreviewCarousel boardPreviewCarousel = (BoardPreviewCarousel) v13.findViewById(o52.c.board_preview_carousel);
        boardPreviewCarousel.c(new b(this));
        this.f120711h0 = boardPreviewCarousel;
        this.f120712i0 = (DotsIndicatorView) v13.findViewById(o52.c.dots_indicator);
        kh2.b0.C1(this, androidx.lifecycle.r.STARTED, new e(this, null));
        kh2.b0.C1(this, androidx.lifecycle.r.STARTED, new i(this, null));
        kh2.b0.C1(this, androidx.lifecycle.r.CREATED, new k(this, null));
    }
}
