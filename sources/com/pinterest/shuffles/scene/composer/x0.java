package com.pinterest.shuffles.scene.composer;

import android.util.Size;
import android.view.TextureView;
import ao2.o1;
import java.util.concurrent.CancellationException;
import kh2.g3;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import r72.a2;
import r72.z1;

/* loaded from: classes4.dex */
public final class x0 extends f {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f52169h = 0;

    /* renamed from: b, reason: collision with root package name */
    public final x72.j f52170b;

    /* renamed from: c, reason: collision with root package name */
    public final ao2.j0 f52171c;

    /* renamed from: d, reason: collision with root package name */
    public o1 f52172d;

    /* renamed from: e, reason: collision with root package name */
    public final t0 f52173e;

    /* renamed from: f, reason: collision with root package name */
    public final float f52174f;

    /* renamed from: g, reason: collision with root package name */
    public u0 f52175g;

    static {
        String tag = (true && true) ? "shuffle-canvas" : null;
        Intrinsics.checkNotNullParameter(tag, "tag");
    }

    public x0(x72.j sceneView, androidx.lifecycle.u coroutineScope) {
        Intrinsics.checkNotNullParameter(sceneView, "sceneView");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f52170b = sceneView;
        this.f52171c = coroutineScope;
        this.f52173e = t0.CENTER;
        this.f52174f = 0.1f;
        this.f52175g = u0.CENTER_INSIDE;
    }

    @Override // com.pinterest.shuffles.scene.composer.f
    public final ke2.b a(z1 item, float f13) {
        Intrinsics.checkNotNullParameter(item, "item");
        int i13 = z.f52181a;
        return new ke2.b(z.d(d(), 0.0d, 0.0d), f13, new hd2.a((-item.d()) / 6.283185307179586d), pp2.a.s(item.a()), 16);
    }

    @Override // com.pinterest.shuffles.scene.composer.f
    public final Size d() {
        x72.j jVar = this.f52170b;
        return new Size(jVar.a().getWidth(), jVar.a().getHeight());
    }

    public final void g(ke2.d dVar, float f13) {
        Size a13 = this.f52170b.a();
        float f14 = 1 - (2 * f13);
        float height = a13.getHeight() * f14;
        float b13 = dVar.f79319a.b() / (a13.getWidth() * f14);
        ke2.i iVar = dVar.f79319a;
        iVar.d(iVar.a() / Math.max(b13, iVar.a() / height));
    }

    public final void h(z1 z1Var) {
        o1 o1Var = this.f52172d;
        if (o1Var != null) {
            o1Var.cancel((CancellationException) null);
        }
        x72.j jVar = this.f52170b;
        if (z1Var == null) {
            jVar.getF52894a().f79314f.clear();
        } else {
            TextureView k13 = jVar.k();
            q5.x.a(k13, new s.f(k13, this, z1Var, 26, 0));
        }
    }

    public final void i(z1 newItem) {
        ke2.d dVar = (ke2.d) CollectionsKt.firstOrNull(this.f52170b.getF52894a().f79314f);
        if (newItem == null) {
            h(null);
            return;
        }
        if (dVar == null) {
            h(newItem);
            return;
        }
        z1 oldItem = kh2.b0.r0(dVar);
        if (oldItem == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        String b13 = oldItem.b();
        String b14 = newItem.b();
        int i13 = a2.f106437b;
        if (!Intrinsics.d(b13, b14)) {
            h(newItem);
            return;
        }
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        if (Intrinsics.d(oldItem, newItem)) {
            return;
        }
        i k13 = d0.k(oldItem, newItem);
        if (k13.f52057e) {
            h(newItem);
            return;
        }
        if (k13.f52053a) {
            ke2.b a13 = a(newItem, 0.0f);
            Intrinsics.checkNotNullParameter(a13, "<set-?>");
            dVar.f79320b = a13;
            k(dVar);
        } else if (k13.f52054b) {
            g3.v(dVar.f79319a, newItem.a());
        }
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        dVar.f79321c.put(Integer.MAX_VALUE, newItem);
    }

    public final void k(ke2.d dVar) {
        int i13 = v0.f52158a[this.f52175g.ordinal()];
        float f13 = this.f52174f;
        x72.j jVar = this.f52170b;
        if (i13 == 2) {
            g(dVar, f13);
        } else if (i13 == 3) {
            Size a13 = jVar.a();
            float f14 = 1 - (2 * f13);
            if (Math.max(dVar.f79319a.b() / (a13.getWidth() * f14), dVar.f79319a.a() / (a13.getHeight() * f14)) > 1.0f) {
                g(dVar, f13);
            }
        }
        Size a14 = jVar.a();
        float height = a14.getHeight() * f13;
        float width = a14.getWidth() * f13;
        int i14 = v0.f52159b[this.f52173e.ordinal()];
        if (i14 == 1) {
            dVar.f79320b.f79304a.y = (dVar.f79319a.a() / 2.0f) + height;
            return;
        }
        if (i14 == 2) {
            dVar.f79320b.f79304a.y = a14.getHeight() / 2.0f;
            return;
        }
        if (i14 == 3) {
            dVar.f79320b.f79304a.y = (a14.getHeight() - (dVar.f79319a.a() / 2.0f)) - height;
        } else if (i14 == 4) {
            dVar.f79320b.f79304a.x = (dVar.f79319a.b() / 2.0f) + width;
        } else {
            if (i14 != 5) {
                return;
            }
            dVar.f79320b.f79304a.x = (a14.getWidth() - (dVar.f79319a.b() / 2.0f)) - width;
        }
    }
}
