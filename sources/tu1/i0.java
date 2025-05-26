package tu1;

import android.content.Context;
import com.google.android.gms.net.PlayServicesCronetProvider;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;
import org.chromium.net.CronetEngine;
import org.chromium.net.DnsOptions;
import org.chromium.net.impl.NativeCronetProvider;

/* loaded from: classes2.dex */
public final class i0 implements f {

    /* renamed from: a, reason: collision with root package name */
    public final Context f119390a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f119391b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f119392c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f119393d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f119394e;

    public i0(Context context, boolean z13, boolean z14, boolean z15, boolean z16) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f119390a = context;
        this.f119391b = z13;
        this.f119392c = z14;
        this.f119393d = z15;
        this.f119394e = z16;
    }

    @Override // tu1.f
    public final CronetEngine a() {
        boolean z13 = this.f119391b;
        Context context = this.f119390a;
        if (z13) {
            CronetEngine build = new PlayServicesCronetProvider(context).createBuilder().enableHttp2(true).enableQuic(true).build();
            Intrinsics.f(build);
            return build;
        }
        CronetEngine.Builder createBuilder = new NativeCronetProvider(context).createBuilder();
        createBuilder.enableHttp2(true);
        createBuilder.enableQuic(true);
        if (this.f119394e) {
            createBuilder.setThreadPriority(-1);
        }
        if (this.f119392c) {
            createBuilder.enableBrotli(true);
        }
        if (this.f119393d) {
            lb0.e eVar = lb0.e.CACHE_FOLDER_OTHER;
            Context context2 = kb0.a.f79058b;
            File file = new File(m60.f0.X().getCacheDir(), eVar.getValue());
            if (!file.exists()) {
                file.mkdir();
            }
            File file2 = new File(file.getPath(), "dnscache");
            if (!file2.exists() || !file2.isDirectory()) {
                file2.delete();
                file2.mkdirs();
            }
            createBuilder.setStoragePath(file2.getAbsolutePath());
            createBuilder.setDnsOptions(DnsOptions.builder().persistHostCache(true).build());
        }
        CronetEngine build2 = createBuilder.build();
        Intrinsics.f(build2);
        return build2;
    }
}
