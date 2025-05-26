package com.pinterest.xrenderer.legacy;

import androidx.annotation.Keep;
import bg.m;
import ep.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0081\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u000f\u001a\u00020\u0001\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007\u0012\u000e\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0007\u0012\u0006\u0010\u0013\u001a\u00020\u000b\u0012\u0006\u0010\u0014\u001a\u00020\u000b¢\u0006\u0004\b+\u0010,J\u0010\u0010\u0002\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0007HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\f\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\\\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020\u00012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u00072\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00072\b\b\u0002\u0010\u0013\u001a\u00020\u000b2\b\b\u0002\u0010\u0014\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u000f\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u000f\u0010!\u001a\u0004\b\"\u0010\u0003R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010#\u001a\u0004\b$\u0010\u0006R\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u00078\u0006¢\u0006\f\n\u0004\b\u0011\u0010%\u001a\u0004\b&\u0010\tR\u001f\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00078\u0006¢\u0006\f\n\u0004\b\u0012\u0010%\u001a\u0004\b'\u0010\tR\u0017\u0010\u0013\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0013\u0010(\u001a\u0004\b)\u0010\rR\u0017\u0010\u0014\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0014\u0010(\u001a\u0004\b*\u0010\r¨\u0006-"}, d2 = {"Lcom/pinterest/xrenderer/legacy/FragmentShaderScope;", "", "component1", "()Ljava/lang/Object;", "Lcom/pinterest/xrenderer/legacy/EffectValues;", "component2", "()Lcom/pinterest/xrenderer/legacy/EffectValues;", "", "component3", "()Ljava/util/List;", "component4", "Lbg/m;", "component5", "()Lbg/m;", "component6", "constants", "kernelEffectDefinition", "colorEffectsList", "allEffectsList", "embedEffectsDefinition", "embedCommon", "copy", "(Ljava/lang/Object;Lcom/pinterest/xrenderer/legacy/EffectValues;Ljava/util/List;Ljava/util/List;Lbg/m;Lbg/m;)Lcom/pinterest/xrenderer/legacy/FragmentShaderScope;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Object;", "getConstants", "Lcom/pinterest/xrenderer/legacy/EffectValues;", "getKernelEffectDefinition", "Ljava/util/List;", "getColorEffectsList", "getAllEffectsList", "Lbg/m;", "getEmbedEffectsDefinition", "getEmbedCommon", "<init>", "(Ljava/lang/Object;Lcom/pinterest/xrenderer/legacy/EffectValues;Ljava/util/List;Ljava/util/List;Lbg/m;Lbg/m;)V", "renderer_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final /* data */ class FragmentShaderScope {

    @NotNull
    private final List<EffectValues> allEffectsList;

    @NotNull
    private final List<EffectValues> colorEffectsList;

    @NotNull
    private final Object constants;

    @NotNull
    private final m embedCommon;

    @NotNull
    private final m embedEffectsDefinition;
    private final EffectValues kernelEffectDefinition;

    public FragmentShaderScope(@NotNull Object constants, EffectValues effectValues, @NotNull List<EffectValues> colorEffectsList, @NotNull List<EffectValues> allEffectsList, @NotNull m embedEffectsDefinition, @NotNull m embedCommon) {
        Intrinsics.checkNotNullParameter(constants, "constants");
        Intrinsics.checkNotNullParameter(colorEffectsList, "colorEffectsList");
        Intrinsics.checkNotNullParameter(allEffectsList, "allEffectsList");
        Intrinsics.checkNotNullParameter(embedEffectsDefinition, "embedEffectsDefinition");
        Intrinsics.checkNotNullParameter(embedCommon, "embedCommon");
        this.constants = constants;
        this.kernelEffectDefinition = effectValues;
        this.colorEffectsList = colorEffectsList;
        this.allEffectsList = allEffectsList;
        this.embedEffectsDefinition = embedEffectsDefinition;
        this.embedCommon = embedCommon;
    }

    public static /* synthetic */ FragmentShaderScope copy$default(FragmentShaderScope fragmentShaderScope, Object obj, EffectValues effectValues, List list, List list2, m mVar, m mVar2, int i13, Object obj2) {
        if ((i13 & 1) != 0) {
            obj = fragmentShaderScope.constants;
        }
        if ((i13 & 2) != 0) {
            effectValues = fragmentShaderScope.kernelEffectDefinition;
        }
        EffectValues effectValues2 = effectValues;
        if ((i13 & 4) != 0) {
            list = fragmentShaderScope.colorEffectsList;
        }
        List list3 = list;
        if ((i13 & 8) != 0) {
            list2 = fragmentShaderScope.allEffectsList;
        }
        List list4 = list2;
        if ((i13 & 16) != 0) {
            mVar = fragmentShaderScope.embedEffectsDefinition;
        }
        m mVar3 = mVar;
        if ((i13 & 32) != 0) {
            mVar2 = fragmentShaderScope.embedCommon;
        }
        return fragmentShaderScope.copy(obj, effectValues2, list3, list4, mVar3, mVar2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Object getConstants() {
        return this.constants;
    }

    /* renamed from: component2, reason: from getter */
    public final EffectValues getKernelEffectDefinition() {
        return this.kernelEffectDefinition;
    }

    @NotNull
    public final List<EffectValues> component3() {
        return this.colorEffectsList;
    }

    @NotNull
    public final List<EffectValues> component4() {
        return this.allEffectsList;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final m getEmbedEffectsDefinition() {
        return this.embedEffectsDefinition;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final m getEmbedCommon() {
        return this.embedCommon;
    }

    @NotNull
    public final FragmentShaderScope copy(@NotNull Object constants, EffectValues kernelEffectDefinition, @NotNull List<EffectValues> colorEffectsList, @NotNull List<EffectValues> allEffectsList, @NotNull m embedEffectsDefinition, @NotNull m embedCommon) {
        Intrinsics.checkNotNullParameter(constants, "constants");
        Intrinsics.checkNotNullParameter(colorEffectsList, "colorEffectsList");
        Intrinsics.checkNotNullParameter(allEffectsList, "allEffectsList");
        Intrinsics.checkNotNullParameter(embedEffectsDefinition, "embedEffectsDefinition");
        Intrinsics.checkNotNullParameter(embedCommon, "embedCommon");
        return new FragmentShaderScope(constants, kernelEffectDefinition, colorEffectsList, allEffectsList, embedEffectsDefinition, embedCommon);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FragmentShaderScope)) {
            return false;
        }
        FragmentShaderScope fragmentShaderScope = (FragmentShaderScope) other;
        return Intrinsics.d(this.constants, fragmentShaderScope.constants) && Intrinsics.d(this.kernelEffectDefinition, fragmentShaderScope.kernelEffectDefinition) && Intrinsics.d(this.colorEffectsList, fragmentShaderScope.colorEffectsList) && Intrinsics.d(this.allEffectsList, fragmentShaderScope.allEffectsList) && Intrinsics.d(this.embedEffectsDefinition, fragmentShaderScope.embedEffectsDefinition) && Intrinsics.d(this.embedCommon, fragmentShaderScope.embedCommon);
    }

    @NotNull
    public final List<EffectValues> getAllEffectsList() {
        return this.allEffectsList;
    }

    @NotNull
    public final List<EffectValues> getColorEffectsList() {
        return this.colorEffectsList;
    }

    @NotNull
    public final Object getConstants() {
        return this.constants;
    }

    @NotNull
    public final m getEmbedCommon() {
        return this.embedCommon;
    }

    @NotNull
    public final m getEmbedEffectsDefinition() {
        return this.embedEffectsDefinition;
    }

    public final EffectValues getKernelEffectDefinition() {
        return this.kernelEffectDefinition;
    }

    public int hashCode() {
        int hashCode = this.constants.hashCode() * 31;
        EffectValues effectValues = this.kernelEffectDefinition;
        return this.embedCommon.hashCode() + ((this.embedEffectsDefinition.hashCode() + b.c(this.allEffectsList, b.c(this.colorEffectsList, (hashCode + (effectValues == null ? 0 : effectValues.hashCode())) * 31, 31), 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "FragmentShaderScope(constants=" + this.constants + ", kernelEffectDefinition=" + this.kernelEffectDefinition + ", colorEffectsList=" + this.colorEffectsList + ", allEffectsList=" + this.allEffectsList + ", embedEffectsDefinition=" + this.embedEffectsDefinition + ", embedCommon=" + this.embedCommon + ')';
    }
}
