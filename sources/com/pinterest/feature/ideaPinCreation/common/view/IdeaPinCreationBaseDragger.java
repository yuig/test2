package com.pinterest.feature.ideaPinCreation.common.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import aq1.b;
import bs1.c;
import com.pinterest.feature.ideaPinCreation.common.view.IdeaPinCreationBaseDragger;
import fu0.e;
import fu0.f;
import kh2.k3;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ql2.s;
import vf1.a;
import xk2.k;
import xk2.m;
import xk2.n;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/pinterest/feature/ideaPinCreation/common/view/IdeaPinCreationBaseDragger;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ideaPinCreation_release"}, k = 1, mv = {1, 9, 0})
@SuppressLint({"ClickableViewAccessibility"})
/* loaded from: classes5.dex */
public abstract class IdeaPinCreationBaseDragger extends FrameLayout {

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ int f46422r = 0;

    /* renamed from: a, reason: collision with root package name */
    public final int f46423a;

    /* renamed from: b, reason: collision with root package name */
    public final int f46424b;

    /* renamed from: c, reason: collision with root package name */
    public int f46425c;

    /* renamed from: d, reason: collision with root package name */
    public int f46426d;

    /* renamed from: e, reason: collision with root package name */
    public final int f46427e;

    /* renamed from: f, reason: collision with root package name */
    public final Rect f46428f;

    /* renamed from: g, reason: collision with root package name */
    public final k f46429g;

    /* renamed from: h, reason: collision with root package name */
    public final k f46430h;

    /* renamed from: i, reason: collision with root package name */
    public final k f46431i;

    /* renamed from: j, reason: collision with root package name */
    public final k f46432j;

    /* renamed from: k, reason: collision with root package name */
    public int f46433k;

    /* renamed from: l, reason: collision with root package name */
    public int f46434l;

    /* renamed from: m, reason: collision with root package name */
    public int f46435m;

    /* renamed from: n, reason: collision with root package name */
    public int f46436n;

    /* renamed from: o, reason: collision with root package name */
    public final e f46437o;

    /* renamed from: p, reason: collision with root package name */
    public final e f46438p;

