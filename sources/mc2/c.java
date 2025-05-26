package mc2;

import androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException;
import g8.a0;
import g8.v;
import java.io.IOException;
import k8.q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.z;
import l8.p;
import lh0.a4;
import lh0.g1;
import lh0.k4;
import lh0.z3;

/* loaded from: classes2.dex */
public final class c extends a10.e {

    /* renamed from: b, reason: collision with root package name */
    public final a f86914b;

    /* renamed from: c, reason: collision with root package name */
    public final q f86915c;

    /* renamed from: d, reason: collision with root package name */
    public final k4 f86916d;

    public c(a aVar, q qVar, k4 experiments) {
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        this.f86914b = aVar;
        this.f86915c = qVar;
        this.f86916d = experiments;
    }

    @Override // a10.e
    public final void D(k0.a loadErrorInfo) {
        Intrinsics.checkNotNullParameter(loadErrorInfo, "loadErrorInfo");
        IOException iOException = (IOException) loadErrorInfo.f77780d;
        String msg = "onChunkLoadError, exception: " + iOException + ", cause: " + iOException.getCause() + ", trackType: " + ((a0) loadErrorInfo.f77779c).f64180b + ", uri: " + ((v) loadErrorInfo.f77778b).f64441a;
        Object[] args = new Object[0];
        Intrinsics.checkNotNullParameter("PinterestLoadErrorHandlingPolicy", "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        Intrinsics.checkNotNullParameter(args, "args");
        if (((a0) loadErrorInfo.f77779c).f64180b != 1) {
            return;
        }
        IOException exception = (IOException) loadErrorInfo.f77780d;
        Intrinsics.checkNotNullExpressionValue(exception, "exception");
        if (exception instanceof HttpDataSource$InvalidResponseCodeException) {
            int i13 = ((HttpDataSource$InvalidResponseCodeException) exception).f18780d;
            if (i13 == 403 || i13 == 404) {
                String uri = ((v) loadErrorInfo.f77778b).f64441a.toString();
                Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
                String videoSignature = null;
                try {
                    String substring = uri.substring(StringsKt.M(uri, '/', 0, 6) + 1, StringsKt.M(uri, '_', 0, 6));
                    Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                    if (!z.j(substring)) {
                        videoSignature = substring;
                    }
                } catch (Throwable th3) {
                    String msg2 = "unable to parse video signature, " + th3;
                    Object[] args2 = new Object[0];
                    Intrinsics.checkNotNullParameter("PinterestLoadErrorHandlingPolicy", "tag");
                    Intrinsics.checkNotNullParameter(msg2, "msg");
                    Intrinsics.checkNotNullParameter(args2, "args");
                }
                if (videoSignature != null) {
                    a aVar = this.f86914b;
                    if (aVar != null) {
                        Intrinsics.checkNotNullParameter(videoSignature, "videoSignature");
                        h hVar = aVar.f86910d;
                        synchronized (hVar) {
                            Intrinsics.checkNotNullParameter(videoSignature, "videoSignature");
                            hVar.f86934b.add(videoSignature);
                        }
                        aVar.c();
                    }
                    q qVar = this.f86915c;
                    if (qVar != null) {
                        q.f78565k.put(videoSignature, Boolean.TRUE);
                        qVar.c();
                    }
                }
            }
        }
    }

    @Override // a10.e
    public final l8.q v(p fallbackOptions, k0.a loadErrorInfo) {
        Intrinsics.checkNotNullParameter(fallbackOptions, "fallbackOptions");
        Intrinsics.checkNotNullParameter(loadErrorInfo, "loadErrorInfo");
        boolean a13 = fallbackOptions.a(1);
        k4 k4Var = this.f86916d;
        if (a13) {
            k4Var.getClass();
            z3 z3Var = a4.f83298b;
            g1 g1Var = (g1) k4Var.f83410a;
            if (g1Var.o("android_video_dash_load_error_fallback", "enabled", z3Var) || g1Var.l("android_video_dash_load_error_fallback")) {
                return new l8.q(1, 0L);
            }
        }
        if (fallbackOptions.a(2)) {
            k4Var.getClass();
            z3 z3Var2 = a4.f83298b;
            g1 g1Var2 = (g1) k4Var.f83410a;
            if (g1Var2.o("android_video_dash_load_error_fallback", "enabled", z3Var2) || g1Var2.l("android_video_dash_load_error_fallback")) {
                return new l8.q(2, 0L);
            }
        }
        return super.v(fallbackOptions, loadErrorInfo);
    }
}
