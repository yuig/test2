package m81;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.Image;
import androidx.fragment.app.FragmentActivity;
import java.io.File;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.util.HashSet;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;

/* loaded from: classes5.dex */
public final class d extends yk1.p implements a, dp0.b {

    /* renamed from: a, reason: collision with root package name */
    public final FragmentActivity f86531a;

    /* renamed from: b, reason: collision with root package name */
    public final h f86532b;

    /* renamed from: c, reason: collision with root package name */
    public int f86533c;

    /* renamed from: d, reason: collision with root package name */
    public ep0.d f86534d;

    /* renamed from: e, reason: collision with root package name */
    public String f86535e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(uk1.d presenterPinalytics, FragmentActivity fragmentActivity, h hVar, uj2.q networkStateStream) {
        super(presenterPinalytics, networkStateStream);
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(fragmentActivity, "fragmentActivity");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        this.f86531a = fragmentActivity;
        this.f86532b = hVar;
        this.f86534d = ep0.d.FLASH_MODE_AUTO;
    }

    @Override // yk1.p
    public final void bindPinalytics(yk1.r rVar) {
        b view = (b) rVar;
        Intrinsics.checkNotNullParameter(view, "view");
    }

    @Override // yk1.p, yk1.b
    /* renamed from: onBind */
    public final void r3(yk1.n nVar) {
        b view = (b) nVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((yk1.r) view);
        Intrinsics.checkNotNullParameter(this, "listener");
        ((q81.a) view).f103019f = this;
    }

    public final void p3(dp0.a error, Exception exception) {
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(exception, "exception");
    }

    public final void q3(Image photo, File file) {
        h hVar;
        Intrinsics.checkNotNullParameter(photo, "photo");
        if (file == null) {
            return;
        }
        if (this.f86535e != null) {
            new File(this.f86535e).delete();
        }
        String absolutePath = file.getAbsolutePath();
        this.f86535e = absolutePath;
        boolean z13 = absolutePath == null || z.j(absolutePath);
        boolean z14 = !z13;
        q81.a aVar = (q81.a) ((b) getView());
        aVar.getClass();
        aVar.f103015b.t(new i31.a(z14, 28));
        bs1.c.R1(aVar.f103016c, z14);
        if (!z14) {
            aVar.f103017d.l();
        }
        try {
            if (z13) {
                photo.close();
                ((q81.a) ((b) getView())).b();
                return;
            }
            try {
                String str = this.f86535e;
                if (str != null) {
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inPreferredConfig = Bitmap.Config.RGB_565;
                    ByteBuffer buffer = photo.getPlanes()[0].getBuffer();
                    int limit = buffer.limit();
                    byte[] bArr = new byte[limit];
                    buffer.get(bArr);
                    Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, limit, options);
                    if (decodeByteArray != null && (hVar = this.f86532b) != null) {
                        ((s81.p) hVar).T3(this.f86533c, decodeByteArray, str);
                    }
                }
            } catch (OutOfMemoryError e13) {
                HashSet hashSet = tb0.h.f117076w;
                tb0.g.f117075a.o("Failed to allocate memory for lens photo", e13);
            } catch (BufferUnderflowException e14) {
                HashSet hashSet2 = tb0.h.f117076w;
                tb0.g.f117075a.o("Error converting Lens Image to Bitmap", e14);
            }
            ((q81.a) ((b) getView())).b();
        } finally {
            photo.close();
        }
    }

    @Override // yk1.p
    public final void unbindPinalytics() {
    }

    @Override // yk1.p
    /* renamed from: onBind */
    public final void r3(yk1.r rVar) {
        b view = (b) rVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((yk1.r) view);
        Intrinsics.checkNotNullParameter(this, "listener");
        ((q81.a) view).f103019f = this;
    }
}
