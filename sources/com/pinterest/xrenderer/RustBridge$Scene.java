package com.pinterest.xrenderer;

import android.graphics.Bitmap;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000J\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0016\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u0012\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001J\"\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u0086 ¢\u0006\u0004\b\u0007\u0010\bJ(\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0086 ¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\r\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0086 ¢\u0006\u0004\b\r\u0010\u000eJ \u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0086 ¢\u0006\u0004\b\u0011\u0010\u0012J \u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0086 ¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0002H\u0086 ¢\u0006\u0004\b\u0019\u0010\u001aJ \u0010\u001c\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0004H\u0086 ¢\u0006\u0004\b\u001c\u0010\u001dJ \u0010\u001e\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0004H\u0086 ¢\u0006\u0004\b\u001e\u0010\u001dJ0\u0010#\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020\u001fH\u0086 ¢\u0006\u0004\b#\u0010$J\u0018\u0010%\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0086 ¢\u0006\u0004\b%\u0010\u000eJ \u0010(\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010'\u001a\u00020&H\u0086 ¢\u0006\u0004\b(\u0010)J(\u0010,\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010*\u001a\u00020\u00042\u0006\u0010+\u001a\u00020&H\u0086 ¢\u0006\u0004\b,\u0010-J0\u00102\u001a\u00020\u00062\u0006\u0010.\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u00100\u001a\u00020/2\u0006\u00101\u001a\u00020\u001fH\u0086 ¢\u0006\u0004\b2\u00103J(\u00104\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u00101\u001a\u00020\u001fH\u0086 ¢\u0006\u0004\b4\u00105J\u0018\u00106\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0086 ¢\u0006\u0004\b6\u00107¨\u00068"}, d2 = {"com/pinterest/xrenderer/RustBridge$Scene", "", "", "handle", "", "color", "", "setColor", "(JI)V", "width", "height", "resize", "(JII)V", "unsetOverlay", "(J)V", "", "path", "setOverlay", "(JLjava/lang/String;)V", "Landroid/graphics/Bitmap;", "bitmap", "addSticker", "(JLandroid/graphics/Bitmap;)J", "sceneHandle", "", "stickers", "(J)[J", "id", "stickerByID", "(JI)J", "removeStickerByID", "", "x", "y", "radius", "stickerIdAtPosition", "(JFFF)I", "resetEffects", "", "effectSerialized", "addPostEffect", "(J[B)V", "effectIdx", "settingsSerialized", "updateEffectSettings", "(JI[B)V", "surfaceHandle", "", "updateHitTesting", "time", "renderOnSurface", "(JJZF)V", "renderToImage", "(JLandroid/graphics/Bitmap;F)V", "release", "(J)J", "renderer_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class RustBridge$Scene {

    /* renamed from: a, reason: collision with root package name */
    public static final RustBridge$Scene f52862a = new RustBridge$Scene();

    static {
        int i13 = RustBridge$Library.f52860a;
    }

    public final native void addPostEffect(long handle, @NotNull byte[] effectSerialized);

    public final native long addSticker(long handle, @NotNull Bitmap bitmap);

    public final native long release(long handle);

    public final native long removeStickerByID(long sceneHandle, int id3);

    public final native void renderOnSurface(long surfaceHandle, long sceneHandle, boolean updateHitTesting, float time);

    public final native void renderToImage(long sceneHandle, @NotNull Bitmap bitmap, float time);

    public final native void resetEffects(long handle);

    public final native void resize(long handle, int width, int height);

    public final native void setColor(long handle, int color);

    public final native void setOverlay(long handle, @NotNull String path);

    public final native long stickerByID(long sceneHandle, int id3);

    public final native int stickerIdAtPosition(long sceneHandle, float x13, float y13, float radius);

    @NotNull
    public final native long[] stickers(long sceneHandle);

    public final native void unsetOverlay(long handle);

    public final native void updateEffectSettings(long sceneHandle, int effectIdx, @NotNull byte[] settingsSerialized);
}
