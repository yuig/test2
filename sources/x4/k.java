package x4;

import android.graphics.Rect;
import android.util.Log;
import java.util.HashMap;
import java.util.LinkedHashMap;

/* loaded from: classes3.dex */
public final class k implements Comparable {

    /* renamed from: c, reason: collision with root package name */
    public int f131759c;

    /* renamed from: a, reason: collision with root package name */
    public float f131757a = 1.0f;

    /* renamed from: b, reason: collision with root package name */
    public int f131758b = 0;

    /* renamed from: d, reason: collision with root package name */
    public float f131760d = 0.0f;

    /* renamed from: e, reason: collision with root package name */
    public float f131761e = 0.0f;

    /* renamed from: f, reason: collision with root package name */
    public float f131762f = 0.0f;

    /* renamed from: g, reason: collision with root package name */
    public float f131763g = 0.0f;

    /* renamed from: h, reason: collision with root package name */
    public float f131764h = 1.0f;

    /* renamed from: i, reason: collision with root package name */
    public float f131765i = 1.0f;

    /* renamed from: j, reason: collision with root package name */
    public float f131766j = Float.NaN;

    /* renamed from: k, reason: collision with root package name */
    public float f131767k = Float.NaN;

    /* renamed from: l, reason: collision with root package name */
    public float f131768l = 0.0f;

    /* renamed from: m, reason: collision with root package name */
    public float f131769m = 0.0f;

    /* renamed from: n, reason: collision with root package name */
    public float f131770n = 0.0f;

    /* renamed from: o, reason: collision with root package name */
    public float f131771o = Float.NaN;

    /* renamed from: p, reason: collision with root package name */
    public float f131772p = Float.NaN;

    /* renamed from: q, reason: collision with root package name */
    public final LinkedHashMap f131773q = new LinkedHashMap();

