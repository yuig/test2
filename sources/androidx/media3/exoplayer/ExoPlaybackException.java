package androidx.media3.exoplayer;

import android.os.Bundle;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.b;
import d7.n0;
import g8.e0;

/* loaded from: classes.dex */
public final class ExoPlaybackException extends PlaybackException {

    /* renamed from: c, reason: collision with root package name */
    public final int f18786c;

    /* renamed from: d, reason: collision with root package name */
    public final String f18787d;

    /* renamed from: e, reason: collision with root package name */
    public final int f18788e;

    /* renamed from: f, reason: collision with root package name */
    public final b f18789f;

    /* renamed from: g, reason: collision with root package name */
    public final int f18790g;

    /* renamed from: h, reason: collision with root package name */
    public final e0 f18791h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f18792i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExoPlaybackException(String str, Throwable th3, int i13, int i14, String str2, int i15, b bVar, int i16, e0 e0Var, long j13, boolean z13) {
        super(str, th3, i13, j13);
        Bundle bundle = Bundle.EMPTY;
        bf.b.i(!z13 || i14 == 1);
        bf.b.i(th3 != null || i14 == 3);
        this.f18786c = i14;
        this.f18787d = str2;
        this.f18788e = i15;
        this.f18789f = bVar;
        this.f18790g = i16;
        this.f18791h = e0Var;
        this.f18792i = z13;
    }

    public static ExoPlaybackException b(RuntimeException runtimeException, int i13) {
        return new ExoPlaybackException(2, i13, runtimeException);
    }

    public final ExoPlaybackException a(e0 e0Var) {
        String message = getMessage();
        int i13 = n0.f53866a;
        return new ExoPlaybackException(message, getCause(), this.f18745a, this.f18786c, this.f18787d, this.f18788e, this.f18789f, this.f18790g, e0Var, this.f18746b, this.f18792i);
    }

    public ExoPlaybackException(int i13, int i14, Throwable th3) {
        this(i13, th3, i14, null, -1, null, 4, false);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ExoPlaybackException(int r14, java.lang.Throwable r15, int r16, java.lang.String r17, int r18, androidx.media3.common.b r19, int r20, boolean r21) {
        /*
            r13 = this;
            r4 = r14
            if (r4 == 0) goto L44
            r0 = 1
            if (r4 == r0) goto L15
            r0 = 3
            if (r4 == r0) goto L12
            java.lang.String r0 = "Unexpected runtime error"
        Lb:
            r5 = r17
            r6 = r18
            r7 = r19
            goto L4c
        L12:
            java.lang.String r0 = "Remote error"
            goto Lb
        L15:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r5 = r17
            r0.append(r5)
            java.lang.String r1 = " error, index="
            r0.append(r1)
            r6 = r18
            r0.append(r6)
            java.lang.String r1 = ", format="
            r0.append(r1)
            r7 = r19
            r0.append(r7)
            java.lang.String r1 = ", format_supported="
            r0.append(r1)
            java.lang.String r1 = d7.n0.B(r20)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            goto L4c
        L44:
            r5 = r17
            r6 = r18
            r7 = r19
            java.lang.String r0 = "Source error"
        L4c:
            r1 = 0
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L59
            java.lang.String r1 = ": null"
            java.lang.String r0 = a.a.C(r0, r1)
        L59:
            r1 = r0
            r9 = 0
            long r10 = android.os.SystemClock.elapsedRealtime()
            r0 = r13
            r2 = r15
            r3 = r16
            r4 = r14
            r5 = r17
            r6 = r18
            r7 = r19
            r8 = r20
            r12 = r21
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.ExoPlaybackException.<init>(int, java.lang.Throwable, int, java.lang.String, int, androidx.media3.common.b, int, boolean):void");
    }
}
