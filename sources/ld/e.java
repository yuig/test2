package ld;

import android.graphics.Bitmap;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;
import qd.i;

/* loaded from: classes3.dex */
public final class e implements a {

    /* renamed from: a, reason: collision with root package name */
    public int[] f82930a;

    /* renamed from: c, reason: collision with root package name */
    public final tb.e f82932c;

    /* renamed from: d, reason: collision with root package name */
    public ByteBuffer f82933d;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f82934e;

    /* renamed from: f, reason: collision with root package name */
    public short[] f82935f;

    /* renamed from: g, reason: collision with root package name */
    public byte[] f82936g;

    /* renamed from: h, reason: collision with root package name */
    public byte[] f82937h;

    /* renamed from: i, reason: collision with root package name */
    public byte[] f82938i;

    /* renamed from: j, reason: collision with root package name */
    public final int[] f82939j;

    /* renamed from: k, reason: collision with root package name */
    public int f82940k;

    /* renamed from: l, reason: collision with root package name */
    public c f82941l;

    /* renamed from: m, reason: collision with root package name */
    public Bitmap f82942m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f82943n;

    /* renamed from: o, reason: collision with root package name */
    public int f82944o;

    /* renamed from: p, reason: collision with root package name */
    public final int f82945p;

    /* renamed from: q, reason: collision with root package name */
    public final int f82946q;

    /* renamed from: r, reason: collision with root package name */
    public final int f82947r;

    /* renamed from: s, reason: collision with root package name */
    public Boolean f82948s;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f82931b = new int[RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER];

    /* renamed from: t, reason: collision with root package name */
    public Bitmap.Config f82949t = Bitmap.Config.ARGB_8888;

