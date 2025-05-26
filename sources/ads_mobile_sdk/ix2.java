package ads_mobile_sdk;

import a.q2;
import android.content.Context;
import ao2.j0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class ix2 implements q2 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f6573a;

    /* renamed from: b, reason: collision with root package name */
    public final String f6574b;

    /* renamed from: c, reason: collision with root package name */
    public final eg0 f6575c;

    /* renamed from: d, reason: collision with root package name */
    public j0 f6576d;

    /* renamed from: e, reason: collision with root package name */
    public sb2 f6577e;

    /* renamed from: f, reason: collision with root package name */
    public final mo2.a f6578f;

    /* renamed from: g, reason: collision with root package name */
    public String f6579g;

    public ix2(Context context, String afmaVersion, eg0 flagDataStore) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(afmaVersion, "afmaVersion");
        Intrinsics.checkNotNullParameter(flagDataStore, "flagDataStore");
        this.f6573a = context;
        this.f6574b = afmaVersion;
        this.f6575c = flagDataStore;
        this.f6578f = mo2.d.a();
    }

    @Override // a.q2
    public final Object a(dl2.d dVar) {
        return a(this, dVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f9 A[Catch: all -> 0x0127, TRY_LEAVE, TryCatch #0 {all -> 0x0127, blocks: (B:31:0x00ea, B:33:0x00f9, B:36:0x0103), top: B:30:0x00ea }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0103 A[Catch: all -> 0x0127, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0127, blocks: (B:31:0x00ea, B:33:0x00f9, B:36:0x0103), top: B:30:0x00ea }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a9 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00af A[Catch: all -> 0x012a, TRY_ENTER, TryCatch #3 {all -> 0x012a, blocks: (B:46:0x00a5, B:50:0x00af, B:52:0x00b3, B:56:0x012e, B:57:0x0133), top: B:45:0x00a5 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0091 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r11v17, types: [mo2.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object a(ads_mobile_sdk.ix2 r11, bl2.c r12) {
        /*
            Method dump skipped, instructions count: 321
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.ix2.a(ads_mobile_sdk.ix2, bl2.c):java.lang.Object");
    }

    public final String a(String str) {
        String l13 = a.a.l(str, " (Mobile; ", this.f6574b, ")");
        this.f6579g = l13;
        return l13;
    }
}
