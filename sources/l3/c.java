package l3;

import a.cb;
import a.l9;
import a8.h0;
import ads_mobile_sdk.kr2;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.RectF;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Layout;
import android.text.Spannable;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.appcompat.widget.c2;
import androidx.media3.common.ParserException;
import ao2.j0;
import c4.n;
import c4.z;
import com.google.android.gms.internal.fido.zzhf;
import com.google.android.gms.internal.fido.zzhj;
import com.google.android.gms.internal.measurement.q4;
import com.pinterest.api.model.c4;
import com.pinterest.api.model.dj;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.hi;
import com.pinterest.api.model.ih;
import com.pinterest.api.model.li;
import com.pinterest.api.model.q3;
import com.pinterest.api.model.u3;
import com.pinterest.api.model.vh;
import com.pinterest.api.model.wy0;
import com.pinterest.api.model.y3;
import com.pinterest.component.alert.AlertContainer;
import com.pinterest.feature.board.collab.service.BoardActionService;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;
import com.pinterest.gestalt.switchComponent.GestaltSwitch;
import com.pinterest.gestalt.textfield.view.GestaltTextField;
import com.pinterest.identity.account.l;
import com.pinterest.partnerAnalytics.feature.analytics.closeup.analyticsGraph.model.CustomEntry;
import d7.d0;
import d7.u;
import ey.c3;
import f0.h;
import gi.e0;
import gi.n1;
import gi.o1;
import gi.p1;
import gi.r1;
import gi.s1;
import gi.u1;
import h32.a4;
import h32.d4;
import h32.g0;
import h32.i0;
import h32.x3;
import i2.f2;
import j1.x0;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.text.Bidi;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;
import kh2.j1;
import kh2.m0;
import kh2.r;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.c0;
import kotlin.collections.f0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import l8.q;
import m5.j;
import n3.y;
import ni1.o2;
import ni1.t2;
import q5.e1;
import ql2.s;
import qo2.f1;
import so.n5;
import so.r3;
import so.r8;
import ue1.k;
import ue1.p;
import ul2.g;
import ul2.t;
import uw1.f;
import v.y1;
import va0.o;
import wa2.i;
import wa2.m;
import x02.i2;
import xe1.a0;
import yk1.v;
import z32.a3;
import z32.q1;
import z32.t1;
import z32.v0;

