package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.ViewParent;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.s;
import e5.a;
import java.util.HashMap;
import t4.b;
import w4.g;
import w4.l;
import x4.m;
import x4.n;
import x4.w;

/* loaded from: classes3.dex */
public class MotionTelltales extends MockView {

    /* renamed from: l, reason: collision with root package name */
    public final Paint f17636l;

    /* renamed from: m, reason: collision with root package name */
    public MotionLayout f17637m;

    /* renamed from: n, reason: collision with root package name */
    public final float[] f17638n;

    /* renamed from: o, reason: collision with root package name */
    public final Matrix f17639o;

    /* renamed from: p, reason: collision with root package name */
    public int f17640p;

    /* renamed from: q, reason: collision with root package name */
    public int f17641q;

    /* renamed from: r, reason: collision with root package name */
    public float f17642r;

    public MotionTelltales(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f17636l = new Paint();
        this.f17638n = new float[2];
        this.f17639o = new Matrix();
        this.f17640p = 0;
        this.f17641q = -65281;
        this.f17642r = 0.25f;
        b(context, attributeSet);
    }

    public final void b(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, s.MotionTelltales);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i13 = 0; i13 < indexCount; i13++) {
                int index = obtainStyledAttributes.getIndex(i13);
                if (index == s.MotionTelltales_telltales_tailColor) {
                    this.f17641q = obtainStyledAttributes.getColor(index, this.f17641q);
                } else if (index == s.MotionTelltales_telltales_velocityMode) {
                    this.f17640p = obtainStyledAttributes.getInt(index, this.f17640p);
                } else if (index == s.MotionTelltales_telltales_tailScale) {
                    this.f17642r = obtainStyledAttributes.getFloat(index, this.f17642r);
                }
            }
            obtainStyledAttributes.recycle();
        }
        int i14 = this.f17641q;
        Paint paint = this.f17636l;
        paint.setColor(i14);
        paint.setStrokeWidth(5.0f);
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // androidx.constraintlayout.utils.widget.MockView, android.view.View
    public final void onDraw(Canvas canvas) {
        float f13;
        int i13;
        Matrix matrix;
        int i14;
        float[] fArr;
        int i15;
        float[] fArr2;
        int i16;
        float f14;
        int i17;
        float f15;
        l lVar;
        float[] fArr3;
        l lVar2;
        int i18;
        l lVar3;
        l lVar4;
        l lVar5;
        g gVar;
        m mVar;
        l lVar6;
        float[] fArr4;
        double[] dArr;
        a aVar;
        float f16;
        int i19;
        MotionTelltales motionTelltales = this;
        int i23 = 5;
        super.onDraw(canvas);
        Matrix matrix2 = getMatrix();
        Matrix matrix3 = motionTelltales.f17639o;
        matrix2.invert(matrix3);
        if (motionTelltales.f17637m == null) {
            ViewParent parent = getParent();
            if (parent instanceof MotionLayout) {
                motionTelltales.f17637m = (MotionLayout) parent;
                return;
            }
            return;
        }
        int width = getWidth();
        int height = getHeight();
        float[] fArr5 = {0.1f, 0.25f, 0.5f, 0.75f, 0.9f};
        int i24 = 0;
        while (i24 < i23) {
            float f17 = fArr5[i24];
            int i25 = 0;
            while (i25 < i23) {
                float f18 = fArr5[i25];
                MotionLayout motionLayout = motionTelltales.f17637m;
                int i26 = motionTelltales.f17640p;
                float f19 = motionLayout.f17531d;
                float f23 = motionLayout.f17551o;
                if (motionLayout.f17527b != null) {
                    float signum = Math.signum(motionLayout.f17553q - f23);
                    float interpolation = motionLayout.f17527b.getInterpolation(motionLayout.f17551o + 1.0E-5f);
                    f23 = motionLayout.f17527b.getInterpolation(motionLayout.f17551o);
                    f19 = (((interpolation - f23) / 1.0E-5f) * signum) / motionLayout.f17549m;
                }
                n nVar = motionLayout.f17527b;
                if (nVar instanceof n) {
                    f19 = nVar.a();
                }
                float f24 = f19;
                m mVar2 = (m) motionLayout.f17545k.get(motionTelltales);
                int i27 = i26 & 1;
                float[] fArr6 = motionTelltales.f17638n;
                if (i27 == 0) {
                    int width2 = getWidth();
                    int height2 = getHeight();
                    float[] fArr7 = mVar2.f131797v;
                    float b13 = mVar2.b(f23, fArr7);
                    HashMap hashMap = mVar2.f131800y;
                    fArr = fArr5;
                    if (hashMap == null) {
                        fArr3 = fArr6;
                        lVar = null;
                    } else {
                        lVar = (l) hashMap.get("translationX");
                        fArr3 = fArr6;
                    }
                    HashMap hashMap2 = mVar2.f131800y;
                    if (hashMap2 == null) {
                        i18 = i25;
                        lVar2 = null;
                    } else {
                        lVar2 = (l) hashMap2.get("translationY");
                        i18 = i25;
                    }
                    HashMap hashMap3 = mVar2.f131800y;
                    i15 = i24;
                    if (hashMap3 == null) {
                        i14 = height;
                        lVar3 = null;
                    } else {
                        lVar3 = (l) hashMap3.get("rotation");
                        i14 = height;
                    }
                    HashMap hashMap4 = mVar2.f131800y;
                    i13 = width;
                    if (hashMap4 == null) {
                        matrix = matrix3;
                        lVar4 = null;
                    } else {
                        lVar4 = (l) hashMap4.get("scaleX");
                        matrix = matrix3;
                    }
                    HashMap hashMap5 = mVar2.f131800y;
                    if (hashMap5 == null) {
                        f13 = f24;
                        lVar5 = null;
                    } else {
                        lVar5 = (l) hashMap5.get("scaleY");
                        f13 = f24;
                    }
                    HashMap hashMap6 = mVar2.f131801z;
                    g gVar2 = hashMap6 == null ? null : (g) hashMap6.get("translationX");
                    HashMap hashMap7 = mVar2.f131801z;
                    g gVar3 = hashMap7 == null ? null : (g) hashMap7.get("translationY");
                    HashMap hashMap8 = mVar2.f131801z;
                    g gVar4 = hashMap8 == null ? null : (g) hashMap8.get("rotation");
                    HashMap hashMap9 = mVar2.f131801z;
                    g gVar5 = hashMap9 == null ? null : (g) hashMap9.get("scaleX");
                    HashMap hashMap10 = mVar2.f131801z;
                    g gVar6 = hashMap10 != null ? (g) hashMap10.get("scaleY") : null;
                    a aVar2 = new a();
                    aVar2.f57207e = 0.0f;
                    aVar2.f57206d = 0.0f;
                    aVar2.f57205c = 0.0f;
                    aVar2.f57204b = 0.0f;
                    aVar2.f57203a = 0.0f;
                    if (lVar3 != null) {
                        gVar = gVar3;
                        mVar = mVar2;
                        aVar2.f57207e = (float) lVar3.f127935a.I(b13);
                        aVar2.f57208f = lVar3.a(b13);
                    } else {
                        gVar = gVar3;
                        mVar = mVar2;
                    }
                    if (lVar != null) {
                        lVar6 = lVar3;
                        f15 = f17;
                        aVar2.f57205c = (float) lVar.f127935a.I(b13);
                    } else {
                        lVar6 = lVar3;
                        f15 = f17;
                    }
                    if (lVar2 != null) {
                        aVar2.f57206d = (float) lVar2.f127935a.I(b13);
                    }
                    if (lVar4 != null) {
                        aVar2.f57203a = (float) lVar4.f127935a.I(b13);
                    }
                    if (lVar5 != null) {
                        aVar2.f57204b = (float) lVar5.f127935a.I(b13);
                    }
                    if (gVar4 != null) {
                        aVar2.f57207e = gVar4.b(b13);
                    }
                    if (gVar2 != null) {
                        aVar2.f57205c = gVar2.b(b13);
                    }
                    g gVar7 = gVar;
                    if (gVar != null) {
                        aVar2.f57206d = gVar7.b(b13);
                    }
                    if (gVar5 != null) {
                        aVar2.f57203a = gVar5.b(b13);
                    }
                    if (gVar6 != null) {
                        aVar2.f57204b = gVar6.b(b13);
                    }
                    m mVar3 = mVar;
                    b bVar = mVar3.f131786k;
                    if (bVar != null) {
                        double[] dArr2 = mVar3.f131791p;
                        if (dArr2.length > 0) {
                            double d2 = b13;
                            bVar.G(d2, dArr2);
                            mVar3.f131786k.J(d2, mVar3.f131792q);
                            int[] iArr = mVar3.f131790o;
                            double[] dArr3 = mVar3.f131792q;
                            double[] dArr4 = mVar3.f131791p;
                            mVar3.f131781f.getClass();
                            fArr4 = fArr3;
                            aVar = aVar2;
                            i19 = i26;
                            f16 = f18;
                            i17 = i18;
                            w.g(f18, f15, fArr4, iArr, dArr3, dArr4);
                        } else {
                            aVar = aVar2;
                            f16 = f18;
                            fArr4 = fArr3;
                            i19 = i26;
                            i17 = i18;
                        }
                        aVar.a(f16, f15, width2, height2, fArr4);
                        f14 = f16;
                        i16 = i19;
                    } else {
                        fArr4 = fArr3;
                        i17 = i18;
                        if (mVar3.f131785j != null) {
                            double b14 = mVar3.b(b13, fArr7);
                            mVar3.f131785j[0].J(b14, mVar3.f131792q);
                            mVar3.f131785j[0].G(b14, mVar3.f131791p);
                            float f25 = fArr7[0];
                            int i28 = 0;
                            while (true) {
                                dArr = mVar3.f131792q;
                                if (i28 >= dArr.length) {
                                    break;
                                }
                                dArr[i28] = dArr[i28] * f25;
                                i28++;
                            }
                            int[] iArr2 = mVar3.f131790o;
                            double[] dArr5 = mVar3.f131791p;
                            mVar3.f131781f.getClass();
                            w.g(f18, f15, fArr4, iArr2, dArr, dArr5);
                            aVar2.a(f18, f15, width2, height2, fArr4);
                            i16 = i26;
                            f14 = f18;
                        } else {
                            w wVar = mVar3.f131782g;
                            float f26 = wVar.f131840e;
                            w wVar2 = mVar3.f131781f;
                            g gVar8 = gVar5;
                            float f27 = f26 - wVar2.f131840e;
                            float f28 = wVar.f131841f - wVar2.f131841f;
                            g gVar9 = gVar2;
                            float f29 = wVar.f131842g - wVar2.f131842g;
                            float f33 = (wVar.f131843h - wVar2.f131843h) + f28;
                            fArr4[0] = ((f29 + f27) * f18) + ((1.0f - f18) * f27);
                            fArr4[1] = (f33 * f15) + ((1.0f - f15) * f28);
                            aVar2.f57207e = 0.0f;
                            aVar2.f57206d = 0.0f;
                            aVar2.f57205c = 0.0f;
                            aVar2.f57204b = 0.0f;
                            aVar2.f57203a = 0.0f;
                            if (lVar6 != null) {
                                fArr2 = fArr4;
                                aVar2.f57207e = (float) lVar6.f127935a.I(b13);
                                aVar2.f57208f = lVar6.a(b13);
                            } else {
                                fArr2 = fArr4;
                            }
                            if (lVar != null) {
                                aVar2.f57205c = (float) lVar.f127935a.I(b13);
                            }
                            if (lVar2 != null) {
                                aVar2.f57206d = (float) lVar2.f127935a.I(b13);
                            }
                            if (lVar4 != null) {
                                aVar2.f57203a = (float) lVar4.f127935a.I(b13);
                            }
                            if (lVar5 != null) {
                                aVar2.f57204b = (float) lVar5.f127935a.I(b13);
                            }
                            if (gVar4 != null) {
                                aVar2.f57207e = gVar4.b(b13);
                            }
                            if (gVar9 != null) {
                                aVar2.f57205c = gVar9.b(b13);
                            }
                            if (gVar7 != null) {
                                aVar2.f57206d = gVar7.b(b13);
                            }
                            if (gVar8 != null) {
                                aVar2.f57203a = gVar8.b(b13);
                            }
                            if (gVar6 != null) {
                                aVar2.f57204b = gVar6.b(b13);
                            }
                            i16 = i26;
                            f14 = f18;
                            aVar2.a(f18, f15, width2, height2, fArr2);
                        }
                    }
                    fArr2 = fArr4;
                } else {
                    f13 = f24;
                    i13 = width;
                    matrix = matrix3;
                    i14 = height;
                    fArr = fArr5;
                    i15 = i24;
                    fArr2 = fArr6;
                    i16 = i26;
                    f14 = f18;
                    i17 = i25;
                    f15 = f17;
                    mVar2.d(fArr2, f23, f14, f15);
                }
                if (i16 < 2) {
                    fArr2[0] = fArr2[0] * f13;
                    fArr2[1] = fArr2[1] * f13;
                }
                motionTelltales = this;
                float[] fArr8 = motionTelltales.f17638n;
                Matrix matrix4 = matrix;
                matrix4.mapVectors(fArr8);
                int i29 = i13;
                float f34 = i29 * f14;
                int i33 = i14;
                float f35 = i33 * f15;
                float f36 = fArr8[0];
                float f37 = motionTelltales.f17642r;
                float f38 = f35 - (fArr8[1] * f37);
                matrix4.mapVectors(fArr8);
                canvas.drawLine(f34, f35, f34 - (f36 * f37), f38, motionTelltales.f17636l);
                i25 = i17 + 1;
                height = i33;
                f17 = f15;
                fArr5 = fArr;
                i24 = i15;
                i23 = 5;
                matrix3 = matrix4;
                width = i29;
            }
            i24++;
            height = height;
            i23 = 5;
            matrix3 = matrix3;
            width = width;
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z13, int i13, int i14, int i15, int i16) {
        super.onLayout(z13, i13, i14, i15, i16);
        postInvalidate();
    }

    public MotionTelltales(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        this.f17636l = new Paint();
        this.f17638n = new float[2];
        this.f17639o = new Matrix();
        this.f17640p = 0;
        this.f17641q = -65281;
        this.f17642r = 0.25f;
        b(context, attributeSet);
    }
}
