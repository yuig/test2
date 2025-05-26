package com.pinterest.reportFlow.feature;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.framework.screens.g;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lb.l0;
import org.jetbrains.annotations.NotNull;
import r02.e0;
import r02.r;
import r02.s0;
import v02.j;
import v02.q;
import v02.t;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\b\u0087\u0081\u0002\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\u0011B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\rj\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001a¨\u0006\u001b"}, d2 = {"Lcom/pinterest/reportFlow/feature/ReportFlowScreenLocation;", "", "Lcom/pinterest/framework/screens/ScreenLocation;", "", "onScreenNavigation", "()V", "Landroid/os/Parcel;", "dest", "", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "<init>", "(Ljava/lang/String;I)V", "Companion", "com/pinterest/reportFlow/feature/a", "REPORT_FLOW_PRIMARY_REASONS", "REPORT_FLOW_SECONDARY_REASONS", "REPORT_FLOW_REPORT_PIN", "REPORT_FLOW_SENSITIVITY_NOTICE", "SETTINGS_REPORTS_AND_VIOLATIONS", "SETTINGS_REPORTS_AND_VIOLATIONS_SECTION", "SETTINGS_RVC_MORE_ACTIONS_SHEET", "SETTINGS_RVC_SUBMIT_APPEAL", "SETTINGS_RVC_LINKED_BAS_SHEET", "reportFlow_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public abstract class ReportFlowScreenLocation implements ScreenLocation {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ ReportFlowScreenLocation[] $VALUES;

    @NotNull
    public static final Parcelable.Creator<ReportFlowScreenLocation> CREATOR;

    @NotNull
    public static final a Companion;
    public static final ReportFlowScreenLocation REPORT_FLOW_PRIMARY_REASONS = new ReportFlowScreenLocation() { // from class: com.pinterest.reportFlow.feature.ReportFlowScreenLocation.REPORT_FLOW_PRIMARY_REASONS

        /* renamed from: a, reason: collision with root package name */
        public final Class f50395a = q.class;

        /* renamed from: b, reason: collision with root package name */
        public final g f50396b = g.MODAL;

        @Override // com.pinterest.reportFlow.feature.ReportFlowScreenLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getDisplayMode, reason: from getter */
        public final g getF45247b() {
            return this.f50396b;
        }

        @Override // com.pinterest.reportFlow.feature.ReportFlowScreenLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF44622a() {
            return this.f50395a;
        }

        @Override // com.pinterest.reportFlow.feature.ReportFlowScreenLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldShowMainNavigation */
        public final boolean getF44665b() {
            return false;
        }
    };
    public static final ReportFlowScreenLocation REPORT_FLOW_SECONDARY_REASONS = new ReportFlowScreenLocation() { // from class: com.pinterest.reportFlow.feature.ReportFlowScreenLocation.REPORT_FLOW_SECONDARY_REASONS

        /* renamed from: a, reason: collision with root package name */
        public final Class f50399a = t.class;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f50400b = true;

        @Override // com.pinterest.reportFlow.feature.ReportFlowScreenLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF44622a() {
            return this.f50399a;
        }

        @Override // com.pinterest.reportFlow.feature.ReportFlowScreenLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldKeepOldScreenVisible, reason: from getter */
        public final boolean getF44620b() {
            return this.f50400b;
        }

        @Override // com.pinterest.reportFlow.feature.ReportFlowScreenLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldShowMainNavigation */
        public final boolean getF44665b() {
            return false;
        }
    };
    public static final ReportFlowScreenLocation REPORT_FLOW_REPORT_PIN = new ReportFlowScreenLocation() { // from class: com.pinterest.reportFlow.feature.ReportFlowScreenLocation.REPORT_FLOW_REPORT_PIN

        /* renamed from: a, reason: collision with root package name */
        public final Class f50397a = j.class;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f50398b = true;

        @Override // com.pinterest.reportFlow.feature.ReportFlowScreenLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF44622a() {
            return this.f50397a;
        }

        @Override // com.pinterest.reportFlow.feature.ReportFlowScreenLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldKeepOldScreenVisible, reason: from getter */
        public final boolean getF44620b() {
            return this.f50398b;
        }

        @Override // com.pinterest.reportFlow.feature.ReportFlowScreenLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldShowMainNavigation */
        public final boolean getF44665b() {
            return false;
        }
    };
    public static final ReportFlowScreenLocation REPORT_FLOW_SENSITIVITY_NOTICE = new ReportFlowScreenLocation() { // from class: com.pinterest.reportFlow.feature.ReportFlowScreenLocation.REPORT_FLOW_SENSITIVITY_NOTICE

        /* renamed from: a, reason: collision with root package name */
        public final Class f50401a = t02.j.class;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f50402b = true;

        @Override // com.pinterest.reportFlow.feature.ReportFlowScreenLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF44622a() {
            return this.f50401a;
        }

        @Override // com.pinterest.reportFlow.feature.ReportFlowScreenLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldKeepOldScreenVisible, reason: from getter */
        public final boolean getF44620b() {
            return this.f50402b;
        }

        @Override // com.pinterest.reportFlow.feature.ReportFlowScreenLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldShowMainNavigation */
        public final boolean getF44665b() {
            return false;
        }
    };
    public static final ReportFlowScreenLocation SETTINGS_REPORTS_AND_VIOLATIONS = new ReportFlowScreenLocation() { // from class: com.pinterest.reportFlow.feature.ReportFlowScreenLocation.SETTINGS_REPORTS_AND_VIOLATIONS

        /* renamed from: a, reason: collision with root package name */
        public final Class f50403a = r.class;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f50404b = true;

        @Override // com.pinterest.reportFlow.feature.ReportFlowScreenLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF44622a() {
            return this.f50403a;
        }

        @Override // com.pinterest.reportFlow.feature.ReportFlowScreenLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldKeepOldScreenVisible, reason: from getter */
        public final boolean getF44620b() {
            return this.f50404b;
        }

        @Override // com.pinterest.reportFlow.feature.ReportFlowScreenLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldShowMainNavigation */
        public final boolean getF44665b() {
            return false;
        }
    };
    public static final ReportFlowScreenLocation SETTINGS_REPORTS_AND_VIOLATIONS_SECTION = new ReportFlowScreenLocation() { // from class: com.pinterest.reportFlow.feature.ReportFlowScreenLocation.SETTINGS_REPORTS_AND_VIOLATIONS_SECTION

        /* renamed from: a, reason: collision with root package name */
        public final Class f50405a = e0.class;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f50406b = true;

        @Override // com.pinterest.reportFlow.feature.ReportFlowScreenLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF44622a() {
            return this.f50405a;
        }

        @Override // com.pinterest.reportFlow.feature.ReportFlowScreenLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldKeepOldScreenVisible, reason: from getter */
        public final boolean getF44620b() {
            return this.f50406b;
        }

        @Override // com.pinterest.reportFlow.feature.ReportFlowScreenLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldShowMainNavigation */
        public final boolean getF44665b() {
            return false;
        }
    };
    public static final ReportFlowScreenLocation SETTINGS_RVC_MORE_ACTIONS_SHEET = new ReportFlowScreenLocation() { // from class: com.pinterest.reportFlow.feature.ReportFlowScreenLocation.SETTINGS_RVC_MORE_ACTIONS_SHEET

        /* renamed from: a, reason: collision with root package name */
        public final Class f50410a = r02.j.class;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f50411b = true;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f50412c = true;

        @Override // com.pinterest.reportFlow.feature.ReportFlowScreenLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF44622a() {
            return this.f50410a;
        }

        @Override // com.pinterest.reportFlow.feature.ReportFlowScreenLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldKeepOldScreenVisible, reason: from getter */
        public final boolean getF44620b() {
            return this.f50411b;
        }

        @Override // com.pinterest.reportFlow.feature.ReportFlowScreenLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldShowMainNavigation */
        public final boolean getF44665b() {
            return false;
        }

        @Override // com.pinterest.reportFlow.feature.ReportFlowScreenLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldSkipTransitions, reason: from getter */
        public final boolean getF48116c() {
            return this.f50412c;
        }
    };
    public static final ReportFlowScreenLocation SETTINGS_RVC_SUBMIT_APPEAL = new ReportFlowScreenLocation() { // from class: com.pinterest.reportFlow.feature.ReportFlowScreenLocation.SETTINGS_RVC_SUBMIT_APPEAL

        /* renamed from: a, reason: collision with root package name */
        public final Class f50413a = s0.class;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f50414b = true;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f50415c = true;

        @Override // com.pinterest.reportFlow.feature.ReportFlowScreenLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF44622a() {
            return this.f50413a;
        }

        @Override // com.pinterest.reportFlow.feature.ReportFlowScreenLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldKeepOldScreenVisible, reason: from getter */
        public final boolean getF44620b() {
            return this.f50414b;
        }

        @Override // com.pinterest.reportFlow.feature.ReportFlowScreenLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldShowMainNavigation */
        public final boolean getF44665b() {
            return false;
        }

        @Override // com.pinterest.reportFlow.feature.ReportFlowScreenLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldSkipTransitions, reason: from getter */
        public final boolean getF48116c() {
            return this.f50415c;
        }
    };
    public static final ReportFlowScreenLocation SETTINGS_RVC_LINKED_BAS_SHEET = new ReportFlowScreenLocation() { // from class: com.pinterest.reportFlow.feature.ReportFlowScreenLocation.SETTINGS_RVC_LINKED_BAS_SHEET

        /* renamed from: a, reason: collision with root package name */
        public final Class f50407a = r02.g.class;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f50408b = true;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f50409c = true;

        @Override // com.pinterest.reportFlow.feature.ReportFlowScreenLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF44622a() {
            return this.f50407a;
        }

        @Override // com.pinterest.reportFlow.feature.ReportFlowScreenLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldKeepOldScreenVisible, reason: from getter */
        public final boolean getF44620b() {
            return this.f50408b;
        }

        @Override // com.pinterest.reportFlow.feature.ReportFlowScreenLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldShowMainNavigation */
        public final boolean getF44665b() {
            return false;
        }

        @Override // com.pinterest.reportFlow.feature.ReportFlowScreenLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldSkipTransitions, reason: from getter */
        public final boolean getF48116c() {
            return this.f50409c;
        }
    };

    private static final /* synthetic */ ReportFlowScreenLocation[] $values() {
        return new ReportFlowScreenLocation[]{REPORT_FLOW_PRIMARY_REASONS, REPORT_FLOW_SECONDARY_REASONS, REPORT_FLOW_REPORT_PIN, REPORT_FLOW_SENSITIVITY_NOTICE, SETTINGS_REPORTS_AND_VIOLATIONS, SETTINGS_REPORTS_AND_VIOLATIONS_SECTION, SETTINGS_RVC_MORE_ACTIONS_SHEET, SETTINGS_RVC_SUBMIT_APPEAL, SETTINGS_RVC_LINKED_BAS_SHEET};
    }

    static {
        ReportFlowScreenLocation[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
        Companion = new a();
        CREATOR = new com.pinterest.feature.todaytab.a(10);
    }

    public /* synthetic */ ReportFlowScreenLocation(String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i13);
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static ReportFlowScreenLocation valueOf(String str) {
        return (ReportFlowScreenLocation) Enum.valueOf(ReportFlowScreenLocation.class, str);
    }

    public static ReportFlowScreenLocation[] values() {
        return (ReportFlowScreenLocation[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    @NotNull
    /* renamed from: getDisplayMode */
    public g getF45247b() {
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
    public abstract /* synthetic */ Class getF44622a();

    @Override // com.pinterest.framework.screens.ScreenLocation
    /* renamed from: getShouldKeepOldScreenVisible */
    public /* bridge */ /* synthetic */ boolean getF44620b() {
        return false;
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    /* renamed from: getShouldNotActivateLastScreenVisible */
    public /* bridge */ /* synthetic */ boolean getF44621c() {
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

    private ReportFlowScreenLocation(String str, int i13) {
    }
}
