package g7;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import androidx.media3.datasource.ContentDataSource$ContentDataSourceException;
import d7.n0;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* loaded from: classes3.dex */
public final class c extends b {

    /* renamed from: e, reason: collision with root package name */
    public final ContentResolver f63761e;

    /* renamed from: f, reason: collision with root package name */
    public Uri f63762f;

    /* renamed from: g, reason: collision with root package name */
    public AssetFileDescriptor f63763g;

    /* renamed from: h, reason: collision with root package name */
    public FileInputStream f63764h;

    /* renamed from: i, reason: collision with root package name */
    public long f63765i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f63766j;

    public c(Context context) {
        super(false);
        this.f63761e = context.getContentResolver();
    }

    @Override // g7.f
    public final void close() {
        this.f63762f = null;
        try {
            try {
                FileInputStream fileInputStream = this.f63764h;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.f63764h = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f63763g;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e13) {
                        throw new ContentDataSource$ContentDataSourceException(2000, e13);
                    }
                } finally {
                    this.f63763g = null;
                    if (this.f63766j) {
                        this.f63766j = false;
                        u();
                    }
                }
            } catch (Throwable th3) {
                this.f63764h = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor2 = this.f63763g;
                        if (assetFileDescriptor2 != null) {
                            assetFileDescriptor2.close();
                        }
                        this.f63763g = null;
                        if (this.f63766j) {
                            this.f63766j = false;
                            u();
                        }
                        throw th3;
                    } finally {
                        this.f63763g = null;
                        if (this.f63766j) {
                            this.f63766j = false;
                            u();
                        }
                    }
                } catch (IOException e14) {
                    throw new ContentDataSource$ContentDataSourceException(2000, e14);
                }
            }
        } catch (IOException e15) {
            throw new ContentDataSource$ContentDataSourceException(2000, e15);
        }
    }

    @Override // g7.f
    public final long d(i iVar) {
        AssetFileDescriptor openAssetFileDescriptor;
        try {
            Uri normalizeScheme = iVar.f63786a.normalizeScheme();
            this.f63762f = normalizeScheme;
            v(iVar);
            boolean equals = "content".equals(normalizeScheme.getScheme());
            ContentResolver contentResolver = this.f63761e;
            if (equals) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                openAssetFileDescriptor = contentResolver.openTypedAssetFileDescriptor(normalizeScheme, "*/*", bundle);
            } else {
                openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(normalizeScheme, "r");
            }
            this.f63763g = openAssetFileDescriptor;
            if (openAssetFileDescriptor == null) {
                throw new ContentDataSource$ContentDataSourceException(2000, new IOException("Could not open file descriptor for: " + normalizeScheme));
            }
            long length = openAssetFileDescriptor.getLength();
            FileInputStream fileInputStream = new FileInputStream(openAssetFileDescriptor.getFileDescriptor());
            this.f63764h = fileInputStream;
            long j13 = iVar.f63791f;
            if (length != -1 && j13 > length) {
                throw new ContentDataSource$ContentDataSourceException(2008, null);
            }
            long startOffset = openAssetFileDescriptor.getStartOffset();
            long skip = fileInputStream.skip(startOffset + j13) - startOffset;
            if (skip != j13) {
                throw new ContentDataSource$ContentDataSourceException(2008, null);
            }
            if (length == -1) {
                FileChannel channel = fileInputStream.getChannel();
                long size = channel.size();
                if (size == 0) {
                    this.f63765i = -1L;
                } else {
                    long position = size - channel.position();
                    this.f63765i = position;
                    if (position < 0) {
                        throw new ContentDataSource$ContentDataSourceException(2008, null);
                    }
                }
            } else {
                long j14 = length - skip;
                this.f63765i = j14;
                if (j14 < 0) {
                    throw new ContentDataSource$ContentDataSourceException(2008, null);
                }
            }
            long j15 = iVar.f63792g;
            if (j15 != -1) {
                long j16 = this.f63765i;
                this.f63765i = j16 == -1 ? j15 : Math.min(j16, j15);
            }
            this.f63766j = true;
            w(iVar);
            return j15 != -1 ? j15 : this.f63765i;
        } catch (ContentDataSource$ContentDataSourceException e13) {
            throw e13;
        } catch (IOException e14) {
            throw new ContentDataSource$ContentDataSourceException(e14 instanceof FileNotFoundException ? 2005 : 2000, e14);
        }
    }

    @Override // g7.f
    public final Uri r() {
        return this.f63762f;
    }

    @Override // a7.k
    public final int read(byte[] bArr, int i13, int i14) {
        if (i14 == 0) {
            return 0;
        }
        long j13 = this.f63765i;
        if (j13 == 0) {
            return -1;
        }
        if (j13 != -1) {
            try {
                i14 = (int) Math.min(j13, i14);
            } catch (IOException e13) {
                throw new ContentDataSource$ContentDataSourceException(2000, e13);
            }
        }
        FileInputStream fileInputStream = this.f63764h;
        int i15 = n0.f53866a;
        int read = fileInputStream.read(bArr, i13, i14);
        if (read == -1) {
            return -1;
        }
        long j14 = this.f63765i;
        if (j14 != -1) {
            this.f63765i = j14 - read;
        }
        t(read);
        return read;
    }
}
