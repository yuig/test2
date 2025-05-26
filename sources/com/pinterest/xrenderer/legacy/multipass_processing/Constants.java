package com.pinterest.xrenderer.legacy.multipass_processing;

import androidx.annotation.Keep;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/pinterest/xrenderer/legacy/multipass_processing/Constants;", "", "()V", "ATTR_TEXTURE_COORD_LOCATION", "", "ATTR_VERTEX_COORD_LOCATION", "UNIFORM_ORIGINAL_TEXTURE_SAMPLER", "", "UNIFORM_SOURCE_TEXTURE_SAMPLER", "renderer_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class Constants {
    public static final int ATTR_TEXTURE_COORD_LOCATION = 1;
    public static final int ATTR_VERTEX_COORD_LOCATION = 0;

    @NotNull
    public static final Constants INSTANCE = new Constants();

    @NotNull
    public static final String UNIFORM_ORIGINAL_TEXTURE_SAMPLER = "s_originalTexture";

    @NotNull
    public static final String UNIFORM_SOURCE_TEXTURE_SAMPLER = "s_sourceTexture";

    private Constants() {
    }
}
