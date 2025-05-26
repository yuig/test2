package a82;

import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ImageView;
import ao2.j0;
import com.pinterest.api.model.f30;
import com.pinterest.shuffles.scene.composer.o0;
import java.io.File;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class j implements o0 {

    /* renamed from: a, reason: collision with root package name */
    public final x72.j f1548a;

    /* renamed from: b, reason: collision with root package name */
    public final ImageView f1549b;

    /* renamed from: c, reason: collision with root package name */
    public final j0 f1550c;

    /* renamed from: d, reason: collision with root package name */
    public final Function1 f1551d;

    /* renamed from: e, reason: collision with root package name */
    public final Function1 f1552e;

    /* renamed from: f, reason: collision with root package name */
    public final Function0 f1553f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1554g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f1555h;

    /* renamed from: i, reason: collision with root package name */
    public ge.d f1556i;

    /* renamed from: j, reason: collision with root package name */
    public final mb.d f1557j;

    public j(x72.j sceneView, ImageView previewImageView, j0 lifecycleScope, Function1 cacheKeyProvider, Function1 imageSelector, Function0 onItemLoad) {
        Intrinsics.checkNotNullParameter(sceneView, "sceneView");
        Intrinsics.checkNotNullParameter(previewImageView, "previewImageView");
        Intrinsics.checkNotNullParameter(lifecycleScope, "lifecycleScope");
        Intrinsics.checkNotNullParameter(cacheKeyProvider, "cacheKeyProvider");
        Intrinsics.checkNotNullParameter(imageSelector, "imageSelector");
        Intrinsics.checkNotNullParameter(onItemLoad, "onItemLoad");
        this.f1548a = sceneView;
        this.f1549b = previewImageView;
        this.f1550c = lifecycleScope;
        this.f1551d = cacheKeyProvider;
        this.f1552e = imageSelector;
        this.f1553f = onItemLoad;
        this.f1555h = true;
        mb.d dVar = new mb.d(262144000L, pe.i.w(sceneView).getCacheDir());
        Intrinsics.checkNotNullExpressionValue(dVar, "create(...)");
        this.f1557j = dVar;
    }

    @Override // com.pinterest.shuffles.scene.composer.o0
    public final void a() {
        if (this.f1548a.getF52892h().f79314f.isEmpty()) {
            Log.d("ShufflePreviewLoader", "onLoadComplete: scene is empty");
            return;
        }
        Log.d("ShufflePreviewLoader", "onLoadComplete: key=" + this.f1556i);
        this.f1555h = false;
        if (!this.f1554g) {
            this.f1554g = true;
            this.f1553f.invoke();
        }
        ImageView imageView = this.f1549b;
        if (imageView.getVisibility() == 0) {
            imageView.animate().alpha(0.0f).withEndAction(new s81.g(this, 19)).start();
        } else {
            kotlin.jvm.internal.j.z(this.f1550c, null, null, new i(this, null), 3);
        }
    }

    public final void b(f30 pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        nd.h hVar = this.f1556i;
        if (hVar == null) {
            Object invoke = this.f1551d.invoke(pin);
            this.f1556i = (ge.d) invoke;
            hVar = (nd.h) invoke;
        }
        if (this.f1555h) {
            ImageView imageView = this.f1549b;
            imageView.setVisibility(0);
            File l13 = this.f1557j.l(hVar);
            if (l13 == null) {
                Log.d("ShufflePreviewLoader", "loadShufflePreviewIfNeeded: cache miss key=" + hVar);
                com.bumptech.glide.b.g(imageView).a(Drawable.class).K((String) this.f1552e.invoke(pin)).B(new h(this)).G(imageView);
                return;
            }
            Log.d("ShufflePreviewLoader", "loadShufflePreviewIfNeeded: cache hit key=" + hVar);
            com.bumptech.glide.b.g(imageView).a(Drawable.class).K(l13).G(imageView);
            if (this.f1554g) {
                return;
            }
            this.f1554g = true;
            this.f1553f.invoke();
        }
    }
}
