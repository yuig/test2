package jk;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import androidx.activity.l0;
import androidx.lifecycle.b0;
import androidx.lifecycle.c1;
import androidx.lifecycle.e1;
import androidx.lifecycle.l1;
import b2.j0;
import b2.r0;
import b2.t0;
import b2.u0;
import b2.v0;
import b4.p0;
import com.pinterest.api.model.tp;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import d7.n0;
import el.w0;
import gf2.z;
import h32.f1;
import i2.f2;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;
import kotlin.text.e0;
import n3.f0;
import nx.d0;
import pd2.i0;
import pd2.o0;
import qd2.a0;
import t3.s1;
import v5.x;
import w1.y1;
import xk2.y;

/* loaded from: classes3.dex */
public abstract class r {
    public static String A(int i13) {
        Object[] objArr = {Integer.valueOf(Color.red(i13)), Integer.valueOf(Color.green(i13)), Integer.valueOf(Color.blue(i13)), Double.valueOf(Color.alpha(i13) / 255.0d)};
        int i14 = n0.f53866a;
        return String.format(Locale.US, "rgba(%d,%d,%d,%.3f)", objArr);
    }

    public static void B(androidx.lifecycle.s sVar, ma.g gVar) {
        androidx.lifecycle.r rVar = ((b0) sVar).f18588d;
        if (rVar == androidx.lifecycle.r.INITIALIZED || rVar.isAtLeast(androidx.lifecycle.r.STARTED)) {
            gVar.d();
        } else {
            sVar.a(new androidx.lifecycle.m(sVar, gVar));
        }
    }

    public static final String C(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        StringBuilder sb3 = new StringBuilder();
        for (int i13 = 0; i13 < str.length(); i13++) {
            char charAt = str.charAt(i13);
            if (StringsKt.F("!#$&'\"()*+,/:;=?@[]{}% ", charAt)) {
                StringBuilder sb4 = new StringBuilder("%");
                String num = Integer.toString(charAt, CharsKt.checkRadix(16));
                Intrinsics.checkNotNullExpressionValue(num, "toString(this, checkRadix(radix))");
                sb4.append(num);
                String upperCase = sb4.toString().toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                sb3.append(upperCase);
            } else {
                sb3.append(charAt);
            }
        }
        String sb5 = sb3.toString();
        Intrinsics.checkNotNullExpressionValue(sb5, "StringBuilder().apply(builderAction).toString()");
        return sb5;
    }

    public static final void a(boolean z13, m4.h hVar, t0 t0Var, i2.o oVar, int i13) {
        int i14;
        i2.s sVar = (i2.s) oVar;
        sVar.Y(-1344558920);
        if ((i13 & 6) == 0) {
            i14 = (sVar.i(z13) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= sVar.h(hVar) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= sVar.j(t0Var) ? RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER : RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        }
        if ((i14 & RecyclerViewTypes.VIEW_TYPE_SEARCH_PRODUCT_COLLAGE_STORY) == 146 && sVar.z()) {
            sVar.Q();
        } else {
            int i15 = i14 & 14;
            boolean h10 = (i15 == 4) | sVar.h(t0Var);
            Object J2 = sVar.J();
            Object obj = i2.n.f71185a;
            if (h10 || J2 == obj) {
                t0Var.getClass();
                J2 = new r0(t0Var, z13);
                sVar.g0(J2);
            }
            y1 y1Var = (y1) J2;
            boolean j13 = sVar.j(t0Var) | (i15 == 4);
            Object J3 = sVar.J();
            if (j13 || J3 == obj) {
                J3 = new u0(t0Var, z13);
                sVar.g0(J3);
            }
            b2.l lVar = (b2.l) J3;
            boolean f13 = p0.f(t0Var.l().f67560b);
            u2.n nVar = u2.n.f120041b;
            boolean j14 = sVar.j(y1Var);
            Object J4 = sVar.J();
            if (j14 || J4 == obj) {
                J4 = new v0(y1Var, null);
                sVar.g0(J4);
            }
            int i16 = i14 << 3;
            c0.d.c(lVar, z13, hVar, f13, 0L, f0.a(nVar, y1Var, (Function2) J4), sVar, (i16 & RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER) | (i16 & 896), 16);
        }
        f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new b2.f(z13, hVar, t0Var, i13);
        }
    }

