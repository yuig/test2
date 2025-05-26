package yd;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import nd.l;
import nd.n;
import pd.g0;

/* loaded from: classes.dex */
public final class j implements n {

    /* renamed from: a, reason: collision with root package name */
    public final List f138749a;

    /* renamed from: b, reason: collision with root package name */
    public final n f138750b;

    /* renamed from: c, reason: collision with root package name */
    public final qd.i f138751c;

    public j(List list, a aVar, qd.i iVar) {
        this.f138749a = list;
        this.f138750b = aVar;
        this.f138751c = iVar;
    }

    @Override // nd.n
    public final boolean a(Object obj, l lVar) {
        InputStream inputStream = (InputStream) obj;
        if (!((Boolean) lVar.c(i.f138748b)).booleanValue()) {
            if (bs1.c.V0(this.f138751c, inputStream, this.f138749a) == ImageHeaderParser$ImageType.GIF) {
                return true;
            }
        }
        return false;
    }

    @Override // nd.n
    public final g0 b(Object obj, int i13, int i14, l lVar) {
        byte[] bArr;
        InputStream inputStream = (InputStream) obj;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr2 = new byte[16384];
            while (true) {
                int read = inputStream.read(bArr2);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr2, 0, read);
            }
            byteArrayOutputStream.flush();
            bArr = byteArrayOutputStream.toByteArray();
        } catch (IOException e13) {
            if (Log.isLoggable("StreamGifDecoder", 5)) {
                Log.w("StreamGifDecoder", "Error reading data from stream", e13);
            }
            bArr = null;
        }
        if (bArr == null) {
            return null;
        }
        return this.f138750b.b(ByteBuffer.wrap(bArr), i13, i14, lVar);
    }
}
