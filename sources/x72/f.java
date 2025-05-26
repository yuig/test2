package x72;

import android.graphics.Point;
import android.util.Size;
import android.view.TextureView;
import com.pinterest.shuffles.scene.composer.LegacySceneView;
import com.pinterest.shuffles.scene.composer.SceneView;
import java.lang.Thread;
import java.util.concurrent.CompletableFuture;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class f implements j, me2.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f134133a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final TextureView f134134b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TextureView f134135c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ TextureView f134136d;

    public f(LegacySceneView legacySceneView) {
        this.f134136d = legacySceneView;
        this.f134135c = legacySceneView;
        this.f134134b = legacySceneView;
    }

    @Override // me2.a
    public final Size a() {
        TextureView textureView = this.f134135c;
        switch (this.f134133a) {
            case 0:
                return ((SceneView) textureView).a();
            default:
                return ((LegacySceneView) textureView).a();
        }
    }

    @Override // x72.j
    public final void b() {
        TextureView textureView = this.f134136d;
        switch (this.f134133a) {
            case 0:
                ((SceneView) textureView).f51996j = false;
                break;
            default:
                ((LegacySceneView) textureView).f51994j = false;
                break;
        }
    }

    @Override // me2.a
    public final CompletableFuture c(Point position, int i13) {
        TextureView textureView = this.f134135c;
        switch (this.f134133a) {
            case 0:
                Intrinsics.checkNotNullParameter(position, "position");
                return ((SceneView) textureView).c(position, i13);
            default:
                Intrinsics.checkNotNullParameter(position, "position");
                return ((LegacySceneView) textureView).c(position, i13);
        }
    }

    @Override // me2.a
    /* renamed from: e */
    public final float getF52905f() {
        TextureView textureView = this.f134135c;
        switch (this.f134133a) {
            case 0:
                return ((SceneView) textureView).f52905f;
            default:
                return ((LegacySceneView) textureView).f52888e;
        }
    }

    @Override // me2.a
    /* renamed from: f */
    public final ke2.c getF52892h() {
        TextureView textureView = this.f134135c;
        switch (this.f134133a) {
            case 0:
                return ((SceneView) textureView).f52900a;
            default:
                return ((LegacySceneView) textureView).f52892h;
        }
    }

    @Override // me2.a
    public final void g(uv.d dVar) {
        TextureView textureView = this.f134135c;
        switch (this.f134133a) {
            case 0:
                ((SceneView) textureView).g(dVar);
                break;
            default:
                ((LegacySceneView) textureView).g(dVar);
                break;
        }
    }

    @Override // me2.a
    public final void h(boolean z13) {
        TextureView textureView = this.f134135c;
        switch (this.f134133a) {
            case 0:
                ((SceneView) textureView).h(z13);
                break;
            default:
                ((LegacySceneView) textureView).h(z13);
                break;
        }
    }

    @Override // me2.a
    public final CompletableFuture i() {
        TextureView textureView = this.f134135c;
        switch (this.f134133a) {
            case 0:
                return ((SceneView) textureView).i();
            default:
                return ((LegacySceneView) textureView).d(he2.j.f68994k);
        }
    }

    @Override // me2.a
    public final CompletableFuture j() {
        TextureView textureView = this.f134135c;
        switch (this.f134133a) {
            case 0:
                return ((SceneView) textureView).j();
            default:
                return ((LegacySceneView) textureView).d(he2.j.f68993j);
        }
    }

    @Override // x72.j
    public final TextureView k() {
        return this.f134134b;
    }

    @Override // me2.a
    /* renamed from: l */
    public final Thread.UncaughtExceptionHandler getF52906g() {
        TextureView textureView = this.f134135c;
        switch (this.f134133a) {
            case 0:
                return ((SceneView) textureView).f52906g;
            default:
                return ((LegacySceneView) textureView).f52889f;
        }
    }

    public f(SceneView sceneView) {
        this.f134136d = sceneView;
        this.f134135c = sceneView;
        this.f134134b = sceneView;
    }
}
