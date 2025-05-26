package g7;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import androidx.media3.datasource.AssetDataSource$AssetDataSourceException;
import d7.n0;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes3.dex */
public final class a extends b {

    /* renamed from: e, reason: collision with root package name */
    public final AssetManager f63743e;

    /* renamed from: f, reason: collision with root package name */
    public Uri f63744f;

    /* renamed from: g, reason: collision with root package name */
    public InputStream f63745g;

    /* renamed from: h, reason: collision with root package name */
    public long f63746h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f63747i;

    public a(Context context) {
        super(false);
        this.f63743e = context.getAssets();
    }

    @Override // g7.f
    public final void close() {
        this.f63744f = null;
        try {
            try {
                InputStream inputStream = this.f63745g;
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e13) {
                throw new AssetDataSource$AssetDataSourceException(2000, e13);
            }
        } finally {
            this.f63745g = null;
            if (this.f63747i) {
                this.f63747i = false;
                u();
            }
        }
    }

    @Override // g7.f
    public final long d(i iVar) {
        try {
            Uri uri = iVar.f63786a;
            long j13 = iVar.f63791f;
            this.f63744f = uri;
            String path = uri.getPath();
            path.getClass();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            v(iVar);
            InputStream open = this.f63743e.open(path, 1);
            this.f63745g = open;
            if (open.skip(j13) < j13) {
                throw new AssetDataSource$AssetDataSourceException(2008, null);
            }
            long j14 = iVar.f63792g;
            if (j14 != -1) {
                this.f63746h = j14;
            } else {
                long available = this.f63745g.available();
                this.f63746h = available;
                if (available == 2147483647L) {
                    this.f63746h = -1L;
                }
            }
            this.f63747i = true;
            w(iVar);
            return this.f63746h;
        } catch (AssetDataSource$AssetDataSourceException e13) {
            throw e13;
        } catch (IOException e14) {
            throw new AssetDataSource$AssetDataSourceException(e14 instanceof FileNotFoundException ? 2005 : 2000, e14);
        }
    }

    @Override // g7.f
    public final Uri r() {
        return this.f63744f;
    }

    @Override // a7.k
    public final int read(byte[] bArr, int i13, int i14) {
        if (i14 == 0) {
            return 0;
        }
        long j13 = this.f63746h;
        if (j13 == 0) {
            return -1;
        }
        if (j13 != -1) {
            try {
                i14 = (int) Math.min(j13, i14);
            } catch (IOException e13) {
                throw new AssetDataSource$AssetDataSourceException(2000, e13);
            }
        }
        InputStream inputStream = this.f63745g;
        int i15 = n0.f53866a;
        int read = inputStream.read(bArr, i13, i14);
        if (read == -1) {
            return -1;
        }
        long j14 = this.f63746h;
        if (j14 != -1) {
            this.f63746h = j14 - read;
        }
        t(read);
        return read;
    }
}
