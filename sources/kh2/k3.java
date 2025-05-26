package kh2;

import a.cb;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Path;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.hardware.camera2.CameraCharacteristics;
import android.net.Uri;
import android.opengl.GLES20;
import android.os.Build;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.util.Log;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.core.CameraUnavailableException;
import androidx.camera.core.InitializationException;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.PinterestStaggeredGridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import androidx.work.impl.WorkDatabase;
import com.pinterest.api.adapter.coroutine.NetworkResponse;
import com.pinterest.api.model.er;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.fi0;
import com.pinterest.api.model.hi0;
import com.pinterest.api.model.ln0;
import com.pinterest.api.model.lo;
import com.pinterest.api.model.mp0;
import com.pinterest.api.model.oc0;
import com.pinterest.api.model.so;
import com.pinterest.api.model.zk0;
import com.pinterest.feature.boardpreview.export.render.RendererException;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.shuffles.core.ui.model.BitmapMaskModel;
import h32.d4;
import i2.w3;
import i2.y3;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import lh0.a4;
import lh0.z3;
import org.json.JSONArray;
import so.h7;
import so.j7;
import so.j8;
import so.m7;
import so.v7;
import so.y7;

/* loaded from: classes4.dex */
public abstract class k3 {
    public static final BitmapMaskModel A(hi0 hi0Var) {
        Object obj;
        Object obj2;
        String str;
        Intrinsics.checkNotNullParameter(hi0Var, "<this>");
        Intrinsics.checkNotNullParameter(hi0Var, "<this>");
        Map n13 = hi0Var.n();
        List list = (n13 == null || (obj = n13.get("mask_bounds")) == null || !(obj instanceof List)) ? null : (List) obj;
        if (list != null && list.size() == 2 && ((List) list.get(0)).size() == 2 && ((List) list.get(1)).size() == 2) {
            Intrinsics.checkNotNullParameter(hi0Var, "<this>");
            Map n14 = hi0Var.n();
            if (n14 == null || (obj2 = n14.get("mask_image")) == null) {
                str = null;
            } else {
                str = obj2 instanceof String ? (String) obj2 : null;
            }
            if (str != null && str.length() != 0) {
                return new BitmapMaskModel(((Number) ((List) list.get(0)).get(0)).floatValue(), ((Number) ((List) list.get(0)).get(1)).floatValue(), ((Number) ((List) list.get(1)).get(0)).floatValue(), ((Number) ((List) list.get(1)).get(1)).floatValue(), str);
            }
        }
        return null;
    }

    public static void A0(sv.e eVar, nx.k kVar) {
        eVar.f115277e0 = kVar;
    }

