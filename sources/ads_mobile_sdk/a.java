package ads_mobile_sdk;

import a.pd;
import a.x4;
import android.util.Base64;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import tb.f;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public MessageDigest f2121a;

    /* renamed from: b, reason: collision with root package name */
    public final bt2 f2122b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f2123c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public boolean f2124d = false;

    /* renamed from: e, reason: collision with root package name */
    public SecureRandom f2125e;

    public a(bt2 bt2Var) {
        this.f2122b = bt2Var;
    }

    public final byte[] a(byte[] bArr) {
        byte[] digest;
        synchronized (this.f2123c) {
            this.f2121a.reset();
            this.f2121a.update(bArr);
            digest = this.f2121a.digest();
        }
        return digest;
    }

    public final byte[] a(byte[] bArr, String str, boolean z13) {
        byte[] bytes;
        int i13 = z13 ? RecyclerViewTypes.VIEW_TYPE_ADS_CAROUSEL : 255;
        bf.b.k(bArr.length <= i13);
        ByteBuffer put = ByteBuffer.allocate(i13 + 1).put((byte) bArr.length);
        if (bArr.length < i13) {
            int length = i13 - bArr.length;
            byte[] bArr2 = new byte[length];
            this.f2125e.nextBytes(bArr2);
            byte[] copyOf = Arrays.copyOf(bArr, bArr.length + length);
            System.arraycopy(bArr2, 0, copyOf, bArr.length, length);
            bArr = copyOf;
        }
        byte[] array = put.put(bArr).array();
        if (z13) {
            array = ByteBuffer.allocate(RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER).put(a(array)).put(array).array();
        }
        byte[] bArr3 = new byte[RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER];
        for (x4 x4Var : new ua0().G2) {
            x4Var.a(array, bArr3);
        }
        if (!f.i0(str)) {
            if (str.length() > 32) {
                bytes = str.substring(0, 32).getBytes(StandardCharsets.UTF_8);
            } else {
                bytes = str.getBytes(StandardCharsets.UTF_8);
            }
            c cVar = new c(bytes);
            int i14 = 0;
            int i15 = 0;
            for (int i16 = 0; i16 < 256; i16++) {
                i14 = (i14 + 1) & 255;
                byte[] bArr4 = cVar.f3665a;
                byte b13 = bArr4[i14];
                i15 = (i15 + b13) & 255;
                bArr4[i14] = bArr4[i15];
                bArr4[i15] = b13;
                bArr3[i16] = (byte) (bArr4[(bArr4[i14] + b13) & 255] ^ bArr3[i16]);
            }
        }
        return bArr3;
    }

    public final String a(wb wbVar, String str) {
        try {
            return Base64.encodeToString(((qc) a(str, wbVar.a()).a()).a(), 11);
        } catch (IllegalArgumentException unused) {
            return a(lb.PSN_ENCODE_SIZE_FAIL, str);
        }
    }

    public final a.da a(String str, byte[] bArr) {
        int i13;
        a.da r13 = qc.r();
        gl a13 = il.a(a(bArr));
        r13.b();
        qc qcVar = (qc) r13.f10110b;
        qcVar.getClass();
        i13 = qcVar.bitField0_;
        qcVar.bitField0_ = i13 | 1;
        qcVar.hash_ = a13;
        int b13 = a.a.b(bArr.length, 1, 255, 1);
        ArrayList arrayList = new ArrayList();
        for (int i14 = 0; i14 < b13; i14++) {
            int i15 = i14 * 255;
            int i16 = i15 + 255;
            if (bArr.length <= i16) {
                i16 = bArr.length;
            }
            arrayList.add(Arrays.copyOfRange(bArr, i15, i16));
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            r13.g(il.a(a((byte[]) it.next(), str, false)));
        }
        return r13;
    }

    public final String a(lb lbVar, String str) {
        pd u13 = wb.u();
        u13.h(lbVar.f7753a);
        return Base64.encodeToString(a(((wb) u13.a()).a(), str, true), 11);
    }

    public final void a() {
        boolean z13;
        synchronized (this) {
            z13 = this.f2124d;
        }
        if (z13) {
            return;
        }
        a(new SecureRandom());
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0033: INVOKE (r2 I:ads_mobile_sdk.bs2) VIRTUAL call: ads_mobile_sdk.bs2.a():void A[Catch: all -> 0x0031, MD:():void (m), TRY_ENTER] (LINE:73), block:B:20:0x0033 */
    public final synchronized void a(SecureRandom secureRandom) {
        bs2 a13;
        try {
            bt2 bt2Var = this.f2122b;
            bs2 bs2Var = new bs2(xb0.EVENT_ID_FALLBACK_INIT_OBFUSCATOR, bt2Var.f3596b, bt2Var.f3595a);
            try {
                bs2Var.b();
                this.f2125e = secureRandom;
                this.f2121a = MessageDigest.getInstance("MD5");
                this.f2124d = true;
            } catch (NoSuchAlgorithmException e13) {
                bs2Var.a(e13);
            } catch (Throwable th3) {
                bs2Var.a(th3);
                throw th3;
            }
            bs2Var.a();
        } catch (Throwable th4) {
            a13.a();
            throw th4;
        }
    }
}
