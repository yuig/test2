package hs1;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import com.bumptech.glide.load.engine.GlideException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class k implements de.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o f70050a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f70051b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m f70052c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f70053d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o f70054e;

    public k(o oVar, String str, m mVar, String str2, o oVar2) {
        this.f70050a = oVar;
        this.f70051b = str;
        this.f70052c = mVar;
        this.f70053d = str2;
        this.f70054e = oVar2;
    }

    @Override // de.g
    public final void a(GlideException glideException, ee.i target) {
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.g(glideException, "null cannot be cast to non-null type java.lang.Exception{ kotlin.TypeAliasesKt.Exception }");
        new Handler(Looper.getMainLooper()).post(new n.g(this.f70050a, this.f70051b, this.f70052c, glideException, 11, 0));
    }

    @Override // de.g
    public final void c(Object obj, Object model, ee.i iVar, nd.a dataSource, boolean z13) {
        Bitmap resource = (Bitmap) obj;
        Intrinsics.checkNotNullParameter(resource, "resource");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(dataSource, "dataSource");
        new Handler(Looper.getMainLooper()).post(new n.g(resource, this.f70053d, this.f70054e, this.f70052c, 10, 0));
    }
}
