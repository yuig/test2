package ads_mobile_sdk;

import a6.i;
import ao2.j0;
import java.io.File;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class v50 extends xc0 {

    /* renamed from: b, reason: collision with root package name */
    public final File f12352b;

    /* renamed from: c, reason: collision with root package name */
    public final j0 f12353c;

    /* renamed from: d, reason: collision with root package name */
    public final a6.h f12354d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v50(File targetFile, a6.l serializer, b6.a corruptionHandler, ExecutorService executorService) {
        super(targetFile);
        Intrinsics.checkNotNullParameter(targetFile, "targetFile");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        Intrinsics.checkNotNullParameter(corruptionHandler, "corruptionHandler");
        Intrinsics.checkNotNullParameter(executorService, "executorService");
        this.f12352b = targetFile;
        ho2.c b13 = dl2.b.b(new ao2.i1(executorService).plus(ue.c.b()));
        this.f12353c = b13;
        this.f12354d = i.b(serializer, corruptionHandler, b13, new r50(this), 4);
    }
}
