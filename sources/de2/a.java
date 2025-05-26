package de2;

import android.util.Size;
import kd2.i;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public Size f54675a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f54676b;

    public final void a(float f13) {
        b();
        he2.f fVar = (he2.f) this;
        Size size = fVar.f54675a;
        Intrinsics.checkNotNullParameter(size, "<this>");
        if (size.getWidth() == 0 && size.getHeight() == 0) {
            return;
        }
        int i13 = 0;
        fVar.f68984l = false;
        try {
            he2.e block = new he2.e(fVar, f13, i13);
            Intrinsics.checkNotNullParameter("", "tag");
            Intrinsics.checkNotNullParameter(block, "block");
            Intrinsics.checkNotNullParameter("", "tag");
            Intrinsics.checkNotNullParameter(block, "block");
            block.invoke();
        } catch (Exception e13) {
            i iVar = i.f79272h;
            if (iVar == null) {
                throw new IllegalStateException("XRendererApp must be initialized first.".toString());
            }
            fd2.a a13 = iVar.a();
            nd2.a message = new nd2.a(e13, 10);
            kd2.e eVar = (kd2.e) a13;
            eVar.getClass();
            Intrinsics.checkNotNullParameter("LegacySceneRenderer", "tag");
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(new ax1.a(26, message), "block");
            eVar.f79266a.getClass();
        }
    }

    public final void b() {
        if (this.f54676b) {
            return;
        }
        he2.c block = new he2.c((he2.f) this, 2);
        Intrinsics.checkNotNullParameter("", "tag");
        Intrinsics.checkNotNullParameter(block, "block");
        Intrinsics.checkNotNullParameter("", "tag");
        Intrinsics.checkNotNullParameter(block, "block");
        block.invoke();
        this.f54676b = true;
    }

    public final void c(Size newSize) {
        Intrinsics.checkNotNullParameter(newSize, "newSize");
        if (Intrinsics.d(newSize, this.f54675a)) {
            return;
        }
        b();
        Intrinsics.checkNotNullParameter(newSize, "newSize");
        fe2.a block = new fe2.a(3, (he2.f) this, newSize);
        Intrinsics.checkNotNullParameter("", "tag");
        Intrinsics.checkNotNullParameter(block, "block");
        Intrinsics.checkNotNullParameter("", "tag");
        Intrinsics.checkNotNullParameter(block, "block");
        block.invoke();
        this.f54675a = newSize;
    }
}
