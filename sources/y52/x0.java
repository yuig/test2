package y52;

import android.os.Bundle;
import android.view.View;
import android.widget.VideoView;
import androidx.lifecycle.m1;
import com.pinterest.activity.sendapin.model.SendableObject;
import com.pinterest.api.model.wy0;
import com.pinterest.design.widget.RoundedCornersLayout;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.imageview.WebImageView;
import h32.a4;
import h32.d4;
import kh2.a1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Ly52/x0;", "Lmm1/l;", "<init>", "()V", "org/chromium/net/y", "shareBoardVideo_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class x0 extends b {

    /* renamed from: v0, reason: collision with root package name */
    public static final /* synthetic */ int f137870v0 = 0;

    /* renamed from: g0, reason: collision with root package name */
    public final m1 f137871g0;

    /* renamed from: h0, reason: collision with root package name */
    public final xk2.v f137872h0;

    /* renamed from: i0, reason: collision with root package name */
    public final xk2.v f137873i0;

    /* renamed from: j0, reason: collision with root package name */
    public final xk2.v f137874j0;

    /* renamed from: k0, reason: collision with root package name */
    public final xk2.v f137875k0;

    /* renamed from: l0, reason: collision with root package name */
    public final xk2.v f137876l0;

    /* renamed from: m0, reason: collision with root package name */
    public final xk2.v f137877m0;

    /* renamed from: n0, reason: collision with root package name */
    public final xk2.v f137878n0;

    /* renamed from: o0, reason: collision with root package name */
    public final xk2.v f137879o0;

    /* renamed from: p0, reason: collision with root package name */
    public VideoView f137880p0;

    /* renamed from: q0, reason: collision with root package name */
    public WebImageView f137881q0;

    /* renamed from: r0, reason: collision with root package name */
    public RoundedCornersLayout f137882r0;

    /* renamed from: s0, reason: collision with root package name */
    public final ha.a f137883s0;

    /* renamed from: t0, reason: collision with root package name */
    public final d4 f137884t0;

    /* renamed from: u0, reason: collision with root package name */
    public final xk2.v f137885u0;

    public x0() {
        int i13 = 5;
        xk2.k a13 = xk2.m.a(xk2.n.NONE, new ax1.a(14, new r02.c0(this, i13)));
        int i14 = 3;
        this.f137871g0 = a1.s(this, kotlin.jvm.internal.k0.f80436a.b(j0.class), new s52.m(a13, 2), new t02.h(a13, i14), new t02.i(this, a13, i14));
        this.f137872h0 = xk2.m.b(new m0(this, i13));
        this.f137873i0 = xk2.m.b(new m0(this, 6));
        this.f137874j0 = xk2.m.b(new m0(this, i14));
        this.f137875k0 = xk2.m.b(new m0(this, 9));
        this.f137876l0 = xk2.m.b(new m0(this, 0));
        this.f137877m0 = xk2.m.b(new m0(this, 4));
        this.f137878n0 = xk2.m.b(new m0(this, 8));
        this.f137879o0 = xk2.m.b(new m0(this, 1));
        this.f137883s0 = new ha.a();
        this.f137884t0 = d4.ACTION_SHEET;
        this.f137885u0 = xk2.m.b(n0.f137830i);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object d8(y52.x0 r11, bl2.c r12) {
        /*
            r11.getClass()
            boolean r0 = r12 instanceof y52.w0
            if (r0 == 0) goto L16
            r0 = r12
            y52.w0 r0 = (y52.w0) r0
            int r1 = r0.f137867u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f137867u = r1
            goto L1b
        L16:
            y52.w0 r0 = new y52.w0
            r0.<init>(r11, r12)
        L1b:
            java.lang.Object r12 = r0.f137865s
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f137867u
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3d
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            y52.x0 r11 = r0.f137864r
            ue.c.H(r12)
            goto L82
        L2f:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L37:
            y52.x0 r11 = r0.f137864r
            ue.c.H(r12)
            goto L4d
        L3d:
            ue.c.H(r12)
            r0.f137864r = r11
            r0.f137867u = r4
            r4 = 800(0x320, double:3.953E-321)
            java.lang.Object r12 = lb.l0.S(r4, r0)
            if (r12 != r1) goto L4d
            goto L92
        L4d:
            ha.a r4 = r11.f137883s0
            com.pinterest.design.widget.RoundedCornersLayout r5 = r11.f137882r0
            if (r5 == 0) goto L93
            ym1.e r12 = ym1.e.BOTTOM_CENTER
            ym1.t r6 = new ym1.t
            r6.<init>(r12)
            y52.o0 r7 = new y52.o0
            r7.<init>(r11, r3)
            y52.a r8 = y52.a.f137777l
            y52.m0 r9 = new y52.m0
            r12 = 7
            r9.<init>(r11, r12)
            y52.a r10 = y52.a.f137778m
            ha.a.k(r4, r5, r6, r7, r8, r9, r10)
            y52.j0 r12 = r11.e8()
            y52.n r2 = y52.n.f137829a
            kh2.j.x2(r12, r2)
            r0.f137864r = r11
            r0.f137867u = r3
            r2 = 3000(0xbb8, double:1.482E-320)
            java.lang.Object r12 = lb.l0.S(r2, r0)
            if (r12 != r1) goto L82
            goto L92
        L82:
            ha.a r12 = r11.f137883s0
            r12.d()
            y52.j0 r11 = r11.e8()
            y52.m r12 = y52.m.f137826a
            kh2.j.x2(r11, r12)
            kotlin.Unit r1 = kotlin.Unit.f80348a
        L92:
            return r1
        L93:
            java.lang.String r11 = "linkContainer"
            kotlin.jvm.internal.Intrinsics.r(r11)
            r11 = 0
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: y52.x0.d8(y52.x0, bl2.c):java.lang.Object");
    }

    @Override // nl1.d
    public final void I7() {
        ((l82.c) e8().c()).a(i.f137809a);
    }

    @Override // mm1.l
    public final mm1.d b8() {
        return new mm1.d(o52.d.fragment_share_board_video, false, 0, 90, false, false, new m0(this, 2), 756);
    }

    public final j0 e8() {
        return (j0) this.f137871g0.getValue();
    }

    @Override // nl1.d, nx.a
    public final h32.i0 generateLoggingContext() {
        return com.bumptech.glide.d.z0(super.generateLoggingContext(), new o0(this, 0));
    }

    @Override // uk1.c
    /* renamed from: getComponentType */
    public final h32.g0 getF120713j0() {
        return (h32.g0) this.f137885u0.getValue();
    }

    @Override // uk1.c
    /* renamed from: getViewParameterType */
    public final a4 getS0() {
        wy0 f13 = ((b60.d) getActiveUserManager()).f();
        String d2 = ((SendableObject) this.f137873i0.getValue()).d();
        Intrinsics.checkNotNullExpressionValue(d2, "getUid(...)");
        return e0.t.x(f13, d2);
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getR0() {
        return this.f137884t0;
    }

    @Override // mm1.l, nl1.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        e8().h(new d((SendableObject) this.f137873i0.getValue(), (p32.c) this.f137874j0.getValue(), "instagram_stories".equals((String) this.f137876l0.getValue()) ? p32.f.INSTAGRAM_STORY : p32.f.OTHER, (String) this.f137875k0.getValue(), (i91.b) this.f137879o0.getValue()), generateLoggingContext());
    }

    @Override // mm1.l, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        final int i13 = 1;
        a8(new o0(this, i13));
        ((GestaltIconButton) v13.findViewById(hn1.t.sheet_start_button)).t(a.f137776k);
        View findViewById = v13.findViewById(o52.c.share_board_video_description);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        final int i14 = 0;
        pk.a0.o((GestaltText) findViewById, ((Boolean) this.f137877m0.getValue()).booleanValue() ? o52.e.share_image_description : o52.e.share_board_video_description, new Object[0]);
        View findViewById2 = v13.findViewById(o52.c.share_board_pin_it_link);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        findViewById2.setVisibility(0);
        ((GestaltButton) v13.findViewById(o52.c.share_board_video_copy)).e(new gm1.a(this) { // from class: y52.k0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ x0 f137824b;

            {
                this.f137824b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                int i15 = i14;
                x0 this$0 = this.f137824b;
                switch (i15) {
                    case 0:
                        int i16 = x0.f137870v0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        kh2.j.x2(this$0.e8(), f.f137796a);
                        break;
                    default:
                        int i17 = x0.f137870v0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        kh2.j.x2(this$0.e8(), j.f137810a);
                        break;
                }
            }
        });
        ((GestaltButton) v13.findViewById(o52.c.share_board_video_button)).e(new gm1.a(this) { // from class: y52.k0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ x0 f137824b;

            {
                this.f137824b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                int i15 = i13;
                x0 this$0 = this.f137824b;
                switch (i15) {
                    case 0:
                        int i16 = x0.f137870v0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        kh2.j.x2(this$0.e8(), f.f137796a);
                        break;
                    default:
                        int i17 = x0.f137870v0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        kh2.j.x2(this$0.e8(), j.f137810a);
                        break;
                }
            }
        });
        View findViewById3 = requireView().findViewById(o52.c.share_board_video_preview);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f137880p0 = (VideoView) findViewById3;
        View findViewById4 = requireView().findViewById(o52.c.share_image_preview);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f137881q0 = (WebImageView) findViewById4;
        View findViewById5 = requireView().findViewById(o52.c.share_board_video_link_background);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        RoundedCornersLayout roundedCornersLayout = (RoundedCornersLayout) findViewById5;
        this.f137882r0 = roundedCornersLayout;
        if (roundedCornersLayout == null) {
            Intrinsics.r("linkContainer");
            throw null;
        }
        roundedCornersLayout.setOnClickListener(new wq1.a(this, 22));
        View findViewById6 = requireView().findViewById(o52.c.share_board_video_link);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        androidx.lifecycle.z viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        kotlin.jvm.internal.j.z(bf.b.S(viewLifecycleOwner), null, null, new r0(this, null), 3);
        androidx.lifecycle.z viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        kotlin.jvm.internal.j.z(bf.b.S(viewLifecycleOwner2), null, null, new v0(this, null), 3);
    }
}
