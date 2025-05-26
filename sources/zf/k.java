package zf;

import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.DisplayMetrics;
import c0.s0;
import com.github.mikephil.charting.data.PieEntry;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class k extends s0 {

    /* renamed from: b, reason: collision with root package name */
    public Paint f141840b;

    /* renamed from: c, reason: collision with root package name */
    public Paint f141841c;

    /* renamed from: d, reason: collision with root package name */
    public sf.j f141842d;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f141843e;

    /* renamed from: f, reason: collision with root package name */
    public Paint.FontMetrics f141844f;

    /* renamed from: g, reason: collision with root package name */
    public Path f141845g;

    public final void q(tf.c cVar) {
        float f13;
        float f14;
        float c13;
        float f15;
        ArrayList arrayList;
        int i13;
        sf.j jVar = this.f141842d;
        jVar.getClass();
        ArrayList arrayList2 = this.f141843e;
        arrayList2.clear();
        for (int i14 = 0; i14 < cVar.c(); i14++) {
            xf.b b13 = cVar.b(i14);
            tf.e eVar = (tf.e) b13;
            List list = eVar.f117512a;
            int size = eVar.f117526o.size();
            if (b13 instanceof tf.m) {
                tf.m mVar = (tf.m) b13;
                for (int i15 = 0; i15 < list.size() && i15 < size; i15++) {
                    ((PieEntry) mVar.e(i15)).getClass();
                    arrayList2.add(new sf.k(null, eVar.f117518g, eVar.f117519h, eVar.f117520i, ((Integer) list.get(i15)).intValue()));
                }
                if (mVar.f117514c != null) {
                    arrayList2.add(new sf.k(eVar.f117514c, sf.f.NONE, Float.NaN, Float.NaN, 1122867));
                }
            } else {
                int i16 = 0;
                while (i16 < list.size() && i16 < size) {
                    arrayList2.add(new sf.k((i16 >= list.size() - 1 || i16 >= size + (-1)) ? ((tf.e) cVar.b(i14)).f117514c : null, eVar.f117518g, eVar.f117519h, eVar.f117520i, ((Integer) list.get(i16)).intValue()));
                    i16++;
                }
            }
        }
        jVar.f112477f = (sf.k[]) arrayList2.toArray(new sf.k[arrayList2.size()]);
        Paint paint = this.f141840b;
        paint.setTextSize(jVar.f112472d);
        paint.setColor(jVar.f112473e);
        ag.j jVar2 = (ag.j) this.f24333a;
        float f16 = jVar.f112483l;
        float c14 = ag.i.c(f16);
        float c15 = ag.i.c(jVar.f112487p);
        float f17 = jVar.f112486o;
        float c16 = ag.i.c(f17);
        float c17 = ag.i.c(jVar.f112485n);
        float c18 = ag.i.c(0.0f);
        sf.k[] kVarArr = jVar.f112477f;
        int length = kVarArr.length;
        ag.i.c(f17);
        float f18 = 0.0f;
        float f19 = 0.0f;
        for (sf.k kVar : jVar.f112477f) {
            float c19 = ag.i.c(Float.isNaN(kVar.f112497c) ? f16 : kVar.f112497c);
            if (c19 > f19) {
                f19 = c19;
            }
            String str = kVar.f112495a;
            if (str != null) {
                float measureText = (int) paint.measureText(str);
                if (measureText > f18) {
                    f18 = measureText;
                }
            }
        }
        float f23 = 0.0f;
        for (sf.k kVar2 : jVar.f112477f) {
            String str2 = kVar2.f112495a;
            if (str2 != null) {
                float a13 = ag.i.a(paint, str2);
                if (a13 > f23) {
                    f23 = a13;
                }
            }
        }
        jVar.f112491t = f23;
        int i17 = sf.d.f112476a[jVar.f112480i.ordinal()];
        if (i17 == 1) {
            Paint.FontMetrics fontMetrics = ag.i.f15109f;
            paint.getFontMetrics(fontMetrics);
            float f24 = fontMetrics.descent - fontMetrics.ascent;
            float f25 = 0.0f;
            float f26 = 0.0f;
            float f27 = 0.0f;
            boolean z13 = false;
            for (int i18 = 0; i18 < length; i18++) {
                sf.k kVar3 = kVarArr[i18];
                boolean z14 = kVar3.f112496b != sf.f.NONE;
                float f28 = kVar3.f112497c;
                float c23 = Float.isNaN(f28) ? c14 : ag.i.c(f28);
                if (!z13) {
                    f27 = 0.0f;
                }
                if (z14) {
                    if (z13) {
                        f27 += c15;
                    }
                    f27 += c23;
                }
                if (kVar3.f112495a != null) {
                    if (z14 && !z13) {
                        f13 = f25;
                        f14 = f27 + c16;
                    } else if (z13) {
                        f26 += f24 + c18;
                        f13 = Math.max(f25, f27);
                        f14 = 0.0f;
                        z13 = false;
                    } else {
                        f13 = f25;
                        f14 = f27;
                    }
                    float measureText2 = f14 + ((int) paint.measureText(r12));
                    if (i18 < length - 1) {
                        f26 = f24 + c18 + f26;
                    }
                    f27 = measureText2;
                    f25 = f13;
                } else {
                    f27 += c23;
                    if (i18 < length - 1) {
                        f27 += c15;
                    }
                    z13 = true;
                }
                f25 = Math.max(f25, f27);
            }
            jVar.f112489r = f25;
            jVar.f112490s = f26;
        } else if (i17 == 2) {
            Paint.FontMetrics fontMetrics2 = ag.i.f15109f;
            paint.getFontMetrics(fontMetrics2);
            float f29 = fontMetrics2.descent - fontMetrics2.ascent;
            paint.getFontMetrics(fontMetrics2);
            float f33 = (fontMetrics2.ascent - fontMetrics2.top) + fontMetrics2.bottom + c18;
            jVar2.f15115b.width();
            ArrayList arrayList3 = jVar.f112493v;
            arrayList3.clear();
            ArrayList arrayList4 = jVar.f112492u;
            arrayList4.clear();
            ArrayList arrayList5 = jVar.f112494w;
            arrayList5.clear();
            int i19 = -1;
            float f34 = 0.0f;
            int i23 = 0;
            float f35 = 0.0f;
            float f36 = 0.0f;
            while (i23 < length) {
                sf.k kVar4 = kVarArr[i23];
                float f37 = c17;
                sf.k[] kVarArr2 = kVarArr;
                boolean z15 = kVar4.f112496b != sf.f.NONE;
                float f38 = kVar4.f112497c;
                if (Float.isNaN(f38)) {
                    f15 = f33;
                    c13 = c14;
                } else {
                    c13 = ag.i.c(f38);
                    f15 = f33;
                }
                arrayList3.add(Boolean.FALSE);
                float f39 = i19 == -1 ? 0.0f : f34 + c15;
                String str3 = kVar4.f112495a;
                if (str3 != null) {
                    arrayList4.add(ag.i.b(paint, str3));
                    arrayList = arrayList3;
                    f34 = f39 + (z15 ? c16 + c13 : 0.0f) + ((ag.a) arrayList4.get(i23)).f15081b;
                    i13 = -1;
                } else {
                    ag.a aVar = (ag.a) ag.a.f15080d.b();
                    arrayList = arrayList3;
                    aVar.f15081b = 0.0f;
                    aVar.f15082c = 0.0f;
                    arrayList4.add(aVar);
                    if (!z15) {
                        c13 = 0.0f;
                    }
                    i13 = -1;
                    f34 = f39 + c13;
                    if (i19 == -1) {
                        i19 = i23;
                    }
                }
                if (str3 != null || i23 == length - 1) {
                    float f41 = (f35 == 0.0f ? 0.0f : f37) + f34 + f35;
                    if (i23 == length - 1) {
                        ag.a aVar2 = (ag.a) ag.a.f15080d.b();
                        aVar2.f15081b = f41;
                        aVar2.f15082c = f29;
                        arrayList5.add(aVar2);
                        f36 = Math.max(f36, f41);
                    }
                    f35 = f41;
                }
                if (str3 != null) {
                    i19 = i13;
                }
                i23++;
                c17 = f37;
                kVarArr = kVarArr2;
                f33 = f15;
                arrayList3 = arrayList;
            }
            float f43 = f33;
            jVar.f112489r = f36;
            jVar.f112490s = (f43 * (arrayList5.size() == 0 ? 0 : arrayList5.size() - 1)) + (f29 * arrayList5.size());
        }
        jVar.f112490s += jVar.f112471c;
        jVar.f112489r += jVar.f112470b;
    }

    public final void r(Canvas canvas, float f13, float f14, sf.k kVar, sf.j jVar) {
        int i13 = kVar.f112500f;
        if (i13 == 1122868 || i13 == 1122867 || i13 == 0) {
            return;
        }
        int save = canvas.save();
        sf.f fVar = sf.f.DEFAULT;
        sf.f fVar2 = kVar.f112496b;
        if (fVar2 == fVar) {
            fVar2 = jVar.f112482k;
        }
        Paint paint = this.f141841c;
        paint.setColor(kVar.f112500f);
        float f15 = kVar.f112497c;
        if (Float.isNaN(f15)) {
            f15 = jVar.f112483l;
        }
        float c13 = ag.i.c(f15);
        float f16 = c13 / 2.0f;
        int i14 = j.f141839d[fVar2.ordinal()];
        if (i14 == 3 || i14 == 4) {
            paint.setStyle(Paint.Style.FILL);
            canvas.drawCircle(f13 + f16, f14, f16, paint);
        } else if (i14 == 5) {
            paint.setStyle(Paint.Style.FILL);
            canvas.drawRect(f13, f14 - f16, f13 + c13, f14 + f16, paint);
        } else if (i14 == 6) {
            float f17 = kVar.f112498d;
            if (Float.isNaN(f17)) {
                f17 = jVar.f112484m;
            }
            float c14 = ag.i.c(f17);
            DashPathEffect dashPathEffect = kVar.f112499e;
            if (dashPathEffect == null) {
                jVar.getClass();
                dashPathEffect = null;
            }
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(c14);
            paint.setPathEffect(dashPathEffect);
            Path path = this.f141845g;
            path.reset();
            path.moveTo(f13, f14);
            path.lineTo(f13 + c13, f14);
            canvas.drawPath(path, paint);
        }
        canvas.restoreToCount(save);
    }

    public final void s(Canvas canvas) {
        Paint paint;
        float f13;
        float f14;
        float f15;
        float f16;
        sf.g gVar;
        ArrayList arrayList;
        ArrayList arrayList2;
        float f17;
        String str;
        int i13;
        int i14;
        float f18;
        float f19;
        float f23;
        sf.e eVar;
        float f24;
        float f25;
        sf.k kVar;
        float f26;
        Paint paint2;
        float width;
        float f27;
        double d2;
        sf.j jVar = this.f141842d;
        if (jVar.f112469a) {
            Paint paint3 = this.f141840b;
            paint3.setTextSize(jVar.f112472d);
            paint3.setColor(jVar.f112473e);
            Paint.FontMetrics fontMetrics = this.f141844f;
            DisplayMetrics displayMetrics = ag.i.f15104a;
            paint3.getFontMetrics(fontMetrics);
            float f28 = fontMetrics.descent - fontMetrics.ascent;
            paint3.getFontMetrics(fontMetrics);
            float c13 = ag.i.c(0.0f) + (fontMetrics.ascent - fontMetrics.top) + fontMetrics.bottom;
            float a13 = f28 - (ag.i.a(paint3, "ABC") / 2.0f);
            sf.k[] kVarArr = jVar.f112477f;
            float c14 = ag.i.c(jVar.f112486o);
            float c15 = ag.i.c(jVar.f112485n);
            sf.h hVar = jVar.f112480i;
            sf.g gVar2 = jVar.f112478g;
            sf.i iVar = jVar.f112479h;
            sf.e eVar2 = jVar.f112481j;
            float c16 = ag.i.c(jVar.f112483l);
            float c17 = ag.i.c(jVar.f112487p);
            float f29 = c15;
            float f33 = jVar.f112471c;
            float f34 = jVar.f112470b;
            float f35 = c17;
            int i15 = j.f141836a[gVar2.ordinal()];
            if (i15 == 1) {
                paint = paint3;
                f13 = f28;
                if (hVar != sf.h.VERTICAL) {
                    f34 += ((ag.j) this.f24333a).f15115b.left;
                }
                f14 = eVar2 == sf.e.RIGHT_TO_LEFT ? f34 + jVar.f112489r : f34;
            } else if (i15 == 2) {
                paint = paint3;
                f13 = f28;
                f14 = (hVar == sf.h.VERTICAL ? ((ag.j) this.f24333a).f15116c : ((ag.j) this.f24333a).f15115b.right) - f34;
                if (eVar2 == sf.e.LEFT_TO_RIGHT) {
                    f14 -= jVar.f112489r;
                }
            } else if (i15 != 3) {
                paint = paint3;
                f13 = f28;
                f14 = 0.0f;
            } else {
                sf.h hVar2 = sf.h.VERTICAL;
                if (hVar == hVar2) {
                    width = ((ag.j) this.f24333a).f15116c / 2.0f;
                } else {
                    RectF rectF = ((ag.j) this.f24333a).f15115b;
                    width = (rectF.width() / 2.0f) + rectF.left;
                }
                sf.e eVar3 = sf.e.LEFT_TO_RIGHT;
                if (eVar2 == eVar3) {
                    f13 = f28;
                    f27 = f34;
                } else {
                    f13 = f28;
                    f27 = -f34;
                }
                f14 = width + f27;
                if (hVar == hVar2) {
                    double d13 = f14;
                    if (eVar2 == eVar3) {
                        paint = paint3;
                        d2 = ((-jVar.f112489r) / 2.0d) + f34;
                    } else {
                        paint = paint3;
                        d2 = (jVar.f112489r / 2.0d) - f34;
                    }
                    f14 = (float) (d13 + d2);
                } else {
                    paint = paint3;
                }
            }
            int i16 = j.f141838c[hVar.ordinal()];
            if (i16 != 1) {
                if (i16 != 2) {
                    return;
                }
                int i17 = j.f141837b[iVar.ordinal()];
                if (i17 == 1) {
                    f23 = (gVar2 == sf.g.CENTER ? 0.0f : ((ag.j) this.f24333a).f15115b.top) + f33;
                } else if (i17 != 2) {
                    f23 = i17 != 3 ? 0.0f : ((((ag.j) this.f24333a).f15117d / 2.0f) - (jVar.f112490s / 2.0f)) + jVar.f112471c;
                } else {
                    f23 = (gVar2 == sf.g.CENTER ? ((ag.j) this.f24333a).f15117d : ((ag.j) this.f24333a).f15115b.bottom) - (jVar.f112490s + f33);
                }
                float f36 = f23;
                boolean z13 = false;
                int i18 = 0;
                float f37 = 0.0f;
                while (i18 < kVarArr.length) {
                    sf.k kVar2 = kVarArr[i18];
                    boolean z14 = kVar2.f112496b != sf.f.NONE;
                    float f38 = kVar2.f112497c;
                    float c18 = Float.isNaN(f38) ? c16 : ag.i.c(f38);
                    if (z14) {
                        sf.e eVar4 = sf.e.LEFT_TO_RIGHT;
                        f26 = eVar2 == eVar4 ? f14 + f37 : f14 - (c18 - f37);
                        eVar = eVar2;
                        f25 = a13;
                        f24 = f14;
                        kVar = kVar2;
                        r(canvas, f26, f36 + a13, kVar2, this.f141842d);
                        if (eVar == eVar4) {
                            f26 += c18;
                        }
                    } else {
                        eVar = eVar2;
                        f24 = f14;
                        f25 = a13;
                        kVar = kVar2;
                        f26 = f24;
                    }
                    String str2 = kVar.f112495a;
                    if (str2 != null) {
                        if (z14 && !z13) {
                            f26 += eVar == sf.e.LEFT_TO_RIGHT ? c14 : -c14;
                        } else if (z13) {
                            f26 = f24;
                        }
                        if (eVar == sf.e.RIGHT_TO_LEFT) {
                            paint2 = paint;
                            f26 -= (int) paint2.measureText(str2);
                        } else {
                            paint2 = paint;
                        }
                        float f39 = f26;
                        if (z13) {
                            f36 += f13 + c13;
                            canvas.drawText(str2, f39, f36 + f13, this.f141840b);
                        } else {
                            canvas.drawText(str2, f39, f36 + f13, this.f141840b);
                        }
                        f36 = f13 + c13 + f36;
                        f37 = 0.0f;
                    } else {
                        paint2 = paint;
                        f37 = c18 + f35 + f37;
                        z13 = true;
                    }
                    i18++;
                    paint = paint2;
                    eVar2 = eVar;
                    a13 = f25;
                    f14 = f24;
                }
                return;
            }
            float f41 = f14;
            ArrayList arrayList3 = jVar.f112494w;
            ArrayList arrayList4 = jVar.f112492u;
            ArrayList arrayList5 = jVar.f112493v;
            int i19 = j.f141837b[iVar.ordinal()];
            float f43 = i19 != 1 ? i19 != 2 ? i19 != 3 ? 0.0f : ((((ag.j) this.f24333a).f15117d - jVar.f112490s) / 2.0f) + f33 : (((ag.j) this.f24333a).f15117d - f33) - jVar.f112490s : f33;
            int length = kVarArr.length;
            float f44 = f41;
            int i23 = 0;
            int i24 = 0;
            while (i24 < length) {
                sf.k kVar3 = kVarArr[i24];
                float f45 = f44;
                boolean z15 = kVar3.f112496b != sf.f.NONE;
                float f46 = kVar3.f112497c;
                float c19 = Float.isNaN(f46) ? c16 : ag.i.c(f46);
                if (i24 >= arrayList5.size() || !((Boolean) arrayList5.get(i24)).booleanValue()) {
                    f15 = f45;
                    f16 = f43;
                } else {
                    f16 = f13 + c13 + f43;
                    f15 = f41;
                }
                if (f15 == f41 && gVar2 == sf.g.CENTER && i23 < arrayList3.size()) {
                    f15 += (eVar2 == sf.e.RIGHT_TO_LEFT ? ((ag.a) arrayList3.get(i23)).f15081b : -((ag.a) arrayList3.get(i23)).f15081b) / 2.0f;
                    i23++;
                }
                int i25 = i23;
                String str3 = kVar3.f112495a;
                boolean z16 = str3 == null;
                if (z15) {
                    if (eVar2 == sf.e.RIGHT_TO_LEFT) {
                        f15 -= c19;
                    }
                    float f47 = f15;
                    arrayList = arrayList3;
                    str = str3;
                    gVar = gVar2;
                    arrayList2 = arrayList5;
                    f17 = f29;
                    i13 = length;
                    i14 = i24;
                    r(canvas, f47, f16 + a13, kVar3, this.f141842d);
                    f15 = eVar2 == sf.e.LEFT_TO_RIGHT ? f47 + c19 : f47;
                } else {
                    gVar = gVar2;
                    arrayList = arrayList3;
                    arrayList2 = arrayList5;
                    f17 = f29;
                    str = str3;
                    i13 = length;
                    i14 = i24;
                }
                if (z16) {
                    if (eVar2 == sf.e.RIGHT_TO_LEFT) {
                        f18 = f35;
                        f19 = -f18;
                    } else {
                        f18 = f35;
                        f19 = f18;
                    }
                    f44 = f15 + f19;
                } else {
                    if (z15) {
                        f15 += eVar2 == sf.e.RIGHT_TO_LEFT ? -c14 : c14;
                    }
                    sf.e eVar5 = sf.e.RIGHT_TO_LEFT;
                    if (eVar2 == eVar5) {
                        f15 -= ((ag.a) arrayList4.get(i14)).f15081b;
                    }
                    canvas.drawText(str, f15, f16 + f13, this.f141840b);
                    if (eVar2 == sf.e.LEFT_TO_RIGHT) {
                        f15 += ((ag.a) arrayList4.get(i14)).f15081b;
                    }
                    f44 = f15 + (eVar2 == eVar5 ? -f17 : f17);
                    f18 = f35;
                }
                i24 = i14 + 1;
                f35 = f18;
                f43 = f16;
                length = i13;
                i23 = i25;
                gVar2 = gVar;
                arrayList3 = arrayList;
                f29 = f17;
                arrayList5 = arrayList2;
            }
        }
    }
}
