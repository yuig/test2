package he2;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Size;
import dv0.q;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import xk2.s;

/* loaded from: classes4.dex */
public final class f extends de2.a {

    /* renamed from: c, reason: collision with root package name */
    public final ke2.c f68975c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f68976d;

    /* renamed from: e, reason: collision with root package name */
    public yd2.j f68977e;

    /* renamed from: f, reason: collision with root package name */
    public ae2.d f68978f;

    /* renamed from: g, reason: collision with root package name */
    public ae2.d f68979g;

    /* renamed from: h, reason: collision with root package name */
    public ae2.d f68980h;

    /* renamed from: i, reason: collision with root package name */
    public final t72.j f68981i;

    /* renamed from: j, reason: collision with root package name */
    public ce2.b f68982j;

    /* renamed from: k, reason: collision with root package name */
    public final a f68983k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f68984l;

    /* renamed from: m, reason: collision with root package name */
    public int f68985m;

    /* renamed from: n, reason: collision with root package name */
    public ByteBuffer f68986n;

    /* renamed from: o, reason: collision with root package name */
    public final q f68987o;

    public f(Context context, ke2.c scene, boolean z13) {
        Object m13;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(scene, "scene");
        this.f54675a = new Size(-1, -1);
        this.f68975c = scene;
        this.f68976d = z13;
        this.f68981i = new t72.j(3);
        a aVar = new a();
        ByteBuffer allocate = ByteBuffer.allocate(0);
        Intrinsics.checkNotNullExpressionValue(allocate, "allocate(...)");
        aVar.f68962a = allocate;
        aVar.f68963b = new Size(0, 0);
        this.f68983k = aVar;
        int width = this.f54675a.getWidth();
        int height = this.f54675a.getHeight();
        try {
            xk2.q qVar = s.f135225b;
            m13 = ByteBuffer.allocateDirect(width * height * 4);
        } catch (OutOfMemoryError e13) {
            xk2.q qVar2 = s.f135225b;
            m13 = ue.c.m(e13);
        }
        Throwable a13 = s.a(m13);
        if (a13 != null) {
            throw new Throwable("Out of memory while allocating buffer for texture copy", a13);
        }
        Intrinsics.checkNotNullExpressionValue(m13, "getOrElse(...)");
        this.f68986n = (ByteBuffer) m13;
        this.f68987o = new q(context, scene);
    }

    public final Bitmap d() {
        c block = new c(this, 3);
        Intrinsics.checkNotNullParameter("", "tag");
        Intrinsics.checkNotNullParameter(block, "block");
        Intrinsics.checkNotNullParameter("", "tag");
        Intrinsics.checkNotNullParameter(block, "block");
        return (Bitmap) block.invoke();
    }
}
