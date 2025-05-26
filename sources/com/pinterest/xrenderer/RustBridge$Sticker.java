package com.pinterest.xrenderer;

import android.graphics.Bitmap;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0015\n\u0002\u0010\u0012\n\u0002\b\u000e\bÆ\u0002\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0086 ¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0086 ¢\u0006\u0004\b\n\u0010\u000bJ0\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\fH\u0086 ¢\u0006\u0004\b\u0010\u0010\u0011J(\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\fH\u0086 ¢\u0006\u0004\b\u0014\u0010\u0015J \u0010\u0017\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\fH\u0086 ¢\u0006\u0004\b\u0017\u0010\u0018J \u0010\u001a\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\fH\u0086 ¢\u0006\u0004\b\u001a\u0010\u0018J(\u0010\u001d\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\fH\u0086 ¢\u0006\u0004\b\u001d\u0010\u0015J \u0010\u001f\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\fH\u0086 ¢\u0006\u0004\b\u001f\u0010\u0018J\u0018\u0010 \u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0086 ¢\u0006\u0004\b \u0010!J \u0010$\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\"H\u0086 ¢\u0006\u0004\b$\u0010%J \u0010&\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\"H\u0086 ¢\u0006\u0004\b&\u0010%J \u0010'\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\"H\u0086 ¢\u0006\u0004\b'\u0010%J \u0010)\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\"H\u0086 ¢\u0006\u0004\b)\u0010%J0\u0010.\u001a\u00020\t2\u0006\u0010*\u001a\u00020\u00022\u0006\u0010+\u001a\u00020\u00042\u0006\u0010,\u001a\u00020\u00042\u0006\u0010-\u001a\u00020\"H\u0086 ¢\u0006\u0004\b.\u0010/¨\u00060"}, d2 = {"com/pinterest/xrenderer/RustBridge$Sticker", "", "", "handle", "", "id", "(J)I", "Landroid/graphics/Bitmap;", "bitmap", "", "updateBitmap", "(JLandroid/graphics/Bitmap;)V", "", "x", "y", "z", "setPos", "(JFFF)V", "width", "height", "setSize", "(JFF)V", "scale", "setScale", "(JF)V", "degrees", "setRotation", "horFlip", "verFlip", "setFlip", "alpha", "setOpacity", "resetEffects", "(J)V", "", "effectSerialized", "addColorEffect", "(J[B)V", "addDistortionEffect", "setKernelEffect", "filterSerialized", "addFilter", "stickerHandle", "effectType", "effectIdx", "settingsSerialized", "updateEffectSettings", "(JII[B)V", "renderer_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class RustBridge$Sticker {

    /* renamed from: a, reason: collision with root package name */
    public static final RustBridge$Sticker f52863a = new RustBridge$Sticker();

    static {
        int i13 = RustBridge$Library.f52860a;
    }

    public final native void addColorEffect(long handle, @NotNull byte[] effectSerialized);

    public final native void addDistortionEffect(long handle, @NotNull byte[] effectSerialized);

    public final native void addFilter(long handle, @NotNull byte[] filterSerialized);

    public final native int id(long handle);

    public final native void resetEffects(long handle);

    public final native void setFlip(long handle, float horFlip, float verFlip);

    public final native void setKernelEffect(long handle, @NotNull byte[] effectSerialized);

    public final native void setOpacity(long handle, float alpha);

    public final native void setPos(long handle, float x13, float y13, float z13);

    public final native void setRotation(long handle, float degrees);

    public final native void setScale(long handle, float scale);

    public final native void setSize(long handle, float width, float height);

    public final native void updateBitmap(long handle, @NotNull Bitmap bitmap);

    public final native void updateEffectSettings(long stickerHandle, int effectType, int effectIdx, @NotNull byte[] settingsSerialized);
}
