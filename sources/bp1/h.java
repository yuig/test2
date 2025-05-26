package bp1;

import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.os.Build;
import android.view.View;
import androidx.camera.core.ImageProcessingUtil;
import androidx.camera.core.internal.utils.ImageUtil$CodecFailedException;
import b22.l;
import b3.w;
import c0.m0;
import com.google.android.gms.ads.RequestConfiguration;
import com.pinterest.api.model.sr;
import com.pinterest.api.model.v7;
import com.pinterest.api.model.wy0;
import e0.n;
import e0.q;
import i2.y2;
import i51.v;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import jk.r;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.f0;
import kotlin.collections.g0;
import kotlin.collections.k0;
import kotlin.collections.y0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import lb.l0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ql2.k;
import ql2.s;
import qo2.b0;
import qo2.c0;
import s3.m;
import s3.n0;
import t3.s1;
import u2.p;
import wa2.i;
import z40.d0;

/* loaded from: classes5.dex */
public abstract class h {
    public static final void E(y2 y2Var, i2.f fVar, int i13) {
        while (true) {
            int i14 = y2Var.f71397v;
            if (i13 > i14 && i13 < y2Var.f71396u) {
                return;
            }
            if (i14 == 0 && i13 == 0) {
                return;
            }
            y2Var.G();
            if (l0.m(y2Var.f71377b, y2Var.p(y2Var.f71397v))) {
                fVar.h();
            }
            y2Var.i();
        }
    }

    public static final Object F(LinkedHashMap linkedHashMap) {
        List list = (List) linkedHashMap.get(null);
        if (list == null) {
            return null;
        }
        Object z13 = k0.z(list);
        if (list.isEmpty()) {
            linkedHashMap.remove(null);
        }
        return z13;
    }

    public static final View G(m mVar) {
        if (((p) mVar).f120042a.f120054m) {
            return (View) n0.a(com.bumptech.glide.c.U0(mVar));
        }
        r.y("Cannot get View because the Modifier node is not currently attached.");
        throw null;
    }

