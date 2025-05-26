package oh2;

import io.embrace.android.embracesdk.internal.ndk.jni.JniDelegateImpl;
import io.embrace.android.embracesdk.internal.payload.NativeCrashData;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.collections.CollectionsKt;
import kotlin.collections.g0;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import nf2.n;
import xk2.k;

/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final n f94619a;

    /* renamed from: b, reason: collision with root package name */
    public final lh2.b f94620b;

    /* renamed from: c, reason: collision with root package name */
    public final JniDelegateImpl f94621c;

    /* renamed from: d, reason: collision with root package name */
    public final xh2.d f94622d;

    /* renamed from: e, reason: collision with root package name */
    public final ph2.a f94623e;

    /* renamed from: f, reason: collision with root package name */
    public final k f94624f;

    /* renamed from: g, reason: collision with root package name */
    public final dh2.d f94625g;

    public e(n sharedObjectLoader, lh2.b logger, JniDelegateImpl delegate, xh2.d serializer, ph2.a symbolService, k outputDir, ki2.e worker) {
        Intrinsics.checkNotNullParameter(sharedObjectLoader, "sharedObjectLoader");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        Intrinsics.checkNotNullParameter(symbolService, "symbolService");
        Intrinsics.checkNotNullParameter(outputDir, "outputDir");
        Intrinsics.checkNotNullParameter(worker, "worker");
        this.f94619a = sharedObjectLoader;
        this.f94620b = logger;
        this.f94621c = delegate;
        this.f94622d = serializer;
        this.f94623e = symbolService;
        this.f94624f = outputDir;
        this.f94625g = new dh2.d(outputDir, worker, logger, 500);
    }

    public final List a() {
        lh2.b bVar = this.f94620b;
        if (!this.f94619a.f90506b.get()) {
            return q0.f80391a;
        }
        List F0 = CollectionsKt.F0((CopyOnWriteArraySet) this.f94625g.f55025e.getValue());
        ArrayList arrayList = new ArrayList(g0.q(F0, 10));
        Iterator it = F0.iterator();
        while (it.hasNext()) {
            arrayList.add(new File((File) this.f94624f.getValue(), ((yg2.d) it.next()).f139037g));
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            File file = (File) it2.next();
            NativeCrashData nativeCrashData = null;
            try {
                JniDelegateImpl jniDelegateImpl = this.f94621c;
                String path = file.getPath();
                Intrinsics.checkNotNullExpressionValue(path, "crashFile.path");
                String crashReport = jniDelegateImpl.getCrashReport(path);
                if (crashReport != null) {
                    Object f13 = this.f94622d.f(NativeCrashData.class, crashReport);
                    ((NativeCrashData) f13).f73196e = (Map) ((ph2.b) this.f94623e).f100167e.getValue();
                    nativeCrashData = (NativeCrashData) f13;
                } else {
                    ((lh2.e) bVar).b(lh2.g.NATIVE_CRASH_LOAD_FAIL, new FileNotFoundException("Failed to load crash report at " + file.getPath()));
                }
            } catch (Throwable th3) {
                file.delete();
                ((lh2.e) bVar).b(lh2.g.NATIVE_CRASH_LOAD_FAIL, new RuntimeException("Failed to read native crash file {crashFilePath=" + file.getAbsolutePath() + "}.", th3));
            }
            if (nativeCrashData != null) {
                arrayList2.add(nativeCrashData);
            }
        }
        return arrayList2;
    }
}
