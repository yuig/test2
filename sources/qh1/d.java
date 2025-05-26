package qh1;

import android.graphics.Bitmap;
import kk2.h;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.j0;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.RequestBody$Companion$toRequestBody$2;
import we1.n1;
import z9.n;

/* loaded from: classes5.dex */
public final class d extends hb0.d {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f103895h = 0;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f103896d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Bitmap f103897e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e f103898f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Function1 f103899g;

    public d(Bitmap bitmap, e eVar, n nVar) {
        this.f103897e = bitmap;
        this.f103898f = eVar;
        this.f103899g = nVar;
    }

    @Override // hb0.c
    public final void c() {
        Bitmap bitmap = this.f103897e;
        this.f103896d = qb0.b.a(90, bitmap);
        bitmap.recycle();
    }

    @Override // hb0.d
    public final void e() {
        j0 j0Var = new j0();
        byte[] bArr = this.f103896d;
        if (bArr == null) {
            return;
        }
        MultipartBody.Part.Companion companion = MultipartBody.Part.f95670c;
        RequestBody.Companion companion2 = RequestBody.f95711a;
        MediaType.f95651d.getClass();
        RequestBody$Companion$toRequestBody$2 e13 = RequestBody.Companion.e(companion2, bArr, MediaType.Companion.b("image/jpg"), 6);
        companion.getClass();
        MultipartBody.Part b13 = MultipartBody.Part.Companion.b("image", "myphoto.jpg", e13);
        e eVar = this.f103898f;
        j0Var.f80434a = new h(eVar.f103905f.g(b13).r(tk2.e.f118017c).l(wj2.c.a()), new g51.h(j0Var, 14), 1).o(new oh1.a(21, new t90.n(29, this.f103899g)), new oh1.a(22, new n1(eVar, 26)));
    }
}
