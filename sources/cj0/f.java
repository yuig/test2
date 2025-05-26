package cj0;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.ui.platform.ComposeView;
import com.google.android.material.appbar.AppBarLayout;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.toolbar.GestaltToolbarImpl;
import i2.f2;
import i2.y3;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f {

    /* renamed from: b, reason: collision with root package name */
    public u50.r f27814b;

    /* renamed from: c, reason: collision with root package name */
    public View f27815c;

    /* renamed from: d, reason: collision with root package name */
    public AppBarLayout f27816d;

    /* renamed from: e, reason: collision with root package name */
    public GestaltToolbarImpl f27817e;

    /* renamed from: f, reason: collision with root package name */
    public GestaltIconButton f27818f;

    /* renamed from: g, reason: collision with root package name */
    public int f27819g;

    /* renamed from: a, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f27813a = bs1.c.u1(new ej0.a(null, null, null, null, null, 63), y3.f71400a);

    /* renamed from: h, reason: collision with root package name */
    public a3.d f27820h = a3.d.f483e;

    /* renamed from: i, reason: collision with root package name */
    public final xk2.k f27821i = xk2.m.a(xk2.n.NONE, new jh0.d(this, 5));

    public static final void a(f fVar, i2.o oVar, int i13) {
        fVar.getClass();
        i2.s sVar = (i2.s) oVar;
        sVar.Y(-1737290133);
        fc0.n.a(false, null, false, false, q2.i.c(2103058763, new d(fVar, 0), sVar), sVar, 24576, 15);
        f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new tc0.i(fVar, i13, 4);
        }
    }

    public final void b(g displayState) {
        Intrinsics.checkNotNullParameter(displayState, "displayState");
        this.f27813a.setValue(displayState.f27825c);
        GestaltToolbarImpl gestaltToolbarImpl = this.f27817e;
        if (gestaltToolbarImpl == null) {
            Intrinsics.r("toolbar");
            throw null;
        }
        gj0.c cVar = displayState.f27824b;
        gestaltToolbarImpl.f0(cVar.f65188a);
        Context context = gestaltToolbarImpl.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        gestaltToolbarImpl.b0(cVar.f65189b.a(context));
        Integer num = cVar.f65190c;
        if (num != null) {
            gestaltToolbarImpl.M(num.intValue());
        }
        Integer num2 = cVar.f65191d;
        if (num2 != null) {
            int intValue = num2.intValue();
            Context context2 = gestaltToolbarImpl.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            gestaltToolbarImpl.setBackgroundColor(dl2.b.x0(context2, intValue));
        }
        Integer num3 = cVar.f65192e;
        if (num3 != null) {
            gestaltToolbarImpl.u().setTint(bs1.c.B(gestaltToolbarImpl, num3.intValue()));
        }
        Float f13 = cVar.f65195h;
        if (f13 != null) {
            gestaltToolbarImpl.z().animate().alpha(f13.floatValue()).setDuration(300L).start();
            u50.r rVar = this.f27814b;
            if (rVar == null) {
                Intrinsics.r("eventIntake");
                throw null;
            }
            rVar.a(new b1(gj0.f.f65197a));
        }
        GestaltIconButton gestaltIconButton = this.f27818f;
        if (gestaltIconButton == null) {
            Intrinsics.r("overflowButton");
            throw null;
        }
        gestaltIconButton.t(new hh0.a(cVar, 14));
        if (displayState.f27829g) {
            AppBarLayout appBarLayout = this.f27816d;
            if (appBarLayout != null) {
                appBarLayout.n(true, true, true);
            } else {
                Intrinsics.r("appBarLayout");
                throw null;
            }
        }
    }

    public final void c(View rootView, l82.c eventIntake) {
        Drawable drawable;
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
        this.f27815c = rootView;
        this.f27814b = eventIntake;
        View findViewById = rootView.findViewById(y60.c.board_header_container);
        AppBarLayout appBarLayout = (AppBarLayout) findViewById;
        Intrinsics.f(appBarLayout);
        appBarLayout.b((com.google.android.material.appbar.h) this.f27821i.getValue());
        Intrinsics.checkNotNullExpressionValue(findViewById, "apply(...)");
        this.f27816d = appBarLayout;
        View findViewById2 = rootView.findViewById(y60.c.toolbar);
        GestaltToolbarImpl gestaltToolbarImpl = (GestaltToolbarImpl) findViewById2;
        Intrinsics.f(gestaltToolbarImpl);
        rm1.q qVar = rm1.q.ARROW_BACK;
        Context context = gestaltToolbarImpl.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Context context2 = gestaltToolbarImpl.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        int drawableRes = qVar.drawableRes(context, dl2.b.f1(context2));
        final int i13 = 1;
        gestaltToolbarImpl.N(1);
        gestaltToolbarImpl.M(eo1.b.color_themed_background_default);
        Context context3 = gestaltToolbarImpl.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        int i14 = eo1.b.color_themed_dark_gray;
        Intrinsics.checkNotNullParameter(context3, "context");
        Object obj = d5.a.f53679a;
        Drawable drawable2 = context3.getDrawable(drawableRes);
        Intrinsics.checkNotNullParameter(context3, "context");
        if (drawable2 != null) {
            int color = i14 == 0 ? context3.getColor(df0.a.f54892a) : context3.getColor(i14);
            Intrinsics.checkNotNullParameter(context3, "context");
            if (color == 0) {
                color = context3.getColor(df0.a.f54892a);
            }
            drawable = drawable2.mutate();
            drawable.setTint(color);
        } else {
            drawable = null;
        }
        gestaltToolbarImpl.S(drawable);
        final int i15 = 0;
        gestaltToolbarImpl.v().setOnClickListener(new View.OnClickListener(this) { // from class: cj0.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f27783b;

            {
                this.f27783b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i16 = i15;
                f this$0 = this.f27783b;
                switch (i16) {
                    case 0:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        u50.r rVar = this$0.f27814b;
                        if (rVar != null) {
                            rVar.a(new b1(gj0.a.f65184a));
                            return;
                        } else {
                            Intrinsics.r("eventIntake");
                            throw null;
                        }
                    case 1:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        u50.r rVar2 = this$0.f27814b;
                        if (rVar2 != null) {
                            rVar2.a(new b1(gj0.g.f65198a));
                            return;
                        } else {
                            Intrinsics.r("eventIntake");
                            throw null;
                        }
                    default:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        u50.r rVar3 = this$0.f27814b;
                        if (rVar3 != null) {
                            rVar3.a(new b1(gj0.e.f65196a));
                            return;
                        } else {
                            Intrinsics.r("eventIntake");
                            throw null;
                        }
                }
            }
        });
        gestaltToolbarImpl.z().setOnClickListener(new View.OnClickListener(this) { // from class: cj0.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f27783b;

            {
                this.f27783b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i16 = i13;
                f this$0 = this.f27783b;
                switch (i16) {
                    case 0:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        u50.r rVar = this$0.f27814b;
                        if (rVar != null) {
                            rVar.a(new b1(gj0.a.f65184a));
                            return;
                        } else {
                            Intrinsics.r("eventIntake");
                            throw null;
                        }
                    case 1:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        u50.r rVar2 = this$0.f27814b;
                        if (rVar2 != null) {
                            rVar2.a(new b1(gj0.g.f65198a));
                            return;
                        } else {
                            Intrinsics.r("eventIntake");
                            throw null;
                        }
                    default:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        u50.r rVar3 = this$0.f27814b;
                        if (rVar3 != null) {
                            rVar3.a(new b1(gj0.e.f65196a));
                            return;
                        } else {
                            Intrinsics.r("eventIntake");
                            throw null;
                        }
                }
            }
        });
        gestaltToolbarImpl.z().setAlpha(0.0f);
        gestaltToolbarImpl.H();
        int i16 = m60.t0.board_host_options_icon;
        rm1.q qVar2 = rm1.q.ELLIPSIS;
        View view = this.f27815c;
        if (view == null) {
            Intrinsics.r("rootView");
            throw null;
        }
        String string = view.getResources().getString(m60.x0.more_options);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        final int i17 = 2;
        View.OnClickListener onClickListener = new View.OnClickListener(this) { // from class: cj0.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f27783b;

            {
                this.f27783b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i162 = i17;
                f this$0 = this.f27783b;
                switch (i162) {
                    case 0:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        u50.r rVar = this$0.f27814b;
                        if (rVar != null) {
                            rVar.a(new b1(gj0.a.f65184a));
                            return;
                        } else {
                            Intrinsics.r("eventIntake");
                            throw null;
                        }
                    case 1:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        u50.r rVar2 = this$0.f27814b;
                        if (rVar2 != null) {
                            rVar2.a(new b1(gj0.g.f65198a));
                            return;
                        } else {
                            Intrinsics.r("eventIntake");
                            throw null;
                        }
                    default:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        u50.r rVar3 = this$0.f27814b;
                        if (rVar3 != null) {
                            rVar3.a(new b1(gj0.e.f65196a));
                            return;
                        } else {
                            Intrinsics.r("eventIntake");
                            throw null;
                        }
                }
            }
        };
        View view2 = this.f27815c;
        if (view2 == null) {
            Intrinsics.r("rootView");
            throw null;
        }
        Context context4 = view2.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        GestaltIconButton gestaltIconButton = new GestaltIconButton(6, context4, (AttributeSet) null);
        gestaltIconButton.t(new rq.a0(string, qVar2, i16, i17));
        gestaltIconButton.u(new jq.m(onClickListener, gestaltIconButton, 1));
        gestaltToolbarImpl.c(gestaltIconButton);
        this.f27818f = gestaltIconButton;
        Intrinsics.checkNotNullExpressionValue(findViewById2, "apply(...)");
        this.f27817e = gestaltToolbarImpl;
        ComposeView composeView = (ComposeView) rootView.findViewById(y60.c.automagical_board_header);
        d dVar = new d(this, i13);
        Object obj2 = q2.i.f102113a;
        composeView.o(new q2.h(dVar, true, 1867123712));
    }

    public final void d() {
        AppBarLayout appBarLayout = this.f27816d;
        if (appBarLayout != null) {
            appBarLayout.l((com.google.android.material.appbar.h) this.f27821i.getValue());
        } else {
            Intrinsics.r("appBarLayout");
            throw null;
        }
    }
}
