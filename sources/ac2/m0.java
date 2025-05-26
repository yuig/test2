package ac2;

import android.net.Uri;
import android.os.Build;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import gk2.f2;
import gk2.k2;
import gk2.x1;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes2.dex */
public abstract class m0 {

    /* renamed from: a, reason: collision with root package name */
    public static final a7.f f1992a;

    /* renamed from: b, reason: collision with root package name */
    public static final a7.f f1993b;

    /* renamed from: c, reason: collision with root package name */
    public static final a7.f f1994c;

    /* renamed from: d, reason: collision with root package name */
    public static final a7.f f1995d;

    static {
        a7.f fVar = new a7.f(4, RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER, 3, 3, 0);
        Intrinsics.checkNotNullExpressionValue(fVar, "build(...)");
        f1992a = fVar;
        a7.f fVar2 = new a7.f(3, RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER, 1, 2, 0);
        Intrinsics.checkNotNullExpressionValue(fVar2, "build(...)");
        f1993b = fVar2;
        a7.f fVar3 = new a7.f(0, 0, 1, 3, 0);
        Intrinsics.checkNotNullExpressionValue(fVar3, "build(...)");
        f1994c = fVar3;
        a7.f fVar4 = new a7.f(0, 0, 1, 1, 0);
        Intrinsics.checkNotNullExpressionValue(fVar4, "build(...)");
        f1995d = fVar4;
    }

    public static final void a(a7.v0 v0Var, a7.i0... mediaItems) {
        Intrinsics.checkNotNullParameter(v0Var, "<this>");
        Intrinsics.checkNotNullParameter(mediaItems, "mediaItems");
        d(v0Var, (a7.i0[]) Arrays.copyOf(mediaItems, mediaItems.length));
        v0Var.b();
    }

    public static final String b(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        try {
            String substring = url.substring(StringsKt.M(url, '/', 0, 6) + 1, StringsKt.M(url, '.', 0, 6));
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            if (kotlin.text.z.j(substring)) {
                return null;
            }
            return substring;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static xj2.c c(a7.v0 v0Var, Function2 onInit, Function2 onPoll, Function2 onError, m60.b0 backgroundStateDetector, long j13, int i13) {
        uj2.h k1Var;
        long j14 = (i13 & 16) != 0 ? 1000L : j13;
        TimeUnit pollTimeUnit = TimeUnit.MILLISECONDS;
        Intrinsics.checkNotNullParameter(v0Var, "<this>");
        Intrinsics.checkNotNullParameter(onInit, "onInit");
        Intrinsics.checkNotNullParameter(onPoll, "onPoll");
        Intrinsics.checkNotNullParameter(onError, "onError");
        Intrinsics.checkNotNullParameter(backgroundStateDetector, "backgroundStateDetector");
        Intrinsics.checkNotNullParameter(pollTimeUnit, "pollTimeUnit");
        if (Intrinsics.d("robolectric", Build.FINGERPRINT)) {
            return bk2.c.DISPOSED;
        }
        uj2.a0 a13 = wj2.c.a();
        int i14 = 0;
        uj2.h N = new jk2.j1(backgroundStateDetector.a().o(), new r42.k(8, g0.f1957k), 0).N(uj2.a.LATEST);
        Intrinsics.checkNotNullExpressionValue(N, "toFlowable(...)");
        com.google.firebase.messaging.a0 a0Var = new com.google.firebase.messaging.a0(v0Var, 28);
        uj2.a aVar = uj2.a.BUFFER;
        ck2.i.b(aVar, "mode is null");
        gk2.k1 i15 = new gk2.r(a0Var, aVar).n(a13).i(a13);
        ck2.e eVar = ck2.i.f27921a;
        re2.h hVar = ck2.i.f27927g;
        gk2.f1 f1Var = new gk2.f1(new gk2.f1(new gk2.y(new gk2.y(i15, eVar, hVar, i14), new u20.c(6, l0.f1989i), N, 1), new dl1.b0(12, g0.f1958l), 2), new r42.k(9, g0.f1959m), i14);
        Intrinsics.checkNotNullExpressionValue(f1Var, "map(...)");
        gk2.y yVar = new gk2.y(f1Var, eVar, hVar, i14);
        r42.k kVar = new r42.k(10, new h0(0L, j14, pollTimeUnit));
        int i16 = uj2.h.f122339a;
        ck2.i.c(i16, "bufferSize");
        if (yVar instanceof dk2.g) {
            Object call = ((dk2.g) yVar).call();
            k1Var = call == null ? gk2.g0.f65416b : new k2(kVar, call);
        } else {
            k1Var = new gk2.k1(i16, yVar, kVar);
        }
        gk2.k1 i17 = k1Var.i(a13);
        pn.a aVar2 = new pn.a();
        gk2.b0 b0Var = new gk2.b0(i17, new gk2.y0(aVar2, 1), new gk2.y0(aVar2, 0), new ck2.g(aVar2, 1));
        int i18 = uj2.h.f122339a;
        ck2.i.c(i18, "bufferSize");
        new AtomicReference();
        xj2.c j15 = new gk2.b0(new gk2.f1(new pn.b(new f2(new x1(b0Var, i18)), aVar2), new r42.k(11, new e82.l(v0Var, 5)), i14), new i0(onInit), ck2.i.f27924d, ck2.i.f27923c).j(new e82.o(5, new j0(0, onPoll)), new e82.o(6, new j0(1, onError)));
        Intrinsics.checkNotNullExpressionValue(j15, "subscribe(...)");
        return j15;
    }

    public static final void d(a7.v0 v0Var, a7.i0... mediaItems) {
        a7.d0 d0Var;
        Intrinsics.checkNotNullParameter(v0Var, "<this>");
        Intrinsics.checkNotNullParameter(mediaItems, "mediaItems");
        if (mediaItems.length == 1) {
            a7.i0 i13 = v0Var.i();
            Uri uri = (i13 == null || (d0Var = i13.f1073b) == null) ? null : d0Var.f969a;
            a7.d0 d0Var2 = mediaItems[0].f1073b;
            if (Intrinsics.d(uri, d0Var2 != null ? d0Var2.f969a : null)) {
                a7.i0 i14 = v0Var.i();
                if (Intrinsics.d(i14 != null ? i14.f1076e : null, mediaItems[0].f1076e)) {
                    String msg = "setMediaItemsIfChangeAndNotLoading, not changing media item, player: " + v0Var;
                    Object[] args = new Object[0];
                    Intrinsics.checkNotNullParameter("ExoPlayer", "tag");
                    Intrinsics.checkNotNullParameter(msg, "msg");
                    Intrinsics.checkNotNullParameter(args, "args");
                    return;
                }
            }
        }
        String msg2 = "setMediaItemsIfChangeAndNotLoading, changing media item, player: " + v0Var;
        Object[] args2 = new Object[0];
        Intrinsics.checkNotNullParameter("ExoPlayer", "tag");
        Intrinsics.checkNotNullParameter(msg2, "msg");
        Intrinsics.checkNotNullParameter(args2, "args");
        v0Var.W(kotlin.collections.c0.e0(mediaItems));
    }
}
