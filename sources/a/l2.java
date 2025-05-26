package a;

import ads_mobile_sdk.ed2;
import ads_mobile_sdk.et;
import ads_mobile_sdk.kd1;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.EditText;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TableRow;
import androidx.media3.ui.PlayerControlView;
import com.facebook.login.DeviceAuthDialog;
import com.pinterest.activity.newshub.view.content.NewsHubLibrofileView;
import com.pinterest.activity.nux.NUXActivity;
import com.pinterest.activity.pin.view.PinCloseupChevronIconView;
import com.pinterest.activity.pin.view.modules.PinCloseupBaseModule;
import com.pinterest.activity.pin.view.modules.PinCloseupFavoriteModule;
import com.pinterest.activity.pin.view.modules.PinCloseupLegoActionButtonModule;
import com.pinterest.activity.sendapin.model.TypeAheadItem;
import com.pinterest.api.model.bm;
import com.pinterest.api.model.em;
import com.pinterest.api.model.ew;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.fm;
import com.pinterest.api.model.fw;
import com.pinterest.api.model.gm;
import com.pinterest.api.model.gw;
import com.pinterest.api.model.jm;
import com.pinterest.api.model.mm;
import com.pinterest.api.model.pm;
import com.pinterest.api.model.wy0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.repository.pin.PinService;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import m60.x0;
import net.quikkly.android.utils.BitmapUtils;