/* loaded from: classes2.dex */
public abstract class c implements e1 {
    public static final float A(int i13, int i14, float[] fArr) {
        return fArr[((i13 - i14) * 2) + 1];
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Object A0(g gVar, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
        return ((t) gVar).call(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10);
    }

    public static j61.a B(String str) {
        List V;
        String str2;
        Object obj = null;
        Integer valueOf = (str == null || (V = StringsKt.V(str, new char[]{':'})) == null || (str2 = (String) CollectionsKt.U(1, V)) == null) ? null : Integer.valueOf(Integer.parseInt(str2));
        Iterator it = f0.j(j61.a.f74818g, j61.a.f74819h, j61.a.f74820i, j61.a.f74821j, j61.a.f74822k, j61.a.f74823l).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            int i13 = ((j61.a) next).f74825b;
            if (valueOf != null && i13 == valueOf.intValue()) {
                obj = next;
                break;
            }
        }
        j61.a aVar = (j61.a) obj;
        return aVar == null ? j61.a.f74817f : aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Object B0(g gVar, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11) {
        return ((t) gVar).call(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11);
    }

    public static final float C(hf0.b device) {
        Intrinsics.checkNotNullParameter(device, "device");
        device.getClass();
        if (hf0.b.q() && hf0.b.m()) {
            return 5.0f;
        }
        return (hf0.b.q() && hf0.b.o()) ? 4.0f : 2.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Object C0(g gVar, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Integer num, Integer num2) {
        return ((t) gVar).call(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, num, num2);
    }

    public static final li D() {
        int value = v0.SMALL.getValue();
        q1 q1Var = q1.HIDDEN;
        return new li(true, new hi(value, q1Var.getValue(), false, t1.REASON.getValue()), q1Var.getValue());
    }

    public static j D0() {
        if (j.f85863c != null) {
            return j.f85863c;
        }
        synchronized (j.class) {
            try {
                if (j.f85863c == null) {
                    j.f85863c = new j();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return j.f85863c;
    }

    public static final CustomEntry E(float f13, String str, String str2, boolean z13) {
        long time;
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        if (z13) {
            time = (long) Double.parseDouble(str);
        } else {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            Date parse = simpleDateFormat.parse(str);
            Intrinsics.f(parse);
            calendar.setTime(parse);
            time = calendar.getTime().getTime();
        }
        long j13 = time;
        return new CustomEntry(j13, f13, j13, str2, z13);
    }

    public static final boolean E0(KeyEvent keyEvent) {
        return keyEvent.isCtrlPressed();
    }

    public static int F(p pVar, v vVar, float f13, boolean z13, float f14, int i13) {
        if ((i13 & 8) != 0) {
            z13 = false;
        }
        int i14 = xe1.v.N;
        if (z13) {
            return -1;
        }
        if (pVar == k.NAVIGATION_BUBBLE_REP) {
            return ((yk1.a) vVar).f139224a.getDimensionPixelSize(eo1.c.shopping_navigation_bubble_rep_size);
        }
        yk1.a aVar = (yk1.a) vVar;
        return (int) ((f14 - (((aVar.a(i14) * ((int) f13)) * 2) + (aVar.a(i14) * 2))) / f13);
    }

    public static final boolean F0(Throwable th3) {
        Intrinsics.checkNotNullParameter(th3, "<this>");
        Class<?> cls = th3.getClass();
        while (!Intrinsics.d(cls.getCanonicalName(), "com.intellij.openapi.progress.ProcessCanceledException")) {
            cls = cls.getSuperclass();
            if (cls == null) {
                return false;
            }
        }
        return true;
    }

    public static final long G(KeyEvent keyEvent) {
        return l9.a(keyEvent.getKeyCode());
    }

    public static i0 G0(g0 component, a4 viewParameter, d4 view, String id3) {
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(viewParameter, "viewParameter");
        Intrinsics.checkNotNullParameter(component, "component");
        return new i0(view, viewParameter, new x3(null, null, null, null, null, id3, null, null, null, null, null, null, null, null, null, null, null), component, null, null);
    }

    public static final String H() {
        Context context = kb0.a.f79058b;
        File file = new File(m60.f0.j0().getFilesDir(), "pending");
        if (!file.exists()) {
            file.mkdir();
        }
        String absolutePath = file.getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
        return absolutePath;
    }

    public static f0.g H0() {
        if (h.f60737a != null) {
            return h.f60737a;
        }
        synchronized (h.class) {
            try {
                if (h.f60737a == null) {
                    h.f60737a = new f0.g(new Handler(Looper.getMainLooper()));
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return h.f60737a;
    }

    public static final int I(MediaFormat mediaFormat) {
        Intrinsics.checkNotNullParameter(mediaFormat, "<this>");
        if (mediaFormat.containsKey("sample-rate")) {
            return mediaFormat.getInteger("sample-rate");
        }
        return 0;
    }

    public static final ArrayList I0(List list, ww1.c metricType) {
        Intrinsics.checkNotNullParameter(metricType, "metricType");
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                u3 dailyMetrics = (u3) it.next();
                Intrinsics.checkNotNullParameter(metricType, "metricType");
                Intrinsics.checkNotNullParameter(dailyMetrics, "dailyMetrics");
                q3 q3Var = null;
                switch (f.f123233a[metricType.ordinal()]) {
                    case 1:
                        y3 g13 = dailyMetrics.g();
                        if (g13 != null) {
                            q3Var = g13.F();
                            break;
                        }
                        break;
                    case 2:
                        y3 g14 = dailyMetrics.g();
                        if (g14 != null) {
                            q3Var = g14.C();
                            break;
                        }
                        break;
                    case 3:
                        y3 g15 = dailyMetrics.g();
                        if (g15 != null) {
                            q3Var = g15.I();
                            break;
                        }
                        break;
                    case 4:
                        y3 g16 = dailyMetrics.g();
                        if (g16 != null) {
                            q3Var = g16.G();
                            break;
                        }
                        break;
                    case 5:
                        y3 g17 = dailyMetrics.g();
                        if (g17 != null) {
                            q3Var = g17.Q();
                            break;
                        }
                        break;
                    case 6:
                        y3 g18 = dailyMetrics.g();
                        if (g18 != null) {
                            q3Var = g18.D();
                            break;
                        }
                        break;
                    case 7:
                        y3 g19 = dailyMetrics.g();
                        if (g19 != null) {
                            q3Var = g19.J();
                            break;
                        }
                        break;
                    case 8:
                        y3 g23 = dailyMetrics.g();
                        if (g23 != null) {
                            q3Var = g23.H();
                            break;
                        }
                        break;
                    case 9:
                        y3 g24 = dailyMetrics.g();
                        if (g24 != null) {
                            q3Var = g24.R();
                            break;
                        }
                        break;
                    case 10:
                        y3 g25 = dailyMetrics.g();
                        if (g25 != null) {
                            q3Var = g25.S();
                            break;
                        }
                        break;
                    case 11:
                        y3 g26 = dailyMetrics.g();
                        if (g26 != null) {
                            q3Var = g26.E();
                            break;
                        }
                        break;
                    case 12:
                        y3 g27 = dailyMetrics.g();
                        if (g27 != null) {
                            q3Var = g27.O();
                            break;
                        }
                        break;
                    case 13:
                        y3 g28 = dailyMetrics.g();
                        if (g28 != null) {
                            q3Var = g28.T();
                            break;
                        }
                        break;
                    case 14:
                        y3 g29 = dailyMetrics.g();
                        if (g29 != null) {
                            q3Var = g29.W();
                            break;
                        }
                        break;
                    case 15:
                        y3 g33 = dailyMetrics.g();
                        if (g33 != null) {
                            q3Var = g33.P();
                            break;
                        }
                        break;
                    case 16:
                        y3 g34 = dailyMetrics.g();
                        if (g34 != null) {
                            q3Var = g34.V();
                            break;
                        }
                        break;
                    case 17:
                        y3 g35 = dailyMetrics.g();
                        if (g35 != null) {
                            q3Var = g35.X();
                            break;
                        }
                        break;
                    case 18:
                        y3 g36 = dailyMetrics.g();
                        if (g36 != null) {
                            q3Var = g36.U();
                            break;
                        }
                        break;
                    case 19:
                        y3 g37 = dailyMetrics.g();
                        if (g37 != null) {
                            q3Var = g37.L();
                            break;
                        }
                        break;
                    case 20:
                        y3 g38 = dailyMetrics.g();
                        if (g38 != null) {
                            q3Var = g38.K();
                            break;
                        }
                        break;
                    case 21:
                        y3 g39 = dailyMetrics.g();
                        if (g39 != null) {
                            q3Var = g39.N();
                            break;
                        }
                        break;
                    case 22:
                        y3 g43 = dailyMetrics.g();
                        if (g43 != null) {
                            q3Var = g43.M();
                            break;
                        }
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                if (q3Var != null) {
                    String f13 = dailyMetrics.f();
                    if (f13 == null) {
                        f13 = "";
                    }
                    ww1.a metricFormatType = metricType.getMetricFormatType();
                    Double f14 = q3Var.f();
                    Intrinsics.checkNotNullExpressionValue(f14, "getValue(...)");
                    float L0 = m0.L0(metricFormatType, f14.doubleValue());
                    String e13 = q3Var.e();
                    CustomEntry E = E(L0, f13, e13 != null ? e13 : "", false);
                    arrayList.add(E);
                    int size = list.size();
                    ArrayList arrayList2 = new ArrayList();
                    if (size == 1) {
                        String str = E.f50117e;
                        if (!Intrinsics.d(str, "ESTIMATE") || !Intrinsics.d(str, "READY")) {
                            arrayList2.add(new CustomEntry(r6.toMillis(1L) + E.f30176c, E.f117501a, E.f50116d + TimeUnit.DAYS.toMillis(1L), E.f50117e, false));
                        }
                    }
                    arrayList.addAll(arrayList2);
                }
            }
        }
        return arrayList;
    }

    public static final m J(i pinFeatureConfig, g0 g0Var, String trafficSource) {
        Intrinsics.checkNotNullParameter(pinFeatureConfig, "pinFeatureConfig");
        Intrinsics.checkNotNullParameter(trafficSource, "trafficSource");
        return m.a(m60.f0.i0(pinFeatureConfig), false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, g0Var, false, false, new wa2.g0(true, false, false, false, false, false, new bb2.e(0.0f, (bb2.f) null, 7), null, g0Var, false, false, false, false, 1, true, true, false, false, false, false, false, false, 33341094), null, null, false, null, trafficSource, false, false, null, null, false, -1, -2097169, 1021);
    }

    public static final ArrayList J0(List list, ww1.c metricType) {
        Intrinsics.checkNotNullParameter(metricType, "metricType");
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                c4 hourlyMetrics = (c4) it.next();
                Intrinsics.checkNotNullParameter(metricType, "metricType");
                Intrinsics.checkNotNullParameter(hourlyMetrics, "hourlyMetrics");
                q3 q3Var = null;
                switch (f.f123233a[metricType.ordinal()]) {
                    case 1:
                        y3 f13 = hourlyMetrics.f();
                        if (f13 != null) {
                            q3Var = f13.F();
                            break;
                        }
                        break;
                    case 2:
                        y3 f14 = hourlyMetrics.f();
                        if (f14 != null) {
                            q3Var = f14.C();
                            break;
                        }
                        break;
                    case 3:
                        y3 f15 = hourlyMetrics.f();
                        if (f15 != null) {
                            q3Var = f15.I();
                            break;
                        }
                        break;
                    case 4:
                        y3 f16 = hourlyMetrics.f();
                        if (f16 != null) {
                            q3Var = f16.G();
                            break;
                        }
                        break;
                    case 5:
                        y3 f17 = hourlyMetrics.f();
                        if (f17 != null) {
                            q3Var = f17.Q();
                            break;
                        }
                        break;
                    case 6:
                        y3 f18 = hourlyMetrics.f();
                        if (f18 != null) {
                            q3Var = f18.D();
                            break;
                        }
                        break;
                    case 7:
                        y3 f19 = hourlyMetrics.f();
                        if (f19 != null) {
                            q3Var = f19.J();
                            break;
                        }
                        break;
                    case 8:
                        y3 f23 = hourlyMetrics.f();
                        if (f23 != null) {
                            q3Var = f23.H();
                            break;
                        }
                        break;
                    case 9:
                        y3 f24 = hourlyMetrics.f();
                        if (f24 != null) {
                            q3Var = f24.R();
                            break;
                        }
                        break;
                    case 10:
                        y3 f25 = hourlyMetrics.f();
                        if (f25 != null) {
                            q3Var = f25.S();
                            break;
                        }
                        break;
                    case 11:
                        y3 f26 = hourlyMetrics.f();
                        if (f26 != null) {
                            q3Var = f26.E();
                            break;
                        }
                        break;
                    case 12:
                        y3 f27 = hourlyMetrics.f();
                        if (f27 != null) {
                            q3Var = f27.O();
                            break;
                        }
                        break;
                    case 13:
                        y3 f28 = hourlyMetrics.f();
                        if (f28 != null) {
                            q3Var = f28.T();
                            break;
                        }
                        break;
                    case 14:
                        y3 f29 = hourlyMetrics.f();
                        if (f29 != null) {
                            q3Var = f29.W();
                            break;
                        }
                        break;
                    case 15:
                        y3 f33 = hourlyMetrics.f();
                        if (f33 != null) {
                            q3Var = f33.P();
                            break;
                        }
                        break;
                    case 16:
                        y3 f34 = hourlyMetrics.f();
                        if (f34 != null) {
                            q3Var = f34.V();
                            break;
                        }
                        break;
                    case 17:
                        y3 f35 = hourlyMetrics.f();
                        if (f35 != null) {
                            q3Var = f35.X();
                            break;
                        }
                        break;
                    case 18:
                        y3 f36 = hourlyMetrics.f();
                        if (f36 != null) {
                            q3Var = f36.U();
                            break;
                        }
                        break;
                    case 19:
                        y3 f37 = hourlyMetrics.f();
                        if (f37 != null) {
                            q3Var = f37.L();
                            break;
                        }
                        break;
                    case 20:
                        y3 f38 = hourlyMetrics.f();
                        if (f38 != null) {
                            q3Var = f38.K();
                            break;
                        }
                        break;
                    case 21:
                        y3 f39 = hourlyMetrics.f();
                        if (f39 != null) {
                            q3Var = f39.N();
                            break;
                        }
                        break;
                    case 22:
                        y3 f41 = hourlyMetrics.f();
                        if (f41 != null) {
                            q3Var = f41.M();
                            break;
                        }
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                if (q3Var != null) {
                    String valueOf = String.valueOf(hourlyMetrics.g().doubleValue());
                    ww1.a metricFormatType = metricType.getMetricFormatType();
                    Double f43 = q3Var.f();
                    Intrinsics.checkNotNullExpressionValue(f43, "getValue(...)");
                    float L0 = m0.L0(metricFormatType, f43.doubleValue());
                    String e13 = q3Var.e();
                    if (e13 == null) {
                        e13 = "";
                    }
                    arrayList.add(E(L0, valueOf, e13, true));
                }
            }
        }
        return arrayList;
    }

    public static final int K(z zVar, Layout layout, n nVar, int i13, RectF rectF, d4.f fVar, i1.j jVar, boolean z13) {
        c4.m[] mVarArr;
        kotlin.ranges.a m13;
        int i14;
        c4.m[] mVarArr2;
        int i15;
        int i16;
        int c13;
        int i17;
        int b13;
        Bidi createLineBidi;
        boolean z14;
        float a13;
        float a14;
        int lineTop = layout.getLineTop(i13);
        int lineBottom = layout.getLineBottom(i13);
        int lineStart = layout.getLineStart(i13);
        int lineEnd = layout.getLineEnd(i13);
        if (lineStart == lineEnd) {
            return -1;
        }
        int i18 = (lineEnd - lineStart) * 2;
        float[] fArr = new float[i18];
        Layout layout2 = zVar.f25690f;
        int lineStart2 = layout2.getLineStart(i13);
        int f13 = zVar.f(i13);
        if (i18 < (f13 - lineStart2) * 2) {
            throw new IllegalArgumentException("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 2".toString());
        }
        c4.k kVar = new c4.k(zVar);
        boolean z15 = false;
        boolean z16 = layout2.getParagraphDirection(i13) == 1;
        int i19 = 0;
        while (lineStart2 < f13) {
            boolean isRtlCharAt = layout2.isRtlCharAt(lineStart2);
            if (z16 && !isRtlCharAt) {
                a13 = kVar.a(lineStart2, z15, z15, true);
                a14 = kVar.a(lineStart2 + 1, true, true, true);
                z14 = z16;
            } else if (z16 && isRtlCharAt) {
                z14 = z16;
                a14 = kVar.a(lineStart2, false, false, false);
                a13 = kVar.a(lineStart2 + 1, true, true, false);
            } else {
                z14 = z16;
                if (isRtlCharAt) {
                    float a15 = kVar.a(lineStart2, false, false, true);
                    a13 = kVar.a(lineStart2 + 1, true, true, true);
                    a14 = a15;
                } else {
                    a13 = kVar.a(lineStart2, false, false, false);
                    a14 = kVar.a(lineStart2 + 1, true, true, false);
                }
            }
            fArr[i19] = a13;
            fArr[i19 + 1] = a14;
            i19 += 2;
            lineStart2++;
            z16 = z14;
            z15 = false;
        }
        Layout layout3 = nVar.f25648a;
        int lineStart3 = layout3.getLineStart(i13);
        int lineEnd2 = layout3.getLineEnd(i13);
        int d2 = nVar.d(lineStart3, false);
        int e13 = nVar.e(d2);
        int i23 = lineStart3 - e13;
        int i24 = lineEnd2 - e13;
        Bidi a16 = nVar.a(d2);
        if (a16 == null || (createLineBidi = a16.createLineBidi(i23, i24)) == null) {
            mVarArr = new c4.m[]{new c4.m(lineStart3, lineEnd2, layout3.isRtlCharAt(lineStart3))};
        } else {
            int runCount = createLineBidi.getRunCount();
            mVarArr = new c4.m[runCount];
            int i25 = 0;
            while (i25 < runCount) {
                int i26 = runCount;
                mVarArr[i25] = new c4.m(createLineBidi.getRunStart(i25) + lineStart3, createLineBidi.getRunLimit(i25) + lineStart3, createLineBidi.getRunLevel(i25) % 2 == 1);
                i25++;
                runCount = i26;
            }
        }
        if (z13) {
            m13 = c0.E(mVarArr);
        } else {
            Intrinsics.checkNotNullParameter(mVarArr, "<this>");
            m13 = s.m(mVarArr.length - 1, 0);
        }
        int i27 = m13.f80453a;
        int i28 = m13.f80454b;
        int i29 = m13.f80455c;
        if ((i29 <= 0 || i27 > i28) && (i29 >= 0 || i28 > i27)) {
            return -1;
        }
        while (true) {
            c4.m mVar = mVarArr[i27];
            boolean z17 = mVar.f25647c;
            int i33 = mVar.f25645a;
            int i34 = mVar.f25646b;
            float f14 = z17 ? fArr[((i34 - 1) - lineStart) * 2] : fArr[(i33 - lineStart) * 2];
            float A = z17 ? A(i33, lineStart, fArr) : A(i34 - 1, lineStart, fArr);
            boolean z18 = mVar.f25647c;
            if (z13) {
                float f15 = rectF.left;
                if (A >= f15) {
                    mVarArr2 = mVarArr;
                    float f16 = rectF.right;
                    if (f14 <= f16) {
                        if ((z18 || f15 > f14) && (!z18 || f16 < A)) {
                            int i35 = i33;
                            i17 = i34;
                            while (true) {
                                i14 = i29;
                                if (i17 - i35 <= 1) {
                                    break;
                                }
                                int i36 = (i17 + i35) / 2;
                                float f17 = fArr[(i36 - lineStart) * 2];
                                if ((z18 || f17 <= rectF.left) && (!z18 || f17 >= rectF.right)) {
                                    i35 = i36;
                                } else {
                                    i17 = i36;
                                }
                                i29 = i14;
                            }
                            if (!z18) {
                                i17 = i35;
                            }
                        } else {
                            i14 = i29;
                            i17 = i33;
                        }
                        int c14 = fVar.c(i17);
                        if (c14 != -1 && (b13 = fVar.b(c14)) < i34) {
                            if (b13 >= i33) {
                                i33 = b13;
                            }
                            if (c14 > i34) {
                                c14 = i34;
                            }
                            RectF rectF2 = new RectF(0.0f, lineTop, 0.0f, lineBottom);
                            int i37 = c14;
                            while (true) {
                                rectF2.left = z18 ? fArr[((i37 - 1) - lineStart) * 2] : fArr[(i33 - lineStart) * 2];
                                rectF2.right = z18 ? A(i33, lineStart, fArr) : A(i37 - 1, lineStart, fArr);
                                if (!((Boolean) jVar.invoke(rectF2, rectF)).booleanValue()) {
                                    i33 = fVar.a(i33);
                                    if (i33 == -1 || i33 >= i34) {
                                        break;
                                    }
                                    i37 = fVar.c(i33);
                                    if (i37 > i34) {
                                        i37 = i34;
                                    }
                                } else {
                                    break;
                                }
                            }
                        }
                    } else {
                        i14 = i29;
                    }
                } else {
                    i14 = i29;
                    mVarArr2 = mVarArr;
                }
                i33 = -1;
            } else {
                i14 = i29;
                mVarArr2 = mVarArr;
                float f18 = rectF.left;
                if (A >= f18) {
                    float f19 = rectF.right;
                    if (f14 <= f19) {
                        if ((z18 || f19 < A) && (!z18 || f18 > f14)) {
                            int i38 = i33;
                            int i39 = i34;
                            while (i39 - i38 > 1) {
                                int i43 = (i39 + i38) / 2;
                                float f23 = fArr[(i43 - lineStart) * 2];
                                int i44 = i39;
                                if ((z18 || f23 <= rectF.right) && (!z18 || f23 >= rectF.left)) {
                                    i38 = i43;
                                    i39 = i44;
                                } else {
                                    i39 = i43;
                                }
                            }
                            i16 = z18 ? i39 : i38;
                        } else {
                            i16 = i34 - 1;
                        }
                        int b14 = fVar.b(i16 + 1);
                        if (b14 != -1 && (c13 = fVar.c(b14)) > i33) {
                            if (b14 < i33) {
                                b14 = i33;
                            }
                            if (c13 <= i34) {
                                i34 = c13;
                            }
                            RectF rectF3 = new RectF(0.0f, lineTop, 0.0f, lineBottom);
                            int i45 = b14;
                            while (true) {
                                rectF3.left = z18 ? fArr[((i34 - 1) - lineStart) * 2] : fArr[(i45 - lineStart) * 2];
                                rectF3.right = z18 ? A(i45, lineStart, fArr) : A(i34 - 1, lineStart, fArr);
                                if (!((Boolean) jVar.invoke(rectF3, rectF)).booleanValue()) {
                                    i34 = fVar.e(i34);
                                    if (i34 == -1 || i34 <= i33) {
                                        break;
                                    }
                                    i45 = fVar.b(i34);
                                    if (i45 < i33) {
                                        i45 = i33;
                                    }
                                } else {
                                    i15 = i34;
                                    break;
                                }
                            }
                        }
                    }
                }
                i15 = -1;
                i33 = i15;
            }
            if (i33 >= 0) {
                return i33;
            }
            if (i27 == i28) {
                return -1;
            }
            i27 += i14;
            mVarArr = mVarArr2;
            i29 = i14;
        }
    }

    public static void K0(int[] iArr, int[] iArr2, int[] iArr3) {
        r.d1(iArr, iArr2, iArr3);
        long j13 = iArr2[6] & 4294967295L;
        long j14 = iArr2[7] & 4294967295L;
        long j15 = iArr2[8] & 4294967295L;
        long j16 = iArr2[9] & 4294967295L;
        long j17 = iArr2[10] & 4294967295L;
        long j18 = iArr2[11] & 4294967295L;
        long j19 = iArr[6] & 4294967295L;
        long j23 = j19 * j13;
        iArr3[12] = (int) j23;
        long j24 = (j19 * j14) + (j23 >>> 32);
        iArr3[13] = (int) j24;
        long j25 = (j19 * j15) + (j24 >>> 32);
        iArr3[14] = (int) j25;
        long j26 = (j19 * j16) + (j25 >>> 32);
        iArr3[15] = (int) j26;
        long j27 = (j19 * j17) + (j26 >>> 32);
        iArr3[16] = (int) j27;
        long j28 = (j19 * j18) + (j27 >>> 32);
        iArr3[17] = (int) j28;
        iArr3[18] = (int) (j28 >>> 32);
        int i13 = 12;
        int i14 = 1;
        for (int i15 = 6; i14 < i15; i15 = 6) {
            int i16 = i13 + 1;
            long j29 = j15;
            long j33 = iArr[i15 + i14] & 4294967295L;
            long j34 = j16;
            long j35 = (j33 * j13) + (iArr3[i16] & 4294967295L);
            iArr3[i16] = (int) j35;
            long j36 = (j33 * j14) + (iArr3[r14] & 4294967295L) + (j35 >>> 32);
            iArr3[i13 + 2] = (int) j36;
            long j37 = (j33 * j29) + (iArr3[r28] & 4294967295L) + (j36 >>> 32);
            iArr3[i13 + 3] = (int) j37;
            long j38 = (j33 * j34) + (iArr3[r1] & 4294967295L) + (j37 >>> 32);
            iArr3[i13 + 4] = (int) j38;
            long j39 = (j33 * j17) + (iArr3[r1] & 4294967295L) + (j38 >>> 32);
            iArr3[i13 + 5] = (int) j39;
            long j43 = (j33 * j18) + (iArr3[r1] & 4294967295L) + (j39 >>> 32);
            iArr3[i13 + 6] = (int) j43;
            iArr3[i13 + 7] = (int) (j43 >>> 32);
            i14++;
            i13 = i16;
            j15 = j29;
            j16 = j34;
            j13 = j13;
        }
        int o13 = r.o(iArr3, iArr3);
        int n13 = r.n(18, 12, r.n(0, 6, 0, iArr3, iArr3) + o13, iArr3, iArr3) + o13;
        int[] iArr4 = new int[6];
        int[] iArr5 = new int[6];
        boolean z13 = r.D(iArr, iArr, iArr4) != r.D(iArr2, iArr2, iArr5);
        int[] iArr6 = new int[12];
        r.d1(iArr4, iArr5, iArr6);
        j1.L(24, n13 + (z13 ? j1.J(12, 6, iArr6, iArr3) : j1.A1(12, 6, iArr6, iArr3)), 18, iArr3);
    }

    public static final m4.h L(b4.m0 m0Var, int i13) {
        if (m0Var.f21615a.f21603a.length() != 0) {
            int f13 = m0Var.f(i13);
            if ((i13 != 0 && f13 == m0Var.f(i13 - 1)) || (i13 != m0Var.f21615a.f21603a.f21571a.length() && f13 == m0Var.f(i13 + 1))) {
                return m0Var.a(i13);
            }
        }
        return m0Var.j(i13);
    }

    public static pr1.a L0(String str, String str2, boolean z13) {
        return new pr1.a(str, str2, z13);
    }

    public static final Integer M(dj djVar) {
        Integer layoutColumns = djVar != null ? djVar.getLayoutColumns() : null;
        Integer layoutRows = djVar != null ? djVar.getLayoutRows() : null;
        if (layoutColumns == null || layoutRows == null) {
            return null;
        }
        return Integer.valueOf(layoutRows.intValue() * layoutColumns.intValue());
    }

    public static final void M0(GestaltTextField gestaltTextField, l event) {
        Intrinsics.checkNotNullParameter(gestaltTextField, "<this>");
        Intrinsics.checkNotNullParameter(event, "event");
        gestaltTextField.Z(new la1.k(24, event, gestaltTextField));
    }

    public static final int N(KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        if (action != 0) {
            return action != 1 ? 0 : 1;
        }
        return 2;
    }

    public static void N0(vd2.d dVar) {
        Iterator it = dVar.a().values().iterator();
        while (it.hasNext()) {
            ((vd2.c) it.next()).a();
        }
    }

    public static final float O(Float f13, p pVar) {
        if (pVar == k.WIDE_BUBBLE_REP) {
            if (f13 != null) {
                return f13.floatValue();
            }
            return 0.5f;
        }
        if (pVar != ue1.t.PIN_REP) {
            if (pVar == ue1.t.IDEA_PIN_REP) {
                if (f13 != null) {
                    return f13.floatValue();
                }
                return 1.77f;
            }
            if (pVar == ue1.t.SHOPPING_PIN_REP) {
                if (f13 != null) {
                    return f13.floatValue();
                }
            } else if (pVar == k.MULTI_TOPIC_SQUARE_TILE_COMPACT || pVar == k.MULTI_TOPIC_SQUARE_TILE_DEFAULT) {
                if (f13 != null) {
                    return f13.floatValue();
                }
            } else {
                if (pVar == k.MULTI_TOPIC_RECTANGLE_TILE_COMPACT || pVar == k.MULTI_TOPIC_RECTANGLE_TILE_DEFAULT) {
                    if (f13 != null) {
                        return f13.floatValue();
                    }
                    return 0.75f;
                }
                if (pVar == k.CUTOUT_COLLAGE_PILL) {
                    if (f13 != null) {
                        return f13.floatValue();
                    }
                } else if (f13 != null) {
                    return f13.floatValue();
                }
            }
            return 1.0f;
        }
        if (f13 != null) {
            return f13.floatValue();
        }
        return 1.5f;
    }

    public static final float O0(long j13, float f13, n4.b bVar) {
        float c13;
        long b13 = n4.m.b(j13);
        if (n4.n.a(b13, 4294967296L)) {
            if (bVar.j0() <= 1.05d) {
                return bVar.T(j13);
            }
            c13 = n4.m.c(j13) / n4.m.c(bVar.A(f13));
        } else {
            if (!n4.n.a(b13, 8589934592L)) {
                return Float.NaN;
            }
            c13 = n4.m.c(j13);
        }
        return c13 * f13;
    }

    public static void P(fc1.e eVar, cr1.a aVar) {
        eVar.E0 = aVar;
    }

    public static final void P0(Spannable spannable, long j13, int i13, int i14) {
        if (j13 != 16) {
            spannable.setSpan(new ForegroundColorSpan(androidx.compose.ui.graphics.a.u(j13)), i13, i14, 33);
        }
    }

    public static void Q(k91.e eVar, lu1.b bVar) {
        eVar.f78824l0 = bVar;
    }

    public static final void Q0(Spannable spannable, long j13, n4.b bVar, int i13, int i14) {
        long b13 = n4.m.b(j13);
        if (n4.n.a(b13, 4294967296L)) {
            spannable.setSpan(new AbsoluteSizeSpan(ml2.c.c(bVar.T(j13)), false), i13, i14, 33);
        } else if (n4.n.a(b13, 8589934592L)) {
            spannable.setSpan(new RelativeSizeSpan(n4.m.c(j13)), i13, i14, 33);
        }
    }

    public static void R(r02.r rVar, r8 r8Var) {
        rVar.f105791c0 = r8Var;
    }

    public static void R0(s62.e eVar, jq1.b bVar, mm1.g gVar, int i13) {
        s62.c onStartTrackingTouch = s62.c.f111249j;
        Function2 onStopTrackingTouch = bVar;
        if ((i13 & 2) != 0) {
            onStopTrackingTouch = s62.c.f111250k;
        }
        kl2.l onValueChange = gVar;
        if ((i13 & 4) != 0) {
            onValueChange = s62.d.f111252i;
        }
        o oVar = (o) eVar;
        oVar.getClass();
        Intrinsics.checkNotNullParameter(onStartTrackingTouch, "onStartTrackingTouch");
        Intrinsics.checkNotNullParameter(onStopTrackingTouch, "onStopTrackingTouch");
        Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
        oVar.f125140c = onStartTrackingTouch;
        oVar.f125141d = onStopTrackingTouch;
        oVar.f125142e = onValueChange;
    }

    public static void S(fc1.e eVar, oc.c cVar) {
        eVar.F0 = cVar;
    }

    public static void S0(Configuration configuration, j5.h hVar) {
        configuration.setLocales(((j5.j) hVar.f74680a).f74681a);
    }

    public static void T(fc1.e eVar, vb0.c cVar) {
        eVar.C0 = cVar;
    }

    public static final void T0(Spannable spannable, Object obj, int i13, int i14) {
        spannable.setSpan(obj, i13, i14, 33);
    }

    public static void U(com.pinterest.feature.todaytab.articlefeed.j jVar, nr0.m mVar) {
        jVar.V0 = mVar;
    }

    public static final void U0(yk1.k kVar, yb0.n alertView) {
        Intrinsics.checkNotNullParameter(kVar, "<this>");
        Intrinsics.checkNotNullParameter(alertView, "alertView");
        try {
            ((AlertContainer) kVar.requireActivity().findViewById(tr.b.alert_container)).c(alertView);
        } catch (Exception unused) {
        }
    }

    public static void V(c31.r rVar, zf0.f fVar) {
        rVar.L0 = fVar;
    }

    public static q V0(int i13, q8.t tVar, d0 d0Var) {
        q c13 = q.c(tVar, d0Var);
        while (c13.f82080b != i13) {
            u.g("WavHeaderReader", "Ignoring unknown WAV chunk: " + c13.f82080b);
            long j13 = c13.f82081c;
            long j14 = 8 + j13;
            if (j13 % 2 != 0) {
                j14 = 9 + j13;
            }
            if (j14 > 2147483647L) {
                throw ParserException.c("Chunk is too large (~2GB+) to skip; id: " + c13.f82080b);
            }
            tVar.p((int) j14);
            c13 = q.c(tVar, d0Var);
        }
        return c13;
    }

    public static void W(com.pinterest.feature.todaytab.articlefeed.j jVar, zf0.f fVar) {
        jVar.W0 = fVar;
    }

    public static void W0(int[] iArr, int[] iArr2) {
        r.o1(iArr, iArr2);
        long j13 = 4294967295L;
        long j14 = iArr[6] & 4294967295L;
        int i13 = 5;
        int i14 = 12;
        int i15 = 0;
        while (true) {
            int i16 = i13 - 1;
            long j15 = iArr[i13 + 6] & j13;
            long j16 = j15 * j15;
            iArr2[i14 + 11] = ((int) (j16 >>> 33)) | (i15 << 31);
            int i17 = i14 - 2;
            iArr2[i14 + 10] = (int) (j16 >>> 1);
            i15 = (int) j16;
            if (i16 <= 0) {
                long j17 = j14 * j14;
                iArr2[12] = (int) j17;
                long j18 = iArr[7] & 4294967295L;
                long j19 = (j18 * j14) + (((i15 << 31) & 4294967295L) | (j17 >>> 33));
                int i18 = (int) j19;
                iArr2[13] = (((int) (j17 >>> 32)) & 1) | (i18 << 1);
                long j23 = iArr[8] & 4294967295L;
                long j24 = (j23 * j14) + (iArr2[14] & 4294967295L) + (j19 >>> 32);
                int i19 = (int) j24;
                iArr2[14] = (i18 >>> 31) | (i19 << 1);
                long f13 = d7.g.f(j23, j18, j24 >>> 32, iArr2[15] & 4294967295L);
                long j25 = (iArr2[16] & 4294967295L) + (f13 >>> 32);
                long j26 = iArr[9] & 4294967295L;
                long j27 = (iArr2[17] & 4294967295L) + (j25 >>> 32);
                long j28 = (iArr2[18] & 4294967295L) + (j27 >>> 32);
                long j29 = (j26 * j14) + (f13 & 4294967295L);
                int i23 = (int) j29;
                iArr2[15] = (i23 << 1) | (i19 >>> 31);
                long f14 = d7.g.f(j26, j18, j29 >>> 32, j25 & 4294967295L);
                long f15 = d7.g.f(j26, j23, f14 >>> 32, j27 & 4294967295L);
                long j33 = j28 + (f15 >>> 32);
                long j34 = f15 & 4294967295L;
                long j35 = iArr[10] & 4294967295L;
                long j36 = (iArr2[19] & 4294967295L) + (j33 >>> 32);
                long j37 = j33 & 4294967295L;
                long j38 = (iArr2[20] & 4294967295L) + (j36 >>> 32);
                long j39 = j36 & 4294967295L;
                long j43 = (j35 * j14) + (f14 & 4294967295L);
                int i24 = (int) j43;
                iArr2[16] = (i23 >>> 31) | (i24 << 1);
                int i25 = i24 >>> 31;
                long f16 = d7.g.f(j35, j18, j43 >>> 32, j34);
                long f17 = d7.g.f(j35, j23, f16 >>> 32, j37);
                long f18 = d7.g.f(j35, j26, f17 >>> 32, j39);
                long j44 = j38 + (f18 >>> 32);
                long j45 = iArr[11] & 4294967295L;
                long j46 = (iArr2[21] & 4294967295L) + (j44 >>> 32);
                long j47 = j44 & 4294967295L;
                long j48 = (j14 * j45) + (f16 & 4294967295L);
                int i26 = (int) j48;
                iArr2[17] = i25 | (i26 << 1);
                int i27 = i26 >>> 31;
                long f19 = d7.g.f(j45, j18, j48 >>> 32, f17 & 4294967295L);
                long f23 = d7.g.f(j45, j23, f19 >>> 32, f18 & 4294967295L);
                long f24 = d7.g.f(j45, j26, f23 >>> 32, j47);
                long f25 = d7.g.f(j45, j35, f24 >>> 32, j46 & 4294967295L);
                long j49 = (iArr2[22] & 4294967295L) + (j46 >>> 32) + (f25 >>> 32);
                int i28 = (int) f19;
                iArr2[18] = i27 | (i28 << 1);
                int i29 = (int) f23;
                iArr2[19] = (i28 >>> 31) | (i29 << 1);
                int i33 = (int) f24;
                iArr2[20] = (i29 >>> 31) | (i33 << 1);
                int i34 = i33 >>> 31;
                int i35 = (int) f25;
                iArr2[21] = i34 | (i35 << 1);
                int i36 = i35 >>> 31;
                int i37 = (int) j49;
                iArr2[22] = i36 | (i37 << 1);
                iArr2[23] = (i37 >>> 31) | ((iArr2[23] + ((int) (j49 >>> 32))) << 1);
                int o13 = r.o(iArr2, iArr2);
                int n13 = o13 + r.n(18, 12, r.n(0, 6, 0, iArr2, iArr2) + o13, iArr2, iArr2);
                int[] iArr3 = new int[6];
                r.D(iArr, iArr, iArr3);
                int[] iArr4 = new int[12];
                r.o1(iArr3, iArr4);
                j1.L(24, j1.A1(12, 6, iArr4, iArr2) + n13, 18, iArr2);
                return;
            }
            i14 = i17;
            i13 = i16;
            j13 = 4294967295L;
        }
    }

    public static void X(k91.e eVar, mo1.d dVar) {
        eVar.f78823k0 = dVar;
    }

    public static final void X0(f30 pin, int i13, SbaPinRep pinRep, o2 viewModel, ni1.c0 vmStateConverter) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(pinRep, "pinRep");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(vmStateConverter, "vmStateConverter");
        pinRep.bindDisplayState(viewModel.b(vmStateConverter.a(i13, pin), false));
    }

    public static void Y(com.pinterest.feature.todaytab.articlefeed.j jVar, yk1.j jVar2) {
        jVar.R0 = jVar2;
    }

    public static final void Y0(n3.j jVar, long j13, y yVar) {
        c1(jVar, j13, yVar, true);
    }

    public static void Z(c31.r rVar, n5 n5Var) {
        rVar.M0 = n5Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:268:0x03ca, code lost:
    
        if (r8 == null) goto L948;
     */
    /* JADX WARN: Code restructure failed: missing block: B:293:0x0481, code lost:
    
        if (r7 != 3) goto L991;
     */
    /* JADX WARN: Code restructure failed: missing block: B:294:0x0485, code lost:
    
        if (r3 >= r13) goto L991;
     */
    /* JADX WARN: Code restructure failed: missing block: B:295:0x048e, code lost:
    
        r2 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:376:0x048b, code lost:
    
        if (r6 < 3) goto L990;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x0589  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x0594  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x059b  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x05c6  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x0597  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x058c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e6 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:421:0x0613  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0bac  */
    /* JADX WARN: Removed duplicated region for block: B:458:0x06ff  */
    /* JADX WARN: Removed duplicated region for block: B:481:0x075c  */
    /* JADX WARN: Removed duplicated region for block: B:493:0x078e  */
    /* JADX WARN: Removed duplicated region for block: B:505:0x07c0  */
    /* JADX WARN: Removed duplicated region for block: B:511:0x07d3  */
    /* JADX WARN: Removed duplicated region for block: B:517:0x07e7  */
    /* JADX WARN: Removed duplicated region for block: B:524:0x07fc  */
    /* JADX WARN: Removed duplicated region for block: B:531:0x0810  */
    /* JADX WARN: Removed duplicated region for block: B:533:0x0817  */
    /* JADX WARN: Removed duplicated region for block: B:540:0x0833  */
    /* JADX WARN: Removed duplicated region for block: B:544:0x0845  */
    /* JADX WARN: Removed duplicated region for block: B:547:0x084f  */
    /* JADX WARN: Removed duplicated region for block: B:553:0x0862  */
    /* JADX WARN: Removed duplicated region for block: B:559:0x0875  */
    /* JADX WARN: Removed duplicated region for block: B:565:0x0889  */
    /* JADX WARN: Removed duplicated region for block: B:572:0x08fc  */
    /* JADX WARN: Removed duplicated region for block: B:574:0x08ff  */
    /* JADX WARN: Removed duplicated region for block: B:583:0x089b  */
    /* JADX WARN: Removed duplicated region for block: B:587:0x084a  */
    /* JADX WARN: Removed duplicated region for block: B:588:0x0838  */
    /* JADX WARN: Removed duplicated region for block: B:590:0x0813  */
    /* JADX WARN: Removed duplicated region for block: B:603:0x0939  */
    /* JADX WARN: Removed duplicated region for block: B:647:0x0a42  */
    /* JADX WARN: Removed duplicated region for block: B:650:0x0a4f  */
    /* JADX WARN: Removed duplicated region for block: B:653:0x0a5c  */
    /* JADX WARN: Removed duplicated region for block: B:656:0x0a69  */
    /* JADX WARN: Removed duplicated region for block: B:672:0x0a6e  */
    /* JADX WARN: Removed duplicated region for block: B:673:0x0a63  */
    /* JADX WARN: Removed duplicated region for block: B:674:0x0a54  */
    /* JADX WARN: Removed duplicated region for block: B:675:0x0a49  */
    /* JADX WARN: Removed duplicated region for block: B:685:0x0ab8  */
    /* JADX WARN: Removed duplicated region for block: B:729:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:732:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:733:0x007e  */
    /* JADX WARN: Type inference failed for: r1v28, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static ue1.l Z0(com.pinterest.api.model.vh r72, yk1.v r73, xo0.o r74, int r75, h32.g0 r76, float r77, xe1.t r78, boolean r79, boolean r80, boolean r81, boolean r82, hf0.b r83, java.lang.String r84, int r85) {
        /*
            Method dump skipped, instructions count: 3426
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: l3.c.Z0(com.pinterest.api.model.vh, yk1.v, xo0.o, int, h32.g0, float, xe1.t, boolean, boolean, boolean, boolean, hf0.b, java.lang.String, int):ue1.l");
    }

    public static void a0(c31.r rVar, c3 c3Var) {
        rVar.N0 = c3Var;
    }

    public static final re1.d a1(vh vhVar, re1.e eVar, Function1 navigateToProfile, Function0 function0) {
        Boolean bool;
        Intrinsics.checkNotNullParameter(vhVar, "<this>");
        Intrinsics.checkNotNullParameter(navigateToProfile, "navigateToProfile");
        wy0 wy0Var = vhVar.f42860r;
        if (wy0Var == null) {
            ih ihVar = vhVar.f42857o;
            wy0Var = ihVar != null ? ihVar.h() : null;
            if (wy0Var == null) {
                return null;
            }
        }
        wy0 user = wy0Var;
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(navigateToProfile, "navigateToProfile");
        a0 a0Var = new a0(function0, new ld1.f(2, user), new t90.n(27, navigateToProfile));
        yl1.b R = eVar != null ? c0.d.R(eVar.f107573a) : null;
        boolean y13 = cb.y(user, "getIsVerifiedMerchant(...)");
        wy0 wy0Var2 = vhVar.f42860r;
        if (wy0Var2 == null || (bool = wy0Var2.G3()) == null) {
            bool = Boolean.FALSE;
        }
        return new re1.d(user, a0Var, R, y13, bool.booleanValue());
    }

    public static void b0(com.pinterest.feature.todaytab.articlefeed.j jVar, i2 i2Var) {
        jVar.S0 = i2Var;
    }

    public static final void b1(n3.j jVar, long j13, x0 x0Var) {
        c1(jVar, j13, x0Var, false);
    }

    public static final void c(on1.k state, u2.q qVar, Function1 function1, i2.o oVar, int i13, int i14) {
        Function1 function12;
        Intrinsics.checkNotNullParameter(state, "state");
        i2.s sVar = (i2.s) oVar;
        sVar.Y(-1536809456);
        if ((i14 & 2) != 0) {
            qVar = u2.n.f120041b;
        }
        if ((i14 & 4) != 0) {
            function1 = null;
        }
        sVar.W(-911846261);
        if (function1 == null) {
            function12 = null;
        } else {
            sVar.W(1259136194);
            boolean z13 = (((i13 & 896) ^ 384) > 256 && sVar.h(function1)) || (i13 & 384) == 256;
            Object J2 = sVar.J();
            if (z13 || J2 == i2.n.f71185a) {
                J2 = new al1.j(7, function1);
                sVar.g0(J2);
            }
            function12 = (Function1) J2;
            sVar.r(false);
        }
        sVar.r(false);
        e(state, qVar, function12 != null ? new hm1.e(4, function12) : null, sVar, (i13 & RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER) | 520, 0);
        f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new k31.h(i13, i14, 18, qVar, state, function1);
        }
    }

    public static void c0(com.pinterest.feature.todaytab.articlefeed.j jVar, nx.f0 f0Var) {
        jVar.T0 = f0Var;
    }

    public static final void c1(n3.j jVar, long j13, Function1 function1, boolean z13) {
        n3.e eVar = jVar.f89071b;
        MotionEvent c13 = eVar != null ? eVar.c() : null;
        if (c13 == null) {
            throw new IllegalArgumentException("The PointerEvent receiver cannot have a null MotionEvent.".toString());
        }
        int action = c13.getAction();
        if (z13) {
            c13.setAction(3);
        }
        c13.offsetLocation(-a3.c.d(j13), -a3.c.e(j13));
        function1.invoke(c13);
        c13.offsetLocation(a3.c.d(j13), a3.c.e(j13));
        c13.setAction(action);
    }

    public static void d0(ua1.d dVar, r3 r3Var) {
        dVar.A0 = r3Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.util.ArrayList d1(java.util.ArrayList r36, xe1.r r37, ue1.t r38, int r39, java.util.HashMap r40, com.pinterest.api.model.li r41, kotlin.jvm.functions.Function2 r42, java.util.HashMap r43, ic0.a r44, java.lang.Float r45, boolean r46, boolean r47, java.lang.String r48, java.lang.String r49, z32.f2 r50, boolean r51, z32.z1 r52, java.lang.Boolean r53, java.lang.String r54) {
        /*
            Method dump skipped, instructions count: 723
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: l3.c.d1(java.util.ArrayList, xe1.r, ue1.t, int, java.util.HashMap, com.pinterest.api.model.li, kotlin.jvm.functions.Function2, java.util.HashMap, ic0.a, java.lang.Float, boolean, boolean, java.lang.String, java.lang.String, z32.f2, boolean, z32.z1, java.lang.Boolean, java.lang.String):java.util.ArrayList");
    }

    public static final void e(on1.k state, u2.q qVar, gm1.a aVar, i2.o oVar, int i13, int i14) {
        Intrinsics.checkNotNullParameter(state, "state");
        i2.s sVar = (i2.s) oVar;
        sVar.Y(1136556583);
        if ((i14 & 2) != 0) {
            qVar = u2.n.f120041b;
        }
        if ((i14 & 4) != 0) {
            aVar = null;
        }
        androidx.compose.ui.viewinterop.a.a(new rq.a0(((Number) sVar.m(fc0.k.f61712a)).intValue(), state, aVar, 22), qVar, new com.pinterest.framework.screens.q(23, state, aVar), sVar, i13 & RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER, 0);
        f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new k31.h(i13, i14, 19, qVar, state, aVar);
        }
    }

    public static void e0(fc1.e eVar, uk1.e eVar2) {
        eVar.A0 = eVar2;
    }

    public static final ze0.a e1(a3 a3Var) {
        int i13 = a3Var == null ? -1 : xe1.c0.f134685b[a3Var.ordinal()];
        return i13 != 1 ? i13 != 2 ? i13 != 3 ? i13 != 4 ? i13 != 5 ? ze0.a.Default : ze0.a.NoPreview : ze0.a.List : ze0.a.Wide : ze0.a.Default : ze0.a.Compact;
    }

    /* JADX WARN: Code restructure failed: missing block: B:130:0x0394, code lost:
    
        if (r8.h(r9) == false) goto L561;
     */
    /* JADX WARN: Removed duplicated region for block: B:129:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x03b2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x046c  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x04cc  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0282  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void f(u2.q r38, q1.h0 r39, p1.x0 r40, boolean r41, boolean r42, m1.c1 r43, boolean r44, int r45, u2.c r46, p1.j r47, u2.d r48, p1.h r49, kotlin.jvm.functions.Function1 r50, i2.o r51, int r52, int r53, int r54) {
        /*
            Method dump skipped, instructions count: 1269
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: l3.c.f(u2.q, q1.h0, p1.x0, boolean, boolean, m1.c1, boolean, int, u2.c, p1.j, u2.d, p1.h, kotlin.jvm.functions.Function1, i2.o, int, int, int):void");
    }

    public static void f0(k91.e eVar, r8 r8Var) {
        eVar.f78825m0 = r8Var;
    }

    public static final gi.t1 f1(h0 h0Var) {
        try {
            u1 e13 = h0Var.e();
            if (e13 == null) {
                throw new zzhj("Parser being asked to parse an empty input stream");
            }
            try {
                byte b13 = e13.f65120a;
                byte b14 = e13.f65121b;
                int i13 = 0;
                if (b13 == Byte.MIN_VALUE) {
                    long a13 = h0Var.a();
                    if (a13 > 1000) {
                        throw new zzhj("Parser being asked to read a large CBOR array");
                    }
                    g1(b14, a13);
                    gi.t1[] t1VarArr = new gi.t1[(int) a13];
                    while (i13 < a13) {
                        t1VarArr[i13] = f1(h0Var);
                        i13++;
                    }
                    return new n1(gi.z.n(t1VarArr));
                }
                if (b13 != -96) {
                    if (b13 == -64) {
                        throw new zzhj("Tags are currently unsupported");
                    }
                    if (b13 == -32) {
                        return new o1(h0Var.f());
                    }
                    if (b13 == 0 || b13 == 32) {
                        long c13 = h0Var.c();
                        g1(b14, c13 > 0 ? c13 : ~c13);
                        return new gi.q1(c13);
                    }
                    if (b13 == 64) {
                        h0Var.k((byte) 64);
                        byte[] o13 = h0Var.o();
                        int length = o13.length;
                        g1(b14, length);
                        return new p1(gi.j1.l(o13, length));
                    }
                    if (b13 == 96) {
                        h0Var.k((byte) 96);
                        String str = new String(h0Var.o(), StandardCharsets.UTF_8);
                        g1(b14, str.length());
                        return new s1(str);
                    }
                    throw new zzhj("Unidentifiable major type: " + ((b13 >> 5) & 7));
                }
                long d2 = h0Var.d();
                if (d2 > 1000) {
                    throw new zzhj("Parser being asked to read a large CBOR map");
                }
                g1(b14, d2);
                int i14 = (int) d2;
                q4[] q4VarArr = new q4[i14];
                gi.t1 t1Var = null;
                int i15 = 0;
                while (i15 < d2) {
                    gi.t1 f13 = f1(h0Var);
                    if (t1Var != null && f13.compareTo(t1Var) <= 0) {
                        throw new zzhf("Keys in CBOR Map not in strictly ascending natural order:\nPrevious key: " + t1Var.toString() + "\nCurrent key: " + f13.toString());
                    }
                    q4VarArr[i15] = new q4(29, f13, f1(h0Var));
                    i15++;
                    t1Var = f13;
                }
                TreeMap treeMap = new TreeMap();
                while (i13 < i14) {
                    q4 q4Var = q4VarArr[i13];
                    if (treeMap.containsKey((gi.t1) q4Var.f31594b)) {
                        throw new zzhf("Attempted to add duplicate key to canonical CBOR Map.");
                    }
                    treeMap.put((gi.t1) q4Var.f31594b, (gi.t1) q4Var.f31595c);
                    i13++;
                }
                return new r1(e0.c(treeMap));
            } catch (IOException e14) {
                e = e14;
                throw new zzhj(e);
            } catch (RuntimeException e15) {
                e = e15;
                throw new zzhj(e);
            }
        } catch (IOException e16) {
            throw new zzhj(e16);
        }
    }

    public static boolean g() {
        if (Build.VERSION.SDK_INT < 31) {
            return Build.DEVICE.startsWith("generic");
        }
        String str = Build.FINGERPRINT;
        return str.contains("generic") || str.contains("emulator") || Build.HARDWARE.contains("ranchu");
    }

    public static void g0(fc1.e eVar, x10.d dVar) {
        eVar.B0 = dVar;
    }

    public static final void g1(byte b13, long j13) {
        switch (b13) {
            case 24:
                if (j13 >= 24) {
                    return;
                }
                throw new zzhf("Integer value " + j13 + " after add info could have been represented in 0 additional bytes, but used 1");
            case 25:
                if (j13 >= 256) {
                    return;
                }
                throw new zzhf("Integer value " + j13 + " after add info could have been represented in 0-1 additional bytes, but used 2");
            case 26:
                if (j13 >= 65536) {
                    return;
                }
                throw new zzhf("Integer value " + j13 + " after add info could have been represented in 0-2 additional bytes, but used 4");
            case 27:
                if (j13 >= 4294967296L) {
                    return;
                }
                throw new zzhf("Integer value " + j13 + " after add info could have been represented in 0-4 additional bytes, but used 8");
            default:
                return;
        }
    }

    public static final void h(List list, re1.e eVar, float f13, String str) {
        ue1.a0 lastItemRep;
        int i13;
        z32.l lVar = eVar.f107575c;
        z32.l lVar2 = z32.l.END_ITEM;
        z32.l lVar3 = z32.l.END_OVERLAY;
        z32.l lVar4 = z32.l.HEADER_AND_END_OVERFLOW;
        if (!f0.d(lVar2, lVar3, lVar4).contains(lVar) || list.isEmpty() || (lastItemRep = (ue1.a0) CollectionsKt.d0(list)) == null) {
            return;
        }
        List list2 = xe1.d.f134691a;
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        Intrinsics.checkNotNullParameter(lastItemRep, "lastItemRep");
        z32.l lVar5 = eVar.f107575c;
        String d2 = (lVar5 == lVar3 || lVar5 == lVar4) ? lastItemRep.d() : null;
        int t13 = lastItemRep.t();
        boolean f14 = lastItemRep.f();
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        if (lVar5 == lVar3 || lVar5 == lVar4) {
            i13 = xe1.v.f134786c;
        } else {
            z32.o oVar = z32.o.AVATAR_STACK_CARD;
            z32.o oVar2 = eVar.f107574b;
            i13 = oVar2 == oVar ? xe1.v.f134788d : oVar2 == z32.o.BUTTON ? xe1.v.f134793h : xe1.v.f134793h;
        }
        xe1.f a13 = xe1.d.a(eVar, f13, new xe1.a(d2, t13, i13, f14, f13));
        ue1.z zVar = a13 != null ? new ue1.z(str, a13) : null;
        if (zVar != null) {
            int i14 = xe1.c0.f134684a[lVar5.ordinal()];
            if (i14 == 1 || i14 == 2) {
                list.set(list.size() - 1, zVar);
            } else {
                list.add(zVar);
            }
        }
    }

    public static void h0(fc1.e eVar, lh0.r3 r3Var) {
        eVar.H0 = r3Var;
    }

    public static final void i(x92.b bVar) {
        n60.o.C(bVar, "apiFieldsMap", "creatorrecommendationitem.id", "creatorrecommendationitem.type", "creatorrecommendationitem.title");
        n60.o.w(bVar, "creatorrecommendationitem.subtitle", "creatorrecommendationitem.user_recommendation_reason", "creatorrecommendationitem.user()", "user.explicitly_followed_by_me");
        n60.o.w(bVar, "user.first_name", "user.follower_count", "user.full_name", "user.id");
        n60.o.v(bVar, "user.image_medium_url", "user.type", "user.username");
    }

    public static void i0(com.pinterest.feature.todaytab.articlefeed.j jVar, c2 c2Var) {
        jVar.X0 = c2Var;
    }

    public static final ft1.i j(int i13) {
        if (i13 == 2) {
            return ft1.i.Short;
        }
        if (i13 == 3) {
            return ft1.i.UnsignedByte;
        }
        if (i13 == 4) {
            return ft1.i.Float;
        }
        if (i13 == 21) {
            return ft1.i.Int24;
        }
        if (i13 == 22) {
            return ft1.i.Int32;
        }
        throw new RuntimeException(a.a.e("Unsupported Android audio encoding [", i13, "]"));
    }

    public static void j0(fc1.e eVar, i92.k kVar) {
        eVar.f61738z0 = kVar;
    }

    public static final boolean k() {
        return !kr2.f7463b.get();
    }

    public static void k0(k91.e eVar, i92.k kVar) {
        eVar.f78822j0 = kVar;
    }

    public static final void l(GestaltSwitch gestaltSwitch, Function1 init) {
        Intrinsics.checkNotNullParameter(gestaltSwitch, "<this>");
        Intrinsics.checkNotNullParameter(init, "init");
        on1.s sVar = new on1.s(gestaltSwitch.l());
        init.invoke(sVar);
        gestaltSwitch.i(new an1.i(sVar, 12));
    }

    public static void l0(ua1.d dVar, i92.k kVar) {
        dVar.f121418z0 = kVar;
    }

    public static final void m(SbaPinRep sbaPinRep, m pinFeatureConfig, nx.d0 pinalytics, o2 viewModel, j0 scope) {
        Intrinsics.checkNotNullParameter(sbaPinRep, "sbaPinRep");
        Intrinsics.checkNotNullParameter(pinFeatureConfig, "pinFeatureConfig");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(scope, "scope");
        sbaPinRep.setPinalytics(pinalytics);
        sbaPinRep.applyUnMigratedPFCFields(pinFeatureConfig.f128875n0, pinFeatureConfig.f128861g0, pinFeatureConfig.f128855d0, pinFeatureConfig.f128879p0, pinFeatureConfig.M);
        sbaPinRep.setEventIntake(viewModel.c());
        kotlin.jvm.internal.j.z(scope, null, null, new kb2.b(viewModel, sbaPinRep, null), 3);
    }

    public static void m0(com.pinterest.feature.todaytab.articlefeed.j jVar, w20.a aVar) {
        jVar.U0 = aVar;
    }

    public static void n(Context context, c5.u builder, com.pinterest.pushnotification.f pushData, PendingIntent viewActionPendingIntent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(builder, "builder");
        Intrinsics.checkNotNullParameter(pushData, "pushData");
        Intrinsics.checkNotNullParameter(viewActionPendingIntent, "viewActionPendingIntent");
        if (!pushData.f50275s) {
            Intrinsics.checkNotNullParameter("AcceptRendered", "actionValue");
            HashSet hashSet = tb0.h.f117076w;
            tb0.h hVar = tb0.g.f117075a;
            tb0.k kVar = new tb0.k();
            kVar.c("Action", "AcceptRendered");
            hVar.k("BoardNotificationAccept", kVar.f117102a);
            int i13 = pz1.b.p_logo;
            String string = context.getString(pz1.e.board_notification_action_accept);
            Intent intent = new Intent(context, (Class<?>) BoardActionService.class);
            intent.putExtra("ACTION_TYPE", "ACTION_ACCEPT");
            Bundle bundle = new Bundle();
            Map map = pushData.f50266j;
            Intrinsics.checkNotNullExpressionValue(map, "getOriginalData(...)");
            for (Map.Entry entry : map.entrySet()) {
                bundle.putString((String) entry.getKey(), (String) entry.getValue());
            }
            intent.putExtras(bundle);
            PendingIntent service = PendingIntent.getService(context, pushData.f50257a.hashCode(), intent, 1140850688);
            Intrinsics.checkNotNullExpressionValue(service, "getService(...)");
            builder.a(i13, string, service);
        }
        builder.a(pz1.b.p_logo, context.getString(pz1.e.board_notification_action_view), viewActionPendingIntent);
    }

    public static void n0(com.pinterest.feature.todaytab.articlefeed.j jVar) {
        jVar.getClass();
    }

    public static final boolean o() {
        Boolean bool;
        if (kr2.f7463b.get()) {
            try {
                bool = (Boolean) Class.forName("org.conscrypt.Conscrypt").getMethod("isBoringSslFIPSBuild", new Class[0]).invoke(null, new Object[0]);
            } catch (Exception unused) {
                kr2.f7462a.info("Conscrypt is not available or does not support checking for FIPS build.");
                bool = Boolean.FALSE;
            }
            if (!bool.booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static void o0(fc1.e eVar, ap.o oVar) {
        eVar.D0 = oVar;
    }

    public static boolean p(q8.t tVar) {
        d0 d0Var = new d0(8);
        int i13 = q.c(tVar, d0Var).f82080b;
        if (i13 != 1380533830 && i13 != 1380333108) {
            return false;
        }
        tVar.s(d0Var.f53806a, 0, 4);
        d0Var.K(0);
        int k13 = d0Var.k();
        if (k13 == 1463899717) {
            return true;
        }
        u.c("WavHeaderReader", "Unsupported form type: " + k13);
        return false;
    }

    public static void p0(fc1.e eVar, kc2.b bVar) {
        eVar.G0 = bVar;
    }

    public static final Pair q(Context context, m pinFeatureConfig, nx.d0 pinalytics, j0 scope, qa2.j0 pinGridCellFactory, t2 pinRepViewModelFactory) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pinFeatureConfig, "pinFeatureConfig");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(pinGridCellFactory, "pinGridCellFactory");
        Intrinsics.checkNotNullParameter(pinRepViewModelFactory, "pinRepViewModelFactory");
        SbaPinRep sbaPinRep = (SbaPinRep) ((qa2.d) pinGridCellFactory).a(context, true);
        qa2.d0 d0Var = pinFeatureConfig.f128855d0;
        o2 a13 = d0Var != null ? t2.a(pinRepViewModelFactory, scope, new zw.a(d0Var), 6) : t2.a(pinRepViewModelFactory, scope, null, 14);
        m(sbaPinRep, pinFeatureConfig, pinalytics, a13, scope);
        return new Pair(sbaPinRep, a13);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Object q0(g gVar) {
        return ((t) gVar).call(new Object[0]);
    }

    public static byte[] r(String str) {
        if (str.length() % 2 != 0) {
            throw new IllegalArgumentException("Expected a string of even length");
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i13 = 0; i13 < length; i13++) {
            int i14 = i13 * 2;
            int digit = Character.digit(str.charAt(i14), 16);
            int digit2 = Character.digit(str.charAt(i14 + 1), 16);
            if (digit == -1 || digit2 == -1) {
                throw new IllegalArgumentException("input is not hexadecimal");
            }
            bArr[i13] = (byte) ((digit * 16) + digit2);
        }
        return bArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Object r0(g gVar, Object obj) {
        return ((t) gVar).call(obj);
    }

    public static f0.d s() {
        if (f0.d.f60728a != null) {
            return f0.d.f60728a;
        }
        synchronized (f0.d.class) {
            try {
                if (f0.d.f60728a == null) {
                    f0.d.f60728a = new f0.d();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return f0.d.f60728a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Object s0(g gVar, Object obj, Object obj2) {
        return ((t) gVar).call(obj, obj2);
    }

    public static final void t(long j13, y yVar) {
        MotionEvent obtain = MotionEvent.obtain(j13, j13, 3, 0.0f, 0.0f, 0);
        obtain.setSource(0);
        yVar.invoke(obtain);
        obtain.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Object t0(g gVar, Object obj, Object obj2, Object obj3) {
        return ((t) gVar).call(obj, obj2, obj3);
    }

    public static String u(byte[] bArr) {
        StringBuilder sb3 = new StringBuilder(bArr.length * 2);
        for (byte b13 : bArr) {
            int i13 = b13 & 255;
            sb3.append("0123456789abcdef".charAt(i13 / 16));
            sb3.append("0123456789abcdef".charAt(i13 % 16));
        }
        return sb3.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Object u0(g gVar, Object obj, Object obj2, Object obj3, Object obj4) {
        return ((t) gVar).call(obj, obj2, obj3, obj4);
    }

    public static j5.h v(Context context) {
        if (Build.VERSION.SDK_INT < 33) {
            return j5.h.a(c5.f.b(context));
        }
        Object systemService = context.getSystemService("locale");
        return systemService != null ? new j5.h(new j5.j(y1.e(systemService))) : j5.h.f74679b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Object v0(g gVar, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return ((t) gVar).call(obj, obj2, obj3, obj4, obj5);
    }

    public static final int w(int i13, nt1.c audioFormat) {
        Intrinsics.checkNotNullParameter(audioFormat, "audioFormat");
        ft1.i g13 = audioFormat.g();
        Intrinsics.f(g13);
        int size = g13.getSize();
        Integer h10 = audioFormat.h();
        Intrinsics.f(h10);
        return h10.intValue() * i13 * size;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Object w0(g gVar, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return ((t) gVar).call(obj, obj2, obj3, obj4, obj5, obj6);
    }

    public static final int x(int i13, nt1.c audioFormat) {
        Intrinsics.checkNotNullParameter(audioFormat, "audioFormat");
        String c13 = audioFormat.c();
        if (c13 == null) {
            throw new RuntimeException("MediaFormat must contain a MIME-type");
        }
        if (!nt1.d.e(c13)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (kotlin.text.z.i(c13, "audio/mp4a-latm", true)) {
            return 1024;
        }
        if (!kotlin.text.z.i(c13, "audio/raw", true)) {
            throw new RuntimeException(a.a.k("Unhandled audio codec [", c13, "]"));
        }
        ft1.i g13 = audioFormat.g();
        Intrinsics.f(g13);
        int size = i13 / g13.getSize();
        Integer h10 = audioFormat.h();
        Intrinsics.f(h10);
        return size / h10.intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Object x0(g gVar, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        return ((t) gVar).call(obj, obj2, obj3, obj4, obj5, obj6, obj7);
    }

    public static final rl2.d y(oo2.g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        if (gVar instanceof oo2.b) {
            return ((oo2.b) gVar).f96870b;
        }
        if (gVar instanceof f1) {
            return y(((f1) gVar).f104552a);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Object y0(g gVar, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        return ((t) gVar).call(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8);
    }

    public static final int z(MediaFormat mediaFormat) {
        Intrinsics.checkNotNullParameter(mediaFormat, "<this>");
        if (mediaFormat.containsKey("channel-count")) {
            return mediaFormat.getInteger("channel-count");
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Object z0(g gVar, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9) {
        return ((t) gVar).call(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9);
    }

    @Override // q5.e1
    public void a() {
    }

    @Override // q5.e1
    public void b() {
    }
}
