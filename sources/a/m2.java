package a;

import ads_mobile_sdk.ed2;
import ads_mobile_sdk.et;
import android.content.Context;
import android.graphics.drawable.TransitionDrawable;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.media3.common.IllegalSeekPositionException;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.search.SearchView;
import com.pinterest.component.alert.AlertContainer;
import com.pinterest.feature.conversation.view.ConversationDidItemView;
import com.pinterest.feature.conversation.view.ConversationMessageItemView;
import com.pinterest.feature.ideaPinCreation.common.view.IdeaPinEditablePageLite;
import com.pinterest.feature.ideaPinCreation.duration.view.IdeaPinDurationDragger;
import com.pinterest.feature.ideaPinCreation.videotrimming.view.IdeaPinVideoTrimmingDragger;
import com.pinterest.feature.pincarouselads.view.SingleColumnCarouselPinView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final /* synthetic */ class m2 implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f110a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f111b;

    public /* synthetic */ m2(Object obj, int i13) {
        this.f110a = i13;
        this.f111b = obj;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent event) {
        tv1.b bVar;
        int i13 = this.f110a;
        boolean z13 = false;
        Object obj = this.f111b;
        switch (i13) {
            case 0:
                return et.a((ed2) obj, view, event);
            case 1:
                SearchView searchView = (SearchView) obj;
                int i14 = SearchView.B;
                if (searchView.g()) {
                    searchView.f();
                }
                return false;
            case 2:
                com.google.android.material.textfield.k kVar = (com.google.android.material.textfield.k) obj;
                kVar.getClass();
                if (event.getAction() == 1) {
                    long currentTimeMillis = System.currentTimeMillis() - kVar.f33244o;
                    if (currentTimeMillis < 0 || currentTimeMillis > 300) {
                        kVar.f33242m = false;
                    }
                    kVar.u();
                    kVar.f33242m = true;
                    kVar.f33244o = System.currentTimeMillis();
                }
                return false;
            case 3:
                zp.p this$0 = (zp.p) obj;
                int i15 = zp.p.f142463k;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                int action = event.getAction();
                if (action == 1) {
                    boolean z14 = Math.abs(this$0.f142472i - event.getY()) > 100.0f;
                    if (this$0.f142471h && z14) {
                        this$0.f142471h = false;
                        this$0.a();
                    } else {
                        this$0.f142471h = false;
                    }
                } else if (action == 2 && !this$0.f142471h) {
                    this$0.f142472i = event.getY();
                    this$0.f142471h = true;
                }
                return true;
            case 4:
                g90.n this$02 = (g90.n) obj;
                int i16 = g90.n.f64537w0;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                ViewPager viewPager = this$02.f64546o0;
                if (viewPager != null) {
                    viewPager.dispatchTouchEvent(event);
                    return true;
                }
                Intrinsics.r("viewPager");
                throw null;
            case 5:
                AlertContainer this$03 = (AlertContainer) obj;
                int i17 = AlertContainer.f44684d;
                Intrinsics.checkNotNullParameter(this$03, "this$0");
                Intrinsics.checkNotNullParameter(event, "event");
                if (event.getAction() != 1) {
                    return false;
                }
                this$03.b(yb0.d.OUTSIDE_TOUCH);
                return true;
            case 6:
                qi0.d this$04 = (qi0.d) obj;
                int i18 = qi0.d.f103974u;
                Intrinsics.checkNotNullParameter(this$04, "this$0");
                if (event.getAction() == 3) {
                    this$04.L();
                }
                return ((y92.c) this$04.f103986o.getValue()).c(event);
            case 7:
                ui0.k this$05 = (ui0.k) obj;
                int i19 = ui0.k.f122276n;
                Intrinsics.checkNotNullParameter(this$05, "this$0");
                this$05.f122283l.a(event);
                return true;
            case 8:
                fp0.c this$06 = (fp0.c) obj;
                r0.h hVar = fp0.c.f62759q;
                Intrinsics.checkNotNullParameter(this$06, "this$0");
                q0.b bVar2 = this$06.f62764e;
                if (bVar2 == null || event.getPointerCount() != 1) {
                    return true;
                }
                int action2 = event.getAction();
                h0.f fVar = bVar2.f101749c;
                if (action2 != 0) {
                    if (action2 == 2) {
                        Float f13 = this$06.f62774o;
                        if (f13 == null) {
                            return true;
                        }
                        float floatValue = (f13.floatValue() - event.getY(0)) / (this$06.f62761b.getMeasuredHeight() * 0.33f);
                        Float f14 = this$06.f62775p;
                        fVar.f66396p.b(ql2.s.f(floatValue + (f14 != null ? f14.floatValue() : 0.0f), 0.0f, 1.0f));
                    }
                    return z13;
                }
                this$06.f62774o = Float.valueOf(event.getY(0));
                c0.t1 t1Var = (c0.t1) fVar.f66397q.f16839b.q().d();
                this$06.f62775p = t1Var != null ? Float.valueOf(t1Var.a()) : null;
                z13 = true;
                return z13;
            case 9:
                ConversationDidItemView this$07 = (ConversationDidItemView) obj;
                int i23 = ConversationDidItemView.f45528o;
                Intrinsics.checkNotNullParameter(this$07, "this$0");
                Intrinsics.checkNotNullParameter(event, "event");
                if (event.getAction() == 0) {
                    this$07.setBackgroundResource(q80.a.rounded_rect_gray_7dp);
                } else {
                    this$07.setBackgroundResource(0);
                }
                return false;
            case 10:
                ConversationMessageItemView this$08 = (ConversationMessageItemView) obj;
                int i24 = ConversationMessageItemView.f45540e1;
                Intrinsics.checkNotNullParameter(this$08, "this$0");
                if (event.getActionMasked() != 1) {
                    return false;
                }
                this$08.L0("thread_anchor_preview_tap", false);
                return true;
            case 11:
                su0.i this$09 = (su0.i) obj;
                Intrinsics.checkNotNullParameter(this$09, "this$0");
                int actionMasked = event.getActionMasked();
                if (actionMasked == 0) {
                    int rawX = (int) event.getRawX();
                    IdeaPinDurationDragger ideaPinDurationDragger = this$09.E0;
                    if (ideaPinDurationDragger == null) {
                        Intrinsics.r("draggerView");
                        throw null;
                    }
                    if (ideaPinDurationDragger.b(rawX)) {
                        return false;
                    }
                } else if (actionMasked == 1) {
                    int i25 = su0.i.M0;
                    a7.v0 v0Var = this$09.Y7().f46450n.f18946k;
                    if (v0Var != null) {
                        v0Var.play();
                    }
                } else if (actionMasked == 2) {
                    int rawX2 = (int) event.getRawX();
                    int i26 = su0.i.M0;
                    if (this$09.f62979q0 != null) {
                        this$09.Y7().P0((long) ((((rawX2 - ((Number) this$09.f62976n0.getValue()).floatValue()) * 1.0f) / ((Number) this$09.f62975m0.getValue()).intValue()) * ig1.b.j0(r13)));
                    }
                }
                return true;
            case 12:
                zv0.j this$010 = (zv0.j) obj;
                Intrinsics.checkNotNullParameter(this$010, "this$0");
                int actionMasked2 = event.getActionMasked();
                if (actionMasked2 == 0) {
                    int rawX3 = (int) event.getRawX();
                    IdeaPinVideoTrimmingDragger ideaPinVideoTrimmingDragger = this$010.P0;
                    if (ideaPinVideoTrimmingDragger == null) {
                        Intrinsics.r("scrubberDragger");
                        throw null;
                    }
                    if (ideaPinVideoTrimmingDragger.b(rawX3)) {
                        return false;
                    }
                } else if (actionMasked2 == 1) {
                    IdeaPinEditablePageLite ideaPinEditablePageLite = this$010.G0;
                    if (ideaPinEditablePageLite == null) {
                        Intrinsics.r("pageView");
                        throw null;
                    }
                    a7.v0 v0Var2 = ideaPinEditablePageLite.f46450n.f18946k;
                    if (v0Var2 != null) {
                        v0Var2.play();
                    }
                    IdeaPinEditablePageLite ideaPinEditablePageLite2 = this$010.G0;
                    if (ideaPinEditablePageLite2 == null) {
                        Intrinsics.r("pageView");
                        throw null;
                    }
                    ideaPinEditablePageLite2.r0(false);
                } else if (actionMasked2 == 2) {
                    int rawX4 = (int) event.getRawX();
                    IdeaPinVideoTrimmingDragger ideaPinVideoTrimmingDragger2 = this$010.P0;
                    if (ideaPinVideoTrimmingDragger2 == null) {
                        Intrinsics.r("scrubberDragger");
                        throw null;
                    }
                    if (rawX4 >= ideaPinVideoTrimmingDragger2.f46435m) {
                        if (ideaPinVideoTrimmingDragger2 == null) {
                            Intrinsics.r("scrubberDragger");
                            throw null;
                        }
                        if (rawX4 <= ideaPinVideoTrimmingDragger2.f46436n) {
                            this$010.X8(rawX4);
                            IdeaPinEditablePageLite ideaPinEditablePageLite3 = this$010.G0;
                            if (ideaPinEditablePageLite3 == null) {
                                Intrinsics.r("pageView");
                                throw null;
                            }
                            a7.v0 v0Var3 = ideaPinEditablePageLite3.f46450n.f18946k;
                            if (v0Var3 != null) {
                                v0Var3.pause();
                                if (this$010.X0 != null) {
                                    long V8 = (long) ((((rawX4 - this$010.V8()) * 1.0f) / ((Number) this$010.U0.getValue()).intValue()) * ig1.b.j0(r13));
                                    try {
                                        IdeaPinEditablePageLite ideaPinEditablePageLite4 = this$010.G0;
                                        if (ideaPinEditablePageLite4 == null) {
                                            Intrinsics.r("pageView");
                                            throw null;
                                        }
                                        ideaPinEditablePageLite4.P0(V8);
                                    } catch (IllegalSeekPositionException e13) {
                                        this$010.b6().q(e13, a.g("StoryPinVideoTrimmingFragment: Failed to seek to absoluteTimeMs=", V8), tb0.p.IDEA_PINS_CREATION);
                                    }
                                }
                            }
                        }
                    }
                }
                return true;
            case 13:
                SingleColumnCarouselPinView this$011 = (SingleColumnCarouselPinView) obj;
                Intrinsics.checkNotNullParameter(this$011, "this$0");
                return this$011.getInternalCell().asView().dispatchTouchEvent(event);
            case 14:
                p21.b it = (p21.b) obj;
                int i27 = q21.d.B;
                Intrinsics.checkNotNullParameter(it, "$it");
                if (event.getAction() == 1 || event.getAction() == 3) {
                    yk1.n view2 = ((lv0.g) it).getView();
                    Intrinsics.g(view2, "null cannot be cast to non-null type com.pinterest.feature.ideaPinCreation.producttagging.IdeaPinProductSearchContract.IdeaPinProductSearchView<*>");
                    mv0.r rVar = (mv0.r) ((jv0.b) view2);
                    if (rVar.f88400l1 != null) {
                        rVar.f88400l1 = null;
                        RelativeLayout relativeLayout = rVar.f88398j1;
                        if (relativeLayout == null) {
                            Intrinsics.r("pinDetailsContainer");
                            throw null;
                        }
                        relativeLayout.removeView(null);
                        Context requireContext = rVar.requireContext();
                        int i28 = eo1.b.color_themed_transparent;
                        Object obj2 = d5.a.f53679a;
                        relativeLayout.setBackgroundColor(requireContext.getColor(i28));
                        relativeLayout.setAlpha(0.0f);
                    }
                }
                return false;
            case 15:
                sf1.l1 this$012 = (sf1.l1) obj;
                int i29 = sf1.l1.f112653b;
                Intrinsics.checkNotNullParameter(this$012, "this$0");
                y92.c cVar = this$012.f112654a;
                Intrinsics.f(event);
                return cVar.c(event);
            case 16:
                sf1.s1 this$013 = (sf1.s1) obj;
                int i33 = sf1.s1.F;
                Intrinsics.checkNotNullParameter(this$013, "this$0");
                y92.c cVar2 = this$013.C;
                Intrinsics.f(event);
                return cVar2.c(event);
            case 17:
                GestureDetector gestureDetector = (GestureDetector) obj;
                Intrinsics.checkNotNullParameter(gestureDetector, "$gestureDetector");
                gestureDetector.onTouchEvent(event);
                return true;
            case 18:
                uv1.c this$014 = (uv1.c) obj;
                int i34 = uv1.c.f123185g;
                Intrinsics.checkNotNullParameter(this$014, "this$0");
                int action3 = event.getAction();
                if (action3 != 0) {
                    if (action3 == 1) {
                        this$014.a();
                    } else if (action3 == 3) {
                        TransitionDrawable transitionDrawable = this$014.f123191f;
                        if (transitionDrawable == null) {
                            Intrinsics.r("backgroundAnimator");
                            throw null;
                        }
                        transitionDrawable.reverseTransition(200);
                        if (!this$014.f123187b && (bVar = this$014.f123189d) != null) {
                            bVar.w(true);
                        }
                    }
                } else if (this$014.f123187b) {
                    TransitionDrawable transitionDrawable2 = this$014.f123191f;
                    if (transitionDrawable2 == null) {
                        Intrinsics.r("backgroundAnimator");
                        throw null;
                    }
                    transitionDrawable2.reverseTransition(200);
                } else {
                    tv1.b bVar3 = this$014.f123189d;
                    if (bVar3 != null) {
                        bVar3.w(false);
                    }
                    TransitionDrawable transitionDrawable3 = this$014.f123191f;
                    if (transitionDrawable3 == null) {
                        Intrinsics.r("backgroundAnimator");
                        throw null;
                    }
                    transitionDrawable3.startTransition(200);
                }
                return true;
            default:
                bn0.a this$015 = (bn0.a) obj;
                Intrinsics.checkNotNullParameter(this$015, "this$0");
                if (event.getAction() == 0) {
                    ((Function1) this$015.f23561d).invoke(new u62.i(event.getX() - view.getPaddingStart(), event.getY() - view.getPaddingTop(), (view.getWidth() - view.getPaddingStart()) - view.getPaddingEnd(), (view.getHeight() - view.getPaddingTop()) - view.getPaddingBottom()));
                }
                return true;
        }
    }
}
