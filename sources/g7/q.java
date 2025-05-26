package g7;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import androidx.media3.datasource.FileDataSource$FileDataSourceException;
import d7.n0;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* loaded from: classes.dex */
public final class q extends b {

    /* renamed from: e, reason: collision with root package name */
    public RandomAccessFile f63831e;

    /* renamed from: f, reason: collision with root package name */
    public Uri f63832f;

    /* renamed from: g, reason: collision with root package name */
    public long f63833g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f63834h;

    @Override // g7.f
    public final void close() {
        this.f63832f = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.f63831e;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (IOException e13) {
                throw new FileDataSource$FileDataSourceException(2000, e13);
            }
        } finally {
            this.f63831e = null;
            if (this.f63834h) {
                this.f63834h = false;
                u();
            }
        }
    }

    @Override // g7.f
    public final long d(i iVar) {
        Uri uri = iVar.f63786a;
        long j13 = iVar.f63791f;
        this.f63832f = uri;
        v(iVar);
        try {
            String path = uri.getPath();
            path.getClass();
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
            this.f63831e = randomAccessFile;
            try {
                randomAccessFile.seek(j13);
                long j14 = iVar.f63792g;
                if (j14 == -1) {
                    j14 = this.f63831e.length() - j13;
                }
                this.f63833g = j14;
                if (j14 < 0) {
                    throw new FileDataSource$FileDataSourceException(2008, null, null);
                }
                this.f63834h = true;
                w(iVar);
                return this.f63833g;
            } catch (IOException e13) {
                throw new FileDataSource$FileDataSourceException(2000, e13);
            }
        } catch (FileNotFoundException e14) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                throw new FileDataSource$FileDataSourceException(((e14.getCause() instanceof ErrnoException) && ((ErrnoException) e14.getCause()).errno == OsConstants.EACCES) ? 2006 : 2005, e14);
            }
            String path2 = uri.getPath();
            String query = uri.getQuery();
            String fragment = uri.getFragment();
            StringBuilder w13 = a.a.w("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=", path2, ",query=", query, ",fragment=");
            w13.append(fragment);
            throw new FileDataSource$FileDataSourceException(1004, w13.toString(), e14);
        } catch (SecurityException e15) {
            throw new FileDataSource$FileDataSourceException(2006, e15);
        } catch (RuntimeException e16) {
            throw new FileDataSource$FileDataSourceException(2000, e16);
        }
    }

    @Override // g7.f
    public final Uri r() {
        return this.f63832f;
    }

    @Override // a7.k
    public final int read(byte[] bArr, int i13, int i14) {
        if (i14 == 0) {
            return 0;
        }
        long j13 = this.f63833g;
        if (j13 == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.f63831e;
            int i15 = n0.f53866a;
            int read = randomAccessFile.read(bArr, i13, (int) Math.min(j13, i14));
            if (read > 0) {
                this.f63833g -= read;
                t(read);
            }
            return read;
        } catch (IOException e13) {
            throw new FileDataSource$FileDataSourceException(2000, e13);
        }
    }
}
