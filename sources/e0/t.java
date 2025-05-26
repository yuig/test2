package e0;

import a.cb;
import a.h4;
import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.media.MediaFormat;
import android.opengl.EGL14;
import android.opengl.GLUtils;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcelable;
import android.provider.Settings;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import android.util.Pair;
import android.util.Size;
import android.util.SizeF;
import androidx.compose.ui.input.pointer.PointerHoverIconModifierElement;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b2.o0;
import b4.p0;
import com.google.android.play.core.splitinstall.internal.zzf;
import com.pinterest.api.model.ew;
import com.pinterest.api.model.gw;
import com.pinterest.api.model.n8;
import com.pinterest.api.model.v7;
import com.pinterest.api.model.wy0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.feature.search.typeahead.view.SearchTypeaheadRecentSearchPillView;
import com.pinterest.gestalt.avatar.GestaltAvatar;
import com.pinterest.gestalt.button.view.GestaltButton;
import ey.c3;
import f31.m0;
import f31.x;
import h32.a4;
import i2.f1;
import i2.q1;
import i2.y3;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.security.DigestException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.c0;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import lh0.e3;
import lh0.f3;
import lh0.n3;
import m60.f0;
import m60.x0;
import nx.b0;
import oi.u6;
import pk.o1;
import rm2.j0;
import so.c6;
import so.o2;
import so.p2;
import so.q2;
import so.r2;
import so.r8;
import so.s2;
import so.t2;
import so.z;
import t3.n1;
import t3.s1;
import tm2.i0;
import v.a0;
import w1.g1;
import x02.i2;
import yk1.v;

/* loaded from: classes2.dex */
public abstract class t {

    /* renamed from: a, reason: collision with root package name */
    public static volatile Handler f56743a = null;

    /* renamed from: b, reason: collision with root package name */
    public static Method f56744b = null;

    /* renamed from: c, reason: collision with root package name */
    public static Method f56745c = null;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f56746d = false;

    /* renamed from: e, reason: collision with root package name */
    public static int f56747e = -1;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f56748f;

    /* renamed from: g, reason: collision with root package name */
    public static boolean f56749g;

    /* renamed from: h, reason: collision with root package name */
    public static boolean f56750h;

    /* renamed from: i, reason: collision with root package name */
    public static boolean f56751i;

    /* renamed from: j, reason: collision with root package name */
    public static boolean f56752j;

    /* renamed from: k, reason: collision with root package name */
    public static boolean f56753k;

    /* renamed from: l, reason: collision with root package name */
    public static boolean f56754l;

    public static void A(l11.j jVar, r2 r2Var) {
        jVar.H0 = r2Var;
    }

    public static void A0(k91.j jVar) {
        jVar.getClass();
    }

    public static void B(c61.i iVar, ur.a aVar) {
        iVar.Y0 = aVar;
    }

    public static void B0(l11.j jVar, i92.k kVar) {
        jVar.D0 = kVar;
    }

    public static void C(wq1.f fVar, vy.m mVar) {
        fVar.f130827t0 = mVar;
    }

    public static void C0(s41.f fVar, i92.k kVar) {
        fVar.f111132a1 = kVar;
    }

    public static void D(c61.i iVar, xr.a aVar) {
        iVar.M0 = aVar;
    }

    public static void D0(wq1.f fVar, i92.k kVar) {
        fVar.f130830w0 = kVar;
    }

    public static void E(l11.j jVar, lu1.b bVar) {
        jVar.A0 = bVar;
    }

    public static void E0(xa1.l lVar, i92.k kVar) {
        lVar.C0 = kVar;
    }

    public static void F(xa1.l lVar, lu1.b bVar) {
        lVar.B0 = bVar;
    }

    public static void F0(SearchTypeaheadRecentSearchPillView searchTypeaheadRecentSearchPillView, ku1.l lVar) {
        searchTypeaheadRecentSearchPillView.f47882e = lVar;
    }

    public static void G(c61.i iVar, g70.h hVar) {
        iVar.f26566a1 = hVar;
    }

    public static void G0(c61.i iVar, nr0.t tVar) {
        iVar.P0 = tVar;
    }

    public static void H(l11.j jVar, g70.h hVar) {
        jVar.Q0 = hVar;
    }

    public static void H0(c61.i iVar, v vVar) {
        iVar.O0 = vVar;
    }

    public static void I(l11.j jVar) {
        jVar.C0 = jl0.a.f76935a;
    }

    public static void I0(s41.f fVar, v vVar) {
        fVar.f111133b1 = vVar;
    }

    public static void J(l11.j jVar, z70.m mVar) {
        jVar.K0 = mVar;
    }

