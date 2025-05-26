package zf;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import com.github.mikephil.charting.charts.BarLineChartBase;
import com.github.mikephil.charting.data.Entry;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public class n extends o {

    /* renamed from: h, reason: collision with root package name */
    public final wf.g f141851h;

    /* renamed from: i, reason: collision with root package name */
    public final Paint f141852i;

    /* renamed from: j, reason: collision with root package name */
    public WeakReference f141853j;

    /* renamed from: k, reason: collision with root package name */
    public Canvas f141854k;

    /* renamed from: l, reason: collision with root package name */
    public final Bitmap.Config f141855l;

    /* renamed from: m, reason: collision with root package name */
    public final Path f141856m;

    /* renamed from: n, reason: collision with root package name */
    public float[] f141857n;

    /* renamed from: o, reason: collision with root package name */
    public final HashMap f141858o;

    /* renamed from: p, reason: collision with root package name */
    public final float[] f141859p;

    public n(wf.g gVar, org.chromium.net.y yVar, ag.j jVar) {
        super(yVar, jVar);
        this.f141855l = Bitmap.Config.ARGB_8888;
        this.f141856m = new Path();
        new Path();
        this.f141857n = new float[4];
        new Path();
        this.f141858o = new HashMap();
        this.f141859p = new float[2];
        this.f141851h = gVar;
        Paint paint = new Paint(1);
        this.f141852i = paint;
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(-1);
    }

    public void A(Canvas canvas, tf.i iVar) {
        char c13;
        int size = iVar.f117526o.size();
        char c14 = 0;
        boolean z13 = iVar.f117533y == tf.h.STEPPED;
        int i13 = z13 ? 4 : 2;
        sf.n nVar = iVar.f117515d;
        wf.b bVar = this.f141851h;
        ag.g G = ((BarLineChartBase) bVar).G(nVar);
        this.f141832b.getClass();
        Paint paint = this.f141833c;
        paint.setStyle(Paint.Style.STROKE);
        Canvas canvas2 = iVar.E == null ? canvas : this.f141854k;
        n9.d dVar = this.f141825f;
        dVar.d(bVar, iVar);
        float f13 = 1.0f;
        if (iVar.f117512a.size() > 1) {
            int i14 = i13 * 2;
            if (this.f141857n.length <= i14) {
                this.f141857n = new float[i13 * 4];
            }
            int i15 = dVar.f89951a;
            while (i15 <= dVar.f89953c + dVar.f89951a) {
                Entry e13 = iVar.e(i15);
                if (e13 != null) {
                    this.f141857n[c14] = e13.b();
                    this.f141857n[1] = e13.a() * f13;
                    if (i15 < dVar.f89952b) {
                        Entry e14 = iVar.e(i15 + 1);
                        if (e14 == null) {
                            break;
                        }
                        if (z13) {
                            this.f141857n[2] = e14.b();
                            float[] fArr = this.f141857n;
                            float f14 = fArr[1];
                            fArr[3] = f14;
                            fArr[4] = fArr[2];
                            fArr[5] = f14;
                            fArr[6] = e14.b();
                            this.f141857n[7] = e14.a() * f13;
                        } else {
                            this.f141857n[2] = e14.b();
                            this.f141857n[3] = e14.a() * f13;
                        }
                        c13 = 0;
                    } else {
                        float[] fArr2 = this.f141857n;
                        c13 = 0;
                        fArr2[2] = fArr2[0];
                        fArr2[3] = fArr2[1];
                    }
                    G.e(this.f141857n);
                    if (!((ag.j) this.f24333a).d(this.f141857n[c13])) {
                        break;
                    }
                    if (((ag.j) this.f24333a).c(this.f141857n[2])) {
                        Object obj = this.f24333a;
                        if (((ag.j) obj).f15115b.top > this.f141857n[1]) {
                            if (((ag.j) obj).f15115b.bottom < ((int) (r14[3] * 100.0f)) / 100.0f) {
                            }
                        }
                        List list = iVar.f117512a;
                        paint.setColor(((Integer) list.get(i15 % list.size())).intValue());
                        canvas2.drawLines(this.f141857n, 0, i14, paint);
                    }
                }
                i15++;
                c14 = 0;
                f13 = 1.0f;
            }
        } else {
            int i16 = size * i13;
            if (this.f141857n.length < Math.max(i16, i13) * 2) {
                this.f141857n = new float[Math.max(i16, i13) * 4];
            }
            if (iVar.e(dVar.f89951a) != null) {
                int i17 = dVar.f89951a;
                int i18 = 0;
                while (i17 <= dVar.f89953c + dVar.f89951a) {
                    Entry e15 = iVar.e(i17 == 0 ? 0 : i17 - 1);
                    Entry e16 = iVar.e(i17);
                    if (e15 != null && e16 != null) {
                        this.f141857n[i18] = e15.b();
                        int i19 = i18 + 2;
                        this.f141857n[i18 + 1] = e15.a() * 1.0f;
                        if (z13) {
                            this.f141857n[i19] = e16.b();
                            this.f141857n[i18 + 3] = e15.a() * 1.0f;
                            this.f141857n[i18 + 4] = e16.b();
                            i19 = i18 + 6;
                            this.f141857n[i18 + 5] = e15.a() * 1.0f;
                        }
                        this.f141857n[i19] = e16.b();
                        this.f141857n[i19 + 1] = e16.a() * 1.0f;
                        i18 = i19 + 2;
                    }
                    i17++;
                }
                if (i18 > 0) {
                    G.e(this.f141857n);
                    int max = Math.max((dVar.f89953c + 1) * i13, i13) * 2;
                    paint.setColor(iVar.c());
                    canvas2.drawLines(this.f141857n, 0, max, paint);
                }
            }
        }
        paint.setPathEffect(null);
    }

    @Override // zf.h
    public void q(Canvas canvas) {
        ag.j jVar = (ag.j) this.f24333a;
        int i13 = (int) jVar.f15116c;
        int i14 = (int) jVar.f15117d;
        WeakReference weakReference = this.f141853j;
        Bitmap bitmap = weakReference == null ? null : (Bitmap) weakReference.get();
        if (bitmap == null || bitmap.getWidth() != i13 || bitmap.getHeight() != i14) {
            if (i13 <= 0 || i14 <= 0) {
                return;
            }
            bitmap = Bitmap.createBitmap(i13, i14, this.f141855l);
            this.f141853j = new WeakReference(bitmap);
            this.f141854k = new Canvas(bitmap);
        }
        bitmap.eraseColor(0);
        Iterator it = this.f141851h.e().f117511i.iterator();
        while (it.hasNext()) {
            tf.i iVar = (tf.i) it.next();
            if (iVar.f117525n) {
                y(canvas, iVar);
            }
        }
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, this.f141833c);
    }

    @Override // zf.h
    public void r(Canvas canvas) {
        w(canvas);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // zf.h
    public final void s(Canvas canvas, vf.c[] cVarArr) {
        wf.g gVar = this.f141851h;
        tf.g e13 = gVar.e();
        for (vf.c cVar : cVarArr) {
            tf.i iVar = (tf.i) e13.b(cVar.f125770f);
            if (iVar != null && iVar.f117516e) {
                Entry f13 = iVar.f(cVar.f125765a, cVar.f125766b, tf.d.CLOSEST);
                if (f13 != null) {
                    float indexOf = iVar.f117526o.indexOf(f13);
                    float size = iVar.f117526o.size();
                    this.f141832b.getClass();
                    if (indexOf < size * 1.0f) {
                        ag.g G = ((BarLineChartBase) gVar).G(iVar.f117515d);
                        float b13 = f13.b();
                        float a13 = f13.a();
                        this.f141832b.getClass();
                        ag.c a14 = G.a(b13, a13 * 1.0f);
                        float f14 = (float) a14.f15084b;
                        float f15 = (float) a14.f15085c;
                        cVar.f125773i = f14;
                        cVar.f125774j = f15;
                        this.f141834d.setColor(iVar.f117535t);
                        this.f141834d.setStrokeWidth(iVar.f117538w);
                        this.f141834d.setPathEffect(null);
                        Path path = this.f141860g;
                        if (iVar.f117536u) {
                            path.reset();
                            path.moveTo(f14, ((ag.j) this.f24333a).f15115b.top);
                            path.lineTo(f14, ((ag.j) this.f24333a).f15115b.bottom);
                            canvas.drawPath(path, this.f141834d);
                        }
                        if (iVar.f117537v) {
                            path.reset();
                            path.moveTo(((ag.j) this.f24333a).f15115b.left, f15);
                            path.lineTo(((ag.j) this.f24333a).f15115b.right, f15);
                            canvas.drawPath(path, this.f141834d);
                        }
                    }
                }
            }
        }
    }

    @Override // zf.h
    public final void t(Canvas canvas) {
        wf.g gVar;
        wf.g gVar2;
        wf.g gVar3 = this.f141851h;
        if (v(gVar3)) {
            ArrayList arrayList = gVar3.e().f117511i;
            int i13 = 0;
            while (i13 < arrayList.size()) {
                tf.i iVar = (tf.i) arrayList.get(i13);
                if (!iVar.f117525n || (!(iVar.f117521j || iVar.f117522k) || iVar.f117526o.size() < 1)) {
                    gVar = gVar3;
                } else {
                    Paint paint = this.f141835e;
                    paint.setTypeface(null);
                    paint.setTextSize(iVar.f117524m);
                    ag.g G = ((BarLineChartBase) gVar3).G(iVar.f117515d);
                    int i14 = (int) (iVar.B * 1.75f);
                    if (!iVar.F) {
                        i14 /= 2;
                    }
                    n9.d dVar = this.f141825f;
                    dVar.d(gVar3, iVar);
                    this.f141832b.getClass();
                    int i15 = dVar.f89951a;
                    int i16 = (((int) ((dVar.f89952b - i15) * 1.0f)) + 1) * 2;
                    if (G.f15100d.length != i16) {
                        G.f15100d = new float[i16];
                    }
                    float[] fArr = G.f15100d;
                    for (int i17 = 0; i17 < i16; i17 += 2) {
                        Entry e13 = iVar.e((i17 / 2) + i15);
                        if (e13 != null) {
                            fArr[i17] = e13.b();
                            fArr[i17 + 1] = e13.a() * 1.0f;
                        } else {
                            fArr[i17] = 0.0f;
                            fArr[i17 + 1] = 0.0f;
                        }
                    }
                    Matrix matrix = G.f15103g;
                    matrix.set(G.f15097a);
                    matrix.postConcat(G.f15099c.f15114a);
                    matrix.postConcat(G.f15098b);
                    matrix.mapPoints(fArr);
                    f0.h hVar = iVar.f117517f;
                    if (hVar == null) {
                        hVar = ag.i.f15111h;
                    }
                    ag.d dVar2 = iVar.f117523l;
                    ag.d dVar3 = (ag.d) ag.d.f15086d.b();
                    float f13 = dVar2.f15087b;
                    dVar3.f15087b = f13;
                    dVar3.f15088c = dVar2.f15088c;
                    dVar3.f15087b = ag.i.c(f13);
                    dVar3.f15088c = ag.i.c(dVar3.f15088c);
                    int i18 = 0;
                    while (i18 < fArr.length) {
                        float f14 = fArr[i18];
                        float f15 = fArr[i18 + 1];
                        if (!((ag.j) this.f24333a).d(f14)) {
                            break;
                        }
                        if (((ag.j) this.f24333a).c(f14) && ((ag.j) this.f24333a).e(f15)) {
                            int i19 = i18 / 2;
                            Entry e14 = iVar.e(dVar.f89951a + i19);
                            if (iVar.f117521j) {
                                hVar.getClass();
                                gVar2 = gVar3;
                                int h10 = iVar.h(i19);
                                Paint paint2 = this.f141835e;
                                paint2.setColor(h10);
                                canvas.drawText(hVar.G(e14.a()), f14, f15 - i14, paint2);
                            } else {
                                gVar2 = gVar3;
                            }
                            e14.getClass();
                        } else {
                            gVar2 = gVar3;
                        }
                        i18 += 2;
                        gVar3 = gVar2;
                    }
                    gVar = gVar3;
                    ag.d.c(dVar3);
                }
                i13++;
                gVar3 = gVar;
            }
        }
    }

    @Override // zf.h
    public final void u() {
    }

    public final void w(Canvas canvas) {
        wf.g gVar;
        ArrayList arrayList;
        int i13;
        int i14;
        int i15;
        m mVar;
        ArrayList arrayList2;
        int i16;
        this.f141833c.setStyle(Paint.Style.FILL);
        this.f141832b.getClass();
        float[] fArr = this.f141859p;
        int i17 = 0;
        float f13 = 0.0f;
        fArr[0] = 0.0f;
        int i18 = 1;
        fArr[1] = 0.0f;
        wf.g gVar2 = this.f141851h;
        ArrayList arrayList3 = gVar2.e().f117511i;
        int i19 = 0;
        while (i19 < arrayList3.size()) {
            tf.i iVar = (tf.i) arrayList3.get(i19);
            if (iVar.f117525n && iVar.F && iVar.f117526o.size() != 0) {
                this.f141852i.setColor(iVar.A);
                ag.g G = ((BarLineChartBase) gVar2).G(iVar.f117515d);
                n9.d dVar = this.f141825f;
                dVar.d(gVar2, iVar);
                float f14 = iVar.B;
                float f15 = iVar.C;
                int i23 = (!iVar.G || f15 >= f14 || f15 <= f13) ? i17 : i18;
                int i24 = (i23 == 0 || iVar.A != 1122867) ? i17 : i18;
                HashMap hashMap = this.f141858o;
                if (hashMap.containsKey(iVar)) {
                    mVar = (m) hashMap.get(iVar);
                } else {
                    m mVar2 = new m(this);
                    hashMap.put(iVar, mVar2);
                    mVar = mVar2;
                }
                mVar.getClass();
                int size = iVar.f117534z.size();
                Bitmap[] bitmapArr = mVar.f141848b;
                if (bitmapArr == null) {
                    mVar.f141848b = new Bitmap[size];
                } else if (bitmapArr.length != size) {
                    mVar.f141848b = new Bitmap[size];
                }
                int size2 = iVar.f117534z.size();
                float f16 = iVar.B;
                while (i17 < size2) {
                    wf.g gVar3 = gVar2;
                    int[] iArr = mVar.f141849c;
                    if (iArr == null || iArr.length != size2) {
                        mVar.f141849c = new int[size2];
                    }
                    int i25 = size2;
                    if (mVar.f141849c[i17] == ((Integer) iVar.f117534z.get(i17)).intValue()) {
                        arrayList2 = arrayList3;
                        i16 = i19;
                    } else {
                        mVar.f141849c[i17] = ((Integer) iVar.f117534z.get(i17)).intValue();
                        arrayList2 = arrayList3;
                        int i26 = (int) (f16 * 2.1d);
                        Bitmap createBitmap = Bitmap.createBitmap(i26, i26, Bitmap.Config.ARGB_4444);
                        Canvas canvas2 = new Canvas(createBitmap);
                        mVar.f141848b[i17] = createBitmap;
                        n nVar = mVar.f141850d;
                        i16 = i19;
                        nVar.f141833c.setColor(((Integer) iVar.f117534z.get(i17)).intValue());
                        Paint paint = nVar.f141833c;
                        if (i24 != 0) {
                            Path path = mVar.f141847a;
                            path.reset();
                            path.addCircle(f16, f16, f16, Path.Direction.CW);
                            path.addCircle(f16, f16, f15, Path.Direction.CCW);
                            canvas2.drawPath(path, paint);
                        } else {
                            canvas2.drawCircle(f16, f16, f16, paint);
                            if (i23 != 0) {
                                canvas2.drawCircle(f16, f16, f15, nVar.f141852i);
                            }
                        }
                    }
                    i17++;
                    gVar2 = gVar3;
                    size2 = i25;
                    arrayList3 = arrayList2;
                    i19 = i16;
                }
                gVar = gVar2;
                arrayList = arrayList3;
                i13 = i19;
                int i27 = dVar.f89953c;
                int i28 = dVar.f89951a;
                int i29 = i27 + i28;
                while (i28 <= i29) {
                    Entry e13 = iVar.e(i28);
                    if (e13 == null) {
                        break;
                    }
                    fArr[0] = e13.b();
                    fArr[1] = e13.a() * 1.0f;
                    G.e(fArr);
                    if (!((ag.j) this.f24333a).d(fArr[0])) {
                        i14 = 0;
                        break;
                    }
                    if (((ag.j) this.f24333a).c(fArr[0]) && ((ag.j) this.f24333a).e(fArr[1])) {
                        Bitmap[] bitmapArr2 = mVar.f141848b;
                        Bitmap bitmap = bitmapArr2[i28 % bitmapArr2.length];
                        if (bitmap != null) {
                            canvas.drawBitmap(bitmap, fArr[0] - f14, fArr[1] - f14, (Paint) null);
                            i28++;
                        }
                    }
                    i28++;
                }
                i14 = 0;
                i15 = 1;
            } else {
                gVar = gVar2;
                arrayList = arrayList3;
                i13 = i19;
                i14 = i17;
                i15 = i18;
            }
            i18 = i15;
            arrayList3 = arrayList;
            f13 = 0.0f;
            i19 = i13 + 1;
            i17 = i14;
            gVar2 = gVar;
        }
    }

    public final void x(tf.i iVar) {
        this.f141832b.getClass();
        sf.n nVar = iVar.f117515d;
        wf.b bVar = this.f141851h;
        ag.g G = ((BarLineChartBase) bVar).G(nVar);
        n9.d dVar = this.f141825f;
        dVar.d(bVar, iVar);
        Path path = this.f141856m;
        path.reset();
        if (dVar.f89953c >= 1) {
            int i13 = dVar.f89951a;
            Entry e13 = iVar.e(Math.max(i13 - 1, 0));
            Entry e14 = iVar.e(Math.max(i13, 0));
            if (e14 == null) {
                return;
            }
            path.moveTo(e14.b(), e14.a() * 1.0f);
            int i14 = dVar.f89951a + 1;
            int i15 = -1;
            Entry entry = e14;
            while (i14 <= dVar.f89953c + dVar.f89951a) {
                if (i15 != i14) {
                    e14 = iVar.e(i14);
                }
                Entry entry2 = e14;
                int i16 = i14 + 1;
                int i17 = i16 < iVar.f117526o.size() ? i16 : i14;
                Entry e15 = iVar.e(i17);
                float b13 = entry2.b() - e13.b();
                float f13 = iVar.D;
                path.cubicTo(entry.b() + (b13 * f13), (entry.a() + ((entry2.a() - e13.a()) * f13)) * 1.0f, entry2.b() - ((e15.b() - entry.b()) * f13), (entry2.a() - ((e15.a() - entry.a()) * f13)) * 1.0f, entry2.b(), entry2.a() * 1.0f);
                e13 = entry;
                entry = entry2;
                i14 = i16;
                e14 = e15;
                i15 = i17;
            }
        }
        Paint paint = this.f141833c;
        paint.setColor(iVar.c());
        paint.setStyle(Paint.Style.STROKE);
        G.d(path);
        this.f141854k.drawPath(path, paint);
        paint.setPathEffect(null);
    }

    public void y(Canvas canvas, tf.i iVar) {
        if (iVar.f117526o.size() < 1) {
            return;
        }
        Paint paint = this.f141833c;
        paint.setStrokeWidth(iVar.f117532x);
        paint.setPathEffect(iVar.E);
        int i13 = l.f141846a[iVar.f117533y.ordinal()];
        if (i13 == 3) {
            x(iVar);
        } else if (i13 != 4) {
            A(canvas, iVar);
        } else {
            z(iVar);
        }
        paint.setPathEffect(null);
    }

    public final void z(tf.i iVar) {
        this.f141832b.getClass();
        sf.n nVar = iVar.f117515d;
        wf.b bVar = this.f141851h;
        ag.g G = ((BarLineChartBase) bVar).G(nVar);
        n9.d dVar = this.f141825f;
        dVar.d(bVar, iVar);
        Path path = this.f141856m;
        path.reset();
        if (dVar.f89953c >= 1) {
            Entry e13 = iVar.e(dVar.f89951a);
            path.moveTo(e13.b(), e13.a() * 1.0f);
            int i13 = dVar.f89951a + 1;
            while (i13 <= dVar.f89953c + dVar.f89951a) {
                Entry e14 = iVar.e(i13);
                float b13 = ((e14.b() - e13.b()) / 2.0f) + e13.b();
                path.cubicTo(b13, e13.a() * 1.0f, b13, e14.a() * 1.0f, e14.b(), e14.a() * 1.0f);
                i13++;
                e13 = e14;
            }
        }
        Paint paint = this.f141833c;
        paint.setColor(iVar.c());
        paint.setStyle(Paint.Style.STROKE);
        G.d(path);
        this.f141854k.drawPath(path, paint);
        paint.setPathEffect(null);
    }
}
