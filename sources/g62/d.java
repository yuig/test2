package g62;

import android.content.Context;
import kd2.i;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j;
import lh0.a4;
import lh0.g1;
import lh0.k0;
import lh0.z3;
import tb0.h;
import x72.e;

/* loaded from: classes2.dex */
public final class d implements t62.b {

    /* renamed from: a, reason: collision with root package name */
    public final k0 f63741a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f63742b;

    public d(k0 collagesLibraryExperiments, Context context, h crashReporting) {
        Intrinsics.checkNotNullParameter(collagesLibraryExperiments, "collagesLibraryExperiments");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(crashReporting, "crashReporting");
        this.f63741a = collagesLibraryExperiments;
        this.f63742b = context;
        Intrinsics.checkNotNullParameter(context, "context");
        if (i.f79272h != null) {
            throw new IllegalStateException("XRenderer app can only be initialized once".toString());
        }
        Intrinsics.checkNotNullParameter(context, "context");
        i iVar = new i();
        j.z(iVar.f79274b, null, null, new kd2.c(context, iVar, null), 3);
        i.f79272h = iVar;
    }

    public final e a() {
        k0 k0Var = this.f63741a;
        k0Var.getClass();
        z3 z3Var = a4.f83298b;
        g1 g1Var = (g1) k0Var.f83401a;
        return (g1Var.o("android_collages_xrenderer", "enabled", z3Var) || g1Var.l("android_collages_xrenderer")) ? b() : e.LEGACY;
    }

    public final e b() {
        if (this.f63742b.getPackageManager().hasSystemFeature("android.hardware.vulkan.version", 4206592)) {
            k0 k0Var = this.f63741a;
            k0Var.getClass();
            z3 z3Var = a4.f83298b;
            g1 g1Var = (g1) k0Var.f83401a;
            if (g1Var.o("android_collages_xrenderer_vulkan", "enabled", z3Var) || g1Var.l("android_collages_xrenderer_vulkan")) {
                return e.XRENDERER_VULKAN;
            }
        }
        return e.XRENDERER_GLES;
    }
}
