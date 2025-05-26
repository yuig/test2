package t3;

import android.view.RenderNode;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public final class n3 {

    /* renamed from: a, reason: collision with root package name */
    public static final n3 f116103a = new n3();

    public final int a(@NotNull RenderNode renderNode) {
        return renderNode.getAmbientShadowColor();
    }

    public final int b(@NotNull RenderNode renderNode) {
        return renderNode.getSpotShadowColor();
    }

    public final void c(@NotNull RenderNode renderNode, int i13) {
        renderNode.setAmbientShadowColor(i13);
    }

    public final void d(@NotNull RenderNode renderNode, int i13) {
        renderNode.setSpotShadowColor(i13);
    }
}
