package org.chromium.net;

import android.content.IntentFilter;
import android.net.http.X509TrustManagerExtensions;
import android.util.Log;
import android.util.Pair;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import javax.security.auth.x500.X500Principal;

/* loaded from: classes2.dex */
public class X509Util {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String OID_ANY_EKU = "2.5.29.37.0";
    private static final String OID_SERVER_GATED_MICROSOFT = "1.3.6.1.4.1.311.10.3.3";
    private static final String OID_SERVER_GATED_NETSCAPE = "2.16.840.1.113730.4.1";
    private static final String OID_TLS_SERVER_AUTH = "1.3.6.1.5.5.7.3.1";
    private static final String TAG = "X509Util";
    private static CertificateFactory sCertificateFactory;
    private static X509TrustManagerExtensions sDefaultTrustManager;
    private static boolean sLoadedSystemKeyStore;
    private static File sSystemCertificateDirectory;
    private static KeyStore sSystemKeyStore;
    private static Set<Pair<X500Principal, PublicKey>> sSystemTrustAnchorCache;
    private static KeyStore sTestKeyStore;
    private static X509Certificate sTestRoot;
    private static X509TrustManagerExtensions sTestTrustManager;
    private static x sTrustStorageListener;
    private static final Object sLock = new Object();
    private static final char[] HEX_DIGITS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static void addTestRootCertificate(byte[] bArr) {
        X509Certificate createCertificateFromBytes = createCertificateFromBytes(bArr);
        synchronized (sLock) {
            ensureTestInitializedLocked();
            KeyStore keyStore = sTestKeyStore;
            keyStore.setCertificateEntry("root_cert_" + Integer.toString(keyStore.size()), createCertificateFromBytes);
            reloadTestTrustManager();
        }
    }

    private static List<X509Certificate> checkServerTrustedIgnoringRuntimeException(X509TrustManagerExtensions x509TrustManagerExtensions, X509Certificate[] x509CertificateArr, String str, String str2) {
        try {
            return x509TrustManagerExtensions.checkServerTrusted(x509CertificateArr, str, str2);
        } catch (RuntimeException e13) {
            Log.e("cr_".concat(TAG), "checkServerTrusted() unexpectedly threw: %s", e13);
            throw new CertificateException(e13);
        }
    }

    public static void clearTestRootCertificates() {
        synchronized (sLock) {
            ensureTestInitializedLocked();
            try {
                sTestKeyStore.load(null);
                reloadTestTrustManager();
            } catch (IOException unused) {
            }
        }
    }

    public static X509Certificate createCertificateFromBytes(byte[] bArr) {
        ensureInitialized();
        return (X509Certificate) sCertificateFactory.generateCertificate(new ByteArrayInputStream(bArr));
    }

    private static X509TrustManagerExtensions createTrustManager(KeyStore keyStore) {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init(keyStore);
        try {
            for (TrustManager trustManager : trustManagerFactory.getTrustManagers()) {
                if (trustManager instanceof X509TrustManager) {
                    try {
                        return new X509TrustManagerExtensions((X509TrustManager) trustManager);
                    } catch (IllegalArgumentException e13) {
                        Log.e("cr_X509Util", "Error creating trust manager (" + trustManager.getClass().getName() + "): " + e13);
                    }
                }
            }
            Log.e("cr_X509Util", "Could not find suitable trust manager");
            return null;
        } catch (RuntimeException e14) {
            Log.e("cr_".concat(TAG), "TrustManagerFactory.getTrustManagers() unexpectedly threw: %s", e14);
            throw new KeyStoreException(e14);
        }
    }

    private static void ensureInitialized() {
        synchronized (sLock) {
            ensureInitializedLocked();
        }
    }

    private static void ensureInitializedLocked() {
        if (sCertificateFactory == null) {
            sCertificateFactory = CertificateFactory.getInstance("X.509");
        }
        if (sDefaultTrustManager == null) {
            sDefaultTrustManager = createTrustManager(null);
        }
        if (!sLoadedSystemKeyStore) {
            try {
                KeyStore keyStore = KeyStore.getInstance("AndroidCAStore");
                sSystemKeyStore = keyStore;
                try {
                    keyStore.load(null);
                } catch (IOException unused) {
                }
                sSystemCertificateDirectory = new File(System.getenv("ANDROID_ROOT") + "/etc/security/cacerts");
            } catch (KeyStoreException unused2) {
            }
            sLoadedSystemKeyStore = true;
        }
        if (sSystemTrustAnchorCache == null) {
            sSystemTrustAnchorCache = new HashSet();
        }
        if (sTrustStorageListener == null) {
            sTrustStorageListener = new x();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.security.action.KEYCHAIN_CHANGED");
            intentFilter.addAction("android.security.action.KEY_ACCESS_CHANGED");
            intentFilter.addAction("android.security.action.TRUST_STORE_CHANGED");
            so.a.h(so.a.f113317a, sTrustStorageListener, intentFilter);
        }
    }

    private static void ensureTestInitializedLocked() {
        if (sTestKeyStore == null) {
            KeyStore keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
            sTestKeyStore = keyStore;
            try {
                keyStore.load(null);
            } catch (IOException unused) {
            }
        }
        if (sTestTrustManager == null) {
            sTestTrustManager = createTrustManager(sTestKeyStore);
        }
    }