    /* renamed from: q, reason: collision with root package name */
    public a f46439q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r4v15, types: [fu0.e] */
    /* JADX WARN: Type inference failed for: r4v16, types: [fu0.e] */
    public IdeaPinCreationBaseDragger(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        int W = c.W(this, b.story_pin_video_trimmer_dragger_width);
        this.f46423a = W;
        int W2 = c.W(this, b.story_pin_video_trimmer_preview_width);
        this.f46424b = W2;
        this.f46425c = c.W(this, b.story_pin_video_trimmer_draggers_min_distance);
        this.f46426d = W2;
        int c13 = (ml2.c.c(hf0.b.f69002b) - W2) / 2;
        this.f46427e = c13;
        int c14 = (ml2.c.c(hf0.b.f69002b) - ((W * 2) + W2)) / 2;
        final int i14 = 0;
        this.f46428f = new Rect(c13, 0, ml2.c.c(hf0.b.f69002b) - c13, 0);
        n nVar = n.NONE;
        final int i15 = 1;
        this.f46429g = m.a(nVar, new f(this, i15));
        this.f46430h = m.a(nVar, new f(this, 2));
        this.f46431i = m.a(nVar, new f(this, 3));
        this.f46432j = m.a(nVar, new f(this, i14));
        this.f46433k = c14;
        this.f46434l = ml2.c.c(hf0.b.f69002b) - c14;
        this.f46436n = ml2.c.c(hf0.b.f69002b);
        this.f46437o = new View.OnTouchListener(this) { // from class: fu0.e

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ IdeaPinCreationBaseDragger f62985b;

            {
                this.f62985b = this;
            }

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                int i16 = i14;
                IdeaPinCreationBaseDragger this$0 = this.f62985b;
                switch (i16) {
                    case 0:
                        int i17 = IdeaPinCreationBaseDragger.f46422r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        int actionMasked = motionEvent.getActionMasked();
                        if (actionMasked == 1) {
                            vf1.a aVar = this$0.f46439q;
                            if (aVar != null) {
                                aVar.z2(s.f((((this$0.f46433k + this$0.f46423a) - this$0.f46427e) * 1.0f) / this$0.f46424b, 0.0f, 1.0f));
                                break;
                            }
                        } else if (actionMasked == 2) {
                            int rawX = (int) motionEvent.getRawX();
                            int i18 = this$0.f46423a;
                            int i19 = (i18 / 2) + rawX;
                            int i23 = this$0.f46434l - i18;
                            int i24 = this$0.f46425c;
                            int i25 = this$0.f46426d;
                            int i26 = i23 - i19;
                            if (i24 <= i26 && i26 <= i25 && i19 >= this$0.f46428f.left) {
                                this$0.e(rawX - (i18 / 2));
                                vf1.a aVar2 = this$0.f46439q;
                                if (aVar2 != null) {
                                    aVar2.T2(s.f((((this$0.f46433k + this$0.f46423a) - this$0.f46427e) * 1.0f) / this$0.f46424b, 0.0f, 1.0f));
                                    break;
                                }
                            }
                        }
                        break;
                    default:
                        int i27 = IdeaPinCreationBaseDragger.f46422r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        int actionMasked2 = motionEvent.getActionMasked();
                        if (actionMasked2 == 1) {
                            vf1.a aVar3 = this$0.f46439q;
                            if (aVar3 != null) {
                                aVar3.p2(s.f((((this$0.f46434l - this$0.f46423a) - this$0.f46427e) * 1.0f) / this$0.f46424b, 0.0f, 1.0f));
                                break;
                            }
                        } else if (actionMasked2 == 2) {
                            int rawX2 = (int) motionEvent.getRawX();
                            int i28 = this$0.f46433k;
                            int i29 = this$0.f46423a;
                            int i33 = i29 / 2;
                            int i34 = rawX2 - i33;
                            int i35 = this$0.f46425c;
                            int i36 = this$0.f46426d;
                            int i37 = i34 - (i28 + i29);
                            if (i35 <= i37 && i37 <= i36 && i34 <= this$0.f46428f.right) {
                                this$0.g(i33 + rawX2);
                                vf1.a aVar4 = this$0.f46439q;
                                if (aVar4 != null) {
                                    aVar4.a1(s.f((((this$0.f46434l - i29) - this$0.f46427e) * 1.0f) / this$0.f46424b, 0.0f, 1.0f));
                                    break;
                                }
                            }
                        }
                        break;
                }
                return true;
            }
        };
        this.f46438p = new View.OnTouchListener(this) { // from class: fu0.e

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ IdeaPinCreationBaseDragger f62985b;

            {
                this.f62985b = this;
            }

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                int i16 = i15;
                IdeaPinCreationBaseDragger this$0 = this.f62985b;
                switch (i16) {
                    case 0:
                        int i17 = IdeaPinCreationBaseDragger.f46422r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        int actionMasked = motionEvent.getActionMasked();
                        if (actionMasked == 1) {
                            vf1.a aVar = this$0.f46439q;
                            if (aVar != null) {
                                aVar.z2(s.f((((this$0.f46433k + this$0.f46423a) - this$0.f46427e) * 1.0f) / this$0.f46424b, 0.0f, 1.0f));
                                break;
                            }
                        } else if (actionMasked == 2) {
                            int rawX = (int) motionEvent.getRawX();
                            int i18 = this$0.f46423a;
                            int i19 = (i18 / 2) + rawX;
                            int i23 = this$0.f46434l - i18;
                            int i24 = this$0.f46425c;
                            int i25 = this$0.f46426d;
                            int i26 = i23 - i19;
                            if (i24 <= i26 && i26 <= i25 && i19 >= this$0.f46428f.left) {
                                this$0.e(rawX - (i18 / 2));
                                vf1.a aVar2 = this$0.f46439q;
                                if (aVar2 != null) {
                                    aVar2.T2(s.f((((this$0.f46433k + this$0.f46423a) - this$0.f46427e) * 1.0f) / this$0.f46424b, 0.0f, 1.0f));
                                    break;
                                }
                            }
                        }
                        break;
                    default:
                        int i27 = IdeaPinCreationBaseDragger.f46422r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        int actionMasked2 = motionEvent.getActionMasked();
                        if (actionMasked2 == 1) {
                            vf1.a aVar3 = this$0.f46439q;
                            if (aVar3 != null) {
                                aVar3.p2(s.f((((this$0.f46434l - this$0.f46423a) - this$0.f46427e) * 1.0f) / this$0.f46424b, 0.0f, 1.0f));
                                break;
                            }
                        } else if (actionMasked2 == 2) {
                            int rawX2 = (int) motionEvent.getRawX();
                            int i28 = this$0.f46433k;
                            int i29 = this$0.f46423a;
                            int i33 = i29 / 2;
                            int i34 = rawX2 - i33;
                            int i35 = this$0.f46425c;
                            int i36 = this$0.f46426d;
                            int i37 = i34 - (i28 + i29);
                            if (i35 <= i37 && i37 <= i36 && i34 <= this$0.f46428f.right) {
                                this$0.g(i33 + rawX2);
                                vf1.a aVar4 = this$0.f46439q;
                                if (aVar4 != null) {
                                    aVar4.a1(s.f((((this$0.f46434l - i29) - this$0.f46427e) * 1.0f) / this$0.f46424b, 0.0f, 1.0f));
                                    break;
                                }
                            }
                        }
                        break;
                }
                return true;
            }
        };
        setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
    }

    public abstract View a();

    public final boolean b(int i13) {
        int W = c.W(this, eo1.c.space_200);
        int i14 = this.f46433k - W;
        if (i13 > this.f46435m + W || i14 > i13) {
            int i15 = this.f46436n - W;
            if (i13 > this.f46434l + W || i15 > i13) {
                return false;
            }
        }
        return true;
    }

    public void c() {
    }

    public void d() {
    }

    public final void e(int i13) {
        this.f46433k = i13;
        this.f46435m = i13 + this.f46423a;
        Object value = this.f46429g.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        k3.Z1((View) value, 1, this.f46433k);
        Object value2 = this.f46431i.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        k3.Z1((View) value2, 1, this.f46435m);
        Object value3 = this.f46432j.getValue();
        Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
        k3.Z1((View) value3, 1, this.f46435m);
        c();
    }

    public final void f(float f13, float f14) {
        int i13 = this.f46424b;
        this.f46425c = ml2.c.c(f13 * i13);
        this.f46426d = ml2.c.c(f14 * i13);
    }

    public final void g(int i13) {
        this.f46434l = i13;
        this.f46436n = i13 - this.f46423a;
        int c13 = ml2.c.c(hf0.b.f69002b) - this.f46434l;
        Object value = this.f46430h.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        k3.Z1((View) value, 2, c13);
        int c14 = ml2.c.c(hf0.b.f69002b) - this.f46436n;
        Object value2 = this.f46431i.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        k3.Z1((View) value2, 2, c14);
        Object value3 = this.f46432j.getValue();
        Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
        k3.Z1((View) value3, 2, c14);
        d();
    }

    public final void h(float f13) {
        e((((int) (f13 * this.f46424b)) + this.f46427e) - this.f46423a);
    }

    public final void i(float f13) {
        g(((int) (f13 * this.f46424b)) + this.f46423a + this.f46427e);
    }
}
