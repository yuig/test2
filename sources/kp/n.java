package kp;

import a.l9;
import a.pb;
import a.t1;
import a.u1;
import ads_mobile_sdk.ci1$$ExternalSyntheticThrowCCEIfNotNull0;
import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.location.Location;
import android.media.ImageReader;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.util.Size;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.ImageProcessingUtil;
import b10.z;
import ba1.h0;
import ba1.m0;
import ba1.n0;
import c0.c1;
import c0.e0;
import c0.e1;
import c0.f0;
import c61.b1;
import c61.q0;
import c61.x0;
import ca1.s;
import ca1.t;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.libraries.identity.googleid.GoogleIdTokenParsingException;
import com.google.android.play.core.splitinstall.internal.zzbh;
import com.google.android.play.core.splitinstall.internal.zzbl;
import com.pinterest.api.model.dn;
import com.pinterest.api.model.e80;
import com.pinterest.api.model.gn;
import com.pinterest.api.model.go0;
import com.pinterest.api.model.h80;
import com.pinterest.api.model.jo0;
import com.pinterest.api.model.pr;
import com.pinterest.api.model.qz0;
import com.pinterest.api.model.sr;
import com.pinterest.api.model.te0;
import com.pinterest.api.model.tz0;
import com.pinterest.api.model.v7;
import com.pinterest.api.model.vy0;
import com.pinterest.api.model.we0;
import com.pinterest.api.model.wy0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.shuffles.scene.composer.z0;
import e0.u;
import ea1.f1;
import ea1.h1;
import ea1.i1;
import ea1.m1;
import ea1.y0;
import ga1.v;
import h32.b0;
import h32.b3;
import h32.k0;
import h32.r0;
import io.jsonwebtoken.Header;
import j1.u2;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.net.URI;
import java.nio.ByteBuffer;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.Provider;
import java.security.Signature;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;
import jk.r;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.chromium.net.NetError;
import pb1.q;
import r72.y1;
import rl2.g0;
import v.z1;
import x40.bh;
import x40.ch;
import x40.eh;
import x40.gh;
import x40.ih;
import x40.kh;
import x40.og;
import x40.pg;
import x40.rg;
import x40.tg;
import x40.wg;
import x40.zg;
import x91.a0;
import x91.c0;
import x91.d0;
import z40.x;
import z40.y;
import zp.j0;

/* loaded from: classes3.dex */
public class n implements t1, u1, pb, uf0.a, l82.f, z0, wt1.a, u2, nr0.p, ml1.d, o82.a, bg.k, jh.l, Continuation, kk.g, kk.f, kk.e, pm.p, vm.d, zm.b {

    /* renamed from: b */
    public static n f80559b;

    /* renamed from: c */
    public static Calendar f80560c;

    /* renamed from: a */
    public final int f80561a;

    public /* synthetic */ n(int i13) {
        this.f80561a = i13;
    }

    public static final Bundle A0(String serverClientId, String str, String str2) {
        Intrinsics.checkNotNullParameter(serverClientId, "serverClientId");
        Bundle bundle = new Bundle();
        bundle.putString("com.google.android.libraries.identity.googleid.siwg.BUNDLE_KEY_SERVER_CLIENT_ID", serverClientId);
        bundle.putString("com.google.android.libraries.identity.googleid.siwg.BUNDLE_KEY_NONCE", str2);
        bundle.putString("com.google.android.libraries.identity.googleid.siwg.BUNDLE_KEY_HOSTED_DOMAIN_FILTER", str);
        bundle.putBoolean("com.google.android.libraries.identity.googleid.siwg.BUNDLE_KEY_AUTO_SELECT_ENABLED", true);
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_GOOGLE_ID_TOKEN_SUBTYPE", "com.google.android.libraries.identity.googleid.TYPE_GOOGLE_ID_TOKEN_SIWG_CREDENTIAL");
        return bundle;
    }