    public static byte[][] getUserAddedRoots() {
        ArrayList arrayList = new ArrayList();
        synchronized (sLock) {
            try {
                ensureInitialized();
                KeyStore keyStore = sSystemKeyStore;
                if (keyStore == null) {
                    return new byte[0][];
                }
                try {
                    Enumeration<String> aliases = keyStore.aliases();
                    while (aliases.hasMoreElements()) {
                        String nextElement = aliases.nextElement();
                        if (nextElement.startsWith("user:")) {
                            try {
                                Certificate certificate = sSystemKeyStore.getCertificate(nextElement);
                                if (certificate instanceof X509Certificate) {
                                    arrayList.add(((X509Certificate) certificate).getEncoded());
                                } else {
                                    Log.w("cr_" + TAG, "alias: " + nextElement + " is not a X509 Cert, skipping");
                                }
                            } catch (KeyStoreException e13) {
                                dp2.e.b(TAG, "Error reading cert with alias %s, error: %s", nextElement, e13);
                            } catch (CertificateEncodingException e14) {
                                dp2.e.b(TAG, "Error encoding cert with alias %s, error: %s", nextElement, e14);
                            }
                        }
                    }
                    X509Certificate x509Certificate = sTestRoot;
                    if (x509Certificate != null) {
                        try {
                            arrayList.add(x509Certificate.getEncoded());
                        } catch (CertificateEncodingException e15) {
                            Log.e("cr_" + TAG, "Error encoding test root cert, error %s", e15);
                        }
                    }
                    return (byte[][]) arrayList.toArray(new byte[0][]);
                } catch (KeyStoreException e16) {
                    Log.e("cr_" + TAG, "Error reading cert aliases: %s", e16);
                    return new byte[0][];
                }
            } catch (KeyStoreException | NoSuchAlgorithmException | CertificateException unused) {
                return new byte[0][];
            }
        }
    }

    private static String hashPrincipal(X500Principal x500Principal) {
        byte[] digest = MessageDigest.getInstance("MD5").digest(x500Principal.getEncoded());
        char[] cArr = new char[8];
        for (int i13 = 0; i13 < 4; i13++) {
            int i14 = i13 * 2;
            char[] cArr2 = HEX_DIGITS;
            byte b13 = digest[3 - i13];
            cArr[i14] = cArr2[(b13 >> 4) & 15];
            cArr[i14 + 1] = cArr2[b13 & 15];
        }
        return new String(cArr);
    }

    private static boolean isKnownRoot(X509Certificate x509Certificate) {
        if (sSystemKeyStore == null) {
            return false;
        }
        Pair<X500Principal, PublicKey> pair = new Pair<>(x509Certificate.getSubjectX500Principal(), x509Certificate.getPublicKey());
        if (sSystemTrustAnchorCache.contains(pair)) {
            return true;
        }
        String hashPrincipal = hashPrincipal(x509Certificate.getSubjectX500Principal());
        int i13 = 0;
        while (true) {
            String str = hashPrincipal + "." + i13;
            if (!new File(sSystemCertificateDirectory, str).exists()) {
                return false;
            }
            Certificate certificate = sSystemKeyStore.getCertificate("system:" + str);
            if (certificate != null) {
                if (certificate instanceof X509Certificate) {
                    X509Certificate x509Certificate2 = (X509Certificate) certificate;
                    if (x509Certificate.getSubjectX500Principal().equals(x509Certificate2.getSubjectX500Principal()) && x509Certificate.getPublicKey().equals(x509Certificate2.getPublicKey())) {
                        sSystemTrustAnchorCache.add(pair);
                        return true;
                    }
                } else {
                    Log.e("cr_X509Util", "Anchor " + str + " not an X509Certificate: " + certificate.getClass().getName());
                }
            }
            i13++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void reloadDefaultTrustManager() {
        synchronized (sLock) {
            sDefaultTrustManager = null;
            sSystemTrustAnchorCache = null;
            ensureInitializedLocked();
        }
        y.P().W();
    }

    private static void reloadTestTrustManager() {
        ensureTestInitializedLocked();
        sTestTrustManager = createTrustManager(sTestKeyStore);
    }

    public static void setTestRootCertificateForBuiltin(byte[] bArr) {
        X509Certificate createCertificateFromBytes = createCertificateFromBytes(bArr);
        synchronized (sLock) {
            sTestRoot = createCertificateFromBytes;
        }
    }

    public static boolean verifyKeyUsage(X509Certificate x509Certificate) {
        List<String> extendedKeyUsage;
        try {
            extendedKeyUsage = x509Certificate.getExtendedKeyUsage();
        } catch (NullPointerException unused) {
        }
        if (extendedKeyUsage == null) {
            return true;
        }
        for (String str : extendedKeyUsage) {
            if (str.equals(OID_TLS_SERVER_AUTH) || str.equals(OID_ANY_EKU) || str.equals(OID_SERVER_GATED_NETSCAPE) || str.equals(OID_SERVER_GATED_MICROSOFT)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00b0 A[Catch: all -> 0x0074, TryCatch #1 {, blocks: (B:34:0x0069, B:36:0x006d, B:37:0x0072, B:40:0x0076, B:41:0x00aa, B:43:0x00b0, B:44:0x00c1, B:45:0x00c6, B:50:0x007c, B:58:0x0080, B:54:0x0088, B:55:0x00a8), top: B:33:0x0069, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0088 A[Catch: all -> 0x0074, TRY_ENTER, TryCatch #1 {, blocks: (B:34:0x0069, B:36:0x006d, B:37:0x0072, B:40:0x0076, B:41:0x00aa, B:43:0x00b0, B:44:0x00c1, B:45:0x00c6, B:50:0x007c, B:58:0x0080, B:54:0x0088, B:55:0x00a8), top: B:33:0x0069, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static org.chromium.net.AndroidCertVerifyResult verifyServerCertificates(byte[][] r7, java.lang.String r8, java.lang.String r9) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.net.X509Util.verifyServerCertificates(byte[][], java.lang.String, java.lang.String):org.chromium.net.AndroidCertVerifyResult");
    }
}
