package com.pinterest.encryption.dataEncryptionLibrary;

import android.app.Application;
import android.util.Log;
import com.google.android.gms.ads.AdSize;
import com.google.crypto.tink.internal.TinkBugException;
import com.pinterest.analytics.kibana.KibanaMetrics;
import com.pinterest.api.model.wy0;
import com.pinterest.encryption.dataEncryptionLibrary.DataEncryptionException;
import com.pinterest.security.DataEncryptionKibanaLogger$Log$Payload;
import el.a0;
import el.c1;
import el.f0;
import el.h0;
import el.u;
import el.u0;
import el.v;
import el.v0;
import il.g4;
import il.j4;
import il.l4;
import il.s4;
import il.t4;
import il.u4;
import il.v4;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kg0.b;
import kh2.r;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import na.c;
import nd.g;
import oi.u6;
import r42.d;
import s7.z;
import uk.i;
import uk.k;
import uk.l;
import uk.m;
import uk.n;
import uk.q;
import xk2.f;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Application f45035a;

    /* renamed from: b, reason: collision with root package name */
    public final kg0.a f45036b;

    /* renamed from: c, reason: collision with root package name */
    public final b f45037c;

    public a(Application application, r42.b dataEncryptionLogger, d dataEncryptionSRLogger) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(dataEncryptionLogger, "dataEncryptionLogger");
        Intrinsics.checkNotNullParameter(dataEncryptionSRLogger, "dataEncryptionSRLogger");
        this.f45035a = application;
        this.f45036b = dataEncryptionLogger;
        this.f45037c = dataEncryptionSRLogger;
    }

    public static byte[] a(n nVar, String str) {
        Log.d("data_encryption", "encryption");
        try {
            Object c13 = nVar.c(uk.a.class);
            Intrinsics.checkNotNullExpressionValue(c13, "getPrimitive(...)");
            uk.a aVar = (uk.a) c13;
            Charset UTF_8 = StandardCharsets.UTF_8;
            Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
            byte[] bytes = str.getBytes(UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            byte[] a13 = aVar.a(bytes, null);
            if (a13 != null) {
                return a13;
            }
            throw new DataEncryptionException.DataEncryptionFailure(null);
        } catch (Exception unused) {
            throw new DataEncryptionException.PrimitiveRetrievalError(null);
        }
    }

    public final byte[] b(String str, boolean z13) {
        q qVar;
        int i13;
        l4 l4Var;
        Log.d("data_encryption", "attempt_encryption_with_new_keyset_handle");
        Log.d("data_encryption", "main_key_generation");
        try {
            na.b bVar = new na.b(this.f45035a);
            bVar.f90080d = z13;
            bVar.f90081e = AdSize.MEDIUM_RECTANGLE_WIDTH;
            bVar.b(c.AES256_GCM);
            bVar.a();
            Log.d("data_encryption", "keyset_generation");
            f0 f0Var = f0.f59486b;
            synchronized (f0Var) {
                if (!f0Var.f59487a.containsKey("AES128_GCM")) {
                    throw new GeneralSecurityException("Name AES128_GCM does not exist");
                }
                qVar = (q) f0Var.f59487a.get("AES128_GCM");
            }
            if (qVar == null) {
                try {
                    qVar = r.f1((qVar instanceof u ? ((u) qVar).f59536a.f59546b : ((v0) h0.f59491b.h(qVar)).f59546b).d());
                } catch (GeneralSecurityException e13) {
                    throw new TinkBugException("Parsing parameters failed in getProto(). You probably want to call some Tink register function for " + qVar, e13);
                }
            }
            int i14 = 4;
            z zVar = new z(4);
            k kVar = new k(qVar);
            l lVar = l.f122369a;
            kVar.f122367c = lVar;
            z zVar2 = kVar.f122368d;
            int i15 = 0;
            if (zVar2 != null) {
                Iterator it = ((List) zVar2.f111346b).iterator();
                while (it.hasNext()) {
                    ((k) it.next()).f122365a = false;
                }
            }
            char c13 = 1;
            kVar.f122365a = true;
            if (kVar.f122368d != null) {
                throw new IllegalStateException("Entry has already been added to a KeysetHandle.Builder");
            }
            Iterator it2 = ((List) zVar.f111346b).iterator();
            while (it2.hasNext()) {
                ((k) it2.next()).f122365a = false;
            }
            kVar.f122368d = zVar;
            ((List) zVar.f111346b).add(kVar);
            if (((GeneralSecurityException) zVar.f111347c) != null) {
                throw new GeneralSecurityException("Cannot build keyset due to error in original", (GeneralSecurityException) zVar.f111347c);
            }
            if (zVar.f111345a) {
                throw new GeneralSecurityException("KeysetHandle.Builder#build must only be called once");
            }
            zVar.f111345a = true;
            s4 G = v4.G();
            ArrayList arrayList = new ArrayList(((List) zVar.f111346b).size());
            List list = (List) zVar.f111346b;
            for (int i16 = 0; i16 < list.size() - 1; i16++) {
                if (((k) list.get(i16)).f122367c == lVar && ((k) list.get(i16 + 1)).f122367c != lVar) {
                    throw new GeneralSecurityException("Entries with 'withRandomId()' may only be followed by other entries with 'withRandomId()'.");
                }
            }
            HashSet hashSet = new HashSet();
            Integer num = null;
            for (k kVar2 : (List) zVar.f111346b) {
                kVar2.getClass();
                l lVar2 = kVar2.f122367c;
                if (lVar2 == null) {
                    throw new GeneralSecurityException("No ID was set (with withFixedId or withRandomId)");
                }
                if (lVar2 == lVar) {
                    i13 = i15;
                    while (true) {
                        if (i13 != 0 && !hashSet.contains(Integer.valueOf(i13))) {
                            break;
                        }
                        Charset charset = c1.f59463a;
                        SecureRandom secureRandom = new SecureRandom();
                        byte[] bArr = new byte[i14];
                        int i17 = i15;
                        while (i17 == 0) {
                            secureRandom.nextBytes(bArr);
                            i17 = (bArr[3] & 255) | ((bArr[c13] & 255) << 16) | ((bArr[i15] & 255) << 24) | ((bArr[2] & 255) << 8);
                            i14 = 4;
                        }
                        i13 = i17;
                    }
                } else {
                    i13 = i15;
                }
                if (hashSet.contains(Integer.valueOf(i13))) {
                    throw new GeneralSecurityException(a.a.e("Id ", i13, " is used twice in the keyset"));
                }
                hashSet.add(Integer.valueOf(i13));
                q qVar2 = kVar2.f122366b;
                se.l b13 = a0.f59451b.b(qVar2, qVar2.a() ? Integer.valueOf(i13) : null);
                m mVar = new m(b13);
                Object obj = i.f122360b;
                u0 u0Var = (u0) h0.f59491b.g(b13);
                Integer num2 = u0Var.f59542f;
                if (num2 != null && num2.intValue() != i13) {
                    throw new GeneralSecurityException("Wrong ID set for key with ID requirement");
                }
                if (obj.equals(obj)) {
                    l4Var = l4.ENABLED;
                } else if (i.f122361c.equals(obj)) {
                    l4Var = l4.DISABLED;
                } else {
                    if (!i.f122362d.equals(obj)) {
                        throw new IllegalStateException("Unknown key status");
                    }
                    l4Var = l4.DESTROYED;
                }
                t4 J2 = u4.J();
                g4 H = j4.H();
                H.j(u0Var.f59537a);
                H.k(u0Var.f59539c);
                H.i(u0Var.f59540d);
                J2.g();
                u4.A((u4) J2.f33596b, (j4) H.a());
                J2.g();
                u4.C((u4) J2.f33596b, l4Var);
                J2.g();
                u4.D((u4) J2.f33596b, i13);
                J2.g();
                u4.B((u4) J2.f33596b, u0Var.f59541e);
                u4 u4Var = (u4) J2.a();
                G.g();
                v4.B((v4) G.f33596b, u4Var);
                if (kVar2.f122365a) {
                    if (num != null) {
                        throw new GeneralSecurityException("Two primaries were set");
                    }
                    num = Integer.valueOf(i13);
                }
                arrayList.add(mVar);
                i14 = 4;
                c13 = 1;
                i15 = 0;
            }
            if (num == null) {
                throw new GeneralSecurityException("No primary was set");
            }
            int intValue = num.intValue();
            G.g();
            v4.A((v4) G.f33596b, intValue);
            v4 v4Var = (v4) G.a();
            if (v4Var.D() <= 0) {
                throw new GeneralSecurityException("empty keyset");
            }
            n nVar = new n(v4Var, arrayList, (v) zVar.f111348d);
            Log.d("data_encryption", "tink_key_encryption");
            try {
                File file = new File(this.f45035a.getDir("security_keys", 0).getPath() + File.separator + "encrypted_tink_key");
                if (file.exists()) {
                    file.createNewFile();
                }
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    try {
                        nVar.g(new u6(fileOutputStream, 26), new dl.a());
                        Unit unit = Unit.f80348a;
                        dl2.b.J(fileOutputStream, null);
                        return a(nVar, str);
                    } finally {
                    }
                } catch (Exception e14) {
                    throw new DataEncryptionException.TinkKeyEncryptionFailure(e14);
                }
            } catch (Exception e15) {
                throw new DataEncryptionException.FileCreationFailure(e15);
            }
        } catch (Exception e16) {
            throw new DataEncryptionException.ErrorCreatingMainKey(e16);
        }
    }

    public final boolean c(String key, boolean z13) {
        Intrinsics.checkNotNullParameter(key, "key");
        byte[] g13 = g("PREF_TEST_DATA_ENCRYPTION", "test", z13, Intrinsics.d(key, "PREF_EXP_DATA_ENCRYPTION"));
        return (g13 == null || f(Intrinsics.d(key, "PREF_EXP_DATA_ENCRYPTION"), g13, "PREF_TEST_DATA_ENCRYPTION") == null) ? false : true;
    }

    public final n d(String event) {
        Intrinsics.checkNotNullParameter(event, "event");
        Log.d(event, "keyset_retrieval");
        try {
            FileInputStream fileInputStream = new FileInputStream(new File(a.a.D(this.f45035a.getDir("security_keys", 0).getPath(), File.separator, "encrypted_tink_key")));
            try {
                n d2 = n.d(new g(fileInputStream), new dl.a());
                dl2.b.J(fileInputStream, null);
                return d2;
            } finally {
            }
        } catch (Exception e13) {
            throw new DataEncryptionException.ErrorRetrievingKeysetHandle(e13);
        }
    }

    public final void e(boolean z13, String str, String str2, Exception exc) {
        if (z13) {
            String str3 = exc instanceof DataEncryptionException.ErrorGeneratingKeysetHandle ? "keyset_generation_error" : exc instanceof DataEncryptionException.DataEncryptionFailure ? "data_encryption_failure" : exc instanceof DataEncryptionException.DataDecryptionFailure ? "data_decryption_failure" : exc instanceof DataEncryptionException.ErrorCreatingMainKey ? "main_key_creation_error" : exc instanceof DataEncryptionException.TinkKeyEncryptionFailure ? "tink_key_encryption_failure" : exc instanceof DataEncryptionException.ErrorRetrievingKeysetHandle ? "keyset_retrieval_error" : exc instanceof DataEncryptionException.FileCreationFailure ? "file_creation_failure" : exc instanceof DataEncryptionException.MinSDKVersionReqNotMet ? "min_sdk_req_not_met" : exc instanceof DataEncryptionException.PrimitiveRetrievalError ? "primitive_retrieval_error" : "unknown";
            Log.e(str2, str3);
            r42.b bVar = (r42.b) this.f45036b;
            ox.b bVar2 = (ox.b) ((bf2.b) bVar.f106182a).get();
            ms0.b bVar3 = new ms0.b();
            wy0 f13 = ((b60.d) bVar.f106183b).f();
            String uid = f13 != null ? f13.getUid() : null;
            if (uid == null) {
                uid = "";
            }
            KibanaMetrics.Log.Metadata metadata = new KibanaMetrics.Log.Metadata(uid, null, 2, null);
            DataEncryptionKibanaLogger$Log$Payload payload = new DataEncryptionKibanaLogger$Log$Payload(str, str2, str3, f.b(exc));
            Intrinsics.checkNotNullParameter(metadata, "metadata");
            Intrinsics.checkNotNullParameter(payload, "payload");
            bVar3.b(new r42.a("data_encryption_errors", metadata, payload, null, null, 0L, 56, null));
            Intrinsics.f(bVar2);
            ((vy.m) bVar2).i(bVar3, ox.a.f97979i);
            if (Intrinsics.d(str3, "min_sdk_req_not_met")) {
                return;
            }
            ((d) this.f45037c).a("FAILURE", str2);
        }
    }

    public final String f(boolean z13, byte[] cipherText, String prefKey) {
        Intrinsics.checkNotNullParameter(prefKey, "prefKey");
        Intrinsics.checkNotNullParameter(cipherText, "cipherText");
        Log.d("data_decryption", "attempt");
        String str = null;
        try {
            n d2 = d("data_decryption");
            Log.d("data_decryption", "decryption");
            try {
                byte[] b13 = ((uk.a) d2.c(uk.a.class)).b(cipherText, null);
                Intrinsics.checkNotNullExpressionValue(b13, "decrypt(...)");
                Intrinsics.checkNotNullParameter(b13, "<this>");
                str = new String(b13, Charsets.UTF_8);
            } catch (Exception e13) {
                throw new DataEncryptionException.DataDecryptionFailure(e13);
            }
        } catch (Exception e14) {
            e(z13, prefKey, "data_decryption", e14);
        }
        if (str != null && z13) {
            ((d) this.f45037c).a("SUCCESS", "data_decryption");
        }
        return str;
    }

    public final byte[] g(String prefKey, String plainText, boolean z13, boolean z14) {
        byte[] bArr;
        Intrinsics.checkNotNullParameter(prefKey, "prefKey");
        Intrinsics.checkNotNullParameter(plainText, "plainText");
        try {
            Log.d("data_encryption", "attempt_encryption_with_existing_keyset_handle");
            bArr = a(d("data_encryption"), plainText);
        } catch (DataEncryptionException e13) {
            if (e13 instanceof DataEncryptionException.ErrorRetrievingKeysetHandle) {
                try {
                    bArr = b(plainText, z13);
                } catch (Exception e14) {
                    e(z14, prefKey, "data_encryption", e14);
                    bArr = null;
                    if (bArr != null) {
                        ((d) this.f45037c).a("SUCCESS", "data_encryption");
                    }
                    return bArr;
                }
            } else if (e13 instanceof DataEncryptionException.PrimitiveRetrievalError) {
                try {
                    Log.d("data_encryption", "attempt_encryption_with_existing_keyset_handle");
                    bArr = a(d("data_encryption"), plainText);
                } catch (DataEncryptionException.PrimitiveRetrievalError unused) {
                    new File(a.a.D(this.f45035a.getDir("security_keys", 0).getPath(), File.separator, "encrypted_tink_key")).delete();
                    return g(prefKey, plainText, z13, z14);
                }
            } else {
                e(z14, prefKey, "data_encryption", e13);
                bArr = null;
            }
        } catch (Exception e15) {
            e(z14, prefKey, "data_encryption", e15);
            Log.e("data_encryption", f.b(e15));
            bArr = null;
        }
        if (bArr != null && z14) {
            ((d) this.f45037c).a("SUCCESS", "data_encryption");
        }
        return bArr;
    }
}
