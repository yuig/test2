package oi;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Size;
import com.google.android.gms.measurement.internal.zzbb;
import com.pinterest.xrenderer.RustBridge$Renderer;
import com.pinterest.xrenderer.RustBridge$Scene;
import com.pinterest.xrenderer.RustBridge$Surface;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f94956a = 1;

    /* renamed from: b, reason: collision with root package name */
    public long f94957b;

    /* renamed from: c, reason: collision with root package name */
    public long f94958c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f94959d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f94960e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f94961f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f94962g;

    public n(u4 u4Var, String str, String str2, String str3, long j13, Bundle bundle) {
        zzbb zzbbVar;
        com.bumptech.glide.d.o(str2);
        com.bumptech.glide.d.o(str3);
        this.f94959d = str2;
        this.f94960e = str3;
        this.f94961f = TextUtils.isEmpty(str) ? null : str;
        this.f94957b = j13;
        this.f94958c = 0L;
        if (bundle.isEmpty()) {
            zzbbVar = new zzbb(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    y3 y3Var = u4Var.f95205i;
                    u4.d(y3Var);
                    y3Var.f95268f.c("Param name can't be null");
                    it.remove();
                } else {
                    f7 f7Var = u4Var.f95208l;
                    u4.c(f7Var);
                    Object h03 = f7Var.h0(bundle2.get(next), next);
                    if (h03 == null) {
                        y3 y3Var2 = u4Var.f95205i;
                        u4.d(y3Var2);
                        y3Var2.f95271i.b(u4Var.f95209m.f(next), "Param value can't be null");
                        it.remove();
                    } else {
                        f7 f7Var2 = u4Var.f95208l;
                        u4.c(f7Var2);
                        f7Var2.H(bundle2, next, h03);
                    }
                }
            }
            zzbbVar = new zzbb(bundle2);
        }
        this.f94962g = zzbbVar;
    }

    public final n a(u4 u4Var, long j13) {
        return new n(u4Var, (String) this.f94961f, (String) this.f94959d, (String) this.f94960e, this.f94957b, j13, (zzbb) this.f94962g);
    }

    public final String toString() {
        switch (this.f94956a) {
            case 0:
                String str = (String) this.f94959d;
                String str2 = (String) this.f94960e;
                return a.a.p(a.a.w("Event{appId='", str, "', name='", str2, "', params="), String.valueOf((zzbb) this.f94962g), "}");
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public n(ie2.d target, ke2.c scene, me2.c backend) {
        long init;
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(scene, "scene");
        Intrinsics.checkNotNullParameter(backend, "backend");
        this.f94959d = target;
        this.f94960e = scene;
        this.f94961f = backend;
        this.f94962g = new ke2.f(scene);
        Size b03 = ph.a.b0(target);
        boolean O = ao2.m0.O(backend);
        if (O) {
            init = ao2.m0.M().f79276d;
        } else if (!O) {
            init = RustBridge$Renderer.f52861a.init(backend.getValue(), false);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        this.f94957b = init;
        if (init != 0) {
            if (target instanceof ie2.e) {
                long createSurface = RustBridge$Renderer.f52861a.createSurface(init, ((ie2.e) target).f72217b);
                if (createSurface != 0) {
                    this.f94958c = createSurface;
                    RustBridge$Surface.f52864a.resize(createSurface, b03.getWidth(), b03.getHeight());
                } else {
                    throw new IllegalStateException("Surface creation failed".toString());
                }
            }
            long createScene = RustBridge$Renderer.f52861a.createScene(this.f94957b, b03.getWidth(), b03.getHeight());
            ke2.f fVar = (ke2.f) this.f94962g;
            synchronized (fVar.f79325b) {
                fVar.f79327d = createScene;
                fVar.f79326c = true;
                Unit unit = Unit.f80348a;
            }
            int width = b03.getWidth();
            int height = b03.getHeight();
            if (fVar.a() && width > 0 && height > 0) {
                RustBridge$Scene.f52862a.resize(fVar.f79327d, width, height);
            }
            fVar.d();
            return;
        }
        throw new IllegalStateException(("Renderer initialization failed for " + backend + '.').toString());
    }

    public n(u4 u4Var, String str, String str2, String str3, long j13, long j14, zzbb zzbbVar) {
        com.bumptech.glide.d.o(str2);
        com.bumptech.glide.d.o(str3);
        com.bumptech.glide.d.t(zzbbVar);
        this.f94959d = str2;
        this.f94960e = str3;
        this.f94961f = TextUtils.isEmpty(str) ? null : str;
        this.f94957b = j13;
        this.f94958c = j14;
        if (j14 != 0 && j14 > j13) {
            y3 y3Var = u4Var.f95205i;
            u4.d(y3Var);
            y3Var.f95271i.a(y3.v(str2), y3.v(str3), "Event created with reverse previous/current timestamps. appId, name");
        }
        this.f94962g = zzbbVar;
    }
}
