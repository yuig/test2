package yd;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.List;
import nd.l;
import nd.n;
import pd.g0;

/* loaded from: classes.dex */
public final class a implements n {

    /* renamed from: f, reason: collision with root package name */
    public static final wc.b f138706f = new wc.b(11);

    /* renamed from: g, reason: collision with root package name */
    public static final rd.e f138707g = new rd.e(1);

    /* renamed from: a, reason: collision with root package name */
    public final Context f138708a;

    /* renamed from: b, reason: collision with root package name */
    public final List f138709b;

    /* renamed from: c, reason: collision with root package name */
    public final rd.e f138710c;

    /* renamed from: d, reason: collision with root package name */
    public final wc.b f138711d;

    /* renamed from: e, reason: collision with root package name */
    public final tb.e f138712e;

    public a(Context context, List list, qd.d dVar, qd.i iVar) {
        wc.b bVar = f138706f;
        this.f138708a = context.getApplicationContext();
        this.f138709b = list;
        this.f138711d = bVar;
        this.f138712e = new tb.e(dVar, iVar);
        this.f138710c = f138707g;
    }

    public static int d(ld.c cVar, int i13, int i14) {
        int min = Math.min(cVar.a() / i14, cVar.b() / i13);
        int max = Math.max(1, min == 0 ? 0 : Integer.highestOneBit(min));
        if (Log.isLoggable("BufferGifDecoder", 2) && max > 1) {
            StringBuilder t13 = a.a.t("Downsampling GIF, sampleSize: ", max, ", target dimens: [", i13, "x");
            t13.append(i14);
            t13.append("], actual dimens: [");
            t13.append(cVar.b());
            t13.append("x");
            t13.append(cVar.a());
            t13.append("]");
            Log.v("BufferGifDecoder", t13.toString());
        }
        return max;
    }

    @Override // nd.n
    public final boolean a(Object obj, l lVar) {
        return !((Boolean) lVar.c(i.f138748b)).booleanValue() && bs1.c.U0(this.f138709b, (ByteBuffer) obj) == ImageHeaderParser$ImageType.GIF;
    }

    @Override // nd.n
    public final g0 b(Object obj, int i13, int i14, l lVar) {
        ld.d dVar;
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        rd.e eVar = this.f138710c;
        synchronized (eVar) {
            try {
                ld.d dVar2 = (ld.d) eVar.f107497a.poll();
                if (dVar2 == null) {
                    dVar2 = new ld.d();
                }
                dVar = dVar2;
                dVar.f82927b = null;
                Arrays.fill(dVar.f82926a, (byte) 0);
                dVar.f82928c = new ld.c();
                dVar.f82929d = 0;
                ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                dVar.f82927b = asReadOnlyBuffer;
                asReadOnlyBuffer.position(0);
                dVar.f82927b.order(ByteOrder.LITTLE_ENDIAN);
            } catch (Throwable th3) {
                throw th3;
            }
        }
        try {
            xd.d c13 = c(byteBuffer, i13, i14, dVar, lVar);
            rd.e eVar2 = this.f138710c;
            synchronized (eVar2) {
                dVar.f82927b = null;
                dVar.f82928c = null;
                eVar2.f107497a.offer(dVar);
            }
            return c13;
        } catch (Throwable th4) {
            rd.e eVar3 = this.f138710c;
            synchronized (eVar3) {
                dVar.f82927b = null;
                dVar.f82928c = null;
                eVar3.f107497a.offer(dVar);
                throw th4;
            }
        }
    }

    public final xd.d c(ByteBuffer byteBuffer, int i13, int i14, ld.d dVar, l lVar) {
        Bitmap.Config config;
        int i15 = he.i.f68949b;
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        int i16 = 2;
        try {
            ld.c b13 = dVar.b();
            if (b13.f82917c > 0 && b13.f82916b == 0) {
                if (lVar.c(i.f138747a) == nd.b.PREFER_RGB_565) {
                    try {
                        config = Bitmap.Config.RGB_565;
                    } catch (Throwable th3) {
                        th = th3;
                        if (Log.isLoggable("BufferGifDecoder", i16)) {
                            Log.v("BufferGifDecoder", "Decoded GIF from stream in " + he.i.a(elapsedRealtimeNanos));
                        }
                        throw th;
                    }
                } else {
                    config = Bitmap.Config.ARGB_8888;
                }
                int d2 = d(b13, i13, i14);
                wc.b bVar = this.f138711d;
                tb.e eVar = this.f138712e;
                bVar.getClass();
                ld.e eVar2 = new ld.e(eVar, b13, byteBuffer, d2);
                eVar2.c(config);
                eVar2.f82940k = (eVar2.f82940k + 1) % eVar2.f82941l.f82917c;
                Bitmap b14 = eVar2.b();
                if (b14 == null) {
                    if (Log.isLoggable("BufferGifDecoder", 2)) {
                        Log.v("BufferGifDecoder", "Decoded GIF from stream in " + he.i.a(elapsedRealtimeNanos));
                    }
                    return null;
                }
                xd.d dVar2 = new xd.d(new c(new b(new h(com.bumptech.glide.b.a(this.f138708a), eVar2, i13, i14, vd.c.f125617b, b14))), 1);
                if (Log.isLoggable("BufferGifDecoder", 2)) {
                    Log.v("BufferGifDecoder", "Decoded GIF from stream in " + he.i.a(elapsedRealtimeNanos));
                }
                return dVar2;
            }
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                Log.v("BufferGifDecoder", "Decoded GIF from stream in " + he.i.a(elapsedRealtimeNanos));
            }
            return null;
        } catch (Throwable th4) {
            th = th4;
            i16 = 2;
        }
    }
}
