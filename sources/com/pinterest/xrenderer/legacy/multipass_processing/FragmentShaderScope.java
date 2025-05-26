package com.pinterest.xrenderer.legacy.multipass_processing;

import androidx.annotation.Keep;
import bg.m;
import com.pinterest.xrenderer.legacy.EffectValues;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0083\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0016\u001a\u0004\b\u0017\u0010\u0004R\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\t\u0010\u0018\u001a\u0004\b\u0019\u0010\u0007¨\u0006\u001c"}, d2 = {"Lcom/pinterest/xrenderer/legacy/multipass_processing/FragmentShaderScope;", "", "Lbg/m;", "component1", "()Lbg/m;", "Lcom/pinterest/xrenderer/legacy/EffectValues;", "component2", "()Lcom/pinterest/xrenderer/legacy/EffectValues;", "embedCommon", "filterPass", "copy", "(Lbg/m;Lcom/pinterest/xrenderer/legacy/EffectValues;)Lcom/pinterest/xrenderer/legacy/multipass_processing/FragmentShaderScope;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lbg/m;", "getEmbedCommon", "Lcom/pinterest/xrenderer/legacy/EffectValues;", "getFilterPass", "<init>", "(Lbg/m;Lcom/pinterest/xrenderer/legacy/EffectValues;)V", "renderer_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final /* data */ class FragmentShaderScope {

    @NotNull
    private final m embedCommon;

    @NotNull
    private final EffectValues filterPass;

    public FragmentShaderScope(@NotNull m embedCommon, @NotNull EffectValues filterPass) {
        Intrinsics.checkNotNullParameter(embedCommon, "embedCommon");
        Intrinsics.checkNotNullParameter(filterPass, "filterPass");
        this.embedCommon = embedCommon;
        this.filterPass = filterPass;
    }

    public static /* synthetic */ FragmentShaderScope copy$default(FragmentShaderScope fragmentShaderScope, m mVar, EffectValues effectValues, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            mVar = fragmentShaderScope.embedCommon;
        }
        if ((i13 & 2) != 0) {
            effectValues = fragmentShaderScope.filterPass;
        }
        return fragmentShaderScope.copy(mVar, effectValues);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final m getEmbedCommon() {
        return this.embedCommon;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final EffectValues getFilterPass() {
        return this.filterPass;
    }

    @NotNull
    public final FragmentShaderScope copy(@NotNull m embedCommon, @NotNull EffectValues filterPass) {
        Intrinsics.checkNotNullParameter(embedCommon, "embedCommon");
        Intrinsics.checkNotNullParameter(filterPass, "filterPass");
        return new FragmentShaderScope(embedCommon, filterPass);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FragmentShaderScope)) {
            return false;
        }
        FragmentShaderScope fragmentShaderScope = (FragmentShaderScope) other;
        return Intrinsics.d(this.embedCommon, fragmentShaderScope.embedCommon) && Intrinsics.d(this.filterPass, fragmentShaderScope.filterPass);
    }

    @NotNull
    public final m getEmbedCommon() {
        return this.embedCommon;
    }

    @NotNull
    public final EffectValues getFilterPass() {
        return this.filterPass;
    }

    public int hashCode() {
        return this.filterPass.hashCode() + (this.embedCommon.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "FragmentShaderScope(embedCommon=" + this.embedCommon + ", filterPass=" + this.filterPass + ')';
    }
}
