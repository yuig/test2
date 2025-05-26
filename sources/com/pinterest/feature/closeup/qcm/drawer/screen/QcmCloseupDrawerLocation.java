package com.pinterest.feature.closeup.qcm.drawer.screen;

import android.os.Parcel;
import android.os.Parcelable;
import com.pinterest.feature.board.permissions.b;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.framework.screens.g;
import hp0.t;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\u0011B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\rj\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lcom/pinterest/feature/closeup/qcm/drawer/screen/QcmCloseupDrawerLocation;", "", "Lcom/pinterest/framework/screens/ScreenLocation;", "", "onScreenNavigation", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "<init>", "(Ljava/lang/String;I)V", "Companion", "com/pinterest/feature/closeup/qcm/drawer/screen/a", "QCM_CLOSEUP_DRAWER_FRAGMENT", "ads_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public abstract class QcmCloseupDrawerLocation implements ScreenLocation {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ QcmCloseupDrawerLocation[] $VALUES;

    @NotNull
    public static final Parcelable.Creator<QcmCloseupDrawerLocation> CREATOR;

    @NotNull
    public static final a Companion;
    public static final QcmCloseupDrawerLocation QCM_CLOSEUP_DRAWER_FRAGMENT = new QcmCloseupDrawerLocation() { // from class: com.pinterest.feature.closeup.qcm.drawer.screen.QcmCloseupDrawerLocation.QCM_CLOSEUP_DRAWER_FRAGMENT

        /* renamed from: a, reason: collision with root package name */
        public final Class f45443a = t.class;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f45444b = true;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f45445c = true;

        @Override // com.pinterest.feature.closeup.qcm.drawer.screen.QcmCloseupDrawerLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF45443a() {
            return this.f45443a;
        }

        @Override // com.pinterest.feature.closeup.qcm.drawer.screen.QcmCloseupDrawerLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldKeepOldScreenVisible, reason: from getter */
        public final boolean getF45444b() {
            return this.f45444b;
        }

        @Override // com.pinterest.feature.closeup.qcm.drawer.screen.QcmCloseupDrawerLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldNotActivateLastScreenVisible, reason: from getter */
        public final boolean getF45445c() {
            return this.f45445c;
        }

        @Override // com.pinterest.feature.closeup.qcm.drawer.screen.QcmCloseupDrawerLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldShowMainNavigation */
        public final boolean getF45109b() {
            return false;
        }
    };

    private static final /* synthetic */ QcmCloseupDrawerLocation[] $values() {
        return new QcmCloseupDrawerLocation[]{QCM_CLOSEUP_DRAWER_FRAGMENT};
    }

    static {
        QcmCloseupDrawerLocation[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
        Companion = new a();
        CREATOR = new b(3);
    }

    public /* synthetic */ QcmCloseupDrawerLocation(String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i13);
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static QcmCloseupDrawerLocation valueOf(String str) {
        return (QcmCloseupDrawerLocation) Enum.valueOf(QcmCloseupDrawerLocation.class, str);
    }

    public static QcmCloseupDrawerLocation[] values() {
        return (QcmCloseupDrawerLocation[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    @NotNull
    /* renamed from: getDisplayMode */
    public g getF44642b() {
        return g.DEFAULT;
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
    public abstract /* synthetic */ Class getF45443a();

    @Override // com.pinterest.framework.screens.ScreenLocation
    /* renamed from: getShouldKeepOldScreenVisible */
    public /* bridge */ /* synthetic */ boolean getF45444b() {
        return false;
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    /* renamed from: getShouldNotActivateLastScreenVisible */
    public /* bridge */ /* synthetic */ boolean getF45445c() {
        return false;
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    /* renamed from: getShouldShowMainNavigation */
    public /* bridge */ /* synthetic */ boolean getF45109b() {
        return super.getF45109b();
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    /* renamed from: getShouldSkipTransitions */
    public /* bridge */ /* synthetic */ boolean getF48993b() {
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

    private QcmCloseupDrawerLocation(String str, int i13) {
    }
}
