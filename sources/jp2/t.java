package jp2;

import android.util.Base64;
import java.io.File;
import java.net.IDN;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import org.chromium.net.ExperimentalCronetEngine;
import org.chromium.net.ICronetEngineBuilder;
import org.chromium.net.impl.CronetUrlRequestContext;

/* loaded from: classes2.dex */
public abstract class t extends j {
    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder addPublicKeyPins(String str, Set set, boolean z13, Date date) {
        if (str == null) {
            throw new NullPointerException("The hostname cannot be null");
        }
        if (set == null) {
            throw new NullPointerException("The set of SHA256 pins cannot be null");
        }
        if (date == null) {
            throw new NullPointerException("The pin expiration date cannot be null");
        }
        if (j.f77336o.matcher(str).matches()) {
            throw new IllegalArgumentException(a.a.k("Hostname ", str, " is illegal. A hostname should not consist of digits and/or dots only."));
        }
        if (str.length() > 255) {
            throw new IllegalArgumentException(a.a.k("Hostname ", str, " is too long. The name of the host does not comply with RFC 1122 and RFC 1123."));
        }
        try {
            String ascii = IDN.toASCII(str, 2);
            HashMap hashMap = new HashMap();
            Iterator it = set.iterator();
            while (it.hasNext()) {
                byte[] bArr = (byte[]) it.next();
                if (bArr == null || bArr.length != 32) {
                    throw new IllegalArgumentException("Public key pin is invalid");
                }
                hashMap.put(Base64.encodeToString(bArr, 0), bArr);
            }
            this.f77339c.add(new h(ascii, (byte[][]) hashMap.values().toArray(new byte[hashMap.size()][]), z13, date));
            return this;
        } catch (IllegalArgumentException unused) {
            throw new IllegalArgumentException(a.a.k("Hostname ", str, " is illegal. The name of the host does not comply with RFC 1122 and RFC 1123."));
        }
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder addQuicHint(String str, int i13, int i14) {
        if (str.contains("/")) {
            throw new IllegalArgumentException("Illegal QUIC Hint Host: ".concat(str));
        }
        this.f77338b.add(new i(str, i13, i14));
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ExperimentalCronetEngine build() {
        if (this.f77341e == null) {
            this.f77341e = c0.a(this.f77337a);
        }
        return new CronetUrlRequestContext(this);
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder enableBrotli(boolean z13) {
        this.f77345i = z13;
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder enableHttp2(boolean z13) {
        this.f77344h = z13;
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder enableHttpCache(int i13, long j13) {
        g fromPublicBuilderCacheMode = g.fromPublicBuilderCacheMode(i13);
        if (fromPublicBuilderCacheMode.getType() == 1 && this.f77342f == null) {
            throw new IllegalArgumentException("Storage path must be set");
        }
        this.f77346j = fromPublicBuilderCacheMode;
        this.f77347k = j13;
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder enableNetworkQualityEstimator(boolean z13) {
        this.f77349m = z13;
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder enablePublicKeyPinningBypassForLocalTrustAnchors(boolean z13) {
        this.f77340d = z13;
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder enableQuic(boolean z13) {
        this.f77343g = z13;
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder enableSdch(boolean z13) {
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder setExperimentalOptions(String str) {
        this.f77348l = str;
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder setStoragePath(String str) {
        if (!new File(str).isDirectory()) {
            throw new IllegalArgumentException("Storage path must be set to existing directory");
        }
        this.f77342f = str;
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder setThreadPriority(int i13) {
        if (i13 > 19 || i13 < -20) {
            throw new IllegalArgumentException("Thread priority invalid");
        }
        this.f77350n = i13;
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder setUserAgent(String str) {
        this.f77341e = str;
        return this;
    }
}
