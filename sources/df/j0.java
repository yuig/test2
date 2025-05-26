package df;

import java.io.File;
import java.nio.charset.Charset;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* loaded from: classes3.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f54766a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k0 f54767b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ File f54768c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f54769d;

    public j0(long j13, k0 k0Var, File file, String str) {
        this.f54766a = j13;
        this.f54767b = k0Var;
        this.f54768c = file;
        this.f54769d = str;
    }

    public final void a() {
        k0 k0Var = this.f54767b;
        long j13 = k0Var.f54787g.get();
        long j14 = this.f54766a;
        File file = this.f54768c;
        if (j14 < j13) {
            file.delete();
            return;
        }
        File file2 = k0Var.f54783c;
        String key = this.f54769d;
        Intrinsics.checkNotNullParameter(key, "key");
        Charset charset = Charsets.UTF_8;
        if (key == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        byte[] bytes = key.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
        if (!file.renameTo(new File(file2, j1.C0("MD5", bytes)))) {
            file.delete();
        }
        ReentrantLock reentrantLock = k0Var.f54785e;
        reentrantLock.lock();
        try {
            if (!k0Var.f54784d) {
                k0Var.f54784d = true;
                le.v.d().execute(new com.airbnb.lottie.k(k0Var, 12));
            }
            Unit unit = Unit.f80348a;
            reentrantLock.unlock();
        } catch (Throwable th3) {
            reentrantLock.unlock();
            throw th3;
        }
    }
}
