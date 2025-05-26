package o80;

import a.cb;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.GestureDetector;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import android.widget.OverScroller;
import com.pinterest.ui.imageview.WebImageView;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import q5.c1;
import ql2.s;

/* loaded from: classes5.dex */
public final class j implements View.OnTouchListener, ViewTreeObserver.OnGlobalLayoutListener {
    public final float A;
    public float B;
    public float C;
    public float D;
    public float E;
    public final float F;
    public final float G;
    public float H;
    public float I;

    /* renamed from: J, reason: collision with root package name */
    public float f93493J;
    public float K;
    public float L;
    public float M;
    public float N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public g R;
    public h S;
    public c T;
    public final AccelerateDecelerateInterpolator U;
    public boolean V;
    public float W;
    public float X;
    public final int Y;

    /* renamed from: a, reason: collision with root package name */
    public final ImageView f93494a;

    /* renamed from: b, reason: collision with root package name */
    public final float f93495b;

    /* renamed from: c, reason: collision with root package name */
    public final float f93496c;

    /* renamed from: d, reason: collision with root package name */
    public final int f93497d;

    /* renamed from: e, reason: collision with root package name */
    public final float f93498e;

    /* renamed from: f, reason: collision with root package name */
    public final l f93499f;

    /* renamed from: g, reason: collision with root package name */
    public final f f93500g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f93501h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f93502i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f93503j;

    /* renamed from: k, reason: collision with root package name */
    public float f93504k;

    /* renamed from: l, reason: collision with root package name */
    public final WeakReference f93505l;

    /* renamed from: m, reason: collision with root package name */
    public final GestureDetector f93506m;

    /* renamed from: n, reason: collision with root package name */
    public final b f93507n;

    /* renamed from: o, reason: collision with root package name */
    public final Matrix f93508o;

    /* renamed from: p, reason: collision with root package name */
    public final Matrix f93509p;

    /* renamed from: q, reason: collision with root package name */
    public final Matrix f93510q;

    /* renamed from: r, reason: collision with root package name */
    public final RectF f93511r;

    /* renamed from: s, reason: collision with root package name */
    public final float[] f93512s;

    /* renamed from: t, reason: collision with root package name */
    public Matrix f93513t;

    /* renamed from: u, reason: collision with root package name */
    public int f93514u;

    /* renamed from: v, reason: collision with root package name */
    public int f93515v;

    /* renamed from: w, reason: collision with root package name */
    public int f93516w;

    /* renamed from: x, reason: collision with root package name */
    public int f93517x;

    /* renamed from: y, reason: collision with root package name */
    public s.h f93518y;

    /* renamed from: z, reason: collision with root package name */
    public final ImageView.ScaleType f93519z;

    public j(WebImageView webImageView, float f13, float f14, int i13, float f15, l imageTouchListener, f imageEdgeListener, boolean z13, boolean z14, boolean z15, Context context) {
        Intrinsics.checkNotNullParameter(webImageView, "webImageView");
        Intrinsics.checkNotNullParameter(imageTouchListener, "imageTouchListener");
        Intrinsics.checkNotNullParameter(imageEdgeListener, "imageEdgeListener");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f93494a = webImageView;
        this.f93495b = f13;
        this.f93496c = f14;
        this.f93497d = i13;
        this.f93498e = f15;
        this.f93499f = imageTouchListener;
        this.f93500g = imageEdgeListener;
        this.f93501h = z13;
        this.f93502i = z14;
        this.f93503j = z15;
        this.f93504k = 1.0f;
        this.f93505l = new WeakReference(webImageView);
        this.f93508o = new Matrix();
        this.f93509p = new Matrix();
        this.f93510q = new Matrix();
        this.f93511r = new RectF();
        this.f93512s = new float[9];
        this.f93519z = ImageView.ScaleType.FIT_CENTER;
        float f16 = hf0.b.f69002b;
        this.A = hf0.b.f69003c;
        float a13 = z14 ? s.a((f15 - i13) / 2.0f, 0.0f) : 0.0f;
        this.B = a13;
        this.C = z14 ? s.a(f15 - ((f15 - i13) / 2.0f), a13) : f15;
        this.E = f16;
        float a14 = z14 ? s.a((f15 - i13) / 2.0f, 0.0f) : 0.0f;
        this.F = a14;
        f15 = z14 ? s.a(f15 - ((f15 - i13) / 2.0f), a14) : f15;
        this.G = f15;
        this.H = f15;
        float f17 = this.C;
        this.f93493J = f17;
        float f18 = this.E;
        this.L = f18;
        this.M = f18;
        this.N = f17;
        this.P = true;
        this.U = new AccelerateDecelerateInterpolator();
        int scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        this.Y = scaledTouchSlop * scaledTouchSlop;
        webImageView.setDrawingCacheEnabled(true);
        webImageView.setOnTouchListener(this);
        ViewTreeObserver viewTreeObserver = webImageView.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        ImageView.ScaleType scaleType = ImageView.ScaleType.MATRIX;
        if (scaleType != webImageView.getScaleType()) {
            webImageView.setScaleType(scaleType);
        }
        Context context2 = webImageView.getContext();
        this.f93507n = new b(context2, this);
        this.f93506m = new GestureDetector(context2, new c1.a(this, 2));
    }

