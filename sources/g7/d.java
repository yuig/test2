package g7;

import android.net.Uri;
import android.util.Base64;
import androidx.media3.common.ParserException;
import androidx.media3.datasource.DataSourceException;
import d7.n0;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;

/* loaded from: classes3.dex */
public final class d extends b {

    /* renamed from: e, reason: collision with root package name */
    public i f63767e;

    /* renamed from: f, reason: collision with root package name */
    public byte[] f63768f;

    /* renamed from: g, reason: collision with root package name */
    public int f63769g;

    /* renamed from: h, reason: collision with root package name */
    public int f63770h;

    public d() {
        super(false);
    }

    @Override // g7.f
    public final void close() {
        if (this.f63768f != null) {
            this.f63768f = null;
            u();
        }
        this.f63767e = null;
    }

    @Override // g7.f
    public final long d(i iVar) {
        v(iVar);
        this.f63767e = iVar;
        Uri normalizeScheme = iVar.f63786a.normalizeScheme();
        String scheme = normalizeScheme.getScheme();
        bf.b.h("Unsupported scheme: " + scheme, "data".equals(scheme));
        String schemeSpecificPart = normalizeScheme.getSchemeSpecificPart();
        int i13 = n0.f53866a;
        String[] split = schemeSpecificPart.split(",", -1);
        if (split.length != 2) {
            throw new ParserException(a.c.g("Unexpected URI format: ", normalizeScheme), null, true, 0);
        }
        String str = split[1];
        if (split[0].contains(";base64")) {
            try {
                this.f63768f = Base64.decode(str, 0);
            } catch (IllegalArgumentException e13) {
                throw new ParserException(a.a.j("Error while parsing Base64 encoded string: ", str), e13, true, 0);
            }
        } else {
            this.f63768f = URLDecoder.decode(str, StandardCharsets.US_ASCII.name()).getBytes(StandardCharsets.UTF_8);
        }
        byte[] bArr = this.f63768f;
        long length = bArr.length;
        long j13 = iVar.f63791f;
        if (j13 > length) {
            this.f63768f = null;
            throw new DataSourceException(2008);
        }
        int i14 = (int) j13;
        this.f63769g = i14;
        int length2 = bArr.length - i14;
        this.f63770h = length2;
        long j14 = iVar.f63792g;
        if (j14 != -1) {
            this.f63770h = (int) Math.min(length2, j14);
        }
        w(iVar);
        return j14 != -1 ? j14 : this.f63770h;
    }

    @Override // g7.f
    public final Uri r() {
        i iVar = this.f63767e;
        if (iVar != null) {
            return iVar.f63786a;
        }
        return null;
    }

    @Override // a7.k
    public final int read(byte[] bArr, int i13, int i14) {
        if (i14 == 0) {
            return 0;
        }
        int i15 = this.f63770h;
        if (i15 == 0) {
            return -1;
        }
        int min = Math.min(i14, i15);
        byte[] bArr2 = this.f63768f;
        int i16 = n0.f53866a;
        System.arraycopy(bArr2, this.f63769g, bArr, i13, min);
        this.f63769g += min;
        this.f63770h -= min;
        t(min);
        return min;
    }
}
