package xd;

import android.graphics.ImageDecoder;
import android.os.Build;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import nd.l;
import nd.n;
import pd.g0;
import qd.i;

/* loaded from: classes.dex */
public final class b implements n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f134590a;

    /* renamed from: b, reason: collision with root package name */
    public final tb.c f134591b;

    public /* synthetic */ b(tb.c cVar, int i13) {
        this.f134590a = i13;
        this.f134591b = cVar;
    }

    @Override // nd.n
    public final boolean a(Object obj, l lVar) {
        int i13 = this.f134590a;
        tb.c cVar = this.f134591b;
        switch (i13) {
            case 0:
                ImageHeaderParser$ImageType U0 = bs1.c.U0((List) cVar.f116959a, (ByteBuffer) obj);
                if (U0 != ImageHeaderParser$ImageType.ANIMATED_WEBP) {
                    if (Build.VERSION.SDK_INT < 31 || U0 != ImageHeaderParser$ImageType.ANIMATED_AVIF) {
                        break;
                    }
                }
                break;
            default:
                List list = (List) cVar.f116959a;
                ImageHeaderParser$ImageType V0 = bs1.c.V0((i) cVar.f116960b, (InputStream) obj, list);
                if (V0 != ImageHeaderParser$ImageType.ANIMATED_WEBP) {
                    if (Build.VERSION.SDK_INT < 31 || V0 != ImageHeaderParser$ImageType.ANIMATED_AVIF) {
                        break;
                    }
                }
                break;
        }
        return false;
    }

    @Override // nd.n
    public final g0 b(Object obj, int i13, int i14, l lVar) {
        ImageDecoder.Source createSource;
        ImageDecoder.Source createSource2;
        int i15 = this.f134590a;
        tb.c cVar = this.f134591b;
        switch (i15) {
            case 0:
                createSource = ImageDecoder.createSource((ByteBuffer) obj);
                cVar.getClass();
                return tb.c.c(createSource, i13, i14, lVar);
            default:
                createSource2 = ImageDecoder.createSource(he.c.b((InputStream) obj));
                cVar.getClass();
                return tb.c.c(createSource2, i13, i14, lVar);
        }
    }
}