/* loaded from: classes2.dex */
public final /* synthetic */ class l2 implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f78a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f79b;

    public /* synthetic */ l2(Object obj, int i13) {
        this.f78a = i13;
        this.f79b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Context context;
        uj2.b uVar;
        Context context2;
        String str;
        f30 pin;
        String str2;
        com.pinterest.api.model.hh t53;
        String uid;
        boolean z13;
        String uid2;
        h32.v0 v0Var;
        String str3;
        String v13;
        qh1.f fVar;
        wy0 L3;
        String i13;
        em p43;
        List b13;
        Iterator it;
        Map c13;
        ck2.c cVar = ck2.i.f27923c;
        int i14 = 6;
        int i15 = this.f78a;
        int i16 = 5;
        boolean z14 = false;
        AttributeSet attributeSet = null;
        Object obj = this.f79b;
        switch (i15) {
            case 0:
                et.a((ed2) obj, view);
                return;
            case 1:
                kd1.a((kd1) obj, view);
                return;
            case 2:
            case 27:
            default:
                final tq.b this$0 = (tq.b) obj;
                int i17 = tq.b.f118799j;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (!this$0.f118801b) {
                    if (this$0.f118806g) {
                        return;
                    }
                    this$0.f118806g = true;
                    this$0.g(((tq.g0) this$0).f118854k);
                    ViewGroup viewGroup = this$0.f118805f;
                    if (viewGroup != null) {
                        viewGroup.measure(View.MeasureSpec.makeMeasureSpec((this$0.getWidth() - this$0.getPaddingStart()) - this$0.getPaddingEnd(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                    }
                    this$0.b();
                    ValueAnimator ofInt = ValueAnimator.ofInt(this$0.getMeasuredHeight(), this$0.f118807h);
                    final int i18 = 1;
                    ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: tq.d
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator animation) {
                            int i19 = i18;
                            b this$02 = this$0;
                            switch (i19) {
                                case 0:
                                    int i23 = b.f118799j;
                                    Intrinsics.checkNotNullParameter(this$02, "this$0");
                                    Intrinsics.checkNotNullParameter(animation, "animation");
                                    ViewGroup.LayoutParams layoutParams = this$02.getLayoutParams();
                                    Object animatedValue = animation.getAnimatedValue();
                                    Intrinsics.g(animatedValue, "null cannot be cast to non-null type kotlin.Int");
                                    layoutParams.height = ((Integer) animatedValue).intValue();
                                    this$02.requestLayout();
                                    break;
                                default:
                                    int i24 = b.f118799j;
                                    Intrinsics.checkNotNullParameter(this$02, "this$0");
                                    Intrinsics.checkNotNullParameter(animation, "animation");
                                    ViewGroup.LayoutParams layoutParams2 = this$02.getLayoutParams();
                                    Object animatedValue2 = animation.getAnimatedValue();
                                    Intrinsics.g(animatedValue2, "null cannot be cast to non-null type kotlin.Int");
                                    layoutParams2.height = ((Integer) animatedValue2).intValue();
                                    this$02.requestLayout();
                                    break;
                            }
                        }
                    });
                    ofInt.addListener(new tq.f(this$0, 0));
                    ofInt.setDuration(200L);
                    ofInt.setInterpolator(new DecelerateInterpolator());
                    ofInt.start();
                    PinCloseupChevronIconView pinCloseupChevronIconView = this$0.f118804e;
                    if (pinCloseupChevronIconView == null) {
                        Intrinsics.r("chevronIcon");
                        throw null;
                    }
                    pinCloseupChevronIconView.X(200L, true);
                    this$0.f118801b = true;
                    return;
                }
                if (this$0.f118806g) {
                    return;
                }
                this$0.f118806g = true;
                if (this$0.e().getChildCount() == 0) {
                    tq.g0 g0Var = (tq.g0) this$0;
                    ViewGroup e13 = g0Var.e();
                    e13.setId(n80.c.pdp_product_details_expanded_content);
                    f30 pin2 = g0Var.getPin();
                    if (pin2 != null && (p43 = pin2.p4()) != null && (b13 = p43.b()) != null) {
                        Iterator it2 = b13.iterator();
                        while (it2.hasNext()) {
                            gp0.a a13 = ((bm) it2.next()).a(g0Var.f118856m);
                            if (a13 instanceof gm) {
                                String a14 = ((gm) a13).a();
                                if (a14 != null) {
                                    e13.addView(g0Var.i(a14, z14));
                                }
                            } else {
                                int i19 = -2;
                                int i23 = -1;
                                if (a13 instanceof fm) {
                                    String a15 = ((fm) a13).a();
                                    if (a15 != null) {
                                        Context context3 = g0Var.getContext();
                                        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                                        GestaltText gestaltText = new GestaltText(i14, context3, attributeSet);
                                        gestaltText.i(new rq.l2(a15, i16));
                                        gestaltText.setTextDirection(i16);
                                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                                        layoutParams.setMargins(z14 ? 1 : 0, z14 ? 1 : 0, z14 ? 1 : 0, gestaltText.getResources().getDimensionPixelOffset(eo1.c.space_100));
                                        gestaltText.setLayoutParams(layoutParams);
                                        e13.addView(gestaltText);
                                    }
                                } else if (a13 instanceof jm) {
                                    List<String> c14 = ((jm) a13).c();
                                    if (c14 != null) {
                                        for (String str4 : c14) {
                                            Intrinsics.f(str4);
                                            e13.addView(g0Var.i(str4, true));
                                        }
                                    }
                                } else {
                                    if (a13 instanceof pm) {
                                        List c15 = ((pm) a13).c();
                                        if (c15 != null) {
                                            HorizontalScrollView horizontalScrollView = new HorizontalScrollView(g0Var.getContext());
                                            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                                            layoutParams2.setMargins(z14 ? 1 : 0, z14 ? 1 : 0, z14 ? 1 : 0, horizontalScrollView.getResources().getDimensionPixelOffset(eo1.c.space_200));
                                            horizontalScrollView.setLayoutParams(layoutParams2);
                                            TableLayout tableLayout = new TableLayout(g0Var.getContext());
                                            tableLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
                                            tableLayout.setShowDividers(7);
                                            tableLayout.setDividerDrawable(tableLayout.getContext().getDrawable(n80.b.structured_description_table_divider));
                                            Iterator it3 = c15.iterator();
                                            int i24 = z14 ? 1 : 0;
                                            while (it3.hasNext()) {
                                                Object next = it3.next();
                                                int i25 = i24 + 1;
                                                if (i24 < 0) {
                                                    kotlin.collections.f0.p();
                                                    throw null;
                                                }
                                                TableRow tableRow = new TableRow(g0Var.getContext());
                                                tableRow.setLayoutParams(new TableLayout.LayoutParams(i23, i19));
                                                for (String str5 : (List) next) {
                                                    Context context4 = g0Var.getContext();
                                                    Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                                                    GestaltText gestaltText2 = new GestaltText(6, context4, (AttributeSet) null);
                                                    TableRow.LayoutParams layoutParams3 = new TableRow.LayoutParams(-2, -2);
                                                    layoutParams3.setMargins(0, 0, gestaltText2.getResources().getDimensionPixelOffset(eo1.c.space_400), 0);
                                                    gestaltText2.setLayoutParams(layoutParams3);
                                                    gestaltText2.setTextDirection(5);
                                                    gestaltText2.i(new rq.e2(str5, i24, 1));
                                                    tableRow.addView(gestaltText2);
                                                    it3 = it3;
                                                    it2 = it2;
                                                }
                                                Iterator it4 = it3;
                                                Iterator it5 = it2;
                                                if (!r14.isEmpty()) {
                                                    tableLayout.addView(tableRow);
                                                }
                                                i24 = i25;
                                                it3 = it4;
                                                it2 = it5;
                                                i19 = -2;
                                                i23 = -1;
                                            }
                                            it = it2;
                                            horizontalScrollView.addView(tableLayout);
                                            e13.addView(horizontalScrollView);
                                        }
                                    } else {
                                        it = it2;
                                        if ((a13 instanceof mm) && (c13 = ((mm) a13).c()) != null) {
                                            HorizontalScrollView horizontalScrollView2 = new HorizontalScrollView(g0Var.getContext());
                                            LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
                                            layoutParams4.setMargins(0, 0, 0, horizontalScrollView2.getResources().getDimensionPixelOffset(eo1.c.space_200));
                                            horizontalScrollView2.setLayoutParams(layoutParams4);
                                            TableLayout tableLayout2 = new TableLayout(g0Var.getContext());
                                            tableLayout2.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
                                            tableLayout2.setShowDividers(7);
                                            tableLayout2.setDividerDrawable(tableLayout2.getContext().getDrawable(n80.b.structured_description_table_divider));
                                            tableLayout2.setColumnShrinkable(0, true);
                                            tableLayout2.setColumnShrinkable(1, true);
                                            for (Map.Entry entry : c13.entrySet()) {
                                                TableRow tableRow2 = new TableRow(g0Var.getContext());
                                                tableRow2.setLayoutParams(new TableLayout.LayoutParams(-1, -2));
                                                tableRow2.addView(g0Var.j(true));
                                                tableRow2.addView(g0Var.j(false));
                                                tableLayout2.addView(tableRow2);
                                            }
                                            horizontalScrollView2.addView(tableLayout2);
                                            e13.addView(horizontalScrollView2);
                                        }
                                    }
                                    it2 = it;
                                    i14 = 6;
                                    i16 = 5;
                                    z14 = false;
                                    attributeSet = null;
                                }
                            }
                        }
                    }
                    Context context5 = g0Var.getContext();
                    Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
                    GestaltText gestaltText3 = new GestaltText(6, context5, (AttributeSet) null);
                    gestaltText3.i(tq.g.f118843q);
                    int i26 = 0;
                    gestaltText3.setPaddingRelative(0, bs1.c.W(gestaltText3, eo1.c.margin), 0, 0);
                    gestaltText3.setTextDirection(5);
                    f30 pin3 = g0Var.getPin();
                    if (pin3 != null && (L3 = pin3.L3()) != null && (i13 = dl2.b.i1(L3)) != null && i13.length() > 0) {
                        gestaltText3.i(new tq.f0(gestaltText3, i13, i26));
                        db.m mVar = new db.m(g0Var, 23);
                        SpannableString spannableString = new SpannableString(gestaltText3.getText());
                        int L = StringsKt.L(spannableString, i13, 0, false, 6);
                        if (L >= 0) {
                            try {
                                spannableString.setSpan(new j4.f(mVar, 3), L, i13.length() + L, 33);
                                pk.a0.q(gestaltText3, bs1.c.h2(spannableString));
                                gestaltText3.setMovementMethod(LinkMovementMethod.getInstance());
                                gestaltText3.setHighlightColor(0);
                                gestaltText3.setLinkTextColor(g0Var.getContext().getColor(eo1.b.color_themed_text_default));
                            } catch (Exception e14) {
                                HashSet hashSet = tb0.h.f117076w;
                                tb0.g.f117075a.q(e14, "Ship and sold by merchant label is not working", tb0.p.PDP);
                            }
                        }
                    }
                    e13.addView(gestaltText3);
                }
                this$0.g(((tq.g0) this$0).f118855l);
                this$0.f118807h = this$0.getMeasuredHeight();
                this$0.e().measure(View.MeasureSpec.makeMeasureSpec((this$0.getWidth() - this$0.getPaddingStart()) - this$0.getPaddingEnd(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                GestaltText gestaltText4 = this$0.f118802c;
                if (gestaltText4 == null) {
                    Intrinsics.r("titleView");
                    throw null;
                }
                int F0 = bs1.c.F0(this$0.e()) + bs1.c.F0(gestaltText4);
                this$0.b();
                ValueAnimator ofInt2 = ValueAnimator.ofInt(this$0.getHeight(), F0);
                final int i27 = 0;
                ofInt2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: tq.d
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator animation) {
                        int i192 = i27;
                        b this$02 = this$0;
                        switch (i192) {
                            case 0:
                                int i232 = b.f118799j;
                                Intrinsics.checkNotNullParameter(this$02, "this$0");
                                Intrinsics.checkNotNullParameter(animation, "animation");
                                ViewGroup.LayoutParams layoutParams5 = this$02.getLayoutParams();
                                Object animatedValue = animation.getAnimatedValue();
                                Intrinsics.g(animatedValue, "null cannot be cast to non-null type kotlin.Int");
                                layoutParams5.height = ((Integer) animatedValue).intValue();
                                this$02.requestLayout();
                                break;
                            default:
                                int i242 = b.f118799j;
                                Intrinsics.checkNotNullParameter(this$02, "this$0");
                                Intrinsics.checkNotNullParameter(animation, "animation");
                                ViewGroup.LayoutParams layoutParams22 = this$02.getLayoutParams();
                                Object animatedValue2 = animation.getAnimatedValue();
                                Intrinsics.g(animatedValue2, "null cannot be cast to non-null type kotlin.Int");
                                layoutParams22.height = ((Integer) animatedValue2).intValue();
                                this$02.requestLayout();
                                break;
                        }
                    }
                });
                ofInt2.addListener(new tq.f(this$0, 1));
                ofInt2.setDuration(200L);
                ofInt2.setInterpolator(new AccelerateInterpolator());
                ofInt2.start();
                PinCloseupChevronIconView pinCloseupChevronIconView2 = this$0.f118804e;
                if (pinCloseupChevronIconView2 == null) {
                    Intrinsics.r("chevronIcon");
                    throw null;
                }
                pinCloseupChevronIconView2.T(200L, true);
                this$0.f118801b = false;
                return;
            case 3:
                androidx.media3.ui.m mVar2 = (androidx.media3.ui.m) obj;
                int i28 = androidx.media3.ui.m.f19050y;
                int k13 = mVar2.k();
                PlayerControlView playerControlView = mVar2.f19054x;
                View view2 = playerControlView.f18977u;
                if (k13 == 0) {
                    view2.getClass();
                    playerControlView.a(playerControlView.f18962f, view2);
                    return;
                } else if (k13 != 1) {
                    playerControlView.f18965i.dismiss();
                    return;
                } else {
                    view2.getClass();
                    playerControlView.a(playerControlView.f18964h, view2);
                    return;
                }
            case 4:
                androidx.media3.ui.i iVar = (androidx.media3.ui.i) obj;
                iVar.getClass();
                float[] fArr = PlayerControlView.U;
                iVar.f19042g.getClass();
                return;
            case 5:
                le.p this$02 = (le.p) obj;
                int i29 = le.p.f83090h;
                if (p001if.a.b(le.p.class)) {
                    return;
                }
                try {
                    Intrinsics.checkNotNullParameter(this$02, "this$0");
                    Context context6 = this$02.getContext();
                    if (!p001if.a.b(this$02)) {
                        try {
                            me.r rVar = new me.r(context6, null);
                            String str6 = this$02.f83092b;
                            le.v vVar = le.v.f83104a;
                            if (le.o0.b()) {
                                rVar.f87020a.f(str6, null);
                            }
                        } catch (Throwable th3) {
                            p001if.a.a(this$02, th3);
                        }
                    }
                    View.OnClickListener onClickListener = this$02.f83094d;
                    if (onClickListener != null) {
                        onClickListener.onClick(view);
                        return;
                    }
                    View.OnClickListener onClickListener2 = this$02.f83093c;
                    if (onClickListener2 == null) {
                        return;
                    }
                    onClickListener2.onClick(view);
                    return;
                } catch (Throwable th4) {
                    p001if.a.a(le.p.class, th4);
                    return;
                }
            case 6:
                df.t1 this$03 = (df.t1) obj;
                int i33 = df.t1.f54845m;
                Intrinsics.checkNotNullParameter(this$03, "this$0");
                this$03.cancel();
                return;
            case 7:
                DeviceAuthDialog this$04 = (DeviceAuthDialog) obj;
                int i34 = DeviceAuthDialog.B;
                Intrinsics.checkNotNullParameter(this$04, "this$0");
                this$04.W6();
                return;
            case 8:
                com.google.android.material.datepicker.w wVar = (com.google.android.material.datepicker.w) obj;
                wVar.Q.setEnabled(wVar.U6().N1());
                wVar.O.toggle();
                wVar.D = wVar.D == 1 ? 0 : 1;
                wVar.Y6(wVar.O);
                wVar.X6();
                return;
            case 9:
                ((com.google.android.material.textfield.k) obj).u();
                return;
            case 10:
                com.google.android.material.textfield.u uVar2 = (com.google.android.material.textfield.u) obj;
                EditText editText = uVar2.f33313f;
                if (editText == null) {
                    return;
                }
                int selectionEnd = editText.getSelectionEnd();
                EditText editText2 = uVar2.f33313f;
                if (editText2 == null || !(editText2.getTransformationMethod() instanceof PasswordTransformationMethod)) {
                    uVar2.f33313f.setTransformationMethod(PasswordTransformationMethod.getInstance());
                } else {
                    uVar2.f33313f.setTransformationMethod(null);
                }
                if (selectionEnd >= 0) {
                    uVar2.f33313f.setSelection(selectionEnd);
                }
                uVar2.q();
                return;
            case 11:
                xo.i this$05 = (xo.i) obj;
                Intrinsics.checkNotNullParameter(this$05, "this$0");
                nx.j0 j0Var = this$05.f135519i;
                h32.u0 u0Var = h32.u0.BOARD_LEAVE_BUTTON;
                h32.g0 g0Var2 = h32.g0.MODAL_DIALOG;
                com.pinterest.api.model.v7 v7Var = this$05.f135512b;
                j0Var.b0(u0Var, g0Var2, v7Var.getUid(), false);
                h32.i0 generateLoggingContext = this$05.f135519i.f92406a.generateLoggingContext();
                xo.q qVar = (xo.q) this$05.f135522l;
                String string = (qVar == null || (context = qVar.getContext()) == null) ? null : context.getString(d70.g.left_board);
                this$05.f135517g.K(v7Var).l(tk2.e.f118017c).i(new xo.c((Object) generateLoggingContext, (Object) this$05, (Object) (string != null ? string : ""), 0), new vo.a(4, xo.f.f135497k));
                c.y(m60.u.f85943a);
                return;
            case 12:
                xo.i this$06 = (xo.i) obj;
                Intrinsics.checkNotNullParameter(this$06, "this$0");
                nx.j0 j0Var2 = this$06.f135519i;
                h32.u0 u0Var2 = h32.u0.BOARD_LEAVE_BUTTON;
                h32.g0 g0Var3 = h32.g0.MODAL_DIALOG;
                com.pinterest.api.model.v7 board = this$06.f135512b;
                j0Var2.b0(u0Var2, g0Var3, board.getUid(), false);
                h32.i0 generateLoggingContext2 = this$06.f135519i.f92406a.generateLoggingContext();
                xo.d0 d0Var = (xo.d0) this$06.f135522l;
                String string2 = (d0Var == null || (context2 = d0Var.getContext()) == null) ? null : context2.getString(d70.g.left_board);
                String str7 = string2 != null ? string2 : "";
                x02.x0 x0Var = this$06.f135513c;
                x0Var.getClass();
                Intrinsics.checkNotNullParameter(board, "board");
                if (kh2.d.M0(board)) {
                    String uid3 = board.getUid();
                    Intrinsics.checkNotNullExpressionValue(uid3, "getUid(...)");
                    uVar = x0Var.f131526y.a(x0Var.m(new x02.i0(uid3), board));
                    ck2.i.b(uVar, "source is null");
                } else {
                    com.pinterest.api.model.u7 G1 = board.G1();
                    Boolean bool = Boolean.FALSE;
                    G1.g(bool);
                    G1.q(bool);
                    com.pinterest.api.model.v7 a16 = G1.a();
                    Intrinsics.checkNotNullExpressionValue(a16, "build(...)");
                    String uid4 = board.getUid();
                    Intrinsics.checkNotNullExpressionValue(uid4, "getUid(...)");
                    uj2.l G = x0Var.G(new x02.p0(uid4), a16);
                    G.getClass();
                    uVar = new hk2.u(G);
                }
                fk2.x xVar = new fk2.x(uVar, new x02.e0(7, new x02.s0(x0Var, 3)), ck2.i.f27924d, cVar);
                Intrinsics.checkNotNullExpressionValue(xVar, "doOnSubscribe(...)");
                xVar.l(tk2.e.f118017c).i(new xo.c((Object) generateLoggingContext2, (Object) this$06, (Object) str7, 1), new vo.a(8, xo.f.f135500n));
                c.y(m60.u.f85943a);
                return;
            case 13:
                xo.d0 this$07 = (xo.d0) obj;
                int i35 = xo.d0.f135473x;
                Intrinsics.checkNotNullParameter(this$07, "this$0");
                this$07.getClass();
                m60.u.f85943a.d(new xo.a0());
                return;
            case 14:
                bp.e eVar = (bp.e) obj;
                Object obj2 = eVar.f23624u;
                if (obj2 != null) {
                    dl1.s sVar = (dl1.s) obj2;
                    bp.k kVar = (bp.k) eVar;
                    int i36 = kVar.B;
                    bp.g gVar = kVar.C;
                    switch (i36) {
                        case 0:
                            ((xo.i) ((bp.l) gVar).f23632f).b(((com.pinterest.api.model.qc) sVar).f41259b);
                            return;
                        default:
                            ((xo.i) ((bp.o) gVar).f23632f).b((wy0) sVar);
                            return;
                    }
                }
                return;
            case 15:
                final cp.n nVar = (cp.n) obj;
                HashSet hashSet2 = nVar.f52958p0;
                if (hashSet2 == null || hashSet2.isEmpty()) {
                    nVar.f52955m0.b(nVar.getResources().getString(xc0.i.create_conversation_empty_selection));
                    return;
                }
                Iterator it6 = nVar.f52958p0.iterator();
                while (true) {
                    if (it6.hasNext()) {
                        TypeAheadItem typeAheadItem = (TypeAheadItem) it6.next();
                        gw gwVar = fw.f37821a;
                        String A = typeAheadItem.A();
                        gwVar.getClass();
                        wy0 e15 = A == null ? null : ew.e(A);
                        if (e15 != null && e15.s2().booleanValue()) {
                            nVar.f52955m0.i(nVar.getResources().getString(xc0.i.block_user_create_conversation_message));
                        }
                    }
                }
                final boolean z15 = !oh.e.a(nVar.f52960r0);
                final boolean z16 = !oh.e.a(nVar.f52961s0);
                kk2.b j13 = oo1.j.j(nVar.f52958p0);
                ak2.f fVar2 = new ak2.f() { // from class: cp.j
                    @Override // ak2.f
                    public final Object apply(Object obj3) {
                        Pair pair = (Pair) obj3;
                        int i37 = n.f52942w0;
                        n nVar2 = n.this;
                        nVar2.getClass();
                        Collection collection = (Collection) pair.f80346a;
                        List list = (List) pair.f80347b;
                        boolean z17 = z15;
                        List singletonList = z17 ? Collections.singletonList(nVar2.f52960r0) : null;
                        boolean z18 = z16;
                        return oo1.j.a(collection, list, singletonList, z18 ? nVar2.f52961s0 : null, (z17 || z18) ? y32.f.CONTEXTUAL_MENU.value() : y32.c.NEW_MESSAGE.value(), nVar2.f52952j0);
                    }
                };
                final int i37 = 0;
                final int i38 = 1;
                nVar.R6(new kk2.m(j13, fVar2, 0).o(new ak2.e() { // from class: cp.k
                    @Override // ak2.e
                    public final void accept(Object obj3) {
                        int i39 = i37;
                        n nVar2 = nVar;
                        switch (i39) {
                            case 0:
                                oo1.j.s(nVar2.f52954l0, nVar2.I, (z40.n) obj3);
                                break;
                            default:
                                int i43 = n.f52942w0;
                                oo1.j.r(nVar2.getResources().getString(x0.pinmarklet_generic_error), (Throwable) obj3);
                                break;
                        }
                    }
                }, new ak2.e() { // from class: cp.k
                    @Override // ak2.e
                    public final void accept(Object obj3) {
                        int i39 = i38;
                        n nVar2 = nVar;
                        switch (i39) {
                            case 0:
                                oo1.j.s(nVar2.f52954l0, nVar2.I, (z40.n) obj3);
                                break;
                            default:
                                int i43 = n.f52942w0;
                                oo1.j.r(nVar2.getResources().getString(x0.pinmarklet_generic_error), (Throwable) obj3);
                                break;
                        }
                    }
                }));
                return;
            case 16:
                mp.b this$08 = (mp.b) obj;
                int i39 = mp.b.f87833e;
                Intrinsics.checkNotNullParameter(this$08, "this$0");
                this$08.getClass();
                NavigationImpl w13 = Navigation.w1((ScreenLocation) com.pinterest.screens.a1.f50496c.getValue());
                w13.y0(Boolean.TRUE, "com.pinterest.EXTRA_IS_CONTACT_REQUEST_ON_DETAILS_PAGE");
                m60.w wVar2 = this$08.f87836c;
                if (wVar2 == null) {
                    Intrinsics.r("eventManager");
                    throw null;
                }
                wVar2.d(new kp.j());
                m60.w wVar3 = this$08.f87836c;
                if (wVar3 != null) {
                    wVar3.d(w13);
                    return;
                } else {
                    Intrinsics.r("eventManager");
                    throw null;
                }
            case 17:
                mp.k this$09 = (mp.k) obj;
                int i43 = mp.k.f87866e;
                Intrinsics.checkNotNullParameter(this$09, "this$0");
                this$09.performHapticFeedback(6);
                nx.f0 f0Var = this$09.f87870d;
                if (f0Var == null) {
                    Intrinsics.r("pinalyticsFactory");
                    throw null;
                }
                ((nx.m) f0Var).a(this$09).X(h32.u0.CONVERSATION_CREATE_BUTTON);
                m60.w wVar4 = this$09.f87869c;
                if (wVar4 != null) {
                    wVar4.d(Navigation.w1(com.pinterest.screens.a1.a()));
                    return;
                } else {
                    Intrinsics.r("eventManager");
                    throw null;
                }
            case 18:
                NewsHubLibrofileView this$010 = (NewsHubLibrofileView) obj;
                int i44 = NewsHubLibrofileView.f34956f;
                Intrinsics.checkNotNullParameter(this$010, "this$0");
                wy0 wy0Var = this$010.f34960e;
                if (wy0Var != null) {
                    r41.k kVar2 = r41.k.f106176a;
                    String uid5 = wy0Var.getUid();
                    Intrinsics.checkNotNullExpressionValue(uid5, "getUid(...)");
                    kVar2.d(uid5, r41.b.NewsHubLibrofileView);
                    return;
                }
                return;
            case 19:
                NUXActivity.onCreate$lambda$7$lambda$6$lambda$5((NUXActivity) obj, view);
                return;
            case 20:
                oq.q this$011 = (oq.q) obj;
                int i45 = oq.q.f97119k;
                Intrinsics.checkNotNullParameter(this$011, "this$0");
                b11.d.d(this$011.f97129j);
                b11.d dVar = this$011.f97129j;
                boolean a17 = dVar.a();
                ImageView imageView = this$011.f97126g;
                long j14 = dVar.f20980b;
                PinCloseupChevronIconView pinCloseupChevronIconView3 = this$011.f97125f;
                if (a17) {
                    int i46 = PinCloseupChevronIconView.f34986b;
                    pinCloseupChevronIconView3.T(j14, false);
                    imageView.animate().alpha(0.0f).setDuration(j14).setListener(null).start();
                    this$011.f97122c.invoke();
                    return;
                }
                int i47 = PinCloseupChevronIconView.f34986b;
                pinCloseupChevronIconView3.X(j14, false);
                imageView.animate().alpha(1.0f).setDuration(j14).setListener(null).start();
                this$011.f97123d.invoke();
                return;
            case 21:
                rq.q this$012 = (rq.q) obj;
                int i48 = rq.q.f109482m;
                Intrinsics.checkNotNullParameter(this$012, "this$0");
                String str8 = this$012.f109492l;
                if (str8 == null) {
                    f30 pin4 = this$012.getPin();
                    String D = pin4 != null ? com.bumptech.glide.c.D(pin4) : null;
                    if (D == null) {
                        return;
                    } else {
                        str = D;
                    }
                } else {
                    str = str8;
                }
                pin = this$012.getPin();
                nx.d0 viewPinalytics = this$012.getViewPinalytics();
                if (pin != null && viewPinalytics != null) {
                    viewPinalytics.N(h32.f1.PIN_CLICK, null, h32.g0.PIN_CLOSEUP_TITLE, pin.getUid(), false);
                    if (!pin.U4().booleanValue()) {
                        np0.g closeupActionController = this$012.getCloseupActionController();
                        Context context7 = this$012.getContext();
                        Intrinsics.checkNotNullExpressionValue(context7, "getContext(...)");
                        closeupActionController.a(context7, pin, str, "pin", viewPinalytics, this$012.getContainerPinSpamParams(), this$012.getBaseDisposables(), (r25 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? null : null, (r25 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? Boolean.FALSE : null, (r25 & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 0 ? new HashMap() : null, false);
                    }
                }
                if (this$012.f109483c) {
                    f30 pin5 = this$012.getPin();
                    nx.d0 viewPinalytics2 = this$012.getViewPinalytics();
                    if (pin5 == null || viewPinalytics2 == null) {
                        return;
                    }
                    viewPinalytics2.f0(h32.u0.WEBSITE_BUTTON, h32.g0.MODAL_PIN, pin5.getUid(), this$012.getPinAuxHelper().m(pin5), false);
                    return;
                }
                return;
            case 22:
                rq.s this$013 = (rq.s) obj;
                int i49 = rq.s.f109527k;
                Intrinsics.checkNotNullParameter(this$013, "this$0");
                nx.d0 viewPinalytics3 = this$013.getViewPinalytics();
                if (viewPinalytics3 == null) {
                    return;
                }
                this$013.f109532h.s3(viewPinalytics3);
                viewPinalytics3.h0((r18 & 1) != 0 ? h32.f1.TAP : h32.f1.TAP, (r18 & 2) != 0 ? null : h32.u0.CREATOR_ANALYTICS_OPEN_DRAWER_BUTTON, (r18 & 4) != 0 ? null : h32.g0.PIN_CLOSEUP_PIN_ANALYTICS, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                return;
            case 23:
                rq.d0 this$014 = (rq.d0) obj;
                int i53 = rq.d0.f109129f;
                Intrinsics.checkNotNullParameter(this$014, "this$0");
                String str9 = this$014.f109134e;
                if (str9 == null) {
                    f30 pin6 = this$014.getPin();
                    String D2 = pin6 != null ? com.bumptech.glide.c.D(pin6) : null;
                    if (D2 == null) {
                        return;
                    } else {
                        str2 = D2;
                    }
                } else {
                    str2 = str9;
                }
                PinCloseupBaseModule.handleWebsiteClicked$default(this$014, str2, null, null, 6, null);
                return;
            case 24:
                rq.y0 this$015 = (rq.y0) obj;
                int i54 = rq.y0.f109656m;
                Intrinsics.checkNotNullParameter(this$015, "this$0");
                f30 pin7 = this$015.getPin();
                if (((pin7 == null || (t53 = pin7.t5()) == null) ? null : t53.d()) != null) {
                    wy0 wy0Var2 = this$015.f109665k;
                    if (wy0Var2 == null) {
                        return;
                    }
                    nx.d0 viewPinalytics4 = this$015.getViewPinalytics();
                    if (viewPinalytics4 != null) {
                        viewPinalytics4.b0(h32.u0.PIN_LINK_MODULE_DOMAIN_OWNER_PROFILE, h32.g0.MODAL_PIN, wy0Var2.getUid(), false);
                    }
                    String uid6 = wy0Var2.getUid();
                    Intrinsics.checkNotNullExpressionValue(uid6, "getUid(...)");
                    this$015.b(uid6);
                    NavigationImpl x13 = pe.i.x1(this$015.getPin(), wy0Var2, r41.b.PinCloseupCreatorAttributionModule);
                    if (x13 != null) {
                        m60.w wVar5 = this$015.f109658d;
                        if (wVar5 != null) {
                            wVar5.d(x13);
                            return;
                        } else {
                            Intrinsics.r("eventManager");
                            throw null;
                        }
                    }
                    return;
                }
                f30 pin8 = this$015.getPin();
                if (!Intrinsics.d("Uploaded by user", pin8 != null ? pin8.h4() : null)) {
                    f30 pin9 = this$015.getPin();
                    if (pin9 != null) {
                        nx.d0 viewPinalytics5 = this$015.getViewPinalytics();
                        if (viewPinalytics5 != null) {
                            viewPinalytics5.f0(h32.u0.WEBSITE_BUTTON, h32.g0.MODAL_PIN, pin9.getUid(), this$015.getPinAuxHelper().m(pin9), false);
                        }
                        PinCloseupBaseModule.handleWebsiteClicked$default(this$015, com.bumptech.glide.c.D(pin9), null, null, 6, null);
                        return;
                    }
                    return;
                }
                wy0 wy0Var3 = this$015.f109665k;
                if (wy0Var3 == null) {
                    f30 pin10 = this$015.getPin();
                    wy0Var3 = pin10 != null ? pin10.C5() : null;
                    if (wy0Var3 == null) {
                        f30 pin11 = this$015.getPin();
                        wy0Var3 = pin11 != null ? pin11.I5() : null;
                        if (wy0Var3 == null) {
                            return;
                        }
                    }
                }
                nx.d0 viewPinalytics6 = this$015.getViewPinalytics();
                if (viewPinalytics6 != null) {
                    viewPinalytics6.b0(h32.u0.PIN_USER, h32.g0.CLOSEUP_LINK_MODULE, wy0Var3.getUid(), false);
                }
                String uid7 = wy0Var3.getUid();
                Intrinsics.checkNotNullExpressionValue(uid7, "getUid(...)");
                this$015.b(uid7);
                NavigationImpl x14 = pe.i.x1(this$015.getPin(), wy0Var3, r41.b.PinCloseupCreatorAttributionModule);
                if (x14 != null) {
                    m60.w wVar6 = this$015.f109658d;
                    if (wVar6 != null) {
                        wVar6.d(x14);
                        return;
                    } else {
                        Intrinsics.r("eventManager");
                        throw null;
                    }
                }
                return;
            case 25:
                PinCloseupFavoriteModule this$016 = (PinCloseupFavoriteModule) obj;
                int i55 = PinCloseupFavoriteModule.f34993s;
                Intrinsics.checkNotNullParameter(this$016, "this$0");
                if (this$016.f35009p) {
                    this$016.f35009p = false;
                    int i56 = 2;
                    if (this$016.f35008o) {
                        f30 pin12 = this$016.getPin();
                        if (pin12 == null || (uid = pin12.getUid()) == null) {
                            return;
                        }
                        nx.d0 viewPinalytics7 = this$016.getViewPinalytics();
                        if (viewPinalytics7 != null) {
                            z13 = false;
                            viewPinalytics7.b0(h32.u0.PIN_UNFAVORITE_BUTTON, h32.g0.PIN_CLOSEUP_BOARD_FAVORITE_MODULE, uid, false);
                        } else {
                            z13 = false;
                        }
                        this$016.f35008o = z13;
                        this$016.updateView();
                        hk2.b bVar = this$016.f35010q;
                        if (bVar != null) {
                            bVar.dispose();
                        }
                        PinService pinService = this$016.f34998e;
                        if (pinService == null) {
                            Intrinsics.r("pinService");
                            throw null;
                        }
                        hk2.k e16 = pinService.unfavorite(uid, n00.b.a(n00.c.BOARD_PIN_FEED)).h(tk2.e.f118017c).e(wj2.c.a());
                        hk2.b bVar2 = new hk2.b(new rq.d1(4, new rq.e1(i56, this$016)), new rq.d1(5, new rq.e1(3, this$016)), cVar);
                        e16.f(bVar2);
                        this$016.f35010q = bVar2;
                        return;
                    }
                    f30 pin13 = this$016.getPin();
                    if (pin13 == null || (uid2 = pin13.getUid()) == null) {
                        return;
                    }
                    nx.d0 viewPinalytics8 = this$016.getViewPinalytics();
                    if (viewPinalytics8 != null) {
                        h32.u0 u0Var3 = h32.u0.PIN_FAVORITE_BUTTON;
                        h32.g0 g0Var4 = h32.g0.PIN_CLOSEUP_BOARD_FAVORITE_MODULE;
                        f30 pin14 = this$016.getPin();
                        viewPinalytics8.b0(u0Var3, g0Var4, pin14 != null ? pin14.getUid() : null, false);
                    }
                    this$016.f35008o = true;
                    this$016.updateView();
                    hk2.b bVar3 = this$016.f35010q;
                    if (bVar3 != null) {
                        bVar3.dispose();
                    }
                    PinService pinService2 = this$016.f34998e;
                    if (pinService2 == null) {
                        Intrinsics.r("pinService");
                        throw null;
                    }
                    hk2.k e17 = pinService2.favorite(uid2, n00.b.a(n00.c.BOARD_PIN_FEED)).h(tk2.e.f118017c).e(wj2.c.a());
                    hk2.b bVar4 = new hk2.b(new rq.d1(i56, new rq.e1(0, this$016)), new rq.d1(3, new rq.e1(1, this$016)), cVar);
                    e17.f(bVar4);
                    this$016.f35010q = bVar4;
                    return;
                }
                return;
            case 26:
                PinCloseupLegoActionButtonModule this$017 = (PinCloseupLegoActionButtonModule) obj;
                int i57 = PinCloseupLegoActionButtonModule.G;
                Intrinsics.checkNotNullParameter(this$017, "this$0");
                Intrinsics.f(view);
                f30 pin15 = this$017.getPin();
                if (pin15 != null) {
                    ((np0.d) this$017.getCloseupActionController()).f(view, pin15);
                    return;
                }
                return;
            case 28:
                rq.p2 this$018 = (rq.p2) obj;
                int i58 = rq.p2.f109460t;
                Intrinsics.checkNotNullParameter(this$018, "this$0");
                i01.v vVar2 = this$018.f109464f;
                if (vVar2 != null) {
                    w01.x xVar2 = (w01.x) vVar2;
                    rp0.d dVar2 = xVar2.f127132m;
                    if (dVar2 != null && (fVar = xVar2.f127133n) != null) {
                        fVar.b("on_comment_tap", dVar2);
                    }
                    uk1.d dVar3 = xVar2.f127130k;
                    nx.d0 d0Var2 = dVar3.f122379a;
                    Intrinsics.checkNotNullExpressionValue(d0Var2, "getPinalytics(...)");
                    h32.f1 f1Var = h32.f1.TAP;
                    h32.u0 u0Var4 = h32.u0.CLOSEUP_COMMENT;
                    h32.g0 g0Var5 = h32.g0.PIN_CLOSEUP_COMMENTS;
                    d0Var2.h0((r18 & 1) != 0 ? h32.f1.TAP : f1Var, (r18 & 2) != 0 ? null : u0Var4, (r18 & 4) != 0 ? null : g0Var5, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                    int value = (!hf0.b.q() ? ml1.b.DEFAULT_TRANSITION : ml1.b.NO_TRANSITION).getValue();
                    f30 f30Var = xVar2.f127120a;
                    if (f30Var != null) {
                        String b14 = xVar2.f127128i.b(f30Var);
                        if (b14 != null) {
                            h32.v0 v0Var2 = new h32.v0();
                            v0Var2.G = b14;
                            v0Var = v0Var2;
                        } else {
                            v0Var = null;
                        }
                        HashMap hashMap = new HashMap();
                        f30 f30Var2 = xVar2.f127120a;
                        if (f30Var2 == null || (str3 = f30Var2.getUid()) == null) {
                            str3 = "";
                        }
                        hashMap.put("pin_id", str3);
                        rp0.d dVar4 = xVar2.f127132m;
                        ai0.a.b(f30Var, xVar2.f127125f, (r39 & 2) != 0 ? ml1.b.NO_TRANSITION.getValue() : value, (r39 & 4) != 0 ? null : dVar3.f122379a, (r39 & 8) != 0 ? null : hashMap, (r39 & 16) != 0 ? null : u0Var4, (r39 & 32) != 0 ? null : g0Var5, null, (r39 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? null : v0Var, (r39 & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 0 ? null : null, (r39 & 1024) != 0 ? null : null, (r39 & 2048) != 0 ? "" : "", (r39 & 4096) != 0 ? "" : "", (r39 & 8192) != 0 ? "" : (dVar4 == null || (v13 = dVar4.v()) == null) ? "" : v13, (r39 & 16384) != 0 ? "" : "", (32768 & r39) != 0 ? "" : "", null, (131072 & r39) != 0 ? false : false, false, (r39 & 524288) != 0 ? false : true);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
