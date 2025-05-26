package g7;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.datasource.RawResourceDataSource$RawResourceDataSourceException;
import d7.n0;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.List;

/* loaded from: classes3.dex */
public final class v extends b {

    /* renamed from: e, reason: collision with root package name */
    public final Context f63840e;

    /* renamed from: f, reason: collision with root package name */
    public i f63841f;

    /* renamed from: g, reason: collision with root package name */
    public AssetFileDescriptor f63842g;

    /* renamed from: h, reason: collision with root package name */
    public FileInputStream f63843h;

    /* renamed from: i, reason: collision with root package name */
    public long f63844i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f63845j;

    public v(Context context) {
        super(false);
        this.f63840e = context.getApplicationContext();
    }

    @Deprecated
    public static Uri buildRawResourceUri(int i13) {
        return Uri.parse("rawresource:///" + i13);
    }

    @Override // g7.f
    public final void close() {
        this.f63841f = null;
        try {
            try {
                FileInputStream fileInputStream = this.f63843h;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.f63843h = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f63842g;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e13) {
                        throw new RawResourceDataSource$RawResourceDataSourceException(2000, null, e13);
                    }
                } finally {
                    this.f63842g = null;
                    if (this.f63845j) {
                        this.f63845j = false;
                        u();
                    }
                }
            } catch (Throwable th3) {
                this.f63843h = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor2 = this.f63842g;
                        if (assetFileDescriptor2 != null) {
                            assetFileDescriptor2.close();
                        }
                        this.f63842g = null;
                        if (this.f63845j) {
                            this.f63845j = false;
                            u();
                        }
                        throw th3;
                    } finally {
                        this.f63842g = null;
                        if (this.f63845j) {
                            this.f63845j = false;
                            u();
                        }
                    }
                } catch (IOException e14) {
                    throw new RawResourceDataSource$RawResourceDataSourceException(2000, null, e14);
                }
            }
        } catch (IOException e15) {
            throw new RawResourceDataSource$RawResourceDataSourceException(2000, null, e15);
        }
    }

    @Override // g7.f
    public final long d(i iVar) {
        Resources resourcesForApplication;
        int parseInt;
        int i13;
        Resources resources;
        this.f63841f = iVar;
        v(iVar);
        Uri normalizeScheme = iVar.f63786a.normalizeScheme();
        boolean equals = TextUtils.equals("rawresource", normalizeScheme.getScheme());
        Context context = this.f63840e;
        if (equals) {
            resources = context.getResources();
            List<String> pathSegments = normalizeScheme.getPathSegments();
            if (pathSegments.size() != 1) {
                throw new RawResourceDataSource$RawResourceDataSourceException(2000, "rawresource:// URI must have exactly one path element, found " + pathSegments.size(), null);
            }
            try {
                i13 = Integer.parseInt(pathSegments.get(0));
            } catch (NumberFormatException unused) {
                throw new RawResourceDataSource$RawResourceDataSourceException(1004, "Resource identifier must be an integer.", null);
            }
        } else {
            if (!TextUtils.equals("android.resource", normalizeScheme.getScheme())) {
                throw new RawResourceDataSource$RawResourceDataSourceException(1004, "Unsupported URI scheme (" + normalizeScheme.getScheme() + "). Only android.resource is supported.", null);
            }
            String path = normalizeScheme.getPath();
            path.getClass();
            if (path.startsWith("/")) {
                path = path.substring(1);
            }
            String packageName = TextUtils.isEmpty(normalizeScheme.getHost()) ? context.getPackageName() : normalizeScheme.getHost();
            if (packageName.equals(context.getPackageName())) {
                resourcesForApplication = context.getResources();
            } else {
                try {
                    resourcesForApplication = context.getPackageManager().getResourcesForApplication(packageName);
                } catch (PackageManager.NameNotFoundException e13) {
                    throw new RawResourceDataSource$RawResourceDataSourceException(2005, "Package in android.resource:// URI not found. Check http://g.co/dev/packagevisibility.", e13);
                }
            }
            if (path.matches("\\d+")) {
                try {
                    parseInt = Integer.parseInt(path);
                } catch (NumberFormatException unused2) {
                    throw new RawResourceDataSource$RawResourceDataSourceException(1004, "Resource identifier must be an integer.", null);
                }
            } else {
                parseInt = resourcesForApplication.getIdentifier(a.a.D(packageName, ":", path), "raw", null);
                if (parseInt == 0) {
                    throw new RawResourceDataSource$RawResourceDataSourceException(2005, "Resource not found.", null);
                }
            }
            i13 = parseInt;
            resources = resourcesForApplication;
        }
        try {
            AssetFileDescriptor openRawResourceFd = resources.openRawResourceFd(i13);
            if (openRawResourceFd == null) {
                throw new RawResourceDataSource$RawResourceDataSourceException(2000, a.c.g("Resource is compressed: ", normalizeScheme), null);
            }
            this.f63842g = openRawResourceFd;
            long length = openRawResourceFd.getLength();
            FileInputStream fileInputStream = new FileInputStream(this.f63842g.getFileDescriptor());
            this.f63843h = fileInputStream;
            long j13 = iVar.f63791f;
            try {
                if (length != -1 && j13 > length) {
                    throw new RawResourceDataSource$RawResourceDataSourceException(2008, null, null);
                }
                long startOffset = this.f63842g.getStartOffset();
                long skip = fileInputStream.skip(startOffset + j13) - startOffset;
                if (skip != j13) {
                    throw new RawResourceDataSource$RawResourceDataSourceException(2008, null, null);
                }
                if (length == -1) {
                    FileChannel channel = fileInputStream.getChannel();
                    if (channel.size() == 0) {
                        this.f63844i = -1L;
                    } else {
                        long size = channel.size() - channel.position();
                        this.f63844i = size;
                        if (size < 0) {
                            throw new RawResourceDataSource$RawResourceDataSourceException(2008, null, null);
                        }
                    }
                } else {
                    long j14 = length - skip;
                    this.f63844i = j14;
                    if (j14 < 0) {
                        throw new DataSourceException(2008);
                    }
                }
                long j15 = iVar.f63792g;
                if (j15 != -1) {
                    long j16 = this.f63844i;
                    this.f63844i = j16 == -1 ? j15 : Math.min(j16, j15);
                }
                this.f63845j = true;
                w(iVar);
                return j15 != -1 ? j15 : this.f63844i;
            } catch (RawResourceDataSource$RawResourceDataSourceException e14) {
                throw e14;
            } catch (IOException e15) {
                throw new RawResourceDataSource$RawResourceDataSourceException(2000, null, e15);
            }
        } catch (Resources.NotFoundException e16) {
            throw new RawResourceDataSource$RawResourceDataSourceException(2005, null, e16);
        }
    }

    @Override // g7.f
    public final Uri r() {
        i iVar = this.f63841f;
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
        long j13 = this.f63844i;
        if (j13 == 0) {
            return -1;
        }
        if (j13 != -1) {
            try {
                i14 = (int) Math.min(j13, i14);
            } catch (IOException e13) {
                throw new RawResourceDataSource$RawResourceDataSourceException(2000, null, e13);
            }
        }
        FileInputStream fileInputStream = this.f63843h;
        int i15 = n0.f53866a;
        int read = fileInputStream.read(bArr, i13, i14);
        if (read == -1) {
            if (this.f63844i == -1) {
                return -1;
            }
            throw new RawResourceDataSource$RawResourceDataSourceException(2000, "End of stream reached having not read sufficient data.", new EOFException());
        }
        long j14 = this.f63844i;
        if (j14 != -1) {
            this.f63844i = j14 - read;
        }
        t(read);
        return read;
    }
}
