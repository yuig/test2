package kh2;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.display.DisplayManager;
import android.media.AudioRecord;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.PowerManager;
import android.os.Process;
import android.util.Range;
import android.util.Rational;
import android.view.Display;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import com.pinterest.analytics.PinalyticsException;
import com.pinterest.api.model.dl0;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.h01;
import com.pinterest.api.model.pq0;
import com.pinterest.api.model.qq0;
import com.pinterest.api.model.ro0;
import com.pinterest.api.model.rq0;
import com.pinterest.api.model.uo0;
import com.pinterest.api.model.vq0;
import com.pinterest.feature.board.common.newideas.view.BoardMoreIdeasHeaderView;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;
import io.embrace.android.embracesdk.internal.payload.Envelope;
import io.embrace.android.embracesdk.internal.payload.Span;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.z3;
import so.na;
import so.r8;
import so.z7;

/* loaded from: classes4.dex */
public abstract class n3 {

    /* renamed from: a */
    public static g01.a f79628a;

    /* renamed from: b */
    public static final /* synthetic */ int f79629b = 0;

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0034, code lost:
    
        if (r4 == false) goto L57;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final io.embrace.android.embracesdk.internal.payload.Span A(io.embrace.android.embracesdk.internal.payload.Envelope r9) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.Object r0 = r9.f73112e
            io.embrace.android.embracesdk.internal.payload.SessionPayload r0 = (io.embrace.android.embracesdk.internal.payload.SessionPayload) r0
            java.util.List r0 = r0.f73233a
            r1 = 1
            r2 = 0
            r3 = 0
            if (r0 == 0) goto L3e
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
            r4 = r2
            r5 = r3
        L18:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L34
            java.lang.Object r6 = r0.next()
            r7 = r6
            io.embrace.android.embracesdk.internal.payload.Span r7 = (io.embrace.android.embracesdk.internal.payload.Span) r7
            xf2.y r8 = xf2.y.f134904d
            boolean r7 = ei2.d.c(r7, r8)
            if (r7 == 0) goto L18
            if (r4 == 0) goto L31
        L2f:
            r5 = r3
            goto L37
        L31:
            r4 = r1
            r5 = r6
            goto L18
        L34:
            if (r4 != 0) goto L37
            goto L2f
        L37:
            io.embrace.android.embracesdk.internal.payload.Span r5 = (io.embrace.android.embracesdk.internal.payload.Span) r5
            if (r5 != 0) goto L3c
            goto L3e
        L3c:
            r3 = r5
            goto L6e
        L3e:
            java.lang.Object r9 = r9.f73112e
            io.embrace.android.embracesdk.internal.payload.SessionPayload r9 = (io.embrace.android.embracesdk.internal.payload.SessionPayload) r9
            java.util.List r9 = r9.f73234b
            if (r9 == 0) goto L6e
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.Iterator r9 = r9.iterator()
            r0 = r3
        L4d:
            boolean r4 = r9.hasNext()
            if (r4 == 0) goto L68
            java.lang.Object r4 = r9.next()
            r5 = r4
            io.embrace.android.embracesdk.internal.payload.Span r5 = (io.embrace.android.embracesdk.internal.payload.Span) r5
            xf2.y r6 = xf2.y.f134904d
            boolean r5 = ei2.d.c(r5, r6)
            if (r5 == 0) goto L4d
            if (r2 == 0) goto L65
            goto L6c
        L65:
            r2 = r1
            r0 = r4
            goto L4d
        L68:
            if (r2 != 0) goto L6b
            goto L6c
        L6b:
            r3 = r0
        L6c:
            io.embrace.android.embracesdk.internal.payload.Span r3 = (io.embrace.android.embracesdk.internal.payload.Span) r3
        L6e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kh2.n3.A(io.embrace.android.embracesdk.internal.payload.Envelope):io.embrace.android.embracesdk.internal.payload.Span");
    }

    public static int A0(q3.a0 a0Var, q3.s sVar, q3.r rVar, int i13) {
        return a0Var.i(new q3.w(sVar, sVar.getLayoutDirection()), new q3.t0(rVar, q3.u0.Max, q3.v0.Width, 0), bs1.c.b(0, i13, 7)).j();
    }

    public static long B(double d2) {
        bf.b.j("not a normal value", t0(d2));
        int exponent = Math.getExponent(d2);
        long doubleToRawLongBits = Double.doubleToRawLongBits(d2) & 4503599627370495L;
        return exponent == -1023 ? doubleToRawLongBits << 1 : doubleToRawLongBits | 4503599627370496L;
    }

    public static int B0(q3.a0 a0Var, q3.s sVar, q3.r rVar, int i13) {
        return a0Var.i(new q3.w(sVar, sVar.getLayoutDirection()), new q3.t0(rVar, q3.u0.Min, q3.v0.Height, 0), bs1.c.b(i13, 0, 13)).i();
    }

    public static String C(int i13, MotionLayout motionLayout) {
        return i13 == -1 ? "UNDEFINED" : motionLayout.getContext().getResources().getResourceEntryName(i13);
    }

    public static int C0(q3.a0 a0Var, q3.s sVar, q3.r rVar, int i13) {
        return a0Var.i(new q3.w(sVar, sVar.getLayoutDirection()), new q3.t0(rVar, q3.u0.Min, q3.v0.Width, 0), bs1.c.b(0, i13, 7)).j();
    }

    public static final pq0 D(f30 pin) {
        uo0 uo0Var;
        List t13;
        List s13;
        Intrinsics.checkNotNullParameter(pin, "pin");
        dl0 v63 = pin.v6();
        if (v63 == null || (s13 = v63.s()) == null || (uo0Var = (uo0) s13.get(0)) == null) {
            dl0 v64 = pin.v6();
            uo0Var = (v64 == null || (t13 = v64.t()) == null) ? null : (uo0) t13.get(0);
            if (uo0Var == null) {
                return null;
            }
        }
        List<ro0> o13 = uo0Var.o();
        if (o13 == null) {
            return null;
        }
        for (ro0 ro0Var : o13) {
            kotlin.jvm.internal.j0 j0Var = new kotlin.jvm.internal.j0();
            ro0Var.a(new rq0(j0Var, Unit.f80348a));
            Object obj = j0Var.f80434a;
            if (obj != null) {
                return (pq0) obj;
            }
        }
        return null;
    }

    public static int D0(r0.a aVar) {
        int i13 = aVar.f105473c;
        if (i13 == -1) {
            m0.p("AudioConfigUtil", "Using default AUDIO source: 5");
            return 5;
        }
        m0.p("AudioConfigUtil", "Using provided AUDIO source: " + i13);
        return i13;
    }

    public static final nx.d0 E(nx.d0 d0Var, tb0.p productAreas) {
        Intrinsics.checkNotNullParameter(productAreas, "productAreas");
        if (d0Var != null) {
            return d0Var;
        }
        HashSet hashSet = tb0.h.f117076w;
        tb0.g.f117075a.q(new PinalyticsException(), "Exception, pinalytics should not be null", productAreas);
        nx.d0 a13 = sh.f.a();
        Intrinsics.f(a13);
        return a13;
    }

    public static int E0(r0.a aVar) {
        int i13 = aVar.f105472b;
        if (i13 == -1) {
            m0.p("AudioConfigUtil", "Using default AUDIO source format: 2");
            return 2;
        }
        m0.p("AudioConfigUtil", "Using provided AUDIO source format: " + i13);
        return i13;
    }

    public static void F(com.pinterest.feature.ideaPinCreation.closeup.view.q qVar, g70.h hVar) {
        qVar.E0 = hVar;
    }

    public static final void F0(Context context, InputStream inputStream, String str, boolean z13, boolean z14, gw0.e eVar, File file) {
        if (file == null) {
            if (eVar != null) {
                eVar.onError(new IOException(a.a.j("Could not get the external storage file path for ", str)));
            }
        } else {
            kk2.k kVar = new kk2.k(new a.k1(file, 12), 1);
            w1.k0 k0Var = new w1.k0(context, inputStream, file, z13, z14);
            int i13 = 26;
            new fk2.c(4, kVar, new wv0.a(2, k0Var)).l(tk2.e.f118017c).h(wj2.c.a()).e(new fp.a(14, eVar, file)).f(new pv0.e(i13, new gw0.c(eVar, 0))).i(new xo.b(i13), new pv0.e(27, gw0.d.f66211j));
        }
    }

    public static void G(mv0.y yVar, ag1.b bVar) {
        yVar.E0 = bVar;
    }

    public static final void G0(Context context, InputStream inputStream, String str, boolean z13, boolean z14, gw0.e eVar) {
        ContentResolver contentResolver = context.getContentResolver();
        String V = df.j1.V("100PINT%s%s", File.separator, "Pins");
        ContentValues contentValues = new ContentValues();
        contentValues.put("_display_name", str);
        if (z13) {
            contentValues.put("mime_type", "image/gif");
        } else {
            contentValues.put("mime_type", "image/jpeg");
        }
        contentValues.put("relative_path", Environment.DIRECTORY_PICTURES + "/" + V);
        new kk2.g(new kk2.g(new kk2.m(new kk2.k(new a.g0(11, contentResolver, contentValues), 1), new wv0.a(3, new w1.i0(contentResolver, context, inputStream, z13, z14, V)), 0).r(tk2.e.f118017c).l(wj2.c.a()), new pv0.e(28, new gw0.c(eVar, 1)), 3), new pv0.e(29, new gw0.c(eVar, 2)), 1).o(new gw0.a(0, gw0.d.f66212k), new gw0.a(1, gw0.d.f66213l));
    }

    public static void H(mv0.y yVar, bh.b bVar) {
        yVar.C0 = bVar;
    }

    public static final void H0(Context context, InputStream inputStream, String name, boolean z13, boolean z14, gw0.e eVar, File file) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(inputStream, "inputStream");
        Intrinsics.checkNotNullParameter(name, "name");
        try {
            if (Build.VERSION.SDK_INT >= 29) {
                G0(context, inputStream, name, z13, z14, eVar);
            } else {
                F0(context, inputStream, name, z13, z14, eVar, file);
            }
        } catch (IOException e13) {
            if (eVar != null) {
                eVar.onError(e13);
            }
        }
    }

    public static void I(com.pinterest.feature.ideaPinCreation.closeup.view.q qVar, zf0.f fVar) {
        qVar.getClass();
    }

    public static int I0(int i13, int i14, int i15, int i16, int i17, Range range) {
        int doubleValue = (int) (new Rational(i16, i17).doubleValue() * new Rational(i14, i15).doubleValue() * i13);
        String format = m0.G0(3, "AudioConfigUtil") ? String.format("Base Bitrate(%dbps) * Channel Count Ratio(%d / %d) * Sample Rate Ratio(%d / %d) = %d", Integer.valueOf(i13), Integer.valueOf(i14), Integer.valueOf(i15), Integer.valueOf(i16), Integer.valueOf(i17), Integer.valueOf(doubleValue)) : "";
        if (!r0.a.f105469f.equals(range)) {
            Integer num = (Integer) range.clamp(Integer.valueOf(doubleValue));
            doubleValue = num.intValue();
            if (m0.G0(3, "AudioConfigUtil")) {
                format = format.concat(String.format("\nClamped to range %s -> %dbps", range, num));
            }
        }
        m0.p("AudioConfigUtil", format);
        return doubleValue;
    }

    public static void J(qm0.p0 p0Var, zf0.f fVar) {
        p0Var.O0 = fVar;
    }

    public static int J0(Range range, int i13, int i14, int i15) {
        ArrayList arrayList = null;
        int i16 = 0;
        int i17 = i15;
        while (true) {
            if (range.contains((Range) Integer.valueOf(i17))) {
                int i18 = u0.h.f119756n;
                if (i17 > 0 && i13 > 0) {
                    if (AudioRecord.getMinBufferSize(i17, i13 == 1 ? 16 : 12, i14) > 0) {
                        return i17;
                    }
                }
                StringBuilder t13 = a.a.t("Sample rate ", i17, "Hz is not supported by audio source with channel count ", i13, " and source format ");
                t13.append(i14);
                m0.p("AudioConfigUtil", t13.toString());
            } else {
                m0.p("AudioConfigUtil", "Sample rate " + i17 + "Hz is not in target range " + range);
            }
            if (arrayList == null) {
                m0.p("AudioConfigUtil", "Trying common sample rates in proximity order to target " + i15 + "Hz");
                arrayList = new ArrayList(u0.i.f119769e);
                Collections.sort(arrayList, new r0.s(i15, 1));
            }
            if (i16 >= arrayList.size()) {
                m0.p("AudioConfigUtil", "No sample rate found in target range or supported by audio source. Falling back to default sample rate of 44100Hz");
                return 44100;
            }
            i17 = ((Integer) arrayList.get(i16)).intValue();
            i16++;
        }
    }

    public static void K(qn0.d dVar, m60.w wVar) {
        dVar.f104452b1 = wVar;
    }

    public static int K0(int i13) {
        if (i13 == 0) {
            return 0;
        }
        if (i13 == 1) {
            return 90;
        }
        if (i13 == 2) {
            return RecyclerViewTypes.VIEW_TYPE_BUBBLE_CATEGORY_REP;
        }
        if (i13 == 3) {
            return RecyclerViewTypes.VIEW_TYPE_SHOPPING_FILTER_EMPTY_STATE_EOF;
        }
        throw new IllegalArgumentException(a.a.d("Unsupported surface rotation: ", i13));
    }

    public static void L(BoardMoreIdeasHeaderView boardMoreIdeasHeaderView, ll.j jVar) {
        boardMoreIdeasHeaderView.f45135j = jVar;
    }

    public static final Rect L0(a3.d dVar) {
        return new Rect((int) dVar.f484a, (int) dVar.f485b, (int) dVar.f486c, (int) dVar.f487d);
    }

    public static void M(BoardMoreIdeasHeaderView boardMoreIdeasHeaderView, lh0.t tVar) {
        boardMoreIdeasHeaderView.f45134i = tVar;
    }

    public static final Rect M0(n4.i iVar) {
        return new Rect(iVar.f89182a, iVar.f89183b, iVar.f89184c, iVar.f89185d);
    }

    public static void N(qm0.p0 p0Var) {
        p0Var.getClass();
    }

    public static final RectF N0(a3.d dVar) {
        return new RectF(dVar.f484a, dVar.f485b, dVar.f486c, dVar.f487d);
    }

    public static void O(ed0.k kVar, r8 r8Var) {
        kVar.f58518c0 = r8Var;
    }

    public static final a3.d O0(Rect rect) {
        return new a3.d(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static void P(gq0.d dVar, m60.d0 d0Var) {
        dVar.M0 = d0Var;
    }

    public static final a3.d P0(RectF rectF) {
        return new a3.d(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public static void Q(com.pinterest.feature.ideaPinCreation.closeup.view.q qVar, z7 z7Var) {
        qVar.f46283z0 = z7Var;
    }

    public static void R(mv0.y yVar, dv0.q qVar) {
        yVar.A0 = qVar;
    }

    public static void S(mv0.y yVar, kv0.p pVar) {
        yVar.B0 = pVar;
    }

    public static void T(mv0.y yVar, so.c cVar) {
        yVar.f88417z0 = cVar;
    }

    public static void U(com.pinterest.feature.ideaPinCreation.closeup.view.q qVar, ag1.h hVar) {
        qVar.D0 = hVar;
    }

    public static void V(qm0.p0 p0Var, qb0.a aVar) {
        p0Var.P0 = aVar;
    }

    public static void W(qm0.p0 p0Var, qa2.d dVar) {
        p0Var.L0 = dVar;
    }

    public static void X(qm0.p0 p0Var, ni1.t2 t2Var) {
        p0Var.M0 = t2Var;
    }

    public static void Y(mv0.y yVar) {
        yVar.getClass();
    }

    public static void Z(qm0.p0 p0Var, ni1.d0 d0Var) {
        p0Var.N0 = d0Var;
    }

    public static final void a(uc0.q qVar, i2.o oVar, int i13, int i14) {
        int i15;
        i2.s sVar = (i2.s) oVar;
        sVar.Y(-1562110854);
        if ((i13 & 14) == 0) {
            i15 = (((i14 & 1) == 0 && sVar.h(qVar)) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i15 & 11) == 2 && sVar.z()) {
            sVar.Q();
        } else {
            sVar.S();
            if ((i13 & 1) != 0 && !sVar.y()) {
                sVar.Q();
                int i16 = i14 & 1;
            } else if ((i14 & 1) != 0) {
                sVar.X(1890788296);
                androidx.lifecycle.u1 a13 = v6.b.a(sVar);
                if (a13 == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                }
                xe2.g V = p2.V(a13, sVar);
                sVar.X(1729797275);
                androidx.lifecycle.l1 v03 = c3.v0(uc0.q.class, a13, V, a13 instanceof androidx.lifecycle.k ? ((androidx.lifecycle.k) a13).getDefaultViewModelCreationExtras() : u6.a.f120754b, sVar);
                sVar.r(false);
                sVar.r(false);
                qVar = (uc0.q) v03;
            }
            sVar.s();
            i2.q1 z13 = bs1.c.z(qVar.f121825e, sVar);
            qVar.i(new uc0.i(new oc0.a(q2.i.c(619595442, new androidx.compose.foundation.lazy.layout.v(13, z13, qVar), sVar))));
            gh0.b.d(((uc0.p) z13.getValue()).f121843a, null, sVar, 8, 2);
        }
        i2.f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new yu.c(qVar, i13, i14, 6);
        }
    }

    public static void a0(com.pinterest.feature.ideaPinCreation.closeup.view.q qVar, nx.f0 f0Var) {
        qVar.A0 = f0Var;
    }

    public static final void b(u80.h hVar, u2.q qVar, u80.i iVar, Function2 function2, i2.o oVar, int i13, int i14) {
        i2.s sVar = (i2.s) oVar;
        sVar.Y(741094489);
        u2.q qVar2 = (i14 & 2) != 0 ? u2.n.f120041b : qVar;
        u80.i b13 = (i14 & 4) != 0 ? u80.l.b(sVar, 3072) : iVar;
        Function2 function22 = (i14 & 8) != 0 ? u80.o.f120972a : function2;
        c2.j1.h(androidx.compose.foundation.layout.b.d(androidx.compose.foundation.layout.e.m(qVar2, b13.f120943a), b13.f120944b), v1.i.a(b13.f120946d), androidx.compose.ui.graphics.a.d(4292467161L), 0L, b13.f120945c ? new k1.y(3, new b3.z0(b3.w.f21382f)) : null, 5, q2.i.c(-1982594403, new i1.j(hVar, 13), sVar), sVar, 1769856, 8);
        i2.f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new l1.r((Object) hVar, qVar2, (Object) b13, (Object) function22, i13, i14, 5);
        }
    }

    public static void b0(com.pinterest.feature.ideaPinCreation.closeup.view.q qVar, na naVar) {
        qVar.B0 = naVar;
    }

    public static final void c(u80.g state, u2.q qVar, u80.i iVar, i2.o oVar, int i13, int i14) {
        u80.i iVar2;
        int i15;
        float f13;
        Intrinsics.checkNotNullParameter(state, "state");
        i2.s sVar = (i2.s) oVar;
        sVar.Y(-1035042771);
        u2.q qVar2 = (i14 & 2) != 0 ? u2.n.f120041b : qVar;
        if ((i14 & 4) != 0) {
            i15 = i13 & (-897);
            iVar2 = u80.l.b(sVar, 3072);
        } else {
            iVar2 = iVar;
            i15 = i13;
        }
        List list = state.f120938b;
        int size = list.size();
        float f14 = iVar2.f120943a;
        float f15 = f14 / iVar2.f120944b;
        u80.b bVar = state.f120937a;
        u80.a aVar = bVar.f120913a;
        u80.i a13 = u80.i.a(iVar2, 0.0f, state.f120939c, com.bumptech.glide.d.A(state.f120940d, sVar), 3);
        if (size != 1) {
            f13 = size != 2 ? aVar.f120912b : aVar.f120911a;
        } else {
            aVar.getClass();
            f13 = 0.15f;
        }
        jk.v.c(f13, qVar2, bVar.f120915c, q2.i.c(-1688507428, new u80.f(size, bVar, list, f14, f15, a13), sVar), sVar, (i15 & RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER) | 3072, 0);
        i2.f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new l1.p(i13, i14, 11, state, qVar2, iVar2);
        }
    }

    public static void c0(com.pinterest.feature.ideaPinCreation.closeup.view.q qVar, i92.k kVar) {
        qVar.C0 = kVar;
    }

    public static final void d(ia0.b state, u2.q qVar, long j13, i2.o oVar, int i13, int i14) {
        boolean z13;
        Intrinsics.checkNotNullParameter(state, "state");
        i2.s sVar = (i2.s) oVar;
        sVar.Y(-40505300);
        int i15 = i14 & 2;
        u2.n nVar = u2.n.f120041b;
        u2.q qVar2 = i15 != 0 ? nVar : qVar;
        long h10 = (i14 & 4) != 0 ? g0.h(eo1.b.color_background_wash_light, sVar) : j13;
        float f13 = 6;
        state.getClass();
        sVar.W(-1693275982);
        u50.i0 i0Var = state.f71944b;
        boolean z14 = !kotlin.text.z.j((CharSequence) dl2.b.u2(i0Var, sVar));
        sVar.r(false);
        float f14 = z14 ? 2 * f13 : f13;
        v1.h hVar = v1.i.f123828a;
        v1.g gVar = new v1.g(50);
        u2.q q13 = androidx.compose.foundation.layout.b.q(androidx.compose.foundation.a.b(qVar2, h10, new v1.h(gVar, gVar, gVar, gVar)), f13, f13, f14, f13);
        p1.e1 a13 = p1.c1.a(p1.l.g(f13), u2.b.f120023k, sVar, 54);
        int i16 = sVar.P;
        i2.z1 o13 = sVar.o();
        u2.q X = ao2.m0.X(sVar, q13);
        s3.k.Qo.getClass();
        s3.i iVar = s3.j.f110798b;
        boolean z15 = sVar.f71265a instanceof i2.f;
        if (!z15) {
            com.bumptech.glide.c.j0();
            throw null;
        }
        sVar.a0();
        if (sVar.O) {
            sVar.n(iVar);
        } else {
            sVar.j0();
        }
        s3.h hVar2 = s3.j.f110801e;
        tb.f.f0(sVar, a13, hVar2);
        s3.h hVar3 = s3.j.f110800d;
        tb.f.f0(sVar, o13, hVar3);
        s3.h hVar4 = s3.j.f110802f;
        if (sVar.O || !Intrinsics.d(sVar.J(), Integer.valueOf(i16))) {
            ep.b.y(i16, sVar, i16, hVar4);
        }
        s3.h hVar5 = s3.j.f110799c;
        tb.f.f0(sVar, X, hVar5);
        long j14 = h10;
        kg.p.a(state.f71943a, null, null, sVar, 8, 6);
        p1.y a14 = p1.x.a(p1.l.f98547e, u2.b.f120025m, sVar, 6);
        int i17 = sVar.P;
        i2.z1 o14 = sVar.o();
        u2.q X2 = ao2.m0.X(sVar, nVar);
        if (!z15) {
            com.bumptech.glide.c.j0();
            throw null;
        }
        sVar.a0();
        if (sVar.O) {
            sVar.n(iVar);
        } else {
            sVar.j0();
        }
        tb.f.f0(sVar, a14, hVar2);
        tb.f.f0(sVar, o14, hVar3);
        if (sVar.O || !Intrinsics.d(sVar.J(), Integer.valueOf(i17))) {
            ep.b.y(i17, sVar, i17, hVar4);
        }
        tb.f.f0(sVar, X2, hVar5);
        u50.i0 i0Var2 = state.f71945c;
        boolean z16 = !kotlin.text.z.j((CharSequence) dl2.b.u2(i0Var2, sVar));
        sVar.W(1188809423);
        if (z16) {
            vn1.g gVar2 = vn1.g.BODY_100;
            rl1.q qVar3 = ia0.a.f71940a;
            dl2.b.c(ia0.a.a(i0Var2, gVar2, vn1.e.REGULAR), null, null, null, sVar, 8, 14);
        }
        sVar.r(false);
        boolean z17 = !kotlin.text.z.j((CharSequence) dl2.b.u2(i0Var, sVar));
        sVar.W(1188816288);
        if (z17) {
            vn1.g gVar3 = vn1.g.UI_100;
            rl1.q qVar4 = ia0.a.f71940a;
            dl2.b.c(ia0.a.a(i0Var, gVar3, vn1.e.REGULAR), null, null, null, sVar, 8, 14);
        }
        sVar.r(false);
        if (z16 || z17) {
            z13 = true;
            androidx.compose.foundation.layout.a.a(androidx.compose.foundation.layout.e.c(nVar, 1), sVar);
        } else {
            z13 = true;
        }
        sVar.r(z13);
        sVar.r(z13);
        i2.f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new w1.b(state, qVar2, j14, i13, i14, 1);
        }
    }

    public static void d0(mv0.y yVar, i92.k kVar) {
        yVar.D0 = kVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void e(s90.r0 r10, u2.q r11, i2.o r12, int r13, int r14) {
        /*
            java.lang.String r0 = "state"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            i2.s r12 = (i2.s) r12
            r0 = -2003623376(0xffffffff88932230, float:-8.855278E-34)
            r12.Y(r0)
            r0 = r14 & 2
            if (r0 == 0) goto L13
            u2.n r11 = u2.n.f120041b
        L13:
            boolean r0 = r10.f112016b
            if (r0 == 0) goto L24
            u50.h0 r0 = u50.h0.f120562a
            u50.i0 r1 = r10.f112015a
            boolean r0 = kotlin.jvm.internal.Intrinsics.d(r1, r0)
            if (r0 != 0) goto L24
            r0 = 1
        L22:
            r1 = r0
            goto L26
        L24:
            r0 = 0
            goto L22
        L26:
            i1.n1 r3 = i1.n1.f70854b
            i1.o1 r4 = i1.o1.f70858b
            i1.h r0 = new i1.h
            r2 = 10
            r0.<init>(r10, r2)
            r2 = -1128884984(0xffffffffbcb69508, float:-0.02228786)
            q2.h r6 = q2.i.c(r2, r0, r12)
            r0 = r13 & 112(0x70, float:1.57E-43)
            r2 = 196608(0x30000, float:2.75506E-40)
            r8 = r0 | r2
            r9 = 16
            r5 = 0
            r2 = r11
            r7 = r12
            b7.c.c(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            i2.f2 r12 = r12.t()
            if (r12 == 0) goto L5a
            q1.l r6 = new q1.l
            r3 = 8
            r0 = r6
            r1 = r13
            r2 = r14
            r4 = r10
            r5 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            r12.f71113d = r6
        L5a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kh2.n3.e(s90.r0, u2.q, i2.o, int, int):void");
    }

    public static void e0(qn0.d dVar, ac2.m mVar) {
        dVar.f104461k1 = mVar;
    }

    public static int f(int i13, int i14) {
        return ep.b.b(i13, i14, 31);
    }

    public static void f0(qn0.d dVar) {
        dVar.getClass();
    }

    public static boolean g(Context context) {
        PowerManager powerManager;
        ActivityManager activityManager;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        Intrinsics.checkNotNullParameter(context, "<this>");
        KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService(KeyguardManager.class);
        if (keyguardManager == null || (powerManager = (PowerManager) context.getSystemService(PowerManager.class)) == null || (activityManager = (ActivityManager) context.getSystemService(ActivityManager.class)) == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
            return false;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (Process.myPid() == runningAppProcessInfo.pid) {
                return (powerManager.isInteractive() && !keyguardManager.isKeyguardLocked() && runningAppProcessInfo.importance == 100) ? false : true;
            }
        }
        return true;
    }

    public static void g0(qn0.d dVar, x02.x0 x0Var) {
        dVar.f104456f1 = x0Var;
    }

    public static final void h(u80.h hVar, float f13, float f14, u80.c cVar, u2.q qVar, u80.i iVar, i2.o oVar, int i13, int i14) {
        u80.i iVar2;
        int i15;
        i2.s sVar = (i2.s) oVar;
        sVar.Y(-1330708156);
        u2.q qVar2 = (i14 & 16) != 0 ? u2.n.f120041b : qVar;
        if ((i14 & 32) != 0) {
            i15 = i13 & (-458753);
            iVar2 = u80.l.b(sVar, 3072);
        } else {
            iVar2 = iVar;
            i15 = i13;
        }
        b(hVar, g0.m0(androidx.compose.foundation.layout.b.k(qVar2, cVar.f120916a * f13, cVar.f120917b * f14), cVar.f120918c), iVar2, null, sVar, ((i15 >> 9) & 896) | 8, 8);
        i2.f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new u80.e(hVar, f13, f14, cVar, qVar2, iVar2, i13, i14);
        }
    }

    public static void h0(qn0.d dVar, x02.z0 z0Var) {
        dVar.W0 = z0Var;
    }

    public static void i(x92.b apiFieldsMap) {
        Intrinsics.checkNotNullParameter(apiFieldsMap, "apiFieldsMap");
        lh0.g2.f83370b.d();
        pk.a0.b(apiFieldsMap);
        apiFieldsMap.h("board.cover_images", "60x60");
        apiFieldsMap.e("board.is_collaborative");
        apiFieldsMap.e("board.privacy");
        apiFieldsMap.h("board.images", "60x60");
        apiFieldsMap.e("board.archived_by_me_at");
        n60.o.w(apiFieldsMap, "board.collaborating_users()", "user.has_quicksave_board", "board.recommendation_reason", "user.image_small_url");
        n60.o.v(apiFieldsMap, "user.image_medium_url", "user.image_large_url", "user.image_xlarge_url");
    }

    public static void i0(qn0.d dVar, j12.k kVar) {
        dVar.f104459i1 = kVar;
    }

    public static final void j(x92.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        dl2.b.l(bVar);
        g3.p(bVar);
        n00.i.f88778a.a(bVar);
        bVar.e("pin.shopping_rec_disabled");
    }

    public static void j0(qn0.d dVar, e12.d dVar2) {
        dVar.f104458h1 = dVar2;
    }

    public static final void k(x92.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        k3.s(bVar);
        bVar.e("board.pin_count");
        bVar.e("user.verified_identity");
        bVar.e("user.is_verified_merchant");
        bVar.e("board.collaborator_count");
    }

    public static void k0(qn0.d dVar, m60.f0 f0Var) {
        dVar.X0 = f0Var;
    }

    public static final void l(x92.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        lh0.g2 d2 = lh0.g2.f83370b.d();
        z3 z3Var = a4.f83298b;
        lh0.g1 g1Var = (lh0.g1) d2.f83373a;
        if (!g1Var.o("android_no_pin_field_for_comment_feed", "enabled", z3Var) && !g1Var.l("android_no_pin_field_for_comment_feed")) {
            bVar.e("userdiditdata.pin()");
        }
        n60.o.w(bVar, "userdiditdata.type", "userdiditdata.id", "userdiditdata.user()", "userdiditdata.done_at");
        bVar.e("userdiditdata.details");
        bVar.h("userdiditdata.images", "1080x");
        bVar.e("userdiditdata.reaction_by_me");
        n60.o.w(bVar, "userdiditdata.reaction_counts", "userdiditdata.marked_helpful_by_me", "userdiditdata.helpful_count", "userdiditdata.comment_count");
        n60.o.w(bVar, "userdiditdata.highlighted_by_pin_owner", "aggregatedcomment.type", "aggregatedcomment.id", "aggregatedcomment.user()");
        n60.o.w(bVar, "aggregatedcomment.created_at", "aggregatedcomment.text", "aggregatedcomment.is_translatable", "aggregatedcomment.comment_tag");
        n60.o.w(bVar, "aggregatedcomment.tags", "aggregatedcomment.reaction_by_me", "aggregatedcomment.reaction_counts", "aggregatedcomment.marked_helpful_by_me");
        n60.o.w(bVar, "aggregatedcomment.helpful_count", "aggregatedcomment.comment_count", "aggregatedcomment.highlighted_by_pin_owner", "aggregatedcomment.pin_id");
        n60.o.w(bVar, "aggregatedcomment.reply_preview_ids", "aggregatedcomment.reacted_by_creator", "aggregatedcomment.media()", "commentmedia.sticker()");
        bVar.e("commentsticker.image_url");
        bVar.e("aggregatedcomment.attached_pin()");
        pp2.a.g(bVar);
    }

    public static void l0(qn0.d dVar, rr0.a aVar) {
        dVar.f104453c1 = aVar;
    }

    public static final void m(HashMap auxData, kb.l videoData) {
        Intrinsics.checkNotNullParameter(auxData, "auxData");
        Intrinsics.checkNotNullParameter(videoData, "videoData");
        long g13 = videoData.g("video_duration", 0L);
        if (g13 != 0) {
            auxData.put("video_duration", String.valueOf(g13 / 1000));
        }
        Intrinsics.checkNotNullParameter("aspect_ratio", "key");
        Object valueOf = Float.valueOf(0.0f);
        Object obj = videoData.f79019a.get("aspect_ratio");
        if (obj instanceof Float) {
            valueOf = obj;
        }
        float floatValue = ((Number) valueOf).floatValue();
        if (floatValue == 0.0f) {
            return;
        }
        auxData.put("aspect_ratio", df.j1.U("%.2f", new Object[]{Float.valueOf(floatValue)}));
    }

    public static void m0(qn0.d dVar, nr0.m mVar) {
        dVar.f104454d1 = mVar;
    }

    public static final oo2.h n(String serialName, oo2.g[] typeParameters, Function1 builderAction) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(typeParameters, "typeParameters");
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        if (!(!kotlin.text.z.j(serialName))) {
            throw new IllegalArgumentException("Blank serial names are prohibited".toString());
        }
        oo2.a aVar = new oo2.a(serialName);
        builderAction.invoke(aVar);
        return new oo2.h(serialName, oo2.o.f96903a, aVar.f96864c.size(), kotlin.collections.c0.b0(typeParameters), aVar);
    }

    public static void n0(qn0.d dVar, yk1.j jVar) {
        dVar.Y0 = jVar;
    }

    public static final oo2.h o(String serialName, oo2.n kind, oo2.g[] typeParameters, Function1 builder) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(typeParameters, "typeParameters");
        Intrinsics.checkNotNullParameter(builder, "builder");
        if (!(!kotlin.text.z.j(serialName))) {
            throw new IllegalArgumentException("Blank serial names are prohibited".toString());
        }
        if (!(!Intrinsics.d(kind, oo2.o.f96903a))) {
            throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead".toString());
        }
        oo2.a aVar = new oo2.a(serialName);
        builder.invoke(aVar);
        return new oo2.h(serialName, kind, aVar.f96864c.size(), kotlin.collections.c0.b0(typeParameters), aVar);
    }

    public static void o0(qn0.d dVar, m60.g0 g0Var) {
        dVar.Z0 = g0Var;
    }

    public static final int p(int i13, int i14) {
        return ((i13 / 2) - (i14 / 2)) / 10;
    }

    public static void p0(qn0.d dVar, x02.i2 i2Var) {
        dVar.f104457g1 = i2Var;
    }

    public static String q(w.t tVar, Integer num, List list) {
        if (num == null || !list.contains("0") || !list.contains(SbaPinRep.AUXDATA_IS_LEAD_AD_TRUE)) {
            return null;
        }
        if (num.intValue() == 1) {
            if (((Integer) tVar.b("0").a(CameraCharacteristics.LENS_FACING)).intValue() == 1) {
                return SbaPinRep.AUXDATA_IS_LEAD_AD_TRUE;
            }
            return null;
        }
        if (num.intValue() == 0 && ((Integer) tVar.b(SbaPinRep.AUXDATA_IS_LEAD_AD_TRUE).a(CameraCharacteristics.LENS_FACING)).intValue() == 0) {
            return "0";
        }
        return null;
    }

    public static void q0(qn0.d dVar, uk1.e eVar) {
        dVar.f104455e1 = eVar;
    }

    public static boolean r(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        Display display = displayManager != null ? displayManager.getDisplay(0) : null;
        if (display == null || !display.isHdr()) {
            return false;
        }
        for (int i13 : display.getHdrCapabilities().getSupportedHdrTypes()) {
            if (i13 == 1) {
                return true;
            }
        }
        return false;
    }

    public static void r0(qn0.d dVar, i92.k kVar) {
        dVar.f104451a1 = kVar;
    }

    public static final h01 s(pq0 pq0Var) {
        vq0 g13 = pq0Var.g();
        Map c13 = g13 != null ? g13.c() : null;
        if (c13 == null || c13.isEmpty()) {
            return null;
        }
        h01 h01Var = (h01) c13.get("V_DASH_HEVC");
        return h01Var == null ? (h01) c13.get("V_HLSV3_MOBILE") : h01Var;
    }

    public static void s0(qn0.d dVar, nx.d1 d1Var) {
        dVar.f104460j1 = d1Var;
    }

    public static final pq0 t(f30 f30Var) {
        uo0 uo0Var;
        List o13;
        List t13;
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        dl0 v63 = f30Var.v6();
        if (v63 == null || (t13 = v63.t()) == null) {
            uo0Var = null;
        } else {
            Intrinsics.checkNotNullParameter(t13, "<this>");
            uo0Var = (uo0) CollectionsKt.S(t13);
        }
        if (uo0Var == null || (o13 = uo0Var.o()) == null) {
            return null;
        }
        kotlin.jvm.internal.j0 j0Var = new kotlin.jvm.internal.j0();
        Iterator it = o13.iterator();
        while (it.hasNext()) {
            ((ro0) it.next()).a(new qq0(j0Var, Unit.f80348a));
        }
        return (pq0) j0Var.f80434a;
    }

    public static boolean t0(double d2) {
        return Math.getExponent(d2) <= 1023;
    }

    public static String u() {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        return ".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ") " + stackTraceElement.getMethodName() + "()";
    }

    public static final boolean u0(String url) {
        boolean z13;
        Intrinsics.checkNotNullParameter(url, "url");
        Uri parse = Uri.parse(url);
        Intrinsics.checkNotNullExpressionValue(parse.getPathSegments(), "getPathSegments(...)");
        if (!r0.isEmpty()) {
            ArrayList d2 = kotlin.collections.f0.d("safety_root", "safety_root");
            List<String> pathSegments = parse.getPathSegments();
            Intrinsics.checkNotNullExpressionValue(pathSegments, "getPathSegments(...)");
            if (d2.contains(d7.b.j0(pathSegments))) {
                z13 = true;
                return z13 || CollectionsKt.L(kotlin.collections.f0.d("/sensitivity/treatments", "/sensitivity/treatments/"), parse.getPath());
            }
        }
        z13 = false;
        if (z13) {
            return true;
        }
    }

    public static String v() {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        return ".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ")";
    }

    public static final boolean v0(am2.g classDescriptor) {
        Intrinsics.checkNotNullParameter(xl2.e.f135265a, "<this>");
        Intrinsics.checkNotNullParameter(classDescriptor, "classDescriptor");
        if (bn2.e.n(classDescriptor)) {
            LinkedHashSet linkedHashSet = xl2.e.f135266b;
            ym2.b f13 = fn2.d.f(classDescriptor);
            if (CollectionsKt.L(linkedHashSet, f13 != null ? f13.f() : null)) {
                return true;
            }
        }
        return false;
    }

    public static String w(Context context, int i13) {
        if (i13 == -1) {
            return "UNKNOWN";
        }
        try {
            return context.getResources().getResourceEntryName(i13);
        } catch (Exception unused) {
            return a.a.d("?", i13);
        }
    }

    public static boolean w0(long[] jArr) {
        for (int i13 = 0; i13 < 9; i13++) {
            if (jArr[i13] != 0) {
                return false;
            }
        }
        return true;
    }

    public static String x(View view) {
        try {
            return view.getContext().getResources().getResourceEntryName(view.getId());
        } catch (Exception unused) {
            return "UNKNOWN";
        }
    }

    public static final zy.e0 x0(h32.f1 eventType, h32.u0 u0Var, h32.i0 pinalyticsContext, HashMap auxData) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Intrinsics.checkNotNullParameter(pinalyticsContext, "pinalyticsContext");
        Intrinsics.checkNotNullParameter(auxData, "auxData");
        return new zy.e0(new zy.a(com.bumptech.glide.d.z0(pinalyticsContext, new la0.l1(u0Var, 1)), eventType, null, auxData, null, null, false, false, RecyclerViewTypes.VIEW_TYPE_HOME_FEED_TUNER_SETTINGS_NOTIFICATION));
    }

    public static int y(int i13, int i14, boolean z13) {
        int i15 = z13 ? ((i14 - i13) + 360) % 360 : (i14 + i13) % 360;
        if (m0.G0(2, "CameraOrientationUtil")) {
            StringBuilder t13 = a.a.t("getRelativeImageRotation: destRotationDegrees=", i13, ", sourceRotationDegrees=", i14, ", isOppositeFacing=");
            t13.append(z13);
            t13.append(", result=");
            t13.append(i15);
            m0.p("CameraOrientationUtil", t13.toString());
        }
        return i15;
    }

    public static /* synthetic */ zy.e0 y0(h32.f1 f1Var, h32.u0 u0Var, h32.i0 i0Var, HashMap hashMap, int i13) {
        if ((i13 & 1) != 0) {
            f1Var = h32.f1.TAP;
        }
        if ((i13 & 2) != 0) {
            u0Var = null;
        }
        return x0(f1Var, u0Var, i0Var, hashMap);
    }

    public static final String z(Envelope envelope) {
        List list;
        Intrinsics.checkNotNullParameter(envelope, "<this>");
        Span A = A(envelope);
        if (A == null || (list = A.f73248i) == null) {
            return null;
        }
        String str = tj2.f.f117934a.f108404b;
        Intrinsics.checkNotNullExpressionValue(str, "SESSION_ID.key");
        return ei2.d.a(str, list);
    }

    public static int z0(q3.a0 a0Var, q3.s sVar, q3.r rVar, int i13) {
        return a0Var.i(new q3.w(sVar, sVar.getLayoutDirection()), new q3.t0(rVar, q3.u0.Max, q3.v0.Height, 0), bs1.c.b(i13, 0, 13)).i();
    }
}
