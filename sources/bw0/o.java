package bw0;

import ja.y;
import java.util.HashSet;
import java.util.Iterator;
import kb.s0;
import kb.t0;
import kb.w0;
import kh2.k3;
import kotlin.jvm.internal.Intrinsics;
import lb.j0;
import xk2.v;

/* loaded from: classes5.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final j f24011a;

    /* renamed from: b, reason: collision with root package name */
    public final c f24012b;

    /* renamed from: c, reason: collision with root package name */
    public final v f24013c;

    public o(j imageUploadWorkUtils, c commonWorkUtils) {
        Intrinsics.checkNotNullParameter(imageUploadWorkUtils, "imageUploadWorkUtils");
        Intrinsics.checkNotNullParameter(commonWorkUtils, "commonWorkUtils");
        this.f24011a = imageUploadWorkUtils;
        this.f24012b = commonWorkUtils;
        this.f24013c = xk2.m.b(e.f23973k);
    }

    public static boolean c(HashSet workerTags) {
        Intrinsics.checkNotNullParameter(workerTags, "workerTags");
        return workerTags.contains("support_work");
    }

    public final kb.l a(String pageId) {
        Intrinsics.checkNotNullParameter("ADDITIONAL_IMAGE_UPLOAD_WORK", "uniqueWorkName");
        Intrinsics.checkNotNullParameter(pageId, "pageId");
        t0 b13 = b("ADDITIONAL_IMAGE_UPLOAD_WORK", pageId);
        return (b13 != null ? b13.f79031b : null) != s0.SUCCEEDED ? kb.l.f79018b : b13.f79033d;
    }

    public final t0 b(String str, String str2) {
        Object obj;
        j0 j0Var = (j0) ((w0) this.f24013c.getValue());
        Object obj2 = k3.Z(j0Var.f82607d, j0Var.f82608e, str).f106128b.get();
        Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
        Iterator it = ((Iterable) obj2).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((t0) obj).f79032c.contains(str2)) {
                break;
            }
        }
        return (t0) obj;
    }

    public final void d(q observer) {
        Intrinsics.checkNotNullParameter("ADDITIONAL_IMAGE_UPLOAD_WORK", "uniqueWorkName");
        Intrinsics.checkNotNullParameter(observer, "observer");
        Intrinsics.checkNotNullExpressionValue(wj2.c.a().b(new y(this, "ADDITIONAL_IMAGE_UPLOAD_WORK", observer, 21)), "scheduleDirect(...)");
    }
}
