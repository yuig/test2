package rg;

import am2.d0;
import android.accounts.Account;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.util.Log;
import com.google.firebase.messaging.q;
import e0.t;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import m60.f0;
import on2.u;
import pn2.f1;
import xk2.k;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public Object f107929a;

    /* renamed from: b, reason: collision with root package name */
    public Object f107930b;

    /* renamed from: c, reason: collision with root package name */
    public Object f107931c;

    /* renamed from: d, reason: collision with root package name */
    public Object f107932d;

    /* renamed from: e, reason: collision with root package name */
    public Object f107933e;

    public a(int i13) {
        if (i13 != 1) {
            return;
        }
        this.f107933e = ri.a.f108359a;
    }

    public final jh.g a() {
        return new jh.g((Account) this.f107929a, (g1.h) this.f107930b, (String) this.f107931c, (String) this.f107932d, (ri.a) this.f107933e);
    }

    public final d0 b() {
        return ((lm2.a) this.f107929a).f83945o;
    }

    public final u c() {
        return ((lm2.a) this.f107929a).f83931a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00db, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException("Couldn't find manifest entry at top-level.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0071, code lost:
    
        if (((org.xmlpull.v1.XmlPullParser) r5.f116960b).getName().equals("manifest") == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0073, code lost:
    
        r7 = ((org.xmlpull.v1.XmlPullParser) r5.f116960b).getAttributeValue("http://schemas.android.com/apk/res/android", "versionCode");
        r5 = ((org.xmlpull.v1.XmlPullParser) r5.f116960b).getAttributeValue("http://schemas.android.com/apk/res/android", "versionCodeMajor");
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0089, code lost:
    
        if (r7 == null) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008b, code lost:
    
        r7 = java.lang.Integer.parseInt(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008f, code lost:
    
        if (r5 != null) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0091, code lost:
    
        r7 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0097, code lost:
    
        r7 = (java.lang.Integer.parseInt(r5) << 32) | (r7 & 4294967295L);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00aa, code lost:
    
        r15 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ba, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException(a.a.j("Couldn't parse versionCodeMajor to int: ", r15.getMessage()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00bb, code lost:
    
        r15 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00cb, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException(a.a.j("Couldn't parse versionCode to int: ", r15.getMessage()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d3, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException("Manifest entry doesn't contain 'versionCode' attribute.");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean d(java.io.File[] r15) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: rg.a.d(java.io.File[]):boolean");
    }

    public final boolean e(File[] fileArr) {
        String absolutePath;
        X509Certificate x509Certificate;
        PackageInfo f13 = f();
        ArrayList<X509Certificate> arrayList = null;
        if (f13 != null && f13.signatures != null) {
            ArrayList arrayList2 = new ArrayList();
            for (Signature signature : f13.signatures) {
                try {
                    x509Certificate = (X509Certificate) CertificateFactory.getInstance("X509").generateCertificate(new ByteArrayInputStream(signature.toByteArray()));
                } catch (CertificateException e13) {
                    Log.e("SplitCompat", "Cannot decode certificate.", e13);
                    x509Certificate = null;
                }
                if (x509Certificate != null) {
                    arrayList2.add(x509Certificate);
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            Log.e("SplitCompat", "No app certificates found.");
            return false;
        }
        int length = fileArr.length;
        loop1: while (true) {
            length--;
            if (length < 0) {
                return true;
            }
            try {
                absolutePath = fileArr[length].getAbsolutePath();
                try {
                    X509Certificate[][] T0 = t.T0(absolutePath);
                    if (T0 == null || T0.length == 0 || T0[0].length == 0) {
                        break;
                    }
                    if (arrayList.isEmpty()) {
                        Log.e("SplitCompat", "No certificates found for app.");
                        break;
                    }
                    for (X509Certificate x509Certificate2 : arrayList) {
                        for (X509Certificate[] x509CertificateArr : T0) {
                            int i13 = x509CertificateArr[0].equals(x509Certificate2) ? 0 : i13 + 1;
                        }
                        Log.i("SplitCompat", "There's an app certificate that doesn't sign the split.");
                    }
                } catch (Exception e14) {
                    Log.e("SplitCompat", "Downloaded split " + absolutePath + " is not signed.", e14);
                }
            } catch (Exception e15) {
                Log.e("SplitCompat", "Split verification error.", e15);
                return false;
            }
        }
        Log.e("SplitCompat", "Downloaded split " + absolutePath + " is not signed.");
        Log.e("SplitCompat", "Split verification failure.");
        return false;
    }

    public final PackageInfo f() {
        if (((PackageInfo) this.f107933e) == null) {
            try {
                this.f107933e = ((Context) this.f107931c).getPackageManager().getPackageInfo(((Context) this.f107931c).getPackageName(), 64);
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }
        return (PackageInfo) this.f107933e;
    }

    public a(lm2.a components, lm2.h typeParameterResolver, k delegateForDefaultTypeQualifiers) {
        Intrinsics.checkNotNullParameter(components, "components");
        Intrinsics.checkNotNullParameter(typeParameterResolver, "typeParameterResolver");
        Intrinsics.checkNotNullParameter(delegateForDefaultTypeQualifiers, "delegateForDefaultTypeQualifiers");
        this.f107929a = components;
        this.f107930b = typeParameterResolver;
        this.f107931c = delegateForDefaultTypeQualifiers;
        this.f107932d = delegateForDefaultTypeQualifiers;
        Intrinsics.checkNotNullParameter(this, "c");
        Intrinsics.checkNotNullParameter(typeParameterResolver, "typeParameterResolver");
        q qVar = new q();
        qVar.f33803a = this;
        qVar.f33804b = typeParameterResolver;
        f0 f0Var = new f0();
        qVar.f33805c = f0Var;
        qVar.f33806d = new f1(f0Var);
        this.f107933e = qVar;
    }
}