    public static Pair b(RandomAccessFile randomAccessFile, int i13) {
        int i14;
        if (i13 < 0 || i13 > 65535) {
            throw new IllegalArgumentException(kh2.n.j(i13, "maxCommentSize: "));
        }
        long length = randomAccessFile.length();
        if (length < 22) {
            return null;
        }
        ByteBuffer allocate = ByteBuffer.allocate(((int) Math.min(i13, length - 22)) + 22);
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        allocate.order(byteOrder);
        long capacity = length - allocate.capacity();
        randomAccessFile.seek(capacity);
        randomAccessFile.readFully(allocate.array(), allocate.arrayOffset(), allocate.capacity());
        if (allocate.order() != byteOrder) {
            throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
        }
        int capacity2 = allocate.capacity();
        if (capacity2 >= 22) {
            int i15 = capacity2 - 22;
            int min = Math.min(i15, 65535);
            for (int i16 = 0; i16 < min; i16++) {
                i14 = i15 - i16;
                if (allocate.getInt(i14) == 101010256 && (allocate.getShort(i14 + 20) & 65535) == i16) {
                    break;
                }
            }
        }
        i14 = -1;
        if (i14 == -1) {
            return null;
        }
        allocate.position(i14);
        ByteBuffer slice = allocate.slice();
        slice.order(ByteOrder.LITTLE_ENDIAN);
        return Pair.create(slice, Long.valueOf(capacity + i14));
    }

    public static final byte[] c(int i13, int i14, byte[] bArr, byte[] bArr2) {
        if (i14 < 0 || bArr.length - i14 < i13 || bArr2.length - i14 < 0) {
            throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
        }
        byte[] bArr3 = new byte[i14];
        for (int i15 = 0; i15 < i14; i15++) {
            bArr3[i15] = (byte) (bArr[i15 + i13] ^ bArr2[i15]);
        }
        return bArr3;
    }

    public static byte[] d(byte[]... bArr) {
        int i13 = 0;
        for (byte[] bArr2 : bArr) {
            if (i13 > Integer.MAX_VALUE - bArr2.length) {
                throw new GeneralSecurityException("exceeded size limit");
            }
            i13 += bArr2.length;
        }
        byte[] bArr3 = new byte[i13];
        int i14 = 0;
        for (byte[] bArr4 : bArr) {
            System.arraycopy(bArr4, 0, bArr3, i14, bArr4.length);
            i14 += bArr4.length;
        }
        return bArr3;
    }

    public static final void e(l1 viewModel, ma.g registry, androidx.lifecycle.s lifecycle) {
        AutoCloseable autoCloseable;
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.checkNotNullParameter("androidx.lifecycle.savedstate.vm.tag", "key");
        w6.b bVar = viewModel.f18658a;
        if (bVar != null) {
            Intrinsics.checkNotNullParameter("androidx.lifecycle.savedstate.vm.tag", "key");
            synchronized (((bk.f) bVar.f128109c)) {
                autoCloseable = (AutoCloseable) bVar.f128107a.get("androidx.lifecycle.savedstate.vm.tag");
            }
        } else {
            autoCloseable = null;
        }
        e1 e1Var = (e1) autoCloseable;
        if (e1Var == null || e1Var.f18617c) {
            return;
        }
        e1Var.a(lifecycle, registry);
        B(lifecycle, registry);
    }

    public static final e1 f(ma.g registry, androidx.lifecycle.s lifecycle, String str, Bundle bundle) {
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Bundle a13 = registry.a(str);
        Class[] clsArr = c1.f18600f;
        e1 e1Var = new e1(str, x.u(a13, bundle));
        e1Var.a(lifecycle, registry);
        B(lifecycle, registry);
        return e1Var;
    }

    public static z2.s g() {
        return z2.s.f140649c;
    }

    public static z2.s h() {
        return z2.s.f140648b;
    }

    public static Enum i(Class cls, String str) {
        return Enum.valueOf(cls, str);
    }

