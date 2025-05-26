package com.pinterest.feature.ideaPinCreation.closeup.view;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import com.pinterest.api.model.bo0;
import com.pinterest.api.model.k01;
import com.pinterest.api.model.vn0;
import com.pinterest.gestalt.iconcomponent.GestaltIcon;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\fB\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB#\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/pinterest/feature/ideaPinCreation/closeup/view/IdeaPinInteractiveVideoView;", "Lcom/pinterest/feature/ideaPinCreation/closeup/view/IdeaPinCreationPlayerView;", "Lfu0/i;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "com/pinterest/feature/ideaPinCreation/closeup/view/d1", "ideaPinCreation_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class IdeaPinInteractiveVideoView extends IdeaPinCreationPlayerView implements fu0.i {
    public nx.d0 I;

    /* renamed from: J, reason: collision with root package name */
    public yt0.f f46008J;
    public d1 K;
    public v1 L;
    public RectF M;
    public boolean N;
    public vn0 O;
    public final ArrayList P;
    public final LinkedHashMap Q;
    public final LinkedHashMap R;
    public final Matrix S;
    public float T;
    public PointF U;
    public float V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdeaPinInteractiveVideoView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.M = new RectF(0.0f, 0.0f, hf0.b.f69002b, hf0.b.f69003c);
        this.P = new ArrayList();
        this.Q = new LinkedHashMap();
        this.R = new LinkedHashMap();
        this.S = new Matrix();
        this.U = new PointF();
    }

    public static final void O(IdeaPinInteractiveVideoView ideaPinInteractiveVideoView) {
        Matrix matrix;
        List items;
        Integer Q = ideaPinInteractiveVideoView.Q();
        if (Q != null) {
            int intValue = Q.intValue();
            vn0 vn0Var = ideaPinInteractiveVideoView.O;
            bo0 bo0Var = (vn0Var == null || (items = vn0Var.getItems()) == null) ? null : (bo0) CollectionsKt.U(intValue, items);
            if (bo0Var == null || (matrix = bo0Var.getDisplayMatrix()) == null) {
                matrix = new Matrix();
            }
            View view = ideaPinInteractiveVideoView.f18939d;
            TextureView textureView = view instanceof TextureView ? (TextureView) view : null;
            if (textureView != null) {
                textureView.setTransform(matrix);
            }
            lh0.s1 s1Var = ideaPinInteractiveVideoView.H;
            if (s1Var == null) {
                Intrinsics.r("experiments");
                throw null;
            }
            float f13 = 1.0f;
            if (s1Var.f()) {
                float speedMultiplier = bo0Var != null ? bo0Var.getSpeedMultiplier() : 1.0f;
                a7.v0 v0Var = ideaPinInteractiveVideoView.f18946k;
                if (v0Var != null) {
                    v0Var.c(new a7.p0(speedMultiplier));
                }
            }
            if (bo0Var != null && bo0Var.getIsFromFrontFacingCamera()) {
                f13 = -1.0f;
            }
            ideaPinInteractiveVideoView.setScaleX(f13);
        }
    }

    public final void P() {
        this.S.reset();
        this.T = 0.0f;
        this.U = new PointF();
        this.V = 0.0f;
    }

    public final Integer Q() {
        vn0 vn0Var = this.O;
        if (vn0Var != null) {
            int startMediaIndex = vn0Var.getStartMediaIndex();
            a7.v0 v0Var = this.f18946k;
            if (v0Var != null) {
                return Integer.valueOf(v0Var.l() + startMediaIndex);
            }
        }
        return null;
    }

    @Override // fu0.i
    public final boolean T0() {
        return true;
    }

    @Override // fu0.i
    public final void d0() {
        P();
        yt0.f fVar = this.f46008J;
        if (fVar != null) {
            ((f0) fVar).o(false);
        }
        a7.v0 v0Var = this.f18946k;
        if (v0Var != null) {
            if (v0Var.f()) {
                M(true);
                nx.d0 d0Var = this.I;
                if (d0Var != null) {
                    nx.d0.B(d0Var, h32.f1.STORY_PIN_VIDEO_PAUSE, null, null, null, 30);
                }
            } else {
                v0Var.play();
                nx.d0 d0Var2 = this.I;
                if (d0Var2 != null) {
                    nx.d0.B(d0Var2, h32.f1.STORY_PIN_VIDEO_PLAY, null, null, null, 30);
                }
            }
            this.N = !v0Var.f();
            d1 d1Var = this.K;
            if (d1Var != null) {
                boolean f13 = v0Var.f();
                Object value = ((f0) d1Var).f46177r.getValue();
                Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                ((GestaltIcon) value).g2(new rn0.d(f13, 23));
            }
        }
    }

    @Override // fu0.i
    public final void e(MotionEvent ev2) {
        Intrinsics.checkNotNullParameter(ev2, "ev");
    }

    @Override // fu0.i
    public final void i(MotionEvent ev2) {
        RectF rectF;
        List items;
        bo0 bo0Var;
        Intrinsics.checkNotNullParameter(ev2, "ev");
        Integer Q = Q();
        if (Q != null) {
            int intValue = Q.intValue();
            if (ev2.getPointerCount() >= 2) {
                PointF C0 = ph.a.C0(ev2);
                float f13 = C0.x;
                PointF pointF = this.U;
                float f14 = f13 - pointF.x;
                float f15 = C0.y - pointF.y;
                float y13 = ph.a.y(ev2) / this.T;
                LinkedHashMap linkedHashMap = this.Q;
                Matrix matrix = (Matrix) linkedHashMap.get(Q);
                if (matrix == null) {
                    matrix = new Matrix();
                }
                float f16 = -1;
                float c03 = ig1.b.c0(matrix) * f16;
                float d03 = ig1.b.d0(matrix) * f16;
                Matrix matrix2 = new Matrix(this.S);
                float b03 = ig1.b.b0(matrix2);
                float f17 = b03 * y13;
                if (f17 > 6.0f || f17 < 0.2f) {
                    float f18 = ql2.s.f(f17, 0.2f, 6.0f) / b03;
                    matrix2.postScale(f18, f18, C0.x + c03, C0.y + d03);
                } else {
                    matrix2.postScale(y13, y13, C0.x + c03, C0.y + d03);
                }
                matrix2.postTranslate(f14, f15);
                matrix2.postRotate(ph.a.U(ph.a.k(ev2) - this.V), C0.x, C0.y);
                vn0 vn0Var = this.O;
                k01 videoItem = (vn0Var == null || (items = vn0Var.getItems()) == null || (bo0Var = (bo0) items.get(intValue)) == null) ? null : bo0Var.getVideoItem();
                if (videoItem != null) {
                    int intValue2 = ((Number) videoItem.f39240c.f135234a).intValue();
                    int intValue3 = ((Number) videoItem.f39240c.f135235b).intValue();
                    Matrix matrix3 = (Matrix) linkedHashMap.get(Q);
                    if (matrix3 == null) {
                        matrix3 = new Matrix();
                    }
                    rectF = ig1.b.n0(intValue2, intValue3, matrix3, matrix2);
                } else {
                    rectF = null;
                }
                if (rectF != null) {
                    int c13 = ml2.c.c(ig1.b.a0(matrix2));
                    v1 v1Var = this.L;
                    if (v1Var != null) {
                        w1 c14 = v1Var.c(rectF, c13);
                        matrix2.postRotate(c14.f46356c, C0.x, C0.y);
                        matrix2.postTranslate(c14.f46354a, c14.f46355b);
                        PointF pointF2 = this.U;
                        float f19 = pointF2.x;
                        Float f23 = c14.f46357d;
                        pointF2.x = f19 + (f23 != null ? f23.floatValue() : 0.0f);
                        PointF pointF3 = this.U;
                        float f24 = pointF3.y;
                        Float f25 = c14.f46358e;
                        pointF3.y = f24 + (f25 != null ? f25.floatValue() : 0.0f);
                        float f26 = this.V;
                        Float f27 = c14.f46359f;
                        this.V = f26 + (f27 != null ? f27.floatValue() : 0.0f);
                    }
                    View view = this.f18939d;
                    TextureView textureView = view instanceof TextureView ? (TextureView) view : null;
                    if (textureView != null) {
                        textureView.setTransform(matrix2);
                        textureView.invalidate();
                    }
                    this.R.put(Q, matrix2);
                }
            }
        }
    }

    @Override // fu0.i
    public final void l(MotionEvent ev2) {
        Intrinsics.checkNotNullParameter(ev2, "ev");
        yt0.f fVar = this.f46008J;
        if (fVar != null) {
            f0 f0Var = (f0) fVar;
            bs1.c.X0(f0Var.q());
            f0Var.F0();
        }
        this.T = ph.a.y(ev2);
        this.U = ph.a.C0(ev2);
        this.V = ph.a.k(ev2);
        View view = this.f18939d;
        TextureView textureView = view instanceof TextureView ? (TextureView) view : null;
        if (textureView != null) {
            textureView.getTransform(this.S);
        }
    }

    @Override // fu0.i
    public final boolean n(MotionEvent ev2) {
        Intrinsics.checkNotNullParameter(ev2, "ev");
        return getVisibility() == 0;
    }

    @Override // fu0.i
    public final void o(MotionEvent ev2) {
        Intrinsics.checkNotNullParameter(ev2, "ev");
    }

    @Override // fu0.i
    public final void q(MotionEvent ev2) {
        List items;
        bo0 bo0Var;
        k01 videoItem;
        Intrinsics.checkNotNullParameter(ev2, "ev");
        Integer Q = Q();
        if (Q != null) {
            int intValue = Q.intValue();
            yt0.f fVar = this.f46008J;
            if (fVar != null) {
                ((f0) fVar).o(true);
            }
            vn0 vn0Var = this.O;
            LinkedHashMap linkedHashMap = this.R;
            if (vn0Var != null && (items = vn0Var.getItems()) != null && (bo0Var = (bo0) items.get(intValue)) != null && (videoItem = bo0Var.getVideoItem()) != null) {
                Matrix matrix = (Matrix) this.Q.get(Q);
                if (matrix == null) {
                    matrix = new Matrix();
                }
                Matrix matrix2 = (Matrix) linkedHashMap.get(Q);
                if (matrix2 == null) {
                    matrix2 = new Matrix();
                }
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                Matrix m03 = ig1.b.m0(context, this.M.width() / this.M.height(), videoItem, matrix2, matrix);
                d1 d1Var = this.K;
                if (d1Var != null) {
                    ((f0) d1Var).P0(intValue, matrix2, m03);
                }
            }
            P();
            Matrix matrix3 = (Matrix) linkedHashMap.get(Q);
            if (matrix3 == null) {
                return;
            }
            nx.d0 d0Var = this.I;
            if (d0Var == null) {
                d0Var = sh.f.a();
            }
            Intrinsics.f(d0Var);
            ig1.b.H0(d0Var, matrix3, h32.u0.STORY_PIN_VIDEO);
        }
    }

    @Override // fu0.i
    public final boolean t() {
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdeaPinInteractiveVideoView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        this.M = new RectF(0.0f, 0.0f, hf0.b.f69002b, hf0.b.f69003c);
        this.P = new ArrayList();
        this.Q = new LinkedHashMap();
        this.R = new LinkedHashMap();
        this.S = new Matrix();
        this.U = new PointF();
    }
}