    public static int i(ImageView imageView) {
        if (imageView == null) {
            return 0;
        }
        return (imageView.getWidth() - imageView.getPaddingStart()) - imageView.getPaddingEnd();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2, types: [float[], java.lang.Cloneable] */
    public final void a(Matrix matrix, float f13, float f14, Function0 function0) {
        if (f14 == 0.0f) {
            function0.invoke();
            return;
        }
        h hVar = this.S;
        if (hVar != null) {
            ((f91.b) hVar).F(f13, f14, false);
        }
        float[] fArr = new float[9];
        new Matrix(this.f93510q).getValues(fArr);
        ?? r63 = new float[9];
        matrix.getValues(r63);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(400L);
        ofFloat.addUpdateListener(new ma2.a(fArr, r63, this, 2));
        ofFloat.addListener(new c1((Object) this, (Object) matrix, (Serializable) function0, 3));
        ofFloat.start();
    }

    public final boolean b() {
        RectF f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        if (h() == null || (f13 = f(g())) == null) {
            return false;
        }
        float height = f13.height();
        float width = f13.width();
        boolean z13 = this.O;
        Matrix matrix = this.f93510q;
        if (z13) {
            if (f13.height() < this.C - this.B) {
                this.B = this.I;
                this.C = this.f93493J;
            }
            float f19 = f13.top;
            float f23 = this.B;
            if (f19 >= f23) {
                float f24 = f13.bottom;
                float f25 = this.C;
                if (f24 <= f25) {
                    float height2 = (f25 - f23) / f13.height();
                    float centerX = f13.centerX();
                    float centerY = f13.centerY();
                    h hVar = this.S;
                    if (hVar != null) {
                        ((f91.b) hVar).F(e() * height2, e(), false);
                    }
                    matrix.postScale(height2, height2, centerX, centerY);
                    l(g(), true);
                }
            }
            float f26 = f13.top;
            float f27 = this.B;
            float f28 = f26 > f27 ? f27 - f26 : 0.0f;
            float f29 = f13.bottom;
            float f33 = this.C;
            if (f29 < f33) {
                f28 = f33 - f29;
            }
            float f34 = f13.left;
            float f35 = this.D;
            r7 = f34 > f35 ? f35 - f34 : 0.0f;
            float f36 = f13.right;
            float f37 = this.E;
            if (f36 < f37) {
                r7 = f37 - f36;
            }
            matrix.postTranslate(r7, f28);
        } else {
            boolean z14 = this.P;
            float f38 = (z14 || this.Q) ? this.F : this.B;
            float f39 = (z14 || this.Q) ? this.f93498e : this.A;
            ImageView.ScaleType scaleType = this.f93519z;
            f fVar = this.f93500g;
            if (height <= f39) {
                int i13 = i.f93492a[scaleType.ordinal()];
                if (i13 != 1) {
                    if (i13 != 2) {
                        f17 = (f39 - height) / 2;
                        f18 = f13.top;
                    } else {
                        f17 = f39 - height;
                        f18 = f13.top;
                    }
                    f14 = f17 - f18;
                } else {
                    f14 = -f13.top;
                }
            } else {
                float f41 = f13.top;
                if (f41 > f38) {
                    f14 = f38 - f41;
                    c cVar = c.TOP;
                    this.T = cVar;
                    ((f91.b) fVar).C(cVar, Math.abs(f41));
                } else {
                    float f43 = f13.bottom;
                    if (f43 < f39) {
                        f14 = f39 - f43;
                        c cVar2 = c.BOTTOM;
                        this.T = cVar2;
                        ((f91.b) fVar).C(cVar2, Math.abs(f43));
                    } else {
                        f14 = 0.0f;
                    }
                }
            }
            float i14 = i(h());
            if (width <= i14) {
                int i15 = i.f93492a[scaleType.ordinal()];
                if (i15 != 1) {
                    if (i15 != 2) {
                        f15 = (i14 - width) / 2;
                        f16 = f13.left;
                    } else {
                        f15 = i14 - width;
                        f16 = f13.left;
                    }
                    r7 = f15 - f16;
                } else {
                    r7 = -f13.left;
                }
            } else {
                float f44 = f13.left;
                if (f44 > 0.0f) {
                    r7 = -f44;
                    c cVar3 = c.LEFT;
                    this.T = cVar3;
                    ((f91.b) fVar).C(cVar3, Math.abs(f44));
                } else {
                    float f45 = f13.right;
                    if (f45 < i14) {
                        r7 = i14 - f45;
                        c cVar4 = c.RIGHT;
                        this.T = cVar4;
                        ((f91.b) fVar).C(cVar4, Math.abs(f45));
                    }
                }
            }
            matrix.postTranslate(r7, f14);
        }
        return true;
    }

    public final void c() {
        ImageView imageView = (ImageView) this.f93505l.get();
        if (imageView != null) {
            ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
            if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
            }
            imageView.setOnTouchListener(null);
            s.h hVar = this.f93518y;
            if (hVar != null) {
                ((OverScroller) hVar.f110266d).forceFinished(true);
            }
            this.f93518y = null;
        }
        this.f93506m.setOnDoubleTapListener(null);
        this.R = null;
    }

