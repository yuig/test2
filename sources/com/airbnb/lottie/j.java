package com.airbnb.lottie;

import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import com.pinterest.api.model.PinnableImage;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.v7;
import i01.p0;
import i32.y0;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.zip.ZipInputStream;
import kh2.g3;
import kotlin.jvm.internal.Intrinsics;
import x02.d2;

/* loaded from: classes3.dex */
public final /* synthetic */ class j implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28416a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f28417b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f28418c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f28419d;

    public /* synthetic */ j(Object obj, Object obj2, Object obj3, int i13) {
        this.f28416a = i13;
        this.f28417b = obj;
        this.f28418c = obj2;
        this.f28419d = obj3;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i13 = this.f28416a;
        boolean z13 = true;
        Object obj = this.f28418c;
        Object obj2 = this.f28419d;
        Object obj3 = this.f28417b;
        switch (i13) {
            case 0:
                return n.h((Context) obj3, (ZipInputStream) obj, (String) obj2);
            case 1:
                tl.f fVar = (tl.f) obj3;
                fVar.getClass();
                return fVar.f118042a.submit(new androidx.media3.ui.z(23, (Callable) obj, (ll.j) obj2));
            case 2:
                fe0.b this$0 = (fe0.b) obj3;
                String ideaPinPageId = (String) obj2;
                ex0.g status = (ex0.g) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(ideaPinPageId, "$ideaPinPageId");
                Intrinsics.checkNotNullParameter(status, "$status");
                ce0.a aVar = this$0.f62039a;
                aVar.getClass();
                Intrinsics.checkNotNullParameter(ideaPinPageId, "ideaPinPageId");
                Intrinsics.checkNotNullParameter(status, "status");
                ja.d0 d0Var = aVar.f27584a;
                d0Var.b();
                zd0.b bVar = aVar.f27589f;
                oa.i a13 = bVar.a();
                aVar.f27588e.getClass();
                a13.c1(1, xa0.j.o(status));
                a13.c1(2, ideaPinPageId);
                try {
                    d0Var.c();
                    try {
                        int G = a13.G();
                        d0Var.r();
                        bVar.j(a13);
                        return Integer.valueOf(G);
                    } finally {
                        d0Var.m();
                    }
                } catch (Throwable th3) {
                    bVar.j(a13);
                    throw th3;
                }
            case 3:
                p0 this$02 = (p0) obj3;
                f30 pin = (f30) obj;
                v7 board = (v7) obj2;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                Intrinsics.checkNotNullParameter(pin, "$pin");
                Intrinsics.checkNotNullParameter(board, "$board");
                rg0.n c13 = ((dh0.d) this$02.f70688b).c(y0.ANDROID_PIN_CLOSEUP_AFTER_SAVE);
                Integer valueOf = c13 != null ? Integer.valueOf(c13.f108060b) : null;
                int value = i32.l.ANDROID_POST_REPIN_BOARD_UPSELL.getValue();
                if (valueOf == null || valueOf.intValue() != value) {
                    int value2 = i32.l.ANDROID_POST_REPIN_BOARD_UPSELL_POST_CREATE.getValue();
                    if (valueOf == null || valueOf.intValue() != value2) {
                        z13 = false;
                        return Boolean.valueOf(z13);
                    }
                }
                this$02.f70687a.d(new jc0.v(new zp.b0(pin, board, c13), false, 0L, 28));
                return Boolean.valueOf(z13);
            case 4:
                k11.d dVar = (k11.d) obj3;
                dVar.getClass();
                Uri uri = ((PinnableImage) obj).f35571h;
                String str = ((d2) obj2).f131339t;
                if (str != null) {
                    int length = str.length();
                    int i14 = 0;
                    while (true) {
                        if (i14 < length) {
                            int codePointAt = str.codePointAt(i14);
                            if (Character.isWhitespace(codePointAt)) {
                                i14 += Character.charCount(codePointAt);
                            } else {
                                z13 = false;
                            }
                        }
                    }
                }
                String N3 = ((k11.e) dVar.f78120a.get()).N3(uri, null, z13);
                if (pk.a0.x0(N3)) {
                    throw new IOException(a.c.g("Failed to decode image uri: ", uri));
                }
                return N3;
            case 5:
                Application application = (Application) obj3;
                u21.o this$03 = (u21.o) obj;
                Bitmap bitmap = (Bitmap) obj2;
                Intrinsics.checkNotNullParameter(application, "$application");
                Intrinsics.checkNotNullParameter(this$03, "this$0");
                Intrinsics.checkNotNullParameter(bitmap, "$bitmap");
                File dir = application.getDir("pin_or_spin_images", 0);
                this$03.getClass();
                Uri fromFile = Uri.fromFile(qb0.b.q(bitmap, "pin_or_spin_reward_" + System.currentTimeMillis(), dir));
                PinnableImage pinnableImage = new PinnableImage();
                pinnableImage.f35575l = false;
                pinnableImage.f35571h = fromFile;
                pinnableImage.f35567d = "";
                pinnableImage.f35568e = "";
                pinnableImage.f35570g = null;
                pinnableImage.f35565b = bitmap.getWidth();
                pinnableImage.f35566c = bitmap.getHeight();
                return pinnableImage;
            default:
                gg2.h hVar = (gg2.h) obj3;
                Boolean bool = (Boolean) obj;
                String E = g3.E(hVar.f64989b, (String) obj2, hVar.f64988a.f138999d);
                if (bool != null) {
                    uh2.a.d(((uh2.a) hVar.f64991d).f122252a, "io.embrace.jsbundle.id", E);
                }
                return E;
        }
    }

    public /* synthetic */ j(Object obj, Object obj2, String str, int i13) {
        this.f28416a = i13;
        this.f28417b = obj;
        this.f28419d = str;
        this.f28418c = obj2;
    }
}
