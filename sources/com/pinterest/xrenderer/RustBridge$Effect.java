package com.pinterest.xrenderer;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0086 ¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0086 ¢\u0006\u0004\b\u0007\u0010\u0006J\u0018\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0086 ¢\u0006\u0004\b\b\u0010\u0006J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0086 ¢\u0006\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"com/pinterest/xrenderer/RustBridge$Effect", "", "", "name", "", "colorEffectByName", "(Ljava/lang/String;)[B", "distortionEffectByName", "kernelEffectByName", "filterByName", "renderer_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class RustBridge$Effect {

    /* renamed from: a, reason: collision with root package name */
    public static final RustBridge$Effect f52859a = new RustBridge$Effect();

    static {
        int i13 = RustBridge$Library.f52860a;
    }

    @NotNull
    public final native byte[] colorEffectByName(@NotNull String name);

    @NotNull
    public final native byte[] distortionEffectByName(@NotNull String name);

    @NotNull
    public final native byte[] filterByName(@NotNull String name);

    @NotNull
    public final native byte[] kernelEffectByName(@NotNull String name);
}