    public static t3.b j(Locale locale) {
        if (t3.b.f115850d == null) {
            t3.b bVar = new t3.b();
            bVar.f115851c = BreakIterator.getCharacterInstance(locale);
            t3.b.f115850d = bVar;
        }
        t3.b bVar2 = t3.b.f115850d;
        Intrinsics.g(bVar2, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.CharacterTextSegmentIterator");
        return bVar2;
    }

    public static t3.c k() {
        if (t3.c.f115862d == null) {
            t3.c.f115862d = new t3.c();
        }
        t3.c cVar = t3.c.f115862d;
        Intrinsics.g(cVar, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.LineTextSegmentIterator");
        return cVar;
    }

    public static t3.d l() {
        if (t3.d.f115927e == null) {
            t3.d dVar = new t3.d();
            new Rect();
            t3.d.f115927e = dVar;
        }
        t3.d dVar2 = t3.d.f115927e;
        Intrinsics.g(dVar2, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.PageTextSegmentIterator");
        return dVar2;
    }

    public static t3.e m() {
        if (t3.e.f115947c == null) {
            t3.e.f115947c = new t3.e();
        }
        t3.e eVar = t3.e.f115947c;
        Intrinsics.g(eVar, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.ParagraphTextSegmentIterator");
        return eVar;
    }

    public static t3.g n(Locale locale) {
        if (t3.g.f115999d == null) {
            t3.g gVar = new t3.g();
            gVar.f116000c = BreakIterator.getWordInstance(locale);
            t3.g.f115999d = gVar;
        }
        t3.g gVar2 = t3.g.f115999d;
        Intrinsics.g(gVar2, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.WordTextSegmentIterator");
        return gVar2;
    }

    public static long o() {
        return l3.a.f81490l;
    }

    public static long p() {
        return l3.a.f81489k;
    }

    public static final boolean q(t0 t0Var, boolean z13) {
        q3.x c13;
        w1.l1 l1Var = t0Var.f21219d;
        if (l1Var == null || (c13 = l1Var.c()) == null) {
            return false;
        }
        a3.d a13 = j0.a(c13);
        long k13 = t0Var.k(z13);
        float d2 = a3.c.d(k13);
        if (a13.f484a > d2 || d2 > a13.f486c) {
            return false;
        }
        float e13 = a3.c.e(k13);
        return a13.f485b <= e13 && e13 <= a13.f487d;
    }

    public static void r(tp tpVar, ig1.a type, String str) {
        Intrinsics.checkNotNullParameter(type, "type");
        vb0.j.f125466a.F(s1.c("Idea Pin Creation Warning. ", type.name(), " : ", str == null ? "" : str), tb0.p.IDEA_PINS_CREATION, new Object[0]);
        d0 a13 = sh.f.a();
        Intrinsics.checkNotNullExpressionValue(a13, "get(...)");
        f1 f1Var = f1.IDEA_PIN_CREATE_WARN;
        h32.c1 Z = kh2.j.Z(tpVar);
        HashMap hashMap = new HashMap();
        hashMap.put("reason", type.name());
        if (str != null) {
            hashMap.put("story_pin_create_failure_message", e0.C(1024, str));
        }
        Unit unit = Unit.f80348a;
        a13.u(f1Var, null, Z, hashMap, false);
    }

    public static byte[] s(int i13) {
        a.g gVar = w0.f59551a;
        byte[] bArr = new byte[i13];
        ((SecureRandom) w0.f59551a.get()).nextBytes(bArr);
        return bArr;
    }

    public static sp2.i t(d7.d0 d0Var) {
        d0Var.L(1);
        int B = d0Var.B();
        long j13 = d0Var.f53807b + B;
        int i13 = B / 18;
        long[] jArr = new long[i13];
        long[] jArr2 = new long[i13];
        int i14 = 0;
        while (true) {
            if (i14 >= i13) {
                break;
            }
            long s13 = d0Var.s();
            if (s13 == -1) {
                jArr = Arrays.copyOf(jArr, i14);
                jArr2 = Arrays.copyOf(jArr2, i14);
                break;
            }
            jArr[i14] = s13;
            jArr2[i14] = d0Var.s();
            d0Var.L(2);
            i14++;
        }
        d0Var.L((int) (j13 - d0Var.f53807b));
        return new sp2.i(17, jArr, jArr2);
    }

    public static final void u(View view, androidx.activity.w fullyDrawnReporterOwner) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(fullyDrawnReporterOwner, "fullyDrawnReporterOwner");
        view.setTag(l0.report_drawn, fullyDrawnReporterOwner);
    }

    public static int v(pd2.r0 settings, mm.b builder) {
        kotlin.Pair pair;
        kotlin.Pair pair2;
        kotlin.Pair pair3;
        kotlin.Pair pair4;
        Intrinsics.checkNotNullParameter(settings, "settings");
        Intrinsics.checkNotNullParameter(builder, "builder");
        int w13 = w(settings.e(), builder);
        TreeMap spec = settings.f99868a;
        Intrinsics.checkNotNullParameter(spec, "spec");
        Intrinsics.checkNotNullParameter(builder, "builder");
        ArrayList arrayList = new ArrayList(spec.size());
        for (Map.Entry entry : spec.entrySet()) {
            String str = (String) entry.getKey();
            pd2.u spec2 = (pd2.u) entry.getValue();
            int f13 = builder.f(str);
            Intrinsics.checkNotNullParameter(spec2, "spec");
            Intrinsics.checkNotNullParameter(builder, "builder");
            Integer num = null;
            if (spec2 instanceof pd2.k) {
                y yVar = new y((byte) 1);
                pd2.k kVar = (pd2.k) spec2;
                float f14 = kVar.f99849b;
                Intrinsics.checkNotNullParameter(builder, "builder");
                Intrinsics.checkNotNullParameter(builder, "builder");
                builder.o(1);
                Intrinsics.checkNotNullParameter(builder, "builder");
                builder.b(0, f14);
                Intrinsics.checkNotNullParameter(builder, "builder");
                int g13 = builder.g();
                qd2.l lVar = kVar.f99850c;
                if (lVar != null) {
                    if (lVar instanceof qd2.f) {
                        y yVar2 = new y((byte) 1);
                        qd2.f fVar = (qd2.f) lVar;
                        float f15 = fVar.f103589c;
                        float f16 = fVar.f103590d;
                        Intrinsics.checkNotNullParameter(new ql2.g(f15, f16), "value");
                        Intrinsics.checkNotNullParameter(builder, "builder");
                        float floatValue = Float.valueOf(f15).floatValue();
                        float floatValue2 = Float.valueOf(f16).floatValue();
                        Intrinsics.checkNotNullParameter(builder, "builder");
                        builder.o(2);
                        Intrinsics.checkNotNullParameter(builder, "builder");
                        builder.b(1, floatValue2);
                        Intrinsics.checkNotNullParameter(builder, "builder");
                        builder.b(0, floatValue);
                        Intrinsics.checkNotNullParameter(builder, "builder");
                        int g14 = builder.g();
                        ef2.a aVar = gf2.e.f64869f;
                        Intrinsics.checkNotNullParameter(builder, "builder");
                        builder.o(1);
                        switch (aVar.f58841a) {
                            case 10:
                                Intrinsics.checkNotNullParameter(builder, "builder");
                                builder.d(0, g14);
                                break;
                            default:
                                Intrinsics.checkNotNullParameter(builder, "builder");
                                builder.d(0, g14);
                                break;
                        }
                        Intrinsics.checkNotNullParameter(builder, "builder");
                        int g15 = builder.g();
                        builder.l(g15, 4);
                        pair4 = new kotlin.Pair(yVar2, Integer.valueOf(g15));
                    } else {
                        if (!(lVar instanceof qd2.k)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        y yVar3 = new y((byte) 2);
                        ef2.a aVar2 = gf2.g.f64871f;
                        float[] data = CollectionsKt.C0(((qd2.k) lVar).f103595c);
                        Intrinsics.checkNotNullParameter(builder, "builder");
                        Intrinsics.checkNotNullParameter(data, "data");
                        int i13 = 4;
                        builder.p(4, data.length, 4);
                        int length = data.length - 1;
                        while (-1 < length) {
                            float f17 = data[length];
                            builder.k(i13, 0);
                            ByteBuffer byteBuffer = builder.f87553a;
                            int i14 = builder.f87554b - i13;
                            builder.f87554b = i14;
                            byteBuffer.putFloat(i14, f17);
                            length--;
                            i13 = 4;
                        }
                        int h10 = builder.h();
                        ef2.a aVar3 = gf2.g.f64871f;
                        Intrinsics.checkNotNullParameter(builder, "builder");
                        builder.o(1);
                        switch (aVar3.f58841a) {
                            case 12:
                                Intrinsics.checkNotNullParameter(builder, "builder");
                                builder.d(0, h10);
                                break;
                            default:
                                Intrinsics.checkNotNullParameter(builder, "builder");
                                builder.d(0, h10);
                                break;
                        }
                        Intrinsics.checkNotNullParameter(builder, "builder");
                        int g16 = builder.g();
                        builder.l(g16, 4);
                        pair4 = new kotlin.Pair(yVar3, Integer.valueOf(g16));
                    }
                    byte b13 = ((y) pair4.f80346a).f135238a;
                    int intValue = ((Number) pair4.f80347b).intValue();
                    ef2.a aVar4 = gf2.f.f64870f;
                    Intrinsics.checkNotNullParameter(builder, "builder");
                    builder.o(2);
                    aVar4.c(intValue, builder);
                    aVar4.d(builder, b13);
                    Intrinsics.checkNotNullParameter(builder, "builder");
                    num = Integer.valueOf(builder.g());
                }
                ef2.a aVar5 = gf2.h.f64872f;
                Intrinsics.checkNotNullParameter(builder, "builder");
                builder.o(2);
                aVar5.a(g13, builder);
                if (num != null) {
                    aVar5.b(num.intValue(), builder);
                }
                Intrinsics.checkNotNullParameter(builder, "builder");
                int g17 = builder.g();
                builder.l(g17, 4);
                pair2 = new kotlin.Pair(yVar, Integer.valueOf(g17));
            } else if (spec2 instanceof pd2.n) {
                y yVar4 = new y((byte) 2);
                pd2.n nVar = (pd2.n) spec2;
                int i15 = nVar.f99858b;
                Intrinsics.checkNotNullParameter(builder, "builder");
                ef2.a aVar6 = gf2.n.f64877f;
                Intrinsics.checkNotNullParameter(builder, "builder");
                builder.o(1);
                aVar6.c(i15, builder);
                Intrinsics.checkNotNullParameter(builder, "builder");
                int g18 = builder.g();
                qd2.u uVar = nVar.f99859c;
                if (uVar != null) {
                    if (uVar instanceof qd2.o) {
                        y yVar5 = new y((byte) 1);
                        qd2.o oVar = (qd2.o) uVar;
                        int i16 = oVar.f103600d;
                        int i17 = oVar.f103599c;
                        IntRange value = new IntRange(i17, i16, 1);
                        Intrinsics.checkNotNullParameter(value, "value");
                        Intrinsics.checkNotNullParameter(builder, "builder");
                        Intrinsics.checkNotNullParameter(builder, "builder");
                        builder.o(2);
                        Intrinsics.checkNotNullParameter(builder, "builder");
                        int i18 = value.f80454b;
                        if (i18 != 0) {
                            builder.k(4, 0);
                            ByteBuffer byteBuffer2 = builder.f87553a;
                            int i19 = builder.f87554b - 4;
                            builder.f87554b = i19;
                            byteBuffer2.putInt(i19, i18);
                            builder.n(1);
                        }
                        Intrinsics.checkNotNullParameter(builder, "builder");
                        if (i17 != 0) {
                            builder.k(4, 0);
                            ByteBuffer byteBuffer3 = builder.f87553a;
                            int i23 = builder.f87554b - 4;
                            builder.f87554b = i23;
                            byteBuffer3.putInt(i23, i17);
                            builder.n(0);
                        }
                        Intrinsics.checkNotNullParameter(builder, "builder");
                        int g19 = builder.g();
                        ef2.a aVar7 = gf2.j.f64873f;
                        Intrinsics.checkNotNullParameter(builder, "builder");
                        builder.o(1);
                        switch (aVar7.f58841a) {
                            case 10:
                                Intrinsics.checkNotNullParameter(builder, "builder");
                                builder.d(0, g19);
                                break;
                            default:
                                Intrinsics.checkNotNullParameter(builder, "builder");
                                builder.d(0, g19);
                                break;
                        }
                        Intrinsics.checkNotNullParameter(builder, "builder");
                        int g23 = builder.g();
                        builder.l(g23, 4);
                        pair3 = new kotlin.Pair(yVar5, Integer.valueOf(g23));
                    } else {
                        if (!(uVar instanceof qd2.t)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        y yVar6 = new y((byte) 2);
                        ef2.a aVar8 = gf2.l.f64875f;
                        int[] data2 = CollectionsKt.E0(((qd2.t) uVar).f103605c);
                        Intrinsics.checkNotNullParameter(builder, "builder");
                        Intrinsics.checkNotNullParameter(data2, "data");
                        int i24 = 4;
                        builder.p(4, data2.length, 4);
                        int length2 = data2.length - 1;
                        while (-1 < length2) {
                            int i25 = data2[length2];
                            builder.k(i24, 0);
                            ByteBuffer byteBuffer4 = builder.f87553a;
                            int i26 = builder.f87554b - i24;
                            builder.f87554b = i26;
                            byteBuffer4.putInt(i26, i25);
                            length2--;
                            i24 = 4;
                        }
                        int h13 = builder.h();
                        ef2.a aVar9 = gf2.l.f64875f;
                        Intrinsics.checkNotNullParameter(builder, "builder");
                        builder.o(1);
                        switch (aVar9.f58841a) {
                            case 12:
                                Intrinsics.checkNotNullParameter(builder, "builder");
                                builder.d(0, h13);
                                break;
                            default:
                                Intrinsics.checkNotNullParameter(builder, "builder");
                                builder.d(0, h13);
                                break;
                        }
                        Intrinsics.checkNotNullParameter(builder, "builder");
                        int g24 = builder.g();
                        builder.l(g24, 4);
                        pair3 = new kotlin.Pair(yVar6, Integer.valueOf(g24));
                    }
                    byte b14 = ((y) pair3.f80346a).f135238a;
                    int intValue2 = ((Number) pair3.f80347b).intValue();
                    ef2.a aVar10 = gf2.k.f64874f;
                    Intrinsics.checkNotNullParameter(builder, "builder");
                    builder.o(2);
                    aVar10.c(intValue2, builder);
                    aVar10.d(builder, b14);
                    Intrinsics.checkNotNullParameter(builder, "builder");
                    num = Integer.valueOf(builder.g());
                }
                ef2.a aVar11 = gf2.m.f64876f;
                Intrinsics.checkNotNullParameter(builder, "builder");
                builder.o(2);
                aVar11.a(g18, builder);
                if (num != null) {
                    aVar11.b(num.intValue(), builder);
                }
                Intrinsics.checkNotNullParameter(builder, "builder");
                int g25 = builder.g();
                builder.l(g25, 4);
                pair2 = new kotlin.Pair(yVar4, Integer.valueOf(g25));
            } else {
                if (spec2 instanceof pd2.c) {
                    y yVar7 = new y((byte) 4);
                    boolean z13 = ((pd2.c) spec2).f99828b;
                    Intrinsics.checkNotNullParameter(builder, "builder");
                    Intrinsics.checkNotNullParameter(builder, "builder");
                    builder.o(1);
                    Intrinsics.checkNotNullParameter(builder, "builder");
                    if (z13) {
                        builder.k(1, 0);
                        ByteBuffer byteBuffer5 = builder.f87553a;
                        int i27 = builder.f87554b - 1;
                        builder.f87554b = i27;
                        byteBuffer5.put(i27, z13 ? (byte) 1 : (byte) 0);
                        builder.n(0);
                    }
                    Intrinsics.checkNotNullParameter(builder, "builder");
                    int g26 = builder.g();
                    ef2.a aVar12 = gf2.a.f64866f;
                    Intrinsics.checkNotNullParameter(builder, "builder");
                    builder.o(1);
                    aVar12.a(g26, builder);
                    Intrinsics.checkNotNullParameter(builder, "builder");
                    int g27 = builder.g();
                    builder.l(g27, 4);
                    pair = new kotlin.Pair(yVar7, Integer.valueOf(g27));
                } else if (spec2 instanceof pd2.f) {
                    y yVar8 = new y((byte) 6);
                    int F = gh0.b.F(((pd2.f) spec2).f99836b, builder);
                    ef2.a aVar13 = gf2.d.f64868f;
                    Intrinsics.checkNotNullParameter(builder, "builder");
                    builder.o(1);
                    aVar13.a(F, builder);
                    Intrinsics.checkNotNullParameter(builder, "builder");
                    int g28 = builder.g();
                    builder.l(g28, 4);
                    pair = new kotlin.Pair(yVar8, Integer.valueOf(g28));
                } else if (spec2 instanceof pd2.t) {
                    y yVar9 = new y((byte) 3);
                    pd2.t tVar = (pd2.t) spec2;
                    PointF value2 = tVar.f99873b;
                    Intrinsics.checkNotNullParameter(value2, "value");
                    Intrinsics.checkNotNullParameter(builder, "builder");
                    int f18 = ef2.a.f(builder, value2.x, value2.y);
                    a0 a0Var = tVar.f99874c;
                    if (a0Var != null) {
                        RectF value3 = a0Var.f103585b;
                        Intrinsics.checkNotNullParameter(value3, "value");
                        Intrinsics.checkNotNullParameter(builder, "builder");
                        float f19 = value3.left;
                        float f23 = value3.top;
                        float width = value3.width();
                        float height = value3.height();
                        Intrinsics.checkNotNullParameter(builder, "builder");
                        builder.o(4);
                        Intrinsics.checkNotNullParameter(builder, "builder");
                        builder.b(3, height);
                        Intrinsics.checkNotNullParameter(builder, "builder");
                        builder.b(2, width);
                        Intrinsics.checkNotNullParameter(builder, "builder");
                        builder.b(1, f23);
                        Intrinsics.checkNotNullParameter(builder, "builder");
                        builder.b(0, f19);
                        Intrinsics.checkNotNullParameter(builder, "builder");
                        int g29 = builder.g();
                        ef2.a aVar14 = gf2.u.f64882f;
                        Intrinsics.checkNotNullParameter(builder, "builder");
                        builder.o(1);
                        switch (aVar14.f58841a) {
                            case 23:
                                Intrinsics.checkNotNullParameter(builder, "builder");
                                builder.d(0, g29);
                                break;
                            default:
                                Intrinsics.checkNotNullParameter(builder, "builder");
                                builder.d(0, g29);
                                break;
                        }
                        Intrinsics.checkNotNullParameter(builder, "builder");
                        int g33 = builder.g();
                        builder.l(g33, 4);
                        num = Integer.valueOf(g33);
                    }
                    ef2.a aVar15 = gf2.v.f64883f;
                    Intrinsics.checkNotNullParameter(builder, "builder");
                    builder.o(2);
                    aVar15.a(f18, builder);
                    if (num != null) {
                        aVar15.b(num.intValue(), builder);
                    }
                    Intrinsics.checkNotNullParameter(builder, "builder");
                    int g34 = builder.g();
                    builder.l(g34, 4);
                    pair = new kotlin.Pair(yVar9, Integer.valueOf(g34));
                } else {
                    if (!(spec2 instanceof pd2.q)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    y yVar10 = new y((byte) 5);
                    pd2.q qVar = (pd2.q) spec2;
                    int g03 = gh0.b.g0(qVar.f99865b, builder);
                    qd2.x xVar = qVar.f99866c;
                    if (xVar != null) {
                        RectF value4 = xVar.f103609b;
                        Intrinsics.checkNotNullParameter(value4, "value");
                        Intrinsics.checkNotNullParameter(builder, "builder");
                        float f24 = value4.left;
                        float f25 = value4.top;
                        float width2 = value4.width();
                        float height2 = value4.height();
                        Intrinsics.checkNotNullParameter(builder, "builder");
                        builder.o(4);
                        Intrinsics.checkNotNullParameter(builder, "builder");
                        builder.b(3, height2);
                        Intrinsics.checkNotNullParameter(builder, "builder");
                        builder.b(2, width2);
                        Intrinsics.checkNotNullParameter(builder, "builder");
                        builder.b(1, f25);
                        Intrinsics.checkNotNullParameter(builder, "builder");
                        builder.b(0, f24);
                        Intrinsics.checkNotNullParameter(builder, "builder");
                        int g35 = builder.g();
                        ef2.a aVar16 = gf2.p.f64878f;
                        Intrinsics.checkNotNullParameter(builder, "builder");
                        builder.o(1);
                        switch (aVar16.f58841a) {
                            case 23:
                                Intrinsics.checkNotNullParameter(builder, "builder");
                                builder.d(0, g35);
                                break;
                            default:
                                Intrinsics.checkNotNullParameter(builder, "builder");
                                builder.d(0, g35);
                                break;
                        }
                        Intrinsics.checkNotNullParameter(builder, "builder");
                        int g36 = builder.g();
                        builder.l(g36, 4);
                        num = Integer.valueOf(g36);
                    }
                    ef2.a aVar17 = gf2.q.f64879f;
                    Intrinsics.checkNotNullParameter(builder, "builder");
                    builder.o(2);
                    aVar17.a(g03, builder);
                    if (num != null) {
                        aVar17.b(num.intValue(), builder);
                    }
                    Intrinsics.checkNotNullParameter(builder, "builder");
                    int g37 = builder.g();
                    builder.l(g37, 4);
                    pair = new kotlin.Pair(yVar10, Integer.valueOf(g37));
                }
                pair2 = pair;
            }
            byte b15 = ((y) pair2.f80346a).f135238a;
            int intValue3 = ((Number) pair2.f80347b).intValue();
            ef2.a aVar18 = gf2.r.f64880f;
            Intrinsics.checkNotNullParameter(builder, "builder");
            builder.o(2);
            aVar18.c(intValue3, builder);
            aVar18.d(builder, b15);
            Intrinsics.checkNotNullParameter(builder, "builder");
            int g38 = builder.g();
            gf2.w wVar = gf2.y.f64886f;
            Intrinsics.checkNotNullParameter(builder, "builder");
            builder.o(2);
            Intrinsics.checkNotNullParameter(builder, "builder");
            builder.d(1, g38);
            switch (wVar.f64884a) {
                case 3:
                    Intrinsics.checkNotNullParameter(builder, "builder");
                    builder.c(f13);
                    builder.n(0);
                    break;
                default:
                    Intrinsics.checkNotNullParameter(builder, "builder");
                    builder.c(f13);
                    builder.n(0);
                    break;
            }
            Intrinsics.checkNotNullParameter(builder, "builder");
            int g39 = builder.g();
            builder.l(g39, 4);
            builder.l(g39, 6);
            arrayList.add(Integer.valueOf(g39));
        }
        int[] E0 = CollectionsKt.E0(arrayList);
        gf2.w wVar2 = gf2.x.f64885f;
        int a13 = wVar2.a(builder, E0);
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.o(1);
        switch (wVar2.f64884a) {
            case 2:
                Intrinsics.checkNotNullParameter(builder, "builder");
                builder.d(0, a13);
                break;
            default:
                Intrinsics.checkNotNullParameter(builder, "builder");
                builder.d(0, a13);
                break;
        }
        Intrinsics.checkNotNullParameter(builder, "builder");
        int g43 = builder.g();
        builder.l(g43, 4);
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.o(2);
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.d(1, w13);
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.d(0, g43);
        Intrinsics.checkNotNullParameter(builder, "builder");
        int g44 = builder.g();
        builder.l(g44, 4);
        builder.l(g44, 6);
        return g44;
    }

    public static int w(LinkedHashMap values, mm.b builder) {
        kotlin.Pair pair;
        Intrinsics.checkNotNullParameter(values, "values");
        Intrinsics.checkNotNullParameter(builder, "builder");
        ArrayList arrayList = new ArrayList(values.size());
        for (Map.Entry entry : values.entrySet()) {
            String str = (String) entry.getKey();
            pd2.p0 p0Var = (pd2.p0) entry.getValue();
            int f13 = builder.f(str);
            if (p0Var instanceof pd2.f0) {
                y yVar = new y((byte) 1);
                float f14 = ((pd2.f0) p0Var).f99839b;
                Intrinsics.checkNotNullParameter(builder, "builder");
                Intrinsics.checkNotNullParameter(builder, "builder");
                builder.o(1);
                Intrinsics.checkNotNullParameter(builder, "builder");
                builder.b(0, f14);
                Intrinsics.checkNotNullParameter(builder, "builder");
                pair = new kotlin.Pair(yVar, Integer.valueOf(builder.g()));
            } else if (p0Var instanceof i0) {
                y yVar2 = new y((byte) 2);
                int i13 = ((i0) p0Var).f99845b;
                Intrinsics.checkNotNullParameter(builder, "builder");
                ef2.a aVar = gf2.n.f64877f;
                Intrinsics.checkNotNullParameter(builder, "builder");
                builder.o(1);
                aVar.c(i13, builder);
                Intrinsics.checkNotNullParameter(builder, "builder");
                pair = new kotlin.Pair(yVar2, Integer.valueOf(builder.g()));
            } else if (p0Var instanceof pd2.x) {
                y yVar3 = new y((byte) 3);
                boolean z13 = ((pd2.x) p0Var).f99879b;
                Intrinsics.checkNotNullParameter(builder, "builder");
                Intrinsics.checkNotNullParameter(builder, "builder");
                builder.o(1);
                Intrinsics.checkNotNullParameter(builder, "builder");
                if (z13) {
                    builder.k(1, 0);
                    ByteBuffer byteBuffer = builder.f87553a;
                    int i14 = builder.f87554b - 1;
                    builder.f87554b = i14;
                    byteBuffer.put(i14, z13 ? (byte) 1 : (byte) 0);
                    builder.n(0);
                }
                Intrinsics.checkNotNullParameter(builder, "builder");
                pair = new kotlin.Pair(yVar3, Integer.valueOf(builder.g()));
            } else if (p0Var instanceof pd2.a0) {
                pair = new kotlin.Pair(new y((byte) 5), Integer.valueOf(gh0.b.F(((pd2.a0) p0Var).f99825b, builder)));
            } else if (p0Var instanceof o0) {
                y yVar4 = new y((byte) 4);
                PointF value = ((o0) p0Var).f99863b;
                Intrinsics.checkNotNullParameter(value, "value");
                Intrinsics.checkNotNullParameter(builder, "builder");
                pair = new kotlin.Pair(yVar4, Integer.valueOf(ef2.a.f(builder, value.x, value.y)));
            } else {
                if (!(p0Var instanceof pd2.l0)) {
                    throw new NoWhenBranchMatchedException();
                }
                pair = new kotlin.Pair(new y((byte) 7), Integer.valueOf(gh0.b.g0(((pd2.l0) p0Var).f99854b, builder)));
            }
            byte b13 = ((y) pair.f80346a).f135238a;
            int intValue = ((Number) pair.f80347b).intValue();
            ef2.a aVar2 = gf2.s.f64881f;
            Intrinsics.checkNotNullParameter(builder, "builder");
            builder.o(2);
            aVar2.c(intValue, builder);
            aVar2.d(builder, b13);
            Intrinsics.checkNotNullParameter(builder, "builder");
            int g13 = builder.g();
            gf2.w wVar = gf2.a0.f64867f;
            Intrinsics.checkNotNullParameter(builder, "builder");
            builder.o(2);
            Intrinsics.checkNotNullParameter(builder, "builder");
            builder.d(1, g13);
            switch (wVar.f64884a) {
                case 3:
                    Intrinsics.checkNotNullParameter(builder, "builder");
                    builder.c(f13);
                    builder.n(0);
                    break;
                default:
                    Intrinsics.checkNotNullParameter(builder, "builder");
                    builder.c(f13);
                    builder.n(0);
                    break;
            }
            Intrinsics.checkNotNullParameter(builder, "builder");
            int g14 = builder.g();
            builder.l(g14, 4);
            builder.l(g14, 6);
            arrayList.add(Integer.valueOf(g14));
        }
        int[] E0 = CollectionsKt.E0(arrayList);
        gf2.w wVar2 = z.f64887f;
        int a13 = wVar2.a(builder, E0);
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.o(1);
        switch (wVar2.f64884a) {
            case 2:
                Intrinsics.checkNotNullParameter(builder, "builder");
                builder.d(0, a13);
                break;
            default:
                Intrinsics.checkNotNullParameter(builder, "builder");
                builder.d(0, a13);
                break;
        }
        Intrinsics.checkNotNullParameter(builder, "builder");
        int g15 = builder.g();
        builder.l(g15, 4);
        return g15;
    }

    public static final void x(String str) {
        throw new IllegalArgumentException(str);
    }

    public static final void y(String str) {
        throw new IllegalStateException(str);
    }

    public static final void z(String str) {
        throw new IllegalStateException(str);
    }
}