    public static final f31.h J0(m0 vmState, boolean z13, boolean z14) {
        f31.g gVar;
        int i13;
        rm1.q qVar;
        Intrinsics.checkNotNullParameter(vmState, "vmState");
        k51.v vVar = vmState.f61022c;
        if (vVar.f78338a == k51.n.SEARCH_BAR) {
            b22.l lVar = vVar.f78339b;
            Intrinsics.checkNotNullParameter(lVar, "<this>");
            int[] iArr = k51.t.f78334a;
            int i14 = iArr[lVar.ordinal()];
            if (i14 == 1) {
                i13 = oz1.a.ic_view_type_wide_nonpds;
            } else if (i14 == 2) {
                i13 = oz1.a.ic_view_type_standard_nonpds;
            } else {
                if (i14 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                i13 = oz1.a.ic_view_type_compact_nonpds;
            }
            b22.l lVar2 = vmState.f61022c.f78339b;
            Intrinsics.checkNotNullParameter(lVar2, "<this>");
            int i15 = iArr[lVar2.ordinal()];
            if (i15 == 1) {
                qVar = rm1.q.VIEW_TYPE_SPARSE;
            } else if (i15 == 2) {
                qVar = rm1.q.VIEW_TYPE_DEFAULT;
            } else {
                if (i15 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                qVar = rm1.q.VIEW_TYPE_DENSE;
            }
            gVar = new f31.g(i13, qVar, Integer.valueOf(oz1.e.accessibility_filter_icon_profile_pins_tab), eo1.b.color_icon_default, z13, new x(k51.q.f78332a));
        } else {
            gVar = null;
        }
        f31.g gVar2 = new f31.g(t70.c.ic_plus_create_nonpds, rm1.q.ADD, Integer.valueOf(oz1.e.accessibility_create_icon), eo1.b.color_icon_default, z14, f31.o.f61025a);
        int i16 = x0.search_your_pins;
        f31.g[] elements = {gVar, gVar2};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return new f31.h(i16, c0.A(elements));
    }

    public static void K(c61.i iVar, a11.d dVar) {
        iVar.J0 = dVar;
    }

    public static void K0(byte[] bArr, int i13, int i14) {
        bArr[i14] = (byte) (i13 >>> 24);
        bArr[i14 + 1] = (byte) (i13 >>> 16);
        bArr[i14 + 2] = (byte) (i13 >>> 8);
        bArr[i14 + 3] = (byte) i13;
    }

    public static void L(l11.j jVar, o2 o2Var) {
        jVar.E0 = o2Var;
    }

    public static final boolean L0(lb0.q prefsManagerPersisted, Activity activity) {
        Intrinsics.checkNotNullParameter(prefsManagerPersisted, "prefsManagerPersisted");
        return qy1.d.d(prefsManagerPersisted, activity, "android.permission.READ_CONTACTS");
    }

    public static void M(c61.i iVar, ro1.c cVar) {
        iVar.N0 = cVar;
    }

    public static final void M0(int i13, vy.m analyticsApi) {
        Intrinsics.checkNotNullParameter(analyticsApi, "analyticsApi");
        analyticsApi.a(i13 < y32.f.UNKNOWN.value() ? a.a.d("invite_sent_", i13) : "invite_sent_unknown");
    }

    public static void N(c61.i iVar, ni1.d dVar) {
        iVar.Q0 = dVar;
    }

    public static void N0(long j13, int i13, byte[] bArr) {
        K0(bArr, (int) (j13 >>> 32), i13);
        K0(bArr, (int) (j13 & 4294967295L), i13 + 4);
    }

    public static void O(l11.j jVar, f0 f0Var) {
        jVar.B0 = f0Var;
    }

    public static byte[] O0(od2.d effect) {
        Intrinsics.checkNotNullParameter(effect, "effect");
        mm.b builder = new mm.b();
        Intrinsics.checkNotNullParameter(effect, "effect");
        Intrinsics.checkNotNullParameter(builder, "builder");
        int f13 = builder.f(effect.f94185a);
        int f14 = builder.f(effect.f94186b);
        int v13 = jk.r.v(effect.f94189e, builder);
        int M = c0.d.M(effect.f94187c, builder);
        ef2.a aVar = ff2.b.f62108f;
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.o(4);
        int i13 = aVar.f58841a;
        switch (i13) {
            case 4:
                Intrinsics.checkNotNullParameter(builder, "builder");
                builder.d(4, M);
                break;
            default:
                Intrinsics.checkNotNullParameter(builder, "builder");
                builder.d(3, M);
                break;
        }
        switch (i13) {
            case 4:
                Intrinsics.checkNotNullParameter(builder, "builder");
                builder.d(3, v13);
                break;
            default:
                Intrinsics.checkNotNullParameter(builder, "builder");
                builder.d(2, v13);
                break;
        }
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.d(1, f14);
        switch (i13) {
            case 4:
                Intrinsics.checkNotNullParameter(builder, "builder");
                builder.d(0, f13);
                break;
            default:
                Intrinsics.checkNotNullParameter(builder, "builder");
                builder.d(0, f13);
                break;
        }
        Intrinsics.checkNotNullParameter(builder, "builder");
        int g13 = builder.g();
        builder.l(g13, 4);
        builder.l(g13, 6);
        builder.l(g13, 8);
        builder.l(g13, 10);
        builder.i(g13);
        byte[] m13 = builder.m();
        Intrinsics.checkNotNullExpressionValue(m13, "sizedByteArray(...)");
        return m13;
    }

    public static void P(s41.f fVar, f0 f0Var) {
        fVar.f111134c1 = f0Var;
    }

    public static u2.q P0(u2.q qVar, n3.a aVar) {
        return qVar.j(new PointerHoverIconModifierElement(aVar, false));
    }

    public static void Q(s41.f fVar, nr0.m mVar) {
        fVar.f111135d1 = mVar;
    }

    public static final void Q0(TextPaint textPaint, float f13) {
        if (Float.isNaN(f13)) {
            return;
        }
        if (f13 < 0.0f) {
            f13 = 0.0f;
        }
        if (f13 > 1.0f) {
            f13 = 1.0f;
        }
        textPaint.setAlpha(Math.round(f13 * 255));
    }

    public static void R(l11.j jVar, zf0.f fVar) {
        jVar.N0 = fVar;
    }

    public static final void R0(int i13) {
        f56747e = i13;
    }

    public static void S(c61.i iVar, rg0.s sVar) {
        iVar.Z0 = sVar;
    }

    public static void S0(File file, byte[] bArr) {
        file.getClass();
        o1 s13 = o1.s(new qk.f[0]);
        bArr.getClass();
        FileOutputStream fileOutputStream = new FileOutputStream(file, s13.contains(qk.f.APPEND));
        try {
            fileOutputStream.write(bArr);
            fileOutputStream.close();
        } catch (Throwable th3) {
            try {
                fileOutputStream.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public static void T(l11.j jVar, rg0.s sVar) {
        jVar.O0 = sVar;
    }

    public static X509Certificate[][] T0(String str) {
        Pair r03;
        RandomAccessFile randomAccessFile = new RandomAccessFile(str, "r");
        try {
            if (randomAccessFile.length() < 22) {
                r03 = null;
            } else {
                r03 = f0.h.r0(randomAccessFile, 0);
                if (r03 == null) {
                    r03 = f0.h.r0(randomAccessFile, 65535);
                }
            }
            if (r03 == null) {
                throw new zzf("Not an APK file: ZIP End of Central Directory record not found in file with " + randomAccessFile.length() + " bytes");
            }
            ByteBuffer byteBuffer = (ByteBuffer) r03.first;
            long longValue = ((Long) r03.second).longValue();
            long j13 = (-20) + longValue;
            if (j13 >= 0) {
                randomAccessFile.seek(j13);
                if (randomAccessFile.readInt() == 1347094023) {
                    throw new zzf("ZIP64 APK not supported");
                }
            }
            f0.h.s0(byteBuffer);
            long j14 = byteBuffer.getInt(byteBuffer.position() + 16) & 4294967295L;
            if (j14 >= longValue) {
                throw new zzf("ZIP Central Directory offset out of range: " + j14 + ". ZIP End of Central Directory offset: " + longValue);
            }
            f0.h.s0(byteBuffer);
            long j15 = longValue;
            if ((byteBuffer.getInt(byteBuffer.position() + 12) & 4294967295L) + j14 != j15) {
                throw new zzf("ZIP Central Directory is not immediately followed by End of Central Directory");
            }
            if (j14 < 32) {
                throw new zzf("APK too small for APK Signing Block. ZIP Central Directory offset: " + j14);
            }
            ByteBuffer allocate = ByteBuffer.allocate(24);
            ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
            allocate.order(byteOrder);
            randomAccessFile.seek(j14 - allocate.capacity());
            randomAccessFile.readFully(allocate.array(), allocate.arrayOffset(), allocate.capacity());
            if (allocate.getLong(8) != 2334950737559900225L || allocate.getLong(16) != 3617552046287187010L) {
                throw new zzf("No APK Signing Block before ZIP Central Directory");
            }
            long j16 = allocate.getLong(0);
            if (j16 < allocate.capacity() || j16 > 2147483639) {
                throw new zzf("APK Signing Block size out of range: " + j16);
            }
            int i13 = (int) (8 + j16);
            long j17 = j14 - i13;
            if (j17 < 0) {
                throw new zzf("APK Signing Block offset out of range: " + j17);
            }
            ByteBuffer allocate2 = ByteBuffer.allocate(i13);
            allocate2.order(byteOrder);
            randomAccessFile.seek(j17);
            randomAccessFile.readFully(allocate2.array(), allocate2.arrayOffset(), allocate2.capacity());
            long j18 = allocate2.getLong(0);
            if (j18 != j16) {
                throw new zzf("APK Signing Block sizes in header and footer do not match: " + j18 + " vs " + j16);
            }
            Pair create = Pair.create(allocate2, Long.valueOf(j17));
            ByteBuffer byteBuffer2 = (ByteBuffer) create.first;
            long longValue2 = ((Long) create.second).longValue();
            if (byteBuffer2.order() != byteOrder) {
                throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
            }
            int capacity = byteBuffer2.capacity() - 24;
            if (capacity < 8) {
                throw new IllegalArgumentException("end < start: " + capacity + " < 8");
            }
            int capacity2 = byteBuffer2.capacity();
            if (capacity > byteBuffer2.capacity()) {
                throw new IllegalArgumentException("end > capacity: " + capacity + " > " + capacity2);
            }
            int limit = byteBuffer2.limit();
            int position = byteBuffer2.position();
            try {
                byteBuffer2.position(0);
                byteBuffer2.limit(capacity);
                byteBuffer2.position(8);
                ByteBuffer slice = byteBuffer2.slice();
                slice.order(byteBuffer2.order());
                byteBuffer2.position(0);
                byteBuffer2.limit(limit);
                byteBuffer2.position(position);
                int i14 = 0;
                while (slice.hasRemaining()) {
                    i14++;
                    if (slice.remaining() < 8) {
                        throw new zzf("Insufficient data to read size of APK Signing Block entry #" + i14);
                    }
                    long j19 = slice.getLong();
                    if (j19 < 4 || j19 > 2147483647L) {
                        throw new zzf("APK Signing Block entry #" + i14 + " size out of range: " + j19);
                    }
                    int i15 = (int) j19;
                    int position2 = slice.position() + i15;
                    if (i15 > slice.remaining()) {
                        throw new zzf("APK Signing Block entry #" + i14 + " size out of range: " + i15 + ", available: " + slice.remaining());
                    }
                    if (slice.getInt() == 1896449818) {
                        X509Certificate[][] d13 = d1(randomAccessFile.getChannel(), new kk.p(X0(i15 - 4, slice), longValue2, j14, j15, byteBuffer));
                        randomAccessFile.close();
                        return d13;
                    }
                    long j23 = j15;
                    slice.position(position2);
                    j15 = j23;
                }
                throw new zzf("No APK Signature Scheme v2 block in APK Signing Block");
            } catch (Throwable th3) {
                byteBuffer2.position(0);
                byteBuffer2.limit(limit);
                byteBuffer2.position(position);
                throw th3;
            }
        } finally {
            try {
                randomAccessFile.close();
            } catch (IOException unused) {
            }
        }
    }

    public static void U(l11.j jVar) {
        jVar.getClass();
    }

    public static int U0(int i13) {
        if (i13 == 1) {
            return 32;
        }
        if (i13 == 2) {
            return 64;
        }
        throw new IllegalArgumentException(a.a.d("Unknown content digest algorthm: ", i13));
    }

    public static void V(xa1.l lVar, n3 n3Var) {
        lVar.E0 = n3Var;
    }

    public static int V0(int i13) {
        if (i13 == 513) {
            return 1;
        }
        if (i13 == 514) {
            return 2;
        }
        if (i13 == 769) {
            return 1;
        }
        switch (i13) {
            case RecyclerViewTypes.VIEW_TYPE_COMMENT_STICKER /* 257 */:
            case RecyclerViewTypes.VIEW_TYPE_SPOTLIGHT_COLLECTIONS /* 259 */:
                return 1;
            case RecyclerViewTypes.VIEW_TYPE_ANKET_INLINE_SURVEY_VIEW /* 258 */:
            case RecyclerViewTypes.VIEW_TYPE_PROTECTED_BOARD_HEADER /* 260 */:
                return 2;
            default:
                throw new IllegalArgumentException("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i13))));
        }
    }

    public static void W(l11.j jVar, il1.a aVar) {
        jVar.L0 = aVar;
    }

    public static String W0(int i13) {
        if (i13 == 1) {
            return "SHA-256";
        }
        if (i13 == 2) {
            return "SHA-512";
        }
        throw new IllegalArgumentException(a.a.d("Unknown content digest algorthm: ", i13));
    }

    public static void X(c61.i iVar, f0 f0Var) {
        iVar.W0 = f0Var;
    }

    public static ByteBuffer X0(int i13, ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        int position = byteBuffer.position();
        int i14 = i13 + position;
        if (i14 < position || i14 > limit) {
            throw new BufferUnderflowException();
        }
        byteBuffer.limit(i14);
        try {
            ByteBuffer slice = byteBuffer.slice();
            slice.order(byteBuffer.order());
            byteBuffer.position(i14);
            return slice;
        } finally {
            byteBuffer.limit(limit);
        }
    }

    public static void Y(c61.i iVar, nu1.a aVar) {
        iVar.K0 = aVar;
    }

    public static ByteBuffer Y0(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() < 4) {
            throw new IOException(a.a.d("Remaining buffer too short to contain length of length-prefixed field. Remaining: ", byteBuffer.remaining()));
        }
        int i13 = byteBuffer.getInt();
        if (i13 < 0) {
            throw new IllegalArgumentException("Negative length");
        }
        if (i13 <= byteBuffer.remaining()) {
            return X0(i13, byteBuffer);
        }
        throw new IOException(a.a.f("Length-prefixed field longer than remaining buffer. Field length: ", i13, ", remaining: ", byteBuffer.remaining()));
    }

    public static void Z(c61.i iVar, gw gwVar) {
        iVar.V0 = gwVar;
    }

    public static void Z0(byte[] bArr, int i13) {
        bArr[1] = (byte) (i13 & 255);
        bArr[2] = (byte) ((i13 >>> 8) & 255);
        bArr[3] = (byte) ((i13 >>> 16) & 255);
        bArr[4] = (byte) (i13 >> 24);
    }

    public static h4 a(h4 h4Var) {
        return h4Var.a(h4Var.size() * 2);
    }

    public static void a0(l11.j jVar, t2 t2Var) {
        jVar.J0 = t2Var;
    }

    public static byte[] a1(ByteBuffer byteBuffer) {
        int i13 = byteBuffer.getInt();
        if (i13 < 0) {
            throw new IOException("Negative length");
        }
        if (i13 > byteBuffer.remaining()) {
            throw new IOException(a.a.f("Underflow while reading length-prefixed value. Length: ", i13, ", available: ", byteBuffer.remaining()));
        }
        byte[] bArr = new byte[i13];
        byteBuffer.get(bArr);
        return bArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016 A[Catch: Exception -> 0x004e, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x004e, blocks: (B:3:0x0007, B:7:0x0016), top: B:2:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Integer b(nm.u r5, java.lang.String r6) {
        /*
            java.lang.String r0 = "<this>"
            java.lang.String r1 = "key"
            int r2 = ads_mobile_sdk.dj1.f4303h
            r2 = 0
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r1)     // Catch: java.lang.Exception -> L4e
            if (r5 != 0) goto Ld
            goto L12
        Ld:
            nm.u r5 = r5.x(r6)     // Catch: java.lang.Exception -> L12
            goto L13
        L12:
            r5 = r2
        L13:
            if (r5 != 0) goto L16
            goto L4e
        L16:
            java.lang.String r6 = "r"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)     // Catch: java.lang.Exception -> L4e
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r1)     // Catch: java.lang.Exception -> L4e
            nm.s r6 = r5.v(r6)     // Catch: java.lang.Exception -> L4e
            int r6 = r6.e()     // Catch: java.lang.Exception -> L4e
            java.lang.String r3 = "g"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)     // Catch: java.lang.Exception -> L4e
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r1)     // Catch: java.lang.Exception -> L4e
            nm.s r3 = r5.v(r3)     // Catch: java.lang.Exception -> L4e
            int r3 = r3.e()     // Catch: java.lang.Exception -> L4e
            java.lang.String r4 = "b"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)     // Catch: java.lang.Exception -> L4e
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r1)     // Catch: java.lang.Exception -> L4e
            nm.s r5 = r5.v(r4)     // Catch: java.lang.Exception -> L4e
            int r5 = r5.e()     // Catch: java.lang.Exception -> L4e
            int r5 = android.graphics.Color.rgb(r6, r3, r5)     // Catch: java.lang.Exception -> L4e
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Exception -> L4e
        L4e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: e0.t.b(nm.u, java.lang.String):java.lang.Integer");
    }

    public static void b0(c61.i iVar, bc2.e eVar) {
        iVar.G0 = eVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0048, code lost:
    
        r12 = V0(r6);
        r13 = V0(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0050, code lost:
    
        if (r12 == 1) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0052, code lost:
    
        if (r13 == 1) goto L141;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.security.cert.X509Certificate[] b1(java.nio.ByteBuffer r19, java.util.HashMap r20, java.security.cert.CertificateFactory r21) {
        /*
            Method dump skipped, instructions count: 644
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e0.t.b1(java.nio.ByteBuffer, java.util.HashMap, java.security.cert.CertificateFactory):java.security.cert.X509Certificate[]");
    }

    public static final b2.n c(o0 o0Var, b2.m mVar, b2.n nVar) {
        boolean z13 = o0Var.f21191a;
        int i13 = z13 ? mVar.f21175a : mVar.f21176b;
        mVar.getClass();
        xk2.n nVar2 = xk2.n.NONE;
        xk2.k a13 = xk2.m.a(nVar2, new b2.t(mVar, i13, 0));
        int i14 = mVar.f21175a;
        int i15 = mVar.f21176b;
        xk2.k a14 = xk2.m.a(nVar2, new b2.s(mVar, i13, z13 ? i15 : i14, o0Var, a13));
        if (1 != nVar.f21182c) {
            return (b2.n) a14.getValue();
        }
        int i16 = mVar.f21177c;
        if (i13 == i16) {
            return nVar;
        }
        b4.m0 m0Var = mVar.f21178d;
        if (((Number) a13.getValue()).intValue() != m0Var.f(i16)) {
            return (b2.n) a14.getValue();
        }
        int i17 = nVar.f21181b;
        long l13 = m0Var.l(i17);
        if (i16 != -1) {
            if (i13 != i16) {
                if (((z13 ? 1 : 0) ^ ((i14 < i15 ? b2.i.NOT_CROSSED : i14 > i15 ? b2.i.CROSSED : b2.i.COLLAPSED) == b2.i.CROSSED ? 1 : 0)) == 0) {
                }
            }
            return mVar.a(i13);
        }
        int i18 = p0.f21640c;
        return (i17 == ((int) (l13 >> 32)) || i17 == ((int) (4294967295L & l13))) ? (b2.n) a14.getValue() : mVar.a(i13);
    }

    public static void c0(c61.i iVar, c3 c3Var) {
        iVar.U0 = c3Var;
    }

    public static byte[][] c1(int[] iArr, kk.h[] hVarArr) {
        long j13;
        int i13;
        int length;
        long j14 = 0;
        int i14 = 0;
        long j15 = 0;
        while (true) {
            j13 = 1048576;
            if (i14 >= 3) {
                break;
            }
            j15 += (hVarArr[i14].zza() + 1048575) / 1048576;
            i14++;
        }
        if (j15 >= 2097151) {
            throw new DigestException(a.a.g("Too many chunks: ", j15));
        }
        byte[][] bArr = new byte[iArr.length][];
        int i15 = 0;
        while (true) {
            length = iArr.length;
            if (i15 >= length) {
                break;
            }
            int i16 = (int) j15;
            byte[] bArr2 = new byte[(U0(iArr[i15]) * i16) + 5];
            bArr2[0] = 90;
            Z0(bArr2, i16);
            bArr[i15] = bArr2;
            i15++;
        }
        byte[] bArr3 = new byte[5];
        bArr3[0] = -91;
        MessageDigest[] messageDigestArr = new MessageDigest[length];
        for (int i17 = 0; i17 < iArr.length; i17++) {
            String W0 = W0(iArr[i17]);
            try {
                messageDigestArr[i17] = MessageDigest.getInstance(W0);
            } catch (NoSuchAlgorithmException e13) {
                throw new RuntimeException(W0.concat(" digest not supported"), e13);
            }
        }
        int i18 = 0;
        int i19 = 0;
        int i23 = 0;
        for (i13 = 3; i18 < i13; i13 = 3) {
            kk.h hVar = hVarArr[i18];
            int i24 = i19;
            long j16 = j14;
            int i25 = i18;
            long zza = hVar.zza();
            while (zza > j14) {
                int min = (int) Math.min(zza, j13);
                Z0(bArr3, min);
                for (int i26 = 0; i26 < length; i26++) {
                    messageDigestArr[i26].update(bArr3);
                }
                try {
                    hVar.a(messageDigestArr, j16, min);
                    int i27 = 0;
                    while (i27 < iArr.length) {
                        int i28 = iArr[i27];
                        byte[] bArr4 = bArr[i27];
                        int U0 = U0(i28);
                        kk.h hVar2 = hVar;
                        MessageDigest messageDigest = messageDigestArr[i27];
                        byte[] bArr5 = bArr3;
                        int digest = messageDigest.digest(bArr4, (i24 * U0) + 5, U0);
                        if (digest != U0) {
                            throw new RuntimeException("Unexpected output size of " + messageDigest.getAlgorithm() + " digest: " + digest);
                        }
                        i27++;
                        hVar = hVar2;
                        bArr3 = bArr5;
                    }
                    kk.h hVar3 = hVar;
                    long j17 = min;
                    j16 += j17;
                    zza -= j17;
                    i24++;
                    hVar = hVar3;
                    j14 = 0;
                    j13 = 1048576;
                } catch (IOException e14) {
                    throw new DigestException(a.a.f("Failed to digest chunk #", i24, " of section #", i23), e14);
                }
            }
            i19 = i24;
            i23++;
            i18 = i25 + 1;
            j14 = 0;
            j13 = 1048576;
        }
        byte[][] bArr6 = new byte[iArr.length][];
        for (int i29 = 0; i29 < iArr.length; i29++) {
            int i33 = iArr[i29];
            byte[] bArr7 = bArr[i29];
            String W02 = W0(i33);
            try {
                bArr6[i29] = MessageDigest.getInstance(W02).digest(bArr7);
            } catch (NoSuchAlgorithmException e15) {
                throw new RuntimeException(W02.concat(" digest not supported"), e15);
            }
        }
        return bArr6;
    }

    public static final void d(CopyOnWriteArrayList copyOnWriteArrayList) {
        int i13 = 0;
        for (Object obj : copyOnWriteArrayList) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                kotlin.collections.f0.p();
                throw null;
            }
            ((ke2.d) obj).f79320b.f79305b = i13;
            i13 = i14;
        }
    }

    public static void d0(c61.i iVar, x10.b bVar) {
        iVar.H0 = bVar;
    }

    public static X509Certificate[][] d1(FileChannel fileChannel, kk.p pVar) {
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            try {
                ByteBuffer Y0 = Y0(pVar.f79888a);
                int i13 = 0;
                while (Y0.hasRemaining()) {
                    i13++;
                    try {
                        arrayList.add(b1(Y0(Y0), hashMap, certificateFactory));
                    } catch (IOException | SecurityException | BufferUnderflowException e13) {
                        throw new SecurityException(a.a.e("Failed to parse/verify signer #", i13, " block"), e13);
                    }
                }
                if (i13 <= 0) {
                    throw new SecurityException("No signers found");
                }
                if (hashMap.isEmpty()) {
                    throw new SecurityException("No content digests found");
                }
                if (hashMap.isEmpty()) {
                    throw new SecurityException("No digests provided");
                }
                long j13 = pVar.f79889b;
                a0 a0Var = new a0(0L, fileChannel, 2, j13);
                long j14 = pVar.f79891d;
                long j15 = pVar.f79890c;
                a0 a0Var2 = new a0(j15, fileChannel, 2, j14 - j15);
                ByteBuffer duplicate = pVar.f79892e.duplicate();
                duplicate.order(ByteOrder.LITTLE_ENDIAN);
                f0.h.s0(duplicate);
                int position = duplicate.position() + 16;
                if (j13 < 0 || j13 > 4294967295L) {
                    throw new IllegalArgumentException(a.a.g("uint32 value of out range: ", j13));
                }
                duplicate.putInt(duplicate.position() + position, (int) j13);
                u6 u6Var = new u6(duplicate);
                int size = hashMap.size();
                int[] iArr = new int[size];
                Iterator it = hashMap.keySet().iterator();
                int i14 = 0;
                while (it.hasNext()) {
                    iArr[i14] = ((Integer) it.next()).intValue();
                    i14++;
                }
                try {
                    byte[][] c13 = c1(iArr, new kk.h[]{a0Var, a0Var2, u6Var});
                    for (int i15 = 0; i15 < size; i15++) {
                        int i16 = iArr[i15];
                        if (!MessageDigest.isEqual((byte[]) hashMap.get(Integer.valueOf(i16)), c13[i15])) {
                            throw new SecurityException(W0(i16).concat(" digest of contents did not verify"));
                        }
                    }
                    return (X509Certificate[][]) arrayList.toArray(new X509Certificate[arrayList.size()][]);
                } catch (DigestException e14) {
                    throw new SecurityException("Failed to compute digest(s) of contents", e14);
                }
            } catch (IOException e15) {
                throw new SecurityException("Failed to read list of signers", e15);
            }
        } catch (CertificateException e16) {
            throw new RuntimeException("Failed to obtain X.509 CertificateFactory", e16);
        }
    }

    public static final b2.n e(b2.m mVar, boolean z13, boolean z14, b2.p pVar) {
        long h10;
        long j13;
        int i13 = z14 ? mVar.f21175a : mVar.f21176b;
        mVar.getClass();
        int i14 = pVar.f21196a;
        b4.m0 m0Var = mVar.f21178d;
        switch (i14) {
            case 0:
                String str = m0Var.f21615a.f21603a.f21571a;
                h10 = b7.c.h(g1.s(i13, str), g1.r(i13, str));
                break;
            default:
                h10 = m0Var.l(i13);
                break;
        }
        if (z13 ^ z14) {
            int i15 = p0.f21640c;
            j13 = h10 >> 32;
        } else {
            int i16 = p0.f21640c;
            j13 = 4294967295L & h10;
        }
        return mVar.a((int) j13);
    }

    public static void e0(c61.i iVar, b0 b0Var) {
        iVar.X0 = b0Var;
    }

    public static final ac.b f(com.airbnb.lottie.h hVar, int i13, i2.o oVar, int i14) {
        i2.s sVar = (i2.s) oVar;
        sVar.X(683659508);
        int i15 = (i14 & 64) != 0 ? 1 : i13;
        ac.n nVar = ac.n.Immediately;
        if (i15 <= 0) {
            throw new IllegalArgumentException(a.a.e("Iterations must be a positive number (", i15, ").").toString());
        }
        if (Float.isInfinite(1.0f) || Float.isNaN(1.0f)) {
            throw new IllegalArgumentException(cb.h("Speed must be a finite number. It is ", 1.0f, ".").toString());
        }
        sVar.X(2024497114);
        sVar.X(-610207850);
        Object J2 = sVar.J();
        am.d dVar = i2.n.f71185a;
        if (J2 == dVar) {
            J2 = new ac.j();
            sVar.g0(J2);
        }
        ac.b bVar = (ac.b) J2;
        sVar.r(false);
        sVar.r(false);
        sVar.X(-180606964);
        Object J3 = sVar.J();
        if (J3 == dVar) {
            J3 = bs1.c.u1(true, y3.f71400a);
            sVar.g0(J3);
        }
        q1 q1Var = (q1) J3;
        sVar.r(false);
        sVar.X(-180606834);
        Context context = (Context) sVar.m(AndroidCompositionLocals_androidKt.f17455b);
        n1 n1Var = jc.g.f75394a;
        float f13 = 1.0f / Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
        sVar.r(false);
        Object[] objArr = {hVar, true, null, Float.valueOf(f13), Integer.valueOf(i15)};
        ac.a aVar = new ac.a(true, true, bVar, hVar, i15, false, f13, nVar, false, q1Var, null);
        CoroutineContext h10 = sVar.f71266b.h();
        boolean z13 = false;
        for (Object obj : Arrays.copyOf(objArr, 5)) {
            z13 |= sVar.h(obj);
        }
        Object J4 = sVar.J();
        if (z13 || J4 == dVar) {
            sVar.g0(new f1(h10, aVar));
        }
        sVar.r(false);
        return bVar;
    }

    public static void f0(l11.j jVar, p2 p2Var) {
        jVar.F0 = p2Var;
    }

    public static final void g(GestaltAvatar gestaltAvatar, Function1 init) {
        Intrinsics.checkNotNullParameter(gestaltAvatar, "<this>");
        Intrinsics.checkNotNullParameter(init, "init");
        rl1.c0 c0Var = new rl1.c0(gestaltAvatar.O2());
        init.invoke(c0Var);
        gestaltAvatar.H2(new ql1.k(c0Var, 3));
    }

    public static void g0(c61.i iVar, c6 c6Var) {
        iVar.T0 = c6Var;
    }

    public static final gm1.b h(GestaltButton gestaltButton, l82.c eventIntake) {
        kc1.d convert = kc1.d.f79148o;
        Intrinsics.checkNotNullParameter(gestaltButton, "<this>");
        Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
        Intrinsics.checkNotNullParameter(convert, "convert");
        return gestaltButton.e(new la1.k(15, convert, eventIntake));
    }

    public static void h0(s41.f fVar, i2 i2Var) {
        fVar.Y0 = i2Var;
    }

    public static final Bundle i() {
        return new Bundle(0);
    }

    public static void i0(c61.i iVar, nx.o0 o0Var) {
        iVar.L0 = o0Var;
    }

    public static final Bundle j(kotlin.Pair... pairArr) {
        Bundle bundle = new Bundle(pairArr.length);
        for (kotlin.Pair pair : pairArr) {
            String str = (String) pair.f80346a;
            Object obj = pair.f80347b;
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Byte) {
                bundle.putByte(str, ((Number) obj).byteValue());
            } else if (obj instanceof Character) {
                bundle.putChar(str, ((Character) obj).charValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Number) obj).doubleValue());
            } else if (obj instanceof Float) {
                bundle.putFloat(str, ((Number) obj).floatValue());
            } else if (obj instanceof Integer) {
                bundle.putInt(str, ((Number) obj).intValue());
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Number) obj).longValue());
            } else if (obj instanceof Short) {
                bundle.putShort(str, ((Number) obj).shortValue());
            } else if (obj instanceof Bundle) {
                bundle.putBundle(str, (Bundle) obj);
            } else if (obj instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) obj);
            } else if (obj instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) obj);
            } else if (obj instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) obj);
            } else if (obj instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) obj);
            } else if (obj instanceof char[]) {
                bundle.putCharArray(str, (char[]) obj);
            } else if (obj instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) obj);
            } else if (obj instanceof float[]) {
                bundle.putFloatArray(str, (float[]) obj);
            } else if (obj instanceof int[]) {
                bundle.putIntArray(str, (int[]) obj);
            } else if (obj instanceof long[]) {
                bundle.putLongArray(str, (long[]) obj);
            } else if (obj instanceof short[]) {
                bundle.putShortArray(str, (short[]) obj);
            } else if (obj instanceof Object[]) {
                Class<?> componentType = obj.getClass().getComponentType();
                Intrinsics.f(componentType);
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    bundle.putParcelableArray(str, (Parcelable[]) obj);
                } else if (String.class.isAssignableFrom(componentType)) {
                    bundle.putStringArray(str, (String[]) obj);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    bundle.putCharSequenceArray(str, (CharSequence[]) obj);
                } else {
                    if (!Serializable.class.isAssignableFrom(componentType)) {
                        throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + str + '\"');
                    }
                    bundle.putSerializable(str, (Serializable) obj);
                }
            } else if (obj instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) obj);
            } else if (obj instanceof IBinder) {
                bundle.putBinder(str, (IBinder) obj);
            } else if (obj instanceof Size) {
                bundle.putSize(str, (Size) obj);
            } else {
                if (!(obj instanceof SizeF)) {
                    throw new IllegalArgumentException("Illegal value type " + obj.getClass().getCanonicalName() + " for key \"" + str + '\"');
                }
                bundle.putSizeF(str, (SizeF) obj);
            }
        }
        return bundle;
    }

    public static void j0(xa1.l lVar) {
        lVar.getClass();
    }

    public static final b2.n k(b2.n nVar, b2.m mVar, int i13) {
        return new b2.n(mVar.f21178d.a(i13), i13, nVar.f21182c);
    }

    public static void k0(wq1.f fVar, z zVar) {
        fVar.f130829v0 = zVar;
    }

    public static byte l(long j13) {
        bf.b.g(j13, "out of range: %s", (j13 >> 8) == 0);
        return (byte) j13;
    }

    public static void l0(xa1.l lVar, so.n3 n3Var) {
        lVar.D0 = n3Var;
    }

    public static void m(File file) {
        file.getClass();
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile == null) {
            return;
        }
        parentFile.mkdirs();
        if (parentFile.isDirectory()) {
            return;
        }
        throw new IOException("Unable to create parent directories of " + file);
    }

    public static void m0(c61.i iVar, uk1.e eVar) {
        iVar.F0 = eVar;
    }

    public static final Object n(Function0 block, String description) {
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(block, "block");
        while (EGL14.eglGetError() != 12288) {
        }
        Object invoke = block.invoke();
        int eglGetError = EGL14.eglGetError();
        if (eglGetError == 12288) {
            return invoke;
        }
        String eGLErrorString = GLUtils.getEGLErrorString(eglGetError);
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        StackTraceElement stackTraceElement = Intrinsics.d(stackTrace[3].getMethodName(), "eglCatch$default") ? stackTrace[4] : stackTrace[3];
        String str = stackTraceElement.getClassName() + '.' + stackTraceElement.getMethodName() + " at\n" + stackTraceElement.getFileName() + ':' + stackTraceElement.getLineNumber();
        StringBuilder w13 = a.a.w("EGL error", description.length() == 0 ? "" : s1.b(" in '", description, '\''), ": '", eGLErrorString, "'. Stacktrace: ");
        w13.append(str);
        throw new Exception(w13.toString());
    }

    public static void n0(hc1.i iVar, uk1.e eVar) {
        iVar.f68720j0 = eVar;
    }

    public static void o(Canvas canvas, boolean z13) {
        Method method;
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 29) {
            if (z13) {
                ua.a.b(canvas);
                return;
            } else {
                ua.a.a(canvas);
                return;
            }
        }
        if (i13 == 28) {
            throw new IllegalStateException("This method doesn't work on Pie!");
        }
        if (!f56746d) {
            try {
                Method declaredMethod = Canvas.class.getDeclaredMethod("insertReorderBarrier", new Class[0]);
                f56744b = declaredMethod;
                declaredMethod.setAccessible(true);
                Method declaredMethod2 = Canvas.class.getDeclaredMethod("insertInorderBarrier", new Class[0]);
                f56745c = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            f56746d = true;
        }
        if (z13) {
            try {
                Method method2 = f56744b;
                if (method2 != null) {
                    method2.invoke(canvas, new Object[0]);
                }
            } catch (IllegalAccessException unused2) {
                return;
            } catch (InvocationTargetException e13) {
                throw new RuntimeException(e13.getCause());
            }
        }
        if (z13 || (method = f56745c) == null) {
            return;
        }
        method.invoke(canvas, new Object[0]);
    }

    public static void o0(k91.j jVar, uk1.e eVar) {
        jVar.f78837j0 = eVar;
    }

    public static void p(po2.d dVar, no2.b serializer, Object obj) {
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        if (serializer.a().b()) {
            dVar.k(serializer, obj);
        } else if (obj == null) {
            dVar.s();
        } else {
            dVar.getClass();
            dVar.k(serializer, obj);
        }
    }

    public static void p0(s41.f fVar, uk1.e eVar) {
        fVar.Z0 = eVar;
    }

    public static final Rect q(TextPaint textPaint, CharSequence charSequence, int i13, int i14) {
        int i15 = i13;
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            if (spanned.nextSpanTransition(i15 - 1, i14, MetricAffectingSpan.class) != i14) {
                Rect rect = new Rect();
                Rect rect2 = new Rect();
                TextPaint textPaint2 = new TextPaint();
                while (i15 < i14) {
                    int nextSpanTransition = spanned.nextSpanTransition(i15, i14, MetricAffectingSpan.class);
                    MetricAffectingSpan[] metricAffectingSpanArr = (MetricAffectingSpan[]) spanned.getSpans(i15, nextSpanTransition, MetricAffectingSpan.class);
                    textPaint2.set(textPaint);
                    for (MetricAffectingSpan metricAffectingSpan : metricAffectingSpanArr) {
                        if (spanned.getSpanStart(metricAffectingSpan) != spanned.getSpanEnd(metricAffectingSpan)) {
                            metricAffectingSpan.updateMeasureState(textPaint2);
                        }
                    }
                    if (Build.VERSION.SDK_INT >= 29) {
                        c4.p.a(textPaint2, charSequence, i15, nextSpanTransition, rect2);
                    } else {
                        textPaint2.getTextBounds(charSequence.toString(), i15, nextSpanTransition, rect2);
                    }
                    rect.right = rect2.width() + rect.right;
                    rect.top = Math.min(rect.top, rect2.top);
                    rect.bottom = Math.max(rect.bottom, rect2.bottom);
                    i15 = nextSpanTransition;
                }
                return rect;
            }
        }
        Rect rect3 = new Rect();
        if (Build.VERSION.SDK_INT >= 29) {
            c4.p.a(textPaint, charSequence, i15, i14, rect3);
        } else {
            textPaint.getTextBounds(charSequence.toString(), i15, i14, rect3);
        }
        return rect3;
    }

    public static void q0(wq1.f fVar, uk1.e eVar) {
        fVar.f130828u0 = eVar;
    }

    public static final nt1.a r(MediaFormat mediaFormat) {
        Intrinsics.checkNotNullParameter(mediaFormat, "<this>");
        return new nt1.a(mediaFormat);
    }

    public static void r0(xa1.l lVar, uk1.e eVar) {
        lVar.f134458z0 = eVar;
    }

    public static Handler s() {
        if (f56743a != null) {
            return f56743a;
        }
        synchronized (t.class) {
            try {
                if (f56743a == null) {
                    f56743a = bf.b.z(Looper.getMainLooper());
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return f56743a;
    }

    public static void s0(l11.j jVar, r8 r8Var) {
        jVar.M0 = r8Var;
    }

    public static ArrayList t(int i13, int[] stack, String[] pathNames, int[] pathIndices) {
        String str;
        Intrinsics.checkNotNullParameter(stack, "stack");
        Intrinsics.checkNotNullParameter(pathNames, "pathNames");
        Intrinsics.checkNotNullParameter(pathIndices, "pathIndices");
        ArrayList arrayList = new ArrayList();
        for (int i14 = 0; i14 < i13; i14++) {
            int i15 = stack[i14];
            if (i15 == 1 || i15 == 2) {
                arrayList.add(Integer.valueOf(pathIndices[i14]));
            } else if ((i15 == 3 || i15 == 4 || i15 == 5) && (str = pathNames[i14]) != null) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    public static void t0(l11.j jVar, k11.k kVar) {
        jVar.P0 = kVar;
    }

    public static final j0 u(i0 proto, vm2.f nameResolver, vm2.i typeTable, boolean z13, boolean z14, boolean z15) {
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        zm2.s propertySignature = wm2.l.f130417d;
        Intrinsics.checkNotNullExpressionValue(propertySignature, "propertySignature");
        wm2.f fVar = (wm2.f) ao2.m0.w(proto, propertySignature);
        if (fVar == null) {
            return null;
        }
        if (z13) {
            zm2.k kVar = xm2.j.f135411a;
            xm2.d b13 = xm2.j.b(proto, nameResolver, typeTable, z15);
            if (b13 == null) {
                return null;
            }
            return rm2.i0.g(b13);
        }
        if (!z14 || (fVar.f130374b & 2) != 2) {
            return null;
        }
        wm2.d dVar = fVar.f130376d;
        Intrinsics.checkNotNullExpressionValue(dVar, "getSyntheticMethod(...)");
        return rm2.i0.h(nameResolver, dVar);
    }

    public static void u0(c61.i iVar, e3 e3Var) {
        iVar.R0 = e3Var;
    }

    public static void v0(c61.i iVar, f3 f3Var) {
        iVar.S0 = f3Var;
    }

    public static ah2.f w(pg2.s endpoint, Integer num, Function0 headersProvider, Throwable th3) {
        Long h03;
        Intrinsics.checkNotNullParameter(endpoint, "endpoint");
        Intrinsics.checkNotNullParameter(headersProvider, "headersProvider");
        if (num == null) {
            if (th3 == null) {
                th3 = new IllegalStateException("Unknown execution error");
            }
            return new ah2.b(true, th3);
        }
        if (num.intValue() == 200) {
            return ah2.c.f15196e;
        }
        if (num.intValue() == 413) {
            return ah2.c.f15195d;
        }
        if (num.intValue() != 429) {
            return ah2.f.f15200b.f(num.intValue()) ? new ah2.a(num.intValue()) : new ah2.d(num.intValue());
        }
        String str = (String) ((Map) headersProvider.invoke()).get("Retry-After");
        return new ah2.e(endpoint, (str == null || (h03 = StringsKt.h0(str)) == null) ? null : Long.valueOf(h03.longValue() * 1000));
    }

    public static void w0(l11.j jVar, s2 s2Var) {
        jVar.I0 = s2Var;
    }

    public static final a4 x(wy0 wy0Var, String boardId) {
        boolean booleanValue;
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        v7 a13 = ew.a(boardId);
        if (a13 == null) {
            n8.f40341a.getClass();
            Boolean a14 = n8.a(wy0Var, boardId);
            if (a14 != null) {
                booleanValue = a14.booleanValue();
            }
            return a4.BOARD_OTHERS;
        }
        Boolean bool = null;
        if (wy0Var != null) {
            wy0 k13 = a13.k1();
            String uid = k13 != null ? k13.getUid() : null;
            if (uid == null) {
                uid = "";
            }
            bool = Boolean.valueOf(dl2.b.S1(wy0Var, uid));
        }
        booleanValue = com.bumptech.glide.d.o0(bool);
        if (booleanValue) {
            return a4.BOARD_SELF;
        }
        return a4.BOARD_OTHERS;
    }

    public static void x0(c61.i iVar, vg1.a aVar) {
        iVar.I0 = aVar;
    }

    public static void y(xa1.l lVar, mr1.a aVar) {
        lVar.A0 = aVar;
    }

    public static void y0(l11.j jVar, q2 q2Var) {
        jVar.G0 = q2Var;
    }

    public static void z(k91.j jVar, lu1.b bVar) {
        jVar.f78838k0 = bVar;
    }

    public static void z0(k91.j jVar, androidx.appcompat.widget.x xVar) {
        jVar.f78839l0 = xVar;
    }
}
