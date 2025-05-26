package org.chromium.net;

import android.os.ParcelFileDescriptor;
import java.io.File;
import java.nio.ByteBuffer;

@Deprecated
/* loaded from: classes4.dex */
public final class UploadDataProviders {
    private UploadDataProviders() {
    }

    public static UploadDataProvider create(File file) {
        return new hp2.c(new fg.a(file));
    }

    public static UploadDataProvider create(ParcelFileDescriptor parcelFileDescriptor) {
        return new hp2.c(new t72.j(parcelFileDescriptor, 12));
    }

    public static UploadDataProvider create(ByteBuffer byteBuffer) {
        return new hp2.a(byteBuffer.slice(), 0);
    }

    public static UploadDataProvider create(byte[] bArr, int i13, int i14) {
        return new hp2.a(ByteBuffer.wrap(bArr, i13, i14).slice(), 0);
    }

    public static UploadDataProvider create(byte[] bArr) {
        return new hp2.a(ByteBuffer.wrap(bArr, 0, bArr.length).slice(), 0);
    }
}