    public static final an0.i A1(r72.z1 z1Var, an0.g previewConfig) {
        Object obj;
        Size size;
        Intrinsics.checkNotNullParameter(z1Var, "<this>");
        Intrinsics.checkNotNullParameter(previewConfig, "previewConfig");
        Iterator it = previewConfig.f15664l.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.d(((an0.d) obj).f15637a, z1Var.b())) {
                break;
            }
        }
        an0.d dVar = (an0.d) obj;
        if (dVar == null || (size = dVar.f15643g) == null) {
            size = new Size(0, 0);
        }
        return new an0.i(size, dVar != null ? dVar.f15644h : null, dVar != null ? dVar.f15645i : null, dVar != null ? dVar.f15646j : null, dVar != null ? dVar.f15647k : null);
    }

    public static final Bitmap B(Context context, Bitmap image, float f13, float f14) {
        Intrinsics.checkNotNullParameter(image, "image");
        Bitmap.Config config = image.getConfig();
        Bitmap.Config config2 = Bitmap.Config.ARGB_8888;
        if (config != config2) {
            image = image.copy(config2, true);
        }
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(image, ml2.c.c(image.getWidth() * f13), ml2.c.c(image.getHeight() * f13), false);
        Intrinsics.checkNotNullExpressionValue(createScaledBitmap, "createScaledBitmap(...)");
        Bitmap createBitmap = Bitmap.createBitmap(createScaledBitmap);
        Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(...)");
        RenderScript create = RenderScript.create(context);
        ScriptIntrinsicBlur create2 = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
        Allocation createFromBitmap = Allocation.createFromBitmap(create, createScaledBitmap);
        Allocation createFromBitmap2 = Allocation.createFromBitmap(create, createBitmap);
        create2.setRadius(f14);
        create2.setInput(createFromBitmap);
        create2.forEach(createFromBitmap2);
        createFromBitmap2.copyTo(createBitmap);
        createFromBitmap.destroy();
        createFromBitmap2.destroy();
        create2.destroy();
        createScaledBitmap.recycle();
        return createBitmap;
    }

    public static void B0(b01.l lVar, hf0.c cVar) {
        lVar.V0 = cVar;
    }

    public static final boolean B1(kn0.c cVar, String destinationBoardId, String str) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Intrinsics.checkNotNullParameter(destinationBoardId, "destinationBoardId");
        return Intrinsics.d(cVar.f80223b, destinationBoardId) || Intrinsics.d(cVar.f80224c, destinationBoardId) || Intrinsics.d(cVar.f80223b, str);
    }

    public static /* synthetic */ Bitmap C(Context context, Bitmap bitmap, float f13, float f14, int i13) {
        if ((i13 & 4) != 0) {
            f13 = 0.3f;
        }
        if ((i13 & 8) != 0) {
            f14 = 25.0f;
        }
        return B(context, bitmap, f13, f14);
    }

    public static void C0(dt0.n nVar, lh0.r1 r1Var) {
        nVar.L0 = r1Var;
    }

    public static final void C1(z9.e0 e0Var, String route) {
        Intrinsics.checkNotNullParameter(e0Var, "<this>");
        Intrinsics.checkNotNullParameter(route, "route");
        ra0.l0 builder = new ra0.l0(e0Var, 9);
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(builder, "builder");
        z9.p.o(e0Var, route, g0.j0(builder), 4);
    }

    public static boolean D(f5.h[] hVarArr, f5.h[] hVarArr2) {
        if (hVarArr == null || hVarArr2 == null || hVarArr.length != hVarArr2.length) {
            return false;
        }
        for (int i13 = 0; i13 < hVarArr.length; i13++) {
            f5.h hVar = hVarArr[i13];
            char c13 = hVar.f61088a;
            f5.h hVar2 = hVarArr2[i13];
            if (c13 != hVar2.f61088a || hVar.f61089b.length != hVar2.f61089b.length) {
                return false;
            }
        }
        return true;
    }

    public static void D0(m90.i0 i0Var, lh0.f0 f0Var) {
        i0Var.f86664h0 = f0Var;
    }

    public static int E(int i13) {
        int i14 = (i13 & (~(i13 >> 31))) - 255;
        return (i14 & (i14 >> 31)) + 255;
    }

    public static void E0(fa0.t tVar, il1.a aVar) {
        tVar.N0 = aVar;
    }

    public static byte[] F(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } finally {
            }
        } catch (Throwable th3) {
            deflater.end();
            throw th3;
        }
    }

    public static void F0(m90.i0 i0Var) {
        i0Var.getClass();
    }

    public static final String F1(sa0.b0 b0Var) {
        Intrinsics.checkNotNullParameter(b0Var, "<this>");
        sa0.a0 a0Var = b0Var instanceof sa0.a0 ? (sa0.a0) b0Var : null;
        String str = a0Var != null ? a0Var.f112159a : null;
        return str == null ? "" : str;
    }

    public static int G(Context context) {
        Activity k03 = bs1.c.k0(context);
        if (bs1.c.c1(context)) {
            View decorView = bs1.c.k0(context).getWindow().getDecorView();
            WeakHashMap weakHashMap = q5.v0.f102521a;
            q5.a2 a13 = q5.n0.a(decorView);
            if ((a13 == null || !a13.f102400a.o(1)) && (k03.getWindow().getAttributes().flags & 1024) == 0) {
                return 0;
            }
        }
        return k0(context);
    }

    public static void G0(qp.k kVar, il1.a aVar) {
        kVar.f104715x0 = aVar;
    }

    public static byte[] G1(int i13, InputStream inputStream) {
        byte[] bArr = new byte[i13];
        int i14 = 0;
        while (i14 < i13) {
            int read = inputStream.read(bArr, i14, i13 - i14);
            if (read < 0) {
                throw new IllegalStateException(a.a.d("Not enough bytes to read: ", i13));
            }
            i14 += read;
        }
        return bArr;
    }

    public static float[] H(int i13, float[] fArr) {
        if (i13 < 0) {
            throw new IllegalArgumentException();
        }
        int length = fArr.length;
        if (length < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int min = Math.min(i13, length);
        float[] fArr2 = new float[i13];
        System.arraycopy(fArr, 0, fArr2, 0, min);
        return fArr2;
    }

    public static void H0(fa0.t tVar) {
        tVar.getClass();
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005d, code lost:
    
        if (r0.finished() == false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0062, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006a, code lost:
    
        throw new java.lang.IllegalStateException("Inflater did not finish");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static byte[] H1(java.io.FileInputStream r8, int r9, int r10) {
        /*
            java.util.zip.Inflater r0 = new java.util.zip.Inflater
            r0.<init>()
            byte[] r1 = new byte[r10]     // Catch: java.lang.Throwable -> L2e
            r2 = 2048(0x800, float:2.87E-42)
            byte[] r2 = new byte[r2]     // Catch: java.lang.Throwable -> L2e
            r3 = 0
            r4 = r3
            r5 = r4
        Le:
            boolean r6 = r0.finished()     // Catch: java.lang.Throwable -> L2e
            if (r6 != 0) goto L57
            boolean r6 = r0.needsDictionary()     // Catch: java.lang.Throwable -> L2e
            if (r6 != 0) goto L57
            if (r4 >= r9) goto L57
            int r6 = r8.read(r2)     // Catch: java.lang.Throwable -> L2e
            if (r6 < 0) goto L3b
            r0.setInput(r2, r3, r6)     // Catch: java.lang.Throwable -> L2e
            int r7 = r10 - r5
            int r7 = r0.inflate(r1, r5, r7)     // Catch: java.lang.Throwable -> L2e java.util.zip.DataFormatException -> L30
            int r5 = r5 + r7
            int r4 = r4 + r6
            goto Le
        L2e:
            r8 = move-exception
            goto L8a
        L30:
            r8 = move-exception
            java.lang.String r8 = r8.getMessage()     // Catch: java.lang.Throwable -> L2e
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2e
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L2e
            throw r9     // Catch: java.lang.Throwable -> L2e
        L3b:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2e
            r8.<init>()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r10 = "Invalid zip data. Stream ended after $totalBytesRead bytes. Expected "
            r8.append(r10)     // Catch: java.lang.Throwable -> L2e
            r8.append(r9)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r9 = " bytes"
            r8.append(r9)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L2e
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2e
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L2e
            throw r9     // Catch: java.lang.Throwable -> L2e
        L57:
            if (r4 != r9) goto L6b
            boolean r8 = r0.finished()     // Catch: java.lang.Throwable -> L2e
            if (r8 == 0) goto L63
            r0.end()
            return r1
        L63:
            java.lang.String r8 = "Inflater did not finish"
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2e
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L2e
            throw r9     // Catch: java.lang.Throwable -> L2e
        L6b:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2e
            r8.<init>()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r10 = "Didn't read enough bytes during decompression. expected="
            r8.append(r10)     // Catch: java.lang.Throwable -> L2e
            r8.append(r9)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r9 = " actual="
            r8.append(r9)     // Catch: java.lang.Throwable -> L2e
            r8.append(r4)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L2e
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2e
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L2e
            throw r9     // Catch: java.lang.Throwable -> L2e
        L8a:
            r0.end()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kh2.k3.H1(java.io.FileInputStream, int, int):byte[]");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0096 A[Catch: NumberFormatException -> 0x00aa, LOOP:3: B:25:0x0068->B:35:0x0096, LOOP_END, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:35:0x0096, B:39:0x009c, B:44:0x00b1, B:56:0x00b4), top: B:21:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0095 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009c A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:35:0x0096, B:39:0x009c, B:44:0x00b1, B:56:0x00b4), top: B:21:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b1 A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:35:0x0096, B:39:0x009c, B:44:0x00b1, B:56:0x00b4), top: B:21:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d7 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static f5.h[] I(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kh2.k3.I(java.lang.String):f5.h[]");
    }

    public static void I0(ht0.r rVar, b20.c cVar) {
        rVar.B0 = cVar;
    }

    public static long I1(int i13, InputStream inputStream) {
        byte[] G1 = G1(i13, inputStream);
        long j13 = 0;
        for (int i14 = 0; i14 < i13; i14++) {
            j13 += (G1[i14] & 255) << (i14 * 8);
        }
        return j13;
    }

    public static Path J(String str) {
        Path path = new Path();
        try {
            f5.h.b(I(str), path);
            return path;
        } catch (RuntimeException e13) {
            throw new RuntimeException("Error in parsing ".concat(str), e13);
        }
    }

    public static void J0(ht0.i iVar, v7 v7Var) {
        iVar.A0 = v7Var;
    }

    public static void J1(View view) {
        if (view == null || view.getParent() == null) {
            return;
        }
        ((ViewGroup) view.getParent()).removeView(view);
    }

    public static void K(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.animate().scaleX(0.99f).scaleY(0.99f).setDuration(100L).withEndAction(new l7.b0(view, 100L, 4)).start();
    }

    public static void K0(xt0.g gVar, ag1.h hVar) {
        gVar.C0 = hVar;
    }

    public static void K1(nx.d0 d0Var, Exception throwable, Uri uri) {
        HashSet hashSet = tb0.h.f117076w;
        String str = "Image load " + uri + " failed, status code: 0";
        tb0.g.f117075a.h(str);
        if (rl2.g0.Y(throwable)) {
            tb0.k kVar = new tb0.k();
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            kVar.a(null, null, throwable);
            kVar.c("FailedMessage", str);
            if (uri != null && pk.a0.D0(uri.getHost())) {
                kVar.c("Host", uri.getHost());
            }
        }
        h32.f1 f1Var = h32.f1.IMAGE_ERROR;
        HashMap hashMap = new HashMap();
        if (uri == null || pk.a0.x0(uri.toString())) {
            hashMap.put("image_error_url", "unknown");
        } else {
            String uri2 = uri.toString();
            hashMap.put("image_error_url", uri2.substring(0, Math.min(uri2.length(), RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN)));
        }
        if (pk.a0.x0(throwable.getMessage())) {
            hashMap.put("image_error_code", null);
        } else {
            String message = throwable.getMessage();
            hashMap.put("image_error_code", message.substring(0, Math.min(message.length(), RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN)));
        }
        d0Var.g(f1Var, null, hashMap, false);
    }

    public static String L(String str) {
        return "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat(str);
    }

    public static void L0(b01.l lVar, androidx.recyclerview.widget.v1 v1Var) {
        lVar.W0 = v1Var;
    }

    public static r9.g L1(r9.g gVar, String[] strArr, Map map) {
        int i13 = 0;
        if (gVar == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return (r9.g) map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                r9.g gVar2 = new r9.g();
                int length = strArr.length;
                while (i13 < length) {
                    gVar2.a((r9.g) map.get(strArr[i13]));
                    i13++;
                }
                return gVar2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                gVar.a((r9.g) map.get(strArr[0]));
                return gVar;
            }
            if (strArr != null && strArr.length > 1) {
                int length2 = strArr.length;
                while (i13 < length2) {
                    gVar.a((r9.g) map.get(strArr[i13]));
                    i13++;
                }
            }
        }
        return gVar;
    }

    public static final qz.d M(v.f1 f1Var) {
        qz.d dVar;
        Intrinsics.checkNotNullParameter(f1Var, "<this>");
        if (((qz.d) f1Var.f123453f) == null) {
            try {
                byte[] bArr = (byte[]) f1Var.f123451d;
                Intrinsics.f(bArr);
                dVar = new qz.d(new vd0.c(new String(bArr, Charsets.UTF_8)));
            } catch (Exception unused) {
                dVar = null;
            }
            f1Var.f123453f = dVar;
        }
        return (qz.d) f1Var.f123453f;
    }

    public static void M0(qp.k kVar, b60.b bVar) {
        kVar.f104717z0 = bVar;
    }

    public static void M1(ViewGroup viewGroup, ViewGroup viewGroup2) {
        if (viewGroup.getParent() != null) {
            ((ViewGroup) viewGroup.getParent()).removeView(viewGroup);
        }
        viewGroup2.addView(viewGroup);
    }

    public static byte[] N(byte[] bArr) {
        if (bArr.length != 16) {
            throw new IllegalArgumentException("value must be a block.");
        }
        byte[] bArr2 = new byte[16];
        for (int i13 = 0; i13 < 16; i13++) {
            byte b13 = (byte) ((bArr[i13] << 1) & RecyclerViewTypes.VIEW_TYPE_STORY_BLOCK_PATTERN);
            bArr2[i13] = b13;
            if (i13 < 15) {
                bArr2[i13] = (byte) (((byte) ((bArr[i13 + 1] >> 7) & 1)) | b13);
            }
        }
        bArr2[15] = (byte) (((byte) ((bArr[0] >> 7) & RecyclerViewTypes.VIEW_TYPE_FIXED_SIZE_PIN_CELL)) ^ bArr2[15]);
        return bArr2;
    }

    public static void N0(qp.k kVar) {
        kVar.getClass();
    }

    public static void N1(FragmentActivity fragmentActivity) {
        fragmentActivity.getWindow().addFlags(1024);
    }

    public static f5.h[] O(f5.h[] hVarArr) {
        f5.h[] hVarArr2 = new f5.h[hVarArr.length];
        for (int i13 = 0; i13 < hVarArr.length; i13++) {
            hVarArr2[i13] = new f5.h(hVarArr[i13]);
        }
        return hVarArr2;
    }

    public static void O0(com.pinterest.boardAutoCollages.q qVar, a82.b bVar) {
        qVar.L0 = bVar;
    }

    public static void O1(FragmentActivity fragmentActivity) {
        fragmentActivity.getWindow().getDecorView().setSystemUiVisibility(5894);
    }

    public static final wa2.m P(boolean z13, boolean z14) {
        f30 f30Var = ni1.a2.f90595a;
        return wa2.m.a(m60.f0.i0(bs1.c.q(z13)), false, false, false, true, true, false, true, false, false, false, false, z13, false, false, false, false, false, z13, false, null, false, z14, null, null, null, false, y32.f.BOARD, "board", false, false, null, null, false, 2146430815, 2147221503, 1021);
    }

    public static void P0(ht0.r rVar, m60.g0 g0Var) {
        rVar.A0 = g0Var;
    }

    public static void P1(androidx.constraintlayout.widget.c cVar, View view, float[] fArr) {
        Class<?> cls = view.getClass();
        String str = "set" + cVar.f17719b;
        try {
            boolean z13 = true;
            switch (w4.a.f127921a[cVar.f17720c.ordinal()]) {
                case 1:
                    cls.getMethod(str, Integer.TYPE).invoke(view, Integer.valueOf((int) fArr[0]));
                    return;
                case 2:
                    cls.getMethod(str, Float.TYPE).invoke(view, Float.valueOf(fArr[0]));
                    return;
                case 3:
                    Method method = cls.getMethod(str, Drawable.class);
                    int E = (E((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f)) << 16) | (E((int) (fArr[3] * 255.0f)) << 24) | (E((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f)) << 8) | E((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f));
                    ColorDrawable colorDrawable = new ColorDrawable();
                    colorDrawable.setColor(E);
                    method.invoke(view, colorDrawable);
                    return;
                case 4:
                    cls.getMethod(str, Integer.TYPE).invoke(view, Integer.valueOf((E((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f)) << 16) | (E((int) (fArr[3] * 255.0f)) << 24) | (E((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f)) << 8) | E((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f))));
                    return;
                case 5:
                    throw new RuntimeException("unable to interpolate strings " + cVar.f17719b);
                case 6:
                    Method method2 = cls.getMethod(str, Boolean.TYPE);
                    Object[] objArr = new Object[1];
                    if (fArr[0] <= 0.5f) {
                        z13 = false;
                    }
                    objArr[0] = Boolean.valueOf(z13);
                    method2.invoke(view, objArr);
                    return;
                case 7:
                    cls.getMethod(str, Float.TYPE).invoke(view, Float.valueOf(fArr[0]));
                    return;
                default:
                    return;
            }
        } catch (IllegalAccessException e13) {
            StringBuilder o13 = cb.o("cannot access method ", str, " on View \"");
            o13.append(n3.x(view));
            o13.append("\"");
            Log.e("CustomSupport", o13.toString());
            e13.printStackTrace();
        } catch (NoSuchMethodException e14) {
            StringBuilder o14 = cb.o("no method ", str, " on View \"");
            o14.append(n3.x(view));
            o14.append("\"");
            Log.e("CustomSupport", o14.toString());
            e14.printStackTrace();
        } catch (InvocationTargetException e15) {
            e15.printStackTrace();
        }
    }

    public static final float Q(s1.o0 o0Var) {
        return ((s1.f0) o0Var.m()).f110422e == m1.f1.Horizontal ? a3.c.d(o0Var.q()) : a3.c.e(o0Var.q());
    }

    public static void Q0(mv0.t tVar, so.b bVar) {
        tVar.f88410s0 = bVar;
    }

    public static void Q1(View view, int i13) {
        if (view != null) {
            view.setVisibility(i13);
        }
    }

    public static final boolean R(int i13, int i14) {
        return i13 == i14;
    }

    public static void R0(qp.k kVar, x02.i2 i2Var) {
        kVar.B0 = i2Var;
    }

    public static void R1(View view, boolean z13) {
        if (view != null) {
            view.setVisibility(z13 ? 0 : 8);
        }
    }

    public static final int S(int i13, ArrayList arrayList) {
        int size = arrayList.size() - 1;
        int i14 = 0;
        while (i14 <= size) {
            int i15 = (i14 + size) >>> 1;
            b4.s sVar = (b4.s) arrayList.get(i15);
            char c13 = sVar.f21653b > i13 ? (char) 1 : sVar.f21654c <= i13 ? (char) 65535 : (char) 0;
            if (c13 < 0) {
                i14 = i15 + 1;
            } else {
                if (c13 <= 0) {
                    return i15;
                }
                size = i15 - 1;
            }
        }
        return -(i14 + 1);
    }

    public static void S0(b01.l lVar, nx.f0 f0Var) {
        lVar.R0 = f0Var;
    }

    public static final String S1(er erVar) {
        Intrinsics.checkNotNullParameter(erVar, "<this>");
        int i13 = iv0.a.f73730a[erVar.ordinal()];
        if (i13 == 1) {
            return "none";
        }
        if (i13 == 2) {
            return "inverted";
        }
        if (i13 == 3) {
            return "inverted_transparent";
        }
        if (i13 == 4) {
            return "normal";
        }
        if (i13 == 5) {
            return "transparent";
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final int T(int i13, ArrayList arrayList) {
        int size = arrayList.size() - 1;
        int i14 = 0;
        while (i14 <= size) {
            int i15 = (i14 + size) >>> 1;
            b4.s sVar = (b4.s) arrayList.get(i15);
            char c13 = sVar.f21655d > i13 ? (char) 1 : sVar.f21656e <= i13 ? (char) 65535 : (char) 0;
            if (c13 < 0) {
                i14 = i15 + 1;
            } else {
                if (c13 <= 0) {
                    return i15;
                }
                size = i15 - 1;
            }
        }
        return -(i14 + 1);
    }

    public static void T0(fa0.t tVar) {
        tVar.getClass();
    }

    public static final String T1(er erVar, String colorHex) {
        Intrinsics.checkNotNullParameter(erVar, "<this>");
        Intrinsics.checkNotNullParameter(colorHex, "colorHex");
        int i13 = iv0.a.f73730a[erVar.ordinal()];
        if (i13 == 1 || i13 == 2 || i13 == 3) {
            return colorHex;
        }
        if (i13 == 4 || i13 == 5) {
            return m2.V0(colorHex);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final int U(ArrayList arrayList, float f13) {
        if (f13 <= 0.0f) {
            return 0;
        }
        if (f13 >= ((b4.s) CollectionsKt.b0(arrayList)).f21658g) {
            return kotlin.collections.f0.i(arrayList);
        }
        int size = arrayList.size() - 1;
        int i13 = 0;
        while (i13 <= size) {
            int i14 = (i13 + size) >>> 1;
            b4.s sVar = (b4.s) arrayList.get(i14);
            char c13 = sVar.f21657f > f13 ? (char) 1 : sVar.f21658g <= f13 ? (char) 65535 : (char) 0;
            if (c13 < 0) {
                i13 = i14 + 1;
            } else {
                if (c13 <= 0) {
                    return i14;
                }
                size = i14 - 1;
            }
        }
        return -(i13 + 1);
    }

    public static void U0(qp.k kVar) {
        kVar.getClass();
    }

    public static final String U1(oc0 oc0Var) {
        Intrinsics.checkNotNullParameter(oc0Var, "<this>");
        Map l13 = oc0Var.l();
        if (l13 != null) {
            return ((nm.u) vd0.c.f125622b.o(l13)).toString();
        }
        return null;
    }

    public static final void V(ArrayList arrayList, long j13, Function1 function1) {
        int size = arrayList.size();
        for (int S = S(b4.p0.e(j13), arrayList); S < size; S++) {
            b4.s sVar = (b4.s) arrayList.get(S);
            if (sVar.f21653b >= b4.p0.d(j13)) {
                return;
            }
            if (sVar.f21653b != sVar.f21654c) {
                function1.invoke(sVar);
            }
        }
    }

    public static void V0(qp.k kVar, z12.d dVar) {
        kVar.f104716y0 = dVar;
    }

    public static ArrayList V1(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i13 = 0; i13 < jSONArray.length(); i13++) {
            arrayList.add(jSONArray.getString(i13));
        }
        return arrayList;
    }

    public static final void W(LinearLayoutManager linearLayoutManager, int[] firstAndLastPositions) {
        Intrinsics.checkNotNullParameter(linearLayoutManager, "<this>");
        Intrinsics.checkNotNullParameter(firstAndLastPositions, "firstAndLastPositions");
        if (firstAndLastPositions.length < 2) {
            return;
        }
        firstAndLastPositions[0] = linearLayoutManager.k1();
        firstAndLastPositions[1] = linearLayoutManager.l1();
    }

    public static void W0(b01.l lVar, so.p1 p1Var) {
        lVar.S0 = p1Var;
    }

    public static void W1(FragmentActivity fragmentActivity) {
        fragmentActivity.getWindow().clearFlags(1024);
    }

    public static final void X(PinterestStaggeredGridLayoutManager pinterestStaggeredGridLayoutManager, int[] firstAndLastPositions, int[] positions) {
        Intrinsics.checkNotNullParameter(pinterestStaggeredGridLayoutManager, "<this>");
        Intrinsics.checkNotNullParameter(firstAndLastPositions, "firstAndLastPositions");
        Intrinsics.checkNotNullParameter(positions, "positions");
        if (firstAndLastPositions.length < 2) {
            return;
        }
        Integer P = kotlin.collections.c0.P(pinterestStaggeredGridLayoutManager.b1(positions));
        firstAndLastPositions[0] = P != null ? P.intValue() : -1;
        Integer O = kotlin.collections.c0.O(pinterestStaggeredGridLayoutManager.c1(positions));
        firstAndLastPositions[1] = O != null ? O.intValue() : -1;
    }

    public static void X0(ed0.c cVar, h7 h7Var) {
        cVar.f58503j0 = h7Var;
    }

    public static void X1(FragmentActivity fragmentActivity) {
        fragmentActivity.getWindow().getDecorView().setSystemUiVisibility((fragmentActivity.getResources().getConfiguration().uiMode & 48) == 16 ? 8192 : 0);
    }

    public static final void Y(StaggeredGridLayoutManager staggeredGridLayoutManager, int[] firstAndLastPositions, int[] positions) {
        Intrinsics.checkNotNullParameter(staggeredGridLayoutManager, "<this>");
        Intrinsics.checkNotNullParameter(firstAndLastPositions, "firstAndLastPositions");
        Intrinsics.checkNotNullParameter(positions, "positions");
        if (firstAndLastPositions.length < 2) {
            return;
        }
        Integer P = kotlin.collections.c0.P(staggeredGridLayoutManager.h1(positions));
        firstAndLastPositions[0] = P != null ? P.intValue() : -1;
        Integer O = kotlin.collections.c0.O(staggeredGridLayoutManager.i1(positions));
        firstAndLastPositions[1] = O != null ? O.intValue() : -1;
    }

    public static void Y0(ev0.d dVar, j8 j8Var) {
        dVar.f60244j0 = j8Var;
    }

    public static final r4.l Z(WorkDatabase workDatabase, vb.b executor, String name) {
        Intrinsics.checkNotNullParameter(workDatabase, "<this>");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(name, "name");
        k1.j1 j1Var = new k1.j1(name, 5);
        ub.j jVar = executor.f125444a;
        Intrinsics.checkNotNullExpressionValue(jVar, "executor.serialTaskExecutor");
        return tb.f.I(jVar, "loadStatusFuture", new k1.v0(22, j1Var, workDatabase));
    }

    public static void Z0(xt0.g gVar, y7 y7Var) {
        gVar.B0 = y7Var;
    }

    public static final void Z1(View view, int i13, int i14) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Intrinsics.g(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if (i13 == 1) {
            marginLayoutParams.leftMargin = i14;
        } else if (i13 == 2) {
            marginLayoutParams.rightMargin = i14;
        } else if (i13 == 3) {
            marginLayoutParams.topMargin = i14;
        } else if (i13 == 4) {
            marginLayoutParams.bottomMargin = i14;
        } else if (i13 == 6) {
            marginLayoutParams.setMarginStart(i14);
        } else if (i13 == 7) {
            marginLayoutParams.setMarginEnd(i14);
        }
        view.setLayoutParams(marginLayoutParams);
    }

    public static final void a(u50.i0 description, u2.q qVar, i2.o oVar, int i13, int i14) {
        am.d dVar;
        Intrinsics.checkNotNullParameter(description, "description");
        i2.s sVar = (i2.s) oVar;
        sVar.Y(-2013092231);
        u2.q qVar2 = (i14 & 2) != 0 ? u2.n.f120041b : qVar;
        String string = a1.D0(m60.x0.more_no_dot, sVar).toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(string, "toLowerCase(...)");
        Intrinsics.checkNotNullParameter(string, "string");
        u50.f0 f0Var = new u50.f0(string);
        sVar.W(1650061885);
        Object J2 = sVar.J();
        am.d dVar2 = i2.n.f71185a;
        if (J2 == dVar2) {
            dVar = dVar2;
            J2 = bs1.c.u1(new un1.c(description, null, null, null, null, 0, null, null, null, false, 0, null, null, null, null, 2, f0Var, 425982), y3.f71400a);
            sVar.g0(J2);
        } else {
            dVar = dVar2;
        }
        i2.q1 q1Var = (i2.q1) J2;
        sVar.r(false);
        un1.c cVar = (un1.c) q1Var.getValue();
        sVar.W(1650072528);
        Object J3 = sVar.J();
        if (J3 == dVar) {
            J3 = new w1.o(11, q1Var);
            sVar.g0(J3);
        }
        sVar.r(false);
        pe.i.a(cVar, qVar2, (Function1) J3, sVar, (i13 & RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER) | 392, 0);
        i2.f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new z90.a(description, qVar2, i13, i14, 1);
        }
    }

    public static final so a0(ln0 ln0Var) {
        return ln0Var != null ? ln0Var.getMetadata().getCanvasAspectRatio() : lo.f39845e;
    }

    public static void a1(ev0.d dVar, uk1.e eVar) {
        dVar.f60245k0 = eVar;
    }

    public static lm0.o0 a2(lm0.x0 x0Var, h32.f1 f1Var, d4 d4Var, h32.u0 u0Var, h32.g0 g0Var, String str, int i13) {
        if ((i13 & 1) != 0) {
            f1Var = h32.f1.TAP;
        }
        h32.f1 eventType = f1Var;
        String str2 = null;
        d4 d4Var2 = (i13 & 2) != 0 ? null : d4Var;
        h32.u0 u0Var2 = (i13 & 8) != 0 ? null : u0Var;
        String str3 = (i13 & 32) != 0 ? null : str;
        Intrinsics.checkNotNullParameter(x0Var, "<this>");
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        zy.l0 l0Var = x0Var.f83916j;
        Intrinsics.checkNotNullParameter(x0Var, "<this>");
        HashMap hashMap = new HashMap();
        bs1.c.G1("board_session_id", x0Var.f83909c, hashMap);
        bs1.c.G1("board_id", x0Var.f83907a, hashMap);
        com.pinterest.api.model.v7 v7Var = x0Var.f83908b;
        bs1.c.G1("board_pin_count", (v7Var == null || !v7Var.m1()) ? null : String.valueOf(v7Var.l1().intValue()), hashMap);
        if (v7Var != null && v7Var.r1()) {
            str2 = String.valueOf(v7Var.q1().intValue());
        }
        bs1.c.G1("board_section_count", str2, hashMap);
        return new lm0.o0(new zy.f0(c3.u0(l0Var, g0Var, u0Var2, eventType, null, d4Var2, str3, hashMap)));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(java.lang.String r16, u2.q r17, u50.i0 r18, u50.i0 r19, kotlin.jvm.functions.Function2 r20, i2.o r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 362
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kh2.k3.b(java.lang.String, u2.q, u50.i0, u50.i0, kotlin.jvm.functions.Function2, i2.o, int, int):void");
    }

    public static final nc0.e b0(i2.o oVar) {
        i2.s sVar = (i2.s) oVar;
        sVar.W(-630931345);
        w3 w3Var = fc0.h.f61707g;
        fc0.g gVar = (fc0.g) ((fc0.f) sVar.m(w3Var));
        int i13 = gVar.f61695a;
        fc0.g gVar2 = (fc0.g) ((fc0.f) sVar.m(w3Var));
        int i14 = gVar2.f61695a;
        nc0.e eVar = new nc0.e(gVar.f61696b, gVar2.f61697c, eo1.c.toolbar_height, eo1.c.toolbar_general_h_padding_dp, eo1.c.space_0);
        sVar.r(false);
        return eVar;
    }

    public static void b1(ht0.i iVar, uk1.e eVar) {
        iVar.f70114z0 = eVar;
    }

    public static void b2(ByteArrayOutputStream byteArrayOutputStream, long j13, int i13) {
        byte[] bArr = new byte[i13];
        for (int i14 = 0; i14 < i13; i14++) {
            bArr[i14] = (byte) ((j13 >> (i14 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(u2.q r13, java.lang.String r14, boolean r15, i2.o r16, int r17, int r18) {
        /*
            Method dump skipped, instructions count: 209
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kh2.k3.c(u2.q, java.lang.String, boolean, i2.o, int, int):void");
    }

    public static final String c0(fi0 fi0Var) {
        Intrinsics.checkNotNullParameter(fi0Var, "<this>");
        as1.b resolutionProvider = as1.b.a();
        Intrinsics.checkNotNullExpressionValue(resolutionProvider, "get(...)");
        Intrinsics.checkNotNullParameter(fi0Var, "<this>");
        Intrinsics.checkNotNullParameter(resolutionProvider, "resolutionProvider");
        return bs1.c.D0(j.b0(fi0Var, resolutionProvider.b(), resolutionProvider.e()));
    }

    public static void c1(ht0.r rVar, uk1.e eVar) {
        rVar.f70136z0 = eVar;
    }

    public static void c2(ByteArrayOutputStream byteArrayOutputStream, int i13) {
        b2(byteArrayOutputStream, i13, 2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x007d, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(r0.J(), java.lang.Integer.valueOf(r7)) == false) goto L108;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void d(ej0.a r27, u2.q r28, kotlin.jvm.functions.Function2 r29, kotlin.jvm.functions.Function1 r30, i2.o r31, int r32, int r33) {
        /*
            Method dump skipped, instructions count: 571
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kh2.k3.d(ej0.a, u2.q, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function1, i2.o, int, int):void");
    }

    public static final String d0(fi0 fi0Var) {
        Intrinsics.checkNotNullParameter(fi0Var, "<this>");
        as1.b resolutionProvider = as1.b.a();
        Intrinsics.checkNotNullExpressionValue(resolutionProvider, "get(...)");
        Intrinsics.checkNotNullParameter(fi0Var, "<this>");
        Intrinsics.checkNotNullParameter(resolutionProvider, "resolutionProvider");
        return bs1.c.D0(j.b0(fi0Var, resolutionProvider.c(), resolutionProvider.f()));
    }

    public static void d1(mv0.t tVar, uk1.e eVar) {
        tVar.f88409r0 = eVar;
    }

    public static int d2(int i13, int i14, RoundingMode roundingMode) {
        roundingMode.getClass();
        if (i14 == 0) {
            throw new ArithmeticException("/ by zero");
        }
        int i15 = i13 / i14;
        int i16 = i13 - (i14 * i15);
        if (i16 == 0) {
            return i15;
        }
        int i17 = ((i13 ^ i14) >> 31) | 1;
        switch (gi.d1.f65058a[roundingMode.ordinal()]) {
            case 1:
                throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
            case 2:
                return i15;
            case 3:
                if (i17 >= 0) {
                    return i15;
                }
                break;
            case 4:
                break;
            case 5:
                if (i17 <= 0) {
                    return i15;
                }
                break;
            case 6:
            case 7:
            case 8:
                int abs = Math.abs(i16);
                int abs2 = abs - (Math.abs(i14) - abs);
                if (abs2 == 0) {
                    if (roundingMode != RoundingMode.HALF_UP) {
                        if ((i15 & 1 & (roundingMode != RoundingMode.HALF_EVEN ? 0 : 1)) == 0) {
                            return i15;
                        }
                    }
                } else if (abs2 <= 0) {
                    return i15;
                }
                break;
            default:
                throw new AssertionError();
        }
        return i15 + i17;
    }

    public static final void e(ej0.c metadata, u2.q qVar, Function1 function1, i2.o oVar, int i13, int i14) {
        String str;
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        i2.s sVar = (i2.s) oVar;
        sVar.Y(576860872);
        u2.q qVar2 = (i14 & 2) != 0 ? u2.n.f120041b : qVar;
        Function1 function12 = (i14 & 4) != 0 ? ej0.g.f59094i : function1;
        p1.e1 a13 = p1.c1.a(p1.l.f98543a, u2.b.f120022j, sVar, 0);
        int i15 = sVar.P;
        i2.z1 o13 = sVar.o();
        u2.q X = ao2.m0.X(sVar, qVar2);
        s3.k.Qo.getClass();
        s3.i iVar = s3.j.f110798b;
        if (!(sVar.f71265a instanceof i2.f)) {
            com.bumptech.glide.c.j0();
            throw null;
        }
        sVar.a0();
        if (sVar.O) {
            sVar.n(iVar);
        } else {
            sVar.j0();
        }
        tb.f.f0(sVar, a13, s3.j.f110801e);
        tb.f.f0(sVar, o13, s3.j.f110800d);
        s3.h hVar = s3.j.f110802f;
        if (sVar.O || !Intrinsics.d(sVar.J(), Integer.valueOf(i15))) {
            ep.b.y(i15, sVar, i15, hVar);
        }
        tb.f.f0(sVar, X, s3.j.f110799c);
        boolean z13 = sVar.m(t3.f2.f115989l) == n4.k.Rtl;
        u50.f0 p23 = bs1.c.p2("  ·  ");
        dl0.e eVar = metadata.f59082a;
        sVar.W(1991215665);
        if (eVar == null) {
            str = "string";
        } else {
            String string = a1.D0(eVar.getText(), sVar);
            Intrinsics.checkNotNullParameter(string, "string");
            u50.f0 f0Var = new u50.f0(string);
            rn1.a aVar = new rn1.a(z13 ? bs1.c.C1(p23, f0Var) : bs1.c.C1(f0Var, p23), eVar.getTextColor(), null, null, vn1.g.BODY_100, 0, null, null, null, new rm1.d(new rm1.f(eVar.getStartIcon(), rm1.i.XS), eVar.getStartIconColor(), null, 0, null, 28), false, 0, f0Var, null, null, false, null, null, 2092524);
            sVar.W(1850696291);
            boolean h10 = ((((i13 & 896) ^ 384) > 256 && sVar.h(function12)) || (i13 & 384) == 256) | sVar.h(eVar);
            Object J2 = sVar.J();
            if (h10 || J2 == i2.n.f71185a) {
                J2 = new gd0.c(19, function12, eVar);
                sVar.g0(J2);
            }
            sVar.r(false);
            str = "string";
            dl2.b.c(aVar, null, null, (Function1) J2, sVar, 8, 6);
        }
        sVar.r(false);
        sVar.W(1991241058);
        if (metadata.f59084c) {
            String D0 = a1.D0(ga2.f.lego_board_rep_archived_label, sVar);
            u50.f0 x13 = ep.b.x(D0, str, D0);
            dl2.b.c(new rn1.a(z13 ? bs1.c.C1(p23, x13) : bs1.c.C1(x13, p23), vn1.c.SUBTLE, null, null, vn1.g.BODY_100, 0, null, null, null, new rm1.d(new rm1.f(rm1.q.FILE_BOX, rm1.i.XS), rm1.c.SUBTLE, null, 0, null, 28), false, 0, x13, null, null, false, null, null, 2092524), null, null, null, sVar, 8, 14);
        }
        sVar.r(false);
        sVar.W(1991264913);
        if (metadata.f59085d) {
            String D02 = a1.D0(d70.g.secret_board_label, sVar);
            u50.f0 x14 = ep.b.x(D02, str, D02);
            dl2.b.c(new rn1.a(z13 ? bs1.c.C1(p23, x14) : bs1.c.C1(x14, p23), vn1.c.SUBTLE, null, null, vn1.g.BODY_100, 0, null, null, null, new rm1.d(new rm1.f(rm1.q.LOCK, rm1.i.XS), rm1.c.SUBTLE, null, 0, null, 28), false, 0, x14, null, null, false, null, null, 2092524), null, null, null, sVar, 8, 14);
        }
        sVar.r(false);
        vn1.c cVar = vn1.c.SUBTLE;
        vn1.g gVar = vn1.g.BODY_100;
        dl2.b.c(new rn1.a(metadata.f59083b, cVar, null, null, gVar, 0, null, null, null, null, false, 0, null, null, null, false, null, null, 2097132), null, null, null, sVar, 8, 14);
        u50.i0 i0Var = metadata.f59086e;
        if (q1(i0Var)) {
            dl2.b.c(new rn1.a(z13 ? bs1.c.C1(i0Var, p23) : bs1.c.C1(p23, i0Var), cVar, null, null, gVar, 0, null, null, null, null, false, 0, null, null, null, false, null, null, 2097132), null, null, null, sVar, 8, 14);
        }
        sVar.r(true);
        i2.f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new l1.p(i13, i14, 21, metadata, qVar2, function12);
        }
    }

    public static final String e0(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(g0(context));
        Intrinsics.f(launchIntentForPackage);
        ComponentName component = launchIntentForPackage.getComponent();
        String className = component != null ? component.getClassName() : null;
        return className == null ? "" : className;
    }

    public static void e1(qp.k kVar) {
        kVar.getClass();
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void f(u2.q r38, u50.i0 r39, u50.i0 r40, boolean r41, vn1.g r42, vn1.c r43, kotlin.jvm.functions.Function2 r44, i2.o r45, int r46, int r47) {
        /*
            Method dump skipped, instructions count: 611
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kh2.k3.f(u2.q, u50.i0, u50.i0, boolean, vn1.g, vn1.c, kotlin.jvm.functions.Function2, i2.o, int, int):void");
    }

    public static final Object f0(NetworkResponse networkResponse) {
        Intrinsics.checkNotNullParameter(networkResponse, "<this>");
        if (networkResponse instanceof xz.a) {
            return null;
        }
        if (networkResponse instanceof xz.b) {
            return ((xz.b) networkResponse).f136205a;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static void f1(fa0.t tVar, k11.p pVar) {
        tVar.L0 = pVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0160 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x020d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void g(om0.z r28, u2.q r29, om1.f r30, kotlin.jvm.functions.Function0 r31, kotlin.jvm.functions.Function0 r32, kotlin.jvm.functions.Function0 r33, kotlin.jvm.functions.Function0 r34, kotlin.jvm.functions.Function0 r35, i2.o r36, int r37, int r38) {
        /*
            Method dump skipped, instructions count: 790
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kh2.k3.g(om0.z, u2.q, om1.f, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, i2.o, int, int):void");
    }

    public static final String g0(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String packageName = context.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "getPackageName(...)");
        return packageName;
    }

    public static void g1(hr0.c cVar, m7 m7Var) {
        cVar.f69981z0 = m7Var;
    }

    public static final void h(uc0.o oVar, i2.o oVar2, int i13, int i14) {
        int i15;
        i2.s sVar = (i2.s) oVar2;
        sVar.Y(-870027937);
        int i16 = 4;
        if ((i13 & 14) == 0) {
            i15 = (((i14 & 1) == 0 && sVar.h(oVar)) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i15 & 11) == 2 && sVar.z()) {
            sVar.Q();
        } else {
            sVar.S();
            if ((i13 & 1) != 0 && !sVar.y()) {
                sVar.Q();
                int i17 = i14 & 1;
            } else if ((i14 & 1) != 0) {
                sVar.X(1890788296);
                androidx.lifecycle.u1 a13 = v6.b.a(sVar);
                if (a13 == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                }
                xe2.g V = p2.V(a13, sVar);
                sVar.X(1729797275);
                androidx.lifecycle.l1 v03 = c3.v0(uc0.o.class, a13, V, a13 instanceof androidx.lifecycle.k ? ((androidx.lifecycle.k) a13).getDefaultViewModelCreationExtras() : u6.a.f120754b, sVar);
                sVar.r(false);
                sVar.r(false);
                oVar = (uc0.o) v03;
            }
            sVar.s();
            i2.q1 z13 = bs1.c.z(oVar.f121825e, sVar);
            oVar.i(new uc0.i(new oc0.a(q2.i.c(-1978104793, new xb0.a(oVar, i16), sVar))));
            gh0.b.d(((uc0.n) z13.getValue()).f121833a, null, sVar, 8, 2);
        }
        i2.f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new yu.c(oVar, i13, i14, 5);
        }
    }

    public static void h1(dt0.n nVar, xs0.l lVar) {
        nVar.M0 = lVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void i(u2.q r25, boolean r26, i2.o r27, int r28, int r29) {
        /*
            Method dump skipped, instructions count: 315
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kh2.k3.i(u2.q, boolean, i2.o, int, int):void");
    }

    public static final i32.y0 i0(hh0.e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        Integer intOrNull = StringsKt.toIntOrNull(eVar.f69141c);
        if (intOrNull == null) {
            return null;
        }
        i32.w0 w0Var = i32.y0.Companion;
        int intValue = intOrNull.intValue();
        w0Var.getClass();
        return i32.w0.a(intValue);
    }

    public static void i1(du.d dVar, kt.a aVar) {
        dVar.B0 = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0144  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void j(va0.j r47, u2.q r48, kotlin.jvm.functions.Function1 r49, kotlin.jvm.functions.Function0 r50, kotlin.jvm.functions.Function1 r51, kotlin.jvm.functions.Function1 r52, i2.o r53, int r54, int r55) {
        /*
            Method dump skipped, instructions count: 774
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kh2.k3.j(va0.j, u2.q, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, i2.o, int, int):void");
    }

    public static final Map j0(f30 f30Var) {
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        Map V3 = f30Var.V3();
        Map y13 = V3 != null ? n.y(V3) : null;
        return y13 == null ? kotlin.collections.z0.d() : y13;
    }

    public static void j1(m90.i0 i0Var, x92.b bVar) {
        i0Var.f86663g0 = bVar;
    }

    public static final void k(om0.g0 state, om0.f0 setup, u2.q qVar, i2.o oVar, int i13, int i14) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(setup, "setup");
        i2.s sVar = (i2.s) oVar;
        sVar.Y(1813207500);
        if ((i14 & 4) != 0) {
            qVar = u2.n.f120041b;
        }
        om0.e0 e0Var = setup.f96495a;
        sVar.W(358979084);
        Object J2 = sVar.J();
        if (J2 == i2.n.f71185a) {
            J2 = ni1.t2.a(e0Var.f96487c, e0Var.f96485a, null, 14);
            sVar.g0(J2);
        }
        ni1.o2 o2Var = (ni1.o2) J2;
        sVar.r(false);
        u2.q qVar2 = qVar;
        androidx.compose.ui.viewinterop.a.a(new sk0.x(12, e0Var, o2Var), qVar2, new sv.y(setup.f96496b, state, o2Var, 25), sVar, (i13 >> 3) & RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER, 0);
        i2.f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new l1.p(i13, i14, 24, qVar, (Object) state, (Object) setup);
        }
    }

    public static int k0(Context context) {
        int i13;
        q5.a2 l03 = l0(context);
        if (l03 != null && (i13 = l03.f102400a.f(1).f61082b) > 0) {
            return i13;
        }
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    public static void k1(b01.l lVar, e01.a aVar) {
        lVar.U0 = aVar;
    }

    public static final void l(uc0.v1 v1Var, i2.o oVar, int i13, int i14) {
        int i15;
        i2.s sVar = (i2.s) oVar;
        sVar.Y(661468648);
        if ((i13 & 14) == 0) {
            i15 = (((i14 & 1) == 0 && sVar.h(v1Var)) ? 4 : 2) | i13;
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
                androidx.lifecycle.l1 v03 = c3.v0(uc0.v1.class, a13, V, a13 instanceof androidx.lifecycle.k ? ((androidx.lifecycle.k) a13).getDefaultViewModelCreationExtras() : u6.a.f120754b, sVar);
                sVar.r(false);
                sVar.r(false);
                v1Var = (uc0.v1) v03;
            }
            sVar.s();
            i2.q1 z13 = bs1.c.z(v1Var.f121825e, sVar);
            v1Var.i(new uc0.i(new oc0.a(q2.i.c(-1369058272, new androidx.compose.foundation.lazy.layout.v(22, z13, v1Var), sVar))));
            gh0.b.d(((uc0.u1) z13.getValue()).f121869b, null, sVar, 8, 2);
        }
        i2.f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new yu.c(v1Var, i13, i14, 19);
        }
    }

    public static q5.a2 l0(Context context) {
        if (!bs1.c.c1(context)) {
            return null;
        }
        View decorView = bs1.c.k0(context).getWindow().getDecorView();
        WeakHashMap weakHashMap = q5.v0.f102521a;
        return q5.n0.a(decorView);
    }

    public static void l1(b01.l lVar, i92.k kVar) {
        lVar.T0 = kVar;
    }

    public static final void m(uc0.z1 z1Var, i2.o oVar, int i13, int i14) {
        int i15;
        i2.s sVar = (i2.s) oVar;
        sVar.Y(111313778);
        if ((i13 & 14) == 0) {
            i15 = (((i14 & 1) == 0 && sVar.h(z1Var)) ? 4 : 2) | i13;
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
                androidx.lifecycle.l1 v03 = c3.v0(uc0.z1.class, a13, V, a13 instanceof androidx.lifecycle.k ? ((androidx.lifecycle.k) a13).getDefaultViewModelCreationExtras() : u6.a.f120754b, sVar);
                sVar.r(false);
                sVar.r(false);
                z1Var = (uc0.z1) v03;
            }
            sVar.s();
            i2.q1 z13 = bs1.c.z(z1Var.f121825e, sVar);
            z1Var.i(new uc0.i(new oc0.a(q2.i.c(-1919213142, new androidx.compose.foundation.lazy.layout.v(23, z13, z1Var), sVar))));
            gh0.b.d(((uc0.y1) z13.getValue()).f121886b, null, sVar, 8, 2);
        }
        i2.f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new yu.c(z1Var, i13, i14, 21);
        }
    }

    public static final void m0() {
        while (GLES20.glGetError() != 0) {
        }
    }

    public static void m1(qp.k kVar, i92.k kVar2) {
        kVar.C0 = kVar2;
    }

    public static final void n(rm1.d dVar, gc0.a aVar, rm1.d dVar2, gc0.a aVar2, b4.g gVar, u2.q qVar, Function0 function0, Function0 function02, nc0.e eVar, i2.o oVar, int i13, int i14) {
        nc0.e eVar2;
        int i15;
        q2.h c13;
        i2.s sVar = (i2.s) oVar;
        sVar.Y(-1410211711);
        u2.q qVar2 = (i14 & 32) != 0 ? u2.n.f120041b : qVar;
        Function0 function03 = (i14 & 64) != 0 ? null : function0;
        Function0 function04 = (i14 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? null : function02;
        if ((i14 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0) {
            i15 = i13 & (-234881025);
            eVar2 = b0(sVar);
        } else {
            eVar2 = eVar;
            i15 = i13;
        }
        sVar.W(377545997);
        boolean z13 = false;
        q2.h c14 = dVar == null ? null : q2.i.c(-1426947697, new nc0.c(aVar, function03, dVar, 0 == true ? 1 : 0), sVar);
        sVar.r(false);
        sVar.W(377562703);
        q2.h c15 = dVar2 == null ? null : q2.i.c(1633912820, new nc0.c(aVar2, function04, dVar2, 1), sVar);
        sVar.r(false);
        sVar.W(377578921);
        if (gVar == null) {
            c13 = null;
        } else {
            c13 = q2.i.c(-329844323, new k1.n1(10, gVar, eVar2), sVar);
            z13 = false;
        }
        sVar.r(z13);
        o(c14, c15, c13, qVar2, com.bumptech.glide.d.A(eVar2.f90371c, sVar), com.bumptech.glide.d.A(eVar2.f90372d, sVar), com.bumptech.glide.d.A(eVar2.f90373e, sVar), 0.0f, eVar2.f90369a, sVar, (i15 >> 6) & 7168, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN);
        i2.f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new nc0.b(dVar, aVar, dVar2, aVar2, gVar, qVar2, function03, function04, eVar2, i13, i14);
        }
    }

    public static final void n0(String operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        int glGetError = GLES20.glGetError();
        if (glGetError == 0) {
            return;
        }
        Log.e("GL_EM", "glError: " + glGetError);
        throw new RendererException(operation + ": glError: " + glGetError);
    }

    public static boolean n1(w.t tVar, String str) {
        if ("robolectric".equals(Build.FINGERPRINT)) {
            return true;
        }
        try {
            int[] iArr = (int[]) tVar.b(str).a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
            if (iArr != null) {
                for (int i13 : iArr) {
                    if (i13 == 0) {
                        return true;
                    }
                }
            }
            return false;
        } catch (CameraAccessExceptionCompat e13) {
            throw new InitializationException(new CameraUnavailableException(e13));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x015a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void o(kl2.l r20, kl2.l r21, kl2.l r22, u2.q r23, float r24, float r25, float r26, float r27, long r28, i2.o r30, int r31, int r32) {
        /*
            Method dump skipped, instructions count: 712
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kh2.k3.o(kl2.l, kl2.l, kl2.l, u2.q, float, float, float, float, long, i2.o, int, int):void");
    }

    public static final String o0(er erVar, String colorHex) {
        Intrinsics.checkNotNullParameter(erVar, "<this>");
        Intrinsics.checkNotNullParameter(colorHex, "colorHex");
        int i13 = iv0.a.f73730a[erVar.ordinal()];
        if (i13 == 1) {
            return null;
        }
        if (i13 == 2) {
            return m2.V0(colorHex);
        }
        if (i13 == 3) {
            return m2.K1(m2.V0(colorHex));
        }
        if (i13 == 4) {
            return colorHex;
        }
        if (i13 == 5) {
            return m2.K1(colorHex);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final boolean o1(fi0 fi0Var) {
        Intrinsics.checkNotNullParameter(fi0Var, "<this>");
        Integer P = fi0Var.P();
        return P.intValue() == 13 || P.intValue() == 14;
    }

    public static final void p(uc0.d2 d2Var, i2.o oVar, int i13, int i14) {
        int i15;
        i2.s sVar = (i2.s) oVar;
        sVar.Y(924257144);
        if ((i13 & 14) == 0) {
            i15 = (((i14 & 1) == 0 && sVar.h(d2Var)) ? 4 : 2) | i13;
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
                androidx.lifecycle.l1 v03 = c3.v0(uc0.d2.class, a13, V, a13 instanceof androidx.lifecycle.k ? ((androidx.lifecycle.k) a13).getDefaultViewModelCreationExtras() : u6.a.f120754b, sVar);
                sVar.r(false);
                sVar.r(false);
                d2Var = (uc0.d2) v03;
            }
            sVar.s();
            i2.q1 z13 = bs1.c.z(d2Var.f121825e, sVar);
            d2Var.i(new uc0.i(new oc0.a(q2.i.c(-1189003856, new xb0.a(d2Var, 13), sVar))));
            gh0.b.d(((uc0.c2) z13.getValue()).f121767a, null, sVar, 8, 2);
        }
        i2.f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new yu.c(d2Var, i13, i14, 23);
        }
    }

    public static int p0(int i13) {
        if (i13 == 1) {
            return 0;
        }
        if (i13 == 2) {
            return 1;
        }
        if (i13 == 4) {
            return 2;
        }
        if (i13 == 8) {
            return 3;
        }
        if (i13 == 16) {
            return 4;
        }
        if (i13 == 32) {
            return 5;
        }
        if (i13 == 64) {
            return 6;
        }
        if (i13 == 128) {
            return 7;
        }
        if (i13 == 256) {
            return 8;
        }
        throw new IllegalArgumentException(a.a.d("type needs to be >= FIRST and <= LAST, type=", i13));
    }

    public static final boolean p1(mp0 mp0Var) {
        Intrinsics.checkNotNullParameter(mp0Var, "<this>");
        zk0 i13 = mp0Var.i();
        return i13 != null && i13.j().doubleValue() == 0.0d && i13.h().doubleValue() == 0.0d && i13.k().doubleValue() == 0.0d && i13.l().doubleValue() == 0.0d;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0182 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void q(u2.q r19, o1.l r20, float r21, float r22, kotlin.jvm.functions.Function0 r23, kotlin.jvm.functions.Function0 r24, i2.o r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 602
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kh2.k3.q(u2.q, o1.l, float, float, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, i2.o, int, int):void");
    }

    public static void q0(du.d dVar, j7 j7Var) {
        dVar.A0 = j7Var;
    }

    public static final boolean q1(u50.i0 i0Var) {
        return (i0Var == null || Intrinsics.d(i0Var, u50.h0.f120562a)) ? false : true;
    }

    public static void r(x92.b bVar) {
        pp2.a.g(bVar);
        bVar.e("user.about");
        bVar.e("user.location");
        bVar.e("user.website_url");
        bVar.e("partner.business_name");
        List j13 = kotlin.collections.f0.j("en_US", "en_GB", "de", "fr", "it", "es_ES", "es_MX", "es_AR", "es_419", "pt_BR");
        if (j13.contains(Locale.getDefault().toString()) || j13.contains(Locale.getDefault().getLanguage())) {
            bVar.e("user.pronouns");
        }
    }

    public static void r0(qp.k kVar, lu1.b bVar) {
        kVar.f104714w0 = bVar;
    }

    public static final boolean r1(s1.o0 o0Var) {
        boolean z13 = ((s1.f0) o0Var.m()).f110425h;
        return (((Q(o0Var) > 0.0f ? 1 : (Q(o0Var) == 0.0f ? 0 : -1)) > 0) && z13) || (Q(o0Var) <= 0.0f && !z13);
    }

    public static void s(x92.b bVar) {
        pk.a0.b(bVar);
        bVar.h("pin.images", "236x");
        bVar.e("board.collaborated_by_me");
        bVar.e("board.board_order_modified_at");
        n60.o.w(bVar, "board.is_collaborative", "board.followed_by_me", "board.privacy", "board.owner()");
        n60.o.w(bVar, "board.pin_count", "board.collaborating_users()", "conversation.id", "conversation.unread");
        bVar.e("board.collaborated_by_me");
        bVar.h("board.images", "236x");
        bVar.e("board.has_custom_cover");
        n60.o.w(bVar, "board.image_cover_hd_url", "board.layout", "board.archived_by_me_at", "board.should_show_shop_feed");
        n60.o.v(bVar, "board.sensitivity_screen", "shuffle.images[236x]", "user.image_medium_url");
    }

    public static void s0(kl0.f0 f0Var, o5.c cVar) {
        f0Var.f80081g0 = cVar;
    }

    public static final boolean s1(NetworkResponse networkResponse) {
        Intrinsics.checkNotNullParameter(networkResponse, "<this>");
        return networkResponse instanceof xz.b;
    }

    public static void t(x92.b bVar) {
        df.j1.h(bVar);
        bVar.e("user.image_large_url");
        bVar.h("board.images", "236x");
        bVar.e("board.image_cover_hd_url");
        n60.o.w(bVar, "board.followed_by_me", "board.owner()", "board.type", "pin.image_signature");
        df.j1.g(bVar);
        g3.r(bVar);
        j1.D(bVar);
        bVar.e("userdiditdata.type");
        bVar.e("userdiditdata.reaction_by_me");
        bVar.e("userdiditdata.reaction_counts");
        bVar.e("userdiditdata.comment_count");
        bVar.h("userdiditdata.images", "1080x");
    }

    public static void t0(qp.k kVar, x02.y yVar) {
        kVar.A0 = yVar;
    }

    public static void u(x92.b bVar) {
        df.j1.h(bVar);
        pk.a0.c(bVar);
        bVar.e("productgroup.id");
        bVar.e("productgroup.name");
        bVar.e("productgroup.pin_count");
        n60.o.w(bVar, "productgroup.type", "productgroup.preview_pins()", "productgroup.owner()", "productgroup.cover_images");
        n60.o.w(bVar, "productgroup.description", "productgroup.group_type", "user.id", "user.verified_identity");
        n60.o.w(bVar, "user.image_medium_url", "user.first_name", "pin.rich_metadata()", "user.is_verified_merchant");
    }

    public static void u0(du.d dVar, g70.h hVar) {
        dVar.C0 = hVar;
    }

    public static final boolean u1(CameraCharacteristics cameraCharacteristics, CameraCharacteristics.Key modes, int i13) {
        Integer num;
        Intrinsics.checkNotNullParameter(cameraCharacteristics, "<this>");
        Intrinsics.checkNotNullParameter(modes, "modes");
        int[] iArr = (int[]) cameraCharacteristics.get(modes);
        if (iArr == null) {
            return false;
        }
        int length = iArr.length;
        int i14 = 0;
        while (true) {
            if (i14 >= length) {
                num = null;
                break;
            }
            int i15 = iArr[i14];
            if (i15 == i13) {
                num = Integer.valueOf(i15);
                break;
            }
            i14++;
        }
        return num != null;
    }

    public static void v(int i13, RecyclerView recyclerView) {
        recyclerView.setClipToPadding(false);
        recyclerView.setPaddingRelative(recyclerView.getPaddingStart(), recyclerView.getPaddingTop(), recyclerView.getPaddingEnd(), recyclerView.getPaddingBottom() + i13);
    }

    public static void v0(qp.k kVar, g70.h hVar) {
        kVar.D0 = hVar;
    }

    public static boolean v1(View view) {
        return view != null && view.getVisibility() == 0;
    }

    public static final void w(x92.b bVar) {
        n60.o.C(bVar, "<this>", "repinactivity.pin()", "pincreationactivity.pin()", "pin.board()");
        gh0.b.A(bVar);
    }

    public static void w0(fa0.t tVar, e02.a aVar) {
        tVar.M0 = aVar;
    }

    public static final void w1(Fragment fragment, qm0.m0 collection) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(collection, "collection");
        androidx.lifecycle.z viewLifecycleOwner = fragment.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        kotlin.jvm.internal.j.z(bf.b.S(viewLifecycleOwner), null, null, new qm0.r0(fragment, collection, null), 3);
    }

    public static final void x(x92.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        r.m(bVar, false);
        bVar.e("pin.root_pin_id");
    }

    public static void x0(qp.k kVar, e02.a aVar) {
        kVar.f104713v0 = aVar;
    }

    public static final void y(x92.b apiFieldsMap) {
        Intrinsics.checkNotNullParameter(apiFieldsMap, "<this>");
        Intrinsics.checkNotNullParameter(apiFieldsMap, "apiFieldsMap");
        dl2.b.l(apiFieldsMap);
        com.bumptech.glide.d.e(apiFieldsMap);
        apiFieldsMap.e("board.image_cover_url");
        apiFieldsMap.e("board.image_cover_hd_url");
        apiFieldsMap.e("aggregatedpindata.comment_count");
        apiFieldsMap.e("user.follower_count");
        apiFieldsMap.e("user.user_recommendation_reason");
        apiFieldsMap.e("user.image_xlarge_url");
        lp2.b.a(apiFieldsMap);
        n00.a0.f88763a.a(apiFieldsMap);
        apiFieldsMap.e("storypinpage.ad");
        apiFieldsMap.e("storypindata.pages");
        apiFieldsMap.e("storypindata.mentioned_users()");
        n60.o.w(apiFieldsMap, "storypindata.has_affiliate_products", "storypindata.has_product_pins", "pin.pinned_to_board", "pin.is_eligible_for_aggregated_comments");
        n60.o.w(apiFieldsMap, "pin.is_whitelisted_for_tried_it", "pin.image_medium_url", "pin.closeup_attribution", "user.about");
        n60.o.w(apiFieldsMap, "user.verified_identity", "user.show_creator_profile", "pin.is_call_to_create", "pin.call_to_create_source_pin()");
        n60.o.w(apiFieldsMap, "pin.call_to_create_responses_count", "pin.call_to_create_responses_preview_image_urls", "pin.is_ctc_creator_favorite", "pin.ctc_source_pin_creator()");
        lh0.g2 d2 = lh0.g2.f83370b.d();
        apiFieldsMap.e("aggregatedpindata.creator_analytics");
        apiFieldsMap.e("pin.creator_analytics");
        apiFieldsMap.e("pin.is_active_ad");
        apiFieldsMap.e("pin.comment_reply_comment_id");
        apiFieldsMap.e("pin.share_count");
        n00.w.f88795a.a(apiFieldsMap);
        apiFieldsMap.h("pin.images", "564x");
        z3 z3Var = a4.f83298b;
        lh0.g1 g1Var = (lh0.g1) d2.f83373a;
        if (g1Var.o("android_year_in_preview_api_field", "enabled", z3Var) || g1Var.l("android_year_in_preview_api_field")) {
            apiFieldsMap.e("pin.is_year_in_preview");
        }
        apiFieldsMap.e("pin.closeup_unified_description");
        apiFieldsMap.e("user.comments_disabled");
        if (d2.e()) {
            apiFieldsMap.e("collectionpinitem.is_editable");
        }
    }

    public static void y0(sv.e eVar, pb0.a aVar) {
        eVar.f115276d0 = aVar;
    }

    public static final NetworkResponse y1(NetworkResponse networkResponse, Function1 transform) {
        Intrinsics.checkNotNullParameter(networkResponse, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        if (networkResponse instanceof xz.a) {
            return new xz.a(((xz.a) networkResponse).f136204a);
        }
        if (!(networkResponse instanceof xz.b)) {
            throw new NoWhenBranchMatchedException();
        }
        try {
            return new xz.b(transform.invoke(((xz.b) networkResponse).f136205a));
        } catch (Throwable th3) {
            return new xz.a(th3);
        }
    }

    public static boolean z(float[] fArr) {
        float f13 = fArr[0];
        float f14 = fArr[1];
        return f13 == f14 && f14 == fArr[2];
    }

    public static void z0(sv.e eVar, np0.d dVar) {
        eVar.f115275c0 = dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object z1(r72.z1 r6, android.util.Size r7, an0.k r8, bl2.c r9) {
        /*
            boolean r0 = r9 instanceof an0.m
            if (r0 == 0) goto L13
            r0 = r9
            an0.m r0 = (an0.m) r0
            int r1 = r0.f15682u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15682u = r1
            goto L18
        L13:
            an0.m r0 = new an0.m
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f15681t
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f15682u
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            r72.z1 r6 = r0.f15680s
            android.util.Size r7 = r0.f15679r
            ue.c.H(r9)
            goto L77
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            r72.z1 r6 = r0.f15680s
            android.util.Size r7 = r0.f15679r
            ue.c.H(r9)
            goto L5b
        L3e:
            ue.c.H(r9)
            boolean r9 = r6 instanceof r72.u1
            if (r9 == 0) goto L5e
            r9 = r6
            r72.u1 r9 = (r72.u1) r9
            an0.n r2 = new an0.n
            r3 = 0
            r2.<init>(r7, r3)
            r0.f15679r = r7
            r0.f15680s = r6
            r0.f15682u = r4
            java.lang.Object r9 = kh2.b0.i0(r8, r9, r2, r0)
            if (r9 != r1) goto L5b
            return r1
        L5b:
            ke2.i r9 = (ke2.i) r9
            goto L79
        L5e:
            boolean r9 = r6 instanceof r72.y1
            if (r9 == 0) goto L9c
            r9 = r6
            r72.y1 r9 = (r72.y1) r9
            an0.n r2 = new an0.n
            r2.<init>(r7, r4)
            r0.f15679r = r7
            r0.f15680s = r6
            r0.f15682u = r3
            java.lang.Object r9 = kh2.b0.j0(r8, r9, r2, r0)
            if (r9 != r1) goto L77
            return r1
        L77:
            ke2.i r9 = (ke2.i) r9
        L79:
            ke2.b r8 = new ke2.b
            int r0 = com.pinterest.shuffles.scene.composer.z.f52181a
            r72.l1 r0 = r6.c()
            double r0 = r0.f106535a
            r72.l1 r6 = r6.c()
            double r2 = r6.f106536b
            android.graphics.PointF r1 = com.pinterest.shuffles.scene.composer.z.d(r7, r0, r2)
            r3 = 0
            r4 = 0
            r2 = 0
            r5 = 28
            r0 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            ke2.d r6 = new ke2.d
            r6.<init>(r9, r8)
            return r6
        L9c:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "Unsupported item type: "
            r8.<init>(r9)
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            r7.<init>(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kh2.k3.z1(r72.z1, android.util.Size, an0.k, bl2.c):java.lang.Object");
    }

    public abstract rg0.e0 D1(ag2.e eVar, b60.b bVar);

    public abstract void E1(rg0.e0 e0Var);

    public abstract void Y1(Context context, int i13);

    public abstract i32.y0 h0();

    public void t1(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public void x1(b60.b activeUserManager) {
        ag2.e eVar;
        rg0.e0 D1;
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        rg0.n b13 = ((dh0.d) rg0.y.a()).b(h0());
        if (b13 == null) {
            b13 = (rg0.n) az0.a.f20697a.get(h0());
        }
        if (b13 == null || (eVar = b13.f108068j) == null || (D1 = D1(eVar, activeUserManager)) == null) {
            return;
        }
        E1(D1);
    }
}