    public static void B0(ClassLoader classLoader, HashSet hashSet) {
        if (hashSet.isEmpty()) {
            return;
        }
        HashSet hashSet2 = new HashSet();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            File file = (File) it.next();
            Log.d("Splitcompat", "Adding native library parent directory: ".concat(String.valueOf(file.getParentFile().getAbsolutePath())));
            hashSet2.add(file.getParentFile());
        }
        gi.f n03 = g0.n0(File.class, new gi.m((Object) classLoader, (Object) g0.q0(classLoader, "pathList"), (Serializable) Object.class, 8).J(), "nativeLibraryDirectories");
        hashSet2.removeAll(Arrays.asList((File[]) n03.J()));
        synchronized (r.class) {
            Log.d("Splitcompat", "Adding directories " + hashSet2.size());
            n03.M(hashSet2);
        }
    }

    public static boolean C0(ClassLoader classLoader, File file, File file2, boolean z13, kk.g gVar, String str, kk.f fVar) {
        ArrayList arrayList = new ArrayList();
        int i13 = 8;
        Object J2 = new gi.m((Object) classLoader, (Object) g0.q0(classLoader, "pathList"), (Serializable) Object.class, i13).J();
        gi.f n03 = g0.n0(Object.class, J2, "dexElements");
        List asList = Arrays.asList((Object[]) n03.J());
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : asList) {
            arrayList2.add((File) new gi.m(obj, (Object) g0.q0(obj, str), (Serializable) File.class, i13).J());
        }
        if (arrayList2.contains(file2)) {
            return true;
        }
        if (!z13 && !fVar.w(J2, file2, file)) {
            Log.w("SplitCompat", "Should be optimized ".concat(String.valueOf(file2.getPath())));
            return false;
        }
        n03.L(Arrays.asList(gVar.x(J2, new ArrayList(Collections.singleton(file2)), file, arrayList)));
        if (arrayList.isEmpty()) {
            return true;
        }
        zzbh zzbhVar = new zzbh("DexPathList.makeDexElement failed");
        int size = arrayList.size();
        for (int i14 = 0; i14 < size; i14++) {
            IOException iOException = (IOException) arrayList.get(i14);
            Log.e("SplitCompat", "DexPathList.makeDexElement failed", iOException);
            try {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(zzbhVar, iOException);
            } catch (Exception unused) {
            }
        }
        g0.n0(IOException.class, J2, "dexElementsSuppressedExceptions").L(arrayList);
        throw zzbhVar;
    }

    public static xm.b K(byte[][] bArr, int i13) {
        int i14 = i13 * 2;
        int length = bArr[0].length + i14;
        int length2 = bArr.length + i14;
        xm.b bVar = new xm.b(length, length2);
        int[] iArr = bVar.f135348d;
        int length3 = iArr.length;
        for (int i15 = 0; i15 < length3; i15++) {
            iArr[i15] = 0;
        }
        int i16 = (length2 - i13) - 1;
        int i17 = 0;
        while (i17 < bArr.length) {
            byte[] bArr2 = bArr[i17];
            for (int i18 = 0; i18 < bArr[0].length; i18++) {
                if (bArr2[i18] == 1) {
                    bVar.b(i18 + i13, i16);
                }
            }
            i17++;
            i16--;
        }
        return bVar;
    }

    public static gn M(og apolloModel) {
        Intrinsics.checkNotNullParameter(apolloModel, "apolloModel");
        dn dnVar = new dn(0);
        String str = apolloModel.f132994b;
        b10.o oVar = new b10.o(dnVar, apolloModel, 0);
        if (str != null) {
            oVar.invoke();
        }
        b10.o oVar2 = new b10.o(dnVar, apolloModel, 1);
        if (apolloModel.f132995c != null) {
            oVar2.invoke();
        }
        gn a13 = dnVar.a();
        Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
        return a13;
    }

    public static sr N(pg apolloModel) {
        Intrinsics.checkNotNullParameter(apolloModel, "apolloModel");
        pr f13 = sr.f();
        String str = apolloModel.f133045b;
        b10.h hVar = new b10.h(f13, apolloModel, 0);
        if (str != null) {
            hVar.invoke();
        }
        b10.h hVar2 = new b10.h(f13, apolloModel, 1);
        if (apolloModel.f133046c != null) {
            hVar2.invoke();
        }
        b10.h hVar3 = new b10.h(f13, apolloModel, 2);
        if (apolloModel.f133047d != null) {
            hVar3.invoke();
        }
        b10.h hVar4 = new b10.h(f13, apolloModel, 3);
        if (apolloModel.f133048e != null) {
            hVar4.invoke();
        }
        b10.h hVar5 = new b10.h(f13, apolloModel, 4);
        if (apolloModel.f133049f != null) {
            hVar5.invoke();
        }
        sr a13 = f13.a();
        Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
        return a13;
    }

    public static sr O(rg apolloModel) {
        Intrinsics.checkNotNullParameter(apolloModel, "apolloModel");
        pr f13 = sr.f();
        String str = apolloModel.f133211b;
        b10.i iVar = new b10.i(f13, apolloModel, 0);
        if (str != null) {
            iVar.invoke();
        }
        b10.i iVar2 = new b10.i(f13, apolloModel, 1);
        if (apolloModel.f133212c != null) {
            iVar2.invoke();
        }
        b10.i iVar3 = new b10.i(f13, apolloModel, 2);
        if (apolloModel.f133213d != null) {
            iVar3.invoke();
        }
        b10.i iVar4 = new b10.i(f13, apolloModel, 3);
        if (apolloModel.f133214e != null) {
            iVar4.invoke();
        }
        b10.i iVar5 = new b10.i(f13, apolloModel, 4);
        if (apolloModel.f133215f != null) {
            iVar5.invoke();
        }
        sr a13 = f13.a();
        Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
        return a13;
    }

    public static h80 P(eh apolloModel) {
        Intrinsics.checkNotNullParameter(apolloModel, "apolloModel");
        e80 e80Var = new e80(0);
        String str = apolloModel.f132361a;
        if (str != null) {
            e80Var.f37205a = str;
            boolean[] zArr = e80Var.f37217m;
            if (zArr.length > 0) {
                zArr[0] = true;
            }
        }
        h80 a13 = e80Var.a();
        Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
        return a13;
    }

    public static we0 Q(gh apolloModel) {
        Intrinsics.checkNotNullParameter(apolloModel, "apolloModel");
        te0 te0Var = new te0(0);
        String str = apolloModel.f132456a;
        z zVar = new z(3, te0Var, apolloModel);
        if (str != null) {
            zVar.invoke();
        }
        we0 a13 = te0Var.a();
        Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
        return a13;
    }

    public static jo0 R(ih apolloModel) {
        Intrinsics.checkNotNullParameter(apolloModel, "apolloModel");
        go0 go0Var = new go0(0);
        String str = apolloModel.f132577a;
        if (str != null) {
            go0Var.f38100c = str;
            boolean[] zArr = go0Var.f38108k;
            if (zArr.length > 2) {
                zArr[2] = true;
            }
        }
        jo0 a13 = go0Var.a();
        Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
        return a13;
    }

    public static tz0 S(tg apolloModel) {
        Intrinsics.checkNotNullParameter(apolloModel, "apolloModel");
        qz0 c13 = tz0.c();
        Boolean bool = apolloModel.f133386b;
        j0 j0Var = new j0(23, c13, apolloModel);
        if (bool != null) {
            j0Var.invoke();
        }
        tz0 a13 = c13.a();
        Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
        return a13;
    }

    public static tz0 T(wg apolloModel) {
        Intrinsics.checkNotNullParameter(apolloModel, "apolloModel");
        qz0 c13 = tz0.c();
        Boolean bool = apolloModel.f133629b;
        j0 j0Var = new j0(26, c13, apolloModel);
        if (bool != null) {
            j0Var.invoke();
        }
        tz0 a13 = c13.a();
        Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
        return a13;
    }

    public static tz0 U(zg apolloModel) {
        Intrinsics.checkNotNullParameter(apolloModel, "apolloModel");
        qz0 c13 = tz0.c();
        Boolean bool = apolloModel.f133829b;
        j0 j0Var = new j0(27, c13, apolloModel);
        if (bool != null) {
            j0Var.invoke();
        }
        tz0 a13 = c13.a();
        Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
        return a13;
    }

    public static tz0 V(ch apolloModel) {
        Intrinsics.checkNotNullParameter(apolloModel, "apolloModel");
        qz0 c13 = tz0.c();
        Boolean bool = apolloModel.f132171b;
        z zVar = new z(1, c13, apolloModel);
        if (bool != null) {
            zVar.invoke();
        }
        tz0 a13 = c13.a();
        Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
        return a13;
    }

    public static tz0 W(kh apolloModel) {
        Intrinsics.checkNotNullParameter(apolloModel, "apolloModel");
        qz0 c13 = tz0.c();
        Boolean bool = apolloModel.f132682b;
        j0 j0Var = new j0(28, c13, apolloModel);
        if (bool != null) {
            j0Var.invoke();
        }
        tz0 a13 = c13.a();
        Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
        return a13;
    }

    public static Uri X(File file, File file2) {
        if (file2.exists()) {
            file2.delete();
        }
        if (file.renameTo(file2)) {
            return Uri.fromFile(file2);
        }
        throw new ImageCaptureException("Failed to overwrite the file: " + file2.getAbsolutePath(), null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007c  */
    /* JADX WARN: Type inference failed for: r9v1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.net.Uri Y(java.io.File r8, c0.e0 r9) {
        /*
            java.lang.String r0 = "Failed to write to MediaStore URI: "
            android.content.ContentResolver r1 = r9.f24227b
            java.util.Objects.requireNonNull(r1)
            android.content.ContentValues r2 = r9.f24229d
            if (r2 == 0) goto L11
            android.content.ContentValues r3 = new android.content.ContentValues
            r3.<init>(r2)
            goto L16
        L11:
            android.content.ContentValues r3 = new android.content.ContentValues
            r3.<init>()
        L16:
            int r2 = android.os.Build.VERSION.SDK_INT
            java.lang.String r4 = "is_pending"
            r5 = 29
            if (r2 < r5) goto L26
            r6 = 1
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r3.put(r4, r6)
        L26:
            r6 = 0
            r7 = 0
            android.net.Uri r9 = r9.f24228c     // Catch: java.lang.Throwable -> L55 java.lang.SecurityException -> L58 java.io.IOException -> L5b
            android.net.Uri r9 = r1.insert(r9, r3)     // Catch: java.lang.Throwable -> L55 java.lang.SecurityException -> L58 java.io.IOException -> L5b
            if (r9 == 0) goto L4d
            a0(r8, r9, r1)     // Catch: java.lang.Throwable -> L47 java.lang.SecurityException -> L49 java.io.IOException -> L4b
            if (r2 < r5) goto L46
            android.content.ContentValues r8 = new android.content.ContentValues
            r8.<init>()
            if (r2 < r5) goto L43
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            r8.put(r4, r0)
        L43:
            r1.update(r9, r8, r7, r7)
        L46:
            return r9
        L47:
            r8 = move-exception
            goto L6f
        L49:
            r8 = move-exception
            goto L5d
        L4b:
            r8 = move-exception
            goto L5d
        L4d:
            androidx.camera.core.ImageCaptureException r8 = new androidx.camera.core.ImageCaptureException     // Catch: java.lang.Throwable -> L47 java.lang.SecurityException -> L49 java.io.IOException -> L4b
            java.lang.String r2 = "Failed to insert a MediaStore URI."
            r8.<init>(r2, r7)     // Catch: java.lang.Throwable -> L47 java.lang.SecurityException -> L49 java.io.IOException -> L4b
            throw r8     // Catch: java.lang.Throwable -> L47 java.lang.SecurityException -> L49 java.io.IOException -> L4b
        L55:
            r8 = move-exception
            r9 = r7
            goto L6f
        L58:
            r8 = move-exception
        L59:
            r9 = r7
            goto L5d
        L5b:
            r8 = move-exception
            goto L59
        L5d:
            androidx.camera.core.ImageCaptureException r2 = new androidx.camera.core.ImageCaptureException     // Catch: java.lang.Throwable -> L47
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L47
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L47
            r3.append(r9)     // Catch: java.lang.Throwable -> L47
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L47
            r2.<init>(r0, r8)     // Catch: java.lang.Throwable -> L47
            throw r2     // Catch: java.lang.Throwable -> L47
        L6f:
            if (r9 == 0) goto L86
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r5) goto L86
            android.content.ContentValues r2 = new android.content.ContentValues
            r2.<init>()
            if (r0 < r5) goto L83
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            r2.put(r4, r0)
        L83:
            r1.update(r9, r2, r7, r7)
        L86:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kp.n.Y(java.io.File, c0.e0):android.net.Uri");
    }

    public static void Z(File file, OutputStream outputStream) {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read <= 0) {
                    fileInputStream.close();
                    return;
                }
                outputStream.write(bArr, 0, read);
            }
        } catch (Throwable th3) {
            try {
                fileInputStream.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public static void a0(File file, Uri uri, ContentResolver contentResolver) {
        OutputStream openOutputStream = contentResolver.openOutputStream(uri);
        try {
            if (openOutputStream != null) {
                Z(file, openOutputStream);
                openOutputStream.close();
            } else {
                throw new FileNotFoundException(uri + " cannot be resolved.");
            }
        } catch (Throwable th3) {
            if (openOutputStream != null) {
                try {
                    openOutputStream.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
            }
            throw th3;
        }
    }

    public static StackTraceElement b0() {
        Exception exc = new Exception();
        String simpleName = l9.class.getSimpleName();
        StackTraceElement stackTraceElement = exc.getStackTrace()[0];
        return new StackTraceElement("_COROUTINE.".concat(simpleName), "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
    }

    public static ej.c c0(Bundle data) {
        Uri uri;
        Object parcelable;
        Intrinsics.checkNotNullParameter(data, "data");
        try {
            String string = data.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID");
            String string2 = data.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID_TOKEN");
            String string3 = data.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_DISPLAY_NAME");
            String string4 = data.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_FAMILY_NAME");
            String string5 = data.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_GIVEN_NAME");
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = data.getParcelable("com.google.android.libraries.identity.googleid.BUNDLE_KEY_PROFILE_PICTURE_URI", Uri.class);
                uri = (Uri) parcelable;
            } else {
                uri = (Uri) data.getParcelable("com.google.android.libraries.identity.googleid.BUNDLE_KEY_PROFILE_PICTURE_URI");
            }
            Uri uri2 = uri;
            String string6 = data.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_PHONE_NUMBER");
            Intrinsics.f(string);
            Intrinsics.f(string2);
            return new ej.c(string, string2, string3, string4, string5, uri2, string6);
        } catch (Exception e13) {
            throw new GoogleIdTokenParsingException(e13);
        }
    }

    private static xm.b d0(String str, vm.a aVar, int i13, int i14, Map map) {
        vm.d hVar;
        int i15 = 1;
        int i16 = 2;
        int i17 = 0;
        switch (vm.c.f126197a[aVar.ordinal()]) {
            case 1:
                hVar = new an.h(1);
                break;
            case 2:
                hVar = new an.h(2);
                break;
            case 3:
                hVar = new an.h(0);
                break;
            case 4:
                hVar = new ll.j(9);
                break;
            case 5:
                hVar = new n(14);
                break;
            case 6:
                hVar = new an.e(i15);
                break;
            case 7:
                hVar = new an.e(i16);
                break;
            case 8:
                hVar = new an.e(i17);
                break;
            case 9:
                hVar = new an.i();
                break;
            case 10:
                hVar = new n(13);
                break;
            case 11:
                hVar = new an.b();
                break;
            case 12:
                hVar = new n(8);
                break;
            case 13:
                hVar = new n(7);
                break;
            default:
                throw new IllegalArgumentException("No encoder available for format ".concat(String.valueOf(aVar)));
        }
        return hVar.A(str, aVar, i13, i14, map);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0455  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static xm.b e0(java.lang.String r19, vm.a r20, int r21, int r22, java.util.Map r23) {
        /*
            Method dump skipped, instructions count: 1125
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kp.n.e0(java.lang.String, vm.a, int, int, java.util.Map):xm.b");
    }

    private static xm.b f0(String str, vm.a aVar, int i13, int i14, Map map) {
        int i15;
        int i16;
        int i17;
        xm.b bVar;
        int i18;
        int i19;
        int i23 = 0;
        int i24 = 1;
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        }
        if (aVar != vm.a.DATA_MATRIX) {
            throw new IllegalArgumentException("Can only encode DATA_MATRIX, but got ".concat(String.valueOf(aVar)));
        }
        if (i13 < 0 || i14 < 0) {
            throw new IllegalArgumentException("Requested dimensions can't be negative: " + i13 + 'x' + i14);
        }
        zm.e eVar = zm.e.FORCE_NONE;
        if (map != null) {
            zm.e eVar2 = (zm.e) map.get(vm.b.DATA_MATRIX_SHAPE);
            if (eVar2 != null) {
                eVar = eVar2;
            }
            ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(map.get(vm.b.MIN_SIZE));
            ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(map.get(vm.b.MAX_SIZE));
        }
        zm.b[] bVarArr = {new n(9), new n(11), new zm.f(i23), new zm.f(i24), new n(12), new n(10)};
        a8.a aVar2 = new a8.a(str);
        aVar2.f1277e = eVar;
        aVar2.f1278f = null;
        aVar2.f1279g = null;
        if (str.startsWith("[)>\u001e05\u001d") && str.endsWith("\u001e\u0004")) {
            aVar2.h((char) 236);
            aVar2.f1276d = 2;
            aVar2.f1274b += 7;
        } else if (str.startsWith("[)>\u001e06\u001d") && str.endsWith("\u001e\u0004")) {
            aVar2.h((char) 237);
            aVar2.f1276d = 2;
            aVar2.f1274b += 7;
        }
        int i25 = 0;
        while (aVar2.f()) {
            bVarArr[i25].s(aVar2);
            int i26 = aVar2.f1275c;
            if (i26 >= 0) {
                aVar2.f1275c = -1;
                i25 = i26;
            }
        }
        int c13 = aVar2.c();
        aVar2.g(aVar2.c());
        int i27 = ((zm.d) aVar2.f1281i).f142167b;
        if (c13 < i27 && i25 != 0 && i25 != 5 && i25 != 4) {
            aVar2.h((char) 254);
        }
        StringBuilder sb3 = (StringBuilder) aVar2.f1280h;
        if (sb3.length() < i27) {
            sb3.append((char) 129);
        }
        while (sb3.length() < i27) {
            int length = ((sb3.length() + 1) * RecyclerViewTypes.VIEW_TYPE_SHOPPING_BRAND_PACKAGE_GRID_MODULE) % RecyclerViewTypes.VIEW_TYPE_PIN_CLUSTER;
            int i28 = length + RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_SHOW_GRID_ACTIONS_FULL_SPAN;
            if (i28 > 254) {
                i28 = length + NetError.ERR_WINSOCK_UNEXPECTED_WRITTEN_BYTES;
            }
            sb3.append((char) i28);
        }
        String sb4 = ((StringBuilder) aVar2.f1280h).toString();
        zm.d e13 = zm.d.e(sb4.length(), eVar);
        int[] iArr = zm.c.f142161a;
        int length2 = sb4.length();
        int i29 = e13.f142167b;
        if (length2 != i29) {
            throw new IllegalArgumentException("The number of codewords does not match the selected symbol");
        }
        int i33 = e13.f142168c;
        StringBuilder sb5 = new StringBuilder(i29 + i33);
        sb5.append(sb4);
        int c14 = e13.c();
        if (c14 == 1) {
            sb5.append(zm.c.a(i33, sb4));
        } else {
            sb5.setLength(sb5.capacity());
            int[] iArr2 = new int[c14];
            int[] iArr3 = new int[c14];
            int[] iArr4 = new int[c14];
            int i34 = 0;
            while (i34 < c14) {
                int i35 = i34 + 1;
                iArr2[i34] = e13.a(i35);
                iArr3[i34] = e13.f142173h;
                iArr4[i34] = 0;
                if (i34 > 0) {
                    iArr4[i34] = iArr4[i34 - 1] + iArr2[i34];
                }
                i34 = i35;
            }
            for (int i36 = 0; i36 < c14; i36++) {
                StringBuilder sb6 = new StringBuilder(iArr2[i36]);
                for (int i37 = i36; i37 < i29; i37 += c14) {
                    sb6.append(sb4.charAt(i37));
                }
                String a13 = zm.c.a(iArr3[i36], sb6.toString());
                int i38 = i36;
                int i39 = 0;
                while (i38 < iArr3[i36] * c14) {
                    sb5.setCharAt(i29 + i38, a13.charAt(i39));
                    i38 += c14;
                    i39++;
                }
            }
        }
        String sb7 = sb5.toString();
        int b13 = e13.b();
        int i43 = e13.f142169d;
        int i44 = b13 * i43;
        int d2 = e13.d();
        int i45 = e13.f142170e;
        int i46 = d2 * i45;
        g.i iVar = new g.i();
        iVar.f63180c = sb7;
        iVar.f63179b = i44;
        iVar.f63178a = i46;
        byte[] bArr = new byte[i44 * i46];
        iVar.f63181d = bArr;
        Arrays.fill(bArr, (byte) -1);
        int i47 = 0;
        int i48 = 0;
        int i49 = 4;
        while (true) {
            int i53 = iVar.f63178a;
            if (i49 == i53 && i47 == 0) {
                iVar.x(i53 - i24, i23, i48, i24);
                i15 = 2;
                iVar.x(iVar.f63178a - i24, i24, i48, 2);
                iVar.x(iVar.f63178a - i24, 2, i48, 3);
                iVar.x(i23, iVar.f63179b - 2, i48, 4);
                iVar.x(i23, iVar.f63179b - i24, i48, 5);
                iVar.x(i24, iVar.f63179b - i24, i48, 6);
                iVar.x(2, iVar.f63179b - i24, i48, 7);
                iVar.x(3, iVar.f63179b - i24, i48, 8);
                i48++;
            } else {
                i15 = 2;
            }
            int i54 = iVar.f63178a;
            if (i49 == i54 - 2 && i47 == 0 && iVar.f63179b % 4 != 0) {
                iVar.x(i54 - 3, i23, i48, i24);
                iVar.x(iVar.f63178a - i15, i23, i48, i15);
                iVar.x(iVar.f63178a - i24, i23, i48, 3);
                iVar.x(i23, iVar.f63179b - 4, i48, 4);
                iVar.x(i23, iVar.f63179b - 3, i48, 5);
                iVar.x(i23, iVar.f63179b - i15, i48, 6);
                iVar.x(i23, iVar.f63179b - i24, i48, 7);
                iVar.x(i24, iVar.f63179b - i24, i48, 8);
                i48++;
            }
            int i55 = iVar.f63178a;
            if (i49 == i55 - 2 && i47 == 0 && iVar.f63179b % 8 == 4) {
                iVar.x(i55 - 3, i23, i48, i24);
                iVar.x(iVar.f63178a - 2, i23, i48, 2);
                iVar.x(iVar.f63178a - i24, i23, i48, 3);
                iVar.x(i23, iVar.f63179b - 2, i48, 4);
                iVar.x(i23, iVar.f63179b - i24, i48, 5);
                iVar.x(i24, iVar.f63179b - i24, i48, 6);
                iVar.x(2, iVar.f63179b - i24, i48, 7);
                iVar.x(3, iVar.f63179b - i24, i48, 8);
                i48++;
            }
            int i56 = iVar.f63178a;
            if (i49 == i56 + 4 && i47 == 2 && iVar.f63179b % 8 == 0) {
                iVar.x(i56 - i24, i23, i48, i24);
                iVar.x(iVar.f63178a - i24, iVar.f63179b - i24, i48, 2);
                iVar.x(i23, iVar.f63179b - 3, i48, 3);
                iVar.x(i23, iVar.f63179b - 2, i48, 4);
                iVar.x(i23, iVar.f63179b - i24, i48, 5);
                iVar.x(i24, iVar.f63179b - 3, i48, 6);
                iVar.x(i24, iVar.f63179b - 2, i48, 7);
                iVar.x(i24, iVar.f63179b - i24, i48, 8);
                i48++;
            }
            while (true) {
                if (i49 < iVar.f63178a && i47 >= 0 && !iVar.v(i47, i49)) {
                    iVar.L(i49, i47, i48);
                    i48++;
                }
                int i57 = i49 - 2;
                int i58 = i47 + 2;
                if (i57 < 0 || i58 >= iVar.f63179b) {
                    break;
                }
                i49 = i57;
                i47 = i58;
            }
            int i59 = i49 - 1;
            int i63 = i47 + 5;
            while (true) {
                if (i59 >= 0 && i63 < iVar.f63179b && !iVar.v(i63, i59)) {
                    iVar.L(i59, i63, i48);
                    i48++;
                }
                int i64 = i59 + 2;
                int i65 = i63 - 2;
                i16 = iVar.f63178a;
                if (i64 >= i16 || i65 < 0) {
                    break;
                }
                i63 = i65;
                i59 = i64;
            }
            i49 = i59 + 5;
            i47 = i63 - 1;
            if (i49 >= i16 && i47 >= (i17 = iVar.f63179b)) {
                break;
            }
            iVar = iVar;
            i23 = i23;
            i24 = i24;
        }
        if (!iVar.v(i17 - i24, i16 - i24)) {
            int i66 = iVar.f63179b;
            int i67 = iVar.f63178a;
            Object obj = iVar.f63181d;
            byte b14 = (byte) i24;
            ((byte[]) obj)[((i67 - 1) * i66) + (i66 - 1)] = b14;
            ((byte[]) obj)[((i67 - 2) * i66) + (i66 - 2)] = b14;
        }
        int b15 = e13.b() * i43;
        int d13 = e13.d() * i45;
        int b16 = (e13.b() * i43) + (e13.b() << i24);
        int d14 = (e13.d() * i45) + (e13.d() << i24);
        byte[][] bArr2 = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, d14, b16);
        int i68 = i23;
        int i69 = i68;
        while (i68 < d13) {
            int i73 = i68 % i45;
            if (i73 == 0) {
                int i74 = i23;
                while (i23 < (e13.b() * i43) + (e13.b() << 1)) {
                    bArr2[i69][i74] = (byte) (i23 % 2 == 0 ? 1 : 0);
                    i74++;
                    i23++;
                }
                i24 = 1;
                i69++;
            }
            int i75 = 0;
            int i76 = 0;
            while (i75 < b15) {
                int i77 = i75 % i43;
                if (i77 == 0) {
                    i18 = b15;
                    i19 = d13;
                    bArr2[i69][i76] = (byte) 1;
                    i76++;
                } else {
                    i18 = b15;
                    i19 = d13;
                }
                int i78 = ((byte[]) iVar.f63181d)[(iVar.f63179b * i68) + i75] == 1 ? 1 : 0;
                byte[] bArr3 = bArr2[i69];
                bArr3[i76] = (byte) i78;
                int i79 = i76 + 1;
                g.i iVar2 = iVar;
                if (i77 == i43 - 1) {
                    bArr3[i79] = (byte) (i68 % 2 == 0 ? 1 : 0);
                    i76 += 2;
                } else {
                    i76 = i79;
                }
                i75++;
                d13 = i19;
                iVar = iVar2;
                i24 = 1;
                b15 = i18;
            }
            int i83 = b15;
            g.i iVar3 = iVar;
            int i84 = d13;
            int i85 = i24;
            int i86 = i69 + 1;
            if (i73 == i45 - 1) {
                int i87 = 0;
                for (int i88 = 0; i88 < (e13.b() * i43) + (e13.b() << i85); i88 += i85) {
                    bArr2[i86][i87] = (byte) i85;
                    i87 += i85;
                }
                i69 += 2;
            } else {
                i69 = i86;
            }
            i68 += i85;
            d13 = i84;
            iVar = iVar3;
            i24 = i85;
            i23 = 0;
            b15 = i83;
        }
        int max = Math.max(i13, b16);
        int max2 = Math.max(i14, d14);
        int min = Math.min(max / b16, max2 / d14);
        int i89 = (max - (b16 * min)) / 2;
        int i93 = (max2 - (d14 * min)) / 2;
        if (i14 < d14 || i13 < b16) {
            bVar = new xm.b(b16, d14);
            i89 = 0;
            i93 = 0;
        } else {
            bVar = new xm.b(i13, i14);
        }
        int[] iArr5 = bVar.f135348d;
        int length3 = iArr5.length;
        for (int i94 = 0; i94 < length3; i94++) {
            iArr5[i94] = 0;
        }
        int i95 = 0;
        while (i95 < d14) {
            int i96 = i89;
            int i97 = 0;
            while (i97 < b16) {
                if (bArr2[i95][i97] == 1) {
                    bVar.c(i96, i93, min, min);
                }
                i97++;
                i96 += min;
            }
            i95++;
            i93 += min;
        }
        return bVar;
    }

    public static String h0(StringBuilder sb3) {
        int length = sb3.length();
        if (length == 0) {
            throw new IllegalStateException("StringBuilder must not be empty");
        }
        int charAt = (sb3.charAt(0) << 18) + ((length >= 2 ? sb3.charAt(1) : (char) 0) << '\f') + ((length >= 3 ? sb3.charAt(2) : (char) 0) << 6) + (length >= 4 ? sb3.charAt(3) : (char) 0);
        char c13 = (char) ((charAt >> 16) & 255);
        char c14 = (char) ((charAt >> 8) & 255);
        char c15 = (char) (charAt & 255);
        StringBuilder sb4 = new StringBuilder(3);
        sb4.append(c13);
        if (length >= 2) {
            sb4.append(c14);
        }
        if (length >= 3) {
            sb4.append(c15);
        }
        return sb4.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String i0(android.content.Context r5, java.util.Date r6, java.util.Locale r7, java.lang.Boolean r8) {
        /*
            if (r6 != 0) goto L5
            java.lang.String r5 = ""
            return r5
        L5:
            java.util.Calendar r0 = kp.n.f80560c
            if (r0 != 0) goto Lf
            java.util.Calendar r0 = java.util.Calendar.getInstance()
            kp.n.f80560c = r0
        Lf:
            java.util.Calendar r0 = kp.n.f80560c
            long r1 = java.lang.System.currentTimeMillis()
            r0.setTimeInMillis(r1)
            java.util.Calendar r0 = kp.n.f80560c
            long r0 = r0.getTimeInMillis()
            long r2 = r6.getTime()
            long r0 = r0 - r2
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 / r2
            pb0.i r2 = pb0.i.DAYS
            long r2 = r2.getSeconds()
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 >= 0) goto L4e
            boolean r5 = android.text.format.DateFormat.is24HourFormat(r5)
            if (r5 == 0) goto L42
            java.text.SimpleDateFormat r5 = new java.text.SimpleDateFormat
            java.lang.String r8 = "H:mm"
            r5.<init>(r8, r7)
            java.lang.String r5 = r5.format(r6)
            return r5
        L42:
            java.text.SimpleDateFormat r5 = new java.text.SimpleDateFormat
            java.lang.String r8 = "h:mm a"
            r5.<init>(r8, r7)
            java.lang.String r5 = r5.format(r6)
            return r5
        L4e:
            java.util.GregorianCalendar r5 = new java.util.GregorianCalendar
            r5.<init>()
            r5.setTime(r6)
            r2 = 1
            int r5 = r5.get(r2)
            pb0.i r3 = pb0.i.YEARS
            long r3 = r3.getSeconds()
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 >= 0) goto L8b
            java.util.Calendar r0 = kp.n.f80560c
            if (r0 != 0) goto L6f
            java.util.Calendar r0 = java.util.Calendar.getInstance()
            kp.n.f80560c = r0
        L6f:
            java.util.Calendar r0 = kp.n.f80560c
            long r3 = java.lang.System.currentTimeMillis()
            r0.setTimeInMillis(r3)
            java.util.Calendar r0 = kp.n.f80560c
            int r0 = r0.get(r2)
            if (r0 != r5) goto L8b
            java.lang.String r5 = "MMM d"
            android.icu.text.DateFormat r5 = android.icu.text.DateFormat.getPatternInstance(r5, r7)
            java.lang.String r5 = r5.format(r6)
            goto L95
        L8b:
            java.lang.String r5 = "MMM d yyyy"
            android.icu.text.DateFormat r5 = android.icu.text.DateFormat.getPatternInstance(r5, r7)
            java.lang.String r5 = r5.format(r6)
        L95:
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto La6
            java.text.SimpleDateFormat r5 = new java.text.SimpleDateFormat
            java.lang.String r8 = "MMM d, h:mm a"
            r5.<init>(r8, r7)
            java.lang.String r5 = r5.format(r6)
        La6:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kp.n.i0(android.content.Context, java.util.Date, java.util.Locale, java.lang.Boolean):java.lang.String");
    }

    public static synchronized n m0() {
        n nVar;
        synchronized (n.class) {
            try {
                if (f80559b == null) {
                    f80559b = new n(0);
                }
                nVar = f80559b;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return nVar;
    }

    public static String p0(h.d input) {
        Intrinsics.checkNotNullParameter(input, "input");
        if (input instanceof h.c) {
            return "image/*";
        }
        if (input instanceof h.b) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static byte[][] t0(byte[][] bArr) {
        byte[][] bArr2 = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, bArr[0].length, bArr.length);
        for (int i13 = 0; i13 < bArr.length; i13++) {
            int length = (bArr.length - i13) - 1;
            for (int i14 = 0; i14 < bArr[0].length; i14++) {
                bArr2[i14][length] = bArr[i13][i14];
            }
        }
        return bArr2;
    }

    public static void z0(a8.a aVar, StringBuilder sb3) {
        int charAt = (sb3.charAt(1) * '(') + (sb3.charAt(0) * 1600) + sb3.charAt(2) + 1;
        ((StringBuilder) aVar.f1280h).append(new String(new char[]{(char) (charAt / RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER), (char) (charAt % RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER)}));
        sb3.delete(0, 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:286:0x0613, code lost:
    
        r10 = r10 + 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0341 A[LOOP:3: B:99:0x033f->B:100:0x0341, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x0778  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:454:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:472:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:473:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:476:0x0075 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:499:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:581:0x0994  */
    /* JADX WARN: Removed duplicated region for block: B:615:0x0a00  */
    /* JADX WARN: Removed duplicated region for block: B:621:0x09fe A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:624:0x0a37  */
    /* JADX WARN: Removed duplicated region for block: B:649:0x098f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:683:0x0af9  */
    /* JADX WARN: Removed duplicated region for block: B:689:0x0b10  */
    /* JADX WARN: Removed duplicated region for block: B:732:0x0c38 A[LOOP:54: B:731:0x0c36->B:732:0x0c38, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:736:0x0c54  */
    /* JADX WARN: Removed duplicated region for block: B:739:0x0c5f  */
    /* JADX WARN: Removed duplicated region for block: B:775:0x0ce8  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0247  */
    @Override // vm.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public xm.b A(java.lang.String r29, vm.a r30, int r31, int r32, java.util.Map r33) {
        /*
            Method dump skipped, instructions count: 3374
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kp.n.A(java.lang.String, vm.a, int, int, java.util.Map):xm.b");
    }

    @Override // uf0.a
    public Object B(Object obj) {
        switch (this.f80561a) {
            case 0:
                return N((pg) obj);
            case 1:
                return O((rg) obj);
            case 2:
                return S((tg) obj);
            case 3:
                return M((og) obj);
            case 4:
                return T((wg) obj);
            case 5:
                return U((zg) obj);
            case 6:
                Intrinsics.checkNotNullParameter((bh) obj, "apolloModel");
                v7 a13 = v7.x0().a();
                Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
                return a13;
            case 7:
                return W((kh) obj);
            case 8:
                return V((ch) obj);
            case 9:
                return P((eh) obj);
            case 10:
                return Q((gh) obj);
            case 11:
                return R((ih) obj);
            default:
                y apolloModel = (y) obj;
                Intrinsics.checkNotNullParameter(apolloModel, "apolloModel");
                vy0 f23 = wy0.f2();
                f23.p1(apolloModel.a());
                f23.N(apolloModel.f());
                f23.H(apolloModel.d());
                f23.L(apolloModel.c());
                f23.N(apolloModel.f());
                f23.b0(apolloModel.b());
                f23.r1(apolloModel.g());
                f23.C0(apolloModel.h());
                qz0 c13 = tz0.c();
                x i13 = apolloModel.i();
                c13.b(i13 != null ? i13.getName() : null);
                x i14 = apolloModel.i();
                c13.c(i14 != null ? i14.a() : null);
                f23.t1(c13.a());
                f23.x(kotlin.collections.z0.d());
                f23.X0(kotlin.collections.z0.d());
                f23.g1(apolloModel.k());
                f23.l(apolloModel.m());
                f23.x0(apolloModel.j());
                wy0 a14 = f23.a();
                Intrinsics.checkNotNullExpressionValue(a14, "build(...)");
                return a14;
        }
    }

    @Override // ml1.d
    public float C() {
        switch (this.f80561a) {
        }
        return hf0.b.f69002b;
    }

    @Override // l82.f
    public l82.h D(l82.h engineRequest) {
        switch (this.f80561a) {
            case 0:
                Intrinsics.checkNotNullParameter(engineRequest, "engineRequest");
                b1 b1Var = (b1) engineRequest;
                x0 x0Var = b1Var instanceof x0 ? (x0) b1Var : null;
                if (x0Var != null) {
                    return x0Var.f26648a;
                }
                return null;
            case 1:
                Intrinsics.checkNotNullParameter(engineRequest, "engineRequest");
                b1 b1Var2 = (b1) engineRequest;
                c61.z0 z0Var = b1Var2 instanceof c61.z0 ? (c61.z0) b1Var2 : null;
                if (z0Var != null) {
                    return z0Var.f26651a;
                }
                return null;
            case 2:
                Intrinsics.checkNotNullParameter(engineRequest, "engineRequest");
                b1 b1Var3 = (b1) engineRequest;
                if (b1Var3 instanceof q0) {
                    return (q0) b1Var3;
                }
                return null;
            case 3:
                Intrinsics.checkNotNullParameter(engineRequest, "engineRequest");
                v91.r rVar = (v91.r) engineRequest;
                v91.p pVar = rVar instanceof v91.p ? (v91.p) rVar : null;
                if (pVar != null) {
                    return pVar.f125006a;
                }
                return null;
            case 4:
                Intrinsics.checkNotNullParameter(engineRequest, "engineRequest");
                d0 d0Var = (d0) engineRequest;
                c0 c0Var = d0Var instanceof c0 ? (c0) d0Var : null;
                if (c0Var != null) {
                    return c0Var.f134311a;
                }
                return null;
            case 5:
                Intrinsics.checkNotNullParameter(engineRequest, "engineRequest");
                d0 d0Var2 = (d0) engineRequest;
                x91.z zVar = d0Var2 instanceof x91.z ? (x91.z) d0Var2 : null;
                if (zVar != null) {
                    return zVar.f134363a;
                }
                return null;
            case 6:
                Intrinsics.checkNotNullParameter(engineRequest, "engineRequest");
                return (d0) engineRequest;
            case 7:
                Intrinsics.checkNotNullParameter(engineRequest, "engineRequest");
                d0 d0Var3 = (d0) engineRequest;
                a0 a0Var = d0Var3 instanceof a0 ? (a0) d0Var3 : null;
                if (a0Var != null) {
                    return a0Var.f134307a;
                }
                return null;
            case 8:
                Intrinsics.checkNotNullParameter(engineRequest, "engineRequest");
                d0 d0Var4 = (d0) engineRequest;
                x91.x xVar = d0Var4 instanceof x91.x ? (x91.x) d0Var4 : null;
                if (xVar != null) {
                    return xVar.f134361a;
                }
                return null;
            case 9:
                Intrinsics.checkNotNullParameter(engineRequest, "engineRequest");
                n0 n0Var = (n0) engineRequest;
                h0 h0Var = n0Var instanceof h0 ? (h0) n0Var : null;
                if (h0Var != null) {
                    return h0Var.f22371a;
                }
                return null;
            case 10:
                Intrinsics.checkNotNullParameter(engineRequest, "engineRequest");
                n0 n0Var2 = (n0) engineRequest;
                if (n0Var2 instanceof m0) {
                    return (m0) n0Var2;
                }
                return null;
            case 11:
                Intrinsics.checkNotNullParameter(engineRequest, "engineRequest");
                t tVar = (t) engineRequest;
                s sVar = tVar instanceof s ? (s) tVar : null;
                if (sVar != null) {
                    return sVar.f27225a;
                }
                return null;
            case 12:
                Intrinsics.checkNotNullParameter(engineRequest, "engineRequest");
                m1 m1Var = (m1) engineRequest;
                y0 y0Var = m1Var instanceof y0 ? (y0) m1Var : null;
                if (y0Var != null) {
                    return y0Var.f58171a;
                }
                return null;
            case 13:
                Intrinsics.checkNotNullParameter(engineRequest, "engineRequest");
                m1 m1Var2 = (m1) engineRequest;
                i1 i1Var = m1Var2 instanceof i1 ? (i1) m1Var2 : null;
                if (i1Var != null) {
                    return i1Var.f58064a;
                }
                return null;
            case 14:
                Intrinsics.checkNotNullParameter(engineRequest, "engineRequest");
                m1 m1Var3 = (m1) engineRequest;
                h1 h1Var = m1Var3 instanceof h1 ? (h1) m1Var3 : null;
                if (h1Var != null) {
                    return h1Var.f58059a;
                }
                return null;
            case 15:
                Intrinsics.checkNotNullParameter(engineRequest, "engineRequest");
                m1 m1Var4 = (m1) engineRequest;
                f1 f1Var = m1Var4 instanceof f1 ? (f1) m1Var4 : null;
                if (f1Var != null) {
                    return f1Var.f58051a;
                }
                return null;
            case 16:
                Intrinsics.checkNotNullParameter(engineRequest, "engineRequest");
                v vVar = (v) engineRequest;
                ga1.s sVar2 = vVar instanceof ga1.s ? (ga1.s) vVar : null;
                if (sVar2 != null) {
                    return sVar2.f64652a;
                }
                return null;
            case 17:
                Intrinsics.checkNotNullParameter(engineRequest, "engineRequest");
                v vVar2 = (v) engineRequest;
                ga1.t tVar2 = vVar2 instanceof ga1.t ? (ga1.t) vVar2 : null;
                if (tVar2 != null) {
                    return tVar2.f64653a;
                }
                return null;
            case 18:
                Intrinsics.checkNotNullParameter(engineRequest, "engineRequest");
                ma1.v vVar3 = (ma1.v) engineRequest;
                ma1.t tVar3 = vVar3 instanceof ma1.t ? (ma1.t) vVar3 : null;
                if (tVar3 != null) {
                    return tVar3.f86812a;
                }
                return null;
            case 19:
                Intrinsics.checkNotNullParameter(engineRequest, "engineRequest");
                return (ma1.v) engineRequest;
            case 20:
                Intrinsics.checkNotNullParameter(engineRequest, "engineRequest");
                ma1.v vVar4 = (ma1.v) engineRequest;
                ma1.s sVar3 = vVar4 instanceof ma1.s ? (ma1.s) vVar4 : null;
                if (sVar3 != null) {
                    return sVar3.f86811a;
                }
                return null;
            case 21:
                Intrinsics.checkNotNullParameter(engineRequest, "engineRequest");
                com.pinterest.feature.settings.notifications.q0 q0Var = (com.pinterest.feature.settings.notifications.q0) engineRequest;
                if (!(q0Var instanceof com.pinterest.feature.settings.notifications.q0)) {
                    q0Var = null;
                }
                if (q0Var != null) {
                    return q0Var.f48253a;
                }
                return null;
            case 22:
                Intrinsics.checkNotNullParameter(engineRequest, "engineRequest");
                jb1.m mVar = (jb1.m) engineRequest;
                jb1.k kVar = mVar instanceof jb1.k ? (jb1.k) mVar : null;
                if (kVar != null) {
                    return kVar.f75348a;
                }
                return null;
            case 23:
                Intrinsics.checkNotNullParameter(engineRequest, "engineRequest");
                jb1.m mVar2 = (jb1.m) engineRequest;
                jb1.l lVar = mVar2 instanceof jb1.l ? (jb1.l) mVar2 : null;
                if (lVar != null) {
                    return lVar.f75349a;
                }
                return null;
            case 24:
                Intrinsics.checkNotNullParameter(engineRequest, "engineRequest");
                pb1.s sVar4 = (pb1.s) engineRequest;
                if (sVar4 instanceof pb1.n) {
                    return (pb1.n) sVar4;
                }
                return null;
            case 25:
                Intrinsics.checkNotNullParameter(engineRequest, "engineRequest");
                pb1.s sVar5 = (pb1.s) engineRequest;
                if (sVar5 instanceof pb1.p) {
                    return (pb1.p) sVar5;
                }
                return null;
            case 26:
                Intrinsics.checkNotNullParameter(engineRequest, "engineRequest");
                pb1.s sVar6 = (pb1.s) engineRequest;
                pb1.r rVar2 = sVar6 instanceof pb1.r ? (pb1.r) sVar6 : null;
                if (rVar2 != null) {
                    return rVar2.f99479a;
                }
                return null;
            case 27:
                Intrinsics.checkNotNullParameter(engineRequest, "engineRequest");
                pb1.s sVar7 = (pb1.s) engineRequest;
                q qVar = sVar7 instanceof q ? (q) sVar7 : null;
                if (qVar != null) {
                    return qVar.f99478a;
                }
                return null;
            case 28:
                Intrinsics.checkNotNullParameter(engineRequest, "engineRequest");
                rb1.t tVar4 = (rb1.t) engineRequest;
                rb1.q qVar2 = tVar4 instanceof rb1.q ? (rb1.q) tVar4 : null;
                if (qVar2 != null) {
                    return qVar2.f107092a;
                }
                return null;
            default:
                Intrinsics.checkNotNullParameter(engineRequest, "engineRequest");
                rb1.t tVar5 = (rb1.t) engineRequest;
                rb1.r rVar3 = tVar5 instanceof rb1.r ? (rb1.r) tVar5 : null;
                if (rVar3 != null) {
                    return rVar3.f107093a;
                }
                return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l82.f
    public u50.s E(u50.s anotherEvent) {
        switch (this.f80561a) {
            case 0:
                return L((Void) anotherEvent);
            case 1:
                return L((Void) anotherEvent);
            case 2:
                return L((Void) anotherEvent);
            case 3:
                return L((Void) anotherEvent);
            case 4:
                Intrinsics.checkNotNullParameter(anotherEvent, "anotherEvent");
                return new x91.i((o82.g0) anotherEvent);
            case 5:
                Intrinsics.checkNotNullParameter(anotherEvent, "anotherEvent");
                return new x91.d((zb0.f) anotherEvent);
            case 6:
                Intrinsics.checkNotNullParameter(anotherEvent, "anotherEvent");
                return anotherEvent;
            case 7:
                return L((Void) anotherEvent);
            case 8:
                return L((Void) anotherEvent);
            case 9:
                Intrinsics.checkNotNullParameter(anotherEvent, "anotherEvent");
                return new ba1.l((o82.g0) anotherEvent);
            case 10:
                return L((Void) anotherEvent);
            case 11:
                return L((Void) anotherEvent);
            case 12:
                Intrinsics.checkNotNullParameter(anotherEvent, "anotherEvent");
                return new ea1.b((zb0.f) anotherEvent);
            case 13:
                return L((Void) anotherEvent);
            case 14:
                return L((Void) anotherEvent);
            case 15:
                return L((Void) anotherEvent);
            case 16:
                return L((Void) anotherEvent);
            case 17:
                return L((Void) anotherEvent);
            case 18:
                Intrinsics.checkNotNullParameter(anotherEvent, "anotherEvent");
                return new ma1.i((o82.g0) anotherEvent);
            case 19:
                Intrinsics.checkNotNullParameter(anotherEvent, "anotherEvent");
                return anotherEvent;
            case 20:
                return L((Void) anotherEvent);
            case 21:
                Intrinsics.checkNotNullParameter(anotherEvent, "anotherEvent");
                return new com.pinterest.feature.settings.notifications.n((o82.g0) anotherEvent, null);
            case 22:
                return L((Void) anotherEvent);
            case 23:
                return L((Void) anotherEvent);
            case 24:
                Intrinsics.checkNotNullParameter(anotherEvent, "anotherEvent");
                return anotherEvent;
            case 25:
                Intrinsics.checkNotNullParameter(anotherEvent, "anotherEvent");
                return anotherEvent;
            case 26:
                return L((Void) anotherEvent);
            case 27:
                return L((Void) anotherEvent);
            case 28:
                Intrinsics.checkNotNullParameter(anotherEvent, "anotherEvent");
                return new rb1.d((o82.g0) anotherEvent);
            default:
                return L((Void) anotherEvent);
        }
    }

    public Object H(String str, Provider provider) {
        switch (this.f80561a) {
            case 9:
                return provider == null ? Cipher.getInstance(str) : Cipher.getInstance(str, provider);
            case 10:
                return provider == null ? KeyAgreement.getInstance(str) : KeyAgreement.getInstance(str, provider);
            case 11:
                return provider == null ? KeyFactory.getInstance(str) : KeyFactory.getInstance(str, provider);
            case 12:
                return provider == null ? KeyPairGenerator.getInstance(str) : KeyPairGenerator.getInstance(str, provider);
            case 13:
                return provider == null ? Mac.getInstance(str) : Mac.getInstance(str, provider);
            case 14:
                return provider == null ? MessageDigest.getInstance(str) : MessageDigest.getInstance(str, provider);
            default:
                return provider == null ? Signature.getInstance(str) : Signature.getInstance(str, provider);
        }
    }

    public byte[] I(byte[] bArr, int i13, int i14) {
        switch (this.f80561a) {
            case 3:
                return Arrays.copyOfRange(bArr, i13, i14 + i13);
            default:
                byte[] bArr2 = new byte[i14];
                System.arraycopy(bArr, i13, bArr2, 0, i14);
                return bArr2;
        }
    }

    public Object J(Object obj) {
        Bitmap createBitmap;
        File createTempFile;
        int i13;
        int i14;
        int i15 = this.f80561a;
        int i16 = RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER;
        c1 c1Var = null;
        int i17 = 2;
        switch (i15) {
            case 26:
                d0.a aVar = (d0.a) obj;
                l0.b bVar = aVar.f53483a;
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                ((Bitmap) bVar.f81194a).compress(Bitmap.CompressFormat.JPEG, aVar.f53484b, byteArrayOutputStream);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                e0.h hVar = bVar.f81195b;
                Objects.requireNonNull(hVar);
                Bitmap bitmap = (Bitmap) bVar.f81194a;
                if (Build.VERSION.SDK_INT >= 34 && d0.i.j(bitmap)) {
                    i16 = 4101;
                }
                return new l0.b(byteArray, hVar, i16, bVar.f81197d, bVar.f81198e, bVar.f81199f, bVar.f81200g, bVar.f81201h);
            case 27:
                l0.b bVar2 = (l0.b) obj;
                try {
                    try {
                        int i18 = bVar2.f81196c;
                        Object obj2 = bVar2.f81194a;
                        int i19 = bVar2.f81199f;
                        if (i18 == 35) {
                            c0.n0 n0Var = (c0.n0) obj2;
                            boolean z13 = i19 % RecyclerViewTypes.VIEW_TYPE_BUBBLE_CATEGORY_REP != 0;
                            c1 c1Var2 = new c1(new z1(ImageReader.newInstance(z13 ? n0Var.i() : n0Var.j(), z13 ? n0Var.j() : n0Var.i(), 1, 2)));
                            try {
                                e1 c13 = ImageProcessingUtil.c(n0Var, c1Var2, ByteBuffer.allocateDirect(n0Var.j() * n0Var.i() * 4), i19);
                                n0Var.close();
                                if (c13 == null) {
                                    throw new ImageCaptureException("Can't covert YUV to RGB", null);
                                }
                                createBitmap = bp1.h.h(c13);
                                c13.close();
                                c1Var = c1Var2;
                            } catch (UnsupportedOperationException e13) {
                                e = e13;
                                throw new ImageCaptureException("Can't convert " + (bVar2.f81196c == 35 ? "YUV" : "JPEG") + " to bitmap", e);
                            } catch (Throwable th3) {
                                th = th3;
                                c1Var = c1Var2;
                                if (c1Var != null) {
                                    c1Var.close();
                                }
                                throw th;
                            }
                        } else {
                            if (i18 != 256) {
                                throw new IllegalArgumentException("Invalid postview image format : " + bVar2.f81196c);
                            }
                            c0.n0 n0Var2 = (c0.n0) obj2;
                            Bitmap h10 = bp1.h.h(n0Var2);
                            n0Var2.close();
                            Matrix matrix = new Matrix();
                            matrix.postRotate(i19);
                            createBitmap = Bitmap.createBitmap(h10, 0, 0, h10.getWidth(), h10.getHeight(), matrix, true);
                        }
                        if (c1Var != null) {
                            c1Var.close();
                        }
                        return createBitmap;
                    } catch (UnsupportedOperationException e14) {
                        e = e14;
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
            case 28:
                l0.b bVar3 = (l0.b) obj;
                Rect rect = bVar3.f81198e;
                byte[] bArr = (byte[]) bVar3.f81194a;
                try {
                    Bitmap decodeRegion = BitmapRegionDecoder.newInstance(bArr, 0, bArr.length, false).decodeRegion(rect, new BitmapFactory.Options());
                    e0.h hVar2 = bVar3.f81195b;
                    Objects.requireNonNull(hVar2);
                    Rect rect2 = new Rect(0, 0, decodeRegion.getWidth(), decodeRegion.getHeight());
                    RectF rectF = u.f56755a;
                    Matrix matrix2 = new Matrix(bVar3.f81200g);
                    matrix2.postTranslate(-rect.left, -rect.top);
                    return new l0.b(decodeRegion, hVar2, 42, new Size(decodeRegion.getWidth(), decodeRegion.getHeight()), rect2, bVar3.f81199f, matrix2, bVar3.f81201h);
                } catch (IOException e15) {
                    throw new ImageCaptureException("Failed to decode JPEG.", e15);
                }
            default:
                d0.d dVar = (d0.d) obj;
                l0.b bVar4 = dVar.f53504a;
                e0 e0Var = dVar.f53505b;
                try {
                    File file = e0Var.f24226a;
                    if (file != null) {
                        String parent = file.getParent();
                        StringBuilder sb3 = new StringBuilder("CameraX");
                        sb3.append(UUID.randomUUID().toString());
                        String name = file.getName();
                        int lastIndexOf = name.lastIndexOf(46);
                        sb3.append(lastIndexOf >= 0 ? name.substring(lastIndexOf) : "");
                        createTempFile = new File(parent, sb3.toString());
                    } else {
                        createTempFile = File.createTempFile("CameraX", ".tmp");
                    }
                    byte[] bArr2 = (byte[]) bVar4.f81194a;
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
                        try {
                            fileOutputStream.write(bArr2, 0, new gc.c(20).K(bArr2));
                            fileOutputStream.close();
                            e0.h hVar3 = bVar4.f81195b;
                            Objects.requireNonNull(hVar3);
                            try {
                                a.g gVar = e0.h.f56702b;
                                k6.g gVar2 = new k6.g(createTempFile.toString());
                                e0.h hVar4 = new e0.h(gVar2);
                                hVar3.b(hVar4);
                                if (hVar4.d() == 0 && (i14 = bVar4.f81199f) != 0) {
                                    hVar4.e(i14);
                                }
                                c0.d0 d0Var = e0Var.f24231f;
                                if (d0Var.f24216b) {
                                    switch (hVar4.c()) {
                                        case 2:
                                            i13 = 1;
                                            break;
                                        case 3:
                                            i13 = 4;
                                            break;
                                        case 4:
                                            i13 = 3;
                                            break;
                                        case 5:
                                            i13 = 6;
                                            break;
                                        case 6:
                                            i13 = 5;
                                            break;
                                        case 7:
                                            i13 = 8;
                                            break;
                                        case 8:
                                            i13 = 7;
                                            break;
                                        default:
                                            i13 = 2;
                                            break;
                                    }
                                    gVar2.I("Orientation", String.valueOf(i13));
                                }
                                if (d0Var.f24218d) {
                                    switch (hVar4.c()) {
                                        case 2:
                                            i17 = 3;
                                            break;
                                        case 3:
                                            break;
                                        case 4:
                                            i17 = 1;
                                            break;
                                        case 5:
                                            i17 = 8;
                                            break;
                                        case 6:
                                            i17 = 7;
                                            break;
                                        case 7:
                                            i17 = 6;
                                            break;
                                        case 8:
                                            i17 = 5;
                                            break;
                                        default:
                                            i17 = 4;
                                            break;
                                    }
                                    gVar2.I("Orientation", String.valueOf(i17));
                                }
                                Object obj3 = d0Var.f24219e;
                                if (((Location) obj3) != null) {
                                    hVar4.a((Location) obj3);
                                }
                                try {
                                    hVar4.f();
                                    try {
                                        if (e0Var.f24228c == null || e0Var.f24227b == null || e0Var.f24229d == null) {
                                            OutputStream outputStream = e0Var.f24230e;
                                            if (outputStream != null) {
                                                Z(createTempFile, outputStream);
                                            } else {
                                                File file2 = e0Var.f24226a;
                                                if (file2 != null) {
                                                    X(createTempFile, file2);
                                                }
                                            }
                                        } else {
                                            Y(createTempFile, e0Var);
                                        }
                                        createTempFile.delete();
                                        return new f0();
                                    } catch (IOException unused) {
                                        throw new ImageCaptureException("Failed to write to OutputStream.", null);
                                    }
                                } catch (Throwable th5) {
                                    createTempFile.delete();
                                    throw th5;
                                }
                            } catch (IOException e16) {
                                throw new ImageCaptureException("Failed to update Exif data", e16);
                            }
                        } finally {
                        }
                    } catch (IOException e17) {
                        throw new ImageCaptureException("Failed to write to temp file", e17);
                    }
                } catch (IOException e18) {
                    throw new ImageCaptureException("Failed to create temp file.", e18);
                }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public u50.s L(Void anotherEvent) {
        switch (this.f80561a) {
            case 0:
                Intrinsics.checkNotNullParameter(anotherEvent, "anotherEvent");
                break;
            case 1:
                Intrinsics.checkNotNullParameter(anotherEvent, "anotherEvent");
                break;
            case 2:
                Intrinsics.checkNotNullParameter(anotherEvent, "anotherEvent");
                break;
            case 3:
                Intrinsics.checkNotNullParameter(anotherEvent, "anotherEvent");
                break;
            case 4:
            case 5:
            case 6:
            case 9:
            case 12:
            case 18:
            case 19:
            case 21:
            case 24:
            case 25:
            default:
                Intrinsics.checkNotNullParameter(anotherEvent, "anotherEvent");
                break;
            case 7:
                Intrinsics.checkNotNullParameter(anotherEvent, "anotherEvent");
                break;
            case 8:
                Intrinsics.checkNotNullParameter(anotherEvent, "anotherEvent");
                break;
            case 10:
                Intrinsics.checkNotNullParameter(anotherEvent, "anotherEvent");
                break;
            case 11:
                Intrinsics.checkNotNullParameter(anotherEvent, "anotherEvent");
                break;
            case 13:
                Intrinsics.checkNotNullParameter(anotherEvent, "anotherEvent");
                break;
            case 14:
                Intrinsics.checkNotNullParameter(anotherEvent, "anotherEvent");
                break;
            case 15:
                Intrinsics.checkNotNullParameter(anotherEvent, "anotherEvent");
                break;
            case 16:
                Intrinsics.checkNotNullParameter(anotherEvent, "anotherEvent");
                break;
            case 17:
                Intrinsics.checkNotNullParameter(anotherEvent, "anotherEvent");
                break;
            case 20:
                Intrinsics.checkNotNullParameter(anotherEvent, "anotherEvent");
                break;
            case 22:
                Intrinsics.checkNotNullParameter(anotherEvent, "anotherEvent");
                break;
            case 23:
                Intrinsics.checkNotNullParameter(anotherEvent, "anotherEvent");
                break;
            case 26:
                Intrinsics.checkNotNullParameter(anotherEvent, "anotherEvent");
                break;
            case 27:
                Intrinsics.checkNotNullParameter(anotherEvent, "anotherEvent");
                break;
        }
        return (u50.s) anotherEvent;
    }

    @Override // nr0.p
    public boolean c() {
        return true;
    }

    @Override // bg.k
    public Reader d(String str) {
        try {
            return new InputStreamReader(new URI(str).toURL().openStream(), "UTF-8");
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // nr0.p
    public boolean e(int i13) {
        return true;
    }

    @Override // nr0.p
    public boolean f(int i13) {
        switch (this.f80561a) {
        }
        return RecyclerViewTypes.FULL_SPAN_ITEM_TYPES.contains(Integer.valueOf(i13));
    }

    @Override // j1.r2
    public j1.t g(long j13, j1.t tVar, j1.t tVar2, j1.t tVar3) {
        return tVar3;
    }

    public int g0(char c13, StringBuilder sb3) {
        if (c13 == ' ') {
            sb3.append((char) 3);
            return 1;
        }
        if (c13 >= '0' && c13 <= '9') {
            sb3.append((char) (c13 - ','));
            return 1;
        }
        if (c13 >= 'A' && c13 <= 'Z') {
            sb3.append((char) (c13 - '3'));
            return 1;
        }
        if (c13 < ' ') {
            sb3.append((char) 0);
            sb3.append(c13);
            return 2;
        }
        if (c13 >= '!' && c13 <= '/') {
            sb3.append((char) 1);
            sb3.append((char) (c13 - '!'));
            return 2;
        }
        if (c13 >= ':' && c13 <= '@') {
            sb3.append((char) 1);
            sb3.append((char) (c13 - '+'));
            return 2;
        }
        if (c13 >= '[' && c13 <= '_') {
            sb3.append((char) 1);
            sb3.append((char) (c13 - 'E'));
            return 2;
        }
        if (c13 < '`' || c13 > 127) {
            sb3.append("\u0001\u001e");
            return g0((char) (c13 - 128), sb3) + 2;
        }
        sb3.append((char) 2);
        sb3.append((char) (c13 - '`'));
        return 2;
    }

    @Override // nr0.p
    public int getItemViewType(int i13) {
        switch (this.f80561a) {
            case 0:
                return RecyclerViewTypes.VIEW_TYPE_MESSAGES_HEADER;
            default:
                return 1;
        }
    }

    @Override // nr0.p
    public boolean h(int i13) {
        return true;
    }

    @Override // uf0.a
    public Object i(Object obj) {
        switch (this.f80561a) {
            case 0:
                sr plankModel = (sr) obj;
                Intrinsics.checkNotNullParameter(plankModel, "plankModel");
                return new pg("ImageLargeDetails", plankModel.i(), plankModel.g(), Integer.valueOf((int) plankModel.k().doubleValue()), Integer.valueOf((int) plankModel.h().doubleValue()), plankModel.j());
            case 1:
                sr plankModel2 = (sr) obj;
                Intrinsics.checkNotNullParameter(plankModel2, "plankModel");
                return new rg("ImageMediumDetails", plankModel2.i(), plankModel2.g(), Integer.valueOf((int) plankModel2.k().doubleValue()), Integer.valueOf((int) plankModel2.h().doubleValue()), plankModel2.j());
            case 2:
                tz0 plankModel3 = (tz0) obj;
                Intrinsics.checkNotNullParameter(plankModel3, "plankModel");
                return new tg("VerifiedIdentity", plankModel3.e());
            case 3:
                gn plankModel4 = (gn) obj;
                Intrinsics.checkNotNullParameter(plankModel4, "plankModel");
                return new og("Embed", plankModel4.g(), plankModel4.f());
            case 4:
                tz0 plankModel5 = (tz0) obj;
                Intrinsics.checkNotNullParameter(plankModel5, "plankModel");
                return new wg("VerifiedIdentity", plankModel5.e());
            case 5:
                tz0 plankModel6 = (tz0) obj;
                Intrinsics.checkNotNullParameter(plankModel6, "plankModel");
                return new zg("VerifiedIdentity", plankModel6.e());
            case 6:
                Intrinsics.checkNotNullParameter((v7) obj, "plankModel");
                return new bh("Board");
            case 7:
                tz0 plankModel7 = (tz0) obj;
                Intrinsics.checkNotNullParameter(plankModel7, "plankModel");
                return new kh("VerifiedIdentity", plankModel7.e());
            case 8:
                tz0 plankModel8 = (tz0) obj;
                Intrinsics.checkNotNullParameter(plankModel8, "plankModel");
                return new ch("VerifiedIdentity", plankModel8.e());
            case 9:
                h80 plankModel9 = (h80) obj;
                Intrinsics.checkNotNullParameter(plankModel9, "plankModel");
                return new eh(plankModel9.s());
            case 10:
                we0 plankModel10 = (we0) obj;
                Intrinsics.checkNotNullParameter(plankModel10, "plankModel");
                return new gh(plankModel10.q());
            case 11:
                jo0 plankModel11 = (jo0) obj;
                Intrinsics.checkNotNullParameter(plankModel11, "plankModel");
                return new ih(plankModel11.m());
            default:
                wy0 plankModel12 = (wy0) obj;
                Intrinsics.checkNotNullParameter(plankModel12, "plankModel");
                return new nk1.r(plankModel12);
        }
    }

    public int j0() {
        switch (this.f80561a) {
            case 9:
                return 0;
            case 10:
                return 5;
            case 11:
                return 1;
            default:
                return 4;
        }
    }

    @Override // kk.e
    public boolean k(ClassLoader classLoader, File file, File file2, boolean z13) {
        switch (this.f80561a) {
        }
        return C0(classLoader, file, file2, z13, new n(26), Header.COMPRESSION_ALGORITHM, new n(27));
    }

    public String k0(uh2.b preferencesService) {
        switch (this.f80561a) {
            case 0:
                Intrinsics.checkNotNullParameter(preferencesService, "preferencesService");
                return ((uh2.a) preferencesService).f122252a.getString("io.embrace.dart.sdk.version", null);
            case 1:
                Intrinsics.checkNotNullParameter(preferencesService, "preferencesService");
                return null;
            case 2:
                Intrinsics.checkNotNullParameter(preferencesService, "preferencesService");
                return ((uh2.a) preferencesService).f122252a.getString("io.embrace.reactnative.version", null);
            default:
                Intrinsics.checkNotNullParameter(preferencesService, "preferencesService");
                return ((uh2.a) preferencesService).f122252a.getString("io.embrace.unity.version", null);
        }
    }

    @Override // kk.e
    public void l(ClassLoader classLoader, HashSet hashSet) {
        switch (this.f80561a) {
            case 28:
                B0(classLoader, hashSet);
                break;
            default:
                B0(classLoader, hashSet);
                break;
        }
    }

    public String l0(uh2.b preferencesService) {
        switch (this.f80561a) {
            case 0:
                Intrinsics.checkNotNullParameter(preferencesService, "preferencesService");
                return ((uh2.a) preferencesService).f122252a.getString("io.embrace.flutter.sdk.version", null);
            case 1:
                Intrinsics.checkNotNullParameter(preferencesService, "preferencesService");
                return null;
            case 2:
                Intrinsics.checkNotNullParameter(preferencesService, "preferencesService");
                return ((uh2.a) preferencesService).f122252a.getString("io.embrace.reactnative.sdk.version", null);
            default:
                Intrinsics.checkNotNullParameter(preferencesService, "preferencesService");
                return ((uh2.a) preferencesService).f122252a.getString("io.embrace.unity.sdk.version", null);
        }
    }

    @Override // nr0.p
    public boolean m() {
        return true;
    }

    @Override // j1.u2
    public int n() {
        return this.f80561a;
    }

    public String n0(uh2.b preferencesService) {
        switch (this.f80561a) {
            case 0:
                Intrinsics.checkNotNullParameter(preferencesService, "preferencesService");
                return null;
            case 1:
                Intrinsics.checkNotNullParameter(preferencesService, "preferencesService");
                return null;
            case 2:
                Intrinsics.checkNotNullParameter(preferencesService, "preferencesService");
                return ((uh2.a) preferencesService).f122252a.getString("io.embrace.javascript.patch", null);
            default:
                Intrinsics.checkNotNullParameter(preferencesService, "preferencesService");
                return null;
        }
    }

    @Override // j1.r2
    public j1.t o(long j13, j1.t tVar, j1.t tVar2, j1.t tVar3) {
        return j13 < ((long) this.f80561a) * 1000000 ? tVar : tVar2;
    }

    public String o0(uh2.b preferencesService) {
        switch (this.f80561a) {
            case 0:
                Intrinsics.checkNotNullParameter(preferencesService, "preferencesService");
                return null;
            case 1:
                Intrinsics.checkNotNullParameter(preferencesService, "preferencesService");
                return null;
            case 2:
                Intrinsics.checkNotNullParameter(preferencesService, "preferencesService");
                return null;
            default:
                Intrinsics.checkNotNullParameter(preferencesService, "preferencesService");
                return ((uh2.a) preferencesService).f122252a.getString("io.embrace.unity.build.id", null);
        }
    }

    @Override // com.pinterest.shuffles.scene.composer.z0
    public Object p(y1 y1Var, Function0 function0, com.pinterest.shuffles.scene.composer.c1 c1Var, Function0 function02, bl2.c cVar) {
        switch (this.f80561a) {
        }
        return new ke2.i();
    }

    @Override // nr0.p
    public boolean q(int i13) {
        switch (this.f80561a) {
        }
        return RecyclerViewTypes.INSTANCE.getFULL_BLEED_ITEM_TYPES().contains(Integer.valueOf(i13));
    }

    public int q0(Object obj) {
        switch (this.f80561a) {
            case 0:
                return ((m5.g) obj).f85857c;
            default:
                return ((e5.g) obj).f57220b;
        }
    }

    @Override // j1.u2
    public int r() {
        return 0;
    }

    public void r0(a8.a aVar, StringBuilder sb3) {
        int length = (sb3.length() / 3) << 1;
        int length2 = sb3.length() % 3;
        int c13 = aVar.c() + length;
        aVar.g(c13);
        int i13 = ((zm.d) aVar.f1281i).f142167b - c13;
        if (length2 == 2) {
            sb3.append((char) 0);
            while (sb3.length() >= 3) {
                z0(aVar, sb3);
            }
            if (aVar.f()) {
                aVar.h((char) 254);
            }
        } else if (i13 == 1 && length2 == 1) {
            while (sb3.length() >= 3) {
                z0(aVar, sb3);
            }
            if (aVar.f()) {
                aVar.h((char) 254);
            }
            aVar.f1274b--;
        } else {
            if (length2 != 0) {
                throw new IllegalStateException("Unexpected case. Please report!");
            }
            while (sb3.length() >= 3) {
                z0(aVar, sb3);
            }
            if (i13 > 0 || aVar.f()) {
                aVar.h((char) 254);
            }
        }
        aVar.f1275c = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x0062, code lost:
    
        el.a.R(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0065, code lost:
    
        throw null;
     */
    @Override // zm.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void s(a8.a r12) {
        /*
            Method dump skipped, instructions count: 806
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kp.n.s(a8.a):void");
    }

    public boolean s0(Object obj) {
        switch (this.f80561a) {
            case 0:
                return ((m5.g) obj).f85858d;
            default:
                return ((e5.g) obj).f57221c;
        }
    }

    @Override // com.pinterest.shuffles.scene.composer.z0
    public Object t(r72.u1 u1Var, Function0 function0, com.pinterest.shuffles.scene.composer.h hVar, Function0 function02, bl2.c cVar) {
        switch (this.f80561a) {
        }
        return new ke2.i();
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        if (((Boolean) task.getResult()).booleanValue()) {
            return null;
        }
        throw new ApiException(new Status(13, "listener already unregistered", null, null));
    }

    @Override // pm.p
    public Object u() {
        switch (this.f80561a) {
            case 0:
                return new ArrayDeque();
            case 1:
                return new ConcurrentSkipListMap();
            case 2:
                return new ConcurrentHashMap();
            case 3:
                return new TreeMap();
            default:
                return new LinkedHashMap();
        }
    }

    public void u0(String str, uh2.b preferencesService) {
        switch (this.f80561a) {
            case 0:
                Intrinsics.checkNotNullParameter(preferencesService, "preferencesService");
                uh2.a.d(((uh2.a) preferencesService).f122252a, "io.embrace.dart.sdk.version", str);
                break;
            case 1:
                Intrinsics.checkNotNullParameter(preferencesService, "preferencesService");
                break;
            case 2:
                Intrinsics.checkNotNullParameter(preferencesService, "preferencesService");
                uh2.a.d(((uh2.a) preferencesService).f122252a, "io.embrace.reactnative.version", str);
                break;
            default:
                Intrinsics.checkNotNullParameter(preferencesService, "preferencesService");
                uh2.a.d(((uh2.a) preferencesService).f122252a, "io.embrace.unity.version", str);
                break;
        }
    }

    @Override // ml1.d
    public float v() {
        switch (this.f80561a) {
        }
        return hf0.b.f69003c;
    }

    public void v0(String str, uh2.b preferencesService) {
        switch (this.f80561a) {
            case 0:
                Intrinsics.checkNotNullParameter(preferencesService, "preferencesService");
                uh2.a.d(((uh2.a) preferencesService).f122252a, "io.embrace.flutter.sdk.version", str);
                break;
            case 1:
                Intrinsics.checkNotNullParameter(preferencesService, "preferencesService");
                break;
            case 2:
                Intrinsics.checkNotNullParameter(preferencesService, "preferencesService");
                uh2.a.d(((uh2.a) preferencesService).f122252a, "io.embrace.reactnative.sdk.version", str);
                break;
            default:
                Intrinsics.checkNotNullParameter(preferencesService, "preferencesService");
                uh2.a.d(((uh2.a) preferencesService).f122252a, "io.embrace.unity.sdk.version", str);
                break;
        }
    }

    @Override // kk.f
    public boolean w(Object obj, File file, File file2) {
        Class<?> cls = obj.getClass();
        try {
            return new File((String) String.class.cast(g0.r0(cls, "optimizedPathFor", File.class, File.class).invoke(null, file, file2))).exists();
        } catch (Exception e13) {
            throw new zzbl(a.a.h("Failed to invoke static method optimizedPathFor on type ", cls), e13);
        }
    }

    public void w0(String str, uh2.b preferencesService) {
        switch (this.f80561a) {
            case 0:
                Intrinsics.checkNotNullParameter(preferencesService, "preferencesService");
                break;
            case 1:
                Intrinsics.checkNotNullParameter(preferencesService, "preferencesService");
                break;
            case 2:
                Intrinsics.checkNotNullParameter(preferencesService, "preferencesService");
                uh2.a.d(((uh2.a) preferencesService).f122252a, "io.embrace.javascript.patch", str);
                break;
            default:
                Intrinsics.checkNotNullParameter(preferencesService, "preferencesService");
                break;
        }
    }

    @Override // kk.g
    public Object[] x(Object obj, ArrayList arrayList, File file, ArrayList arrayList2) {
        return (Object[]) g0.p0(obj, "makeDexElements", ArrayList.class, arrayList, file, ArrayList.class, arrayList2);
    }

    public void x0(String str, uh2.b preferencesService) {
        switch (this.f80561a) {
            case 0:
                Intrinsics.checkNotNullParameter(preferencesService, "preferencesService");
                break;
            case 1:
                Intrinsics.checkNotNullParameter(preferencesService, "preferencesService");
                break;
            case 2:
                Intrinsics.checkNotNullParameter(preferencesService, "preferencesService");
                break;
            default:
                Intrinsics.checkNotNullParameter(preferencesService, "preferencesService");
                uh2.a.d(((uh2.a) preferencesService).f122252a, "io.embrace.unity.build.id", str);
                break;
        }
    }

    @Override // wt1.a
    public boolean y(Object obj, Object obj2) {
        switch (this.f80561a) {
            case 0:
                dl1.s oldItem = (dl1.s) obj;
                dl1.s newItem = (dl1.s) obj2;
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return Intrinsics.d(oldItem.getClass(), newItem.getClass());
            default:
                y oldItem2 = (y) obj;
                y newItem2 = (y) obj2;
                Intrinsics.checkNotNullParameter(oldItem2, "oldItem");
                Intrinsics.checkNotNullParameter(newItem2, "newItem");
                return Intrinsics.d(oldItem2.getId(), newItem2.getId());
        }
    }

    public void y0(fo.a protocol, Object obj) {
        int i13;
        byte b13;
        byte b14;
        int i14;
        byte b15;
        byte b16;
        byte b17;
        int i15;
        switch (this.f80561a) {
            case 0:
                ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(obj);
                Intrinsics.checkNotNullParameter(protocol, "protocol");
                Intrinsics.checkNotNullParameter(null, "struct");
                ((fo.b) protocol).getClass();
                Intrinsics.checkNotNullParameter("BrowserIdData", "structName");
                throw null;
            case 1:
                ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(obj);
                Intrinsics.checkNotNullParameter(protocol, "protocol");
                Intrinsics.checkNotNullParameter(null, "struct");
                ((fo.b) protocol).getClass();
                Intrinsics.checkNotNullParameter("BrowserVisitURLEvent", "structName");
                protocol.e("browserVisitUrlEventType", 1, (byte) 8);
                throw null;
            case 2:
                ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(obj);
                Intrinsics.checkNotNullParameter(protocol, "protocol");
                Intrinsics.checkNotNullParameter(null, "struct");
                ((fo.b) protocol).getClass();
                Intrinsics.checkNotNullParameter("BusinessHubImpression", "structName");
                throw null;
            case 3:
                ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(obj);
                Intrinsics.checkNotNullParameter(protocol, "protocol");
                Intrinsics.checkNotNullParameter(null, "struct");
                ((fo.b) protocol).getClass();
                Intrinsics.checkNotNullParameter("CampaignEvent", "structName");
                throw null;
            case 4:
                ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(obj);
                Intrinsics.checkNotNullParameter(protocol, "protocol");
                Intrinsics.checkNotNullParameter(null, "struct");
                ((fo.b) protocol).getClass();
                Intrinsics.checkNotNullParameter("CatalogsEvent", "structName");
                throw null;
            case 5:
                ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(obj);
                Intrinsics.checkNotNullParameter(protocol, "protocol");
                Intrinsics.checkNotNullParameter(null, "struct");
                ((fo.b) protocol).getClass();
                Intrinsics.checkNotNullParameter("ClassFeedGuideImpression", "structName");
                throw null;
            case 6:
                h32.a0 struct = (h32.a0) obj;
                Intrinsics.checkNotNullParameter(protocol, "protocol");
                Intrinsics.checkNotNullParameter(struct, "struct");
                fo.b bVar = (fo.b) protocol;
                bVar.getClass();
                Intrinsics.checkNotNullParameter("CollectionItemEventData", "structName");
                struct.getClass();
                Long l13 = struct.f66822a;
                if (l13 != null) {
                    n60.o.r(protocol, "itemPinId", 2, (byte) 10, l13);
                }
                String str = struct.f66823b;
                if (str != null) {
                    protocol.e("itemImageSignature", 3, (byte) 11);
                    protocol.m(str);
                }
                Long l14 = struct.f66824c;
                if (l14 != null) {
                    n60.o.r(protocol, "gItemPinPromotionId", 4, (byte) 10, l14);
                }
                Short sh3 = struct.f66825d;
                if (sh3 != null) {
                    i13 = 6;
                    n60.o.s(protocol, "itemSlotIndex", 5, (byte) 6, sh3);
                } else {
                    i13 = 6;
                }
                String str2 = struct.f66826e;
                if (str2 != null) {
                    protocol.e("pinIdStr", i13, (byte) 11);
                    protocol.m(str2);
                }
                Long l15 = struct.f66827f;
                if (l15 != null) {
                    n60.o.r(protocol, "internalItemId", 8, (byte) 10, l15);
                }
                bVar.c((byte) 0);
                return;
            case 7:
                b0 struct2 = (b0) obj;
                Intrinsics.checkNotNullParameter(protocol, "protocol");
                Intrinsics.checkNotNullParameter(struct2, "struct");
                fo.b bVar2 = (fo.b) protocol;
                bVar2.getClass();
                Intrinsics.checkNotNullParameter("CollectionItemImpression", "structName");
                if (struct2.f66837a != null) {
                    protocol.e("pinIdStr", 1, (byte) 11);
                    protocol.m(struct2.f66837a);
                }
                Long l16 = struct2.f66838b;
                if (l16 != null) {
                    n60.o.r(protocol, "pinId", 2, (byte) 10, l16);
                }
                String str3 = struct2.f66839c;
                if (str3 != null) {
                    b13 = 11;
                    protocol.e("insertionId", 3, (byte) 11);
                    protocol.m(str3);
                } else {
                    b13 = 11;
                }
                String str4 = struct2.f66840d;
                if (str4 != null) {
                    protocol.e("imageSignature", 4, b13);
                    protocol.m(str4);
                }
                Long l17 = struct2.f66841e;
                if (l17 != null) {
                    b14 = 10;
                    n60.o.r(protocol, "time", 5, (byte) 10, l17);
                } else {
                    b14 = 10;
                }
                Long l18 = struct2.f66842f;
                if (l18 != null) {
                    n60.o.r(protocol, "endTime", 6, b14, l18);
                }
                Integer num = struct2.f66843g;
                if (num != null) {
                    i14 = 8;
                    n60.o.q(protocol, "yPosition", 7, (byte) 8, num);
                } else {
                    i14 = 8;
                }
                Long l19 = struct2.f66844h;
                if (l19 != null) {
                    b15 = 10;
                    n60.o.r(protocol, "collectionDataId", i14, (byte) 10, l19);
                } else {
                    b15 = 10;
                }
                Long l23 = struct2.f66845i;
                if (l23 != null) {
                    n60.o.r(protocol, "itemPinId", 9, b15, l23);
                }
                String str5 = struct2.f66846j;
                if (str5 != null) {
                    protocol.e("itemImageSignature", b15, (byte) 11);
                    protocol.m(str5);
                }
                Short sh4 = struct2.f66847k;
                if (sh4 != null) {
                    n60.o.s(protocol, "itemSlotIndex", 11, (byte) 6, sh4);
                }
                Long l24 = struct2.f66848l;
                if (l24 != null) {
                    n60.o.r(protocol, "internalItemId", 12, b15, l24);
                }
                bVar2.c((byte) 0);
                return;
            case 8:
                h32.c0 struct3 = (h32.c0) obj;
                Intrinsics.checkNotNullParameter(protocol, "protocol");
                Intrinsics.checkNotNullParameter(struct3, "struct");
                fo.b bVar3 = (fo.b) protocol;
                bVar3.getClass();
                Intrinsics.checkNotNullParameter("CommentImpression", "structName");
                if (struct3.f66887a != null) {
                    protocol.e("commentId", 1, (byte) 11);
                    protocol.m(struct3.f66887a);
                }
                Long l25 = struct3.f66888b;
                if (l25 != null) {
                    n60.o.r(protocol, "time", 2, (byte) 10, l25);
                }
                Long l26 = struct3.f66889c;
                if (l26 != null) {
                    n60.o.r(protocol, "endTime", 3, (byte) 10, l26);
                }
                Short sh5 = struct3.f66890d;
                if (sh5 != null) {
                    n60.o.s(protocol, "slotIndex", 4, (byte) 6, sh5);
                }
                String str6 = struct3.f66891e;
                if (str6 != null) {
                    b16 = 11;
                    protocol.e("pinId", 5, (byte) 11);
                    protocol.m(str6);
                } else {
                    b16 = 11;
                }
                String str7 = struct3.f66892f;
                if (str7 != null) {
                    protocol.e("pinOwnerUserId", 6, b16);
                    protocol.m(str7);
                }
                String str8 = struct3.f66893g;
                if (str8 != null) {
                    protocol.e("pinType", 7, b16);
                    protocol.m(str8);
                }
                String str9 = struct3.f66894h;
                if (str9 != null) {
                    protocol.e("parentId", 8, b16);
                    protocol.m(str9);
                }
                String str10 = struct3.f66895i;
                if (str10 != null) {
                    protocol.e("parentType", 9, b16);
                    protocol.m(str10);
                }
                String str11 = struct3.f66896j;
                if (str11 != null) {
                    protocol.e("commentType", 10, b16);
                    protocol.m(str11);
                }
                bVar3.c((byte) 0);
                return;
            case 9:
                ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(obj);
                Intrinsics.checkNotNullParameter(protocol, "protocol");
                Intrinsics.checkNotNullParameter(null, "struct");
                ((fo.b) protocol).getClass();
                Intrinsics.checkNotNullParameter("CommerceData", "structName");
                throw null;
            case 10:
                h32.d0 struct4 = (h32.d0) obj;
                Intrinsics.checkNotNullParameter(protocol, "protocol");
                Intrinsics.checkNotNullParameter(struct4, "struct");
                fo.b bVar4 = (fo.b) protocol;
                bVar4.getClass();
                Intrinsics.checkNotNullParameter("ComponentData", "structName");
                struct4.getClass();
                b3 b3Var = struct4.f66943a;
                if (b3Var != null) {
                    protocol.e("toastType", 2, (byte) 8);
                    protocol.g(b3Var.getValue());
                }
                bVar4.c((byte) 0);
                return;
            case 11:
                ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(obj);
                Intrinsics.checkNotNullParameter(protocol, "protocol");
                Intrinsics.checkNotNullParameter(null, "struct");
                ((fo.b) protocol).getClass();
                Intrinsics.checkNotNullParameter("Creator", "structName");
                throw null;
            case 12:
                ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(obj);
                Intrinsics.checkNotNullParameter(protocol, "protocol");
                Intrinsics.checkNotNullParameter(null, "struct");
                ((fo.b) protocol).getClass();
                Intrinsics.checkNotNullParameter("CreatorBubbleImpression", "structName");
                throw null;
            case 13:
                k0 struct5 = (k0) obj;
                Intrinsics.checkNotNullParameter(protocol, "protocol");
                Intrinsics.checkNotNullParameter(struct5, "struct");
                fo.b bVar5 = (fo.b) protocol;
                bVar5.getClass();
                Intrinsics.checkNotNullParameter("DcoEventData", "structName");
                if (struct5.f67128a != null) {
                    protocol.e("clientCreativeType", 1, (byte) 8);
                    protocol.g(struct5.f67128a.intValue());
                }
                String str12 = struct5.f67129b;
                if (str12 != null) {
                    protocol.e("ceAltImageSignature", 2, (byte) 11);
                    protocol.m(str12);
                }
                Short sh6 = struct5.f67130c;
                if (sh6 != null) {
                    n60.o.s(protocol, "dpaLayoutType", 3, (byte) 6, sh6);
                }
                String str13 = struct5.f67131d;
                if (str13 != null) {
                    protocol.e("dpaVariantId", 4, (byte) 11);
                    protocol.m(str13);
                }
                List list = struct5.f67132e;
                if (list != null) {
                    protocol.e("collectionInternalItemIdList", 7, (byte) 15);
                    Iterator j13 = n60.o.j(list, protocol, (byte) 10);
                    while (j13.hasNext()) {
                        protocol.h(((Number) j13.next()).longValue());
                    }
                }
                List list2 = struct5.f67133f;
                if (list2 != null) {
                    protocol.e("collectionPinIdList", 8, (byte) 15);
                    Iterator j14 = n60.o.j(list2, protocol, (byte) 10);
                    while (j14.hasNext()) {
                        protocol.h(((Number) j14.next()).longValue());
                    }
                }
                bVar5.c((byte) 0);
                return;
            case 14:
                ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(obj);
                Intrinsics.checkNotNullParameter(protocol, "protocol");
                Intrinsics.checkNotNullParameter(null, "struct");
                ((fo.b) protocol).getClass();
                Intrinsics.checkNotNullParameter("DeleteRecentSearch", "structName");
                throw null;
            case 15:
                ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(obj);
                Intrinsics.checkNotNullParameter(protocol, "protocol");
                Intrinsics.checkNotNullParameter(null, "struct");
                ((fo.b) protocol).getClass();
                Intrinsics.checkNotNullParameter("Diagnostics", "structName");
                throw null;
            case 16:
                ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(obj);
                Intrinsics.checkNotNullParameter(protocol, "protocol");
                Intrinsics.checkNotNullParameter(null, "struct");
                ((fo.b) protocol).getClass();
                Intrinsics.checkNotNullParameter("DirectToSiteEventData", "structName");
                throw null;
            case 17:
                r0 struct6 = (r0) obj;
                Intrinsics.checkNotNullParameter(protocol, "protocol");
                Intrinsics.checkNotNullParameter(struct6, "struct");
                fo.b bVar6 = (fo.b) protocol;
                bVar6.getClass();
                Intrinsics.checkNotNullParameter("DynamicAdDataEventData", "structName");
                if (struct6.f67214a != null) {
                    b17 = 11;
                    protocol.e("dynamicAdPrice", 1, (byte) 11);
                    protocol.m(struct6.f67214a);
                } else {
                    b17 = 11;
                }
                String str14 = struct6.f67215b;
                if (str14 != null) {
                    protocol.e("dynamicAdStrikethroughPrice", 2, b17);
                    protocol.m(str14);
                }
                Double d2 = struct6.f67216c;
                if (d2 != null) {
                    i15 = 4;
                    protocol.e("dynamicAdRatings", 3, (byte) 4);
                    protocol.d(d2.doubleValue());
                } else {
                    i15 = 4;
                }
                Integer num2 = struct6.f67217d;
                if (num2 != null) {
                    n60.o.q(protocol, "dynamicAdRatingCount", i15, (byte) 8, num2);
                }
                bVar6.c((byte) 0);
                return;
            case 18:
                ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(obj);
                Intrinsics.checkNotNullParameter(protocol, "protocol");
                Intrinsics.checkNotNullParameter(null, "struct");
                ((fo.b) protocol).getClass();
                Intrinsics.checkNotNullParameter("ElementData", "structName");
                throw null;
            case 19:
                ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(obj);
                Intrinsics.checkNotNullParameter(protocol, "protocol");
                Intrinsics.checkNotNullParameter(null, "struct");
                ((fo.b) protocol).getClass();
                Intrinsics.checkNotNullParameter("ExplicitSignalEventData", "structName");
                throw null;
            case 20:
                ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(obj);
                Intrinsics.checkNotNullParameter(protocol, "protocol");
                Intrinsics.checkNotNullParameter(null, "struct");
                ((fo.b) protocol).getClass();
                Intrinsics.checkNotNullParameter("GuideImpression", "structName");
                throw null;
            case 21:
                ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(obj);
                Intrinsics.checkNotNullParameter(protocol, "protocol");
                Intrinsics.checkNotNullParameter(null, "struct");
                ((fo.b) protocol).getClass();
                Intrinsics.checkNotNullParameter("HideFeedback", "structName");
                throw null;
            case 22:
                ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(obj);
                Intrinsics.checkNotNullParameter(protocol, "protocol");
                Intrinsics.checkNotNullParameter(null, "struct");
                ((fo.b) protocol).getClass();
                Intrinsics.checkNotNullParameter("InsertionData", "structName");
                protocol.e("requestId", 1, (byte) 11);
                throw null;
            case 23:
                ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(obj);
                Intrinsics.checkNotNullParameter(protocol, "protocol");
                Intrinsics.checkNotNullParameter(null, "struct");
                ((fo.b) protocol).getClass();
                Intrinsics.checkNotNullParameter("InterestImpression", "structName");
                throw null;
            case 24:
                h32.m1 struct7 = (h32.m1) obj;
                Intrinsics.checkNotNullParameter(protocol, "protocol");
                Intrinsics.checkNotNullParameter(struct7, "struct");
                fo.b bVar7 = (fo.b) protocol;
                bVar7.getClass();
                Intrinsics.checkNotNullParameter("InterestImpressionData", "structName");
                if (struct7.f67141a != null) {
                    protocol.e("interestImpressions", 1, (byte) 15);
                    Iterator j15 = n60.o.j(struct7.f67141a, protocol, (byte) 12);
                    while (j15.hasNext()) {
                        ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(j15.next());
                        h32.y.f67419f.y0(protocol, null);
                    }
                }
                bVar7.c((byte) 0);
                return;
            case 25:
                ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(obj);
                Intrinsics.checkNotNullParameter(protocol, "protocol");
                Intrinsics.checkNotNullParameter(null, "struct");
                ((fo.b) protocol).getClass();
                Intrinsics.checkNotNullParameter("LimitData", "structName");
                throw null;
            case 26:
                ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(obj);
                Intrinsics.checkNotNullParameter(protocol, "protocol");
                Intrinsics.checkNotNullParameter(null, "struct");
                ((fo.b) protocol).getClass();
                Intrinsics.checkNotNullParameter("LimitResult", "structName");
                throw null;
            case 27:
                ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(obj);
                Intrinsics.checkNotNullParameter(protocol, "protocol");
                Intrinsics.checkNotNullParameter(null, "struct");
                ((fo.b) protocol).getClass();
                Intrinsics.checkNotNullParameter("LiveSessionCommentImpression", "structName");
                throw null;
            case 28:
                ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(obj);
                Intrinsics.checkNotNullParameter(protocol, "protocol");
                Intrinsics.checkNotNullParameter(null, "struct");
                ((fo.b) protocol).getClass();
                Intrinsics.checkNotNullParameter("LiveSessionProductImpression", "structName");
                throw null;
            default:
                ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(obj);
                Intrinsics.checkNotNullParameter(protocol, "protocol");
                Intrinsics.checkNotNullParameter(null, "struct");
                ((fo.b) protocol).getClass();
                Intrinsics.checkNotNullParameter("ModularizationResultData", "structName");
                throw null;
        }
    }

    @Override // wt1.a
    public boolean z(Object obj, Object obj2) {
        switch (this.f80561a) {
            case 0:
                dl1.s oldItem = (dl1.s) obj;
                dl1.s newItem = (dl1.s) obj2;
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                if ((oldItem instanceof u01.r) && (newItem instanceof u01.r)) {
                    u01.r other = (u01.r) newItem;
                    Intrinsics.checkNotNullParameter(other, "other");
                    if (Intrinsics.d((u01.r) oldItem, other)) {
                        break;
                    }
                }
                break;
            default:
                y oldItem2 = (y) obj;
                y newItem2 = (y) obj2;
                Intrinsics.checkNotNullParameter(oldItem2, "oldItem");
                Intrinsics.checkNotNullParameter(newItem2, "newItem");
                if (Intrinsics.d(oldItem2.m(), newItem2.m()) && Intrinsics.d(oldItem2.d(), newItem2.d())) {
                    break;
                }
                break;
        }
        return true;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(int i13, int i14) {
        this(17);
        this.f80561a = i13;
        switch (i13) {
            case 18:
                this(18);
                break;
            case 19:
                this(19);
                break;
            case 20:
                this(20);
                break;
            case 21:
                this(21);
                break;
            default:
                break;
        }
    }
}