    public final void d(float f13) {
        ViewParent parent;
        if (this.f93507n.f93478c.isInProgress()) {
            return;
        }
        RectF rectF = this.f93511r;
        this.B = f13 > 0.0f ? Math.max(this.B, rectF.top + f13) : Math.max(this.F, rectF.top + f13);
        this.C = f13 > 0.0f ? Math.max(this.C, rectF.bottom + f13) : Math.min(this.G, rectF.bottom + f13);
        this.f93510q.postTranslate(0.0f, f13);
        l(g(), false);
        ImageView h10 = h();
        if (h10 == null || (parent = h10.getParent()) == null) {
            return;
        }
        parent.requestDisallowInterceptTouchEvent(true);
    }

    public final float e() {
        Matrix matrix = this.f93510q;
        float[] fArr = this.f93512s;
        matrix.getValues(fArr);
        float pow = (float) Math.pow(fArr[0], 2.0d);
        matrix.getValues(fArr);
        return (float) Math.sqrt(pow + ((float) Math.pow(fArr[3], 2.0d)));
    }

    public final RectF f(Matrix matrix) {
        Drawable drawable;
        ImageView h10 = h();
        if (h10 == null || (drawable = h10.getDrawable()) == null) {
            return null;
        }
        RectF rectF = this.f93511r;
        rectF.set(0.0f, 0.0f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        matrix.mapRect(rectF);
        return rectF;
    }

    public final Matrix g() {
        Matrix matrix = this.f93509p;
        matrix.set(this.f93508o);
        matrix.postConcat(this.f93510q);
        return matrix;
    }

    public final ImageView h() {
        ImageView imageView = (ImageView) this.f93505l.get();
        if (imageView == null) {
            c();
        }
        return imageView;
    }

    public final void j(float f13, float f14) {
        ViewParent parent;
        if (this.f93507n.f93478c.isInProgress()) {
            return;
        }
        if (this.f93503j) {
            float min = this.P ? this.f93498e : Math.min(this.H, this.C);
            RectF rectF = this.f93511r;
            if ((rectF.bottom + f14 < min && f14 < 0.0f) || (rectF.top + f14 > this.B && f14 > 0.0f)) {
                f14 = 0.0f;
            }
        }
        this.f93510q.postTranslate(f13, f14);
        if (b()) {
            l(g(), true);
        }
        ImageView h10 = h();
        if (h10 == null || (parent = h10.getParent()) == null) {
            return;
        }
        parent.requestDisallowInterceptTouchEvent(true);
    }

    public final void k(float f13, float f14, float f15) {
        float f16 = this.f93504k;
        boolean z13 = this.f93503j;
        float f17 = z13 ? 3.0f : 5.0f;
        float e13 = e() * f13;
        if (f16 > e13 || e13 > f17) {
            return;
        }
        if (this.O) {
            RectF f18 = f(g());
            if (f18 == null) {
                return;
            }
            float height = f18.height() * f13;
            float width = f18.width() * f13;
            if (height < this.N || width < this.M) {
                return;
            }
        }
        h hVar = this.S;
        if (hVar != null) {
            ((f91.b) hVar).F(e() * f13, e(), true);
        }
        if (z13 && !this.O) {
            boolean z14 = this.P;
            RectF rectF = this.f93511r;
            if (z14) {
                this.B = this.F;
                this.C = this.G;
                this.H = rectF.bottom;
            } else {
                float height2 = rectF.height();
                float f19 = this.A;
                this.B = 0.0f;
                this.C = Math.min(f19, f19 - ((f19 - height2) / 2));
            }
        }
        this.f93510q.postScale(f13, f13, f14, f15);
        if (b()) {
            l(g(), true);
        }
    }

    public final void l(Matrix matrix, boolean z13) {
        RectF f13;
        g gVar;
        ImageView h10 = h();
        if (h10 != null) {
            ImageView h13 = h();
            if ((h13 != null ? h13.getScaleType() : null) != ImageView.ScaleType.MATRIX) {
                throw new IllegalStateException("The ImageView's ScaleType has been changed. Please set the ScaleType to Matrix!");
            }
            h10.setImageMatrix(matrix);
            if (this.R == null || (f13 = f(matrix)) == null || (gVar = this.R) == null) {
                return;
            }
            ((f91.b) gVar).E(f13, z13);
        }
    }

    public final void m(float f13) {
        if (h() == null || e() == 0.0f) {
            return;
        }
        this.f93510q.postScale(f13 / e(), f13 / e(), r0.getRight() / 2, r0.getBottom() / 2);
        if (b()) {
            l(g(), false);
        }
    }

    public final void n(boolean z13) {
        this.P = z13;
    }

    public final void o(boolean z13) {
        this.Q = z13;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        g gVar;
        ImageView h10 = h();
        if (h10 != null) {
            if ((h10.getTop() == this.f93514u && h10.getBottom() == this.f93516w && h10.getLeft() == this.f93517x && h10.getRight() == this.f93515v) || h10.getDrawable() == null) {
                return;
            }
            Drawable drawable = h10.getDrawable();
            ImageView h13 = h();
            if (h13 != null && drawable != null) {
                float i13 = i(h13);
                float height = (h13.getHeight() - h13.getPaddingTop()) - h13.getPaddingBottom();
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                Matrix matrix = this.f93508o;
                matrix.reset();
                float f13 = intrinsicWidth;
                float f14 = i13 / f13;
                float f15 = intrinsicHeight;
                float f16 = height / f15;
                ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
                ImageView.ScaleType scaleType2 = this.f93519z;
                if (scaleType2 == scaleType) {
                    matrix.postTranslate((i13 - f13) / 2.0f, (height - f15) / 2.0f);
                } else {
                    int[] iArr = i.f93492a;
                    int i14 = iArr[scaleType2.ordinal()];
                    if (i14 == 5) {
                        float max = Math.max(f14, f16);
                        matrix.postScale(max, max);
                        matrix.postTranslate((i13 - (f13 * max)) / 2.0f, cb.a(f15, max, height, 2.0f));
                    } else if (i14 != 6) {
                        RectF rectF = new RectF(0.0f, 0.0f, f13, f15);
                        RectF rectF2 = new RectF(0.0f, 0.0f, i13, height);
                        int i15 = iArr[scaleType2.ordinal()];
                        if (i15 == 1) {
                            matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.START);
                        } else if (i15 == 2) {
                            matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.END);
                        } else if (i15 == 3) {
                            matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
                        } else if (i15 == 4) {
                            matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.FILL);
                        }
                    } else {
                        float min = Math.min(1.0f, Math.min(f14, f16));
                        matrix.postScale(min, min);
                        matrix.postTranslate((i13 - (f13 * min)) / 2.0f, cb.a(f15, min, height, 2.0f));
                    }
                }
                Matrix matrix2 = this.f93510q;
                matrix2.reset();
                l(g(), true);
                b();
                float f17 = this.f93497d;
                float f18 = 2;
                float f19 = (this.A - f17) / f18;
                float f23 = this.f93496c;
                if (f19 > 0.0f) {
                    f23 -= f19;
                }
                float f24 = this.f93495b;
                matrix2.setScale(f24, f24, h13.getRight() / 2.0f, h13.getBottom() / 2.0f);
                if (this.f93502i) {
                    float f25 = (this.f93498e - f17) / f18;
                    if (f25 > 0.0f) {
                        f23 += f25;
                    }
                }
                l(g(), true);
                if (f24 > 1.0f || f23 > 0.0f) {
                    matrix2.postTranslate(0.0f, f23);
                }
                if (b()) {
                    l(g(), true);
                }
                this.f93513t = new Matrix(matrix2);
                RectF f26 = f(g());
                if (f26 != null && (gVar = this.R) != null) {
                    ((f91.b) gVar).D(f26);
                }
            }
            this.f93514u = h10.getTop();
            this.f93515v = h10.getRight();
            this.f93516w = h10.getBottom();
            this.f93517x = h10.getLeft();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0067, code lost:
    
