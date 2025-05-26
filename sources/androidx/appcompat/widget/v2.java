package androidx.appcompat.widget;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.ImageView;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public final class v2 extends Property {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16695a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v2(int i13, Class cls, String str) {
        super(cls, str);
        this.f16695a = i13;
    }

    public final Float a(View view) {
        switch (this.f16695a) {
            case 9:
                return Float.valueOf(ua.b1.f121223a.f(view));
            case 10:
            default:
                WeakHashMap weakHashMap = q5.v0.f102521a;
                return Float.valueOf(view.getPaddingEnd());
            case 11:
                return Float.valueOf(view.getLayoutParams().width);
            case 12:
                return Float.valueOf(view.getLayoutParams().height);
            case 13:
                WeakHashMap weakHashMap2 = q5.v0.f102521a;
                return Float.valueOf(view.getPaddingStart());
        }
    }

    public final void b(View view, PointF pointF) {
        switch (this.f16695a) {
            case 3:
                ua.b1.c(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
                break;
            case 4:
                ua.b1.c(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
                break;
            default:
                int round = Math.round(pointF.x);
                int round2 = Math.round(pointF.y);
                ua.b1.c(view, round, round2, view.getWidth() + round, view.getHeight() + round2);
                break;
        }
    }

    public final void c(View view, Float f13) {
        switch (this.f16695a) {
            case 9:
                ua.b1.d(view, f13.floatValue());
                break;
            case 10:
            default:
                WeakHashMap weakHashMap = q5.v0.f102521a;
                view.setPaddingRelative(view.getPaddingStart(), view.getPaddingTop(), f13.intValue(), view.getPaddingBottom());
                break;
            case 11:
                view.getLayoutParams().width = f13.intValue();
                view.requestLayout();
                break;
            case 12:
                view.getLayoutParams().height = f13.intValue();
                view.requestLayout();
                break;
            case 13:
                int intValue = f13.intValue();
                int paddingTop = view.getPaddingTop();
                WeakHashMap weakHashMap2 = q5.v0.f102521a;
                view.setPaddingRelative(intValue, paddingTop, view.getPaddingEnd(), view.getPaddingBottom());
                break;
        }
    }

    public final void d(ua.e eVar, PointF pointF) {
        switch (this.f16695a) {
            case 1:
                eVar.getClass();
                eVar.f121242a = Math.round(pointF.x);
                int round = Math.round(pointF.y);
                eVar.f121243b = round;
                int i13 = eVar.f121247f + 1;
                eVar.f121247f = i13;
                if (i13 == eVar.f121248g) {
                    ua.b1.c(eVar.f121246e, eVar.f121242a, round, eVar.f121244c, eVar.f121245d);
                    eVar.f121247f = 0;
                    eVar.f121248g = 0;
                    break;
                }
                break;
            default:
                eVar.getClass();
                eVar.f121244c = Math.round(pointF.x);
                int round2 = Math.round(pointF.y);
                eVar.f121245d = round2;
                int i14 = eVar.f121248g + 1;
                eVar.f121248g = i14;
                if (eVar.f121247f == i14) {
                    ua.b1.c(eVar.f121246e, eVar.f121242a, eVar.f121243b, eVar.f121244c, round2);
                    eVar.f121247f = 0;
                    eVar.f121248g = 0;
                    break;
                }
                break;
        }
    }

    public final void e(xj.f fVar, Float f13) {
        switch (this.f16695a) {
            case 15:
                float floatValue = f13.floatValue();
                fVar.f135098h = floatValue;
                int i13 = (int) (floatValue * 5400.0f);
                xj.k kVar = (xj.k) ((List) fVar.f16057b).get(0);
                float f14 = fVar.f135098h * 1520.0f;
                kVar.f135120a = (-20.0f) + f14;
                kVar.f135121b = f14;
                int i14 = 0;
                while (true) {
                    q6.b bVar = fVar.f135095e;
                    if (i14 >= 4) {
                        float f15 = kVar.f135120a;
                        float f16 = kVar.f135121b;
                        kVar.f135120a = (((f16 - f15) * fVar.f135099i) + f15) / 360.0f;
                        kVar.f135121b = f16 / 360.0f;
                        int i15 = 0;
                        while (true) {
                            if (i15 < 4) {
                                float q13 = androidx.appcompat.app.j0.q(i13, xj.f.f135090m[i15], 333);
                                if (q13 < 0.0f || q13 > 1.0f) {
                                    i15++;
                                } else {
                                    int i16 = i15 + fVar.f135097g;
                                    int[] iArr = fVar.f135096f.f135076c;
                                    int length = i16 % iArr.length;
                                    int length2 = (length + 1) % iArr.length;
                                    int i17 = iArr[length];
                                    int i18 = iArr[length2];
                                    ((xj.k) ((List) fVar.f16057b).get(0)).f135122c = gj.b.a(bVar.getInterpolation(q13), Integer.valueOf(i17), Integer.valueOf(i18)).intValue();
                                }
                            }
                        }
                        ((xj.l) fVar.f16056a).invalidateSelf();
                        break;
                    } else {
                        kVar.f135121b = (bVar.getInterpolation(androidx.appcompat.app.j0.q(i13, xj.f.f135088k[i14], 667)) * 250.0f) + kVar.f135121b;
                        kVar.f135120a = (bVar.getInterpolation(androidx.appcompat.app.j0.q(i13, xj.f.f135089l[i14], 667)) * 250.0f) + kVar.f135120a;
                        i14++;
                    }
                }
                break;
            default:
                fVar.f135099i = f13.floatValue();
                break;
        }
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        int i13 = this.f16695a;
        switch (i13) {
            case 0:
                return Float.valueOf(((SwitchCompat) obj).f16467z);
            case 1:
                return null;
            case 2:
                return null;
            case 3:
                return null;
            case 4:
                return null;
            case 5:
                return null;
            case 6:
                return null;
            case 7:
                return null;
            case 8:
                return null;
            case 9:
                return a((View) obj);
            case 10:
                return ((View) obj).getClipBounds();
            case 11:
                return a((View) obj);
            case 12:
                return a((View) obj);
            case 13:
                return a((View) obj);
            case 14:
                return a((View) obj);
            case 15:
                xj.f fVar = (xj.f) obj;
                switch (i13) {
                    case 15:
                        return Float.valueOf(fVar.f135098h);
                    default:
                        return Float.valueOf(fVar.f135099i);
                }
            case 16:
                xj.f fVar2 = (xj.f) obj;
                switch (i13) {
                    case 15:
                        return Float.valueOf(fVar2.f135098h);
                    default:
                        return Float.valueOf(fVar2.f135099i);
                }
            case 17:
                return Float.valueOf(((xj.j) obj).b());
            case 18:
                return Float.valueOf(((xj.n) obj).f135138h);
            default:
                return Float.valueOf(((xj.p) obj).f135150i);
        }
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        switch (this.f16695a) {
            case 0:
                SwitchCompat switchCompat = (SwitchCompat) obj;
                switchCompat.f16467z = ((Float) obj2).floatValue();
                switchCompat.invalidate();
                break;
            case 1:
                d((ua.e) obj, (PointF) obj2);
                break;
            case 2:
                d((ua.e) obj, (PointF) obj2);
                break;
            case 3:
                b((View) obj, (PointF) obj2);
                break;
            case 4:
                b((View) obj, (PointF) obj2);
                break;
            case 5:
                b((View) obj, (PointF) obj2);
                break;
            case 6:
                ua.k0.c((ImageView) obj, (Matrix) obj2);
                break;
            case 7:
                ua.l lVar = (ua.l) obj;
                float[] fArr = (float[]) obj2;
                lVar.getClass();
                System.arraycopy(fArr, 0, lVar.f121297c, 0, fArr.length);
                lVar.a();
                break;
            case 8:
                ua.l lVar2 = (ua.l) obj;
                PointF pointF = (PointF) obj2;
                lVar2.getClass();
                lVar2.f121298d = pointF.x;
                lVar2.f121299e = pointF.y;
                lVar2.a();
                break;
            case 9:
                c((View) obj, (Float) obj2);
                break;
            case 10:
                ((View) obj).setClipBounds((Rect) obj2);
                break;
            case 11:
                c((View) obj, (Float) obj2);
                break;
            case 12:
                c((View) obj, (Float) obj2);
                break;
            case 13:
                c((View) obj, (Float) obj2);
                break;
            case 14:
                c((View) obj, (Float) obj2);
                break;
            case 15:
                e((xj.f) obj, (Float) obj2);
                break;
            case 16:
                e((xj.f) obj, (Float) obj2);
                break;
            case 17:
                xj.j jVar = (xj.j) obj;
                float floatValue = ((Float) obj2).floatValue();
                if (jVar.f135117h != floatValue) {
                    jVar.f135117h = floatValue;
                    jVar.invalidateSelf();
                    break;
                }
                break;
            case 18:
                xj.n nVar = (xj.n) obj;
                float floatValue2 = ((Float) obj2).floatValue();
                nVar.f135138h = floatValue2;
                ((xj.k) ((List) nVar.f16057b).get(0)).f135120a = 0.0f;
                float q13 = androidx.appcompat.app.j0.q((int) (floatValue2 * 333.0f), 0, 667);
                xj.k kVar = (xj.k) ((List) nVar.f16057b).get(0);
                xj.k kVar2 = (xj.k) ((List) nVar.f16057b).get(1);
                q6.b bVar = nVar.f135134d;
                float interpolation = bVar.getInterpolation(q13);
                kVar2.f135120a = interpolation;
                kVar.f135121b = interpolation;
                xj.k kVar3 = (xj.k) ((List) nVar.f16057b).get(1);
                xj.k kVar4 = (xj.k) ((List) nVar.f16057b).get(2);
                float interpolation2 = bVar.getInterpolation(q13 + 0.49925038f);
                kVar4.f135120a = interpolation2;
                kVar3.f135121b = interpolation2;
                ((xj.k) ((List) nVar.f16057b).get(2)).f135121b = 1.0f;
                if (nVar.f135137g && ((xj.k) ((List) nVar.f16057b).get(1)).f135121b < 1.0f) {
                    ((xj.k) ((List) nVar.f16057b).get(2)).f135122c = ((xj.k) ((List) nVar.f16057b).get(1)).f135122c;
                    ((xj.k) ((List) nVar.f16057b).get(1)).f135122c = ((xj.k) ((List) nVar.f16057b).get(0)).f135122c;
                    ((xj.k) ((List) nVar.f16057b).get(0)).f135122c = nVar.f135135e.f135076c[nVar.f135136f];
                    nVar.f135137g = false;
                }
                ((xj.l) nVar.f16056a).invalidateSelf();
                break;
            default:
                xj.p pVar = (xj.p) obj;
                float floatValue3 = ((Float) obj2).floatValue();
                pVar.f135150i = floatValue3;
                int i13 = (int) (floatValue3 * 1800.0f);
                for (int i14 = 0; i14 < ((List) pVar.f16057b).size(); i14++) {
                    xj.k kVar5 = (xj.k) ((List) pVar.f16057b).get(i14);
                    int[] iArr = xj.p.f135142l;
                    int i15 = i14 * 2;
                    int i16 = iArr[i15];
                    int[] iArr2 = xj.p.f135141k;
                    float q14 = androidx.appcompat.app.j0.q(i13, i16, iArr2[i15]);
                    Interpolator[] interpolatorArr = pVar.f135146e;
                    kVar5.f135120a = com.bumptech.glide.c.p(interpolatorArr[i15].getInterpolation(q14), 0.0f, 1.0f);
                    int i17 = i15 + 1;
                    kVar5.f135121b = com.bumptech.glide.c.p(interpolatorArr[i17].getInterpolation(androidx.appcompat.app.j0.q(i13, iArr[i17], iArr2[i17])), 0.0f, 1.0f);
                }
                if (pVar.f135149h) {
                    Iterator it = ((List) pVar.f16057b).iterator();
                    while (it.hasNext()) {
                        ((xj.k) it.next()).f135122c = pVar.f135147f.f135076c[pVar.f135148g];
                    }
                    pVar.f135149h = false;
                }
                ((xj.l) pVar.f16056a).invalidateSelf();
                break;
        }
    }
}
