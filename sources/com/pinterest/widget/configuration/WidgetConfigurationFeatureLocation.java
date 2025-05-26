package com.pinterest.widget.configuration;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.pinterest.framework.screens.ScreenLocation;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\b\u0087\u0081\u0002\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\u0011B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\rj\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0016"}, d2 = {"Lcom/pinterest/widget/configuration/WidgetConfigurationFeatureLocation;", "", "Lcom/pinterest/framework/screens/ScreenLocation;", "", "onScreenNavigation", "()V", "Landroid/os/Parcel;", "dest", "", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "<init>", "(Ljava/lang/String;I)V", "Companion", "com/pinterest/widget/configuration/j", "WIDGET_CONTENT_SELECTION", "WIDGET_BOARD_CONFIGURATION", "WIDGET_BOARD_SELECTION", "WIDGET_REFRESH_INTERVAL_SELECTION", "widget_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public abstract class WidgetConfigurationFeatureLocation implements ScreenLocation {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ WidgetConfigurationFeatureLocation[] $VALUES;

    @NotNull
    public static final Parcelable.Creator<WidgetConfigurationFeatureLocation> CREATOR;

    @NotNull
    public static final j Companion;
    public static final WidgetConfigurationFeatureLocation WIDGET_CONTENT_SELECTION = new WidgetConfigurationFeatureLocation() { // from class: com.pinterest.widget.configuration.WidgetConfigurationFeatureLocation.WIDGET_CONTENT_SELECTION

        /* renamed from: a, reason: collision with root package name */
        public final Class f52823a = cd2.l.class;

        @Override // com.pinterest.widget.configuration.WidgetConfigurationFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF52824a() {
            return this.f52823a;
        }
    };
    public static final WidgetConfigurationFeatureLocation WIDGET_BOARD_CONFIGURATION = new WidgetConfigurationFeatureLocation() { // from class: com.pinterest.widget.configuration.WidgetConfigurationFeatureLocation.WIDGET_BOARD_CONFIGURATION

        /* renamed from: a, reason: collision with root package name */
        public final Class f52818a = zc2.p.class;

        @Override // com.pinterest.widget.configuration.WidgetConfigurationFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF52824a() {
            return this.f52818a;
        }
    };
    public static final WidgetConfigurationFeatureLocation WIDGET_BOARD_SELECTION = new WidgetConfigurationFeatureLocation() { // from class: com.pinterest.widget.configuration.WidgetConfigurationFeatureLocation.WIDGET_BOARD_SELECTION

        /* renamed from: a, reason: collision with root package name */
        public final Class f52819a = ad2.h.class;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f52820b = true;

        /* renamed from: c, reason: collision with root package name */
        public final com.pinterest.framework.screens.g f52821c = com.pinterest.framework.screens.g.MODAL;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f52822d = true;

        @Override // com.pinterest.widget.configuration.WidgetConfigurationFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getDisplayMode, reason: from getter */
        public final com.pinterest.framework.screens.g getF52826c() {
            return this.f52821c;
        }

        @Override // com.pinterest.widget.configuration.WidgetConfigurationFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF52824a() {
            return this.f52819a;
        }

        @Override // com.pinterest.widget.configuration.WidgetConfigurationFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldKeepOldScreenVisible, reason: from getter */
        public final boolean getF52825b() {
            return this.f52820b;
        }

        @Override // com.pinterest.widget.configuration.WidgetConfigurationFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldNotActivateLastScreenVisible, reason: from getter */
        public final boolean getF52827d() {
            return this.f52822d;
        }

        @Override // com.pinterest.widget.configuration.WidgetConfigurationFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldShowMainNavigation */
        public final boolean getF45109b() {
            return false;
        }
    };
    public static final WidgetConfigurationFeatureLocation WIDGET_REFRESH_INTERVAL_SELECTION = new WidgetConfigurationFeatureLocation() { // from class: com.pinterest.widget.configuration.WidgetConfigurationFeatureLocation.WIDGET_REFRESH_INTERVAL_SELECTION

        /* renamed from: a, reason: collision with root package name */
        public final Class f52824a = bd2.c.class;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f52825b = true;

        /* renamed from: c, reason: collision with root package name */
        public final com.pinterest.framework.screens.g f52826c = com.pinterest.framework.screens.g.MODAL;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f52827d = true;

        @Override // com.pinterest.widget.configuration.WidgetConfigurationFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getDisplayMode, reason: from getter */
        public final com.pinterest.framework.screens.g getF52826c() {
            return this.f52826c;
        }

        @Override // com.pinterest.widget.configuration.WidgetConfigurationFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF52824a() {
            return this.f52824a;
        }

        @Override // com.pinterest.widget.configuration.WidgetConfigurationFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldKeepOldScreenVisible, reason: from getter */
        public final boolean getF52825b() {
            return this.f52825b;
        }

        @Override // com.pinterest.widget.configuration.WidgetConfigurationFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldNotActivateLastScreenVisible, reason: from getter */
        public final boolean getF52827d() {
            return this.f52827d;
        }

        @Override // com.pinterest.widget.configuration.WidgetConfigurationFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldShowMainNavigation */
        public final boolean getF45109b() {
            return false;
        }
    };

    private static final /* synthetic */ WidgetConfigurationFeatureLocation[] $values() {
        return new WidgetConfigurationFeatureLocation[]{WIDGET_CONTENT_SELECTION, WIDGET_BOARD_CONFIGURATION, WIDGET_BOARD_SELECTION, WIDGET_REFRESH_INTERVAL_SELECTION};
    }

    static {
        WidgetConfigurationFeatureLocation[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
        Companion = new j();
        CREATOR = new com.pinterest.feature.todaytab.a(26);
    }

    public /* synthetic */ WidgetConfigurationFeatureLocation(String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i13);
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static WidgetConfigurationFeatureLocation valueOf(String str) {
        return (WidgetConfigurationFeatureLocation) Enum.valueOf(WidgetConfigurationFeatureLocation.class, str);
    }

    public static WidgetConfigurationFeatureLocation[] values() {
        return (WidgetConfigurationFeatureLocation[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    @NotNull
    /* renamed from: getDisplayMode */
    public com.pinterest.framework.screens.g getF52826c() {
        return com.pinterest.framework.screens.g.DEFAULT;
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    @NotNull
    public kl1.a getEarlyAccessKey() {
        return kl1.a.LateAccessScreenKey;
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    public /* bridge */ /* synthetic */ String getName() {
        return name();
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    @NotNull
    /* renamed from: getScreenClass */
    public abstract /* synthetic */ Class getF52824a();

    @Override // com.pinterest.framework.screens.ScreenLocation
    /* renamed from: getShouldKeepOldScreenVisible */
    public /* bridge */ /* synthetic */ boolean getF52825b() {
        return false;
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    /* renamed from: getShouldNotActivateLastScreenVisible */
    public /* bridge */ /* synthetic */ boolean getF52827d() {
        return false;
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    /* renamed from: getShouldShowMainNavigation */
    public /* bridge */ /* synthetic */ boolean getF45109b() {
        return super.getF45109b();
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    /* renamed from: getShouldSkipTransitions */
    public /* bridge */ /* synthetic */ boolean getF50296c() {
        return false;
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    public /* bridge */ /* synthetic */ boolean getSupportsStateRestorationOnlyUseInEmergencies() {
        return true;
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    public void onScreenNavigation() {
    }

    @Override // com.pinterest.framework.screens.ScreenLocation, android.os.Parcelable
    public void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(name());
    }

    private WidgetConfigurationFeatureLocation(String str, int i13) {
    }
}
