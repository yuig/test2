package com.pinterest.shuffles.scene.composer;

import android.content.Context;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.util.Size;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/pinterest/shuffles/scene/composer/LegacySceneView;", "Lcom/pinterest/xrenderer/legacy/view/LegacySceneView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "shuffles-scene_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class LegacySceneView extends com.pinterest.xrenderer.legacy.view.LegacySceneView {

    /* renamed from: j, reason: collision with root package name */
    public boolean f51994j;

    /* renamed from: k, reason: collision with root package name */
    public Size f51995k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LegacySceneView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f51994j = true;
    }

    @Override // com.pinterest.xrenderer.legacy.render_view.GLRenderView, android.view.TextureView, android.view.View
    public final void onSizeChanged(int i13, int i14, int i15, int i16) {
        super.onSizeChanged(i13, i14, i15, i16);
        if (this.f51994j && i13 * i14 != 0) {
            if (this.f51995k != null) {
                Iterator it = this.f52892h.f79314f.iterator();
                while (it.hasNext()) {
                    ke2.d dVar = (ke2.d) it.next();
                    PointF pointF = dVar.f79320b.f79304a;
                    float f13 = i13;
                    float width = (pointF.x * f13) / r9.getWidth();
                    float height = (pointF.y * i14) / r9.getHeight();
                    ke2.b bVar = dVar.f79320b;
                    PointF pointF2 = new PointF(width, height);
                    bVar.getClass();
                    Intrinsics.checkNotNullParameter(pointF2, "<set-?>");
                    bVar.f79304a = pointF2;
                    ke2.i iVar = dVar.f79319a;
                    iVar.f((iVar.b() * f13) / r9.getWidth());
                }
            }
            this.f51995k = new Size(i13, i14);
        }
    }
}
