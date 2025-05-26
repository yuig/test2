package vw1;

import ag.g;
import ag.j;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.CornerPathEffect;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import com.github.mikephil.charting.charts.BarLineChartBase;
import com.github.mikephil.charting.data.Entry;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.partnerAnalytics.feature.analytics.closeup.analyticsGraph.model.CustomEntry;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.f0;
import kotlin.collections.g0;
import kotlin.jvm.internal.Intrinsics;
import n9.d;
import org.chromium.net.y;
import tf.h;
import tf.i;
import zf.n;

/* loaded from: classes4.dex */
public final class c extends n {

    /* renamed from: q, reason: collision with root package name */
    public final Context f126804q;

    /* renamed from: r, reason: collision with root package name */
    public final ArrayList f126805r;

    /* renamed from: s, reason: collision with root package name */
    public float[] f126806s;

    /* renamed from: t, reason: collision with root package name */
    public final ArrayList f126807t;

    /* renamed from: u, reason: collision with root package name */
    public float[] f126808u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Context context, a chart, y animator, j viewPortHandler) {
        super(chart, animator, viewPortHandler);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(chart, "chart");
        Intrinsics.checkNotNullParameter(animator, "animator");
        Intrinsics.checkNotNullParameter(viewPortHandler, "viewPortHandler");
        this.f126804q = context;
        ArrayList arrayList = new ArrayList();
        this.f126805r = arrayList;
        arrayList.addAll(f0.j("PROCESSING", "BEFORE_METRIC_START_DATE", "BEFORE_AUDIENCE_METRIC_START_DATE", "BEFORE_AUDIENCE_MONTHLY_METRIC_START_DATE", "BEFORE_PIN_FORMAT_METRIC_START_DATE", "BEFORE_BUSINESS_CREATED", "BEFORE_DATA_RETENTION_PERIOD", "BEFORE_PIN_DATA_RETENTION_PERIOD", "BEFORE_CORE_METRIC_START_DATE", "BEFORE_ACCOUNT_CLAIMED"));
        this.f126806s = new float[4];
        this.f126807t = new ArrayList();
        this.f126808u = new float[4];
    }

    @Override // zf.n
    public final void A(Canvas canvas, i iLineDataSet) {
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        char c13;
        char c14 = 2;
        Intrinsics.checkNotNullParameter(iLineDataSet, "iLineDataSet");
        int size = iLineDataSet.f117526o.size();
        boolean z13 = iLineDataSet.f117533y == h.STEPPED;
        int i19 = z13 ? 4 : 2;
        sf.n nVar = iLineDataSet.f117515d;
        wf.b bVar = this.f141851h;
        g G = ((BarLineChartBase) bVar).G(nVar);
        Paint paint = this.f141833c;
        paint.setStyle(Paint.Style.STROKE);
        Canvas canvas2 = iLineDataSet.E == null ? canvas : this.f141854k;
        d dVar = this.f141825f;
        dVar.d(bVar, iLineDataSet);
        int i23 = size * i19;
        if (this.f126806s.length < Math.max(i23, i19) * 2) {
            this.f126806s = new float[Math.max(i23, i19) * 2];
        }
        if (iLineDataSet.e(dVar.f89951a) != null && i13 <= (i14 = dVar.f89953c + (i13 = dVar.f89951a))) {
            int i24 = 0;
            while (true) {
                Entry e13 = iLineDataSet.e(i13 == 0 ? 0 : i13 - 1);
                CustomEntry customEntry = e13 instanceof CustomEntry ? (CustomEntry) e13 : null;
                Entry e14 = iLineDataSet.e(i13);
                CustomEntry customEntry2 = e14 instanceof CustomEntry ? (CustomEntry) e14 : null;
                if (customEntry == null || customEntry2 == null) {
                    i15 = i19;
                    i16 = i13;
                    i17 = i14;
                    i18 = i23;
                    c13 = c14;
                } else {
                    Intrinsics.f(G);
                    List j13 = f0.j("ESTIMATE", "READY", "PROCESSING");
                    boolean z14 = j13 instanceof Collection;
                    i16 = i13;
                    ArrayList arrayList = this.f126807t;
                    i17 = i14;
                    Context context = this.f126804q;
                    if (!z14 || !j13.isEmpty()) {
                        Iterator it = j13.iterator();
                        while (it.hasNext()) {
                            String str = (String) it.next();
                            Iterator it2 = it;
                            String str2 = customEntry.f50117e;
                            boolean d2 = Intrinsics.d(str2, str);
                            int i25 = i23;
                            String str3 = customEntry2.f50117e;
                            if (d2 || Intrinsics.d(str3, str)) {
                                ArrayList arrayList2 = this.f126805r;
                                int i26 = i19;
                                if (!(arrayList2 instanceof Collection) || !arrayList2.isEmpty()) {
                                    Iterator it3 = arrayList2.iterator();
                                    while (it3.hasNext()) {
                                        String str4 = (String) it3.next();
                                        if (Intrinsics.d(str2, str4) || Intrinsics.d(str3, str4)) {
                                            arrayList.add(new Pair(customEntry, customEntry2));
                                            Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
                                            Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(...)");
                                            Canvas canvas3 = new Canvas(createBitmap);
                                            Paint paint2 = new Paint();
                                            int i27 = eo1.b.color_gray_100;
                                            Object obj = d5.a.f53679a;
                                            paint2.setColor(context.getColor(i27));
                                            paint2.setStrokeWidth(2.0f);
                                            canvas3.drawLine(0.0f, 0.0f, createBitmap.getWidth(), createBitmap.getHeight(), paint2);
                                            Paint paint3 = new Paint();
                                            paint3.setStyle(Paint.Style.FILL);
                                            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
                                            paint3.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                                            B(canvas2, G, paint3);
                                            i15 = i26;
                                            i18 = i25;
                                            c13 = 2;
                                            break;
                                        }
                                    }
                                }
                                this.f141832b.getClass();
                                float[] fArr = this.f126806s;
                                fArr[i24] = customEntry.f30176c;
                                int i28 = i24 + 2;
                                float f13 = customEntry.f117501a;
                                fArr[i24 + 1] = f13 * 1.0f;
                                if (z13) {
                                    float f14 = customEntry2.f30176c;
                                    fArr[i28] = f14;
                                    fArr[i24 + 3] = f13 * 1.0f;
                                    fArr[i24 + 4] = f14;
                                    i28 = i24 + 6;
                                    fArr[i24 + 5] = f13 * 1.0f;
                                }
                                fArr[i28] = customEntry2.f30176c;
                                i24 = i28 + 2;
                                fArr[i28 + 1] = customEntry2.f117501a * 1.0f;
                                boolean z15 = Intrinsics.d(str2, "ESTIMATE") || Intrinsics.d(str3, "ESTIMATE");
                                int c15 = iLineDataSet.c();
                                iLineDataSet.F = true;
                                paint.setPathEffect(iLineDataSet.E);
                                if (z15) {
                                    iLineDataSet.E = new DashPathEffect(new float[]{10.0f, 30.0f}, 0.0f);
                                    iLineDataSet.i(Color.argb(RecyclerViewTypes.VIEW_TYPE_GMA_INLINE_AD, Color.red(c15), Color.green(c15), Color.blue(c15)));
                                } else {
                                    new DashPathEffect(new float[]{0.0f, 0.0f}, 0.0f);
                                    iLineDataSet.E = null;
                                }
                                G.e(this.f126806s);
                                i15 = i26;
                                c13 = 2;
                                int max = Math.max((dVar.f89953c + 1) * i26, i15) * 2;
                                paint.setColor(iLineDataSet.c());
                                if (canvas2 != null) {
                                    canvas2.drawLines(this.f126806s, 0, max, paint);
                                }
                                i18 = i25;
                                this.f126806s = new float[Math.max(i18, i15) * 2];
                                iLineDataSet.i(c15);
                            } else {
                                it = it2;
                                i23 = i25;
                            }
                        }
                    }
                    i15 = i19;
                    i18 = i23;
                    c13 = 2;
                    arrayList.add(new Pair(customEntry, customEntry2));
                    Paint paint4 = new Paint();
                    int i29 = eo1.b.color_gray_100;
                    Object obj2 = d5.a.f53679a;
                    paint4.setColor(context.getColor(i29));
                    paint4.setStyle(Paint.Style.FILL);
                    B(canvas2, G, paint4);
                }
                int i33 = i16;
                i14 = i17;
                if (i33 == i14) {
                    break;
                }
                i13 = i33 + 1;
                c14 = c13;
                i23 = i18;
                i19 = i15;
            }
        }
        paint.setPathEffect(null);
    }

    public final void B(Canvas canvas, g gVar, Paint paint) {
        ArrayList arrayList = this.f126807t;
        int size = arrayList.size() * 2;
        if (size < 2) {
            size = 2;
        }
        int i13 = size * 2;
        if (this.f126808u.length < i13) {
            this.f126808u = new float[i13];
        }
        this.f141832b.getClass();
        Iterator it = arrayList.iterator();
        int i14 = 0;
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            this.f126808u[i14] = ((Entry) pair.f80346a).b();
            this.f126808u[i14 + 1] = ((Entry) pair.f80346a).a() * 1.0f;
            float[] fArr = this.f126808u;
            int i15 = i14 + 3;
            Entry entry = (Entry) pair.f80347b;
            fArr[i14 + 2] = entry.b();
            i14 += 4;
            this.f126808u[i15] = entry.a() * 1.0f;
        }
        gVar.e(this.f126808u);
        if (canvas != null) {
            float[] fArr2 = this.f126808u;
            Intrinsics.checkNotNullParameter(fArr2, "<this>");
            Float valueOf = fArr2.length == 0 ? null : Float.valueOf(fArr2[0]);
            float floatValue = valueOf != null ? valueOf.floatValue() : 0.0f;
            float f13 = canvas.getClipBounds().top;
            float[] fArr3 = this.f126808u;
            Intrinsics.checkNotNullParameter(fArr3, "<this>");
            canvas.drawRect(floatValue, f13, fArr3[fArr3.length - 2], canvas.getClipBounds().bottom, paint);
        }
        arrayList.clear();
        this.f126808u = new float[4];
    }

    @Override // zf.n, zf.h
    public final void q(Canvas c13) {
        Intrinsics.checkNotNullParameter(c13, "c");
        j jVar = (j) this.f24333a;
        int i13 = (int) jVar.f15116c;
        int i14 = (int) jVar.f15117d;
        WeakReference weakReference = this.f141853j;
        Bitmap bitmap = weakReference != null ? (Bitmap) weakReference.get() : null;
        if (bitmap == null || bitmap.getWidth() != i13 || bitmap.getHeight() != i14 || (i13 > 0 && i14 > 0)) {
            Bitmap createBitmap = Bitmap.createBitmap(i13, i14, this.f141855l);
            this.f141853j = new WeakReference(createBitmap);
            this.f141854k = new Canvas(createBitmap);
            createBitmap.eraseColor(0);
            Iterator it = this.f141851h.e().f117511i.iterator();
            while (it.hasNext()) {
                i iVar = (i) it.next();
                if (iVar.f117525n) {
                    y(c13, iVar);
                }
            }
            c13.drawBitmap(createBitmap, this.f141854k.getClipBounds(), new Rect(10, 0, i13 - 10, i14), this.f141833c);
        }
    }

    @Override // zf.n, zf.h
    public final void r(Canvas canvas) {
        wf.g gVar = this.f141851h;
        Iterator it = gVar.e().f117511i.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            Intrinsics.g(iVar, "null cannot be cast to non-null type com.github.mikephil.charting.data.LineDataSet");
            boolean z13 = ((List) ((a) gVar).U.f114929c) != null ? !r3.isEmpty() : false;
            int c13 = z13 ? 1122867 : iVar.c();
            List list = iVar.f117526o;
            Intrinsics.checkNotNullExpressionValue(list, "getValues(...)");
            List<Entry> list2 = list;
            ArrayList arrayList = new ArrayList(g0.q(list2, 10));
            for (Entry entry : list2) {
                Intrinsics.g(entry, "null cannot be cast to non-null type com.pinterest.partnerAnalytics.feature.analytics.closeup.analyticsGraph.model.CustomEntry");
                arrayList.add(Integer.valueOf(!Intrinsics.d(((CustomEntry) entry).f50117e, "ESTIMATE") ? 0 : z13 ? dl2.b.x0(this.f126804q, eo1.a.color_gray_roboflow_100) : c13));
            }
            iVar.f117534z = arrayList;
            iVar.B = ag.i.c(4.0f);
            iVar.A = c13;
        }
        w(canvas);
    }

    @Override // zf.n
    public final void y(Canvas canvas, i dataSet) {
        Intrinsics.checkNotNullParameter(dataSet, "dataSet");
        if (dataSet.f117526o.size() < 1) {
            return;
        }
        Paint paint = this.f141833c;
        paint.setStrokeWidth(dataSet.f117532x);
        paint.setPathEffect(dataSet.E);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setPathEffect(new CornerPathEffect(10.0f));
        paint.setAntiAlias(true);
        paint.setDither(true);
        paint.setPathEffect(null);
        h hVar = dataSet.f117533y;
        int i13 = hVar == null ? -1 : b.f126803a[hVar.ordinal()];
        if (i13 == 1 || i13 == 2) {
            A(canvas, dataSet);
            return;
        }
        if (i13 == 3) {
            x(dataSet);
        } else if (i13 != 4) {
            A(canvas, dataSet);
        } else {
            z(dataSet);
        }
    }
}
