package yd2;

import java.util.Iterator;
import kotlin.collections.IndexedValue;
import kotlin.collections.c0;
import kotlin.jvm.internal.Intrinsics;
import q5.x0;

/* loaded from: classes4.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final int[] f138806a;

    /* renamed from: b, reason: collision with root package name */
    public b f138807b = b.DRAW;

    /* renamed from: c, reason: collision with root package name */
    public Object f138808c;

    public j() {
        int[] iArr = {0};
        this.f138806a = iArr;
        pe.i.J(new a(this, 0), "generate framebuffer");
        if (iArr[0] <= 0) {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    public final void a() {
        if (this.f138808c == null) {
            throw new IllegalStateException("can't bind framebuffer with no mode set. Use setDrawMode/setReadMode".toString());
        }
        pe.i.J(new a(this, 1), "bind framebuffer");
        int i13 = g.f138802a[this.f138807b.ordinal()];
        if (i13 != 1) {
            if (i13 != 2) {
                return;
            }
            Object obj = this.f138808c;
            Intrinsics.g(obj, "null cannot be cast to non-null type com.pinterest.xrenderer.legacy.gl.framebuffer.GLFrameBuffer.ReadAttachments");
            f fVar = (f) obj;
            if (fVar instanceof e) {
                pe.i.J(new h(this, fVar), "bind color texture to a framebuffer");
                pe.i.J(i.f138805i, "set framebuffer read texture (color)");
                return;
            }
            return;
        }
        Object obj2 = this.f138808c;
        Intrinsics.g(obj2, "null cannot be cast to non-null type com.pinterest.xrenderer.legacy.gl.framebuffer.GLFrameBuffer.DrawAttachments");
        d dVar = (d) obj2;
        Iterator it = c0.g0(dVar.f138800a).iterator();
        while (true) {
            x0 x0Var = (x0) it;
            if (!x0Var.hasNext()) {
                pe.i.J(new nd2.a(dVar, 4), "set all framebuffer draw textures");
                return;
            }
            IndexedValue indexedValue = (IndexedValue) x0Var.next();
            int i14 = indexedValue.f80349a;
            ae2.d dVar2 = (ae2.d) indexedValue.f80350b;
            pe.i.J(new mu0.i(this, i14, dVar2, 5), a.a.e("bind color texture (", i14, ") to a framebuffer"));
        }
    }

    public final void b(c drawAttachments) {
        Intrinsics.checkNotNullParameter(drawAttachments, "drawAttachments");
        this.f138808c = drawAttachments;
        this.f138807b = b.DRAW;
    }
}
