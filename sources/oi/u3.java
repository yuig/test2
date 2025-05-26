package oi;

import java.math.BigInteger;
import java.util.List;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class u3 extends k2 {

    /* renamed from: c, reason: collision with root package name */
    public String f95183c;

    /* renamed from: d, reason: collision with root package name */
    public String f95184d;

    /* renamed from: e, reason: collision with root package name */
    public int f95185e;

    /* renamed from: f, reason: collision with root package name */
    public String f95186f;

    /* renamed from: g, reason: collision with root package name */
    public long f95187g;

    /* renamed from: h, reason: collision with root package name */
    public long f95188h;

    /* renamed from: i, reason: collision with root package name */
    public List f95189i;

    /* renamed from: j, reason: collision with root package name */
    public String f95190j;

    /* renamed from: k, reason: collision with root package name */
    public int f95191k;

    /* renamed from: l, reason: collision with root package name */
    public String f95192l;

    /* renamed from: m, reason: collision with root package name */
    public String f95193m;

    /* renamed from: n, reason: collision with root package name */
    public String f95194n;

    /* renamed from: o, reason: collision with root package name */
    public long f95195o;

    /* renamed from: p, reason: collision with root package name */
    public String f95196p;

    public final String A() {
        p();
        w();
        com.bumptech.glide.d.t(this.f95192l);
        return this.f95192l;
    }

    public final void B() {
        String format;
        p();
        if (n().y().e(f5.ANALYTICS_STORAGE)) {
            byte[] bArr = new byte[16];
            o().B0().nextBytes(bArr);
            format = String.format(Locale.US, "%032x", new BigInteger(1, bArr));
        } else {
            zzj().f95275m.c("Analytics Storage consent is not granted");
            format = null;
        }
        zzj().f95275m.c("Resetting session stitching token to ".concat(format == null ? "null" : "not null"));
        this.f95194n = format;
        ((oh.b) zzb()).getClass();
        this.f95195o = System.currentTimeMillis();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x018c A[Catch: IllegalStateException -> 0x01b9, TryCatch #5 {IllegalStateException -> 0x01b9, blocks: (B:19:0x0152, B:22:0x0170, B:25:0x017c, B:28:0x0184, B:30:0x018c, B:33:0x01a8, B:36:0x01b6, B:38:0x01b2, B:41:0x01a4, B:43:0x01bd, B:45:0x01cf, B:46:0x01d4, B:48:0x01d2, B:86:0x0178, B:89:0x016c), top: B:18:0x0152 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01bd A[Catch: IllegalStateException -> 0x01b9, TryCatch #5 {IllegalStateException -> 0x01b9, blocks: (B:19:0x0152, B:22:0x0170, B:25:0x017c, B:28:0x0184, B:30:0x018c, B:33:0x01a8, B:36:0x01b6, B:38:0x01b2, B:41:0x01a4, B:43:0x01bd, B:45:0x01cf, B:46:0x01d4, B:48:0x01d2, B:86:0x0178, B:89:0x016c), top: B:18:0x0152 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x021a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0178 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x016c A[Catch: IllegalStateException -> 0x01b9, TryCatch #5 {IllegalStateException -> 0x01b9, blocks: (B:19:0x0152, B:22:0x0170, B:25:0x017c, B:28:0x0184, B:30:0x018c, B:33:0x01a8, B:36:0x01b6, B:38:0x01b2, B:41:0x01a4, B:43:0x01bd, B:45:0x01cf, B:46:0x01d4, B:48:0x01d2, B:86:0x0178, B:89:0x016c), top: B:18:0x0152 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x011c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void C() {
        /*
            Method dump skipped, instructions count: 664
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: oi.u3.C():void");
    }

    @Override // oi.k2
    public final boolean y() {
        return true;
    }

    public final String z() {
        w();
        com.bumptech.glide.d.t(this.f95183c);
        return this.f95183c;
    }
}
