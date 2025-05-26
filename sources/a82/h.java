package a82;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.engine.GlideException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class h implements de.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f1545a;

    public h(j jVar) {
        this.f1545a = jVar;
    }

    @Override // de.g
    public final void a(GlideException glideException, ee.i target) {
        Intrinsics.checkNotNullParameter(target, "target");
    }

    @Override // de.g
    public final void c(Object obj, Object model, ee.i iVar, nd.a dataSource, boolean z13) {
        Drawable resource = (Drawable) obj;
        Intrinsics.checkNotNullParameter(resource, "resource");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(dataSource, "dataSource");
        this.f1545a.f1553f.invoke();
    }
}
