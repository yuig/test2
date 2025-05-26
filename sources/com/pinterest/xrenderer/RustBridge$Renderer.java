package com.pinterest.xrenderer;

import android.view.Surface;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001J \u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0086 ¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0006H\u0086 ¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u000f\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0086 ¢\u0006\u0004\b\u000f\u0010\u0010J(\u0010\u0013\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0002H\u0086 ¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"com/pinterest/xrenderer/RustBridge$Renderer", "", "", "backendPreference", "", "resourceCache", "", "init", "(IZ)J", "rendererHandle", "", "release", "(J)V", "Landroid/view/Surface;", "surface", "createSurface", "(JLandroid/view/Surface;)J", "width", "height", "createScene", "(JII)J", "renderer_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class RustBridge$Renderer {

    /* renamed from: a, reason: collision with root package name */
    public static final RustBridge$Renderer f52861a = new RustBridge$Renderer();

    static {
        int i13 = RustBridge$Library.f52860a;
    }

    public final native long createScene(long rendererHandle, int width, int height);

    public final native long createSurface(long rendererHandle, @NotNull Surface surface);

    public final native long init(int backendPreference, boolean resourceCache);

    public final native void release(long rendererHandle);
}