    public static void H(Throwable th3) {
        if (th3 instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th3);
        }
        if (th3 instanceof ThreadDeath) {
            throw ((ThreadDeath) th3);
        }
        if (th3 instanceof LinkageError) {
            throw ((LinkageError) th3);
        }
    }

    public static x31.c J(List filters, v vVar) {
        Intrinsics.checkNotNullParameter(filters, "filters");
        List list = filters;
        ArrayList arrayList = new ArrayList(g0.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((u41.e) vVar.invoke((x31.a) it.next()));
        }
        return new x31.c(new x31.b(new u41.a(arrayList), 0));
    }

    public static byte[] K(c0.n0 n0Var, Rect rect, int i13, int i14) {
        if (n0Var.S0() != 35) {
            throw new IllegalArgumentException("Incorrect image format of the input image proxy: " + n0Var.S0());
        }
        m0 m0Var = n0Var.W0()[0];
        m0 m0Var2 = n0Var.W0()[1];
        m0 m0Var3 = n0Var.W0()[2];
        ByteBuffer l13 = m0Var.l();
        ByteBuffer l14 = m0Var2.l();
        ByteBuffer l15 = m0Var3.l();
        l13.rewind();
        l14.rewind();
        l15.rewind();
        int remaining = l13.remaining();
        byte[] bArr = new byte[((n0Var.i() * n0Var.j()) / 2) + remaining];
        int i15 = 0;
        for (int i16 = 0; i16 < n0Var.i(); i16++) {
            l13.get(bArr, i15, n0Var.j());
            i15 += n0Var.j();
            l13.position(Math.min(remaining, m0Var.m() + (l13.position() - n0Var.j())));
        }
        int i17 = n0Var.i() / 2;
        int j13 = n0Var.j() / 2;
        int m13 = m0Var3.m();
        int m14 = m0Var2.m();
        int n13 = m0Var3.n();
        int n14 = m0Var2.n();
        byte[] bArr2 = new byte[m13];
        byte[] bArr3 = new byte[m14];
        for (int i18 = 0; i18 < i17; i18++) {
            l15.get(bArr2, 0, Math.min(m13, l15.remaining()));
            l14.get(bArr3, 0, Math.min(m14, l14.remaining()));
            int i19 = 0;
            int i23 = 0;
            for (int i24 = 0; i24 < j13; i24++) {
                int i25 = i15 + 1;
                bArr[i15] = bArr2[i19];
                i15 += 2;
                bArr[i25] = bArr3[i23];
                i19 += n13;
                i23 += n14;
            }
        }
        YuvImage yuvImage = new YuvImage(bArr, 17, n0Var.j(), n0Var.i(), null);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        e0.r[] rVarArr = e0.p.f56724c;
        n nVar = new n(ByteOrder.BIG_ENDIAN);
        String valueOf = String.valueOf(1);
        ArrayList arrayList = nVar.f56722a;
        nVar.c("Orientation", valueOf, arrayList);
        nVar.c("XResolution", "72/1", arrayList);
        nVar.c("YResolution", "72/1", arrayList);
        nVar.c("ResolutionUnit", String.valueOf(2), arrayList);
        nVar.c("YCbCrPositioning", String.valueOf(1), arrayList);
        nVar.c("Make", Build.MANUFACTURER, arrayList);
        nVar.c("Model", Build.MODEL, arrayList);
        if (n0Var.H1() != null) {
            n0Var.H1().c(nVar);
        }
        nVar.d(i14);
        nVar.c("ImageWidth", String.valueOf(n0Var.j()), arrayList);
        nVar.c("ImageLength", String.valueOf(n0Var.i()), arrayList);
        ArrayList list = Collections.list(new e0.m(nVar));
        if (!((Map) list.get(1)).isEmpty()) {
            nVar.b("ExposureProgram", String.valueOf(0), list);
            nVar.b("ExifVersion", "0230", list);
            nVar.b("ComponentsConfiguration", "1,2,3,0", list);
            nVar.b("MeteringMode", String.valueOf(0), list);
            nVar.b("LightSource", String.valueOf(0), list);
            nVar.b("FlashpixVersion", "0100", list);
            nVar.b("FocalPlaneResolutionUnit", String.valueOf(2), list);
            nVar.b("FileSource", String.valueOf(3), list);
            nVar.b("SceneType", String.valueOf(1), list);
            nVar.b("CustomRendered", String.valueOf(0), list);
            nVar.b("SceneCaptureType", String.valueOf(0), list);
            nVar.b("Contrast", String.valueOf(0), list);
            nVar.b("Saturation", String.valueOf(0), list);
            nVar.b("Sharpness", String.valueOf(0), list);
        }
        if (!((Map) list.get(2)).isEmpty()) {
            nVar.b("GPSVersionID", "2300", list);
            nVar.b("GPSSpeedRef", "K", list);
            nVar.b("GPSTrackRef", RequestConfiguration.MAX_AD_CONTENT_RATING_T, list);
            nVar.b("GPSImgDirectionRef", RequestConfiguration.MAX_AD_CONTENT_RATING_T, list);
            nVar.b("GPSDestBearingRef", RequestConfiguration.MAX_AD_CONTENT_RATING_T, list);
            nVar.b("GPSDestDistanceRef", "K", list);
        }
        if (yuvImage.compressToJpeg(rect == null ? new Rect(0, 0, n0Var.j(), n0Var.i()) : rect, i13, new q(byteArrayOutputStream, new e0.p(nVar.f56723b, list)))) {
            return byteArrayOutputStream.toByteArray();
        }
        k0.b bVar = k0.b.ENCODE_FAILED;
        throw new ImageUtil$CodecFailedException("YuvImage failed to encode jpeg.");
    }

    public static final String L(String str, XmlResourceParser xmlResourceParser) {
        for (int i13 = 0; i13 < xmlResourceParser.getAttributeCount(); i13++) {
            if (xmlResourceParser.getAttributeName(i13).equals(str)) {
                return xmlResourceParser.getAttributeValue(i13);
            }
        }
        return null;
    }

    public static final void M(XmlResourceParser xmlResourceParser) {
        int i13 = 1;
        while (i13 != 0) {
            int next = xmlResourceParser.next();
            if (next == 2) {
                i13++;
            } else if (next == 3) {
                i13--;
            }
        }
    }

    public static final b0 a(String name, no2.b primitiveSerializer) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(primitiveSerializer, "primitiveSerializer");
        return new b0(name, new c0(primitiveSerializer));
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x015b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(int r29, int r30, m1.c1 r31, p1.h r32, p1.j r33, p1.x0 r34, r1.c r35, r1.p0 r36, i2.o r37, u2.q r38, kotlin.jvm.functions.Function1 r39, boolean r40, boolean r41) {
        /*
            Method dump skipped, instructions count: 696
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: bp1.h.b(int, int, m1.c1, p1.h, p1.j, p1.x0, r1.c, r1.p0, i2.o, u2.q, kotlin.jvm.functions.Function1, boolean, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x023a A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(int r29, int r30, m1.c1 r31, p1.h r32, p1.j r33, p1.x0 r34, r1.c r35, r1.p0 r36, i2.o r37, u2.q r38, kotlin.jvm.functions.Function1 r39, boolean r40, boolean r41) {
        /*
            Method dump skipped, instructions count: 689
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: bp1.h.c(int, int, m1.c1, p1.h, p1.j, p1.x0, r1.c, r1.p0, i2.o, u2.q, kotlin.jvm.functions.Function1, boolean, boolean):void");
    }

    public static void d(qa2.n nVar, l viewType, boolean z13) {
        Intrinsics.checkNotNullParameter(nVar, "<this>");
        Intrinsics.checkNotNullParameter(viewType, "viewType");
        int i13 = h31.e.f66810a[viewType.ordinal()];
        if (i13 == 1) {
            i iVar = nVar.f103320a;
            iVar.f128797t = true;
            iVar.f128791q = true;
            iVar.f128793r = false;
            return;
        }
        if (i13 == 2) {
            i iVar2 = nVar.f103320a;
            iVar2.f128797t = false;
            iVar2.f128791q = false;
            iVar2.f128793r = true;
            return;
        }
        if (i13 != 3) {
            return;
        }
        i iVar3 = nVar.f103320a;
        iVar3.f128797t = z13;
        iVar3.f128791q = false;
        iVar3.f128793r = false;
    }

    public static qa2.e e(y32.f sendShareSurface, boolean z13) {
        Intrinsics.checkNotNullParameter(sendShareSurface, "sendShareSurface");
        Intrinsics.checkNotNullParameter("user_pins", "trafficSource");
        return new qa2.e(new wa2.m(2138021286, Integer.MAX_VALUE, 1021, null, null, sendShareSurface, null, null, null, null, null, null, "user_pins", !z13, true, true, true, false, true, true, false, false, false, false, false, z13, false, false, false, false, false, z13, false, false, false, false, false, false, false, false));
    }

    public static Bitmap h(c0.n0 n0Var) {
        int S0 = n0Var.S0();
        if (S0 == 1) {
            Bitmap createBitmap = Bitmap.createBitmap(n0Var.j(), n0Var.i(), Bitmap.Config.ARGB_8888);
            n0Var.W0()[0].l().rewind();
            ImageProcessingUtil.e(createBitmap, n0Var.W0()[0].l(), n0Var.W0()[0].m());
            return createBitmap;
        }
        if (S0 == 35) {
            return ImageProcessingUtil.b(n0Var);
        }
        if (S0 != 256 && S0 != 4101) {
            throw new IllegalArgumentException("Incorrect image format of the input image proxy: " + n0Var.S0() + ", only ImageFormat.YUV_420_888 and PixelFormat.RGBA_8888 are supported");
        }
        if (!u(n0Var.S0())) {
            throw new IllegalArgumentException("Incorrect image format of the input image proxy: " + n0Var.S0());
        }
        ByteBuffer l13 = n0Var.W0()[0].l();
        int capacity = l13.capacity();
        byte[] bArr = new byte[capacity];
        l13.rewind();
        l13.get(bArr);
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, capacity, null);
        if (decodeByteArray != null) {
            return decodeByteArray;
        }
        throw new UnsupportedOperationException("Decode jpeg byte array failed");
    }

    public static void i(dh2.e eVar, yg2.d metadata) {
        dh2.c callback = dh2.c.f55019k;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        Intrinsics.checkNotNullParameter(callback, "callback");
        eVar.f55027b.a(metadata, callback);
    }

    public static LinkedHashMap j(ef2.b table) {
        md2.b bVar;
        Intrinsics.checkNotNullParameter(table, "table");
        int b13 = table.b(4);
        IntRange q13 = s.q(0, b13 != 0 ? table.f(b13) : 0);
        int a13 = y0.a(g0.q(q13, 10));
        if (a13 < 16) {
            a13 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(a13);
        k it = q13.iterator();
        while (it.f104109c) {
            int b14 = it.b();
            ef2.b obj = new ef2.b();
            Intrinsics.checkNotNullParameter(obj, "obj");
            int b15 = table.b(4);
            if (b15 == 0) {
                throw new IndexOutOfBoundsException(a.a.e("Index out of range: ", b14, ", vector entries is empty"));
            }
            int a14 = table.a((b14 * 4) + table.e(b15));
            ByteBuffer _bb = table.f87567b;
            Intrinsics.checkNotNullExpressionValue(_bb, "bb");
            Intrinsics.checkNotNullParameter(_bb, "_bb");
            Intrinsics.checkNotNullParameter(_bb, "_bb");
            obj.c(a14, _bb);
            int b16 = obj.b(4);
            if (b16 == 0) {
                throw new AssertionError("No value for (required) field name");
            }
            String d2 = obj.d(b16 + obj.f87566a);
            ef2.b obj2 = new ef2.b();
            Intrinsics.checkNotNullParameter(obj2, "obj");
            int b17 = obj.b(6);
            if (b17 == 0) {
                throw new AssertionError("No value for (required) field asset");
            }
            int a15 = obj.a(b17 + obj.f87566a);
            ByteBuffer _bb2 = obj.f87567b;
            Intrinsics.checkNotNullExpressionValue(_bb2, "bb");
            Intrinsics.checkNotNullParameter(_bb2, "_bb");
            Intrinsics.checkNotNullParameter(_bb2, "_bb");
            obj2.c(a15, _bb2);
            int b18 = obj2.b(6);
            if (b18 == 0) {
                throw new AssertionError("No value for (required) field path");
            }
            String d13 = obj2.d(b18 + obj2.f87566a);
            ef2.b obj3 = new ef2.b();
            Intrinsics.checkNotNullParameter(obj3, "obj");
            int b19 = obj2.b(4);
            if (b19 == 0) {
                throw new AssertionError("No value for (required) field kind");
            }
            int a16 = obj2.a(b19 + obj2.f87566a);
            ByteBuffer _bb3 = obj2.f87567b;
            Intrinsics.checkNotNullExpressionValue(_bb3, "bb");
            Intrinsics.checkNotNullParameter(_bb3, "_bb");
            Intrinsics.checkNotNullParameter(_bb3, "_bb");
            obj3.c(a16, _bb3);
            int b23 = obj3.b(4);
            int i13 = b23 != 0 ? obj3.f87567b.getInt(b23 + obj3.f87566a) : 0;
            if (i13 == 0) {
                bVar = md2.b.Image;
            } else {
                if (i13 != 1) {
                    throw new IllegalArgumentException("Unknown asset type: " + obj3);
                }
                bVar = md2.b.Lut3D;
            }
            linkedHashMap.put(d2, new md2.a(bVar, d13));
        }
        return linkedHashMap;
    }

    public static x31.a k(x31.p pVar, int i13) {
        Object obj;
        Intrinsics.checkNotNullParameter(pVar, "<this>");
        Iterator it = pVar.f131638d.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (i13 == ((x31.a) obj).a().value()) {
                break;
            }
        }
        x31.a aVar = (x31.a) obj;
        if (aVar != null) {
            return aVar;
        }
        throw new IllegalStateException(a.a.d("Filter not found for ID: ", i13));
    }

    public static h11.a l(v7 board) {
        List list;
        List y03;
        Intrinsics.checkNotNullParameter(board, "board");
        String v13 = kh2.d.v(board);
        List I0 = board.I0();
        int i13 = 0;
        if (v13.length() <= 0 && ((v13 = (String) CollectionsKt.U(0, kh2.d.h1(board))) == null || v13.length() == 0)) {
            List n13 = board.n1();
            v13 = n13 != null ? (String) CollectionsKt.U(0, n13) : null;
        }
        Map d13 = board.d1();
        if (d13 != null && (list = (List) d13.get("60x60")) != null && (y03 = CollectionsKt.y0(list, 3)) != null) {
            for (Object obj : y03) {
                int i14 = i13 + 1;
                if (i13 < 0) {
                    f0.p();
                    throw null;
                }
                sr srVar = (sr) obj;
                if (i13 == 0) {
                    srVar.getClass();
                } else if (i13 == 1) {
                    srVar.getClass();
                } else if (i13 == 2) {
                    srVar.getClass();
                }
                i13 = i14;
            }
        }
        String uid = board.getUid();
        Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
        String j13 = board.j1();
        if (j13 == null) {
            j13 = "";
        }
        Boolean g13 = board.g1();
        Intrinsics.checkNotNullExpressionValue(g13, "getIsCollaborative(...)");
        g13.getClass();
        kh2.d.M0(board);
        return new h11.a(uid, j13, v13, I0);
    }

    public static final String m(g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        c cVar = gVar.f23662a;
        if (cVar instanceof d) {
            return f0.h.F(((d) cVar).f23653b);
        }
        if (cVar instanceof e) {
            return dl2.b.s0(((e) cVar).f23654b);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static Set n() {
        return h31.g.f66813a;
    }

    public static String o(int i13, int[] iArr, String[] strArr, int[] iArr2) {
        StringBuilder sb3 = new StringBuilder("$");
        for (int i14 = 0; i14 < i13; i14++) {
            int i15 = iArr[i14];
            if (i15 == 1 || i15 == 2) {
                sb3.append('[');
                sb3.append(iArr2[i14]);
                sb3.append(']');
            } else if (i15 == 3 || i15 == 4 || i15 == 5) {
                sb3.append('.');
                String str = strArr[i14];
                if (str != null) {
                    sb3.append(str);
                }
            }
        }
        return sb3.toString();
    }

    public static final String p(g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        c cVar = gVar.f23662a;
        if (cVar instanceof d) {
            return q(((d) cVar).f23653b);
        }
        if (!(cVar instanceof e)) {
            throw new NoWhenBranchMatchedException();
        }
        wy0 wy0Var = ((e) cVar).f23654b;
        Intrinsics.checkNotNullParameter(wy0Var, "<this>");
        String R0 = dl2.b.R0(wy0Var.U2());
        if (R0 == null && (R0 = dl2.b.R0(wy0Var.Z2())) == null && (R0 = dl2.b.R0(wy0Var.z4())) == null) {
            R0 = "";
        }
        return StringsKt.i0(R0).toString();
    }

    public static final String q(d0 d0Var) {
        Intrinsics.checkNotNullParameter(d0Var, "<this>");
        String R0 = dl2.b.R0(d0Var.l());
        if (R0 == null && (R0 = dl2.b.R0(d0Var.f())) == null && (R0 = dl2.b.R0(d0Var.g())) == null) {
            R0 = "";
        }
        return StringsKt.i0(R0).toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0071, code lost:
    
        if (kotlin.text.z.p(r5, "generic", false) == false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean t(nf2.o r5) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = android.os.Build.FINGERPRINT
            java.lang.String r1 = "FINGERPRINT"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.lang.String r2 = "generic"
            r3 = 0
            boolean r4 = kotlin.text.z.p(r0, r2, r3)
            if (r4 != 0) goto L7b
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.lang.String r4 = "unknown"
            boolean r4 = kotlin.text.z.p(r0, r4, r3)
            if (r4 != 0) goto L7b
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.lang.String r1 = "emulator"
            boolean r0 = kotlin.text.StringsKt.E(r0, r1, r3)
            if (r0 != 0) goto L7b
            java.lang.String r0 = r5.f90514g
            java.lang.String r1 = "google_sdk"
            boolean r0 = kotlin.text.StringsKt.E(r0, r1, r3)
            if (r0 != 0) goto L7b
            java.lang.String r0 = r5.f90514g
            java.lang.String r4 = "sdk_gphone64"
            boolean r4 = kotlin.text.StringsKt.E(r0, r4, r3)
            if (r4 != 0) goto L7b
            java.lang.String r4 = "Emulator"
            boolean r4 = kotlin.text.StringsKt.E(r0, r4, r3)
            if (r4 != 0) goto L7b
            java.lang.String r4 = "Android SDK built for"
            boolean r0 = kotlin.text.StringsKt.E(r0, r4, r3)
            if (r0 != 0) goto L7b
            java.lang.String r5 = r5.f90513f
            java.lang.String r0 = "Genymotion"
            boolean r5 = kotlin.text.StringsKt.E(r5, r0, r3)
            if (r5 != 0) goto L7b
            java.lang.String r5 = android.os.Build.BRAND
            java.lang.String r0 = "BRAND"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r0)
            boolean r5 = kotlin.text.z.p(r5, r2, r3)
            if (r5 == 0) goto L73
            java.lang.String r5 = android.os.Build.DEVICE
            java.lang.String r0 = "DEVICE"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r0)
            boolean r5 = kotlin.text.z.p(r5, r2, r3)
            if (r5 != 0) goto L7b
        L73:
            java.lang.String r5 = android.os.Build.PRODUCT
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L7c
        L7b:
            r3 = 1
        L7c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: bp1.h.t(nf2.o):boolean");
    }

    public static boolean u(int i13) {
        return i13 == 256 || i13 == 4101;
    }

    public static final Pair v(GZIPInputStream stream) {
        Intrinsics.checkNotNullParameter(stream, "stream");
        try {
            byte[] I1 = bs1.c.I1(stream);
            int length = I1.length;
            int i13 = 0;
            while (true) {
                if (i13 >= length) {
                    i13 = -1;
                    break;
                }
                if (I1[i13] == 10) {
                    break;
                }
                i13++;
            }
            Pair pair = new Pair(kotlin.collections.c0.S(I1, s.q(i13 + 1, I1.length)), new String(kotlin.collections.c0.S(I1, s.q(0, i13)), Charsets.UTF_8));
            dl2.b.J(stream, null);
            return pair;
        } finally {
        }
    }

    public static void w(HashMap auxData, List list) {
        Intrinsics.checkNotNullParameter(auxData, "auxData");
        if (list == null || !(!list.isEmpty())) {
            return;
        }
        JSONArray jSONArray = new JSONArray();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            v7 v7Var = (v7) it.next();
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("board_title", v7Var.j1());
                jSONObject.put("board_title_id", v7Var.getUid());
                String p13 = v7Var.p1();
                if (p13 != null && p13.length() > 0) {
                    JSONObject jSONObject2 = new JSONObject(v7Var.p1());
                    jSONObject.put("board_title_kind", jSONObject2.getInt("reason"));
                    jSONObject.put("board_title_score", jSONObject2.getDouble("score"));
                }
                jSONArray.put(jSONObject);
            } catch (JSONException e13) {
                HashSet hashSet = tb0.h.f117076w;
                tb0.g.f117075a.q(e13, s1.c("Board Picker Shortlist: failed to parse recommendation reason for suggested board: ", v7Var.j1(), ",recommendationReason: ", v7Var.p1()), tb0.p.REPIN);
            }
        }
        String jSONArray2 = jSONArray.toString();
        Intrinsics.checkNotNullExpressionValue(jSONArray2, "toString(...)");
        auxData.put("board_picker_suggested_boards", jSONArray2);
    }

    public static final long x(long j13, float f13) {
        return (Float.isNaN(f13) || f13 >= 1.0f) ? j13 : w.b(j13, w.d(j13) * f13);
    }

    public void A(View view, int i13) {
    }

    public abstract void B(int i13);

    public abstract void C(View view, int i13, int i14);

    public abstract void D(View view, float f13, float f14);

    public abstract boolean I(View view, int i13);

    public abstract int f(View view, int i13);

    public abstract int g(View view, int i13);

    public int r(View view) {
        return 0;
    }

    public int s() {
        return 0;
    }

    public void y(int i13, int i14) {
    }

    public void z(int i13) {
    }
}
