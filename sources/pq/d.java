package pq;

import android.animation.AnimatorSet;
import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.n;
import com.airbnb.lottie.x;
import h32.g0;
import kh2.c3;
import kotlin.jvm.internal.Intrinsics;
import lh0.b0;
import m60.w;
import nx.d0;
import s71.h;
import s71.l;
import so.jb;
import xk2.v;
import ye2.o;

/* loaded from: classes3.dex */
public final class d extends LinearLayout implements af2.c {

    /* renamed from: a, reason: collision with root package name */
    public o f100968a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f100969b;

    /* renamed from: c, reason: collision with root package name */
    public final w f100970c;

    /* renamed from: d, reason: collision with root package name */
    public final d0 f100971d;

    /* renamed from: e, reason: collision with root package name */
    public final g0 f100972e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f100973f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f100974g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f100975h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f100976i;

    /* renamed from: j, reason: collision with root package name */
    public b f100977j;

    /* renamed from: k, reason: collision with root package name */
    public l f100978k;

    /* renamed from: l, reason: collision with root package name */
    public l f100979l;

    /* renamed from: m, reason: collision with root package name */
    public l f100980m;

    /* renamed from: n, reason: collision with root package name */
    public final b0 f100981n;

    /* renamed from: o, reason: collision with root package name */
    public final wk2.a f100982o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(w eventManager, d0 d0Var, g0 componentType, boolean z13, boolean z14, boolean z15, boolean z16, Context context, int i13) {
        super(context, null, 0);
        boolean z17 = (i13 & 32) != 0 ? false : z15;
        boolean z18 = (i13 & 64) != 0 ? false : z16;
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(componentType, "componentType");
        Intrinsics.checkNotNullParameter(context, "context");
        if (!this.f100969b) {
            this.f100969b = true;
            jb jbVar = (jb) ((e) generatedComponent());
            this.f100981n = jbVar.b();
            this.f100982o = jbVar.f113485c.f114327hc;
        }
        this.f100970c = eventManager;
        this.f100971d = d0Var;
        this.f100972e = componentType;
        this.f100973f = z13;
        this.f100974g = z14;
        this.f100975h = z17;
        this.f100976i = z18;
        this.f100977j = new b(null, null, null, false, false, 2047);
        setOrientation(z13 ? 1 : 0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 8388693));
        if (z13) {
            setGravity(8388613);
            setPaddingRelative(getPaddingStart(), getPaddingTop(), getPaddingEnd(), bs1.c.W(this, eo1.c.space_200));
        }
        setVisibility(8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0240  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(kotlin.jvm.functions.Function1 r55) {
        /*
            Method dump skipped, instructions count: 1006
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pq.d.a(kotlin.jvm.functions.Function1):void");
    }

    public final void b() {
        final l lVar = this.f100979l;
        if (!(lVar instanceof l)) {
            lVar = null;
        }
        if (lVar != null) {
            boolean z13 = this.f100977j.f100959e;
            if (lVar.f111382k) {
                if (lVar.f111389r) {
                    lVar.f();
                    return;
                }
                int i13 = 1;
                lVar.f111389r = true;
                v vVar = lVar.f111394w;
                boolean z14 = lVar.f111383l;
                if (z14) {
                    n.f(lVar.getContext(), vc2.e.glow_animation).b(new x() { // from class: s71.d
                        @Override // com.airbnb.lottie.x
                        public final void onResult(Object obj) {
                            l this$0 = l.this;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            this$0.c().t((com.airbnb.lottie.h) obj);
                            this$0.c().f28447b.setRepeatCount(-1);
                        }
                    });
                    ((AppCompatImageView) vVar.getValue()).setImageDrawable(lVar.c());
                    lVar.c().q();
                } else {
                    LottieAnimationView b13 = lVar.b();
                    b13.l2(vc2.e.glow_animation);
                    b13.k2();
                }
                if (z13) {
                    l.a(lVar, s71.a.EXPAND, 0L, 8);
                } else {
                    l.a(lVar, s71.a.COLLAPSE, 0L, 8);
                }
                i81.b bVar = i81.b.NONE;
                i81.b bVar2 = lVar.f111385n;
                if (bVar2 != bVar) {
                    AnimatorSet A = kg.a.A(0.65f, 0.0f, bVar2.getDuration(), z14 ? (AppCompatImageView) vVar.getValue() : lVar.b());
                    c3.i(A, new h(lVar, i13));
                    A.setStartDelay(bVar2.getDelay());
                    A.start();
                }
            }
        }
    }

    @Override // af2.c
    public final af2.b componentManager() {
        if (this.f100968a == null) {
            this.f100968a = new o(this);
        }
        return this.f100968a;
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f100968a == null) {
            this.f100968a = new o(this);
        }
        return this.f100968a.generatedComponent();
    }
}
