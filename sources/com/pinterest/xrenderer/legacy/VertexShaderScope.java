package com.pinterest.xrenderer.legacy;

import androidx.annotation.Keep;
import bg.m;
import ep.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0081\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\f\u001a\u00020\u0001\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\b¢\u0006\u0004\b#\u0010$J\u0010\u0010\u0002\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ>\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u00012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\f\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\f\u0010\u001c\u001a\u0004\b\u001d\u0010\u0003R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u001e\u001a\u0004\b\u001f\u0010\u0007R\u0017\u0010\u000e\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010 \u001a\u0004\b!\u0010\nR\u0017\u0010\u000f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u000f\u0010 \u001a\u0004\b\"\u0010\n¨\u0006%"}, d2 = {"Lcom/pinterest/xrenderer/legacy/VertexShaderScope;", "", "component1", "()Ljava/lang/Object;", "", "Lcom/pinterest/xrenderer/legacy/EffectValues;", "component2", "()Ljava/util/List;", "Lbg/m;", "component3", "()Lbg/m;", "component4", "constants", "distortionEffectsList", "embedEffectsDefinition", "embedCommon", "copy", "(Ljava/lang/Object;Ljava/util/List;Lbg/m;Lbg/m;)Lcom/pinterest/xrenderer/legacy/VertexShaderScope;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Object;", "getConstants", "Ljava/util/List;", "getDistortionEffectsList", "Lbg/m;", "getEmbedEffectsDefinition", "getEmbedCommon", "<init>", "(Ljava/lang/Object;Ljava/util/List;Lbg/m;Lbg/m;)V", "renderer_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final /* data */ class VertexShaderScope {

    @NotNull
    private final Object constants;

    @NotNull
    private final List<EffectValues> distortionEffectsList;

    @NotNull
    private final m embedCommon;

    @NotNull
    private final m embedEffectsDefinition;

    public VertexShaderScope(@NotNull Object constants, @NotNull List<EffectValues> distortionEffectsList, @NotNull m embedEffectsDefinition, @NotNull m embedCommon) {
        Intrinsics.checkNotNullParameter(constants, "constants");
        Intrinsics.checkNotNullParameter(distortionEffectsList, "distortionEffectsList");
        Intrinsics.checkNotNullParameter(embedEffectsDefinition, "embedEffectsDefinition");
        Intrinsics.checkNotNullParameter(embedCommon, "embedCommon");
        this.constants = constants;
        this.distortionEffectsList = distortionEffectsList;
        this.embedEffectsDefinition = embedEffectsDefinition;
        this.embedCommon = embedCommon;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VertexShaderScope copy$default(VertexShaderScope vertexShaderScope, Object obj, List list, m mVar, m mVar2, int i13, Object obj2) {
        if ((i13 & 1) != 0) {
            obj = vertexShaderScope.constants;
        }
        if ((i13 & 2) != 0) {
            list = vertexShaderScope.distortionEffectsList;
        }
        if ((i13 & 4) != 0) {
            mVar = vertexShaderScope.embedEffectsDefinition;
        }
        if ((i13 & 8) != 0) {
            mVar2 = vertexShaderScope.embedCommon;
        }
        return vertexShaderScope.copy(obj, list, mVar, mVar2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Object getConstants() {
        return this.constants;
    }

    @NotNull
    public final List<EffectValues> component2() {
        return this.distortionEffectsList;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final m getEmbedEffectsDefinition() {
        return this.embedEffectsDefinition;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final m getEmbedCommon() {
        return this.embedCommon;
    }

    @NotNull
    public final VertexShaderScope copy(@NotNull Object constants, @NotNull List<EffectValues> distortionEffectsList, @NotNull m embedEffectsDefinition, @NotNull m embedCommon) {
        Intrinsics.checkNotNullParameter(constants, "constants");
        Intrinsics.checkNotNullParameter(distortionEffectsList, "distortionEffectsList");
        Intrinsics.checkNotNullParameter(embedEffectsDefinition, "embedEffectsDefinition");
        Intrinsics.checkNotNullParameter(embedCommon, "embedCommon");
        return new VertexShaderScope(constants, distortionEffectsList, embedEffectsDefinition, embedCommon);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VertexShaderScope)) {
            return false;
        }
        VertexShaderScope vertexShaderScope = (VertexShaderScope) other;
        return Intrinsics.d(this.constants, vertexShaderScope.constants) && Intrinsics.d(this.distortionEffectsList, vertexShaderScope.distortionEffectsList) && Intrinsics.d(this.embedEffectsDefinition, vertexShaderScope.embedEffectsDefinition) && Intrinsics.d(this.embedCommon, vertexShaderScope.embedCommon);
    }

    @NotNull
    public final Object getConstants() {
        return this.constants;
    }

    @NotNull
    public final List<EffectValues> getDistortionEffectsList() {
        return this.distortionEffectsList;
    }

    @NotNull
    public final m getEmbedCommon() {
        return this.embedCommon;
    }

    @NotNull
    public final m getEmbedEffectsDefinition() {
        return this.embedEffectsDefinition;
    }

    public int hashCode() {
        return this.embedCommon.hashCode() + ((this.embedEffectsDefinition.hashCode() + b.c(this.distortionEffectsList, this.constants.hashCode() * 31, 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "VertexShaderScope(constants=" + this.constants + ", distortionEffectsList=" + this.distortionEffectsList + ", embedEffectsDefinition=" + this.embedEffectsDefinition + ", embedCommon=" + this.embedCommon + ')';
    }
}
