package td;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class d implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f117377a;

    public /* synthetic */ d(int i13) {
        this.f117377a = i13;
    }

    @Override // td.d0
    public final c0 a(i0 i0Var) {
        switch (this.f117377a) {
            case 0:
                return new g(new bb.p(this, 3), 0);
            case 1:
                return new g(new bb.p(this, 4), 0);
            case 2:
                return new i(0);
            case 3:
                return new k0(i0Var.c(Uri.class, AssetFileDescriptor.class), 0);
            case 4:
                return new k0(i0Var.c(Uri.class, ParcelFileDescriptor.class), 0);
            case 5:
                return new k0(i0Var.c(Uri.class, InputStream.class), 0);
            case 6:
                return new r0(i0Var.c(t.class, InputStream.class));
            default:
                return new k0(i0Var.c(t.class, InputStream.class), 1);
        }
    }
}
