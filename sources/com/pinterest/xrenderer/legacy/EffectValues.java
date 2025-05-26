package com.pinterest.xrenderer.legacy;

import a.c;
import androidx.annotation.Keep;
import bg.m;
import ep.b;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001:\u0002\u0017\u0018B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0007HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0010\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0019"}, d2 = {"Lcom/pinterest/xrenderer/legacy/EffectValues;", "", "name", "", "definition", "Lcom/pinterest/xrenderer/legacy/EffectValues$EffectDefinitionValues;", "implementation", "Lcom/pinterest/xrenderer/legacy/EffectValues$ImplementationValues;", "(Ljava/lang/String;Lcom/pinterest/xrenderer/legacy/EffectValues$EffectDefinitionValues;Lcom/pinterest/xrenderer/legacy/EffectValues$ImplementationValues;)V", "getDefinition", "()Lcom/pinterest/xrenderer/legacy/EffectValues$EffectDefinitionValues;", "getName", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "EffectDefinitionValues", "ImplementationValues", "renderer_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class EffectValues {

    @NotNull
    private final EffectDefinitionValues definition;

    @NotNull
    public final ImplementationValues implementation;

    @NotNull
    private final String name;

    @Keep
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001:\u0002$%B3\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\"\u0010#J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u0005J\u0010\u0010\u000b\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000b\u0010\bJD\u0010\u0010\u001a\u00020\u00002\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\r\u001a\u00020\u00062\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u001c\u001a\u0004\b\u001d\u0010\u0005R\u0017\u0010\r\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\r\u0010\u001e\u001a\u0004\b\u001f\u0010\bR\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001c\u001a\u0004\b \u0010\u0005R\u0017\u0010\u000f\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001e\u001a\u0004\b!\u0010\b¨\u0006&"}, d2 = {"Lcom/pinterest/xrenderer/legacy/EffectValues$EffectDefinitionValues;", "", "", "Lcom/pinterest/xrenderer/legacy/EffectValues$EffectDefinitionValues$SettingValues;", "component1", "()Ljava/util/List;", "Lbg/m;", "component2", "()Lbg/m;", "Lcom/pinterest/xrenderer/legacy/EffectValues$EffectDefinitionValues$ResourceValues;", "component3", "component4", "settingsDefinitions", "embedSettings", "resourcesDefinitions", "embedResources", "copy", "(Ljava/util/List;Lbg/m;Ljava/util/List;Lbg/m;)Lcom/pinterest/xrenderer/legacy/EffectValues$EffectDefinitionValues;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getSettingsDefinitions", "Lbg/m;", "getEmbedSettings", "getResourcesDefinitions", "getEmbedResources", "<init>", "(Ljava/util/List;Lbg/m;Ljava/util/List;Lbg/m;)V", "ResourceValues", "SettingValues", "renderer_release"}, k = 1, mv = {1, 9, 0})
    public static final /* data */ class EffectDefinitionValues {

        @NotNull
        private final m embedResources;

        @NotNull
        private final m embedSettings;

        @NotNull
        private final List<ResourceValues> resourcesDefinitions;

        @NotNull
        private final List<SettingValues> settingsDefinitions;

        @Keep
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/pinterest/xrenderer/legacy/EffectValues$EffectDefinitionValues$ResourceValues;", "", "name", "", "glslType", "(Ljava/lang/String;Ljava/lang/String;)V", "getGlslType", "()Ljava/lang/String;", "getName", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "renderer_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class ResourceValues {

            @NotNull
            private final String glslType;

            @NotNull
            private final String name;

            public ResourceValues(@NotNull String name, @NotNull String glslType) {
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(glslType, "glslType");
                this.name = name;
                this.glslType = glslType;
            }

            public static /* synthetic */ ResourceValues copy$default(ResourceValues resourceValues, String str, String str2, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    str = resourceValues.name;
                }
                if ((i13 & 2) != 0) {
                    str2 = resourceValues.glslType;
                }
                return resourceValues.copy(str, str2);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final String getName() {
                return this.name;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final String getGlslType() {
                return this.glslType;
            }

            @NotNull
            public final ResourceValues copy(@NotNull String name, @NotNull String glslType) {
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(glslType, "glslType");
                return new ResourceValues(name, glslType);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ResourceValues)) {
                    return false;
                }
                ResourceValues resourceValues = (ResourceValues) other;
                return Intrinsics.d(this.name, resourceValues.name) && Intrinsics.d(this.glslType, resourceValues.glslType);
            }

            @NotNull
            public final String getGlslType() {
                return this.glslType;
            }

            @NotNull
            public final String getName() {
                return this.name;
            }

            public int hashCode() {
                return this.glslType.hashCode() + (this.name.hashCode() * 31);
            }

            @NotNull
            public String toString() {
                StringBuilder sb3 = new StringBuilder("ResourceValues(name=");
                sb3.append(this.name);
                sb3.append(", glslType=");
                return b.k(sb3, this.glslType, ')');
            }
        }

        @Keep
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/pinterest/xrenderer/legacy/EffectValues$EffectDefinitionValues$SettingValues;", "", "name", "", "glslType", "(Ljava/lang/String;Ljava/lang/String;)V", "getGlslType", "()Ljava/lang/String;", "getName", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "renderer_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class SettingValues {

            @NotNull
            private final String glslType;

            @NotNull
            private final String name;

            public SettingValues(@NotNull String name, @NotNull String glslType) {
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(glslType, "glslType");
                this.name = name;
                this.glslType = glslType;
            }

            public static /* synthetic */ SettingValues copy$default(SettingValues settingValues, String str, String str2, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    str = settingValues.name;
                }
                if ((i13 & 2) != 0) {
                    str2 = settingValues.glslType;
                }
                return settingValues.copy(str, str2);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final String getName() {
                return this.name;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final String getGlslType() {
                return this.glslType;
            }

            @NotNull
            public final SettingValues copy(@NotNull String name, @NotNull String glslType) {
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(glslType, "glslType");
                return new SettingValues(name, glslType);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof SettingValues)) {
                    return false;
                }
                SettingValues settingValues = (SettingValues) other;
                return Intrinsics.d(this.name, settingValues.name) && Intrinsics.d(this.glslType, settingValues.glslType);
            }

            @NotNull
            public final String getGlslType() {
                return this.glslType;
            }

            @NotNull
            public final String getName() {
                return this.name;
            }

            public int hashCode() {
                return this.glslType.hashCode() + (this.name.hashCode() * 31);
            }

            @NotNull
            public String toString() {
                StringBuilder sb3 = new StringBuilder("SettingValues(name=");
                sb3.append(this.name);
                sb3.append(", glslType=");
                return b.k(sb3, this.glslType, ')');
            }
        }

        public EffectDefinitionValues(@NotNull List<SettingValues> settingsDefinitions, @NotNull m embedSettings, @NotNull List<ResourceValues> resourcesDefinitions, @NotNull m embedResources) {
            Intrinsics.checkNotNullParameter(settingsDefinitions, "settingsDefinitions");
            Intrinsics.checkNotNullParameter(embedSettings, "embedSettings");
            Intrinsics.checkNotNullParameter(resourcesDefinitions, "resourcesDefinitions");
            Intrinsics.checkNotNullParameter(embedResources, "embedResources");
            this.settingsDefinitions = settingsDefinitions;
            this.embedSettings = embedSettings;
            this.resourcesDefinitions = resourcesDefinitions;
            this.embedResources = embedResources;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ EffectDefinitionValues copy$default(EffectDefinitionValues effectDefinitionValues, List list, m mVar, List list2, m mVar2, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                list = effectDefinitionValues.settingsDefinitions;
            }
            if ((i13 & 2) != 0) {
                mVar = effectDefinitionValues.embedSettings;
            }
            if ((i13 & 4) != 0) {
                list2 = effectDefinitionValues.resourcesDefinitions;
            }
            if ((i13 & 8) != 0) {
                mVar2 = effectDefinitionValues.embedResources;
            }
            return effectDefinitionValues.copy(list, mVar, list2, mVar2);
        }

        @NotNull
        public final List<SettingValues> component1() {
            return this.settingsDefinitions;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final m getEmbedSettings() {
            return this.embedSettings;
        }

        @NotNull
        public final List<ResourceValues> component3() {
            return this.resourcesDefinitions;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final m getEmbedResources() {
            return this.embedResources;
        }

        @NotNull
        public final EffectDefinitionValues copy(@NotNull List<SettingValues> settingsDefinitions, @NotNull m embedSettings, @NotNull List<ResourceValues> resourcesDefinitions, @NotNull m embedResources) {
            Intrinsics.checkNotNullParameter(settingsDefinitions, "settingsDefinitions");
            Intrinsics.checkNotNullParameter(embedSettings, "embedSettings");
            Intrinsics.checkNotNullParameter(resourcesDefinitions, "resourcesDefinitions");
            Intrinsics.checkNotNullParameter(embedResources, "embedResources");
            return new EffectDefinitionValues(settingsDefinitions, embedSettings, resourcesDefinitions, embedResources);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof EffectDefinitionValues)) {
                return false;
            }
            EffectDefinitionValues effectDefinitionValues = (EffectDefinitionValues) other;
            return Intrinsics.d(this.settingsDefinitions, effectDefinitionValues.settingsDefinitions) && Intrinsics.d(this.embedSettings, effectDefinitionValues.embedSettings) && Intrinsics.d(this.resourcesDefinitions, effectDefinitionValues.resourcesDefinitions) && Intrinsics.d(this.embedResources, effectDefinitionValues.embedResources);
        }

        @NotNull
        public final m getEmbedResources() {
            return this.embedResources;
        }

        @NotNull
        public final m getEmbedSettings() {
            return this.embedSettings;
        }

        @NotNull
        public final List<ResourceValues> getResourcesDefinitions() {
            return this.resourcesDefinitions;
        }

        @NotNull
        public final List<SettingValues> getSettingsDefinitions() {
            return this.settingsDefinitions;
        }

        public int hashCode() {
            return this.embedResources.hashCode() + b.c(this.resourcesDefinitions, (this.embedSettings.hashCode() + (this.settingsDefinitions.hashCode() * 31)) * 31, 31);
        }

        @NotNull
        public String toString() {
            return "EffectDefinitionValues(settingsDefinitions=" + this.settingsDefinitions + ", embedSettings=" + this.embedSettings + ", resourcesDefinitions=" + this.resourcesDefinitions + ", embedResources=" + this.embedResources + ')';
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u001c\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0005J\u0010\u0010\b\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\b\u0010\tJF\u0010\r\u001a\u00020\u00002\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\f\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0018\u001a\u0004\b\u0019\u0010\u0005R#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0018\u001a\u0004\b\u001a\u0010\u0005R\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\f\u0010\u001b\u001a\u0004\b\u001c\u0010\t¨\u0006\u001f"}, d2 = {"Lcom/pinterest/xrenderer/legacy/EffectValues$ImplementationValues;", "", "", "", "component1", "()Ljava/util/Map;", "component2", "Lbg/m;", "component3", "()Lbg/m;", "settings", "resources", "embed", "copy", "(Ljava/util/Map;Ljava/util/Map;Lbg/m;)Lcom/pinterest/xrenderer/legacy/EffectValues$ImplementationValues;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/Map;", "getSettings", "getResources", "Lbg/m;", "getEmbed", "<init>", "(Ljava/util/Map;Ljava/util/Map;Lbg/m;)V", "renderer_release"}, k = 1, mv = {1, 9, 0})
    public static final /* data */ class ImplementationValues {

        @NotNull
        private final m embed;

        @NotNull
        private final Map<String, String> resources;

        @NotNull
        private final Map<String, String> settings;

        public ImplementationValues(@NotNull Map<String, String> settings, @NotNull Map<String, String> resources, @NotNull m embed) {
            Intrinsics.checkNotNullParameter(settings, "settings");
            Intrinsics.checkNotNullParameter(resources, "resources");
            Intrinsics.checkNotNullParameter(embed, "embed");
            this.settings = settings;
            this.resources = resources;
            this.embed = embed;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ImplementationValues copy$default(ImplementationValues implementationValues, Map map, Map map2, m mVar, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                map = implementationValues.settings;
            }
            if ((i13 & 2) != 0) {
                map2 = implementationValues.resources;
            }
            if ((i13 & 4) != 0) {
                mVar = implementationValues.embed;
            }
            return implementationValues.copy(map, map2, mVar);
        }

        @NotNull
        public final Map<String, String> component1() {
            return this.settings;
        }

        @NotNull
        public final Map<String, String> component2() {
            return this.resources;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final m getEmbed() {
            return this.embed;
        }

        @NotNull
        public final ImplementationValues copy(@NotNull Map<String, String> settings, @NotNull Map<String, String> resources, @NotNull m embed) {
            Intrinsics.checkNotNullParameter(settings, "settings");
            Intrinsics.checkNotNullParameter(resources, "resources");
            Intrinsics.checkNotNullParameter(embed, "embed");
            return new ImplementationValues(settings, resources, embed);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ImplementationValues)) {
                return false;
            }
            ImplementationValues implementationValues = (ImplementationValues) other;
            return Intrinsics.d(this.settings, implementationValues.settings) && Intrinsics.d(this.resources, implementationValues.resources) && Intrinsics.d(this.embed, implementationValues.embed);
        }

        @NotNull
        public final m getEmbed() {
            return this.embed;
        }

        @NotNull
        public final Map<String, String> getResources() {
            return this.resources;
        }

        @NotNull
        public final Map<String, String> getSettings() {
            return this.settings;
        }

        public int hashCode() {
            return this.embed.hashCode() + c.e(this.resources, this.settings.hashCode() * 31, 31);
        }

        @NotNull
        public String toString() {
            return "ImplementationValues(settings=" + this.settings + ", resources=" + this.resources + ", embed=" + this.embed + ')';
        }
    }

    public EffectValues(@NotNull String name, @NotNull EffectDefinitionValues definition, @NotNull ImplementationValues implementation) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(definition, "definition");
        Intrinsics.checkNotNullParameter(implementation, "implementation");
        this.name = name;
        this.definition = definition;
        this.implementation = implementation;
    }

    public static /* synthetic */ EffectValues copy$default(EffectValues effectValues, String str, EffectDefinitionValues effectDefinitionValues, ImplementationValues implementationValues, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = effectValues.name;
        }
        if ((i13 & 2) != 0) {
            effectDefinitionValues = effectValues.definition;
        }
        if ((i13 & 4) != 0) {
            implementationValues = effectValues.implementation;
        }
        return effectValues.copy(str, effectDefinitionValues, implementationValues);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final EffectDefinitionValues getDefinition() {
        return this.definition;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final ImplementationValues getImplementation() {
        return this.implementation;
    }

    @NotNull
    public final EffectValues copy(@NotNull String name, @NotNull EffectDefinitionValues definition, @NotNull ImplementationValues implementation) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(definition, "definition");
        Intrinsics.checkNotNullParameter(implementation, "implementation");
        return new EffectValues(name, definition, implementation);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EffectValues)) {
            return false;
        }
        EffectValues effectValues = (EffectValues) other;
        return Intrinsics.d(this.name, effectValues.name) && Intrinsics.d(this.definition, effectValues.definition) && Intrinsics.d(this.implementation, effectValues.implementation);
    }

    @NotNull
    public final EffectDefinitionValues getDefinition() {
        return this.definition;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return this.implementation.hashCode() + ((this.definition.hashCode() + (this.name.hashCode() * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "EffectValues(name=" + this.name + ", definition=" + this.definition + ", implementation=" + this.implementation + ')';
    }
}