    public e(tb.e eVar, c cVar, ByteBuffer byteBuffer, int i13) {
        this.f82932c = eVar;
        this.f82941l = new c();
        synchronized (this) {
            try {
                if (i13 <= 0) {
                    throw new IllegalArgumentException("Sample size must be >=0, not: " + i13);
                }
                int highestOneBit = Integer.highestOneBit(i13);
                this.f82944o = 0;
                this.f82941l = cVar;
                this.f82940k = -1;
                ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                this.f82933d = asReadOnlyBuffer;
                asReadOnlyBuffer.position(0);
                this.f82933d.order(ByteOrder.LITTLE_ENDIAN);
                this.f82943n = false;
                Iterator it = cVar.f82919e.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (((b) it.next()).f82910g == 3) {
                        this.f82943n = true;
                        break;
                    }
                }
                this.f82945p = highestOneBit;
                int i14 = cVar.f82920f;
                this.f82947r = i14 / highestOneBit;
                int i15 = cVar.f82921g;
                this.f82946q = i15 / highestOneBit;
                this.f82938i = this.f82932c.i(i14 * i15);
                tb.e eVar2 = this.f82932c;
                int i16 = this.f82947r * this.f82946q;
                Object obj = eVar2.f116964b;
                this.f82939j = ((i) obj) == null ? new int[i16] : (int[]) ((i) obj).c(i16, int[].class);
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final Bitmap a() {
        Boolean bool = this.f82948s;
        Bitmap h10 = ((qd.d) this.f82932c.f116963a).h(this.f82947r, this.f82946q, (bool == null || bool.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.f82949t);
        h10.setHasAlpha(true);
        return h10;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0051 A[Catch: all -> 0x0014, TryCatch #0 {all -> 0x0014, blocks: (B:4:0x0007, B:6:0x000f, B:9:0x0040, B:14:0x004a, B:16:0x0051, B:17:0x005b, B:19:0x006c, B:20:0x0078, B:23:0x0081, B:25:0x0085, B:27:0x008d, B:28:0x00a0, B:32:0x00a4, B:34:0x00a8, B:36:0x00ba, B:38:0x00be, B:39:0x00c2, B:42:0x007d, B:44:0x00c8, B:46:0x00d0, B:49:0x0017, B:51:0x001f, B:52:0x003e), top: B:3:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006c A[Catch: all -> 0x0014, TryCatch #0 {all -> 0x0014, blocks: (B:4:0x0007, B:6:0x000f, B:9:0x0040, B:14:0x004a, B:16:0x0051, B:17:0x005b, B:19:0x006c, B:20:0x0078, B:23:0x0081, B:25:0x0085, B:27:0x008d, B:28:0x00a0, B:32:0x00a4, B:34:0x00a8, B:36:0x00ba, B:38:0x00be, B:39:0x00c2, B:42:0x007d, B:44:0x00c8, B:46:0x00d0, B:49:0x0017, B:51:0x001f, B:52:0x003e), top: B:3:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0085 A[Catch: all -> 0x0014, TryCatch #0 {all -> 0x0014, blocks: (B:4:0x0007, B:6:0x000f, B:9:0x0040, B:14:0x004a, B:16:0x0051, B:17:0x005b, B:19:0x006c, B:20:0x0078, B:23:0x0081, B:25:0x0085, B:27:0x008d, B:28:0x00a0, B:32:0x00a4, B:34:0x00a8, B:36:0x00ba, B:38:0x00be, B:39:0x00c2, B:42:0x007d, B:44:0x00c8, B:46:0x00d0, B:49:0x0017, B:51:0x001f, B:52:0x003e), top: B:3:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a4 A[Catch: all -> 0x0014, TRY_ENTER, TryCatch #0 {all -> 0x0014, blocks: (B:4:0x0007, B:6:0x000f, B:9:0x0040, B:14:0x004a, B:16:0x0051, B:17:0x005b, B:19:0x006c, B:20:0x0078, B:23:0x0081, B:25:0x0085, B:27:0x008d, B:28:0x00a0, B:32:0x00a4, B:34:0x00a8, B:36:0x00ba, B:38:0x00be, B:39:0x00c2, B:42:0x007d, B:44:0x00c8, B:46:0x00d0, B:49:0x0017, B:51:0x001f, B:52:0x003e), top: B:3:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007d A[Catch: all -> 0x0014, TryCatch #0 {all -> 0x0014, blocks: (B:4:0x0007, B:6:0x000f, B:9:0x0040, B:14:0x004a, B:16:0x0051, B:17:0x005b, B:19:0x006c, B:20:0x0078, B:23:0x0081, B:25:0x0085, B:27:0x008d, B:28:0x00a0, B:32:0x00a4, B:34:0x00a8, B:36:0x00ba, B:38:0x00be, B:39:0x00c2, B:42:0x007d, B:44:0x00c8, B:46:0x00d0, B:49:0x0017, B:51:0x001f, B:52:0x003e), top: B:3:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d0 A[Catch: all -> 0x0014, TRY_LEAVE, TryCatch #0 {all -> 0x0014, blocks: (B:4:0x0007, B:6:0x000f, B:9:0x0040, B:14:0x004a, B:16:0x0051, B:17:0x005b, B:19:0x006c, B:20:0x0078, B:23:0x0081, B:25:0x0085, B:27:0x008d, B:28:0x00a0, B:32:0x00a4, B:34:0x00a8, B:36:0x00ba, B:38:0x00be, B:39:0x00c2, B:42:0x007d, B:44:0x00c8, B:46:0x00d0, B:49:0x0017, B:51:0x001f, B:52:0x003e), top: B:3:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized android.graphics.Bitmap b() {
        /*
            Method dump skipped, instructions count: 231
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ld.e.b():android.graphics.Bitmap");
    }

    public final void c(Bitmap.Config config) {
        Bitmap.Config config2;
        Bitmap.Config config3 = Bitmap.Config.ARGB_8888;
        if (config == config3 || config == (config2 = Bitmap.Config.RGB_565)) {
            this.f82949t = config;
            return;
        }
        throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + config3 + " or " + config2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0045, code lost:
    
        if (r3.f82924j == r34.f82911h) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.Bitmap d(ld.b r34, ld.b r35) {
        /*
            Method dump skipped, instructions count: 1072
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ld.e.d(ld.b, ld.b):android.graphics.Bitmap");
    }
}
