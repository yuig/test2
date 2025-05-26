package r62;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.engine.GlideException;
import de.g;
import ee.i;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class c implements g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function0 f106343a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function0 f106344b;

    public c(Function0 function0, Function0 function02) {
        this.f106343a = function0;
        this.f106344b = function02;
    }

    @Override // de.g
    public final void a(GlideException glideException, i target) {
        Intrinsics.checkNotNullParameter(target, "target");
        this.f106343a.invoke();
    }

    @Override // de.g
    public final void c(Object obj, Object model, i iVar, nd.a dataSource, boolean z13) {
        Drawable resource = (Drawable) obj;
        Intrinsics.checkNotNullParameter(resource, "resource");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(dataSource, "dataSource");
        this.f106344b.invoke();
    }
}
