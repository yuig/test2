package xn;

import androidx.camera.core.impl.j;
import com.linecorp.linesdk.LineIdToken;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: f, reason: collision with root package name */
    public static final long f135414f = TimeUnit.MINUTES.toMillis(5);

    /* renamed from: a, reason: collision with root package name */
    public final LineIdToken f135415a;

    /* renamed from: b, reason: collision with root package name */
    public final String f135416b;

    /* renamed from: c, reason: collision with root package name */
    public final String f135417c;

    /* renamed from: d, reason: collision with root package name */
    public final String f135418d;

    /* renamed from: e, reason: collision with root package name */
    public final String f135419e;

    public b(j jVar) {
        this.f135415a = (LineIdToken) jVar.f16875b;
        this.f135416b = (String) jVar.f16876c;
        this.f135417c = (String) jVar.f16877d;
        this.f135418d = (String) jVar.f16878e;
        this.f135419e = (String) jVar.f16879f;
    }

    public static void a(String str, String str2, String str3) {
        throw new RuntimeException(str3 + " expected: " + ((Object) str) + ", but received: " + ((Object) str2));
    }
}