    public static boolean b(float f13, float f14) {
        return (Float.isNaN(f13) || Float.isNaN(f14)) ? Float.isNaN(f13) != Float.isNaN(f14) : Math.abs(f13 - f14) > 1.0E-6f;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void a(int i13, HashMap hashMap) {
        for (String str : hashMap.keySet()) {
            w4.l lVar = (w4.l) hashMap.get(str);
            str.getClass();
            char c13 = 65535;
            switch (str.hashCode()) {
                case -1249320806:
                    if (str.equals("rotationX")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case -1249320805:
                    if (str.equals("rotationY")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case -1225497657:
                    if (str.equals("translationX")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case -1225497656:
                    if (str.equals("translationY")) {
                        c13 = 3;
                        break;
                    }
                    break;
                case -1225497655:
                    if (str.equals("translationZ")) {
                        c13 = 4;
                        break;
                    }
                    break;
                case -1001078227:
                    if (str.equals("progress")) {
                        c13 = 5;
                        break;
                    }
                    break;
                case -908189618:
                    if (str.equals("scaleX")) {
                        c13 = 6;
                        break;
                    }
                    break;
                case -908189617:
                    if (str.equals("scaleY")) {
                        c13 = 7;
                        break;
                    }
                    break;
                case -760884510:
                    if (str.equals("transformPivotX")) {
                        c13 = '\b';
                        break;
                    }
                    break;
                case -760884509:
                    if (str.equals("transformPivotY")) {
                        c13 = '\t';
                        break;
                    }
                    break;
                case -40300674:
                    if (str.equals("rotation")) {
                        c13 = '\n';
                        break;
                    }
                    break;
                case -4379043:
                    if (str.equals("elevation")) {
                        c13 = 11;
                        break;
                    }
                    break;
                case 37232917:
                    if (str.equals("transitionPathRotate")) {
                        c13 = '\f';
                        break;
                    }
                    break;
                case 92909918:
                    if (str.equals("alpha")) {
                        c13 = '\r';
                        break;
                    }
                    break;
            }
            switch (c13) {
                case 0:
                    lVar.b(i13, Float.isNaN(this.f131762f) ? 0.0f : this.f131762f);
                    break;
                case 1:
                    lVar.b(i13, Float.isNaN(this.f131763g) ? 0.0f : this.f131763g);
                    break;
                case 2:
                    lVar.b(i13, Float.isNaN(this.f131768l) ? 0.0f : this.f131768l);
                    break;
                case 3:
                    lVar.b(i13, Float.isNaN(this.f131769m) ? 0.0f : this.f131769m);
                    break;
                case 4:
                    lVar.b(i13, Float.isNaN(this.f131770n) ? 0.0f : this.f131770n);
                    break;
                case 5:
                    lVar.b(i13, Float.isNaN(this.f131772p) ? 0.0f : this.f131772p);
                    break;
                case 6:
                    lVar.b(i13, Float.isNaN(this.f131764h) ? 1.0f : this.f131764h);
                    break;
                case 7:
                    lVar.b(i13, Float.isNaN(this.f131765i) ? 1.0f : this.f131765i);
                    break;
                case '\b':
                    lVar.b(i13, Float.isNaN(this.f131766j) ? 0.0f : this.f131766j);
                    break;
                case '\t':
                    lVar.b(i13, Float.isNaN(this.f131767k) ? 0.0f : this.f131767k);
                    break;
                case '\n':
                    lVar.b(i13, Float.isNaN(this.f131761e) ? 0.0f : this.f131761e);
                    break;
                case 11:
                    lVar.b(i13, Float.isNaN(this.f131760d) ? 0.0f : this.f131760d);
                    break;
                case '\f':
                    lVar.b(i13, Float.isNaN(this.f131771o) ? 0.0f : this.f131771o);
                    break;
                case '\r':
                    lVar.b(i13, Float.isNaN(this.f131757a) ? 1.0f : this.f131757a);
                    break;
                default:
                    if (str.startsWith("CUSTOM")) {
                        String str2 = str.split(",")[1];
                        LinkedHashMap linkedHashMap = this.f131773q;
                        if (linkedHashMap.containsKey(str2)) {
                            androidx.constraintlayout.widget.c cVar = (androidx.constraintlayout.widget.c) linkedHashMap.get(str2);
                            if (lVar instanceof w4.i) {
                                ((w4.i) lVar).f127932f.append(i13, cVar);
                                break;
                            } else {
                                Log.e("MotionPaths", str + " ViewSpline not a CustomSet frame = " + i13 + ", value" + cVar.b() + lVar);
                                break;
                            }
                        } else {
                            break;
                        }
                    } else {
                        Log.e("MotionPaths", "UNKNOWN spline ".concat(str));
                        break;
                    }
            }
        }
    }

    public final void c(Rect rect, androidx.constraintlayout.widget.p pVar, int i13, int i14) {
        rect.width();
        rect.height();
        androidx.constraintlayout.widget.k w13 = pVar.w(i14);
        androidx.constraintlayout.widget.n nVar = w13.f17765c;
        int i15 = nVar.f17831c;
        this.f131758b = i15;
        int i16 = nVar.f17830b;
        this.f131759c = i16;
        this.f131757a = (i16 == 0 || i15 != 0) ? nVar.f17832d : 0.0f;
        androidx.constraintlayout.widget.o oVar = w13.f17768f;
        boolean z13 = oVar.f17847m;
        this.f131760d = oVar.f17848n;
        this.f131761e = oVar.f17836b;
        this.f131762f = oVar.f17837c;
        this.f131763g = oVar.f17838d;
        this.f131764h = oVar.f17839e;
        this.f131765i = oVar.f17840f;
        this.f131766j = oVar.f17841g;
        this.f131767k = oVar.f17842h;
        this.f131768l = oVar.f17844j;
        this.f131769m = oVar.f17845k;
        this.f131770n = oVar.f17846l;
        androidx.constraintlayout.widget.m mVar = w13.f17766d;
        t4.e.c(mVar.f17819d);
        this.f131771o = mVar.f17823h;
        this.f131772p = w13.f17765c.f17833e;
        for (String str : w13.f17769g.keySet()) {
            androidx.constraintlayout.widget.c cVar = (androidx.constraintlayout.widget.c) w13.f17769g.get(str);
            cVar.getClass();
            int i17 = androidx.constraintlayout.widget.a.f17717a[cVar.f17720c.ordinal()];
            if (i17 != 1 && i17 != 2 && i17 != 3) {
                this.f131773q.put(str, cVar);
            }
        }
        if (i13 != 1) {
            if (i13 != 2) {
                if (i13 != 3) {
                    if (i13 != 4) {
                        return;
                    }
                }
            }
            float f13 = this.f131761e + 90.0f;
            this.f131761e = f13;
            if (f13 > 180.0f) {
                this.f131761e = f13 - 360.0f;
                return;
            }
            return;
        }
        this.f131761e -= 90.0f;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        ((k) obj).getClass();
        return Float.compare(0.0f, 0.0f);
    }
}
