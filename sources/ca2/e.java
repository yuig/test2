package ca2;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.appcompat.widget.q;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import df.l1;
import h32.f1;
import h32.i0;
import java.util.HashMap;
import jn1.h;
import kj.f;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import l81.j;
import m60.u0;
import net.quikkly.android.utils.BitmapUtils;
import nx.d0;

/* loaded from: classes4.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f27242a;

    /* renamed from: b, reason: collision with root package name */
    public final c f27243b;

    /* renamed from: c, reason: collision with root package name */
    public final int f27244c;

    /* renamed from: d, reason: collision with root package name */
    public int f27245d;

    /* renamed from: e, reason: collision with root package name */
    public final Integer f27246e;

    /* renamed from: f, reason: collision with root package name */
    public final int f27247f;

    /* renamed from: g, reason: collision with root package name */
    public final d0 f27248g;

    /* renamed from: h, reason: collision with root package name */
    public final bh.b f27249h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f27250i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f27251j;

    /* renamed from: k, reason: collision with root package name */
    public b f27252k;

    /* renamed from: l, reason: collision with root package name */
    public final f f27253l;

    /* renamed from: m, reason: collision with root package name */
    public View f27254m;

    /* renamed from: n, reason: collision with root package name */
    public BottomSheetBehavior f27255n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f27256o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f27257p;

    /* renamed from: q, reason: collision with root package name */
    public f1 f27258q;

    /* renamed from: r, reason: collision with root package name */
    public int f27259r;

    public /* synthetic */ e(boolean z13, k90.a aVar, int i13, int i14, Integer num, int i15, d0 d0Var, bh.b bVar, boolean z14, boolean z15, int i16) {
        this(z13, (i16 & 2) != 0 ? null : aVar, (i16 & 4) != 0 ? u0.anim_speed_fast : i13, (i16 & 8) != 0 ? 0 : i14, (i16 & 16) != 0 ? null : num, (i16 & 32) != 0 ? -1 : i15, (i16 & 64) != 0 ? null : d0Var, (i16 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? null : bVar, (i16 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : z14, (i16 & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 0 ? true : z15);
    }

    public static void i(e eVar, String str, float f13, q qVar, int i13) {
        if ((i13 & 2) != 0) {
            BottomSheetBehavior bottomSheetBehavior = eVar.f27255n;
            if (bottomSheetBehavior != null) {
                f13 = bottomSheetBehavior.f32301f ? -1 : bottomSheetBehavior.f32299e;
            } else {
                f13 = 0.0f;
            }
        }
        c cVar = qVar;
        if ((i13 & 4) != 0) {
            cVar = eVar.f27243b;
        }
        eVar.h(str, f13, cVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v2, types: [ca2.c] */
    public static void w(final e eVar, int i13, Animation.AnimationListener animationListener, j jVar, String str, int i14) {
        if ((i14 & 1) != 0) {
            i13 = eVar.f27245d;
        }
        final int i15 = i13;
        if ((i14 & 2) != 0) {
            animationListener = null;
        }
        final Animation.AnimationListener animationListener2 = animationListener;
        j jVar2 = jVar;
        if ((i14 & 4) != 0) {
            jVar2 = eVar.f27243b;
        }
        final j jVar3 = jVar2;
        if ((i14 & 8) != 0) {
            str = "initial_slide_up";
        }
        final String actionSource = str;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(actionSource, "actionSource");
        View view = eVar.f27254m;
        if (view != null) {
            view.post(new Runnable() { // from class: ca2.a
                @Override // java.lang.Runnable
                public final void run() {
                    View view2;
                    e this$0 = e.this;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    String actionSource2 = actionSource;
                    Intrinsics.checkNotNullParameter(actionSource2, "$actionSource");
                    BottomSheetBehavior bottomSheetBehavior = this$0.f27255n;
                    if (bottomSheetBehavior == null || (view2 = this$0.f27254m) == null) {
                        return;
                    }
                    bottomSheetBehavior.W(i15);
                    int i16 = bottomSheetBehavior.f32301f ? -1 : bottomSheetBehavior.f32299e;
                    view2.setTranslationY(view2.getHeight());
                    h hVar = new h(i16, view2, jVar3, 1);
                    hVar.setDuration(view2.getResources().getInteger(u0.anim_speed_fast));
                    Animation.AnimationListener animationListener3 = animationListener2;
                    if (animationListener3 != null) {
                        hVar.setAnimationListener(animationListener3);
                    }
                    view2.startAnimation(hVar);
                    this$0.k(f1.BOTTOM_SHEET_SNAP_DEFAULT, actionSource2);
                }
            });
        }
    }

    public final void a() {
        this.f27256o = false;
        BottomSheetBehavior bottomSheetBehavior = this.f27255n;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.W(this.f27245d);
        }
        b bVar = this.f27252k;
        if (bVar != null) {
            bVar.U2();
        }
    }

    public final HashMap b(String str) {
        HashMap o13 = ep.b.o("bottom_sheet_snap_request_source", str);
        o13.put("bottom_sheet_last_snap_offset_event", String.valueOf(this.f27258q.getValue()));
        o13.put("is_third_party_ad", String.valueOf(this.f27250i));
        return o13;
    }

    public final View c() {
        return this.f27254m;
    }

    public final BottomSheetBehavior d() {
        return this.f27255n;
    }

    public f e() {
        return this.f27253l;
    }

    public final int f() {
        return this.f27245d;
    }

    public final int g() {
        View view = this.f27254m;
        if (view != null) {
            return view.getTop();
        }
        return 0;
    }

    public void h(String actionSource, float f13, c cVar) {
        Intrinsics.checkNotNullParameter(actionSource, "actionSource");
        if (this.f27242a) {
            View view = this.f27254m;
            if (view != null) {
                view.post(new jn1.a(this, f13, cVar, actionSource));
                return;
            }
            return;
        }
        this.f27256o = true;
        BottomSheetBehavior bottomSheetBehavior = this.f27255n;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.W(this.f27259r);
            bottomSheetBehavior.X(4);
        }
        b bVar = this.f27252k;
        if (bVar != null) {
            bVar.M0(actionSource);
        }
        k(f1.BOTTOM_SHEET_SNAP_MINIMIZED, actionSource);
    }

    public final boolean j() {
        return this.f27256o;
    }

    public final void k(f1 et2, String actionSource) {
        Intrinsics.checkNotNullParameter(et2, "bottomSheetEvent");
        Intrinsics.checkNotNullParameter(actionSource, "actionSource");
        if (this.f27258q == et2) {
            return;
        }
        bh.b bVar = this.f27249h;
        if (bVar != null) {
            HashMap b13 = b(actionSource);
            Intrinsics.checkNotNullParameter(et2, "et");
            ((d0) bVar.f22798b).t((i0) ((Function0) bVar.f22799c).invoke(), null, null, et2, "", b13, true);
        } else {
            d0 d0Var = this.f27248g;
            if (d0Var == null) {
                throw new IllegalStateException("missing pinalytics".toString());
            }
            d0Var.g(et2, "", b(actionSource), false);
        }
        this.f27258q = et2;
    }

    public final void l() {
        BottomSheetBehavior bottomSheetBehavior = this.f27255n;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.X.remove(e());
        }
        this.f27255n = null;
        m(null);
        this.f27252k = null;
    }

    public final void m(View view) {
        Integer num;
        this.f27254m = view;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null && (num = this.f27246e) != null) {
                layoutParams.width = num.intValue();
            }
            view.setOnTouchListener(new l1(6));
            BottomSheetBehavior J2 = BottomSheetBehavior.J(view);
            J2.W(0);
            J2.f32308l = this.f27247f;
            J2.C(e());
            this.f27255n = J2;
            J2.K = this.f27251j;
        }
    }

    public final void n(int i13) {
        this.f27245d = i13;
    }

    public final void o(int i13) {
        this.f27259r = i13;
    }

    public final void p() {
        this.f27256o = true;
    }

    public final void q(b bVar) {
        this.f27252k = bVar;
    }

    public final void r() {
        this.f27257p = false;
    }

    public final void s(String actionSource, boolean z13) {
        Intrinsics.checkNotNullParameter(actionSource, "actionSource");
        BottomSheetBehavior bottomSheetBehavior = this.f27255n;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.X(3);
        }
        a();
        if (z13) {
            k(f1.BOTTOM_SHEET_SNAP_FULLY_OPEN, actionSource);
        }
    }

    public final void u() {
        Intrinsics.checkNotNullParameter("initial_slide_up", "actionSource");
        BottomSheetBehavior bottomSheetBehavior = this.f27255n;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.X(6);
        }
        a();
        k(f1.BOTTOM_SHEET_SNAP_DEFAULT, "initial_slide_up");
    }

    public final void v(String actionSource) {
        Intrinsics.checkNotNullParameter(actionSource, "actionSource");
        a();
        BottomSheetBehavior bottomSheetBehavior = this.f27255n;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.X(4);
        }
        k(f1.BOTTOM_SHEET_SNAP_DEFAULT, actionSource);
    }

    public final void x(int i13) {
        View view = this.f27254m;
        ViewGroup.LayoutParams layoutParams = view != null ? view.getLayoutParams() : null;
        if (layoutParams == null) {
            return;
        }
        layoutParams.height = i13;
    }

    public e(boolean z13, c cVar, int i13, int i14, Integer num, int i15, d0 d0Var, bh.b bVar, boolean z14, boolean z15) {
        this.f27242a = z13;
        this.f27243b = cVar;
        this.f27244c = i13;
        this.f27245d = i14;
        this.f27246e = num;
        this.f27247f = i15;
        this.f27248g = d0Var;
        this.f27249h = bVar;
        this.f27250i = z14;
        this.f27251j = z15;
        this.f27253l = new f(this, 5);
        this.f27257p = true;
        this.f27258q = f1.BOTTOM_SHEET_SNAP_UNKNOWN;
    }
}