        if (r2 != 3) goto L56;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouch(android.view.View r16, android.view.MotionEvent r17) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o80.j.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0074, code lost:
    
        if ((r4 * r9) > r3) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0077, code lost:
    
        r6 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0088, code lost:
    
        r4 = 1.25f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0091, code lost:
    
        if ((e() * r6) <= 1.25f) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0093, code lost:
    
        r3 = ql2.s.a(e(), 1.0f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x009b, code lost:
    
        r6 = r4 / r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b9, code lost:
    
        if ((r2.height() * r6) >= r7) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c1, code lost:
    
        if (r2.height() != 0.0f) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c4, code lost:
    
        r6 = r7 / r2.height();
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ca, code lost:
    
        r3 = r15 * 0.5f;
        r11 = 0.5f * r7;
        r4 = r3 - ((r2.width() * (r18 / 2.0f)) + ((r2.width() * r16) + r2.left));
        r8 = r11 - ((r2.height() * (r19 / 2.0f)) + ((r2.height() * r17) + r2.top));
        r9 = new android.graphics.Matrix(r14.f93510q);
        r9.postTranslate(r4, r8);
        r9.postScale(r6, r6, r3, r11);
        r12 = new android.graphics.RectF();
        r13 = r2.centerX() + r4;
        r4 = r2.centerY() + r8;
        r8 = r6 - 1;
        r3 = (r13 - r3) * r8;
        r10 = (r4 - r11) * r8;
        r11 = 2;
        r12.left = (r13 - ((r2.width() * r6) / r11)) + r3;
        r12.top = (r4 - ((r2.height() * r6) / r11)) + r10;
        r12.right = (((r2.width() * r6) / r11) + r13) + r3;
        r2 = (((r2.height() * r6) / r11) + r4) + r10;
        r12.bottom = r2;
        r3 = r12.left;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x014a, code lost:
    
        if (r3 <= 0.0f) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x014c, code lost:
    
        r3 = -r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x014f, code lost:
    
        r4 = r12.right;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0153, code lost:
    
        if (r4 >= r15) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0155, code lost:
    
        r3 = r15 - r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0157, code lost:
    
        r4 = r12.top;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x015b, code lost:
    
        if (r4 <= 0.0f) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x015d, code lost:
    
        r5 = 0.0f - r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0160, code lost:
    
        if (r2 >= r7) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0162, code lost:
    
        r5 = r7 - r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0164, code lost:
    
        r9.postTranslate(r3, r5);
        a(r9, e() * r6, e(), r20);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0173, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x014e, code lost:
    
        r3 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x009e, code lost:
    
        r3 = e() * r6;
        r4 = r14.f93504k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00a7, code lost:
    
        if (r3 >= r4) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00a9, code lost:
    
        r3 = ql2.s.a(e(), 1.0f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0086, code lost:
    
        if ((r3 * r9) > r4) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void p(float r15, float r16, float r17, float r18, float r19, l81.h r20) {
        /*
            Method dump skipped, instructions count: 406
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o80.j.p(float, float, float, float, float, l81.h):void");
    }

    public final void q(b01.c cVar) {
        Matrix matrix = this.f93513t;
        if (matrix != null) {
            a(matrix, this.f93495b, e(), cVar);
        }
    }
}
