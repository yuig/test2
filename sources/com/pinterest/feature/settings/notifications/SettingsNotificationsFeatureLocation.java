package com.pinterest.feature.settings.notifications;

import android.os.Parcel;
import android.os.Parcelable;
import com.pinterest.framework.screens.ScreenLocation;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lh0.c2;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\u0019B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0011\u0010\u0011\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0015\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001d¨\u0006\u001e"}, d2 = {"Lcom/pinterest/feature/settings/notifications/SettingsNotificationsFeatureLocation;", "", "Lcom/pinterest/framework/screens/ScreenLocation;", "", "onScreenNavigation", "()V", "Landroid/os/Parcel;", "dest", "", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Lgv1/f;", "getNotificationsExperimentHelper", "()Lgv1/f;", "notificationsExperimentHelper", "Llh0/c2;", "getExperiments", "()Llh0/c2;", "experiments", "<init>", "(Ljava/lang/String;I)V", "Companion", "com/pinterest/feature/settings/notifications/a1", "SETTINGS_EMAIL_NOTIFICATIONS", "SETTINGS_NEWS_NOTIFICATIONS", "SETTINGS_PUSH_NOTIFICATIONS", "SETTINGS_NOTIFICATIONS", "notifications_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public abstract class SettingsNotificationsFeatureLocation implements ScreenLocation {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ SettingsNotificationsFeatureLocation[] $VALUES;

    @NotNull
    public static final Parcelable.Creator<SettingsNotificationsFeatureLocation> CREATOR;

    @NotNull
    public static final a1 Companion;
    public static final SettingsNotificationsFeatureLocation SETTINGS_EMAIL_NOTIFICATIONS = new SettingsNotificationsFeatureLocation() { // from class: com.pinterest.feature.settings.notifications.SettingsNotificationsFeatureLocation.SETTINGS_EMAIL_NOTIFICATIONS

        /* renamed from: a, reason: collision with root package name */
        public final Class f48152a = gb1.h.class;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f48153b = true;

        @Override // com.pinterest.feature.settings.notifications.SettingsNotificationsFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF48158a() {
            return this.f48152a;
        }

        @Override // com.pinterest.feature.settings.notifications.SettingsNotificationsFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldKeepOldScreenVisible, reason: from getter */
        public final boolean getF48159b() {
            return this.f48153b;
        }

        @Override // com.pinterest.feature.settings.notifications.SettingsNotificationsFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldShowMainNavigation */
        public final boolean getF44665b() {
            return false;
        }
    };
    public static final SettingsNotificationsFeatureLocation SETTINGS_NEWS_NOTIFICATIONS = new SettingsNotificationsFeatureLocation() { // from class: com.pinterest.feature.settings.notifications.SettingsNotificationsFeatureLocation.SETTINGS_NEWS_NOTIFICATIONS

        /* renamed from: a, reason: collision with root package name */
        public final Class f48154a = gb1.q.class;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f48155b = true;

        @Override // com.pinterest.feature.settings.notifications.SettingsNotificationsFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF48158a() {
            return this.f48154a;
        }

        @Override // com.pinterest.feature.settings.notifications.SettingsNotificationsFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldKeepOldScreenVisible, reason: from getter */
        public final boolean getF48159b() {
            return this.f48155b;
        }
    };
    public static final SettingsNotificationsFeatureLocation SETTINGS_PUSH_NOTIFICATIONS = new SettingsNotificationsFeatureLocation() { // from class: com.pinterest.feature.settings.notifications.SettingsNotificationsFeatureLocation.SETTINGS_PUSH_NOTIFICATIONS

        /* renamed from: a, reason: collision with root package name */
        public final Class f48158a = gb1.s.class;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f48159b = true;

        @Override // com.pinterest.feature.settings.notifications.SettingsNotificationsFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF48158a() {
            return this.f48158a;
        }

        @Override // com.pinterest.feature.settings.notifications.SettingsNotificationsFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldKeepOldScreenVisible, reason: from getter */
        public final boolean getF48159b() {
            return this.f48159b;
        }

        @Override // com.pinterest.feature.settings.notifications.SettingsNotificationsFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldShowMainNavigation */
        public final boolean getF44665b() {
            return false;
        }
    };
    public static final SettingsNotificationsFeatureLocation SETTINGS_NOTIFICATIONS = new SETTINGS_NOTIFICATIONS();

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/pinterest/feature/settings/notifications/SettingsNotificationsFeatureLocation$SETTINGS_NOTIFICATIONS;", "Lcom/pinterest/feature/settings/notifications/SettingsNotificationsFeatureLocation;", "notifications_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes5.dex */
    public static final class SETTINGS_NOTIFICATIONS extends SettingsNotificationsFeatureLocation {

        /* renamed from: a, reason: collision with root package name */
        public final xk2.v f48156a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f48157b;

        public SETTINGS_NOTIFICATIONS() {
            super("SETTINGS_NOTIFICATIONS", 3, null);
            this.f48156a = xk2.m.b(new b1(this));
            this.f48157b = true;
        }

        @Override // com.pinterest.feature.settings.notifications.SettingsNotificationsFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass */
        public final Class getF48158a() {
            return (Class) this.f48156a.getValue();
        }

        @Override // com.pinterest.feature.settings.notifications.SettingsNotificationsFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldKeepOldScreenVisible, reason: from getter */
        public final boolean getF48159b() {
            return this.f48157b;
        }

        @Override // com.pinterest.feature.settings.notifications.SettingsNotificationsFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldShowMainNavigation */
        public final boolean getF44665b() {
            return false;
        }
    }

    private static final /* synthetic */ SettingsNotificationsFeatureLocation[] $values() {
        return new SettingsNotificationsFeatureLocation[]{SETTINGS_EMAIL_NOTIFICATIONS, SETTINGS_NEWS_NOTIFICATIONS, SETTINGS_PUSH_NOTIFICATIONS, SETTINGS_NOTIFICATIONS};
    }

    static {
        SettingsNotificationsFeatureLocation[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
        Companion = new a1();
        CREATOR = new com.pinterest.feature.board.permissions.b(26);
    }

    public /* synthetic */ SettingsNotificationsFeatureLocation(String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i13);
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static SettingsNotificationsFeatureLocation valueOf(String str) {
        return (SettingsNotificationsFeatureLocation) Enum.valueOf(SettingsNotificationsFeatureLocation.class, str);
    }

    public static SettingsNotificationsFeatureLocation[] values() {
        return (SettingsNotificationsFeatureLocation[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    @NotNull
    /* renamed from: getDisplayMode */
    public com.pinterest.framework.screens.g getF45247b() {
        return com.pinterest.framework.screens.g.DEFAULT;
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    @NotNull
    public kl1.a getEarlyAccessKey() {
        return kl1.a.LateAccessScreenKey;
    }

    @NotNull
    public final c2 getExperiments() {
        return c2.f83314b.c();
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    public /* bridge */ /* synthetic */ String getName() {
        return name();
    }

    @NotNull
    public final gv1.f getNotificationsExperimentHelper() {
        gv1.f fVar = gv1.f.f66167e;
        if (gv1.f.f66167e == null) {
            gv1.f.f66168f.invoke();
            gv1.d dVar = gv1.d.f66165i;
            Intrinsics.checkNotNullParameter(dVar, "<set-?>");
            gv1.f.f66168f = dVar;
        }
        gv1.f fVar2 = gv1.f.f66167e;
        if (fVar2 != null) {
            return fVar2;
        }
        Intrinsics.r("INSTANCE");
        throw null;
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    @NotNull
    /* renamed from: getScreenClass */
    public abstract /* synthetic */ Class getF48158a();

    @Override // com.pinterest.framework.screens.ScreenLocation
    /* renamed from: getShouldKeepOldScreenVisible */
    public /* bridge */ /* synthetic */ boolean getF48159b() {
        return false;
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    /* renamed from: getShouldNotActivateLastScreenVisible */
    public /* bridge */ /* synthetic */ boolean getF46595c() {
        return false;
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    /* renamed from: getShouldShowMainNavigation */
    public /* bridge */ /* synthetic */ boolean getF44665b() {
        return super.getF44665b();
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    /* renamed from: getShouldSkipTransitions */
    public /* bridge */ /* synthetic */ boolean getF48116c() {
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

    private SettingsNotificationsFeatureLocation(String str, int i13) {
    }
}
