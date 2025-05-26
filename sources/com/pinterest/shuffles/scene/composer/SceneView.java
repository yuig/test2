package com.pinterest.shuffles.scene.composer;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.util.Size;
import com.pinterest.xrenderer.view.SceneTextureView;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/pinterest/shuffles/scene/composer/SceneView;", "Lcom/pinterest/xrenderer/view/SceneTextureView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "shuffles-scene_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class SceneView extends SceneTextureView {

    /* renamed from: j, reason: collision with root package name */
    public boolean f51996j;

    /* renamed from: k, reason: collision with root package name */
    public Size f51997k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SceneView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f51996j = true;
    }

    @Override // com.pinterest.xrenderer.view.SceneTextureView, android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surface, int i13, int i14) {
        Intrinsics.checkNotNullParameter(surface, "surface");
        super.onSurfaceTextureAvailable(surface, i13, i14);
        this.f51997k = new Size(i13, i14);
    }

    @Override // com.pinterest.xrenderer.view.SceneTextureView, android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surface, int i13, int i14) {
        Intrinsics.checkNotNullParameter(surface, "surface");
        super.onSurfaceTextureSizeChanged(surface, i13, i14);
        if (this.f51996j) {
            Size size = this.f51997k;
            Size size2 = new Size(i13, i14);
            if (size != null && !Intrinsics.d(size2, size)) {
                float width = i13 / size.getWidth();
                float height = i14 / size.getHeight();
                if (width == 1.0f) {
                    width = height;
                } else if (height != 1.0f) {
                    width = Math.min(width, height);
                }
                Iterator it = this.f52900a.f79314f.iterator();
                while (it.hasNext()) {
                    ke2.d dVar = (ke2.d) it.next();
                    PointF pointF = dVar.f79320b.f79304a;
                    pointF.x *= width;
                    pointF.y *= width;
                    ke2.i iVar = dVar.f79319a;
                    iVar.d(iVar.a() * width);
                }
            }
            this.f51997k = size2;
        }
    }
}
