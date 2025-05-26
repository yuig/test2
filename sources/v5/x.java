package v5;

import a7.j1;
import a7.o1;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.os.Trace;
import android.text.Spannable;
import androidx.core.text.PrecomputedTextCompat;
import androidx.credentials.exceptions.CreateCredentialCustomException;
import androidx.credentials.exceptions.CreateCredentialException;
import androidx.credentials.exceptions.GetCredentialCustomException;
import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.exceptions.publickeycredential.CreatePublicKeyCredentialDomException;
import androidx.credentials.exceptions.publickeycredential.GetPublicKeyCredentialDomException;
import androidx.credentials.internal.FrameworkClassParsingException;
import androidx.lifecycle.c1;
import androidx.media3.exoplayer.video.VideoSink$VideoSinkException;
import d7.n0;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import n8.j0;

/* loaded from: classes3.dex */
public class x implements androidx.datastore.preferences.protobuf.h, j1, l8.y, v7.q, x7.t, x7.k, l8.u, j0, q8.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f124163a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x() {
        this(15);
        this.f124163a = 15;
    }

    public static final Exception q(e eVar, String str, Exception exc) {
        int i13 = w5.a.f128103a;
        if (exc instanceof CreatePublicKeyCredentialDomException) {
            return new CreatePublicKeyCredentialDomException(eVar, str);
        }
        if (exc instanceof GetPublicKeyCredentialDomException) {
            return new GetPublicKeyCredentialDomException(eVar, str);
        }
        throw new FrameworkClassParsingException();
    }

    public static MediaCodec r(androidx.appcompat.widget.x xVar) {
        ((x7.n) xVar.f16708a).getClass();
        String str = ((x7.n) xVar.f16708a).f134049a;
        Trace.beginSection("createCodec:" + str);
        MediaCodec createByCodecName = MediaCodec.createByCodecName(str);
        Trace.endSection();
        return createByCodecName;
    }

    public static c1 u(Bundle bundle, Bundle bundle2) {
        if (bundle == null) {
            if (bundle2 == null) {
                return new c1();
            }
            HashMap hashMap = new HashMap();
            for (String key : bundle2.keySet()) {
                Intrinsics.checkNotNullExpressionValue(key, "key");
                hashMap.put(key, bundle2.get(key));
            }
            return new c1(hashMap);
        }
        ClassLoader classLoader = c1.class.getClassLoader();
        Intrinsics.f(classLoader);
        bundle.setClassLoader(classLoader);
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("keys");
        ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("values");
        if (parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) {
            throw new IllegalStateException("Invalid bundle passed as restored state".toString());
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int size = parcelableArrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            Object obj = parcelableArrayList.get(i13);
            Intrinsics.g(obj, "null cannot be cast to non-null type kotlin.String");
            linkedHashMap.put((String) obj, parcelableArrayList2.get(i13));
        }
        return new c1(linkedHashMap);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x004b, code lost:
    
        if (java.lang.Character.isHighSurrogate(r5) != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0088, code lost:
    
        if (java.lang.Character.isLowSurrogate(r5) != false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x007b, code lost:
    
        if (r11 != false) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean w(android.view.inputmethod.InputConnection r7, android.text.Editable r8, int r9, int r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: v5.x.w(android.view.inputmethod.InputConnection, android.text.Editable, int, int, boolean):boolean");
    }

    @Override // androidx.datastore.preferences.protobuf.h
    public final byte[] a(byte[] bArr, int i13, int i14) {
        return Arrays.copyOfRange(bArr, i13, i14 + i13);
    }

    @Override // x7.t
    public final MediaCodecInfo b(int i13) {
        return MediaCodecList.getCodecInfoAt(i13);
    }

    @Override // n8.j0
    public final void c() {
    }

    @Override // q8.i
    public final long d(long j13) {
        return j13;
    }

    @Override // n8.j0
    public final void e(o1 o1Var) {
    }

    @Override // x7.t
    public final boolean f(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return "secure-playback".equals(str) && "video/avc".equals(str2);
    }

    @Override // v7.q
    public final l8.y g(v7.n nVar, v7.k kVar) {
        return new v7.p(nVar, kVar);
    }

    @Override // l8.u
    public final void h() {
        synchronized (m8.c.f86526a) {
            Object obj = m8.c.f86527b;
            synchronized (obj) {
                if (m8.c.f86528c) {
                    return;
                }
                long a13 = m8.c.a();
                synchronized (obj) {
                    SystemClock.elapsedRealtime();
                    m8.c.f86529d = a13;
                    m8.c.f86528c = true;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004e  */
    @Override // x7.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final x7.l i(androidx.appcompat.widget.x r6) {
        /*
            r5 = this;
            r0 = 0
            android.media.MediaCodec r0 = r(r6)     // Catch: java.lang.RuntimeException -> L22 java.io.IOException -> L24
            java.lang.String r1 = "configureCodec"
            android.os.Trace.beginSection(r1)     // Catch: java.lang.RuntimeException -> L22 java.io.IOException -> L24
            java.lang.Object r1 = r6.f16711d     // Catch: java.lang.RuntimeException -> L22 java.io.IOException -> L24
            r2 = r1
            android.view.Surface r2 = (android.view.Surface) r2     // Catch: java.lang.RuntimeException -> L22 java.io.IOException -> L24
            if (r2 != 0) goto L26
            java.lang.Object r2 = r6.f16708a     // Catch: java.lang.RuntimeException -> L22 java.io.IOException -> L24
            x7.n r2 = (x7.n) r2     // Catch: java.lang.RuntimeException -> L22 java.io.IOException -> L24
            boolean r2 = r2.f134058j     // Catch: java.lang.RuntimeException -> L22 java.io.IOException -> L24
            if (r2 == 0) goto L26
            int r2 = d7.n0.f53866a     // Catch: java.lang.RuntimeException -> L22 java.io.IOException -> L24
            r3 = 35
            if (r2 < r3) goto L26
            r2 = 8
            goto L27
        L22:
            r6 = move-exception
            goto L4c
        L24:
            r6 = move-exception
            goto L4c
        L26:
            r2 = 0
        L27:
            java.lang.Object r3 = r6.f16709b     // Catch: java.lang.RuntimeException -> L22 java.io.IOException -> L24
            android.media.MediaFormat r3 = (android.media.MediaFormat) r3     // Catch: java.lang.RuntimeException -> L22 java.io.IOException -> L24
            android.view.Surface r1 = (android.view.Surface) r1     // Catch: java.lang.RuntimeException -> L22 java.io.IOException -> L24
            java.lang.Object r4 = r6.f16712e     // Catch: java.lang.RuntimeException -> L22 java.io.IOException -> L24
            android.media.MediaCrypto r4 = (android.media.MediaCrypto) r4     // Catch: java.lang.RuntimeException -> L22 java.io.IOException -> L24
            r0.configure(r3, r1, r4, r2)     // Catch: java.lang.RuntimeException -> L22 java.io.IOException -> L24
            android.os.Trace.endSection()     // Catch: java.lang.RuntimeException -> L22 java.io.IOException -> L24
            java.lang.String r1 = "startCodec"
            android.os.Trace.beginSection(r1)     // Catch: java.lang.RuntimeException -> L22 java.io.IOException -> L24
            r0.start()     // Catch: java.lang.RuntimeException -> L22 java.io.IOException -> L24
            android.os.Trace.endSection()     // Catch: java.lang.RuntimeException -> L22 java.io.IOException -> L24
            x7.w r1 = new x7.w     // Catch: java.lang.RuntimeException -> L22 java.io.IOException -> L24
            java.lang.Object r6 = r6.f16713f     // Catch: java.lang.RuntimeException -> L22 java.io.IOException -> L24
            x7.j r6 = (x7.j) r6     // Catch: java.lang.RuntimeException -> L22 java.io.IOException -> L24
            r1.<init>(r0, r6)     // Catch: java.lang.RuntimeException -> L22 java.io.IOException -> L24
            return r1
        L4c:
            if (r0 == 0) goto L51
            r0.release()
        L51:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: v5.x.i(androidx.appcompat.widget.x):x7.l");
    }

    @Override // x7.t
    public final boolean j(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return false;
    }

    @Override // l8.y
    public final Object k(Uri uri, g7.g gVar) {
        return Long.valueOf(n0.b0(new BufferedReader(new InputStreamReader(gVar)).readLine()));
    }

    @Override // n8.j0
    public final void l(VideoSink$VideoSinkException videoSink$VideoSinkException) {
    }

    @Override // x7.t
    public final int m() {
        return MediaCodecList.getCodecCount();
    }

    @Override // v7.q
    public final l8.y n() {
        return new v7.p();
    }

    @Override // l8.u
    public final void o() {
    }

    @Override // x7.t
    public final boolean p() {
        return false;
    }

    public final CreateCredentialException s(String type, String str) {
        Exception q13;
        switch (this.f124163a) {
            case 8:
                Intrinsics.checkNotNullParameter(type, "type");
                try {
                    int i13 = w5.a.f128103a;
                    CreatePublicKeyCredentialDomException createPublicKeyCredentialDomException = new CreatePublicKeyCredentialDomException(new d0(), null);
                    if (Intrinsics.d(type, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_ABORT_ERROR")) {
                        q13 = q(new a(), str, createPublicKeyCredentialDomException);
                    } else if (Intrinsics.d(type, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_CONSTRAINT_ERROR")) {
                        q13 = q(new b(), str, createPublicKeyCredentialDomException);
                    } else if (Intrinsics.d(type, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_DATA_CLONE_ERROR")) {
                        q13 = q(new c(), str, createPublicKeyCredentialDomException);
                    } else if (Intrinsics.d(type, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_DATA_ERROR")) {
                        q13 = q(new d(), str, createPublicKeyCredentialDomException);
                    } else if (Intrinsics.d(type, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_ENCODING_ERROR")) {
                        q13 = q(new f(), str, createPublicKeyCredentialDomException);
                    } else if (Intrinsics.d(type, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_HIERARCHY_REQUEST_ERROR")) {
                        q13 = q(new g(), str, createPublicKeyCredentialDomException);
                    } else if (Intrinsics.d(type, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_IN_USE_ATTRIBUTE_ERROR")) {
                        q13 = q(new h(), str, createPublicKeyCredentialDomException);
                    } else if (Intrinsics.d(type, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_CHARACTER_ERROR")) {
                        q13 = q(new i(), str, createPublicKeyCredentialDomException);
                    } else if (Intrinsics.d(type, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_MODIFICATION_ERROR")) {
                        q13 = q(new j(), str, createPublicKeyCredentialDomException);
                    } else if (Intrinsics.d(type, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_NODE_TYPE_ERROR")) {
                        q13 = q(new k(), str, createPublicKeyCredentialDomException);
                    } else if (Intrinsics.d(type, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_STATE_ERROR")) {
                        q13 = q(new l(), str, createPublicKeyCredentialDomException);
                    } else if (Intrinsics.d(type, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NAMESPACE_ERROR")) {
                        q13 = q(new m(), str, createPublicKeyCredentialDomException);
                    } else if (Intrinsics.d(type, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NETWORK_ERROR")) {
                        q13 = q(new n(), str, createPublicKeyCredentialDomException);
                    } else if (Intrinsics.d(type, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NO_MODIFICATION_ALLOWED_ERROR")) {
                        q13 = q(new o(), str, createPublicKeyCredentialDomException);
                    } else if (Intrinsics.d(type, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_ALLOWED_ERROR")) {
                        q13 = q(new p(), str, createPublicKeyCredentialDomException);
                    } else if (Intrinsics.d(type, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_FOUND_ERROR")) {
                        q13 = q(new q(), str, createPublicKeyCredentialDomException);
                    } else if (Intrinsics.d(type, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_READABLE_ERROR")) {
                        q13 = q(new r(), str, createPublicKeyCredentialDomException);
                    } else if (Intrinsics.d(type, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_SUPPORTED_ERROR")) {
                        q13 = q(new s(), str, createPublicKeyCredentialDomException);
                    } else if (Intrinsics.d(type, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_OPERATION_ERROR")) {
                        q13 = q(new t(), str, createPublicKeyCredentialDomException);
                    } else if (Intrinsics.d(type, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_OPT_OUT_ERROR")) {
                        q13 = q(new u(), str, createPublicKeyCredentialDomException);
                    } else if (Intrinsics.d(type, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_QUOTA_EXCEEDED_ERROR")) {
                        q13 = q(new v(), str, createPublicKeyCredentialDomException);
                    } else if (Intrinsics.d(type, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_READ_ONLY_ERROR")) {
                        q13 = q(new y(), str, createPublicKeyCredentialDomException);
                    } else if (Intrinsics.d(type, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_SECURITY_ERROR")) {
                        q13 = q(new z(), str, createPublicKeyCredentialDomException);
                    } else if (Intrinsics.d(type, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_SYNTAX_ERROR")) {
                        q13 = q(new a0(), str, createPublicKeyCredentialDomException);
                    } else if (Intrinsics.d(type, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_TIMEOUT_ERROR")) {
                        q13 = q(new b0(), str, createPublicKeyCredentialDomException);
                    } else if (Intrinsics.d(type, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_TRANSACTION_INACTIVE_ERROR")) {
                        q13 = q(new c0(), str, createPublicKeyCredentialDomException);
                    } else if (Intrinsics.d(type, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_UNKNOWN_ERROR")) {
                        q13 = q(new d0(), str, createPublicKeyCredentialDomException);
                    } else if (Intrinsics.d(type, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_VERSION_ERROR")) {
                        q13 = q(new e0(), str, createPublicKeyCredentialDomException);
                    } else {
                        if (!Intrinsics.d(type, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_WRONG_DOCUMENT_ERROR")) {
                            throw new FrameworkClassParsingException();
                        }
                        q13 = q(new f0(), str, createPublicKeyCredentialDomException);
                    }
                    return (CreateCredentialException) q13;
                } catch (FrameworkClassParsingException unused) {
                    return new CreateCredentialCustomException(str, type);
                }
            default:
                Intrinsics.checkNotNullParameter(type, "type");
                try {
                    if (StringsKt.E(type, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", false)) {
                        return CreatePublicKeyCredentialDomException.f18015b.s(type, str);
                    }
                    throw new FrameworkClassParsingException();
                } catch (FrameworkClassParsingException unused2) {
                    return new CreateCredentialCustomException(str, type);
                }
        }
    }

    public final GetCredentialException t(String type, String str) {
        Exception q13;
        switch (this.f124163a) {
            case 11:
                Intrinsics.checkNotNullParameter(type, "type");
                try {
                    int i13 = w5.a.f128103a;
                    GetPublicKeyCredentialDomException getPublicKeyCredentialDomException = new GetPublicKeyCredentialDomException(new d0(), null);
                    if (Intrinsics.d(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_ABORT_ERROR")) {
                        q13 = q(new a(), str, getPublicKeyCredentialDomException);
                    } else if (Intrinsics.d(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_CONSTRAINT_ERROR")) {
                        q13 = q(new b(), str, getPublicKeyCredentialDomException);
                    } else if (Intrinsics.d(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_DATA_CLONE_ERROR")) {
                        q13 = q(new c(), str, getPublicKeyCredentialDomException);
                    } else if (Intrinsics.d(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_DATA_ERROR")) {
                        q13 = q(new d(), str, getPublicKeyCredentialDomException);
                    } else if (Intrinsics.d(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_ENCODING_ERROR")) {
                        q13 = q(new f(), str, getPublicKeyCredentialDomException);
                    } else if (Intrinsics.d(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_HIERARCHY_REQUEST_ERROR")) {
                        q13 = q(new g(), str, getPublicKeyCredentialDomException);
                    } else if (Intrinsics.d(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_IN_USE_ATTRIBUTE_ERROR")) {
                        q13 = q(new h(), str, getPublicKeyCredentialDomException);
                    } else if (Intrinsics.d(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_CHARACTER_ERROR")) {
                        q13 = q(new i(), str, getPublicKeyCredentialDomException);
                    } else if (Intrinsics.d(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_MODIFICATION_ERROR")) {
                        q13 = q(new j(), str, getPublicKeyCredentialDomException);
                    } else if (Intrinsics.d(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_NODE_TYPE_ERROR")) {
                        q13 = q(new k(), str, getPublicKeyCredentialDomException);
                    } else if (Intrinsics.d(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_STATE_ERROR")) {
                        q13 = q(new l(), str, getPublicKeyCredentialDomException);
                    } else if (Intrinsics.d(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NAMESPACE_ERROR")) {
                        q13 = q(new m(), str, getPublicKeyCredentialDomException);
                    } else if (Intrinsics.d(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NETWORK_ERROR")) {
                        q13 = q(new n(), str, getPublicKeyCredentialDomException);
                    } else if (Intrinsics.d(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NO_MODIFICATION_ALLOWED_ERROR")) {
                        q13 = q(new o(), str, getPublicKeyCredentialDomException);
                    } else if (Intrinsics.d(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_ALLOWED_ERROR")) {
                        q13 = q(new p(), str, getPublicKeyCredentialDomException);
                    } else if (Intrinsics.d(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_FOUND_ERROR")) {
                        q13 = q(new q(), str, getPublicKeyCredentialDomException);
                    } else if (Intrinsics.d(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_READABLE_ERROR")) {
                        q13 = q(new r(), str, getPublicKeyCredentialDomException);
                    } else if (Intrinsics.d(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_SUPPORTED_ERROR")) {
                        q13 = q(new s(), str, getPublicKeyCredentialDomException);
                    } else if (Intrinsics.d(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_OPERATION_ERROR")) {
                        q13 = q(new t(), str, getPublicKeyCredentialDomException);
                    } else if (Intrinsics.d(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_OPT_OUT_ERROR")) {
                        q13 = q(new u(), str, getPublicKeyCredentialDomException);
                    } else if (Intrinsics.d(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_QUOTA_EXCEEDED_ERROR")) {
                        q13 = q(new v(), str, getPublicKeyCredentialDomException);
                    } else if (Intrinsics.d(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_READ_ONLY_ERROR")) {
                        q13 = q(new y(), str, getPublicKeyCredentialDomException);
                    } else if (Intrinsics.d(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_SECURITY_ERROR")) {
                        q13 = q(new z(), str, getPublicKeyCredentialDomException);
                    } else if (Intrinsics.d(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_SYNTAX_ERROR")) {
                        q13 = q(new a0(), str, getPublicKeyCredentialDomException);
                    } else if (Intrinsics.d(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_TIMEOUT_ERROR")) {
                        q13 = q(new b0(), str, getPublicKeyCredentialDomException);
                    } else if (Intrinsics.d(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_TRANSACTION_INACTIVE_ERROR")) {
                        q13 = q(new c0(), str, getPublicKeyCredentialDomException);
                    } else if (Intrinsics.d(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_UNKNOWN_ERROR")) {
                        q13 = q(new d0(), str, getPublicKeyCredentialDomException);
                    } else if (Intrinsics.d(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_VERSION_ERROR")) {
                        q13 = q(new e0(), str, getPublicKeyCredentialDomException);
                    } else {
                        if (!Intrinsics.d(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_WRONG_DOCUMENT_ERROR")) {
                            throw new FrameworkClassParsingException();
                        }
                        q13 = q(new f0(), str, getPublicKeyCredentialDomException);
                    }
                    return (GetCredentialException) q13;
                } catch (FrameworkClassParsingException unused) {
                    return new GetCredentialCustomException(str, type);
                }
            default:
                Intrinsics.checkNotNullParameter(type, "type");
                try {
                    if (kotlin.text.z.p(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", false)) {
                        return GetPublicKeyCredentialDomException.f18017b.t(type, str);
                    }
                    throw new FrameworkClassParsingException();
                } catch (FrameworkClassParsingException unused2) {
                    return new GetCredentialCustomException(str, type);
                }
        }
    }

    @Override // n8.j0
    public final void v() {
    }

    public boolean x(Spannable spannable) {
        return spannable instanceof PrecomputedTextCompat;
    }

    public /* synthetic */ x(int i13) {
        this.f124163a = i13;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(int i13, int i14) {
        this(0);
        this.f124163a = i13;
        int i15 = 18;
        if (i13 == 18) {
            this(i15);
            return;
        }
        int i16 = 19;
        if (i13 != 19) {
            switch (i13) {
                case 1:
                    this(1);
                    break;
                case 2:
                    this(2);
                    break;
                case 3:
                    this(3);
                    break;
                case 4:
                    this(4);
                    break;
                case 5:
                    this(5);
                    break;
                case 6:
                    this(6);
                    break;
                case 7:
                    this(7);
                    break;
                case 8:
                    this(8);
                    break;
                case 9:
                    this(9);
                    break;
                case 10:
                    this(10);
                    break;
                case 11:
                    this(11);
                    break;
                case 12:
                    this(12);
                    break;
                case 13:
                    this(13);
                    break;
                case 14:
                    this(14);
                    break;
                default:
                    break;
            }
            return;
        }
        this(i16);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(Object obj) {
        this(21);
        this.f124163a = 21;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(pk2.f fVar) {
        this(23);
        this.f124163a = 23;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(w wVar) {
        this(27);
        this.f124163a = 27;
    }
}
