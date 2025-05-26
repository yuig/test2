package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import ao2.m0;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.jvm.internal.r;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzak extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzak> CREATOR = new lh.a(23);

    /* renamed from: g, reason: collision with root package name */
    public static final byte[] f31183g = "WebAuthn PRF\u0000".getBytes(StandardCharsets.UTF_8);

    /* renamed from: f, reason: collision with root package name */
    public final byte[][] f31184f;

    public zzak(byte[][] bArr) {
        com.bumptech.glide.d.j(bArr != null);
        com.bumptech.glide.d.j(1 == ((bArr.length & 1) ^ 1));
        int i13 = 0;
        while (i13 < bArr.length) {
            com.bumptech.glide.d.j(i13 == 0 || bArr[i13] != null);
            int i14 = i13 + 1;
            com.bumptech.glide.d.j(bArr[i14] != null);
            int length = bArr[i14].length;
            com.bumptech.glide.d.j(length == 32 || length == 64);
            i13 += 2;
        }
        this.f31184f = bArr;
    }

    public static zzak e(JSONObject jSONObject, boolean z13) {
        ArrayList arrayList = new ArrayList();
        try {
            if (jSONObject.has("eval")) {
                arrayList.add(null);
                if (z13) {
                    arrayList.add(x1(jSONObject.getJSONObject("eval")));
                } else {
                    arrayList.add(l2(jSONObject.getJSONObject("eval")));
                }
            }
            if (jSONObject.has("evalByCredential")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("evalByCredential");
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    arrayList.add(m0.r(next));
                    if (z13) {
                        arrayList.add(x1(jSONObject2.getJSONObject(next)));
                    } else {
                        arrayList.add(l2(jSONObject2.getJSONObject(next)));
                    }
                }
            }
            return new zzak((byte[][]) arrayList.toArray(new byte[0][]));
        } catch (IllegalArgumentException unused) {
            throw new JSONException("invalid base64url value");
        }
    }

    public static JSONObject f(byte[] bArr) {
        JSONObject jSONObject = new JSONObject();
        if (bArr.length == 32) {
            jSONObject.put("first", m0.s(bArr));
        } else {
            jSONObject.put("first", Base64.encodeToString(bArr, 0, 32, 11));
            jSONObject.put("second", Base64.encodeToString(bArr, 32, 32, 11));
        }
        return jSONObject;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static byte[] k1(byte[] r7) {
        /*
            int r0 = gi.w0.f65127a
            gi.y0 r0 = gi.v0.f65123a
            boolean r1 = r0.f65138c
            int r2 = r0.f65137b
            java.security.MessageDigest r0 = r0.f65136a
            if (r1 == 0) goto L18
            gi.x0 r1 = new gi.x0     // Catch: java.lang.CloneNotSupportedException -> L18
            java.lang.Object r3 = r0.clone()     // Catch: java.lang.CloneNotSupportedException -> L18
            java.security.MessageDigest r3 = (java.security.MessageDigest) r3     // Catch: java.lang.CloneNotSupportedException -> L18
            r1.<init>(r3, r2)     // Catch: java.lang.CloneNotSupportedException -> L18
            goto L25
        L18:
            gi.x0 r1 = new gi.x0
            java.lang.String r0 = r0.getAlgorithm()
            java.security.MessageDigest r0 = java.security.MessageDigest.getInstance(r0)     // Catch: java.security.NoSuchAlgorithmException -> L8a
            r1.<init>(r0, r2)
        L25:
            byte[] r0 = com.google.android.gms.fido.fido2.api.common.zzak.f31183g
            r0.getClass()
            int r2 = r0.length
            boolean r3 = r1.f65131e
            r4 = 1
            r3 = r3 ^ r4
            java.lang.String r5 = "Cannot re-use a Hasher after calling hash() on it"
            if (r3 == 0) goto L84
            java.security.MessageDigest r3 = r1.f65129c
            r6 = 0
            r3.update(r0, r6, r2)
            r7.getClass()
            int r0 = r7.length
            boolean r2 = r1.f65131e
            r2 = r2 ^ r4
            if (r2 == 0) goto L7e
            r3.update(r7, r6, r0)
            boolean r7 = r1.f65131e
            r7 = r7 ^ r4
            if (r7 == 0) goto L78
            r1.f65131e = r4
            int r7 = r3.getDigestLength()
            int r0 = r1.f65130d
            if (r0 != r7) goto L60
            byte[] r7 = r3.digest()
            char[] r0 = gi.u0.f65119a
            gi.t0 r0 = new gi.t0
            r0.<init>(r7)
            goto L6f
        L60:
            byte[] r7 = r3.digest()
            byte[] r7 = java.util.Arrays.copyOf(r7, r0)
            char[] r0 = gi.u0.f65119a
            gi.t0 r0 = new gi.t0
            r0.<init>(r7)
        L6f:
            byte[] r7 = r0.f65117b
            java.lang.Object r7 = r7.clone()
            byte[] r7 = (byte[]) r7
            return r7
        L78:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            r7.<init>(r5)
            throw r7
        L7e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            r7.<init>(r5)
            throw r7
        L84:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            r7.<init>(r5)
            throw r7
        L8a:
            r7 = move-exception
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.fido.fido2.api.common.zzak.k1(byte[]):byte[]");
    }

    public static byte[] l2(JSONObject jSONObject) {
        byte[] k13 = k1(m0.r(jSONObject.getString("first")));
        return !jSONObject.has("second") ? k13 : r.z0(k13, k1(m0.r(jSONObject.getString("second"))));
    }

    public static byte[] x1(JSONObject jSONObject) {
        byte[] r13 = m0.r(jSONObject.getString("first"));
        if (r13.length != 32) {
            throw new JSONException("hashed PRF value with wrong length");
        }
        if (!jSONObject.has("second")) {
            return r13;
        }
        byte[] r14 = m0.r(jSONObject.getString("second"));
        if (r14.length == 32) {
            return r.z0(r13, r14);
        }
        throw new JSONException("hashed PRF value with wrong length");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzak) {
            return Arrays.deepEquals(this.f31184f, ((zzak) obj).f31184f);
        }
        return false;
    }

    public final int hashCode() {
        int i13 = 0;
        for (byte[] bArr : this.f31184f) {
            if (bArr != null) {
                i13 ^= Arrays.hashCode(new Object[]{bArr});
            }
        }
        return i13;
    }

    public final String toString() {
        byte[][] bArr = this.f31184f;
        try {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = null;
            for (int i13 = 0; i13 < bArr.length; i13 += 2) {
                if (bArr[i13] == null) {
                    jSONObject.put("eval", f(bArr[i13 + 1]));
                } else {
                    if (jSONObject2 == null) {
                        jSONObject2 = new JSONObject();
                        jSONObject.put("evalByCredential", jSONObject2);
                    }
                    jSONObject2.put(m0.s(bArr[i13]), f(bArr[i13 + 1]));
                }
            }
            return "PrfExtension{" + jSONObject.toString() + "}";
        } catch (JSONException e13) {
            return a.a.k("PrfExtension{Exception:", e13.getMessage(), "}");
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = bs1.c.M2(parcel, 20293);
        byte[][] bArr = this.f31184f;
        if (bArr != null) {
            int M22 = bs1.c.M2(parcel, 1);
            parcel.writeInt(bArr.length);
            for (byte[] bArr2 : bArr) {
                parcel.writeByteArray(bArr2);
            }
            bs1.c.N2(parcel, M22);
        }
        bs1.c.N2(parcel, M2);
    }
}
