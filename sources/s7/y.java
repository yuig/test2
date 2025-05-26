package s7;

import android.media.MediaDrm;
import android.media.metrics.LogSessionId;
import android.os.Build;
import d7.n0;
import io.jsonwebtoken.JwsHeader;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import n7.g0;
import n7.q0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class y implements v {

    /* renamed from: d, reason: collision with root package name */
    public static final t.a f111341d = new t.a();

    /* renamed from: a, reason: collision with root package name */
    public final UUID f111342a;

    /* renamed from: b, reason: collision with root package name */
    public final MediaDrm f111343b;

    /* renamed from: c, reason: collision with root package name */
    public int f111344c;

    public y(UUID uuid) {
        uuid.getClass();
        UUID uuid2 = a7.i.f1067b;
        bf.b.h("Use C.CLEARKEY_UUID instead", !uuid2.equals(uuid));
        this.f111342a = uuid;
        MediaDrm mediaDrm = new MediaDrm((n0.f53866a >= 27 || !uuid.equals(a7.i.f1068c)) ? uuid : uuid2);
        this.f111343b = mediaDrm;
        this.f111344c = 1;
        if (a7.i.f1069d.equals(uuid) && "ASUS_Z00AD".equals(Build.MODEL)) {
            mediaDrm.setPropertyString("securityLevel", "L3");
        }
    }

    @Override // s7.v
    public final synchronized void a() {
        int i13 = this.f111344c - 1;
        this.f111344c = i13;
        if (i13 == 0) {
            this.f111343b.release();
        }
    }

    @Override // s7.v
    public final Map b(byte[] bArr) {
        return this.f111343b.queryKeyStatus(bArr);
    }

    @Override // s7.v
    public final u c() {
        MediaDrm.ProvisionRequest provisionRequest = this.f111343b.getProvisionRequest();
        return new u(provisionRequest.getDefaultUrl(), provisionRequest.getData());
    }

    @Override // s7.v
    public final byte[] d() {
        return this.f111343b.openSession();
    }

    @Override // s7.v
    public final void e(byte[] bArr, byte[] bArr2) {
        this.f111343b.restoreKeys(bArr, bArr2);
    }

    @Override // s7.v
    public final void f(byte[] bArr) {
        this.f111343b.provideProvisionResponse(bArr);
    }

    @Override // s7.v
    public final int g() {
        return 2;
    }

    @Override // s7.v
    public final void h(final e eVar) {
        this.f111343b.setOnEventListener(new MediaDrm.OnEventListener() { // from class: s7.x
            @Override // android.media.MediaDrm.OnEventListener
            public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i13, int i14, byte[] bArr2) {
                y yVar = y.this;
                e eVar2 = eVar;
                yVar.getClass();
                f fVar = eVar2.f111289a.f111318y;
                fVar.getClass();
                fVar.obtainMessage(i13, bArr).sendToTarget();
            }
        });
    }

    @Override // s7.v
    public final k7.a i(byte[] bArr) {
        int i13 = n0.f53866a;
        UUID uuid = this.f111342a;
        if (i13 < 27 && Objects.equals(uuid, a7.i.f1068c)) {
            uuid = a7.i.f1067b;
        }
        return new w(uuid, bArr);
    }

    @Override // s7.v
    public final void j(byte[] bArr) {
        this.f111343b.closeSession(bArr);
    }

    @Override // s7.v
    public final byte[] k(byte[] bArr, byte[] bArr2) {
        if (a7.i.f1068c.equals(this.f111342a) && n0.f53866a < 27) {
            try {
                JSONObject jSONObject = new JSONObject(n0.q(bArr2));
                StringBuilder sb3 = new StringBuilder("{\"keys\":[");
                JSONArray jSONArray = jSONObject.getJSONArray("keys");
                for (int i13 = 0; i13 < jSONArray.length(); i13++) {
                    if (i13 != 0) {
                        sb3.append(",");
                    }
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i13);
                    sb3.append("{\"k\":\"");
                    sb3.append(jSONObject2.getString("k").replace('-', '+').replace('_', '/'));
                    sb3.append("\",\"kid\":\"");
                    sb3.append(jSONObject2.getString(JwsHeader.KEY_ID).replace('-', '+').replace('_', '/'));
                    sb3.append("\",\"kty\":\"");
                    sb3.append(jSONObject2.getString("kty"));
                    sb3.append("\"}");
                }
                sb3.append("]}");
                bArr2 = sb3.toString().getBytes(StandardCharsets.UTF_8);
            } catch (JSONException e13) {
                d7.u.d("ClearKeyUtil", "Failed to adjust response data: ".concat(n0.q(bArr2)), e13);
            }
        }
        return this.f111343b.provideKeyResponse(bArr, bArr2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x01bf, code lost:
    
        if (r6 != null) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0256, code lost:
    
        if (java.util.Objects.equals(r3, "aidl-1") == false) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01b9, code lost:
    
        if ("AFTT".equals(r6) == false) goto L87;
     */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0270  */
    @Override // s7.v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final s7.t l(byte[] r17, java.util.List r18, int r19, java.util.HashMap r20) {
        /*
            Method dump skipped, instructions count: 633
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s7.y.l(byte[], java.util.List, int, java.util.HashMap):s7.t");
    }

    @Override // s7.v
    public final void m(byte[] bArr, q0 q0Var) {
        LogSessionId logSessionId;
        boolean equals;
        MediaDrm.PlaybackComponent playbackComponent;
        if (n0.f53866a >= 31) {
            try {
                MediaDrm mediaDrm = this.f111343b;
                LogSessionId a13 = q0Var.a();
                logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
                equals = a13.equals(logSessionId);
                if (equals) {
                    return;
                }
                playbackComponent = mediaDrm.getPlaybackComponent(bArr);
                playbackComponent.getClass();
                g0.h(playbackComponent).setLogSessionId(a13);
            } catch (UnsupportedOperationException unused) {
                d7.u.g("FrameworkMediaDrm", "setLogSessionId failed.");
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0036, code lost:
    
        if (r1.startsWith("16.0") == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0041, code lost:
    
        r7 = r3.getSecurityLevel(r7);
        r6 = r3.requiresSecureDecoder(r6, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:?, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003f, code lost:
    
        if (r2.equals(a7.i.f1068c) != false) goto L17;
     */
    @Override // s7.v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean n(java.lang.String r6, byte[] r7) {
        /*
            r5 = this;
            int r0 = d7.n0.f53866a
            r1 = 31
            java.util.UUID r2 = r5.f111342a
            if (r0 < r1) goto L4a
            java.util.UUID r1 = a7.i.f1069d
            boolean r1 = r2.equals(r1)
            android.media.MediaDrm r3 = r5.f111343b
            if (r1 == 0) goto L39
            java.lang.String r1 = "version"
            java.lang.String r1 = r3.getPropertyString(r1)
            java.lang.String r4 = "v5."
            boolean r4 = r1.startsWith(r4)
            if (r4 != 0) goto L4a
            java.lang.String r4 = "14."
            boolean r4 = r1.startsWith(r4)
            if (r4 != 0) goto L4a
            java.lang.String r4 = "15."
            boolean r4 = r1.startsWith(r4)
            if (r4 != 0) goto L4a
            java.lang.String r4 = "16.0"
            boolean r1 = r1.startsWith(r4)
            if (r1 != 0) goto L4a
            goto L41
        L39:
            java.util.UUID r1 = a7.i.f1068c
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L4a
        L41:
            int r7 = o5.d.b(r3, r7)
            boolean r6 = n7.g0.w(r3, r6, r7)
            goto L7c
        L4a:
            r1 = 0
            android.media.MediaCrypto r3 = new android.media.MediaCrypto     // Catch: java.lang.Throwable -> L6d android.media.MediaCryptoException -> L6f
            r4 = 27
            if (r0 >= r4) goto L5c
            java.util.UUID r0 = a7.i.f1068c     // Catch: java.lang.Throwable -> L6d android.media.MediaCryptoException -> L6f
            boolean r0 = java.util.Objects.equals(r2, r0)     // Catch: java.lang.Throwable -> L6d android.media.MediaCryptoException -> L6f
            if (r0 == 0) goto L5c
            java.util.UUID r0 = a7.i.f1067b     // Catch: java.lang.Throwable -> L6d android.media.MediaCryptoException -> L6f
            goto L5d
        L5c:
            r0 = r2
        L5d:
            r3.<init>(r0, r7)     // Catch: java.lang.Throwable -> L6d android.media.MediaCryptoException -> L6f
            boolean r6 = r3.requiresSecureDecoderComponent(r6)     // Catch: java.lang.Throwable -> L68 android.media.MediaCryptoException -> L6b
            r3.release()
            goto L7c
        L68:
            r6 = move-exception
            r1 = r3
            goto L7d
        L6b:
            r1 = r3
            goto L6f
        L6d:
            r6 = move-exception
            goto L7d
        L6f:
            java.util.UUID r6 = a7.i.f1068c     // Catch: java.lang.Throwable -> L6d
            boolean r6 = r2.equals(r6)     // Catch: java.lang.Throwable -> L6d
            r6 = r6 ^ 1
            if (r1 == 0) goto L7c
            r1.release()
        L7c:
            return r6
        L7d:
            if (r1 == 0) goto L82
            r1.release()
        L82:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: s7.y.n(java.lang.String, byte[]):boolean");
    }
}
