package com.pinterest.security;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import com.google.android.recaptcha.RecaptchaAction;
import com.pinterest.api.model.wy0;
import com.pinterest.security.AppIntegrityException;
import hk1.t;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import kotlin.jvm.internal.Intrinsics;
import or1.j;
import r42.k;
import r42.o;

/* loaded from: classes2.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final b60.b f51757a;

    /* renamed from: b, reason: collision with root package name */
    public final b20.c f51758b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f51759c;

    /* renamed from: d, reason: collision with root package name */
    public final or1.i f51760d;

    /* renamed from: e, reason: collision with root package name */
    public final ox.b f51761e;

    public i(b60.b activeUserManager, b20.c sessionApi, Context applicationContext, or1.i authLoggingUtils, ox.b analyticsApi) {
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        Intrinsics.checkNotNullParameter(sessionApi, "sessionApi");
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(authLoggingUtils, "authLoggingUtils");
        Intrinsics.checkNotNullParameter(analyticsApi, "analyticsApi");
        this.f51757a = activeUserManager;
        this.f51758b = sessionApi;
        this.f51759c = applicationContext;
        this.f51760d = authLoggingUtils;
        this.f51761e = analyticsApi;
    }

    public final void a() {
        SigningInfo signingInfo;
        String sb3;
        Context context = this.f51759c;
        PackageManager packageManager = context.getPackageManager();
        PackageInfo packageInfo = packageManager != null ? packageManager.getPackageInfo(context.getPackageName(), 134217728) : null;
        if (packageInfo == null) {
            throw new AppIntegrityException.PackageInfoRetrievalError(null);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            throw new AppIntegrityException.IncompatibleApiVersion(null);
        }
        signingInfo = packageInfo.signingInfo;
        Signature[] signatures = signingInfo != null ? signingInfo.getApkContentsSigners() : null;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
            if (signatures == null || signatures.length == 0) {
                throw new AppIntegrityException.MalformedSignature(null);
            }
            Intrinsics.checkNotNullParameter(signatures, "signatures");
            if (messageDigest == null) {
                sb3 = "";
            } else {
                byte[] digest = messageDigest.digest(signatures[0].toByteArray());
                Intrinsics.checkNotNullExpressionValue(digest, "digest(...)");
                StringBuilder sb4 = new StringBuilder();
                int length = digest.length;
                for (int i13 = 0; i13 < length; i13++) {
                    if (i13 != 0) {
                        sb4.append(":");
                    }
                    String hexString = Integer.toHexString(digest[i13] & 255);
                    if (hexString.length() == 1) {
                        sb4.append("0");
                    }
                    sb4.append(hexString);
                }
                sb3 = sb4.toString();
                Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
            }
            if (sb3.length() == 0) {
                throw new AppIntegrityException.FingerprintRetrievalError(null);
            }
            uj2.b a13 = ((b20.d) this.f51758b.f21278a).a(null, sb3, null);
            bk.f fVar = ck2.i.f27926f;
            a13.getClass();
            new fk2.c(1, a13, fVar).l(tk2.e.f118017c).i(new vy.c(9), new j(24, o.f106204j));
        } catch (NoSuchAlgorithmException unused) {
            throw new AppIntegrityException.MessageDigestAlgorithmError(null);
        }
    }

    public final void b() {
        RecaptchaAction recaptchaAction = h.f51752a;
        RecaptchaAction recaptchaAction2 = h.f51754c;
        wy0 f13 = ((b60.d) this.f51757a).f();
        String id3 = f13 != null ? f13.getId() : null;
        if (id3 == null) {
            id3 = "";
        }
        new fk2.c(1, new fk2.c(4, h.c(this.f51759c, recaptchaAction2, this.f51761e, id3, new zn1.d(this, 4)), new k(3, new t(this, 29))), ck2.i.f27926f).i(new vy.c(10), new j(25, o.f106205k));
    }
}
